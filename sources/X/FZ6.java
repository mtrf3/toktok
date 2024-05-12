package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FZ6 extends FZ7 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int i;
        FZ8 fz8 = (FZ8) xBaseParamModel;
        o.LJIIIZ(type, "type");
        if (!fz8.getKeys().isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<FZ9> it = fz8.getKeys().iterator();
            while (true) {
                if (it.hasNext()) {
                    FZ9 next = it.next();
                    if (next.getKey().length() != 0) {
                        if (!TextUtils.isEmpty(next.getBiz())) {
                            i = 10;
                            break;
                        } else if (o.LJ(next.getExposureType(), 1)) {
                            arrayList.add(next.getKey());
                        } else if (o.LJ(next.getExposureType(), 2)) {
                            arrayList2.add(next.getKey());
                        } else {
                            i = 11;
                            break;
                        }
                    }
                } else {
                    i = 0;
                    break;
                }
            }
            if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                i = 12;
            } else if (i == 0) {
                if (!arrayList2.isEmpty()) {
                    FH5.LIZIZ().getClass();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        FH1.LJI.getClass();
                        FH1.LIZJ(str, false);
                    }
                }
                if (!arrayList.isEmpty()) {
                    FH5.LIZIZ().getClass();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        FH1.LJI.getClass();
                        FH1.LIZJ(str2, true);
                    }
                }
            }
            c37356ElM.onFailure(i, "error params.", (XBaseResultModel) ED5.LIZJ(FZA.class, null));
            return;
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(FZA.class, null), "");
    }
}
