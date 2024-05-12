package com.byted.cast.common.source;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.byted.cast.common.bean.DeviceInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public class ServiceInfo implements Parcelable {
    public static final Parcelable.Creator<ServiceInfo> CREATOR = new Parcelable.Creator<ServiceInfo>() { // from class: com.byted.cast.common.source.ServiceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServiceInfo createFromParcel(Parcel parcel) {
            return new ServiceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServiceInfo[] newArray(int i) {
            return new ServiceInfo[i];
        }
    };
    public boolean bdlinkEnabled;
    public Map browseLeLinkExtras;
    public boolean bytelinkEnabled;
    public String castId;
    public String connectID;
    public String data;
    public int detectFailCount;
    public String deviceID;
    public Map<String, String> deviceParams;
    public int features;
    public int firewall;
    public int fps;
    public int height;
    public String ip;
    public boolean isSupportDetect;
    public boolean isSupportPing;
    public boolean isSupportPlayList;
    public final ServiceInfoOrigin mOriginFrom;
    public String mPrivateChannel;
    public String manufacture;
    public String name;
    public int port;
    public int portMirror;
    public String protocols;
    public String rtc_appId;
    public String rtc_roomId;
    public String rtc_token;
    public String rtc_userId;
    public String serviceIdentifierUDN;
    public String types;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ServiceInfo deepCopy() {
        ServiceInfo serviceInfo = new ServiceInfo();
        Map<String, String> map = this.deviceParams;
        if (map != null) {
            serviceInfo.deviceParams.putAll(map);
        }
        serviceInfo.browseLeLinkExtras = this.browseLeLinkExtras;
        serviceInfo.connectID = this.connectID;
        serviceInfo.name = this.name;
        serviceInfo.ip = this.ip;
        serviceInfo.serviceIdentifierUDN = this.serviceIdentifierUDN;
        serviceInfo.manufacture = this.manufacture;
        serviceInfo.port = this.port;
        serviceInfo.data = this.data;
        serviceInfo.bdlinkEnabled = this.bdlinkEnabled;
        serviceInfo.portMirror = this.portMirror;
        serviceInfo.width = this.width;
        serviceInfo.height = this.height;
        serviceInfo.fps = this.fps;
        serviceInfo.features = this.features;
        serviceInfo.deviceID = this.deviceID;
        serviceInfo.bytelinkEnabled = this.bytelinkEnabled;
        serviceInfo.types = this.types;
        serviceInfo.protocols = this.protocols;
        serviceInfo.isSupportPlayList = this.isSupportPlayList;
        serviceInfo.castId = this.castId;
        serviceInfo.isSupportPing = this.isSupportPing;
        serviceInfo.isSupportDetect = this.isSupportDetect;
        return serviceInfo;
    }

    public ServiceInfo() {
        this.deviceParams = new HashMap();
        this.connectID = "";
        this.data = "";
        this.bdlinkEnabled = true;
        this.bytelinkEnabled = true;
        this.firewall = 0;
        this.protocols = "";
        this.isSupportPlayList = false;
        this.mOriginFrom = new ServiceInfoOrigin();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ServiceInfo{name='");
        LIZ.append(this.name);
        LIZ.append('\'');
        LIZ.append(",serviceIdentifierUDN=");
        LIZ.append(this.serviceIdentifierUDN);
        LIZ.append('\'');
        LIZ.append(", ip='");
        LIZ.append("xxx.xxx.xxx.xxx");
        LIZ.append('\'');
        LIZ.append(", port=");
        LIZ.append(this.port);
        LIZ.append(", bdlinkEnabled=");
        LIZ.append(this.bdlinkEnabled);
        LIZ.append(", deviceParams=");
        LIZ.append(this.deviceParams);
        LIZ.append(", portMirror=");
        LIZ.append(this.portMirror);
        LIZ.append(", bytelinkEnabled=");
        LIZ.append(this.bytelinkEnabled);
        LIZ.append(", types='");
        LIZ.append(this.types);
        LIZ.append('\'');
        LIZ.append(", protocols='");
        LIZ.append(this.protocols);
        LIZ.append('\'');
        LIZ.append(", data='");
        LIZ.append(this.data);
        LIZ.append('\'');
        LIZ.append(", connectID='");
        LIZ.append(this.connectID);
        LIZ.append('\'');
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", fps=");
        LIZ.append(this.fps);
        LIZ.append(", deviceID=");
        LIZ.append(this.deviceID);
        LIZ.append(", features=");
        LIZ.append(this.features);
        LIZ.append(", firewall=");
        LIZ.append(this.firewall);
        LIZ.append(", manufacture=");
        LIZ.append(this.manufacture);
        LIZ.append(", isSupportPlayList=");
        LIZ.append(this.isSupportPlayList);
        LIZ.append(", castId=");
        LIZ.append(this.castId);
        LIZ.append(", rtc_appId=");
        LIZ.append(this.rtc_appId);
        LIZ.append(", rtc_token=");
        LIZ.append(this.rtc_token);
        LIZ.append(", rtc_roomId=");
        LIZ.append(this.rtc_roomId);
        LIZ.append(", rtc_userId=");
        LIZ.append(this.rtc_userId);
        LIZ.append(", isSupportDetect='");
        LIZ.append(this.isSupportDetect);
        LIZ.append('\'');
        LIZ.append(", detectFailCount='");
        LIZ.append(this.detectFailCount);
        LIZ.append('\'');
        LIZ.append(", originFrom='");
        LIZ.append(this.mOriginFrom);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public int getDetectFailCount() {
        return this.detectFailCount;
    }

    public ServiceInfoOrigin getOriginFrom() {
        return this.mOriginFrom;
    }

    public String getPrivateChannel() {
        return this.mPrivateChannel;
    }

    public boolean isSupportDetect() {
        return this.isSupportDetect;
    }

    public boolean isSupportPing() {
        return this.isSupportPing;
    }

    public ServiceInfo(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.deviceParams = new HashMap();
        this.connectID = "";
        this.data = "";
        this.bdlinkEnabled = true;
        this.bytelinkEnabled = true;
        this.firewall = 0;
        this.protocols = "";
        this.isSupportPlayList = false;
        this.mOriginFrom = new ServiceInfoOrigin();
        this.connectID = parcel.readString();
        this.serviceIdentifierUDN = parcel.readString();
        this.name = parcel.readString();
        this.ip = parcel.readString();
        this.manufacture = parcel.readString();
        this.port = parcel.readInt();
        this.data = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.bdlinkEnabled = z;
        this.portMirror = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.fps = parcel.readInt();
        this.features = parcel.readInt();
        this.deviceID = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.bytelinkEnabled = z2;
        this.firewall = parcel.readInt();
        this.types = parcel.readString();
        this.protocols = parcel.readString();
        this.rtc_appId = parcel.readString();
        this.rtc_token = parcel.readString();
        this.rtc_roomId = parcel.readString();
        this.rtc_userId = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSupportPlayList = z3;
        this.castId = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isSupportDetect = z4;
        this.isSupportPing = parcel.readByte() != 0;
        this.detectFailCount = parcel.readInt();
        this.mPrivateChannel = parcel.readString();
    }

    public void append(ServiceInfo serviceInfo) {
        this.name = serviceInfo.name;
        this.ip = serviceInfo.ip;
        this.connectID = serviceInfo.connectID;
        int i = serviceInfo.port;
        if (i != -1) {
            this.port = i;
        }
        int i2 = serviceInfo.portMirror;
        if (i2 != -1) {
            this.portMirror = i2;
        }
        this.types = serviceInfo.types;
        this.protocols = serviceInfo.protocols;
        this.data = serviceInfo.data;
        if (TextUtils.equals(serviceInfo.types, "ByteLink")) {
            this.width = serviceInfo.width;
            this.height = serviceInfo.height;
            this.fps = serviceInfo.fps;
            this.firewall = serviceInfo.firewall;
            this.features = serviceInfo.features;
            this.deviceID = serviceInfo.deviceID;
        }
        if (TextUtils.equals(serviceInfo.types, "ChromeCast")) {
            this.connectID = serviceInfo.connectID;
        }
        if (TextUtils.equals(serviceInfo.types, "BDDLNA")) {
            this.manufacture = serviceInfo.manufacture;
        }
        this.isSupportPlayList = serviceInfo.isSupportPlayList;
        this.castId = serviceInfo.castId;
    }

    public void appendBdlinkDeviceInfo(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        setSupportDetect(true);
        setSupportPing(deviceInfo.supportPing());
        if (TextUtils.isEmpty(this.protocols)) {
            this.protocols = "BDLink,";
        } else if (!this.protocols.contains("BDLink")) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BDLink,");
            LIZ.append(this.protocols);
            this.protocols = X1D.LIZIZ(LIZ);
        }
        this.data = deviceInfo.data;
        if (!TextUtils.isEmpty(deviceInfo.version)) {
            this.deviceParams.put("com.ss.cast:sink-bdlink", deviceInfo.version);
        }
        this.deviceParams.put("source_bdlink_has_device_info", String.valueOf(true));
    }

    public void setDetectFailCount(int i) {
        this.detectFailCount = i;
    }

    public void setPrivateChannel(String str) {
        this.mPrivateChannel = str;
    }

    public void setSupportDetect(boolean z) {
        this.isSupportDetect = z;
    }

    public void setSupportPing(boolean z) {
        this.isSupportPing = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.connectID);
        parcel.writeString(this.serviceIdentifierUDN);
        parcel.writeString(this.name);
        parcel.writeString(this.ip);
        parcel.writeString(this.manufacture);
        parcel.writeInt(this.port);
        parcel.writeString(this.data);
        parcel.writeByte(this.bdlinkEnabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.portMirror);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.features);
        parcel.writeString(this.deviceID);
        parcel.writeByte(this.bytelinkEnabled ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.firewall);
        parcel.writeString(this.types);
        parcel.writeString(this.protocols);
        parcel.writeString(this.rtc_appId);
        parcel.writeString(this.rtc_token);
        parcel.writeString(this.rtc_roomId);
        parcel.writeString(this.rtc_userId);
        parcel.writeByte(this.isSupportPlayList ? (byte) 1 : (byte) 0);
        parcel.writeString(this.castId);
        parcel.writeByte(this.isSupportDetect ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportPing ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.detectFailCount);
        parcel.writeString(this.mPrivateChannel);
    }

    public ServiceInfo(String str, String str2, int i, int i2, String str3, String str4) {
        this.deviceParams = new HashMap();
        this.connectID = "";
        this.data = "";
        this.bdlinkEnabled = true;
        this.bytelinkEnabled = true;
        this.firewall = 0;
        this.protocols = "";
        this.isSupportPlayList = false;
        this.mOriginFrom = new ServiceInfoOrigin();
        this.name = str;
        this.ip = str2;
        this.port = i;
        this.portMirror = i2;
        this.types = str3;
        this.protocols = str4;
    }

    public ServiceInfo(String str, String str2, int i, String str3, int i2, int i3, int i4, int i5) {
        this(str, str2, i, str3, i2, i3, i4, i5, 0);
    }

    public ServiceInfo(String str, String str2, int i, String str3, int i2, int i3, int i4, int i5, int i6) {
        this.deviceParams = new HashMap();
        this.connectID = "";
        this.data = "";
        this.bdlinkEnabled = true;
        this.bytelinkEnabled = true;
        this.firewall = 0;
        this.protocols = "";
        this.isSupportPlayList = false;
        this.mOriginFrom = new ServiceInfoOrigin();
        this.name = str;
        this.ip = str2;
        this.port = i;
        this.data = str3;
        this.portMirror = i2;
        this.width = i3;
        this.height = i4;
        this.fps = i5;
        this.firewall = i6;
    }

    public ServiceInfo(String str, String str2, int i, String str3, int i2, int i3, int i4, int i5, int i6, String str4) {
        this.deviceParams = new HashMap();
        this.connectID = "";
        this.data = "";
        this.bdlinkEnabled = true;
        this.bytelinkEnabled = true;
        this.firewall = 0;
        this.protocols = "";
        this.isSupportPlayList = false;
        this.mOriginFrom = new ServiceInfoOrigin();
        this.name = str;
        this.ip = str2;
        this.port = i;
        this.data = str3;
        this.portMirror = i2;
        this.width = i3;
        this.height = i4;
        this.fps = i5;
        this.deviceID = str4;
        this.firewall = i6;
    }
}
