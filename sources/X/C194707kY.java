package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.7kY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194707kY {
    public final LinkedHashMap<String, Aweme> LIZ = new LinkedHashMap<>();
    public final LinkedHashMap<String, Aweme> LIZIZ = new LinkedHashMap<>();
    public final LinkedHashMap<String, Aweme> LIZJ = new LinkedHashMap<>();
    public final LinkedHashMap<String, Aweme> LIZLLL = new LinkedHashMap<>();
    public final java.util.Set<String> LJ = new HashSet();
    public final java.util.Set<String> LJFF = new HashSet();

    public final Aweme[] LIZ() {
        Object LIZ;
        Aweme[] awemeArr;
        Aweme[] awemeArr2;
        try {
            if (this.LIZIZ.size() > 0) {
                LinkedHashMap<String, Aweme> linkedHashMap = this.LIZIZ;
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator<Map.Entry<String, Aweme>> it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue());
                }
                awemeArr = (Aweme[]) arrayList.toArray(new Aweme[0]);
            } else {
                awemeArr = new Aweme[0];
            }
            if (this.LIZJ.size() > 0) {
                LinkedHashMap<String, Aweme> linkedHashMap2 = this.LIZJ;
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                Iterator<Map.Entry<String, Aweme>> it2 = linkedHashMap2.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue());
                }
                awemeArr2 = (Aweme[]) arrayList2.toArray(new Aweme[0]);
            } else {
                awemeArr2 = new Aweme[0];
            }
            LIZ = (Aweme[]) C61898ORa.LJJIII(awemeArr2, awemeArr);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Aweme[] awemeArr3 = (Aweme[]) LIZ;
        if (awemeArr3 == null) {
            awemeArr3 = new Aweme[0];
        }
        ArrayList arrayList3 = new ArrayList();
        for (Aweme aweme : awemeArr3) {
            if (C195937mX.LJ(aweme)) {
                arrayList3.add(aweme);
            }
        }
        return (Aweme[]) arrayList3.toArray(new Aweme[0]);
    }

    public final void LIZIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        if (this.LIZ.containsKey(aid)) {
            this.LIZ.remove(aid);
        }
        if (this.LIZIZ.containsKey(aid)) {
            this.LIZIZ.remove(aid);
        }
        if (this.LIZJ.containsKey(aid)) {
            this.LIZJ.remove(aid);
        }
        if (this.LIZLLL.containsKey(aid)) {
            this.LIZLLL.remove(aid);
        }
        LIZJ(aid);
    }

    public final void LIZJ(String str) {
        if (((HashSet) this.LJ).contains(str)) {
            ((HashSet) this.LJ).remove(str);
        }
        if (((HashSet) this.LJFF).contains(str)) {
            ((HashSet) this.LJFF).remove(str);
        }
    }
}
