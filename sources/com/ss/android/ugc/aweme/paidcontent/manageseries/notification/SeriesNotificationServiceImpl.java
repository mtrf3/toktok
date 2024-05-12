package com.ss.android.ugc.aweme.paidcontent.manageseries.notification;

import X.C06540Nm;
import X.C110614Vt;
import X.C113554cx;
import X.C118724lI;
import X.C2068389v;
import X.C26338AVi;
import X.C31461Li;
import X.C47261Igj;
import X.C51764KTg;
import X.C58096Mr6;
import X.C61328O5c;
import X.C61878OQg;
import X.C79045V0n;
import X.C7MY;
import X.C86550Xxy;
import X.OSZ;
import X.X1D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.service.ISeriesNotificationService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SeriesNotificationServiceImpl implements ISeriesNotificationService {
    public static ISeriesNotificationService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(ISeriesNotificationService.class, false);
        if (LIZ != null) {
            return (ISeriesNotificationService) LIZ;
        }
        if (C58096Mr6.M3 == null) {
            synchronized (ISeriesNotificationService.class) {
                if (C58096Mr6.M3 == null) {
                    C58096Mr6.M3 = new SeriesNotificationServiceImpl();
                }
            }
        }
        return C58096Mr6.M3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.service.ISeriesNotificationService
    public final void LIZIZ(String str, Context context, boolean z, String str2, boolean z2) {
        List LJJIJ;
        List LJJIJ2;
        C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
        if (c86550Xxy.LJIIL(1006) == null) {
            c86550Xxy.LIZ.LJIIJJI(new C118724lI(1006, str2, z2));
        } else if (c86550Xxy.LJIIL(1006) instanceof C118724lI) {
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        c110614Vt.LJII = C7MY.LIZIZ(48);
        c110614Vt.LJI = C7MY.LIZIZ(48);
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        Drawable LIZ = c110614Vt.LIZ(context);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(24);
        c2068389v.LIZJ = C7MY.LIZIZ(24);
        c2068389v.LIZ = R.raw.icon_3pt_image;
        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.ch, context);
        LayerDrawable LJIIJ = C26338AVi.LJIIJ(c2068389v.LIZ(context), LIZ);
        int i = 0;
        if (z) {
            String str3 = null;
            List LJJIJ3 = C47261Igj.LJJIJ(LJIIJ);
            if (str.length() == 0) {
                LJJIJ2 = C61878OQg.INSTANCE;
            } else {
                LJJIJ2 = C47261Igj.LJJIJ(str);
            }
            float f = 0.0f;
            new C51764KTg(1006, "click_push_series_submitted", null, new InnerPushUITemplate(i, str3, i, i, i, i, null == true ? 1 : 0, LJJIJ2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, LJJIJ3, null == true ? 1 : 0, i, i, f, f, null == true ? 1 : 0, i, i, null == true ? 1 : 0, 1, null == true ? 1 : 0, i, i, context.getResources().getString(R.string.qli), null == true ? 1 : 0, context.getResources().getString(R.string.qlg), null == true ? 1 : 0, i, null == true ? 1 : 0, i, null == true ? 1 : 0, null == true ? 1 : 0, i, i, i, i, null == true ? 1 : 0, null == true ? 1 : 0, f, i, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, i, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, -339742849, 1048575, null == true ? 1 : 0), C113554cx.LJJLIIIIJ(new OSZ("business_tag", "creator_monetization")), null, 156).LIZ();
            return;
        }
        String str4 = null;
        List LJJIJ4 = C47261Igj.LJJIJ(LJIIJ);
        if (str.length() == 0) {
            LJJIJ = C61878OQg.INSTANCE;
        } else {
            LJJIJ = C47261Igj.LJJIJ(str);
        }
        float f2 = 0.0f;
        new C51764KTg(1006, "click_push_series_submitted", null, new InnerPushUITemplate(i, str4, i, i, i, i, null == true ? 1 : 0, LJJIJ, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, LJJIJ4, null == true ? 1 : 0, i, i, f2, f2, null == true ? 1 : 0, i, i, null == true ? 1 : 0, 1, null == true ? 1 : 0, i, i, context.getResources().getString(R.string.qli), null == true ? 1 : 0, context.getResources().getString(R.string.qlg), null == true ? 1 : 0, i, null == true ? 1 : 0, 3, context.getResources().getString(R.string.qlh), null == true ? 1 : 0, i, i, i, i, null == true ? 1 : 0, null == true ? 1 : 0, f2, i, null == true ? 1 : 0, null == true ? 1 : 0, C31461Li.LIZJ("series_submit_notification_schema", "aweme://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fseries%2Fmain%3Fenter_from%3Dseries_submit_notification%26__status_bar%3Dtrue%26hide_nav_bar%3D1%26should_full_screen%3D1", "getInstance()\n        .g…ationSetting::class.java)"), i, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, -339742849, 1040380, null == true ? 1 : 0), C113554cx.LJJLIIIIJ(new OSZ("business_tag", "creator_monetization")), null, 156).LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.service.ISeriesNotificationService
    public final void LIZ(String str, String str2, Context context, boolean z, String entryPoint, boolean z2) {
        List LJJIJ;
        String str3;
        o.LJIIIZ(entryPoint, "entryPoint");
        C86550Xxy c86550Xxy = C86550Xxy.LIZIZ;
        if (c86550Xxy.LJIIL(1005) == null) {
            c86550Xxy.LIZ.LJIIJJI(new C118724lI(1005, entryPoint, z2));
        } else if (c86550Xxy.LJIIL(1005) instanceof C118724lI) {
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        c110614Vt.LJII = C7MY.LIZIZ(48);
        c110614Vt.LJI = C7MY.LIZIZ(48);
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        Drawable LIZ = c110614Vt.LIZ(context);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(24);
        c2068389v.LIZJ = C7MY.LIZIZ(24);
        c2068389v.LIZ = R.raw.icon_3pt_image;
        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.ch, context);
        String str4 = null;
        List LJJIJ2 = C47261Igj.LJJIJ(C26338AVi.LJIIJ(c2068389v.LIZ(context), LIZ));
        int i = 0;
        if (str.length() == 0) {
            LJJIJ = C61878OQg.INSTANCE;
        } else {
            LJJIJ = C47261Igj.LJJIJ(str);
        }
        String string = context.getResources().getString(R.string.qlf);
        String string2 = context.getResources().getString(R.string.qld);
        String string3 = context.getResources().getString(R.string.qle);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("aweme://paidcontent/manage?collection_id=", str2, "&entry_point=", entryPoint, "&enter_from=series_status_toast&enter_manage_from=");
        if (z) {
            str3 = "series_dashboard";
        } else {
            str3 = "";
        }
        LIZLLL.append(str3);
        float f = 0.0f;
        new C51764KTg(1005, "click_push_series_saved", null, new InnerPushUITemplate(i, str4, i, i, i, i, null == true ? 1 : 0, LJJIJ, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, LJJIJ2, null == true ? 1 : 0, i, i, f, f, null == true ? 1 : 0, i, i, null == true ? 1 : 0, 1, null == true ? 1 : 0, i, i, string, null == true ? 1 : 0, string2, null == true ? 1 : 0, i, null == true ? 1 : 0, 3, string3, null == true ? 1 : 0, i, i, i, i, null == true ? 1 : 0, null == true ? 1 : 0, f, i, null == true ? 1 : 0, null == true ? 1 : 0, X1D.LIZIZ(LIZLLL), i, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, -339742849, 1040380, null == true ? 1 : 0), C113554cx.LJJLIIIIJ(new OSZ("business_tag", "creator_monetization")), null, 156).LIZ();
    }
}
