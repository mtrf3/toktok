package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class UC1 implements InterfaceC55235Lm3, View.OnAttachStateChangeListener {
    public static final C44846His LJLJJL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public static final int LJLJL;
    public final View LJLIL;
    public final String LJLILLLLZI;
    public final C55242LmA LJLJI;
    public final C62822Ol8 LJLJJI;

    static {
        TBV tbv = new TBV(UC1.class, "viewWeak", "getViewWeak()Landroid/view/View;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbv};
        LJLJJL = new C44846His();
        LJLJL = R.id.jc2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // X.InterfaceC55235Lm3
    public final Object getHost() {
        return this.LJLJI.LIZ(LJLJJLL[0]);
    }

    @Override // X.InterfaceC55235Lm3
    public final C55252LmK getTree() {
        return (C55252LmK) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC55235Lm3
    public String getKey() {
        return this.LJLILLLLZI;
    }

    public UC1(View v) {
        o.LJIIIZ(v, "v");
        this.LJLIL = v;
        this.LJLILLLLZI = "link_mic_scope";
        this.LJLJI = new C55242LmA(new AqS163S0100000_13(this, 746));
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(this, 745));
        C29306Beo.LJJJ(new AqS163S0100000_13(this, 744));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        v.removeOnAttachStateChangeListener(this);
        v.setTag(LJLJL, null);
        C55247LmF.LIZJ(this);
    }
}
