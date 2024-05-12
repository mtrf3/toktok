package X;

import com.ss.android.ugc.aweme.feed.model.CaptionModel;

/* loaded from: classes5.dex */
public /* synthetic */ class ACQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[CaptionModel.NoCaptionReasonEnum.values().length];
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_NOT_AUTHORIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CaptionModel.NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_NO_OP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
