package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.am3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94751am3 extends C45631qh {
    public final List<InterfaceC93450aR4> LLIFFJFJJ;

    @Override // X.C45631qh
    public final int LIZIZ(Rect rect) {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94751am3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LLIFFJFJJ = new ArrayList();
    }

    @Override // X.C45631qh, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = ((ArrayList) this.LLIFFJFJJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC93450aR4) it.next()).LIZ(this);
        }
    }
}
