package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JJH extends RecyclerView.ViewHolder {
    public static final float LJLJLJ = C78847Ux1.LJJIFFI(3);
    public final InterfaceC88473Ynt<View, Integer, Aweme, C76800UCe> LJLIL;
    public final View LJLILLLLZI;
    public final C164086cG LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final View LJLJJLL;
    public final boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JJH(View itemView, IDqS433S0100000_8 iDqS433S0100000_8) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = iDqS433S0100000_8;
        this.LJLILLLLZI = itemView;
        C164086cG c164086cG = (C164086cG) itemView.findViewById(R.id.cover);
        o.LJIIIIZZ(c164086cG, "itemView.cover");
        this.LJLJI = c164086cG;
        TuxTextView tuxTextView = (TuxTextView) itemView.findViewById(R.id.fr4);
        o.LJIIIIZZ(tuxTextView, "itemView.like_count");
        this.LJLJJI = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) itemView.findViewById(R.id.gzm);
        o.LJIIIIZZ(tuxTextView2, "itemView.new_label");
        this.LJLJJL = tuxTextView2;
        View findViewById = itemView.findViewById(R.id.n6r);
        o.LJIIIIZZ(findViewById, "itemView.video_mask");
        this.LJLJJLL = findViewById;
        this.LJLJL = C90193gN.LIZIZ(itemView.getContext());
    }
}
