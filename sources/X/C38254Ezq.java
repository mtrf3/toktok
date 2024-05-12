package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ezq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38254Ezq implements InterfaceC37745Erd {
    public CompletionBlock<InterfaceC38256Ezs> LIZ;
    public java.util.Map<String, ? extends Object> LIZIZ;
    public final String LIZJ;
    public final C38504F9g LIZLLL;

    public C38254Ezq(String id, C38504F9g prefetchRuntime) {
        o.LJIIJ(id, "id");
        o.LJIIJ(prefetchRuntime, "prefetchRuntime");
        this.LIZJ = id;
        this.LIZLLL = prefetchRuntime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void LIZIZ(Integer num, String str, Throwable th) {
        Integer num2;
        String str2;
        CompletionBlock<InterfaceC38256Ezs> completionBlock = this.LIZ;
        if (completionBlock != 0) {
            C38504F9g c38504F9g = this.LIZLLL;
            C60737Nsb c60737Nsb = c38504F9g.LJIIJ;
            String str3 = this.LIZJ;
            OSJ<Integer, String, ? extends Throwable> osj = c38504F9g.LJII;
            if (osj != null) {
                num2 = osj.getFirst();
            } else {
                num2 = null;
            }
            C38097ExJ.LIZJ(c60737Nsb, null, 0, str3, num2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("errorCode: ");
            LIZ.append(num);
            LIZ.append(", errorMsg: ");
            if (th == null) {
                str2 = null;
            } else {
                str2 = th.getMessage();
            }
            LIZ.append(str2);
            LIZ.append(", ");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC38256Ezs.class, null);
            InterfaceC38256Ezs interfaceC38256Ezs = (InterfaceC38256Ezs) LIZJ;
            interfaceC38256Ezs.setState(0);
            interfaceC38256Ezs.setResult(null);
            interfaceC38256Ezs.setMode("segmenting");
            completionBlock.onFailure(0, LIZIZ, (XBaseResultModel) LIZJ);
            this.LIZ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37745Erd
    public final synchronized void LIZ(Integer num, String str, Throwable th, java.util.Map map) {
        InterfaceC38260Ezw interfaceC38260Ezw;
        CompletionBlock<InterfaceC38256Ezs> completionBlock = this.LIZ;
        if (completionBlock != 0) {
            if (num == null) {
                C39836FkG.LJII.getClass();
                if (C38262Ezy.LIZ().LIZ && (interfaceC38260Ezw = (InterfaceC38260Ezw) this.LIZLLL.LJIIJ.LIZIZ(InterfaceC38260Ezw.class)) != null) {
                    C37744Erc.LIZ(interfaceC38260Ezw, null, null, null, this.LIZJ, map, 7);
                }
                C38097ExJ.LIZJ(this.LIZLLL.LJIIJ, null, 1, this.LIZJ, null);
                XBaseModel LIZJ = ED5.LIZJ(InterfaceC38256Ezs.class, null);
                InterfaceC38256Ezs interfaceC38256Ezs = (InterfaceC38256Ezs) LIZJ;
                interfaceC38256Ezs.setState(1);
                interfaceC38256Ezs.setResult(map);
                interfaceC38256Ezs.setMode("segmenting");
                completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
            } else {
                LIZIZ(num, str, th);
            }
            this.LIZ = null;
            return;
        }
        this.LIZIZ = map;
    }
}
