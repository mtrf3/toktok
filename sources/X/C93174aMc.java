package X;

import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aMc, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final /* synthetic */ class C93174aMc extends TBS implements InterfaceC88472Yns<String, C76800UCe> {
    public C93174aMc(Object obj) {
        super(1, obj, PIViewModel.class, "updateWebviewTitle", "updateWebviewTitle(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String p0 = str;
        o.LJIIIZ(p0, "p0");
        ((PIViewModel) this.receiver).updateWebviewTitle(p0);
        return C76800UCe.LIZ;
    }
}
