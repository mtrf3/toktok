package X;

import com.bytedance.android.livesdk.survey.model.SurveySubmitContent;
import com.bytedance.android.livesdk.survey.model.SurveySubmitRequest;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UlU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78132UlU {
    public long LIZ;
    public String LIZIZ;
    public final List<SurveySubmitContent> LIZJ = new ArrayList();

    public final SurveySubmitRequest LIZ() {
        return new SurveySubmitRequest(this.LIZ, this.LIZIZ, GsonProtectorUtils.toJson(C09650Zl.LIZIZ, this.LIZJ));
    }
}
