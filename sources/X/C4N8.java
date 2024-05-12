package X;

import Y.ACListenerS21S0100000_1;
import Y.AObserverS62S0300000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4N8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4N8<T> extends AbstractC116824iE<C4N9<T>, T> {
    public final int LJLILLLLZI;
    public final IDqS426S0100000_1 LJLJI;
    public View LJLJJI;
    public boolean LJLJJL;

    public C4N8() {
        super(null);
        this.LJLILLLLZI = (int) KL2.LIZJ(EF7.LIZIZ(), 40.0f);
        this.LJLJI = new IDqS426S0100000_1(this, 13);
    }

    @Override // X.AbstractC116824iE
    public final int LJLLLLLL() {
        if (this.LJLJJI == null || !this.LJLJJL) {
            return 0;
        }
        return 1;
    }

    @Override // X.C4II
    public int getBasicItemViewType(int i) {
        if (i < LJLLLLLL()) {
            return Integer.MAX_VALUE;
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        C107724Kq c107724Kq;
        o.LJIIIZ(holder, "holder");
        if (i < LJLLLLLL()) {
            return;
        }
        C4N9 c4n9 = (C4N9) holder;
        ViewGroup.LayoutParams layoutParams = c4n9.itemView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i == getItemCount() - 1) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, this.LJLILLLLZI);
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 0);
        }
        T item = getItem(i);
        if (item != null) {
            T item2 = getItem(i - 1);
            int LJLLLLLL = i - LJLLLLLL();
            C4N7 c4n7 = (C4N7) this;
            InterfaceC107704Ko interfaceC107704Ko = c4n7.LJLL;
            if (interfaceC107704Ko != null) {
                c107724Kq = interfaceC107704Ko.getActivityStatusParams();
            } else {
                c107724Kq = null;
            }
            c4n9.L(item, item2, LJLLLLLL, c107724Kq);
            c4n9.LJLJLLL = c4n7.LJZ((IMContact) item);
            c4n9.M();
            c4n9.LJLIL = this.LJLJI;
            if (holder instanceof C107354Jf) {
                ((C107354Jf) holder).LLD = new AObserverS62S0300000_1(holder, this, item, 3);
            }
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(final ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (i == Integer.MAX_VALUE) {
            View view = this.LJLJJI;
            if (view != null && view.getParent() != null) {
                C34B.LJFF(new Exception("BaseSelectListAdapter Still get a un-detached header"));
                final Space space = new Space(parent.getContext());
                return new C4N9<ITEM>(space) { // from class: X.4NB
                    @Override // X.C4N9
                    public final void L(ITEM item, ITEM item2, int i2, C107724Kq c107724Kq) {
                    }
                };
            }
            final View view2 = this.LJLJJI;
            o.LJI(view2);
            return new C4N9<ITEM>(view2) { // from class: X.4NB
                @Override // X.C4N9
                public final void L(ITEM item, ITEM item2, int i2, C107724Kq c107724Kq) {
                }
            };
        }
        C4N7 c4n7 = (C4N7) this;
        if (i == 2) {
            final ShareDialogViewModel shareDialogViewModel = c4n7.LJLJL;
            return new C4N9<IMContact>(parent, shareDialogViewModel) { // from class: X.4NA
                {
                    super(C1DI.LIZ(parent, "parent", R.layout.b7n, parent, false, "from(parent.context)\n   …re_friend, parent, false)"));
                    C16880lQ.LJIIJ(new ACListenerS21S0100000_1(shareDialogViewModel, 254), this.itemView);
                }

                @Override // X.C4N9
                public final void L(IMContact iMContact, IMContact iMContact2, int i2, C107724Kq c107724Kq) {
                }
            };
        }
        return new C107354Jf(parent, c4n7.LJLJL, c4n7.LJLJJLL, c4n7.LJLJLJ);
    }
}
