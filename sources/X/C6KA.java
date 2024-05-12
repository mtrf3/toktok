package X;

import Y.AUListenerS66S0101000_2;
import Y.IDAListenerS72S0000000_2;
import Y.IDRunnableS6S0101000;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6KA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KA extends C161956Xf {
    public final /* synthetic */ VEVideoPublishPreviewActivity LIZ;

    public C6KA(VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity) {
        this.LIZ = vEVideoPublishPreviewActivity;
    }

    @Override // X.C161956Xf, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        List<InteractStickerStruct> LJI;
        C158326Jg c158326Jg;
        List<InteractStickerStruct> LJI2;
        C6JH c6jh;
        List<InteractStickerStruct> LJI3;
        C1558469s c1558469s;
        List<InteractStickerStruct> LJI4;
        SurfaceView surfaceView = this.LIZ.LJLLILLLL;
        if (surfaceView != null) {
            surfaceView.bringToFront();
            this.LIZ.LJLLILLLL.setVisibility(0);
        }
        this.LIZ.LLIFFJFJJ.bringToFront();
        this.LIZ.LLI.bringToFront();
        this.LIZ.LLI.setVisibility(0);
        this.LIZ.LLIFFJFJJ.setVisibility(0);
        this.LIZ.LJLJLLL.setAlpha(0.0f);
        this.LIZ.LJLJLLL.setVisibility(8);
        final VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = vEVideoPublishPreviewActivity.LJLL;
        if (videoPublishEditModel != null && videoPublishEditModel.getMainBusinessContext() != null) {
            if (C138845ce.LIZ() && H7R.LJJJJZ(vEVideoPublishPreviewActivity.LJLL)) {
                vEVideoPublishPreviewActivity.LLIIJLIL = new SafeHandler(vEVideoPublishPreviewActivity);
                FrameLayout frameLayout = (FrameLayout) vEVideoPublishPreviewActivity.findViewById(R.id.l3p);
                vEVideoPublishPreviewActivity.LLIIIJ = frameLayout;
                frameLayout.bringToFront();
                vEVideoPublishPreviewActivity.LJLLI.LJIIIZ.LLJLIL(new InterfaceC133835Nb() { // from class: X.6J0
                    @Override // X.InterfaceC133835Nb
                    public final void LIZ(int i) {
                        VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity2 = VEVideoPublishPreviewActivity.this;
                        Iterator it = ((ArrayList) vEVideoPublishPreviewActivity2.LLIIIZ).iterator();
                        while (it.hasNext()) {
                            TextStickerData textStickerData = (TextStickerData) it.next();
                            if (i >= textStickerData.getStartTime() && i <= textStickerData.getEndTime() && !textStickerData.getAddToLayoutInPreviewOrCover()) {
                                C67P c67p = new C67P(vEVideoPublishPreviewActivity2, vEVideoPublishPreviewActivity2.LLIIJLIL, textStickerData, false, new C78934UyQ(), Boolean.FALSE);
                                int right = (vEVideoPublishPreviewActivity2.LJLLILLLL.getRight() + vEVideoPublishPreviewActivity2.LJLLILLLL.getLeft()) / 2;
                                int bottom = (vEVideoPublishPreviewActivity2.LJLLILLLL.getBottom() + vEVideoPublishPreviewActivity2.LJLLILLLL.getTop()) / 2;
                                float max = Math.max(vEVideoPublishPreviewActivity2.LJLLILLLL.getWidth() / textStickerData.getLayoutWidth(), vEVideoPublishPreviewActivity2.LJLLILLLL.getHeight() / textStickerData.getLayoutHeight());
                                int layoutWidth = (int) (right - (textStickerData.getLayoutWidth() / 2.0f));
                                int layoutHeight = (int) (bottom - (textStickerData.getLayoutHeight() / 2.0f));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) textStickerData.getLayoutWidth(), (int) textStickerData.getLayoutHeight());
                                marginLayoutParams.setMarginStart(layoutWidth);
                                marginLayoutParams.topMargin = layoutHeight;
                                c67p.setScaleX(max);
                                c67p.setScaleY(max);
                                vEVideoPublishPreviewActivity2.LLIIIJ.addView(c67p, marginLayoutParams);
                                ((ArrayList) vEVideoPublishPreviewActivity2.LLIIJI).add(c67p);
                                textStickerData.setAddToLayoutInPreviewOrCover(true);
                            }
                            Iterator it2 = ((ArrayList) vEVideoPublishPreviewActivity2.LLIIJI).iterator();
                            while (it2.hasNext()) {
                                C67P c67p2 = (C67P) it2.next();
                                c67p2.setPlayPosition(i);
                                c67p2.LJIL();
                            }
                        }
                    }
                });
            }
            VideoPublishEditModel videoPublishEditModel2 = vEVideoPublishPreviewActivity.LJLL;
            if (videoPublishEditModel2 != null && videoPublishEditModel2.getMainBusinessContext() != null) {
                VideoPublishEditModel videoPublishEditModel3 = vEVideoPublishPreviewActivity.LJLL;
                if (videoPublishEditModel3.creativeModel.inlineCaptionModel == null && (LJI4 = C164826dS.LJI(videoPublishEditModel3.getMainBusinessContext(), 11, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI4.isEmpty() && ListProtector.get(LJI4, 0) != null) {
                    InteractStickerStruct interactStickerStruct = (InteractStickerStruct) ListProtector.get(LJI4, 0);
                    if (interactStickerStruct.getCaptionStruct() != null && !C78886Uxe.LJJIJ(interactStickerStruct.getCaptionStruct().getUtterances())) {
                        vEVideoPublishPreviewActivity.LLIIII = interactStickerStruct.getCaptionStruct();
                        TextView textView = (TextView) vEVideoPublishPreviewActivity.findViewById(R.id.m1n);
                        vEVideoPublishPreviewActivity.LLII = textView;
                        if (textView != null) {
                            vEVideoPublishPreviewActivity.LJLLJ = new C69M(vEVideoPublishPreviewActivity.LLIIII.getUtterances());
                            vEVideoPublishPreviewActivity.LLII.setMaxWidth(C156436Bz.LLILZLL);
                            vEVideoPublishPreviewActivity.LLII.postDelayed(new IDRunnableS6S0101000(6, vEVideoPublishPreviewActivity, 36), 300L);
                        }
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModel4 = vEVideoPublishPreviewActivity.LJLL;
            if (videoPublishEditModel4 != null && (LJI = C164826dS.LJI(videoPublishEditModel4.getMainBusinessContext(), 10, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCountDownStickerStruct() != null && (c158326Jg = (C158326Jg) vEVideoPublishPreviewActivity.findViewById(R.id.i37)) != null) {
                View findViewById = vEVideoPublishPreviewActivity.findViewById(R.id.naa);
                vEVideoPublishPreviewActivity.LLILZ(findViewById);
                c158326Jg.LIZ(((InteractStickerStruct) ListProtector.get(LJI, 0)).getCountDownStickerStruct());
                c158326Jg.setTouchEnable(true);
                c158326Jg.setEditEnable(false);
                NormalTrackTimeStamp LIZIZ = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI, 0));
                if (LIZIZ != null) {
                    vEVideoPublishPreviewActivity.LLIZLLLIL(c158326Jg, findViewById, LIZIZ);
                }
            }
            VideoPublishEditModel videoPublishEditModel5 = vEVideoPublishPreviewActivity.LJLL;
            if (videoPublishEditModel5 != null && (LJI2 = C164826dS.LJI(videoPublishEditModel5.getMainBusinessContext(), 1, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI2.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI2, 0)).getPollStruct() != null && (c6jh = (C6JH) vEVideoPublishPreviewActivity.findViewById(R.id.i3k)) != null) {
                View findViewById2 = vEVideoPublishPreviewActivity.findViewById(R.id.naa);
                vEVideoPublishPreviewActivity.LLILZ(findViewById2);
                c6jh.LIZIZ(((InteractStickerStruct) ListProtector.get(LJI2, 0)).getPollStruct());
                c6jh.setTouchEnable(true);
                c6jh.LJFF();
                c6jh.setEditEnable(false);
                NormalTrackTimeStamp LIZIZ2 = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI2, 0));
                if (LIZIZ2 != null) {
                    vEVideoPublishPreviewActivity.LLIZLLLIL(c6jh, findViewById2, LIZIZ2);
                }
            }
            VideoPublishEditModel videoPublishEditModel6 = vEVideoPublishPreviewActivity.LJLL;
            if (videoPublishEditModel6 != null && (LJI3 = C164826dS.LJI(videoPublishEditModel6.getMainBusinessContext(), 14, EnumC164816dR.TRACK_PAGE_EDIT)) != null && !LJI3.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI3, 0)).getNatureClassificationStickerStruct() != null && (c1558469s = (C1558469s) vEVideoPublishPreviewActivity.findViewById(R.id.i3d)) != null) {
                View findViewById3 = vEVideoPublishPreviewActivity.findViewById(R.id.naa);
                vEVideoPublishPreviewActivity.LLILZ(findViewById3);
                NormalTrackTimeStamp LIZIZ3 = C164826dS.LIZIZ((InteractStickerStruct) ListProtector.get(LJI3, 0));
                if (LIZIZ3 != null) {
                    NatureClassificationStickerStruct natureClassificationStickerStruct = ((InteractStickerStruct) ListProtector.get(LJI3, 0)).getNatureClassificationStickerStruct();
                    InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) ListProtector.get(LJI3, 0);
                    if (natureClassificationStickerStruct != null && natureClassificationStickerStruct.getNatureClassificationStruct() != null) {
                        NatureClassificationStruct natureClassificationStruct = natureClassificationStickerStruct.getNatureClassificationStruct();
                        NatureSpeciesModel natureSpeciesModel = new NatureSpeciesModel(natureClassificationStruct.getSpeciesName(), natureClassificationStruct.getGenusName(), natureClassificationStruct.getSpeciesId(), natureClassificationStruct.getGenusId(), 0.0f, "");
                        C1558669u c1558669u = new C1558669u();
                        c1558669u.LJLIL = interactStickerStruct2;
                        c1558669u.LJLILLLLZI = (int) LIZIZ3.getStartTime();
                        c1558669u.LJLJI = (int) LIZIZ3.getEndTime();
                        c1558469s.LIZIZ(c1558669u, natureSpeciesModel.speciesName);
                    }
                    vEVideoPublishPreviewActivity.LLIZLLLIL(c1558469s, findViewById3, LIZIZ3);
                }
            }
        }
        this.LIZ.LLILIL();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS66S0101000_2(1, this, 1));
        ofFloat.addListener(new IDAListenerS72S0000000_2(0));
        ofFloat.setDuration(300L);
        ofFloat.start();
    }
}
