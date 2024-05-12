package com.byted.cast.dnssd;

import X.C63832P3k;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes29.dex */
public class BonjourService implements Parcelable {
    public static final Parcelable.Creator<BonjourService> CREATOR = new Parcelable.Creator<BonjourService>() { // from class: com.byted.cast.dnssd.BonjourService.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BonjourService createFromParcel(Parcel parcel) {
            return new BonjourService(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BonjourService[] newArray(int i) {
            return new BonjourService[i];
        }
    };
    public final Map<String, String> dnsRecords;
    public final String domain;
    public final int flags;
    public final String hostname;
    public final int ifIndex;
    public final List<InetAddress> inetAddresses;
    public final int port;
    public final String regType;
    public final String serviceName;

    /* loaded from: classes29.dex */
    public static class Builder {
        public Map<String, String> dnsRecords;
        public final String domain;
        public final int flags;
        public String hostname;
        public final int ifIndex;
        public List<InetAddress> inetAddresses;
        public int port;
        public final String regType;
        public final String serviceName;

        public BonjourService build() {
            return new BonjourService(this);
        }

        public Builder(BonjourService bonjourService) {
            this.inetAddresses = new ArrayList();
            this.dnsRecords = new HashMap();
            this.flags = bonjourService.flags;
            this.serviceName = bonjourService.serviceName;
            this.regType = bonjourService.regType;
            this.domain = bonjourService.domain;
            this.ifIndex = bonjourService.ifIndex;
            this.dnsRecords = new HashMap(bonjourService.dnsRecords);
            this.inetAddresses = new ArrayList(bonjourService.inetAddresses);
            this.hostname = bonjourService.hostname;
            this.port = bonjourService.port;
        }

        public Builder dnsRecords(Map<String, String> map) {
            this.dnsRecords = map;
            return this;
        }

        public Builder hostname(String str) {
            this.hostname = str;
            return this;
        }

        public Builder inet4Address(Inet4Address inet4Address) {
            this.inetAddresses.add(inet4Address);
            return this;
        }

        public Builder inet6Address(Inet6Address inet6Address) {
            this.inetAddresses.add(inet6Address);
            return this;
        }

        public void inetAddress(InetAddress inetAddress) {
            this.inetAddresses.add(inetAddress);
        }

        public Builder port(int i) {
            this.port = i;
            return this;
        }

        public Builder(int i, int i2, String str, String str2, String str3) {
            this.inetAddresses = new ArrayList();
            this.dnsRecords = new HashMap();
            this.flags = i;
            this.serviceName = str;
            this.regType = str2;
            this.domain = str3;
            this.ifIndex = i2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Inet4Address getInet4Address() {
        for (InetAddress inetAddress : this.inetAddresses) {
            if (inetAddress instanceof Inet4Address) {
                return (Inet4Address) inetAddress;
            }
        }
        return null;
    }

    public Inet6Address getInet6Address() {
        for (InetAddress inetAddress : this.inetAddresses) {
            if (inetAddress instanceof Inet6Address) {
                return (Inet6Address) inetAddress;
            }
        }
        return null;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.serviceName;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.regType;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.domain;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + this.ifIndex;
    }

    public boolean isLost() {
        if ((this.flags & 256) == 256) {
            return true;
        }
        return false;
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.dnsRecords.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ((TextUtils.equals("overseasPlug", "overseas") || TextUtils.equals("overseas", "overseas")) && TextUtils.equals(C63832P3k.LIZ, key)) {
                value = "xxx.xxx.xxx.xxx";
            }
            hashMap.put(key, value);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BonjourService{flags=");
        LIZ.append(this.flags);
        LIZ.append(", domain='");
        LIZ.append(this.domain);
        LIZ.append('\'');
        LIZ.append(", regType='");
        LIZ.append(this.regType);
        LIZ.append('\'');
        LIZ.append(", serviceName='");
        LIZ.append(this.serviceName);
        LIZ.append('\'');
        LIZ.append(", dnsRecords=");
        LIZ.append(hashMap);
        LIZ.append(", ifIndex=");
        LIZ.append(this.ifIndex);
        LIZ.append(", hostname='");
        LIZ.append(this.hostname);
        LIZ.append('\'');
        LIZ.append(", port=");
        LIZ.append(this.port);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getDomain() {
        return this.domain;
    }

    public int getFlags() {
        return this.flags;
    }

    public String getHostname() {
        return this.hostname;
    }

    public int getIfIndex() {
        return this.ifIndex;
    }

    public List<InetAddress> getInetAddresses() {
        return this.inetAddresses;
    }

    public int getPort() {
        return this.port;
    }

    public String getRegType() {
        return this.regType;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public Map<String, String> getTxtRecords() {
        return this.dnsRecords;
    }

    public BonjourService(Parcel parcel) {
        this.flags = parcel.readInt();
        this.serviceName = parcel.readString();
        this.regType = parcel.readString();
        this.domain = parcel.readString();
        this.dnsRecords = readMap(parcel);
        this.inetAddresses = readAddresses(parcel);
        this.ifIndex = parcel.readInt();
        this.hostname = parcel.readString();
        this.port = parcel.readInt();
    }

    public static List<InetAddress> readAddresses(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readInt; i++) {
            arrayList.add(parcel.readSerializable());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Map<String, String> readMap(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (readString != null && readString2 != null) {
                hashMap.put(readString, readString2);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonjourService)) {
            return false;
        }
        BonjourService bonjourService = (BonjourService) obj;
        if (this.ifIndex != bonjourService.ifIndex) {
            return false;
        }
        String str = this.serviceName;
        if (str == null ? bonjourService.serviceName != null : !str.equals(bonjourService.serviceName)) {
            return false;
        }
        String str2 = this.regType;
        if (str2 == null ? bonjourService.regType != null : !str2.equals(bonjourService.regType)) {
            return false;
        }
        String str3 = this.domain;
        String str4 = bonjourService.domain;
        if (str3 != null) {
            if (str3.equals(str4)) {
                return true;
            }
        } else if (str4 == null) {
            return true;
        }
        return false;
    }

    public BonjourService(Builder builder) {
        this.flags = builder.flags;
        this.serviceName = builder.serviceName;
        this.regType = builder.regType;
        this.domain = builder.domain;
        this.ifIndex = builder.ifIndex;
        this.inetAddresses = Collections.unmodifiableList(builder.inetAddresses);
        this.dnsRecords = Collections.unmodifiableMap(builder.dnsRecords);
        this.hostname = builder.hostname;
        this.port = builder.port;
    }

    public static void writeAddresses(Parcel parcel, List<InetAddress> list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(list.size());
        Iterator<InetAddress> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable(it.next());
        }
    }

    public static void writeMap(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.flags);
        parcel.writeString(this.serviceName);
        parcel.writeString(this.regType);
        parcel.writeString(this.domain);
        writeMap(parcel, this.dnsRecords);
        writeAddresses(parcel, this.inetAddresses);
        parcel.writeInt(this.ifIndex);
        parcel.writeString(this.hostname);
        parcel.writeInt(this.port);
    }
}
