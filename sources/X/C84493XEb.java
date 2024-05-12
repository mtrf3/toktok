package X;

import java.io.File;
import kotlin.jvm.internal.AqS68S1100000_15;

/* renamed from: X.XEb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84493XEb implements InterfaceC31104CIq {
    public final /* synthetic */ InterfaceC88472Yns<File, C76800UCe> LJLIL;

    public C84493XEb(AqS68S1100000_15 aqS68S1100000_15) {
        this.LJLIL = aqS68S1100000_15;
    }

    @Override // X.InterfaceC31104CIq
    public final void LJI(File file) {
        this.LJLIL.invoke(file);
    }

    @Override // X.InterfaceC31104CIq
    public final void onFailed(Throwable th) {
        this.LJLIL.invoke(null);
    }
}
