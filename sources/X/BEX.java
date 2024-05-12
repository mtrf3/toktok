package X;

import android.view.View;
import com.bytedance.android.live.usermanage.model.UserManageExtra;
import com.bytedance.android.livesdk.adminsetting.LiveManageListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BEX implements InterfaceC28459BEx, InterfaceC28458BEw {
    public final /* synthetic */ LiveManageListFragment LJLIL;

    @Override // X.InterfaceC28459BEx
    public final void b(Exception exc, boolean z) {
    }

    @Override // X.InterfaceC28459BEx
    public final void l(boolean z) {
    }

    public final void LIZ() {
        LiveManageListFragment liveManageListFragment;
        BEZ bez;
        if (this.LJLIL.isViewValid() && (bez = (liveManageListFragment = this.LJLIL).LJLJLLL) != null) {
            if (bez.getBasicItemCount() == 0) {
                ((BEQ) liveManageListFragment._$_findCachedViewById(R.id.j6w)).LIZ();
                return;
            }
            C28437BEb c28437BEb = bez.LJLILLLLZI;
            if (c28437BEb == null) {
                return;
            }
            ((BEQ) c28437BEb.itemView).LIZ();
        }
    }

    public final void LIZJ() {
        LiveManageListFragment liveManageListFragment;
        BEZ bez;
        if (this.LJLIL.isViewValid() && (bez = (liveManageListFragment = this.LJLIL).LJLJLLL) != null) {
            if (bez.getBasicItemCount() == 0) {
                ((BEQ) liveManageListFragment._$_findCachedViewById(R.id.j6w)).LIZLLL();
                return;
            }
            C28437BEb c28437BEb = bez.LJLILLLLZI;
            if (c28437BEb == null) {
                return;
            }
            ((BEQ) c28437BEb.itemView).LIZLLL();
        }
    }

    @Override // X.InterfaceC28458BEw
    public final void Hh() {
        LIZ();
    }

    @Override // X.InterfaceC28459BEx
    public final void K() {
        LIZ();
    }

    public BEX(LiveManageListFragment liveManageListFragment) {
        this.LJLIL = liveManageListFragment;
    }

    public final void LIZIZ(C28465BFd c28465BFd, Exception exc) {
        LiveManageListFragment liveManageListFragment;
        BEZ bez;
        if (!this.LJLIL.isViewValid() || (bez = (liveManageListFragment = this.LJLIL).LJLJLLL) == null) {
            return;
        }
        if (exc != null || c28465BFd == null || c28465BFd.data == null) {
            if (bez.getItemCount() == 0) {
                ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZJ();
                this.LJLIL.LJLJJLL = 0;
            }
            BPP.LIZJ(this.LJLIL.getContext(), exc);
            return;
        }
        boolean z = c28465BFd.extra.hasMore;
        liveManageListFragment.LJLJL = z;
        if (!z) {
            o.LJI(bez);
            bez.LJLIL = false;
        }
        List<T> list = c28465BFd.data;
        if (list != 0 && list.size() > 0) {
            BEZ bez2 = this.LJLIL.LJLJLLL;
            o.LJI(bez2);
            if (list.size() > 0) {
                ((ArrayList) bez2.LJLJJL).addAll(list);
            }
            BEZ bez3 = this.LJLIL.LJLJLLL;
            o.LJI(bez3);
            bez3.LJLJJLL = ((UserManageExtra) c28465BFd.extra).operations;
            BEZ bez4 = this.LJLIL.LJLJLLL;
            o.LJI(bez4);
            bez4.notifyDataSetChanged();
            LiveManageListFragment liveManageListFragment2 = this.LJLIL;
            if (2 == liveManageListFragment2.LJLJJI) {
                View _$_findCachedViewById = liveManageListFragment2._$_findCachedViewById(R.id.j6v);
                if (_$_findCachedViewById != null) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById);
                    return;
                }
                return;
            }
            View _$_findCachedViewById2 = liveManageListFragment2._$_findCachedViewById(R.id.j6v);
            if (_$_findCachedViewById2 == null) {
                return;
            }
            C29306Beo.LJI(_$_findCachedViewById2);
            return;
        }
        ((BEQ) this.LJLIL._$_findCachedViewById(R.id.j6w)).LIZIZ();
    }

    @Override // X.InterfaceC28459BEx
    public final void LJLIIL(C28465BFd c28465BFd, Exception exc) {
        LIZIZ(c28465BFd, exc);
    }

    @Override // X.InterfaceC28458BEw
    public final void k1(C28465BFd c28465BFd, Exception exc) {
        LIZIZ(c28465BFd, exc);
    }
}
