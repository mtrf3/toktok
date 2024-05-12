package com.ss.android.ugc.aweme.upvote.detail;

import X.C221108m2;
import X.C42625Go9;
import X.C61878OQg;
import X.C62822Ol8;
import X.C7H1;
import X.C7H8;
import X.C7IM;
import X.C7KB;
import X.QD3;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class UpvoteListViewModel implements GenericLifecycleObserver, C7H8 {
    public static final /* synthetic */ int LJLJLJ = 0;
    public boolean LJLJI;
    public String LJLJJL;
    public Aweme LJLJJLL;
    public C7KB LJLJL;
    public String LJLIL = "unknown";
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C7IM.LJLIL);
    public List<UpvoteStruct> LJLJJI = C61878OQg.INSTANCE;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final MutableLiveData<UpvoteList> LIZJ() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        String str = this.LJLJJL;
        if (str != null) {
            C7H1.LJIIL(str, this);
        }
        C42625Go9.LIZJ(this);
    }

    public final List<UpvoteStruct> LIZIZ() {
        List<UpvoteStruct> upvotes;
        UpvoteList value = LIZJ().getValue();
        if (value == null || (upvotes = value.getUpvotes()) == null) {
            return C61878OQg.INSTANCE;
        }
        return upvotes;
    }

    public final boolean LIZLLL() {
        List<UpvoteStruct> upvotes;
        UpvoteList value = LIZJ().getValue();
        if (value == null || value.getTotal() <= 0 || (upvotes = value.getUpvotes()) == null || upvotes.isEmpty()) {
            return true;
        }
        return false;
    }

    public UpvoteListViewModel(UpvoteVideoAssem upvoteVideoAssem) {
        String.valueOf(hashCode());
        this.LJLJL = C7KB.OTHERS;
        upvoteVideoAssem.getLifecycle().addObserver(this);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFollowStatusChanged(FollowStatusEvent event) {
        Object obj;
        User user;
        o.LJIIIZ(event, "event");
        Iterator<UpvoteStruct> it = LIZIZ().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            UpvoteStruct next = it.next();
            User user2 = next.getUser();
            if (user2 != null) {
                obj = user2.getUid();
            }
            if (o.LJ(obj, event.status.userId)) {
                obj = next;
                break;
            }
        }
        UpvoteStruct upvoteStruct = (UpvoteStruct) obj;
        if (upvoteStruct == null || (user = upvoteStruct.getUser()) == null) {
            return;
        }
        user.setFollowStatus(event.status.followStatus);
        user.setFollowerStatus(event.status.followerStatus);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        if (r4 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[EDGE_INSN: B:30:0x0040->B:15:0x0040 BREAK  A[LOOP:0: B:6:0x0014->B:28:0x0069], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r16, java.lang.String r17) {
        /*
            r15 = this;
            r5 = r16
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r15.LJLJJLL
            boolean r0 = X.C7HO.LIZIZ(r0)
            r9 = 0
            r12 = 0
            if (r0 != 0) goto L6c
        Lc:
            r5 = r12
        Ld:
            X.OQg r4 = X.C61878OQg.INSTANCE
        Lf:
            java.util.Iterator r3 = r4.iterator()
            r2 = 0
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r1 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r1
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            boolean r0 = X.AV1.LJIJ(r0)
            if (r0 == 0) goto L69
            boolean r0 = r1.getBubbleHidden()
            if (r0 != 0) goto L69
            if (r2 <= 0) goto L40
            java.util.List r4 = X.ORZ.LLJILJILJ(r4)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r4, r2)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r4, r9, r0)
        L40:
            r15.LJLJJI = r4
            r1 = r17
            if (r1 == 0) goto L4c
            int r0 = r1.length()
            if (r0 != 0) goto L66
        L4c:
            java.lang.String r0 = "unknown"
            r15.LJLIL = r0
        L50:
            androidx.lifecycle.MutableLiveData r0 = r15.LIZJ()
            if (r5 == 0) goto L62
            java.util.List<com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct> r6 = r15.LJLJJI
            r7 = 0
            r13 = 30
            r10 = r7
            r14 = r12
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r12 = com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList.copy$default(r5, r6, r7, r9, r10, r12, r13, r14)
        L62:
            r0.setValue(r12)
            return
        L66:
            r15.LJLIL = r1
            goto L50
        L69:
            int r2 = r2 + 1
            goto L14
        L6c:
            X.Ol8 r0 = X.C183387Hq.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto Lb9
            if (r5 == 0) goto La7
            java.util.List r0 = r5.getUpvotes()
            if (r0 == 0) goto La7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L8c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            boolean r0 = X.AV1.LJIJ(r0)
            if (r0 == 0) goto L8c
            r6.add(r1)
            goto L8c
        La7:
            X.OQg r6 = X.C61878OQg.INSTANCE
        La9:
            int r0 = r6.size()
            long r10 = (long) r0
            if (r5 == 0) goto Lc
            r7 = 0
            r13 = 22
            r14 = r12
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r5 = com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList.copy$default(r5, r6, r7, r9, r10, r12, r13, r14)
        Lb9:
            if (r5 == 0) goto Ld
            java.util.List r4 = r5.getUpvotes()
            if (r4 != 0) goto Lf
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel.LJ(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList, java.lang.String):void");
    }

    @Override // X.C7H8
    public final void LIZ(String aid, UpvoteList upvoteList, String str) {
        o.LJIIIZ(aid, "aid");
        if (!o.LJ(this.LJLJJL, aid)) {
            C7H1.LJIIL(aid, this);
        } else {
            LJ(upvoteList, str);
        }
    }
}
