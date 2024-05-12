package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.134, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass134 extends View {
    public C17E LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass134(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public abstract /* synthetic */ ArrayList<C14H> getCurrentLyrics();

    public final C17E getConfig() {
        return this.LJLIL;
    }

    public C17E getDisplayConfig() {
        return this.LJLIL;
    }

    public final void setConfig(C17E c17e) {
        o.LJIIIZ(c17e, "<set-?>");
        this.LJLIL = c17e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass134(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = new C17E();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C17E c17e = this.LJLIL;
        if (c17e.LIZ == 0.0f) {
            c17e.LIZ = i - c17e.LJFF.measureText("   ");
        }
        C17E c17e2 = this.LJLIL;
        if (c17e2.LIZ <= 0.0f) {
            c17e2.LIZ = C17E.LJIIIZ;
        }
    }
}
