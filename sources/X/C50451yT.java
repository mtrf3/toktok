package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.1yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50451yT extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50451yT(int i, long j, String str) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_sticker_panel_download");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(this.LJLIL, "tab");
        LIZ.LJIJJ(Long.valueOf(this.LJLILLLLZI), "use_time");
        LIZ.LJIJJ(Integer.valueOf(this.LJLJI), "download_status");
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_anchor");
        LIZ.LJIJI(true);
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
