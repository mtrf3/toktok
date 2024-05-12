package com.ss.android.ugc.aweme;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveScenario extends F9E {

    @InterfaceC65349Pkn("enable_live_screenshot")
    public boolean enableLiveScreenshot;

    @InterfaceC65349Pkn("enable_live_studio")
    public boolean enableLiveStudio;

    @InterfaceC65349Pkn("enable_live_third_party")
    public boolean enableLiveThirdParty;

    @InterfaceC65349Pkn("enable_live_video")
    public boolean enableLiveVideo;

    @InterfaceC65349Pkn("enable_live_voice")
    public boolean enableLiveVoice;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveScenario() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.LiveScenario.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableLiveVideo), Boolean.valueOf(this.enableLiveThirdParty), Boolean.valueOf(this.enableLiveScreenshot), Boolean.valueOf(this.enableLiveStudio), Boolean.valueOf(this.enableLiveVoice)};
    }

    public LiveScenario(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enableLiveVideo = z;
        this.enableLiveThirdParty = z2;
        this.enableLiveScreenshot = z3;
        this.enableLiveStudio = z4;
        this.enableLiveVoice = z5;
    }

    public /* synthetic */ LiveScenario(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5);
    }
}
