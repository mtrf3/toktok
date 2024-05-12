package X;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Zm3, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90907Zm3 implements InterfaceC90654Zhy {
    public final Status LJLIL;
    public final ApplicationMetadata LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;

    public C90907Zm3(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.LJLIL = status;
        this.LJLILLLLZI = applicationMetadata;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = z;
    }

    @Override // X.InterfaceC90654Zhy
    public final String LJIJ() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC90654Zhy
    public final ApplicationMetadata LJJIIJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC90654Zhy
    public final boolean LJJIZ() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC90654Zhy
    public final String getSessionId() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC67754QiU
    public final Status getStatus() {
        return this.LJLIL;
    }
}
