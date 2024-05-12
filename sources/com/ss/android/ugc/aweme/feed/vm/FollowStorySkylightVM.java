package com.ss.android.ugc.aweme.feed.vm;

import X.A2F;
import X.A2G;
import X.C242699fl;
import X.C32I;
import X.C33Q;
import X.C54838Lfe;
import X.C61878OQg;
import X.C8HZ;
import X.InterfaceC222838op;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.LY3;
import X.LYL;
import X.M89;
import X.ORZ;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS58S0201000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowStorySkylightVM extends BaseDetailShareVM<C242699fl, InterfaceC57784Mm4, Long> implements InterfaceC222838op {
    public boolean LJLIL;
    public final Set<String> LJLILLLLZI = new LinkedHashSet();
    public long LJLJI;
    public LY3 LJLJJI;
    public List<InterfaceC57784Mm4> LJLJJL;

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        return -1;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C242699fl(0);
    }

    public final int hv0() {
        List<Aweme> list;
        String str;
        LY3 ly3 = this.LJLJJI;
        if (ly3 == null || (list = ly3.LIZIZ) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            Aweme aweme2 = aweme;
            UserStory userStory = aweme2.getUserStory();
            if (userStory == null || !userStory.getAllViewed()) {
                User author = aweme2.getAuthor();
                if (author != null) {
                    str = author.getUid();
                } else {
                    str = null;
                }
                if (!C54838Lfe.LJIIJJI(str)) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList.size();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final List<InterfaceC57784Mm4> listGetAll() {
        List<InterfaceC57784Mm4> list = this.LJLJJL;
        if (list != null) {
            return list;
        }
        o.LJIJI("itemList");
        throw null;
    }

    public static List jv0(List list) {
        if (C54838Lfe.LJIIJJI(((Aweme) ORZ.LJLLJ(list)).getAuthorUid())) {
            list = list.subList(1, list.size());
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new LYL((Aweme) it.next()));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(InterfaceC57784Mm4 item) {
        o.LJIIIZ(item, "item");
        if (!(item instanceof LYL)) {
            return null;
        }
        LYL lyl = (LYL) item;
        if (C54838Lfe.LJIJI(lyl.LJLIL)) {
            return null;
        }
        return lyl.LJLIL;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void listRemoveItem(InterfaceC57784Mm4 element) {
        o.LJIIIZ(element, "element");
        List<InterfaceC57784Mm4> list = this.LJLJJL;
        if (list != null) {
            ORZ.LLIIIJ(element, list);
        } else {
            o.LJIJI("itemList");
            throw null;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 83));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        List<InterfaceC57784Mm4> list = this.LJLJJL;
        if (list == null) {
            A2F a2f = A2G.LIZ;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            a2f.getClass();
            return A2F.LIZ(c61878OQg);
        }
        LY3 ly3 = this.LJLJJI;
        if (ly3 != null) {
            if (ly3.LIZLLL) {
                return A2F.LJ(A2G.LIZ, null, new Long(ly3.LJ), list, 1);
            }
            A2G.LIZ.getClass();
            return A2F.LIZ(list);
        }
        o.LJIJI("dataSource");
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final /* bridge */ /* synthetic */ void listRemoveItem(Object obj) {
        listRemoveItem((FollowStorySkylightVM) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int gv0(int i, Aweme aweme) {
        LYL lyl;
        Aweme aweme2;
        String LJIIIIZZ = C54838Lfe.LJIIIIZZ(aweme);
        ITEM listGetAt = listGetAt(i);
        String str = null;
        if ((listGetAt instanceof LYL) && (lyl = (LYL) listGetAt) != null && (aweme2 = lyl.LJLIL) != null) {
            str = C54838Lfe.LJIIIIZZ(aweme2);
        }
        if (o.LJ(LJIIIIZZ, str)) {
            return i;
        }
        int i2 = 0;
        for (ITEM item : listGetAll()) {
            if ((item instanceof LYL) && o.LJ(C54838Lfe.LJIIIIZZ(((LYL) item).LJLIL), C54838Lfe.LJIIIIZZ(aweme))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x004c, B:12:0x004f, B:14:0x0057, B:15:0x005e, B:17:0x0063, B:20:0x0072, B:22:0x007b, B:24:0x007f, B:26:0x0088, B:28:0x0092, B:29:0x009b, B:31:0x00a1, B:34:0x00ae, B:37:0x00bd, B:45:0x00c7, B:46:0x00cb, B:48:0x00df, B:51:0x00ef, B:53:0x00c1, B:54:0x00c4, B:55:0x00f9, B:56:0x00fc, B:57:0x00fd, B:58:0x0100, B:59:0x0101, B:60:0x0106, B:61:0x006b, B:65:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x004c, B:12:0x004f, B:14:0x0057, B:15:0x005e, B:17:0x0063, B:20:0x0072, B:22:0x007b, B:24:0x007f, B:26:0x0088, B:28:0x0092, B:29:0x009b, B:31:0x00a1, B:34:0x00ae, B:37:0x00bd, B:45:0x00c7, B:46:0x00cb, B:48:0x00df, B:51:0x00ef, B:53:0x00c1, B:54:0x00c4, B:55:0x00f9, B:56:0x00fc, B:57:0x00fd, B:58:0x0100, B:59:0x0101, B:60:0x0106, B:61:0x006b, B:65:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x004c, B:12:0x004f, B:14:0x0057, B:15:0x005e, B:17:0x0063, B:20:0x0072, B:22:0x007b, B:24:0x007f, B:26:0x0088, B:28:0x0092, B:29:0x009b, B:31:0x00a1, B:34:0x00ae, B:37:0x00bd, B:45:0x00c7, B:46:0x00cb, B:48:0x00df, B:51:0x00ef, B:53:0x00c1, B:54:0x00c4, B:55:0x00f9, B:56:0x00fc, B:57:0x00fd, B:58:0x0100, B:59:0x0101, B:60:0x0106, B:61:0x006b, B:65:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006b A[Catch: Exception -> 0x0107, TRY_LEAVE, TryCatch #0 {Exception -> 0x0107, blocks: (B:11:0x004c, B:12:0x004f, B:14:0x0057, B:15:0x005e, B:17:0x0063, B:20:0x0072, B:22:0x007b, B:24:0x007f, B:26:0x0088, B:28:0x0092, B:29:0x009b, B:31:0x00a1, B:34:0x00ae, B:37:0x00bd, B:45:0x00c7, B:46:0x00cb, B:48:0x00df, B:51:0x00ef, B:53:0x00c1, B:54:0x00c4, B:55:0x00f9, B:56:0x00fc, B:57:0x00fd, B:58:0x0100, B:59:0x0101, B:60:0x0106, B:61:0x006b, B:65:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(long r14, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r16) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM.iv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return iv0(((Number) obj).longValue(), interfaceC67352kd);
    }

    @Override // X.InterfaceC222838op
    public final void qN(int i, Aweme aweme) {
        setState(new AqS58S0201000_9(aweme, i, this, 1));
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return Long.valueOf(this.LJLJI);
    }
}
