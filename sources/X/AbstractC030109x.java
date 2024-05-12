package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.09x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC030109x {
    public C030209y LIZ;
    public final ArrayList<InterfaceC029909v> LIZIZ = new ArrayList<>();
    public long LIZJ = 120;
    public long LIZLLL = 120;
    public long LJ = 250;
    public long LJFF = 250;

    public abstract boolean LIZ(RecyclerView.ViewHolder viewHolder, C030009w c030009w, C030009w c030009w2);

    public abstract boolean LIZIZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, C030009w c030009w, C030009w c030009w2);

    public abstract boolean LIZJ(RecyclerView.ViewHolder viewHolder, C030009w c030009w, C030009w c030009w2);

    public abstract boolean LIZLLL(RecyclerView.ViewHolder viewHolder, C030009w c030009w, C030009w c030009w2);

    public boolean LJFF(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    public abstract void LJIIIZ(RecyclerView.ViewHolder viewHolder);

    public abstract void LJIIJ();

    public abstract boolean LJIILJJIL();

    public abstract void LJIIZILJ();

    public final void LJIIIIZZ() {
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC029909v) ListProtector.get(this.LIZIZ, i)).LIZ();
        }
        this.LIZIZ.clear();
    }

    public long LJIIJJI() {
        return this.LJFF;
    }

    public long LJIIL() {
        return this.LJ;
    }

    public long LJIILIIL() {
        return this.LIZLLL;
    }

    public static int LJ(RecyclerView.ViewHolder viewHolder) {
        int i = viewHolder.mFlags & 14;
        if (viewHolder.isInvalid()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                return i | 2048;
            }
            return i;
        }
        return i;
    }

    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        C030209y c030209y = this.LIZ;
        if (c030209y != null) {
            boolean z = true;
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild()) {
                RecyclerView recyclerView = c030209y.LIZ;
                View view = viewHolder.itemView;
                recyclerView.LJLILLLLZI();
                C0AW c0aw = recyclerView.LJLJJL;
                int indexOfChild = ((C28891Bl) c0aw.LIZ).LIZ.indexOfChild(view);
                if (indexOfChild == -1) {
                    c0aw.LJIIL(view);
                } else if (c0aw.LIZIZ.LIZLLL(indexOfChild)) {
                    c0aw.LIZIZ.LJFF(indexOfChild);
                    c0aw.LJIIL(view);
                    ((C28891Bl) c0aw.LIZ).LIZIZ(indexOfChild);
                } else {
                    z = false;
                    recyclerView.LJLJI(!z);
                    if (z && viewHolder.isTmpDetached()) {
                        c030209y.LIZ.removeDetachedView(viewHolder.itemView, false);
                        return;
                    }
                }
                RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(view);
                recyclerView.LJLILLLLZI.LJIIL(LJJJJL);
                recyclerView.LJLILLLLZI.LJIIIZ(LJJJJL);
                recyclerView.LJLJI(!z);
                if (z) {
                }
            }
        }
    }

    public final boolean LJIILL(InterfaceC029909v interfaceC029909v) {
        boolean LJIILJJIL = LJIILJJIL();
        if (interfaceC029909v != null) {
            if (!LJIILJJIL) {
                interfaceC029909v.LIZ();
            } else {
                this.LIZIZ.add(interfaceC029909v);
            }
        }
        return LJIILJJIL;
    }

    public boolean LJI(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return LJFF(viewHolder);
    }

    public C030009w LJIILLIIL(C0AC c0ac, RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C030009w c030009w = new C030009w();
        View view = viewHolder.itemView;
        c030009w.LIZ = view.getLeft();
        c030009w.LIZIZ = view.getTop();
        c030009w.LIZJ = view.getRight();
        c030009w.LIZLLL = view.getBottom();
        return c030009w;
    }
}
