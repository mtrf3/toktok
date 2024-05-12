package X;

import com.bytedance.im.core.proto.GetCmdMessageRespBody;

/* renamed from: X.Osg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63290Osg implements InterfaceC63352Otg<Boolean> {
    public final /* synthetic */ GetCmdMessageRespBody LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ C63288Ose LJLJI;

    @Override // X.InterfaceC63352Otg
    public final Boolean LIZIZ() {
        try {
            this.LJLJI.LJIILIIL(this.LJLILLLLZI.LJIIIIZZ(), this.LJLIL.messages);
            return Boolean.valueOf(this.LJLJI.LJIILLIIL(this.LJLIL));
        } catch (Exception e) {
            C63322OtC.LJ("GetCmdMsgByUserHandler handleResponse handleCommands error", e);
            C63337OtR.LJFF(e);
            C63272OsO.LJIIL(5, e);
            C63291Osh LIZ = C63291Osh.LIZ();
            int i = this.LJLJI.LIZJ;
            LIZ.getClass();
            String LJIIIIZZ = C63291Osh.LJIIIIZZ(i, "error_cmd_index");
            boolean z = true;
            int i2 = C63291Osh.LIZLLL.getInt(LJIIIIZZ) + 1;
            if (i2 <= 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SPUtils shouldIgnoreCmdIndexError, key:");
                LIZ2.append(LJIIIIZZ);
                LIZ2.append(", errorCount:");
                LIZ2.append(i2);
                LIZ2.append(", return forbid");
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                C63291Osh.LIZLLL.putInt(LJIIIIZZ, i2);
                z = false;
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("SPUtils shouldIgnoreCmdIndexError, key:");
                LIZ3.append(LJIIIIZZ);
                LIZ3.append(", errorCount:");
                LIZ3.append(i2);
                LIZ3.append(", return ignore");
                C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
                C63291Osh.LIZLLL.putInt(LJIIIIZZ, 0);
            }
            if (z) {
                return Boolean.valueOf(this.LJLJI.LJIILLIIL(this.LJLIL));
            }
            C63322OtC.LIZLLL("GetCmdMsgByUserHandler handleResponse forbid update cursor");
            return Boolean.FALSE;
        }
    }

    public C63290Osg(C63288Ose c63288Ose, C63622Oy2 c63622Oy2, GetCmdMessageRespBody getCmdMessageRespBody) {
        this.LJLJI = c63288Ose;
        this.LJLIL = getCmdMessageRespBody;
        this.LJLILLLLZI = c63622Oy2;
    }
}
