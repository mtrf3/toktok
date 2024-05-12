package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AbstractC143185je;
import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.AnonymousClass668;
import X.C00F;
import X.C10K;
import X.C135315St;
import X.C138845ce;
import X.C145995oB;
import X.C1549666i;
import X.C1558469s;
import X.C1558669u;
import X.C156436Bz;
import X.C157226Fa;
import X.C157236Fb;
import X.C158326Jg;
import X.C161276Up;
import X.C164826dS;
import X.C164846dU;
import X.C16880lQ;
import X.C32151Nz;
import X.C41531GRr;
import X.C44172HVg;
import X.C58B;
import X.C5HC;
import X.C5O6;
import X.C67P;
import X.C69M;
import X.C6FB;
import X.C6JH;
import X.C6XF;
import X.C6XP;
import X.C6XQ;
import X.C74275TDb;
import X.C78886Uxe;
import X.C78923UyF;
import X.C78996UzQ;
import X.C81184Vtc;
import X.EnumC164816dR;
import X.GHB;
import X.H7R;
import X.H8G;
import X.InterfaceC133835Nb;
import X.InterfaceC153045zY;
import X.InterfaceC164896dZ;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.X1D;
import Y.ACListenerS21S0101000_2;
import Y.ACListenerS31S0101000_14;
import Y.ACListenerS32S0101000_15;
import Y.ACallableS44S0201000_7;
import Y.AObjectS41S0101000_2;
import Y.AObjectS47S0101000_2;
import Y.AObjectS56S0101000_13;
import Y.ARunnableS6S0101000_2;
import Y.ARunnableS6S0400000_2;
import Y.AUListenerS91S0100000_2;
import Y.IDAListenerS71S0100000_2;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.PublishPreviewScene;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.TCMPostPageSubmitTextModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class VEVideoPublishPreviewScene extends PublishPreviewScene implements C5HC, InterfaceC164896dZ {
    public static final String LLJJ;
    public static final String LLJJI;
    public static final String LLJJIII;
    public static final String LLJJIJI;
    public static final String LLJJIJIIJIL;
    public static final String LLJJIJIL;
    public static final String LLJJJ;
    public static final String LLJJJIL;
    public static final String LLJJJJ;
    public final boolean LJLLI;
    public ImageView LJLLILLLL;
    public VideoPublishEditModel LJLLJ;
    public C135315St LJLLL;
    public SurfaceView LJLLLL;
    public C69M LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public C41531GRr LJZI;
    public View LJZL;
    public ImageView LL;
    public ImageView LLD;
    public String LLF;
    public UrlModel LLFF;
    public int LLFFF;
    public String LLFII;
    public String LLFZ;
    public long LLI;
    public AbstractC143185je LLIFFJFJJ;
    public FrameLayout LLII;
    public View LLIIII;
    public View LLIIIILZ;
    public TextView LLIIIJ;
    public CaptionStruct LLIIIL;
    public NavigationScene LLIIIZ;
    public View LLIIJI;
    public View LLIIJLIL;
    public View LLIIL;
    public final InterfaceC65784Pro<Void> LLIILII;
    public View LLIILZL;
    public View LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public FrameLayout LLILLIZIL;
    public InfoStickerModel LLILLJJLI;
    public final List<TextStickerData> LLILLL;
    public final List<C67P> LLILZ;
    public SafeHandler LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public TextView LLJ;
    public C6JH LLJI;
    public C158326Jg LLJIJIL;
    public Bundle LLJILJIL;
    public boolean LLJILJILJ;
    public View LLJILLL;

    static {
        C16880lQ.LJLLJ(VEVideoPublishPreviewScene.class);
        LLJJ = "last_group_id";
        LLJJI = "permission_state";
        LLJJIII = "anchor_text";
        LLJJIJI = "anchor_icon_url";
        LLJJIJIIJIL = "model";
        LLJJIJIL = "publish_bundle";
        LLJJJ = "publish_button_name";
        LLJJJIL = "publish_hide_button";
        LLJJJJ = "from_series";
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LJIJI() {
        if (H7R.LJJJJI(this.LJLLJ)) {
            LLLIILIL(3, 4, this.LJLLLL);
        } else {
            if (this.LLIFFJFJJ == null) {
                return;
            }
            LLLFF().LJII(this.LLIFFJFJJ.LIZIZ(), this.LLIFFJFJJ.LJ(), this.LJLLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLI() {
        return !this.LLIL;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.PublishPreviewScene
    public final boolean LLLII() {
        NavigationScene navigationScene = this.LLIIIZ;
        if (navigationScene == null || navigationScene.LLJJIII() != this) {
            return false;
        }
        return true;
    }

    public final void LLLIIII() {
        View view = this.LLJILLL;
        if (view != null) {
            view.bringToFront();
        }
        this.LJZI.bringToFront();
        this.LL.bringToFront();
        this.LJZL.bringToFront();
        this.LLD.bringToFront();
        this.LLIIL.bringToFront();
        this.LLIIJI.bringToFront();
    }

    public final void LLLIIIIL() {
        C1558469s c1558469s;
        C158326Jg c158326Jg;
        List<InteractStickerStruct> LJI;
        InterfaceC153045zY interfaceC153045zY;
        this.LJLLLL.bringToFront();
        this.LJLLLL.setVisibility(0);
        this.LLIIIILZ.bringToFront();
        this.LLIIII.bringToFront();
        this.LLIIII.setVisibility(0);
        this.LLIIIILZ.setVisibility(0);
        this.LJLLILLLL.setAlpha(0.0f);
        this.LJLLILLLL.setVisibility(8);
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null) {
            if (C138845ce.LIZ() && H7R.LJJJJZ(this.LJLLJ)) {
                this.LLILZIL = new SafeHandler(this);
                FrameLayout frameLayout = this.LLILLIZIL;
                if (frameLayout != null) {
                    frameLayout.bringToFront();
                }
                C135315St c135315St = this.LJLLL;
                if (c135315St != null && (interfaceC153045zY = c135315St.LJIIIZ) != null) {
                    interfaceC153045zY.LLJLIL(new InterfaceC133835Nb() { // from class: X.6J1
                        @Override // X.InterfaceC133835Nb
                        public final void LIZ(int i) {
                            VEVideoPublishPreviewScene vEVideoPublishPreviewScene = VEVideoPublishPreviewScene.this;
                            Activity activity = vEVideoPublishPreviewScene.mActivity;
                            if (activity == null) {
                                return;
                            }
                            Iterator it = ((ArrayList) vEVideoPublishPreviewScene.LLILLL).iterator();
                            while (it.hasNext()) {
                                TextStickerData textStickerData = (TextStickerData) it.next();
                                if (i >= textStickerData.getStartTime() && i <= textStickerData.getEndTime() && !textStickerData.getAddToLayoutInPreviewOrCover()) {
                                    C67P c67p = new C67P(activity, vEVideoPublishPreviewScene.LLILZIL, textStickerData, false, new OJY(), Boolean.FALSE);
                                    int right = (vEVideoPublishPreviewScene.LJLLLL.getRight() + vEVideoPublishPreviewScene.LJLLLL.getLeft()) / 2;
                                    int bottom = (vEVideoPublishPreviewScene.LJLLLL.getBottom() + vEVideoPublishPreviewScene.LJLLLL.getTop()) / 2;
                                    float layoutWidth = textStickerData.getLayoutWidth();
                                    float layoutHeight = textStickerData.getLayoutHeight();
                                    if (layoutWidth == 0.0f) {
                                        layoutWidth = C81184Vtc.LJ(vEVideoPublishPreviewScene.LLII());
                                    }
                                    if (layoutHeight == 0.0f) {
                                        layoutHeight = C81184Vtc.LIZLLL(vEVideoPublishPreviewScene.LLII());
                                    }
                                    float max = Math.max(vEVideoPublishPreviewScene.LJLLLL.getWidth() / layoutWidth, vEVideoPublishPreviewScene.LJLLLL.getHeight() / layoutHeight);
                                    int i2 = (int) (right - (layoutWidth / 2.0f));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) layoutWidth, (int) layoutHeight);
                                    marginLayoutParams.setMarginStart(i2);
                                    marginLayoutParams.topMargin = (int) (bottom - (layoutHeight / 2.0f));
                                    c67p.setScaleX(max);
                                    c67p.setScaleY(max);
                                    vEVideoPublishPreviewScene.LLILLIZIL.addView(c67p, marginLayoutParams);
                                    ((ArrayList) vEVideoPublishPreviewScene.LLILZ).add(c67p);
                                    textStickerData.setAddToLayoutInPreviewOrCover(true);
                                }
                                Iterator it2 = ((ArrayList) vEVideoPublishPreviewScene.LLILZ).iterator();
                                while (it2.hasNext()) {
                                    C67P c67p2 = (C67P) it2.next();
                                    c67p2.setPlayPosition(i);
                                    c67p2.LJIL();
                                }
                            }
                        }
                    });
                }
            }
            VideoPublishEditModel videoPublishEditModel2 = this.LJLLJ;
            if (videoPublishEditModel2 != null && videoPublishEditModel2.getMainBusinessContext() != null) {
                VideoPublishEditModel videoPublishEditModel3 = this.LJLLJ;
                if (videoPublishEditModel3.creativeModel.inlineCaptionModel == null && (LJI = C164826dS.LJI(videoPublishEditModel3.getMainBusinessContext(), 11, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI.isEmpty() && ListProtector.get(LJI, 0) != null) {
                    InteractStickerStruct interactStickerStruct = (InteractStickerStruct) ListProtector.get(LJI, 0);
                    if (interactStickerStruct.getCaptionStruct() != null && !C78886Uxe.LJJIJ(interactStickerStruct.getCaptionStruct().getUtterances())) {
                        this.LLIIIL = interactStickerStruct.getCaptionStruct();
                        TextView textView = (TextView) findViewById(R.id.m1n);
                        this.LLIIIJ = textView;
                        if (textView != null) {
                            this.LJLLLLLL = new C69M(this.LLIIIL.getUtterances());
                            this.LLIIIJ.setMaxWidth(C156436Bz.LLILZLL);
                            this.LLIIIJ.postDelayed(new ARunnableS6S0101000_2(6, this, 0), 300L);
                        }
                    }
                }
            }
            C164846dU mainBusinessContext = this.LJLLJ.getMainBusinessContext();
            EnumC164816dR enumC164816dR = EnumC164816dR.TRACK_PAGE_EDIT;
            List<InteractStickerStruct> LJI2 = C164826dS.LJI(mainBusinessContext, 10, enumC164816dR);
            C6JH c6jh = null;
            if (LJI2 != null && !LJI2.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI2, 0)).getCountDownStickerStruct() != null) {
                if ((C00F.LIZ(31744, 0, "creative_tools_publish_preview_experiment", true) & 1) != 0) {
                    ViewStub viewStub = (ViewStub) findViewById(R.id.kmo);
                    if (viewStub == null) {
                        c158326Jg = null;
                    } else {
                        c158326Jg = (C158326Jg) viewStub.inflate();
                    }
                } else {
                    c158326Jg = (C158326Jg) findViewById(R.id.i37);
                }
                this.LLJIJIL = c158326Jg;
                if (c158326Jg != null) {
                    View findViewById = findViewById(R.id.naa);
                    LLLJ(findViewById);
                    CountDownStickerStruct countDownStickerStruct = ((InteractStickerStruct) ListProtector.get(LJI2, 0)).getCountDownStickerStruct();
                    C158326Jg c158326Jg2 = this.LLJIJIL;
                    c158326Jg2.LIZ(countDownStickerStruct);
                    c158326Jg2.setTouchEnable(true);
                    c158326Jg2.setEditEnable(false);
                    NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI2, 0));
                    if (LIZIZ != null) {
                        LLLJIL(this.LLJIJIL, findViewById, LIZIZ);
                    }
                }
            }
            List<InteractStickerStruct> LJI3 = C164826dS.LJI(this.LJLLJ.getMainBusinessContext(), 1, enumC164816dR);
            if (LJI3 != null && !LJI3.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI3, 0)).getPollStruct() != null) {
                if ((C00F.LIZ(31744, 0, "creative_tools_publish_preview_experiment", true) & 1) != 0) {
                    ViewStub viewStub2 = (ViewStub) findViewById(R.id.kmp);
                    if (viewStub2 != null) {
                        c6jh = (C6JH) viewStub2.inflate();
                    }
                } else {
                    c6jh = (C6JH) findViewById(R.id.i3k);
                }
                this.LLJI = c6jh;
                if (c6jh != null) {
                    View findViewById2 = findViewById(R.id.naa);
                    LLLJ(findViewById2);
                    PollStruct pollStruct = ((InteractStickerStruct) ListProtector.get(LJI3, 0)).getPollStruct();
                    C6JH c6jh2 = this.LLJI;
                    c6jh2.LIZIZ(pollStruct);
                    c6jh2.setTouchEnable(true);
                    c6jh2.LJFF();
                    c6jh2.setEditEnable(false);
                    NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI3, 0));
                    if (LIZIZ2 != null) {
                        LLLJIL(this.LLJI, findViewById2, LIZIZ2);
                    }
                }
            }
            List<InteractStickerStruct> LJI4 = C164826dS.LJI(this.LJLLJ.getMainBusinessContext(), 14, enumC164816dR);
            if (LJI4 != null && !LJI4.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI4, 0)).getNatureClassificationStickerStruct() != null && (c1558469s = (C1558469s) findViewById(R.id.i3d)) != null) {
                View findViewById3 = findViewById(R.id.naa);
                LLLJ(findViewById3);
                NormalTrackTimeStamp LIZIZ3 = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI4, 0));
                if (LIZIZ3 != null) {
                    NatureClassificationStickerStruct natureClassificationStickerStruct = ((InteractStickerStruct) ListProtector.get(LJI4, 0)).getNatureClassificationStickerStruct();
                    InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) ListProtector.get(LJI4, 0);
                    if (natureClassificationStickerStruct != null && natureClassificationStickerStruct.getNatureClassificationStruct() != null) {
                        NatureClassificationStruct natureClassificationStruct = natureClassificationStickerStruct.getNatureClassificationStruct();
                        NatureSpeciesModel natureSpeciesModel = new NatureSpeciesModel(natureClassificationStruct.getSpeciesName(), natureClassificationStruct.getGenusName(), natureClassificationStruct.getSpeciesId(), natureClassificationStruct.getGenusId(), 0.0f, "");
                        C1558669u c1558669u = new C1558669u();
                        c1558669u.LJLIL = interactStickerStruct2;
                        c1558669u.LJLILLLLZI = (int) LIZIZ3.getStartTime();
                        c1558669u.LJLJI = (int) LIZIZ3.getEndTime();
                        c1558469s.LIZIZ(c1558669u, natureSpeciesModel.speciesName);
                    }
                    LLLJIL(c1558469s, findViewById3, LIZIZ3);
                }
            }
        }
        LLLIIII();
        LLLILZLLLI(true);
    }

    public final void LLLILZ() {
        this.LJZI.setVisibility(0);
        this.LL.setVisibility(0);
        this.LJZL.setVisibility(0);
        this.LLIIII.setVisibility(0);
        this.LLIIIILZ.setVisibility(0);
        LLLILZLLLI(true);
        this.LLIIL.setVisibility(4);
        if (this.LLILII) {
            this.LLD.setVisibility(0);
        }
        C41531GRr c41531GRr = this.LJZI;
        if (c41531GRr != null) {
            c41531GRr.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public final void onDestroyView() {
        this.LJLLL.LJIIIZ.LLIIIILZ();
        this.LJLLL.LIZIZ();
        C5O6.LJ = 0;
        C5O6.LJFF = 0;
        super.onDestroyView();
    }

    public VEVideoPublishPreviewScene() {
        this.LJLLI = true;
        this.LLILIL = true;
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLJILJILJ = false;
        this.LLJILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final C6FB LLLFF() {
        if (AnonymousClass668.LIZ()) {
            return C157226Fa.LIZ;
        }
        return C157236Fb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public final void onResume() {
        super.onResume();
        this.LLILII = false;
        this.LLILL = false;
        this.LJLLL.LIZLLL();
        this.LLD.setVisibility(4);
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        C161276Up.LIZ(this.LJLLJ, (ActivityC45651qj) requireActivity(), (ViewStub) findViewById(R.id.kkn), null, (FrameLayout.LayoutParams) this.LJLLLL.getLayoutParams(), 1.0f, new AObjectS41S0101000_2(1, this, 0), new AObjectS56S0101000_13(5, this, 0), new AObjectS47S0101000_2(2, this, 6), this);
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public final void onStop() {
        InterfaceC153045zY interfaceC153045zY;
        super.onStop();
        C135315St c135315St = this.LJLLL;
        if (c135315St != null && (interfaceC153045zY = c135315St.LJIIIZ) != null) {
            interfaceC153045zY.LLIIIILZ();
        }
        if (!this.LLILL) {
            H8G.LIZLLL(this.LJLLJ, !this.LLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZIZ(boolean z) {
        int LIZIZ = (int) C74275TDb.LIZIZ(requireActivity(), 13.0f);
        int LIZIZ2 = (int) C74275TDb.LIZIZ(requireActivity(), 3.0f);
        ImageView imageView = this.LL;
        if (imageView != null) {
            LLLIZZ(LIZIZ2, imageView, true);
        }
        View view = this.LJZL;
        if (view != null) {
            LLLIZZ(LIZIZ2, view, true);
        }
        View view2 = this.LLIIL;
        if (view2 != null) {
            LLLIZZ(LIZIZ2, view2, true);
        }
        ImageView imageView2 = this.LLD;
        if (imageView2 != null) {
            LLLIZZ(LIZIZ2, imageView2, true);
        }
        C41531GRr c41531GRr = this.LJZI;
        if (c41531GRr != null && c41531GRr.getPreviewTitle() != null) {
            LLLIZZ(LIZIZ, this.LJZI, true);
        }
        View view3 = this.LLIIII;
        if (view3 != null) {
            LLLIZZ(0, view3, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final void LIZJ(boolean z) {
        int LIZIZ;
        int i;
        int LIZIZ2 = C1549666i.LIZIZ();
        C41531GRr c41531GRr = this.LJZI;
        if (c41531GRr != null) {
            if (z || C6XP.LIZ()) {
                i = LIZIZ2;
            } else {
                i = (int) C74275TDb.LIZIZ(requireActivity(), 1.0f);
            }
            c41531GRr.setBottomMargin(i);
        }
        View view = this.LLIIIILZ;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (z) {
                LIZIZ = LIZIZ2;
            } else {
                LIZIZ = (int) C74275TDb.LIZIZ(requireActivity(), 0.0f);
            }
            layoutParams.bottomMargin = LIZIZ;
            this.LLIIIILZ.setLayoutParams(layoutParams);
        }
        View view2 = this.LLIIJI;
        if (view2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams2.bottomMargin = LIZIZ2 - ((int) C74275TDb.LIZIZ(requireActivity(), 52.0f));
            this.LLIIJI.setLayoutParams(layoutParams2);
        }
        View view3 = this.LLIIJLIL;
        if (view3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams3.bottomMargin = LIZIZ2 - ((int) C74275TDb.LIZIZ(requireActivity(), 52.0f));
            this.LLIIJLIL.setLayoutParams(layoutParams3);
        }
    }

    public final void LLLIIIL(boolean z) {
        int i;
        int i2;
        NavigationScene navigationScene;
        C6XQ.LIZIZ(this.LJLLJ, this.LLFII, this.LLFZ, !this.LLIL);
        C6JH c6jh = this.LLJI;
        if (c6jh != null) {
            c6jh.setVisibility(8);
        }
        C158326Jg c158326Jg = this.LLJIJIL;
        if (c158326Jg != null) {
            c158326Jg.setVisibility(8);
        }
        View view = this.LJZL;
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.LL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.LLD;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        C41531GRr c41531GRr = this.LJZI;
        if (c41531GRr != null) {
            c41531GRr.setVisibility(8);
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLLJ;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getPreviewInfo() != null) {
                i = this.LJLLJ.getPreviewInfo().getPreviewVideoLength();
            } else {
                i = -1;
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", this.LJLLJ.mShootWay);
            c145995oB.LJI("enter_from", this.LJLLJ.enterFrom);
            c145995oB.LJI("content_type", H7R.LJIIIZ(this.LJLLJ));
            c145995oB.LJI("content_source", H7R.LJIIIIZZ(this.LJLLJ));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(System.currentTimeMillis() - this.LLI);
            LIZ.append("");
            c145995oB.LJI("duration", X1D.LIZIZ(LIZ));
            c145995oB.LIZ(-1, "fps");
            c145995oB.LIZ(-1, "lag_count");
            c145995oB.LIZ(-1, "lag_total_duration");
            c145995oB.LIZ(i, "creation_duration");
            c145995oB.LJI("creation_id", this.LJLLJ.getCreationId());
            OSZ LJJIIJ = g0.LJJIIJ(this.LJLLJ);
            if (((Integer) LJJIIJ.getSecond()).intValue() + ((Integer) LJJIIJ.getFirst()).intValue() > 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c145995oB.LIZ(i2, "is_multi_content");
            C10K.LIZJ(new ACallableS44S0201000_7(1, this, c145995oB, 0));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6XH
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VEVideoPublishPreviewScene.this.LJLLLL.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new IDAListenerS71S0100000_2(this, 8));
        ofFloat.setDuration(100L);
        ofFloat.start();
        if (!C6XF.LIZ()) {
            this.LJLLILLLL.bringToFront();
            this.LJLLILLLL.setAlpha(1.0f);
            this.LJLLILLLL.setVisibility(0);
        }
        LLLILZLLLI(false);
        this.LLILL = true;
        if (!z && (navigationScene = this.LLIIIZ) != null) {
            navigationScene.remove(this);
        }
    }

    public final void LLLILZLLLI(boolean z) {
        if (this.LLIIJLIL == null || this.LLIIJI == null) {
            return;
        }
        if (this.LJZ || !C6XP.LIZ()) {
            this.LLIIJLIL.setVisibility(8);
            this.LLIIJI.setVisibility(8);
        } else if (z) {
            this.LLIIJLIL.setVisibility(8);
            this.LLIIJI.setVisibility(0);
        } else {
            this.LLIIJI.setVisibility(8);
            this.LLIIJLIL.setVisibility(0);
        }
    }

    public final void LLLJ(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int LIZJ = AnonymousClass030.LIZJ(this.LJLLLL.getHeight(), this.LJLLL.LJIIIZ.LLILZ().height, 2, ((FrameLayout.LayoutParams) this.LJLLLL.getLayoutParams()).topMargin);
        if (LIZJ > 0) {
            layoutParams.height = LIZJ;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
            view.bringToFront();
        }
    }

    public final Point LLLJL(PointF pointF) {
        Point point = new Point();
        point.set((int) (this.LJLLLL.getWidth() * pointF.x), (int) (this.LJLLLL.getHeight() * pointF.y));
        return point;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        Bundle bundle2;
        super.onActivityCreated(bundle);
        if (this.LJLLI && (bundle2 = this.mArguments) != null) {
            this.LLFII = bundle2.getString(LLJJ);
            this.LLFF = (UrlModel) bundle2.getSerializable(LLJJIJI);
            this.LLF = bundle2.getString(LLJJIII);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) bundle2.getParcelable(LLJJIJIIJIL);
            this.LJLLJ = videoPublishEditModel;
            videoPublishEditModel.creativeModel = C78996UzQ.LJIILLIIL(bundle2);
            this.LLFFF = bundle2.getInt(LLJJI);
            this.LLJILJIL = bundle2.getBundle(LLJJIJIL);
            this.LJLZ = bundle2.getString(LLJJJ);
            this.LJZ = bundle2.getBoolean(LLJJJIL);
        }
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        this.LLII = (FrameLayout) findViewById(R.id.fmm);
        this.LLIIIILZ = findViewById(R.id.i3p);
        this.LLIIII = findViewById(R.id.i3q);
        this.LLD = (ImageView) findViewById(R.id.i3h);
        this.LLILLIZIL = (FrameLayout) findViewById(R.id.l3p);
        View findViewById = findViewById(R.id.i3l);
        this.LLIIL = findViewById;
        C16880lQ.LJIIJ(new ACListenerS21S0101000_2(3, this, 9), findViewById);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.ifw);
        this.LLILZLL = tuxTextView;
        if (this.LJLLJ.creativeModel.editPostModel != null) {
            tuxTextView.setText(R.string.fq9);
        }
        String str = this.LJLZ;
        if (str != null && !str.isEmpty()) {
            this.LLILZLL.setText(this.LJLZ);
        }
        this.LLIIL.setVisibility(4);
        this.LLIIJI = findViewById(R.id.ife);
        this.LLIIJLIL = requireViewById(R.id.d3o);
        if (this.LLIIJI != null) {
            LLLILZLLLI(false);
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(3, this, 1), this.LLIIJI);
            if (C58B.LIZ()) {
                this.LLIIJI.setBackgroundResource(R.drawable.s2);
            }
        }
        this.LLIILZL = findViewById(R.id.ifm);
        this.LLIZ = findViewById(R.id.ifn);
        this.LLIZLLLIL = findViewById(R.id.ifo);
        this.LLJ = (TextView) findViewById(R.id.ifx);
        TCMPostPageSubmitTextModel submitText = this.LJLLJ.creativeModel.commerceModel.getTcmModel().getSubmitText();
        if (this.LLIZ != null && this.LLIZLLLIL != null && this.LLJ != null && submitText != null && submitText.getSubmitButtonText() != null) {
            this.LLJ.setText(submitText.getSubmitButtonText());
            this.LLIZ.setVisibility(8);
            this.LLIZLLLIL.setVisibility(0);
        }
        this.LLIIZ = findViewById(R.id.ifp);
        View findViewById2 = findViewById(R.id.i27);
        this.LJZL = findViewById2;
        findViewById2.setVisibility(0);
        C16880lQ.LJIIJ(new ACListenerS21S0101000_2(5, this, 2), this.LJZL);
        ImageView imageView = (ImageView) findViewById(R.id.i1y);
        this.LL = imageView;
        imageView.setVisibility(0);
        C16880lQ.LJIILLIIL(this.LL, new ACListenerS31S0101000_14(2, this, 2));
        C41531GRr c41531GRr = (C41531GRr) findViewById(R.id.i2u);
        this.LJZI = c41531GRr;
        c41531GRr.setVisibility(0);
        ImageView imageView2 = (ImageView) findViewById(R.id.n7_);
        this.LJLLILLLL = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = VideoCoverBitmapHolder.LJLIL;
        if (bitmap != null) {
            this.LJLLILLLL.setImageBitmap(bitmap);
            LLLIILIL(bitmap.getWidth(), bitmap.getHeight(), this.LJLLILLLL);
        }
        this.LJLLILLLL.setTransitionName("transition_name_thumbnail");
        this.LLIIJLIL.setTransitionName("transition_name_choose_cover");
        this.LJLLLL = (SurfaceView) findViewById(R.id.i3r);
        if (C6XF.LIZ()) {
            this.LJLLLL.setVisibility(0);
            this.LJLLILLLL.setVisibility(8);
        } else {
            this.LJLLLL.setVisibility(4);
        }
        C16880lQ.LJIILJJIL(this.LLII, new ACListenerS32S0101000_15(5, this, 12));
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: X.6XE
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                InfoStickerModel infoStickerModel;
                EditPostModel editPostModel;
                final VEVideoPublishPreviewScene vEVideoPublishPreviewScene = VEVideoPublishPreviewScene.this;
                vEVideoPublishPreviewScene.getClass();
                if (event == Lifecycle.Event.ON_START && vEVideoPublishPreviewScene.LLILIL) {
                    AbstractC143185je LIZIZ = C47192Ifc.LIZIZ(vEVideoPublishPreviewScene.LJLLJ);
                    vEVideoPublishPreviewScene.LLIFFJFJJ = LIZIZ;
                    LIZIZ.LIZJ(vEVideoPublishPreviewScene.LJLLJ.getCoverPublishModel().getNeedExpandCompiledSize(), false);
                    C135315St c135315St = new C135315St(vEVideoPublishPreviewScene.LJLLJ.getVideoEditorType());
                    vEVideoPublishPreviewScene.LJLLL = c135315St;
                    VideoPublishEditModel videoPublishEditModel2 = vEVideoPublishPreviewScene.LJLLJ;
                    c135315St.LJIJ = videoPublishEditModel2.nleData;
                    VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(videoPublishEditModel2, 2, 30, 4);
                    LJJJJZ.mCanvasWidth = vEVideoPublishPreviewScene.LLIFFJFJJ.LIZIZ();
                    LJJJJZ.mCanvasHeight = vEVideoPublishPreviewScene.LLIFFJFJJ.LJ();
                    LJJJJZ.mPageMode = 101;
                    VideoPublishEditModel videoPublishEditModel3 = vEVideoPublishPreviewScene.LJLLJ;
                    if (videoPublishEditModel3.nleData == null && (editPostModel = videoPublishEditModel3.creativeModel.editPostModel) != null && editPostModel.getVideoCanvasHeight() == -1) {
                        vEVideoPublishPreviewScene.LJLLJ.creativeModel.editPostModel.setVideoCanvasWidth(LJJJJZ.mCanvasWidth);
                        vEVideoPublishPreviewScene.LJLLJ.creativeModel.editPostModel.setVideoCanvasHeight(LJJJJZ.mCanvasHeight);
                    }
                    MutableLiveData<InfoStickerModel> mutableLiveData = new MutableLiveData<>();
                    if (C138845ce.LIZ() && (infoStickerModel = vEVideoPublishPreviewScene.LJLLJ.infoStickerModel) != null && !C32151Nz.LJJIIJZLJL(infoStickerModel.stickers) && H7R.LJJJJZ(vEVideoPublishPreviewScene.LJLLJ)) {
                        InfoStickerModel m109clone = vEVideoPublishPreviewScene.LJLLJ.infoStickerModel.m109clone();
                        vEVideoPublishPreviewScene.LLILLJJLI = m109clone;
                        m109clone.stickers.clear();
                        for (StickerItemModel stickerItemModel : vEVideoPublishPreviewScene.LJLLJ.infoStickerModel.stickers) {
                            if (stickerItemModel.isTextSticker()) {
                                TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class);
                                textStickerData.setStartTime(stickerItemModel.startTime);
                                textStickerData.setEndTime(stickerItemModel.endTime);
                                if (textStickerData.getCanvasWidth() == 0 || textStickerData.getCanvasHeight() == 0 || textStickerData.getVideoWidth() == 0 || textStickerData.getVideoHeight() == 0) {
                                    vEVideoPublishPreviewScene.LLILLJJLI.stickers.add(stickerItemModel);
                                } else {
                                    ((ArrayList) vEVideoPublishPreviewScene.LLILLL).add(textStickerData);
                                }
                            } else {
                                vEVideoPublishPreviewScene.LLILLJJLI.stickers.add(stickerItemModel);
                            }
                        }
                        mutableLiveData.setValue(vEVideoPublishPreviewScene.LLILLJJLI);
                    } else {
                        mutableLiveData.setValue(vEVideoPublishPreviewScene.LJLLJ.infoStickerModel);
                    }
                    MutableLiveData mutableLiveData2 = new MutableLiveData();
                    mutableLiveData2.setValue(LJJJJZ);
                    C135315St c135315St2 = vEVideoPublishPreviewScene.LJLLL;
                    c135315St2.LJIILJJIL.LJIL = new InterfaceC134025Nu() { // from class: X.6XD
                        @Override // X.InterfaceC134025Nu
                        public final void LIZ() {
                            VEVideoPublishPreviewScene vEVideoPublishPreviewScene2 = VEVideoPublishPreviewScene.this;
                            vEVideoPublishPreviewScene2.getClass();
                            Long valueOf = Long.valueOf(System.currentTimeMillis() - vEVideoPublishPreviewScene2.LJLLJ.creativeModel.transientPostPageModel.LIZ);
                            C145995oB c145995oB = new C145995oB();
                            c145995oB.LIZJ(valueOf, "duration");
                            c145995oB.LJI("type", "publish_preview");
                            c145995oB.LJI("content_type", "publish_video_preview");
                            c145995oB.LIZ(vEVideoPublishPreviewScene2.LJLLJ.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                            c145995oB.LJI("enter_from", vEVideoPublishPreviewScene2.LJLLJ.creativeModel.postPageModel.previewEnterFrom);
                            GXR.LIZ("tool_performance_publish_cover_first_frame", c145995oB.LIZ);
                        }
                    };
                    c135315St2.LIZLLL = mutableLiveData2;
                    c135315St2.LJFF = mutableLiveData;
                    c135315St2.LIZ(vEVideoPublishPreviewScene.requireActivity(), vEVideoPublishPreviewScene, vEVideoPublishPreviewScene.LJLLLL, vEVideoPublishPreviewScene.LJLLJ);
                    InterfaceC153045zY interfaceC153045zY = vEVideoPublishPreviewScene.LJLLL.LJIIIZ;
                    VideoPublishEditModel videoPublishEditModel4 = vEVideoPublishPreviewScene.LJLLJ;
                    C5XI.LIZ(interfaceC153045zY, videoPublishEditModel4, C65713Pqf.LIZIZ(videoPublishEditModel4.creativeModel.loudnessBalanceModel.balanceTypes), null);
                    vEVideoPublishPreviewScene.LJZI.LIZ(vEVideoPublishPreviewScene.LJLLJ, vEVideoPublishPreviewScene.LLF, vEVideoPublishPreviewScene.LLFF, vEVideoPublishPreviewScene.LLFFF);
                    if (C6XF.LIZ()) {
                        vEVideoPublishPreviewScene.LLLIIIIL();
                    }
                    vEVideoPublishPreviewScene.LLILIL = false;
                }
            }
        });
        if (!C6XF.LIZ()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 18));
            ofFloat.addListener(new IDAListenerS71S0100000_2(this, 9));
            ofFloat.setDuration(400L);
            ofFloat.start();
        }
        this.LLFZ = String.valueOf(System.currentTimeMillis() / 1000);
        this.LLI = System.currentTimeMillis();
        this.mActivity.getWindow().addFlags(128);
    }

    @Override // X.AbstractC42651GoZ, X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        LLLIIIL(false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLIIIZ = C78923UyF.LJIIJJI(this);
        C78923UyF.LJIILLIIL(this).LLJILJILJ(this, new GHB() { // from class: X.6XJ
            @Override // X.GHB
            public final boolean onBackPressed() {
                VEVideoPublishPreviewScene.this.LLLIIIL(true);
                return false;
            }
        });
    }

    public final void LLLIILIL(int i, int i2, View view) {
        float LJ = C81184Vtc.LJ(requireActivity());
        float f = i2;
        float f2 = i;
        float f3 = ((f * 1.0f) / f2) * LJ;
        float LIZLLL = C81184Vtc.LIZLLL(requireActivity());
        if (f3 > LIZLLL) {
            LJ = ((f2 * 1.0f) / f) * LIZLLL;
            f3 = LIZLLL;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) LJ;
            layoutParams.height = (int) f3;
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
    }

    public final void LLLIZZ(int i, View view, boolean z) {
        int LJFF = C81184Vtc.LJFF(requireActivity());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            i += LJFF;
        }
        layoutParams.topMargin = i;
        view.setLayoutParams(layoutParams);
    }

    public final void LLLJIL(final View view, View view2, final NormalTrackTimeStamp normalTrackTimeStamp) {
        view.post(new ARunnableS6S0400000_2(this, normalTrackTimeStamp, view, view2, 3));
        if (normalTrackTimeStamp.getEndTime() > 0.0f) {
            this.LJLLL.LJIIIZ.LLJLIL(new InterfaceC133835Nb() { // from class: X.6XI
                @Override // X.InterfaceC133835Nb
                public final void LIZ(int i) {
                    NormalTrackTimeStamp normalTrackTimeStamp2 = NormalTrackTimeStamp.this;
                    View view3 = view;
                    float f = i;
                    if (f >= normalTrackTimeStamp2.getStartTime() && f <= normalTrackTimeStamp2.getEndTime()) {
                        view3.setVisibility(0);
                    } else {
                        view3.setVisibility(4);
                    }
                }
            });
        } else {
            if (view.getVisibility() == 0) {
                return;
            }
            view.setVisibility(0);
        }
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if ((C00F.LIZ(31744, 0, "creative_tools_publish_preview_experiment", true) & 1) != 0) {
            i = R.layout.fj;
        } else {
            i = R.layout.fi;
        }
        return (ViewGroup) C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, false);
    }

    public VEVideoPublishPreviewScene(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, int i, String str2, InterfaceC65784Pro<Void> interfaceC65784Pro) {
        this.LJLLI = true;
        this.LLILIL = true;
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
        this.LLJILJILJ = false;
        this.LLJILLL = null;
        this.LLFII = str2;
        this.LLFFF = i;
        this.LJLLJ = videoPublishEditModel;
        this.LLF = str;
        this.LLFF = urlModel;
        this.LLIILII = interfaceC65784Pro;
        this.LJLLI = false;
    }
}
