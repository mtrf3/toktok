package X;

import Y.ACListenerS28S0300000_2;
import Y.AObjectS42S0101000_5;
import Y.AObjectS47S0101000_2;
import Y.AObserverS58S0101000_2;
import Y.AObserverS59S0101000_3;
import Y.AObserverS60S0101000_5;
import Y.AObserverS64S0101000_14;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS0S0102000_2;
import Y.ARunnableS38S0100000_2;
import Y.AgS85S0101000_2;
import Y.IDiS266S0100000_2;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169776lR {
    public static final int LJJZZIII;
    public VideoPublishEditModel LIZ;
    public C5LR LIZIZ;
    public ReplayLiveData LIZJ;
    public MutableLiveData<C5MM> LIZLLL;
    public StoredLiveData LJ;
    public MutableLiveData<Boolean> LJFF;
    public SafeHandler LJII;
    public LifecycleOwner LJIIIIZZ;
    public C169796lT LJIIIZ;
    public LinearLayout LJIIJ;
    public FrameLayout LJIIJJI;
    public FrameLayout LJIIL;
    public ImageView LJIILIIL;
    public TuxIconView LJIILJJIL;
    public C223338pd LJIILL;
    public RelativeLayout LJIILLIIL;
    public TextView LJIIZILJ;
    public RelativeLayout LJIJ;
    public LinearLayout LJIJI;
    public C42880GsG LJIJJ;
    public TextView LJIJJLI;
    public TextView LJIL;
    public VWL LJJ;
    public C80698Vlm LJJI;
    public ViewOnTouchListenerC141755hL LJJIFFI;
    public ViewOnTouchListenerC82857WfV LJJII;
    public CutMultiVideoViewModel LJJIII;
    public VEVideoCoverGeneratorImpl LJJIIJ;
    public InterfaceC153045zY LJJIIJZLJL;
    public C170046ls LJJIIZ;
    public WFB LJJIIZI;
    public C169996ln LJJIJ;
    public int LJJIJIIJI;
    public RunnableC169896ld LJJIJIIJIL;
    public RunnableC169926lg LJJIJIL;
    public View LJJIJL;
    public C170216m9 LJJIJLIJ;
    public ActivityC45651qj LJJIZ;
    public WM7 LJJJ;
    public C164916db LJJJI;
    public EffectPointModel LJJJIL;
    public EffectPointModel LJJJJ;
    public C5RV LJJJJI;
    public ArrayList<EffectPointModel> LJJJJJL;
    public ArrayList<EffectPointModel> LJJJJL;
    public MutableLiveData<Bitmap> LJJJJLL;
    public MutableLiveData<Boolean> LJJJJZ;
    public SafeHandler LJJJJZI;
    public EditEffectVideoModel LJJJLIIL;
    public InterfaceC169856lZ LJJJLL;
    public C170206m8 LJJJLZIJ;
    public IDiS266S0100000_2 LJJJZ;
    public AObserverS58S0101000_2 LJJL;
    public int LJJLI;
    public final boolean LJJLIIJ;
    public boolean LJJLIL;
    public int LJJLJ;
    public C169756lP LJJLJLI;
    public InterfaceC45540Hu4 LJJLL;
    public final C170086lw LJJZ;
    public final ARunnableS38S0100000_2 LJJZZI;
    public final MutableLiveData<Boolean> LJI = new MutableLiveData<>(Boolean.FALSE);
    public boolean LJJIL = false;
    public final C170006lo LJJJJIZL = new C170006lo();
    public String LJJJJJ = "";
    public int LJJJJLI = -1;
    public boolean LJJLIIIIJ = false;
    public boolean LJJLIIIJ = false;
    public boolean LJJLIIIJILLIZJL = false;
    public boolean LJJLIIIJJI = false;
    public boolean LJJLIIIJJIZ = false;
    public boolean LJJLIIIJL = true;
    public boolean LJJLIIIJLJLI = true;
    public final boolean LJJLIIIJLLLLLLLZ = C6W9.LIZ();

    public final void LJIILL() {
        this.LJJIJIIJIL = null;
        this.LJJIJIL = null;
        this.LJII.removeCallbacksAndMessages(null);
        this.LJJJJZI.removeCallbacksAndMessages(null);
    }

    static {
        C16880lQ.LJLLJ(C169776lR.class);
        LJJZZIII = SFS.LJI(266.0d);
        SFS.LJI(480.0d);
    }

    public final int LIZJ() {
        return this.LJJIIJZLJL.getDuration();
    }

    public final int LIZLLL() {
        if (this.LJIJ.getHeight() == 0) {
            return (int) KL2.LIZJ(this.LJJIZ, 52.0f);
        }
        return this.LJIJ.getHeight();
    }

    public final int LJ() {
        return (((C81184Vtc.LIZIZ(this.LJJIZ) - LIZLLL()) - this.LJJLJ) - C81184Vtc.LJFF(this.LJJIZ)) - C81184Vtc.LIZJ(this.LJJIZ);
    }

    public final int LJFF() {
        return this.LJJIIJZLJL.LLIZLLLIL();
    }

    public final void LJI() {
        if (this.LJJIIJZLJL == null) {
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VEEffectHelper activity is finishing ");
            LIZ.append(this.LJJIZ.isFinishing());
            LJJIIZI.LJ(X1D.LIZIZ(LIZ));
            return;
        }
        int LJFF = LJFF();
        this.LJJIII = (CutMultiVideoViewModel) C165706es.LJFF(this.LJJJ).get(CutMultiVideoViewModel.class);
        this.LJJII.setCanEdit(false);
        this.LJJII.setMinVideoLength(1000L);
        this.LJJII.setUseCustomMaxVideoLengthDirectly(true);
        this.LJJII.setMaxVideoLength(LJFF);
        this.LJJIII.LJLLILLLL = this.LIZ.isMvThemeVideoType();
        this.LJJIII.LJLLJ = LJFF;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initCutTimeView video duration is ");
        LIZ2.append(LIZJ());
        H78.LJII(X1D.LIZIZ(LIZ2));
        this.LJJII.setVeEditor(this.LJJIIJZLJL);
        List<MediaModel> mediaModelList = this.LIZ.getMediaModelList();
        C170136m1 c170136m1 = new C170136m1();
        c170136m1.LIZIZ = false;
        ((ArrayList) c170136m1.LIZ).add(new C169836lX(this.LJJIZ, new AObjectS47S0101000_2(1, this, 4), new AObjectS42S0101000_5(1, this, 29), new InterfaceC88475Ynv() { // from class: X.6lm
            @Override // X.InterfaceC88475Ynv
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                C169776lR c169776lR = C169776lR.this;
                return Float.valueOf(C169816lV.LIZ(c169776lR.LJJJIL, c169776lR.LJFF(), ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue(), ((Integer) obj4).intValue(), ((Float) obj5).floatValue()));
            }
        }));
        this.LJJII.setViewConfig(c170136m1);
        this.LJJII.setOptimizeEffect(this.LJJLIIIJLLLLLLLZ);
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJJII;
        WM7 wm7 = this.LJJJ;
        ViewModelProvider LJFF2 = C165706es.LJFF(wm7);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJJIII;
        WFB wfb = this.LJJIIZI;
        boolean z = this.LJJLIIIJLLLLLLLZ;
        viewOnTouchListenerC82857WfV.LLIILZL = wfb;
        viewOnTouchListenerC82857WfV.LLIIZ = z;
        viewOnTouchListenerC82857WfV.LJI(wm7, LJFF2, cutMultiVideoViewModel, mediaModelList);
        this.LJJII.setPointerType(2);
        this.LJJII.getVideoEditViewModel().LJLJJL.observe(this.LJIIIIZZ, new AObserverS60S0101000_5(3, this, 0));
        this.LJJII.getVideoEditViewModel().LJLL.observe(this.LJIIIIZZ, new AObserverS58S0101000_2(1, this, 15));
        this.LJJII.getVideoEditViewModel().LJLJLJ.observe(this.LJIIIIZZ, new AObserverS58S0101000_2(0, this, 7));
        this.LJJII.getVideoEditViewModel().LJLJLLL.observe(this.LJIIIIZZ, new AObserverS64S0101000_14(0, this, 3));
        this.LJJII.getVideoEditViewModel().LJLJJLL.observe(this.LJIIIIZZ, new AObserverS59S0101000_3(1, this, 0));
        this.LJJII.getVideoEditViewModel().LJLJL.observe(this.LJIIIIZZ, new AObserverS58S0101000_2(0, this, 8));
        this.LJJII.getVideoEditViewModel().LJLILLLLZI.observe(this.LJIIIIZZ, new AObserverS70S0100000_2(this, 29));
        this.LJJII.getVideoEditViewModel().LJLJJI.observe(this.LJIIIIZZ, new AObserverS58S0101000_2(0, this, 9));
        this.LJJJJIZL.LIZIZ(LJFF);
    }

    public final void LJII() {
        if (this.LIZIZ == null) {
            if (this.LIZ.isMultiVideoEdit()) {
                InterfaceC153045zY interfaceC153045zY = this.LJJIIJZLJL;
                VideoPublishEditModel videoPublishEditModel = this.LIZ;
                this.LIZIZ = new C5P0(interfaceC153045zY, videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData, videoPublishEditModel.getPreviewInfo(), null);
            } else {
                VideoPublishEditModel videoPublishEditModel2 = this.LIZ;
                if (videoPublishEditModel2.isFastImport || videoPublishEditModel2.isCutSameVideoType()) {
                    this.LIZIZ = new C5P3(this.LJJIIJZLJL, this.LIZ.getPreviewInfo());
                } else {
                    this.LIZIZ = new C5P3(this.LJJIIJZLJL, this.LIZ.getPreviewInfo());
                }
            }
        }
    }

    public final void LJIIJ() {
        if (this.LJJIIJZLJL != null) {
            long LIZIZ = this.LJJIIZ.LIZIZ();
            if ((!this.LJJIIZ.LIZ && r1 >= LIZJ()) || (this.LJJIIZ.LIZ && r1 <= 0)) {
                this.LIZLLL.setValue(C5MM.LIZLLL(0L));
            } else {
                C170006lo c170006lo = this.LJJJJIZL;
                long j = r1;
                c170006lo.LIZIZ = j;
                c170006lo.LIZJ = LIZIZ;
                this.LIZLLL.setValue(C5MM.LIZLLL(j));
            }
            LJIIL();
        }
        C135005Ro.LJ(this.LIZ, this.LJJJJJ, true);
    }

    public final void LJIIJJI() {
        this.LIZLLL.setValue(C5MM.LIZJ());
        ImageView imageView = this.LJIILIIL;
        if (imageView != null && imageView.getVisibility() != 0) {
            C170696mv.LIZ(this.LJIILIIL, true);
            this.LJIILIIL.setVisibility(0);
        }
    }

    public final void LJIIL() {
        this.LIZLLL.setValue(C5MM.LIZ());
        C170696mv.LIZ(this.LJIILIIL, false);
        ImageView imageView = this.LJIILIIL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void LJIILIIL() {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.LJI.getValue())) {
            return;
        }
        this.LIZIZ.prepare().LJ(new AgS85S0101000_2(1, this, 0), C10K.LJIIIIZZ, null);
        this.LJI.setValue(bool);
    }

    public final void LJIJ() {
        EffectPointModel effectPointModel = this.LJJJIL;
        if (effectPointModel != null && !CardStruct.IStatusCode.DEFAULT.equals(effectPointModel.getKey())) {
            if (!"1".equals(this.LJJJIL.getKey())) {
                LJJI(true);
                ArrayList arrayList = new ArrayList();
                EffectPointModel effectPointModel2 = new EffectPointModel();
                int startPoint = this.LJJJIL.getStartPoint();
                int endPoint = this.LJJJIL.getEndPoint();
                effectPointModel2.setUiStartPoint(startPoint);
                effectPointModel2.setUiEndPoint(endPoint);
                arrayList.add(effectPointModel2);
                LJIJJLI(arrayList, true, false);
                return;
            }
            this.LJIIIZ.LIZIZ(this.LJJIJIIJI, true);
            LJIJJLI(null, false, false);
            return;
        }
        this.LJIIIZ.LIZIZ(0, true);
        LJIJJLI(null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJI() {
        this.LJJJJL = new ArrayList<>(this.LJJJJJL);
        EffectPointModel effectPointModel = this.LJJJIL;
        if (effectPointModel != null) {
            this.LJJJJ = effectPointModel.m113clone();
        }
        if (this.LJ.getValue() != 0) {
            this.LJJJJI = ((C5RV) this.LJ.getValue()).clone();
        }
        EffectPointModel effectPointModel2 = this.LJJJJ;
        if (effectPointModel2 != null && effectPointModel2.getKey().equals("1")) {
            ((LiveData) this.LJJJLIIL.LJLZ.getValue()).setValue(Boolean.TRUE);
        } else {
            ((LiveData) this.LJJJLIIL.LJLZ.getValue()).setValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
    
        if (r1.equals("3") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        r9.LJIIIZ.setOverlayColor(0);
        LJJI(true);
        r1 = X.C5MM.LIZLLL(0);
        LJJIFFI(0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        r9.LIZLLL.setValue(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        if (r1.equals("2") == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL() {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169776lR.LJIL():void");
    }

    public final void LJJIII() {
        ((LiveData) this.LJJJLIIL.LJLL.getValue()).setValue(Float.valueOf(this.LJJII.getSelectedTime()));
        LJJIIJ(true);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.6lw] */
    public C169776lR() {
        this.LJJLIIJ = C00F.LIZ(31744, 0, "studio_edit_effect_panel_type", true) == 2;
        this.LJJLIL = false;
        this.LJJZ = new C5HC() { // from class: X.6lw
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                C169776lR c169776lR = C169776lR.this;
                if (i == 4) {
                    if (c169776lR.LJJIL) {
                        TextView textView = c169776lR.LJIL;
                        if (textView != null) {
                            textView.performClick();
                        }
                        return true;
                    }
                } else {
                    c169776lR.getClass();
                }
                return false;
            }
        };
        this.LJJZZI = new ARunnableS38S0100000_2(this, 27);
    }

    public final void LIZ(List<EffectCategoryResponse> list) {
        if (list.isEmpty()) {
            return;
        }
        this.LJJI.LJIILJJIL();
        this.LJJI.setMaxTabModeForCount(list.size());
        for (int i = 0; i < list.size(); i++) {
            ActivityC45651qj activityC45651qj = this.LJJIZ;
            o.LJI(activityC45651qj);
            C170296mH c170296mH = new C170296mH(activityC45651qj);
            c170296mH.setText(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(list, i)).getName());
            c170296mH.LIZ(i, list.size());
            c170296mH.setTag(Integer.valueOf(i));
            c170296mH.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0300000_2(this, list, c170296mH, 0)));
            if (C164996dj.LIZ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(list, i)).getKey()) && LJIIIIZZ(false).booleanValue()) {
                View view = c170296mH.LJLJI;
                if (view != null) {
                    view.setVisibility(0);
                    this.LJJLIIIIJ = true;
                } else {
                    o.LJIJI("dotView");
                    throw null;
                }
            }
            C80698Vlm c80698Vlm = this.LJJI;
            C164456cr LJIIL = c80698Vlm.LJIIL();
            LJIIL.LIZLLL = c170296mH;
            LJIIL.LIZIZ();
            c80698Vlm.LIZJ(LJIIL);
        }
    }

    public final void LIZIZ(List list) {
        boolean z;
        if (list == null) {
            list = new ArrayList();
        }
        boolean LIZ = C138645cK.LIZ();
        if (C138645cK.LIZ() && !this.LIZ.isMvThemeVideoType()) {
            z = true;
        } else {
            z = false;
        }
        C5OL.LIZJ(LIZ, z, this.LJJLIIIJJI, list);
        boolean z2 = !C5OL.LIZ(this.LIZ);
        this.LJJLIIIJLJLI = z2;
        if (!z2) {
            LJIILLIIL("sticker", list);
        }
        if (!this.LJJLIIIJJIZ) {
            LJIILLIIL("motion", list);
        }
        if (this.LJJLIIIJL) {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
            effectCategoryResponse.setName(this.LJJIZ.getString(R.string.s0m));
            effectCategoryResponse.setKey("time");
            list.add(effectCategoryResponse);
        }
    }

    public final Boolean LJIIIIZZ(boolean z) {
        Keva repo = Keva.getRepo("add_motion_tab");
        boolean z2 = false;
        if (this.LJJLI == 2 && repo.getBoolean("is_first_click_motion_tab", true)) {
            if (z) {
                repo.storeBoolean("is_first_click_motion_tab", false);
            }
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    public final void LJIIIZ(boolean z) {
        if (z) {
            this.LIZ.setEffectList(new ArrayList<>(this.LJJJLL.J7()));
            this.LIZ.setTimeEffect(this.LJJJIL);
            if (this.LIZ.getTimeEffect() != null && this.LIZ.getTimeEffect().getKey().equals("1") && this.LJJJLL.LIZIZ().getValue() != null) {
                this.LIZ.getPreviewInfo().updateReverseVideoContent(this.LIZIZ.LIZJ(), this.LIZIZ.LIZIZ(), this.LIZIZ.LJ());
            }
            if (this.LIZ.getTimeEffect() != null) {
                this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
            }
            InterfaceC153045zY interfaceC153045zY = this.LJJIIJZLJL;
            if (interfaceC153045zY instanceof C133765Mu) {
                C5OL.LJFF(this.LIZ, ((C133765Mu) interfaceC153045zY).LJI().LJIIJ.LJ(), null);
            }
            C135005Ro.LJII(this.LIZ);
            return;
        }
        this.LIZ.setEffectList(new ArrayList<>(this.LJJJLL.J7()));
        this.LIZ.setTimeEffect(this.LJJJIL);
        if (this.LIZ.getTimeEffect() == null) {
            return;
        }
        this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
    }

    public final void LJIILJJIL(boolean z) {
        C162626Zu c162626Zu;
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = this.LJJIFFI;
        if (viewOnTouchListenerC141755hL != null && (viewOnTouchListenerC141755hL.getAdapter() instanceof C162626Zu) && (c162626Zu = (C162626Zu) this.LJJIFFI.getAdapter()) != null && (c162626Zu.LJLJJLL ^ z)) {
            c162626Zu.LJLJJLL = z;
            c162626Zu.notifyDataSetChanged();
        }
        WF7 wf7 = this.LJJII.LLIILII;
        if (wf7 != null && (wf7.LJLLLL ^ z)) {
            wf7.LJLLLL = z;
            wf7.notifyDataSetChanged();
        }
    }

    public final void LJJ(boolean z) {
        if (z) {
            this.LJIJI.setVisibility(0);
            this.LJIIJ.setVisibility(8);
            C42880GsG c42880GsG = this.LJIJJ;
            if (c42880GsG != null) {
                c42880GsG.setVisibility(0);
                c42880GsG.setStatus(0);
                return;
            }
            return;
        }
        C42880GsG c42880GsG2 = this.LJIJJ;
        if (c42880GsG2 != null) {
            c42880GsG2.LIZJ();
        }
        this.LJIJI.setVisibility(8);
        this.LJIIJ.setVisibility(0);
    }

    public final void LJJI(boolean z) {
        this.LJJII.LJJIIJZLJL(z);
    }

    public final void LJJIIJ(boolean z) {
        C170326mK c170326mK;
        if (z) {
            c170326mK = new C170326mK(this.LJJII.getSelectedTime(), 1);
        } else {
            c170326mK = new C170326mK(LJFF(), 0);
        }
        this.LJJJLIIL.ov0().setValue(c170326mK);
    }

    public static void LJIILLIIL(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            if (ListProtector.get(list, i) != null && ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(list, i)).getKey().startsWith(str)) {
                if (i != -1) {
                    ListProtector.remove(list, i);
                    return;
                }
                return;
            }
        }
    }

    public final void LJIIZILJ(long j, String str) {
        if (C32151Nz.LJJIIJZLJL(this.LJIIIZ.getEffectPointModels())) {
            return;
        }
        VEEditor.VEState state = this.LJJIIJZLJL.getState();
        C169796lT c169796lT = this.LJIIIZ;
        c169796lT.LJLJJLL.remove(c169796lT.LIZJ(str));
        c169796lT.LJLIL.postInvalidate();
        LJJIFFI((int) j, false);
        this.LIZLLL.setValue(C5MM.LIZLLL(j));
        if (state == VEEditor.VEState.STARTED) {
            LJIIJJI();
        }
    }

    public final void LJJIFFI(int i, boolean z) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        C169796lT c169796lT = this.LJIIIZ;
        if (c169796lT != null) {
            c169796lT.LJII(i);
        }
        if (this.LJJII != null && (cutMultiVideoViewModel = this.LJJIII) != null && !z) {
            cutMultiVideoViewModel.LJLJI.setValue(Long.valueOf(i));
        }
        if (this.LJJJLIIL != null && this.LJJIIZ != null) {
            if (i >= this.LJJIIJZLJL.getDuration()) {
                this.LJJJLIIL.LJZL = true;
            } else {
                this.LJJJLIIL.LJZL = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(int r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169776lR.LJIJJ(int, boolean, boolean):void");
    }

    public final void LJIJJLI(List<EffectPointModel> list, boolean z, boolean z2) {
        int i;
        int i2 = 8;
        if (this.LJJLIIIJLLLLLLLZ) {
            this.LJJII.LJJIIJZLJL(z);
        } else {
            ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJJII;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            viewOnTouchListenerC82857WfV.setVisibility(i);
        }
        boolean z3 = !z;
        C169796lT c169796lT = this.LJIIIZ;
        if (z3) {
            i2 = 0;
        }
        c169796lT.setVisibility(i2);
        if (z) {
            if (!C32151Nz.LJJIIJZLJL(list)) {
                int uiStartPoint = ((EffectPointModel) ListProtector.get(list, 0)).getUiStartPoint();
                int uiEndPoint = ((EffectPointModel) ListProtector.get(list, 0)).getUiEndPoint();
                if (uiStartPoint >= 0 && uiEndPoint >= 0 && !this.LJJII.LJJIJLIJ(uiStartPoint, uiEndPoint, false)) {
                    this.LJJII.postDelayed(new ARunnableS0S0102000_2(this, uiStartPoint, uiEndPoint, 0), 300L);
                }
                this.LJJII.LJJIIZ(true, z2, null);
                return;
            }
            this.LJJII.LJJIIZ(false, z2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(long r22, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169776lR.LJJII(long, long, boolean):void");
    }
}
