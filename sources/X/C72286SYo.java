package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.SYo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72286SYo extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, String>> {
    public final /* synthetic */ long LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72286SYo(long j) {
        super(0);
        this.LJLIL = j;
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, String> invoke() {
        HashMap hashMap = new HashMap();
        C7MY.LJFF(SystemClock.elapsedRealtimeNanos(), this.LJLIL, hashMap, "duration");
        return hashMap;
    }
}
