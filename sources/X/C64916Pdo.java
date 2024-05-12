package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Timer;

/* renamed from: X.Pdo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64916Pdo extends AbstractC65781Prl implements InterfaceC65784Pro<Timer> {
    public static final C64916Pdo LJLIL = new C64916Pdo();

    public C64916Pdo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Timer invoke() {
        return new PthreadTimer("SlowApiCheckHandler$timer$2");
    }
}
