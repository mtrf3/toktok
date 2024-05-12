package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass391;
import X.C08630Vn;
import X.C144515ln;
import X.C145995oB;
import X.C152015xt;
import X.C1539362j;
import X.C161796Wp;
import X.C173886s4;
import X.C26338AVi;
import X.C5GH;
import X.C5M1;
import X.C5TX;
import X.C5Y5;
import X.C6L7;
import X.C6MT;
import X.C76800UCe;
import X.C82105WKf;
import X.GBS;
import X.InterfaceC88472Yns;
import X.WVY;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarState;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class AqS27S0001000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0001000_2(char c, int i) {
        super(1);
        this.$t = i;
        this.i0 = c;
    }

    public static final Object invoke$0(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C145995oB mobBase = (C145995oB) obj;
        o.LJIIIZ(mobBase, "$this$mobBase");
        mobBase.LJI("method", String.valueOf(aqS27S0001000_2.i0));
        return mobBase;
    }

    public static final Object invoke$1(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C5GH initConfig = (C5GH) obj;
        o.LJIIIZ(initConfig, "$this$initConfig");
        initConfig.setTextFont(92);
        initConfig.setGravity(16);
        C26338AVi.LJI(initConfig, Integer.valueOf(aqS27S0001000_2.i0), 0, AnonymousClass391.LIZJ(4), 0, false, 16);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        int i;
        GBS saaConfig = (GBS) obj;
        o.LJIIIZ(saaConfig, "$this$saaConfig");
        int i2 = aqS27S0001000_2.i0;
        if (i2 == 24 || i2 == 36) {
            i = R.style.ux;
        } else {
            i = 0;
        }
        saaConfig.LIZJ = i;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C6L7 setState = (C6L7) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6L7.L(setState, aqS27S0001000_2.i0, false, false, false, false, false, false, 126);
    }

    public static final Object invoke$12(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C5TX setState = (C5TX) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5TX.L(setState, null, aqS27S0001000_2.i0, null, null, null, null, 123);
    }

    public static final Object invoke$13(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5M1.LIZ(setState, null, false, null, null, false, null, false, null, 0, null, null, null, Integer.valueOf(aqS27S0001000_2.i0), null, null, null, null, null, null, false, null, 2093055);
    }

    public static final Object invoke$14(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5M1.LIZ(setState, null, false, null, null, false, null, false, null, 0, null, null, null, Integer.valueOf(aqS27S0001000_2.i0), null, null, null, null, null, null, false, null, 2093055);
    }

    public static final Object invoke$15(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C144515ln setState = (C144515ln) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C144515ln.LIZ(setState, 0.0f, 0.0f, aqS27S0001000_2.i0, null, 95);
    }

    public static final Object invoke$16(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C152015xt setState = (C152015xt) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C152015xt.LIZ(setState, null, null, Integer.valueOf(aqS27S0001000_2.i0), 7);
    }

    public static final Object invoke$17(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, new C08630Vn(Integer.valueOf(aqS27S0001000_2.i0)), null, null, 0.0f, false, 0, null, null, null, 2043);
    }

    public static final Object invoke$18(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, new C08630Vn(Integer.valueOf(aqS27S0001000_2.i0)), null, null, 0.0f, false, 0, null, null, null, 2043);
    }

    public static final Object invoke$19(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, Integer.valueOf(aqS27S0001000_2.i0), null, null, null, 0.0f, false, 0, null, null, null, 2045);
    }

    public static final Object invoke$2(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        FTCEditCornerState setState = (FTCEditCornerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditCornerState.copy$default(setState, null, null, Integer.valueOf(aqS27S0001000_2.i0), null, 11, null);
    }

    public static final Object invoke$20(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C6MT setState = (C6MT) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C6MT.LIZ(setState, false, null, new C08630Vn(Integer.valueOf(aqS27S0001000_2.i0)), null, null, 0.0f, false, 0, null, null, null, 2043);
    }

    public static final Object invoke$21(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        EditToolbarState setState = (EditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditToolbarState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(aqS27S0001000_2.i0), null, false, 229375, null);
    }

    public static final Object invoke$22(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        EditToolbarState setState = (EditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return EditToolbarState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(aqS27S0001000_2.i0), false, 196607, null);
    }

    public static final Object invoke$23(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C82105WKf setState = (C82105WKf) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82105WKf.LIZ(setState, false, null, null, null, null, new C08630Vn(Integer.valueOf(aqS27S0001000_2.i0)), null, 3839);
    }

    public static final Object invoke$24(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C5Y5 setState = (C5Y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5Y5.LIZ(setState, 0, aqS27S0001000_2.i0, 0, false, false, false, null, null, null, 509);
    }

    public static final Object invoke$25(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        C5Y5 setState = (C5Y5) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5Y5.LIZ(setState, aqS27S0001000_2.i0, 0, 0, false, false, false, null, null, null, 510);
    }

    public static final Object invoke$26(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        TextStickerModel setState = (TextStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return TextStickerModel.copy$default(setState, null, null, null, 0, aqS27S0001000_2.i0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 262127, null);
    }

    public static final Object invoke$27(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        BaseStickerModel setState = (BaseStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return BaseStickerModel.copy$default(setState, 0, aqS27S0001000_2.i0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -3, null);
    }

    public static final Object invoke$28(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        AddYoursStickerModel setState = (AddYoursStickerModel) obj;
        o.LJIIIZ(setState, "$this$setState");
        return AddYoursStickerModel.copy$default(setState, null, null, null, String.valueOf((char) aqS27S0001000_2.i0), null, null, false, false, false, null, null, 0, 2035, null);
    }

    public static final Object invoke$3(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        FTCEditCornerState setState = (FTCEditCornerState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditCornerState.copy$default(setState, null, Integer.valueOf(aqS27S0001000_2.i0), null, null, 13, null);
    }

    public static final Object invoke$4(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        FTCEditTextStickerViewState setState = (FTCEditTextStickerViewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditTextStickerViewState.copy$default(setState, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C1539362j(aqS27S0001000_2.i0), 65535, null);
    }

    public static final Object invoke$5(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        FTCEditToolbarState setState = (FTCEditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditToolbarState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(aqS27S0001000_2.i0), null, 3071, null);
    }

    public static final Object invoke$6(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        FTCEditToolbarState setState = (FTCEditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditToolbarState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(aqS27S0001000_2.i0), 2047, null);
    }

    public static final Object invoke$7(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        FTCEditToolbarState setState = (FTCEditToolbarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return FTCEditToolbarState.copy$default(setState, null, null, null, null, null, null, null, null, null, Integer.valueOf(aqS27S0001000_2.i0), null, null, 3583, null);
    }

    public static final Object invoke$8(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        int i;
        C161796Wp setState = (C161796Wp) obj;
        o.LJIIIZ(setState, "$this$setState");
        int i2 = aqS27S0001000_2.i0;
        if (i2 != 0) {
            i = 2;
            if (i2 == 2) {
                i = 0;
            }
        } else {
            i = 1;
        }
        return C161796Wp.LIZ(setState, 0, new C08630Vn(Integer.valueOf(i)), 61);
    }

    public static final Object invoke$9(AqS27S0001000_2 aqS27S0001000_2, Object obj) {
        WVY setState = (WVY) obj;
        o.LJIIIZ(setState, "$this$setState");
        return WVY.LIZ(setState, 0, false, null, new C173886s4(aqS27S0001000_2.i0), null, null, null, 2039);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0001000_2(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }
}
