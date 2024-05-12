package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UYm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77380UYm extends AbstractC77382UYo<List<? extends C77383UYp>> {
    public List<C77383UYp> LIZIZ;
    public final InterfaceC65784Pro<List<ImageModel>> LIZJ;

    @Override // X.InterfaceC77384UYq
    public final /* bridge */ /* synthetic */ Object getResult() {
        return this.LIZIZ;
    }

    public C77380UYm(C32449CoP request) {
        o.LJIIIZ(request, "request");
        this.LIZJ = request.LIZLLL;
    }

    @Override // X.InterfaceC77384UYq
    public final void LIZ(InterfaceC88472Yns<? super List<? extends C77383UYp>, C76800UCe> resolve, InterfaceC88472Yns<? super C78163Ulz, C76800UCe> reject) {
        o.LJIIIZ(resolve, "resolve");
        o.LJIIIZ(reject, "reject");
        InterfaceC65784Pro<List<ImageModel>> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro != null) {
            List<ImageModel> invoke = interfaceC65784Pro.invoke();
            int i = 0;
            if (invoke != null && !invoke.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(invoke, 10));
                for (ImageModel imageModel : invoke) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList2.add(AbstractC73672Svk.LJJIIJZLJL(new CallableC32233Ckv(KMP.LJ("mask", i2), imageModel)).LJJL(T16.LIZ()));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                AbstractC73672Svk.LJJIJLIJ(ORZ.LLJI(arrayList2)).LJJJ(C73969T1h.LIZIZ()).LIZ(new C77381UYn(arrayList, this, reject, resolve));
                return;
            }
        }
        resolve.invoke(new ArrayList());
    }
}
