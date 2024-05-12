package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C152175y9;
import X.C152935zN;
import X.C1549666i;
import X.C161236Ul;
import X.C16880lQ;
import X.C221108m2;
import X.C269113v;
import X.C32151Nz;
import X.C41531GRr;
import X.C44384HbQ;
import X.C44687HgJ;
import X.C47261Igj;
import X.C5H3;
import X.C60903NvH;
import X.C62822Ol8;
import X.C6D8;
import X.C6XL;
import X.C6XM;
import X.C6XO;
import X.C6XP;
import X.C6XQ;
import X.C74275TDb;
import X.C76800UCe;
import X.C78688UuS;
import X.C78923UyF;
import X.C81184Vtc;
import X.C82622Wbi;
import X.C84363X9b;
import X.GHB;
import X.H8G;
import X.InterfaceC135635Tz;
import X.InterfaceC161306Us;
import X.InterfaceC65784Pro;
import X.J9K;
import X.O6R;
import X.ORZ;
import X.WM7;
import Y.ACListenerS22S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDTListenerS112S0100000_2;
import Y.IDiS266S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImagePublishPreviewScene extends PublishPreviewScene implements InterfaceC135635Tz {
    public final VideoPublishEditModel LJLLI;
    public final String LJLLILLLL;
    public final UrlModel LJLLJ;
    public final int LJLLL;
    public final String LJLLLL;
    public final int LJLLLLLL;
    public final InterfaceC65784Pro<C76800UCe> LJLZ;
    public final InterfaceC65784Pro<C76800UCe> LJZ;
    public View LJZI;
    public View LJZL;
    public View LL;
    public C41531GRr LLD;
    public ImageView LLF;
    public View LLFF;
    public View LLFFF;
    public ViewGroup LLFII;
    public C152175y9 LLFZ;
    public C161236Ul LLI;
    public J9K LLIFFJFJJ;
    public View LLII;
    public View LLIIII;
    public TuxIconView LLIIIILZ;
    public FrameLayout LLIIIJ;
    public InterfaceC161306Us LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public String LLIIL;
    public float LLIILII;
    public boolean LLIILZL;
    public final C5H3 LLIIZ;
    public final C62822Ol8 LLIL;

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LJIJI() {
    }

    public final void LLLIIII() {
        if (!this.LLIIJLIL) {
            TuxIconView tuxIconView = this.LLIIIILZ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                J9K j9k = this.LLIFFJFJJ;
                if (j9k != null) {
                    j9k.LIZIZ();
                }
                ((C6XL) this.LLIIZ.getValue()).ka(false);
                this.LLIIJLIL = true;
                return;
            }
            o.LJIJI("pauseButton");
            throw null;
        }
        LLLIIIIL();
    }

    public final void LLLIIIIL() {
        MediaPlayer mediaPlayer;
        TuxIconView tuxIconView = this.LLIIIILZ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
            J9K j9k = this.LLIFFJFJJ;
            if (j9k != null && j9k.LIZJ && (mediaPlayer = j9k.LIZIZ) != null) {
                mediaPlayer.start();
            }
            ((C6XL) this.LLIIZ.getValue()).resume();
            this.LLIIJLIL = false;
            return;
        }
        o.LJIJI("pauseButton");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLII() {
        WM7 wm7;
        NavigationScene LJIIJJI = C78923UyF.LJIIJJI(this);
        if (LJIIJJI != null) {
            wm7 = LJIIJJI.LLJJIII();
        } else {
            wm7 = null;
        }
        return o.LJ(wm7, this);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
        if (LJJLIIIJJI != null) {
            return LJJLIIIJJI;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        J9K j9k = this.LLIFFJFJJ;
        if (j9k != null) {
            j9k.LIZLLL();
        }
        ((C152935zN) this.LLIL.getValue()).LIZ();
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onPause() {
        super.onPause();
        J9K j9k = this.LLIFFJFJJ;
        if (j9k != null) {
            j9k.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onResume() {
        super.onResume();
        this.LLIILZL = false;
        LLLIIIIL();
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onStop() {
        super.onStop();
        J9K j9k = this.LLIFFJFJJ;
        if (j9k != null) {
            j9k.LIZIZ();
        }
        if (!this.LLIILZL) {
            H8G.LIZLLL(this.LJLLI, this.LLIIIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLI() {
        return this.LLIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZIZ(boolean z) {
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        int LIZIZ = (int) C74275TDb.LIZIZ(requireActivity, 13.0f);
        Activity requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        int LIZIZ2 = (int) C74275TDb.LIZIZ(requireActivity2, 3.0f);
        C41531GRr c41531GRr = this.LLD;
        if (c41531GRr != null) {
            LLLILZ(LIZIZ, c41531GRr, true);
            ImageView imageView = this.LLF;
            if (imageView != null) {
                LLLILZ(LIZIZ2, imageView, true);
                View view = this.LLFF;
                if (view != null) {
                    LLLILZ(LIZIZ2, view, true);
                    View view2 = this.LLII;
                    if (view2 != null) {
                        LLLILZ(0, view2, false);
                        View view3 = this.LLFFF;
                        if (view3 != null) {
                            LLLILZ(LIZIZ2, view3, true);
                            return;
                        } else {
                            o.LJIJI("presentButton");
                            throw null;
                        }
                    }
                    o.LJIJI("previewShadowTop");
                    throw null;
                }
                o.LJIJI("clearScreenButton");
                throw null;
            }
            o.LJIJI("backButton");
            throw null;
        }
        o.LJIJI("previewFakeFeedView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZJ(boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = C1549666i.LIZIZ();
        } else {
            i = 0;
        }
        C41531GRr c41531GRr = this.LLD;
        if (c41531GRr != null) {
            if (z || C6XP.LIZ()) {
                i2 = C1549666i.LIZIZ();
            }
            c41531GRr.setBottomMargin(i2);
            C152175y9 c152175y9 = this.LLFZ;
            if (c152175y9 != null) {
                LLLIILIL(i, c152175y9);
                FrameLayout frameLayout = this.LLIIIJ;
                if (frameLayout != null) {
                    LLLIILIL(i, frameLayout);
                    TuxIconView tuxIconView = this.LLIIIILZ;
                    if (tuxIconView != null) {
                        LLLIILIL(i / 2, tuxIconView);
                        View view = this.LLIIII;
                        if (view != null) {
                            LLLIILIL(i, view);
                            View view2 = this.LL;
                            if (view2 != null) {
                                LLLIILIL(C1549666i.LIZIZ() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(52)), view2);
                                return;
                            } else {
                                o.LJIJI("publishButton");
                                throw null;
                            }
                        }
                        o.LJIJI("previewShadowBottom");
                        throw null;
                    }
                    o.LJIJI("pauseButton");
                    throw null;
                }
                o.LJIJI("stickerLayout");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("previewFakeFeedView");
        throw null;
    }

    public final void LLLIIIL(boolean z) {
        NavigationScene LJIIJJI;
        VideoPublishEditModel videoPublishEditModel = this.LJLLI;
        boolean z2 = this.LLIIIZ;
        String str = this.LJLLLL;
        if (str == null) {
            str = "";
        }
        String str2 = this.LLIIL;
        if (str2 != null) {
            C6XQ.LIZIZ(videoPublishEditModel, str, str2, z2);
            LLLILZLLLI(false);
            View view = this.LL;
            if (view != null) {
                view.setVisibility(8);
                this.LLIILZL = true;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJZ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                if (!z && (LJIIJJI = C78923UyF.LJIIJJI(this)) != null) {
                    LJIIJJI.remove(this);
                    return;
                }
                return;
            }
            o.LJIJI("publishButton");
            throw null;
        }
        o.LJIJI("previewEntranceTime");
        throw null;
    }

    public final void LLLILZLLLI(boolean z) {
        int i;
        this.LLIIIZ = z;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C41531GRr c41531GRr = this.LLD;
        if (c41531GRr != null) {
            c41531GRr.setVisibility(i);
            if (C6XP.LIZIZ() || !C6XP.LIZ()) {
                ImageView imageView = this.LLF;
                if (imageView != null) {
                    imageView.setVisibility(i);
                    View view = this.LL;
                    if (view != null) {
                        view.setVisibility(i);
                    } else {
                        o.LJIJI("publishButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("backButton");
                    throw null;
                }
            } else {
                View view2 = this.LL;
                if (view2 != null) {
                    view2.setVisibility(0);
                    ImageView imageView2 = this.LLF;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    } else {
                        o.LJIJI("backButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("publishButton");
                    throw null;
                }
            }
            if (C6XP.LIZ() && !C6XP.LIZIZ()) {
                View view3 = this.LLFFF;
                if (view3 != null) {
                    if (!z) {
                        i2 = 0;
                    }
                    view3.setVisibility(i2);
                } else {
                    o.LJIJI("presentButton");
                    throw null;
                }
            }
            View view4 = this.LLFF;
            if (view4 != null) {
                view4.setVisibility(i);
                View view5 = this.LLII;
                if (view5 != null) {
                    view5.setVisibility(i);
                    View view6 = this.LLIIII;
                    if (view6 != null) {
                        view6.setVisibility(i);
                        return;
                    } else {
                        o.LJIJI("previewShadowBottom");
                        throw null;
                    }
                }
                o.LJIJI("previewShadowTop");
                throw null;
            }
            o.LJIJI("clearScreenButton");
            throw null;
        }
        o.LJIJI("previewFakeFeedView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 198));
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 199));
        C44384HbQ.LJJJI(this);
        C60903NvH.LJIIJJI().LJIJJLI();
        ((C6XL) this.LLIIZ.getValue()).jp(false);
    }

    public final void LLLIILIL(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i;
        view.setLayoutParams(layoutParams2);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        UrlModel musicUrlModel;
        List<String> urlList;
        String str;
        int i;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        String mMusicPath = this.LJLLI.getMMusicPath();
        if (mMusicPath == null || ujb.o.LJJJJJL(mMusicPath)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && C44687HgJ.LIZIZ(this.LJLLI.getMMusicPath())) {
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            J9K j9k = new J9K(requireSceneContext);
            this.LLIFFJFJJ = j9k;
            String mMusicPath2 = this.LJLLI.getMMusicPath();
            o.LJIIIIZZ(mMusicPath2, "model.mMusicPath");
            j9k.LIZJ(this.LJLLI.musicVolume / 2, mMusicPath2);
        } else {
            EditPostModel editPostModel = this.LJLLI.creativeModel.editPostModel;
            if (editPostModel != null && (musicUrlModel = editPostModel.getMusicUrlModel()) != null && (urlList = musicUrlModel.getUrlList()) != null && (str = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
                Context requireSceneContext2 = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                J9K j9k2 = new J9K(requireSceneContext2);
                this.LLIFFJFJJ = j9k2;
                j9k2.LIZJ(this.LJLLI.musicVolume, str);
            }
        }
        this.LLIIL = String.valueOf(System.currentTimeMillis() / 1000);
        View findViewById = view.findViewById(R.id.j71);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.root)");
        this.LLFII = (ViewGroup) findViewById;
        View findViewById2 = this.mView.findViewById(R.id.i2r);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.preview_fake_feed_view)");
        C41531GRr c41531GRr = (C41531GRr) findViewById2;
        this.LLD = c41531GRr;
        c41531GRr.LIZ(this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL);
        View findViewById3 = this.mView.findViewById(R.id.i1y);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.preview_back_iv)");
        ImageView imageView = (ImageView) findViewById3;
        this.LLF = imageView;
        imageView.setVisibility(0);
        ImageView imageView2 = this.LLF;
        if (imageView2 != null) {
            C16880lQ.LJIILLIIL(imageView2, new ACListenerS22S0100000_2(this, 39));
            View findViewById4 = this.mView.findViewById(R.id.i27);
            o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.preview_clear_screen_iv)");
            this.LLFF = findViewById4;
            findViewById4.setVisibility(0);
            View view2 = this.LLFF;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 40), view2);
                View findViewById5 = this.mView.findViewById(R.id.his);
                o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.pause)");
                this.LLIIIILZ = (TuxIconView) findViewById5;
                View requireViewById = requireViewById(R.id.ife);
                o.LJIIIIZZ(requireViewById, "requireViewById(R.id.publish_container)");
                this.LL = requireViewById;
                if (C6XP.LIZ()) {
                    i = 0;
                } else {
                    i = 4;
                }
                requireViewById.setVisibility(i);
                if (this.LJLLI.creativeModel.editPostModel != null) {
                    ((TextView) requireViewById(R.id.ifw)).setText(R.string.fq9);
                }
                View view3 = this.LL;
                if (view3 != null) {
                    C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 42), view3);
                    View requireViewById2 = requireViewById(R.id.ifp);
                    o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.publish_loading_iv)");
                    this.LJZL = requireViewById2;
                    View requireViewById3 = requireViewById(R.id.ifm);
                    o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.publish_ll)");
                    this.LJZI = requireViewById3;
                    View findViewById6 = this.mView.findViewById(R.id.i3l);
                    o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.preview_present_icon)");
                    this.LLFFF = findViewById6;
                    C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 41), findViewById6);
                    View requireViewById4 = requireViewById(R.id.i3q);
                    o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.preview_shadow_top)");
                    this.LLII = requireViewById4;
                    View requireViewById5 = requireViewById(R.id.i3p);
                    o.LJIIIIZZ(requireViewById5, "requireViewById(R.id.preview_shadow_bottom)");
                    this.LLIIII = requireViewById5;
                    View requireViewById6 = requireViewById(R.id.n9y);
                    o.LJIIIIZZ(requireViewById6, "requireViewById(R.id.viewPager)");
                    this.LLFZ = (C152175y9) requireViewById6;
                    View requireViewById7 = requireViewById(R.id.kil);
                    o.LJIIIIZZ(requireViewById7, "requireViewById(R.id.sti…ew_engine_preview_layout)");
                    this.LLIIIJ = (FrameLayout) requireViewById7;
                    Activity activity = this.mActivity;
                    Context requireSceneContext3 = requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext3, "requireSceneContext()");
                    ImageAlbumData imageAlbumData = this.LJLLI.getImageAlbumData();
                    o.LJIIIIZZ(imageAlbumData, "model.imageAlbumData");
                    this.LLI = new C161236Ul(activity, requireSceneContext3, imageAlbumData);
                    C152175y9 c152175y9 = this.LLFZ;
                    if (c152175y9 != null) {
                        c152175y9.setOffscreenPageLimit(1);
                        C152175y9 c152175y92 = this.LLFZ;
                        if (c152175y92 != null) {
                            C161236Ul c161236Ul = this.LLI;
                            if (c161236Ul != null) {
                                c152175y92.setAdapter(c161236Ul);
                                C152175y9 c152175y93 = this.LLFZ;
                                if (c152175y93 != null) {
                                    c152175y93.setPublishPreview(true);
                                    C152175y9 c152175y94 = this.LLFZ;
                                    if (c152175y94 != null) {
                                        c152175y94.setCanScroll(true);
                                        C152175y9 c152175y95 = this.LLFZ;
                                        if (c152175y95 != null) {
                                            c152175y95.setCurrentItem(this.LJLLLLLL, false);
                                            C152175y9 c152175y96 = this.LLFZ;
                                            if (c152175y96 != null) {
                                                c152175y96.LJFF(new IDiS266S0100000_2(this, 2));
                                                C152175y9 c152175y97 = this.LLFZ;
                                                if (c152175y97 != null) {
                                                    c152175y97.setOnTouchListener(new IDTListenerS112S0100000_2(this, 9));
                                                    if (!((C152935zN) this.LLIL.getValue()).LIZLLL()) {
                                                        int i2 = 0;
                                                        for (SingleImageData singleImageData : this.LJLLI.getImageAlbumData().getImageList()) {
                                                            int i3 = i2 + 1;
                                                            if (i2 >= 0) {
                                                                SingleImageData singleImageData2 = singleImageData;
                                                                C161236Ul c161236Ul2 = this.LLI;
                                                                if (c161236Ul2 != null) {
                                                                    ImageSynthesisResult synthesisData = singleImageData2.getSynthesisData();
                                                                    if (synthesisData != null) {
                                                                        c161236Ul2.LJJIII(i2, synthesisData);
                                                                        i2 = i3;
                                                                    } else {
                                                                        "Required value was null.".toString();
                                                                        throw new IllegalArgumentException("Required value was null.");
                                                                    }
                                                                } else {
                                                                    o.LJIJI("viewPagerAdapter");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C47261Igj.LJJJJJ();
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        ((C152935zN) this.LLIL.getValue()).LJ(this.LJLLI, new AqS184S0100000_2(this, 27), C6XM.LJLIL, C6XO.LJLIL);
                                                    }
                                                    ImageAlbumData imageAlbumData2 = this.LJLLI.getImageAlbumData();
                                                    if (imageAlbumData2 != null && (stickerInfoNewEngine = imageAlbumData2.getStickerInfoNewEngine()) != null && stickerInfoNewEngine.hasSticker()) {
                                                        SceneExtensionsKt.LIZIZ(this, new ARunnableS38S0100000_2(this, 81));
                                                    }
                                                    C78923UyF.LJIILLIIL(this).LLJILJILJ(this, new GHB() { // from class: X.6XN
                                                        @Override // X.GHB
                                                        public final boolean onBackPressed() {
                                                            ImagePublishPreviewScene.this.LLLIIIL(true);
                                                            return false;
                                                        }
                                                    });
                                                    ViewGroup viewGroup = this.LLFII;
                                                    if (viewGroup != null) {
                                                        C84363X9b.LIZ(viewGroup, new AqS152S0100000_2(this, 283));
                                                        return;
                                                    } else {
                                                        o.LJIJI("rootView");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("viewPager");
                                                throw null;
                                            }
                                            o.LJIJI("viewPager");
                                            throw null;
                                        }
                                        o.LJIJI("viewPager");
                                        throw null;
                                    }
                                    o.LJIJI("viewPager");
                                    throw null;
                                }
                                o.LJIJI("viewPager");
                                throw null;
                            }
                            o.LJIJI("viewPagerAdapter");
                            throw null;
                        }
                        o.LJIJI("viewPager");
                        throw null;
                    }
                    o.LJIJI("viewPager");
                    throw null;
                }
                o.LJIJI("publishButton");
                throw null;
            }
            o.LJIJI("clearScreenButton");
            throw null;
        }
        o.LJIJI("backButton");
        throw null;
    }

    public final void LLLILZ(int i, View view, boolean z) {
        int LJFF = C81184Vtc.LJFF(requireActivity());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            i += LJFF;
        }
        layoutParams2.topMargin = i;
        view.setLayoutParams(layoutParams2);
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.lc, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    public ImagePublishPreviewScene(VideoPublishEditModel model, String str, UrlModel urlModel, int i, String str2, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(model, "model");
        this.LJLLI = model;
        this.LJLLILLLL = str;
        this.LJLLJ = urlModel;
        this.LJLLL = i;
        this.LJLLLL = str2;
        this.LJLLLLLL = i2;
        this.LJLZ = interfaceC65784Pro;
        this.LJZ = interfaceC65784Pro2;
        this.LLIIIZ = true;
        this.LLIIZ = C269113v.LIZ(this, C6XL.class);
        this.LLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 284));
    }
}
