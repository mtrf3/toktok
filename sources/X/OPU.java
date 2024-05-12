package X;

import android.text.InputFilter;

/* loaded from: classes11.dex */
public final class OPU extends AbstractC65781Prl implements InterfaceC88472Yns<InputFilter, Boolean> {
    public static final OPU LJLIL = new OPU();

    public OPU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(InputFilter inputFilter) {
        return Boolean.valueOf(!(inputFilter instanceof InputFilter.LengthFilter));
    }
}
