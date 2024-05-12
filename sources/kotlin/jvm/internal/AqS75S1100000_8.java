package kotlin.jvm.internal;

import X.AbstractC36569EWv;
import X.AbstractC65781Prl;
import X.C27739Aud;
import X.C47237IgL;
import X.C47300IhM;
import X.C50799Jwh;
import X.C50865Jxl;
import X.C65330PkU;
import X.C65352Pkq;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.ShopVerticalAssem;
import com.ss.android.ugc.aweme.ecommercelive.common.data.AdExtra;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment;
import com.ss.android.ugc.aweme.search.ecommerce.middle.DynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class AqS75S1100000_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS75S1100000_8 aqS75S1100000_8) {
        C50799Jwh c50799Jwh = ((DynamicSingleIntermediateFragmentNew) aqS75S1100000_8.l1).LLFFF;
        if (c50799Jwh != null) {
            c50799Jwh.LIZJ(aqS75S1100000_8.s0);
            return C76800UCe.LIZ;
        }
        o.LJIJI("dynamicViewsContainer");
        throw null;
    }

    public static final Object invoke$1(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.destroyScene(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS75S1100000_8 aqS75S1100000_8) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("closeAutoScroll: autoScrollState: ");
        LIZ.append(((AutoScrollComponent) aqS75S1100000_8.l1).LJLLJ);
        LIZ.append(", ");
        LIZ.append(aqS75S1100000_8.s0);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$11(AqS75S1100000_8 aqS75S1100000_8) {
        ((DynamicSearchShopFragment) aqS75S1100000_8.l1).Ol().LIZJ(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS75S1100000_8 aqS75S1100000_8) {
        ((AbstractC36569EWv) aqS75S1100000_8.l1).LJJJLIIL(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS75S1100000_8 aqS75S1100000_8) {
        C47300IhM c47300IhM = C47300IhM.LIZ;
        String str = aqS75S1100000_8.s0;
        String str2 = (String) ((C68322mC) aqS75S1100000_8.l1).element;
        c47300IhM.getClass();
        C47300IhM.LIZLLL(str, str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS75S1100000_8 aqS75S1100000_8) {
        String str;
        C47300IhM c47300IhM = C47300IhM.LIZ;
        String str2 = aqS75S1100000_8.s0;
        Object obj = aqS75S1100000_8.l1;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        c47300IhM.getClass();
        C47300IhM.LIZLLL(str2, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS75S1100000_8 aqS75S1100000_8) {
        C50865Jxl c50865Jxl = ((ShopVerticalAssem) aqS75S1100000_8.l1).LJLLLLLL;
        if (c50865Jxl != null) {
            c50865Jxl.LIZJ(aqS75S1100000_8.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS75S1100000_8 aqS75S1100000_8) {
        return new C47237IgL(aqS75S1100000_8.s0, false, aqS75S1100000_8.l1).LIZ();
    }

    public static final Object invoke$17(AqS75S1100000_8 aqS75S1100000_8) {
        String LJI;
        Object fromJson;
        HashMap hashMap = (HashMap) aqS75S1100000_8.l1;
        Object obj = null;
        try {
            fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), aqS75S1100000_8.s0, C65330PkU.LIZJ(C65352Pkq.LJI(AdExtra.class)));
        } catch (s unused) {
        }
        if (fromJson instanceof AdExtra) {
            obj = fromJson;
            if (obj != null) {
                LJI = C27739Aud.LJI(obj);
                hashMap.put("ad_extra", LJI);
                return C76800UCe.LIZ;
            }
            LJI = "{}";
            hashMap.put("ad_extra", LJI);
            return C76800UCe.LIZ;
        }
        LJI = "{}";
        hashMap.put("ad_extra", LJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.makeCurrentScene(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.removePriorityTaskByContextKey(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.setSmartPreloadAlgorithmJson(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.setSmartPreloadPlayTaskAlgorithmJson(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.setTimelinessAlgorithmJson(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.smartPreloadBusinessEvent(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.smartPreloadPlayTaskBusinessEvent(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS75S1100000_8 aqS75S1100000_8) {
        ((DVideoPreloadManager) aqS75S1100000_8.l1).LIZLLL.smartTimelinessPreloadBusinessEvent(aqS75S1100000_8.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(AbstractC36569EWv abstractC36569EWv, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC36569EWv;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(ShopVerticalAssem shopVerticalAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = shopVerticalAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(DynamicSearchShopFragment dynamicSearchShopFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = dynamicSearchShopFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = dynamicSingleIntermediateFragmentNew;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(DVideoPreloadManager dVideoPreloadManager, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = dVideoPreloadManager;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(AutoScrollComponent autoScrollComponent, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = autoScrollComponent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS75S1100000_8(String str, String str2, C68322mC<String> c68322mC) {
        super(0);
        this.$t = c68322mC;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS75S1100000_8(String str, HashMap hashMap, int i) {
        super(0);
        this.$t = i;
        this.l1 = hashMap;
        this.s0 = str;
    }
}
