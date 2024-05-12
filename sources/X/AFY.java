package X;

import android.app.Activity;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFY implements InterfaceC25921AFh {
    public final Activity LIZ;

    @Override // X.InterfaceC25921AFh
    public final void LIZ() {
    }

    @Override // X.InterfaceC25921AFh
    public final String LIZLLL() {
        return "copyright_policy";
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
            C25914AFa.LIZIZ(this, "https://www.tiktok.com/legal/copyright-policy", this.LIZ.getString(R.string.dwf), null, 12);
            return;
        }
        C5S1 c5s1 = new C5S1(this.LIZ);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    @Override // X.InterfaceC25921AFh
    public final Activity getActivity() {
        return this.LIZ;
    }

    public AFY(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC25921AFh
    public final AI8 LIZJ(View view) {
        AI8 ai8 = (AI8) view.findViewById(R.id.bvb);
        o.LJIIIIZZ(ai8, "view.copyright_policy");
        return ai8;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJFF(String str, String str2, Boolean bool, Boolean bool2) {
        C25914AFa.LIZ(this, str, str2, bool, bool2);
    }
}
