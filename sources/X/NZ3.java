package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZ3 extends FrameLayout {
    public NZ4 LJLIL;
    public C59314NPq LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C59314NPq getCrossPlatformParams() {
        return this.LJLILLLLZI;
    }

    public final NZ4 getTitleWrap() {
        return this.LJLIL;
    }

    public final void setBackgroundAlpha(float f) {
        LIZ(R.id.aj1).setAlpha(f);
    }

    public final void setCrossPlatformParams(C59314NPq c59314NPq) {
        String str;
        int i;
        this.LJLILLLLZI = c59314NPq;
        if (c59314NPq == null) {
            return;
        }
        TextView textView = (TextView) LIZ(R.id.title);
        if (TextUtils.isEmpty(c59314NPq.LIZJ.LJ)) {
            str = getContext().getString(R.string.rkd);
        } else {
            str = c59314NPq.LIZJ.LJ;
        }
        textView.setText(str);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.j2p), new ACListenerS30S0100000_10(this, 141));
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.bfl), new ACListenerS30S0100000_10(this, 142));
        C16880lQ.LJJIJIIJIL((C116474hf) LIZ(R.id.bfd), new ACListenerS30S0100000_10(this, 143));
        if (c59314NPq.LIZJ.LIZJ) {
            ((ImageView) LIZ(R.id.j2p)).setVisibility(8);
        }
        View LIZ = LIZ(R.id.frt);
        if (c59314NPq.LIZJ.LJJIIZI) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ.setVisibility(i);
        C16880lQ.LJJIJIIJIL((C116474hf) LIZ(R.id.az6), new ACListenerS30S0100000_10(this, 144));
        if (TextUtils.equals(c59314NPq.LIZJ.LJIIIZ, "1")) {
            ((ImageView) LIZ(R.id.bfl)).setVisibility(8);
        } else {
            ((ImageView) LIZ(R.id.bfl)).setVisibility(0);
        }
        if (c59314NPq.LIZJ.LJFF != -2) {
            LIZ(R.id.title).setBackground(new ColorDrawable(c59314NPq.LIZJ.LJFF));
            setBackgroundColor(c59314NPq.LIZJ.LJFF);
        }
        if (c59314NPq.LIZJ.LJII != -2) {
            ((TextView) LIZ(R.id.title)).setTextColor(c59314NPq.LIZJ.LJII);
            Context context = getContext();
            if (context != null) {
                C40681ii LIZ2 = C40681ii.LIZ(context.getResources(), R.drawable.alk, context.getTheme());
                if (LIZ2 != null) {
                    LIZ2.setTint(c59314NPq.LIZJ.LJII);
                }
                ((TuxIconView) LIZ(R.id.bfl)).setImageDrawable(LIZ2);
            }
        }
        if (c59314NPq.LIZJ.LIZJ) {
            ((ImageView) LIZ(R.id.az6)).setVisibility(8);
        }
        if (c59314NPq.LIZJ.LIZLLL) {
            if (AwemeService.LIZ().o6(c59314NPq.LIZ.LJIIIZ) != null) {
                ((ImageView) LIZ(R.id.iwu)).setVisibility(0);
                C16880lQ.LJJJ((TuxIconView) LIZ(R.id.iwu), new ACListenerS30S0100000_10(this, 145));
            }
            ((ImageView) LIZ(R.id.az6)).setVisibility(8);
        }
        int i2 = c59314NPq.LIZJ.LJJII;
        if (i2 == 2) {
            ((ImageView) LIZ(R.id.az6)).setVisibility(0);
            ((ImageView) LIZ(R.id.iwu)).setVisibility(8);
        } else if (i2 == 1) {
            ((ImageView) LIZ(R.id.az6)).setVisibility(8);
            ((ImageView) LIZ(R.id.iwu)).setVisibility(0);
        }
        if (!TextUtils.isEmpty(c59314NPq.LIZ.LJIILJJIL)) {
            ((ImageView) LIZ(R.id.ixa)).setVisibility(0);
            C16880lQ.LJJJ((TuxIconView) LIZ(R.id.ixa), new ACListenerS30S0100000_10(this, 146));
            ((ImageView) LIZ(R.id.iwu)).setVisibility(8);
            ((ImageView) LIZ(R.id.az6)).setVisibility(8);
        }
        if (!NWB.LIZIZ(c59314NPq)) {
            return;
        }
        ((ImageView) LIZ(R.id.bfd)).setVisibility(0);
        ((ImageView) LIZ(R.id.bfl)).setVisibility(8);
        ((ImageView) LIZ(R.id.j2p)).setVisibility(0);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.j2p), new ACListenerS45S0200000_10(c59314NPq, this, 28));
        ((ImageView) LIZ(R.id.ixa)).setVisibility(8);
        ((ImageView) LIZ(R.id.iwu)).setVisibility(8);
        ((ImageView) LIZ(R.id.az6)).setVisibility(8);
    }

    public final void setTitle(CharSequence charSequence) {
        ((TextView) LIZ(R.id.title)).setText(charSequence);
    }

    public final void setTitleWrap(NZ4 nz4) {
        this.LJLIL = nz4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NZ3(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        this.LJLJI = new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ajp, this, true);
        setBackgroundResource(R.drawable.bno);
        setMinimumHeight((int) getResources().getDimension(R.dimen.a8q));
    }
}
