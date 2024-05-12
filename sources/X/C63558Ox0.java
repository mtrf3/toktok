package X;

import Y.ARunnableS29S0200000_10;
import android.os.SystemClock;
import com.bytedance.im.core.proto.CreateConversationV2ResponseBody;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Ox0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63558Ox0 implements InterfaceC63353Oth<C63120Opw> {
    public final /* synthetic */ C63622Oy2 LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;
    public final /* synthetic */ CreateConversationV2ResponseBody LJLJI;
    public final /* synthetic */ C63559Ox1 LJLJJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        this.LJLJJI.LIZJ.LJIIIZ = SystemClock.uptimeMillis();
        C63569OxB c63569OxB = this.LJLJJI.LIZJ;
        c63569OxB.LJIIIIZZ = c63569OxB.LJIIIZ - this.LJLJJI.LIZJ.LJI;
        C63569OxB c63569OxB2 = this.LJLJJI.LIZJ;
        c63569OxB2.LJIIJ = c63569OxB2.LJIIIZ - this.LJLJJI.LIZJ.LIZ;
        if (c63120Opw2 != null) {
            C115284fk.LJIILIIL().LJIILL(c63120Opw2);
            this.LJLJJI.LJ(c63120Opw2, this.LJLIL);
        } else {
            this.LJLJJI.LIZIZ(C63622Oy2.LIZJ(-3001));
        }
        this.LJLILLLLZI.run();
        C115064fO LJII = C63337OtR.LJII(this.LJLIL, true);
        LJII.LIZJ.put("conversation_id", this.LJLJI.conversation.conversation_id);
        LJII.LIZJ.put("conversation_type", this.LJLJI.conversation.conversation_type);
        LJII.LIZJ.put("total_count", this.LJLJI.conversation.participants_count);
        LJII.LIZ();
        C115064fO c115064fO = new C115064fO();
        c115064fO.LIZ = "cost";
        c115064fO.LIZIZ = "create_conversation";
        c115064fO.LIZJ.put("network_time", Long.valueOf(this.LJLJJI.LIZJ.LIZLLL));
        c115064fO.LIZJ.put("sub_ts_time", Long.valueOf(this.LJLJJI.LIZJ.LJ));
        c115064fO.LIZJ.put("on_run_time", Long.valueOf(this.LJLJJI.LIZJ.LJII));
        c115064fO.LIZJ.put("main_ts_time", Long.valueOf(this.LJLJJI.LIZJ.LJIIIIZZ));
        c115064fO.LIZJ.put("whole_time", Long.valueOf(this.LJLJJI.LIZJ.LJIIJ));
        c115064fO.LIZ();
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("imsdk_create_conversation");
        c63323OtD.LIZ(Long.valueOf(this.LJLJJI.LIZJ.LIZLLL), "network_time");
        c63323OtD.LIZ(Long.valueOf(this.LJLJJI.LIZJ.LJ), "sub_ts_time");
        c63323OtD.LIZ(Long.valueOf(this.LJLJJI.LIZJ.LJII), "on_run_time");
        c63323OtD.LIZ(Long.valueOf(this.LJLJJI.LIZJ.LJIIIIZZ), "main_ts_time");
        c63323OtD.LIZ(Long.valueOf(this.LJLJJI.LIZJ.LJIIJ), "whole_time");
        c63323OtD.LIZ(Integer.valueOf(this.LJLJJI.LIZJ.LJIIJJI), "conversation_type");
        c63323OtD.LIZ(CardStruct.IStatusCode.DEFAULT, "is_success");
        c63323OtD.LIZLLL();
        C116934iP c116934iP = this.LJLJJI.LIZLLL;
        if (c116934iP != null) {
            if (c63120Opw2 != null) {
                c116934iP.LIZLLL = SystemClock.elapsedRealtime();
                this.LJLJJI.LIZLLL.LIZ(true);
            } else {
                c116934iP.LIZLLL = SystemClock.elapsedRealtime();
                this.LJLJJI.LIZLLL.LIZ(false);
            }
        }
    }

    public C63558Ox0(C63559Ox1 c63559Ox1, C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10, CreateConversationV2ResponseBody createConversationV2ResponseBody) {
        this.LJLJJI = c63559Ox1;
        this.LJLIL = c63622Oy2;
        this.LJLILLLLZI = aRunnableS29S0200000_10;
        this.LJLJI = createConversationV2ResponseBody;
    }
}
