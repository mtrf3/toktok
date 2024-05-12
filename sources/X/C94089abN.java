package X;

import android.text.TextUtils;
import com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.abN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94089abN implements InterfaceC93663aUV<C94355aff> {
    public final /* synthetic */ ModelSelectImpl LIZ;
    public final /* synthetic */ InterfaceC88472Yns LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        this.LIZIZ.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(C94355aff c94355aff) {
        C94355aff result = c94355aff;
        o.LJIIIZ(result, "result");
        C94256ae4 c94256ae4 = null;
        for (Map.Entry<String, List<C94256ae4>> entry : result.LJLIL.entrySet()) {
            if (true ^ entry.getValue().isEmpty()) {
                for (C94256ae4 c94256ae42 : entry.getValue()) {
                    if (TextUtils.equals(c94256ae42.LJLJJLL, this.LIZJ)) {
                        c94256ae4 = c94256ae42;
                    }
                }
            }
        }
        if (c94256ae4 == null) {
            this.LIZIZ.invoke(Boolean.FALSE);
            C94034aaU.LIZ("ModelSelectImpl", "false: can not find target model by resId");
        } else {
            new C93996aZs(this.LIZ).LIZIZ(c94256ae4, true, new IDqS419S0100000_42(this, 12));
        }
    }

    public C94089abN(ModelSelectImpl modelSelectImpl, InterfaceC88472Yns interfaceC88472Yns, String str) {
        this.LIZ = modelSelectImpl;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = str;
    }
}
