package X;

import android.text.InputFilter;

/* loaded from: classes11.dex */
public final class OPV extends AbstractC65781Prl implements InterfaceC88472Yns<InputFilter, Boolean> {
    public static final OPV LJLIL = new OPV();

    public OPV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InputFilter inputFilter) {
        return Boolean.valueOf(!(inputFilter instanceof InputFilter.LengthFilter));
    }
}
