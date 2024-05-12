package X;

import android.os.FileObserver;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class PL1 extends FileObserver {
    public final /* synthetic */ InterfaceC64313PLx LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            InterfaceC64313PLx interfaceC64313PLx = this.LIZ;
            String str3 = this.LIZIZ;
            ((C85999Xp5) interfaceC64313PLx).getClass();
            if (str.startsWith("anr")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                LIZ.append("/");
                LIZ.append(str);
                str2 = PK8.LJFF(X1D.LIZIZ(LIZ));
                C64278PKo.LIZ = str2;
            }
            str2 = null;
            C64278PKo.LIZ = str2;
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PL1(String str, InterfaceC64313PLx interfaceC64313PLx, String str2) {
        super(str, 136);
        this.LIZ = interfaceC64313PLx;
        this.LIZIZ = str2;
    }
}
