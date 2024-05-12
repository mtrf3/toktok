package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$launchCompile$1$2", f = "CutPlayerActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171826ok extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractActivityC171766oe LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171826ok(AbstractActivityC171766oe abstractActivityC171766oe, C68322mC<String> c68322mC, InterfaceC67352kd<? super C171826ok> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractActivityC171766oe;
        this.LJLILLLLZI = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C171826ok(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C5N0 W8;
        C141335gf.LIZJ(obj);
        InterfaceC132665Io interfaceC132665Io = this.LJLIL.LJLJJLL;
        if (interfaceC132665Io != null) {
            C78857UxB.LJIIL(interfaceC132665Io.pause());
        }
        NLEVideoEncodeSettings nLEVideoEncodeSettings = new NLEVideoEncodeSettings();
        NLEMediaJniJNI.NLEVideoEncodeSettings_fps_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, 30);
        NLEMediaJniJNI.NLEVideoEncodeSettings_bps_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, 8912896);
        NLEMediaJniJNI.NLEVideoEncodeSettings_isSupportHWEncoder_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, false);
        NLEMediaJniJNI.NLEVideoEncodeSettings_gopSize_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, 35);
        NLEMediaJniJNI.NLEVideoEncodeSettings_externalSettingsJsonStr_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, "{\"compile\": {\"encode_mode\": \"hw\",\"hw\": {\"bitrate\": 6000000,\"profile\": \"unknown\",\"hp_bitrate_ratio\": \"0.8\",\"sd_bitrate_ratio\": \"0.9\",\"h_fps_bitrate_ratio\": \"1.4\",\"gop\": -1},\"sw\": {\"crf\": 17,\"preset\": 0,\"profile\": \"unknown\",\"maxrate\": 15000000,\"gop\": 35,\"qpoffset\":0.0}},\"watermark_compile\": {\"encode_mode\": \"hw\",\"hw\": {\"bitrate\": 9000000,\"profile\": \"unknown\",\"hp_bitrate_ratio\": \"0.8\",\"full_hd_bitrate_ratio\":1.33,\"gop\": -1},\"sw\": {\"crf\": 17,\"preset\": 0,\"profile\": \"unknown\",\"maxrate\": 15000000,\"gop\": 35,\"qpoffset\":0.0}}}");
        NLEMediaJniJNI.NLEVideoEncodeSettings_resizeMode_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, 4);
        if (!NLEMediaJniJNI.NLEVideoEncodeSettings_isSupportHWEncoder_get(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings)) {
            NLEMediaJniJNI.NLEVideoEncodeSettings_swCRF_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, 15);
        }
        PairIntInt pairIntInt = new PairIntInt((int) 720, (int) 1280);
        NLEMediaJniJNI.NLEVideoEncodeSettings_outputSize_set(nLEVideoEncodeSettings.LIZ, nLEVideoEncodeSettings, pairIntInt.LIZ, pairIntInt);
        C133785Mw c133785Mw = this.LJLIL.LJLJJL;
        if (c133785Mw != null && (W8 = c133785Mw.W8()) != null) {
            final C68322mC<String> c68322mC = this.LJLILLLLZI;
            String str = c68322mC.element;
            final AbstractActivityC171766oe abstractActivityC171766oe = this.LJLIL;
            Boolean valueOf = Boolean.valueOf(W8.LJFF(str, nLEVideoEncodeSettings, new InterfaceC133955Nn() { // from class: X.6oj
                @Override // X.InterfaceC133955Nn
                public final void onCompileDone() {
                    AbstractActivityC171766oe abstractActivityC171766oe2 = abstractActivityC171766oe;
                    XKX.LIZLLL(abstractActivityC171766oe2, EXS.LIZ, null, new C171776of(abstractActivityC171766oe2, c68322mC, null), 2);
                }

                @Override // X.InterfaceC133955Nn
                public final void onCompileProgress(float f) {
                    abstractActivityC171766oe.LLIIJI(f);
                }

                @Override // X.InterfaceC133955Nn
                public final void onCompileError(int i, int i2, float f, String str2) {
                    abstractActivityC171766oe.LLIIIZ(i, str2);
                }
            }));
            if (valueOf != null && valueOf.booleanValue()) {
                this.LJLIL.LLIIJLIL();
                return C76800UCe.LIZ;
            }
        }
        this.LJLIL.LLIIIZ(-10086, "compile return error directly");
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
