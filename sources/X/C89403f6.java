package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89403f6 extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C113914dX LJLIL;
    public final TuxIconView LJLILLLLZI;
    public Fragment LJLJI;
    public InterfaceC89383f4 LJLJJI;

    public C89403f6(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.jsw);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.share_channel_bar)");
        this.LJLIL = (C113914dX) findViewById;
        View findViewById2 = view.findViewById(R.id.bfj);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.close_button)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
    }
}
