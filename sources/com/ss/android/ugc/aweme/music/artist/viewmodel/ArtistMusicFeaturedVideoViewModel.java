package com.ss.android.ugc.aweme.music.artist.viewmodel;

import X.A2F;
import X.A2G;
import X.C236139On;
import X.C237039Rz;
import X.C239839b9;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C65352Pkq;
import X.C78404Ups;
import X.C8HZ;
import X.EV6;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArtistMusicFeaturedVideoViewModel extends AssemListViewModel<C239839b9, InterfaceC57784Mm4, Long> {
    public final EV6 LJLIL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C237039Rz.class));
    public final C55749LuL LJLILLLLZI = new C55749LuL(C47704Ins.LJFF(this, C236139On.class, "hierarchy_data_artist_music"), true);
    public String LJLJI = "";
    public final ArrayList<InterfaceC57784Mm4> LJLJJI = new ArrayList<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C239839b9(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.InterfaceC67352kd<? super java.util.List<? extends X.InterfaceC57784Mm4>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C239939bJ
            if (r0 == 0) goto L21
            r6 = r8
            X.9bJ r6 = (X.C239939bJ) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r2 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 != r4) goto L27
            com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel r1 = r6.LJLIL
            goto La3
        L21:
            X.9bJ r6 = new X.9bJ
            r6.<init>(r7, r8)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C141335gf.LIZJ(r2)
            X.9bC r0 = X.C239869bC.LJLIL
            r7.setState(r0)
            X.LuL r0 = r7.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.9On r0 = (X.C236139On) r0
            r3 = 0
            if (r0 == 0) goto L8d
            java.lang.String r2 = r0.LJLIL
        L44:
            if (r2 == 0) goto L4c
            int r0 = r2.length()
            if (r0 != 0) goto L8b
        L4c:
            r0 = 1
        L4d:
            if (r0 == 0) goto L8f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.9bL r1 = new X.9bL
            X.LuL r0 = r7.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.9On r0 = (X.C236139On) r0
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.LJLILLLLZI
            if (r0 != 0) goto L66
        L64:
            java.lang.String r0 = ""
        L66:
            r1.<init>(r0)
            r3.add(r1)
            X.9bM r2 = new X.9bM
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 413(0x19d, float:5.79E-43)
            r1.<init>(r7, r0)
            r2.<init>(r1)
            r3.add(r2)
            X.9bE r0 = X.C239889bE.LJLIL
            r7.setState(r0)
            java.util.ArrayList<X.Mm4> r0 = r7.LJLJJI
            r0.clear()
            java.util.ArrayList<X.Mm4> r0 = r7.LJLJJI
            r0.addAll(r3)
            return r3
        L8b:
            r0 = 0
            goto L4d
        L8d:
            r2 = r3
            goto L44
        L8f:
            X.XIA r1 = X.C78613UtF.LIZJ     // Catch: java.lang.Exception -> La9
            X.9bH r0 = new X.9bH     // Catch: java.lang.Exception -> La9
            r0.<init>(r7, r2, r3)     // Catch: java.lang.Exception -> La9
            r6.LJLIL = r7     // Catch: java.lang.Exception -> La9
            r6.LJLJJI = r4     // Catch: java.lang.Exception -> La9
            java.lang.Object r2 = X.XKX.LJI(r1, r0, r6)     // Catch: java.lang.Exception -> La9
            if (r2 != r5) goto La1
            return r5
        La1:
            r1 = r7
            goto La6
        La3:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Exception -> Laa
        La6:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> Laa
            return r2
        La9:
            r1 = r7
        Laa:
            X.9bD r0 = X.C239879bD.LJLIL
            r1.setState(r0)
            X.OQg r0 = X.C61878OQg.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel.gv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 412));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C239929bI
            if (r0 == 0) goto L58
            r5 = r7
            X.9bI r5 = (X.C239929bI) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r0 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJJI
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L5e
            X.A2F r1 = r5.LJLIL
            X.C141335gf.LIZJ(r0)
        L22:
            java.util.List r0 = (java.util.List) r0
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
            return r0
        L2c:
            X.C141335gf.LIZJ(r0)
            X.LuL r0 = r6.LJLILLLLZI
            java.lang.Object r0 = r0.getValue()
            X.9On r0 = (X.C236139On) r0
            if (r0 == 0) goto L3d
            java.lang.String r2 = r0.LJLJI
            if (r2 != 0) goto L3f
        L3d:
            java.lang.String r2 = ""
        L3f:
            kotlin.jvm.internal.AqS29S1000000_4 r1 = new kotlin.jvm.internal.AqS29S1000000_4
            r0 = 23
            r1.<init>(r2, r0)
            r6.setState(r1)
            r6.LJLJI = r2
            X.A2F r1 = X.A2G.LIZ
            r5.LJLIL = r1
            r5.LJLJJI = r3
            java.lang.Object r0 = r6.gv0(r5)
            if (r0 != r4) goto L22
            return r4
        L58:
            X.9bI r5 = new X.9bI
            r5.<init>(r6, r7)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.artist.viewmodel.ArtistMusicFeaturedVideoViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }
}
