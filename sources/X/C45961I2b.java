package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.jvm.internal.o;

/* renamed from: X.I2b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45961I2b implements IFetchResourceListener {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Exception, C76800UCe> LJLILLLLZI;

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onFailure(Exception exception) {
        o.LJIIIZ(exception, "exception");
        this.LJLILLLLZI.invoke(exception);
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onSuccess(long j) {
        XBE.LJIIIIZZ.getClass();
        String realFindResourceUri = C84419XBf.LIZ().LIZLLL().realFindResourceUri(0, null, "time_align_44k.model");
        if (TextUtils.isEmpty(realFindResourceUri)) {
            this.LJLIL.invoke("");
            return;
        }
        String filePath = java.net.URI.create(realFindResourceUri).getPath();
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLIL;
        o.LJIIIIZZ(filePath, "filePath");
        interfaceC88472Yns.invoke(filePath);
    }

    public C45961I2b(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = interfaceC88472Yns2;
    }
}
