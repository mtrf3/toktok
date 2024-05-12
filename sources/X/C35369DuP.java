package X;

import com.ss.android.ugc.aweme.main.assems.main.MainActivityLogAssem;

/* renamed from: X.DuP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35369DuP extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ MainActivityLogAssem LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35369DuP(MainActivityLogAssem mainActivityLogAssem, boolean z, boolean z2) {
        super(0);
        this.LJLIL = mainActivityLogAssem;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWindowFocusChanged ");
        LIZ.append(this.LJLIL);
        LIZ.append(' ');
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(' ');
        LIZ.append(this.LJLJI);
        return X1D.LIZIZ(LIZ);
    }
}
