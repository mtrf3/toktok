package X;

import Y.ACListenerS28S0101000_10;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OGp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61627OGp extends RecyclerView.ViewHolder {
    public final int LJLIL;
    public final int[] LJLILLLLZI;
    public final SmartImageView LJLJI;
    public final int LJLJJI;
    public Banner LJLJJL;
    public int LJLJJLL;
    public final long LJLJL;
    public final long LJLJLJ;

    public C61627OGp(View view, int i, int i2, long j, long j2) {
        super(view);
        int[] iArr = new int[2];
        this.LJLILLLLZI = iArr;
        this.LJLIL = i;
        this.LJLJJI = i2;
        this.LJLJL = j;
        this.LJLJLJ = j2;
        ViewOnAttachStateChangeListenerC61626OGo viewOnAttachStateChangeListenerC61626OGo = new ViewOnAttachStateChangeListenerC61626OGo(this);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC61626OGo);
        if (C16330kX.LIZIZ(view)) {
            viewOnAttachStateChangeListenerC61626OGo.run();
        }
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.jd5);
        this.LJLJI = smartImageView;
        if (C82852WfQ.LIZ().LJIIJ.invoke().booleanValue()) {
            S3I s3i = new S3I();
            s3i.LIZLLL = C17N.LJIILL(10.0d);
            smartImageView.setCircleOptions(new S3L(s3i));
        }
        View findViewById = view.findViewById(R.id.jd5);
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS28S0101000_10(1, this, 6), findViewById);
        }
        int LJIIJJI = KL2.LJIIJJI(view.getContext()) - ((int) (KL2.LIZJ(view.getContext(), 16.0f) * 2.0f));
        iArr[0] = LJIIJJI;
        iArr[1] = (int) (LJIIJJI * 0.26239067f);
    }
}
