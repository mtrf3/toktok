package X;

import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MO3 extends ConstraintLayout implements MO1 {
    public MO7 LJLIL;
    public C73318Sq2 LJLILLLLZI;
    public String LJLJI;
    public java.util.Map<String, String> LJLJJI;
    public MO6 LJLJJL;
    public final String LJLJJLL;
    public C96533qb LJLJL;
    public boolean LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJLLL;
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

    @Override // X.MO1
    public View getContainer() {
        return this;
    }

    public final boolean LJJLJLI() {
        C96533qb c96533qb = this.LJLJL;
        if (c96533qb == null || c96533qb.LIZIZ == -1) {
            return false;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hlo);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hlo).getLayoutParams();
        int i = c96533qb.LIZIZ;
        layoutParams.width = i;
        layoutParams.height = i;
        _$_findCachedViewById.setLayoutParams(layoutParams);
        return true;
    }

    @Override // X.MO1
    public final void LJIIJ() {
        ((ImageView) _$_findCachedViewById(R.id.hlr)).setVisibility(8);
    }

    @Override // X.MO1
    public final void LJJLIIIJ(C96533qb c96533qb) {
        boolean z;
        C96533qb c96533qb2;
        if (o.LJ(this.LJLJL, c96533qb)) {
            return;
        }
        this.LJLJL = c96533qb;
        LJJLJLI();
        if (c96533qb.LJ != -1) {
            z = true;
        } else {
            z = false;
        }
        C96533qb c96533qb3 = null;
        if (z) {
            c96533qb2 = c96533qb;
        } else {
            c96533qb2 = null;
        }
        if (c96533qb2 != null) {
            ((TuxTextView) _$_findCachedViewById(R.id.hmd)).setTuxFont(c96533qb2.LJ);
        }
        if (c96533qb.LJFF != -1) {
            ((TuxTextView) _$_findCachedViewById(R.id.hmd)).LJJJ(c96533qb.LJFF);
        }
        if (c96533qb.LJI != -1) {
            c96533qb3 = c96533qb;
        }
        if (c96533qb3 != null) {
            ((TuxTextView) _$_findCachedViewById(R.id.hlx)).setTuxFont(c96533qb3.LJI);
        }
        if (c96533qb.LJII != -1) {
            ((TuxTextView) _$_findCachedViewById(R.id.hlx)).LJJJ(c96533qb.LJII);
        }
        if (c96533qb.LJIIIIZZ != -1) {
            ((TextView) _$_findCachedViewById(R.id.hlx)).setTextColor(c96533qb.LJIIIIZZ);
        }
        if (c96533qb.LJIIJ != -1 && (_$_findCachedViewById(R.id.hlx).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.hlx);
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hlx).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = c96533qb.LJIIJ;
            _$_findCachedViewById.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // X.MO1
    public void setActionListener(MO7 actionListener) {
        o.LJIIIZ(actionListener, "actionListener");
        this.LJLIL = actionListener;
    }

    @Override // X.MO1
    public void setEnterFrom(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLJI = enterFrom;
    }

    public final void setStyle(MO6 scenario) {
        o.LJIIIZ(scenario, "scenario");
        if (this.LJLJJL == scenario) {
            return;
        }
        this.LJLJJL = scenario;
        if (LJJLJLI()) {
            return;
        }
        if (MO4.LIZ[scenario.ordinal()] == 1) {
            C26338AVi.LJIIIZ(this, AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(8), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 16);
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(40));
            View _$_findCachedViewById = _$_findCachedViewById(R.id.hlo);
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hlo).getLayoutParams();
            layoutParams.width = LJJIIZ;
            layoutParams.height = LJJIIZ;
            _$_findCachedViewById.setLayoutParams(layoutParams);
            ((TuxIconView) _$_findCachedViewById(R.id.hlo)).setIconWidth(LJJIIZ);
            ((TuxIconView) _$_findCachedViewById(R.id.hlo)).setIconHeight(LJJIIZ);
            return;
        }
        C26338AVi.LJIIIZ(this, AnonymousClass391.LIZJ(16), AnonymousClass391.LIZJ(10), AnonymousClass391.LIZJ(8), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), 16);
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.hlo);
        ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.hlo).getLayoutParams();
        layoutParams2.width = LJJIIZ2;
        layoutParams2.height = LJJIIZ2;
        _$_findCachedViewById2.setLayoutParams(layoutParams2);
        ((TuxIconView) _$_findCachedViewById(R.id.hlo)).setIconWidth(LJJIIZ2);
        ((TuxIconView) _$_findCachedViewById(R.id.hlo)).setIconHeight(LJJIIZ2);
    }

    @Override // X.MO1
    public void setUFRExternalParams(java.util.Map<String, String> extParams) {
        o.LJIIIZ(extParams, "extParams");
        this.LJLJJI = extParams;
        if (this.LJLJLJ || !o.LJ("bottom", extParams.get("position"))) {
            return;
        }
        this.LJLJLJ = true;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hly);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hly).getLayoutParams();
        layoutParams.width = C7MY.LIZIZ(LiveTryModeCountDownThresholdSetting.DEFAULT);
        _$_findCachedViewById.setLayoutParams(layoutParams);
    }

    @Override // X.MO1
    public void setUFRSubscription(C73318Sq2 subscription) {
        o.LJIIIZ(subscription, "subscription");
        this.LJLILLLLZI = subscription;
    }

    @Override // X.MO1
    public final void LJJIFFI(MO5 type, MO6 mo6) {
        int i;
        int i2;
        o.LJIIIZ(type, "type");
        if (mo6 != null) {
            setStyle(mo6);
        }
        if (type == MO5.CONTACT) {
            ((TuxIconView) _$_findCachedViewById(R.id.hlo)).setIconRes(R.raw.icon_color_contact_circle);
            if (C52454KiI.LIZ()) {
                i = R.string.hbz;
                i2 = R.string.hby;
            } else {
                i = R.string.dva;
                i2 = R.string.dv_;
            }
            ((TextView) _$_findCachedViewById(R.id.hmd)).setText(i);
            ((TextView) _$_findCachedViewById(R.id.hlx)).setText(i2);
        } else if (type == MO5.FACEBOOK) {
            ((TuxIconView) _$_findCachedViewById(R.id.hlo)).setIconRes(R.raw.icon_color_facebook_circle);
            ((TextView) _$_findCachedViewById(R.id.hmd)).setText(R.string.gau);
            ((TextView) _$_findCachedViewById(R.id.hlx)).setText(R.string.gat);
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS44S0200000_9(type, this, 49)));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.hlr), new ACListenerS44S0200000_9(type, this, 50));
    }

    public MO3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Float valueOf;
        this.LJLJI = "";
        this.LJLJJL = MO6.INBOX_SMALL;
        this.LJLJJLL = "click";
        C16880lQ.LLLZIIL(R.layout.bdt, C16880lQ.LLZIL(context), this);
        setLayoutParams(new C018905p(-1, -2));
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hly);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        if (C99W.LIZ) {
            valueOf = C61328O5c.LIZJ(5);
        } else {
            valueOf = Float.valueOf(C32151Nz.LJIIZILJ(2));
        }
        c110614Vt.LIZJ = valueOf;
        _$_findCachedViewById.setBackground(c110614Vt.LIZ(context));
        View permission_find_btn = _$_findCachedViewById(R.id.hly);
        o.LJIIIIZZ(permission_find_btn, "permission_find_btn");
        C78897Uxp.LJJJJJL(permission_find_btn, C32151Nz.LJIIZILJ(2));
        C26338AVi.LJIIIZ(this, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(8), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 16);
    }
}
