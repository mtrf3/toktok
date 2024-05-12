package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Sfi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72678Sfi extends LinearLayout {
    public InterfaceC72697Sg1 LJLIL;

    public final void setListener(InterfaceC72697Sg1 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72678Sfi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setOrientation(1);
        setGravity(17);
    }
}
