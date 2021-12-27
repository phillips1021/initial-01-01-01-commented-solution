package com.assetco.hotsports.optimization;

import com.assetco.search.results.Asset;
import com.assetco.search.results.AssetVendor;
import com.assetco.search.results.AssetVendorRelationshipLevel;
import com.assetco.search.results.HotspotKey;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BugsTest {

    @Test
    public void precedingPartnerWithLongTrailingAssetsDoesNotWin() {

        AssetVendor partnerVendor = makeVendor(AssetVendorRelationshipLevel.Partner);

        Asset missing = givenAssetInResultsWithVendor(partnerVendor);

        Asset disrupting = givenAssetInResultsWithVendor(makeVendor(AssetVendorRelationshipLevel.Partner));

        List<Asset> expected = createAssetList();
        
        whenOptimize();
        
        thenHotspotDoesNotHave(HotspotKey.Showcase, missing);
        
        thenHotSportHasExactly(HotspotKey.Showcase, expected);

    }

    private void thenHotSportHasExactly(HotspotKey showcase, List<Asset> expected) {
    }

    private void thenHotspotDoesNotHave(HotspotKey showcase, Asset missing) {
    }

    private void whenOptimize() {
    }

    private List<Asset> createAssetList() {

        return List.of(givenAssetInResultsWithVendor(makeVendor(AssetVendorRelationshipLevel.Partner)),
                givenAssetInResultsWithVendor(makeVendor(AssetVendorRelationshipLevel.Partner)),
                givenAssetInResultsWithVendor(makeVendor(AssetVendorRelationshipLevel.Partner)),
                givenAssetInResultsWithVendor(makeVendor(AssetVendorRelationshipLevel.Partner)));

    }

    private Asset givenAssetInResultsWithVendor(AssetVendor partnerVendor) {

        return null;
    }

    private AssetVendor makeVendor(AssetVendorRelationshipLevel partner) {

        return null;
    }
}
