package X;

import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* loaded from: classes14.dex */
public final class TZ7 implements C0K7 {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C74842TYw LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    public TZ7(String str, C74842TYw c74842TYw, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Context context) {
        this.LJLIL = str;
        this.LJLILLLLZI = c74842TYw;
        this.LJLJI = str2;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = context;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        EnumC74991Tbv enumC74991Tbv;
        liveDialog.dismiss();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJJJJL(this.LJLIL);
        }
        C74983Tbn LIZ = C29556Biq.LIZ();
        String str = this.LJLIL;
        LIZ.getClass();
        int LJIIJ = C74983Tbn.LJIIJ(str);
        MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
        if (LJI != null) {
            enumC74991Tbv = C86793Y4n.LJJ(LJI);
        } else {
            enumC74991Tbv = null;
        }
        int LJFF = C74776TWi.LJFF(enumC74991Tbv);
        C74842TYw c74842TYw = this.LJLILLLLZI;
        String str2 = this.LJLIL;
        C74717TUb c74717TUb = new C74717TUb(c74842TYw, str2, LJFF, this.LJLJJI, this.LJLJJL);
        c74842TYw.getClass();
        InterfaceC75441TjB R62 = C8E.LJ().R6();
        if (R62 != null) {
            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
            bizChangeLayoutParams.displayId = LJFF;
            R62.LJJIIJZLJL(new C76606U4s(LJIIJ, str2, bizChangeLayoutParams), c74717TUb);
        }
        C74824TYe.LJJIII(C74838TYs.LJ().LJJ, this.LJLJI, "click", "confirm");
    }
}
