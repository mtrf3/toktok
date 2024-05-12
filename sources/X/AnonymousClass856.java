package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.856, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass856 {
    public static final /* synthetic */ int LIZ = 0;

    public static C2054384l LIZ(AnonymousClass857 anonymousClass857) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LongText from parser: ");
        LIZ2.append(anonymousClass857.LIZIZ());
        C85R.LIZJ(X1D.LIZIZ(LIZ2));
        ((ArrayList) anonymousClass857.LIZJ).clear();
        List<AnonymousClass852<C85M>> LIZ3 = anonymousClass857.LIZ(anonymousClass857.LIZ, anonymousClass857.LIZIZ);
        ((ArrayList) anonymousClass857.LIZJ).addAll(LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(C16880lQ.LJLLJ(anonymousClass857.getClass()));
        LIZ4.append(" generateTextComponents size: ");
        LIZ4.append(LIZ3.size());
        C85R.LIZ(X1D.LIZIZ(LIZ4));
        List<AnonymousClass852<C85M>> textComponents = anonymousClass857.LIZJ;
        o.LJIIIZ(textComponents, "textComponents");
        return new C2054384l(textComponents);
    }

    public static C2054384l LIZIZ(final String str, List structList) {
        o.LJIIIZ(structList, "structList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(structList, 10));
        Iterator it = structList.iterator();
        while (it.hasNext()) {
            TextExtraStruct m142clone = ((TextExtraStruct) it.next()).m142clone();
            o.LJIIIIZZ(m142clone, "it.clone()");
            arrayList.add(new C85M(m142clone));
        }
        final List LLJI = ORZ.LLJI(arrayList);
        return LIZ(new AnonymousClass857(str, LLJI) { // from class: X.85T
            @Override // X.AnonymousClass857
            public final String LIZIZ() {
                return C85U.DESC.getValue();
            }

            {
                o.LJIIIZ(LLJI, "metadatas");
            }

            @Override // X.AnonymousClass857
            public final List<AnonymousClass852<C85M>> LIZ(CharSequence displayText, Iterable<C85M> metadatas) {
                o.LJIIIZ(displayText, "displayText");
                o.LJIIIZ(metadatas, "metadatas");
                return C2055885a.LIZ(displayText, metadatas);
            }
        });
    }

    public static C2054384l LIZJ(final String str, List structList) {
        o.LJIIIZ(structList, "structList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(structList, 10));
        Iterator it = structList.iterator();
        while (it.hasNext()) {
            TextExtraStruct m142clone = ((TextExtraStruct) it.next()).m142clone();
            o.LJIIIIZZ(m142clone, "it.clone()");
            arrayList.add(new C85M(m142clone));
        }
        final List LLJI = ORZ.LLJI(arrayList);
        return LIZ(new AnonymousClass857(str, LLJI) { // from class: X.85S
            @Override // X.AnonymousClass857
            public final String LIZIZ() {
                return C85U.RETURN_CAPTION.getValue();
            }

            {
                o.LJIIIZ(LLJI, "metadatas");
            }

            @Override // X.AnonymousClass857
            public final List<AnonymousClass852<C85M>> LIZ(CharSequence longText, Iterable<C85M> metadatas) {
                boolean z;
                boolean z2;
                o.LJIIIZ(longText, "longText");
                o.LJIIIZ(metadatas, "metadatas");
                if (longText.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return C47261Igj.LJJIJ(new C2056385f(""));
                }
                ArrayList arrayList2 = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(longText.toString());
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                        o.LJIIIIZZ(string, "jsonArray.getString(i)");
                        arrayList2.add(string);
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str2 = (String) next;
                        ArrayList arrayList4 = new ArrayList();
                        for (C85M c85m : metadatas) {
                            if (c85m.LIZ.getLineIndex() == i2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList4.add(c85m);
                            }
                        }
                        arrayList3.addAll(C2055885a.LIZ(str2, arrayList4));
                        if (i2 < arrayList2.size() - 1) {
                            arrayList3.add(new C2056485g());
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                return arrayList3;
            }
        });
    }
}
