package Y;

import X.ActivityC45651qj;
import X.AnonymousClass607;
import X.C139825eE;
import X.C44293HZx;
import X.C46118I8c;
import X.C46119I8d;
import X.C68322mC;
import X.InterfaceC29911Fj;
import X.InterfaceC82683Wch;
import android.app.Activity;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS43S0110000_7 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS43S0110000_7 aObjectS43S0110000_7, Object obj) {
        Integer num = (Integer) obj;
        if (num == null || aObjectS43S0110000_7.z1) {
            InterfaceC82683Wch interfaceC82683Wch = ((C46119I8d) aObjectS43S0110000_7.l0).LJLJLJ;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
                return;
            }
            return;
        }
        C46119I8d c46119I8d = (C46119I8d) aObjectS43S0110000_7.l0;
        int intValue = num.intValue();
        if (c46119I8d.LJLJJL.creativeModel.reuseSoundAndEffectModel.isFromReuseMusic()) {
            return;
        }
        c46119I8d.LLJILJILJ().post(new ARunnableS11S0101000_7(intValue, c46119I8d, 6));
        TextView textView = c46119I8d.LJLLILLLL;
        if (textView != null) {
            textView.setOnTouchListener(new IDTListenerS116S0100000_7(c46119I8d, 5));
        }
        AnonymousClass607 anonymousClass607 = c46119I8d.LJZ;
        if (anonymousClass607 == null) {
            return;
        }
        anonymousClass607.setOnTouchListener(new IDTListenerS116S0100000_7(c46119I8d, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObjectS43S0110000_7 aObjectS43S0110000_7, Object obj) {
        T t;
        Integer num = (Integer) obj;
        if (num == null || aObjectS43S0110000_7.z1) {
            InterfaceC82683Wch interfaceC82683Wch = ((C46118I8c) aObjectS43S0110000_7.l0).LJLL;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
                return;
            }
            return;
        }
        C46118I8c c46118I8c = (C46118I8c) aObjectS43S0110000_7.l0;
        int intValue = num.intValue();
        if (c46118I8c.LJLJL.creativeModel.reuseSoundAndEffectModel.isFromReuseMusic()) {
            return;
        }
        InterfaceC82683Wch interfaceC82683Wch2 = c46118I8c.LJLL;
        if (interfaceC82683Wch2 != null && interfaceC82683Wch2.isShowing()) {
            interfaceC82683Wch2.dismiss();
        }
        if (c46118I8c.LJLJLLL == null) {
            Activity activity = c46118I8c.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            c46118I8c.LJLJLLL = new C44293HZx((ActivityC45651qj) activity, c46118I8c);
        }
        C68322mC c68322mC = new C68322mC();
        if (intValue == 1) {
            C44293HZx c44293HZx = c46118I8c.LJLJLLL;
            if (c44293HZx != null) {
                t = c44293HZx.LIZ();
            }
            t = 0;
        } else {
            C44293HZx c44293HZx2 = c46118I8c.LJLJLLL;
            if (c44293HZx2 != null) {
                String string = c44293HZx2.LIZ.getString(R.string.r8q);
                o.LJIIIIZZ(string, "activity.getString(R.str…st_sound_download_failed)");
                C139825eE c139825eE = new C139825eE(c44293HZx2.LIZ);
                c139825eE.LIZJ = string;
                t = c139825eE;
            }
            t = 0;
        }
        c68322mC.element = t;
        c46118I8c.LLJJIJIL().post(new ARunnableS26S0200000_7(c68322mC, c46118I8c, 9));
        TextView textView = c46118I8c.LJLLL;
        if (textView != null) {
            textView.setOnTouchListener(new IDTListenerS116S0100000_7(c46118I8c, 3));
        }
        AnonymousClass607 anonymousClass607 = c46118I8c.LJZL;
        if (anonymousClass607 == null) {
            return;
        }
        anonymousClass607.setOnTouchListener(new IDTListenerS116S0100000_7(c46118I8c, 4));
    }

    public AObjectS43S0110000_7(boolean z, Object obj, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
