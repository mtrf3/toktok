package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public final class TTSRecordStatus {

    @InterfaceC65349Pkn("required_count")
    public final Integer requiredCount;

    @InterfaceC65349Pkn("skipped_count")
    public final Integer skippedCount;

    @InterfaceC65349Pkn("succeed_count")
    public final Integer succeedCount;

    @InterfaceC65349Pkn("total_count")
    public final Integer totalCount;

    public TTSRecordStatus(Integer num, Integer num2, Integer num3, Integer num4) {
        this.requiredCount = num;
        this.succeedCount = num2;
        this.totalCount = num3;
        this.skippedCount = num4;
    }
}
