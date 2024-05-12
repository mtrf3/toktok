package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveMatchAudienceIdentifyOptSettingsData {

    @InterfaceC65349Pkn("enable_armies_fallback")
    public boolean enable_armies_fallback;

    @InterfaceC65349Pkn("enable_block_match_open_msg")
    public boolean enable_block_match_open_msg;

    @InterfaceC65349Pkn("enable_open_message_cache")
    public boolean enable_open_message_cache;

    @InterfaceC65349Pkn("enable_sei_fallback")
    public boolean enable_sei_fallback;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveMatchAudienceIdentifyOptSettingsData() {
        /*
            r7 = this;
            r1 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceIdentifyOptSettingsData.<init>():void");
    }

    public LiveMatchAudienceIdentifyOptSettingsData(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enable_open_message_cache = z;
        this.enable_sei_fallback = z2;
        this.enable_armies_fallback = z3;
        this.enable_block_match_open_msg = z4;
    }

    public /* synthetic */ LiveMatchAudienceIdentifyOptSettingsData(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
