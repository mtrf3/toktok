package X;

import android.view.View;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8e9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216218e9 extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends View>, C76800UCe> {
    public static final C216218e9 LJLIL = new C216218e9();

    public C216218e9() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends View> c43i) {
        View view;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends View> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (view = (View) c43i2.LIZ) != null) {
            selectSubscribe.LLIIL = view;
            selectSubscribe.A4();
        }
        return C76800UCe.LIZ;
    }
}
