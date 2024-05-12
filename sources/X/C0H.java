package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveModeWidget;

/* loaded from: classes6.dex */
public final class C0H extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ PreviewLiveModeWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H(PreviewLiveModeWidget previewLiveModeWidget, String str, String str2) {
        super(0);
        this.LJLIL = previewLiveModeWidget;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        Boolean bool;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_type_show");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        if (this.LJLIL.LJLJJLL) {
            str = "click";
        } else {
            str = "show";
        }
        LIZ.LJIJJ(str, "action_type");
        C29180Bcm c29180Bcm = this.LJLIL.LJLJJL;
        if (c29180Bcm != null) {
            bool = Boolean.valueOf(c29180Bcm.LJLILLLLZI);
        } else {
            bool = null;
        }
        V10.LJ(bool, LIZ, "screen_share_permission");
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            LIZ.LJIJJ(this.LJLILLLLZI, "convert_from");
        }
        LIZ.LJIJ(this.LJLJI);
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
