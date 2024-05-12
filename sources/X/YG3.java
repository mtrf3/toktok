package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.widgets.ad.UserProfileADAssem;

/* loaded from: classes16.dex */
public final class YG3 implements InterfaceC80650Vl0 {
    public final /* synthetic */ UserProfileADAssem LJLIL;

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
    }

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        this.LJLIL.LJLJLLL = false;
        return false;
    }

    public YG3(UserProfileADAssem userProfileADAssem) {
        this.LJLIL = userProfileADAssem;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        String str;
        boolean z;
        Aweme currentAweme = this.LJLIL.getCurrentAweme();
        if (f2 > 5.0f) {
            if (this.LJLIL.LJLJLLL) {
                return;
            }
            if (currentAweme != null && C63081OpJ.LLJJLIIIJLLLLLLLZ(currentAweme)) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.LJLIL.LJLJJL) {
                this.LJLIL.F3(300);
            } else {
                if (currentAweme != null) {
                    if (C63081OpJ.LLJL(currentAweme)) {
                        this.LJLIL.H3(300);
                    } else if (C63081OpJ.LLJLIL(currentAweme)) {
                        YG5.LIZIZ.closeProfilePopUpWebPage(C212428Vi.LIZ(this.LJLIL));
                    }
                }
                this.LJLIL.E3(300);
            }
            this.LJLIL.LJLJLLL = true;
            return;
        }
        if (f2 >= -5 || this.LJLIL.LJLJLLL) {
            return;
        }
        if ((currentAweme != null && C63081OpJ.LLJJLIIIJLLLLLLLZ(currentAweme)) || this.LJLIL.LJLJJL) {
            this.LJLIL.P3(false);
        } else {
            if (currentAweme != null) {
                if (C63081OpJ.LLJL(currentAweme)) {
                    this.LJLIL.Q3(false);
                } else if (C63081OpJ.LLJLIL(currentAweme)) {
                    YG5 yg5 = YG5.LIZIZ;
                    Context context = this.LJLIL.getContext();
                    if (currentAweme != null) {
                        str = currentAweme.getAid();
                    } else {
                        str = null;
                    }
                    yg5.openProfilePopUpWebPageInTwoMode(context, currentAweme, str, false);
                }
            }
            this.LJLIL.O3(false);
        }
        this.LJLIL.LJLJLLL = true;
    }
}
