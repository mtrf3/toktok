package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.4rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122364rA {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(NLEModel nLEModel) {
        int i;
        List LJJIII = C17J.LJJIII(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator it = LJJIII.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it.next()).LJIILL(), arrayList);
        }
        int i2 = -1;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                NLENode it3 = (NLENode) it2.next();
                o.LJIIIIZZ(it3, "it");
                String extra = it3.getExtra("original_effect_order");
                if (extra == null || extra.length() == 0) {
                    i2 = -1;
                } else {
                    i2 = CastIntegerProtector.parseInt(extra);
                }
                while (it2.hasNext()) {
                    NLENode it4 = (NLENode) it2.next();
                    o.LJIIIIZZ(it4, "it");
                    String extra2 = it4.getExtra("original_effect_order");
                    if (extra2 == null || extra2.length() == 0) {
                        i = -1;
                    } else {
                        i = CastIntegerProtector.parseInt(extra2);
                    }
                    if (i2 < i) {
                        i2 = i;
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        return i2;
    }
}
