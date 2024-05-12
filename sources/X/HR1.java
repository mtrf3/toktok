package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HR1 implements HPB {
    public static final HR1 LIZ = new HR1();

    @Override // X.HPB
    public final boolean LIZ(Context context, Bundle bundle) {
        boolean z;
        boolean z2;
        ExteriorRecordModel exteriorRecordModel;
        HB8 hb8;
        o.LJIIIZ(context, "context");
        if (bundle != null && bundle.containsKey("exterior_record_model") && (exteriorRecordModel = (ExteriorRecordModel) bundle.getParcelable("exterior_record_model")) != null && (hb8 = exteriorRecordModel.recordPageType) != null && hb8.getType() == HR3.PHOTO_SEARCH.getType()) {
            if (C44172HVg.LJJI.LJ().LIZIZ(context) == 0) {
                return true;
            }
        } else {
            if (C44172HVg.LJJI.LJ().LIZIZ(context) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (C44172HVg.LJJI.LJ().LIZ(context) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }
}
