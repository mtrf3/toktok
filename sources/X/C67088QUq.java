package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QUq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67088QUq implements QUT {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJLL;
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public InterfaceC67090QUs LJLJI;
    public final Context LJLJJI;
    public final C67087QUp LJLJJL;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C67088QUq.class), "mHandler", "getMHandler()Landroid/os/Handler;");
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C67088QUq.class), "mFileCache", "getMFileCache()Lcom/bytedance/sync/interfaze/IFileDataCacheService;")};
    }

    public final InterfaceC67086QUo LIZLLL() {
        return (InterfaceC67086QUo) this.LJLILLLLZI.getValue();
    }

    @Override // X.QUT
    public final void LJJLIIIJ(java.util.Set<Long> syncIds) {
        o.LJIIJ(syncIds, "syncIds");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notify patch ");
        LIZ.append(syncIds);
        C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
        ((Handler) this.LJLIL.getValue()).post(new RunnableC67089QUr(this, syncIds));
    }

    public C67088QUq(Context context, C67087QUp c67087QUp) {
        o.LJIIJ(context, "context");
        this.LJLJJI = context;
        this.LJLJJL = c67087QUp;
        this.LJLIL = C221108m2.LIZIZ(QUR.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(C67085QUn.LJLIL);
    }

    public final void LJJJLZIJ(List<QV2> list, C67094QUw c67094QUw, C67094QUw c67094QUw2) {
        String str;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            QV2 qv2 = (QV2) it.next();
            if (qv2.LJIIIIZZ == QV1.FILE_PATH) {
                try {
                    InterfaceC67086QUo LIZLLL = LIZLLL();
                    byte[] bArr = qv2.LJ;
                    o.LJFF(bArr, "it.data");
                    LIZLLL.LJJJJLI(new String(bArr, PVC.LIZ));
                } catch (Throwable unused) {
                }
            }
        }
        if (c67094QUw != null) {
            QV1 qv1 = c67094QUw.LJIIIIZZ;
            QV1 qv12 = QV1.FILE_PATH;
            if (qv1 == qv12) {
                try {
                    byte[] bArr2 = c67094QUw.LJFF;
                    o.LJFF(bArr2, "originalSnapshot.data");
                    Charset charset = PVC.LIZ;
                    String str2 = new String(bArr2, charset);
                    if (c67094QUw2.LJIIIIZZ == qv12) {
                        byte[] bArr3 = c67094QUw2.LJFF;
                        o.LJFF(bArr3, "snapshot.data");
                        str = new String(bArr3, charset);
                    } else {
                        str = null;
                    }
                    if (!TextUtils.equals(str, str2)) {
                        LIZLLL().LJJJJLI(str2);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
