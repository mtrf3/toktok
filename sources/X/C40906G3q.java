package X;

import android.content.Context;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.G3q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40906G3q {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context base) {
        o.LJIIIZ(base, "base");
        if (!FKR.LIZ()) {
            return;
        }
        long nanoTime = System.nanoTime();
        Locale curLocale = C85999Xp5.LIZJ(base, null, null);
        o.LJIIIIZZ(curLocale, "curLocale");
        C40909G3t c40909G3t = new C40909G3t();
        c40909G3t.LIZ = nanoTime;
        c40909G3t.LIZIZ = true;
        c40909G3t.LIZJ = C35820E4a.LIZIZ(FKM.LIZ(), "string_hot_update_xml_online", false);
        EnumC40914G3y type = EnumC40914G3y.JSON;
        o.LJIIIZ(type, "type");
        c40909G3t.LJ = type;
        c40909G3t.LJFF = "starling_patch_tiktok_strings_";
        c40909G3t.LJI = "strings_patch#";
        c40909G3t.LJIIIZ = C39406FdK.LIZLLL(curLocale);
        c40909G3t.LJIIJ = C39406FdK.LIZJ(curLocale);
        c40909G3t.LJII = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aid", EF7.LJIIIZ);
        jSONObject.put("did", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        jSONObject.put("version_code", EF7.LJI());
        jSONObject.put("release_build", EF7.LJ());
        jSONObject.put("is_res_guard", true);
        jSONObject.put("platform", "Android");
        c40909G3t.LJIIIIZZ = jSONObject;
        c40909G3t.LJIIJJI = C47261Igj.LJJIJIL("com.bytedance.tux.input.TuxTextView", "com.bytedance.ies.dmt.ui.widget.DmtTextView");
        C40910G3u c40910G3u = new C40910G3u();
        c40910G3u.LIZ = c40909G3t.LIZ;
        c40910G3u.LIZIZ = c40909G3t.LIZIZ;
        c40910G3u.LIZJ = c40909G3t.LIZJ;
        o.LJIIIZ(c40909G3t.LIZLLL, "<set-?>");
        EnumC40914G3y enumC40914G3y = c40909G3t.LJ;
        o.LJIIIZ(enumC40914G3y, "<set-?>");
        c40910G3u.LIZLLL = enumC40914G3y;
        String str = c40909G3t.LJFF;
        o.LJIIIZ(str, "<set-?>");
        c40910G3u.LJ = str;
        String str2 = c40909G3t.LJI;
        o.LJIIIZ(str2, "<set-?>");
        c40910G3u.LJFF = str2;
        c40910G3u.LJI = c40909G3t.LJII;
        JSONObject jSONObject2 = c40909G3t.LJIIIIZZ;
        o.LJIIIZ(jSONObject2, "<set-?>");
        c40910G3u.LJII = c40909G3t.LJIIIZ;
        c40910G3u.LJIIIIZZ = c40909G3t.LJIIJ;
        c40910G3u.LJIIIZ = c40909G3t.LJIIJJI;
        boolean z = c40910G3u.LJI;
        long j = c40910G3u.LIZ;
        if (z) {
            C40908G3s.LIZLLL = jSONObject2;
            G41 g41 = new G41();
            g41.LIZIZ = j;
            C40908G3s.LIZ = g41;
            C40908G3s.LIZIZ = new C40912G3w();
            C40908G3s.LIZJ = new C39388Fd2();
        }
        C40905G3p.LJII = 32529;
        C40905G3p.LJFF = curLocale;
        C40905G3p.LIZJ = c40910G3u;
        if (c40910G3u.LJ.length() == 0) {
            throw new IllegalArgumentException("Should set patch channel name prefix through RewordConfig");
        }
        o.LJIIIZ(c40910G3u.LJ, "<set-?>");
        if (c40910G3u.LJFF.length() == 0) {
            throw new IllegalArgumentException("Should set patch file name prefix through RewordConfig");
        }
        String str3 = c40910G3u.LJFF;
        o.LJIIIZ(str3, "<set-?>");
        G45.LIZ = str3;
        C64286PKw c64286PKw = new C64286PKw(2);
        C40911G3v c40911G3v = new C40911G3v();
        ((ArrayList) c64286PKw.LIZ).add(new OSZ(c40911G3v.LIZ, c40911G3v));
        C40905G3p.LJ = c64286PKw;
        C40905G3p.LIZLLL(base, c40910G3u.LJIIIIZZ, curLocale, c40910G3u.LJII);
        G41 g412 = C40908G3s.LIZ;
        if (g412 != null) {
            g412.LIZJ = System.nanoTime();
            g412.LIZ = curLocale;
        }
        G41 g413 = C40908G3s.LIZ;
        if (g413 != null) {
            JSONObject jSONObject3 = C40908G3s.LIZLLL;
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            C38458F7m c38458F7m = new C38458F7m();
            c38458F7m.LIZ = "reword_init_event";
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("duration", g413.LIZJ - g413.LIZIZ);
            c38458F7m.LIZJ = jSONObject4;
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("locale", O5Y.LJJJJJ(g413.LIZ));
            c38458F7m.LIZIZ = jSONObject5;
            c38458F7m.LIZLLL = jSONObject3;
            C09900aA.LJII(new C38459F7n(c38458F7m));
            C40908G3s.LIZ = null;
        }
        C40905G3p.LIZIZ = true;
    }
}
