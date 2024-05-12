package X;

import Y.ACListenerS42S0200000_7;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* renamed from: X.I5m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46050I5m extends RecyclerView.ViewHolder {
    public final W5G LJLIL;
    public VideoSegment LJLILLLLZI;
    public final RelativeLayout LJLJI;
    public final TextView LJLJJI;
    public final /* synthetic */ C46048I5k LJLJJL;

    public void M(C46050I5m c46050I5m) {
        C16880lQ.LJIIJ(new ACListenerS42S0200000_7(this, c46050I5m, 15), this.itemView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46050I5m(C46048I5k c46048I5k, ViewGroup viewGroup) {
        super(C28289B8j.LIZ(viewGroup, R.layout.bep, viewGroup, false));
        this.LJLJJL = c46048I5k;
        W5G w5g = (W5G) this.itemView.findViewById(R.id.n4v);
        this.LJLIL = w5g;
        this.LJLJI = (RelativeLayout) this.itemView.findViewById(R.id.j83);
        w5g.setOutlineProvider(new C46055I5r());
        w5g.setClipToOutline(true);
        this.LJLJJI = (TextView) this.itemView.findViewById(R.id.jks);
    }

    public final void L(C46059I5v c46059I5v, C46050I5m c46050I5m) {
        String str;
        VideoSegment videoSegment = c46059I5v.LIZIZ;
        this.LJLILLLLZI = videoSegment;
        if (TextUtils.isEmpty(videoSegment.thumbnail)) {
            str = c46059I5v.LIZIZ.LJII(false);
        } else {
            str = c46059I5v.LIZIZ.thumbnail;
        }
        C162366Yu.LIZ(c46050I5m.LJLIL, str, C78127UlP.LIZJ(637534207, 637534207, 0, 0), SFS.LJI(48.0d), this.LJLJJL.LJLJL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLLZI(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) (c46059I5v.LIZIZ.LJ() - c46059I5v.LIZIZ.LJIIIZ())) / (c46059I5v.LIZIZ.LJIIIIZZ() * 1000.0f))}));
        LIZ.append("s");
        c46050I5m.LJLJJI.setText(X1D.LIZIZ(LIZ));
        c46050I5m.LJLJJI.setShadowLayer(6.0f, 0.0f, 4.0f, this.itemView.getContext().getResources().getColor(R.color.b6));
        M(c46050I5m);
    }
}
