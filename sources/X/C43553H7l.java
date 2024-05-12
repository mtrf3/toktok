package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43553H7l implements InterfaceC41390GMg {
    @Override // X.InterfaceC41390GMg
    public final void LIZIZ(CreativeModel creativeModel, C43659HBn c43659HBn) {
    }

    @Override // X.InterfaceC41390GMg
    public final void LIZJ(CreativeModel creativeModel) {
    }

    @Override // X.InterfaceC41390GMg
    public final void LIZ(CreativeModel creativeModel) {
        o.LJIIIZ(creativeModel, "creativeModel");
    }

    @Override // X.InterfaceC41390GMg
    public final void LIZLLL(CreativeModel creativeModel) {
        creativeModel.editEffectModel = new EditEffectModel(null, null, 0, false, false, false, null, 127, null);
        creativeModel.nleInfoModel = new NLEInfoModel(null, 0, 3, null);
        creativeModel.autoCutModel = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
    }
}
