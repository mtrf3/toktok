package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1Tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33571Tl extends RecyclerView.ViewHolder {
    public final boolean LJLIL;
    public final C116414hZ LJLILLLLZI;

    public final void L(boolean z) {
        if (z) {
            C29306Beo.LJJLJLI(this.itemView);
            C29306Beo.LJJJJLI(C15380j0.LIZ(48.0f), this.itemView);
            C29306Beo.LJJLJLI(this.LJLILLLLZI);
            return;
        }
        C29306Beo.LJI(this.itemView);
        C29306Beo.LJJJJLI(0, this.itemView);
        C29306Beo.LJIIIZ(this.LJLILLLLZI);
    }

    public C33571Tl(View view, boolean z) {
        super(view);
        this.LJLIL = z;
        this.LJLILLLLZI = (C116414hZ) view.findViewById(R.id.g94);
    }
}
