package org.apache.commons.net.ntp;

import X.X1D;
import java.net.DatagramPacket;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class NtpV3Impl implements NtpV3Packet {
    public final byte[] buf = new byte[48];
    public volatile DatagramPacket dp;

    public static final int ui(byte b) {
        return b & 255;
    }

    public static final long ul(byte b) {
        return b & 255;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public synchronized DatagramPacket getDatagramPacket() {
        if (this.dp == null) {
            byte[] bArr = this.buf;
            this.dp = new DatagramPacket(bArr, bArr.length);
            this.dp.setPort(123);
        }
        return this.dp;
    }

    public int getRootDelay() {
        return getInt(4);
    }

    private String idAsString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            char c = (char) this.buf[i + 12];
            if (c == 0) {
                break;
            }
            sb.append(c);
            i++;
        } while (i <= 3);
        return sb.toString();
    }

    public int getMode() {
        return (ui(this.buf[0]) >> 0) & 7;
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getOriginateTimeStamp() {
        return getTimestamp(24);
    }

    public int getPoll() {
        return this.buf[2];
    }

    public int getPrecision() {
        return this.buf[3];
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getReceiveTimeStamp() {
        return getTimestamp(32);
    }

    public int getReferenceId() {
        return getInt(12);
    }

    public int getRootDispersion() {
        return getInt(8);
    }

    public int getStratum() {
        return ui(this.buf[1]);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getTransmitTimeStamp() {
        return getTimestamp(40);
    }

    public int getVersion() {
        return (ui(this.buf[0]) >> 3) & 7;
    }

    public int hashCode() {
        return Arrays.hashCode(this.buf);
    }

    private String idAsHex() {
        return Integer.toHexString(getReferenceId());
    }

    private String idAsIPAddress() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(ui(this.buf[12]));
        LIZ.append(".");
        LIZ.append(ui(this.buf[13]));
        LIZ.append(".");
        LIZ.append(ui(this.buf[14]));
        LIZ.append(".");
        LIZ.append(ui(this.buf[15]));
        return X1D.LIZIZ(LIZ);
    }

    public String getReferenceIdString() {
        int version = getVersion();
        int stratum = getStratum();
        if (version == 3 || version == 4) {
            if (stratum == 0 || stratum == 1) {
                return idAsString();
            }
            if (version == 4) {
                return idAsHex();
            }
        }
        if (stratum >= 2) {
            return idAsIPAddress();
        }
        return idAsHex();
    }

    public double getRootDispersionInMillisDouble() {
        return getRootDispersion() / 65.536d;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[version:");
        LIZ.append(getVersion());
        LIZ.append(", mode:");
        LIZ.append(getMode());
        LIZ.append(", poll:");
        LIZ.append(getPoll());
        LIZ.append(", precision:");
        LIZ.append(getPrecision());
        LIZ.append(", delay:");
        LIZ.append(getRootDelay());
        LIZ.append(", dispersion(ms):");
        LIZ.append(getRootDispersionInMillisDouble());
        LIZ.append(", id:");
        LIZ.append(getReferenceIdString());
        LIZ.append(", xmitTime:");
        LIZ.append(getTransmitTimeStamp().toDateString());
        LIZ.append(" ]");
        return X1D.LIZIZ(LIZ);
    }

    private int getInt(int i) {
        return ui(this.buf[i + 3]) | (ui(this.buf[i]) << 24) | (ui(this.buf[i + 1]) << 16) | (ui(this.buf[i + 2]) << 8);
    }

    private long getLong(int i) {
        return (ul(this.buf[i]) << 56) | (ul(this.buf[i + 1]) << 48) | (ul(this.buf[i + 2]) << 40) | (ul(this.buf[i + 3]) << 32) | (ul(this.buf[i + 4]) << 24) | (ul(this.buf[i + 5]) << 16) | (ul(this.buf[i + 6]) << 8) | ul(this.buf[i + 7]);
    }

    private TimeStamp getTimestamp(int i) {
        return new TimeStamp(getLong(i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.buf, ((NtpV3Impl) obj).buf);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setMode(int i) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) ((i & 7) | (bArr[0] & 248));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setTransmitTime(TimeStamp timeStamp) {
        setTimestamp(40, timeStamp);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setVersion(int i) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i & 7) << 3) | (bArr[0] & 199));
    }

    private void setTimestamp(int i, TimeStamp timeStamp) {
        long ntpValue;
        if (timeStamp == null) {
            ntpValue = 0;
        } else {
            ntpValue = timeStamp.ntpValue();
        }
        int i2 = 7;
        do {
            this.buf[i + i2] = (byte) (255 & ntpValue);
            ntpValue >>>= 8;
            i2--;
        } while (i2 >= 0);
    }
}
