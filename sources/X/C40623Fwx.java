package X;

import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.google.android.play.core.assetpacks.c1;
import com.google.android.play.core.assetpacks.h0;
import com.google.android.play.core.assetpacks.n0;
import com.google.android.play.core.assetpacks.p2;
import com.google.android.play.core.assetpacks.q0;
import com.google.android.play.core.assetpacks.t;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.Fwx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40623Fwx implements InterfaceC153055zZ {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public Object LJLJL;
    public Object LJLJLJ;

    public /* synthetic */ C40623Fwx(p2 p2Var, InterfaceC153055zZ interfaceC153055zZ, InterfaceC153055zZ interfaceC153055zZ2, C40632Fx6 c40632Fx6, InterfaceC153055zZ interfaceC153055zZ3, InterfaceC153055zZ interfaceC153055zZ4, InterfaceC153055zZ interfaceC153055zZ5, InterfaceC153055zZ interfaceC153055zZ6) {
        this.LJLIL = p2Var;
        this.LJLILLLLZI = interfaceC153055zZ;
        this.LJLJI = interfaceC153055zZ2;
        this.LJLJJI = c40632Fx6;
        this.LJLJJL = interfaceC153055zZ3;
        this.LJLJJLL = interfaceC153055zZ4;
        this.LJLJL = interfaceC153055zZ5;
        this.LJLJLJ = interfaceC153055zZ6;
    }

    public static Object LIZIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6962452973028555511"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        Context a = ((p2) ((InterfaceC153055zZ) this.LJLIL)).a();
        Object a2 = ((InterfaceC153055zZ) this.LJLILLLLZI).a();
        Object a3 = ((InterfaceC153055zZ) this.LJLJI).a();
        InterfaceC38408F5o LIZIZ = C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLJJI);
        Object a4 = ((InterfaceC153055zZ) this.LJLJJL).a();
        return new t(a, (c1) a2, (n0) a3, LIZIZ, (q0) a4, (h0) ((InterfaceC153055zZ) this.LJLJJLL).a(), C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLJL), C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLJLJ));
    }

    public final Field LIZLLL() {
        if (this.LJLJLJ == null) {
            try {
                this.LJLJLJ = LIZJ(Reflect.on(C16880lQ.LLIIIJ()).field("mDisplayEventReceiver", new Class[0]).get().getClass(), Boolean.class, "mHavePendingVsync");
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return (Field) this.LJLJLJ;
    }

    public /* synthetic */ C40623Fwx() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AccessibleObject LIZ(AccessibleObject accessibleObject) {
        if (accessibleObject == 0) {
            return null;
        }
        if (accessibleObject instanceof Member) {
            Member member = (Member) accessibleObject;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return accessibleObject;
            }
        }
        if (!accessibleObject.isAccessible()) {
            accessibleObject.setAccessible(true);
        }
        return accessibleObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0057, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Field LIZJ(java.lang.Class r8, java.lang.Class r9, java.lang.String r10) {
        /*
            r7 = this;
            r3 = 1
            r5 = 0
            java.lang.Object r0 = r7.LJLJI     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L19
            if (r0 != 0) goto L1d
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r2 = "getDeclaredField"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L19
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r5] = r0     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L19
            r7.LJLJI = r0     // Catch: java.lang.Exception -> L19
            goto L1d
        L19:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L1d:
            java.lang.Object r2 = r7.LJLJI
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r6 = 0
            if (r2 != 0) goto L25
            return r6
        L25:
            r1 = r8
        L26:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L37
            r0[r5] = r10     // Catch: java.lang.Exception -> L37
            java.lang.Object r0 = LIZIZ(r1, r2, r0)     // Catch: java.lang.Exception -> L37
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Exception -> L37
            java.lang.reflect.AccessibleObject r0 = LIZ(r0)     // Catch: java.lang.Exception -> L37
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Exception -> L37
            goto L42
        L37:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 != 0) goto L26
            goto L43
        L42:
            return r0
        L43:
            java.lang.Object r0 = r7.LJLJJI     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L56
            if (r0 != 0) goto L5a
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r1 = "getDeclaredFields"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Exception -> L56
            r7.LJLJJI = r0     // Catch: java.lang.Exception -> L56
            goto L5a
        L56:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L5a:
            java.lang.Object r1 = r7.LJLJJI
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L61
            return r6
        L61:
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L95
            java.lang.Object r4 = LIZIZ(r8, r1, r0)     // Catch: java.lang.Exception -> L95
            java.lang.reflect.Field[] r4 = (java.lang.reflect.Field[]) r4     // Catch: java.lang.Exception -> L95
            int r3 = r4.length     // Catch: java.lang.Exception -> L95
        L6a:
            if (r5 >= r3) goto L99
            r2 = r4[r5]     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = r2.getName()     // Catch: java.lang.Exception -> L95
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L91
            java.lang.Class r0 = r2.getType()     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = r9.getName()     // Catch: java.lang.Exception -> L95
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L91
            java.lang.reflect.AccessibleObject r0 = LIZ(r2)     // Catch: java.lang.Exception -> L95
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Exception -> L95
            goto L94
        L91:
            int r5 = r5 + 1
            goto L6a
        L94:
            return r0
        L95:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40623Fwx.LIZJ(java.lang.Class, java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x005d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Method LJ(java.lang.Class r9, java.lang.String r10, java.lang.Class... r11) {
        /*
            r8 = this;
            r3 = 2
            r7 = 1
            r5 = 0
            java.lang.Object r0 = r8.LJLIL     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L1e
            if (r0 != 0) goto L22
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r2 = "getDeclaredMethod"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L1e
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r5] = r0     // Catch: java.lang.Exception -> L1e
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            r1[r7] = r0     // Catch: java.lang.Exception -> L1e
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r2, r1)     // Catch: java.lang.Exception -> L1e
            r8.LJLIL = r0     // Catch: java.lang.Exception -> L1e
            goto L22
        L1e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L22:
            java.lang.Object r2 = r8.LJLIL
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r6 = 0
            if (r2 != 0) goto L2a
            return r6
        L2a:
            r1 = r9
        L2b:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L3e
            r0[r5] = r10     // Catch: java.lang.Exception -> L3e
            r0[r7] = r11     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = LIZIZ(r1, r2, r0)     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.AccessibleObject r0 = LIZ(r0)     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L3e
            goto L49
        L3e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 != 0) goto L2b
            goto L4a
        L49:
            return r0
        L4a:
            java.lang.Object r0 = r8.LJLILLLLZI     // Catch: java.lang.Exception -> L5d
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto L61
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r1 = "getDeclaredMethods"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L5d
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Exception -> L5d
            r8.LJLILLLLZI = r0     // Catch: java.lang.Exception -> L5d
            goto L61
        L5d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L61:
            java.lang.Object r1 = r8.LJLILLLLZI
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L68
            return r6
        L68:
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L94
            java.lang.Object r4 = LIZIZ(r9, r1, r0)     // Catch: java.lang.Exception -> L94
            java.lang.reflect.Method[] r4 = (java.lang.reflect.Method[]) r4     // Catch: java.lang.Exception -> L94
            int r3 = r4.length     // Catch: java.lang.Exception -> L94
        L71:
            if (r5 >= r3) goto L98
            r2 = r4[r5]     // Catch: java.lang.Exception -> L94
            java.lang.String r0 = r2.getName()     // Catch: java.lang.Exception -> L94
            boolean r0 = r0.equals(r10)     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L90
            java.lang.Class[] r0 = r2.getParameterTypes()     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L90
            int r1 = r0.length     // Catch: java.lang.Exception -> L94
            int r0 = r11.length     // Catch: java.lang.Exception -> L94
            if (r1 != r0) goto L90
            java.lang.reflect.AccessibleObject r0 = LIZ(r2)     // Catch: java.lang.Exception -> L94
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L94
            goto L93
        L90:
            int r5 = r5 + 1
            goto L71
        L93:
            return r0
        L94:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40623Fwx.LJ(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
