package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Gsd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42903Gsd extends AbstractC42966Gte {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_record";
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), LJ());
        o.LJIIIIZZ(json, "get().getService(GsonPro…Json(loadFeedbackInfos())");
        return json;
    }
}
