package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.o;

/* renamed from: X.aRJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93465aRJ extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C93463aRH LJLIL;

    public C93465aRJ(C93463aRH c93463aRH) {
        this.LJLIL = c93463aRH;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.LJLIL.LJLJJL.cancel();
        this.LJLIL.LJLJJL.start();
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
        InterfaceC93891aYB pointActionCallback;
        o.LJIIIZ(e1, "e1");
        o.LJIIIZ(e2, "e2");
        float x = e2.getX() - e1.getX();
        float y = e2.getY() - e1.getY();
        ViewParent parent = this.LJLIL.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            float translationX = this.LJLIL.getTranslationX() + x;
            float f3 = translationX + (r1.LJLJJLL.LJLIL / 2.0f);
            float translationY = this.LJLIL.getTranslationY() + y;
            float f4 = translationY + (r1.LJLJJLL.LJLIL / 2.0f);
            float f5 = this.LJLIL.LJLJI;
            float width = viewGroup.getWidth();
            float f6 = this.LJLIL.LJLJI;
            float f7 = width - f6;
            if (f3 >= f5 && f3 <= f7) {
                float height = viewGroup.getHeight();
                C93463aRH c93463aRH = this.LJLIL;
                float f8 = height - c93463aRH.LJLJI;
                if (f4 >= f6 && f4 <= f8 && (pointActionCallback = c93463aRH.LJLJJLL.getPointActionCallback()) != null) {
                    pointActionCallback.LJJJJI(f3 / viewGroup.getWidth(), f4 / viewGroup.getHeight(), viewGroup.indexOfChild(this.LJLIL));
                }
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
