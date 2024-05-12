package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import kotlin.jvm.internal.o;

/* renamed from: X.Aaw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26518Aaw extends AbstractC65781Prl implements InterfaceC88471Ynr<DistrictPickerState, Bundle, DistrictPickerState> {
    public static final C26518Aaw INSTANCE = new C26518Aaw();

    public C26518Aaw() {
        super(2);
    }

    public final DistrictPickerState invoke(DistrictPickerState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ DistrictPickerState invoke(DistrictPickerState districtPickerState, Bundle bundle) {
        DistrictPickerState districtPickerState2 = districtPickerState;
        invoke(districtPickerState2, bundle);
        return districtPickerState2;
    }
}
