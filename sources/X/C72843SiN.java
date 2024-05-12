package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.SiN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72843SiN extends RecyclerView {
    public boolean LLLF;

    public final void LJLJJLL() {
        if (this.LLLF) {
            this.LLLF = false;
            LJLJJI();
        }
    }

    public final void setRunning(boolean z) {
        this.LLLF = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72843SiN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    public final void LJLJJL(int i, int i2) {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            C0A2 layoutManager = getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).LJFF(i, i2);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be a subclass of LinearLayoutManager");
    }
}
