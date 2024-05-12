package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.setting.api.SimpleResponseBody;

/* renamed from: X.Fwk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40610Fwk<T> implements InterfaceC64592gB {
    public static final C40610Fwk<T> LJLIL = new C40610Fwk<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C40609Fwj.LJ.storeBoolean(C40609Fwj.LIZJ, ((SimpleResponseBody) obj).LIZ());
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BetaAppExperiment", "msg send success.");
    }
}
