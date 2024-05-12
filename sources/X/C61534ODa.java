package X;

import com.bytedance.geckox.sync.model.SyncMsgModel;
import java.io.UnsupportedEncodingException;

/* renamed from: X.ODa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61534ODa implements InterfaceC67072QUa {
    public static final C61534ODa LJLIL = new C61534ODa();

    @Override // X.InterfaceC67072QUa
    public final void LIZ(C67074QUc c67074QUc) {
        InterfaceC61581OEv ody;
        if (c67074QUc != null && c67074QUc.LIZ != null) {
            try {
                SyncMsgModel syncMsgModel = (SyncMsgModel) OXZ.LIZIZ.LIZ.LJI(new String(c67074QUc.LIZ, "utf-8"), SyncMsgModel.class);
                int msgType = syncMsgModel.getMsgType();
                if (msgType != 1) {
                    if (msgType != 2) {
                        if (msgType == 3) {
                            ody = new ODZ();
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("unexpected sync message type:");
                            LIZ.append(syncMsgModel.getMsgType());
                            ody = new OFW((Object) X1D.LIZIZ(LIZ));
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("unexpected sync message type:");
                            LIZ2.append(syncMsgModel.getMsgType());
                            OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ2));
                        }
                    } else {
                        ody = new C61535ODb();
                    }
                } else {
                    ody = new ODY();
                }
                ody.LIZ(syncMsgModel);
            } catch (UnsupportedEncodingException e) {
                OC6.LIZ("gecko-debug-tag", "sync message encoding exception:", e);
            } catch (Exception e2) {
                OC6.LIZ("gecko-debug-tag", "sync message exception:", e2);
            }
        }
    }
}
