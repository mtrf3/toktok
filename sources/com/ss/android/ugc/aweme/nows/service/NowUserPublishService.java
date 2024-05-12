package com.ss.android.ugc.aweme.nows.service;

import X.C185117Oh;
import X.C195057l7;
import X.C195937mX;
import X.C197377or;
import X.C47261Igj;
import X.C56475MEl;
import X.C76800UCe;
import X.C7MB;
import X.InterfaceC195257lR;
import X.InterfaceC197607pE;
import X.InterfaceC88472Yns;
import X.ORZ;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.service.INowUserPublishService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowUserPublishService implements INowUserPublishService {
    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LIZ(LifecycleOwner lifecycleOwner, final C56475MEl listener) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(listener, "listener");
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.nows.service.NowUserPublishService$subscribeNowPublish$1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                InterfaceC197607pE listener2 = listener;
                o.LJIIIZ(listener2, "listener");
                Iterator<WeakReference<InterfaceC197607pE>> it = C197377or.LJII.iterator();
                WeakReference<InterfaceC197607pE> weakReference = null;
                while (it.hasNext()) {
                    WeakReference<InterfaceC197607pE> next = it.next();
                    InterfaceC197607pE interfaceC197607pE = next.get();
                    if (interfaceC197607pE != null && interfaceC197607pE.hashCode() == listener2.hashCode()) {
                        weakReference = next;
                    }
                }
                if (weakReference != null) {
                    C197377or.LJII.remove(weakReference);
                }
                C197377or.LJ();
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_CREATE) {
                    onCreate();
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onCreate() {
                C197377or.LIZ(listener);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final int LIZIZ(Collection<? extends Aweme> collection, InterfaceC88472Yns<? super Aweme, Boolean> interfaceC88472Yns) {
        o.LJIIIZ(collection, "collection");
        int i = 0;
        for (Aweme aweme : collection) {
            if (i >= 0) {
                Aweme aweme2 = aweme;
                if (C195937mX.LJII(aweme2) && interfaceC88472Yns.invoke(aweme2).booleanValue()) {
                    return i;
                }
                i++;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LIZJ(LifecycleOwner lifecycleOwner, final InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C185117Oh.LIZIZ.LIZIZ(lifecycleOwner, new InterfaceC195257lR<C7MB>() { // from class: X.7lM
            @Override // X.InterfaceC195257lR
            public final void LIZ(C7MB c7mb) {
                C7MB e = c7mb;
                o.LJIIIZ(e, "e");
                if (e.LJLILLLLZI == 1) {
                    interfaceC88472Yns.invoke(e.LJLIL);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LIZLLL(LifecycleOwner lifecycleOwner, final InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C185117Oh.LIZJ.LIZIZ(lifecycleOwner, new InterfaceC195257lR<C195057l7>() { // from class: X.7lN
            @Override // X.InterfaceC195257lR
            public final void LIZ(C195057l7 c195057l7) {
                C195057l7 e = c195057l7;
                o.LJIIIZ(e, "e");
                interfaceC88472Yns.invoke(e.LJLIL);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r1 == null) goto L25;
     */
    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.feed.model.Aweme r28, com.ss.android.ugc.aweme.feed.model.Aweme r29) {
        /*
            r27 = this;
            java.lang.String r0 = "outAweme"
            r2 = r28
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            com.ss.android.ugc.aweme.now.UserNowPost r0 = r2.userNowPost
            r4 = 1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r3 = r29
            if (r0 == 0) goto L38
            java.util.List r0 = r0.getNowPosts()
            if (r0 == 0) goto L38
            java.util.Iterator r5 = r0.iterator()
        L1d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r5.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = r0.getAid()
            java.lang.String r0 = r3.getAid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L1d
            return
        L38:
            com.ss.android.ugc.aweme.now.UserNowPost r7 = r2.userNowPost
            if (r7 == 0) goto L72
            java.util.List r8 = r7.getNowPosts()
            if (r8 == 0) goto L9c
            r8.add(r3)
        L45:
            java.lang.Integer r0 = r7.getTotalCount()
            if (r0 == 0) goto L9a
            int r0 = r0.intValue()
        L4f:
            int r0 = r0 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r10 = 0
            java.util.List r0 = r7.getNowPosts()
            if (r0 == 0) goto L98
            int r0 = r0.size()
        L60:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r16 = 188(0xbc, float:2.63E-43)
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r17 = r10
            com.ss.android.ugc.aweme.now.UserNowPost r1 = com.ss.android.ugc.aweme.now.UserNowPost.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != 0) goto L91
        L72:
            com.ss.android.ugc.aweme.now.UserNowPost r1 = new com.ss.android.ugc.aweme.now.UserNowPost
            com.ss.android.ugc.aweme.feed.model.Aweme[] r0 = new com.ss.android.ugc.aweme.feed.model.Aweme[r4]
            r0[r6] = r3
            java.util.List r17 = X.C47261Igj.LJJIJIL(r0)
            r19 = 0
            r25 = 188(0xbc, float:2.63E-43)
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r18
            r24 = r19
            r26 = r19
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L91:
            r2.userNowPost = r1
            com.ss.android.ugc.aweme.now.NowPostInfo r0 = r3.nowPostInfo
            r2.nowPostInfo = r0
            return
        L98:
            r0 = 1
            goto L60
        L9a:
            r0 = 0
            goto L4f
        L9c:
            com.ss.android.ugc.aweme.feed.model.Aweme[] r0 = new com.ss.android.ugc.aweme.feed.model.Aweme[r4]
            r0[r6] = r3
            java.util.List r8 = X.C47261Igj.LJJIJIL(r0)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.service.NowUserPublishService.LJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.ss.android.ugc.aweme.service.INowUserPublishService
    public final void LJFF(Aweme outAweme, String aid) {
        int i;
        NowPostInfo nowPostInfo;
        Aweme next;
        int i2;
        List<Aweme> nowPosts;
        Aweme aweme;
        o.LJIIIZ(outAweme, "outAweme");
        o.LJIIIZ(aid, "aid");
        UserNowPost userNowPost = outAweme.userNowPost;
        if (userNowPost == null) {
            return;
        }
        Integer totalCount = userNowPost.getTotalCount();
        if (totalCount != null) {
            i = totalCount.intValue();
        } else {
            i = 0;
        }
        List<Aweme> nowPosts2 = userNowPost.getNowPosts();
        if (nowPosts2 == null) {
            return;
        }
        Iterator<Aweme> it = nowPosts2.iterator();
        do {
            nowPostInfo = null;
            if (it.hasNext()) {
                next = it.next();
            } else {
                return;
            }
        } while (!o.LJ(next.getAid(), aid));
        if (next == null) {
            return;
        }
        List LLJILJILJ = ORZ.LLJILJILJ(nowPosts2);
        ((ArrayList) LLJILJILJ).remove(next);
        Integer valueOf = Integer.valueOf(i - 1);
        Integer position = userNowPost.getPosition();
        if (position != null) {
            i2 = position.intValue();
        } else {
            i2 = 1;
        }
        UserNowPost copy$default = UserNowPost.copy$default(userNowPost, LLJILJILJ, valueOf, null, null, null, null, Integer.valueOf(i2 - 1), null, 188, null);
        outAweme.userNowPost = copy$default;
        if (copy$default != null && (nowPosts = copy$default.getNowPosts()) != null && (aweme = (Aweme) ORZ.LJLLLL(nowPosts)) != null) {
            nowPostInfo = aweme.nowPostInfo;
        }
        outAweme.nowPostInfo = nowPostInfo;
    }
}
