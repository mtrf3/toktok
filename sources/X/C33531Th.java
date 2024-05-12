package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1Th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33531Th extends RecyclerView.ViewHolder {
    public final C47061t0 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final View LJLJI;
    public final ImageView LJLJJI;

    public C33531Th(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.ejm);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.img_music)");
        this.LJLIL = (C47061t0) findViewById;
        View findViewById2 = view.findViewById(R.id.gw4);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name_music)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.f_t);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_select)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.f6j);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.iv_loading_spinner)");
        this.LJLJJI = (ImageView) findViewById4;
    }
}
