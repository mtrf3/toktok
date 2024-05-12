package X;

import Y.ACListenerS42S0200000_7;
import Y.ALAdapterS5S0200000_7;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hxh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45765Hxh extends LinearLayout {
    public final C45548HuC LJLIL;
    public View LJLILLLLZI;
    public C29701Eo LJLJI;
    public InterfaceC45767Hxj LJLJJI;
    public EnumC45766Hxi LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    private final String getAutoCutAnimRes() {
        int LIZ = C00F.LIZ(31744, 0, "autocut_album_entrance_new_icon", true);
        if (LIZ != 1) {
            if (LIZ != 2) {
                return "autocut_icon_animation.json";
            }
            return "autocut_icon_anim_2.json";
        }
        return "autocut_icon_anim_1.json";
    }

    private final ObjectAnimator getHideAnim() {
        return (ObjectAnimator) this.LJLJL.getValue();
    }

    private final ObjectAnimator getShowAnim() {
        return (ObjectAnimator) this.LJLJJLL.getValue();
    }

    public final void LIZ() {
        C29701Eo c29701Eo;
        if (this.LJLJJL == EnumC45766Hxi.SHOWING) {
            getShowAnim().cancel();
        }
        if (this.LJLJJL == EnumC45766Hxi.GUIDING && (c29701Eo = this.LJLJI) != null) {
            c29701Eo.cancelAnimation();
        }
    }

    public final void LIZJ() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        } else {
            o.LJIJI("autoCutBtn");
            throw null;
        }
    }

    public final void LIZLLL() {
        EnumC45766Hxi enumC45766Hxi = this.LJLJJL;
        if (enumC45766Hxi == EnumC45766Hxi.SHOWING || enumC45766Hxi == EnumC45766Hxi.GUIDING) {
            LIZ();
        } else {
            View view = this.LJLILLLLZI;
            if (view != null) {
                if (view.getVisibility() == 8) {
                    return;
                }
            } else {
                o.LJIJI("autoCutBtn");
                throw null;
            }
        }
        getHideAnim().start();
        this.LJLJJL = EnumC45766Hxi.HIDING;
    }

    public final void LJ() {
        EnumC45766Hxi enumC45766Hxi;
        EnumC45766Hxi enumC45766Hxi2 = this.LJLJJL;
        if (enumC45766Hxi2 == EnumC45766Hxi.SHOWING || enumC45766Hxi2 == (enumC45766Hxi = EnumC45766Hxi.GUIDING)) {
            return;
        }
        if (enumC45766Hxi2 == EnumC45766Hxi.HIDING) {
            getHideAnim().cancel();
        }
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(0);
            if (this.LJLIL.LIZ.getBoolean("autocut_guide_should_show", true)) {
                this.LJLIL.LIZ.storeBoolean("autocut_guide_should_show", false);
                C29701Eo c29701Eo = this.LJLJI;
                if (c29701Eo != null) {
                    c29701Eo.addAnimatorListener(new ALAdapterS5S0200000_7(this, c29701Eo, 1));
                    c29701Eo.playAnimation();
                    this.LJLJJL = enumC45766Hxi;
                    return;
                }
                return;
            }
            InterfaceC45767Hxj interfaceC45767Hxj = this.LJLJJI;
            if (interfaceC45767Hxj == null) {
                return;
            }
            interfaceC45767Hxj.LIZ(false);
            return;
        }
        o.LJIJI("autoCutBtn");
        throw null;
    }

    public final void LJFF() {
        if (this.LJLJJL == EnumC45766Hxi.HIDING) {
            getHideAnim().cancel();
        } else {
            View view = this.LJLILLLLZI;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    return;
                }
            } else {
                o.LJIJI("autoCutBtn");
                throw null;
            }
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            view2.setAlpha(0.0f);
            View view3 = this.LJLILLLLZI;
            if (view3 != null) {
                view3.setVisibility(0);
                getShowAnim().start();
                this.LJLJJL = EnumC45766Hxi.SHOWING;
                return;
            }
            o.LJIJI("autoCutBtn");
            throw null;
        }
        o.LJIJI("autoCutBtn");
        throw null;
    }

    public final void LIZIZ() {
        getShowAnim().end();
        C29701Eo c29701Eo = this.LJLJI;
        if (c29701Eo != null) {
            c29701Eo.cancelAnimation();
        }
        InterfaceC45767Hxj interfaceC45767Hxj = this.LJLJJI;
        if (interfaceC45767Hxj != null) {
            interfaceC45767Hxj.LIZIZ();
        }
    }

    public final void setAnimListener(InterfaceC45767Hxj animListener) {
        o.LJIIIZ(animListener, "animListener");
        this.LJLJJI = animListener;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new ACListenerS42S0200000_7(this, onClickListener, 9));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45765Hxh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        a1.LJFF(context, "context");
        this.LJLIL = new C45548HuC();
        this.LJLJJL = EnumC45766Hxi.NONE;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 434));
        this.LJLJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 433));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.i8, C16880lQ.LLZIL(getContext()), this);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…uto_cut_btn_layout, this)");
        this.LJLILLLLZI = LLLZIIL;
        if (!HRX.LJI()) {
            View view = this.LJLILLLLZI;
            if (view != null) {
                view.findViewById(R.id.ej7).setVisibility(0);
                View view2 = this.LJLILLLLZI;
                if (view2 != null) {
                    this.LJLJI = (C29701Eo) view2.findViewById(R.id.g_y);
                } else {
                    o.LJIJI("autoCutBtn");
                    throw null;
                }
            } else {
                o.LJIJI("autoCutBtn");
                throw null;
            }
        }
        C29701Eo c29701Eo = this.LJLJI;
        if (c29701Eo != null) {
            c29701Eo.setAnimation(getAutoCutAnimRes());
        }
        View view3 = this.LJLILLLLZI;
        if (view3 != null) {
            View findViewById = view3.findViewById(R.id.azq);
            o.LJIIIIZZ(findViewById, "autoCutBtn.findViewById(R.id.btn_text)");
            TextView textView = (TextView) findViewById;
            Context context2 = getContext();
            if (C00F.LIZ(31744, 0, "autocut_album_entrance_name", true) == 1) {
                i = R.string.e23;
            } else {
                i = R.string.e1v;
            }
            textView.setText(context2.getString(i));
            return;
        }
        o.LJIJI("autoCutBtn");
        throw null;
    }
}
