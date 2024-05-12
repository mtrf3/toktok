package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bhh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29485Bhh extends C45631qh {
    public final List<InterfaceC29493Bhp> LLIFFJFJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29485Bhh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLIFFJFJJ = new ArrayList();
    }

    @Override // X.C45631qh, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = ((ArrayList) this.LLIFFJFJJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC29493Bhp) it.next()).LIZ(this, i2);
        }
    }
}
