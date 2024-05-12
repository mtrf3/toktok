package X;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes14.dex */
public class VA8 extends VA9<V92> {
    public VA8(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public VA8(Context context, V92 v92) {
        super(context);
        setHierarchy(v92);
    }

    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        C81939WDv.LIZIZ();
        C81939WDv.LIZIZ();
        C79077V1t c79077V1t = new C79077V1t(context.getResources());
        C79076V1s.LIZLLL(c79077V1t, context, attributeSet);
        C81939WDv.LIZIZ();
        setAspectRatio(c79077V1t.LIZIZ);
        setHierarchy(c79077V1t.LIZ());
        C81939WDv.LIZIZ();
    }

    public VA8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public VA8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    public VA8(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
