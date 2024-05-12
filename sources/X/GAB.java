package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GAB extends GUX {
    public final /* synthetic */ InterfaceC88471Ynr<Integer, Object, C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, Object, C76800UCe> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public GAB(InterfaceC88471Ynr<? super Integer, Object, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super Boolean, Object, C76800UCe> interfaceC88471Ynr2) {
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = interfaceC88471Ynr2;
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        InterfaceC88471Ynr<Integer, Object, C76800UCe> interfaceC88471Ynr = this.LJLIL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Integer.valueOf(i), obj);
        }
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        if (result instanceof C41505GQr) {
            this.LJLILLLLZI.invoke(Boolean.TRUE, obj);
        } else {
            this.LJLILLLLZI.invoke(Boolean.FALSE, result);
        }
    }
}
