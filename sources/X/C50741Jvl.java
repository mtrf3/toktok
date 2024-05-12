package X;

import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50741Jvl extends F9E implements InterfaceC49833Jh7 {
    public final HashSet<String> LJLIL;
    public final String LJLILLLLZI;

    public C50741Jvl() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C50741Jvl(int i) {
        this(new HashSet(), "");
    }

    public C50741Jvl(HashSet<String> queries, String channel) {
        o.LJIIIZ(queries, "queries");
        o.LJIIIZ(channel, "channel");
        this.LJLIL = queries;
        this.LJLILLLLZI = channel;
    }
}
