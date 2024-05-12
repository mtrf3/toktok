package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* renamed from: X.JbQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49480JbQ extends C49477JbN {
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // X.C49477JbN, X.InterfaceC49479JbP
    public final InterfaceC49482JbS LIZIZ(RecyclerView recyclerView, int i, Collection<? extends InterfaceC49482JbS> collection) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            this.LIZJ = false;
        } else if (i == 0) {
            if (this.LIZJ && this.LIZLLL) {
                this.LIZLLL = false;
                return null;
            }
            this.LIZJ = true;
        }
        return super.LIZIZ(recyclerView, i, collection);
    }
}
