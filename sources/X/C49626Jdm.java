package X;

import androidx.lifecycle.Observer;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.o;

/* renamed from: X.Jdm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49626Jdm<T> implements Observer {
    public static final C49626Jdm<T> LJLIL = new C49626Jdm<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Boolean agree = (Boolean) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on subscribeBotAutoSend: agree = ");
        LIZ.append(agree);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoHelper", X1D.LIZIZ(LIZ));
        String str = C49624Jdk.LIZIZ;
        if (str != null) {
            o.LJIIIIZZ(agree, "agree");
            if (agree.booleanValue()) {
                C49624Jdk.LIZ.add(str);
                C49624Jdk.LIZIZ = null;
            }
        }
    }
}
