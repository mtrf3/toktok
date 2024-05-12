package X;

import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bck, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29178Bck implements C0K7 {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C29178Bck(int i, Context context, DataChannel dataChannel, String str) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = i;
        this.LJLJI = context;
        this.LJLJJI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        C29156BcO.LIZ(this.LJLIL, "verify");
        if (this.LJLILLLLZI == 4003101) {
            ((IHostUser) CN1.LIZ(IHostUser.class)).bindMobile(C29306Beo.LIZIZ(this.LJLJI), null, null, null, new C29179Bcl(this.LJLIL));
        } else {
            ((IHostUser) CN1.LIZ(IHostUser.class)).popCaptchaV2(C29306Beo.LIZIZ(this.LJLJI), this.LJLJJI, new C29177Bcj(this.LJLIL));
        }
    }
}
