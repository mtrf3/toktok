package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class LVT {
    public static final LVT LIZIZ = new LVT();
    public final java.util.Set<LVU> LIZ = new HashSet();

    public final Object LIZ(WsChannelMsg wsChannelMsg) {
        Iterator it = ((HashSet) this.LIZ).iterator();
        Class cls = null;
        while (it.hasNext() && (cls = ((LVU) it.next()).LIZ(wsChannelMsg.method)) == null) {
        }
        if (cls == null) {
            return null;
        }
        try {
            return JsonParseUtils.LIZJ(cls, new String(wsChannelMsg.LIZ()));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
