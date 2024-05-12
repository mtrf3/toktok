package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QWV implements InterfaceC67148QWy {
    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        Object LIZ;
        o.LJIIIZ(msg, "msg");
        try {
            byte[] LIZ2 = msg.LIZ();
            o.LJIIIIZZ(LIZ2, "msg.payload");
            JSONObject jSONObject = new JSONObject(new String(LIZ2, PVC.LIZ));
            boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "success");
            if (JSONObjectProtectorUtils.getString(jSONObject, "item_id") != null && z) {
                C2U8.LIZ(new IK0());
            }
            ReplaceMusicServiceImpl.LIZ().showWindow(jSONObject, z);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C36922EeM.LJFF(m10exceptionOrNullimpl);
        }
    }

    @QD3
    public final void onReceivedMsgEvent(C67139QWp event) {
        o.LJIIIZ(event, "event");
        try {
            QWW qww = event.LJLIL;
            int i = qww.LJ;
            if ((i == 20216 || i == 20173) && qww.LIZLLL == 1) {
                byte[] bArr = event.LJLIL.LIZIZ;
                o.LJIIIIZZ(bArr, "event.event.payload");
                JSONObject jSONObject = new JSONObject(new String(bArr, PVC.LIZ));
                boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject, "success");
                if (JSONObjectProtectorUtils.getString(jSONObject, "item_id") != null && z) {
                    C2U8.LIZ(new IK0());
                }
                ReplaceMusicServiceImpl.LIZ().showWindow(jSONObject, z);
            }
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
    }
}
