package X;

import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CSp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31363CSp<T> implements InterfaceC115714gR {
    public final /* synthetic */ List<T> LJLIL;
    public final /* synthetic */ AbstractC31361CSn<T> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C31363CSp(List<? extends T> list, AbstractC31361CSn<T> abstractC31361CSn) {
        this.LJLIL = list;
        this.LJLILLLLZI = abstractC31361CSn;
    }

    @Override // X.InterfaceC115714gR
    public final void LIZ(InterfaceC116954iR<? super C28467BFf<MGetTranslationResponse.Data>> it) {
        o.LJIIIZ(it, "it");
        List<T> list = this.LJLIL;
        AbstractC31361CSn<T> abstractC31361CSn = this.LJLILLLLZI;
        for (T t : list) {
            InterfaceC31364CSq<T> interfaceC31364CSq = abstractC31361CSn.LJIIJ;
            if (interfaceC31364CSq != null) {
                interfaceC31364CSq.LIZIZ(t);
            }
        }
    }
}
