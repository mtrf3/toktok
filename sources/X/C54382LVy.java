package X;

import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LVy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54382LVy<T> implements InterfaceC86003Zc {
    public final /* synthetic */ LWX LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;

    public C54382LVy(LWX lwx, int i, int i2, C68322mC<String> c68322mC) {
        this.LJLIL = lwx;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = c68322mC;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<FriendsFeedResponse> interfaceC73573Su9) {
        boolean z;
        List list;
        boolean z2;
        T t;
        List<FriendsFeed> list2;
        List<FriendsFeed> list3;
        OSJ LIZ = C54028LIi.LIZ("friends feed request");
        C54385LWb c54385LWb = this.LJLIL.LJLJJI;
        if (c54385LWb != null) {
            c54385LWb.LIZJ = System.currentTimeMillis();
        }
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        List list4 = (List) LIZ.getFirst();
        List list5 = (List) LIZ.getSecond();
        List list6 = (List) LIZ.getThird();
        List<C54859Lfz> LIZ2 = LW8.LIZIZ.LIZ();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZ2, 10));
        Iterator<C54859Lfz> it = LIZ2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLIL);
        }
        FriendsFeedResponse LIZIZ = C54374LVq.LIZIZ(i, i2, null, list4, list5, list6, arrayList, this.LJLJJI.element, null, false);
        boolean z3 = false;
        if (LIZIZ != null) {
            z = LIZIZ.hasMore;
        } else {
            z = false;
        }
        LWX model = this.LJLIL;
        o.LJIIIZ(model, "model");
        if (LIZIZ != null && (list3 = LIZIZ.friendFeedData) != null) {
            list = C73994T2g.LJIILJJIL(list3);
        } else {
            list = null;
        }
        if (C00F.LIZ(31744, 1, "tt_friends_tab_offline_aweme_type_filter_v2", true) == 1) {
            if (list != null) {
                ORS.LJJLIL(new AqS175S0100000_9(model, 427), list);
                z2 = list.isEmpty();
            }
            z2 = true;
        } else {
            if (list != null) {
                ORS.LJJLIL(new AqS175S0100000_9(model, 428), list);
                z2 = list.isEmpty();
            }
            z2 = true;
        }
        if (LIZIZ == null || (list2 = LIZIZ.friendFeedData) == null || list2.size() == 0) {
            z3 = true;
        }
        C68322mC<String> c68322mC = this.LJLJJI;
        if (LIZIZ == null || (t = (T) LIZIZ.pageToken) == null) {
            t = (T) "";
        }
        c68322mC.element = t;
        if (z) {
            if (z3) {
                if (LIZIZ != null) {
                    interfaceC73573Su9.tryOnError(new LW7(LIZIZ, "error by hasMore & empty"));
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            if (z2) {
                if (LIZIZ != null) {
                    interfaceC73573Su9.tryOnError(new LW7(LIZIZ, "error by filterEmpty"));
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        if (LIZIZ != null) {
            interfaceC73573Su9.onNext(LIZIZ);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
