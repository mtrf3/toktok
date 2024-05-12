package X;

import Y.ARunnableS18S0101000_14;
import android.content.ContentResolver;
import android.media.MediaPlayer;
import android.provider.Settings;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public final class WOE implements WOW {
    public final /* synthetic */ WOD LIZ;

    @Override // X.WOW
    public final void LIZ() {
        WOG wog = this.LIZ.LJLILLLLZI;
        if (wog != null) {
            wog.LIZ();
        }
    }

    public WOE(WOD wod) {
        this.LIZ = wod;
    }

    @Override // X.WOW
    public final void LIZIZ(int i, int i2) {
        String str;
        WOD wod = this.LIZ;
        wod.LJLJJLL = i2;
        wod.LJLJJI = (int) Math.min(wod.LJLJJL, i);
        WOF wof = this.LIZ.LJLJI;
        if (wof != null) {
            wof.LJLJJL = i2;
            wof.LJLJJLL = true;
            wof.LJLIL.LIZJ();
            C29701Eo c29701Eo = (C29701Eo) C16880lQ.LLLLIILL(C16880lQ.LLZIL(wof.LJLJI.getContext()), R.layout.crx, wof.LJLJI, false);
            wof.LJLJJI = c29701Eo;
            wof.LJLJI.addView(c29701Eo);
            wof.LJLJJI.removeAllAnimatorListeners();
            wof.LJLJJI.addAnimatorListener(wof);
            C29701Eo c29701Eo2 = wof.LJLJJI;
            if (i2 == 3) {
                str = "countdown_3_lottie.json";
            } else {
                str = "countdown_10_lottie.json";
            }
            c29701Eo2.setAnimation(str);
            wof.LJLJJI.playAnimation();
            wof.LJLJJI.setVisibility(0);
            ContentResolver contentResolver = wof.LJLJI.getContext().getContentResolver();
            if (contentResolver != null) {
                float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
                float f2 = Settings.Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
                float f3 = Settings.Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("anim_duration_scale =");
                LIZ.append(f);
                C170666ms.LIZIZ(X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("transition_anim_scale =");
                LIZ2.append(f2);
                C170666ms.LIZIZ(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("window_anim_scale =");
                LIZ3.append(f3);
                C170666ms.LIZIZ(X1D.LIZIZ(LIZ3));
            }
        }
    }

    @Override // X.WOW
    public final void LIZJ(int i, int i2, String str) {
        if (str != null) {
            WOD wod = this.LIZ;
            if (wod.mActivity == null) {
                return;
            }
            WOG wog = wod.LJLILLLLZI;
            if (wog != null) {
                wog.LIZ();
            }
            WOD wod2 = this.LIZ;
            wod2.LJLILLLLZI = new WOG(wod2.requireActivity(), UriProtector.parse(str));
            WOD wod3 = this.LIZ;
            WOG wog2 = wod3.LJLILLLLZI;
            if (wog2 == null) {
                return;
            }
            wog2.LIZJ = new WOZ(wod3);
            MediaPlayer mediaPlayer = wog2.LIZ;
            if (mediaPlayer == null) {
                return;
            }
            mediaPlayer.seekTo(i);
            wog2.LIZ.start();
            ARunnableS18S0101000_14 aRunnableS18S0101000_14 = new ARunnableS18S0101000_14(i2, wog2, 4);
            wog2.LIZLLL = aRunnableS18S0101000_14;
            wog2.LIZIZ.post(aRunnableS18S0101000_14);
        }
    }
}
