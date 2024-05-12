package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationCompletion;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class XN5 extends UIAnnotationCompletion {
    public static final List<XN5> LIZIZ = new ArrayList();
    public final C2V LIZ;

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationCompletion
    public final void onSuccess() {
        C83573Wr3.LIZ(this.LIZ);
        List<XN5> list = LIZIZ;
        synchronized (list) {
            ((ArrayList) list).remove(this);
        }
    }

    public XN5(C2V c2v) {
        this.LIZ = c2v;
        List<XN5> list = LIZIZ;
        synchronized (list) {
            ((ArrayList) list).add(this);
        }
    }

    @Override // com.bytedance.ies.effecteditor.swig.UIAnnotationCompletion
    public final void onError(UIAnnotationErrorCode uIAnnotationErrorCode) {
        C83573Wr3.LIZIZ(this.LIZ, uIAnnotationErrorCode);
        List<XN5> list = LIZIZ;
        synchronized (list) {
            ((ArrayList) list).remove(this);
        }
    }
}
