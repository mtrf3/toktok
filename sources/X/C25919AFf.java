package X;

import android.app.Activity;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AFf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25919AFf implements InterfaceC25921AFh {
    public final Activity LIZ;

    @Override // X.InterfaceC25921AFh
    public final void LIZ() {
    }

    @Override // X.InterfaceC25921AFh
    public final String LIZLLL() {
        return "community_guidelines";
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
            C38281F0r c38281F0r = new C38281F0r("https://www.tiktok.com/community-guidelines");
            c38281F0r.LIZLLL("lang", UYS.LIZ(this.LIZ));
            String LJ = c38281F0r.LJ();
            o.LJIIIIZZ(LJ, "builder.build()");
            C25914AFa.LIZIZ(this, LJ, this.LIZ.getString(R.string.drq), null, 12);
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

    public C25919AFf(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC25921AFh
    public final AI8 LIZJ(View view) {
        AI8 ai8 = (AI8) view.findViewById(R.id.bq8);
        o.LJIIIIZZ(ai8, "view.community_guidelines");
        return ai8;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJFF(String str, String str2, Boolean bool, Boolean bool2) {
        C25914AFa.LIZ(this, str, str2, bool, bool2);
    }
}
