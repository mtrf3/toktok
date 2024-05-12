package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.2HJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HJ extends AbstractC534928b<View> {
    public Drawable LJLILLLLZI;
    public Drawable LJLJI;
    public Drawable LJLJJI;

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return new int[]{R.attr.a_3, R.attr.awk, R.attr.b5a};
    }

    public C2HJ(View view) {
        super(view);
    }

    @Override // X.AbstractC534928b
    public final void LLLLZIL(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 2) {
                Drawable drawable = typedArray.getDrawable(index);
                this.LJLILLLLZI = drawable;
                LLLZ(drawable);
            } else if (index == 0) {
                Drawable drawable2 = typedArray.getDrawable(index);
                this.LJLJI = drawable2;
                LLLZ(drawable2);
            } else if (index == 1) {
                Drawable drawable3 = typedArray.getDrawable(index);
                this.LJLJJI = drawable3;
                LLLZ(drawable3);
            }
        }
        this.LJLIL.invalidate();
    }

    public final void LLLZ(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, this.LJLIL.getWidth(), this.LJLIL.getHeight());
        }
    }
}
