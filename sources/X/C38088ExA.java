package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.ExA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38088ExA {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC38085Ex7 LIZ(EnumC38078Ex0 enumC38078Ex0) {
        int i = C38079Ex1.LIZ[enumC38078Ex0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC38085Ex7.SECURE;
                    }
                    throw new C162476Zf();
                }
                return EnumC38085Ex7.PUBLIC;
            }
            return EnumC38085Ex7.PROTECT;
        }
        return EnumC38085Ex7.PRIVATE;
    }

    public static C38089ExB LIZIZ(InterfaceC60761Nsz interfaceC60761Nsz) {
        Context context;
        C38089ExB c38089ExB = new C38089ExB(interfaceC60761Nsz);
        View LIZJ = interfaceC60761Nsz.LIZJ();
        android.net.Uri uri = null;
        if (LIZJ != null) {
            context = LIZJ.getContext();
        } else {
            context = null;
        }
        c38089ExB.LIZ = context;
        c38089ExB.LJ = interfaceC60761Nsz.LIZJ();
        InterfaceC60710NsA interfaceC60710NsA = interfaceC60761Nsz.getHybridContext().hybridParams;
        if (interfaceC60710NsA != null) {
            uri = interfaceC60710NsA.LIZIZ();
        }
        c38089ExB.LIZIZ = String.valueOf(uri);
        return c38089ExB;
    }
}
