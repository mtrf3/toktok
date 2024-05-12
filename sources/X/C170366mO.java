package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170366mO extends AbstractC42166Ggk {
    public final /* synthetic */ AbstractC170376mP LJLJJI;

    @Override // X.AbstractC42166Ggk
    public final void LJZ(RecyclerView.ViewHolder holder) {
        C170496mb c170496mb;
        TextView textView;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof C170496mb) && (c170496mb = (C170496mb) holder) != null && (textView = c170496mb.LJLIL) != null) {
            AbstractC170376mP abstractC170376mP = this.LJLJJI;
            if (abstractC170376mP.LIZIZ().LJIIIZ || !abstractC170376mP.LIZIZ().LJIIIIZZ || (!C164996dj.LIZLLL(abstractC170376mP.LJLIL) && !abstractC170376mP.LJII())) {
                textView.setVisibility(8);
            } else {
                textView.setText(abstractC170376mP.LIZLLL());
            }
        }
    }

    @Override // X.AbstractC42166Ggk
    public final RecyclerView.ViewHolder LJZI(ViewGroup viewGroup) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.arj, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        return new C170496mb(itemView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170366mO(AbstractC170376mP abstractC170376mP, C8HS c8hs) {
        super(c8hs);
        this.LJLJJI = abstractC170376mP;
    }
}
