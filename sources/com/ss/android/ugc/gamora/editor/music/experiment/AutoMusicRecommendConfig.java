package com.ss.android.ugc.gamora.editor.music.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AutoMusicRecommendConfig extends F9E {

    @InterfaceC65349Pkn("aed_check_business_type")
    public final String aedCheckBusinessType;

    @InterfaceC65349Pkn("aed_check_thresh")
    public final double aedCheckThresh;

    @InterfaceC65349Pkn("origin_record_enabled")
    public final boolean originRecordEnabled;

    @InterfaceC65349Pkn("origin_upload_enabled")
    public final boolean originUploadEnabled;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoMusicRecommendConfig() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 15
            r0 = r8
            r5 = r4
            r7 = r1
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.music.experiment.AutoMusicRecommendConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.aedCheckBusinessType, Double.valueOf(this.aedCheckThresh), Boolean.valueOf(this.originRecordEnabled), Boolean.valueOf(this.originUploadEnabled)};
    }

    public AutoMusicRecommendConfig(String aedCheckBusinessType, double d, boolean z, boolean z2) {
        o.LJIIIZ(aedCheckBusinessType, "aedCheckBusinessType");
        this.aedCheckBusinessType = aedCheckBusinessType;
        this.aedCheckThresh = d;
        this.originRecordEnabled = z;
        this.originUploadEnabled = z2;
    }

    public /* synthetic */ AutoMusicRecommendConfig(String str, double d, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 1.0d : d, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
