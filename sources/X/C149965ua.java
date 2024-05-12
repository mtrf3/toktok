package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149965ua {
    public static final java.util.Map<Integer, Integer> LIZ = C113554cx.LJJL(new OSZ(1, Integer.valueOf(R.string.e2r)), new OSZ(-1, Integer.valueOf(R.string.zh)));

    public static C150145us LIZ(VideoPublishEditModel publishEditModel, AudioRecorderParam audioRecorderParam) {
        boolean z;
        o.LJIIIZ(publishEditModel, "publishEditModel");
        boolean z2 = false;
        boolean z3 = true;
        if (C44384HbQ.LJJII(publishEditModel) && publishEditModel.mOrigin == 2) {
            if (publishEditModel.getTimeEffect() != null) {
                z2 = true;
            }
            return new C150145us(true, z2, 6);
        }
        if (C44384HbQ.LJIILIIL(publishEditModel) || (C44384HbQ.LJJII(publishEditModel) && H7R.LJJJJL(publishEditModel))) {
            AudioRecorderParam audioRecorderParam2 = publishEditModel.veAudioRecorderParam;
            if (audioRecorderParam2 != null && audioRecorderParam2.hasRecord()) {
                if (publishEditModel.getTimeEffect() != null) {
                    z2 = true;
                }
                return new C150145us(true, z2, 6);
            }
            if (audioRecorderParam != null && (!audioRecorderParam.getMStack().isEmpty())) {
                if (publishEditModel.getTimeEffect() != null) {
                    z2 = true;
                }
                return new C150145us(true, z2, 6);
            }
            Integer num = LIZ.get(1);
            if (publishEditModel.getTimeEffect() != null) {
                z = true;
            } else {
                z = false;
            }
            return new C150145us(1, num, false, z);
        }
        if (C44384HbQ.LJJII(publishEditModel)) {
            if (publishEditModel.getTimeEffect() != null) {
                z2 = true;
            }
            return new C150145us(true, z2, 6);
        }
        Integer num2 = LIZ.get(-1);
        if (publishEditModel.getTimeEffect() == null) {
            z3 = false;
        }
        return new C150145us(-1, num2, false, z3);
    }
}
