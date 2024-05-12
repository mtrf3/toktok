package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesFragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import kotlin.jvm.internal.AqS169S0100000_3;

/* renamed from: X.8aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213958aV extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ LocationServicesFragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C213958aV(LocationServicesFragment locationServicesFragment, int i) {
        super(0);
        this.LJLIL = locationServicesFragment;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        LocationServicesVM wl = this.LJLIL.wl();
        Context context = this.LJLIL.getContext();
        Integer valueOf = Integer.valueOf(this.LJLILLLLZI);
        wl.getClass();
        C34G.LIZJ("system_location_setting_off_result", "click_gps_never", valueOf, new AqS169S0100000_3(context, 956));
        wl.gv0();
        return C76800UCe.LIZ;
    }
}
