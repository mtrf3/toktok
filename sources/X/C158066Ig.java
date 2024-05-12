package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.banner.LiveEffectMusicFadeDurationSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158066Ig implements InputFilter {
    public final int LJLIL;
    public final View LJLILLLLZI;

    public C158066Ig(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = LiveEffectMusicFadeDurationSetting.DEFAULT;
        this.LJLILLLLZI = view;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i4) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(dest, "dest");
        int length = this.LJLIL - (dest.length() - (i4 - i3));
        if (length <= 0) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
            c26045AKb.LJIIIZ(EF7.LIZIZ().getResources().getString(R.string.h6x));
            c26045AKb.LJIIJ();
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        int i6 = i5 - 1;
        if (Character.isHighSurrogate(source.charAt(i6))) {
            if (i6 == i) {
                C26045AKb c26045AKb2 = new C26045AKb(this.LJLILLLLZI);
                c26045AKb2.LJIIIZ(EF7.LIZIZ().getResources().getString(R.string.h6x));
                c26045AKb2.LJIIJ();
                return "";
            }
            i5 = i6;
        }
        return source.subSequence(i, i5);
    }
}
