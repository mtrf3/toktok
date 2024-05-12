package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.GfQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42084GfQ extends AbstractC65781Prl implements InterfaceC88473Ynt<Boolean, Boolean, String, C76800UCe> {
    public final /* synthetic */ C67996QmO LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ C42085GfR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42084GfQ(C67996QmO c67996QmO, VideoPublishEditModel videoPublishEditModel, C42085GfR c42085GfR) {
        super(3);
        this.LJLIL = c67996QmO;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = c42085GfR;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(Boolean bool, Boolean bool2, String str) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        String str2 = str;
        C67996QmO c67996QmO = this.LJLIL;
        StringBuilder LIZLLL = C00F.LIZLLL("restore finished,resolved:", booleanValue, ",dataChanged:", booleanValue2, ",nleData is valid:");
        LIZLLL.append(C78685UuP.LJJJZ(str2));
        c67996QmO.LIZIZ(new C43393H1h("QuickForwardResRestoreTask", X1D.LIZIZ(LIZLLL)), EnumC43531H6p.OUTER);
        if (!booleanValue) {
            this.LJLIL.LIZLLL(-1, new IllegalStateException("restore res failed"));
        } else {
            if (booleanValue2 && C78685UuP.LJJJZ(str2)) {
                this.LJLILLLLZI.nleData = str2;
                XKX.LIZLLL((InterfaceC70422pa) this.LJLJI.LJFF.getValue(), null, null, new C163036aZ(this.LJLILLLLZI, str2, this.LJLIL, null), 3);
            }
            this.LJLIL.LJ(C76800UCe.LIZ, false);
        }
        return C76800UCe.LIZ;
    }
}
