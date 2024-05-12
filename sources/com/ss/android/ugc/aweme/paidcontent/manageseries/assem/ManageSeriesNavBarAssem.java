package com.ss.android.ugc.aweme.paidcontent.manageseries.assem;

import X.A0X;
import X.C214298b3;
import X.C234529Ii;
import X.C252709vu;
import X.C25524A0a;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C88913eJ;
import X.C9BE;
import X.C9KF;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManageSeriesNavBarAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;

    public ManageSeriesNavBarAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ManageSeriesViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 589), A0X.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C25524A0a.class, "manage_series_hierarchy_data_key"), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gdq);
        if (c252709vu != null) {
            if (((C25524A0a) this.LJLILLLLZI.getValue()).LJLJJL) {
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_chevron_left_ltr;
                LIZJ.LIZLLL = true;
                LIZJ.LIZIZ(new AqS154S0100000_4(this, 1183));
                c252709vu.LIZJ(LIZJ);
            }
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = C88913eJ.LIZ(view, R.string.qrq, "view.context.getString(R…Screen_screenTitle_title)");
            c252709vu.LJIILLIIL(c9kf);
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_ellipsis_horizontal;
            c234529Ii.LIZIZ = "more_options_tag";
            c234529Ii.LIZIZ(new AqS151S0200000_4(this, view, 44));
            c252709vu.LIZIZ(c234529Ii);
        }
    }
}
