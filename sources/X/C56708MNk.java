package X;

import Y.ACallableS112S0100000_9;
import Y.IDComparatorS341S0100000_9;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MNk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56708MNk extends AbstractC51036K1g<FollowPageData, FollowPageResponse> {
    public final boolean LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final java.util.Set<String> LJLJLLL;
    public final List<FollowPageData> LJLL;
    public final IDComparatorS341S0100000_9 LJLLI;

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        return true;
    }

    public C56708MNk() {
        boolean z;
        if (C46604IQu.LIZLLL() || C56630MKk.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        this.LJLJLLL = new LinkedHashSet();
        this.LJLL = new ArrayList();
        this.LJLLI = new IDComparatorS341S0100000_9(this, 1);
    }

    public final void LJIILIIL() {
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS112S0100000_9(this, 21), 1001);
    }

    @Override // X.AbstractC51036K1g
    public final List<FollowPageData> getItems() {
        return this.LJLL;
    }

    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        return this.LJLJJL;
    }

    public final List<FollowPageData> LJIIJJI(List<FollowPageData> list) {
        if (C53551Kzz.LIZ()) {
            if (this.mListQueryType == 1) {
                if (list.isEmpty() || list.size() <= 1) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(ListProtector.get(list, 0));
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                for (FollowPageData followPageData : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (i > 0) {
                            arrayList2.add(followPageData);
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                arrayList.addAll(ORZ.LLILII(this.LJLLI, arrayList2));
                return arrayList;
            }
            return ORZ.LLILII(this.LJLLI, list);
        }
        return list;
    }

    public final boolean LJIIL(FollowPageData followPageData) {
        MusNotice notice = followPageData.getNotice();
        if (notice != null) {
            java.util.Set<String> set = this.LJLJLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('n');
            LIZ.append(notice.nid);
            if (set.contains(X1D.LIZIZ(LIZ))) {
                return true;
            }
        }
        FollowRequestData followRequest = followPageData.getFollowRequest();
        if (followRequest != null) {
            java.util.Set<String> set2 = this.LJLJLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('u');
            LIZ2.append(followRequest.getUser().getUid());
            if (set2.contains(X1D.LIZIZ(LIZ2))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C8BS
    public final void handleData(Object obj) {
        boolean z;
        boolean z2;
        List<FollowPageData> LJIIJJI;
        List<FollowPageData> LJIIJJI2;
        boolean z3;
        C56709MNl LIZIZ;
        FollowPageResponse followPageResponse = (FollowPageResponse) obj;
        super.handleData(followPageResponse);
        if (followPageResponse == null) {
            return;
        }
        int i = 0;
        if ((this.LJLILLLLZI == 0 && this.LJLJI == 0) || this.mListQueryType == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = followPageResponse.getNoticeMaxTime();
        this.LJLJI = followPageResponse.getNoticeMinTime();
        this.LJLJJI = followPageResponse.getFollowReqOffset();
        this.LJLJJLL = followPageResponse.getNoticeLastReadTime();
        followPageResponse.getTotal();
        List<FollowPageData> data = followPageResponse.getData();
        if (data == null || data.isEmpty()) {
            z2 = false;
        } else {
            z2 = followPageResponse.getHasMore();
        }
        this.LJLJJL = z2;
        if (z) {
            ((ArrayList) this.LJLL).clear();
            this.LJLJLLL.clear();
            if (this.LJLJL) {
                FollowerPreCacheManager.LIZLLL = true;
            } else {
                if (C56762MPm.LIZIZ()) {
                    EnumC56764MPo.LJLJL.LIZJ();
                }
                if (followPageResponse.getData() != null && C53104Ksm.LIZ() && (LIZIZ = FollowerPreCacheManager.LIZIZ()) != null) {
                    synchronized (LIZIZ) {
                        LIZIZ.LIZJ = new FollowerPreCacheManager.FollowNoticeData(System.currentTimeMillis(), followPageResponse);
                        LIZIZ.LIZLLL.clear();
                        List<FollowPageData> data2 = followPageResponse.getData();
                        if (data2 != null) {
                            Iterator<FollowPageData> it = data2.iterator();
                            while (it.hasNext()) {
                                LIZIZ.LIZ(it.next());
                            }
                        }
                    }
                }
                FollowerPreCacheManager.LIZLLL = false;
                if (!this.LJLJLJ) {
                    C68925R3h.LIZ("new_followers");
                }
            }
        }
        C56706MNi c56706MNi = C56706MNi.LJI;
        c56706MNi.getClass();
        if (c56706MNi.LJI()) {
            List<FollowPageData> data3 = followPageResponse.getData();
            if (data3 == null || data3.isEmpty()) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str = null;
            if (z3 || followPageResponse.error_code != 0) {
                c56706MNi.LIZIZ = 0;
                c56706MNi.LIZLLL = followPageResponse.error_code;
                c56706MNi.LIZJ = followPageResponse.status_code;
                BaseResponse.ServerTimeExtra serverTimeExtra = followPageResponse.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                }
                c56706MNi.LJFF = str;
            } else {
                c56706MNi.LIZIZ = 1;
                c56706MNi.LIZJ = followPageResponse.status_code;
                c56706MNi.LIZLLL = 0;
                BaseResponse.ServerTimeExtra serverTimeExtra2 = followPageResponse.extra;
                if (serverTimeExtra2 != null) {
                    str = serverTimeExtra2.logid;
                }
                c56706MNi.LJFF = str;
                List<FollowPageData> data4 = followPageResponse.getData();
                if (data4 != null) {
                    i = data4.size();
                }
                C56706MNi.LJIIJJI = i;
                C56706MNi.LJIIL = followPageResponse.getTotal();
                C56706MNi.LJIIJ = followPageResponse.getHasMore();
            }
            c56706MNi.LJII();
        } else {
            c56706MNi.LIZLLL();
        }
        if (C56775MPz.LIZJ()) {
            long j = C56678MMg.LJII().getLong("last_visit_follower_subpage", 0L);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getFollowerSubpageLastVisit value = ");
            LIZ.append(j);
            C221018lt.LJFF("InboxDataCache", X1D.LIZIZ(LIZ));
            this.LJLJJLL = j;
            List<FollowPageData> data5 = followPageResponse.getData();
            if (data5 == null || (LJIIJJI2 = LJIIJJI(data5)) == null) {
                return;
            }
            for (FollowPageData followPageData : LJIIJJI2) {
                followPageData.setLastReadTime(this.LJLJJLL);
                if (!LJIIL(followPageData)) {
                    LJIIIZ(this.LJLL, followPageData);
                }
            }
            return;
        }
        List<FollowPageData> data6 = followPageResponse.getData();
        if (data6 == null || (LJIIJJI = LJIIJJI(data6)) == null) {
            return;
        }
        for (FollowPageData followPageData2 : LJIIJJI) {
            if (!LJIIL(followPageData2)) {
                LJIIIZ(this.LJLL, followPageData2);
            }
        }
    }

    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... params) {
        o.LJIIIZ(params, "params");
        LJIILIIL();
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... params) {
        FollowerPreCacheManager.FollowNoticeData LIZIZ;
        o.LJIIIZ(params, "params");
        boolean z = false;
        boolean z2 = true;
        for (Object obj : params) {
            if (obj instanceof C56715MNr) {
                C56715MNr c56715MNr = (C56715MNr) obj;
                z = c56715MNr.LJLIL;
                z2 = c56715MNr.LJLILLLLZI;
                this.LJLJLJ = c56715MNr.LJLJI;
            }
        }
        if (z) {
            this.LJLJL = true;
            if (C56762MPm.LIZIZ()) {
                EnumC56764MPo.LJLLI.LJ(1);
            }
            Message obtainMessage = this.mHandler.obtainMessage(0);
            o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
            C56709MNl LIZIZ2 = FollowerPreCacheManager.LIZIZ();
            FollowPageResponse followPageResponse = null;
            if (LIZIZ2 != null && (LIZIZ = LIZIZ2.LIZIZ()) != null) {
                followPageResponse = LIZIZ.resp;
            }
            obtainMessage.obj = followPageResponse;
            FollowerPreCacheManager.LIZLLL = true;
            handleMsg(obtainMessage);
        } else if (C56762MPm.LIZIZ()) {
            EnumC56764MPo.LJLLI.LJ(0);
        }
        if (z2) {
            this.LJLJI = 0L;
            this.LJLILLLLZI = 0L;
            this.LJLJJI = 0L;
            this.LJLJL = false;
            if (C56762MPm.LIZIZ()) {
                EnumC56764MPo.LJLJL.start();
            }
            LJIILIIL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData> r4, com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r2 = r5.getNotice()
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r0 = 110(0x6e, float:1.54E-43)
            r1.append(r0)
            java.lang.String r0 = r2.nid
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            if (r1 != 0) goto L38
        L1a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData r2 = r5.getFollowRequest()
            if (r2 == 0) goto L43
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r0 = 117(0x75, float:1.64E-43)
            r1.append(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r2.getUser()
            java.lang.String r0 = r0.getUid()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
        L38:
            java.util.Set<java.lang.String> r0 = r3.LJLJLLL
            r0.add(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.add(r5)
            return
        L43:
            java.lang.String r1 = ""
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56708MNk.LJIIIZ(java.util.List, com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData):void");
    }

    public static int LJIIJ(FollowPageData followPageData, FollowPageData followPageData2, EnumC56711MNn enumC56711MNn) {
        if (enumC56711MNn == EnumC56711MNn.CREATE_TIME) {
            return enumC56711MNn.weight(followPageData, followPageData2) - enumC56711MNn.weight(followPageData2, followPageData);
        }
        return enumC56711MNn.weight(followPageData) - enumC56711MNn.weight(followPageData2);
    }
}
