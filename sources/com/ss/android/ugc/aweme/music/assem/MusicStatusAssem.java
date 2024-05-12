package com.ss.android.ugc.aweme.music.assem;

import X.AV1;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C223338pd;
import X.C2NU;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC242139er;
import X.SYE;
import X.SYF;
import X.SYG;
import X.SYJ;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MusicStatusAssem extends Hilt_MusicStatusAssem implements InterfaceC242139er {
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public final C214298b3 LL;
    public final C214298b3 LLD;
    public final C214298b3 LLF;
    public Map<Integer, View> LLFF = new LinkedHashMap();
    public final C55749LuL LJLZ = new C55749LuL(C47704Ins.LJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public boolean LJZ = true;
    public final C5H3 LJZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 779));
    public final C5H3 LJZL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 772));

    public void _$_clearFindViewByIdCache() {
        this.LLFF.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLFF;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC242139er, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int v3() {
        return R.layout.c6r;
    }

    public MusicStatusAssem() {
        C9BE c9be = C9BE.LIZ;
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 771);
        C65776Prg LIZ = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 776), SYE.INSTANCE, aqS162S0100000_12);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LegacyCommunicateViewModel.class);
        this.LLD = C78926UyI.LJ(this, LIZ2, c9be, new AqS162S0100000_12(LIZ2, 777), SYF.INSTANCE, null);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(this, 773);
        C65776Prg LIZ3 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLF = C78926UyI.LJ(this, LIZ3, c9be, new AqS162S0100000_12(LIZ3, 778), SYG.INSTANCE, aqS162S0100000_122);
    }

    private final OriginMusicArg I3() {
        return (OriginMusicArg) this.LJLZ.getValue();
    }

    private final void R3() {
        boolean z;
        if (this.LJLLI || this.LJLLL || this.LJLLILLLL || this.LJLLJ || this.LJLLLL || this.LJLLLLLL || AV1.LJIILLIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (L3().LJLILLLLZI != z) {
            L3().LJLILLLLZI = z;
            L3().refresh();
        }
    }

    public final LegacyCommunicateViewModel K3() {
        return (LegacyCommunicateViewModel) this.LLD.getValue();
    }

    public final OriginMusicListViewModel L3() {
        return (OriginMusicListViewModel) this.LL.getValue();
    }

    public final C223338pd M3() {
        Object value = this.LJZL.getValue();
        o.LJIIIIZZ(value, "<get-loadingView>(...)");
        return (C223338pd) value;
    }

    public final MusicPlayViewModel N3() {
        return (MusicPlayViewModel) this.LLF.getValue();
    }

    public final C73305Spp O3() {
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    private final void P3() {
        O3().LIZIZ(new SYJ(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0223, code lost:
    
        if (r0 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0256, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0253, code lost:
    
        if (r0 == null) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q3() {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.MusicStatusAssem.Q3():void");
    }

    public static boolean H3(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC242139er
    public void H5(boolean z) {
        this.LJLLILLLL = z;
        R3();
    }

    @Override // X.InterfaceC242139er
    public void K7(boolean z) {
        this.LJLLI = z;
        R3();
    }

    @Override // X.InterfaceC242139er
    public void Kh(boolean z) {
        this.LJLLJ = z;
        R3();
    }

    @Override // X.InterfaceC242139er
    public void Pf(boolean z) {
        this.LJLLLL = z;
        R3();
    }

    @Override // X.InterfaceC242139er
    public void Sj(boolean z) {
        this.LJLLL = z;
        R3();
    }

    @Override // X.InterfaceC242139er
    public void Yk(boolean z) {
        this.LJLLLLLL = z;
        R3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        OriginMusicListViewModel L3 = L3();
        AssemViewModel.asyncSubscribe$default(L3, new TBT() { // from class: X.SYH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZLLL(c239829b8);
            }
        }, null, new AqS178S0100000_12(this, 235), new AqS162S0100000_12(this, 774), new AqS143S0200000_12(L3, this, 48), 2, null);
        C8YN.LJII(this, L3, new TBT() { // from class: X.SYI
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZ(c239829b8);
            }
        }, C213688a4.LIZLLL(), new AqS194S0100000_12(this, 131), 4);
        P3();
        R3();
    }
}
