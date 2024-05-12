package X;

import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class QQH implements QQL {
    @Override // X.QQL
    public final void LIZ(QQI qqi) {
        if (qqi.LJIIIIZZ == 10001 && qqi.LIZIZ) {
            C66960QPs.LIZ();
            QTW qtw = (QTW) QTW.LIZIZ(QWR.LIZ());
            qtw.LIZJ(false);
            String str = "";
            if (qqi instanceof QQJ) {
                str = ((QQJ) qqi).LJIIIZ;
            }
            C65886PtS c65886PtS = new C65886PtS(1);
            if (!TextUtils.isEmpty(str)) {
                str.getClass();
            }
            synchronized (qtw.LLILZIL) {
                Iterator<InterfaceC65888PtU> it = qtw.LLILZIL.iterator();
                while (it.hasNext()) {
                    InterfaceC65888PtU next = it.next();
                    if (next != null) {
                        next.LIZLLL(c65886PtS);
                    }
                }
            }
        }
    }
}
