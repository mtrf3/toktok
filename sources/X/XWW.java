package X;

import android.os.Build;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseNewMusicTabFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XWW implements InterfaceC74055T4p {
    public final /* synthetic */ BaseNewMusicTabFragment LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI kei) {
    }

    public XWW(BaseNewMusicTabFragment baseNewMusicTabFragment) {
        this.LIZ = baseNewMusicTabFragment;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI kei) {
        boolean z;
        String str;
        int i = kei.LIZLLL;
        boolean z2 = true;
        if (this.LIZ.LLIIIL && KO4.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        EnumC61629OGr LIZIZ = C61630OGs.LIZIZ(i, z);
        EnumC61629OGr enumC61629OGr = EnumC61629OGr.TAB_TYPE_COLLECT;
        if (LIZIZ == enumC61629OGr) {
            this.LIZ.getString(R.string.gaf);
            if (!AccountService.LJIJ().LJFF().isLogin()) {
                this.LIZ.Ql();
                return;
            }
        }
        if (LIZIZ == enumC61629OGr && this.LIZ.Al() != null) {
            this.LIZ.Al().dismiss();
        }
        if (LIZIZ == EnumC61629OGr.TAB_TYPE_LOCAL) {
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            if (Build.VERSION.SDK_INT >= 33) {
                str = "android.permission.READ_MEDIA_AUDIO";
            } else {
                str = "android.permission.WRITE_EXTERNAL_STORAGE";
            }
            if (C04330Ez.LIZ(mo49getActivity, str) != 0) {
                z2 = false;
            }
            XVF.LJIILJJIL(LIZIZ, z2);
        } else {
            XVF.LJIILJJIL(LIZIZ, false);
        }
        this.LIZ.Nl();
        this.LIZ.Rl(LIZIZ);
    }
}
