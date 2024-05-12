package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0ZJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZJ {
    public static final C0ZJ LIZIZ = new C0ZJ();
    public static final C0ZJ LIZJ = new C0ZJ();
    public final C25710zf<C51121zY> LIZ = new C25710zf<>(new C51121zY[16]);

    public final void LIZIZ() {
        if (this.LIZ.LJIIJJI()) {
            LIZ(C51291zp.LJLIL);
        } else {
            "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString();
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
    }

    public final Boolean LIZ(InterfaceC88472Yns<? super C51171zd, Boolean> onFound) {
        o.LJIIIZ(onFound, "onFound");
        if (o.LJ(this, LIZJ)) {
            return Boolean.FALSE;
        }
        if (o.LJ(this, LIZIZ)) {
            return null;
        }
        C25710zf<C51121zY> c25710zf = this.LIZ;
        int i = c25710zf.LJLJI;
        boolean z = false;
        if (i > 0) {
            C51121zY[] c51121zYArr = c25710zf.LJLIL;
            o.LJII(c51121zYArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            z = false;
            do {
                C51171zd LIZJ2 = c51121zYArr[i2].LIZJ();
                if (LIZJ2 != null) {
                    if (onFound.invoke(LIZJ2).booleanValue() || z) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i2++;
            } while (i2 < i);
        }
        return Boolean.valueOf(z);
    }
}
