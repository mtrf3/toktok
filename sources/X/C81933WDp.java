package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$showAnimateAsync$1$1", f = "PreviewImageScene.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.WDp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81933WDp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PreviewImageScene LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81933WDp(PreviewImageScene previewImageScene, int i, InterfaceC67352kd<? super C81933WDp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = previewImageScene;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81933WDp(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.W5O, REQUEST] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        int LJ;
        int LIZLLL;
        Bitmap.Config config;
        C79238V7y c79238V7y;
        View LJJLJLI;
        View LJJLJLI2;
        int i;
        int i2;
        int i3;
        int i4;
        C141335gf.LIZJ(obj);
        if (SceneExtensionsKt.LIZ(this.LJLIL)) {
            return C76800UCe.LIZ;
        }
        WGR LIZ = WGW.LIZ(this.LJLIL.LJLJL);
        if (LIZ != null) {
            int i5 = this.LJLILLLLZI;
            PreviewImageScene previewImageScene = this.LJLIL;
            if (i5 != 90 && i5 != 270) {
                MyMediaModel myMediaModel = previewImageScene.LJLJJL;
                if (myMediaModel != null) {
                    i3 = myMediaModel.width;
                    i4 = myMediaModel.height;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                LIZ.setVideoSize(i3, i4);
            } else {
                MyMediaModel myMediaModel2 = previewImageScene.LJLJJL;
                if (myMediaModel2 != null) {
                    i = myMediaModel2.height;
                    i2 = myMediaModel2.width;
                } else {
                    i = 0;
                    i2 = 0;
                }
                LIZ.setVideoSize(i, i2);
            }
        }
        PreviewImageScene previewImageScene2 = this.LJLIL;
        MyMediaModel myMediaModel3 = previewImageScene2.LJLJJL;
        if (myMediaModel3 != null) {
            str = myMediaModel3.fileLocalUriPath;
        } else {
            str = null;
        }
        W5G w5g = previewImageScene2.LJLJJLL;
        if (w5g != null) {
            w5g.setVisibility(8);
            ImageView imageView = previewImageScene2.LJLJLJ;
            if (imageView != null) {
                imageView.setVisibility(8);
                if (!C45508HtY.LIZIZ(str, true)) {
                    ImageView imageView2 = previewImageScene2.LJLJLJ;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    } else {
                        o.LJIJI("deleteImg");
                        throw null;
                    }
                } else {
                    W5G w5g2 = previewImageScene2.LJLJJLL;
                    if (w5g2 != null) {
                        w5g2.setVisibility(0);
                        if (C38354F3m.LIZJ("MI CC9 Pro", Build.MODEL) || e1.LIZ(31744, "enable_preview_image_fix_large_picture", true, false)) {
                            z = true;
                            LJ = C81184Vtc.LJ(previewImageScene2.mActivity);
                            LIZLLL = C81184Vtc.LIZLLL(previewImageScene2.mActivity);
                        } else {
                            z = false;
                            LJ = -1;
                            LIZLLL = -1;
                        }
                        C81934WDq c81934WDq = new C81934WDq(previewImageScene2, SystemClock.elapsedRealtime());
                        if (z) {
                            config = Bitmap.Config.RGB_565;
                        } else {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        W5G w5g3 = previewImageScene2.LJLJJLL;
                        if (w5g3 != null) {
                            C81705W4v LIZJ = W5I.LIZJ();
                            previewImageScene2.LJLL = -1L;
                            W5P LIZLLL2 = W5P.LIZLLL(C44694HgQ.LJIIIIZZ(str));
                            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                            LIZLLL2.LJ = new C81810W8w(imageDecodeOptionsBuilder);
                            WGT wgt = previewImageScene2.LJLJJI;
                            if (wgt != null && (LJJLJLI = wgt.LJJLJLI()) != null) {
                                View findViewById = LJJLJLI.findViewById(R.id.ggp);
                                if (findViewById != null) {
                                    c79238V7y = new C79238V7y(findViewById.getWidth(), findViewById.getHeight());
                                } else {
                                    c79238V7y = new C79238V7y(LJJLJLI.getWidth(), LJJLJLI.getHeight());
                                }
                            } else {
                                c79238V7y = null;
                            }
                            LIZLLL2.LIZJ = c79238V7y;
                            LIZLLL2.LJIILJJIL = new C81932WDo(previewImageScene2);
                            LIZJ.LJ = LIZLLL2.LIZ();
                            W5P LIZLLL3 = W5P.LIZLLL(C44694HgQ.LJIIIIZZ(str));
                            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder2 = new ImageDecodeOptionsBuilder();
                            imageDecodeOptionsBuilder2.setBitmapConfig(config);
                            LIZLLL3.LJ = new C81810W8w(imageDecodeOptionsBuilder2);
                            if (LJ > 0 && LIZLLL > 0) {
                                LIZLLL3.LIZJ = new C79238V7y(LJ, LIZLLL);
                            }
                            LIZJ.LIZLLL = LIZLLL3.LIZ();
                            W5G w5g4 = previewImageScene2.LJLJJLL;
                            if (w5g4 != null) {
                                LIZJ.LJIIL = w5g4.getController();
                                LIZJ.LJII = c81934WDq;
                                w5g3.setController(LIZJ.LIZ());
                            } else {
                                o.LJIJI("draweeView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("draweeView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("draweeView");
                        throw null;
                    }
                }
                WGT wgt2 = this.LJLIL.LJLJJI;
                if (wgt2 != null && wgt2.LJJJLZIJ()) {
                    WGT wgt3 = this.LJLIL.LJLJJI;
                    if (wgt3 != null) {
                        wgt3.LJLIIIL();
                    }
                    PreviewImageScene previewImageScene3 = this.LJLIL;
                    WGT wgt4 = previewImageScene3.LJLJJI;
                    if (wgt4 != null && (LJJLJLI2 = wgt4.LJJLJLI()) != null) {
                        C81935WDr c81935WDr = new C81935WDr(LJJLJLI2);
                        WGR LIZ2 = WGW.LIZ(previewImageScene3.LJLJL);
                        if (LIZ2 != null) {
                            LIZ2.LIZIZ(c81935WDr.LIZIZ(), c81935WDr.LIZJ(), new C77357UXp(), previewImageScene3.LLJILJIL());
                        }
                    }
                } else {
                    this.LJLIL.getClass();
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("deleteImg");
            throw null;
        }
        o.LJIJI("draweeView");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
