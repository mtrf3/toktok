package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42172Ggq extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C42175Ggt LJLJJLL;
    public final /* synthetic */ W5G LJLJL;
    public final /* synthetic */ RecyclerView.ViewHolder LJLJLJ;

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        GSG gsg = this.LJLJJLL.LJLJI;
        if (gsg != null) {
            W5G imageView = this.LJLJL;
            o.LJIIIIZZ(imageView, "imageView");
            gsg.LIZ(this.LJLJLJ.getLayoutPosition(), imageView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42172Ggq(C42175Ggt c42175Ggt, W5G w5g, RecyclerView.ViewHolder viewHolder) {
        super(600, 2);
        this.LJLJJLL = c42175Ggt;
        this.LJLJL = w5g;
        this.LJLJLJ = viewHolder;
    }
}
