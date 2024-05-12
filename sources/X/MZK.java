package X;

import Y.AObserverS77S0100000_9;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailFragment;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MZK extends C8HS<BaseNotice> {
    public final MusNotificationDetailFragment LJLIL;
    public final MZI LJLILLLLZI;
    public final MZI LJLJI;
    public int LJLJJI;
    public final C5H3 LJLJJL;
    public final HashMap<String, BaseNotice> LJLJJLL;
    public final int LJLJL;

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        BaseNotice baseNotice;
        List<BaseNotice> data = getData();
        if (data == null || (baseNotice = (BaseNotice) ListProtector.get(data, i)) == null) {
            return -1;
        }
        if (baseNotice.templateNotice != null) {
            return -10000;
        }
        return 0;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onAttached();
        }
        C57052MaG c57052MaG = C57052MaG.LJLIL;
        C57051MaF c57051MaF = C57053MaH.LIZ;
        if (c57051MaF != null) {
            c57052MaG.invoke(c57051MaF);
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        ViewOnClickListenerC56908MVc viewOnClickListenerC56908MVc;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if ((holder instanceof ViewOnClickListenerC56908MVc) && (viewOnClickListenerC56908MVc = (ViewOnClickListenerC56908MVc) holder) != null) {
            viewOnClickListenerC56908MVc.onDetached();
        }
    }

    @Override // X.C8HS
    public final void setData(List<BaseNotice> list) {
        if (list != null) {
            list = this.LJLILLLLZI.LJFF(list);
        }
        super.setData(list);
    }

    @Override // X.C8HS
    public final void setDataAfterLoadMore(List<BaseNotice> list) {
        if (list != null) {
            list = this.LJLILLLLZI.LJFF(list);
        }
        super.setDataAfterLoadMore(list);
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BaseNotice baseNotice;
        boolean z;
        List<T> list = this.mmItems;
        if (list == 0 || (baseNotice = (BaseNotice) ListProtector.get(list, i)) == null) {
            return;
        }
        int i2 = 0;
        if (i > this.LJLJJI - 1) {
            z = true;
        } else {
            z = false;
            if (this.LJLJJLL.get(baseNotice.nid) != null) {
                z = true;
            }
        }
        if (viewHolder != null) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = marginLayoutParams.leftMargin;
            if (i == 0) {
                i2 = this.LJLJL;
            }
            marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        if (getBasicItemViewType(i) == -10000) {
            MZI mzi = this.LJLJI;
            o.LJI(viewHolder);
            mzi.LJ(viewHolder, baseNotice, i, this.LJLJJLL, z);
        } else {
            MZI mzi2 = this.LJLILLLLZI;
            o.LJI(viewHolder);
            mzi2.LJ(viewHolder, baseNotice, i, this.LJLJJLL, z);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder LIZLLL;
        if (i == -10000) {
            MZI mzi = this.LJLJI;
            o.LJI(viewGroup);
            LIZLLL = mzi.LIZLLL(viewGroup);
        } else {
            MZI mzi2 = this.LJLILLLLZI;
            o.LJI(viewGroup);
            LIZLLL = mzi2.LIZLLL(viewGroup);
        }
        if (LIZLLL instanceof ViewOnClickListenerC56908MVc) {
            ((ViewOnClickListenerC56908MVc) LIZLLL).setItemClickListener(this.LJLIL);
        }
        return LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MZK(MusNotificationDetailFragment ctx, MZI mzi, MZI mzi2, int i) {
        super(false, 1, null);
        o.LJIIIZ(ctx, "ctx");
        this.LJLIL = ctx;
        this.LJLILLLLZI = mzi;
        this.LJLJI = mzi2;
        this.LJLJJI = i;
        C5H3 LJZI = V1B.LJZI(new AqS159S0100000_9(this, 1073));
        this.LJLJJL = LJZI;
        this.LJLJJLL = new HashMap<>(this.LJLJJI);
        this.LJLJL = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
        ((LiveData) ((NotificationDetailVM) LJZI.getValue()).LJLILLLLZI.getValue()).observe(ctx, new AObserverS77S0100000_9(this, 150));
    }
}
