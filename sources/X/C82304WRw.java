package X;

import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WRw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82304WRw extends RelativeLayout {
    public TextView LJLIL;
    public TextView LJLILLLLZI;
    public float LJLJI;
    public RunnableC82305WRx LJLJJI;
    public final ARunnableS50S0100000_14 LJLJJL;

    static {
        C16880lQ.LJLLJ(C82304WRw.class);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    public C82304WRw(Context context) {
        super(context, null, 0);
        this.LJLJJL = new ARunnableS50S0100000_14(this, 235);
        RelativeLayout.inflate(getContext(), R.layout.crg, this);
        this.LJLIL = (TextView) findViewById(R.id.db4);
        this.LJLILLLLZI = (TextView) findViewById(R.id.jjk);
        this.LJLIL.setAlpha(1.0f);
        this.LJLILLLLZI.setAlpha(1.0f);
        this.LJLILLLLZI.setVisibility(0);
        this.LJLIL.setVisibility(0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.LJLIL;
        if (textView != null && this.LJLILLLLZI != null) {
            this.LJLJI = textView.getX() - this.LJLILLLLZI.getX();
        }
        RunnableC82305WRx runnableC82305WRx = this.LJLJJI;
        if (runnableC82305WRx != null) {
            runnableC82305WRx.run();
            this.LJLJJI = null;
        }
    }
}
