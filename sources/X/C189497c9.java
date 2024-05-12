package X;

import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel$fetchViewerListData$1", f = "StoryViewerEntranceViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7c9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189497c9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StoryViewerEntranceViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ List<StoryInsertUser> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C189497c9(StoryViewerEntranceViewModel storyViewerEntranceViewModel, String str, List<StoryInsertUser> list, InterfaceC67352kd<? super C189497c9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = storyViewerEntranceViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C189497c9(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel r0 = r6.LJLIL     // Catch: java.lang.Exception -> L97
            X.EV6 r0 = r0.LJLL     // Catch: java.lang.Exception -> L97
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L97
            X.8aw r0 = (X.InterfaceC214228aw) r0     // Catch: java.lang.Exception -> L97
            X.3e4 r4 = r0.getOperator()     // Catch: java.lang.Exception -> L97
            X.7bj r4 = (X.InterfaceC189237bj) r4     // Catch: java.lang.Exception -> L97
            java.lang.String r3 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L97
            java.util.List<com.ss.android.ugc.aweme.story.model.StoryInsertUser> r2 = r6.LJLJI     // Catch: java.lang.Exception -> L97
            r0 = 0
            com.ss.android.ugc.aweme.story.model.StoryViewerListResponse r4 = r4.LJIIL(r0, r3, r2)     // Catch: java.lang.Exception -> L97
            java.util.List<com.ss.android.ugc.aweme.story.model.StoryInteractionUser> r0 = r4.interactionUserList     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L7b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L97
            r2.<init>()     // Catch: java.lang.Exception -> L97
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> L97
        L2a:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L97
            com.ss.android.ugc.aweme.story.model.StoryInteractionUser r0 = (com.ss.android.ugc.aweme.story.model.StoryInteractionUser) r0     // Catch: java.lang.Exception -> L97
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L2a
            r2.add(r0)     // Catch: java.lang.Exception -> L97
            goto L2a
        L40:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Exception -> L97
            r3.<init>()     // Catch: java.lang.Exception -> L97
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> L97
            r5.<init>()     // Catch: java.lang.Exception -> L97
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L97
        L4e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L69
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L97
            r0 = r1
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = r0.getUid()     // Catch: java.lang.Exception -> L97
            boolean r0 = r3.add(r0)     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L4e
            r5.add(r1)     // Catch: java.lang.Exception -> L97
            goto L4e
        L69:
            com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel r3 = r6.LJLIL     // Catch: java.lang.Exception -> L97
            java.lang.String r2 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.AqS57S1100000_3 r1 = new kotlin.jvm.internal.AqS57S1100000_3     // Catch: java.lang.Exception -> L97
            r0 = 19
            r1.<init>(r2, r5, r0)     // Catch: java.lang.Exception -> L97
            r3.setState(r1)     // Catch: java.lang.Exception -> L97
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Exception -> L97
            if (r0 != 0) goto L88
        L7b:
            com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel r3 = r6.LJLIL     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.AqS28S1000000_3 r2 = new kotlin.jvm.internal.AqS28S1000000_3     // Catch: java.lang.Exception -> L97
            java.lang.String r1 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L97
            r0 = 7
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L97
            r3.setState(r2)     // Catch: java.lang.Exception -> L97
        L88:
            com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel r3 = r6.LJLIL     // Catch: java.lang.Exception -> L97
            kotlin.jvm.internal.AqS57S1100000_3 r2 = new kotlin.jvm.internal.AqS57S1100000_3     // Catch: java.lang.Exception -> L97
            java.lang.String r1 = r6.LJLILLLLZI     // Catch: java.lang.Exception -> L97
            r0 = 20
            r2.<init>(r1, r4, r0)     // Catch: java.lang.Exception -> L97
            r3.setState(r2)     // Catch: java.lang.Exception -> L97
            goto Lad
        L97:
            r1 = move-exception
            boolean r0 = X.C36922EeM.LIZ
            if (r0 == 0) goto L9f
            X.C36922EeM.LJFF(r1)
        L9f:
            com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel r3 = r6.LJLIL
            kotlin.jvm.internal.AqS28S1000000_3 r2 = new kotlin.jvm.internal.AqS28S1000000_3
            java.lang.String r1 = r6.LJLILLLLZI
            r0 = 8
            r2.<init>(r1, r0)
            r3.setState(r2)
        Lad:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189497c9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
