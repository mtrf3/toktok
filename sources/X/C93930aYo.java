package X;

import com.bytedance.effectcreatormobile.camera.MainRes;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.news.common.service.manager.IService;
import kotlin.jvm.internal.o;

/* renamed from: X.aYo, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93930aYo {
    public final IStore LIZ;
    public final String LIZIZ;

    public C93930aYo(String draftPath) {
        IService iService;
        o.LJIIIZ(draftPath, "draftPath");
        this.LIZIZ = draftPath;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(IStore.class);
        } else {
            iService = null;
        }
        this.LIZ = (IStore) iService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b9, code lost:
    
        if (new java.io.File(r3).exists() == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93930aYo.LIZIZ(X.2kd):java.lang.Object");
    }

    public final Object LIZ(boolean z, InterfaceC67352kd<? super String> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        MainRes.INSTANCE.fetchMainDraftRes(z, new C94330afG(xks, this, z));
        return xks.LJIIJJI();
    }
}
