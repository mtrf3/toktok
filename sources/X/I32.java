package X;

import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.ICommerceToolsMissionService;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I32 implements WSJ {
    public final /* synthetic */ I31 LIZ;
    public final /* synthetic */ C45850Hz4 LIZIZ;

    public I32(I31 i31, C45850Hz4 c45850Hz4) {
        this.LIZ = i31;
        this.LIZIZ = c45850Hz4;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        Effect LIZJ;
        I0N value;
        InterfaceC46236ICq Sc0;
        I3Q.LIZ(I3P.MV_TAB);
        ((InterfaceC45999I3n) this.LIZ.LJLILLLLZI.LJ(InterfaceC45999I3n.class, null)).Qt0(false);
        RecordMVViewModel recordMVViewModel = this.LIZ.LJLJJI;
        if (recordMVViewModel != null) {
            if (recordMVViewModel.Mv0().cameraComponentModel.curBackgroundVideo != null && (value = this.LIZIZ.LJ().getValue()) != null && (Sc0 = value.Sc0()) != null) {
                Sc0.LJI();
            }
            I0N value2 = this.LIZIZ.LJ().getValue();
            if (value2 != null && (LIZJ = C82398WVm.LIZJ(value2)) != null) {
                this.LIZ.LJLIL = LIZJ;
            }
            I0N value3 = this.LIZIZ.LJ().getValue();
            if (value3 != null) {
                C82398WVm.LJII(value3, null, null);
            }
            this.LIZIZ.LIZ();
            ICommerceToolsMissionService LJIIJ = CommerceToolsMissionService.LJIIJ();
            ActivityC45651qj LIZ = this.LIZIZ.LIZ();
            RecordMVViewModel recordMVViewModel2 = this.LIZ.LJLJJI;
            if (recordMVViewModel2 != null) {
                LJIIJ.LIZLLL(LIZ, recordMVViewModel2.Mv0());
                return false;
            }
            o.LJIJI("mvViewModel");
            throw null;
        }
        o.LJIJI("mvViewModel");
        throw null;
    }

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        I0N value;
        I0N value2;
        InterfaceC46236ICq Sc0;
        RecordMVViewModel recordMVViewModel = this.LIZ.LJLJJI;
        if (recordMVViewModel != null) {
            if (recordMVViewModel.Mv0().cameraComponentModel.curBackgroundVideo != null && (value2 = this.LIZIZ.LJ().getValue()) != null && (Sc0 = value2.Sc0()) != null) {
                Sc0.LIZIZ();
            }
            if (this.LIZ.LJLIL != null && i34.LIZIZ && !o.LJ(i34.LJ, "record_mode_live") && (value = this.LIZIZ.LJ().getValue()) != null) {
                C82398WVm.LJII(value, this.LIZ.LJLIL, EnumC44267HYx.RECOVER);
            }
            I37 i37 = this.LIZIZ.LIZ;
            if (i37 != null) {
                i37.U5();
                return false;
            }
            return false;
        }
        o.LJIJI("mvViewModel");
        throw null;
    }
}
