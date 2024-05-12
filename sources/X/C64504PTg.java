package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PTg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C64504PTg {
    public static int LIZ(NLETrackSlot nLETrackSlot, String str, String str2) {
        String extra = nLETrackSlot.getExtra(str);
        o.LJIIIIZZ(extra, str2);
        return CastIntegerProtector.parseInt(extra);
    }

    public static Object LIZIZ(List list, int i, List list2) {
        return ListProtector.get(list2, list.size() + i);
    }

    public static void LIZLLL(StringBuilder sb, String str, StringBuilder sb2) {
        sb.append(str);
        X1D.LIZIZ(sb2);
        C46496IMq.LIZJ();
    }

    public static void LIZJ(long j, HashMap hashMap, String str, long j2, String str2) {
        hashMap.put(str, String.valueOf(j));
        hashMap.put(str2, String.valueOf(j2));
    }
}
