package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58422Ra extends LinearLayout implements InterfaceC58432Rb {
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLIL;

    @Override // X.InterfaceC58432Rb
    public InterfaceC88472Yns<Boolean, C76800UCe> getExposeListener() {
        return this.LJLIL;
    }

    public void setExposeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58422Ra(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        a1.LJFF(context, "context");
    }
}
