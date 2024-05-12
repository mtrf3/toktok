package com.ss.android.ugc.aweme.paidcontent.manageseries.assem;

import X.C213688a4;
import X.C214298b3;
import X.C249129q8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.TBT;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManageSeriesHeaderAssem extends UISlotAssem {
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public SmartImageView LJLLJ;
    public TuxIconView LJLLL;
    public FrameLayout LJLLLL;
    public final C214298b3 LJLLLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aii;
    }

    public ManageSeriesHeaderAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ManageSeriesViewModel.class);
        this.LJLLLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 580), C249129q8.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Drawable background;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJLLL = (TuxTextView) view.findViewById(R.id.gdz);
        this.LJLL = (TuxTextView) view.findViewById(R.id.gdh);
        this.LJLLI = (TuxTextView) view.findViewById(R.id.gdx);
        this.LJLLILLLL = (TuxTextView) view.findViewById(R.id.gd5);
        this.LJLLJ = (SmartImageView) view.findViewById(R.id.gdf);
        this.LJLLL = (TuxIconView) view.findViewById(R.id.gds);
        this.LJLLLL = (FrameLayout) view.findViewById(R.id.gdg);
        TuxTextView tuxTextView = this.LJLLI;
        if (tuxTextView != null && (background = tuxTextView.getBackground()) != null) {
            background.setAlpha(18);
        }
        C8YN.LJII(this, this.LJLLLLLL.getValue(), new TBT() { // from class: X.9q9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLJL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 151), 4);
    }
}
