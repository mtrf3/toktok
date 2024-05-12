package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.aj0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94562aj0 extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends OSZ<? extends TT2DSPPlatformInfo, ? extends TT2DSPSongInfo>>, C76800UCe> {
    public static final C94562aj0 LJLIL = new C94562aj0();

    public C94562aj0() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends OSZ<? extends TT2DSPPlatformInfo, ? extends TT2DSPSongInfo>> c43i) {
        OSZ osz;
        boolean z;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends OSZ<? extends TT2DSPPlatformInfo, ? extends TT2DSPSongInfo>> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (osz = (OSZ) c43i2.LIZ) != null) {
            TT2DSPPlatformInfo tT2DSPPlatformInfo = (TT2DSPPlatformInfo) osz.getFirst();
            TT2DSPSongInfo tT2DSPSongInfo = (TT2DSPSongInfo) osz.getSecond();
            DspPlatform from = DspPlatform.Companion.from(Integer.valueOf(tT2DSPPlatformInfo.getDspPlatform()));
            if (C93922aYg.LIZLLL(from).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            if (z) {
                InterfaceC94505ai5 interfaceC94505ai5 = (InterfaceC94505ai5) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(InterfaceC94505ai5.class), null);
                interfaceC94505ai5.O9(from);
                interfaceC94505ai5.e1(from, tT2DSPSongInfo, true);
                interfaceC94505ai5.j6();
            } else {
                int i = C93573aT3.LIZ[from.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            InterfaceC94505ai5 interfaceC94505ai52 = (InterfaceC94505ai5) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(InterfaceC94505ai5.class), null);
                            if (tT2DSPSongInfo != null) {
                                str = tT2DSPSongInfo.getSongId();
                            }
                            interfaceC94505ai52.pc(tT2DSPPlatformInfo, str);
                        }
                    } else {
                        InterfaceC94505ai5 interfaceC94505ai53 = (InterfaceC94505ai5) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(InterfaceC94505ai5.class), null);
                        if (tT2DSPSongInfo != null) {
                            str = tT2DSPSongInfo.getSongId();
                        }
                        interfaceC94505ai53.K9(tT2DSPPlatformInfo, str);
                    }
                } else {
                    InterfaceC94505ai5 interfaceC94505ai54 = (InterfaceC94505ai5) C8VC.LIZ(selectSubscribe, C65352Pkq.LIZ(InterfaceC94505ai5.class), null);
                    if (tT2DSPSongInfo != null) {
                        str = tT2DSPSongInfo.getSongId();
                    }
                    interfaceC94505ai54.li(tT2DSPPlatformInfo, str);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
