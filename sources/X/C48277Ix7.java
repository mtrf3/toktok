package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.feed.platform.panel.forcevideo.InstantFeedVm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Ix7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48277Ix7<T> implements InterfaceC64592gB {
    public final /* synthetic */ InstantFeedVm LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C48277Ix7(InstantFeedVm instantFeedVm, String str, int i) {
        this.LJLIL = instantFeedVm;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        List itemList = (List) obj;
        InstantFeedVm instantFeedVm = this.LJLIL;
        o.LJIIIIZZ(itemList, "itemList");
        instantFeedVm.getClass();
        instantFeedVm.setStateImmediate(new AqS174S0100000_8(itemList, (List<? extends SearchMixFeed>) 172));
        int i = this.LJLJI;
        Iterator it = itemList.iterator();
        while (it.hasNext()) {
            String aid = ((Aweme) it.next()).getAid();
            o.LJIIIIZZ(aid, "it.aid");
            C48278Ix8.LIZIZ.put(aid, Integer.valueOf(i));
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(itemList, 10));
        Iterator it2 = itemList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        String aid2 = this.LJLILLLLZI;
        o.LJIIIZ(aid2, "aid");
        C48278Ix8.LIZJ.put(aid2, arrayList);
    }
}
