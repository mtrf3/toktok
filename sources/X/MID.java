package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.adapter.TrendingTopicViewHolder;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MID extends JZQ implements InterfaceC208608Gq, MH9 {
    public final InterfaceC208608Gq LJLJI;
    public TrendingTopicViewHolder LJLJJI;
    public TrendingTopic LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public final String LJLL;

    @Override // X.MH9
    public final /* synthetic */ void Q7(TuxTextView tuxTextView, Aweme aweme) {
    }

    @Override // X.MH9
    public final /* synthetic */ void bl(int i, View view, Aweme aweme, String str) {
    }

    @Override // X.MH9
    public final /* synthetic */ void l2(Boolean bool) {
    }

    @Override // X.MK7, X.C4II
    public final void onBindFooterViewHolder(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
    }

    @Override // X.MH9
    public final /* synthetic */ void p4(Boolean bool) {
    }

    @Override // X.MH9
    public final /* synthetic */ void yb(View view, Aweme aweme, String str) {
    }

    @Override // X.InterfaceC208608Gq
    public final void zj() {
        this.LJLJI.zj();
    }

    public MID(InterfaceC208608Gq coverViewHolderListener) {
        o.LJIIIZ(coverViewHolderListener, "coverViewHolderListener");
        this.LJLJI = coverViewHolderListener;
        this.LJLJLJ = true;
        this.LJLJLLL = -1;
        this.LJLL = "discovery";
    }

    @Override // X.AbstractC51777KTt
    public final RecyclerView.ViewHolder LJLZ(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.an3, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C208558Gl(this, view, this);
    }

    @Override // X.MK7, X.C4II
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (AV1.LJIIJJI()) {
            View view = new View(parent.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams((int) KL2.LIZJ(parent.getContext(), 14.0f), -1));
            return new MIE(view, null);
        }
        View view2 = C28289B8j.LIZ(parent, R.layout.an5, parent, false);
        o.LJIIIIZZ(view2, "view");
        return new MIE(view2, this.LJLJJI);
    }

    @Override // X.AbstractC51777KTt
    public final void LJLLLLLL(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        C208558Gl c208558Gl = (C208558Gl) holder;
        if (!o.LJ(c208558Gl.LJLJLJ, this)) {
            c208558Gl.LJLJLJ = this;
        }
        Aweme aweme = (Aweme) ListProtector.get(this.mmItems, i);
        if (aweme != null) {
            c208558Gl.bind(aweme, i);
            c208558Gl.LJLIL = aweme;
            c208558Gl.X();
            View view = c208558Gl.LJLLI;
            int i2 = c208558Gl.LJLL;
            int i3 = c208558Gl.LJLJLLL;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width != i2 || marginLayoutParams.height != i3) {
                marginLayoutParams.width = i2;
                marginLayoutParams.height = i3;
                view.setLayoutParams(marginLayoutParams);
            }
            c208558Gl.LLZLLLL();
            if (C220858ld.LJIIIIZZ(aweme)) {
                c208558Gl.LJLLILLLL.setVisibility(0);
            } else {
                c208558Gl.LJLLILLLL.setVisibility(8);
            }
        }
        c208558Gl.LJLJJI = this.LJLJLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    @Override // X.MH9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZ(android.view.View r25, com.ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MID.LLLILZ(android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }
}
