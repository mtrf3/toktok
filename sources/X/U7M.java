package X;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class U7M extends QXX {
    public final long LJLIL;
    public final java.util.Map<Long, Long> LJLILLLLZI;
    public final ConcurrentHashMap<String, Boolean> LJLJI;
    public final ConcurrentHashMap<String, Boolean> LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public String LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public EnumC75615Tlz LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;
    public final java.util.Map<Long, SurfaceView> LJZL;
    public boolean LL;

    static {
        new ConcurrentHashMap();
    }

    public U7M(long j) {
        super((Object) null);
        this.LJLIL = j;
        this.LJLILLLLZI = new HashMap();
        this.LJLJI = new ConcurrentHashMap<>();
        this.LJLJJI = new ConcurrentHashMap<>();
        this.LJLLJ = EnumC75615Tlz.NONE;
        RivalsListsData.TopHostInfo EMPTY = RivalsListsData.TopHostInfo.LIZ;
        o.LJIIIIZZ(EMPTY, "EMPTY");
        this.LJZL = new HashMap();
    }

    public final boolean LLLLZ(String str) {
        Boolean bool;
        if (str.length() == 0 || (bool = this.LJLJJI.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LLLLZIL(String str) {
        Boolean bool;
        if (str.length() == 0 || (bool = this.LJLJI.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void LLLLZLLIL(String str) {
        this.LJLJJL = 0L;
        this.LJLJJLL = 0L;
        this.LJLJLJ = null;
        this.LJLJLLL = 0L;
        this.LJLLI = 0L;
        this.LJLLILLLL = false;
        this.LJLZ = null;
        LLLZ("");
        this.LJLLLL = false;
        this.LJLLLLLL = false;
        LLLLZLLLI(EnumC75615Tlz.NONE);
        ((HashMap) this.LJLILLLLZI).clear();
        ((HashMap) this.LJZL).clear();
        LLLZI(null);
        this.LL = false;
        RivalsListsData.TopHostInfo EMPTY = RivalsListsData.TopHostInfo.LIZ;
        o.LJIIIIZZ(EMPTY, "EMPTY");
        this.LJLJI.clear();
        this.LJLJJI.clear();
    }

    public final void LLLLZLLLI(EnumC75615Tlz value) {
        o.LJIIIZ(value, "value");
        this.LJLLJ = value;
    }

    public final void LLLZ(String str) {
        this.LJLLL = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("live_rtc_engine_config")) {
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
            if (!optJSONObject.has("rtc_vendor")) {
                return;
            }
            optJSONObject.optInt("rtc_vendor");
        } catch (Exception unused) {
        }
    }

    public final void LLLZI(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJZI = str;
        }
    }
}
