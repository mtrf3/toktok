package X;

import Y.IDrS47S0100000_8;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Jf7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC49709Jf7 extends AbstractC51687KQh {
    public static int LJLJLLL;
    public final InterfaceC48970JJu LJLIL;
    public final InterfaceC56526MGk LJLILLLLZI;
    public int LJLJI;
    public KUR LJLJJI;
    public RecyclerView LJLJJL;
    public JVQ LJLJJLL;
    public C73210SoI LJLJL;
    public boolean LJLJLJ;

    public abstract JVQ LJIIIZ();

    public abstract AbstractC030309z LJIIJJI();

    @Override // X.AbstractC51687KQh
    public final boolean isRegisterEventBus() {
        return true;
    }

    public abstract C0A2 mO();

    @QD3
    public void onVideoEvent(C50420Jqa c50420Jqa) {
        int LJZ;
        Aweme aweme;
        if (!isViewValid()) {
            return;
        }
        int i = c50420Jqa.LJLIL;
        if (i != 2) {
            if (i != 13) {
                if (i != 22) {
                    if (i != 66 || !getUserVisibleHint() || c50420Jqa.LJLJLJ == -1 || (aweme = (Aweme) c50420Jqa.LJLILLLLZI) == null) {
                        return;
                    }
                    if (C50989Jzl.LJI(getContext())) {
                        JGJ.LIZ(aweme);
                    }
                    LJIIL(c50420Jqa, this.LJLJJLL.LJZ(aweme.getAid()), aweme, c50420Jqa.LJLJJLL);
                    return;
                }
                this.LJLJJLL.notifyDataSetChanged();
                if (this.LJLJJLL.getItemCount() != 0) {
                    return;
                }
                this.LJLJJI.setVisibility(0);
                this.LJLJJI.LJII();
                this.LJLJJLL.showLoadMoreEmpty();
                return;
            }
            int childCount = this.LJLJJL.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder LJJJJJL = this.LJLJJL.LJJJJJL(this.LJLJJL.getChildAt(i2));
                if (LJJJJJL.getItemViewType() == 0) {
                    ((JOO) LJJJJJL).g0();
                }
            }
            return;
        }
        String str = (String) c50420Jqa.LJLILLLLZI;
        if (TextUtils.isEmpty(str) || (LJZ = this.LJLJJLL.LJZ(str)) < 0 || C79004UzY.LJJIFFI(this.LJLJJLL.mmItems)) {
            return;
        }
        JVQ jvq = this.LJLJJLL;
        if (jvq.LJLIL != null) {
            ListProtector.remove(jvq.mmItems, LJZ - 1);
        } else {
            ListProtector.remove(jvq.mmItems, LJZ);
        }
        this.LJLJJLL.notifyItemRemoved(LJZ);
        if (this.LJLJJLL.getItemCount() != 0) {
            return;
        }
        this.LJLJJI.setVisibility(0);
        this.LJLJJI.LJII();
        this.LJLJJLL.showLoadMoreEmpty();
    }

    public AbstractC49709Jf7(InterfaceC48970JJu interfaceC48970JJu, InterfaceC56526MGk interfaceC56526MGk) {
        this.LJLIL = interfaceC48970JJu;
        this.LJLILLLLZI = interfaceC56526MGk;
    }

    @Override // X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public void onViewCreated(View view, Bundle bundle) {
        this.LJLJJI = (KUR) view.findViewById(R.id.kf_);
        this.LJLJJL = (RecyclerView) view.findViewById(R.id.fuc);
        super.onViewCreated(view, bundle);
        this.LJLJJL.setLayoutManager(mO());
        this.LJLJJL.LJII(LJIIJJI(), -1);
        this.LJLJJL.setItemAnimator(new C40171ht());
        JVQ LJIIIZ = LJIIIZ();
        this.LJLJJLL = LJIIIZ;
        C73210SoI c73210SoI = new C73210SoI(LJIIIZ);
        this.LJLJL = c73210SoI;
        this.LJLJJL.setAdapter(c73210SoI);
        if (!C16880lQ.LLLZLL()) {
            this.LJLJJL.LJIIJJI(new C56490MFa());
        }
        RecyclerView recyclerView = this.LJLJJL;
        MGW.LIZ(recyclerView, this.LJLILLLLZI, 2, false);
        this.LJLJJL = recyclerView;
        recyclerView.LJIIJJI(new IDrS47S0100000_8(this, 15));
    }

    public void LJIIL(C50420Jqa c50420Jqa, int i, Aweme aweme, long j) {
        RecyclerView recyclerView;
        if (LJLJLLL == 0) {
            LJLJLLL = getContext().getResources().getDimensionPixelOffset(R.dimen.w4);
        }
        if (i != -1 && (this.LJLJJL.getLayoutManager() instanceof InterfaceC185877Rf)) {
            if (this.LJLJJL.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.LJLJJL.getLayoutManager();
                if (this.LJLJI == 0 && (recyclerView = this.LJLJJL) != null) {
                    this.LJLJI = recyclerView.getHeight();
                }
                int LJIILL = (this.LJLJI - C17N.LJIILL(200.0d)) / 2;
                StaggeredGridLayoutManager.SavedState savedState = staggeredGridLayoutManager.LLIIIJ;
                if (savedState != null) {
                    savedState.LJLJJI = null;
                    savedState.LJLJI = 0;
                    savedState.LJLIL = -1;
                    savedState.LJLILLLLZI = -1;
                }
                staggeredGridLayoutManager.LLFZ = i;
                staggeredGridLayoutManager.LLI = LJIILL;
                staggeredGridLayoutManager.LJZ();
            } else if (this.LJLJJL.getLayoutManager() instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) this.LJLJJL.getLayoutManager();
                int LLILL = gridLayoutManager.LLILL();
                int LLILLJJLI = gridLayoutManager.LLILLJJLI();
                int i2 = gridLayoutManager.LLIIIL;
                if (((Number) C33965DUr.LIZ.getValue()).intValue() == 1 && i2 > 1) {
                    if (i >= LLILL && i <= (LLILL + i2) - 1) {
                        return;
                    }
                } else if (i >= LLILL && i <= LLILLJJLI) {
                    return;
                }
                ((InterfaceC185877Rf) this.LJLJJL.getLayoutManager()).LJFF(i, 0);
            }
            this.LJLJLJ = true;
        }
    }
}
