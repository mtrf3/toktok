package com.ss.android.ugc.playerkit.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class BitrateSelectRecordConfig extends F9E {

    @InterfaceC65349Pkn("enable_bitrate_select_records")
    public final int enableRecord;

    @InterfaceC65349Pkn("bitrate_select_record_playlist_checking_len")
    public final int recordCheckLength;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BitrateSelectRecordConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.model.BitrateSelectRecordConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.recordCheckLength), Integer.valueOf(this.enableRecord)};
    }

    public BitrateSelectRecordConfig(int i, int i2) {
        this.recordCheckLength = i;
        this.enableRecord = i2;
    }

    public /* synthetic */ BitrateSelectRecordConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
