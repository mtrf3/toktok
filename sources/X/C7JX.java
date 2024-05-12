package X;

import Y.ARunnableS2S1200000_3;
import android.os.SystemClock;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7JX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JX implements InterfaceC200587u2 {
    public static final C7JX LIZ = new C7JX();

    @Override // X.InterfaceC200587u2
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LJ() {
        Class cls;
        if (C7HX.LIZ() || ((Boolean) C183387Hq.LIZIZ.getValue()).booleanValue()) {
            if (((Number) C183917Jr.LIZ.getValue()).intValue() > 0) {
                cls = UpvoteVideoAssemNew.class;
            } else {
                cls = UpvoteVideoAssem.class;
            }
            return C65352Pkq.LIZ(cls);
        }
        return null;
    }

    @Override // X.InterfaceC200587u2
    public final void LIZJ(String str) {
        C183607Im.LIZ = new OSZ<>(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005e, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r3, "others_homepage") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008a, code lost:
    
        if (r8 != null) goto L16;
     */
    @Override // X.InterfaceC200587u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r7, com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r8) {
        /*
            r6 = this;
            boolean r0 = X.C7HP.LIZIZ()
            r5 = 0
            if (r0 == 0) goto L8
            return r5
        L8:
            r3 = 0
            if (r8 == 0) goto L8d
            java.lang.String r1 = r8.eventType
        Ld:
            java.lang.String r0 = "notification_page"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r2 = 1
            if (r0 == 0) goto L8a
            X.M89 r0 = r8.param
            java.util.HashMap r1 = r0.getInboxLogExtra()
            if (r1 == 0) goto L2e
            java.lang.String r0 = "notice_message_type"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2e
            java.lang.Integer r4 = X.C38350F3i.LJJIL(r0)
            if (r4 != 0) goto L71
        L2e:
            java.lang.String r0 = X.C183877Jn.LIZ(r8)
            if (r0 == 0) goto L3a
            int r0 = r0.length()
            if (r0 != 0) goto Lc2
        L3a:
            if (r7 == 0) goto Lc1
            com.ss.android.ugc.aweme.feed.model.InteractPermission r0 = r7.getInteractPermission()
            if (r0 == 0) goto Lc1
            int r0 = r0.getUpvote()
            if (r0 != 0) goto Lc1
            if (r8 == 0) goto L6f
            java.lang.String r1 = r8.eventType
        L4c:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L60
            if (r8 == 0) goto L58
            java.lang.String r3 = r8.eventType
        L58:
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L90
        L60:
            X.M89 r0 = r8.param
            java.lang.String r1 = r0.getFrom()
            java.lang.String r0 = "REPOSTED_LIST_ENTRANCE"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L90
            return r2
        L6f:
            r1 = r3
            goto L4c
        L71:
            int r1 = r4.intValue()
            r0 = 261(0x105, float:3.66E-43)
            if (r1 == r0) goto L89
            int r1 = r4.intValue()
            r0 = 228(0xe4, float:3.2E-43)
            if (r1 == r0) goto L89
            int r1 = r4.intValue()
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 != r0) goto L2e
        L89:
            return r2
        L8a:
            if (r8 == 0) goto L3a
            goto L2e
        L8d:
            r1 = r3
            goto Ld
        L90:
            if (r7 == 0) goto Lbf
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason r0 = r7.getUpvoteReason()
            if (r0 != 0) goto La6
            if (r7 == 0) goto Lbf
            com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct r0 = r7.getUpvotePreload()
            if (r0 == 0) goto La7
            boolean r0 = r0.getNeedPullUpvoteInfo()
            if (r0 != r2) goto La7
        La6:
            return r2
        La7:
            java.lang.String r0 = r7.getAid()
            if (r0 == 0) goto Lbf
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = X.C7H2.LIZ(r0)
            if (r0 == 0) goto Lbf
            java.util.List r0 = r0.getUpvotes()
            if (r0 == 0) goto Lbf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc0
        Lbf:
            return r5
        Lc0:
            return r2
        Lc1:
            return r5
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7JX.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedUIAssem<*>;:LX/8XO<TITEM;>;ITEM:Ljava/lang/Object;>(TT;LX/Pko<+Lcom/bytedance/assem/arch/reused/ReusedAssem<*>;>;Ljava/lang/String;)V */
    @Override // X.InterfaceC200587u2
    public final void LIZIZ(ReusedUIAssem host, InterfaceC65350Pko interfaceC65350Pko, String str) {
        int i;
        o.LJIIIZ(host, "host");
        if (!C7HP.LIZ()) {
            return;
        }
        if (!C16880lQ.LLLLIIIILLL().equals(C1DH.LJIILIIL().getLooper().getThread())) {
            C1DH.LJJIJIIJI(new ARunnableS2S1200000_3(host, interfaceC65350Pko, str, 0));
            return;
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(host);
        if (LIZ2 == null || interfaceC65350Pko == null) {
            return;
        }
        AssemViewModel<C181627Aw> LJII = C7HV.LIZIZ.LIZ.LJII(LIZ2);
        if (LJII != null) {
            C8YN.LJII(host, LJII, new TBT() { // from class: X.7IT
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C181627Aw) obj).LJLJI;
                }
            }, null, new AqS166S0200000_3(host, interfaceC65350Pko, (InterfaceC65350Pko<? extends ReusedAssem<?>>) 0), 6);
        }
        C5H3 LIZIZ = C214348b8.LIZIZ(host, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C183747Ja.INSTANCE);
        if (((Number) C183827Ji.LIZ.getValue()).intValue() != 0) {
            i = 6;
            C8YN.LJII(host, (AssemViewModel) LIZIZ.getValue(), new TBT() { // from class: X.7JM
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C8UB) obj).LJLJJI;
                }
            }, null, new AqS166S0200000_3(host, interfaceC65350Pko, (InterfaceC65350Pko<? extends ReusedAssem<?>>) 1), 6);
        } else {
            i = 6;
            C8YN.LJII(host, (AssemViewModel) LIZIZ.getValue(), new TBT() { // from class: X.7Jb
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C8UB) obj).LJLJI;
                }
            }, null, new AqS166S0200000_3(host, interfaceC65350Pko, (InterfaceC65350Pko<? extends ReusedAssem<?>>) 2), 6);
        }
        C8YN.LJII(host, (AssemViewModel) LIZIZ.getValue(), new TBT() { // from class: X.7Jc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLJL;
            }
        }, null, new AqS166S0200000_3(host, interfaceC65350Pko, (InterfaceC65350Pko<? extends ReusedAssem<?>>) 3), i);
        C7JZ.LIZIZ.LIZIZ(host, new AqS134S0200000_3(host, interfaceC65350Pko, (InterfaceC65350Pko<? extends ReusedAssem<?>>) 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        if (r2 != false) goto L36;
     */
    @Override // X.InterfaceC200587u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8, java.lang.String r9, java.lang.Boolean r10) {
        /*
            r6 = this;
            boolean r0 = X.C7HX.LIZ()
            r5 = 0
            if (r0 != 0) goto L16
            X.Ol8 r0 = X.C183387Hq.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L16
            return r5
        L16:
            boolean r1 = X.C7HX.LIZ()
            java.lang.String r0 = "homepage_hot"
            boolean r4 = kotlin.jvm.internal.o.LJ(r8, r0)
            r3 = 1
            if (r7 == 0) goto L85
            java.lang.String r0 = r7.getAid()
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList r0 = X.C7H2.LIZ(r0)
            if (r0 == 0) goto L3b
            java.util.List r0 = r0.getUpvotes()
            if (r0 == 0) goto L3b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L83
        L3b:
            r0 = 1
        L3c:
            r2 = r0 ^ 1
        L3e:
            if (r1 == 0) goto L70
            if (r7 == 0) goto L70
            com.ss.android.ugc.aweme.feed.model.InteractPermission r0 = r7.getInteractPermission()
            if (r0 == 0) goto L6e
            int r0 = r0.getUpvote()
            if (r0 != 0) goto L6e
            r1 = 1
        L4f:
            com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct r0 = r7.getUpvotePreload()
            if (r0 == 0) goto L6c
            boolean r0 = r0.getNeedPullUpvoteInfo()
            if (r0 != r3) goto L6c
            r0 = 1
        L5c:
            if (r1 == 0) goto L70
            if (r0 != 0) goto L6a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r0)
            if (r0 != 0) goto L6a
            if (r2 == 0) goto L70
        L6a:
            r5 = 1
        L6b:
            return r5
        L6c:
            r0 = 0
            goto L5c
        L6e:
            r1 = 0
            goto L4f
        L70:
            if (r4 == 0) goto L7a
            if (r7 == 0) goto L7a
            com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason r0 = r7.getUpvoteReason()
            if (r0 != 0) goto L6a
        L7a:
            if (r9 == 0) goto L6b
            int r0 = r9.length()
            if (r0 != 0) goto L6a
            goto L6b
        L83:
            r0 = 0
            goto L3c
        L85:
            r2 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7JX.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.Boolean):boolean");
    }
}
