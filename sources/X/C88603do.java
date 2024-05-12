package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.3do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88603do extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final Context LJLILLLLZI;
    public final View.OnClickListener LJLJI;
    public final boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88603do(View view, Context context, View.OnClickListener clickListener, boolean z) {
        super(view);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLIL = view;
        this.LJLILLLLZI = context;
        this.LJLJI = clickListener;
        this.LJLJJI = z;
    }
}
