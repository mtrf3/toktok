package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.96W, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96W extends C96X {
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final TuxIconView LJLJJI;
    public final TuxTextView LJLJJL;

    public final void LIZ(boolean z) {
        int i;
        int i2;
        if (this.LJLIL) {
            this.LJLJJI.setIconRes(this.LJLJI);
            TuxIconView tuxIconView = this.LJLJJI;
            int i3 = R.attr.dj;
            if (z) {
                i2 = R.attr.dj;
            } else {
                i2 = R.attr.go;
            }
            tuxIconView.setTintColorRes(i2);
            TuxTextView tuxTextView = this.LJLJJL;
            if (!z) {
                i3 = R.attr.go;
            }
            tuxTextView.setTextColorRes(i3);
            return;
        }
        this.LJLJJI.setIconRes(this.LJLILLLLZI);
        TuxIconView tuxIconView2 = this.LJLJJI;
        int i4 = R.attr.dl;
        if (z) {
            i = R.attr.dl;
        } else {
            i = R.attr.gw;
        }
        tuxIconView2.setTintColorRes(i);
        TuxTextView tuxTextView2 = this.LJLJJL;
        if (!z) {
            i4 = R.attr.gw;
        }
        tuxTextView2.setTextColorRes(i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C96W(Context context, int i, int i2, String str) {
        super(context);
        new LinkedHashMap();
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        View.inflate(context, R.layout.bfy, this);
        View findViewById = findViewById(R.id.e6h);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.home_tab_title_img)");
        this.LJLJJI = (TuxIconView) findViewById;
        View findViewById2 = findViewById(R.id.e6i);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.home_tab_title_text)");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.LJLJJL = tuxTextView;
        tuxTextView.setText(str);
        setBackgroundResource(R.drawable.bm6);
    }
}
