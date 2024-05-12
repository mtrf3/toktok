package X;

import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.commerce.tools.mission.service.CommerceToolsMissionService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I33 implements WSJ {
    public final /* synthetic */ C45850Hz4 LIZ;
    public final /* synthetic */ I36 LIZIZ;

    public I33(C45850Hz4 c45850Hz4, I36 i36) {
        this.LIZ = c45850Hz4;
        this.LIZIZ = i36;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        InterfaceC46236ICq Sc0;
        InterfaceC46236ICq Sc02;
        Effect LIZJ;
        I3Q.LIZ(I3P.LIVE);
        I37 i37 = this.LIZ.LIZ;
        if (i37 != null) {
            i37.X2("live");
        }
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ((ViewModelProvider) this.LIZIZ.LJLILLLLZI.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        ((InterfaceC45999I3n) this.LIZIZ.LJLILLLLZI.LJ(InterfaceC45999I3n.class, null)).Qt0(false);
        if (shortVideoContextViewModel.LJLIL.cameraComponentModel.mDurings.isEmpty()) {
            I0N value = this.LIZ.LJ().getValue();
            if (value != null && (LIZJ = C82398WVm.LIZJ(value)) != null) {
                this.LIZIZ.LJLIL = LIZJ;
            }
            this.LIZ.LIZIZ().s9(0);
            I0N value2 = this.LIZ.LJ().getValue();
            if (value2 != null) {
                C82398WVm.LJII(value2, null, null);
            }
            shortVideoContextViewModel.LJLIL.mToLive = true;
            I37 i372 = this.LIZ.LIZ;
            if (i372 != null) {
                i372.N2(false);
            }
        }
        CommerceToolsMissionService.LJIIJ().LIZIZ(this.LIZ.LIZ(), this.LIZ.LIZLLL());
        this.LIZ.LIZIZ().e8().getMediaController().M8(null);
        if (shortVideoContextViewModel.LJLIL.cameraComponentModel.curBackgroundVideo != null) {
            I0N value3 = this.LIZ.LJ().getValue();
            if (value3 != null && (Sc02 = value3.Sc0()) != null) {
                Sc02.LJI();
            }
            I0N value4 = this.LIZ.LJ().getValue();
            if (value4 != null && (Sc0 = value4.Sc0()) != null) {
                Sc0.LJ();
            }
        }
        return false;
    }

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        I0N value;
        ((ShortVideoContextViewModel) ((ViewModelProvider) this.LIZIZ.LJLILLLLZI.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class)).LJLIL.mToLive = false;
        View findViewById = this.LIZ.LIZ().findViewById(R.id.fmm);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        if (this.LIZIZ.LJLIL != null && i34.LIZIZ && !o.LJ(i34.LJ, "record_mode_mv") && (value = this.LIZ.LJ().getValue()) != null) {
            C82398WVm.LJII(value, this.LIZIZ.LJLIL, EnumC44267HYx.RECOVER);
        }
        I37 i37 = this.LIZ.LIZ;
        if (i37 != null) {
            i37.U5();
        }
        return false;
    }
}
