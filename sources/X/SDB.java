package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SDB extends C96473qV {
    public final /* synthetic */ SD6 LJLJJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SDB(X.SD6 r2, android.view.View r3) {
        /*
            r1 = this;
            r1.LJLJJL = r2
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.String r0 = "inputWithIndicatorEditText"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            r1.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SDB.<init>(X.SD6, android.view.View):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s, int i, int i2, int i3) {
        String str;
        o.LJIIIZ(s, "s");
        this.LJLJJL.getOnValueChange().invoke(this.LJLJJL.getValue());
        SD6 sd6 = this.LJLJJL;
        if (TextUtils.isEmpty(s)) {
            str = "";
        } else {
            str = "normal";
        }
        sd6.setInputMethod(str);
    }
}
