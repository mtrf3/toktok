package com.ss.android.ugc.aweme.service;

import X.ASL;
import X.C249109q6;
import X.C25832ABw;
import X.C25833ABx;
import X.C41032G8m;
import X.C79045V0n;
import X.C86775Y3v;
import X.EF7;
import X.EnumC25835ABz;
import X.EnumC86777Y3x;
import X.FMX;
import Y.IDDListenerS154S0100000_15;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.captionsheet.LandscapeCaptionDialogFragment;
import com.ss.android.ugc.aweme.captionsheet.LandscapeCaptionPanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CaptionSheetServiceImpl implements ICaptionSheetService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZ(EnumC25835ABz type, C86775Y3v c86775Y3v) {
        LandscapeCaptionPanelFragment landscapeCaptionPanelFragment;
        o.LJIIIZ(type, "type");
        if (c86775Y3v.LJLLLL) {
            return;
        }
        BaseCaptionSheetFragment LIZ2 = ((C25833ABx) new C25832ABw(c86775Y3v).LIZIZ.getValue()).LIZ(type);
        String str = c86775Y3v.LJLJI;
        EnumC86777Y3x enterMethod = c86775Y3v.LJLJJI;
        o.LJIIIZ(enterMethod, "enterMethod");
        HashMap hashMap = new HashMap();
        hashMap.put("panel_type", type.name());
        if (str == null) {
            str = "";
        }
        hashMap.put("enter_from", str);
        hashMap.put("enter_method", enterMethod.getValue());
        FMX.LJIIL("ttlingo_show_caption_service", hashMap);
        if (type == EnumC25835ABz.LANDSCAPE_CAPTIONS) {
            LandscapeCaptionDialogFragment landscapeCaptionDialogFragment = new LandscapeCaptionDialogFragment();
            if (LIZ2 instanceof LandscapeCaptionPanelFragment) {
                landscapeCaptionPanelFragment = (LandscapeCaptionPanelFragment) LIZ2;
            } else {
                landscapeCaptionPanelFragment = null;
            }
            landscapeCaptionDialogFragment.LJLIL = landscapeCaptionPanelFragment;
            landscapeCaptionDialogFragment.show(c86775Y3v.LJLLJ, "Caption");
            return;
        }
        ASL LIZ3 = C249109q6.LIZ(0);
        TuxSheet tuxSheet = LIZ3.LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLJ = false;
        tuxSheet.LJLLILLLL = LIZ2;
        IDDListenerS154S0100000_15 iDDListenerS154S0100000_15 = c86775Y3v.LJLLL;
        if (iDDListenerS154S0100000_15 != null) {
            LIZ3.LJ(iDDListenerS154S0100000_15);
        }
        if (C41032G8m.LIZ()) {
            LIZ3.LIZ.LJLJL = C79045V0n.LJI(R.attr.c9, EF7.LIZIZ());
        }
        TuxSheet tuxSheet2 = LIZ3.LIZ;
        tuxSheet2.show(c86775Y3v.LJLLJ, "CLACaptionSheet");
        c86775Y3v.LIZJ(tuxSheet2);
    }
}
