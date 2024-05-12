package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C12460eI;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C240709cY;
import X.C240719cZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72253SXh;
import X.C78926UyI;
import X.C9BE;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultSimilarSoundsAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import q03.IDaS484S0100000_4;

/* loaded from: classes5.dex */
public final class HighlightSelectMusicSimilarSoundsAssem extends DefaultSimilarSoundsAssem {
    public final C62822Ol8 LLFII;
    public final C214298b3 LLFZ;

    public HighlightSelectMusicSimilarSoundsAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS154S0100000_4(this, 461));
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 459);
        C65776Prg LIZ = C65352Pkq.LIZ(HighlightSelectListViewModel.class);
        this.LLFZ = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 460), C240709cY.INSTANCE, aqS154S0100000_4);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        super.m4(item);
        if (item.LJLILLLLZI.LJLJJI > 0) {
            C12460eI.LJ(getContainerView(), new AqS135S0200000_4(item, this, 293));
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFF = (TuxIconView) view.findViewById(R.id.grb);
        this.LLFFF = (TuxTextView) view.findViewById(R.id.grc);
        C16880lQ.LJIIJ(new IDaS484S0100000_4(this, 10), getContainerView());
        C72253SXh.LIZ(getContainerView(), 0, 0, 0, 8);
    }
}
