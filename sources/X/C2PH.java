package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2PH, reason: invalid class name */
/* loaded from: classes2.dex */
public class C2PH extends FrameLayout {
    public TuxTextView LJLIL;
    public TextView LJLILLLLZI;
    public ImageView LJLJI;

    public C2PH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bmp, this, true);
        this.LJLIL = (TuxTextView) findViewById(R.id.mo6);
        this.LJLILLLLZI = (TextView) findViewById(R.id.m4n);
        this.LJLJI = (ImageView) findViewById(R.id.ejh);
    }
}
