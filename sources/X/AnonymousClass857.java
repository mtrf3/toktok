package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.857, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass857 {
    public final CharSequence LIZ;
    public final Iterable<C85M> LIZIZ;
    public final List<AnonymousClass852<C85M>> LIZJ;

    public abstract List<AnonymousClass852<C85M>> LIZ(CharSequence charSequence, Iterable<C85M> iterable);

    public abstract String LIZIZ();

    public AnonymousClass857(CharSequence charSequence, Iterable<C85M> metadata) {
        o.LJIIIZ(metadata, "metadata");
        this.LIZ = charSequence;
        this.LIZIZ = metadata;
        this.LIZJ = new ArrayList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZIZ());
        LIZ.append(" parse longText -> ");
        LIZ.append((Object) charSequence);
        C85R.LIZJ(X1D.LIZIZ(LIZ));
    }
}
