package X;

import Y.AfS1S0200100_5;
import android.os.SystemClock;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.impl.revenue.starcomment.api.StarCommentApi;
import com.bytedance.android.livesdk.impl.revenue.starcomment.datacenter.StarCommentViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZS implements C0K7 {
    public final /* synthetic */ CZR LJLIL;
    public final /* synthetic */ CVK LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    public CZS(CZR czr, CVK cvk, Room room, C34K c34k) {
        this.LJLIL = czr;
        this.LJLILLLLZI = cvk;
        this.LJLJI = room;
        this.LJLJJI = c34k;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        StarCommentViewModel starCommentViewModel = this.LJLIL.LJLJI;
        if (starCommentViewModel != null) {
            String str = this.LJLILLLLZI.LIZ.LJLIL;
            o.LJIIIZ(str, "<set-?>");
            starCommentViewModel.LJLJLJ = str;
        }
        StarCommentApi starCommentApi = (StarCommentApi) Q7L.LIZIZ(StarCommentApi.class);
        String str2 = this.LJLILLLLZI.LIZ.LJLIL;
        String idStr = this.LJLJI.getIdStr();
        o.LJIIIIZZ(idStr, "room.idStr");
        CZR czr = this.LJLIL;
        AbstractC73672Svk LJII = C1EW.LIZ(starCommentApi.deleteStarComment(str2, idStr, czr.LJLJLJ, czr.LJLJL, czr.LJLLLLLL, this.LJLJJI.element)).LJII(BTJ.LIZIZ(this.LJLIL.LJLIL));
        CZR czr2 = this.LJLIL;
        CVK cvk = this.LJLILLLLZI;
        LJII.LJJJLIIL(new AfS1S0200100_5(elapsedRealtime, czr2, cvk, 10), new AfS1S0200100_5(elapsedRealtime, czr2, cvk, 11));
        liveDialog.dismiss();
    }
}
