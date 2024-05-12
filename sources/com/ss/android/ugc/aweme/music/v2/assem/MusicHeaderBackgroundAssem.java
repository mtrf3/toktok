package com.ss.android.ugc.aweme.music.v2.assem;

import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C8H3;
import X.C8H6;
import X.C9BE;
import X.TBT;
import X.W5U;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MusicHeaderBackgroundAssem extends DynamicAssem implements PageHeaderScrollAbility {
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 545));
    public final C214298b3 LJLL;

    public MusicHeaderBackgroundAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicDetailViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 546), C8H6.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, C7MY.LIZIZ(310)));
        E3(view);
        super.onCreateView();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
    public final void SQ(int i) {
        x3().setTranslationY(-i);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        String str = (String) this.LJLJLLL.getValue();
        if (str == null || str.length() == 0) {
            AssemViewModel.asyncSubscribe$default(this.LJLL.getValue(), new TBT() { // from class: X.8H5
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C187447Xg) obj).LJLIL;
                }
            }, null, null, null, new AqS134S0200000_3(view, this, 101), 14, null);
        } else {
            W5U.LJIIIIZZ((String) this.LJLJLLL.getValue()).LJIIIZ(new C8H3(view, this));
        }
    }
}
