package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class NQ0 extends LinearLayout implements View.OnClickListener {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C62846OlW LJLIL;
    public final TextView LJLILLLLZI;
    public final ImageView LJLJI;
    public NK0 LJLJJI;

    public NQ0(Context context) {
        super(context, null, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.avi, this, true);
        setPadding(C17N.LJIILL(5.0d), C17N.LJIILL(5.0d), C17N.LJIILL(5.0d), C17N.LJIILL(5.0d));
        setBackgroundResource(R.drawable.bnm);
        this.LJLIL = (C62846OlW) findViewById(R.id.ft5);
        this.LJLILLLLZI = (TextView) findViewById(R.id.ft1);
        this.LJLJI = (ImageView) findViewById(R.id.ft9);
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NK0 nk0 = this.LJLJJI;
        if (nk0 != null) {
            nk0.LIZIZ();
        }
    }

    public void setLinkTagCallBack(NK0 nk0) {
        this.LJLJJI = nk0;
    }
}
