package X;

import com.ss.android.ugc.aweme.profile.widgets.awemepager.UserAwemePagerAssem;

/* loaded from: classes16.dex */
public final class YFK implements MFB {
    public final /* synthetic */ UserAwemePagerAssem LIZ;

    @Override // X.MFB
    public final void LIZIZ() {
        UserAwemePagerAssem userAwemePagerAssem = this.LIZ;
        if (!userAwemePagerAssem.LLILII) {
            return;
        }
        userAwemePagerAssem.LLILZLL = true;
        if (userAwemePagerAssem.LLILZIL) {
            userAwemePagerAssem.LLILZIL = false;
            userAwemePagerAssem.N6();
        }
    }

    public YFK(UserAwemePagerAssem userAwemePagerAssem) {
        this.LIZ = userAwemePagerAssem;
    }

    @Override // X.MFB
    public final void LIZ(boolean z) {
        UserAwemePagerAssem userAwemePagerAssem = this.LIZ;
        if (!userAwemePagerAssem.LLILII) {
            return;
        }
        if (userAwemePagerAssem.LLIZLLLIL) {
            C53578L1a.LIZ.getClass();
            if (C53578L1a.LIZ()) {
                return;
            }
        }
        UserAwemePagerAssem userAwemePagerAssem2 = this.LIZ;
        if (userAwemePagerAssem2.LLILZLL) {
            return;
        }
        userAwemePagerAssem2.LLILZLL = true;
        if (!userAwemePagerAssem2.LLILZIL) {
            userAwemePagerAssem2.LLILZIL = true;
            userAwemePagerAssem2.k7(z);
            String e4 = this.LIZ.e4();
            String str = "";
            if (e4 == null) {
                e4 = "";
            }
            String k6 = this.LIZ.k6();
            if (k6 != null) {
                str = k6;
            }
            C26335AVf.LJIILJJIL(e4, str);
        }
    }
}
