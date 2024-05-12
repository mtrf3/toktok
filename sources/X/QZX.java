package X;

import android.content.Context;

/* loaded from: classes12.dex */
public final class QZX {
    public static QZT<?> LIZ(String str, String str2) {
        C67203QZb c67203QZb = new C67203QZb(str, str2);
        QZU LIZ = QZT.LIZ(AbstractC67210QZi.class);
        LIZ.LIZLLL = 1;
        LIZ.LJ = new C67211QZj(c67203QZb);
        return LIZ.LIZIZ();
    }

    public static QZT<?> LIZIZ(final String str, final InterfaceC67207QZf<Context> interfaceC67207QZf) {
        QZU LIZ = QZT.LIZ(AbstractC67210QZi.class);
        LIZ.LIZLLL = 1;
        LIZ.LIZ(QZW.LIZ(Context.class));
        LIZ.LJ = new InterfaceC67209QZh() { // from class: X.QZa
            @Override // X.InterfaceC67209QZh
            public final Object LIZ(QZO qzo) {
                return new C67203QZb(str, interfaceC67207QZf.LIZIZ(qzo.LIZ(Context.class)));
            }
        };
        return LIZ.LIZIZ();
    }
}
