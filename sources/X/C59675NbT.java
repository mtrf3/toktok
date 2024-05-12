package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.NbT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59675NbT extends RecyclerView implements InterfaceC59676NbU {
    public C59674NbS LLLF;

    @Override // X.InterfaceC59676NbU
    public final boolean LIZIZ() {
        return this.LLLF.LIZ;
    }

    public final C59674NbS getEnterTabManager() {
        return this.LLLF;
    }

    public final void setEnterTabManager(C59674NbS c59674NbS) {
        o.LJIIIZ(c59674NbS, "<set-?>");
        this.LLLF = c59674NbS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59675NbT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLF = new C59674NbS();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
