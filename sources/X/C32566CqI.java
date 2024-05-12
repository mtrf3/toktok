package X;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS43S0001000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CqI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32566CqI extends RecyclerView.ViewHolder {
    public final LiveIconView LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C41081jM LJLJI;
    public final View LJLJJI;

    public C32566CqI(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.kz_);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tab_text)");
        C47121t6 c47121t6 = (C47121t6) findViewById;
        this.LJLILLLLZI = c47121t6;
        c47121t6.setAlpha(0.9f);
        c47121t6.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
        View findViewById2 = view.findViewById(R.id.dv5);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.gift_sort_icon)");
        this.LJLIL = (LiveIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.kyl);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tab_image)");
        this.LJLJI = (C41081jM) findViewById3;
        View findViewById4 = view.findViewById(R.id.kz4);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tab_red_dot)");
        this.LJLJJI = findViewById4;
    }

    public final void L(C32570CqM item) {
        o.LJIIIZ(item, "item");
        if (!TextUtils.isEmpty(item.LIZ)) {
            C29306Beo.LJI(this.LJLJI);
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            this.LJLILLLLZI.setText(item.LIZ);
        } else if (item.LIZIZ != 0) {
            C29306Beo.LJJLJLI(this.LJLJI);
            C29306Beo.LJI(this.LJLILLLLZI);
            this.LJLJI.setImageResource(item.LIZIZ);
        }
        if (item.LJ) {
            C29306Beo.LJJLJLI(this.LJLJJI);
            C29813Bmz c29813Bmz = C29813Bmz.LIZ;
            int i = item.LIZJ;
            c29813Bmz.getClass();
            C70657RoD.LJJI(0.1d, new AqS43S0001000_5(i, 0));
        } else {
            C29306Beo.LJI(this.LJLJJI);
        }
        if (item.LJFF != 0) {
            C29306Beo.LJJLJLI(this.LJLIL);
            this.LJLIL.setImageResource(item.LJFF);
        } else {
            C29306Beo.LJI(this.LJLIL);
        }
    }
}
