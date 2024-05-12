package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordStickerSegmentInfoKt {
    public static final boolean isUseVoiceRecognizeSticker(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        RecordStickerSegmentInfo recordStickerSegmentInfo = (RecordStickerSegmentInfo) timeSpeedModelExtension.getFromRecordExtras("extra_key_record_sticker_info");
        if (recordStickerSegmentInfo == null || !recordStickerSegmentInfo.isUseVoiceRecognizeSticker()) {
            return false;
        }
        return true;
    }

    public static final Bundle asBundle(RecordStickerSegmentInfo recordStickerSegmentInfo, Bundle bundle) {
        o.LJIIIZ(recordStickerSegmentInfo, "<this>");
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("extra_key_record_sticker_info", recordStickerSegmentInfo);
        return bundle;
    }

    public static /* synthetic */ Bundle asBundle$default(RecordStickerSegmentInfo recordStickerSegmentInfo, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        return asBundle(recordStickerSegmentInfo, bundle);
    }
}
