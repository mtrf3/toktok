package X;

import Y.ACallableS45S0201000_9;
import Y.AgS126S0100000_9;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.LastViewData;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import yq4.a;

/* renamed from: X.LgN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54883LgN extends AbstractC51037K1h<FollowFeed, FollowFeedList> implements Cloneable, InterfaceC224118qt {
    public static final HashMap<String, Aweme> LJLLI = new HashMap<>();
    public boolean LJLJI;
    public int LJLJJI;
    public boolean LJLJLJ;
    public final String LJLIL = "homepage_follow";
    public final String LJLILLLLZI = "extra_follow_type_follow";
    public int LJLJJL = -1;
    public final List<FollowFeed> LJLJJLL = new CopyOnWriteArrayList();
    public final InterfaceC54390LWg LJLJL = C57738MlK.LIZIZ.LJIIL().LJIIIZ(StateOwner.LJLIL.LIZLLL());
    public int LJLJLLL = -1;
    public int LJLL = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> LJIIJJI() {
        if (this.mData == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<FollowFeed> getItems() {
        Aweme aweme;
        if (this.mData == 0) {
            return null;
        }
        Iterator it = new ArrayList(((FollowFeedList) this.mData).getItems()).iterator();
        while (it.hasNext()) {
            AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) it.next();
            if (abstractC49325JXl != null && (aweme = abstractC49325JXl.getAweme()) != null) {
                aweme.setLogPbBean(((FollowFeedList) this.mData).getLogPb());
            }
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((FollowFeedList) t).isHasMore()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.follow.presenter.FollowFeedList, T] */
    public final Object clone() {
        try {
            C8BS c8bs = (C8BS) super.clone();
            c8bs.mData = ((FollowFeedList) this.mData).m121clone();
            return c8bs;
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        return LJIIL(getItems());
    }

    public static List<Aweme> LJIIL(List<FollowFeed> list) {
        Aweme aweme;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280 && (aweme = followFeed.getAweme()) != null && (!aweme.isForwardAweme() || aweme.getForwardItem() != null)) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x032e, code lost:
    
        r12 = (java.util.ArrayList) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0335, code lost:
    
        if (r12.isEmpty() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x035a, code lost:
    
        r11 = new java.util.HashSet();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0364, code lost:
    
        if (r2 >= r12.size()) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0366, code lost:
    
        r11.add(((com.ss.android.ugc.aweme.feed.model.Aweme) com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r2)).getAid());
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0560, code lost:
    
        if (X.LFV.LIZ(((X.AbstractC49325JXl) com.bytedance.mt.protector.impl.collections.ListProtector.get(((com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r14.mData).getItems(), r1)).getAweme()) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0982, code lost:
    
        if (r0 == null) goto L389;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0a26  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0a5f  */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.ss.android.ugc.aweme.follow.presenter.FollowFeedList, T] */
    @Override // X.C8BS
    /* renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r15) {
        /*
            Method dump skipped, instructions count: 2671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54883LgN.handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(FollowFeedList followFeedList) {
        LastViewData lastViewData;
        if (followFeedList == null || (lastViewData = followFeedList.lastViewData) == null) {
            return;
        }
        int i = lastViewData.index;
        int i2 = this.mListQueryType;
        if (i2 != 1) {
            if (i2 == 4) {
                List<Aweme> awemeList = getAwemeList();
                if (((FollowFeedList) this.mData).getLastViewData() == null && i >= 0 && !C79004UzY.LJJIFFI(awemeList)) {
                    this.LJLJJL = ((ArrayList) awemeList).size() + i;
                } else {
                    this.LJLJJL = -1;
                }
            }
        } else if (i > 0) {
            this.LJLJJL = i;
        } else {
            this.LJLJJL = -1;
        }
        ((FollowFeedList) this.mData).setLastViewData(followFeedList.getLastViewData());
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        Object obj = message.obj;
        if (obj instanceof Exception) {
            C16880lQ.LLLLIIL((Exception) obj);
            List<C8BT> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<C8BT> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onFailed((Exception) message.obj);
                }
            }
            LJIILL(this.LJLJLLL, 0, "", ((Throwable) message.obj).getMessage());
            return;
        }
        C10K.LIZIZ(new ACallableS45S0201000_9(0, this, Message.obtain(message), 0), C38995FSd.LIZLLL(), null).LJ(new AgS126S0100000_9(this, 1), C10K.LJIIIIZZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        C54394LWk c54394LWk;
        long j;
        int i;
        long maxCursor;
        String LIZLLL;
        if (objArr.length >= 2) {
            Object obj = objArr[1];
            if ((obj instanceof C54394LWk) && (c54394LWk = (C54394LWk) obj) != null) {
                int i2 = this.LJLJJI;
                T t = this.mData;
                if (t != 0) {
                    j = ((FollowFeedList) t).getCursor();
                } else {
                    j = 0;
                }
                T t2 = this.mData;
                if (t2 != 0) {
                    i = ((FollowFeedList) t2).getLevel();
                } else {
                    i = 1;
                }
                if (C79004UzY.LJJIFFI(getItems())) {
                    maxCursor = 0;
                } else {
                    maxCursor = ((FollowFeedList) this.mData).getMaxCursor();
                }
                int i3 = c54394LWk.LIZIZ;
                int i4 = c54394LWk.LIZJ;
                String str = c54394LWk.LIZLLL;
                String str2 = c54394LWk.LJ;
                int isRecommend = ((FollowFeedList) this.mData).getIsRecommend();
                String LIZ = FLE.LIZ("feed");
                int LJIILIIL = a.LJIIJ().LJIILIIL();
                String LIZJ = a.LJIIZILJ().LIZJ();
                if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
                    LIZLLL = "";
                } else {
                    LIZLLL = EU3.LIZLLL();
                }
                LJIIJ(i2, j, i, maxCursor, -1L, i3, i4, str, str2, null, null, null, isRecommend, 0, LIZ, LJIILIIL, LIZJ, LIZLLL, C78688UuS.LJJIIJZLJL(), C78688UuS.LJJIIJ());
            }
        }
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        C54394LWk c54394LWk;
        String str;
        String LIZLLL;
        if (objArr.length >= 2) {
            Object obj = objArr[1];
            if ((obj instanceof C54394LWk) && (c54394LWk = (C54394LWk) obj) != null) {
                String str2 = c54394LWk.LJ;
                if (TextUtils.isEmpty(str2)) {
                    str = c54394LWk.LJIIIIZZ;
                } else {
                    str = str2;
                }
                Integer num = c54394LWk.LJFF;
                if (num != null) {
                    int i = this.LJLJJI + 1;
                    this.LJLJJI = i;
                    int i2 = c54394LWk.LIZIZ;
                    int i3 = c54394LWk.LIZJ;
                    String str3 = c54394LWk.LIZLLL;
                    String str4 = c54394LWk.LJI;
                    int intValue = num.intValue();
                    String LIZ = FLE.LIZ("feed");
                    int LJIILIIL = a.LJIIJ().LJIILIIL();
                    String LIZJ = a.LJIIZILJ().LIZJ();
                    if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
                        LIZLLL = "";
                    } else {
                        LIZLLL = EU3.LIZLLL();
                    }
                    LJIIJ(i, 0L, 1, 0L, 0L, i2, i3, str3, "", str4, str2, str, 0, intValue, LIZ, LJIILIIL, LIZJ, LIZLLL, C78688UuS.LJJIIJZLJL(), C78688UuS.LJJIIJ());
                }
                C54885LgP.LIZ.LJIIIIZZ(-1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.follow.presenter.FollowFeedList, T] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<FollowFeed> list) {
        if (this.mData == 0) {
            this.mData = new FollowFeedList();
        }
        ((FollowFeedList) this.mData).setItems(list);
    }

    public static final boolean LJIIIZ(Aweme aweme, Aweme aweme2) {
        if (aweme.isLiveNoDeduplicate() && FW9.LIZ()) {
            if (aweme2 != null && LFV.LIZ(aweme2)) {
                return true;
            }
            return false;
        }
        if (!aweme.isAd()) {
            return true;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    public final void LJIILL(int i, int i2, String str, String str2) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("feed_r_type", Integer.valueOf(i));
        c198517qh.LIZ.put("feed_r_pull_type", Integer.valueOf(this.LJLL));
        c198517qh.LIZIZ(Integer.valueOf(i2), "origin_count");
        if (!TextUtils.isEmpty(str)) {
            c198517qh.LIZLLL("request_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c198517qh.LIZLLL("error_desc", str2);
        }
        C8HX.LIZIZ("aweme_feed_fetch_abnormal_log", "", c198517qh.LJ());
    }

    public final void LJIIJ(int i, long j, int i2, long j2, long j3, int i3, int i4, String str, String str2, String str3, String str4, String str5, int i5, int i6, String str6, int i7, String str7, String str8, String str9, String str10) {
        String LIZIZ;
        boolean booleanValue = SharePrefCache.inst().getIsContactsUploaded().LIZ().booleanValue();
        int[] LIZ = J7H.LIZ(101);
        if (LIZ == null) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ[0]);
            LIZ2.append("_");
            LIZ2.append(LIZ[1]);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        FGR.LIZIZ().LIZ(this.mHandler, new CallableC54388LWe(this, j2, j3, i3, i4, str, str5, booleanValue ? 1 : 0, i5, str2, i, j, i2, str3, str4, i6, LIZIZ, str6, i7, str7, str8, str9, str10), 0);
    }
}
