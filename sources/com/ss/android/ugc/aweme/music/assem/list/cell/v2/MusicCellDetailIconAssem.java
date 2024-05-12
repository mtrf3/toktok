package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C16880lQ;
import X.C2068389v;
import X.C214348b8;
import X.C241779eH;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellDetailIconAssem extends DefaultDetailIconAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFFF;
    public final InterfaceC115514g7 LLFF;

    static {
        TBT tbt = new TBT(MusicCellDetailIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFFF = new InterfaceC74236TBo[]{tbt};
    }

    public MusicCellDetailIconAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 439);
        C65776Prg LIZ = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 440), aqS154S0100000_4, C241779eH.INSTANCE, null, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.gqv);
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_lines_horizontal_decrease_alt;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            tuxIconView.setTuxIcon(c2068389v);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 79));
        }
    }
}
