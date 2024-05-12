package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.VmC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80724VmC extends ViewGroup.MarginLayoutParams {
    public final int LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public C80724VmC() {
        super(-1, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80724VmC(C80724VmC source) {
        super((ViewGroup.MarginLayoutParams) source);
        o.LJIIIZ(source, "source");
        this.LIZ = source.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80724VmC(ViewGroup.LayoutParams source) {
        super(source);
        o.LJIIIZ(source, "source");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80724VmC(ViewGroup.MarginLayoutParams source) {
        super(source);
        o.LJIIIZ(source, "source");
    }

    public C80724VmC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LLII);
        o.LJIIIIZZ(obtainStyledAttributes, "c.obtainStyledAttributes(attrs, LAYOUT_ATTRS)");
        this.LIZ = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }
}
