package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.C16880lQ;
import X.C191677ff;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C7MY;
import X.C88913eJ;
import X.C9BE;
import X.SY4;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class AddVideoAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public AddVideoAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionContentViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 244), C191677ff.INSTANCE, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 242));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C73305Spp c73305Spp = (C73305Spp) C7MY.LIZLLL(view, "view", R.id.kf_, "view.findViewById(R.id.status_view)");
        View findViewById = view.findViewById(R.id.kpi);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.submit)");
        SY4 sy4 = (SY4) view.findViewById(R.id.mls);
        String LLLZ = C16880lQ.LLLZ(C88913eJ.LIZ(view, R.string.gbb, "view.context.getString(R…on_create_add_videos_btn)"), Arrays.copyOf(new Object[]{CardStruct.IStatusCode.DEFAULT}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        sy4.setText(LLLZ);
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 3, 42, 42), sy4);
        Context context = view.getContext();
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.7fg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192027gE) obj).LJLILLLLZI;
            }
        }, null, new AqS134S0200000_3(context, c73305Spp, this, 65), new AqS153S0100000_3(c73305Spp, 243), new AqS49S0400000_3(findViewById, c73305Spp, context, sy4, 6), 2, null);
    }
}
