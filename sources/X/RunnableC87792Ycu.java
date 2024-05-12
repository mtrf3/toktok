package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.Ycu, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class RunnableC87792Ycu implements Runnable {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ SpannableStringBuilder LJLILLLLZI;
    public final /* synthetic */ AbstractC87817YdJ LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC87791Yct LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public RunnableC87792Ycu(TextView textView, SpannableStringBuilder spannableStringBuilder, AbstractC87817YdJ abstractC87817YdJ, String str, InterfaceC87791Yct interfaceC87791Yct, long j) {
        this.LJLIL = textView;
        this.LJLILLLLZI = spannableStringBuilder;
        this.LJLJI = abstractC87817YdJ;
        this.LJLJJI = str;
        this.LJLJJL = interfaceC87791Yct;
        this.LJLJJLL = j;
    }

    public final void LIZ() {
        int i;
        int i2;
        Layout layout = this.LJLIL.getLayout();
        if (layout != null) {
            i = (int) layout.getLineWidth(0);
        } else {
            i = 0;
        }
        if (i > this.LJLIL.getWidth()) {
            this.LJLIL.setText(this.LJLILLLLZI.append((CharSequence) "     "));
            AbstractC87817YdJ abstractC87817YdJ = this.LJLJI;
            TextView textView = this.LJLIL;
            abstractC87817YdJ.getClass();
            AbstractC87817YdJ.LJFF(textView);
            Layout layout2 = this.LJLIL.getLayout();
            if (layout2 != null) {
                i2 = (int) layout2.getLineWidth(0);
            } else {
                i2 = 0;
            }
            this.LJLIL.setText(this.LJLILLLLZI.append((CharSequence) this.LJLJJI));
            TextView textView2 = this.LJLIL;
            textView2.post(new RunnableC87802Yd4(this.LJLJI, i2, textView2, this.LJLJJLL, this.LJLJJL));
            return;
        }
        InterfaceC87791Yct interfaceC87791Yct = this.LJLJJL;
        if (interfaceC87791Yct == null) {
            return;
        }
        interfaceC87791Yct.LIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
