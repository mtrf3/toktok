package X;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GxH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43191GxH extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_wallpaper";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        if (C62016OVo.LIZ().getBoolean("keva_key_device_support_wallpaper", true)) {
            return "";
        }
        String jSONObject = new JSONObject().put("is_wallpaper_block_device", 1).toString();
        o.LJIIIIZZ(jSONObject, "JSONObject().put(\"is_wal…ck_device\", 1).toString()");
        return jSONObject;
    }

    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        if (o.LJ(type, "wallpaper_set_error")) {
            return true;
        }
        return o.LJ(type, "wallpaper_set_success");
    }
}
