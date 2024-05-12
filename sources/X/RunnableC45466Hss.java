package X;

import Y.IDCListenerS160S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Hss, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC45466Hss implements Runnable {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;

    public RunnableC45466Hss(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LJLIL = mvChoosePhotoScene;
    }

    public final void LIZ() {
        Context sceneContext;
        String str;
        String str2;
        boolean z;
        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
        if (mvChoosePhotoScene.mActivity == null || mvChoosePhotoScene.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        if (!mvChoosePhotoScene2.LLLZZ) {
            ViewPager viewPager = mvChoosePhotoScene2.LLILLL;
            if (viewPager != null) {
                viewPager.getCurrentItem();
            }
            mvChoosePhotoScene2.b();
            o.LJIIIIZZ(this.LJLIL.LLJLL().getSupportFragmentManager(), "requireFragmentActivity().supportFragmentManager");
            this.LJLIL.LLIIJI = new C45674HwE();
            MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
            C45674HwE c45674HwE = mvChoosePhotoScene3.LLIIJI;
            if (c45674HwE != null) {
                c45674HwE.LJLJL = new C45463Hsp(mvChoosePhotoScene3);
            }
            if (c45674HwE != null) {
                Bundle bundle = new Bundle();
                MvChoosePhotoScene mvChoosePhotoScene4 = this.LJLIL;
                bundle.putInt("key_support_flag", mvChoosePhotoScene4.LLLF);
                if (mvChoosePhotoScene4.LJLLJ == 10) {
                    z = true;
                } else {
                    z = false;
                }
                bundle.putBoolean("extra_show_gif", z);
                bundle.putBoolean("is_slide_scene", mvChoosePhotoScene4.LJLLILLLL);
                bundle.putBoolean("extra_from_ugc_template", mvChoosePhotoScene4.LLLLZLLLI());
                c45674HwE.mArguments = bundle;
            }
            if (C158096Ij.LIZ && (sceneContext = this.LJLIL.getSceneContext()) != null) {
                MvChoosePhotoScene mvChoosePhotoScene5 = this.LJLIL;
                Lifecycle lifecycle = mvChoosePhotoScene5.getLifecycle();
                IComplianceBusinessService complianceBusinessService = (IComplianceBusinessService) mvChoosePhotoScene5.q.getValue();
                o.LJIIIIZZ(complianceBusinessService, "complianceBusinessService");
                ShortVideoContext shortVideoContext = mvChoosePhotoScene5.LLJLLIL;
                String str3 = null;
                if (shortVideoContext != null) {
                    str3 = shortVideoContext.shootWay;
                    str = shortVideoContext.enterFrom;
                    str2 = shortVideoContext.LJI();
                } else {
                    str = null;
                    str2 = null;
                }
                lifecycle.addObserver(complianceBusinessService.LJIIJ(sceneContext, R.string.g0m, str3, str, str2, null));
            }
            MvChoosePhotoScene mvChoosePhotoScene6 = this.LJLIL;
            C45674HwE c45674HwE2 = mvChoosePhotoScene6.LLIIJI;
            if (c45674HwE2 != null) {
                mvChoosePhotoScene6.beginTransaction();
                WM7 findSceneByTag = mvChoosePhotoScene6.findSceneByTag("album_Fragment");
                if (!o.LJ(findSceneByTag, c45674HwE2)) {
                    if (mvChoosePhotoScene6.isAdded(c45674HwE2)) {
                        mvChoosePhotoScene6.remove(c45674HwE2);
                    }
                    if (findSceneByTag == null) {
                        mvChoosePhotoScene6.add(R.id.dm7, c45674HwE2, "album_Fragment", 0);
                    } else if (mvChoosePhotoScene6.isShow(findSceneByTag)) {
                        mvChoosePhotoScene6.remove(findSceneByTag);
                        mvChoosePhotoScene6.add(R.id.dm7, c45674HwE2, "album_Fragment", 0);
                    } else {
                        mvChoosePhotoScene6.remove(findSceneByTag);
                        C79234V7u.LIZIZ(mvChoosePhotoScene6, R.id.dm7, c45674HwE2, "album_Fragment");
                    }
                }
                mvChoosePhotoScene6.hide(c45674HwE2);
                mvChoosePhotoScene6.commitTransaction();
            }
            MvChoosePhotoScene mvChoosePhotoScene7 = this.LJLIL;
            mvChoosePhotoScene7.getClass();
            HJE LJI = C60903NvH.LJIIJJI().LJI();
            Parcelable parcelable = mvChoosePhotoScene7.LLJLILLLLZIIL;
            Activity requireActivity = mvChoosePhotoScene7.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            LJI.LIZ(parcelable, requireActivity, new IDCListenerS160S0100000_7(mvChoosePhotoScene7, 7));
        }
        this.LJLIL.LLLZZ = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
