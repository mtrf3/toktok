package X;

import android.content.ComponentName;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class QO7 {
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

    public final LiveWsMessage LIZ() {
        if (this.LIZ > 0) {
            if (this.LIZLLL > 0) {
                if (this.LJ > 0) {
                    if (this.LJFF != null) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            for (Map.Entry entry : ((HashMap) this.LIZIZ).entrySet()) {
                                LiveWsMessage.MsgHeader msgHeader = new LiveWsMessage.MsgHeader();
                                msgHeader.key = (String) entry.getKey();
                                msgHeader.value = (String) entry.getValue();
                                arrayList.add(msgHeader);
                            }
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        return new LiveWsMessage(this.LIZ, this.LJIIIIZZ, this.LIZJ, this.LIZLLL, this.LJ, arrayList, this.LJII, this.LJI, this.LJFF, this.LJIIIZ);
                    }
                    throw new IllegalArgumentException("illegal payload");
                }
                throw new IllegalArgumentException("illegal method");
            }
            throw new IllegalArgumentException("illegal service");
        }
        throw new IllegalArgumentException("illegal channelId");
    }

    public QO7(int i) {
        this.LIZ = i;
    }
}
