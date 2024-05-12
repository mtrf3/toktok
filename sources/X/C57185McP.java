package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.McP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57185McP extends RecyclerView {
    public boolean LLLF;
    public boolean LLLFF;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        if (this.LLLF || !C52533KjZ.LIZJ()) {
            return super.onTouchEvent(e);
        }
        if (e.getAction() == 0) {
            if (e.getX() <= getWidth() * 0.6d) {
                this.LLLFF = true;
            } else {
                this.LLLFF = false;
            }
        }
        if (this.LLLFF) {
            return false;
        }
        return super.onTouchEvent(e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57185McP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
