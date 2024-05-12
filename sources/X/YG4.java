package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.widgets.ad.UserProfileADAssemV2;

/* loaded from: classes16.dex */
public final class YG4 implements InterfaceC80650Vl0 {
    public final /* synthetic */ UserProfileADAssemV2 LJLIL;

    @Override // X.InterfaceC80650Vl0
    public final void onScroll(int i, int i2) {
    }

    @Override // X.InterfaceC80650Vl0
    public final boolean onScrollEnd() {
        this.LJLIL.LJLL = false;
        return false;
    }

    public YG4(UserProfileADAssemV2 userProfileADAssemV2) {
        this.LJLIL = userProfileADAssemV2;
    }

    @Override // X.InterfaceC80650Vl0
    public final void onScrolled(float f, float f2) {
        String str;
        boolean z;
        Aweme currentAweme = this.LJLIL.getCurrentAweme();
        if (f2 > 5.0f) {
            if (this.LJLIL.LJLL) {
                return;
            }
            if (currentAweme != null && C63081OpJ.LLJJLIIIJLLLLLLLZ(currentAweme)) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.LJLIL.LJLJJL) {
                this.LJLIL.H3(300);
            } else {
                if (currentAweme != null) {
                    if (C63081OpJ.LLJL(currentAweme)) {
                        this.LJLIL.I3(300);
                    } else if (C63081OpJ.LLJLIL(currentAweme)) {
                        YG5.LIZIZ.closeProfilePopUpWebPage(C212428Vi.LIZ(this.LJLIL));
                    }
                }
                this.LJLIL.F3(300);
            }
            this.LJLIL.LJLL = true;
            return;
        }
        if (f2 >= -5 || this.LJLIL.LJLL) {
            return;
        }
        if ((currentAweme != null && C63081OpJ.LLJJLIIIJLLLLLLLZ(currentAweme)) || this.LJLIL.LJLJJL) {
            this.LJLIL.Q3(false);
        } else {
            if (currentAweme != null) {
                if (C63081OpJ.LLJL(currentAweme)) {
                    this.LJLIL.R3(false);
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
            this.LJLIL.P3(false);
        }
        this.LJLIL.LJLL = true;
    }
}
