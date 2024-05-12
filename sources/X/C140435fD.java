package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5fD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140435fD {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(VideoPublishEditModel model) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        o.LJIIIZ(model, "model");
        if (!C140445fE.LIZ() || model.getOriginal() != 1) {
            return false;
        }
        if (model.isChangeMultiEditData() && (!C145805ns.LIZ() || !C140445fE.LIZ())) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = model.multiEditVideoRecordData;
        if ((multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.isMultiEditRetake) || model.getTimeEffect() != null) {
            return false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = model.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData2 != null && (arrayList = multiEditVideoStatusRecordData2.originalSegments) != null) {
            Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
            while (it.hasNext()) {
                String createId = it.next().getCreateId();
                if (createId == null || createId.length() == 0) {
                    return false;
                }
            }
        }
        if (model.isStitchMode() || C00F.LIZ(31744, 0, "studio_allow_users_to_add_more_clips_when_editing", true) <= 0) {
            return false;
        }
        int i = model.mShootedShootMode;
        if (i != 18 && i != 11 && i != 14 && (i != 10 || C00F.LIZ(31744, 0, "studio_allow_users_to_add_more_clips_when_editing", true) != 1)) {
            return false;
        }
        return true;
    }
}
