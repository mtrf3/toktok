package X;

import Y.ARunnableS18S0201000_15;
import Y.IDrS15S0200000_15;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editor.audioservice.businessui.speechtosong.base.CenterSelectionLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YAB extends FrameLayout {
    public final RecyclerView LJLIL;
    public final TextView LJLILLLLZI;
    public final SGF LJLJI;
    public YAE LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public List<SGH> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YAB(Context context) {
        super(context, null, 0);
        AbstractC28931Bp abstractC28931Bp;
        new LinkedHashMap();
        this.LJLJJL = -1;
        this.LJLJJLL = -1;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.hy, this, true);
        View findViewById = findViewById(R.id.klx);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.sts_rv)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLIL = recyclerView;
        View findViewById2 = findViewById(R.id.klv);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.sts_indicator_background)");
        this.LJLILLLLZI = (TextView) findViewById2;
        AbstractC030109x itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LIZJ = 0L;
            itemAnimator.LJFF = 0L;
            itemAnimator.LJ = 0L;
            itemAnimator.LIZLLL = 0L;
        }
        AbstractC030109x itemAnimator2 = recyclerView.getItemAnimator();
        if ((itemAnimator2 instanceof AbstractC28931Bp) && (abstractC28931Bp = (AbstractC28931Bp) itemAnimator2) != null) {
            abstractC28931Bp.LJI = false;
        }
        recyclerView.setLayoutManager(new CenterSelectionLayoutManager());
        SGF sgf = new SGF();
        this.LJLJI = sgf;
        recyclerView.setAdapter(sgf);
        final int LJIILL = C17N.LJIILL(16.0d);
        recyclerView.LJII(new AbstractC030309z(LJIILL) { // from class: X.4JR
            public final int LJLIL = 0;
            public final int LJLILLLLZI = 0;
            public final int LJLJI;

            {
                this.LJLJI = LJIILL;
            }

            public static int LJII(View view, RecyclerView recyclerView2) {
                int measuredWidth;
                if (recyclerView2.getWidth() != 0) {
                    measuredWidth = recyclerView2.getWidth();
                } else {
                    measuredWidth = recyclerView2.getMeasuredWidth();
                }
                view.measure(0, 0);
                return (measuredWidth / 2) - (view.getMeasuredWidth() / 2);
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                int i;
                int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state", view);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                AbstractC029409q adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    i = adapter.getItemCount();
                } else {
                    i = 0;
                }
                if (LIZJ == 0) {
                    int LJII = LJII(view, recyclerView2);
                    if (C90193gN.LIZ()) {
                        marginLayoutParams.setMargins(this.LJLJI, 0, this.LJLIL + LJII, 0);
                    } else {
                        marginLayoutParams.setMargins(this.LJLIL + LJII, 0, this.LJLJI, 0);
                    }
                } else if (LIZJ == i - 1) {
                    int LJII2 = LJII(view, recyclerView2);
                    if (C90193gN.LIZ()) {
                        marginLayoutParams.setMargins(this.LJLILLLLZI + LJII2, 0, this.LJLJI, 0);
                    } else {
                        marginLayoutParams.setMargins(this.LJLJI, 0, this.LJLILLLLZI + LJII2, 0);
                    }
                } else {
                    view.measure(0, 0);
                    int i2 = this.LJLJI;
                    marginLayoutParams.setMargins(i2, 0, i2, 0);
                }
                view.setLayoutParams(marginLayoutParams);
                super.LJ(rect, view, recyclerView2, c0ac);
            }
        }, -1);
        C80107VcF c80107VcF = new C80107VcF();
        c80107VcF.LIZIZ(recyclerView);
        recyclerView.LJIIJJI(new IDrS15S0200000_15(c80107VcF, this, 1));
        sgf.LJLIL = new YAD(this);
    }

    public final void setCenterSelectListener(YAE yae) {
        this.LJLJJI = yae;
    }

    public final void setSelectionSilent(int i) {
        YAE yae = this.LJLJJI;
        this.LJLJJI = null;
        this.LJLIL.post(new ARunnableS18S0201000_15(i, this, yae, 3));
    }
}
