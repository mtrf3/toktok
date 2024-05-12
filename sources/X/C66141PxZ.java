package X;

import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import java.util.Iterator;

/* renamed from: X.PxZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66141PxZ implements InterfaceC51640KOm {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC51640KOm
    public final void LIZ(Object[] objArr) {
        C66155Pxn c66155Pxn;
        try {
            Object obj = objArr[1];
            if (obj != null) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (layoutParams.type != 2038) {
                        return;
                    }
                } else if (!C66137PxV.LIZ.contains(Integer.valueOf(layoutParams.type))) {
                    return;
                }
                Object obj2 = objArr[0];
                if (obj2 != null) {
                    View view = (View) obj2;
                    Iterator<C66155Pxn> it = C66137PxV.LIZIZ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c66155Pxn = it.next();
                            C66155Pxn c66155Pxn2 = c66155Pxn;
                            if (c66155Pxn2.LJLIL == view.getId() && c66155Pxn2.LJLILLLLZI == view.hashCode()) {
                                break;
                            }
                        } else {
                            c66155Pxn = null;
                            break;
                        }
                    }
                    C66155Pxn c66155Pxn3 = c66155Pxn;
                    if (c66155Pxn3 == null) {
                        c66155Pxn3 = new C66155Pxn(view.getId(), view.hashCode());
                    }
                    C66137PxV.LIZ(c66155Pxn3);
                    C66137PxV.LIZIZ.add(c66155Pxn3);
                    C66137PxV.LIZIZ("onWindowViewAdd", c66155Pxn3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        } catch (Exception e) {
            C66059PwF.LIZIZ(new C65852Psu((Thread) null, (Throwable) e, "label_floating_view_event", (java.util.Map) (0 == true ? 1 : 0), 25));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC51640KOm
    public final void LIZIZ(Object[] objArr) {
        C66155Pxn c66155Pxn;
        try {
            Object obj = objArr[0];
            if (obj != null) {
                View view = (View) obj;
                Iterator<C66155Pxn> it = C66137PxV.LIZIZ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c66155Pxn = it.next();
                        C66155Pxn c66155Pxn2 = c66155Pxn;
                        if (c66155Pxn2.LJLIL == view.getId() && c66155Pxn2.LJLILLLLZI == view.hashCode()) {
                            break;
                        }
                    } else {
                        c66155Pxn = null;
                        break;
                    }
                }
                C66155Pxn c66155Pxn3 = c66155Pxn;
                if (c66155Pxn3 != null) {
                    C66137PxV.LIZIZ.remove(c66155Pxn3);
                    C66137PxV.LIZIZ("onWindowViewRemove", c66155Pxn3);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        } catch (Exception e) {
            C66059PwF.LIZIZ(new C65852Psu((Thread) null, (Throwable) e, "label_floating_view_event", (java.util.Map) (0 == true ? 1 : 0), 25));
        }
    }
}
