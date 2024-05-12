package X;

import android.view.View;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS35S0001000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.QgR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67627QgR extends AbstractViewOnClickListenerC67619QgJ {
    @Override // X.AEW
    /* renamed from: LJIIJJI */
    public final AEL LJIIIIZZ() {
        return new AEL(LJIILIIL(R.string.cfg, new Object[0]), 1, LJIILIIL(R.string.qxa, new Object[0]), null, this, null, LJIILIIL(R.string.qxh, new Object[0]), true, 7896);
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILL() {
        LJIIJ(new C67626QgQ(this, R.string.qxa));
        LJIIZILJ("DRAFT");
        LJIIJ(new AqS35S0001000_11(AVExternalServiceImpl.LIZ().draftService().queryDraftsInfo(new GPK(false, true, null, 5)).LIZ, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67627QgR(BasePage basePage) {
        super(basePage);
        o.LJIIIZ(basePage, "basePage");
    }

    @Override // X.AbstractViewOnClickListenerC67619QgJ
    public final void LJIILLIIL(View v) {
        o.LJIIIZ(v, "v");
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        LIZ.asyncService("CleanDraft", new C56499MFj(this, LIZ, C01R.LIZ("is_disk_manage_mode", true)));
    }
}
