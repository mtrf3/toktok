package X;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* renamed from: X.Vi1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnLayoutChangeListenerC80465Vi1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ BottomAppBar$Behavior LJLIL;

    public ViewOnLayoutChangeListenerC80465Vi1(BottomAppBar$Behavior bottomAppBar$Behavior) {
        this.LJLIL = bottomAppBar$Behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLIL.LJ.get() == null || !(view instanceof C80474ViA)) {
            view.removeOnLayoutChangeListener(this);
        } else {
            this.LJLIL.LIZLLL.set(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            throw null;
        }
    }
}
