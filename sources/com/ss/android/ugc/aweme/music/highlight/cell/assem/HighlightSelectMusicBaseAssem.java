package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C240659cT;
import X.C240719cZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VR;
import X.C8XO;
import X.C9BE;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class HighlightSelectMusicBaseAssem extends ReusedUISlotAssem<HighlightSelectMusicBaseAssem> implements C8XO<C240719cZ> {
    public final C214298b3 LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6c;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public HighlightSelectMusicBaseAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 455);
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightSelectListViewModel.class);
        this.LLFF = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 456), C240659cT.INSTANCE, aqS154S0100000_4);
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
        C8VR.LIZ(this, new AqS170S0100000_4(this, 440));
        C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 8), Y3());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
