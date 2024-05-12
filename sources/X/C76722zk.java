package X;

import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76722zk extends AbstractC65781Prl implements InterfaceC65784Pro<ConcurrentHashMap<String, String>> {
    public static final C76722zk INSTANCE = new C76722zk();

    public C76722zk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ConcurrentHashMap<String, String> invoke() {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            C78983UzD.LJIILL("should_not_invoke_in_main_thread");
        }
        C76662ze.LJLIL.getClass();
        return C76662ze.LJIIIIZZ();
    }
}
