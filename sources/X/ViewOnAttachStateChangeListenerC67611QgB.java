package X;

import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import java.util.HashMap;

/* renamed from: X.QgB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ViewOnAttachStateChangeListenerC67611QgB implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AttributeSet LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        HashMap<AttributeSet, TuxTextView> hashMap = C67613QgD.LIZIZ;
        if (hashMap.size() <= C67613QgD.LIZJ) {
            hashMap.put(this.LJLIL, this.LJLILLLLZI);
        }
    }

    public ViewOnAttachStateChangeListenerC67611QgB(AttributeSet attributeSet, TuxTextView tuxTextView) {
        this.LJLIL = attributeSet;
        this.LJLILLLLZI = tuxTextView;
    }
}
