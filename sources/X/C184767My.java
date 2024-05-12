package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.7My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184767My extends F9E implements Serializable, InterfaceC87283bg {
    public final String LJLIL;

    public static /* synthetic */ C184767My copy$default(C184767My c184767My, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c184767My.LJLIL;
        }
        return c184767My.copy(str);
    }

    public final C184767My copy(String uid) {
        o.LJIIIZ(uid, "uid");
        return new C184767My(uid);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public final String getUid() {
        return this.LJLIL;
    }

    public C184767My(String uid) {
        o.LJIIIZ(uid, "uid");
        this.LJLIL = uid;
    }
}
