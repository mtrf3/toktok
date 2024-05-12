package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.ADp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25877ADp extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C25877ADp LJLIL = new C25877ADp();

    public C25877ADp() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String str, String str2) {
        Object LIZ;
        Object LIZ2;
        android.net.Uri uri;
        String schema1 = str;
        String schema2 = str2;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        try {
            LIZ = UriProtector.parse(schema1);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        android.net.Uri uri2 = null;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        android.net.Uri uri3 = (android.net.Uri) LIZ;
        try {
            LIZ2 = UriProtector.parse(schema2);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        android.net.Uri uri4 = (android.net.Uri) LIZ2;
        if (uri3 != null) {
            uri = C78939UyV.LJJJJJ(uri3, C47261Igj.LJJIJIL("click_time", "enable_pending_js_task", "enable_prefetch", "use_spark", "room_id", "session_id", "music_id"));
        } else {
            uri = null;
        }
        if (uri4 != null) {
            uri2 = C78939UyV.LJJJJJ(uri4, C47261Igj.LJJIJIL("click_time", "enable_pending_js_task", "enable_prefetch", "use_spark", "room_id", "session_id", "music_id"));
        }
        return Boolean.valueOf(o.LJ(uri, uri2));
    }
}
