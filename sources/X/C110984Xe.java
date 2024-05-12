package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.4Xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110984Xe extends TuxTextView implements LifecycleOwner {
    public final C62822Ol8 LJLLLL;
    public boolean LJLLLLLL;
    public final java.util.Map<Integer, View> LJLZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJLZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LJLLLL.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLifecycleRegistry().setCurrentState(Lifecycle.State.STARTED);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final void setSelect(boolean z) {
        this.LJLLLLLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110984Xe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLZ = C62850Ola.LJFF(context, "context");
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 18));
    }
}
