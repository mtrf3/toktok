package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C0e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30624C0e extends RecyclerView {
    public boolean LLLF;
    public List<InterfaceC30622C0c> LLLFF;
    public C40141hq LLLFFI;

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void LJJLIIIJJI() {
        this.LLLF = true;
    }

    public final C40141hq getSnapHelper() {
        return this.LLLFFI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30624C0e(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void LJJLIIIJILLIZJL(int i) {
        View LJFF;
        int i2;
        List<InterfaceC30622C0c> list;
        if (i == 0 && this.LLLF) {
            this.LLLF = false;
            C40141hq c40141hq = this.LLLFFI;
            if (c40141hq != null && (LJFF = c40141hq.LJFF(getLayoutManager())) != null) {
                int LJJJJJ = RecyclerView.LJJJJJ(LJFF);
                C0A2 layoutManager = getLayoutManager();
                if (layoutManager != null) {
                    int LJJJJZ = layoutManager.LJJJJZ();
                    if (LJJJJJ == 0) {
                        C0A2 layoutManager2 = getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.LLIIII(this, new C0AC(), 1);
                            return;
                        }
                        return;
                    }
                    if (LJJJJJ == LJJJJZ - 1) {
                        i2 = LJJJJZ - 2;
                        C0A2 layoutManager3 = getLayoutManager();
                        if (layoutManager3 != null) {
                            layoutManager3.LLIIII(this, new C0AC(), i2);
                        }
                    } else {
                        i2 = LJJJJJ;
                    }
                    if (i2 != LJJJJJ || (list = this.LLLFF) == null) {
                        return;
                    }
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC30622C0c) it.next()).LIZ(i2 - 1);
                    }
                }
            }
        }
    }

    public final void setSnapHelper(C40141hq c40141hq) {
        this.LLLFFI = c40141hq;
    }
}
