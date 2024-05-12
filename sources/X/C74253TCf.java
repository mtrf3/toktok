package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.TCf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74253TCf extends C8HN {
    public boolean LJLJL;

    @Override // android.view.View
    public final boolean isFocused() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74253TCf(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
    }

    public final void setMarqueeEnable(boolean z) {
        if (this.LJLJL != z) {
            this.LJLJL = z;
            onWindowFocusChanged(z);
        }
    }
}
