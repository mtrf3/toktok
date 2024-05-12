package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.SchemaHandleReportSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.0eM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12500eM {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(android.net.Uri uri, String str) {
        o.LJIIIZ(uri, "uri");
        try {
            if (!SchemaHandleReportSetting.INSTANCE.getValue()) {
                return;
            }
            String uri2 = uri.buildUpon().clearQuery().build().toString();
            o.LJIIIIZZ(uri2, "uri.buildUpon().clearQuery().build().toString()");
            String uri3 = uri.toString();
            o.LJIIIIZZ(uri3, "uri.toString()");
            String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
            o.LJIIIIZZ(stackTraceString, "getStackTraceString(Throwable())");
            C0K2.LJII(1, "livesdk_schema_handle", C113554cx.LJJL(new OSZ("base_uri", uri2), new OSZ("full_uri", uri3), new OSZ("stack_trace", stackTraceString), new OSZ("scheme", uri.getScheme()), new OSZ("host", uri.getHost()), new OSZ("handler_type", "handler_type_new"), new OSZ("handler_path", str)));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static final void LIZIZ(String uri, String str) {
        o.LJIIIZ(uri, "uri");
        try {
            if (SchemaHandleReportSetting.INSTANCE.getValue()) {
                android.net.Uri parse = UriProtector.parse(uri);
                o.LJIIIIZZ(parse, "parse(uri)");
                LIZ(parse, str);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
