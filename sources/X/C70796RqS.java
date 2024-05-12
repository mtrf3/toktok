package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import java.util.LinkedList;

/* renamed from: X.RqS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70796RqS extends FrameLayout {
    public final C119774mz LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public final LinkedList<C119244m8> LJLJJI;
    public boolean LJLJJL;

    public final boolean getReverseSelectionSupport() {
        return this.LJLJJL;
    }

    public static void LIZ(C70796RqS c70796RqS) {
        int childCount = c70796RqS.LJLIL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c70796RqS.LJLIL.getChildAt(i);
            if (childAt != null) {
                childAt.setSelected(false);
            }
        }
        c70796RqS.LJLILLLLZI = null;
        c70796RqS.LJLJI = null;
    }

    public final void setReverseSelectionSupport(boolean z) {
        this.LJLJJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70796RqS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C119774mz c119774mz = new C119774mz(context, null, 6);
        c119774mz.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c119774mz.setGravity(-1);
        this.LJLIL = c119774mz;
        addView(c119774mz);
        this.LJLJJI = new LinkedList<>();
    }
}
