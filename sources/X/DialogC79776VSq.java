package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.ies.xelement.overlay.LynxOverlayView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VSq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC79776VSq extends Dialog {
    public final C62822Ol8 LJLIL;
    public final LynxOverlayView LJLILLLLZI;

    @Override // android.app.Dialog
    public final void show() {
        Window window;
        View decorView;
        View decorView2;
        Context context = getContext();
        o.LJFF(context, "context");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(131072);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setFlags(8, 8);
        }
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-7306888301462995999")).LIZ) {
            super.show();
        }
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && (window = ownerActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            Window window4 = getWindow();
            if (window4 != null && (decorView2 = window4.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(systemUiVisibility);
            }
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.clearFlags(8);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Context context = getContext();
        o.LJFF(context, "context");
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        super.dismiss();
    }

    public final boolean LIZ(MotionEvent ev) {
        o.LJIIJ(ev, "ev");
        float x = ev.getX();
        float y = ev.getY();
        LynxOverlayView lynxOverlayView = this.LJLILLLLZI;
        boolean z = true;
        if (!lynxOverlayView.LJLIL) {
            return false;
        }
        if (lynxOverlayView.LJLJI || lynxOverlayView.eventThrough()) {
            List<LynxBaseUI> mChildren = lynxOverlayView.mChildren;
            o.LJFF(mChildren, "mChildren");
            for (LynxBaseUI ui : mChildren) {
                int left = lynxOverlayView.getLeft();
                o.LJFF(ui, "ui");
                if (ui.getTranslationX() + ui.getLeft() + left < x) {
                    if (ui.getTranslationX() + lynxOverlayView.getLeft() + ui.getLeft() + ui.getWidth() > x) {
                        if (ui.getTranslationY() + ui.getTop() + lynxOverlayView.getTop() < y) {
                            if (ui.getTranslationY() + lynxOverlayView.getTop() + ui.getTop() + ui.getHeight() > y) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return false;
        }
        float left2 = this.LJLILLLLZI.getLeft();
        float top = this.LJLILLLLZI.getTop();
        ev.offsetLocation(-left2, -top);
        LynxOverlayView lynxOverlayView2 = this.LJLILLLLZI;
        VPV vpv = lynxOverlayView2.LJLLI;
        if (vpv == null || !vpv.LJ(ev, lynxOverlayView2)) {
            z = false;
        }
        ev.offsetLocation(left2, top);
        return z;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        o.LJIIJ(ev, "ev");
        if (LIZ(ev)) {
            return super.dispatchTouchEvent(ev);
        }
        Iterator it = ((ArrayList) C79774VSo.LIZ).iterator();
        while (it.hasNext()) {
            C79775VSp c79775VSp = (C79775VSp) it.next();
            if (c79775VSp.LIZIZ.LIZ(ev) && (!o.LJ(this, c79775VSp.LIZIZ))) {
                DialogC79776VSq dialogC79776VSq = c79775VSp.LIZIZ;
                dialogC79776VSq.getClass();
                return super.dispatchTouchEvent(ev);
            }
        }
        ArrayList arrayList = (ArrayList) C79774VSo.LIZ;
        if (!arrayList.isEmpty()) {
            int i = 0;
            if (arrayList != null) {
                DialogC79776VSq dialogC79776VSq2 = ((C79775VSp) ListProtector.get(arrayList, 0)).LIZIZ;
                dialogC79776VSq2.getClass();
                Activity LJIIJJI = C78996UzQ.LJIIJJI(dialogC79776VSq2.LJLILLLLZI.mContext);
                if (LJIIJJI != null) {
                    if (!dialogC79776VSq2.LJLILLLLZI.LJLILLLLZI) {
                        i = -((Number) dialogC79776VSq2.LJLIL.getValue()).intValue();
                    }
                    float f = i;
                    ev.offsetLocation(-0.0f, -f);
                    boolean dispatchTouchEvent = LJIIJJI.dispatchTouchEvent(ev);
                    ev.offsetLocation(0.0f, f);
                    return dispatchTouchEvent;
                }
            }
        }
        return false;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC79776VSq(Context context, LynxOverlayView overlay) {
        super(context, R.style.jk);
        o.LJIIJ(context, "context");
        o.LJIIJ(overlay, "overlay");
        this.LJLILLLLZI = overlay;
        this.LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 296));
    }
}
