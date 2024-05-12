package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4HZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4HZ extends FrameLayout {
    public final int LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4HZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfg});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…le.TemplatePreviewLayout)");
            this.LJLIL = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
        }
        C16880lQ.LLLZIIL(this.LJLIL, C16880lQ.LLZIL(context).cloneInContext(new ContextThemeWrapper(context, R.style.a7j)), this);
    }
}
