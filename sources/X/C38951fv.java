package X;

import Y.IDCListenerS83S0200000;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38951fv implements C15M {
    public final CharSequence LIZ;
    public final View.OnClickListener LIZIZ;
    public final C15L LIZJ;
    public final int LIZLLL;

    public C38951fv(C15N c15n) {
        this.LIZ = c15n.LIZ;
        this.LIZIZ = c15n.LIZIZ;
        this.LIZJ = c15n.LIZLLL;
        this.LIZLLL = c15n.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1o9, android.view.View] */
    @Override // X.C15M
    public final View LIZ(final Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        ?? r3 = new C1K6(context) { // from class: X.1o9
            public TextView LJLJI;
            public ImageView LJLJJI;

            {
                LinearLayout.inflate(getContext(), R.layout.bpp, this);
                setOrientation(0);
                setGravity(17);
                this.LJLJI = (TextView) findViewById(R.id.fxb);
                this.LJLJJI = (ImageView) findViewById(R.id.fxa);
            }

            public void setColor(ColorStateList colorStateList) {
                if (colorStateList == null) {
                    return;
                }
                this.LJLJI.setTextColor(colorStateList);
                C07S.LIZ(this.LJLJJI, colorStateList);
            }

            public void setColorAttr(int i) {
                setColor(C259910h.LIZIZ(i, getContext()));
            }

            public void setText(int i) {
                this.LJLJI.setText(i);
            }

            public void setColor(int i) {
                setColor(ColorStateList.valueOf(i));
            }

            public void setText(CharSequence charSequence) {
                this.LJLJI.setText(charSequence);
            }
        };
        r3.setText(this.LIZ);
        int i = this.LIZLLL;
        if (i != -1) {
            r3.setColorAttr(i);
        }
        if (this.LIZJ == null) {
            r3.setOnClickListener(new ViewOnClickListenerC13880ga(this.LIZIZ));
        } else {
            r3.setOnClickListener(new ViewOnClickListenerC13880ga(new IDCListenerS83S0200000(dialogInterface, this, 13)));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView((View) r3, layoutParams);
        return frameLayout;
    }
}
