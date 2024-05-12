package kotlin.jvm.internal;

import X.AbstractC234519Ih;
import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C145995oB;
import X.C150545vW;
import X.C234529Ii;
import X.C44591Hel;
import X.C45296Hq8;
import X.C76800UCe;
import X.C85871Xn1;
import X.HIC;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoEditState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoListState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AlbumToEditPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import java.util.Map;

/* loaded from: classes8.dex */
public class AqS12S0010000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0010000_7(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke$0(X.HIC r5) {
        /*
            r4 = this;
            java.lang.String r0 = "$this$json"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            com.google.gson.Gson r2 = X.C75792yF.LIZIZ()
            java.lang.String r0 = "getGson()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r1 = X.C44744HhE.LIZ()
            r3 = 0
            if (r1 == 0) goto L1b
            int r0 = r1.length()
            if (r0 != 0) goto L89
        L1b:
            r2 = 0
        L1c:
            com.ss.android.ugc.asve.context.PreviewSize r2 = (com.ss.android.ugc.asve.context.PreviewSize) r2
            if (r2 != 0) goto L29
            com.ss.android.ugc.asve.context.PreviewSize r2 = new com.ss.android.ugc.asve.context.PreviewSize
            r1 = 720(0x2d0, float:1.009E-42)
            r0 = 1280(0x500, float:1.794E-42)
            r2.<init>(r1, r0)
        L29:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            int r0 = r2.getWidth()
            r1.append(r0)
            r0 = 120(0x78, float:1.68E-43)
            r1.append(r0)
            int r0 = r2.getHeight()
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            com.google.gson.m r1 = r5.LIZ
            java.lang.String r0 = "preview_resolution"
            r1.LJJIIZ(r0, r2)
            boolean r0 = r4.z0
            if (r0 == 0) goto L80
            int[] r0 = X.C44739Hh9.LIZLLL()
            java.lang.String r2 = X.C123124sO.LIZ(r0)
        L57:
            com.google.gson.m r1 = r5.LIZ
            java.lang.String r0 = "file_resolution"
            r1.LJJIIZ(r0, r2)
            java.lang.String r2 = X.C44752HhM.LIZ()
            com.google.gson.m r1 = r5.LIZ
            java.lang.String r0 = "file_bitrate"
            r1.LJJIIZ(r0, r2)
            boolean r0 = r4.z0
            if (r0 == 0) goto L7d
            int r0 = X.C1XY.LJIILL()
        L71:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.google.gson.m r1 = r5.LIZ
            java.lang.String r0 = "file_fps"
            r1.LJJIIJ(r0, r2)
            return
        L7d:
            r0 = 30
            goto L71
        L80:
            int[] r0 = X.C44739Hh9.LJIIIZ(r3)
            java.lang.String r2 = X.C123124sO.LIZ(r0)
            goto L57
        L89:
            java.lang.Class<com.ss.android.ugc.asve.context.PreviewSize> r0 = com.ss.android.ugc.asve.context.PreviewSize.class
            java.lang.Object r2 = r2.LJI(r1, r0)     // Catch: java.lang.Exception -> L90
            goto L1c
        L90:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS12S0010000_7.invoke$0(X.HIC):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S0010000_7(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        Map<String, Float> outputMap = (Map) obj;
        o.LJIIIZ(outputMap, "outputMap");
        return C44591Hel.LIZ().LIZ(outputMap, !aqS12S0010000_7.z0);
    }

    public static final Object invoke$1(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C45296Hq8 setState = (C45296Hq8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C45296Hq8.LIZ(setState, null, null, null, false, false, 0, null, aqS12S0010000_7.z0, 127);
    }

    public static final Object invoke$10(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, 0, 0, 0, 0, null, null, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, null, null, null, null, 130559, null);
    }

    public static final Object invoke$11(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, 0, 0, 0, 0, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, null, null, null, null, null, null, null, null, null, 131055, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        aqS12S0010000_7.invoke$0((HIC) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C145995oB mobDownloadStatus = (C145995oB) obj;
        o.LJIIIZ(mobDownloadStatus, "$this$mobDownloadStatus");
        mobDownloadStatus.LIZ(aqS12S0010000_7.z0 ? 1 : 0, "load_meta_result");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, new AlbumToEditPageState(aqS12S0010000_7.z0), null, null, null, null, null, null, null, -134217729, 7, null);
    }

    public static final Object invoke$15(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        ChooseMediaState setState = (ChooseMediaState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, aqS12S0010000_7.z0, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -8193, 7, null);
    }

    public static final Object invoke$16(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        String str;
        C145995oB mob = (C145995oB) obj;
        o.LJIIIZ(mob, "$this$mob");
        mob.LJI("action_method", "slide");
        if (aqS12S0010000_7.z0) {
            str = "left";
        } else {
            str = "right";
        }
        mob.LJI("action_type", str);
        return mob;
    }

    public static final Object invoke$17(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, null, null, null, null, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), 127, null);
    }

    public static final Object invoke$18(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, null, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, 239, null);
    }

    public static final Object invoke$19(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, null, null, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, 223, null);
    }

    public static final Object invoke$2(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C45296Hq8 setState = (C45296Hq8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C45296Hq8.LIZ(setState, null, null, null, false, aqS12S0010000_7.z0, 0, null, false, 239);
    }

    public static final Object invoke$20(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoListState setState = (CutVideoListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoListState.copy$default(setState, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), 7, null);
    }

    public static final Object invoke$21(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, null, 247, null);
    }

    public static final Object invoke$22(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoListState setState = (CutVideoListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoListState.copy$default(setState, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, 11, null);
    }

    public static final Object invoke$23(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, null, null, 251, null);
    }

    public static final Object invoke$24(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoEditState setState = (CutVideoEditState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoEditState.copy$default(setState, null, null, Boolean.valueOf(aqS12S0010000_7.z0), 3, null);
    }

    public static final Object invoke$25(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoListState setState = (CutVideoListState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoListState.copy$default(setState, null, new C150545vW(aqS12S0010000_7.z0), null, null, 13, null);
    }

    public static final Object invoke$26(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, null, null, null, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, 191, null);
    }

    public static final Object invoke$27(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoEditState setState = (CutVideoEditState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoEditState.copy$default(setState, null, Boolean.valueOf(aqS12S0010000_7.z0), null, 5, null);
    }

    public static final Object invoke$28(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoBottomBarState setState = (CutVideoBottomBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoBottomBarState.copy$default(setState, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, null, null, null, 253, null);
    }

    public static final Object invoke$29(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoTitleBarState setState = (CutVideoTitleBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoTitleBarState.copy$default(setState, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, 11, null);
    }

    public static final Object invoke$3(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C45296Hq8 setState = (C45296Hq8) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C45296Hq8.LIZ(setState, null, null, null, aqS12S0010000_7.z0, false, 0, null, false, 247);
    }

    public static final Object invoke$30(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoTitleBarState setState = (CutVideoTitleBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoTitleBarState.copy$default(setState, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, 14, null);
    }

    public static final Object invoke$31(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoTitleBarState setState = (CutVideoTitleBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoTitleBarState.copy$default(setState, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, 13, null);
    }

    public static final Object invoke$32(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoPreviewState setState = (CutVideoPreviewState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoPreviewState.copy$default(setState, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, 29, null);
    }

    public static final Object invoke$33(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        AbstractC234519Ih it = (AbstractC234519Ih) obj;
        o.LJIIIZ(it, "it");
        ((C234529Ii) it).LIZLLL = aqS12S0010000_7.z0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C85871Xn1 setState = (C85871Xn1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C85871Xn1.LIZ(setState, null, null, false, null, null, new C08630Vn(Boolean.valueOf(aqS12S0010000_7.z0)), null, null, 223);
    }

    public static final Object invoke$5(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C85871Xn1 setState = (C85871Xn1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C85871Xn1.LIZ(setState, null, null, false, null, null, null, new C08630Vn(Boolean.valueOf(aqS12S0010000_7.z0)), null, 191);
    }

    public static final Object invoke$6(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C85871Xn1 setState = (C85871Xn1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C85871Xn1.LIZ(setState, null, null, aqS12S0010000_7.z0, null, null, null, null, null, 251);
    }

    public static final Object invoke$7(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        C85871Xn1 setState = (C85871Xn1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C85871Xn1.LIZ(setState, null, null, false, null, new C08630Vn(Boolean.valueOf(aqS12S0010000_7.z0)), null, null, null, 239);
    }

    public static final Object invoke$8(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        CutVideoTitleBarState setState = (CutVideoTitleBarState) obj;
        o.LJIIIZ(setState, "$this$setState");
        return CutVideoTitleBarState.copy$default(setState, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), 7, null);
    }

    public static final Object invoke$9(AqS12S0010000_7 aqS12S0010000_7, Object obj) {
        EditAdjustClipsBottomViewState setStateImmediate = (EditAdjustClipsBottomViewState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EditAdjustClipsBottomViewState.copy$default(setStateImmediate, 0, 0, 0, 0, null, null, null, null, Boolean.valueOf(aqS12S0010000_7.z0), null, null, null, null, null, null, null, null, 130815, null);
    }
}
