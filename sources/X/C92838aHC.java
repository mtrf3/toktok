package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.response.CheckBox;

/* renamed from: X.aHC, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92838aHC extends AbstractC65781Prl implements InterfaceC65784Pro<CheckBox> {
    public static final C92838aHC LJLIL = new C92838aHC();

    public C92838aHC() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final CheckBox invoke() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = C91943a2l.LIZ;
        if (parcelableSnapshotMutableState.getValue() instanceof C92231a7P) {
            return ((C92231a7P) parcelableSnapshotMutableState.getValue()).LJLIL.getCheckbox();
        }
        return null;
    }
}
