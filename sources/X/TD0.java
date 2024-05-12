package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TD0 extends C74251TCd {
    public final /* synthetic */ AqS178S0100000_12 LJLLI;
    public final /* synthetic */ TDE LJLLILLLL;
    public final /* synthetic */ FrameLayout LJLLJ;

    @Override // X.AbstractViewOnClickListenerC74256TCi
    public final void Q(boolean z) {
        super.Q(z);
        TDE tde = this.LJLLILLLL;
        if (tde instanceof TD2) {
            Object obj = ((C74272TCy) this.LJLLI.l0).LJLJJL;
            if (obj instanceof TTSearchStickerViewModel) {
                TD2 td2 = (TD2) tde;
                String keyword = ((SearchStickerViewModel) obj).mv0().LJLJI;
                td2.getClass();
                o.LJIIIZ(keyword, "keyword");
                if (z) {
                    C8HN c8hn = td2.LLJJIJI;
                    if (c8hn != null) {
                        SpannableString spannableString = new SpannableString(new SpannableString(c8hn.getText()));
                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                        spannableString.setSpan(new ForegroundColorSpan(ColorProtector.parseColor("#FE2C55")), 0, spannableString.length(), 33);
                        C8HN c8hn2 = td2.LLJJIJI;
                        if (c8hn2 != null) {
                            c8hn2.setText(spannableString);
                            return;
                        } else {
                            o.LJIJI("stickerTitleText");
                            throw null;
                        }
                    }
                    o.LJIJI("stickerTitleText");
                    throw null;
                }
                td2.LJJ(keyword);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TD0(AqS178S0100000_12 aqS178S0100000_12, TDE tde, FrameLayout frameLayout, View view, TDE tde2, TEZ tez, TEF tef, T4I t4i) {
        super(view, tde2, tez, tef, t4i);
        this.LJLLI = aqS178S0100000_12;
        this.LJLLILLLL = tde;
        this.LJLLJ = frameLayout;
    }
}
