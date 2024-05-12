package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.3Lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82483Lo extends AbstractC82843My {
    public final int LJLIL;

    public C82483Lo() {
        this(0, 1, null);
    }

    public static /* synthetic */ C82483Lo copy$default(C82483Lo c82483Lo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c82483Lo.getBackground();
        }
        return c82483Lo.copy(i);
    }

    public final int component1() {
        return getBackground();
    }

    public final C82483Lo copy(int i) {
        return new C82483Lo(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C82483Lo) && getBackground() == ((AbstractC82843My) obj).getBackground();
    }

    public int hashCode() {
        return getBackground();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionUnreadViewDotState(background=");
        LIZ.append(getBackground());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC82843My
    public int getBackground() {
        return this.LJLIL;
    }

    public C82483Lo(int i) {
        this.LJLIL = i;
    }

    public /* synthetic */ C82483Lo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.attr.eb : i);
    }
}
