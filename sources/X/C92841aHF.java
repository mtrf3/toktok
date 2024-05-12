package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.aHF, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92841aHF extends AbstractC65781Prl implements InterfaceC65784Pro<C92222a7G> {
    public static final C92841aHF LJLIL = new C92841aHF();

    public C92841aHF() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C92222a7G invoke() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = C91943a2l.LIZ;
        T value = parcelableSnapshotMutableState.getValue();
        String str = "";
        if (value instanceof C92231a7P) {
            String paymentMethod = ((C92231a7P) parcelableSnapshotMutableState.getValue()).LJLIL.getPaymentMethod();
            if (paymentMethod == null) {
                paymentMethod = "";
            }
            String paymentMethodType = ((C92231a7P) parcelableSnapshotMutableState.getValue()).LJLIL.getPaymentMethodType();
            if (paymentMethodType == null) {
                paymentMethodType = "";
            }
            String paymentMethodId = ((C92231a7P) parcelableSnapshotMutableState.getValue()).LJLIL.getPaymentMethodId();
            if (paymentMethodId != null) {
                str = paymentMethodId;
            }
            return new C92222a7G(paymentMethod, paymentMethodType, str);
        }
        if (value instanceof C92233a7R) {
            String paymentMethod2 = ((C92233a7R) parcelableSnapshotMutableState.getValue()).LJLIL.getPaymentMethod();
            if (paymentMethod2 == null) {
                paymentMethod2 = "";
            }
            String paymentMethodType2 = ((C92233a7R) parcelableSnapshotMutableState.getValue()).LJLIL.getPaymentMethodType();
            if (paymentMethodType2 == null) {
                paymentMethodType2 = "";
            }
            String paymentMethodId2 = ((C92233a7R) parcelableSnapshotMutableState.getValue()).LJLIL.getPaymentMethodId();
            if (paymentMethodId2 != null) {
                str = paymentMethodId2;
            }
            return new C92222a7G(paymentMethod2, paymentMethodType2, str);
        }
        return new C92222a7G("", "", "");
    }
}
