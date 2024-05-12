package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.ss.android.elearning.lingo.lynx.component.overlay.LynxOverlayViewNG;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VSw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC79782VSw extends Dialog {
    public final LynxOverlayViewNG LJLIL;
    public VT4 LJLILLLLZI;
    public MotionEvent LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;

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
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "572514774419295284")).LIZ) {
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
        o.LJIIIIZZ(context, "context");
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

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        boolean z;
        int indexOf;
        int i;
        View view;
        ViewGroup viewGroup;
        float f;
        float f2;
        boolean z2;
        Boolean valueOf;
        boolean z3;
        o.LJIIIZ(ev, "ev");
        this.LJLJI = ev;
        int action = ev.getAction();
        boolean z4 = false;
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.LJLJJI = true;
            }
        } else {
            this.LJLJJI = false;
        }
        VT4 vt4 = this.LJLILLLLZI;
        if (vt4 != null) {
            VelocityTracker velocityTracker = vt4.LIZ.LJLLLL;
            if (velocityTracker != null) {
                velocityTracker.addMovement(ev);
            }
            int action2 = ev.getAction();
            if (action2 != 0) {
                if (action2 != 1) {
                    if (action2 == 2) {
                        LynxOverlayViewNG lynxOverlayViewNG = vt4.LIZ;
                        lynxOverlayViewNG.LJLILLLLZI = 1;
                        if (lynxOverlayViewNG.LJZ == null && (Math.abs(ev.getY() - vt4.LIZ.LJLZ) > 0.0f || Math.abs(ev.getX() - vt4.LIZ.LJLLLLLL) > 0.0f)) {
                            LynxOverlayViewNG lynxOverlayViewNG2 = vt4.LIZ;
                            if (lynxOverlayViewNG2.LJLL != null) {
                                if (!lynxOverlayViewNG2.LJLLI && ev.getY() - vt4.LIZ.LJLZ > 0.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                valueOf = Boolean.valueOf(z3);
                            } else {
                                if (!lynxOverlayViewNG2.LJLLI && Math.abs(ev.getY() - vt4.LIZ.LJLZ) > Math.abs(ev.getX() - vt4.LIZ.LJLLLLLL)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                valueOf = Boolean.valueOf(z2);
                            }
                            lynxOverlayViewNG2.LJZ = valueOf;
                            vt4.LIZ.LJLZ = ev.getY();
                        }
                    }
                } else {
                    vt4.LIZ.LJLILLLLZI = 2;
                }
            } else {
                LynxOverlayViewNG lynxOverlayViewNG3 = vt4.LIZ;
                lynxOverlayViewNG3.LJLILLLLZI = 0;
                lynxOverlayViewNG3.LJLL = null;
                lynxOverlayViewNG3.LJLLI = lynxOverlayViewNG3.LJIJJLI(lynxOverlayViewNG3.hitTest(ev.getX(), ev.getY()));
                LynxOverlayViewNG lynxOverlayViewNG4 = vt4.LIZ;
                lynxOverlayViewNG4.LJZ = null;
                lynxOverlayViewNG4.LJLLLLLL = ev.getX();
                vt4.LIZ.LJLZ = ev.getY();
            }
            VelocityTracker velocityTracker2 = vt4.LIZ.LJLLLL;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(1000);
            }
            if (!o.LJ(vt4.LIZ.LJZ, Boolean.FALSE)) {
                LynxOverlayViewNG lynxOverlayViewNG5 = vt4.LIZ;
                float x = (ev.getX() / lynxOverlayViewNG5.mContext.getResources().getDisplayMetrics().density) + 0.5f;
                float y = (ev.getY() / vt4.LIZ.mContext.getResources().getDisplayMetrics().density) + 0.5f;
                VelocityTracker velocityTracker3 = vt4.LIZ.LJLLLL;
                if (velocityTracker3 != null) {
                    f = velocityTracker3.getXVelocity();
                } else {
                    f = 0.0f;
                }
                VelocityTracker velocityTracker4 = vt4.LIZ.LJLLLL;
                if (velocityTracker4 != null) {
                    f2 = velocityTracker4.getYVelocity();
                } else {
                    f2 = 0.0f;
                }
                VNL vnl = lynxOverlayViewNG5.mContext.LJLJJL;
                C49615Jdb c49615Jdb = new C49615Jdb(lynxOverlayViewNG5.getSign(), "overlaymoved");
                c49615Jdb.LIZJ(Float.valueOf(x), "x");
                c49615Jdb.LIZJ(Float.valueOf(y), "y");
                c49615Jdb.LIZJ(Float.valueOf(f), "vx");
                c49615Jdb.LIZJ(Float.valueOf(f2), "vy");
                c49615Jdb.LIZJ(Integer.valueOf(lynxOverlayViewNG5.LJLILLLLZI), "state");
                vnl.LIZIZ(c49615Jdb);
            }
            Boolean bool = vt4.LIZ.LJZ;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
        }
        float x2 = ev.getX();
        float y2 = ev.getY();
        LynxOverlayViewNG lynxOverlayViewNG6 = this.LJLIL;
        if (lynxOverlayViewNG6.LJLJI) {
            if (lynxOverlayViewNG6.LJLJJLL || lynxOverlayViewNG6.eventThrough()) {
                List<LynxBaseUI> mChildren = lynxOverlayViewNG6.mChildren;
                o.LJIIIIZZ(mChildren, "mChildren");
                for (LynxBaseUI lynxBaseUI : mChildren) {
                    if (lynxBaseUI.getTranslationX() + lynxBaseUI.getLeft() + lynxOverlayViewNG6.getLeft() < x2) {
                        if (lynxBaseUI.getTranslationX() + lynxOverlayViewNG6.getLeft() + lynxBaseUI.getLeft() + lynxBaseUI.getWidth() <= x2) {
                            continue;
                        } else if (lynxBaseUI.getTranslationY() + lynxBaseUI.getTop() + lynxOverlayViewNG6.getTop() >= y2) {
                            continue;
                        } else if (lynxBaseUI.getTranslationY() + lynxOverlayViewNG6.getTop() + lynxBaseUI.getTop() + lynxBaseUI.getHeight() > y2) {
                        }
                    }
                }
            }
            float left = this.LJLIL.getLeft();
            float top = this.LJLIL.getTop();
            ev.offsetLocation(-left, -top);
            LynxOverlayViewNG lynxOverlayViewNG7 = this.LJLIL;
            VPV vpv = lynxOverlayViewNG7.LLD;
            if (vpv != null && vpv.LJ(ev, lynxOverlayViewNG7)) {
                z = true;
            } else {
                z = false;
            }
            ev.offsetLocation(left, top);
            if (z) {
                return super.dispatchTouchEvent(ev);
            }
        }
        String str = this.LJLIL.LJLJLJ;
        ArrayList arrayList = (ArrayList) C79785VSz.LIZ;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (o.LJ(((VT0) next).LIZ, str)) {
                    if (next != null && (indexOf = ((ArrayList) C79785VSz.LIZ).indexOf(next)) >= 0 && indexOf < ((ArrayList) C79785VSz.LIZ).size()) {
                        DialogC79782VSw dialogC79782VSw = ((VT0) ListProtector.get(arrayList, indexOf)).LIZIZ;
                        dialogC79782VSw.getClass();
                        Object rootView = dialogC79782VSw.LJLIL.mView.getRootView();
                        if (rootView == null) {
                            rootView = Boolean.FALSE;
                        }
                        C68322mC c68322mC = new C68322mC();
                        try {
                            new AqS156S0100000_6(c68322mC, (C68322mC<List<View>>) 117).invoke();
                        } catch (Throwable unused) {
                        }
                        LynxOverlayViewNG lynxOverlayViewNG8 = dialogC79782VSw.LJLIL;
                        if (!lynxOverlayViewNG8.LJLJJI || !lynxOverlayViewNG8.LJLJJL) {
                            i = -((Number) dialogC79782VSw.LJLJJL.getValue()).intValue();
                        } else {
                            i = 0;
                        }
                        float f3 = i;
                        ev.offsetLocation(-0.0f, -f3);
                        List list = (List) c68322mC.element;
                        if (list != null) {
                            for (int indexOf2 = list.indexOf(rootView) - 1; -1 < indexOf2; indexOf2--) {
                                view = (View) ListProtector.get(list, indexOf2);
                                view.getLocationInWindow(new int[2]);
                                if (ev.getRawX() >= r1[0]) {
                                    if (ev.getRawX() <= view.getWidth() + r1[0] && ev.getRawY() >= r1[1]) {
                                        if (ev.getRawY() <= view.getHeight() + r1[1]) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        view = null;
                        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                            z4 = viewGroup.dispatchTouchEvent(ev);
                        }
                        ev.offsetLocation(0.0f, f3);
                    }
                }
            }
        }
        return z4;
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
    public DialogC79782VSw(Context context, LynxOverlayViewNG overlay) {
        super(context, R.style.jk);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(overlay, "overlay");
        this.LJLIL = overlay;
        this.LJLJJI = true;
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 376));
    }
}
