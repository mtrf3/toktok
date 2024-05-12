package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ufm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77778Ufm implements UZM {
    public final /* synthetic */ C77777Ufl LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC77779Ufn> LIZIZ;

    @Override // X.UZM
    public final void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ.getClass();
        this.LIZIZ.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC77779Ufn.class, null), "");
    }

    public C77778Ufm(C77777Ufl c77777Ufl, C37356ElM c37356ElM) {
        this.LIZ = c77777Ufl;
        this.LIZIZ = c37356ElM;
    }
}
