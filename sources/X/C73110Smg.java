package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Smg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73110Smg extends AppCompatImageView {
    public Drawable LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(R.drawable.b2x);
            Drawable drawable = getDrawable();
            this.LJLIL = drawable;
            if (drawable != null) {
                drawable.setColorFilter(this.LJLILLLLZI, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        setImageResource(R.drawable.b2w);
        Drawable drawable2 = getDrawable();
        this.LJLIL = drawable2;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(this.LJLJI, PorterDuff.Mode.SRC_IN);
    }

    public void setColor(int i) {
        if (this.LJLIL == null) {
            this.LJLIL = getDrawable();
        }
        this.LJLIL.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public C73110Smg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = C06690Ob.LIZIZ(getResources(), R.color.ad5, getContext().getTheme());
        this.LJLJI = C06690Ob.LIZIZ(getResources(), R.color.ad4, getContext().getTheme());
        setChecked(false);
    }
}
