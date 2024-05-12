package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OLd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61745OLd extends RelativeLayout implements OLP {
    public final boolean LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.OLP
    public final void hide() {
    }

    @Override // X.OLP
    public final void show() {
    }

    @Override // X.OLP
    public final void LIZ() {
        setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C61745OLd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61745OLd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ContextThemeWrapper contextThemeWrapper;
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        boolean LIZ = C52935Kq3.LIZ();
        this.LJLIL = LIZ;
        setLayoutParams(new RelativeLayout.LayoutParams(-1, C7MY.LIZIZ(56)));
        if (LIZ) {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.vt);
        } else {
            contextThemeWrapper = new ContextThemeWrapper(context, R.style.ux);
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(contextThemeWrapper), R.layout.apm, this, true);
        if (LIZ) {
            ((SmartImageView) LIZIZ(R.id.f92)).setPlaceholderImage(C79045V0n.LJIIIIZZ(R.attr.cj, context));
            ((TuxTextView) LIZIZ(R.id.mfc)).setTextColorRes(R.attr.d6);
            ((TuxTextView) LIZIZ(R.id.mex)).setTextColorRes(R.attr.d5);
            ((TuxTextView) LIZIZ(R.id.mfb)).setTextColorRes(R.attr.d5);
            ((TuxTextView) LIZIZ(R.id.mf2)).setTextColorRes(R.attr.d9);
        } else {
            ((SmartImageView) LIZIZ(R.id.f92)).setPlaceholderImage(C79045V0n.LJIIIIZZ(R.attr.d2, context));
            ((TuxTextView) LIZIZ(R.id.mfc)).setTextColorRes(R.attr.dl);
            ((TuxTextView) LIZIZ(R.id.mex)).setTextColorRes(R.attr.dj);
            ((TuxTextView) LIZIZ(R.id.mfb)).setTextColorRes(R.attr.dj);
            ((TuxTextView) LIZIZ(R.id.mf2)).setTextColorRes(R.attr.dm);
        }
        TextPaint paint = ((TextView) LIZIZ(R.id.mf2)).getPaint();
        if (paint != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ef, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d2, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r21, com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse.ProductDetail r22, X.InterfaceC61746OLe r23) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61745OLd.LIZJ(int, com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse$ProductDetail, X.OLe):void");
    }
}
