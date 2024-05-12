package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import defpackage.a1;

/* renamed from: X.5UT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UT extends C5US {
    @Override // X.C5US
    public final int[] LIZ() {
        return new int[]{ColorProtector.parseColor("#00000000"), ColorProtector.parseColor("#80000000"), ColorProtector.parseColor("#B2000000"), ColorProtector.parseColor("#CC000000"), ColorProtector.parseColor("#E5000000")};
    }

    @Override // X.C5US
    public final float[] LIZIZ() {
        return new float[]{0.0f, 0.17f, 0.3f, 0.42f, 0.73f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5UT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }
}
