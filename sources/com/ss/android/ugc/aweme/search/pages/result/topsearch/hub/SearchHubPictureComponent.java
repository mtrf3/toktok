package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub;

import X.C110614Vt;
import X.C1JI;
import X.C214298b3;
import X.C32151Nz;
import X.C50213JnF;
import X.C50250Jnq;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C78926UyI;
import X.C79045V0n;
import X.C8YN;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.KNV;
import X.O6R;
import X.TBT;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchHubPictureComponent extends UISlotAssem {
    public final C214298b3 LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cgd;
    }

    public SearchHubPictureComponent() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchHubHeaderVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 310), C50250Jnq.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        FrameLayout frameLayout = (FrameLayout) x3().findViewById(R.id.dfn);
        ImageView imageView = (ImageView) x3().findViewById(R.id.f_m);
        if (Build.VERSION.SDK_INT >= 23) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            int[] iArr = {android.R.attr.state_pressed};
            C110614Vt c110614Vt = new C110614Vt();
            Context context = x3().getContext();
            o.LJIIIIZZ(context, "contentView.context");
            c110614Vt.LIZ = C79045V0n.LJI(R.attr.dv, context);
            c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            c110614Vt.LIZLLL = KNV.LIZIZ(0.5d);
            Context context2 = x3().getContext();
            o.LJIIIIZZ(context2, "contentView.context");
            c110614Vt.LJ = C79045V0n.LJI(R.attr.dz, context2);
            Context context3 = x3().getContext();
            o.LJIIIIZZ(context3, "contentView.context");
            stateListDrawable.addState(iArr, c110614Vt.LIZ(context3));
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            c110614Vt2.LIZLLL = KNV.LIZIZ(0.5d);
            Context context4 = x3().getContext();
            o.LJIIIIZZ(context4, "contentView.context");
            c110614Vt2.LJ = C79045V0n.LJI(R.attr.dz, context4);
            Context context5 = x3().getContext();
            o.LJIIIIZZ(context5, "contentView.context");
            stateListDrawable.addState(new int[0], c110614Vt2.LIZ(context5));
            frameLayout.setForeground(stateListDrawable);
        }
        C1JI.LJJIIZ(frameLayout, Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, null, null, null, 30);
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.JnK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C50201Jn3) obj).LJLJJL;
            }
        }, null, new C50213JnF(frameLayout, new C68322mC(), this, new C68322mC(), imageView), 6);
    }
}
