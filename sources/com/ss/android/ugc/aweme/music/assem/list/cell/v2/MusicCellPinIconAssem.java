package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C16880lQ;
import X.C214348b8;
import X.C240609cO;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellPinIconAssem extends DefaultPinIconAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFII;
    public final InterfaceC115514g7 LLFFF;

    static {
        TBT tbt = new TBT(MusicCellPinIconAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFII = new InterfaceC74236TBo[]{tbt};
    }

    public MusicCellPinIconAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 446);
        C65776Prg LIZ = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 447), aqS154S0100000_4, C240609cO.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultPinIconAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        TuxIconView tuxIconView = this.LLFF;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 83));
        }
    }
}
