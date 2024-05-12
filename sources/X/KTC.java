package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.widget.TextView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KTC extends AbstractC85293Wj {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ C68322mC<SpannableString> LJLILLLLZI;
    public final /* synthetic */ TextExtraStruct LJLJI;
    public final /* synthetic */ String LJLJJI = "search_hashtag";

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, android.text.SpannableString, java.lang.Object] */
    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        bitmapDrawable.setBounds(0, 0, (int) this.LJLIL.getTextSize(), (int) this.LJLIL.getTextSize());
        T59 t59 = new T59(bitmapDrawable);
        C68322mC<SpannableString> c68322mC = this.LJLILLLLZI;
        SpannableString spannableString = c68322mC.element;
        int end = this.LJLJI.getEnd();
        int end2 = this.LJLJI.getEnd() + 1;
        o.LJIIIZ(spannableString, "spannableString");
        int length = spannableString.length();
        if (end <= length && end2 <= length && end <= end2) {
            spannableString.setSpan(t59, end, end2, 33);
        }
        c68322mC.element = spannableString;
        this.LJLIL.setText(this.LJLILLLLZI.element);
        C63069Op7.LIZLLL(this.LJLJJI, this.LJLJI.getHashTagName());
    }

    public KTC(TextView textView, C68322mC c68322mC, TextExtraStruct textExtraStruct) {
        this.LJLIL = textView;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = textExtraStruct;
    }
}
