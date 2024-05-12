package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;

/* renamed from: X.6Jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158376Jl extends LinearLayout {
    public boolean LJLIL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLIL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMode(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158376Jl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }
}
