package Y;

import X.C76800UCe;
import X.C86219Xsd;
import X.Y2G;
import X.Y3P;
import com.ss.android.ugc.aweme.fe.method.upload.PickPhotoUploadFeature;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public class ACallableS61S0300000_15 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS61S0300000_15 aCallableS61S0300000_15) {
        C86219Xsd c86219Xsd = (C86219Xsd) aCallableS61S0300000_15.l0;
        if (c86219Xsd != null) {
            ((ArrayList) aCallableS61S0300000_15.l1).add(c86219Xsd);
        }
        return ((PickPhotoUploadFeature) aCallableS61S0300000_15.l2).buildObject((ArrayList) aCallableS61S0300000_15.l1);
    }

    public static final Object call$1(ACallableS61S0300000_15 aCallableS61S0300000_15) {
        Y2G.LIZ((Class) aCallableS61S0300000_15.l0, (List) aCallableS61S0300000_15.l1, (Y3P) aCallableS61S0300000_15.l2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS61S0300000_15(Object obj, C86219Xsd c86219Xsd, ArrayList<C86219Xsd> arrayList, PickPhotoUploadFeature pickPhotoUploadFeature) {
        this.$t = pickPhotoUploadFeature;
        this.l0 = obj;
        this.l1 = c86219Xsd;
        this.l2 = arrayList;
    }
}
