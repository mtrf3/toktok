package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LtH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55683LtH {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C55684LtI.LJLIL);
    public static Long LIZIZ;
    public static boolean LIZJ;

    public static void LIZIZ(String str) {
        Long l;
        String str2;
        C62822Ol8 c62822Ol8 = LIZ;
        C55685LtJ c55685LtJ = (C55685LtJ) ((LinkedHashMap) c62822Ol8.getValue()).get(str);
        if (c55685LtJ == null) {
            return;
        }
        if (FMX.LIZJ("request_to_show_interval")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("request_type", c55685LtJ.LIZIZ.getValue());
            jSONObject.putOpt("request_id", c55685LtJ.LIZ);
            jSONObject.putOpt("request_timestamp", Long.valueOf(c55685LtJ.LIZJ));
            jSONObject.putOpt("response_timestamp", Long.valueOf(c55685LtJ.LIZLLL));
            jSONObject.putOpt("request_latency", Long.valueOf(c55685LtJ.LJ));
            jSONObject.putOpt("this_brush_first_video_show_timestamp", Long.valueOf(System.currentTimeMillis()));
            if (c55685LtJ.LIZIZ == EnumC55672Lt6.OPEN) {
                l = null;
            } else {
                l = LIZIZ;
            }
            jSONObject.putOpt("last_brush_last_video_show_timestamp", l);
            if (LIZJ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.putOpt("is_optimized_by_show_gap", str2);
            FMX.LJIILJJIL("request_to_show_interval", jSONObject);
        }
        LIZJ = false;
        ((HashMap) c62822Ol8.getValue()).remove(str);
    }

    public static final void LIZ(int i, List awemes) {
        Object LIZ2;
        Object LIZ3;
        o.LJIIIZ(awemes, "awemes");
        try {
            LIZ2 = (Aweme) ListProtector.get(awemes, i);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Object obj = null;
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        Aweme aweme = (Aweme) LIZ2;
        if (aweme == null || aweme.getRid() == null) {
            LIZIZ = Long.valueOf(System.currentTimeMillis());
            return;
        }
        aweme.getRid();
        try {
            LIZ3 = (Aweme) ListProtector.get(awemes, i - 1);
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th2) {
            LIZ3 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (!C3C5.m12isFailureimpl(LIZ3)) {
            obj = LIZ3;
        }
        Aweme aweme2 = (Aweme) obj;
        if (aweme2 != null) {
            String rid = aweme2.getRid();
            if (rid == null || rid.length() == 0 || !o.LJ(aweme2.getRid(), aweme.getRid())) {
                String rid2 = aweme.getRid();
                o.LJIIIIZZ(rid2, "currentAweme.rid");
                LIZIZ(rid2);
            }
        } else {
            String rid3 = aweme.getRid();
            o.LJIIIIZZ(rid3, "currentAweme.rid");
            LIZIZ(rid3);
        }
        LIZIZ = Long.valueOf(System.currentTimeMillis());
    }
}
