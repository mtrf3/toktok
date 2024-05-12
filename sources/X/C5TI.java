package X;

import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5TI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TI {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel publishEditModel) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        return publishEditModel.hasOriginalSound(HRX.LIZLLL());
    }

    public static boolean LIZIZ(C5XM c5xm, VideoPublishEditModel publishEditModel) {
        o.LJIIIZ(publishEditModel, "publishEditModel");
        if (c5xm != null) {
            return c5xm.F10();
        }
        MicDataModel micDataModel = publishEditModel.creativeModel.micDataModel;
        if ((micDataModel.editDefaultVolume == 0.0f && !micDataModel.editVolumeChangeMark) || publishEditModel.isCurrentAutoCutMode() || !C44384HbQ.LJLJJI(publishEditModel) || publishEditModel.voiceVolume <= 0.0f) {
            return false;
        }
        return true;
    }
}
