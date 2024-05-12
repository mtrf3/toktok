package X;

import Y.ARunnableS20S0200000_1;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.44g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1034644g implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C1034744h LJLJI;

    public RunnableC1034644g(boolean z, C109544Rq c109544Rq, C1034744h c1034744h) {
        this.LJLIL = z;
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = c1034744h;
    }

    public final void LIZ() {
        EnumC1035144l enumC1035144l;
        C109544Rq c109544Rq;
        int i;
        int i2;
        Integer num;
        int i3;
        int i4;
        RecyclerView.ViewHolder LJJIZ;
        View view;
        if (this.LJLIL) {
            enumC1035144l = EnumC1035144l.SEND_MSG_UPDATE_DATA;
        } else {
            enumC1035144l = EnumC1035144l.SEND_MSG;
        }
        C109544Rq c109544Rq2 = this.LJLILLLLZI;
        if ((c109544Rq2 != null && c109544Rq2.isSelf()) || ((c109544Rq = this.LJLILLLLZI) != null && C93793mB.LJIILLIIL(c109544Rq))) {
            C1034744h c1034744h = this.LJLJI;
            C1034344d c1034344d = c1034744h.LIZ;
            if (c1034344d.LJLJJL.LIZLLL) {
                C109544Rq c109544Rq3 = this.LJLILLLLZI;
                RecyclerView recyclerView = c1034344d.LJLJLLL;
                if (recyclerView != null) {
                    i = recyclerView.getHeight();
                } else {
                    i = 0;
                }
                this.LJLJI.LIZ.LJLJI.getClass();
                int LJ = C97343ru.LJ(R.dimen.t9);
                boolean z = this.LJLIL;
                Integer num2 = c1034744h.LIZ.LIZIZ().get(c109544Rq3.getUuid());
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                if (i2 > i - LJ) {
                    c1034744h.LIZ(1, c1034744h.LIZ.LIZJ(), enumC1035144l);
                } else {
                    RecyclerView recyclerView2 = c1034744h.LIZ.LJLJLLL;
                    if (recyclerView2 != null && (LJJIZ = recyclerView2.LJJIZ(1)) != null && (view = LJJIZ.itemView) != null) {
                        num = Integer.valueOf(view.getBottom());
                    } else {
                        num = null;
                    }
                    Integer num3 = c1034744h.LIZ.LIZIZ().get(c109544Rq3.getUuid());
                    if (num3 != null) {
                        i3 = num3.intValue();
                    } else {
                        i3 = 0;
                    }
                    if (num == null || num.intValue() > C97343ru.LJ(R.dimen.t7) + i3) {
                        if (z) {
                            C1034344d c1034344d2 = c1034744h.LIZ;
                            RecyclerView recyclerView3 = c1034344d2.LJLJI.LIZIZ.LJLJLLL;
                            if (recyclerView3 != null) {
                                i4 = recyclerView3.getHeight();
                            } else {
                                i4 = 0;
                            }
                            c1034344d2.LJLJI.LIZ(i4 - C97343ru.LJ(R.dimen.t7));
                            int LIZJ = c1034744h.LIZ.LIZJ();
                            c1034744h.LIZ.LJLJI.getClass();
                            c1034744h.LIZ(1, LIZJ - C97343ru.LJ(R.dimen.t7), enumC1035144l);
                            C1DH.LJJIJIIJIL(0L, new ARunnableS20S0200000_1(c1034744h, c109544Rq3, 50));
                        } else {
                            c1034744h.LIZIZ(enumC1035144l);
                        }
                    }
                }
                c1034744h.LIZIZ = System.currentTimeMillis();
                this.LJLJI.LIZ.LJLJJL.LIZLLL = false;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
