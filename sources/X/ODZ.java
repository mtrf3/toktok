package X;

import Y.ARunnableS13S0201000_10;
import android.text.TextUtils;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.sync.model.SyncDownloadChanelModel;
import com.bytedance.geckox.sync.model.SyncMsgModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class ODZ implements InterfaceC61581OEv {
    @Override // X.InterfaceC61581OEv
    public final void LIZ(SyncMsgModel syncMsgModel) {
        java.util.Map<String, List<SyncDownloadChanelModel>> downloadInfo;
        if (syncMsgModel.getData() == null || (downloadInfo = syncMsgModel.getData().getDownloadInfo()) == null || downloadInfo.isEmpty()) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "sync download CDN channel msg", downloadInfo);
        ArrayList arrayList = new ArrayList();
        for (String str : downloadInfo.keySet()) {
            for (SyncDownloadChanelModel syncDownloadChanelModel : downloadInfo.get(str)) {
                UpdatePackage updatePackage = new UpdatePackage(syncDownloadChanelModel.getVersion(), syncDownloadChanelModel.getChannel(), null, null);
                updatePackage.setPackageType(syncDownloadChanelModel.getPackageType());
                updatePackage.setAccessKey(str);
                SyncDownloadChanelModel.SyncChannelUrlModel url = syncDownloadChanelModel.getUrl();
                List<String> domains = url.getDomains();
                if (!TextUtils.isEmpty(url.getScheme()) && !TextUtils.isEmpty(url.getUri()) && domains != null && !domains.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : domains) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(url.getScheme());
                        LIZ.append("://");
                        LIZ.append(str2);
                        LIZ.append(url.getUri());
                        arrayList2.add(X1D.LIZIZ(LIZ));
                    }
                    UpdatePackage.Package r4 = new UpdatePackage.Package(syncDownloadChanelModel.getId(), arrayList2, syncDownloadChanelModel.getMd5());
                    r4.setLength(syncDownloadChanelModel.getSize());
                    updatePackage.setFullPackage(r4);
                    arrayList.add(updatePackage);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C61555ODv c61555ODv = C61573OEn.LIZ;
        int syncTaskId = syncMsgModel.getSyncTaskId();
        if (c61555ODv.LIZ(syncTaskId, syncMsgModel.getMsgType(), syncMsgModel.getTimestamp())) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "sync download CDN channel start");
        OAR.LIZ.LIZ().execute(new ARunnableS13S0201000_10(syncTaskId, arrayList, c61555ODv, 9));
    }
}
