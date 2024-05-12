package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113534cv extends FrameLayout {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public final View getCapsuleInnerView() {
        View pv_entrance_capsule_container = LIZ(R.id.igu);
        o.LJIIIIZZ(pv_entrance_capsule_container, "pv_entrance_capsule_container");
        return pv_entrance_capsule_container;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113534cv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = C7MY.LIZIZ(20);
        this.LJLILLLLZI = C7MY.LIZIZ(5);
        this.LJLJI = C7MY.LIZIZ(10);
        FrameLayout.inflate(context, R.layout.c8v, this);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.ck);
        c110614Vt.LIZJ = C61328O5c.LIZJ(46);
        setBackground(c110614Vt.LIZ(context));
    }

    public final void LIZIZ(SmartAvatarImageView smartAvatarImageView, UrlModel urlModel) {
        if (urlModel != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJIILIIL(J7H.LIZ(100));
            int i = this.LJLIL;
            LJII.LJII = i;
            LJII.LJIIIIZZ = i;
            LJII.LJJIJIIJIL = true;
            LJII.LJJIIJ = smartAvatarImageView;
            C16880lQ.LLJJJ(LJII);
            smartAvatarImageView.setVisibility(0);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bind");
            LIZ.append(urlModel.getUri());
            X1D.LIZIZ(LIZ);
        }
    }
}
