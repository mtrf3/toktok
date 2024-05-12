package X;

import Y.ALAdapterS5S0100000_7;
import Y.AUListenerS98S0200000_7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I03 extends WXA {
    public final /* synthetic */ I02 LJLIL;

    public I03(I02 i02) {
        this.LJLIL = i02;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJJIIZI(MotionEvent motionEvent) {
        I02 i02 = this.LJLIL;
        if (!i02.LJLLILLLL) {
            return false;
        }
        if (i02.LJLJL) {
            i02.LJLJL = false;
        }
        if (motionEvent == null || i02.LJLLI || !I09.LIZ()) {
            return false;
        }
        I02 i022 = this.LJLIL;
        i022.LJLJJLL = 0.0f;
        i022.LJLJJL = 0.0f;
        if (!i022.LJLL && C79057V0z.LJIIZILJ(C78897Uxp.LJJJJ(i022.LJLIL), MvChoosePhotoScene.class)) {
            I02 i023 = this.LJLIL;
            if (i023.LJLJJI != null) {
                NavigationScene LJJJJ = C78897Uxp.LJJJJ(i023.LJLIL);
                MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL.LJLJJI;
                if (mvChoosePhotoScene != null) {
                    LJJJJ.remove(mvChoosePhotoScene);
                    this.LJLIL.LJLJJI = null;
                    return false;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (!this.LJLIL.LJLL) {
            return false;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        float y = motionEvent.getY();
        I02 i024 = this.LJLIL;
        if (y <= (i024.LJLLL * 3.0f) / 5.0f) {
            ofFloat.setDuration(350L);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
            ofFloat.addUpdateListener(new AUListenerS98S0200000_7(motionEvent, i024, 0));
            ofFloat.addListener(new ALAdapterS5S0100000_7(i024, 6));
            ofFloat.start();
            return true;
        }
        if (i024.LJLJJI == null) {
            return true;
        }
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS98S0200000_7(motionEvent, i024, 1));
        ofFloat.addListener(new ALAdapterS5S0100000_7(i024, 7));
        ofFloat.start();
        return true;
    }

    @Override // X.WXB, X.WXG
    public final boolean LJLI(C82537WaL c82537WaL) {
        View view;
        View view2;
        I02 i02 = this.LJLIL;
        if (i02.LJLLILLLL && c82537WaL != null) {
            if (c82537WaL.LJIIJ > 1) {
                i02.LJLJL = true;
            }
            if (!i02.LJLLI && !i02.LJLJL) {
                Boolean LIZ = i02.getRecordControlApi().isRecording().LIZ();
                o.LJIIIIZZ(LIZ, "recordControlApi.isRecording.value");
                if (!LIZ.booleanValue() && !this.LJLIL.LJJLI()) {
                    I02 i022 = this.LJLIL;
                    if (i022.LJLJJL == 0.0f && i022.LJLJJLL == 0.0f) {
                        i022.LJLJJL = c82537WaL.LJI();
                        this.LJLIL.LJLJJLL = c82537WaL.LJII();
                        return false;
                    }
                    if (i022.LJLJJLL - c82537WaL.LJII() > C7MY.LIZIZ(10) && !C79057V0z.LJIIZILJ(C78923UyF.LJIILLIIL(this.LJLIL.LJLIL), MvChoosePhotoScene.class)) {
                        this.LJLIL.LJJLJLI();
                        MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL.LJLJJI;
                        if (mvChoosePhotoScene != null && (view2 = mvChoosePhotoScene.mView) != null) {
                            view2.setVisibility(8);
                        }
                    }
                    if (!this.LJLIL.LJLL && (!I09.LIZ() || this.LJLIL.LJLJJLL - c82537WaL.LJII() < I02.LJZL || Math.abs(this.LJLIL.LJLJJL - c82537WaL.LJI()) > Math.abs(c82537WaL.LJII() - this.LJLIL.LJLJJLL))) {
                        return false;
                    }
                    I02 i023 = this.LJLIL;
                    if (!i023.LJLL) {
                        i023.LJLL = true;
                        G8G.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
                        this.LJLIL.getShortVideoContext().uploadMethod = "slide_full";
                        this.LJLIL.getShortVideoContext().enterAlbumMethod = "slide_up";
                        this.LJLIL.LJJLIIIJLLLLLLLZ(true, true);
                        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL.LJLJJI;
                        if (mvChoosePhotoScene2 != null && (view = mvChoosePhotoScene2.mView) != null) {
                            view.setVisibility(0);
                        }
                        HYT hyt = C46002I3q.LLI;
                        Activity requireActivity = this.LJLIL.LJLIL.requireActivity();
                        o.LJIIIIZZ(requireActivity, "parentScene.requireActivity()");
                        ShortVideoContext shortVideoContext = this.LJLIL.getShortVideoContext();
                        C82622Wbi diContainer = this.LJLIL.getDiContainer();
                        hyt.getClass();
                        HYT.LIZ(requireActivity, shortVideoContext, diContainer, null);
                    }
                    this.LJLIL.LJJLJ(c82537WaL.LJII());
                    return true;
                }
            }
        }
        return false;
    }
}
