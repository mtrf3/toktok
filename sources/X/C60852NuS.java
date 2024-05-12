package X;

import android.content.Intent;
import com.bytedance.hybrid.spark.page.SparkActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.NuS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60852NuS extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC60850NuQ, SparkActivity, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Intent LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60852NuS(int i, int i2, Intent intent) {
        super(2);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = intent;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC60850NuQ interfaceC60850NuQ, SparkActivity it) {
        InterfaceC60850NuQ receiver = interfaceC60850NuQ;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(it, "it");
        receiver.onActivityResult(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
