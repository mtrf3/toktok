package X;

import com.bytedance.geckox.model.CleanPolicyModel;
import com.bytedance.geckox.sync.model.SyncMsgModel;

/* renamed from: X.ODb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61535ODb implements InterfaceC61581OEv {
    @Override // X.InterfaceC61581OEv
    public final void LIZ(SyncMsgModel syncMsgModel) {
        if (syncMsgModel.getData() == null || syncMsgModel.getData().getCleanInfo() == null || syncMsgModel.getData().getCleanInfo().isEmpty()) {
            return;
        }
        C61555ODv c61555ODv = C61573OEn.LIZ;
        int syncTaskId = syncMsgModel.getSyncTaskId();
        int msgType = syncMsgModel.getMsgType();
        long timestamp = syncMsgModel.getTimestamp();
        java.util.Map<String, CleanPolicyModel> cleanInfo = syncMsgModel.getData().getCleanInfo();
        if (c61555ODv.LIZ(syncTaskId, msgType, timestamp)) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "sync clean channel msg start");
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        C61461OAf.LIZ(4, cleanInfo, c61532OCy.LJ.getRootDirectory(), null);
    }
}
