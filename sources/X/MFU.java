package X;

import Y.ACListenerS22S0101000_3;
import Y.ARunnableS28S0200000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MFU extends MFS {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final TextView LJLJL;
    public final TextView LJLJLJ;

    public MFU(View view) {
        super(view);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.cover);
        this.LJLILLLLZI = smartImageView;
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS22S0101000_3(1, this, 10));
        this.LJLJL = (TextView) view.findViewById(R.id.m5s);
        this.LJLJLJ = (TextView) view.findViewById(R.id.m5r);
    }

    @Override // X.MFS
    public final void N(C26336AVg c26336AVg, int i) {
        super.N(c26336AVg, i);
        C38816FLg.LIZJ(new ARunnableS28S0200000_9(this, c26336AVg, i, 76));
    }
}
