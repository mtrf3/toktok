package X;

import com.bytedance.librarian.Librarian;

/* loaded from: classes15.dex */
public final class VSV extends C74232TBk implements InterfaceC88472Yns<String, C76800UCe> {
    public static final VSV LJLIL = new VSV();

    public VSV() {
        super(1);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "loadLibrary";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(Librarian.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "loadLibrary(Ljava/lang/String;)V";
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        Librarian.LJ(str);
        return C76800UCe.LIZ;
    }
}
