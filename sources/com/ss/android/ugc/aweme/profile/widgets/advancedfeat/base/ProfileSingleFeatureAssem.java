package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import X.C16880lQ;
import X.C221108m2;
import X.C237259Sv;
import X.C44384HbQ;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C79045V0n;
import X.C8VC;
import X.C9GK;
import X.C9ID;
import X.C9JT;
import X.C9T4;
import X.InterfaceC235069Kk;
import X.TBT;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ProfileSingleFeatureAssem extends UIContentAssem {
    public final C62822Ol8 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public Context LJLJJI;
    public boolean LJLJJL;

    public abstract Map<String, Boolean> F3();

    public abstract View I3();

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    public final void requestHide() {
        this.LJLJJL = false;
        H3().jj(x3(), F3());
    }

    public final void requestShow() {
        this.LJLJJL = true;
        H3().Ci(x3(), F3());
    }

    public abstract C9JT x3();

    public ProfileSingleFeatureAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 719));
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C9ID.class, null), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 718));
        C221108m2.LIZIZ(new AqS154S0100000_4(this, 717));
    }

    public final C9ID C3() {
        return (C9ID) this.LJLILLLLZI.getValue();
    }

    public final Context E3() {
        Context context = this.LJLJJI;
        if (context != null) {
            return context;
        }
        o.LJIJI("notNullContext");
        throw null;
    }

    public final C9GK H3() {
        return (C9GK) this.LJLIL.getValue();
    }

    public final boolean K3() {
        return ((Boolean) this.LJLJI.getValue()).booleanValue();
    }

    public final int A3() {
        ProfileFeatureBaseAssem profileFeatureBaseAssem;
        List<Map.Entry<Integer, Integer>> list;
        int id = x3().getId();
        C9GK H3 = H3();
        if ((H3 instanceof ProfileFeatureBaseAssem) && (profileFeatureBaseAssem = (ProfileFeatureBaseAssem) H3) != null && (list = profileFeatureBaseAssem.LJLJL) != null) {
            Iterator<Map.Entry<Integer, Integer>> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().getKey().intValue() == id) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        Context context = getContext();
        if (context != null) {
            this.LJLJJI = context;
            if (C76800UCe.LIZ == null) {
                return;
            }
            H3().g2(I3(), x3());
            if (C9T4.LIZ()) {
                C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9AK
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C234999Kd) obj).LIZIZ;
                    }
                }, new AqS170S0100000_4(this, 634));
            }
        }
    }

    public final void L3(View.OnClickListener onClickListener) {
        H3().u5(onClickListener, x3());
    }

    public final void M3(String text) {
        o.LJIIIZ(text, "text");
        H3().Vf(text, x3());
    }

    public final View v3(int i, int i2, View.OnClickListener onClickListener) {
        final float f;
        Float LJIIIZ;
        long currentTimeMillis = System.currentTimeMillis();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c2z, C16880lQ.LLZIL(getContext()), null);
        final TuxIconView tuxIconView = (TuxIconView) LLLZIIL.findViewById(R.id.y3);
        final TextView textView = (TextView) LLLZIIL.findViewById(R.id.y5);
        tuxIconView.setIconRes(i2);
        textView.setText(C44384HbQ.LJJZ(i));
        C16880lQ.LJIIJ(onClickListener, LLLZIIL);
        C237259Sv.LJIIL(System.currentTimeMillis() - currentTimeMillis, x3().toString());
        Context context = getContext();
        if (context != null && (LJIIIZ = C79045V0n.LJIIIZ(context)) != null) {
            f = LJIIIZ.floatValue();
        } else {
            f = 0.2f;
        }
        LLLZIIL.setOnTouchListener(new View.OnTouchListener() { // from class: X.2RW
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ViewPropertyAnimator alpha;
                ViewPropertyAnimator duration;
                ViewPropertyAnimator alpha2;
                ViewPropertyAnimator duration2;
                ViewPropertyAnimator alpha3;
                ViewPropertyAnimator duration3;
                ViewPropertyAnimator alpha4;
                ViewPropertyAnimator duration4;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    ViewPropertyAnimator animate = tuxIconView.animate();
                    if (animate != null && (alpha4 = animate.alpha(1.0f)) != null && (duration4 = alpha4.setDuration(0L)) != null) {
                        duration4.start();
                    }
                    ViewPropertyAnimator animate2 = textView.animate();
                    if (animate2 == null || (alpha3 = animate2.alpha(1.0f)) == null || (duration3 = alpha3.setDuration(0L)) == null) {
                        return false;
                    }
                    duration3.start();
                    return false;
                }
                ViewPropertyAnimator animate3 = tuxIconView.animate();
                if (animate3 != null && (alpha2 = animate3.alpha(f)) != null && (duration2 = alpha2.setDuration(0L)) != null) {
                    duration2.start();
                }
                ViewPropertyAnimator animate4 = textView.animate();
                if (animate4 == null || (alpha = animate4.alpha(f)) == null || (duration = alpha.setDuration(0L)) == null) {
                    return false;
                }
                duration.start();
                return false;
            }
        });
        return LLLZIIL;
    }
}
