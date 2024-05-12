package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KTD extends AbstractC85293Wj {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C68322mC<SpannableString> LJLILLLLZI;
    public final /* synthetic */ TextView LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        int i = this.LJLIL;
        bitmapDrawable.setBounds(0, 0, i, i);
        T59 t59 = new T59(bitmapDrawable);
        SpannableString spannableString = this.LJLILLLLZI.element;
        spannableString.setSpan(t59, spannableString.length() - 1, this.LJLILLLLZI.element.length(), 33);
        this.LJLJI.setText(this.LJLILLLLZI.element);
        String str2 = this.LJLJJI;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        String str3 = this.LJLJJL;
        if (this.LJLJJLL) {
            str = this.LJLJJI.substring(1);
            o.LJIIIIZZ(str, "this as java.lang.String).substring(startIndex)");
        } else {
            str = this.LJLJJI;
        }
        C63069Op7.LIZLLL(str3, str);
    }

    public KTD(int i, C68322mC<SpannableString> c68322mC, TextView textView, String str, String str2, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = textView;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = z;
    }
}
