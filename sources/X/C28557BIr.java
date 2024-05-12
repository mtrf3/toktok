package X;

import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BIr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28557BIr {
    public static final java.util.Map<Long, C05490Jl> LIZ = new LinkedHashMap();

    public static C48459J0d LIZ() {
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("tmp_mute_duration_");
        LIZ2.append(MD5Utils.getMD5String(String.valueOf(currentUserId)));
        return new C48459J0d(Long.TYPE, X1D.LIZIZ(LIZ2));
    }

    public static void LIZJ(long j, long j2, String str, boolean z) {
        C29702BlC LIZLLL;
        if (z) {
            LIZLLL = C18230nb.LIZLLL("ttlive_add_mute");
        } else {
            LIZLLL = C18230nb.LIZLLL("ttlive_delete_mute");
        }
        LIZLLL.LIZIZ(Long.valueOf(j2), "user_id");
        LIZLLL.LIZLLL("sec_user_id", str);
        LIZLLL.LIZIZ(Long.valueOf(j), "room_id");
        LIZLLL.LJIIIZ();
    }

    public static void LIZIZ(long j, long j2, String str, Throwable th, boolean z) {
        C29702BlC LIZ2;
        if (z) {
            o.LJI(th);
            LIZ2 = C18210nZ.LIZ("ttlive_add_mute", th);
        } else {
            o.LJI(th);
            LIZ2 = C18210nZ.LIZ("ttlive_delete_mute", th);
        }
        LIZ2.LIZIZ(Long.valueOf(j2), "user_id");
        LIZ2.LIZLLL("sec_user_id", str);
        LIZ2.LIZIZ(Long.valueOf(j), "room_id");
        LIZ2.LJIIIZ();
    }
}
