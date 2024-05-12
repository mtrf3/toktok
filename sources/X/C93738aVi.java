package X;

import Y.IDRunnableS33S0200000_42;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.aVi, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93738aVi {
    public static final /* synthetic */ int LJFF = 0;
    public final View LIZ;
    public int LIZIZ;
    public final CopyOnWriteArrayList<InterfaceC93737aVh> LIZJ;
    public C93735aVf LIZLLL;
    public final ActivityC45651qj LJ;

    public final void LIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("height update: ");
        LIZ.append(i);
        C94034aaU.LIZ("KeyBoardUtils", X1D.LIZIZ(LIZ));
        Iterator<InterfaceC93737aVh> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(i);
        }
    }

    public C93738aVi(ActivityC45651qj activityC45651qj, Lifecycle lifecycle) {
        this.LJ = activityC45651qj;
        View view = new View(activityC45651qj);
        this.LIZ = view;
        this.LIZJ = new CopyOnWriteArrayList<>();
        Window window = activityC45651qj.getWindow();
        o.LJIIIIZZ(window, "activity.window");
        int i = window.getAttributes().softInputMode & 240;
        if (i != 16 && i != 32) {
            final PopupWindow popupWindow = new PopupWindow(activityC45651qj);
            popupWindow.setWidth(0);
            view.setLayoutParams(new ViewGroup.LayoutParams(0, -1));
            popupWindow.setContentView(view);
            popupWindow.setSoftInputMode(21);
            popupWindow.setInputMethodMode(1);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setTouchable(false);
            Window window2 = activityC45651qj.getWindow();
            o.LJIIIIZZ(window2, "activity.window");
            window2.getDecorView().post(new IDRunnableS33S0200000_42(popupWindow, this, 2));
            if (lifecycle != null) {
                lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ugc.effectcreator.foundation.utils.KeyboardUtils$$special$$inlined$apply$lambda$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    private final void onDestroy() {
                        popupWindow.dismiss();
                        this.getClass();
                    }
                });
            }
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = 0;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC93739aVj(this, c76732zl));
        }
    }
}
