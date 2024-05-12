package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SDA extends C96493qX {
    public final /* synthetic */ SD3 LJLJJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SDA(X.SD3 r4, android.view.View r5) {
        /*
            r3 = this;
            r3.LJLJJL = r4
            android.widget.EditText r5 = (android.widget.EditText) r5
            java.lang.String r0 = "inputWithIndicatorEditText"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            java.lang.String r2 = "/"
            r1 = 4
            r0 = 2
            r3.<init>(r5, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SDA.<init>(X.SD3, android.view.View):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        this.LJLJJL.getOnValueChange().invoke(this.LJLJJL.getValue());
        if (TextUtils.isEmpty(s)) {
            this.LJLJJL.setInputType("");
        } else {
            this.LJLJJL.setInputType("normal");
        }
    }
}
