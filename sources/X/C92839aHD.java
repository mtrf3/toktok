package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import java.util.List;

/* renamed from: X.aHD, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92839aHD extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends Elements>> {
    public static final C92839aHD LJLIL = new C92839aHD();

    public C92839aHD() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final List<? extends Elements> invoke() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = C91943a2l.LIZ;
        T value = parcelableSnapshotMutableState.getValue();
        if (value instanceof C92231a7P) {
            List<Elements> elements = ((C92231a7P) parcelableSnapshotMutableState.getValue()).LJLIL.getElements();
            if (elements == null) {
                return C61878OQg.INSTANCE;
            }
            return elements;
        }
        if (value instanceof C92233a7R) {
            List<Elements> neededElements = ((C92233a7R) parcelableSnapshotMutableState.getValue()).LJLIL.getNeededElements();
            if (neededElements != null) {
                return neededElements;
            }
            return C61878OQg.INSTANCE;
        }
        return C61878OQg.INSTANCE;
    }
}
