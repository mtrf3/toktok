package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class C6E {
    public final boolean LIZ;
    public String LIZIZ = "unknown";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public int LJIIL;
    public java.util.Map<String, Object> LJIILIIL;
    public final java.util.Map<String, Object> LJIILJJIL;

    public final java.util.Map<String, Object> LIZIZ() {
        long j;
        long j2;
        int i;
        User owner;
        java.util.Map<String, Object> map = this.LJIILIIL;
        if (map != null) {
            this.LJIILJJIL.putAll(map);
        }
        this.LJIILJJIL.put("biz", this.LIZIZ);
        this.LJIILJJIL.put("schema", this.LIZJ);
        this.LJIILJJIL.put("url", this.LIZLLL);
        this.LJIILJJIL.put("render_type", this.LJ);
        this.LJIILJJIL.put("network_start", Long.valueOf(this.LJFF));
        this.LJIILJJIL.put("network_end", Long.valueOf(this.LJI));
        this.LJIILJJIL.put("container_create_start", Long.valueOf(this.LJII));
        this.LJIILJJIL.put("container_create_end", Long.valueOf(this.LJIIIIZZ));
        this.LJIILJJIL.put("url_load_start", Long.valueOf(this.LJIIIZ));
        this.LJIILJJIL.put("url_load_end", Long.valueOf(this.LJIIJ));
        this.LJIILJJIL.put("real_show", Long.valueOf(this.LJIIJJI));
        this.LJIILJJIL.put("reuse_type", Integer.valueOf(this.LJIIL));
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = LIZIZ.getCurrentUserId();
        } else {
            j = 0;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && (owner = room.getOwner()) != null) {
            j2 = owner.getId();
        } else {
            j2 = 0;
        }
        java.util.Map<String, Object> map2 = this.LJIILJJIL;
        if (j2 != 0 && j != 0 && j2 == j) {
            i = 1;
        } else {
            i = 0;
        }
        map2.put("is_anchor", Integer.valueOf(i));
        return this.LJIILJJIL;
    }

    public C6E(boolean z) {
        java.util.Map<String, Object> hashMap;
        this.LIZ = z;
        if (z) {
            hashMap = new ConcurrentHashMap<>();
        } else {
            hashMap = new HashMap<>();
        }
        this.LJIILJJIL = hashMap;
    }

    public final void LIZ(Object value, String str) {
        java.util.Map<String, Object> hashMap;
        o.LJIIIZ(value, "value");
        if (this.LJIILIIL == null) {
            if (this.LIZ) {
                hashMap = new ConcurrentHashMap<>();
            } else {
                hashMap = new HashMap<>();
            }
            this.LJIILIIL = hashMap;
        }
        java.util.Map<String, Object> map = this.LJIILIIL;
        if (map != null) {
            map.put(str, value);
        }
    }
}
