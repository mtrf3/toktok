package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.9Av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232579Av extends AbstractC232589Aw {
    public String LJLJI;
    public String LJLJJI;

    public final String getEnterFrom() {
        return this.LJLJI;
    }

    public final String getPreviousPage() {
        return this.LJLJJI;
    }

    private final void setupView(Context context) {
        int i;
        C16880lQ.LLLZIIL(R.layout.cmz, C16880lQ.LLZIL(context), this);
        View findViewById = findViewById(R.id.iqq);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.recommend_user_title)");
        setTitleTextView((TuxTextView) findViewById);
        View findViewById2 = findViewById(R.id.ely);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.info_icon_view)");
        setInfoIconView((TuxIconView) findViewById2);
        TuxIconView infoIconView = getInfoIconView();
        if (!C1E4.LJIJJLI()) {
            i = 0;
        } else {
            i = 8;
        }
        infoIconView.setVisibility(i);
        getInfoIconView().setEnabled(!C1E4.LJIJJLI());
        C9AE.LIZ(getInfoIconView(), C9AC.ALPHA, 0.0f);
        C26338AVi.LJIIIZ(this, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), AnonymousClass391.LIZJ(20), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), 20);
    }

    public final void setDarkMode(boolean z) {
        if (z) {
            TuxTextView titleTextView = getTitleTextView();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            titleTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context));
            TuxIconView infoIconView = getInfoIconView();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            infoIconView.setTintColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context2));
        }
    }

    public final void setEnterFrom(String str) {
        this.LJLJI = str;
    }

    public final void setPreviousPage(String str) {
        this.LJLJJI = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C232579Av(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = "";
        this.LJLJJI = "";
        setupView(context);
        C16880lQ.LJJJ(getInfoIconView(), new Au2S15S0100000_4(this, 1));
    }
}
