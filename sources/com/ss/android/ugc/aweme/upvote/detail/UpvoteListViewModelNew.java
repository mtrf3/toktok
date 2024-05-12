package com.ss.android.ugc.aweme.upvote.detail;

import X.AV1;
import X.C221108m2;
import X.C42625Go9;
import X.C61878OQg;
import X.C62822Ol8;
import X.C7H1;
import X.C7H8;
import X.C7IN;
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
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class UpvoteListViewModelNew implements GenericLifecycleObserver, C7H8 {
    public static final /* synthetic */ int LJLJJL = 0;
    public String LJLIL = "unknown";
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C7IN.LJLIL);
    public String LJLJI;
    public Aweme LJLJJI;

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
        String str = this.LJLJI;
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
        List<UpvoteStruct> upvoteList = LIZIZ();
        o.LJIIIZ(upvoteList, "upvoteList");
        if (!upvoteList.isEmpty()) {
            Iterator<UpvoteStruct> it = upvoteList.iterator();
            while (it.hasNext()) {
                if (AV1.LJIJ(it.next().getUser())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJ() {
        List<UpvoteStruct> upvotes;
        UpvoteList value = LIZJ().getValue();
        if (value != null && value.getTotal() > 0 && (upvotes = value.getUpvotes()) != null && !upvotes.isEmpty()) {
            return false;
        }
        return true;
    }

    public UpvoteListViewModelNew(UpvoteVideoAssemNew upvoteVideoAssemNew) {
        upvoteVideoAssemNew.getLifecycle().addObserver(this);
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

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        if (r5 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f A[EDGE_INSN: B:30:0x003f->B:15:0x003f BREAK  A[LOOP:0: B:6:0x0013->B:28:0x0064], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r15, java.lang.String r16) {
        /*
            r14 = this;
            r4 = r15
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r14.LJLJJI
            boolean r0 = X.C7HO.LIZIZ(r0)
            r8 = 0
            r11 = 0
            if (r0 != 0) goto L67
        Lb:
            r4 = r11
        Lc:
            X.OQg r5 = X.C61878OQg.INSTANCE
        Le:
            java.util.Iterator r3 = r5.iterator()
            r2 = 0
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r1 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r1
            com.ss.android.ugc.aweme.profile.model.User r0 = r1.getUser()
            boolean r0 = X.AV1.LJIJ(r0)
            if (r0 == 0) goto L64
            boolean r0 = r1.getBubbleHidden()
            if (r0 != 0) goto L64
            if (r2 <= 0) goto L3f
            java.util.List r5 = X.ORZ.LLJILJILJ(r5)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r2)
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r5, r2)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r5, r8, r0)
        L3f:
            r1 = r16
            if (r1 == 0) goto L49
            int r0 = r1.length()
            if (r0 != 0) goto L61
        L49:
            java.lang.String r0 = "unknown"
            r14.LJLIL = r0
        L4d:
            androidx.lifecycle.MutableLiveData r0 = r14.LIZJ()
            if (r4 == 0) goto L5d
            r6 = 0
            r12 = 30
            r9 = r6
            r13 = r11
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r11 = com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList.copy$default(r4, r5, r6, r8, r9, r11, r12, r13)
        L5d:
            r0.setValue(r11)
            return
        L61:
            r14.LJLIL = r1
            goto L4d
        L64:
            int r2 = r2 + 1
            goto L13
        L67:
            X.Ol8 r0 = X.C183387Hq.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto Lb4
            if (r4 == 0) goto La2
            java.util.List r0 = r4.getUpvotes()
            if (r0 == 0) goto La2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L87:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct r0 = (com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            boolean r0 = X.AV1.LJIJ(r0)
            if (r0 == 0) goto L87
            r5.add(r1)
            goto L87
        La2:
            X.OQg r5 = X.C61878OQg.INSTANCE
        La4:
            int r0 = r5.size()
            long r9 = (long) r0
            if (r4 == 0) goto Lb
            r6 = 0
            r12 = 22
            r13 = r11
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r4 = com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList.copy$default(r4, r5, r6, r8, r9, r11, r12, r13)
        Lb4:
            if (r4 == 0) goto Lc
            java.util.List r5 = r4.getUpvotes()
            if (r5 != 0) goto Le
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew.LJFF(com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList, java.lang.String):void");
    }

    @Override // X.C7H8
    public final void LIZ(String aid, UpvoteList upvoteList, String str) {
        o.LJIIIZ(aid, "aid");
        if (!o.LJ(this.LJLJI, aid)) {
            C7H1.LJIIL(aid, this);
        } else {
            LJFF(upvoteList, str);
        }
    }
}
