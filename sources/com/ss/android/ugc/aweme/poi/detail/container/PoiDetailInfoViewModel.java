package com.ss.android.ugc.aweme.poi.detail.container;

import X.C189907co;
import X.C189917cp;
import X.C190487dk;
import X.C190787eE;
import X.C190847eK;
import X.C34K;
import X.OSZ;
import android.text.TextUtils;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailInfoViewModel extends AssemViewModel<C189907co> {
    public String LJLIL;
    public PoiListApi.PoiDetailResponse LJLILLLLZI;
    public PoiAnchorData LJLJI;
    public boolean LJLJJI;
    public C190487dk LJLJJL;
    public C190787eE LJLJJLL;
    public boolean LJLJL = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C189907co defaultState() {
        return new C189907co(0);
    }

    public final OSZ<PoiListApi.PoiDetailResponse, Boolean> gv0(PoiListApi.PoiDetailResponse poiDetailResponse, Integer num) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        Integer num2;
        Boolean bool;
        String str6;
        int i;
        String str7;
        String str8;
        String poiName;
        PoiListApi.PoiDetailResponse poiDetailResponse2;
        PoiAnchorData poiAnchorData;
        this.LJLILLLLZI = poiDetailResponse;
        C34K c34k = new C34K();
        PoiListApi.PoiDetailResponse poiDetailResponse3 = this.LJLILLLLZI;
        if (poiDetailResponse3 != null) {
            str = poiDetailResponse3.name;
        } else {
            str = null;
        }
        PoiAnchorData poiAnchorData2 = this.LJLJI;
        if (poiAnchorData2 != null) {
            str2 = poiAnchorData2.getPoiName();
        } else {
            str2 = null;
        }
        c34k.element = !o.LJ(str, str2);
        if (this.LJLILLLLZI == null && (poiAnchorData = this.LJLJI) != null) {
            PoiListApi.LIZ.getClass();
            PoiListApi.PoiDetailResponse poiDetailResponse4 = new PoiListApi.PoiDetailResponse(poiAnchorData.getPoiName(), poiAnchorData.getFallbackAddress(), poiAnchorData.getVideoCount(), null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217720, null);
            this.LJLILLLLZI = poiDetailResponse4;
            if (num == null) {
                num = 0;
            }
            poiDetailResponse4.status_code = num.intValue();
            c34k.element = true;
            this.LJLJJI = true;
        }
        PoiAnchorData poiAnchorData3 = this.LJLJI;
        if (poiAnchorData3 != null && (poiName = poiAnchorData3.getPoiName()) != null && (!TextUtils.isEmpty(poiName))) {
            PoiListApi.PoiDetailResponse poiDetailResponse5 = this.LJLILLLLZI;
            if (poiDetailResponse5 != null) {
                poiDetailResponse2 = PoiListApi.PoiDetailResponse.LJ(poiDetailResponse5, poiName, false, 134217726);
            } else {
                poiDetailResponse2 = null;
            }
            this.LJLILLLLZI = poiDetailResponse2;
        }
        setState(new AqS169S0100000_3(c34k, 382));
        if (this.LJLJL) {
            PoiListApi.PoiDetailResponse poiDetailResponse6 = this.LJLILLLLZI;
            boolean z2 = c34k.element;
            if (poiDetailResponse6 != null) {
                z = true;
            } else {
                z = false;
            }
            PoiAnchorData poiAnchorData4 = this.LJLJI;
            if (poiDetailResponse6 != null && poiAnchorData4 != null) {
                PoiAnchorData updatePoiDetailData = poiAnchorData4.updatePoiDetailData(poiDetailResponse6.LJIIJJI(), poiDetailResponse6.LJIIJ());
                if (updatePoiDetailData != null) {
                    String str9 = poiDetailResponse6.collectInfo;
                    String str10 = poiDetailResponse6.cityCode;
                    String LJIIJJI = poiDetailResponse6.LJIIJJI();
                    String str11 = poiDetailResponse6.regionCode;
                    C190787eE c190787eE = this.LJLJJLL;
                    if (c190787eE == null || (str8 = c190787eE.getGroupId()) == null) {
                        str8 = "";
                    }
                    poiAnchorData4 = updatePoiDetailData.updateInfoFromPoiDetail(str9, str10, LJIIJJI, str11, str8);
                } else {
                    poiAnchorData4 = null;
                }
            }
            C190487dk c190487dk = this.LJLJJL;
            if (c190487dk != null) {
                str3 = c190487dk.getEnterFrom();
            } else {
                str3 = null;
            }
            C190487dk c190487dk2 = this.LJLJJL;
            if (c190487dk2 != null) {
                str4 = c190487dk2.getEnterMethod();
            } else {
                str4 = null;
            }
            C190787eE c190787eE2 = this.LJLJJLL;
            C190487dk c190487dk3 = this.LJLJJL;
            if (c190487dk3 != null) {
                str5 = c190487dk3.getFromPage();
            } else {
                str5 = null;
            }
            C190487dk c190487dk4 = this.LJLJJL;
            if (c190487dk4 != null) {
                num2 = c190487dk4.getHasTitle();
            } else {
                num2 = null;
            }
            int i2 = !PoiEnableExperiment.LIZIZ() ? 1 : 0;
            C190487dk c190487dk5 = this.LJLJJL;
            if (c190487dk5 != null) {
                bool = Boolean.valueOf(c190487dk5.isAnchorExpand());
            } else {
                bool = null;
            }
            C190487dk c190487dk6 = this.LJLJJL;
            if (c190487dk6 != null) {
                str6 = c190487dk6.getTrackInfo();
            } else {
                str6 = null;
            }
            boolean z3 = !z;
            C190487dk c190487dk7 = this.LJLJJL;
            if (c190487dk7 != null) {
                i = c190487dk7.getFromOtherPoi();
            } else {
                i = 0;
            }
            C190487dk c190487dk8 = this.LJLJJL;
            if (c190487dk8 != null) {
                str7 = c190487dk8.getPreviousPage();
            } else {
                str7 = null;
            }
            C190847eK.LIZIZ(str3, str4, poiAnchorData4, c190787eE2, str5, num2, i2, bool, str6, poiDetailResponse6, z2, z3, i, str7);
            this.LJLJL = false;
        }
        if (this.LJLILLLLZI != null) {
            setState(new AqS169S0100000_3(this, 383));
        } else {
            setState(C189917cp.LJLIL);
        }
        return new OSZ<>(this.LJLILLLLZI, Boolean.valueOf(c34k.element));
    }
}
