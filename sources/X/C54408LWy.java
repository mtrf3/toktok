package X;

import Y.AObserverS77S0100000_9;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.LWy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54408LWy extends C51031K1b<LWX> {
    public boolean LJLJJL;
    public InterfaceC51032K1c LJLJJLL;
    public InterfaceC51033K1d<Aweme> LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    public final List<String> LJJIJIIJI() {
        List<FriendsFeed> list;
        String str;
        T t = this.LJLIL;
        ArrayList arrayList = null;
        if (t != 0 && (list = ((LWX) t).LJLILLLLZI) != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                Aweme aweme = ((FriendsFeed) it.next()).getAweme();
                if (aweme == null || (str = aweme.getAid()) == null) {
                    str = "";
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void LJJIJIIJIL() {
        if (this.LJLJJL) {
            this.LJLJJL = false;
            LWX lwx = (LWX) this.LJLIL;
            if (lwx != null) {
                lwx.LJLIL = false;
            }
        }
        if (this.LJLJLLL) {
            C2U8.LIZ(new C54409LWz("FRIENDS_FEED"));
        } else {
            C2U8.LIZ(new C54409LWz());
        }
    }

    public C54408LWy() {
        StateOwner stateOwner = StateOwner.LJLIL;
        ActivityC45651qj LIZLLL = stateOwner.LIZLLL();
        if (LIZLLL != null) {
            stateOwner.getClass();
            StateOwner.LJLLILLLL.observe(LIZLLL, new AObserverS77S0100000_9(this, 61));
        }
    }

    @Override // X.C51031K1b, X.C8BR
    public final void LIZIZ() {
        super.LIZIZ();
        this.LJLJL = null;
    }

    @Override // X.C8BR
    public final void LJJII() {
        super.LJJII();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        boolean z;
        InterfaceC223218pR interfaceC223218pR;
        LJJIJIIJIL();
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        boolean z2 = true;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(true);
        }
        this.LJLJLJ = false;
        LWX lwx = (LWX) this.LJLIL;
        if (lwx == null) {
            return;
        }
        int i = lwx.mListQueryType;
        if (i != 1) {
            if (i != 2) {
                if (i == 4 && (interfaceC223218pR = (InterfaceC223218pR) this.LJLILLLLZI) != null) {
                    List<Aweme> LJIIJ = lwx.LJIIJ();
                    T t = this.LJLIL;
                    if (t == 0 || !((AbstractC51036K1g) t).isHasMore()) {
                        z2 = false;
                    }
                    interfaceC223218pR.j0(LJIIJ, z2);
                }
            } else {
                InterfaceC223218pR interfaceC223218pR2 = (InterfaceC223218pR) this.LJLILLLLZI;
                if (interfaceC223218pR2 != null) {
                    interfaceC223218pR2.jh(lwx.LJIIJ(), true ^ ((AbstractC51036K1g) this.LJLIL).isNewDataEmpty());
                }
            }
        } else if (lwx.isDataEmpty()) {
            InterfaceC223218pR interfaceC223218pR3 = (InterfaceC223218pR) this.LJLILLLLZI;
            if (interfaceC223218pR3 != null) {
                interfaceC223218pR3.Ne();
            }
        } else {
            this.LJLIL.getClass();
            InterfaceC223218pR interfaceC223218pR4 = (InterfaceC223218pR) this.LJLILLLLZI;
            if (interfaceC223218pR4 != null) {
                List<Aweme> LJIIJ2 = ((LWX) this.LJLIL).LJIIJ();
                T t2 = this.LJLIL;
                if (t2 != 0 && ((AbstractC51036K1g) t2).isHasMore()) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC223218pR4.J5(LJIIJ2, z);
            }
            java.util.Set<String> set = ((LWX) this.LJLIL).LJLLLL;
            if (set.size() > 0 && (C7DU.LIZ() & 4) == 4) {
                C2U8.LIZ(new LX0((String) ORZ.LJLLILLLL(set)));
                ((LWX) this.LJLIL).LJLLLL.clear();
            }
        }
        LYH.LIZJ(MG5.TAB_FRIENDS);
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(this.LJLJLJ);
        }
        return super.LJIILL(Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C51031K1b
    public final void LJJIII(InterfaceC51033K1d<?> interfaceC51033K1d) {
        this.LJLJL = interfaceC51033K1d;
    }

    @Override // X.C51031K1b
    public final boolean LJJIIJ(Object obj) {
        Object LIZ;
        Integer num;
        if (obj == null) {
            return false;
        }
        try {
            if (obj instanceof Aweme) {
                if (C54838Lfe.LJJI((Aweme) obj)) {
                    return false;
                }
                List<FriendsFeed> items = ((LWX) this.LJLIL).getItems();
                if (!C79004UzY.LJJIFFI(items)) {
                    if (items == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(items.size());
                    }
                    o.LJI(num);
                    int intValue = num.intValue();
                    for (int i = 0; i < intValue; i++) {
                        FriendsFeed friendsFeed = (FriendsFeed) ListProtector.get(items, i);
                        if (TextUtils.equals(((Aweme) obj).getAid(), C227768wm.LIZIZ(friendsFeed.getAweme()))) {
                            ((LWX) this.LJLIL).deleteItem(friendsFeed);
                            return true;
                        }
                    }
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("friends feed deleteItem called error ");
            LIZ2.append(m10exceptionOrNullimpl);
            C36922EeM.LIZLLL(2, "FriendsFeedPresenter", X1D.LIZIZ(LIZ2));
        }
        return false;
    }

    @Override // X.C8BR
    /* renamed from: LJJIIZ, reason: merged with bridge method [inline-methods] */
    public final void LJJ(LWX lwx) {
        super.LJJ(lwx);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    public final void LJJIIZI(InterfaceC88472Yns<? super Aweme, Boolean> interfaceC88472Yns) {
        List items = ((AbstractC51036K1g) this.LJLIL).getItems();
        if (items == null) {
            return;
        }
        for (int size = items.size() - 1; -1 < size; size--) {
            Aweme aweme = ((FriendsFeed) ListProtector.get(items, size)).getAweme();
            if (aweme != null && interfaceC88472Yns.invoke(aweme).booleanValue()) {
                ListProtector.remove(items, size);
                onItemDeleted(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int LJJIJ(List<? extends Aweme> list) {
        FriendsFeed friendsFeed;
        boolean z;
        Aweme aweme;
        if (!(!((ArrayList) list).isEmpty())) {
            list = null;
        }
        int i = 0;
        if (list != null) {
            i = 0;
            for (Aweme aweme2 : list) {
                LWX lwx = (LWX) this.LJLIL;
                lwx.getClass();
                o.LJIIIZ(aweme2, "aweme");
                List<FriendsFeed> items = lwx.getItems();
                if (!C79004UzY.LJJIFFI(items)) {
                    if (items != null) {
                        Iterator<FriendsFeed> it = items.iterator();
                        while (it.hasNext()) {
                            friendsFeed = it.next();
                            if (friendsFeed != null && (aweme = friendsFeed.getAweme()) != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                                break;
                            }
                        }
                    }
                    friendsFeed = null;
                    List<Aweme> LJIIJ = lwx.LJIIJ();
                    if (!C79004UzY.LJJIFFI(LJIIJ)) {
                        int LJJI = C78996UzQ.LJJI(aweme2, LJIIJ);
                        if (LJJI >= 0) {
                            for (C8BT c8bt : lwx.mNotifyListeners) {
                                if (c8bt != null && (c8bt instanceof InterfaceC51034K1e)) {
                                    ((InterfaceC51034K1e) c8bt).onItemDeleted(LJJI);
                                }
                            }
                        }
                        if (friendsFeed != null) {
                            if (items != null && items.remove(friendsFeed)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) lwx.mData;
                            if (friendsFeedResponse != null) {
                                friendsFeedResponse.friendFeedData = items;
                            }
                            if (z) {
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        InterfaceC223218pR interfaceC223218pR;
        o.LJIIIZ(e, "e");
        LJJIJIIJIL();
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(true);
        }
        this.LJLJLJ = false;
        AbstractC51036K1g abstractC51036K1g = (AbstractC51036K1g) this.LJLIL;
        if (abstractC51036K1g == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(abstractC51036K1g.mListQueryType);
        if (valueOf != null) {
            if (valueOf.intValue() == 1) {
                InterfaceC223218pR interfaceC223218pR2 = (InterfaceC223218pR) this.LJLILLLLZI;
                if (interfaceC223218pR2 != null) {
                    interfaceC223218pR2.cb0(e);
                }
            } else if (valueOf.intValue() == 4) {
                InterfaceC223218pR interfaceC223218pR3 = (InterfaceC223218pR) this.LJLILLLLZI;
                if (interfaceC223218pR3 != null) {
                    interfaceC223218pR3.nc(e);
                }
            } else if (valueOf.intValue() == 2 && (interfaceC223218pR = (InterfaceC223218pR) this.LJLILLLLZI) != null) {
                interfaceC223218pR.Qw(e);
            }
        }
        if (e instanceof C38333F2r) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("error_type", "follow_feed_error");
            c188727au.LIZLLL(((C38306F1q) e).getErrorCode(), "error_code");
            FMX.LJIIL("homepage_follow_monitor", c188727au.LIZ);
        } else {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("error_type", "follow_feed_error");
            c188727au2.LIZLLL(4, "error_code");
            FMX.LJIIL("homepage_follow_monitor", c188727au2.LIZ);
        }
        LYH.LIZJ(MG5.TAB_FRIENDS);
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final void onItemDeleted(int i) {
        InterfaceC51033K1d<Aweme> interfaceC51033K1d = this.LJLJL;
        if (interfaceC51033K1d != null) {
            interfaceC51033K1d.onItemDeleted(i);
        }
    }

    @QD3
    public final void onRefreshEvent(LJK event) {
        boolean z;
        InterfaceC54054LJi interfaceC54054LJi;
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (i == 1) {
            InterfaceC36571c5 mv0 = C116694i1.LIZ(StateOwner.LJLIL.LIZLLL()).mv0();
            if ((mv0 instanceof InterfaceC54054LJi) && (interfaceC54054LJi = (InterfaceC54054LJi) mv0) != null) {
                z = interfaceC54054LJi.K2();
            } else {
                z = false;
            }
            if (C54029LIj.LIZIZ.LJJIJL() && z) {
                ((LWX) this.LJLIL).LJLLJ = 3;
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ((LWX) this.LJLIL).LJLLJ = i;
    }

    @Override // X.C51031K1b
    public final boolean LJJIIJZLJL(Object item, int i) {
        Integer num;
        o.LJIIIZ(item, "item");
        List items = ((AbstractC51036K1g) this.LJLIL).getItems();
        if (C79004UzY.LJJIFFI(items)) {
            items = new ArrayList();
        }
        if (i >= 0) {
            if (items != null) {
                num = Integer.valueOf(items.size());
            } else {
                num = null;
            }
            o.LJI(num);
            if (i > num.intValue()) {
                return false;
            }
            ListProtector.add(items, i, item);
            ((AbstractC51036K1g) this.LJLIL).setItems(items);
            if (this.LJLILLLLZI != 0) {
                if (((AbstractC51036K1g) this.LJLIL).isDataEmpty()) {
                    ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
                    return true;
                }
                onItemInserted(((LWX) this.LJLIL).LJIIJ(), i);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final void onItemInserted(List<?> list, int i) {
        InterfaceC51033K1d<Aweme> interfaceC51033K1d = this.LJLJL;
        if (interfaceC51033K1d != null) {
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.feed.model.Aweme>");
            interfaceC51033K1d.onItemInserted(C65777Prh.LIZIZ(list), i);
        }
    }
}
