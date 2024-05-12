package X;

import Y.IDCListenerS136S0100000_24;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Zgd, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90571Zgd extends C012503d {
    public final AnimationDrawable LJLJJI;
    public final AnimationDrawable LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public boolean LJLJLJ;
    public View.OnClickListener LJLJLLL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLJLLL = onClickListener;
    }

    public C90571Zgd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) C04270Et.LIZIZ(context, R.drawable.g9);
        this.LJLJJI = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) C04270Et.LIZIZ(context, R.drawable.g8);
        this.LJLJJL = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ZXT.LIZJ(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.av);
        this.LJLJJLL = string;
        this.LJLJL = context.getString(R.string.at);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new IDCListenerS136S0100000_24(this, 9));
    }
}
