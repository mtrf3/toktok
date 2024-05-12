package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.roaming.UserCurrentRegionCell;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LbT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54579LbT implements InterfaceC54674Ld0 {
    public final /* synthetic */ UserCurrentRegionCell LIZ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        LocationRegion locationRegion;
        String str;
        LJ9 item = this.LIZ.getItem();
        if (item != null) {
            UserCurrentRegionCell userCurrentRegionCell = this.LIZ;
            TuxIconView tuxIconView = userCurrentRegionCell.LJLIL;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_map_pin_fill);
                TuxIconView tuxIconView2 = userCurrentRegionCell.LJLIL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTintColor(C04330Ez.LIZIZ(tuxIconView2.getContext(), R.color.pz));
                    TuxTextView tuxTextView = userCurrentRegionCell.LJLILLLLZI;
                    if (tuxTextView != null) {
                        LocationRegion locationRegion2 = item.LJLIL;
                        if ((locationRegion2 == null || (str = locationRegion2.getName()) == null) && ((locationRegion = item.LJLIL) == null || (str = locationRegion.getParentName()) == null)) {
                            str = "";
                        }
                        tuxTextView.setText(str);
                    } else {
                        o.LJIJI("tvRegionName");
                        throw null;
                    }
                } else {
                    o.LJIJI("ivRegionIcon");
                    throw null;
                }
            } else {
                o.LJIJI("ivRegionIcon");
                throw null;
            }
        }
        TokenCert with = TokenCert.Companion.with("bpea-nearby_roaming_current_region_try_location");
        with.auth("svfi");
        C51733KSb.LIZ("poi", "nearby_change_region", with, null, null, 48);
    }

    public C54579LbT(UserCurrentRegionCell userCurrentRegionCell) {
        this.LIZ = userCurrentRegionCell;
    }
}
