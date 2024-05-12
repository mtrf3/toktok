package X;

import Y.ARunnableS18S0101000_14;
import android.content.ContentResolver;
import android.media.MediaPlayer;
import android.provider.Settings;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public final class WO0 implements WOX {
    public final /* synthetic */ C82203WNz LIZ;

    @Override // X.WOX
    public final void LIZ() {
        WO2 wo2 = this.LIZ.LJLILLLLZI;
        if (wo2 != null) {
            wo2.LIZ();
        }
    }

    public WO0(C82203WNz c82203WNz) {
        this.LIZ = c82203WNz;
    }

    @Override // X.WOX
    public final void LIZIZ(int i, int i2) {
        String str;
        C82203WNz c82203WNz = this.LIZ;
        c82203WNz.LJLJJLL = i2;
        c82203WNz.LJLJJI = (int) Math.min(c82203WNz.LJLJJL, i);
        WO1 wo1 = this.LIZ.LJLJI;
        if (wo1 != null) {
            wo1.LJLJJL = i2;
            wo1.LJLJJLL = true;
            wo1.LJLIL.LIZJ();
            C29701Eo c29701Eo = (C29701Eo) C16880lQ.LLLLIILL(C16880lQ.LLZIL(wo1.LJLJI.getContext()), R.layout.crx, wo1.LJLJI, false);
            wo1.LJLJJI = c29701Eo;
            wo1.LJLJI.addView(c29701Eo);
            wo1.LJLJJI.removeAllAnimatorListeners();
            wo1.LJLJJI.addAnimatorListener(wo1);
            C29701Eo c29701Eo2 = wo1.LJLJJI;
            if (i2 == 3) {
                str = "countdown_3_lottie.json";
            } else {
                str = "countdown_10_lottie.json";
            }
            c29701Eo2.setAnimation(str);
            wo1.LJLJJI.playAnimation();
            wo1.LJLJJI.setVisibility(0);
            if (C52529KjV.LIZ()) {
                wo1.LJLJJI.post(new RunnableC51615KNn(4, wo1));
            }
            ContentResolver contentResolver = wo1.LJLJI.getContext().getContentResolver();
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

    @Override // X.WOX
    public final void LIZJ(int i, int i2, String str) {
        if (str != null) {
            C82203WNz c82203WNz = this.LIZ;
            if (c82203WNz.mActivity == null) {
                return;
            }
            WO2 wo2 = c82203WNz.LJLILLLLZI;
            if (wo2 != null) {
                wo2.LIZ();
            }
            C82203WNz c82203WNz2 = this.LIZ;
            c82203WNz2.LJLILLLLZI = new WO2(c82203WNz2.requireActivity(), UriProtector.parse(str));
            C82203WNz c82203WNz3 = this.LIZ;
            WO2 wo22 = c82203WNz3.LJLILLLLZI;
            if (wo22 == null) {
                return;
            }
            wo22.LIZJ = new WO8(c82203WNz3);
            MediaPlayer mediaPlayer = wo22.LIZ;
            if (mediaPlayer == null) {
                return;
            }
            mediaPlayer.seekTo(i);
            wo22.LIZ.start();
            ARunnableS18S0101000_14 aRunnableS18S0101000_14 = new ARunnableS18S0101000_14(i2, wo22, 6);
            wo22.LIZLLL = aRunnableS18S0101000_14;
            wo22.LIZIZ.post(aRunnableS18S0101000_14);
        }
    }
}
