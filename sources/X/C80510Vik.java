package X;

import android.text.Editable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.android.material.timepicker.TimeModel;

/* renamed from: X.Vik, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80510Vik extends C80335Vfv {
    public final /* synthetic */ C80506Vig LJLIL;

    public C80510Vik(C80506Vig c80506Vig) {
        this.LJLIL = c80506Vig;
    }

    @Override // X.C80335Vfv, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            if (TextUtils.isEmpty(editable)) {
                TimeModel timeModel = this.LJLIL.LJLILLLLZI;
                timeModel.getClass();
                timeModel.LJLJI = 0;
            } else {
                int parseInt = CastIntegerProtector.parseInt(editable.toString());
                TimeModel timeModel2 = this.LJLIL.LJLILLLLZI;
                timeModel2.getClass();
                timeModel2.LJLJI = parseInt % 60;
            }
        } catch (NumberFormatException unused) {
        }
    }
}
