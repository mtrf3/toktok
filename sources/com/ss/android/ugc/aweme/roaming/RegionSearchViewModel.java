package com.ss.android.ugc.aweme.roaming;

import X.C33Q;
import X.C53610L2g;
import X.C54662Lco;
import X.C73969T1h;
import X.C79061V1d;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC789838c;
import X.T16;
import Y.AfS61S0100000_9;
import android.util.LruCache;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.app.api.Api;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RegionSearchViewModel extends AssemListViewModel<C54662Lco, Object, C53610L2g> {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final LruCache<String, NearbyRegionSearchV1Response> LJLIL = new LruCache<>(16);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C54662Lco(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<Object> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 261));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<X.C53610L2g>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C54658Lck
            if (r0 == 0) goto L20
            r4 = r6
            X.Lck r4 = (X.C54658Lck) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            com.ss.android.ugc.aweme.roaming.RegionSearchViewModel r0 = r4.LJLIL
            goto L4b
        L20:
            X.Lck r4 = new X.Lck
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r1)
            X.L2g r1 = new X.L2g     // Catch: java.lang.Exception -> L53
            X.33Q r0 = r5.getState()     // Catch: java.lang.Exception -> L53
            X.Lco r0 = (X.C54662Lco) r0     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = r0.LJLIL     // Catch: java.lang.Exception -> L53
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L53
            r4.LJLIL = r5     // Catch: java.lang.Exception -> L53
            r4.LJLJJI = r2     // Catch: java.lang.Exception -> L53
            java.lang.Object r1 = r5.iv0(r1, r4)     // Catch: java.lang.Exception -> L53
            if (r1 != r3) goto L49
            return r3
        L49:
            r0 = r5
            goto L4e
        L4b:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L51
        L4e:
            X.A2G r1 = (X.A2G) r1     // Catch: java.lang.Exception -> L51
            goto L66
        L51:
            r2 = move-exception
            goto L55
        L53:
            r2 = move-exception
            r0 = r5
        L55:
            X.33Q r0 = r0.getState()
            X.Lco r0 = (X.C54662Lco) r0
            java.lang.String r1 = r0.LJLIL
            r0 = 0
            X.C54652Lce.LIZLLL(r1, r0)
            X.A2I r1 = new X.A2I
            r1.<init>(r2)
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.roaming.RegionSearchViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C53610L2g r6, X.InterfaceC67352kd<? super X.A2G<X.C53610L2g>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C54657Lcj
            if (r0 == 0) goto L20
            r4 = r7
            X.Lcj r4 = (X.C54657Lcj) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            X.L2g r6 = r4.LJLIL
            goto L3c
        L20:
            X.Lcj r4 = new X.Lcj
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r6     // Catch: java.lang.Exception -> L42
            r4.LJLJJI = r0     // Catch: java.lang.Exception -> L42
            java.lang.Object r3 = r5.iv0(r6, r4)     // Catch: java.lang.Exception -> L42
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L42
        L3f:
            X.A2G r3 = (X.A2G) r3     // Catch: java.lang.Exception -> L42
            goto L4e
        L42:
            r2 = move-exception
            java.lang.String r1 = r6.LIZIZ
            r0 = 0
            X.C54652Lce.LIZLLL(r1, r0)
            X.A2I r3 = new X.A2I
            r3.<init>(r2)
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.roaming.RegionSearchViewModel.onLoadMore(X.L2g, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(X.C53610L2g r10, X.InterfaceC67352kd<? super X.A2G<X.C53610L2g>> r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.roaming.RegionSearchViewModel.iv0(X.L2g, X.2kd):java.lang.Object");
    }

    public final void gv0(String str, String str2, boolean z) {
        Object obj;
        String str3 = Api.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str3, "API_URL_PREFIX_SI", str3);
        if (LJI != null) {
            obj = LJI.create(RegionListApi.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        ((RegionListApi) obj).fetchNearbyRegionList(new NearbyRegionListV1Request(str, str2, z)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 21), new AfS61S0100000_9(this, 22));
    }
}
