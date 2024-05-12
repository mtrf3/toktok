package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.2mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68692mn extends LinearLayout implements InterfaceC68712mp {
    public final TuxIconView LJLIL;
    public final TuxTextView LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68692mn(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.a7_, C16880lQ.LLZIL(context), this);
        this.LJLIL = (TuxIconView) findViewById(R.id.jyp);
        this.LJLILLLLZI = (TuxTextView) findViewById(R.id.jyq);
    }

    @Override // X.InterfaceC68712mp
    public void setContent(C68722mq tooltipConfig) {
        TuxTextView tuxTextView;
        o.LJIIIZ(tooltipConfig, "tooltipConfig");
        Bitmap bitmap = tooltipConfig.LIZJ;
        if (bitmap != null) {
            C1M5 c1m5 = new C1M5(getContext().getResources(), bitmap);
            c1m5.LIZJ(C32151Nz.LJIIZILJ(4));
            TuxIconView tuxIconView = this.LJLIL;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(c1m5);
            }
            TuxIconView tuxIconView2 = this.LJLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
        }
        String str = tooltipConfig.LIZLLL;
        if (str != null) {
            TuxTextView tuxTextView2 = this.LJLILLLLZI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(str);
            }
            TuxTextView tuxTextView3 = this.LJLILLLLZI;
            if (tuxTextView3 != null) {
                tuxTextView3.setVisibility(0);
            }
        }
        if (tooltipConfig.LIZJ == null && tooltipConfig.LIZLLL != null && (tuxTextView = this.LJLILLLLZI) != null) {
            C26338AVi.LJI(tuxTextView, AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), false, 16);
        }
    }
}
