package X;

import android.text.Editable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.Vio, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80514Vio extends C80335Vfv {
    public final /* synthetic */ C80506Vig LJLIL;

    public C80514Vio(C80506Vig c80506Vig) {
        this.LJLIL = c80506Vig;
    }

    @Override // X.C80335Vfv, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            if (TextUtils.isEmpty(editable)) {
                this.LJLIL.LJLILLLLZI.LIZLLL(0);
            } else {
                this.LJLIL.LJLILLLLZI.LIZLLL(CastIntegerProtector.parseInt(editable.toString()));
            }
        } catch (NumberFormatException unused) {
        }
    }
}
