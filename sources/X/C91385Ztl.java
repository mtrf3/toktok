package X;

import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Ztl, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91385Ztl<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C91494ZvW LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public C91385Ztl(boolean z, C91494ZvW c91494ZvW, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = c91494ZvW;
        this.LJLJI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        DspDetailListResponse LIZIZ;
        BaseDspFeedResponse it = (BaseDspFeedResponse) obj;
        o.LJIIIZ(it, "it");
        if (this.LJLIL) {
            C91237ZrN.LIZJ(0L);
        }
        C91494ZvW c91494ZvW = this.LJLILLLLZI;
        Long l = c91494ZvW.LJLJI;
        if (l != null) {
            c91494ZvW.LJII(it, l.longValue(), "/tiktok/music/dsp/feed/get/v2/");
        }
        if (!this.LJLIL && this.LJLJI.length() > 0 && (LIZIZ = C91208Zqu.LIZ.LIZIZ(this.LJLJI)) != null) {
            this.LJLILLLLZI.LIZJ(LIZIZ);
        }
        if (it.status_code == 0 && it.getDspList() != null && (!it.getDspList().isEmpty())) {
            C91494ZvW c91494ZvW2 = this.LJLILLLLZI;
            c91494ZvW2.getClass();
            int i = 0;
            for (DspStruct dspStruct : it.getDspList()) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = it.extra.logid;
                    o.LJIIIIZZ(str, "response.extra.logid");
                    c91494ZvW2.LJLIL.add(c91494ZvW2.LIZLLL(dspStruct, str, false));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            ArrayList arrayList = new ArrayList(this.LJLILLLLZI.LJLIL);
            this.LJLILLLLZI.LJLIL.clear();
            CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList = this.LJLILLLLZI.LJLIL;
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add(((InterfaceC91296ZsK) next).LIZIZ())) {
                    arrayList2.add(next);
                }
            }
            copyOnWriteArrayList.addAll(arrayList2);
        }
        return C76800UCe.LIZ;
    }
}
