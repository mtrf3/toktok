package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.05r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C019105r extends View {
    public int LJLIL;
    public View LJLILLLLZI;
    public int LJLJI;

    public View getContent() {
        return this.LJLILLLLZI;
    }

    public int getEmptyVisibility() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.LJLIL == i) {
            return;
        }
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(0);
            ((C018905p) this.LJLILLLLZI.getLayoutParams()).isInPlaceholder = false;
            this.LJLILLLLZI = null;
        }
        this.LJLIL = i;
        if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i) {
        this.LJLJI = i;
    }

    public C019105r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = -1;
        this.LJLJI = 4;
        super.setVisibility(4);
        this.LJLIL = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a6y, R.attr.b4x});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.LJLIL = obtainStyledAttributes.getResourceId(index, this.LJLIL);
                } else if (index == 1) {
                    this.LJLJI = obtainStyledAttributes.getInt(index, this.LJLJI);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
