package X;

import com.ss.android.ugc.aweme.app.api.RequestLog;

/* loaded from: classes12.dex */
public class QDX<T> implements K4J, InterfaceC65316PkG, InterfaceC66634QDe {
    public InterfaceC66631QDb<T> LJLIL;
    public String LJLILLLLZI = "";
    public C64668PZo LJLJI;
    public C49932Jii LJLJJI;

    @Override // X.InterfaceC66634QDe
    public void LIZ() {
    }

    @Override // X.K4J
    public final /* synthetic */ RequestLog getRequestLog() {
        return T28.LIZ(this);
    }

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.LJLILLLLZI;
    }

    @Override // X.K4J
    public final C64668PZo getRequestInfo() {
        return this.LJLJI;
    }

    public QDX(InterfaceC66631QDb<T> interfaceC66631QDb) {
        this.LJLIL = interfaceC66631QDb;
    }

    public final void LIZIZ(InterfaceC66632QDc<T> interfaceC66632QDc) {
        this.LJLIL.LIZ(interfaceC66632QDc);
        this.LJLIL = null;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.K4J
    public void setRequestInfo(C64668PZo c64668PZo) {
        this.LJLJI = c64668PZo;
    }
}
