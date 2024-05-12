package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.35q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C783435q extends AbstractC783535r {
    public final int LJLJJI;

    @Override // X.AbstractC783535r
    public int getResourceId() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783435q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = R.layout.b38;
        View LLLZIIL = C16880lQ.LLLZIIL(getResourceId(), C16880lQ.LLZIL(context), this);
        View findViewById = LLLZIIL.findViewById(R.id.lao);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.title_tv)");
        setTitleTv((TuxTextView) findViewById);
        View findViewById2 = LLLZIIL.findViewById(R.id.ks_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.subtitle_tv)");
        setSubtitleTv((TuxTextView) findViewById2);
        View findViewById3 = LLLZIIL.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.avatar_iv)");
        setAvatarIv((C62846OlW) findViewById3);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.ct);
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        setBackground(c110614Vt.LIZ(context));
    }
}
