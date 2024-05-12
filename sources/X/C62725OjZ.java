package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.OjZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62725OjZ extends SYL {
    public final void setupListView(C62726Oja config) {
        o.LJIIIZ(config, "config");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62725OjZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
