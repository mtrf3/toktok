package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: X.7n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196307n8 extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final Queue<ImageView> LJLJJI;
    public final Random LJLJJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ImageView imageView;
        super.onDetachedFromWindow();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof ImageView) && (imageView = (ImageView) childAt) != null) {
                Animation animation = imageView.getAnimation();
                if (animation != null) {
                    animation.setAnimationListener(null);
                }
                imageView.setImageDrawable(null);
                imageView.clearAnimation();
                if (((LinkedList) this.LJLJJI).size() < 3) {
                    ((LinkedList) this.LJLJJI).add(imageView);
                }
            }
        }
        removeAllViews();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C196307n8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
        this.LJLJJI = new LinkedList();
        this.LJLJJL = new Random();
        this.LJLILLLLZI = C7MY.LIZIZ(72);
        this.LJLIL = C7MY.LIZIZ(79);
        this.LJLJI = C60996Nwm.LJIIIIZZ(context);
    }
}
