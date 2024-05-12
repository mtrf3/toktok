package X;

import Y.ARunnableS38S0100000_2;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.5i7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142235i7 {
    public static final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C52510KjC.LIZ() && !o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS38S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 186));
        } else {
            interfaceC65784Pro.invoke();
        }
    }
}
