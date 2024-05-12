package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WlW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83230WlW extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLL = 0;
    public final TBK LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final View LJLJI;
    public AqS196S0100000_14 LJLJJI;
    public C83271WmB LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C83222WlO LJLJLJ;
    public final C83221WlN LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83230WlW(View view, C83222WlO adapter, C83221WlN c83221WlN) {
        super(view);
        o.LJIIIZ(adapter, "adapter");
        this.LJLJLJ = adapter;
        this.LJLJLLL = c83221WlN;
        this.LJLIL = (TBK) view.findViewById(R.id.jb2);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS161S0200000_14(this, view, 82));
        this.LJLJI = view.findViewById(R.id.dce);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS161S0200000_14(this, view, 81));
        this.LJLJL = C221108m2.LIZIZ(new AqS161S0200000_14(this, view, 80));
    }
}
