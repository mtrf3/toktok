package X;

import com.bytedance.android.livesdk.gift.model.GiftResultData;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ug9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77801Ug9 implements InterfaceC32497CpB {
    public final /* synthetic */ CompletionBlock<InterfaceC77802UgA> LJLIL;
    public final /* synthetic */ C77810UgI LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC32497CpB
    public final void LIZIZ(Throwable t) {
        int i;
        o.LJIIIZ(t, "t");
        if (t instanceof C29401Dk) {
            i = ((C276516r) t).getErrorCode();
        } else if (t instanceof C53759L7z) {
            i = 40001;
        } else {
            i = 0;
        }
        CompletionBlock<InterfaceC77802UgA> completionBlock = this.LJLIL;
        this.LJLILLLLZI.getClass();
        XBaseModel LJIIL = C17N.LJIIL(InterfaceC77802UgA.class);
        ((InterfaceC77802UgA) LJIIL).setErrorCode(Integer.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Send Gift failed: ");
        LIZ.append(t.getMessage());
        completionBlock.onSuccess((XBaseResultModel) LJIIL, X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC32497CpB
    public final void LIZJ(SendGiftResult sendGiftResult) {
        List<GiftResultData> list;
        if (sendGiftResult != null) {
            list = sendGiftResult.gifts;
        } else {
            list = null;
        }
        if (C32151Nz.LJJIIJZLJL(list)) {
            CompletionBlock<InterfaceC77802UgA> completionBlock = this.LJLIL;
            this.LJLILLLLZI.getClass();
            XBaseModel LJIIL = C17N.LJIIL(InterfaceC77802UgA.class);
            ((InterfaceC77802UgA) LJIIL).setErrorCode(0);
            completionBlock.onSuccess((XBaseResultModel) LJIIL, "Gift list empty, invalid");
            return;
        }
        CompletionBlock<InterfaceC77802UgA> completionBlock2 = this.LJLIL;
        this.LJLILLLLZI.getClass();
        completionBlock2.onSuccess((XBaseResultModel) C17N.LJIIL(InterfaceC77802UgA.class), "Send Gift Success");
    }

    public C77801Ug9(C37356ElM c37356ElM, C77810UgI c77810UgI) {
        this.LJLIL = c37356ElM;
        this.LJLILLLLZI = c77810UgI;
    }
}
