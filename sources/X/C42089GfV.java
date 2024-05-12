package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.GfV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42089GfV {
    public final AtomicBoolean LIZ = new AtomicBoolean(true);
    public final java.util.Set<String> LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());

    public final java.util.Set<String> LIZ() {
        List<AwemeDraft> queryDraftList = C1DG.LJFF().queryDraftList(new GPJ(false, false, GPH.ALL, null, 23));
        AwemeDraft LIZ = C60903NvH.LJIIJJI().LJIIJ().LIZ();
        ArrayList arrayList = new ArrayList();
        if (queryDraftList != null && !queryDraftList.isEmpty()) {
            arrayList.addAll(queryDraftList);
        }
        if (LIZ != null) {
            arrayList.add(LIZ);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        new C68395Qsp(3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AwemeDraft source = (AwemeDraft) it.next();
            o.LJIIIZ(source, "source");
            linkedHashSet.addAll(C60903NvH.LJIIJJI().LJJJI().LIZJ().LIZIZ(source));
        }
        this.LIZIZ.clear();
        this.LIZIZ.addAll(linkedHashSet);
        this.LIZ.set(false);
        return linkedHashSet;
    }
}
