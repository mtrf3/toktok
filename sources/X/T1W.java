package X;

import java.util.Collection;
import java.util.List;

/* loaded from: classes13.dex */
public final class T1W {
    public static final <T> Object LIZ(Collection<? extends InterfaceC68342mE<? extends T>> collection, InterfaceC67352kd<? super List<? extends T>> interfaceC67352kd) {
        if (collection.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        Object[] array = collection.toArray(new InterfaceC68342mE[0]);
        if (array != null) {
            return new T2L((InterfaceC68342mE[]) array).LIZ(interfaceC67352kd);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final <T> Object LIZIZ(InterfaceC68342mE<? extends T>[] interfaceC68342mEArr, InterfaceC67352kd<? super List<? extends T>> interfaceC67352kd) {
        if (interfaceC68342mEArr.length == 0) {
            return C61878OQg.INSTANCE;
        }
        return new T2L(interfaceC68342mEArr).LIZ(interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003a -> B:10:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(X.InterfaceC79150V4o[] r6, X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            boolean r0 = r7 instanceof X.T1X
            if (r0 == 0) goto L43
            r5 = r7
            X.T1X r5 = (X.T1X) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 != r3) goto L4c
            int r2 = r5.LJLJI
            int r0 = r5.LJLILLLLZI
            java.lang.Object r6 = r5.LJLIL
            X.V4o[] r6 = (X.InterfaceC79150V4o[]) r6
            X.C141335gf.LIZJ(r1)
        L28:
            int r2 = r2 + 1
        L2a:
            if (r2 >= r0) goto L49
            r1 = r6[r2]
            r5.LJLIL = r6
            r5.LJLILLLLZI = r0
            r5.LJLJI = r2
            r5.LJLJJL = r3
            java.lang.Object r1 = r1.LJJJJ(r5)
            if (r1 != r4) goto L28
            return r4
        L3d:
            X.C141335gf.LIZJ(r1)
            int r0 = r6.length
            r2 = 0
            goto L2a
        L43:
            X.T1X r5 = new X.T1X
            r5.<init>(r7)
            goto L12
        L49:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T1W.LIZJ(X.V4o[], X.2kd):java.lang.Object");
    }
}
