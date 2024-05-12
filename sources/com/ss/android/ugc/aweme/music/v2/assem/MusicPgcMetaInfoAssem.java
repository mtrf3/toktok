package com.ss.android.ugc.aweme.music.v2.assem;

import X.C187597Xv;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78897Uxp;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MusicPgcMetaInfoAssem extends DynamicAssem {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 548));
    public final C214298b3 LJLL;
    public boolean LJLLI;

    public MusicPgcMetaInfoAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 549), C187597Xv.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.buj;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        C78897Uxp.LJJJJJL(x3(), 0.0f);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLL.getValue(), new TBT() { // from class: X.7Xt
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C187447Xg) obj).LJLIL;
            }
        }, null, null, null, new AqS134S0200000_3(this, view, 102), 14, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLL.getValue(), new TBT() { // from class: X.7Xu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C187447Xg) obj).LJLILLLLZI);
            }
        }, null, new AqS166S0200000_3(this, view, 9), 6);
    }
}
