package com.byted.cast.common.discovery;

import X.C63832P3k;
import X.X1D;
import android.net.nsd.NsdServiceInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.byted.cast.common.config.Config;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public class NsdService implements Parcelable {
    public static final Parcelable.Creator<NsdService> CREATOR = new Parcelable.Creator<NsdService>() { // from class: com.byted.cast.common.discovery.NsdService.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NsdService createFromParcel(Parcel parcel) {
            return new NsdService(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NsdService[] newArray(int i) {
            return new NsdService[i];
        }
    };
    public final String domain;
    public int errorCode;
    public final InetAddress host;
    public final String hostIp;
    public String hostName;
    public Map<String, byte[]> mTxtRecord;
    public final String name;
    public final int port;
    public final String type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private String txtRecordToString() {
        Map<String, byte[]> map = this.mTxtRecord;
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        for (Map.Entry<String, byte[]> entry : this.mTxtRecord.entrySet()) {
            try {
                byte[] value = entry.getValue();
                if (value != null && value.length > 0) {
                    String key = entry.getKey();
                    String str = new String(value);
                    if ((TextUtils.equals("overseasPlug", "overseas") || TextUtils.equals("overseas", "overseas")) && TextUtils.equals(C63832P3k.LIZ, key)) {
                        str = "xxx.xxx.xxx.xxx";
                    }
                    stringBuffer.append(key);
                    stringBuffer.append(":");
                    stringBuffer.append(str);
                    stringBuffer.append(";");
                }
            } catch (Throwable unused) {
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public String getHostName() {
        String hostName;
        if (this.hostName == null) {
            InetAddress inetAddress = this.host;
            if (inetAddress == null) {
                hostName = "";
            } else {
                hostName = inetAddress.getHostName();
            }
            this.hostName = hostName;
        }
        return this.hostName;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.name;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.type;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.hostIp;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str4 = this.hostName;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return ((i7 + i4) * 31) + this.port;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("name='");
        LIZ.append(this.name);
        LIZ.append('\'');
        LIZ.append(", type='");
        LIZ.append(this.type);
        LIZ.append('\'');
        LIZ.append(", domain='");
        LIZ.append(this.domain);
        LIZ.append('\'');
        LIZ.append(", hostIp='");
        LIZ.append("xxx.xxx.xxx.xxx");
        LIZ.append('\'');
        LIZ.append(", hostName='");
        LIZ.append(this.hostName);
        LIZ.append('\'');
        LIZ.append(", port='");
        LIZ.append(this.port);
        LIZ.append('\'');
        LIZ.append(", errorCode='");
        LIZ.append(this.errorCode);
        LIZ.append('\'');
        LIZ.append(", mTxtRecord:");
        LIZ.append(txtRecordToString());
        return X1D.LIZIZ(LIZ);
    }

    public Map<String, byte[]> getAttributes() {
        return this.mTxtRecord;
    }

    public String getDomain() {
        return this.domain;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public InetAddress getHost() {
        return this.host;
    }

    public String getHostIp() {
        return this.hostIp;
    }

    public String getName() {
        return this.name;
    }

    public int getPort() {
        return this.port;
    }

    public String getType() {
        return this.type;
    }

    public NsdService(Parcel parcel) {
        this.name = parcel.readString();
        this.type = parcel.readString();
        this.domain = parcel.readString();
        this.hostIp = parcel.readString();
        this.hostName = parcel.readString();
        this.port = parcel.readInt();
        this.host = (InetAddress) parcel.readSerializable();
    }

    private Map<String, byte[]> convertTxtRecord(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().getBytes());
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NsdService nsdService = (NsdService) obj;
        if (this.port != nsdService.port) {
            return false;
        }
        String str = this.name;
        if (str == null ? nsdService.name != null : !str.equals(nsdService.name)) {
            return false;
        }
        String str2 = this.type;
        if (str2 == null ? nsdService.type != null : !str2.equals(nsdService.type)) {
            return false;
        }
        String str3 = this.hostIp;
        if (str3 == null ? nsdService.hostIp != null : !str3.equals(nsdService.hostIp)) {
            return false;
        }
        String str4 = this.hostName;
        String str5 = nsdService.hostName;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public NsdService(NsdServiceInfo nsdServiceInfo, Config config) {
        this.name = nsdServiceInfo.getServiceName();
        this.type = nsdServiceInfo.getServiceType();
        this.domain = null;
        if (nsdServiceInfo.getHost() != null) {
            if (config.getHostAddressAdapter() != null) {
                this.hostIp = config.getHostAddressAdapter().getHostAddress(nsdServiceInfo.getHost());
            } else {
                this.hostIp = nsdServiceInfo.getHost().getHostAddress();
            }
        } else {
            this.hostIp = null;
        }
        this.port = nsdServiceInfo.getPort();
        this.host = nsdServiceInfo.getHost();
        this.mTxtRecord = nsdServiceInfo.getAttributes();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeString(this.hostIp);
        parcel.writeString(this.hostName);
        parcel.writeInt(this.port);
        parcel.writeSerializable(this.host);
    }

    public NsdService(String str, String str2, String str3) {
        this(str, str2, str3, -1, null);
    }

    public NsdService(String str, String str2, String str3, int i, Map<String, String> map) {
        this.name = str;
        this.type = str2;
        this.domain = str3;
        this.port = i;
        this.mTxtRecord = convertTxtRecord(map);
        this.hostIp = null;
        this.hostName = null;
        this.host = null;
    }

    public NsdService(String str, String str2, String str3, String str4, int i, InetAddress inetAddress) {
        this.name = str;
        this.type = str2;
        this.hostIp = str3;
        this.hostName = str4;
        this.port = i;
        this.host = inetAddress;
    }

    public NsdService(String str, String str2, String str3, String str4, int i, InetAddress inetAddress, Map<String, String> map) {
        this.name = str;
        this.type = str2;
        this.domain = str3;
        this.hostIp = str4;
        this.port = i;
        this.host = inetAddress;
        this.mTxtRecord = convertTxtRecord(map);
    }

    public NsdService(String str, String str2, String str3, String str4, String str5, int i, InetAddress inetAddress, Map<String, byte[]> map) {
        this.name = str;
        this.type = str2.replace(".local.", "");
        this.domain = str3;
        this.hostIp = str4;
        this.hostName = str5;
        this.port = i;
        this.host = inetAddress;
        this.mTxtRecord = map;
    }
}
