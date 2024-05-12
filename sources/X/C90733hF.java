package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.3hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90733hF extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends BaseResponse>, C76800UCe> {
    public static final C90733hF LJLIL = new C90733hF();

    public C90733hF() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends BaseResponse> c43i) {
        BaseResponse baseResponse;
        ActivityC45651qj LIZ;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends BaseResponse> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (baseResponse = (BaseResponse) c43i2.LIZ) != null && (LIZ = C212428Vi.LIZ(selectSubscribe)) != null) {
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIZ(baseResponse.status_msg);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
