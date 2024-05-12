package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.62Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62Q extends FrameLayout {
    public static final UrlModel LJLL = new UrlModel();
    public SmartImageView LJLIL;
    public C72434Sbm LJLILLLLZI;
    public TuxIconView LJLJI;
    public C29701Eo LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public ValueAnimator LJLJL;
    public long LJLJLJ;
    public int LJLJLLL;

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LJLJL;
        if (valueAnimator != null) {
            valueAnimator.resume();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setDuration(6000L);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 11));
        this.LJLJL = ofFloat;
        ofFloat.start();
    }

    public final ViewGroup.LayoutParams getIconLayoutParams() {
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            o.LJIIIIZZ(layoutParams, "toolIv.layoutParams");
            return layoutParams;
        }
        o.LJIJI("toolIv");
        throw null;
    }

    public final View getSelectedIcon() {
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("toolSelected");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLJL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJLJL = null;
    }

    public final int getType() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62Q(Context context) {
        super(context);
        new LinkedHashMap();
        int LIZ = (int) C74275TDb.LIZ(28.0f);
        this.LJLJJL = LIZ;
        this.LJLJJLL = LIZ;
        this.LJLJLLL = -1;
        Object LLILL = C16880lQ.LLILL(getContext(), "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        C16880lQ.LLLZIIL(R.layout.bde, (LayoutInflater) LLILL, this);
        View findViewById = findViewById(R.id.azw);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.btn_tool_iv)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.grh);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.music_cover)");
        this.LJLILLLLZI = (C72434Sbm) findViewById2;
        View findViewById3 = findViewById(R.id.azy);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.btn_tool_iv_selected)");
        this.LJLJI = (TuxIconView) findViewById3;
        View findViewById4 = findViewById(R.id.fg3);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.lav_star)");
        this.LJLJJI = (C29701Eo) findViewById4;
    }

    public final void LIZ(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LJLJI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                return;
            } else {
                o.LJIJI("toolSelected");
                throw null;
            }
        }
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        } else {
            o.LJIJI("toolSelected");
            throw null;
        }
    }

    public final void setIcon(ImageUrlModel urlModel) {
        o.LJIIIZ(urlModel, "urlModel");
        W5F LJII = W5U.LJII(urlModel);
        LJII.LJIIL = 0;
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            LJII.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJII);
        } else {
            o.LJIJI("toolIv");
            throw null;
        }
    }

    public final void setSelectIconView(int i) {
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
        } else {
            o.LJIJI("toolSelected");
            throw null;
        }
    }

    public final void setType(int i) {
        this.LJLJLLL = i;
    }

    public final void setIcon(int i) {
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            smartImageView.setImageDrawable(C04270Et.LIZIZ(smartImageView.getContext(), i));
        } else {
            o.LJIJI("toolIv");
            throw null;
        }
    }

    public final void setIcon(Drawable icon) {
        o.LJIIIZ(icon, "icon");
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            smartImageView.setImageDrawable(icon);
        } else {
            o.LJIJI("toolIv");
            throw null;
        }
    }
}
