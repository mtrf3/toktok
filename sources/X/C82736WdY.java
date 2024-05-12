package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WdY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82736WdY extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C82737WdZ LJLIL;
    public final /* synthetic */ InterfaceC82738Wda LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        View view = this.LJLIL.LLF;
        if (view != null) {
            view.setTranslationX(e.getX() - 45);
            View view2 = this.LJLIL.LLF;
            if (view2 != null) {
                view2.setTranslationY(e.getY() - 50);
                InterfaceC82738Wda interfaceC82738Wda = this.LJLILLLLZI;
                C82737WdZ c82737WdZ = this.LJLIL;
                View view3 = c82737WdZ.LLF;
                if (view3 != null) {
                    interfaceC82738Wda.LJFF(c82737WdZ.LL, view3);
                    return;
                } else {
                    o.LJIJI("anchorView");
                    throw null;
                }
            }
            o.LJIJI("anchorView");
            throw null;
        }
        o.LJIJI("anchorView");
        throw null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LLD.start();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        o.LJIIIZ(e, "e");
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_music_edit");
        this.LJLILLLLZI.LIZ(this.LJLIL.LL, this.LJLJI);
        return true;
    }

    public C82736WdY(C82737WdZ c82737WdZ, InterfaceC82738Wda interfaceC82738Wda, View view) {
        this.LJLIL = c82737WdZ;
        this.LJLILLLLZI = interfaceC82738Wda;
        this.LJLJI = view;
    }
}
