package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.List;

/* renamed from: X.OAk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61466OAk {
    public static java.util.Map<String, UpdatePackage> LIZIZ;
    public static java.util.Map<String, UpdatePackage> LIZJ;
    public C61276O3c LIZ;

    public final void LIZ(String str, java.util.Map<String, List<CheckRequestBodyModel.TargetChannel>> map, OptionCheckUpdateParams optionCheckUpdateParams) {
        GlobalConfigSettings LJFF = EBC.LIZ.LJFF();
        if (LJFF != null && LJFF.getReqMeta() != null && LJFF.getReqMeta().getLazy() != null) {
            this.LIZ.LIZ().execute(new C61517OCj(this, hashCode(), optionCheckUpdateParams, map, str));
        }
    }
}
