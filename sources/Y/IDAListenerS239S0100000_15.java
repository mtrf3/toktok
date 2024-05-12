package Y;

import X.C53093Ksb;
import X.InterfaceC65784Pro;
import X.T2S;
import X.Y58;
import X.YAX;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.android.livesdk.broadcast.LiveCoverCameraTypeChannel;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseChooseMusicFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDAListenerS239S0100000_15 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationRepeat$0(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
    }

    public static final void onAnimationRepeat$3(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
    }

    public static final void onAnimationStart$0(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
    }

    public static final void onAnimationStart$2(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            case 3:
                onAnimationEnd$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            case 3:
                onAnimationRepeat$3(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            case 3:
                onAnimationStart$3(this, animation);
                return;
            default:
                return;
        }
    }

    public IDAListenerS239S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
        ((BaseChooseMusicFragment) ((ACListenerS35S0100000_15) iDAListenerS239S0100000_15.l0).l0).cancelChooseMusicContainer.setVisibility(8);
    }

    public static final void onAnimationEnd$1(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
        if (C53093Ksb.LIZIZ()) {
            YAX yax = (YAX) iDAListenerS239S0100000_15.l0;
            if (!yax.LJIIIZ) {
                yax.LJFF.LIZ(T2S.LJLIL);
            }
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
        ((InterfaceC65784Pro) iDAListenerS239S0100000_15.l0).invoke();
    }

    public static final void onAnimationEnd$3(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
        View _$_findCachedViewById = ((LiveCoverCameraFragment) iDAListenerS239S0100000_15.l0)._$_findCachedViewById(R.id.b37);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setAlpha(1.0f);
        }
        LiveCoverCameraFragment liveCoverCameraFragment = (LiveCoverCameraFragment) iDAListenerS239S0100000_15.l0;
        DataChannel dataChannel = liveCoverCameraFragment.LJLJI;
        if (dataChannel != null) {
            Y58 y58 = liveCoverCameraFragment.LJLJJI;
            if (y58 != null) {
                dataChannel.rv0(LiveCoverCameraTypeChannel.class, Integer.valueOf(1 - y58.LIZLLL));
                return;
            } else {
                o.LJIJI("cameraProxy");
                throw null;
            }
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public static final void onAnimationStart$3(IDAListenerS239S0100000_15 iDAListenerS239S0100000_15, Animation animation) {
        View _$_findCachedViewById = ((LiveCoverCameraFragment) iDAListenerS239S0100000_15.l0)._$_findCachedViewById(R.id.b37);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setAlpha(0.5f);
    }
}
