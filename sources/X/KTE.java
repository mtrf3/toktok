package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class KTE extends AbstractC85293Wj {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ SpannableStringBuilder LJLILLLLZI;
    public final /* synthetic */ TextView LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        int i = this.LJLIL;
        bitmapDrawable.setBounds(0, 0, i, i);
        T59 t59 = new T59(bitmapDrawable);
        SpannableStringBuilder spannableStringBuilder = this.LJLILLLLZI;
        spannableStringBuilder.setSpan(t59, spannableStringBuilder.length() - 1, this.LJLILLLLZI.length(), 33);
        this.LJLJI.setText(this.LJLILLLLZI);
        String str = this.LJLJJI;
        if (str == null || str.length() == 0) {
            return;
        }
        C63069Op7.LIZLLL(this.LJLJJL, this.LJLJJI);
    }

    public KTE(int i, SpannableStringBuilder spannableStringBuilder, TextView textView, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = spannableStringBuilder;
        this.LJLJI = textView;
        this.LJLJJI = str;
        this.LJLJJL = str2;
    }
}
