package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicMixStreamAudioParams {

    @InterfaceC65349Pkn("aacProfile")
    public String aacProfile;

    @InterfaceC65349Pkn("bitRate")
    public int bitRate;

    @InterfaceC65349Pkn("channels")
    public int channels;

    @InterfaceC65349Pkn("sampleRate")
    public int sampleRate;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkMicMixStreamAudioParams() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r3 = r1
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamAudioParams.<init>():void");
    }

    public LinkMicMixStreamAudioParams(int i, int i2, int i3, String aacProfile) {
        o.LJIIIZ(aacProfile, "aacProfile");
        this.bitRate = i;
        this.sampleRate = i2;
        this.channels = i3;
        this.aacProfile = aacProfile;
    }

    public /* synthetic */ LinkMicMixStreamAudioParams(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3, (i4 & 8) != 0 ? "" : str);
    }
}
