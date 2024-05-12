package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: X.W3a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81658W3a extends AppCompatImageView {
    public InterfaceC81662W3e LJLIL;

    public C81658W3a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public void setOnStateChangeListener(InterfaceC81662W3e interfaceC81662W3e) {
        this.LJLIL = interfaceC81662W3e;
    }

    public C81658W3a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
