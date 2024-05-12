package X;

import android.content.Context;
import com.ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import kotlin.jvm.internal.o;

/* renamed from: X.X5c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84260X5c implements InterfaceC79393VDx {
    public final /* synthetic */ IDownloadSdkMonitorDepend LIZ;

    @Override // X.InterfaceC79393VDx
    public final String getAid() {
        String aid = this.LIZ.getAid();
        if (aid == null) {
            return "";
        }
        return aid;
    }

    @Override // X.InterfaceC79393VDx
    public final String getAppVersionName() {
        String appVersionName = this.LIZ.getAppVersionName();
        if (appVersionName == null) {
            return "";
        }
        return appVersionName;
    }

    @Override // X.InterfaceC79393VDx
    public final String getChannel() {
        String channel = this.LIZ.getChannel();
        if (channel == null) {
            return "";
        }
        return channel;
    }

    @Override // X.InterfaceC79393VDx
    public final Context getContext() {
        Context context = this.LIZ.getContext();
        o.LJI(context);
        return context;
    }

    @Override // X.InterfaceC79393VDx
    public final String getDeviceId() {
        String deviceId = this.LIZ.getDeviceId();
        if (deviceId == null) {
            return "";
        }
        return deviceId;
    }

    @Override // X.InterfaceC79393VDx
    public final String[] getMonitorHosts() {
        return this.LIZ.getMonitorHosts();
    }

    @Override // X.InterfaceC79393VDx
    public final String getPackageName() {
        String packageName = this.LIZ.getPackageName();
        o.LJI(packageName);
        return packageName;
    }

    @Override // X.InterfaceC79393VDx
    public final long getUpdateVersionCode() {
        return this.LIZ.getUpdateVersionCode();
    }

    public C84260X5c(C79043V0l c79043V0l) {
        this.LIZ = c79043V0l;
    }
}
