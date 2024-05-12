package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final /* synthetic */ class QZP implements InterfaceC67209QZh {
    @Override // X.InterfaceC67209QZh
    public Object LIZ(QZO qzo) {
        return new C67183QYh((Context) qzo.LIZ(Context.class), ((C67195QYt) qzo.LIZ(C67195QYt.class)).LIZJ(), qzo.LJI(InterfaceC67212QZk.class), qzo.LJ(QYS.class));
    }

    public static String LIZIZ(String str, String str2, String str3) {
        return new OJD(str).replace(str2, str3);
    }

    public static void LIZJ(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        C0NB.LJIIIZ(str2, X1D.LIZIZ(LIZ));
    }
}
