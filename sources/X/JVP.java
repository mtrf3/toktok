package X;

import Y.AObjectS31S0000000_8;
import Y.ARunnableS27S0200000_8;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS97S0300000_8;
import kotlin.jvm.internal.IDqS452S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JVP extends C8HS<SearchMixFeed> implements InterfaceC73226SoY<SearchMixFeed>, InterfaceC49498Jbi, JGU, JWN<SearchMixFeed>, InterfaceC49985JjZ {
    public final RecyclerView LJLIL;
    public final JIB LJLILLLLZI;
    public final InterfaceC48970JJu LJLJI;
    public final InterfaceC191547fS LJLJJI;
    public InterfaceC65784Pro<Integer> LJLJJL;
    public SearchResultParam LJLJJLL;
    public final C49002JLa<SearchMixFeed> LJLJL;
    public GlobalDoodleConfig LJLJLJ;
    public JQT LJLJLLL;
    public SearchJediMixFeedFragment LJLL;
    public final SearchGlobalViewModel LJLLI;
    public List<String> LJLLILLLL;
    public ClickSearchViewModel LJLLJ;
    public final C49491Jbb LJLLL;
    public final JZG LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public SearchMixFeed LJZL;
    public boolean LL;
    public int LLD;
    public View LLF;
    public final C8YF<InterfaceC212998Xn<?, ?>, C8RL> LLFF;
    public final C73231Sod<SearchMixFeed> LLFFF;
    public final JYU LLFII;

    @Override // X.InterfaceC73226SoY
    public final void LJJIIJ(List<? extends SearchMixFeed> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(list, "list");
    }

    @Override // X.JGU
    public final void LJJJLZIJ() {
    }

    @Override // X.JGU
    public final void LJLLL(Aweme aweme) {
    }

    public int LLF(int i) {
        return -1;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJIJ() {
        int i;
        List<T> list = this.mmItems;
        if (list != 0) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (JWA.LIZIZ(((SearchMixFeed) it.next()).LJI().schema)) {
                    break;
                }
                i++;
            }
        }
        i = -1;
        return LL() + i;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJIL() {
        DynamicPatch LJI;
        List<T> list = this.mmItems;
        int i = -1;
        if (list != 0) {
            int i2 = 0;
            for (T t : list) {
                DynamicPatch LJI2 = t.LJI();
                if ((LJI2 != null && LJI2.getOriginType() == 74) || ((LJI = t.LJI()) != null && LJI.getOriginType() == 40)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        return LL() + i;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJJIIZ() {
        List<T> list = this.mmItems;
        int i = -1;
        if (list != 0) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((SearchMixFeed) it.next()).LJI().getOriginType() == 72) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        return LL() + i;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJJJJIZL() {
        List<T> list = this.mmItems;
        if (list != 0) {
            return list.size();
        }
        return LL() - 1;
    }

    public final SearchMixFeed LJZL() {
        List<T> list = this.mmItems;
        Object obj = null;
        if (list == 0) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SearchMixFeed searchMixFeed = (SearchMixFeed) next;
            if (searchMixFeed.LJIIIIZZ() && C49111JPf.LIZJ(searchMixFeed)) {
                obj = next;
                break;
            }
        }
        return (SearchMixFeed) obj;
    }

    public final int LL() {
        InterfaceC65784Pro<Integer> interfaceC65784Pro = this.LJLJJL;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro.invoke().intValue();
        }
        return 0;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJJIJIIJI() {
        return LL();
    }

    public final boolean LLFII() {
        Aweme aweme;
        java.util.Map<String, String> searchExtraParams;
        SearchMixFeed LJZL = LJZL();
        if (LJZL == null || (aweme = LJZL.getAweme()) == null || (searchExtraParams = aweme.getSearchExtraParams()) == null || !searchExtraParams.containsKey("is_click_trending_native_card_enter")) {
            return false;
        }
        return true;
    }

    @Override // X.MK7, X.C4II, X.AbstractC029409q
    public final int getItemCount() {
        return super.getItemCount();
    }

    @Override // X.InterfaceC73226SoY
    public final C73231Sod<SearchMixFeed> LJJIIZI() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJJI(String str) {
        String str2;
        List<T> list = this.mmItems;
        if (list == 0) {
            return -1;
        }
        int i = 0;
        for (T t : list) {
            if (t.LJIIIIZZ()) {
                Aweme aweme = t.getAweme();
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(str, str2)) {
                    if (i == -1) {
                        return -1;
                    }
                    return LL() + i;
                }
            }
            i++;
        }
        return -1;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJJII(Aweme aweme) {
        List<T> list;
        SearchMixFeed searchMixFeed;
        List<SearchUser> list2;
        List<Aweme> fullAwemeList;
        String str;
        List<T> list3 = this.mmItems;
        if (list3 != 0) {
            Iterator it = list3.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((AbstractC49325JXl) it.next()).getFeedType() == 65458) {
                    if (i >= 0 && (list = this.mmItems) != 0 && (searchMixFeed = (SearchMixFeed) ORZ.LJLLLLLL(i, list)) != null && (list2 = searchMixFeed.users) != null) {
                        for (SearchUser searchUser : list2) {
                            if (searchUser != null && (fullAwemeList = searchUser.getFullAwemeList()) != null) {
                                for (Aweme aweme2 : fullAwemeList) {
                                    if (aweme2 != null) {
                                        String aid = aweme2.getAid();
                                        if (aweme != null) {
                                            str = aweme.getAid();
                                        } else {
                                            str = null;
                                        }
                                        if (o.LJ(aid, str)) {
                                            return LL() + i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC49350JYk
    public final boolean LJJIJIL(int i) {
        List<T> list;
        if (i < 0 || (list = this.mmItems) == 0 || i >= list.size()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJJIJL(String str) {
        List<T> list;
        SearchMixFeed searchMixFeed;
        List<Aweme> awemeList;
        List<T> list2 = this.mmItems;
        if (list2 != 0) {
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((AbstractC49325JXl) it.next()).getFeedType() == 35) {
                    if (i >= 0 && (list = this.mmItems) != 0 && (searchMixFeed = (SearchMixFeed) ORZ.LJLLLLLL(i, list)) != null && (awemeList = searchMixFeed.bot.getAwemeList()) != null) {
                        Iterator<Aweme> it2 = awemeList.iterator();
                        while (it2.hasNext()) {
                            if (o.LJ(it2.next().getAid(), str)) {
                                return LL() + i;
                            }
                        }
                    }
                    return -1;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC49350JYk
    public final Object LJJIZ(int i) {
        List<T> list = this.mmItems;
        if (list != 0) {
            return ORZ.LJLLLLLL(i, list);
        }
        return null;
    }

    @Override // X.InterfaceC49498Jbi
    public final JSH LJJLIIIJJI(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return JSI.LIZIZ(parent);
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJJLIIIJL(String str) {
        String str2;
        List<Aweme> awemeList;
        Aweme aweme;
        List<T> list = this.mmItems;
        if (list == 0) {
            return -1;
        }
        int i = 0;
        for (T t : list) {
            if (t.getFeedType() == 65514) {
                DynamicPatch LJI = t.LJI();
                if (LJI != null && (awemeList = LJI.getAwemeList()) != null && (aweme = (Aweme) ORZ.LJLLLL(awemeList)) != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, str)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    @Override // X.InterfaceC49985JjZ
    public final OSZ<Aweme, Integer> LJJZ(String str) {
        String str2;
        Aweme aweme;
        String str3;
        Aweme aweme2;
        Aweme aweme3;
        List<Aweme> awemeList;
        List<T> list = this.mmItems;
        if (list != 0) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
                    Aweme aweme4 = searchMixFeed.getAweme();
                    if (aweme4 != null) {
                        str2 = aweme4.getAid();
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, str)) {
                        return new OSZ<>(searchMixFeed.getAweme(), Integer.valueOf(LL() + i));
                    }
                    DynamicPatch LJI = searchMixFeed.LJI();
                    if (LJI != null && (awemeList = LJI.getAwemeList()) != null) {
                        Iterator<Aweme> it = awemeList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                aweme = it.next();
                                if (o.LJ(aweme.getAid(), str)) {
                                    break;
                                }
                            } else {
                                aweme = null;
                                break;
                            }
                        }
                    } else {
                        aweme = null;
                    }
                    SingleLive singleLive = searchMixFeed.singleLive;
                    if (singleLive != null && (aweme3 = singleLive.aweme) != null) {
                        str3 = aweme3.getAid();
                    } else {
                        str3 = null;
                    }
                    if (o.LJ(str3, str)) {
                        SingleLive singleLive2 = searchMixFeed.singleLive;
                        if (singleLive2 != null && (aweme2 = singleLive2.aweme) != null) {
                            return new OSZ<>(aweme2, Integer.valueOf(LL() + i));
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (aweme != null) {
                        return new OSZ<>(aweme, Integer.valueOf(LL() + i));
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC49498Jbi
    public final SearchBotHolder LJLIIL(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new SearchBotHolder(C50365Jph.LIZIZ(R.layout.ci2, parent));
    }

    @Override // X.InterfaceC49985JjZ
    public final int LJLJL(String str) {
        String str2;
        List<Aweme> awemeList;
        Aweme aweme;
        List<T> list = this.mmItems;
        int i = -1;
        if (list != 0) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SearchMixFeed searchMixFeed = (SearchMixFeed) it.next();
                if (searchMixFeed.getFeedType() == 65514) {
                    DynamicPatch LJI = searchMixFeed.LJI();
                    if (LJI != null && (awemeList = LJI.getAwemeList()) != null && (aweme = (Aweme) ORZ.LJLLLL(awemeList)) != null) {
                        str2 = aweme.getAid();
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, str)) {
                        i = i2;
                        break;
                    }
                }
                i2++;
            }
        }
        return LL() + i;
    }

    @Override // X.InterfaceC49498Jbi
    public final C49206JSw LJLLI(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        C49206JSw LIZ = C49208JSy.LIZ(parent);
        JQT jqt = this.LJLJLLL;
        if (jqt != null) {
            jqt.LJJIJLIJ(LIZ);
        }
        return LIZ;
    }

    public final Integer LJLZ(String str) {
        List<String> list = this.LJLLILLLL;
        if (list == null) {
            return null;
        }
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(str, (String) it.next())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        if (valueOf.intValue() == -1) {
            return null;
        }
        return Integer.valueOf(intValue);
    }

    public final int LJZ(String awemeId) {
        String str;
        o.LJIIIZ(awemeId, "awemeId");
        List<T> list = this.mmItems;
        if (list == 0) {
            return -1;
        }
        int i = 0;
        for (T t : list) {
            if (t.LJIIIIZZ()) {
                Aweme aweme = t.getAweme();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(awemeId, str)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public final OSZ<Integer, Aweme> LJZI(String str) {
        SearchMixFeed searchMixFeed;
        List<Aweme> awemeList;
        List<T> list = this.mmItems;
        int i = -1;
        if (list != 0) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (JWA.LIZIZ(((SearchMixFeed) it.next()).LJI().schema)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i < 0) {
            return new OSZ<>(-1, null);
        }
        List<T> list2 = this.mmItems;
        if (list2 == 0 || (searchMixFeed = (SearchMixFeed) ORZ.LJLLLLLL(i, list2)) == null) {
            return new OSZ<>(-1, null);
        }
        DynamicPatch LJI = searchMixFeed.LJI();
        if (LJI != null && (awemeList = LJI.getAwemeList()) != null) {
            Iterator<Aweme> it2 = awemeList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Aweme next = it2.next();
                if (o.LJ(next.getAid(), str)) {
                    if (next != null) {
                        return new OSZ<>(Integer.valueOf(LL() + i), next);
                    }
                }
            }
        }
        return new OSZ<>(-1, null);
    }

    public final boolean LLD(int i) {
        int i2;
        int i3;
        AbstractC49325JXl abstractC49325JXl;
        List<T> list = this.mmItems;
        if (list != 0) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return false;
        }
        if (i >= 0) {
            int i4 = 0;
            i3 = 0;
            while (true) {
                List<T> list2 = this.mmItems;
                if (list2 != 0 && (abstractC49325JXl = (AbstractC49325JXl) ORZ.LJLLLLLL(i4, list2)) != null && abstractC49325JXl.getFeedType() == 65280) {
                    i3++;
                }
                if (i4 == i) {
                    break;
                }
                i4++;
            }
        } else {
            i3 = 0;
        }
        if (i3 % 2 == 0) {
            return false;
        }
        return true;
    }

    public final boolean LLFZ(int i) {
        List<T> list;
        if (i >= 0 && (list = this.mmItems) != 0 && i < list.size()) {
            return false;
        }
        return true;
    }

    public final void LLIIIJ(List<? extends SearchMixFeed> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "searchMixFeedList");
        ArrayList arrayList = new ArrayList();
        for (SearchMixFeed searchMixFeed : list) {
            if (searchMixFeed.getFeedType() == 65280) {
                arrayList.add(searchMixFeed);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Aweme aweme = ((AbstractC49325JXl) it.next()).getAweme();
            if (aweme != null) {
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "it.aid");
                LJ.add(aid);
            }
        }
        this.LJLLILLLL = LJ;
    }

    @Override // X.C4II
    public int getBasicItemViewType(int i) {
        List<T> list;
        SearchMixFeed searchMixFeed;
        boolean z;
        AbstractC49325JXl abstractC49325JXl;
        Aweme aweme;
        List<T> list2 = this.mmItems;
        if ((list2 != 0 && i >= list2.size()) || (list = this.mmItems) == 0 || (searchMixFeed = (SearchMixFeed) ListProtector.get(list, i)) == null) {
            return -1;
        }
        List<T> list3 = this.mmItems;
        int i2 = 0;
        if (list3 != 0 && (abstractC49325JXl = (AbstractC49325JXl) ListProtector.get(list3, i)) != null && (aweme = abstractC49325JXl.getAweme()) != null && aweme.isPhotoMode()) {
            z = true;
        } else {
            z = false;
        }
        switch (searchMixFeed.getFeedType()) {
            case 35:
                return 35;
            case 61:
                return 11;
            case 70:
                return 10;
            case 555:
                return 12;
            case 65280:
                if (z) {
                    return 14;
                }
                return 1;
            case 65458:
                return 2;
            case 65465:
                return 5;
            case 65467:
                return 6;
            case 65514:
                if (DYV.LJLILLLLZI.LJJII()) {
                    String str = searchMixFeed.LJI().schema;
                    o.LJIIIIZZ(str, "flowFeed.dynamicPatch.schema");
                    java.util.Map<String, Integer> map = JWA.LIZ;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    if (linkedHashMap.get(str) == null) {
                        int i3 = JWA.LIZIZ + 1;
                        JWA.LIZIZ = i3;
                        map.put(str, Integer.valueOf(i3 + 16777216));
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("lynx card:");
                        LIZ.append(JWA.LIZ(str));
                        LIZ.append(" type:");
                        Integer num = (Integer) ((LinkedHashMap) map).get(str);
                        if (num != null) {
                            i2 = num.intValue();
                        }
                        LIZ.append(Integer.toHexString(i2));
                        X1D.LIZIZ(LIZ);
                    }
                    Integer num2 = (Integer) linkedHashMap.get(str);
                    if (num2 != null) {
                        return num2.intValue();
                    }
                    return 65514;
                }
                return 8;
            default:
                return -1;
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        this.LLFII.getClass();
        C49618Jde.LIZ(this.LJLIL, new ARunnableS27S0200000_8(this, holder, 66));
        if ((holder instanceof JSH) && this.LL) {
            SearchGlobalViewModel searchGlobalViewModel = this.LJLLI;
            if (searchGlobalViewModel != null) {
                searchGlobalViewModel.LJLZ = true;
            }
            this.LL = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        this.LLFII.getClass();
        if (holder instanceof JW4) {
            C49262JVa.LIZ((JW4) holder);
        }
        if (holder instanceof AbstractC208618Gr) {
            ((AbstractC208618Gr) holder).LJJII(false);
        }
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        JY2.LIZJ(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        InterfaceC46330IGg interfaceC46330IGg;
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof InterfaceC49284JVw) {
            ((InterfaceC49284JVw) holder).LJJJJIZL();
        }
        if (holder instanceof SearchVideoHolder) {
            SearchVideoHolder searchVideoHolder = (SearchVideoHolder) holder;
            searchVideoHolder.LJLL.LJLIIIL();
            if (C34079DZb.LIZ()) {
                try {
                    C48881JGj yv = searchVideoHolder.yv();
                    if (yv != null && (interfaceC46330IGg = yv.LJIILIIL) != null) {
                        interfaceC46330IGg.release();
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        if (holder instanceof SearchPhotoHolder) {
            ((SearchPhotoHolder) holder).LJLL.LJLIIIL();
        }
    }

    @Override // X.C8HS
    public final void setData(List<SearchMixFeed> list) {
        List arrayList;
        this.LJLLLLLL = 0;
        this.LLFII.LIZIZ();
        if (!C50086JlC.LIZ().enableUpdateAwemeOptimize) {
            this.LJLJL.LIZJ(new AObjectS31S0000000_8(3), list);
        }
        if (list == null || (arrayList = ORZ.LLJILJILJ(list)) == null) {
            arrayList = new ArrayList();
            setShowFooter(false);
        }
        List<T> list2 = this.mmItems;
        this.mmItems = arrayList;
        if (list2 != 0) {
            if (list2.size() > arrayList.size()) {
                notifyDataSetChanged();
            } else {
                int i = 0;
                while (i < list2.size() && ((SearchMixFeed) ListProtector.get(list2, i)).equals(ListProtector.get(arrayList, i))) {
                    i++;
                }
                if (i == 0) {
                    notifyDataSetChanged();
                } else {
                    int size = arrayList.size() - i;
                    int size2 = list2.size() - i;
                    if (size2 > 0) {
                        notifyItemRangeRemoved(i, size2);
                    }
                    if (size > 0) {
                        notifyItemRangeInserted(i, size);
                    }
                }
                this.LJLIL.LJLI(0);
            }
        } else {
            notifyDataSetChanged();
        }
        C49491Jbb.LJIIIZ.set(0);
        JZG jzg = this.LJLLLL;
        if (jzg != null) {
            jzg.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
    }

    @Override // X.C8HS
    public final void setDataAfterLoadMore(List<SearchMixFeed> list) {
        this.LJLJL.LIZJ(new AObjectS31S0000000_8(2), list);
        super.setDataAfterLoadMore(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0149, code lost:
    
        if (r4 != 5) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0190  */
    @Override // X.JWN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r20, int r21) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVP.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.JWN
    public RecyclerView.ViewHolder LJJJJL(int i, ViewGroup parent) {
        JHC i0;
        JGI core;
        o.LJIIIZ(parent, "parent");
        if (i > 16777216 && i < 33554432) {
            return this.LJLLL.LIZ();
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 8) {
                            if (i != 14) {
                                if (i != 35) {
                                    switch (i) {
                                        case 10:
                                            SearchResultParam searchResultParam = this.LJLJJLL;
                                            JIB containerStatusProvider = this.LJLILLLLZI;
                                            o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
                                            JPM jpm = new JPM(searchResultParam, C50365Jph.LIZIZ(R.layout.chu, parent), containerStatusProvider, this);
                                            JQT jqt = this.LJLJLLL;
                                            if (jqt != null) {
                                                jqt.LJJIJLIJ(jpm);
                                            }
                                            return jpm;
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                            C49124JPs LIZ = C49126JPu.LIZ(parent, this.LJLILLLLZI, this);
                                            JQT jqt2 = this.LJLJLLL;
                                            if (jqt2 != null) {
                                                jqt2.LJJIJLIJ(LIZ);
                                            }
                                            return LIZ;
                                        case 12:
                                            JIB containerStatusProvider2 = this.LJLILLLLZI;
                                            o.LJIIIZ(containerStatusProvider2, "containerStatusProvider");
                                            JPP jpp = new JPP(C50365Jph.LIZIZ(R.layout.chr, parent), containerStatusProvider2, this);
                                            JQT jqt3 = this.LJLJLLL;
                                            if (jqt3 != null) {
                                                jqt3.LJJIJLIJ(jpp);
                                            }
                                            return jpp;
                                        default:
                                            return new C49281JVt(new View(parent.getContext()));
                                    }
                                }
                                C49491Jbb c49491Jbb = this.LJLLL;
                                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49491Jbb.LIZJ.LIZ).poll();
                                if (viewHolder == null) {
                                    viewHolder = c49491Jbb.LIZJ.LIZ();
                                }
                                o.LJIIIIZZ(viewHolder, "viewHolder");
                                return viewHolder;
                            }
                            SearchPhotoHolder searchPhotoHolder = new SearchPhotoHolder(C50365Jph.LIZIZ(R.layout.cij, parent), this.LJLJI, this.LLFF, C79234V7u.LJIIIZ(parent));
                            JIB jib = this.LJLILLLLZI;
                            searchPhotoHolder.LLF = jib;
                            if (jib != null && (i0 = searchPhotoHolder.i0()) != null && (core = i0.getCore()) != null) {
                                core.setContainerStatusProvider(jib);
                            }
                            JQT jqt4 = this.LJLJLLL;
                            if (jqt4 != null && ((Number) J21.LIZ.getValue()).intValue() != 0) {
                                searchPhotoHolder.LLIIIJ = jqt4;
                            }
                            JQT jqt5 = this.LJLJLLL;
                            if (jqt5 != null) {
                                jqt5.LJJIJLIJ(searchPhotoHolder);
                            }
                            return searchPhotoHolder;
                        }
                        return this.LJLLL.LIZ();
                    }
                    return new C49571Jct(C50365Jph.LIZIZ(R.layout.ch4, parent), parent);
                }
                return new JUW(C50365Jph.LIZIZ(R.layout.ci4, parent));
            }
            C49491Jbb c49491Jbb2 = this.LJLLL;
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49491Jbb2.LIZLLL.LIZ).poll();
            if (viewHolder2 == null) {
                viewHolder2 = c49491Jbb2.LIZLLL.LIZ();
            }
            o.LJIIIIZZ(viewHolder2, "viewHolder");
            return viewHolder2;
        }
        C49491Jbb c49491Jbb3 = this.LJLLL;
        RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49491Jbb3.LJ.LIZ).poll();
        if (viewHolder3 == null) {
            C49494Jbe c49494Jbe = c49491Jbb3.LJFF;
            if (((ConcurrentLinkedQueue) c49494Jbe.LIZ).size() <= 0 || (viewHolder3 = (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) c49494Jbe.LIZ).poll()) == null) {
                viewHolder3 = c49491Jbb3.LJ.LIZ();
            }
        }
        o.LJIIIIZZ(viewHolder3, "viewHolder");
        return viewHolder3;
    }

    @Override // X.InterfaceC49350JYk
    public final boolean LJJJLIIL(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return false;
        }
        return o.LJ(obj, obj2);
    }

    @Override // X.InterfaceC49498Jbi
    public final RecyclerView.ViewHolder LJJLIIIJLLLLLLLZ(ViewGroup parent, boolean z) {
        Boolean bool;
        ActivityC45651qj activityC45651qj;
        Boolean bool2;
        View LIZIZ;
        Object LIZ;
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(parent, "parent");
        Fragment LJIIIZ = C79234V7u.LJIIIZ(parent);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fragment: ");
        LIZ2.append(LJIIIZ);
        LIZ2.append(", isDetached: ");
        Object obj = null;
        if (LJIIIZ != null) {
            bool = Boolean.valueOf(LJIIIZ.isDetached());
        } else {
            bool = null;
        }
        LIZ2.append(bool);
        LIZ2.append(", activity: ");
        if (LJIIIZ != null) {
            activityC45651qj = LJIIIZ.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        LIZ2.append(activityC45651qj);
        LIZ2.append(", isFinishing: ");
        if (LJIIIZ != null && (mo49getActivity = LJIIIZ.mo49getActivity()) != null) {
            bool2 = Boolean.valueOf(mo49getActivity.isFinishing());
        } else {
            bool2 = null;
        }
        LIZ2.append(bool2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SearchMixFeedAdapter", X1D.LIZIZ(LIZ2));
        if (LJIIIZ == null || LJIIIZ.mo49getActivity() == null) {
            return null;
        }
        if (C50086JlC.LIZ().enableVideoLayoutPreInflate) {
            LIZIZ = C50365Jph.LIZIZ(R.layout.cj8, parent);
        } else {
            LIZIZ = C1FL.LIZIZ(parent, R.layout.cj8, parent, false, "{\n           LayoutInfla… parent, false)\n        }");
        }
        AqS97S0300000_8 aqS97S0300000_8 = new AqS97S0300000_8(LIZIZ, this, LJIIIZ, 4);
        if (z) {
            try {
                LIZ = (SearchVideoHolder) aqS97S0300000_8.invoke();
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m10exceptionOrNullimpl(LIZ) == null) {
                obj = LIZ;
            }
            return (RecyclerView.ViewHolder) obj;
        }
        return (RecyclerView.ViewHolder) aqS97S0300000_8.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if (X.C49369JZd.LIZIZ(r1) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cb, code lost:
    
        r8 = r8 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        r0 = r15.mmItems;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r0 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        r3 = r0.iterator();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        if (r3.hasNext() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        r2 = r3.next();
        r1 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r4 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        r2 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r4 <= r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
    
        if (r2.getFeedType() != 65280) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        X.C49369JZd.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        if (X.C49369JZd.LIZIZ(r2) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ff, code lost:
    
        if (r2.getFeedType() != 65465) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0103, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0124, code lost:
    
        X.C47261Igj.LJJJJJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0109, code lost:
    
        if (r1.getFeedType() == 65465) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF(int r16, X.JW9 r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVP.LLFF(int, X.JW9):void");
    }

    public final Integer LLFFF(int i, SearchMixFeed searchMixFeed) {
        List<T> list = this.mmItems;
        if (list == 0 || i < 0) {
            return null;
        }
        this.mmItems = list;
        ListProtector.add(list, i, searchMixFeed);
        notifyItemInserted(i);
        int size = list.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < size; i5++) {
            if (!((SearchMixFeed) ListProtector.get(list, i5)).LJIIIIZZ()) {
                if (i2 % 2 != 0 && i3 < i4 && i3 == -1) {
                    i3 = i5;
                }
            } else {
                if (i3 != -1) {
                    Object obj = ListProtector.get(list, i5);
                    if (i3 <= i5) {
                        int i6 = i3;
                        while (true) {
                            Object obj2 = ListProtector.get(list, i6);
                            ListProtector.set(list, i6, obj);
                            if (i6 == i5) {
                                break;
                            }
                            i6++;
                            obj = obj2;
                        }
                    }
                    notifyItemMoved(i5, i3);
                    i3 = -1;
                }
                i2++;
                i4 = i5;
            }
        }
        if (i != super.getItemCount()) {
            notifyItemRangeChanged(i, super.getItemCount());
        }
        return Integer.valueOf(LL() + i);
    }

    public final JQA LLIFFJFJJ(int i, SearchMixFeed searchMixFeed) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC50157JmL LIZ = K0M.LIZ();
        String str6 = "";
        if (LIZ == null) {
            str = "normal";
            str2 = "normal";
            str3 = "";
            str4 = "";
        } else {
            str3 = LIZ.LIZJ().LIZ;
            str4 = LIZ.LIZJ().LIZIZ;
            LIZ.LIZIZ();
            str2 = LIZ.LIZJ().LIZLLL;
            str = LIZ.LIZJ().LIZJ;
        }
        if (i % 10 == 0) {
            JVR.LIZJ("jedi");
        }
        LogPbBean logPbBean = searchMixFeed.LJLJJLL;
        if (logPbBean == null) {
            logPbBean = new LogPbBean();
        }
        String imprId = logPbBean.getImprId();
        if (imprId == null) {
            imprId = "";
        }
        String logPbStr = C3A5.LIZ.LIZLLL(imprId);
        JWD.LIZ.getClass();
        String LIZ2 = JWE.LIZ(3);
        InterfaceC49275JVn.LIZ.getClass();
        String LIZ3 = C49270JVi.LIZ(3);
        JQA jqa = new JQA();
        jqa.LJFF = "general_search";
        jqa.LIZ = true;
        SearchGlobalViewModel searchGlobalViewModel = this.LJLLI;
        String str7 = null;
        if (searchGlobalViewModel == null || (str5 = searchGlobalViewModel.gv0()) == null) {
            str5 = "unknown";
        }
        jqa.LJJIFFI = str5;
        SearchGlobalViewModel searchGlobalViewModel2 = this.LJLLI;
        if (searchGlobalViewModel2 != null) {
            str7 = searchGlobalViewModel2.jv0();
        }
        jqa.LIZ(str7);
        jqa.LIZJ(str3);
        jqa.LJIIIIZZ = imprId;
        o.LJIIIIZZ(logPbStr, "logPbStr");
        jqa.LJIIJJI = logPbStr;
        jqa.LJIIJ = logPbBean;
        int i2 = searchMixFeed.LJLILLLLZI;
        if (i2 < 0) {
            i2 = i;
        }
        jqa.LJIIL = i2;
        jqa.LIZLLL(str4);
        jqa.LIZIZ = 3;
        jqa.LIZJ = LIZ2;
        jqa.LIZLLL = LIZ3;
        if (str != null) {
            jqa.LJIJI = str;
        } else {
            jqa.LJIJI = "normal";
        }
        if (str2 != null) {
            jqa.LJIJJ = str2;
        } else {
            jqa.LJIJJ = "normal";
        }
        SearchCardInfo searchCardInfo = searchMixFeed.searchCardInfo;
        if (searchCardInfo != null) {
            String str8 = searchCardInfo.alasrc;
            if (str8 == null) {
                str8 = "";
            }
            jqa.LJJIJ = str8;
            String str9 = searchCardInfo.docId;
            if (str9 != null) {
                str6 = str9;
            }
            jqa.LJJIJIIJI = str6;
            jqa.LJJIJIIJIL = searchCardInfo;
        }
        return jqa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLII(int i, JWF jwf) {
        SearchMixFeed searchMixFeed;
        String str;
        Integer num;
        List<T> list;
        Aweme aweme;
        List<T> list2 = this.mmItems;
        if (list2 != 0) {
            searchMixFeed = (SearchMixFeed) ORZ.LJLLLLLL(i, list2);
        } else {
            searchMixFeed = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeProductCard:");
        if (searchMixFeed != null && (aweme = searchMixFeed.getAweme()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("  type:");
        if (searchMixFeed != null) {
            num = Integer.valueOf(searchMixFeed.getFeedType());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        this.LJZL = searchMixFeed;
        if (searchMixFeed == null || (list = this.mmItems) == 0) {
            return;
        }
        Object remove = ListProtector.remove(list, i);
        notifyItemRemoved(i);
        if (LLFZ(i)) {
            if (remove != null) {
                jwf.invoke(remove, null, null, 1);
                return;
            }
            return;
        }
        int i2 = i - 1;
        if (!LLFZ(i2) && ((getBasicItemViewType(i2) == 1 || getBasicItemViewType(i2) == 14) && getBasicItemViewType(i) == 5)) {
            Object LJLLLLLL = ORZ.LJLLLLLL(i, list);
            ListProtector.remove(list, i);
            notifyItemRemoved(i);
            notifyItemRangeChanged(i, list.size() - i);
            if (remove != null) {
                jwf.invoke(remove, LJLLLLLL, null, 2);
                return;
            }
            return;
        }
        notifyItemRangeChanged(i, list.size() - i);
        if (remove != null) {
            jwf.invoke(remove, null, null, 1);
        }
    }

    public final void LLIIIILZ(FollowStatus followStatus, User user) {
        if (user != null && o.LJ(followStatus.userId, user.getUid())) {
            user.setFollowStatus(followStatus.followStatus);
        }
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        if (JWC.LIZ.enableAsyncBind) {
            this.LLFII.LIZ(viewHolder, i);
        } else {
            LJIJJ(viewHolder, i);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (JWC.LIZ.enableAsyncBind) {
            return this.LLFII.LIZJ(parent, i);
        }
        return LJJJJL(i, parent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVP(RecyclerView recyclerView, JWH jwh, JYO jyo, InterfaceC191547fS loadMoreFunction) {
        super(false, 1, null);
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(loadMoreFunction, "loadMoreFunction");
        SearchGlobalViewModel searchGlobalViewModel = null;
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = jwh;
        this.LJLJI = jyo;
        this.LJLJJI = loadMoreFunction;
        this.LJLJL = new C49002JLa<>(this);
        this.LJLLL = new C49491Jbb(recyclerView, this);
        this.LJZ = -1;
        this.LJZI = -1;
        this.LLD = -1;
        this.LLFF = new C8YF<>(this);
        this.spanSizeLookup = new JVT(this);
        if (C50089JlF.LIZJ) {
            C50089JlF.LIZ.submit(RunnableC49377JZl.LJLIL);
        }
        if (!C49789JgP.LIZ()) {
            recyclerView.getRecycledViewPool().setMaxRecycledViews(1, 10);
        }
        SearchJediMixFeedFragment searchJediMixFeedFragment = jwh.LIZ;
        if (searchJediMixFeedFragment != null && (mo49getActivity = searchJediMixFeedFragment.mo49getActivity()) != null) {
            searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of(mo49getActivity).get(SearchGlobalViewModel.class);
        }
        this.LJLLI = searchGlobalViewModel;
        this.LJLLLL = new JZG(((Number) C34255DcR.LIZ.getValue()).intValue(), loadMoreFunction);
        if (((Number) C50552Jsi.LIZ.getValue()).intValue() != 0) {
            recyclerView.LJIIJ(new JY7(this));
        }
        this.LLFFF = new C73231Sod<>(this, new C73262Sp8());
        this.LLFII = JWL.LIZJ(recyclerView, this, JWL.LIZIZ(new IDqS452S0100000_6(this, 0)), JWL.LIZ(recyclerView, this, new AqS190S0100000_8(this, 57)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        if (r1 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLLLLLL(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r25, int r26, X.JQA r27) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JVP.LJLLLLLL(androidx.recyclerview.widget.RecyclerView$ViewHolder, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, int, X.JQA):void");
    }

    public void LLIIII(Aweme aweme, boolean z, String str, long j, long j2) {
        if (!C50989Jzl.LJI(this.LJLIL.getContext())) {
            return;
        }
        String shareId = C48880JGi.LIZ(this.LJLILLLLZI.getIdentifier(), aweme.getAid());
        o.LJIIIIZZ(shareId, "shareId");
        C48892JGu.LIZIZ(aweme, z, shareId, j, j2);
    }
}
