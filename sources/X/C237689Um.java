package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237689Um extends F9E implements C33Q {
    public final AbstractC72932td<List<C237749Us>> LJLIL;

    public C237689Um() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C237689Um(AbstractC72932td<? extends List<C237749Us>> prompts) {
        o.LJIIIZ(prompts, "prompts");
        this.LJLIL = prompts;
    }

    public /* synthetic */ C237689Um(int i) {
        this(C33X.LIZ);
    }
}
