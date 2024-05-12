package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.GgB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42131GgB {
    public final String LIZ;

    public final ConcurrentHashMap<String, String> LJII() {
        ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap = C42115Gfv.LIZIZ;
        ConcurrentHashMap<String, String> concurrentHashMap2 = concurrentHashMap.get(this.LIZ);
        if (concurrentHashMap2 == null) {
            ConcurrentHashMap<String, String> concurrentHashMap3 = new ConcurrentHashMap<>();
            concurrentHashMap.put(this.LIZ, concurrentHashMap3);
            return concurrentHashMap3;
        }
        return concurrentHashMap2;
    }

    public final void LJIIIZ() {
        C772831o.LIZ().LIZIZ("dm_camera_upload", LJII());
        C42115Gfv.LIZIZ.remove(this.LIZ);
    }

    public C42131GgB(String key) {
        o.LJIIIZ(key, "key");
        this.LIZ = key;
    }

    public final C42131GgB LIZ(long j) {
        LJII().put("auth_time_cost", String.valueOf(j));
        return this;
    }

    public final C42131GgB LIZIZ(long j) {
        LJII().put("compile_time_cost", String.valueOf(j));
        return this;
    }

    public final C42131GgB LIZJ(long j) {
        LJII().put("cover_extract_time_cost", String.valueOf(j));
        return this;
    }

    public final C42131GgB LIZLLL(int i) {
        LJII().put("error_code", String.valueOf(i));
        return this;
    }

    public final C42131GgB LJ(String reason) {
        o.LJIIIZ(reason, "reason");
        LJII().put("fail_reason", reason);
        return this;
    }

    public final C42131GgB LJFF(EnumC42135GgF state) {
        o.LJIIIZ(state, "state");
        LJII().put("fail_state", state.getState());
        return this;
    }

    public final C42131GgB LJI(boolean z) {
        String str;
        ConcurrentHashMap<String, String> LJII = LJII();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJII.put("from_record", str);
        return this;
    }

    public final C42131GgB LJIIIIZZ(EnumC117974k5 type) {
        o.LJIIIZ(type, "type");
        LJII().put("media_type", type.getType());
        return this;
    }

    public final C42131GgB LJIIJ(boolean z) {
        String str;
        ConcurrentHashMap<String, String> LJII = LJII();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJII.put("result", str);
        return this;
    }

    public final C42131GgB LJIIJJI(boolean z) {
        String str;
        ConcurrentHashMap<String, String> LJII = LJII();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJII.put("skip_compile", str);
        return this;
    }

    public final C42131GgB LJIIL(long j) {
        LJII().put("total_time_cost", String.valueOf(j));
        return this;
    }

    public final C42131GgB LJIILIIL(long j) {
        LJII().put("upload_time_cost", String.valueOf(j));
        return this;
    }
}
