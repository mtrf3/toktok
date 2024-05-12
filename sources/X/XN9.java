package X;

import X.AbstractC38521fE;
import com.bytedance.ies.effecteditor.swig.UIAnnotationBase;
import com.bytedance.ies.effecteditor.swig.UIAnnotationCategory;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public abstract class XN9<T extends AbstractC38521fE, U extends UIAnnotationBase> {
    public T LIZ;
    public final C78832Uwm LIZIZ;
    public final U LIZJ;

    public abstract UIAnnotationErrorCode LIZIZ();

    public final String LIZ() {
        U u = this.LIZJ;
        if (u != null) {
            return u.getName();
        }
        return "";
    }

    public XN9(U u, XN6 xn6) {
        UIAnnotationCategory category;
        java.util.Map<String, C78832Uwm> map;
        this.LIZJ = u;
        new WeakReference(xn6);
        this.LIZ = null;
        this.LIZIZ = null;
        if (u == null || (category = u.getCategory()) == null || (map = xn6.LJFF) == null) {
            return;
        }
        this.LIZIZ = map.get(category.getName());
    }
}
