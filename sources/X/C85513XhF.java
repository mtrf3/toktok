package X;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XhF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85513XhF extends RecyclerView.ViewHolder {
    public final EditText LJLIL;
    public final View LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final C29701Eo LJLJJI;
    public final ImageView LJLJJL;

    public C85513XhF(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cps);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.edit_text)");
        this.LJLIL = (EditText) findViewById;
        View findViewById2 = view.findViewById(R.id.ca5);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.disable_button)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = view.findViewById(R.id.evj);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.item_view)");
        this.LJLJI = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.gaa);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.lottie_wave_view)");
        this.LJLJJI = (C29701Eo) findViewById4;
        View findViewById5 = view.findViewById(R.id.lk6);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.translation_play_icon)");
        this.LJLJJL = (ImageView) findViewById5;
    }
}
