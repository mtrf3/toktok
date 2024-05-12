package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AFl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25925AFl implements InterfaceC25921AFh {
    public final Activity LIZ;

    @Override // X.InterfaceC25921AFh
    public final void LIZ() {
    }

    @Override // X.InterfaceC25921AFh
    public final String LIZLLL() {
        return "safety_center";
    }

    @Override // X.InterfaceC25921AFh
    public final CharSequence LJ() {
        return null;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJI() {
    }

    @Override // X.InterfaceC25921AFh
    public final boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC25921AFh
    public final int getVisibility() {
        return 0;
    }

    @Override // X.InterfaceC25921AFh
    public final void LIZIZ() {
        if (C2NU.LIZ.LIZIZ()) {
            String str = "";
            String string = C39396FdA.LIZ(EF7.LIZIZ()).getString("key_current_locale", "");
            if (string != null) {
                str = string;
            }
            if (TextUtils.isEmpty(str)) {
                str = "en";
            }
            C25914AFa.LIZIZ(this, C0F0.LIZLLL("https://www.tiktok.com/safety/", str, '/'), this.LIZ.getString(R.string.q7y), null, 12);
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC25921AFh
    public final Activity getActivity() {
        return this.LIZ;
    }

    public C25925AFl(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC25921AFh
    public final AI8 LIZJ(View view) {
        AI8 ai8 = (AI8) view.findViewById(R.id.ja5);
        o.LJIIIIZZ(ai8, "view.safety_center");
        return ai8;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJFF(String str, String str2, Boolean bool, Boolean bool2) {
        C25914AFa.LIZ(this, str, str2, bool, bool2);
    }
}
