package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.69V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C69V extends RecyclerView.ViewHolder {
    public final C6DT LJLIL;
    public final ImageView LJLILLLLZI;
    public final C29701Eo LJLJI;

    public C69V(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.ks0);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.….subtitle_item_edit_text)");
        C6DT c6dt = (C6DT) findViewById;
        this.LJLIL = c6dt;
        View findViewById2 = view.findViewById(R.id.ks1);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.subtitle_item_play)");
        this.LJLILLLLZI = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.gaa);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.lottie_wave_view)");
        this.LJLJI = (C29701Eo) findViewById3;
        c6dt.setTypeface(C8HI.LIZJ().LIZLLL("medium"));
    }
}
