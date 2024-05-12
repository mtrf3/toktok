package X;

import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;

/* loaded from: classes16.dex */
public final class YFL implements MFB {
    public final /* synthetic */ UserAwemePagerAssemV2 LIZ;

    @Override // X.MFB
    public final void LIZIZ() {
        UserAwemePagerAssemV2 userAwemePagerAssemV2 = this.LIZ;
        if (!userAwemePagerAssemV2.LLILIL) {
            return;
        }
        userAwemePagerAssemV2.LLIZ = true;
        if (userAwemePagerAssemV2.LLILZLL) {
            userAwemePagerAssemV2.LLILZLL = false;
            userAwemePagerAssemV2.N6();
        }
    }

    public YFL(UserAwemePagerAssemV2 userAwemePagerAssemV2) {
        this.LIZ = userAwemePagerAssemV2;
    }

    @Override // X.MFB
    public final void LIZ(boolean z) {
        UserAwemePagerAssemV2 userAwemePagerAssemV2 = this.LIZ;
        if (!userAwemePagerAssemV2.LLILIL) {
            return;
        }
        if (userAwemePagerAssemV2.LLJ) {
            C53578L1a.LIZ.getClass();
            if (C53578L1a.LIZ()) {
                return;
            }
        }
        UserAwemePagerAssemV2 userAwemePagerAssemV22 = this.LIZ;
        if (userAwemePagerAssemV22.LLIZ) {
            return;
        }
        userAwemePagerAssemV22.LLIZ = true;
        if (!userAwemePagerAssemV22.LLILZLL) {
            userAwemePagerAssemV22.LLILZLL = true;
            userAwemePagerAssemV22.m7(z);
            String e4 = this.LIZ.e4();
            String str = "";
            if (e4 == null) {
                e4 = "";
            }
            String p6 = this.LIZ.p6();
            if (p6 != null) {
                str = p6;
            }
            C26335AVf.LJIILJJIL(e4, str);
        }
    }
}
