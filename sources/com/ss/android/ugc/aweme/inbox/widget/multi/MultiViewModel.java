package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC56676MMe;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C221018lt;
import X.C221108m2;
import X.C2NU;
import X.C3C5;
import X.C46604IQu;
import X.C47261Igj;
import X.C51774KTq;
import X.C52548Kjo;
import X.C52999Kr5;
import X.C53357Kwr;
import X.C53364Kwy;
import X.C54316LTk;
import X.C55661Lsv;
import X.C56434MCw;
import X.C56652MLg;
import X.C56653MLh;
import X.C56678MMg;
import X.C56685MMn;
import X.C56689MMr;
import X.C56693MMv;
import X.C56702MNe;
import X.C56720MNw;
import X.C61878OQg;
import X.C62822Ol8;
import X.C68322mC;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78685UuP;
import X.EnumC123114sN;
import X.EnumC56648MLc;
import X.EnumC56696MMy;
import X.EnumC56697MMz;
import X.EnumC57165Mc5;
import X.EnumC94693nd;
import X.FMX;
import X.HH1;
import X.IRL;
import X.L61;
import X.L6F;
import X.LA9;
import X.M9K;
import X.M9P;
import X.MLS;
import X.MN2;
import X.MN5;
import X.MNJ;
import X.MNO;
import X.MNP;
import X.MS5;
import X.ORZ;
import X.OSZ;
import X.V1B;
import X.X1D;
import Y.ARunnableS10S1100000_9;
import Y.ARunnableS20S0300000_9;
import Y.ARunnableS28S0200000_9;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.vm.InboxActivityNoticeVM;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFriendPostResponse;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceExposedInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.KeyValueHolder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0101000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MultiViewModel extends ViewModel {
    public static final int LLIZLLLIL = C56702MNe.LIZ;
    public static final C62822Ol8 LLJ = C221108m2.LIZIZ(M9K.LJLIL);
    public static final C62822Ol8 LLJI = C221108m2.LIZIZ(M9P.LJLIL);
    public static final C62822Ol8 LLJIJIL = C221108m2.LIZIZ(C56693MMv.LJLIL);
    public final MutableLiveData<List<AbstractC56676MMe>> LJLIL;
    public final MutableLiveData LJLILLLLZI;
    public final MutableLiveData<EnumC94693nd> LJLJI;
    public final MutableLiveData LJLJJI;
    public final NextLiveData LJLJJL;
    public final NextLiveData<Boolean> LJLJJLL;
    public final C73318Sq2 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C56720MNw LJLJLLL;
    public final ActivityPod LJLL;
    public C56689MMr LJLLI;
    public SkylightLiveGuidePod LJLLILLLL;
    public boolean LJLLJ;
    public volatile C56685MMn LJLLL;
    public volatile InboxHorizontalTopListCombinePod LJLLLL;
    public volatile ActivityPod LJLLLLLL;
    public volatile InboxEntrancePod LJLZ;
    public volatile InboxEntrancePod LJZ;
    public volatile ActivityPod LJZI;
    public volatile InboxEntrancePod LJZL;
    public volatile InboxEntrancePod LL;
    public volatile ActivityPod LLD;
    public volatile ActivityNoticePod LLF;
    public volatile InboxEntrancePod LLFF;
    public volatile InboxEntrancePod LLFFF;
    public volatile List<InboxEntrancePod> LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public InsertStory LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public InboxActivityNoticeVM LLIIIL;
    public boolean LLIIIZ;
    public long LLIIJI;
    public int LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public final C62822Ol8 LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public InboxEntrancePod LLILII;
    public NoticeCombineResponse LLILIL;
    public NoticeListsResponse LLILL;
    public FollowPageResponse LLILLIZIL;
    public StoryGetFeedByPageResponse LLILLJJLI;
    public InboxNoticePreviewWindowResponse LLILLL;
    public InboxEntranceResponse LLILZ;
    public SkylightDataResponse LLILZIL;
    public OnThisDayResponse LLILZLL;
    public SkylightFriendPostResponse LLIZ;

    public static boolean mv0(int i) {
        return (i & 2) == 2 || (i & 4) == 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiViewModel() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.<init>():void");
    }

    public static C56689MMr gv0() {
        C56689MMr c56689MMr = null;
        EnumC56648MLc decideDisplay$default = EnumC57165Mc5.decideDisplay$default(EnumC57165Mc5.CONTACTS, null, null, 3, null);
        int i = 1;
        if (decideDisplay$default == EnumC56648MLc.TOP && decideDisplay$default != null) {
            if (!((Boolean) C46604IQu.LIZJ.getValue()).booleanValue()) {
                if (((Boolean) C46604IQu.LJ.getValue()).booleanValue()) {
                    i = 2;
                } else {
                    i = -1;
                }
            }
            c56689MMr = new C56689MMr(i);
        }
        return c56689MMr;
    }

    public final SkylightLiveGuidePod jv0() {
        if (((Number) C52999Kr5.LIZ.getValue()).intValue() == 0) {
            return null;
        }
        boolean z = false;
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        LiveOuterService.LJJJLL().LJIIJJI();
        if (C55661Lsv.LJIILL().contains(currentUserID)) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiViewModel#getSkylightLiveGuidePod direct _skylightLiveGuidePod(isNull) = ");
        if (this.LJLLILLLL == null) {
            z = true;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        return this.LJLLILLLL;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LJLJL.dispose();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0117, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lv0() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.lv0():void");
    }

    public static OSZ hv0(InboxEntrancePod inboxEntrancePod) {
        Integer num;
        String str;
        int LIZLLL = MLS.LIZLLL(inboxEntrancePod.entranceCell);
        InboxEntranceCellUIInfo LIZIZ = MLS.LIZIZ(inboxEntrancePod);
        if (LIZIZ != null) {
            num = Integer.valueOf(LIZIZ.getUnreadType());
        } else {
            num = null;
        }
        if (LIZLLL > 0 && num != null) {
            if (num.intValue() == 1) {
                str = "yellow_dot";
            } else if (num.intValue() == 2) {
                str = "number_dot";
            }
            return new OSZ(Integer.valueOf(LIZLLL), str);
        }
        str = "report_null";
        return new OSZ(Integer.valueOf(LIZLLL), str);
    }

    public static OSZ iv0(RedPoint redPoint) {
        String str;
        int i = redPoint.unreadCount;
        if (i > 0) {
            MN2 mn2 = redPoint.type;
            if (mn2 == MN2.COUNT) {
                str = "number_dot";
            } else if (mn2 == MN2.DOT) {
                str = "yellow_dot";
            }
            return new OSZ(String.valueOf(i), str);
        }
        str = "report_null";
        return new OSZ(String.valueOf(i), str);
    }

    public final void Av0(InboxEntrancePod inboxEntrancePod) {
        Object LIZ;
        Object LIZ2;
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
        if (inboxEntranceCell.isActivity()) {
            if (C53357Kwr.LIZIZ()) {
                this.LLFFF = inboxEntrancePod;
                try {
                    C56678MMg.LJII().storeInt("inbox_activity_notice_entrance_unread_count", MLS.LIZLLL(inboxEntrancePod.entranceCell));
                    LIZ2 = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                if (m10exceptionOrNullimpl != null) {
                    C221018lt.LIZJ("InboxDataCache", "storeInboxActivityNoticeEntranceUnreadCount error", m10exceptionOrNullimpl);
                    return;
                }
                return;
            }
            this.LJLZ = inboxEntrancePod;
            return;
        }
        if (inboxEntranceCell.isFollower()) {
            this.LL = inboxEntrancePod;
            try {
                C56678MMg.LJII().storeInt("inbox_follower_entrance_unread_count", inboxEntrancePod.entranceCell.getUnreadCount());
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th2) {
                LIZ = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl2 != null) {
                C221018lt.LIZJ("InboxDataCache", "storeInboxFollowerEntranceUnreadCount error", m10exceptionOrNullimpl2);
                return;
            }
            return;
        }
        ((ArrayList) this.LLFII).add(inboxEntrancePod);
    }

    public final void kv0(List<InboxEntranceCell> list) {
        boolean z;
        boolean z2;
        NoticeItems notices;
        List<MusNotice> items;
        if (list == null) {
            return;
        }
        ((ArrayList) this.LLFII).clear();
        this.LL = null;
        Iterator<InboxEntranceCell> it = list.iterator();
        while (it.hasNext()) {
            InboxEntrancePod inboxEntrancePod = new InboxEntrancePod(it.next());
            Av0(inboxEntrancePod);
            InboxEntranceExposedInfo exposedInfo = inboxEntrancePod.entranceCell.getExposedInfo();
            if (exposedInfo != null && (notices = exposedInfo.getNotices()) != null && (items = notices.getItems()) != null) {
                L6F.LIZIZ.LIZLLL(L61.STORY, null, items, C51774KTq.LJLIL);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onComplete update config entrance size = ");
        LIZ.append(((ArrayList) this.LLFII).size());
        LIZ.append(", activityNotice ");
        boolean z3 = false;
        if (this.LLFFF != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(", activity ");
        if (this.LJLZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ.append(z2);
        LIZ.append(", follower ");
        if (this.LL != null) {
            z3 = true;
        }
        HH1.LIZIZ(LIZ, z3, LIZ, "MultiViewModel");
    }

    public final void nv0(boolean z) {
        if (z) {
            if (this.LJLLI != null) {
                this.LJLLI = null;
                rv0(false);
                return;
            }
            return;
        }
        if (this.LJLLI != null) {
            return;
        }
        this.LJLLI = gv0();
        rv0(false);
    }

    public final void ov0(int i) {
        if (this.LJLJI.getValue() == EnumC94693nd.LOADING) {
            return;
        }
        C56434MCw c56434MCw = C56652MLg.LIZJ;
        HashSet<Integer> value = c56434MCw.LIZ.getValue();
        if (value != null && value.contains(0)) {
            C56653MLh c56653MLh = C56652MLg.LIZIZ;
            if (c56653MLh.LIZIZ) {
                long currentTimeMillis = System.currentTimeMillis() - c56653MLh.LIZ;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("state", "init");
                c188727au.LJ(currentTimeMillis, "duration");
                FMX.LJIIL("inbox_skylight_lifecycle", c188727au.LIZ);
                c56653MLh.LIZIZ = false;
            }
        }
        C56653MLh c56653MLh2 = C56652MLg.LIZIZ;
        c56653MLh2.getClass();
        c56653MLh2.LIZLLL = System.currentTimeMillis();
        c56434MCw.LIZIZ(2);
        if (ActivityStack.getTopActivity() != null) {
            try {
                if (!C2NU.LIZ.LIZIZ()) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        this.LLIL = 0;
        this.LLIIJLIL = 0;
        this.LLIIL = false;
        this.LLIILII = false;
        this.LLILII = null;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRefresh ");
        LIZ.append(i);
        C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ));
        this.LLIIJI = System.currentTimeMillis();
        this.LJLJI.postValue(EnumC94693nd.LOADING);
        MS5.LJI(new AqS108S0101000_9(this, i, 0));
        if (C54316LTk.LIZJ) {
            ECommerceService.createIECommerceServicebyMonsterPlugin(false).inboxService().LIZ(EnumC123114sN.REFRESH_CART_COUNT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pv0(X.AbstractC56676MMe r5) {
        /*
            r4 = this;
            androidx.lifecycle.MutableLiveData r0 = r4.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L35
            java.util.List r3 = X.ORZ.LLJILJILJ(r0)
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.indexOf(r5)
            if (r1 < 0) goto L42
            r0.size()
            int r0 = r0.size()
            if (r1 >= r0) goto L42
            r0 = 1
        L21:
            r2 = 0
            if (r0 != 0) goto L3d
            r1 = r2
        L25:
            boolean r0 = r1 instanceof X.C56689MMr
            if (r0 == 0) goto L36
            r4.LJLLI = r2
            X.MLc r0 = X.EnumC56648MLc.TOP
            X.C56760MPk.LIZIZ(r0)
        L30:
            androidx.lifecycle.MutableLiveData<java.util.List<X.MMe>> r0 = r4.LJLIL
            r0.setValue(r3)
        L35:
            return
        L36:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.inbox.widget.multi.SkylightLiveGuidePod
            if (r0 == 0) goto L30
            r4.LJLLILLLL = r2
            goto L30
        L3d:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.remove(r3, r1)
            goto L25
        L42:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.pv0(X.MMe):void");
    }

    public final void rv0(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("postCombinedData ");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C221018lt.LIZ("MultiViewModel", X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        boolean LIZ2 = C53364Kwy.LIZ();
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LJLLLL;
        if (inboxHorizontalTopListCombinePod != null) {
            inboxHorizontalTopListCombinePod.setDefault(z);
            arrayList.add(inboxHorizontalTopListCombinePod);
        }
        if (LA9.LIZ(true)) {
            arrayList.add(new MNO());
        }
        C56685MMn c56685MMn = this.LJLLL;
        if (c56685MMn != null) {
            arrayList.add(c56685MMn);
        }
        if (C53357Kwr.LIZIZ()) {
            if (LIZ2) {
                InboxEntrancePod inboxEntrancePod = this.LLFFF;
                if (inboxEntrancePod != null) {
                    arrayList.add(inboxEntrancePod);
                }
            } else {
                ActivityNoticePod activityNoticePod = this.LLF;
                if (activityNoticePod != null) {
                    arrayList.add(activityNoticePod);
                }
            }
            arrayList.add(new MNP());
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("postCombinedData activityNoticeEntrancePod ");
        LIZ3.append(this.LLFFF);
        C221018lt.LIZ("MultiViewModel", X1D.LIZIZ(LIZ3));
        C56689MMr c56689MMr = this.LJLLI;
        if (c56689MMr != null) {
            arrayList.add(c56689MMr);
        }
        SkylightLiveGuidePod jv0 = jv0();
        if (jv0 != null) {
            arrayList.add(jv0);
        }
        if (LIZ2) {
            InboxEntrancePod inboxEntrancePod2 = this.LL;
            if (inboxEntrancePod2 != null) {
                arrayList.add(inboxEntrancePod2);
            }
        } else {
            ActivityPod activityPod = this.LJZI;
            if (activityPod != null) {
                arrayList.add(activityPod);
            }
        }
        if (!C53357Kwr.LIZIZ()) {
            if (LIZ2) {
                InboxEntrancePod inboxEntrancePod3 = this.LJLZ;
                if (inboxEntrancePod3 != null) {
                    arrayList.add(inboxEntrancePod3);
                }
            } else {
                arrayList.add(this.LJLLLLLL);
            }
        }
        ActivityPod activityPod2 = this.LLD;
        if (activityPod2 != null) {
            arrayList.add(activityPod2);
        }
        arrayList.addAll(this.LLFII);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("postCombinedData before filter size = ");
        LIZ4.append(arrayList.size());
        C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ4));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(arrayList, i2);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("postCombinedData data = ");
            LIZ5.append(i2);
            LIZ5.append(' ');
            LIZ5.append(obj);
            C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ5));
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("postCombinedData after filter size= ");
        LIZ6.append(arrayList2.size());
        C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ6));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC56676MMe) it.next()).isLoading = z;
        }
        List LLILII = ORZ.LLILII(MNJ.LJLIL, arrayList2);
        V1B.LJLJJI(this.LJLIL, LLILII);
        if (C52548Kjo.LIZ()) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : LLILII) {
                if (obj2 instanceof InboxHorizontalTopListCombinePod) {
                    arrayList3.add(obj2);
                }
            }
            int i3 = !arrayList3.isEmpty() ? 1 : 0;
            for (Object obj3 : LLILII) {
                int i4 = i + 1;
                if (i >= 0) {
                    AbstractC56676MMe abstractC56676MMe = (AbstractC56676MMe) obj3;
                    if ((abstractC56676MMe instanceof InboxEntrancePod) && ((InboxEntrancePod) abstractC56676MMe).entranceCell.getCellId() == 7) {
                        this.LLIIZ = i - i3;
                        return;
                    }
                    i = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void sv0(boolean z) {
        boolean z2;
        ActivityPod activityPod;
        ActivityNoticePod activityNoticePod;
        ActivityNoticePod LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerSkeletonWithCache, isBufferLoad: ");
        LIZ.append(C56678MMg.LJ().LJFF);
        C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ));
        if (!C56678MMg.LJ().LJFF) {
            rv0(true);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InboxHorizontalTopListCombinePod(C61878OQg.INSTANCE, null, null, 0L, true, null, null, null, 238, null));
        if (C53357Kwr.LIZIZ()) {
            if (C53364Kwy.LIZ()) {
                InboxEntrancePod inboxEntrancePod = this.LLFFF;
                if (inboxEntrancePod != null) {
                    C221018lt.LJFF("MultiViewModel", "cache hit- activityNotice,loaded activityNoticeEntrancePod");
                    arrayList.add(inboxEntrancePod);
                } else if (z) {
                    InboxEntranceCell entranceCell = this.LLFF.entranceCell;
                    o.LJIIIZ(entranceCell, "entranceCell");
                    InboxEntrancePod inboxEntrancePod2 = new InboxEntrancePod(entranceCell);
                    inboxEntrancePod2.asSkeleton$awemenotice_release();
                    arrayList.add(inboxEntrancePod2);
                }
            } else {
                C56720MNw c56720MNw = this.LJLJLLL;
                c56720MNw.getClass();
                InboxNoticePreviewWindowResponse LJI = C56678MMg.LJI();
                if (LJI != null && (LIZIZ = c56720MNw.LIZIZ(LJI)) != null) {
                    this.LLF = LIZIZ;
                    arrayList.add(LIZIZ);
                } else if (z && (activityNoticePod = this.LLF) != null) {
                    List<MusNotice> list = activityNoticePod.noticeList;
                    RedPoint redPoint = activityNoticePod.redPoint;
                    EnumC56697MMz seeMoreType = activityNoticePod.seeMoreType;
                    ActivityIcon activityIcon = activityNoticePod.icon;
                    long j = activityNoticePod.cacheTime;
                    o.LJIIIZ(redPoint, "redPoint");
                    o.LJIIIZ(seeMoreType, "seeMoreType");
                    ActivityNoticePod activityNoticePod2 = new ActivityNoticePod(list, redPoint, seeMoreType, activityIcon, j);
                    activityNoticePod2.asSkeleton$awemenotice_release();
                    arrayList.add(activityNoticePod2);
                }
            }
            arrayList.add(new MNP());
        }
        C56689MMr c56689MMr = this.LJLLI;
        if (c56689MMr != null) {
            arrayList.add(c56689MMr);
        }
        SkylightLiveGuidePod jv0 = jv0();
        if (jv0 != null) {
            arrayList.add(jv0);
        }
        if (C53364Kwy.LIZ()) {
            InboxEntrancePod inboxEntrancePod3 = this.LL;
            if (inboxEntrancePod3 != null) {
                arrayList.add(inboxEntrancePod3);
            } else if (z) {
                InboxEntranceCell entranceCell2 = this.LJZL.entranceCell;
                o.LJIIIZ(entranceCell2, "entranceCell");
                InboxEntrancePod inboxEntrancePod4 = new InboxEntrancePod(entranceCell2);
                inboxEntrancePod4.asSkeleton$awemenotice_release();
                arrayList.add(inboxEntrancePod4);
            }
        } else {
            C56720MNw c56720MNw2 = this.LJLJLLL;
            c56720MNw2.getClass();
            if (C46604IQu.LIZIZ()) {
                String str = (String) c56720MNw2.LIZJ.getValue();
                EnumC56696MMy enumC56696MMy = EnumC56696MMy.FOLLOWER;
                ActivityPod LIZLLL = C56678MMg.LIZLLL(enumC56696MMy);
                if (LIZLLL != null) {
                    if (C78685UuP.LJJJZ(LIZLLL.newNoticeContent)) {
                        str = LIZLLL.newNoticeContent;
                    }
                    RedPoint LJFF = c56720MNw2.LJFF();
                    if (IRL.LIZ() || LJFF.type == MN2.COUNT) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    ActivityPod activityPod2 = new ActivityPod(enumC56696MMy, (List) c56720MNw2.LIZ.getValue(), null, str, LJFF, LIZLLL.newNoticeTime, z2, 0L, null, MN5.LIZIZ(enumC56696MMy), LIZLLL.createTime, 384, null);
                    this.LJZI = activityPod2;
                    arrayList.add(activityPod2);
                }
            }
            if (z && (activityPod = this.LJZI) != null) {
                EnumC56696MMy dataType = activityPod.dataType;
                List<String> title = activityPod.title;
                ActivityIcon activityIcon2 = activityPod.smallAvatarUrl;
                String newNoticeContent = activityPod.newNoticeContent;
                RedPoint readPoint = activityPod.readPoint;
                String newNoticeTime = activityPod.newNoticeTime;
                boolean z3 = activityPod.showArrow;
                long j2 = activityPod.cacheTime;
                String extra = activityPod.extra;
                Drawable drawable = activityPod.LJLIL;
                long j3 = activityPod.createTime;
                o.LJIIIZ(dataType, "dataType");
                o.LJIIIZ(title, "title");
                o.LJIIIZ(newNoticeContent, "newNoticeContent");
                o.LJIIIZ(readPoint, "readPoint");
                o.LJIIIZ(newNoticeTime, "newNoticeTime");
                o.LJIIIZ(extra, "extra");
                ActivityPod activityPod3 = new ActivityPod(dataType, title, activityIcon2, newNoticeContent, readPoint, newNoticeTime, z3, j2, extra, drawable, j3);
                activityPod3.asSkeleton$awemenotice_release();
                arrayList.add(activityPod3);
            }
        }
        if (!C53357Kwr.LIZIZ()) {
            if (C53364Kwy.LIZ()) {
                InboxEntrancePod inboxEntrancePod5 = this.LJLZ;
                if (inboxEntrancePod5 != null) {
                    arrayList.add(inboxEntrancePod5);
                }
            } else {
                ActivityPod LIZJ = this.LJLJLLL.LIZJ();
                this.LJLLLLLL = LIZJ;
                arrayList.add(LIZJ);
            }
        }
        arrayList.addAll(this.LLFII);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC56676MMe) it.next()).isLoading = true;
        }
        V1B.LJLJJI(this.LJLIL, ORZ.LLILII(MNJ.LJLIL, arrayList));
    }

    public final void tv0(InboxEntrancePod inboxEntrancePod) {
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod.entranceCell;
        if (inboxEntranceCell.isActivity()) {
            if (C53357Kwr.LIZIZ()) {
                this.LLFFF = null;
            } else {
                this.LJLZ = null;
            }
        } else if (inboxEntranceCell.isFollower()) {
            this.LL = null;
        } else {
            ((ArrayList) this.LLFII).remove(inboxEntrancePod);
        }
        rv0(false);
        List<InboxEntranceCell> list = C56678MMg.LJ().LJI;
        if (list != null) {
            List LLJILJILJ = ORZ.LLJILJILJ(list);
            if (((ArrayList) LLJILJILJ).remove(inboxEntrancePod.entranceCell)) {
                C56678MMg.LJIILIIL(LLJILJILJ);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C56678MMg.LIZJ();
    }

    public static void uv0(String str, ActivityPod activityPod) {
        String str2;
        OSZ iv0 = iv0(activityPod.readPoint);
        Object first = iv0.getFirst();
        Object second = iv0.getSecond();
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("show_cnt", first);
        if (activityPod.isLoading) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("is_loading", str2);
        oszArr[3] = new OSZ("action_type", str);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (second != null) {
            LJJLIIIIJ.put("notice_type", second);
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "inbox_activity_notice";
        if (activityPod.dataType == EnumC56696MMy.FOLLOWER) {
            c68322mC.element = "inbox_follower_notice";
        }
        FMX.LIZIZ().execute(new ARunnableS28S0200000_9(LJJLIIIIJ, c68322mC, 15));
    }

    public final void Bv0(int i, InboxEntrancePod inboxEntrancePod) {
        ((ArrayList) this.LLFII).remove(inboxEntrancePod);
        qv0(inboxEntrancePod.entranceCell, InboxEntranceCell.copy$default(inboxEntrancePod.entranceCell, 0, i, 0, null, 0L, false, false, 0, 0, 0, null, null, 0, null, null, 32765, null), true);
    }

    public final void vv0(String str, InboxEntrancePod inboxEntrancePod) {
        String str2;
        OSZ hv0 = hv0(inboxEntrancePod);
        int intValue = ((Number) hv0.getFirst()).intValue();
        Object second = hv0.getSecond();
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("show_cnt", String.valueOf(intValue));
        if (this.LJLLLLLL.isLoading) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("is_loading", str2);
        oszArr[3] = new OSZ("action_type", str);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (second != null) {
            LJJLIIIIJ.put("notice_type", second);
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "inbox_activity_notice";
        if (inboxEntrancePod.entranceCell.isFollower()) {
            c68322mC.element = "inbox_follower_notice";
        }
        FMX.LIZIZ().execute(new ARunnableS28S0200000_9(LJJLIIIIJ, c68322mC, 16));
    }

    public final void zv0(int i, InboxEntrancePod inboxEntrancePod) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setClickFlag ");
        LIZ.append(i);
        C221018lt.LJFF("MultiViewModel", X1D.LIZIZ(LIZ));
        this.LLIL = i;
        this.LLILII = inboxEntrancePod;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qv0(com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r3, com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell r4, boolean r5) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r0 = new com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod
            r0.<init>(r4)
            r2.Av0(r0)
            X.MMi r0 = X.C56678MMg.LJ()
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell> r1 = r0.LJI
            if (r1 == 0) goto L23
            java.util.List r0 = X.ORZ.LLJILJILJ(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r3)
            r0.add(r4)
            X.C56678MMg.LJIILIIL(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L26
        L23:
            X.C56678MMg.LIZJ()
        L26:
            if (r5 == 0) goto L2c
            r0 = 0
            r2.rv0(r0)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.qv0(com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell, com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell, boolean):void");
    }

    public static void wv0(String str, ActivityNoticePod activityNoticePod, String str2, String str3) {
        String str4;
        String str5;
        if (o.LJ(str, "show")) {
            str4 = "show_new_activities";
        } else if (!o.LJ(str, "click")) {
            return;
        } else {
            str4 = "enter_new_activities";
        }
        OSZ iv0 = iv0(activityNoticePod.redPoint);
        Object first = iv0.getFirst();
        Object second = iv0.getSecond();
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("show_cnt", first);
        if (activityNoticePod.isLoading) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("is_loading", str5);
        oszArr[3] = new OSZ("see_more_button", String.valueOf(activityNoticePod.seeMoreType.ordinal()));
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (second != null) {
            LJJLIIIIJ.put("notice_type", second);
        }
        if (str2 != null) {
            LJJLIIIIJ.put("enter_type", str2);
        }
        if (str3 != null) {
            LJJLIIIIJ.put("enter_from", str3);
        }
        FMX.LIZIZ().execute(new ARunnableS10S1100000_9(LJJLIIIIJ, str4, 1));
    }

    public static void xv0(String str, InboxEntrancePod inboxEntrancePod, String str2, String str3) {
        String str4;
        String str5;
        if (o.LJ(str, "show")) {
            str4 = "show_new_activities";
        } else if (!o.LJ(str, "click")) {
            return;
        } else {
            str4 = "enter_new_activities";
        }
        OSZ hv0 = hv0(inboxEntrancePod);
        int intValue = ((Number) hv0.getFirst()).intValue();
        Object second = hv0.getSecond();
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("enter_from", "notification_page");
        oszArr[1] = new OSZ("show_cnt", String.valueOf(intValue));
        if (inboxEntrancePod.isLoading) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("is_loading", str5);
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (second != null) {
            LJJLIIIIJ.put("notice_type", second);
        }
        if (str2 != null) {
            LJJLIIIIJ.put("enter_type", str2);
        }
        if (str3 != null) {
            LJJLIIIIJ.put("enter_from", str3);
        }
        FMX.LIZIZ().execute(new ARunnableS10S1100000_9(LJJLIIIIJ, str4, 2));
    }

    public final void yv0(String str, String str2, InboxEntrancePod inboxEntrancePod, Integer num) {
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", "notification_page"), new OSZ("action_type", str), new OSZ("show_cnt", String.valueOf(MLS.LIZLLL(inboxEntrancePod.entranceCell))), new OSZ("type", str2));
        Object second = hv0(inboxEntrancePod).getSecond();
        if (second != null) {
            LJJLIIIIJ.put("notice_type", second);
        }
        List<KeyValueHolder> eventTrackingExtra = inboxEntrancePod.entranceCell.getEventTrackingExtra();
        if (eventTrackingExtra != null) {
            for (KeyValueHolder keyValueHolder : eventTrackingExtra) {
                LJJLIIIIJ.put(keyValueHolder.getKey(), keyValueHolder.getValue());
            }
        }
        if (num != null) {
            LJJLIIIIJ.put("client_order", String.valueOf(num.intValue()));
        }
        FMX.LIZIZ().execute(new ARunnableS20S0300000_9(LJJLIIIIJ, inboxEntrancePod, this, 3));
    }
}
