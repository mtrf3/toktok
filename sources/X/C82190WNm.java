package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WNm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82190WNm implements WGM {
    public final /* synthetic */ C82188WNk LJLIL;

    public C82190WNm(C82188WNk c82188WNk) {
        this.LJLIL = c82188WNk;
    }

    @Override // X.WGM
    public final boolean LIZ(float f) {
        C82188WNk c82188WNk = this.LJLIL;
        if (c82188WNk.LJLLILLLL * f < ((float) c82188WNk.LJLJJL)) {
            Activity activity = c82188WNk.mActivity;
            if (activity != null) {
                C24540xm.LIZ(R.string.rgq, activity, 3018);
            }
            return false;
        }
        InterfaceC153045zY interfaceC153045zY = c82188WNk.LLFII;
        if (interfaceC153045zY != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                InterfaceC123794tT LJFF = LJJI.LJFF();
                C82188WNk c82188WNk2 = this.LJLIL;
                C121914qR LJJIII = LJFF.LJJIII();
                if (LJJIII != null) {
                    LJJIII.LJIIIIZZ = f;
                } else {
                    LJJIII = null;
                }
                LJFF.LJJJJJL(LJJIII);
                c82188WNk2.LLFII.stop();
                c82188WNk2.LLFII.prepare();
                c82188WNk2.LLFII.play();
                this.LJLIL.LLJILJILJ().creativeModel.musicBuzModel.soundSpeed = f;
                C82188WNk c82188WNk3 = this.LJLIL;
                c82188WNk3.LJZ = f;
                c82188WNk3.LJLILLLLZI.LIZIZ(c82188WNk3.LJLJLJ, f);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return true;
    }
}
