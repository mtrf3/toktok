package X;

import Y.ACListenerS32S0100000_12;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S3v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71487S3v extends RecyclerView.ViewHolder {
    public final InterfaceC88471Ynr<View, Integer, C76800UCe> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final ConstraintLayout LJLJJLL;
    public final SmartImageView LJLJL;
    public final TuxTextView LJLJLJ;
    public final View LJLJLLL;
    public final /* synthetic */ C71486S3u LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71487S3v(C71486S3u c71486S3u, View view, InterfaceC88471Ynr<? super View, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        super(view);
        this.LJLL = c71486S3u;
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = C7MY.LIZIZ(52);
        this.LJLJI = C7MY.LIZIZ(160);
        this.LJLJJI = C7MY.LIZIZ(36);
        this.LJLJJL = Integer.MAX_VALUE;
        View findViewById = view.findViewById(R.id.heh);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.outer_container)");
        this.LJLJJLL = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.egd);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.image)");
        this.LJLJL = (SmartImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.title)");
        this.LJLJLJ = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.jm_);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.selected)");
        this.LJLJLLL = findViewById4;
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 181), view);
    }
}
