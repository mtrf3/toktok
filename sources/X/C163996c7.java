package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6c7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163996c7 extends RecyclerView.ViewHolder {
    public final InterfaceC163906by LJLIL;
    public final C164106cI LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final FrameLayout LJLJJL;
    public final ImageView LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163996c7(View view, InterfaceC163906by listener) {
        super(view);
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLILLLLZI = (C164106cI) view.findViewById(R.id.k9p);
        this.LJLJI = (TextView) view.findViewById(R.id.k9q);
        this.LJLJJI = (TextView) view.findViewById(R.id.gfg);
        this.LJLJJL = (FrameLayout) view.findViewById(R.id.k9o);
        this.LJLJJLL = (ImageView) view.findViewById(R.id.nj4);
    }
}
