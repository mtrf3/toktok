package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QDA {
    public static final List<QDA> LIZLLL = new ArrayList();
    public Object LIZ;
    public QDC LIZIZ;
    public QDA LIZJ;

    public QDA(Object obj, QDC qdc) {
        this.LIZ = obj;
        this.LIZIZ = qdc;
    }

    public static QDA LIZ(Object obj, QDC qdc) {
        List<QDA> list = LIZLLL;
        synchronized (list) {
            int size = ((ArrayList) list).size();
            if (size > 0) {
                QDA qda = (QDA) ((ArrayList) list).remove(size - 1);
                qda.LIZ = obj;
                qda.LIZIZ = qdc;
                qda.LIZJ = null;
                return qda;
            }
            return new QDA(obj, qdc);
        }
    }
}
