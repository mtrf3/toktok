package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.B9q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28322B9q extends RecyclerView.ViewHolder {
    public final C47061t0 LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final LiveIconView LJLJI;

    public C28322B9q(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.dd8);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.fl_container)");
        this.LJLILLLLZI = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.eye);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_avatar)");
        this.LJLIL = (C47061t0) findViewById2;
        View findViewById3 = view.findViewById(R.id.ac8);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.avatar_icon)");
        this.LJLJI = (LiveIconView) findViewById3;
    }
}
