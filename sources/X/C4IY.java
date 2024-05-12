package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4IY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IY extends T5T {
    public C4IX LJLJJLL;

    public final void setKeyImeChangeListener$im_base_release(C4IX listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4IY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jy);
        a1.LJFF(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C4IX c4ix;
        if (keyEvent != null && keyEvent.getAction() == 0 && 4 == keyEvent.getKeyCode() && (c4ix = this.LJLJJLL) != null) {
            c4ix.LLILII();
        }
        return false;
    }
}
