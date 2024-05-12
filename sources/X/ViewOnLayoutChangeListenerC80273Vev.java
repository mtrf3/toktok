package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.badge.BadgeDrawable;

/* renamed from: X.Vev, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnLayoutChangeListenerC80273Vev implements View.OnLayoutChangeListener {
    public final /* synthetic */ C80272Veu LJLIL;

    public ViewOnLayoutChangeListenerC80273Vev(C80272Veu c80272Veu) {
        this.LJLIL = c80272Veu;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLIL.LJLJL.getVisibility() == 0) {
            C80272Veu c80272Veu = this.LJLIL;
            ImageView imageView = c80272Veu.LJLJL;
            BadgeDrawable badgeDrawable = c80272Veu.LJLLLLLL;
            if (badgeDrawable != null) {
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                badgeDrawable.setBounds(rect);
                badgeDrawable.LJIIIIZZ(imageView, null);
            }
        }
    }
}
