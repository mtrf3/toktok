package X;

import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Osf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63289Osf implements InterfaceC63353Oth<Boolean> {
    public final /* synthetic */ C63622Oy2 LJLIL;
    public final /* synthetic */ GetCmdMessageRespBody LJLILLLLZI;
    public final /* synthetic */ C63288Ose LJLJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Boolean bool) {
        Boolean bool2 = bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetCmdMsgByUserHandler handleResponse onCallback, seqId:");
        LIZ.append(this.LJLIL.LJLIL);
        LIZ.append(", result:");
        LIZ.append(bool2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (bool2.booleanValue() && this.LJLILLLLZI.has_more.booleanValue()) {
            C63288Ose c63288Ose = this.LJLJI;
            c63288Ose.LJIILL(this.LJLILLLLZI.next_cmd_index.longValue(), c63288Ose.LJ);
        } else {
            int i = this.LJLJI.LIZJ;
            ((CopyOnWriteArraySet) C63269OsL.LJ).remove(Integer.valueOf(i));
            C63337OtR.LJII(this.LJLIL, true).LIZ();
        }
    }

    public C63289Osf(C63288Ose c63288Ose, C63622Oy2 c63622Oy2, GetCmdMessageRespBody getCmdMessageRespBody) {
        this.LJLJI = c63288Ose;
        this.LJLIL = c63622Oy2;
        this.LJLILLLLZI = getCmdMessageRespBody;
    }
}
