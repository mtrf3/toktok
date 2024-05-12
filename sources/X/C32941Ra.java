package X;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.o;

/* renamed from: X.1Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32941Ra implements InterfaceC13350fj {
    public final Context LIZ;

    @Override // X.InterfaceC13350fj
    public final void getCacheKey() {
    }

    public C32941Ra(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }

    @Override // X.InterfaceC13350fj
    public final Object LIZIZ(InterfaceC13460fu interfaceC13460fu) {
        boolean z;
        Typeface LJFF;
        boolean z2;
        Object LIZ;
        if (interfaceC13460fu instanceof C1RZ) {
            C1RZ c1rz = (C1RZ) interfaceC13460fu;
            InterfaceC13330fh interfaceC13330fh = c1rz.LIZIZ;
            Context context = this.LIZ;
            o.LJIIIIZZ(context, "context");
            return interfaceC13330fh.LIZIZ(context, c1rz);
        }
        if (!(interfaceC13460fu instanceof C32961Rc)) {
            return null;
        }
        int LIZIZ = interfaceC13460fu.LIZIZ();
        boolean z3 = false;
        if (LIZIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (LIZIZ == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                try {
                    Context context2 = this.LIZ;
                    o.LJIIIIZZ(context2, "context");
                    LIZ = C73040SlY.LJFF(context2, (C32961Rc) interfaceC13460fu);
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m12isFailureimpl(LIZ)) {
                    LIZ = null;
                }
                LJFF = (Typeface) LIZ;
            } else {
                if (LIZIZ == 2) {
                    z3 = true;
                }
                if (z3) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unknown loading type ");
                LIZ2.append((Object) C13550g3.LIZ(interfaceC13460fu.LIZIZ()));
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
            }
        } else {
            Context context3 = this.LIZ;
            o.LJIIIIZZ(context3, "context");
            LJFF = C73040SlY.LJFF(context3, (C32961Rc) interfaceC13460fu);
        }
        Context context4 = this.LIZ;
        o.LJIIIIZZ(context4, "context");
        C78866UxK.LJJLIIJ(LJFF, context4);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC13350fj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC13460fu r9, X.InterfaceC67352kd<? super android.graphics.Typeface> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.AnonymousClass218
            if (r0 == 0) goto L2b
            r6 = r10
            X.218 r6 = (X.AnonymousClass218) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r3 = r6.LJLJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r5 = 0
            r1 = 2
            r2 = 1
            java.lang.String r4 = "context"
            if (r0 == 0) goto L39
            if (r0 == r2) goto L52
            if (r0 == r1) goto L31
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2b:
            X.218 r6 = new X.218
            r6.<init>(r8, r10)
            goto L12
        L31:
            X.0fu r9 = r6.LJLILLLLZI
            X.1Ra r0 = r6.LJLIL
            X.C141335gf.LIZJ(r3)
            goto L77
        L39:
            X.C141335gf.LIZJ(r3)
            boolean r0 = r9 instanceof X.C1RZ
            if (r0 == 0) goto L56
            X.1RZ r9 = (X.C1RZ) r9
            X.0fh r1 = r9.LIZIZ
            android.content.Context r0 = r8.LIZ
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            r6.LJLJJL = r2
            java.lang.Object r3 = r1.LIZ()
            if (r3 != r7) goto L55
            return r7
        L52:
            X.C141335gf.LIZJ(r3)
        L55:
            return r3
        L56:
            boolean r0 = r9 instanceof X.C32961Rc
            if (r0 == 0) goto L85
            r3 = r9
            X.1Rc r3 = (X.C32961Rc) r3
            android.content.Context r2 = r8.LIZ
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r4)
            r6.LJLIL = r8
            r6.LJLILLLLZI = r9
            r6.LJLJJL = r1
            X.XIA r1 = X.C78613UtF.LIZJ
            X.2EC r0 = new X.2EC
            r0.<init>(r3, r2, r5)
            java.lang.Object r3 = X.XKX.LJI(r1, r0, r6)
            if (r3 != r7) goto L76
            return r7
        L76:
            r0 = r8
        L77:
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            r9.getClass()
            android.content.Context r0 = r0.LIZ
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            X.C78866UxK.LJJLIIJ(r3, r0)
            throw r5
        L85:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Unknown font type: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32941Ra.LIZ(X.0fu, X.2kd):java.lang.Object");
    }
}
