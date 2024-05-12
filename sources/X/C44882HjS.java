package X;

import java.io.Serializable;

/* renamed from: X.HjS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44882HjS extends F9E implements Serializable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public static /* synthetic */ C44882HjS copy$default(C44882HjS c44882HjS, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44882HjS.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c44882HjS.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str3 = c44882HjS.LJLJI;
        }
        if ((i & 8) != 0) {
            str4 = c44882HjS.LJLJJI;
        }
        return c44882HjS.copy(str, str2, str3, str4);
    }

    public final C44882HjS copy(String str, String str2, String str3, String str4) {
        return new C44882HjS(str, str2, str3, str4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public final String getContent() {
        return this.LJLILLLLZI;
    }

    public final String getDataType() {
        return this.LJLJI;
    }

    public final String getId() {
        return this.LJLIL;
    }

    public final String getVersion() {
        return this.LJLJJI;
    }

    public C44882HjS(String str, String str2, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }
}
