package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.79c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1811679c extends SYL {
    public final void setMaxLineCount(int i) {
        C0A2 layoutManager = getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).LLJLIL(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1811679c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setLayoutManager(new GridLayoutManager(3));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
