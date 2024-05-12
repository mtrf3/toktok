package X;

import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztn, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91387Ztn<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C68322mC<Long> LJLIL;
    public final /* synthetic */ C91391Ztr LJLILLLLZI;
    public final /* synthetic */ C91495ZvX LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    public C91387Ztn(C68322mC<Long> c68322mC, C91391Ztr c91391Ztr, C91495ZvX c91495ZvX, C34K c34k) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c91391Ztr;
        this.LJLJI = c91495ZvX;
        this.LJLJJI = c34k;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String str;
        BaseDspFeedResponse it = (BaseDspFeedResponse) obj;
        o.LJIIIZ(it, "it");
        Long l = this.LJLIL.element;
        if (l != null) {
            this.LJLJI.LJII(it, l.longValue(), "/tiktok/music/dsp/feed/shuffle/v2/");
        }
        C91391Ztr c91391Ztr = this.LJLILLLLZI;
        c91391Ztr.LIZLLL = false;
        c91391Ztr.LIZJ = false;
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList = this.LJLJI.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
        Iterator<InterfaceC91296ZsK> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getId());
        }
        List<InterfaceC91296ZsK> LIZIZ = this.LJLJI.LIZIZ(it);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) LIZIZ).iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (hashSet.add(((InterfaceC91296ZsK) next).getId())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!arrayList.contains(((InterfaceC91296ZsK) next2).getId())) {
                arrayList3.add(next2);
            }
        }
        if (this.LJLJJI.element) {
            String str2 = it.extra.logid;
            o.LJIIIIZZ(str2, "it.extra.logid");
            InterfaceC91296ZsK interfaceC91296ZsK = (InterfaceC91296ZsK) ORZ.LJLLLL(arrayList3);
            if (interfaceC91296ZsK != null) {
                str = interfaceC91296ZsK.LIZIZ();
            } else {
                str = null;
            }
            boolean LJ = o.LJ(str, this.LJLJI.LJLJJL);
            C91467Zv5 c91467Zv5 = this.LJLJI.LJLJLLL;
            String sceneName = c91467Zv5.LJLJI;
            String enterMethod = c91467Zv5.LJLJJL;
            o.LJIIIZ(sceneName, "sceneName");
            o.LJIIIZ(enterMethod, "enterMethod");
            HashMap hashMap = new HashMap();
            hashMap.put("request_id", str2);
            hashMap.put("status", String.valueOf(LJ ? 1 : 0));
            hashMap.put("scene_name", sceneName);
            hashMap.put("enter_method", enterMethod);
            FMX.LJIIL("dsp_shuffle_status", hashMap);
        }
        this.LJLJI.LJLIL.addAll(arrayList3);
        C91495ZvX c91495ZvX = this.LJLJI;
        c91495ZvX.LJLILLLLZI = c91495ZvX.LJLIL.size();
        return arrayList3;
    }
}
