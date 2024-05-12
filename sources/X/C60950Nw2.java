package X;

import android.view.View;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.Nw2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60950Nw2 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC60949Nw1, SparkPopup, C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60950Nw2(View view, float f) {
        super(2);
        this.LJLIL = view;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC60949Nw1 interfaceC60949Nw1, SparkPopup sparkPopup) {
        InterfaceC60949Nw1 receiver = interfaceC60949Nw1;
        SparkPopup popup = sparkPopup;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(popup, "popup");
        receiver.LIZJ(popup, this.LJLIL, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
