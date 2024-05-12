package X;

import java.io.Serializable;

/* renamed from: X.HjR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44881HjR extends F9E implements Serializable {
    public String LJLIL;
    public final String LJLILLLLZI;

    public static /* synthetic */ C44881HjR copy$default(C44881HjR c44881HjR, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44881HjR.LJLILLLLZI;
        }
        return c44881HjR.copy(str);
    }

    public final C44881HjR copy(String str) {
        return new C44881HjR(str);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLILLLLZI};
    }

    public final String getId() {
        return this.LJLILLLLZI;
    }

    public final String getTag() {
        return this.LJLIL;
    }

    public C44881HjR(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setTag(String str) {
        this.LJLIL = str;
    }
}
