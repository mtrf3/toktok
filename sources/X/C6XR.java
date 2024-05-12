package X;

import Y.ACListenerS22S0100000_2;
import Y.IDTListenerS112S0100000_2;
import Y.IDiS266S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6XR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XR extends WMH implements InterfaceC135635Tz {
    public boolean LJLIL;
    public C41531GRr LJLILLLLZI;
    public ImageView LJLJI;
    public ImageView LJLJJI;
    public ViewGroup LJLJJL;
    public VideoPublishEditModel LJLJJLL;
    public C152175y9 LJLJL;
    public C161236Ul LJLJLJ;
    public J9K LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public TuxIconView LJLLILLLL;
    public String LJLLJ;
    public int LJLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public String LJZ;
    public float LJZI;
    public boolean LJLLLL = true;
    public final C5H3 LJZL = C269113v.LIZ(this, C6XL.class);
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 285));

    public final void LLJILJIL() {
        MediaPlayer mediaPlayer;
        TuxIconView tuxIconView = this.LJLLILLLL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
            J9K j9k = this.LJLJLLL;
            if (j9k != null && j9k.LIZJ && (mediaPlayer = j9k.LIZIZ) != null) {
                mediaPlayer.start();
            }
            ((C6XL) this.LJZL.getValue()).resume();
            this.LJLZ = false;
            return;
        }
        o.LJIJI("pauseButton");
        throw null;
    }

    public final void LLJILJILJ() {
        VideoPublishEditModel videoPublishEditModel = this.LJLJJLL;
        if (videoPublishEditModel != null) {
            boolean z = this.LJLLLL;
            String str = this.LJLLJ;
            if (str == null) {
                str = "";
            }
            String str2 = this.LJZ;
            if (str2 != null) {
                C6XQ.LIZIZ(videoPublishEditModel, str, str2, z);
                LLJJIII(false);
                this.LJLIL = true;
                requireActivity().setResult(-1);
                requireActivity().finishAfterTransition();
                return;
            }
            o.LJIJI("previewEntranceTime");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this);
        o.LJI(LJJLIIIJJI);
        return LJJLIIIJJI;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        J9K j9k = this.LJLJLLL;
        if (j9k != null) {
            j9k.LIZLLL();
        }
        ((C152935zN) this.LL.getValue()).LIZ();
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        J9K j9k = this.LJLJLLL;
        if (j9k != null) {
            j9k.LIZIZ();
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        LLJILJIL();
        this.LJLIL = false;
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        J9K j9k = this.LJLJLLL;
        if (j9k != null) {
            j9k.LIZIZ();
        }
        if (!this.LJLIL) {
            VideoPublishEditModel videoPublishEditModel = this.LJLJJLL;
            if (videoPublishEditModel != null) {
                H8G.LIZLLL(videoPublishEditModel, this.LJLLLL);
            } else {
                o.LJIJI("model");
                throw null;
            }
        }
    }

    public final void LLJJIII(boolean z) {
        int i;
        this.LJLLLL = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C41531GRr c41531GRr = this.LJLILLLLZI;
        if (c41531GRr != null) {
            c41531GRr.setVisibility(i);
            ImageView imageView = this.LJLJI;
            if (imageView != null) {
                imageView.setVisibility(i);
                ImageView imageView2 = this.LJLJJI;
                if (imageView2 != null) {
                    imageView2.setVisibility(i);
                    View view = this.LJLL;
                    if (view != null) {
                        view.setVisibility(i);
                        View view2 = this.LJLLI;
                        if (view2 != null) {
                            view2.setVisibility(i);
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
            o.LJIJI("backButton");
            throw null;
        }
        o.LJIJI("previewFakeFeedView");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C78688UuS.LJIIIZ(this, false, new AqS168S0100000_2(this, 200));
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 201));
        C44384HbQ.LJJJI(this);
        C60903NvH.LJIIJJI().LJIJJLI();
        ((C6XL) this.LJZL.getValue()).jp(false);
    }

    public final void LLJJ(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i;
        view.setLayoutParams(layoutParams2);
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Intent intent = requireActivity().getIntent();
        o.LJIIIIZZ(intent, "intent");
        VideoPublishEditModel LJIIJ = H7R.LJIIJ(intent);
        this.LJLJJLL = LJIIJ;
        String mMusicPath = LJIIJ.getMMusicPath();
        int i = 0;
        if (mMusicPath == null || ujb.o.LJJJJJL(mMusicPath)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            VideoPublishEditModel videoPublishEditModel = this.LJLJJLL;
            if (videoPublishEditModel != null) {
                if (C44687HgJ.LIZIZ(videoPublishEditModel.getMMusicPath())) {
                    Context requireSceneContext = requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                    J9K j9k = new J9K(requireSceneContext);
                    this.LJLJLLL = j9k;
                    VideoPublishEditModel videoPublishEditModel2 = this.LJLJJLL;
                    if (videoPublishEditModel2 != null) {
                        String mMusicPath2 = videoPublishEditModel2.getMMusicPath();
                        o.LJIIIIZZ(mMusicPath2, "model.mMusicPath");
                        VideoPublishEditModel videoPublishEditModel3 = this.LJLJJLL;
                        if (videoPublishEditModel3 != null) {
                            j9k.LIZJ(videoPublishEditModel3.musicVolume / 2, mMusicPath2);
                        } else {
                            o.LJIJI("model");
                            throw null;
                        }
                    } else {
                        o.LJIJI("model");
                        throw null;
                    }
                }
            } else {
                o.LJIJI("model");
                throw null;
            }
        }
        this.LJLLJ = C16880lQ.LLJJIJIIJIL(intent, "extra_publish_preview_last_group_id");
        this.LJLLL = intent.getIntExtra("extra_publish_preview_image_index", 0);
        this.LJZ = String.valueOf(System.currentTimeMillis() / 1000);
        View findViewById = view.findViewById(R.id.j71);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.root)");
        this.LJLJJL = (ViewGroup) findViewById;
        Intent intent2 = requireActivity().getIntent();
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent2, "extra_publish_preview_anchor_text");
        UrlModel urlModel = (UrlModel) intent2.getSerializableExtra("extra_publish_preview_anchor_icon_url");
        int intExtra = intent2.getIntExtra("extra_publish_preview_permission", -1);
        View findViewById2 = this.mView.findViewById(R.id.i2r);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.preview_fake_feed_view)");
        C41531GRr c41531GRr = (C41531GRr) findViewById2;
        this.LJLILLLLZI = c41531GRr;
        VideoPublishEditModel videoPublishEditModel4 = this.LJLJJLL;
        if (videoPublishEditModel4 != null) {
            c41531GRr.LIZ(videoPublishEditModel4, LLJJIJIIJIL, urlModel, intExtra);
            View findViewById3 = this.mView.findViewById(R.id.i1y);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.preview_back_iv)");
            ImageView imageView = (ImageView) findViewById3;
            this.LJLJI = imageView;
            imageView.setVisibility(0);
            ImageView imageView2 = this.LJLJI;
            if (imageView2 != null) {
                C16880lQ.LJIILLIIL(imageView2, new ACListenerS22S0100000_2(this, 37));
                View findViewById4 = this.mView.findViewById(R.id.i27);
                o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.preview_clear_screen_iv)");
                ImageView imageView3 = (ImageView) findViewById4;
                this.LJLJJI = imageView3;
                imageView3.setVisibility(0);
                ImageView imageView4 = this.LJLJJI;
                if (imageView4 != null) {
                    C16880lQ.LJIILLIIL(imageView4, new ACListenerS22S0100000_2(this, 38));
                    View findViewById5 = this.mView.findViewById(R.id.his);
                    o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.pause)");
                    this.LJLLILLLL = (TuxIconView) findViewById5;
                    View requireViewById = requireViewById(R.id.i3q);
                    o.LJIIIIZZ(requireViewById, "requireViewById(R.id.preview_shadow_top)");
                    this.LJLL = requireViewById;
                    View requireViewById2 = requireViewById(R.id.i3p);
                    o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.preview_shadow_bottom)");
                    this.LJLLI = requireViewById2;
                    View requireViewById3 = requireViewById(R.id.n9y);
                    o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.viewPager)");
                    this.LJLJL = (C152175y9) requireViewById3;
                    Activity activity = this.mActivity;
                    Context requireSceneContext2 = requireSceneContext();
                    o.LJIIIIZZ(requireSceneContext2, "requireSceneContext()");
                    VideoPublishEditModel videoPublishEditModel5 = this.LJLJJLL;
                    if (videoPublishEditModel5 != null) {
                        ImageAlbumData imageAlbumData = videoPublishEditModel5.getImageAlbumData();
                        o.LJIIIIZZ(imageAlbumData, "model.imageAlbumData");
                        this.LJLJLJ = new C161236Ul(activity, requireSceneContext2, imageAlbumData);
                        C152175y9 c152175y9 = this.LJLJL;
                        if (c152175y9 != null) {
                            c152175y9.setOffscreenPageLimit(1);
                            C152175y9 c152175y92 = this.LJLJL;
                            if (c152175y92 != null) {
                                C161236Ul c161236Ul = this.LJLJLJ;
                                if (c161236Ul != null) {
                                    c152175y92.setAdapter(c161236Ul);
                                    C152175y9 c152175y93 = this.LJLJL;
                                    if (c152175y93 != null) {
                                        c152175y93.setPublishPreview(true);
                                        C152175y9 c152175y94 = this.LJLJL;
                                        if (c152175y94 != null) {
                                            c152175y94.setCanScroll(true);
                                            C152175y9 c152175y95 = this.LJLJL;
                                            if (c152175y95 != null) {
                                                c152175y95.setCurrentItem(this.LJLLL, false);
                                                C152175y9 c152175y96 = this.LJLJL;
                                                if (c152175y96 != null) {
                                                    c152175y96.LJFF(new IDiS266S0100000_2(this, 3));
                                                    C152175y9 c152175y97 = this.LJLJL;
                                                    if (c152175y97 != null) {
                                                        c152175y97.setOnTouchListener(new IDTListenerS112S0100000_2(this, 10));
                                                        if (!((C152935zN) this.LL.getValue()).LIZLLL()) {
                                                            VideoPublishEditModel videoPublishEditModel6 = this.LJLJJLL;
                                                            if (videoPublishEditModel6 != null) {
                                                                for (SingleImageData singleImageData : videoPublishEditModel6.getImageAlbumData().getImageList()) {
                                                                    int i2 = i + 1;
                                                                    if (i >= 0) {
                                                                        SingleImageData singleImageData2 = singleImageData;
                                                                        C161236Ul c161236Ul2 = this.LJLJLJ;
                                                                        if (c161236Ul2 != null) {
                                                                            ImageSynthesisResult synthesisData = singleImageData2.getSynthesisData();
                                                                            o.LJI(synthesisData);
                                                                            c161236Ul2.LJJIII(i, synthesisData);
                                                                            i = i2;
                                                                        } else {
                                                                            o.LJIJI("viewPagerAdapter");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C47261Igj.LJJJJJ();
                                                                        throw null;
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            o.LJIJI("model");
                                                            throw null;
                                                        }
                                                        C152935zN c152935zN = (C152935zN) this.LL.getValue();
                                                        VideoPublishEditModel videoPublishEditModel7 = this.LJLJJLL;
                                                        if (videoPublishEditModel7 != null) {
                                                            c152935zN.LJ(videoPublishEditModel7, new AqS184S0100000_2(this, 28), C67362ke.LJLIL, C6XS.LJLIL);
                                                            return;
                                                        } else {
                                                            o.LJIJI("model");
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
                    o.LJIJI("model");
                    throw null;
                }
                o.LJIJI("clearScreenButton");
                throw null;
            }
            o.LJIJI("backButton");
            throw null;
        }
        o.LJIJI("model");
        throw null;
    }

    public final void LLJJI(int i, View view, boolean z) {
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

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.lb, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
