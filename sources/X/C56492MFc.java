package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.MFc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56492MFc extends JZQ {
    public final String LJLJI;
    public final MH9 LJLJJI;
    public final JWG<AbstractC208618Gr> LJLJJL;
    public final MGV LJLJJLL;
    public boolean LJLJL;
    public final Bundle LJLJLJ;

    @Override // X.MK7, X.C4II, X.AbstractC029409q
    public final int getItemCount() {
        if (this.mShowFooter) {
            return getBasicItemCount() + 1;
        }
        return getBasicItemCount();
    }

    @Override // X.JZQ
    public final boolean LJZI(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 110003) {
            return true;
        }
        return false;
    }

    public final List<Integer> LL(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int max = Math.max(0, this.mmPreviousCount - 1); max < size; max++) {
            Aweme aweme = (Aweme) ListProtector.get(list, max);
            aweme.setOriginalPos(max);
            if (aweme.getIsTop() == 1) {
                list.remove(aweme);
                ListProtector.add(list, i, aweme);
                i++;
                arrayList.add(Integer.valueOf(max));
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final int getBasicItemViewType(int i) {
        int basicItemViewType = super.getBasicItemViewType(i);
        if (basicItemViewType == 0) {
            List<T> list = this.mmItems;
            if ((this.LJLJJLL instanceof AbstractC225718tT) && list != 0 && i < list.size()) {
                return ((AbstractC225718tT) this.LJLJJLL).getDetailAwemeViewType(i, (Aweme) ListProtector.get(list, i));
            }
        }
        return basicItemViewType;
    }

    @Override // X.JZQ, X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        JWG<AbstractC208618Gr> jwg;
        JWG<AbstractC208618Gr> jwg2;
        super.onViewAttachedToWindow(viewHolder);
        if (this.LJLJL && ((viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 110003) && (jwg2 = this.LJLJJL) != null)) {
            jwg2.vk(viewHolder);
        }
        if (viewHolder.getItemViewType() == 110001 && (jwg = this.LJLJJL) != null) {
            jwg.p(viewHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8HS
    public final void setData(List<Aweme> list) {
        this.mmPreviousCount = 0;
        if (TextUtils.equals(this.LJLJI, "challenge")) {
            this.mmItems = list;
            Objects.requireNonNull(list);
            LL(list);
            super.setData(this.mmItems);
            return;
        }
        super.setData(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8HS
    public final void setDataAfterLoadMore(List<Aweme> list) {
        if (TextUtils.equals(this.LJLJI, "challenge")) {
            this.mmItems = list;
            Objects.requireNonNull(list);
            List<Integer> LL = LL(list);
            super.setDataAfterLoadMore(list);
            ArrayList arrayList = (ArrayList) LL;
            if (arrayList.size() > 0) {
                notifyItemRangeInserted(0, arrayList.size());
                return;
            }
            return;
        }
        super.setDataAfterLoadMore(list);
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<T> list = this.mmItems;
        if ((viewHolder instanceof AbstractC208678Gx) && list != 0) {
            ((AbstractC208678Gx) viewHolder).X((Aweme) ListProtector.get(list, i), i, this.LJLJL, this.LJLJLJ);
        }
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        AbstractC208678Gx onCreateDetailAwemeViewHolder;
        MGV mgv = this.LJLJJLL;
        if (mgv instanceof AbstractC225718tT) {
            onCreateDetailAwemeViewHolder = ((AbstractC225718tT) mgv).onCreateDetailAwemeViewHolder(viewGroup, i, this.LJLJI, this.LJLJJI);
        } else {
            onCreateDetailAwemeViewHolder = this.LJLJJLL.onCreateDetailAwemeViewHolder(C28289B8j.LIZ(viewGroup, R.layout.ako, viewGroup, false), this.LJLJI, this.LJLJJI);
        }
        if (onCreateDetailAwemeViewHolder != null && onCreateDetailAwemeViewHolder.itemView.getParent() != null) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DetailAwemeAdapter", onCreateDetailAwemeViewHolder.getClass() + " itemView already attached !!");
        }
        return onCreateDetailAwemeViewHolder;
    }

    public C56492MFc(String str, MH9 mh9, JWG<AbstractC208618Gr> jwg, MGV mgv, Bundle bundle) {
        this.LJLJI = str;
        this.LJLJJI = mh9;
        this.LJLJJL = jwg;
        this.LJLJJLL = mgv;
        this.LJLJLJ = bundle;
        setLoadErrorText((CharSequence) null);
    }
}
