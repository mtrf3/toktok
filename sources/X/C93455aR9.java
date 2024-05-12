package X;

import android.util.Property;
import kotlin.jvm.internal.o;

/* renamed from: X.aR9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93455aR9 extends Property<C93454aR8, Integer> {
    public C93455aR9(Class cls) {
        super(cls, "offset");
    }

    @Override // android.util.Property
    public final Integer get(C93454aR8 c93454aR8) {
        C93454aR8 viewBounds = c93454aR8;
        o.LJIIIZ(viewBounds, "viewBounds");
        return Integer.valueOf(viewBounds.LJI);
    }

    @Override // android.util.Property
    public final void set(C93454aR8 c93454aR8, Integer num) {
        C93454aR8 viewBounds = c93454aR8;
        int intValue = num.intValue();
        o.LJIIIZ(viewBounds, "viewBounds");
        viewBounds.LJI = intValue;
    }
}
