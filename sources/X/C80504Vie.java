package X;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.timepicker.TimeModel;

/* renamed from: X.Vie, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80504Vie extends C80335Vfv {
    public final /* synthetic */ C80503Vid LJLIL;

    public C80504Vie(C80503Vid c80503Vid) {
        this.LJLIL = c80503Vid;
    }

    @Override // X.C80335Vfv, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            C80503Vid c80503Vid = this.LJLIL;
            c80503Vid.LJLIL.setText(TimeModel.LIZ(c80503Vid.getResources(), "00", "%02d"));
        } else {
            C80503Vid c80503Vid2 = this.LJLIL;
            c80503Vid2.LJLIL.setText(TimeModel.LIZ(c80503Vid2.getResources(), editable, "%02d"));
        }
    }
}
