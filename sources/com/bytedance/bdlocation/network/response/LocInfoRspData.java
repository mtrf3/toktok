package com.bytedance.bdlocation.network.response;

import X.InterfaceC65349Pkn;
import com.bytedance.bdlocation.network.model.LocationResult;

/* loaded from: classes15.dex */
public class LocInfoRspData {

    @InterfaceC65349Pkn("is_indoor")
    public int isIndoor;

    @InterfaceC65349Pkn("is_locate")
    public boolean isLocate;

    @InterfaceC65349Pkn("is_network_upload")
    public long isNetworkUpload;

    @InterfaceC65349Pkn("Location")
    public LocationResult location;

    @InterfaceC65349Pkn("network_upload_interval")
    public long networkUploadInterval;

    @InterfaceC65349Pkn("next_polling_upload_interval")
    public long nextPollingUploadInterval;

    public LocInfoRspData(LocInfoRspData locInfoRspData) {
        this.nextPollingUploadInterval = locInfoRspData.nextPollingUploadInterval;
        this.networkUploadInterval = locInfoRspData.networkUploadInterval;
        this.isNetworkUpload = locInfoRspData.isNetworkUpload;
    }
}
