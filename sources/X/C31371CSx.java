package X;

import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.CSx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31371CSx {
    public final C31255COl LIZ;
    public boolean LIZIZ;
    public CT7 LIZJ;
    public SmoothLinearLayoutManager LIZLLL;

    public final boolean LIZ() {
        C31255COl c31255COl = this.LIZ;
        if (c31255COl != null) {
            return c31255COl.canScrollVertically(1);
        }
        return false;
    }

    public final void LIZJ() {
        C31255COl c31255COl = this.LIZ;
        if (c31255COl != null) {
            c31255COl.LLLIIIL = false;
        }
    }

    public final int LIZLLL() {
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LIZLLL;
        if (smoothLinearLayoutManager != null) {
            return smoothLinearLayoutManager.LLIL();
        }
        return 0;
    }

    public final int LJ() {
        CT7 ct7 = this.LIZJ;
        if (ct7 != null) {
            return ct7.getItemCount();
        }
        return 0;
    }

    public C31371CSx(C31255COl recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LIZ = recyclerView;
        this.LIZIZ = true;
    }

    public final void LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LIZIZ) {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LJFF(AbstractC030109x abstractC030109x) {
        C31255COl c31255COl = this.LIZ;
        if (c31255COl == null) {
            return;
        }
        c31255COl.setItemAnimator(abstractC030109x);
    }
}
