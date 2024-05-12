package X;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UFR extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final View LJLILLLLZI;
    public final LiveIconView LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final LiveIconView LJLJJLL;
    public final LiveIconView LJLJL;
    public final ConstraintLayout LJLJLJ;

    public UFR(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.hej);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.outer_view)");
        this.LJLJLJ = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.krf);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.…spotlight_selected_image)");
        this.LJLIL = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.egn);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.image_and_text)");
        this.LJLILLLLZI = findViewById3;
        View findViewById4 = view.findViewById(R.id.egd);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.image)");
        this.LJLJI = (LiveIconView) findViewById4;
        View findViewById5 = view.findViewById(R.id.text);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.text)");
        this.LJLJJI = (C47121t6) findViewById5;
        View findViewById6 = view.findViewById(R.id.kr7);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…cription_spotlight_cover)");
        this.LJLJJL = (C47121t6) findViewById6;
        View findViewById7 = view.findViewById(R.id.ht5);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.plus)");
        this.LJLJJLL = (LiveIconView) findViewById7;
        View findViewById8 = view.findViewById(R.id.or);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.action_sheet_icon)");
        this.LJLJL = (LiveIconView) findViewById8;
    }
}
