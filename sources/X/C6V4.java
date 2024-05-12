package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: X.6V4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6V4 implements C6V2 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final C6VA LIZJ;
    public final C6V2 LIZLLL;
    public final /* synthetic */ C6V2 LJ;

    @Override // X.C6V2
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        this.LJ.LJIIIIZZ(motionEvent);
    }

    @Override // X.C6V2
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        return this.LJ.LJJIIZI(motionEvent);
    }

    @Override // X.C6V2
    public final boolean LJJIZ(float f) {
        return this.LJ.LJJIZ(f);
    }

    @Override // X.C6V2
    public final boolean LJJJ(MotionEvent motionEvent) {
        return this.LJ.LJJJ(motionEvent);
    }

    @Override // X.C6V2
    public final boolean LJJJI() {
        return this.LJ.LJJJI();
    }

    @Override // X.C6V2
    public final boolean LJJJIL() {
        return this.LJ.LJJJIL();
    }

    @Override // X.C6V2
    public final boolean LJJLIL(C82537WaL c82537WaL, float f, float f2) {
        return this.LJ.LJJLIL(c82537WaL, f, f2);
    }

    @Override // X.C6V2
    public final boolean LJLI(C82537WaL c82537WaL) {
        return this.LJ.LJLI(c82537WaL);
    }

    @Override // X.C6V2
    public final boolean LJLJI(float f) {
        return this.LJ.LJLJI(f);
    }

    @Override // X.C6V2
    public final void LJLJJI(C82537WaL c82537WaL) {
        this.LJ.LJLJJI(c82537WaL);
    }

    @Override // X.C6V2
    public final boolean LLLLLLLZIL(C82536WaK c82536WaK) {
        return this.LJ.LLLLLLLZIL(c82536WaK);
    }

    @Override // X.C6V2
    public final boolean LLLLLLZ(float f) {
        return this.LJ.LLLLLLZ(f);
    }

    @Override // X.C6V2
    public final boolean onDown(MotionEvent motionEvent) {
        return this.LJ.onDown(motionEvent);
    }

    @Override // X.C6V2
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LJ.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C6V2
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return this.LJ.onScale(scaleGestureDetector);
    }

    @Override // X.C6V2
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.LJ.onScaleBegin(scaleGestureDetector);
    }

    @Override // X.C6V2
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.LJ.onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C6V2
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.LJ.onSingleTapConfirmed(motionEvent);
    }

    @Override // X.C6V2
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.LJ.onSingleTapUp(motionEvent);
    }

    public final String toString() {
        String str;
        View contentView;
        if (this.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(super.toString());
            LIZ.append(",level=");
            LIZ.append(this.LIZIZ);
            LIZ.append(",gestureInteractView=");
            C6VA c6va = this.LIZJ;
            String str2 = null;
            if (c6va != null && (contentView = c6va.getContentView()) != null) {
                str = C16880lQ.LJLLJ(contentView.getClass());
            } else {
                str = null;
            }
            Q89.LIZIZ(LIZ, str, ',', "gestureListener=");
            C6V2 c6v2 = this.LIZLLL;
            if (c6v2 != null) {
                str2 = C16880lQ.LJLLJ(c6v2.getClass());
            }
            LIZ.append(str2);
            return X1D.LIZIZ(LIZ);
        }
        return super.toString();
    }

    public C6V4(int i, final C6V2 c6v2) {
        Object newProxyInstance = Proxy.newProxyInstance(C6VA.class.getClassLoader(), new Class[]{C6V2.class}, new InvocationHandler(c6v2) { // from class: X.6VI
            public final C6VA LIZ = null;
            public final C6V2 LIZIZ;

            public static Object LIZ(C6V2 c6v22, Method method, Object[] objArr) {
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{c6v22, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-2054075300295756565"));
                return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(c6v22, objArr);
            }

            {
                this.LIZIZ = c6v2;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                boolean z;
                boolean z2;
                boolean z3 = false;
                if (method.getReturnType().equals(Boolean.TYPE)) {
                    if (objArr != null) {
                        for (Object obj2 : objArr) {
                            if (obj2 == null) {
                                return Boolean.FALSE;
                            }
                        }
                    }
                    C6VA c6va = this.LIZ;
                    if (c6va != null) {
                        z = ((Boolean) LIZ(c6va, method, objArr)).booleanValue();
                    } else {
                        z = false;
                    }
                    C6V2 c6v22 = this.LIZIZ;
                    if (c6v22 != null) {
                        z2 = ((Boolean) LIZ(c6v22, method, objArr)).booleanValue();
                    } else {
                        z2 = false;
                    }
                    if (z || z2) {
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
                if (objArr != null) {
                    for (Object obj3 : objArr) {
                        if (obj3 == null) {
                            return null;
                        }
                    }
                }
                C6VA c6va2 = this.LIZ;
                if (c6va2 != null) {
                    LIZ(c6va2, method, objArr);
                }
                C6V2 c6v23 = this.LIZIZ;
                if (c6v23 != null) {
                    LIZ(c6v23, method, objArr);
                }
                return null;
            }
        });
        if (newProxyInstance != null) {
            this.LJ = (C6V2) newProxyInstance;
            this.LIZIZ = i;
            this.LIZJ = null;
            this.LIZLLL = c6v2;
            this.LIZ = C82891Wg3.LIZIZ();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.createx.editor.gesture.GestureLayout.OnGestureListener");
    }
}
