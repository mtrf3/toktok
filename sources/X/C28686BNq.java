package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.viewholder.DrawerSmallLiveViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BNq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28686BNq extends AbstractC28694BNy {
    @Override // X.AbstractC42141l4
    public final boolean LLIIIL() {
        if (o.LJ(C08680Vs.LJIILJJIL.LJIIIIZZ, "game_drawer_drops")) {
            return false;
        }
        return this.LJLLL;
    }

    public C28686BNq(java.util.Map<Integer, InterfaceC28689BNt> map) {
        super(map);
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        return new C28685BNp(this, C28289B8j.LIZ(viewGroup, R.layout.cvj, viewGroup, false));
    }

    @Override // X.AbstractC42141l4
    public final void LLFF(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        AbstractC42141l4.LLIIII(viewHolder);
        AbstractC31901Na abstractC31901Na = (AbstractC31901Na) viewHolder;
        if (this.LJLLJ || LJZL() == 0) {
            z = true;
        } else {
            z = false;
        }
        abstractC31901Na.L(z);
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LLIFFJFJJ(ViewGroup viewGroup) {
        return new C28648BMe(C28289B8j.LIZ(viewGroup, R.layout.cvb, viewGroup, false), this.LJLILLLLZI);
    }

    @Override // X.AbstractC28694BNy, X.AbstractC42141l4, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof DrawerSmallLiveViewHolder) {
            ((DrawerSmallLiveViewHolder) viewHolder).LLFZ = this.LLFF;
        }
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // X.AbstractC42141l4
    public final RecyclerView.ViewHolder LJZI(int i, ViewGroup viewGroup) {
        if (i == -1091576148) {
            return new BOD(C28289B8j.LIZ(viewGroup, R.layout.d24, viewGroup, false), this.LJLILLLLZI);
        }
        if (i == -1091576149) {
            return new C28648BMe(C28289B8j.LIZ(viewGroup, R.layout.cvb, viewGroup, false), this.LJLILLLLZI);
        }
        return super.LJZI(i, viewGroup);
    }

    @Override // X.AbstractC42141l4
    public final void LLFFF(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC42141l4.LLIIII(viewHolder);
        if (viewHolder instanceof C28685BNp) {
            ((BNR) viewHolder).bind(null, i);
        }
    }
}
