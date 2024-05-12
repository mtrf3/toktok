package X;

import android.util.Pair;
import com.bytedance.ies.im.core.api.experiment.IMReadReceiptOptimizationSettingModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegate;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102033zT implements InterfaceC86963bA<Pair<List<? extends Long>, List<? extends Long>>> {
    public final C109544Rq LIZ;
    public final /* synthetic */ ReadStateSyncDelegate LIZIZ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFailure: error={");
        String str = null;
        if (c63623Oy3 != null) {
            num = Integer.valueOf(c63623Oy3.LIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        if (c63623Oy3 != null) {
            str = c63623Oy3.LIZJ;
        }
        LIZ.append(str);
        LIZ.append('}');
        C34B.LIZIZ("ReadStateSyncDelegate", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(Pair<List<? extends Long>, List<? extends Long>> pair) {
        Collection collection;
        boolean z;
        Pair<List<? extends Long>, List<? extends Long>> pair2 = pair;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSuccess: spot: ");
        LIZ.append(this.LIZIZ.LJLIL.LIZJ().getValue());
        LIZ.append(", message: ");
        LIZ.append(this.LIZ.getMsgId());
        LIZ.append(", result: ");
        LIZ.append(pair2);
        C34B.LIZIZ("ReadStateSyncDelegate", X1D.LIZIZ(LIZ));
        int i = 0;
        if (!this.LIZIZ.LJLJJI) {
            if (C00F.LIZ(31744, 0, "im_read_receipt_optimization_test", true) == 1) {
                IMReadReceiptOptimizationSettingModel LIZ2 = C102043zU.LIZ();
                if (LIZ2.enableReadReceiptPolling) {
                    ReadStateSyncDelegate readStateSyncDelegate = this.LIZIZ;
                    int i2 = readStateSyncDelegate.LJLJI;
                    int i3 = LIZ2.readReceiptPollingMaxCount;
                    if (i2 < i3 || i3 == -1) {
                        readStateSyncDelegate.LIZ(LIZ2.readReceiptPollingTimeInterval * 1000);
                        this.LIZIZ.LJLJI++;
                    }
                }
            } else {
                this.LIZIZ.LIZ(2000L);
            }
        }
        if (pair2 == null || (collection = (Collection) pair2.second) == null || collection.isEmpty()) {
            return;
        }
        C102073zX c102073zX = this.LIZIZ.LJLIL;
        C109544Rq c109544Rq = this.LIZ;
        C102093zZ value = c102073zX.LIZJ().getValue();
        if (value == null || !o.LJ(c109544Rq, value.LIZ)) {
            return;
        }
        Collection collection2 = (Collection) pair2.first;
        if (collection2 == null || collection2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C102073zX c102073zX2 = this.LIZIZ.LJLIL;
            C109544Rq c109544Rq2 = this.LIZ;
            if ((c109544Rq2.getMsgId() <= 0 || c109544Rq2.getMsgStatus() != 2) && c109544Rq2.getMsgStatus() != 5) {
                i = -1;
            }
            C102073zX.LJ(c102073zX2, i);
            return;
        }
        List list = (List) pair2.first;
        if (list == null) {
            return;
        }
        int size = list.size();
        Object obj = pair2.second;
        o.LJI(obj);
        if (size != ((List) obj).size()) {
            return;
        }
        C102073zX.LJ(this.LIZIZ.LJLIL, 2);
        String conversationId = this.LIZ.getConversationId();
        o.LJIIIIZZ(conversationId, "message.conversationId");
        C2U8.LIZ(new C3KF(conversationId, this.LIZ.getCreatedAt()));
    }

    public C102033zT(ReadStateSyncDelegate readStateSyncDelegate, C109544Rq message) {
        o.LJIIIZ(message, "message");
        this.LIZIZ = readStateSyncDelegate;
        this.LIZ = message;
    }
}
