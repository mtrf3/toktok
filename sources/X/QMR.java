package X;

import android.content.ComponentName;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class QMR {
    public final int LIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public byte[] LJFF;
    public long LJIIIIZZ;
    public ComponentName LJIIIZ;
    public final java.util.Map<String, String> LIZIZ = new HashMap();
    public String LJI = "";
    public String LJII = "";

    public final WsChannelMsg LIZ() {
        if (this.LIZ > 0) {
            if (this.LIZLLL >= 0) {
                if (this.LJ > 0) {
                    if (this.LJFF != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                            WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                            msgHeader.key = (String) entry.getKey();
                            msgHeader.value = (String) entry.getValue();
                            arrayList.add(msgHeader);
                        }
                        return new WsChannelMsg(this.LIZ, this.LJIIIIZZ, this.LIZJ, this.LIZLLL, this.LJ, arrayList, this.LJII, this.LJI, this.LJFF, this.LJIIIZ);
                    }
                    throw new IllegalArgumentException("illegal payload");
                }
                throw new IllegalArgumentException("illegal method");
            }
            throw new IllegalArgumentException("illegal service");
        }
        throw new IllegalArgumentException("illegal channelId");
    }

    public QMR(int i) {
        this.LIZ = i;
    }
}
