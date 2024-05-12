package X;

import androidx.lifecycle.Observer;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* renamed from: X.Jdl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49625Jdl<T> implements Observer {
    public static final C49625Jdl<T> LJLIL = new C49625Jdl<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Boolean enter = (Boolean) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on subscribeBotActualEnter: enter = ");
        LIZ.append(enter);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoHelper", X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(enter, "enter");
        if (enter.booleanValue() && o.LJ(C49543JcR.LIZLLL().getEnableFeedEntranceForTrafficControl(), Boolean.TRUE)) {
            C50234Jna.LIZ("search_tikbot").storeBoolean("has_enter_chat_success", true);
        }
    }
}
