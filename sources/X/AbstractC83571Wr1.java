package X;

import com.bytedance.ies.effecteditor.swig.EEStdStringVector;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMoreMaxSize;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUIMore;

/* renamed from: X.Wr1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC83571Wr1 extends AbstractC38521fE {
    public final String[] LJIIL() {
        Object obj = this.LJLILLLLZI;
        if (obj != null) {
            EEStdStringVector currentValue = ((UIAnnotationAssetUIMore) ((UIAnnotationUIMore) obj)).getCurrentValue();
            String[] strArr = new String[currentValue.size()];
            currentValue.toArray(strArr);
            return strArr;
        }
        return new String[0];
    }

    public final UIAnnotationAssetUIMoreMaxSize LJIILIIL() {
        Object obj = this.LJLILLLLZI;
        if (obj != null) {
            return ((UIAnnotationAssetUIMore) ((UIAnnotationUIMore) obj)).getMaxSize();
        }
        return null;
    }

    public AbstractC83571Wr1(UIAnnotationAssetUIMore uIAnnotationAssetUIMore) {
        super(uIAnnotationAssetUIMore, 1);
        UIAnnotationUIMore uIAnnotationUIMore = (UIAnnotationUIMore) this.LJLILLLLZI;
        if (uIAnnotationUIMore == null) {
            return;
        }
        ((UIAnnotationAssetUIMore) uIAnnotationUIMore).getAlgorithmRequirement();
    }
}
