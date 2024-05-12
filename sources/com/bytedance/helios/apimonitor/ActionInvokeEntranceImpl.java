package com.bytedance.helios.apimonitor;

import X.AbstractC66131PxP;
import X.C113554cx;
import X.C16880lQ;
import X.C65852Psu;
import X.C65929Pu9;
import X.C65985Pv3;
import X.C65986Pv4;
import X.C66059PwF;
import X.C66083Pwd;
import X.C66113Px7;
import X.C66115Px9;
import X.C66120PxE;
import X.C66128PxM;
import X.C66129PxN;
import X.EnumC65997PvF;
import X.EnumC66029Pvl;
import X.HandlerThreadC64418PPy;
import X.InterfaceC66159Pxr;
import X.OSZ;
import X.X1D;
import Y.ARunnableS47S0100000_11;
import android.util.Pair;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.signal.Signal;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ActionInvokeEntranceImpl implements InterfaceC66159Pxr {
    public final ThreadLocal<Map<Integer, String>> eventUuidThreadLocal = new ThreadLocal<>();

    public String getEventUuid(int i) {
        return null;
    }

    public void setEventUuid(int i) {
    }

    public final ThreadLocal<Map<Integer, String>> getEventUuidThreadLocal() {
        return this.eventUuidThreadLocal;
    }

    private final Integer getValidId(Integer num) {
        if (num == null) {
            return num;
        }
        if (num.intValue() == 200000) {
            return Integer.valueOf(ImagePreloadExperiment.PRIORITY_DEFAULT);
        }
        if (num.intValue() == 200001) {
            return 100001;
        }
        if (num.intValue() == 200002) {
            return 100002;
        }
        if (num.intValue() != 200004) {
            return num;
        }
        return 100004;
    }

    @Override // X.InterfaceC66159Pxr
    public Pair<Boolean, Object> actionIntercept(C66120PxE c66120PxE) {
        Integer num;
        long currentTimeMillis;
        if (c66120PxE != null) {
            String str = c66120PxE.LJLILLLLZI;
            if (o.LJ(str, "cr")) {
                C65985Pv3.LIZIZ(EnumC66029Pvl.GUARD, EnumC65997PvF.CAMERA, new Signal("actionIntercept"));
            } else if (o.LJ(str, "ar")) {
                C65985Pv3.LIZIZ(EnumC66029Pvl.GUARD, EnumC65997PvF.AUDIO, new Signal("actionIntercept"));
            }
        }
        try {
            o.LJIIIIZZ(HeliosEnvImpl.get(), "HeliosEnvImpl.get()");
            currentTimeMillis = System.currentTimeMillis();
        } catch (Throwable th) {
            OSZ[] oszArr = new OSZ[1];
            if (c66120PxE != null) {
                num = Integer.valueOf(c66120PxE.LJLJI);
            } else {
                num = null;
            }
            oszArr[0] = new OSZ("id", String.valueOf(num));
            C66059PwF.LIZIZ(new C65852Psu((Thread) null, th, "label_action_intercept_event", C113554cx.LJJLIIIIJ(oszArr), 17));
        }
        if (c66120PxE != null && filterInvoke(c66120PxE.LJLJI, c66120PxE.LLI.getParameters())) {
            return C66113Px7.LIZIZ(c66120PxE);
        }
        C65929Pu9.LIZ(currentTimeMillis, "actionIntercept", false);
        return new Pair<>(Boolean.FALSE, null);
    }

    @Override // X.InterfaceC66159Pxr
    public void actionInvoke(C66120PxE c66120PxE) {
        if (c66120PxE != null) {
            String str = c66120PxE.LJLILLLLZI;
            if (o.LJ(str, "cr")) {
                C65985Pv3.LIZIZ(EnumC66029Pvl.GUARD, EnumC65997PvF.CAMERA, new Signal("actionIntercept"));
            } else if (o.LJ(str, "ar")) {
                C65985Pv3.LIZIZ(EnumC66029Pvl.GUARD, EnumC65997PvF.AUDIO, new Signal("actionIntercept"));
            }
        }
        o.LJIIIIZZ(HeliosEnvImpl.get(), "HeliosEnvImpl.get()");
        long currentTimeMillis = System.currentTimeMillis();
        if (c66120PxE != null) {
            if ((C66113Px7.LIZ(c66120PxE) || c66120PxE.LIZIZ()) && filterInvoke(c66120PxE.LJLJI, c66120PxE.LLI.getParameters())) {
                AbstractC66131PxP abstractC66131PxP = C66129PxN.LIZJ.get(Integer.valueOf(c66120PxE.LJLJI));
                if (abstractC66131PxP == null) {
                    abstractC66131PxP = C66128PxM.LIZIZ;
                }
                Throwable th = c66120PxE.LJLJJLL;
                if (th == null) {
                    th = new Throwable();
                }
                abstractC66131PxP.LJ(c66120PxE, th);
                HandlerThreadC64418PPy.LIZ();
                HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS47S0100000_11(c66120PxE, 24));
            }
            C66083Pwd.LJFF(c66120PxE);
        }
        C65929Pu9.LIZ(currentTimeMillis, "actionInvoke", false);
    }

    @Override // X.InterfaceC66159Pxr
    public boolean isEnabled(C66120PxE c66120PxE) {
        if (c66120PxE != null && C66113Px7.LIZJ(c66120PxE.LJLJI) && C66113Px7.LIZLLL(c66120PxE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean filterInvoke(int r7, java.lang.Object[] r8) {
        /*
            r6 = this;
            r0 = 102003(0x18e73, float:1.42937E-40)
            r5 = 1
            if (r7 == r0) goto Lb
            r0 = 102004(0x18e74, float:1.42938E-40)
            if (r7 != r0) goto L56
        Lb:
            if (r8 == 0) goto L54
            int r0 = r8.length
        Le:
            r4 = 2
            r3 = 0
            if (r0 < r4) goto L52
            if (r8 == 0) goto L50
            r1 = r8[r5]
        L16:
            java.lang.String r0 = "android_id"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L52
            r2 = 1
        L1f:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "filterInvoke id="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " result="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " parameters="
            r1.append(r0)
            if (r8 == 0) goto L41
            int r0 = r8.length
            if (r0 < r4) goto L48
            if (r8 == 0) goto L41
            r3 = r8[r5]
        L41:
            r1.append(r3)
            X.X1D.LIZIZ(r1)
            return r2
        L48:
            if (r8 == 0) goto L41
            int r0 = r8.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L41
        L50:
            r1 = r3
            goto L16
        L52:
            r2 = 0
            goto L1f
        L54:
            r0 = 0
            goto Le
        L56:
            r0 = 10301(0x283d, float:1.4435E-41)
            if (r7 != r0) goto L62
            if (r8 == 0) goto L5f
            int r0 = r8.length
            if (r0 != 0) goto L60
        L5f:
            return r5
        L60:
            r5 = 0
            goto L5f
        L62:
            if (r7 != r0) goto L69
            if (r8 == 0) goto L69
            int r0 = r8.length
            if (r0 != 0) goto L6a
        L69:
            return r5
        L6a:
            r5 = 0
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.apimonitor.ActionInvokeEntranceImpl.filterInvoke(int, java.lang.Object[]):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC66159Pxr
    public C66120PxE createPrivacyEvent(Object obj, Object obj2, Object[] objArr, int i, String str, long j, boolean z, boolean z2, String className, String memberName) {
        Object[] objArr2;
        o.LJIIIZ(className, "className");
        o.LJIIIZ(memberName, "memberName");
        if (z) {
            Object obj3 = null;
            if (obj2 == null || !(obj2 instanceof Method)) {
                return null;
            }
            StringBuilder LIZ = X1D.LIZ();
            Method method = (Method) obj2;
            Class<?> declaringClass = method.getDeclaringClass();
            o.LJIIIIZZ(declaringClass, "thisOrClass.declaringClass");
            LIZ.append(declaringClass.getName());
            LIZ.append('.');
            LIZ.append(method.getName());
            Integer validId = getValidId(C65986Pv4.LIZ.get(X1D.LIZIZ(LIZ)));
            if (validId == null) {
                return null;
            }
            int intValue = validId.intValue();
            if (objArr == null || objArr.length == 0) {
                objArr2 = 0;
            } else {
                Object obj4 = objArr[0];
                if (obj4 == null) {
                    obj4 = method.getDeclaringClass();
                }
                if (objArr.length > 1) {
                    obj3 = (Object[]) objArr[1];
                }
                objArr2 = obj3;
                obj3 = obj4;
            }
            Class<?> returnType = method.getReturnType();
            o.LJIIIIZZ(returnType, "thisOrClass.returnType");
            String LJLLILLLL = C16880lQ.LJLLILLLL(returnType);
            String eventUuid = getEventUuid(intValue);
            Class<?> declaringClass2 = method.getDeclaringClass();
            o.LJIIIIZZ(declaringClass2, "thisOrClass.declaringClass");
            String LJJJJLL = ujb.o.LJJJJLL(declaringClass2.getName(), '.', '/', false);
            String name = method.getName();
            o.LJIIIIZZ(name, "thisOrClass.name");
            return new C66115Px9(obj, obj3, objArr2, intValue, j, true, z2, LJLLILLLL, eventUuid, LJJJJLL, name).LIZIZ();
        }
        return new C66115Px9(obj, obj2, objArr, i, j, false, z2, str, getEventUuid(i), className, memberName).LIZIZ();
    }
}
