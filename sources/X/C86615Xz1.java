package X;

import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostPermissionDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xz1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86615Xz1 implements OnPermissionGrantCallback {
    public final /* synthetic */ C86606Xys LIZ;
    public final /* synthetic */ IHostPermissionDepend LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ LinkedHashMap LJ;

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
    public final void onAllGranted() {
        try {
            RunnableC86607Xyt runnableC86607Xyt = this.LIZ.LIZ;
            C86618Xz4 c86618Xz4 = runnableC86607Xyt.LJLIL;
            Context context = runnableC86607Xyt.LJLJJLL;
            String str = runnableC86607Xyt.LJLJJL;
            EnumC86625XzB enumC86625XzB = runnableC86607Xyt.LJLILLLLZI.LJ;
            if (enumC86625XzB != null) {
                String str2 = this.LIZJ;
                int i = this.LIZLLL;
                LinkedHashMap linkedHashMap = this.LJ;
                InterfaceC86630XzG interfaceC86630XzG = runnableC86607Xyt.LJLJJI;
                c86618Xz4.getClass();
                C86618Xz4.LJIIIZ(context, str, enumC86625XzB, str2, i, linkedHashMap, interfaceC86630XzG);
                return;
            }
            o.LJIIZILJ();
            throw null;
        } catch (Exception e) {
            VFS.LIZ().post(new ARunnableS34S0200000_15(this, e, 35));
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.OnPermissionGrantCallback
    public final void onNotGranted() {
        VFS.LIZ().post(new ARunnableS51S0100000_15(this, 94));
    }

    public C86615Xz1(C86606Xys c86606Xys, IHostPermissionDepend iHostPermissionDepend, String str, int i, LinkedHashMap linkedHashMap) {
        this.LIZ = c86606Xys;
        this.LIZIZ = iHostPermissionDepend;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = linkedHashMap;
    }
}
