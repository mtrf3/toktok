package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* renamed from: X.28I, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28I extends QXX implements AnonymousClass132 {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public final AnonymousClass133 LJLJJI;

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return new int[]{R.attr.vl, R.attr.a_2, R.attr.b5_};
    }

    public C28I(AnonymousClass133 anonymousClass133) {
        super((Object) null);
        this.LJLIL = 1.0f;
        this.LJLILLLLZI = 1.0f;
        this.LJLJI = 1.0f;
        this.LJLJJI = anonymousClass133;
    }

    public final boolean LLLLZIL(Canvas canvas) {
        float f;
        float f2;
        if (!this.LJLJJI.isEnabled()) {
            f = 255;
            f2 = this.LJLILLLLZI;
        } else if (this.LJLJJI.LJII()) {
            f = 255;
            f2 = this.LJLIL;
        } else {
            f = 255;
            f2 = this.LJLJI;
        }
        int i = (int) (f * f2);
        if (i < 255) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.LJLJJI.getWidth(), this.LJLJJI.getHeight(), i, 31);
            return true;
        }
        return false;
    }

    public final void LLLLZ(Context context, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 2) {
                TypedValue typedValue = new TypedValue();
                typedArray.getValue(2, typedValue);
                this.LJLIL = typedValue.getFloat();
            } else if (index == 1) {
                TypedValue typedValue2 = new TypedValue();
                typedArray.getValue(1, typedValue2);
                this.LJLILLLLZI = typedValue2.getFloat();
            } else if (index == 0) {
                TypedValue typedValue3 = new TypedValue();
                typedArray.getValue(0, typedValue3);
                this.LJLJI = typedValue3.getFloat();
            }
        }
        this.LJLJJI.invalidate();
    }
}
