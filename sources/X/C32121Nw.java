package X;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1Nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32121Nw extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final ConstraintLayout LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public final C47121t6 LJLJJL;
    public final View LJLJJLL;
    public final View LJLJL;
    public final ConstraintLayout LJLJLJ;

    public C32121Nw(View view) {
        super(view);
        ImageView imageView = (ImageView) view.findViewById(R.id.f51);
        o.LJIIIIZZ(imageView, "itemView.iv_icon");
        this.LJLIL = imageView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.eam);
        o.LJIIIIZZ(constraintLayout, "itemView.icon_area");
        this.LJLILLLLZI = constraintLayout;
        View findViewById = view.findViewById(R.id.f24);
        o.LJIIIIZZ(findViewById, "itemView.iv_download_icon");
        this.LJLJI = findViewById;
        View findViewById2 = view.findViewById(R.id.g7r);
        o.LJIIIIZZ(findViewById2, "itemView.loading");
        this.LJLJJI = findViewById2;
        C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.mqg);
        o.LJIIIIZZ(c47121t6, "itemView.tv_voice_effect_title");
        this.LJLJJL = c47121t6;
        View findViewById3 = view.findViewById(R.id.f6p);
        o.LJIIIIZZ(findViewById3, "itemView.iv_long_press_mantel");
        this.LJLJJLL = findViewById3;
        View findViewById4 = view.findViewById(R.id.ajl);
        o.LJIIIIZZ(findViewById4, "itemView.bg_select");
        this.LJLJL = findViewById4;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.eur);
        o.LJIIIIZZ(constraintLayout2, "itemView.item_root");
        this.LJLJLJ = constraintLayout2;
    }
}
