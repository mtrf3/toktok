package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BZI implements InterfaceC54761LeP {
    public static final /* synthetic */ int LIZIZ = 0;
    public final BZJ LIZ;

    public final void LJI() {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJI();
        }
    }

    public final void LJIIIIZZ() {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LIZLLL(DataChannelGlobal.LJLJJI.mv0(C29048Bae.class));
        }
    }

    public final java.util.Map<String, String> LJIILJJIL() {
        java.util.Map<String, String> LJ;
        BZJ bzj = this.LIZ;
        if (bzj == null || (LJ = bzj.LJ()) == null) {
            return new HashMap();
        }
        return LJ;
    }

    public final String LJIILL() {
        String eventName;
        BZJ bzj = this.LIZ;
        if (bzj == null || (eventName = bzj.getEventName()) == null) {
            return "";
        }
        return eventName;
    }

    public final void LJIIZILJ() {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LIZLLL(DataChannelGlobal.LJLJJI.mv0(C29049Baf.class));
        }
    }

    public final void LJJIIJZLJL() {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIJ();
        }
    }

    public final void LJJIIZ() {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIILIIL();
        }
    }

    public final void LJJIIZI() {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LIZJ();
        }
    }

    public final void LJJIJ() {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LIZIZ();
        }
    }

    @Override // X.InterfaceC54761LeP
    public final /* bridge */ /* synthetic */ BZI LIZ() {
        LJIIZILJ();
        return this;
    }

    @Override // X.InterfaceC54761LeP
    public final /* bridge */ /* synthetic */ BZI LIZIZ(java.util.Map map) {
        LJJIFFI(map);
        return this;
    }

    public final void LIZJ(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "action_type");
        }
    }

    public final void LIZLLL(C28837BTl c28837BTl) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LIZLLL(c28837BTl);
        }
    }

    public final void LJ(Long l) {
        if (l != null) {
            LJFF(String.valueOf(l.longValue()));
        }
    }

    public final void LJFF(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "anchor_id");
        }
    }

    public final void LJII(InterfaceC88472Yns callBack) {
        o.LJIIIZ(callBack, "callBack");
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJII(callBack);
        }
    }

    public final void LJIIIZ(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "event_belong");
        }
    }

    public final void LJIIJ(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "event_module");
        }
    }

    public final void LJIIJJI(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "event_page");
        }
    }

    public final void LJIIL(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "event_type");
        }
    }

    public final void LJIILIIL(BU8 bu8) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LIZLLL(bu8);
        }
    }

    public final void LJIILLIIL(DataChannel dataChannel) {
        Object obj;
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            if (dataChannel != null) {
                obj = dataChannel.kv0(BJO.class);
            } else {
                obj = null;
            }
            bzj.LIZLLL(obj);
        }
    }

    public final void LJIJ(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "live_type");
        }
    }

    public final void LJIJI(boolean z) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJFF(z);
        }
    }

    public final void LJJ(JSONObject obj) {
        o.LJIIIZ(obj, "obj");
        Iterator<String> keys = obj.keys();
        o.LJIIIIZZ(keys, "obj.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            BZJ bzj = this.LIZ;
            if (bzj != null) {
                o.LJIIIIZZ(key, "key");
                bzj.LJIIIIZZ(obj.opt(key), key);
            }
        }
    }

    public final void LJJIFFI(java.util.Map map) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LIZ(map);
        }
    }

    public final void LJJII(java.util.Map map) {
        if (map != null && (!map.isEmpty())) {
            for (Map.Entry entry : map.entrySet()) {
                BZJ bzj = this.LIZ;
                if (bzj != null) {
                    bzj.LJIIIIZZ(entry.getValue(), (String) entry.getKey());
                }
            }
        }
    }

    public final void LJJIII(Long l) {
        if (l != null) {
            LJJIIJ(String.valueOf(l.longValue()));
        }
    }

    public final void LJJIIJ(String str) {
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(str, "room_id");
        }
    }

    public BZI(String eventName, boolean z) {
        o.LJIIIZ(eventName, "eventName");
        this.LIZ = ((ILoggerService) CN1.LIZ(ILoggerService.class)).Dg(eventName, z);
    }

    public final void LJIJJ(Object obj, String key) {
        o.LJIIIZ(key, "key");
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIIIZZ(obj, key);
        }
    }

    public final void LJIJJLI(String str, Double d) {
        BZJ bzj;
        if (d != null && !Double.isNaN(d.doubleValue()) && !Double.isInfinite(d.doubleValue()) && (bzj = this.LIZ) != null) {
            bzj.LJIIIIZZ(d, str);
        }
    }

    public final void LJIL(String str, Float f) {
        BZJ bzj;
        if (f != null && !Float.isNaN(f.floatValue()) && !Float.isInfinite(f.floatValue()) && (bzj = this.LIZ) != null) {
            bzj.LJIIIIZZ(f, str);
        }
    }

    public final void LJJI(Object value, String str, InterfaceC65784Pro predicate) {
        o.LJIIIZ(predicate, "predicate");
        o.LJIIIZ(value, "value");
        BZJ bzj = this.LIZ;
        if (bzj != null) {
            bzj.LJIIL(value, str, predicate);
        }
    }
}
