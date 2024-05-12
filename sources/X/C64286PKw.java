package X;

import android.text.TextUtils;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.PKw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64286PKw {
    public final Object LIZ;

    public final boolean LIZ() {
        Object obj = this.LIZ;
        if (obj == null || ((java.util.Map) obj).isEmpty() || TextUtils.isEmpty((CharSequence) ((java.util.Map) this.LIZ).get("process_name")) || TextUtils.isEmpty((CharSequence) ((java.util.Map) this.LIZ).get("crash_thread_name")) || TextUtils.isEmpty((CharSequence) ((java.util.Map) this.LIZ).get("pid")) || TextUtils.isEmpty((CharSequence) ((java.util.Map) this.LIZ).get("tid")) || TextUtils.isEmpty((CharSequence) ((java.util.Map) this.LIZ).get("start_time")) || TextUtils.isEmpty((CharSequence) ((java.util.Map) this.LIZ).get("crash_time"))) {
            return false;
        }
        return !TextUtils.isEmpty((CharSequence) ((java.util.Map) this.LIZ).get("signal_line"));
    }

    public C64286PKw(File file) {
        String LJII;
        File file2 = new File(file, "header.bin");
        if (!file2.exists() || file2.length() == 0 || (LJII = NativeImpl.LJII(file2.getAbsolutePath())) == null) {
            return;
        }
        String[] split = LJII.split("\n");
        this.LIZ = new HashMap();
        for (String str : split) {
            String[] split2 = str.split("=");
            if (split2.length == 2) {
                ((java.util.Map) this.LIZ).put(split2[0], split2[1]);
            }
        }
    }

    public C64286PKw(int i) {
        if (i != 2) {
            this.LIZ = new LinkedHashMap();
        } else {
            this.LIZ = new ArrayList();
        }
    }

    public final Video LIZIZ(Class cls, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns;
        Object obj2 = ((java.util.Map) this.LIZ).get(cls);
        if (obj2 == null || !C65777Prh.LJFF(1, obj2) || (interfaceC88472Yns = (InterfaceC88472Yns) obj2) == null) {
            return null;
        }
        return (Video) interfaceC88472Yns.invoke(obj);
    }
}
