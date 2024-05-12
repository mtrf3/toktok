package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ESq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36460ESq extends AbstractC65781Prl implements InterfaceC88472Yns<UrlModel, C76800UCe> {
    public static final C36460ESq LJLIL = new C36460ESq();

    public C36460ESq() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(UrlModel urlModel) {
        UrlModel receiver = urlModel;
        o.LJIIIZ(receiver, "$receiver");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("res:// /");
        LIZ.append(R.drawable.b4c);
        receiver.setUri(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
