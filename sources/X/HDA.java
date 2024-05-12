package X;

import Y.ACallableS56S0300000_7;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class HDA implements HDD {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final ActivityC45651qj LIZ;
    public final InterfaceC65784Pro<I0N> LIZIZ;
    public final InterfaceC65784Pro<InterfaceC82086WJm> LIZJ;
    public final InterfaceC65784Pro<ShortVideoContext> LIZLLL;
    public final InterfaceC65784Pro<WRP> LJ;
    public final InterfaceC65784Pro<I37> LJFF;
    public final LifecycleOwner LJI;
    public CreativeLoadingDialog LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;

    static {
        new C43664HBs();
    }

    public final void LJ() {
        ((Handler) this.LJIIIIZZ.getValue()).removeCallbacksAndMessages(null);
        CreativeLoadingDialog creativeLoadingDialog = this.LJII;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
    }

    public final void LJFF() {
        MediaPlayer mediaPlayer;
        if (!e1.LIZ(31744, "studio_creation_enable_capture_sound", true, false)) {
            return;
        }
        Object LLILLJJLI = C16880lQ.LLILLJJLI(this.LIZ, "audio");
        o.LJII(LLILLJJLI, "null cannot be cast to non-null type android.media.AudioManager");
        if (((AudioManager) LLILLJJLI).getStreamVolume(5) != 0 && (mediaPlayer = (MediaPlayer) this.LJIIIZ.getValue()) != null) {
            mediaPlayer.start();
        }
    }

    public final void LJI(ShortVideoContext shortVideoContext) {
        FilterBean filterBean;
        float f;
        InterfaceC142225i6 interfaceC142225i6;
        LiveData<WPD> currentFilterSource;
        C0IB<FilterBean> curSelectedFilter;
        I37 invoke;
        InterfaceC83142Wk6 f7;
        List<ComposerBeauty> C7;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (shortVideoContext.beautyMobParam == null && (invoke = this.LJFF.invoke()) != null && (f7 = invoke.f7()) != null && (C7 = f7.C7()) != null) {
            shortVideoContext.beautyMobParam = C45804HyK.LJIJJLI(C7);
        }
        WRP invoke2 = this.LJ.invoke();
        WPD wpd = null;
        if (invoke2 != null && (curSelectedFilter = invoke2.getCurSelectedFilter()) != null) {
            filterBean = curSelectedFilter.LIZ();
        } else {
            filterBean = null;
        }
        WRP invoke3 = this.LJ.invoke();
        if (invoke3 != null && (currentFilterSource = invoke3.getCurrentFilterSource()) != null) {
            wpd = currentFilterSource.getValue();
        }
        if (filterBean != null) {
            String enName = filterBean.getEnName();
            if (enName != null) {
                shortVideoContext.cameraComponentModel.recordContext.filterLabels.add(enName);
                shortVideoContext.cameraComponentModel.recordContext.filterLabels.addIndex();
                if (wpd != null && (interfaceC142225i6 = wpd.LJLJI) != null) {
                    f = TMC.LJIJJ(interfaceC142225i6, filterBean);
                } else {
                    f = 0.0f;
                }
                shortVideoContext.cameraComponentModel.recordContext.filterValues.add(String.valueOf(f));
                shortVideoContext.cameraComponentModel.recordContext.filterValues.addIndex();
            }
            filterBean.getId();
            C79146V4k.LJJLIIIJJIZ(wpd, shortVideoContext.cameraComponentModel.recordContext.filterIds, filterBean);
            shortVideoContext.cameraComponentModel.recordContext.filterIds.addIndex();
        }
    }

    public static void LIZLLL(InterfaceC82086WJm cameraApiComponent, I0N i0n, List pathForExtractFrameList) {
        List<String> sW;
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(pathForExtractFrameList, "pathForExtractFrameList");
        if (!HDB.LIZ() || i0n == null || (sW = i0n.sW()) == null || sW.isEmpty()) {
            return;
        }
        HC5 Xq = cameraApiComponent.Xq();
        o.LJIIIZ(Xq, "<this>");
        if (i0n.sW() == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        List<String> sW2 = i0n.sW();
        o.LJI(sW2);
        C10K.LIZJ(new ACallableS56S0300000_7((C43786HGk) Xq, sW2, new AqS133S0200000_2(pathForExtractFrameList, (List<String>) countDownLatch, (CountDownLatch) 143), 8));
        countDownLatch.await(2L, TimeUnit.SECONDS);
    }

    public final C43139GwR LIZJ(String originFile, List<String> list, List<String> pathForExtractFrameList, boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        Effect effect;
        o.LJIIIZ(originFile, "originFile");
        o.LJIIIZ(pathForExtractFrameList, "pathForExtractFrameList");
        InterfaceC82086WJm invoke = this.LIZJ.invoke();
        I0N invoke2 = this.LIZIZ.invoke();
        if (z) {
            try {
                LIZLLL(invoke, invoke2, pathForExtractFrameList);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (list != null && !list.isEmpty()) {
            pathForExtractFrameList.addAll(list);
        }
        ActivityC45651qj activityC45651qj = this.LIZ;
        ShortVideoContext invoke3 = this.LIZLLL.invoke();
        if (invoke2 != null) {
            effect = C82398WVm.LIZJ(invoke2);
        } else {
            effect = null;
        }
        return new C43139GwR(activityC45651qj, originFile, pathForExtractFrameList, invoke3, SFS.LIZLLL(effect), invoke.getCameraFacing(), false, ((C43786HGk) invoke.Xq()).LIZ, null, interfaceC88472Yns);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HDA(ActivityC45651qj activity, InterfaceC65784Pro<? extends I0N> stickerApiComponentProvider, InterfaceC65784Pro<? extends InterfaceC82086WJm> cameraApiComponentProvider, InterfaceC65784Pro<? extends ShortVideoContext> shortVideoContextProvider, InterfaceC65784Pro<? extends WRP> filterApiComponentProvider, InterfaceC65784Pro<? extends I37> beautyApiComponentProvider, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerApiComponentProvider, "stickerApiComponentProvider");
        o.LJIIIZ(cameraApiComponentProvider, "cameraApiComponentProvider");
        o.LJIIIZ(shortVideoContextProvider, "shortVideoContextProvider");
        o.LJIIIZ(filterApiComponentProvider, "filterApiComponentProvider");
        o.LJIIIZ(beautyApiComponentProvider, "beautyApiComponentProvider");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = activity;
        this.LIZIZ = stickerApiComponentProvider;
        this.LIZJ = cameraApiComponentProvider;
        this.LIZLLL = shortVideoContextProvider;
        this.LJ = filterApiComponentProvider;
        this.LJFF = beautyApiComponentProvider;
        this.LJI = lifecycleOwner;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 505));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 506));
        this.LJIIJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 504));
    }
}
