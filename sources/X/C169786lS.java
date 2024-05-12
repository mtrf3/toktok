package X;

import Y.ACListenerS21S0101000_2;
import Y.AObjectS42S0101000_5;
import Y.AObjectS54S0101000_9;
import Y.AObserverS58S0101000_2;
import Y.AObserverS60S0101000_5;
import Y.ARunnableS0S0102000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDiS266S0100000_2;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
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
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6lS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169786lS {
    public static final /* synthetic */ int LJJL = 0;
    public VideoPublishEditModel LIZ;
    public C5LR LIZIZ;
    public ReplayLiveData LIZJ;
    public MutableLiveData<C5MM> LIZLLL;
    public StoredLiveData LJ;
    public MutableLiveData<Boolean> LJFF;
    public SafeHandler LJI;
    public WM7 LJII;
    public C169796lT LJIIIIZZ;
    public LinearLayout LJIIIZ;
    public FrameLayout LJIIJ;
    public ImageView LJIIJJI;
    public RelativeLayout LJIIL;
    public TextView LJIILIIL;
    public RelativeLayout LJIILJJIL;
    public LinearLayout LJIILL;
    public C42880GsG LJIILLIIL;
    public TextView LJIIZILJ;
    public TextView LJIJ;
    public VWL LJIJI;
    public C80698Vlm LJIJJ;
    public ViewOnTouchListenerC141755hL LJIJJLI;
    public ViewOnTouchListenerC82857WfV LJIL;
    public CutMultiVideoViewModel LJJ;
    public VEVideoCoverGeneratorImpl LJJI;
    public InterfaceC153045zY LJJIFFI;
    public C170036lr LJJII;
    public WFB LJJIII;
    public C169976ll LJJIIJ;
    public int LJJIIJZLJL;
    public RunnableC169906le LJJIIZ;
    public RunnableC170016lp LJJIIZI;
    public View LJJIJ;
    public C170226mA LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public ActivityC45651qj LJJIJIL;
    public EffectPointModel LJJIJL;
    public EffectPointModel LJJIJLIJ;
    public C5RV LJJIL;
    public String LJJJ;
    public ArrayList<EffectPointModel> LJJJI;
    public ArrayList<EffectPointModel> LJJJIL;
    public MutableLiveData<Bitmap> LJJJJI;
    public MutableLiveData<Boolean> LJJJJIZL;
    public SafeHandler LJJJJJ;
    public EditEffectVideoModel LJJJJJL;
    public InterfaceC169856lZ LJJJJL;
    public C170206m8 LJJJJLI;
    public IDiS266S0100000_2 LJJJJLL;
    public InterfaceC45540Hu4 LJJJLL;
    public final C170006lo LJJIZ = new C170006lo();
    public int LJJJJ = -1;
    public final boolean LJJJJZ = C6W9.LIZ();
    public boolean LJJJJZI = false;
    public boolean LJJJLIIL = false;
    public final C170096lx LJJJLZIJ = new C5HC() { // from class: X.6lx
        @Override // X.C5HC
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            C169786lS c169786lS = C169786lS.this;
            if (i == 4) {
                if (c169786lS.LJJIJIIJIL) {
                    TextView textView = c169786lS.LJIJ;
                    if (textView != null) {
                        textView.performClick();
                    }
                    return true;
                }
            } else {
                c169786lS.getClass();
            }
            return false;
        }
    };
    public final ARunnableS38S0100000_2 LJJJZ = new ARunnableS38S0100000_2(this, 181);

    public final void LJIILIIL() {
        this.LJJIIZ = null;
        this.LJJIIZI = null;
        this.LJI.removeCallbacksAndMessages(null);
        this.LJJJJJ.removeCallbacksAndMessages(null);
    }

    static {
        C16880lQ.LJLLJ(C169786lS.class);
    }

    public final boolean LIZ() {
        if (!this.LJJIJIIJIL) {
            return true;
        }
        if (!this.LJJII.LIZLLL()) {
            return false;
        }
        MutableLiveData<C5MM> mutableLiveData = this.LIZLLL;
        long j = this.LJJIZ.LIZIZ;
        if (j < 0) {
            j = 0;
        }
        mutableLiveData.setValue(C5MM.LIZLLL(j));
        LJJ((int) this.LJJIZ.LIZJ, false);
        LJIIJ();
        return true;
    }

    public final void LIZJ() {
        if (this.LJJIFFI == null) {
            return;
        }
        int LIZIZ = (int) this.LJJII.LIZIZ();
        long LIZJ = this.LJJII.LIZJ();
        if ((!this.LJJII.LIZ && LIZIZ >= this.LJJIFFI.getDuration()) || (this.LJJII.LIZ && LIZIZ <= 0)) {
            this.LIZLLL.setValue(C5MM.LIZLLL(0L));
        } else {
            C170006lo c170006lo = this.LJJIZ;
            long j = LIZIZ;
            c170006lo.LIZIZ = j;
            c170006lo.LIZJ = LIZJ;
            this.LIZLLL.setValue(C5MM.LIZLLL(j));
        }
        LJIIJJI();
    }

    public final int LJ() {
        int height;
        if (this.LJIIJ.getHeight() == 0) {
            height = (int) KL2.LIZJ(this.LJJIJIL, 276.0f);
        } else {
            height = this.LJIIJ.getHeight();
        }
        return height + 16;
    }

    public final int LJFF() {
        if (this.LJIILJJIL.getHeight() == 0) {
            return (int) KL2.LIZJ(this.LJJIJIL, 52.0f);
        }
        return this.LJIILJJIL.getHeight();
    }

    public final int LJI() {
        return (((C81184Vtc.LIZIZ(this.LJJIJIL) - LJFF()) - LJ()) - C81184Vtc.LJFF(this.LJJIJIL)) - C81184Vtc.LIZJ(this.LJJIJIL);
    }

    public final void LJII() {
        InterfaceC153045zY interfaceC153045zY = this.LJJIFFI;
        if (interfaceC153045zY == null) {
            InterfaceC170656mr LJJIIZI = C60903NvH.LJIIJJI().LJJIIZI();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VEEffectHelper activity is finishing ");
            LIZ.append(this.LJJIJIL.isFinishing());
            LJJIIZI.LJ(X1D.LIZIZ(LIZ));
            return;
        }
        int LLIZLLLIL = interfaceC153045zY.LLIZLLLIL();
        this.LJJ = (CutMultiVideoViewModel) C165706es.LIZLLL(this.LJJIJ).get(CutMultiVideoViewModel.class);
        this.LJIL.setCanEdit(false);
        this.LJIL.setMinVideoLength(1000L);
        this.LJIL.setMaxVideoLength(LLIZLLLIL);
        this.LJJ.LJLLILLLL = this.LIZ.isMvThemeVideoType();
        this.LJJ.LJLLJ = LLIZLLLIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initCutTimeView video duration is ");
        LIZ2.append(this.LJJIFFI.getDuration());
        H78.LJII(X1D.LIZIZ(LIZ2));
        this.LJIL.setVeEditor(this.LJJIFFI);
        List<MediaModel> mediaModelList = this.LIZ.getMediaModelList();
        C170136m1 c170136m1 = new C170136m1();
        c170136m1.LIZIZ = false;
        ((ArrayList) c170136m1.LIZ).add(new C169836lX(this.LJJIJIL, new AObjectS54S0101000_9(2, this, 0), new AObjectS42S0101000_5(2, this, 4), new InterfaceC88475Ynv() { // from class: X.6lh
            @Override // X.InterfaceC88475Ynv
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                C169786lS c169786lS = C169786lS.this;
                return Float.valueOf(C169816lV.LIZ(c169786lS.LJJIJL, c169786lS.LJJIFFI.LLIZLLLIL(), ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue(), ((Integer) obj4).intValue(), ((Float) obj5).floatValue()));
            }
        }));
        this.LJIL.setViewConfig(c170136m1);
        this.LJIL.setOptimizeEffect(this.LJJJJZ);
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJIL;
        AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(this.LJII);
        ViewModelProvider LJFF = C165706es.LJFF(this.LJII);
        CutMultiVideoViewModel cutMultiVideoViewModel = this.LJJ;
        WFB wfb = this.LJJIII;
        boolean z = this.LJJJJZ;
        viewOnTouchListenerC82857WfV.LLIILZL = wfb;
        viewOnTouchListenerC82857WfV.LLIIZ = z;
        viewOnTouchListenerC82857WfV.LJI(LJJIJIIJIL, LJFF, cutMultiVideoViewModel, mediaModelList);
        this.LJIL.setPointerType(2);
        this.LJIL.getVideoEditViewModel().LJLJJL.observe(this.LJII, new AObserverS58S0101000_2(1, this, 3));
        this.LJIL.getVideoEditViewModel().LJLL.observe(this.LJII, new AObserverS58S0101000_2(1, this, 4));
        this.LJIL.getVideoEditViewModel().LJLJLJ.observe(this.LJII, new AObserverS58S0101000_2(2, this, 5));
        this.LJIL.getVideoEditViewModel().LJLJLLL.observe(this.LJII, new AObserverS58S0101000_2(0, this, 16));
        this.LJIL.getVideoEditViewModel().LJLJJLL.observe(this.LJII, new AObserverS58S0101000_2(1, this, 6));
        this.LJIL.getVideoEditViewModel().LJLJL.observe(this.LJII, new AObserverS60S0101000_5(4, this, 0));
        this.LJIL.getVideoEditViewModel().LJLILLLLZI.observe(this.LJII, new AObserverS58S0101000_2(2, this, 15));
        this.LJIL.getVideoEditViewModel().LJLJJI.observe(this.LJII, new AObserverS58S0101000_2(2, this, 7));
        this.LJJIZ.LIZIZ(LLIZLLLIL);
    }

    public final void LJIIIIZZ() {
        if (this.LIZIZ == null) {
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            if (videoPublishEditModel.isFastImport || videoPublishEditModel.isCutSameVideoType()) {
                this.LIZIZ = new C5P3(this.LJJIFFI, this.LIZ.getPreviewInfo());
                H78.LIZ("generate reverse video ,using new api");
            } else if (this.LIZ.isMultiVideoEdit()) {
                this.LIZIZ = new C5P4(this.LJJIFFI, this.LIZ.multiEditVideoRecordData.curMultiEditVideoRecordData);
            } else {
                this.LIZIZ = new C5P3(this.LJJIFFI, this.LIZ.getPreviewInfo());
                H78.LIZ("generate reverse video ,using old api");
            }
        }
    }

    public final void LJIIJ() {
        this.LIZLLL.setValue(C5MM.LIZJ());
        C170696mv.LIZ(this.LJIIJJI, true);
        ImageView imageView = this.LJIIJJI;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final void LJIIJJI() {
        this.LIZLLL.setValue(C5MM.LIZ());
        C170696mv.LIZ(this.LJIIJJI, false);
        ImageView imageView = this.LJIIJJI;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void LJIILL() {
        EffectPointModel effectPointModel = this.LJJIJL;
        if (effectPointModel != null && !CardStruct.IStatusCode.DEFAULT.equals(effectPointModel.getKey())) {
            if (!"1".equals(this.LJJIJL.getKey())) {
                LJIJJLI(true);
                ArrayList arrayList = new ArrayList();
                EffectPointModel effectPointModel2 = new EffectPointModel();
                int startPoint = this.LJJIJL.getStartPoint();
                int endPoint = this.LJJIJL.getEndPoint();
                effectPointModel2.setUiStartPoint(startPoint);
                effectPointModel2.setUiEndPoint(endPoint);
                arrayList.add(effectPointModel2);
                LJIJ(arrayList, true, false);
                return;
            }
            this.LJIIIIZZ.LIZIZ(this.LJJIIJZLJL, true);
            LJIJ(null, false, false);
            return;
        }
        this.LJIIIIZZ.LIZIZ(0, true);
        LJIJ(null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL() {
        this.LJJJIL = new ArrayList<>(this.LJJJI);
        EffectPointModel effectPointModel = this.LJJIJL;
        if (effectPointModel != null) {
            this.LJJIJLIJ = effectPointModel.m113clone();
        }
        if (this.LJ.getValue() != 0) {
            this.LJJIL = ((C5RV) this.LJ.getValue()).clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        if (r1.equals("3") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fc, code lost:
    
        r9.LJIIIIZZ.setOverlayColor(0);
        LJIJJLI(true);
        r1 = X.C5MM.LIZLLL(0);
        LJJ(0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r9.LIZLLL.setValue(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (r1.equals("2") == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169786lS.LJIJI():void");
    }

    public final boolean LJIL() {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel == null || videoPublishEditModel.isStitchMode() || this.LIZ.isMvThemeVideoType()) {
            return false;
        }
        return true;
    }

    public final void LJJIFFI() {
        ((LiveData) this.LJJJJJL.LJLL.getValue()).setValue(Float.valueOf(this.LJIL.getSelectedTime()));
        LJJII(true);
    }

    public final void LIZIZ(List<EffectCategoryResponse> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.LJIJJ.LJIILJJIL();
        this.LJIJJ.setMaxTabModeForCount(list.size());
        for (int i = 0; i < list.size(); i++) {
            ActivityC45651qj activityC45651qj = this.LJJIJIL;
            o.LJI(activityC45651qj);
            C170296mH c170296mH = new C170296mH(activityC45651qj);
            c170296mH.setText(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(list, i)).getName());
            c170296mH.LIZ(i, list.size());
            c170296mH.setTag(Integer.valueOf(i));
            c170296mH.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0101000_2(2, this, 8)));
            C80698Vlm c80698Vlm = this.LJIJJ;
            C164456cr LJIIL = c80698Vlm.LJIIL();
            LJIIL.LIZLLL = c170296mH;
            LJIIL.LIZIZ();
            c80698Vlm.LIZJ(LJIIL);
        }
    }

    public final boolean LIZLLL(List<EffectCategoryResponse> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.LIZ.isMvThemeVideoType() && !this.LIZ.isPhotoMvMode) {
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (ListProtector.get(list, i) != null && C164996dj.LIZIZ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(list, i)).getKey())) {
                    if (i != -1) {
                        ListProtector.remove(list, i);
                    }
                } else {
                    i++;
                }
            }
        }
        if (!LJIL()) {
            return false;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.setName(this.LJJIJIL.getString(R.string.s0m));
        list.add(effectCategoryResponse);
        return true;
    }

    public final void LJIIIZ(boolean z) {
        if (z) {
            this.LIZ.setEffectList(new ArrayList<>(this.LJJJJL.J7()));
            this.LIZ.setTimeEffect(this.LJJIJL);
            if (this.LIZ.getTimeEffect() != null && this.LIZ.getTimeEffect().getKey().equals("1") && this.LJJJJL.LIZIZ().getValue() != null) {
                this.LIZ.getPreviewInfo().updateReverseVideoContent(this.LIZIZ.LIZJ(), this.LIZIZ.LIZIZ(), this.LIZIZ.LJ());
            }
            if (this.LIZ.getTimeEffect() != null) {
                this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", this.LIZ.getCreationId());
            c145995oB.LJI("shoot_way", this.LIZ.mShootWay);
            c145995oB.LIZ(this.LIZ.draftId, "draft_id");
            if (this.LIZ.getEffectList() != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<EffectPointModel> it = this.LIZ.getEffectList().iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    if (!TextUtils.isEmpty(next.getName())) {
                        sb.append(next.getName());
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    c145995oB.LIZLLL("effect_name", sb.substring(0, sb.length() - 1));
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ.setEffectList(new ArrayList<>(this.LJJJJL.J7()));
        this.LIZ.setTimeEffect(this.LJJIJL);
        if (this.LIZ.getTimeEffect() != null) {
            this.LIZ.getEffectList().add(this.LIZ.getTimeEffect());
        }
    }

    public final void LJIIL(boolean z) {
        C162626Zu c162626Zu;
        ViewOnTouchListenerC141755hL viewOnTouchListenerC141755hL = this.LJIJJLI;
        if (viewOnTouchListenerC141755hL != null && (viewOnTouchListenerC141755hL.getAdapter() instanceof C162626Zu) && (c162626Zu = (C162626Zu) this.LJIJJLI.getAdapter()) != null && (c162626Zu.LJLJJLL ^ z)) {
            c162626Zu.LJLJJLL = z;
            c162626Zu.notifyDataSetChanged();
        }
        WF7 wf7 = this.LJIL.LLIILII;
        if (wf7 != null && (wf7.LJLLLL ^ z)) {
            wf7.LJLLLL = z;
            wf7.notifyDataSetChanged();
        }
    }

    public final void LJIILJJIL(String str) {
        ArrayList<EffectPointModel> effectPointModels = this.LJIIIIZZ.getEffectPointModels();
        if (C32151Nz.LJJIIJZLJL(effectPointModels)) {
            return;
        }
        VEEditor.VEState state = this.LJJIFFI.getState();
        C169796lT c169796lT = this.LJIIIIZZ;
        c169796lT.LJLJJLL.remove(c169796lT.LIZJ(str));
        c169796lT.LJLIL.postInvalidate();
        if (effectPointModels.isEmpty()) {
            this.LIZLLL.setValue(C5MM.LIZLLL(0L));
            LJJ((int) this.LJJII.LIZ(0L), false);
        } else {
            EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(effectPointModels, effectPointModels.size() - 1);
            int uiEndPoint = effectPointModel.getUiEndPoint();
            if (effectPointModel.isFromEnd() ^ this.LJJII.LIZ) {
                uiEndPoint = this.LJJIFFI.LLIZLLLIL() - uiEndPoint;
            }
            LJJ(uiEndPoint, false);
            this.LIZLLL.setValue(C5MM.LIZLLL(uiEndPoint));
        }
        if (state == VEEditor.VEState.STARTED) {
            LJIIJ();
        }
    }

    public final void LJIJJ(boolean z) {
        if (z) {
            this.LJIILL.setVisibility(0);
            this.LJIIIZ.setVisibility(8);
            C42880GsG c42880GsG = this.LJIILLIIL;
            if (c42880GsG != null) {
                c42880GsG.setVisibility(0);
                c42880GsG.setStatus(0);
                return;
            }
            return;
        }
        C42880GsG c42880GsG2 = this.LJIILLIIL;
        if (c42880GsG2 != null) {
            c42880GsG2.LIZJ();
        }
        this.LJIILL.setVisibility(8);
        this.LJIIIZ.setVisibility(0);
    }

    public final void LJIJJLI(boolean z) {
        this.LJIL.LJJIIJZLJL(z);
    }

    public final void LJJII(boolean z) {
        C170326mK c170326mK;
        if (z) {
            c170326mK = new C170326mK(this.LJIL.getSelectedTime(), 1);
        } else {
            c170326mK = new C170326mK(this.LJJIFFI.LLIZLLLIL(), 0);
        }
        this.LJJJJJL.ov0().setValue(c170326mK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.5MM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169786lS.LJIIZILJ(int, boolean):void");
    }

    public final void LJJ(int i, boolean z) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        C169796lT c169796lT = this.LJIIIIZZ;
        if (c169796lT != null) {
            c169796lT.LJII(i);
        }
        if (this.LJIL != null && (cutMultiVideoViewModel = this.LJJ) != null && !z) {
            cutMultiVideoViewModel.LJLJI.setValue(Long.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJI(long j, long j2) {
        String str;
        EffectPointModel effectPointModel;
        LJJIFFI();
        int currentItem = this.LJIJI.getCurrentItem();
        if (currentItem < this.LJJIJIIJI.getCount()) {
            str = this.LJJIJIIJI.LJJIIJ(currentItem).getKey();
        } else {
            str = null;
        }
        if (C169816lV.LIZJ(this.LJIJI, this.LJJIJIIJI, LJIL())) {
            C5RV c5rv = (C5RV) this.LJ.getValue();
            if (c5rv == null || (effectPointModel = this.LJJIJL) == null) {
                return;
            }
            int i = (int) j;
            effectPointModel.setStartPoint(i);
            int i2 = (int) j2;
            this.LJJIJL.setEndPoint(i2);
            this.LJJIJL.setUiStartPoint(i);
            this.LJJIJL.setUiEndPoint(i2);
            this.LJ.setValue(C5RV.LJFF(j, j2, c5rv.LJLIL));
            this.LIZLLL.setValue(C5MM.LIZLLL(j));
            EffectPointModel effectPointModel2 = this.LJJIJL;
            if (effectPointModel2 != null && effectPointModel2.getKey() != null) {
                String key = this.LJJIJL.getKey();
                this.LJJIZ.LIZLLL.put(key, Long.valueOf(j));
                this.LJJIZ.LJ.put(key, Long.valueOf(Math.abs(j2 - j)));
            }
        } else if (C164996dj.LIZIZ(str)) {
            long LIZ = this.LJJII.LIZ(j);
            long LIZ2 = this.LJJII.LIZ(j2);
            C5RT c5rt = new C5RT();
            c5rt.LJI = 6;
            c5rt.LIZJ = LIZ;
            c5rt.LIZLLL = LIZ2;
            c5rt.LJ = j;
            c5rt.LJFF = j2;
            c5rt.LJII = this.LJJII.LIZ;
            this.LIZJ.setValue(c5rt);
        }
        LJIIJJI();
    }

    public final void LJIJ(List<EffectPointModel> list, boolean z, boolean z2) {
        int i;
        int i2 = 8;
        if (this.LJJJJZ) {
            this.LJIL.LJJIIJZLJL(z);
        } else {
            ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJIL;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            viewOnTouchListenerC82857WfV.setVisibility(i);
        }
        boolean z3 = !z;
        C169796lT c169796lT = this.LJIIIIZZ;
        if (z3) {
            i2 = 0;
        }
        c169796lT.setVisibility(i2);
        if (z) {
            if (!C32151Nz.LJJIIJZLJL(list)) {
                int uiStartPoint = ((EffectPointModel) ListProtector.get(list, 0)).getUiStartPoint();
                int uiEndPoint = ((EffectPointModel) ListProtector.get(list, 0)).getUiEndPoint();
                if (uiStartPoint >= 0 && uiEndPoint >= 0 && !this.LJIL.LJJIJLIJ(uiStartPoint, uiEndPoint, false)) {
                    this.LJIL.postDelayed(new ARunnableS0S0102000_2(this, uiStartPoint, uiEndPoint, 1), 300L);
                }
                this.LJIL.LJJIIZ(true, z2, null);
                return;
            }
            this.LJIL.LJJIIZ(false, z2, null);
        }
    }
}
