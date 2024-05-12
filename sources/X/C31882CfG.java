package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CfG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31882CfG implements InterfaceC78910Uy2 {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ int LIZJ = 40003;

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZIZ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LIZJ(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJ(String str, String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final /* synthetic */ void LJFF(String... strArr) {
    }

    @Override // X.InterfaceC78910Uy2
    public final void LIZLLL(String... strArr) {
        if (!"mounted".equals(C16880lQ.LLLLLLLZIL())) {
            KL2.LJI(R.string.sp0, this.LIZ);
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        try {
            Fragment fragment = this.LIZIZ;
            if (fragment != null) {
                C16880lQ.LJII(fragment, intent, this.LIZJ);
            } else {
                C16880lQ.LJFF(this.LIZ, this.LIZJ, intent);
            }
        } catch (Exception unused) {
            KL2.LJI(R.string.soz, this.LIZ);
        }
    }

    public C31882CfG(Activity activity, Fragment fragment) {
        this.LIZ = activity;
        this.LIZIZ = fragment;
    }
}
