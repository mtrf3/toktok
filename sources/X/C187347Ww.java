package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ww, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187347Ww extends RecyclerView.ViewHolder {
    public final C72434Sbm LJLIL;
    public final C71888SJg LJLILLLLZI;
    public final View LJLJI;
    public final ImageView LJLJJI;
    public final View LJLJJL;

    public C187347Ww(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.gy6);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.navi_profile_share_avatar)");
        this.LJLIL = (C72434Sbm) findViewById;
        View findViewById2 = view.findViewById(R.id.g_y);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.lottie_animation_view)");
        this.LJLILLLLZI = (C71888SJg) findViewById2;
        View findViewById3 = view.findViewById(R.id.gxa);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.n…itable_profile_container)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.gy7);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.navi_profile_share_edit)");
        ImageView imageView = (ImageView) findViewById4;
        this.LJLJJI = imageView;
        View findViewById5 = view.findViewById(R.id.gy5);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.navi_profile_avatar)");
        this.LJLJJL = findViewById5;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_pen;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        SY9 LIZJ = C025908h.LIZJ(view, "view.context", c2068389v);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dw);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
        c110614Vt.LIZJ = C61328O5c.LIZJ(50);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        imageView.setImageDrawable(C26338AVi.LJIIJ(LIZJ, c110614Vt.LIZ(context)));
    }
}
