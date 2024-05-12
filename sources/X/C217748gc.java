package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.8gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217748gc {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C217788gg.LJLIL);

    public static boolean LIZ(EnumC217778gf type) {
        o.LJIIIZ(type, "type");
        if (type != EnumC217778gf.SEARCH ? (System.currentTimeMillis() - ((Keva) LIZ.getValue()).getLong("key_latest_update_recommend_time", 0L)) / 1000 > 7200 : (System.currentTimeMillis() - ((Keva) LIZ.getValue()).getLong("key_latest_update_search_time", 0L)) / 1000 > 7200) {
            return true;
        }
        return false;
    }
}
