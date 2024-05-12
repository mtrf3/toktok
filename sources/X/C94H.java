package X;

import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserPopupVM;

/* renamed from: X.94H, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C94H extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C94H LJLIL = new C94H();

    public C94H() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C65352Pkq.LIZ(RecUserPopupVM.class).LJFF());
        LIZ.append('_');
        LIZ.append(System.currentTimeMillis());
        return X1D.LIZIZ(LIZ);
    }
}
