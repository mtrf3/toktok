package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.Window;
import com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewNG;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VSx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC79783VSx extends Dialog {
    public VT3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final LynxOverlayViewNG LJLJI;

    @Override // android.app.Dialog
    public final void show() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131072);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setFlags(8, 8);
        }
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "120367202653883844")).LIZ) {
            super.show();
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.clearFlags(8);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Context context = getContext();
        o.LJFF(context, "context");
        if (LIZ(context) < 0) {
            return;
        }
        super.dismiss();
    }

    public static int LIZ(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return -1;
            }
            if (activity.isDestroyed()) {
                return -2;
            }
            return 0;
        }
        return 1;
    }

    public final boolean LIZIZ(MotionEvent ev) {
        o.LJIIJ(ev, "ev");
        float x = ev.getX();
        float y = ev.getY();
        LynxOverlayViewNG lynxOverlayViewNG = this.LJLJI;
        boolean z = true;
        if (!lynxOverlayViewNG.LJLILLLLZI) {
            return false;
        }
        if (lynxOverlayViewNG.LJLJJL || lynxOverlayViewNG.eventThrough()) {
            List<LynxBaseUI> mChildren = lynxOverlayViewNG.mChildren;
            o.LJFF(mChildren, "mChildren");
            for (LynxBaseUI ui : mChildren) {
                int left = lynxOverlayViewNG.getLeft();
                o.LJFF(ui, "ui");
                if (ui.getTranslationX() + ui.getLeft() + left < x) {
                    if (ui.getTranslationX() + lynxOverlayViewNG.getLeft() + ui.getLeft() + ui.getWidth() > x) {
                        if (ui.getTranslationY() + ui.getTop() + lynxOverlayViewNG.getTop() < y) {
                            if (ui.getTranslationY() + lynxOverlayViewNG.getTop() + ui.getTop() + ui.getHeight() > y) {
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
        float left2 = this.LJLJI.getLeft();
        float top = this.LJLJI.getTop();
        ev.offsetLocation(-left2, -top);
        LynxOverlayViewNG lynxOverlayViewNG2 = this.LJLJI;
        VPV vpv = lynxOverlayViewNG2.LL;
        if (vpv == null || !vpv.LJ(ev, lynxOverlayViewNG2)) {
            z = false;
        }
        ev.offsetLocation(left2, top);
        return z;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        float f;
        float f2;
        boolean z;
        Boolean valueOf;
        boolean z2;
        o.LJIIJ(ev, "ev");
        VT3 vt3 = this.LJLIL;
        int i = 0;
        if (vt3 != null) {
            VelocityTracker velocityTracker = vt3.LIZ.LJLLL;
            if (velocityTracker != null) {
                velocityTracker.addMovement(ev);
            }
            int action = ev.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        LynxOverlayViewNG lynxOverlayViewNG = vt3.LIZ;
                        lynxOverlayViewNG.LJLIL = 1;
                        if (lynxOverlayViewNG.LJLZ == null && (Math.abs(ev.getY() - vt3.LIZ.LJLLLLLL) > 0.0f || Math.abs(ev.getX() - vt3.LIZ.LJLLLL) > 0.0f)) {
                            LynxOverlayViewNG lynxOverlayViewNG2 = vt3.LIZ;
                            if (lynxOverlayViewNG2.LJLJLLL != null) {
                                if (!lynxOverlayViewNG2.LJLL && ev.getY() - vt3.LIZ.LJLLLLLL > 0.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                valueOf = Boolean.valueOf(z2);
                            } else {
                                if (!lynxOverlayViewNG2.LJLL && Math.abs(ev.getY() - vt3.LIZ.LJLLLLLL) > Math.abs(ev.getX() - vt3.LIZ.LJLLLL)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                valueOf = Boolean.valueOf(z);
                            }
                            lynxOverlayViewNG2.LJLZ = valueOf;
                            vt3.LIZ.LJLLLLLL = ev.getY();
                        }
                    }
                } else {
                    vt3.LIZ.LJLIL = 2;
                }
            } else {
                LynxOverlayViewNG lynxOverlayViewNG3 = vt3.LIZ;
                lynxOverlayViewNG3.LJLIL = 0;
                lynxOverlayViewNG3.LJLJLLL = null;
                lynxOverlayViewNG3.LJLL = lynxOverlayViewNG3.LJIJJLI(lynxOverlayViewNG3.hitTest(ev.getX(), ev.getY()));
                LynxOverlayViewNG lynxOverlayViewNG4 = vt3.LIZ;
                lynxOverlayViewNG4.LJLZ = null;
                lynxOverlayViewNG4.LJLLLL = ev.getX();
                vt3.LIZ.LJLLLLLL = ev.getY();
            }
            VelocityTracker velocityTracker2 = vt3.LIZ.LJLLL;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            if (!o.LJ(vt3.LIZ.LJLZ, Boolean.FALSE)) {
                LynxOverlayViewNG lynxOverlayViewNG5 = vt3.LIZ;
                float x = ev.getX();
                VNU mContext = lynxOverlayViewNG5.mContext;
                o.LJFF(mContext, "mContext");
                Resources resources = mContext.getResources();
                o.LJFF(resources, "mContext.resources");
                float f3 = (x / resources.getDisplayMetrics().density) + 0.5f;
                LynxOverlayViewNG lynxOverlayViewNG6 = vt3.LIZ;
                float y = ev.getY();
                VNU mContext2 = lynxOverlayViewNG6.mContext;
                o.LJFF(mContext2, "mContext");
                Resources resources2 = mContext2.getResources();
                o.LJFF(resources2, "mContext.resources");
                float f4 = (y / resources2.getDisplayMetrics().density) + 0.5f;
                VelocityTracker velocityTracker3 = vt3.LIZ.LJLLL;
                if (velocityTracker3 != null) {
                    f = velocityTracker3.getXVelocity();
                } else {
                    f = 0.0f;
                }
                VelocityTracker velocityTracker4 = vt3.LIZ.LJLLL;
                if (velocityTracker4 != null) {
                    f2 = velocityTracker4.getYVelocity();
                } else {
                    f2 = 0.0f;
                }
                VNU lynxContext = lynxOverlayViewNG5.mContext;
                o.LJFF(lynxContext, "lynxContext");
                VNL vnl = lynxContext.LJLJJL;
                C49615Jdb c49615Jdb = new C49615Jdb(lynxOverlayViewNG5.getSign(), "overlaymoved");
                c49615Jdb.LIZJ(Float.valueOf(f3), "x");
                c49615Jdb.LIZJ(Float.valueOf(f4), "y");
                c49615Jdb.LIZJ(Float.valueOf(f), "vx");
                c49615Jdb.LIZJ(Float.valueOf(f2), "vy");
                c49615Jdb.LIZJ(Integer.valueOf(lynxOverlayViewNG5.LJLIL), "state");
                vnl.LIZIZ(c49615Jdb);
            }
            Boolean bool = vt3.LIZ.LJLZ;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
        }
        if (LIZIZ(ev)) {
            return super.dispatchTouchEvent(ev);
        }
        Iterator it = ((ArrayList) C79784VSy.LIZ).iterator();
        while (it.hasNext()) {
            VT1 vt1 = (VT1) it.next();
            if (vt1.LIZIZ.LIZIZ(ev) && (!o.LJ(this, vt1.LIZIZ))) {
                DialogC79783VSx dialogC79783VSx = vt1.LIZIZ;
                dialogC79783VSx.getClass();
                return super.dispatchTouchEvent(ev);
            }
        }
        ArrayList arrayList = (ArrayList) C79784VSy.LIZ;
        if (!(true ^ arrayList.isEmpty())) {
            return false;
        }
        DialogC79783VSx dialogC79783VSx2 = ((VT1) ListProtector.get(arrayList, 0)).LIZIZ;
        dialogC79783VSx2.getClass();
        Activity LJIIJJI = C78996UzQ.LJIIJJI(dialogC79783VSx2.LJLJI.mContext);
        if (LJIIJJI == null) {
            return false;
        }
        LynxOverlayViewNG lynxOverlayViewNG7 = dialogC79783VSx2.LJLJI;
        if (!lynxOverlayViewNG7.LJLJI || !lynxOverlayViewNG7.LJLJJI) {
            i = -((Number) dialogC79783VSx2.LJLILLLLZI.getValue()).intValue();
        }
        float f5 = i;
        ev.offsetLocation(-0.0f, -f5);
        boolean dispatchTouchEvent = LJIIJJI.dispatchTouchEvent(ev);
        ev.offsetLocation(0.0f, f5);
        return dispatchTouchEvent;
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
    public DialogC79783VSx(Context context, LynxOverlayViewNG overlay) {
        super(context, R.style.jl);
        o.LJIIJ(context, "context");
        o.LJIIJ(overlay, "overlay");
        this.LJLJI = overlay;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 320));
    }
}
