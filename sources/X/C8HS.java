package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.8HS, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8HS<T> extends MK7 {
    public static final C8HU Companion = new Object() { // from class: X.8HU
    };
    public static final String TAG = C16880lQ.LJLLJ(C8HS.class);
    public List<T> mmItems;
    public int mmPreviousCount;

    public C8HS() {
        this(false, 1, null);
    }

    public void clearData() {
        List<T> list = this.mmItems;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    @Override // X.C4II
    public int getBasicItemCount() {
        List<T> list = this.mmItems;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List<T> getData() {
        return this.mmItems;
    }

    public C8HS(boolean z) {
        if (z) {
            setHasStableIds(true);
        }
        registerAdapterDataObserver(new AbstractC029609s(this) { // from class: X.8HT
            public final /* synthetic */ C8HS<T> LJLIL;

            @Override // X.AbstractC029609s
            public final void LIZJ() {
                C8HS<T> c8hs = this.LJLIL;
                c8hs.mmPreviousCount = c8hs.getItemCount();
            }

            {
                this.LJLIL = this;
            }

            @Override // X.AbstractC029609s
            public final void LIZLLL(int i, int i2) {
                C8HS<T> c8hs = this.LJLIL;
                c8hs.mmPreviousCount = c8hs.getItemCount();
            }

            @Override // X.AbstractC029609s
            public final void LJFF(int i, int i2) {
                C8HS<T> c8hs = this.LJLIL;
                c8hs.mmPreviousCount = c8hs.getItemCount();
            }

            @Override // X.AbstractC029609s
            public final void LJI(int i, int i2) {
                C8HS<T> c8hs = this.LJLIL;
                c8hs.mmPreviousCount = c8hs.getItemCount();
            }

            @Override // X.AbstractC029609s
            public final void LJII(int i, int i2) {
                C8HS<T> c8hs = this.LJLIL;
                c8hs.mmPreviousCount = c8hs.getItemCount();
            }
        });
    }

    public void addData(List<? extends T> list) {
        if (C79004UzY.LJJIFFI(list)) {
            return;
        }
        List<T> list2 = this.mmItems;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        this.mmItems = list2;
        if (list != null) {
            list2.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Override // X.C4II
    public void onShowFooterChanged(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.mmPreviousCount = getItemCount();
    }

    public void setData(List<T> list) {
        this.mmItems = list;
        notifyDataSetChanged();
    }

    public final void setDataAfterLoadLatest(List<T> list) {
        this.mmItems = list;
        notifyItemRangeInserted(0, getItemCount() - this.mmPreviousCount);
    }

    public void setDataAfterLoadMore(List<T> list) {
        this.mmItems = list;
        if (this.mShowFooter) {
            notifyItemRangeInserted(this.mmPreviousCount - 1, getItemCount() - this.mmPreviousCount);
            notifyItemChanged(getItemCount() - 1);
        } else {
            notifyItemRangeInserted(this.mmPreviousCount, getItemCount() - this.mmPreviousCount);
        }
    }

    public void insertData(T t, int i) {
        List<T> list = this.mmItems;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mmItems = list;
        ListProtector.add(list, i, t);
        notifyItemInserted(i);
    }

    public /* synthetic */ C8HS(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
