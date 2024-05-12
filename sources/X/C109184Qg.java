package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.4Qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C109184Qg extends C47121t6 {
    public final boolean LJLLLL;

    @Override // android.view.View
    public final boolean isFocused() {
        if (this.LJLLLL) {
            return super.isFocused();
        }
        return true;
    }

    public C109184Qg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLLL = true;
    }
}
