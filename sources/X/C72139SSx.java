package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.SSx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72139SSx<T> implements InterfaceC47046IdG {
    public final /* synthetic */ InterfaceC72138SSw LIZ;

    public C72139SSx(InterfaceC72138SSw interfaceC72138SSw) {
        this.LIZ = interfaceC72138SSw;
    }

    @Override // X.InterfaceC47046IdG
    public final void onResult(Object obj) {
        File file = (File) obj;
        if (file != null) {
            InterfaceC72138SSw interfaceC72138SSw = this.LIZ;
            android.net.Uri fromFile = android.net.Uri.fromFile(file);
            o.LJIIIIZZ(fromFile, "Uri.fromFile(this)");
            interfaceC72138SSw.LIZIZ(fromFile);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZ.LIZ();
    }
}
