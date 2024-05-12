package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: X.GAy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41096GAy implements TextWatcher {
    public final /* synthetic */ GSU LJLIL;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C41096GAy(GSU gsu) {
        this.LJLIL = gsu;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i) && this.LJLIL.LLFFF != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_method", "input");
            FMX.LJIIL("click_video_at", c145995oB.LIZ);
            this.LJLIL.LLFFF.LIZ();
        }
    }
}
