package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85403Wu extends FrameLayout implements NNO {
    public final java.util.Map<Integer, View> LJLIL;

    public final View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLIL;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85403Wu(Context context) {
        super(context, null);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.bzc, this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        setLayoutParams(layoutParams);
        C7GV.LIZ(4, LIZIZ(R.id.a49));
    }

    @Override // X.NNO
    public final void LIZ(ViewGroup rootView) {
        ViewGroup viewGroup;
        o.LJIIIZ(rootView, "rootView");
        if (rootView.indexOfChild(this) != -1) {
            return;
        }
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this, viewGroup);
        }
        rootView.addView(this);
    }

    @Override // X.NNO
    public void setAnchorImg(UrlModel urlModel) {
        if (urlModel != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJJIIJ = (SmartImageView) LIZIZ(R.id.a29);
            C16880lQ.LLJJJ(LJII);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        VA9 va9 = (VA9) LIZIZ(R.id.a29);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_anchor_product;
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = C7MY.LIZIZ(20);
        Context context = LIZIZ(R.id.a29).getContext();
        o.LJIIIIZZ(context, "anchor_img.context");
        va9.setImageDrawable(c2068389v.LIZ(context));
    }

    @Override // X.NNO
    public void setAnchorTitle(String anchorTitle) {
        o.LJIIIZ(anchorTitle, "anchorTitle");
        ((TextView) LIZIZ(R.id.a4n)).setText(anchorTitle);
    }
}
