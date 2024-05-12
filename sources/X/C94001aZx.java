package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.music.app.auth.report.api.ActionReportApi;
import com.ss.android.ugc.aweme.music.report.model.ReportData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aZx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94001aZx {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C94716alU.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C94717alV.LJLIL);

    public static void LIZ(ReportData reportData) {
        List LJJIJ = C47261Igj.LJJIJ(reportData);
        ActionReportApi actionReportApi = (ActionReportApi) LIZ.getValue();
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-gson>(...)");
        String json = GsonProtectorUtils.toJson((Gson) value, LJJIJ);
        o.LJIIIIZZ(json, "gson.toJson(reportData)");
        C78540Us4.LJJIIZ(actionReportApi.reportAction(json)).LJJJJZ();
    }
}
