package X;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ljb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55083Ljb extends FullFeedPagerAdapter {
    public final java.util.Map<Integer, C2313796f> LLIIIJ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
    public final String LJJIJLIJ() {
        return "full_feed";
    }

    @Override // X.AbstractC55082Lja
    public final List<C2313796f> LJJIJIIJI() {
        return new ArrayList();
    }

    @Override // X.AbstractC55082Lja
    public final Collection LJJIJIIJIL() {
        return (Collection) AnonymousClass966.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedPagerAdapter, X.AbstractC55082Lja
    public final C55136LkS LJJJ() {
        return new C55085Ljd(C55084Ljc.LJLIL);
    }

    @Override // X.AbstractC55082Lja, X.AbstractC48746JBe
    public final int LJJIII(int i) {
        Aweme item = getItem(i);
        if (item != null) {
            for (Map.Entry entry : ((LinkedHashMap) this.LLIIIJ).entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                InterfaceC88472Yns<C55127LkJ, Boolean> interfaceC88472Yns = ((C2313796f) entry.getValue()).LIZIZ;
                Context context = this.LJLJJL;
                List<Aweme> Q8 = Q8();
                String str = this.LJLL.eventType;
                o.LJI(str);
                if (interfaceC88472Yns.invoke(new C55127LkJ(item, context, Q8, str, this.LJLL.param.getFrom())).booleanValue()) {
                    return intValue;
                }
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55083Ljb(Context context, LayoutInflater layoutInflater, InterfaceC72642tA listener, Fragment fragment, ViewOnTouchListenerC51695KQp tapTouchListener, BaseFeedPageParams baseFeedPageParams, InterfaceC2302191t iHandlePlay) {
        super(context, layoutInflater, listener, fragment, tapTouchListener, baseFeedPageParams, iHandlePlay);
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(tapTouchListener, "tapTouchListener");
        o.LJIIIZ(baseFeedPageParams, "baseFeedPageParams");
        o.LJIIIZ(iHandlePlay, "iHandlePlay");
        List list = (List) AnonymousClass966.LIZIZ.getValue();
        list.add(LJJJ());
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((C2313796f) obj).LIZ), obj);
        }
        this.LLIIIJ = linkedHashMap;
    }
}
