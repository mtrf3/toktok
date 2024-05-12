package com.ss.android.ugc.aweme.nows.service;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C00F;
import X.C195347la;
import X.C197357op;
import X.C197887pg;
import X.C198017pt;
import X.C45804HyK;
import X.C58096Mr6;
import X.EF7;
import X.MAN;
import android.content.Context;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.service.INowWidgetService;
import defpackage.e1;

/* loaded from: classes4.dex */
public final class NowWidgetService implements INowWidgetService {
    public static INowWidgetService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(INowWidgetService.class, false);
        if (LIZ != null) {
            return (INowWidgetService) LIZ;
        }
        if (C58096Mr6.E3 == null) {
            synchronized (INowWidgetService.class) {
                if (C58096Mr6.E3 == null) {
                    C58096Mr6.E3 = new NowWidgetService();
                }
            }
        }
        return C58096Mr6.E3;
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final boolean LIZ() {
        return e1.LIZ(31744, "tt_now_widget_with_camera", true, false);
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final boolean LJI() {
        if (C00F.LIZ(31744, 0, "tt_now_widget_content", true) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final long LIZJ() {
        return C197887pg.LIZ().getLong("last_show_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final boolean LIZLLL() {
        return C195347la.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final boolean LIZIZ(Context context) {
        String str;
        if (context == null || !MAN.LIZIZ.LIZLLL() || !((IAppWidgetService) C197357op.LIZ.getValue()).LJI(EF7.LIZIZ()) || C198017pt.LIZ().getBoolean("is_widget_installed", false)) {
            return false;
        }
        if (AnonymousClass636.LJIILJJIL(context)) {
            str = "widget_intro_dark";
        } else {
            str = "widget_intro_light";
        }
        if (!C197357op.LIZIZ(str).exists()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final void LJ(Context context) {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        C197357op.LJ(LJJIFFI, "inbox_top_cell", null, false, 28);
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final boolean LJFF(boolean z) {
        boolean z2 = C197887pg.LIZ().getBoolean("is_shortcut_added", false);
        if (z) {
            C197887pg.LIZ().storeBoolean("has_added_shortcut_before", true);
        }
        C197887pg.LIZ().storeBoolean("is_shortcut_added", z);
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.service.INowWidgetService
    public final boolean LJII(boolean z) {
        boolean z2 = C198017pt.LIZ().getBoolean("is_widget_installed", false);
        if (z) {
            C198017pt.LIZ().storeBoolean("has_installed_widget_before", true);
        }
        C198017pt.LIZ().storeBoolean("is_widget_installed", z);
        return z2;
    }
}
