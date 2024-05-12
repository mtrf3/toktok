package com.ss.android.ugc.aweme.music.search.cell;

import X.C16880lQ;
import X.C214348b8;
import X.C240719cZ;
import X.C241679e7;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8VR;
import X.C8XO;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicCellBaseAssem extends ReusedUISlotAssem<SearchMusicCellBaseAssem> implements C8XO<C240719cZ> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final InterfaceC115514g7 LLFF;

    static {
        TBT tbt = new TBT(SearchMusicCellBaseAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6q;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchMusicCellBaseAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 476);
        C65776Prg LIZ = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 477), aqS154S0100000_4, C241679e7.INSTANCE, null, null);
    }

    @Override // X.C8XO
    public final void F0(C240719cZ item) {
        o.LJIIIZ(item, "item");
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS170S0100000_4(this, 450));
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 88), Y3());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
