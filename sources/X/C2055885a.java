package X;

import Y.IDComparatorS31S0000000_3;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.85a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055885a {
    public static List LIZ(CharSequence singleLineText, Iterable metadatas) {
        int i;
        AbstractC2056085c c2056885k;
        o.LJIIIZ(singleLineText, "singleLineText");
        o.LJIIIZ(metadatas, "metadatas");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = metadatas.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C85M c85m = (C85M) next;
            if (c85m.LIZ() && c85m.LIZ.getEnd() < singleLineText.length()) {
                arrayList2.add(next);
            }
        }
        for (C85M c85m2 : ORZ.LLILII(new IDComparatorS31S0000000_3(12), arrayList2)) {
            TextExtraStruct textExtraStruct = c85m2.LIZ;
            int start = textExtraStruct.getStart();
            if (i < start) {
                C2056385f c2056385f = new C2056385f(i, start, singleLineText.subSequence(i, start));
                i = textExtraStruct.getStart();
                arrayList.add(c2056385f);
            }
            TextExtraStruct textExtraStruct2 = c85m2.LIZ;
            int type = textExtraStruct2.getType();
            if (type != 0) {
                if (type != 1) {
                    if (type == 5) {
                        c2056885k = new C2056985l(textExtraStruct2.getStart(), textExtraStruct2.getEnd());
                        c2056885k.LJIIIIZZ = singleLineText.subSequence(textExtraStruct2.getStart(), textExtraStruct2.getEnd()).toString();
                        c2056885k.LJI = c85m2;
                    }
                } else {
                    c2056885k = new C2056585h(textExtraStruct2.getStart(), textExtraStruct2.getEnd());
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(EnumC2055985b.HASHTAG.getValue());
                    LIZ.append(textExtraStruct2.getHashTagName());
                    c2056885k.LJIIIIZZ = X1D.LIZIZ(LIZ);
                    c2056885k.LJI = c85m2;
                }
            } else {
                c2056885k = new C2056885k(textExtraStruct2.getStart(), textExtraStruct2.getEnd());
                c2056885k.LJIIIIZZ = singleLineText.subSequence(textExtraStruct2.getStart(), textExtraStruct2.getEnd()).toString();
                c2056885k.LJI = c85m2;
            }
            i = textExtraStruct.getEnd();
            arrayList.add(c2056885k);
        }
        int length = singleLineText.length();
        if (i < length) {
            arrayList.add(new C2056385f(i, length, singleLineText.subSequence(i, length)));
        }
        C85R.LIZ("createTextComponents singleLineText -> " + ((Object) singleLineText) + ", size -> " + arrayList.size());
        return arrayList;
    }
}
