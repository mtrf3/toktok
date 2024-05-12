package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public abstract class XCZ implements InterfaceC13850gX {
    public String LIZ = "";
    public boolean LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public final String LJ;
    public final XCN LJFF;

    public abstract void LIZ();

    public abstract void LIZJ();

    public void LIZLLL() {
    }

    public void LJ() {
    }

    @Override // X.InterfaceC13850gX
    public void cancel() {
        this.LIZIZ = true;
        LJFF(new AqS165S0100000_15(this, 703));
    }

    @Override // X.InterfaceC13850gX
    public int getLevel() {
        return 0;
    }

    @Override // X.InterfaceC13850gX
    public void pause() {
        this.LIZIZ = true;
        LJFF(new AqS165S0100000_15(this, 704));
    }

    @Override // X.InterfaceC13850gX
    public final void run() {
        XDR xdr;
        this.LIZLLL = true;
        String str = this.LJ;
        XDR xdr2 = null;
        if (str != null) {
            XCN xcn = this.LJFF;
            if (xcn != null) {
                xdr = xcn.LIZ(str);
            } else {
                xdr = null;
            }
            if (xdr instanceof InterfaceC84446XCg) {
                ((InterfaceC84446XCg) xdr).onStart();
            }
        }
        if (this.LIZIZ) {
            return;
        }
        LIZ();
        String str2 = this.LJ;
        if (str2 != null) {
            XCN xcn2 = this.LJFF;
            if (xcn2 != null) {
                xdr2 = xcn2.LIZ(str2);
            }
            if (xdr2 instanceof InterfaceC84446XCg) {
                ((InterfaceC84446XCg) xdr2).onFinally();
            }
        }
        this.LIZLLL = false;
    }

    public final String LIZIZ() {
        if (C107244Iu.LIZIZ(this.LIZ)) {
            return String.valueOf(C65352Pkq.LIZ(getClass()).LJFF());
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC13850gX
    public final String getId() {
        String str = this.LJ;
        if (str != null) {
            return str;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.InterfaceC13850gX
    public long getModifyTime() {
        return this.LIZJ;
    }

    public static final void LJFF(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C15180ig.LIZ(new ARunnableS51S0100000_15(interfaceC65784Pro, 64));
    }

    @Override // X.InterfaceC13850gX
    public void setModifyTime(long j) {
        this.LIZJ = j;
    }

    public XCZ(String str, XCN xcn) {
        this.LJ = str;
        this.LJFF = xcn;
    }
}
