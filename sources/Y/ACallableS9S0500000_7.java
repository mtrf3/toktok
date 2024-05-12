package Y;

import X.C00F;
import X.C41896GcO;
import X.C41897GcP;
import X.C42307Gj1;
import X.C43615H9v;
import X.C44687HgJ;
import X.C76732zl;
import X.C76800UCe;
import X.C78966Uyw;
import X.HJC;
import X.X1D;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACallableS9S0500000_7 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object call$0(ACallableS9S0500000_7 aCallableS9S0500000_7) {
        ((C41896GcO) aCallableS9S0500000_7.l0).LIZIZ(((AwemeDraft) aCallableS9S0500000_7.l1).LIZIZ(), (ArrayList) aCallableS9S0500000_7.l2, (AtomicInteger) aCallableS9S0500000_7.l3, (ArrayList) aCallableS9S0500000_7.l4);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS9S0500000_7 aCallableS9S0500000_7) {
        boolean z;
        Bitmap LJFF;
        ArrayList arrayList = new ArrayList();
        ShortVideoContext shortVideoContext = ((C43615H9v) aCallableS9S0500000_7.l0).LJ;
        if (shortVideoContext != null) {
            String LIZIZ = HJC.LIZIZ(shortVideoContext.creativeInfo);
            C78966Uyw.LJJJJLL(new File(LIZIZ));
            Iterator<String> it = ((MvCreateVideoData) aCallableS9S0500000_7.l1).selectMediaList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (C44687HgJ.LIZIZ(next)) {
                    Map<String, String> map = ((C43615H9v) aCallableS9S0500000_7.l0).LJIIIIZZ;
                    next.toString();
                    if (map.containsKey(next) && C44687HgJ.LIZIZ((String) ((LinkedHashMap) ((C43615H9v) aCallableS9S0500000_7.l0).LJIIIIZZ).get(next))) {
                        Object obj = ((LinkedHashMap) ((C43615H9v) aCallableS9S0500000_7.l0).LJIIIIZZ).get(next);
                        o.LJI(obj);
                        arrayList.add(obj);
                    } else if (C00F.LIZ(31744, 0, "mv_template_support_fast_import", true) == 2 && !((C43615H9v) aCallableS9S0500000_7.l0).LJII) {
                        arrayList.add(next);
                    } else {
                        int[] LIZJ = C42307Gj1.LIZJ(next);
                        if (LIZJ == null) {
                            arrayList.add(next);
                        } else {
                            if (LIZJ[0] > 1080 || LIZJ[1] > 1920) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (C00F.LIZ(31744, 0, "mv_template_support_fast_import", true) == 1 && !z && !((C43615H9v) aCallableS9S0500000_7.l0).LJII) {
                                arrayList.add(next);
                            } else {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(LIZIZ);
                                LIZ.append(HJC.LIZJ(".bmp"));
                                String LIZIZ2 = X1D.LIZIZ(LIZ);
                                int i = ((C76732zl) aCallableS9S0500000_7.l2).element;
                                int i2 = ((C76732zl) aCallableS9S0500000_7.l3).element;
                                int i3 = ((C76732zl) aCallableS9S0500000_7.l4).element;
                                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                                if (C44687HgJ.LIZIZ(next) && (LJFF = C42307Gj1.LJFF(i, i2, C42307Gj1.LIZIZ(next), i3, next)) != null) {
                                    LIZIZ2.toString();
                                    if (C42307Gj1.LJ(LJFF, new File(LIZIZ2), 100, compressFormat)) {
                                        ((C43615H9v) aCallableS9S0500000_7.l0).LJIIIIZZ.put(next, LIZIZ2);
                                        arrayList.add(LIZIZ2);
                                    }
                                }
                                arrayList.add(next);
                            }
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                ((MvCreateVideoData) aCallableS9S0500000_7.l1).selectMediaList.clear();
                ((MvCreateVideoData) aCallableS9S0500000_7.l1).selectMediaList.addAll(arrayList);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS9S0500000_7(Object obj, C41896GcO c41896GcO, AwemeDraft awemeDraft, ArrayList<C41897GcP> arrayList, AtomicInteger atomicInteger, ArrayList<C41897GcP> arrayList2) {
        this.$t = arrayList2;
        this.l0 = obj;
        this.l1 = c41896GcO;
        this.l2 = awemeDraft;
        this.l3 = arrayList;
        this.l4 = atomicInteger;
    }
}
