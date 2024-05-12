package com.ss.android.ugc.aweme.poi.search;

import X.C33Q;
import X.C39670Fha;
import X.C53611L2h;
import X.C85166Xbe;
import X.C85192Xc4;
import X.C85316Xe4;
import X.C8HZ;
import X.EnumC85244Xcu;
import X.FII;
import X.InterfaceC57784Mm4;
import X.Q4K;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class PoiSearchVM extends AssemListViewModel<C85192Xc4, C85316Xe4, C53611L2h> {
    public EnumC85244Xcu LJLIL = EnumC85244Xcu.ADD_LOCATION;
    public String LJLILLLLZI;
    public String LJLJI;
    public final List<InterfaceC57784Mm4> LJLJJI;
    public Long LJLJJL;
    public Long LJLJJLL;
    public boolean LJLJL;
    public final int LJLJLJ;
    public double LJLJLLL;
    public double LJLL;
    public boolean LJLLI;
    public PoiMobParam LJLLILLLL;
    public final C39670Fha LJLLJ;
    public final List<String> LJLLL;
    public final Set<String> LJLLLL;
    public final ConcurrentHashMap<String, String> LJLLLLLL;
    public long LJLZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C85192Xc4(0);
    }

    public PoiSearchVM() {
        List<InterfaceC57784Mm4> synchronizedList = Collections.synchronizedList(new ArrayList());
        o.LJIIIIZZ(synchronizedList, "synchronizedList(mutableListOf<PowerItem>())");
        this.LJLJJI = synchronizedList;
        this.LJLJLJ = 1;
        this.LJLLJ = new C39670Fha(7);
        this.LJLLL = FII.LIZ();
        this.LJLLLL = Q4K.LIZLLL();
        this.LJLLLLLL = new ConcurrentHashMap<>();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C85316Xe4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS181S0100000_15((C8HZ) newListState, (C8HZ<C85166Xbe>) 97));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[Catch: Exception -> 0x00e3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e3, blocks: (B:11:0x00b8, B:12:0x00bb, B:14:0x00c1, B:31:0x0096), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<X.C53611L2h>> r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchVM.onRefresh(X.2kd):java.lang.Object");
    }

    public static List gv0(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (str2.length() == 0) {
            return arrayList;
        }
        int LJJLIIIJILLIZJL = s.LJJLIIIJILLIZJL(0, str, str2, true);
        while (LJJLIIIJILLIZJL >= 0) {
            Position position = new Position();
            position.setBegin(LJJLIIIJILLIZJL);
            position.setEnd((str2.length() + LJJLIIIJILLIZJL) - 1);
            arrayList.add(position);
            if (arrayList.size() > 5) {
                break;
            }
            LJJLIIIJILLIZJL = s.LJJLIIIJILLIZJL(str2.length() + LJJLIIIJILLIZJL, str, str2, true);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C53611L2h r6, X.InterfaceC67352kd<? super X.A2G<X.C53611L2h>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C85238Xco
            if (r0 == 0) goto L1e
            r4 = r7
            X.Xco r4 = (X.C85238Xco) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L2c
            if (r1 != r0) goto L24
            goto L38
        L1e:
            X.Xco r4 = new X.Xco
            r4.<init>(r5, r7)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r3)
            r4.LJLJI = r0     // Catch: java.lang.Exception -> L3e
            java.lang.Object r3 = r5.iv0(r6, r4)     // Catch: java.lang.Exception -> L3e
            if (r3 != r2) goto L3b
            return r2
        L38:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L3e
        L3b:
            X.A2G r3 = (X.A2G) r3     // Catch: java.lang.Exception -> L3e
            goto L48
        L3e:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r3 = X.A2F.LIZJ(r1)
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchVM.onLoadMore(X.L2h, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x0159, code lost:
    
        if ((true ^ kotlin.jvm.internal.o.LJ(r6.isCacheForSearch(), java.lang.Boolean.FALSE)) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [T] */
    /* JADX WARN: Type inference failed for: r3v30, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v63, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v35, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v32, types: [T] */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(X.C53611L2h r54, X.InterfaceC67352kd<? super X.A2G<X.C53611L2h>> r55) {
        /*
            Method dump skipped, instructions count: 1647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.search.PoiSearchVM.iv0(X.L2h, X.2kd):java.lang.Object");
    }
}
