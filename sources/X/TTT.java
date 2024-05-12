package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes14.dex */
public final class TTT extends AbstractC31497CXt<InterfaceC31336CRo> implements TQG {
    public final TTZ LJLIL;
    public final TQV LJLILLLLZI;

    @Override // X.TQG
    public final TQF LJJIII(long j, boolean z) {
        return null;
    }

    @Override // X.TQG
    public final void LIZLLL() {
        long j;
        Room room;
        TTZ ttz = this.LJLIL;
        if (ttz != null && (room = ttz.LIZ) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        BizJoinChannelParams bizJoinChannelParams = new BizJoinChannelParams(j);
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null) {
            R6.LJLL(new TTS(bizJoinChannelParams));
        }
    }

    @Override // X.TQG
    public final C74690TTa LIZJ(long j) {
        int LIZIZ = TRK.LIZIZ(j);
        if (C78857UxB.LJJJ(LIZIZ)) {
            C74690TTa c74690TTa = new C74690TTa(this, null);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("provideApplyDialogUICtrlCmd(audio only): ");
            LIZ.append(c74690TTa);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ));
            return c74690TTa;
        }
        if (C78857UxB.LJJJI(LIZIZ)) {
            C74690TTa c74690TTa2 = new C74690TTa(this, null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("provideApplyDialogUICtrlCmd(video): ");
            LIZ2.append(c74690TTa2);
            TYQ.LIZIZ("qiuyihao", X1D.LIZIZ(LIZ2));
            return c74690TTa2;
        }
        TYQ.LIZIZ("qiuyihao", "link type unknown");
        return null;
    }

    @Override // X.AbstractC31497CXt, X.BY9
    public final void attachView(InterfaceC2301691o interfaceC2301691o) {
        super.attachView((TTT) interfaceC2301691o);
    }

    @Override // X.AbstractC31497CXt
    public final void attachView(InterfaceC31336CRo interfaceC31336CRo) {
        super.attachView((TTT) interfaceC31336CRo);
    }

    public TTT(TTZ ttz, TQV tqv) {
        this.LJLIL = ttz;
        this.LJLILLLLZI = tqv;
    }

    @Override // X.InterfaceC31831CeR
    public final void LIZIZ(int i, String str) {
        TQV tqv = this.LJLILLLLZI;
        if (tqv != null) {
            tqv.exitInteractInNormalWay(str, false, i);
        }
        C75159Ted.LIZ.getClass();
        C75159Ted.LJIIIIZZ = false;
    }
}
