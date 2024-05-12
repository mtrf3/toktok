package X;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HD4 extends HDA implements HD7 {
    public final InterfaceC65784Pro<InterfaceC83624Wrs> LJIIL;
    public HD7 LJIILIIL;
    public final C62822Ol8 LJIILJJIL;

    @Override // X.HD7
    public final void LIZIZ(String localPath, List<String> list) {
        o.LJIIIZ(localPath, "localPath");
        HD7 hd7 = this.LJIILIIL;
        if (hd7 != null) {
            hd7.LIZIZ(localPath, list);
        }
    }

    @Override // X.HDD
    public final void LIZ(InterfaceC65784Pro<C76800UCe> onTakePhotoFinish, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, I4X i4x) {
        boolean z;
        String str;
        o.LJIIIZ(onTakePhotoFinish, "onTakePhotoFinish");
        if (!this.LJI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ((Handler) this.LJIIIIZZ.getValue()).postDelayed((Runnable) this.LJIIJ.getValue(), 600L);
        if (i4x != null && (str = i4x.LJLIL) != null) {
            ((HD8) this.LJIILJJIL.getValue()).LIZ(str);
        }
        ShortVideoContext invoke = this.LIZLLL.invoke();
        this.LJIILIIL = new C43678HCg(this, invoke, onTakePhotoFinish, i4x, interfaceC88472Yns, currentTimeMillis);
        I0N invoke2 = this.LIZIZ.invoke();
        if (invoke2 != null && C82398WVm.LIZJ(invoke2) != null) {
            z = true;
        } else {
            z = false;
        }
        LJFF();
        HD8 hd8 = (HD8) this.LJIILJJIL.getValue();
        CameraComponentModel cameraComponentModel = invoke.cameraComponentModel;
        hd8.LIZIZ(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HD4(ActivityC45651qj activity, InterfaceC65784Pro<? extends I0N> stickerApiComponentProvider, InterfaceC65784Pro<? extends InterfaceC82086WJm> cameraApiComponentProvider, InterfaceC65784Pro<? extends ShortVideoContext> shortVideoContextProvider, InterfaceC65784Pro<? extends InterfaceC83624Wrs> asCameraViewProvider, InterfaceC65784Pro<? extends WRP> filterApiComponentProvider, InterfaceC65784Pro<? extends I37> beautyApiComponentProvider, LifecycleOwner lifecycleOwner) {
        super(activity, stickerApiComponentProvider, cameraApiComponentProvider, shortVideoContextProvider, filterApiComponentProvider, beautyApiComponentProvider, lifecycleOwner);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerApiComponentProvider, "stickerApiComponentProvider");
        o.LJIIIZ(cameraApiComponentProvider, "cameraApiComponentProvider");
        o.LJIIIZ(shortVideoContextProvider, "shortVideoContextProvider");
        o.LJIIIZ(asCameraViewProvider, "asCameraViewProvider");
        o.LJIIIZ(filterApiComponentProvider, "filterApiComponentProvider");
        o.LJIIIZ(beautyApiComponentProvider, "beautyApiComponentProvider");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIIL = asCameraViewProvider;
        this.LJIILJJIL = C221108m2.LIZIZ(new AqS96S0300000_7(activity, (ActivityC45651qj) this, (HD4) shortVideoContextProvider, (InterfaceC65784Pro<? extends ShortVideoContext>) 21));
    }
}
