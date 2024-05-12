package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XyT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86581XyT implements InterfaceC80643Em {
    public List<User> LJLIL;
    public final java.util.Set<String> LJLILLLLZI;

    public C86581XyT() {
        this(null);
    }

    @Override // X.InterfaceC80643Em
    public final List<User> LJLLLL() {
        return this.LJLIL;
    }

    public C86581XyT(Object obj) {
        this.LJLIL = new CopyOnWriteArrayList();
        this.LJLILLLLZI = new LinkedHashSet();
    }

    public final List<User> LIZIZ(List<? extends User> list) {
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            User user2 = user;
            java.util.Set<String> set = this.LJLILLLLZI;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next(), user2.getUid())) {
                        break;
                    }
                }
            }
            arrayList.add(user);
        }
        return ORZ.LLJILJILJ(arrayList);
    }

    public final void LIZJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, InterfaceC80643Em.class, "source_default_key");
        if (LIZLLL != null) {
            LIZLLL.LIZ(new AqS146S0200000_15((InterfaceC65784Pro) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) this, (C86581XyT) 37));
        }
    }

    @Override // X.InterfaceC80643Em
    public final void LLJILLL(List<? extends User> list) {
        o.LJIIIZ(list, "list");
        synchronized (this) {
            java.util.Set<String> set = this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<? extends User> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUid());
            }
            set.addAll(arrayList);
            LIZJ(new AqS165S0100000_15(this, 783));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC80643Em
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLJLJLL(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C86583XyV
            if (r0 == 0) goto L4f
            r3 = r6
            X.XyV r3 = (X.C86583XyV) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r4 = r3.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L55
            X.XyT r0 = r3.LJLILLLLZI
            X.XyT r3 = r3.LJLIL
            X.C141335gf.LIZJ(r4)
        L24:
            java.util.List r4 = (java.util.List) r4
            java.util.List r2 = r0.LIZIZ(r4)
            kotlin.jvm.internal.AqS162S0200000_15 r1 = new kotlin.jvm.internal.AqS162S0200000_15
            r0 = 70
            r1.<init>(r3, r2, r0)
            r3.LIZJ(r1)
            android.os.SystemClock.elapsedRealtime()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3a:
            X.C141335gf.LIZJ(r4)
            r3.LJLIL = r5
            r3.LJLILLLLZI = r5
            r3.LJLJJL = r1
            r0 = 50
            java.lang.Object r4 = r5.LIZLLL(r1, r0, r3)
            if (r4 != r2) goto L4c
            return r2
        L4c:
            r3 = r5
            r0 = r5
            goto L24
        L4f:
            X.XyV r3 = new X.XyV
            r3.<init>(r5, r6)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86581XyT.LLLLLJLJLL(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC80643Em
    public final void setData(List<? extends User> list) {
        synchronized (this) {
            LIZJ(new AqS162S0200000_15(this, (C86581XyT) list, (List<User>) 72));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r6, int r7, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C86585XyX
            if (r0 == 0) goto L40
            r4 = r8
            X.XyX r4 = (X.C86585XyX) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L46
            X.C141335gf.LIZJ(r3)
        L20:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r3 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r3
            r3.checkValid()
            java.util.List r0 = r3.getUserListWithRid()
            if (r0 != 0) goto L2d
            X.OQg r0 = X.C61878OQg.INSTANCE
        L2d:
            return r0
        L2e:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.social.api.RecommendUserApiService r0 = com.ss.android.ugc.aweme.social.api.RecommendUserApiService.LIZIZ
            X.Svk r0 = r0.getMAFList(r6, r7)
            r4.LJLJI = r1
            java.lang.Object r3 = X.C77318UWc.LIZIZ(r0, r4)
            if (r3 != r2) goto L20
            return r2
        L40:
            X.XyX r4 = new X.XyX
            r4.<init>(r5, r8)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86581XyT.LIZLLL(int, int, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r7, int r8, java.lang.String r9, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.model.MaFListResponse> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C86584XyW
            if (r0 == 0) goto L59
            r5 = r10
            X.XyW r5 = (X.C86584XyW) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r2 = 1
            r1 = 2
            if (r0 == 0) goto L29
            if (r0 == r2) goto L41
            if (r0 != r1) goto L5f
            X.C141335gf.LIZJ(r4)
        L23:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r4 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r4
            r4.checkValid()
        L28:
            return r4
        L29:
            X.C141335gf.LIZJ(r4)
            int r0 = r9.length()
            if (r0 != 0) goto L4a
            com.ss.android.ugc.aweme.social.api.RecommendUserApiService r0 = com.ss.android.ugc.aweme.social.api.RecommendUserApiService.LIZIZ
            X.Svk r0 = r0.getMAFList(r7, r8)
            r5.LJLJI = r2
            java.lang.Object r4 = X.C77318UWc.LIZIZ(r0, r5)
            if (r4 != r3) goto L44
            return r3
        L41:
            X.C141335gf.LIZJ(r4)
        L44:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r4 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r4
            r4.checkValid()
            goto L28
        L4a:
            com.ss.android.ugc.aweme.social.api.RecommendUserApiService r0 = com.ss.android.ugc.aweme.social.api.RecommendUserApiService.LIZIZ
            X.Svk r0 = r0.getMAFList(r7, r8, r9)
            r5.LJLJI = r1
            java.lang.Object r4 = X.C77318UWc.LIZIZ(r0, r5)
            if (r4 != r3) goto L23
            return r3
        L59:
            X.XyW r5 = new X.XyW
            r5.<init>(r6, r10)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86581XyT.LIZ(int, int, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r10 > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:10:0x002c). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC80643Em
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLZI(int r10, int r11, int r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C86582XyU
            if (r0 == 0) goto L89
            r6 = r13
            X.XyU r6 = (X.C86582XyU) r6
            int r2 = r6.LJLJLJ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r6.LJLJLJ = r2
        L12:
            java.lang.Object r8 = r6.LJLJJLL
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJLJ
            r5 = 1
            if (r0 == 0) goto L63
            if (r0 != r5) goto L8f
            int r10 = r6.LJLJJL
            int r12 = r6.LJLJJI
            int r11 = r6.LJLJI
            java.lang.Object r4 = r6.LJLILLLLZI
            java.util.List r4 = (java.util.List) r4
            X.XyT r3 = r6.LJLIL
            X.C141335gf.LIZJ(r8)
        L2c:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r8 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r8
            if (r8 == 0) goto L4f
            java.util.List r2 = r8.getUsers()
            java.util.List r0 = r3.LIZIZ(r2)
            r4.addAll(r0)
            java.lang.String r0 = r8.getNextPageToken()
            boolean r1 = r8.getHasMore()
            if (r1 == 0) goto L4f
            java.lang.String r1 = r8.getNextPageToken()
            int r1 = r1.length()
            if (r1 != 0) goto L5c
        L4f:
            kotlin.jvm.internal.AqS162S0200000_15 r1 = new kotlin.jvm.internal.AqS162S0200000_15
            r0 = 71
            r1.<init>(r3, r4, r0)
            r3.LIZJ(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5c:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L72
            goto L4f
        L63:
            X.C141335gf.LIZJ(r8)
            if (r10 > 0) goto L69
            r10 = 1
        L69:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = ""
            r3 = r9
            goto L76
        L72:
            int r10 = r10 + (-1)
            if (r10 <= 0) goto L4f
        L76:
            r6.LJLIL = r3
            r6.LJLILLLLZI = r4
            r6.LJLJI = r11
            r6.LJLJJI = r12
            r6.LJLJJL = r10
            r6.LJLJLJ = r5
            java.lang.Object r8 = r3.LIZ(r12, r11, r0, r6)
            if (r8 != r7) goto L2c
            return r7
        L89:
            X.XyU r6 = new X.XyU
            r6.<init>(r9, r13)
            goto L12
        L8f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86581XyT.LLLZI(int, int, int, X.2kd):java.lang.Object");
    }
}
