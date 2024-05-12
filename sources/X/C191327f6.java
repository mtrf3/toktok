package X;

import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191327f6 extends FrameLayout {
    public final ViewGroup LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public C191207eu LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191327f6(Context context) {
        super(context, null);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c0y, this, true);
        View findViewById = findViewById(R.id.ge7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.map_lynx_holder)");
        this.LJLIL = (ViewGroup) findViewById;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCameraMoveListener$poi_release(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public final void LIZ(boolean z, C191337f7 c191337f7, AqS180S0100000_14 aqS180S0100000_14) {
        Context context;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        if (z) {
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(aqS180S0100000_14, 1648);
            AqS92S0300000_3 aqS92S0300000_3 = new AqS92S0300000_3(aqS180S0100000_14, this, c191337f7, 16);
            M3W.LIZ.getClass();
            IPoiMapService LIZ = M3W.LIZ();
            C191237ex c191237ex = new C191237ex();
            EnumC191217ev enumC191217ev = EnumC191217ev.MAP_TYPE_NORMAL;
            o.LJIIIZ(enumC191217ev, "<set-?>");
            c191237ex.LIZJ = enumC191217ev;
            Context context2 = getContext();
            if (context2 != null) {
                c191237ex.LIZLLL = C191437fH.LIZJ(context2);
                InterfaceC191227ew LIZ2 = LIZ.LIZ(new C191247ey(c191237ex));
                Fragment LIZIZ = LIZ2.LIZIZ();
                if (LIZIZ != null && (context = getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                    C1B3 c1b3 = new C1B3(supportFragmentManager);
                    c1b3.LJIIIIZZ(R.id.ge7, 1, LIZIZ, null);
                    c1b3.LJIILJJIL();
                }
                LIZ2.LIZ(new AqS49S0400000_3(this, c191337f7, aqS153S0100000_3, aqS92S0300000_3, 15));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        this.LJLIL.post(new ARunnableS22S0200000_3(this, c191337f7, 67));
        aqS180S0100000_14.invoke(Boolean.FALSE);
    }
}
