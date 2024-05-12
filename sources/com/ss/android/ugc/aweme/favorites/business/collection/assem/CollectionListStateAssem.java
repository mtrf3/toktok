package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.C192897hd;
import X.C192917hf;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C9BE;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionListStateAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public CollectionListStateAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 261), C192917hf.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 259));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 258));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C73305Spp c73305Spp = (C73305Spp) view;
        Context context = c73305Spp.getContext();
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.7hb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192847hY) obj).LJLIL;
            }
        }, null, new AqS134S0200000_3(context, c73305Spp, this, 70), new AqS153S0100000_3(c73305Spp, 260), new C192897hd(context, c73305Spp, this), 2, null);
    }
}
