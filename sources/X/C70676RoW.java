package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.RoW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70676RoW extends FrameLayout {
    public static final int LJLJJI = C47135Ieh.LIZ(32, C27162AlK.LIZ);
    public final C119774mz LJLIL;
    public InterfaceC70680Roa LJLILLLLZI;
    public final LinkedList<View> LJLJI;

    public final C119774mz getFlow() {
        return this.LJLIL;
    }

    public final InterfaceC70680Roa getListener() {
        return this.LJLILLLLZI;
    }

    public final void setListener(InterfaceC70680Roa interfaceC70680Roa) {
        this.LJLILLLLZI = interfaceC70680Roa;
    }

    public final void setOnItemMediaClickListener(InterfaceC70680Roa listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70676RoW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C119774mz c119774mz = new C119774mz(context, null, 6);
        c119774mz.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c119774mz.setGravity(-1);
        c119774mz.setVisibility(0);
        this.LJLIL = c119774mz;
        this.LJLJI = new LinkedList<>();
        addView(c119774mz);
    }
}
