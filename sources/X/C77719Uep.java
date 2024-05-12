package X;

import Y.IDrS51S0100000_13;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uep, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77719Uep extends PagerAdapter {
    public final InterfaceC77671Ue3 LJLILLLLZI;
    public final RechargeViewModel LJLJI;
    public List<? extends Diamond> LJLJJI;
    public final HashMap<String, Integer> LJLJJL;
    public final SparseArray<Long> LJLJJLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object object) {
        o.LJIIIZ(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 1;
    }

    public final void LJJIII(List list) {
        this.LJLJJI = list;
        this.LJLJJL.clear();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Diamond diamond = (Diamond) it.next();
            int i2 = diamond.LJLIL;
            if (i2 == 0 || i2 == 2) {
                HashMap<String, Integer> hashMap = this.LJLJJL;
                String str = diamond.iapId;
                if (str == null) {
                    str = "";
                }
                StringBuilder LJFF = C72972SkS.LJFF(str, '$');
                LJFF.append(diamond.LJLIL);
                hashMap.put(X1D.LIZIZ(LJFF), Integer.valueOf(i));
                i++;
            }
        }
    }

    public C77719Uep(C77580Uca mOnClickDeal, RechargeViewModel viewModel) {
        o.LJIIIZ(mOnClickDeal, "mOnClickDeal");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLILLLLZI = mOnClickDeal;
        this.LJLJI = viewModel;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new HashMap<>();
        this.LJLJJLL = new SparseArray<>(32);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(container.getContext()), R.layout.di4, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) LLLLIILL;
        recyclerView.setOverScrollMode(2);
        container.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager() { // from class: com.bytedance.android.live.wallet.dialog.RechargePagerAdapter$instantiateItem$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIJJLI() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIL() {
                return true;
            }
        };
        recyclerView.setLayoutManager(gridLayoutManager);
        C77596Ucq c77596Ucq = new C77596Ucq(this.LJLJJI, this.LJLILLLLZI, this.LJLJI);
        recyclerView.setAdapter(c77596Ucq);
        gridLayoutManager.LLIILII = new C77720Ueq(c77596Ucq);
        recyclerView.LJIIJJI(new IDrS51S0100000_13(this, 0));
        container.addView(LLLLIILL);
        return LLLLIILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object object) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(object, "object");
        return o.LJ(view, object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object object) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(object, "object");
        C16880lQ.LJLLL((View) object, container);
    }
}
