package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.views.IDlS17S0200000_2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.61e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536261e extends FrameLayout {
    public static final int LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(2));
    public static final int LJLJLJ = C7MY.LIZIZ(48);
    public C170466mY LJLIL;
    public SmartImageView LJLILLLLZI;
    public C164106cI LJLJI;
    public TuxIconView LJLJJI;
    public SmartImageView LJLJJL;
    public InterfaceC88473Ynt<? super SmartImageView, ? super TextView, ? super Integer, C76800UCe> LJLJJLL;

    public final ViewGroup.LayoutParams getIconLayoutParams() {
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            o.LJIIIIZZ(layoutParams, "mToolIv.layoutParams");
            return layoutParams;
        }
        o.LJIJI("mToolIv");
        throw null;
    }

    public final int getTextWidth$tools_camera_edit_release() {
        C170466mY c170466mY = this.LJLIL;
        if (c170466mY != null) {
            return c170466mY.getLayoutParams().width;
        }
        o.LJIJI("mToolTv");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536261e(Context context) {
        super(context);
        new LinkedHashMap();
        Object LLILL = C16880lQ.LLILL(getContext(), "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        C16880lQ.LLLZIIL(R.layout.dsl, (LayoutInflater) LLILL, this);
        View findViewById = findViewById(R.id.azz);
        o.LJIIIIZZ(findViewById, "this.findViewById(R.id.btn_tool_tv)");
        this.LJLIL = (C170466mY) findViewById;
        View findViewById2 = findViewById(R.id.azw);
        o.LJIIIIZZ(findViewById2, "this.findViewById(R.id.btn_tool_iv)");
        this.LJLILLLLZI = (SmartImageView) findViewById2;
        View findViewById3 = findViewById(R.id.fbk);
        o.LJIIIIZZ(findViewById3, "this.findViewById(R.id.iv_tool_cross)");
        this.LJLJI = (C164106cI) findViewById3;
        View findViewById4 = findViewById(R.id.azy);
        o.LJIIIIZZ(findViewById4, "this.findViewById(R.id.btn_tool_iv_selected)");
        this.LJLJJI = (TuxIconView) findViewById4;
        View findViewById5 = findViewById(R.id.f57);
        o.LJIIIIZZ(findViewById5, "this.findViewById(R.id.iv_icon_shadow)");
        this.LJLJJL = (SmartImageView) findViewById5;
    }

    public final void LIZ(CharSequence charSequence) {
        C170466mY c170466mY = this.LJLIL;
        if (c170466mY != null) {
            c170466mY.setAlpha(0.5f);
            SmartImageView smartImageView = this.LJLILLLLZI;
            if (smartImageView != null) {
                smartImageView.setAlpha(0.5f);
                setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS17S0200000_2(this, charSequence, 2)));
                return;
            } else {
                o.LJIJI("mToolIv");
                throw null;
            }
        }
        o.LJIJI("mToolTv");
        throw null;
    }

    public final void LIZIZ(int i) {
        InterfaceC88473Ynt<? super SmartImageView, ? super TextView, ? super Integer, C76800UCe> interfaceC88473Ynt = this.LJLJJLL;
        if (interfaceC88473Ynt != null) {
            SmartImageView smartImageView = this.LJLILLLLZI;
            if (smartImageView != null) {
                C170466mY c170466mY = this.LJLIL;
                if (c170466mY != null) {
                    interfaceC88473Ynt.invoke(smartImageView, c170466mY, Integer.valueOf(i));
                    return;
                } else {
                    o.LJIJI("mToolTv");
                    throw null;
                }
            }
            o.LJIJI("mToolIv");
            throw null;
        }
    }

    public final void LIZJ(boolean z) {
        int i;
        C164106cI c164106cI = this.LJLJI;
        if (c164106cI != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            c164106cI.setVisibility(i);
            return;
        }
        o.LJIJI("mToolCross");
        throw null;
    }

    public final void LIZLLL(String lottiePath) {
        o.LJIIIZ(lottiePath, "lottiePath");
        if (getContext() == null) {
            return;
        }
        C29701Eo c29701Eo = new C29701Eo(getContext());
        c29701Eo.setLayoutParams(new FrameLayout.LayoutParams(-1, LJLJLJ));
        addView(c29701Eo);
        c29701Eo.setAnimation(lottiePath);
        c29701Eo.setRepeatCount(1);
        c29701Eo.setRepeatMode(1);
        c29701Eo.post(new ARunnableS38S0100000_2(c29701Eo, 66));
    }

    public final void LJ(boolean z) {
        int i;
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
            return;
        }
        o.LJIJI("toolSelected");
        throw null;
    }

    public final void setContentDescription(int i) {
        C170466mY c170466mY = this.LJLIL;
        if (c170466mY != null) {
            c170466mY.setContentDescription(getContext().getString(i));
        } else {
            o.LJIJI("mToolTv");
            throw null;
        }
    }

    public final void setIcon(ImageUrlModel urlModel) {
        o.LJIIIZ(urlModel, "urlModel");
        W5F LJII = W5U.LJII(urlModel);
        LJII.LJIIL = 0;
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            LJII.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJII);
        } else {
            o.LJIJI("mToolIv");
            throw null;
        }
    }

    public final void setIconPadding(int i) {
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            C26338AVi.LJIIIZ(smartImageView, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), 16);
        } else {
            o.LJIJI("mToolIv");
            throw null;
        }
    }

    public final void setRawIcon(int i) {
        ViewGroup.LayoutParams iconLayoutParams = getIconLayoutParams();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZJ = iconLayoutParams.height - O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        c2068389v.LIZIZ = iconLayoutParams.width - O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setIcon(c2068389v.LIZ(context));
    }

    public final void setText(int i) {
        C170466mY c170466mY = this.LJLIL;
        if (c170466mY != null) {
            c170466mY.setText(getContext().getString(i));
            C170466mY c170466mY2 = this.LJLIL;
            if (c170466mY2 != null) {
                if (c170466mY2.getText().equals(getContext().getString(R.string.fr1))) {
                    Keva repo = Keva.getRepo("add_motion_tab");
                    if (C00F.LIZ(31744, 0, "edit_effect_category_add_motion", true) == 2 && repo.getBoolean("is_first_click_effect_reddot", true)) {
                        repo.storeBoolean("is_first_click_effect_reddot", false);
                        findViewById(R.id.isy).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("mToolTv");
            throw null;
        }
        o.LJIJI("mToolTv");
        throw null;
    }

    public final void setIcon(int i) {
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            smartImageView.setImageDrawable(C04270Et.LIZIZ(smartImageView.getContext(), i));
        } else {
            o.LJIJI("mToolIv");
            throw null;
        }
    }

    public final void setText(String text) {
        o.LJIIIZ(text, "text");
        C170466mY c170466mY = this.LJLIL;
        if (c170466mY != null) {
            c170466mY.setText(text);
        } else {
            o.LJIJI("mToolTv");
            throw null;
        }
    }

    public final void setIcon(Drawable icon) {
        o.LJIIIZ(icon, "icon");
        SmartImageView smartImageView = this.LJLILLLLZI;
        if (smartImageView != null) {
            smartImageView.setImageDrawable(icon);
        } else {
            o.LJIJI("mToolIv");
            throw null;
        }
    }
}
