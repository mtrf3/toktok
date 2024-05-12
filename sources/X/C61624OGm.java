package X;

import Y.ACListenerS28S0101000_10;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OGm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61624OGm extends RecyclerView.ViewHolder {
    public final int LJLIL;
    public int LJLILLLLZI;
    public final int[] LJLJI;
    public final SmartImageView LJLJJI;
    public Banner LJLJJL;

    public C61624OGm(View view, int i) {
        super(view);
        int[] iArr = new int[2];
        this.LJLJI = iArr;
        this.LJLIL = i;
        ViewOnAttachStateChangeListenerC61625OGn viewOnAttachStateChangeListenerC61625OGn = new ViewOnAttachStateChangeListenerC61625OGn(this);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC61625OGn);
        if (C16330kX.LIZIZ(view)) {
            viewOnAttachStateChangeListenerC61625OGn.run();
        }
        this.LJLJJI = (SmartImageView) view.findViewById(R.id.jd5);
        View findViewById = view.findViewById(R.id.jd5);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS28S0101000_10(0, this, 7), findViewById);
        }
        int LJIIJJI = KL2.LJIIJJI(view.getContext()) - ((int) (KL2.LIZJ(view.getContext(), 16.0f) * 2.0f));
        iArr[0] = LJIIJJI;
        iArr[1] = (int) (LJIIJJI * 0.26239067f);
    }
}
