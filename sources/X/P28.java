package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM$refreshUserCard$1", f = "RecFriendsVM.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class P28 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ RecFriendsVM LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P28(RecFriendsVM recFriendsVM, InterfaceC67352kd<? super P28> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = recFriendsVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new P28(this.LJLJI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x0082
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[Catch: all -> 0x0096, TRY_LEAVE, TryCatch #4 {all -> 0x0096, blocks: (B:11:0x0065, B:13:0x006b, B:33:0x008e), top: B:10:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x0096, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0096, blocks: (B:11:0x0065, B:13:0x006b, B:33:0x008e), top: B:10:0x0065 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0079 -> B:7:0x007c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLILLLLZI
            java.lang.String r2 = "[ffp]_RecFriends"
            r4 = 1
            if (r0 == 0) goto L1d
            if (r0 != r4) goto L15
            java.lang.Object r1 = r7.LJLIL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Throwable -> L13
            goto L7c
        L13:
            r0 = move-exception
            goto L83
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1d:
            X.C141335gf.LIZJ(r8)
            com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM r3 = r7.LJLJI
            com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM r0 = r3.LJLIL
            java.util.List r6 = r3.gv0(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "await size: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L94
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L94
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L94
            r1.append(r0)     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L94
            X.C221018lt.LJFF(r2, r0)     // Catch: java.lang.Throwable -> L94
            com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM r0 = r3.LJLIL     // Catch: java.lang.Throwable -> L94
            X.P29 r1 = r0.LJLJLJ     // Catch: java.lang.Throwable -> L94
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L94
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L50
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L94
            X.P2A r1 = r1.LIZJ     // Catch: java.lang.Throwable -> L94
            if (r1 != 0) goto L5e
        L59:
            java.util.Iterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L94
            goto L65
        L5e:
            java.lang.Boolean r0 = r1.LJI     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L59
            r1.LJI = r3     // Catch: java.lang.Throwable -> L94
            goto L59
        L65:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L96
            X.2mE r0 = (X.InterfaceC68342mE) r0     // Catch: java.lang.Throwable -> L96
            r7.LJLIL = r1     // Catch: java.lang.Throwable -> L82
            r7.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L82
            java.lang.Object r8 = r0.LJI(r7)     // Catch: java.lang.Throwable -> L82
            if (r8 != r5) goto L7c
            goto L8b
        L7c:
            X.C3C5.m7constructorimpl(r8)     // Catch: java.lang.Throwable -> L80
            goto L65
        L80:
            r0 = move-exception
            goto L83
        L82:
            r0 = move-exception
        L83:
            X.3C4 r0 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Throwable -> L8c
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L8c
            goto L65
        L8b:
            return r5
        L8c:
            r0 = move-exception
            goto L97
        L8e:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L96
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L96
            goto L9e
        L94:
            r0 = move-exception
            goto L97
        L96:
            r0 = move-exception
        L97:
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L9e:
            java.lang.Throwable r1 = X.C3C5.m10exceptionOrNullimpl(r0)
            if (r1 == 0) goto La9
            java.lang.String r0 = "await auth error"
            X.C221018lt.LIZJ(r2, r0, r1)
        La9:
            com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM r0 = r7.LJLJI
            com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM r0 = r0.LJLIL
            java.util.Set r3 = r0.jv0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "refresh with: "
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            X.C221018lt.LJFF(r2, r0)
            com.ss.android.ugc.aweme.relation.ffp.vm.RecFriendsVM r2 = r7.LJLJI
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 65
            r1.<init>(r3, r0)
            r2.setState(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P28.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
