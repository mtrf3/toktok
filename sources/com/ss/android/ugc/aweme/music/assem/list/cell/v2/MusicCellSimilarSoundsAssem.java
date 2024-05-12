package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C12460eI;
import X.C16880lQ;
import X.C214348b8;
import X.C240699cX;
import X.C240719cZ;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72253SXh;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class MusicCellSimilarSoundsAssem extends DefaultSimilarSoundsAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final C55749LuL LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(MusicCellSimilarSoundsAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    public MusicCellSimilarSoundsAssem() {
        new LinkedHashMap();
        this.LLFII = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 450);
        C65776Prg LIZ = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 451), aqS154S0100000_4, C240699cX.INSTANCE, null, null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        super.m4(item);
        if (item.LJLILLLLZI.LJLJJI > 0) {
            C12460eI.LJ(getContainerView(), new AqS135S0200000_4(item, this, 182));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxIconView) view.findViewById(R.id.grb);
        this.LLFFF = (TuxTextView) view.findViewById(R.id.grc);
        C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 4), getContainerView());
        C72253SXh.LIZ(getContainerView(), 0, 0, 0, 8);
    }
}
