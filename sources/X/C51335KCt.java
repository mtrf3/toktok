package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SearchIntermediateViewModelNew;

/* renamed from: X.KCt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51335KCt extends AppCompatImageView {
    public int LJLIL;
    public KDY LJLILLLLZI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLILLLLZI != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 2) {
                    SearchIntermediateViewModelNew searchIntermediateViewModelNew = ((K5C) this.LJLILLLLZI).LIZ.LJLJJLL;
                    if (searchIntermediateViewModelNew != null) {
                        ((LiveData) searchIntermediateViewModelNew.LJLJJL.getValue()).setValue(Boolean.TRUE);
                    }
                } else {
                    float f = this.LJLIL;
                    float f2 = -f;
                    if (x < f2 || y < f2 || x >= (getRight() - getLeft()) + f || y >= (getBottom() - getTop()) + f) {
                        K5C k5c = (K5C) this.LJLILLLLZI;
                        K75 k75 = k5c.LIZ.LJLJL;
                        if (k75 != null && k75.LJII() != null) {
                            k5c.LIZ.LJLJL.LJII().LIZ();
                        }
                    }
                }
            } else {
                SearchIntermediateViewModelNew searchIntermediateViewModelNew2 = ((K5C) this.LJLILLLLZI).LIZ.LJLJJLL;
                if (searchIntermediateViewModelNew2 != null) {
                    ((LiveData) searchIntermediateViewModelNew2.LJLJJL.getValue()).setValue(Boolean.FALSE);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setKeyboardDismissHandler(KDY kdy) {
        this.LJLILLLLZI = kdy;
    }

    public C51335KCt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C51335KCt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
