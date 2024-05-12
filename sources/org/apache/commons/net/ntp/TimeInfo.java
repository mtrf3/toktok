package org.apache.commons.net.ntp;

import java.util.List;

/* loaded from: classes11.dex */
public class TimeInfo {
    public List<String> _comments;
    public Long _delay;
    public boolean _detailsComputed;
    public final NtpV3Packet _message;
    public Long _offset;
    public final long _returnTime;

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void computeDetails() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ntp.TimeInfo.computeDetails():void");
    }

    public int hashCode() {
        return this._message.hashCode() + (((int) this._returnTime) * 31);
    }

    public NtpV3Packet getMessage() {
        return this._message;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInfo timeInfo = (TimeInfo) obj;
        if (this._returnTime == timeInfo._returnTime && this._message.equals(timeInfo._message)) {
            return true;
        }
        return false;
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, boolean z) {
        this(ntpV3Packet, j, null, z);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, List<String> list, boolean z) {
        if (ntpV3Packet != null) {
            this._returnTime = j;
            this._message = ntpV3Packet;
            this._comments = list;
            if (z) {
                computeDetails();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("message cannot be null");
    }
}
