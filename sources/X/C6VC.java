package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6VC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6VC implements InterfaceC152085y0 {
    public final C6VF LIZ;
    public final C6V2 LIZIZ;
    public final C6VB LIZJ;
    public final ViewGroup LIZLLL;

    public final void LIZJ() {
        View contentView;
        Iterator<C6V4> it = this.LIZ.LIZIZ.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            C6VA c6va = it.next().LIZJ;
            if (c6va != null && (contentView = c6va.getContentView()) != null) {
                C16360ka.LJJ(contentView, f);
                f = 1.0f + f;
            }
        }
    }

    @Override // X.InterfaceC152085y0
    public final C6VB getRootView() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC152085y0
    public final void LIZ(C6V4 interactItem) {
        o.LJIIIZ(interactItem, "interactItem");
        C6VF c6vf = this.LIZ;
        c6vf.getClass();
        ((ArrayList) c6vf.LIZ).remove(interactItem);
        C6VA c6va = interactItem.LIZJ;
        if (c6va != null) {
            C6VB c6vb = this.LIZJ;
            View contentView = c6va.getContentView();
            if (C78996UzQ.LJJIIJZLJL(contentView)) {
                C78996UzQ.LJI();
            }
            c6vb.removeView(contentView);
        }
    }

    @Override // X.InterfaceC152085y0
    public final void LIZIZ(C6V4 interactItem) {
        o.LJIIIZ(interactItem, "interactItem");
        C6VF c6vf = this.LIZ;
        c6vf.getClass();
        ListProtector.add(c6vf.LIZ, 0, interactItem);
        C40675Fxn.LJJLIIIJ(c6vf.LIZ, c6vf.LIZJ);
        C6VA c6va = interactItem.LIZJ;
        if (c6va != null) {
            if (c6va.getContentView().getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                c6va.getContentView().setLayoutParams(layoutParams);
            }
            this.LIZJ.addView(c6va.getContentView());
            LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.6VD] */
    public C6VC(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        this.LIZLLL = viewGroup;
        final C6VF c6vf = new C6VF();
        this.LIZ = c6vf;
        final ?? r0 = new C6VG() { // from class: X.6VD
            @Override // X.C6VG
            public final void LIZ(C6V4 item) {
                int indexOf;
                o.LJIIIZ(item, "item");
                C6VF c6vf2 = C6VC.this.LIZ;
                c6vf2.getClass();
                int indexOf2 = ((ArrayList) c6vf2.LIZ).indexOf(item);
                if (indexOf2 >= 0) {
                    Iterator it = ((ArrayList) c6vf2.LIZ).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((C6V4) next).LIZIZ == item.LIZIZ) {
                            if (next != null && (indexOf = ((ArrayList) c6vf2.LIZ).indexOf(next)) >= 0 && indexOf2 != indexOf) {
                                Collections.swap(c6vf2.LIZ, indexOf2, indexOf);
                            }
                        }
                    }
                }
                C6VC.this.LIZJ();
            }
        };
        Object newProxyInstance = Proxy.newProxyInstance(C6VC.class.getClassLoader(), new Class[]{C6V2.class}, new InvocationHandler(c6vf, r0) { // from class: X.6VH
            public final C6VF LIZ;
            public final C6VG LIZIZ;
            public final boolean LIZJ = C82891Wg3.LIZIZ();

            public static Object LIZ(C6V4 c6v4, Method method, Object[] objArr) {
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{c6v4, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7367148108697852495"));
                return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(c6v4, objArr);
            }

            {
                this.LIZ = c6vf;
                this.LIZIZ = r0;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                C6VG c6vg;
                boolean z = false;
                if (method.getReturnType().equals(Boolean.TYPE)) {
                    int i = 0;
                    while (true) {
                        if (i >= ((ArrayList) this.LIZ.LIZIZ).size()) {
                            break;
                        }
                        C6V4 c6v4 = (C6V4) ListProtector.get(this.LIZ.LIZIZ, i);
                        if (((Boolean) LIZ(c6v4, method, objArr)).booleanValue()) {
                            if (method.getName().equals("onDown") && (c6vg = this.LIZIZ) != null) {
                                c6vg.LIZ(c6v4);
                            }
                            if (this.LIZJ) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("handleBoolean: methodName=");
                                LIZ.append(method.getName());
                                LIZ.append(",i=");
                                LIZ.append(i);
                                LIZ.append(",size=");
                                LIZ.append(((ArrayList) this.LIZ.LIZIZ).size());
                                LIZ.append(",item=");
                                LIZ.append(c6v4);
                                C124004to.LIZ(X1D.LIZIZ(LIZ));
                            }
                            z = true;
                        } else {
                            i++;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                int size = ((ArrayList) this.LIZ.LIZIZ).size();
                for (int i2 = 0; i2 < size; i2++) {
                    C6V4 c6v42 = (C6V4) ListProtector.get(this.LIZ.LIZIZ, i2);
                    LIZ(c6v42, method, objArr);
                    if (this.LIZJ) {
                        StringBuilder LIZJ = C06460Ne.LIZJ("i=", i2, ",size=", size, ",methodName=");
                        LIZJ.append(method.getName());
                        LIZJ.append(",item=");
                        LIZJ.append(c6v42);
                        C124004to.LIZ(X1D.LIZIZ(LIZJ));
                    }
                }
                return null;
            }
        });
        if (newProxyInstance != null) {
            C6V2 c6v2 = (C6V2) newProxyInstance;
            this.LIZIZ = c6v2;
            C6VB c6vb = new C6VB(context);
            c6vb.setOnGestureListener(c6v2);
            c6vb.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (viewGroup != null) {
                viewGroup.addView(c6vb);
            }
            this.LIZJ = c6vb;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.createx.editor.gesture.GestureLayout.OnGestureListener");
    }
}
