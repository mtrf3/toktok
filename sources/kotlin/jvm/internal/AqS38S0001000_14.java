package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C76800UCe;
import X.C81500Vyi;
import X.C82105WKf;
import X.C82655WcF;
import X.C83798Wug;
import X.C83799Wuh;
import X.InterfaceC83796Wue;
import X.InterfaceC88472Yns;
import X.WVY;
import X.WZN;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState;
import com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeState;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeState;

/* loaded from: classes15.dex */
public class AqS38S0001000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS38S0001000_14(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        FTCEditMusicCutState setState = (FTCEditMusicCutState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditMusicCutState.copy$default(setState, null, Integer.valueOf(aqS38S0001000_14.i0), null, 5, null);
    }

    public static final Object invoke$1(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        FTCEditVolumeState setState = (FTCEditVolumeState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditVolumeState.copy$default(setState, null, null, Integer.valueOf(aqS38S0001000_14.i0), null, 11, null);
    }

    public static final Object invoke$10(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        View view = (View) obj;
        o.LJIIIZ(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = aqS38S0001000_14.i0;
        view.setLayoutParams(marginLayoutParams);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        WZN sendStatesToScene = (WZN) obj;
        o.LJIIIZ(sendStatesToScene, "$this$sendStatesToScene");
        return WZN.LIZ(sendStatesToScene, null, false, false, false, false, null, null, null, null, null, aqS38S0001000_14.i0, 6143);
    }

    public static final Object invoke$12(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        WZN sendStatesToScene = (WZN) obj;
        o.LJIIIZ(sendStatesToScene, "$this$sendStatesToScene");
        return WZN.LIZ(sendStatesToScene, null, false, false, false, false, null, null, null, null, null, aqS38S0001000_14.i0, 6143);
    }

    public static final Object invoke$2(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        C82105WKf setState = (C82105WKf) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82105WKf.LIZ(setState, false, null, null, null, null, new C08630Vn(Integer.valueOf(aqS38S0001000_14.i0)), null, 3839);
    }

    public static final Object invoke$3(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        WVY setState = (WVY) obj;
        o.LJIIIZ(setState, "$this$setState");
        return WVY.LIZ(setState, aqS38S0001000_14.i0, false, null, null, null, null, null, 2046);
    }

    public static final Object invoke$4(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        DuetLayoutModeState setState = (DuetLayoutModeState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return DuetLayoutModeState.copy$default(setState, 0, aqS38S0001000_14.i0, 0, 0, null, null, null, 125, null);
    }

    public static final Object invoke$5(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        C81500Vyi setState = (C81500Vyi) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C81500Vyi.LIZ(setState, null, 0, 0, null, null, false, null, null, null, null, null, new C08630Vn(Integer.valueOf(aqS38S0001000_14.i0)), null, null, 14335);
    }

    public static final Object invoke$6(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        C82655WcF setState = (C82655WcF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82655WcF.LIZ(setState, null, null, null, null, aqS38S0001000_14.i0, 0, false, 223);
    }

    public static final Object invoke$7(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        C82655WcF setState = (C82655WcF) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82655WcF.LIZ(setState, null, null, null, null, 0, aqS38S0001000_14.i0, false, 191);
    }

    public static final Object invoke$8(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        InterfaceC83796Wue it = (InterfaceC83796Wue) obj;
        o.LJIIIZ(it, "it");
        int i = aqS38S0001000_14.i0;
        if (i == 0) {
            return new C83798Wug(it);
        }
        if (i == 1) {
            return new C83799Wuh(it);
        }
        throw new Exception("viewType no exist.");
    }

    public static final Object invoke$9(AqS38S0001000_14 aqS38S0001000_14, Object obj) {
        C82105WKf setState = (C82105WKf) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82105WKf.LIZ(setState, false, null, null, null, null, new C08630Vn(Integer.valueOf(aqS38S0001000_14.i0)), null, 3839);
    }
}
