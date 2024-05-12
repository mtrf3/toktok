package X;

import android.util.Property;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BqT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30029BqT extends Property<ViewGroup, Float> {
    public static final C30029BqT LIZ = new C30029BqT();

    public C30029BqT() {
        super(Float.class, "childrenAlpha");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Float, java.lang.Object] */
    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        ?? tag = viewGroup.getTag(R.id.goa);
        if (tag != 0) {
            return tag;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f.floatValue();
        viewGroup2.setTag(R.id.goa, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(floatValue);
        }
    }
}
