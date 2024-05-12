package X;

import Y.ACallableS86S0200000_9;
import Y.AgS126S0100000_9;
import android.app.Activity;
import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LWX extends AbstractC51036K1g<FriendsFeed, FriendsFeedResponse> implements Cloneable, InterfaceC224118qt {
    public boolean LJLIL;
    public FriendsFeedResponse LJLJI;
    public C54385LWb LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public LWY LJLLLLLL;
    public final List<FriendsFeed> LJLILLLLZI = new CopyOnWriteArrayList();
    public int LJLLJ = -1;
    public final C54384LWa LJLLL = new C54384LWa();
    public final java.util.Set<String> LJLLLL = new LinkedHashSet();
    public List<Aweme> LJLZ = new ArrayList();

    public final void LJIIIZ() {
        ActivityC45651qj LJJIFFI;
        LXS LIZ;
        LWY lwy = this.LJLLLLLL;
        if (lwy != null) {
            o.LJI(lwy);
            lwy.LIZ();
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) != null && !C54423LXn.LIZIZ.LIZ().LJ(LJJIFFI) && (LIZ = LXU.LIZ()) != null) {
            LIZ.LIZLLL(false);
        }
        LIL.LIZ = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> LJIIJ() {
        if (this.mData == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        T t = this.mData;
        o.LJI(t);
        List<FriendsFeed> list = ((FriendsFeedResponse) t).friendFeedData;
        o.LJI(list);
        Iterator<FriendsFeed> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAweme());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        T t;
        try {
            Object clone = super.clone();
            o.LJII(clone, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friendstab.presenter.FriendsFeedModel");
            C8BS c8bs = (C8BS) clone;
            FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) this.mData;
            if (friendsFeedResponse != null) {
                t = friendsFeedResponse.clone();
            } else {
                t = 0;
            }
            c8bs.mData = t;
            return c8bs;
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            Object clone2 = super.clone();
            o.LJII(clone2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friendstab.presenter.FriendsFeedModel");
            return clone2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<FriendsFeed> getItems() {
        FriendsFeedResponse friendsFeedResponse;
        T t = this.mData;
        if (t == 0 || (friendsFeedResponse = (FriendsFeedResponse) t) == null) {
            return null;
        }
        return friendsFeedResponse.friendFeedData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0) {
            o.LJI(t);
            if (((FriendsFeedResponse) t).hasMore) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        List<FriendsFeed> items = getItems();
        if (items == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<FriendsFeed> it = items.iterator();
        while (it.hasNext()) {
            Aweme aweme = it.next().getAweme();
            if (aweme != null) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // X.C8BS
    public final boolean isLoading() {
        return this.LJLJJL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:497:0x061f, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0731 A[LOOP:9: B:365:0x072f->B:366:0x0731, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da A[LOOP:0: B:70:0x00da->B:74:0x00f9, LOOP_START, PHI: r11
      0x00da: PHI (r11v6 int) = (r11v0 int), (r11v7 int) binds: [B:69:0x00d8, B:74:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022d  */
    @Override // X.C8BS
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r24) {
        /*
            Method dump skipped, instructions count: 2254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWX.handleData(com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse):void");
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        this.mIsLoading = false;
        this.LJLJJL = false;
        Object obj = msg.obj;
        if (obj instanceof Exception) {
            o.LJII(obj, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            C16880lQ.LLLLIIL((Exception) obj);
            List<C8BT> list = this.mNotifyListeners;
            if (list != null) {
                for (C8BT c8bt : list) {
                    Object obj2 = msg.obj;
                    o.LJII(obj2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
                    c8bt.onFailed((Exception) obj2);
                }
                return;
            }
            return;
        }
        C10K.LIZIZ(new ACallableS86S0200000_9(this, (FriendsFeedResponse) Message.obtain(msg).obj, 5), C38995FSd.LIZLLL(), null).LJ(new AgS126S0100000_9(this, 10), C10K.LJIIIIZZ, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadMoreList(java.lang.Object... r8) {
        /*
            r7 = this;
            java.lang.String r1 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r8, r1)
            int r0 = r8.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r8, r0)
            kotlin.jvm.internal.o.LJIIIZ(r3, r1)
            int r1 = r3.length
            r0 = 2
            r2 = 1
            if (r1 < r0) goto L85
            r1 = r3[r2]
            boolean r0 = r1 instanceof X.C54393LWj
            if (r0 == 0) goto L85
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.friendstab.model.FriendsFeedParam"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.LWj r1 = (X.C54393LWj) r1
            if (r1 == 0) goto L85
            r7.LJLJJL = r2
            T r0 = r7.mData
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r0 = (com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse) r0
            int r6 = r0.source
        L2b:
            T r0 = r7.mData
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r0 = (com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse) r0
            java.lang.String r3 = r0.pageToken
            if (r3 != 0) goto L37
        L35:
            java.lang.String r3 = ""
        L37:
            X.LWa r4 = r7.LJLLL
            int r2 = r1.LIZIZ
            com.bytedance.common.utility.collection.WeakHandler r5 = r7.mHandler
            java.lang.String r0 = "mHandler"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            r4.getClass()
            X.2mC r1 = new X.2mC
            r1.<init>()
            r1.element = r3
            X.LVy r0 = new X.LVy
            r0.<init>(r7, r6, r2, r1)
            X.SrC r1 = X.AbstractC73672Svk.LJIIJ(r0)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r1 = r1.LJJJ(r0)
            X.LXf r0 = new X.LXf
            r0.<init>()
            X.SzH r3 = r1.LJJJJL(r0)
            Y.AfS60S0100000_8 r2 = new Y.AfS60S0100000_8
            r0 = 13
            r2.<init>(r5, r0)
            Y.AfS61S0100000_9 r1 = new Y.AfS61S0100000_9
            r0 = 31
            r1.<init>(r5, r0)
            X.3kP r1 = r3.LJJJLIIL(r2, r1)
            X.Sq2 r0 = r4.LIZ
            r0.LIZ(r1)
        L85:
            return
        L86:
            X.LII r0 = X.LII.SORT
            int r6 = r0.getDataLevel()
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWX.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC51036K1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshList(java.lang.Object... r13) {
        /*
            r12 = this;
            java.lang.String r2 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r13, r2)
            boolean r0 = X.LX1.LJIILIIL
            if (r0 != 0) goto Lf
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.LX1.LIZJ = r0
        Lf:
            int r0 = r13.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r13, r0)
            kotlin.jvm.internal.o.LJIIIZ(r3, r2)
            int r1 = r3.length
            r0 = 2
            r2 = 1
            if (r1 < r0) goto L9a
            r1 = r3[r2]
            boolean r0 = r1 instanceof X.C54393LWj
            if (r0 == 0) goto L9a
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.friendstab.model.FriendsFeedParam"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.LWj r1 = (X.C54393LWj) r1
        L29:
            r0 = 0
            r8 = r12
            r8.LJLJLLL = r0
            r8.LJLJL = r0
            r8.LJLJLJ = r0
            r8.LJLJJLL = r0
            r8.LJLL = r0
            r8.LJLLI = r0
            if (r1 == 0) goto L99
            r8.LJLJJL = r2
            X.LW8 r0 = X.LW8.LIZIZ
            r0.LIZLLL()
            X.LWa r4 = r8.LJLLL
            X.LII r0 = X.LII.SORT
            int r9 = r0.getDataLevel()
            int r5 = r1.LIZIZ
            java.lang.String r6 = r1.LJI
            if (r6 != 0) goto L50
            java.lang.String r6 = ""
        L50:
            com.bytedance.common.utility.collection.WeakHandler r7 = r8.mHandler
            java.lang.String r0 = "mHandler"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            java.lang.String r10 = r1.LJIIJJI
            boolean r11 = r1.LJIIL
            boolean r0 = r1.LJIILIIL
            r4.getClass()
            r4.LIZIZ = r0
            X.LVx r3 = new X.LVx
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.SrC r1 = X.AbstractC73672Svk.LJIIJ(r3)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r1 = r1.LJJJ(r0)
            X.LXg r0 = new X.LXg
            r0.<init>()
            X.SzH r3 = r1.LJJJJL(r0)
            X.LWW r2 = new X.LWW
            r2.<init>(r4, r8, r7, r6)
            Y.AfS58S0200000_9 r1 = new Y.AfS58S0200000_9
            r0 = 11
            r1.<init>(r7, r8, r0)
            X.3kP r1 = r3.LJJJLIIL(r2, r1)
            X.Sq2 r0 = r4.LIZ
            r0.LIZ(r1)
        L99:
            return
        L9a:
            r1 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWX.refreshList(java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse, T] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<FriendsFeed> list) {
        List<FriendsFeed> list2;
        List LLJI;
        if (this.mData == 0) {
            this.mData = new FriendsFeedResponse(0, false, null, null, null, null, 0, null, 255, null);
        }
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) this.mData;
        if (friendsFeedResponse == null) {
            return;
        }
        if (list != null && (LLJI = ORZ.LLJI(list)) != null) {
            list2 = ORZ.LLJILJILJ(LLJI);
        } else {
            list2 = null;
        }
        friendsFeedResponse.friendFeedData = list2;
    }
}
