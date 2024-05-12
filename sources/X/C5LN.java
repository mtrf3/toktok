package X;

import Y.ACListenerS22S0100000_2;
import Y.ACallableS80S0200000_2;
import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.AgS107S0200000_2;
import Y.AgS72S0300000_2;
import Y.IDComparatorS30S0000000_2;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEBranchListener;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit.DefaultStreamEditSubPanelHelper;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.AqS0S0010001_2;
import kotlin.jvm.internal.AqS103S0101000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS14S1201000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5LN */
/* loaded from: classes3.dex */
public final class C5LN extends AbstractC48231ut<InterfaceC145485nM, C5OO, C5M1, C133335Ld> implements InterfaceC145485nM, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILLIZIL;
    public final C82622Wbi LJLL;
    public final WMH LJLLI;
    public final C0IB<Integer> LJLLILLLL;
    public final LiveEvent<C76800UCe> LJLLJ;
    public final LiveEvent<C76800UCe> LJLLL;
    public final LiveEvent<Integer> LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public InterfaceC153045zY LJZL;
    public final C5H3 LL;
    public final C5H3 LLD;
    public long LLF;
    public final InterfaceC115514g7 LLFF;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C5H3 LLI;
    public OSZ<String, String> LLIFFJFJJ;
    public long LLII;
    public OSZ<Long, Long> LLIIII;
    public final C5H3 LLIIIILZ;
    public final C5H3 LLIIIJ;
    public final C5H3 LLIIIL;
    public final C5H3 LLIIIZ;
    public final C5OB LLIIJI;
    public final InterfaceC65784Pro<C5M1> LLIIJLIL;
    public final InterfaceC65784Pro<C133335Ld> LLIIL;
    public C5OO LLIILII;
    public final InterfaceC65784Pro<C5OO> LLIILZL;
    public NLEEditorListener LLIIZ;
    public NLEBranchListener LLIL;
    public final C5LP LLILII;
    public final C5LO LLILIL;
    public final boolean LLILL;

    static {
        TBT tbt = new TBT(C5LN.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILLIZIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5LN.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C5LN.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0, c65351Pkp), C61845OOz.LIZJ(C5LN.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0, c65351Pkp), C61845OOz.LIZJ(C5LN.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0, c65351Pkp)};
    }

    private final InterfaceC150685vk LLIZ() {
        return (InterfaceC150685vk) this.LJZI.LIZ(this, LLILLIZIL[3]);
    }

    private final C149865uQ LLJI() {
        return (C149865uQ) this.LLFFF.getValue();
    }

    private final C5HC LLJJIII() {
        return (C5HC) this.LLIIIJ.getValue();
    }

    private final C5LS LLJJIJIL() {
        return (C5LS) this.LLIIIZ.getValue();
    }

    private final C137965bE LLJJJIL() {
        return (C137965bE) this.LJZ.LIZ(this, LLILLIZIL[2]);
    }

    private final DefaultStreamEditSubPanelHelper LLJJL() {
        return (DefaultStreamEditSubPanelHelper) this.LLIIIL.getValue();
    }

    private final void LLLLLLIL() {
        LJJZZI(new AqS168S0100000_2(this, 164));
        LLLLLJIL(this, false, false, false, null, 14, null);
        LLJJIJI().LJFF.setValue(new C5MM(3, 0L, null));
        LJLZ(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLLLZLLIL() {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5LN.LLLLZLLIL():void");
    }

    private final void LLLZ() {
        HashMap<String, AVChallenge> stickerToChallenge;
        AVChallenge aVChallenge;
        List<AVChallenge> editEffectStickerChallengeList;
        ArrayList arrayList = new ArrayList();
        C137965bE LLJJJIL = LLJJJIL();
        if (LLJJJIL != null && (editEffectStickerChallengeList = LLJJJIL.LIZIZ().getEditEffectStickerChallengeList()) != null) {
            for (AVChallenge aVChallenge2 : editEffectStickerChallengeList) {
                C137965bE LLJJJIL2 = LLJJJIL();
                if (LLJJJIL2 != null) {
                    LLJJJIL2.LIZJ(aVChallenge2.cid);
                }
            }
        }
        ArrayList<EffectPointModel> effectList = LLJ().getEffectList();
        o.LJIIIIZZ(effectList, "editModel.effectList");
        Iterator<EffectPointModel> it = effectList.iterator();
        while (it.hasNext()) {
            EffectPointModel next = it.next();
            if (C78685UuP.LJJJZ(next.getChallenge())) {
                C137965bE LLJJJIL3 = LLJJJIL();
                if (LLJJJIL3 != null && (stickerToChallenge = LLJJJIL3.LIZIZ().getStickerToChallenge()) != null && (aVChallenge = stickerToChallenge.get(next.getChallenge())) != null) {
                    arrayList.add(aVChallenge);
                } else {
                    C137965bE LLJJJIL4 = LLJJJIL();
                    if (LLJJJIL4 != null) {
                        String challenge = next.getChallenge();
                        o.LJIIIIZZ(challenge, "model.challenge");
                        LLJJJIL4.LIZ(this, challenge);
                    }
                }
            }
        }
        C137965bE LLJJJIL5 = LLJJJIL();
        if (LLJJJIL5 != null) {
            LLJJJIL5.LIZIZ().setEditEffectStickerChallengeList(arrayList);
        }
    }

    private final SafeHandler LLLZI() {
        return (SafeHandler) this.LLIIIILZ.getValue();
    }

    public final C139075d1 LLILZIL() {
        return (C139075d1) this.LLFII.getValue();
    }

    public final VideoPublishEditModel LLJ() {
        return (VideoPublishEditModel) this.LJLZ.LIZ(this, LLILLIZIL[1]);
    }

    public final EditEffectVideoModel LLJJ() {
        return (EditEffectVideoModel) this.LLI.getValue();
    }

    public final NLEEditor LLJJI() {
        return (NLEEditor) this.LL.getValue();
    }

    public final C133315Lb LLJJIJI() {
        return (C133315Lb) this.LLFZ.getValue();
    }

    public final void LLLLLJLJLL() {
        C10K<Boolean> prepare;
        InterfaceC153045zY interfaceC153045zY = this.LJZL;
        if (interfaceC153045zY != null) {
            Rect t5 = interfaceC153045zY.t5();
            C5LS LLJJIJIL = LLJJIJIL();
            AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(t5, this, 22);
            AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 227);
            LLJJIJIL.getClass();
            C5LR c5lr = LLJJIJIL.LIZLLL;
            if (c5lr == null) {
                return;
            }
            if (o.LJ(Boolean.valueOf(c5lr.LJI()), Boolean.TRUE)) {
                aqS149S0200000_2.invoke();
                return;
            }
            C5LR c5lr2 = LLJJIJIL.LIZLLL;
            if (c5lr2 != null && c5lr2.LIZIZ) {
                return;
            }
            LLJJIJIL.LJII = aqS152S0100000_2;
            if (c5lr2 == null || (prepare = c5lr2.prepare()) == null) {
                return;
            }
            prepare.LJ(new AgS72S0300000_2(LLJJIJIL, aqS149S0200000_2, aqS152S0100000_2, 0), C10K.LJIIIIZZ, null);
            return;
        }
        o.LJIJI("veEditor");
        throw null;
    }

    public final InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LLFF.LIZ(this, LLILLIZIL[4]);
    }

    @Override // X.InterfaceC145485nM
    public void Q9() {
        LJJZZI(C5GN.LJLIL);
    }

    public final C126844yO Qt() {
        return (C126844yO) this.LLD.getValue();
    }

    @Override // X.InterfaceC145485nM
    public void bg0() {
        LJJZZI(C5GZ.LJLIL);
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLLLLLL.LIZ(this, LLILLIZIL[0]);
    }

    private final boolean LLIILZL() {
        float f;
        NLETrackSlot nLETrackSlot;
        C133355Lf c133355Lf = LJJLJ().LJII;
        if (c133355Lf != null) {
            f = c133355Lf.LJLIL;
        } else {
            f = 0.0f;
        }
        long LJJIIZ = O6R.LJJIIZ(f * LJJLJ().LJIIIIZZ) * 1000;
        C08630Vn<NLETrackSlot> c08630Vn = LJJLJ().LJIIJ;
        if (c08630Vn == null || (nLETrackSlot = c08630Vn.LIZIZ) == null || LJJIIZ < nLETrackSlot.getStartTime() || LJJIIZ > nLETrackSlot.getEndTime()) {
            return false;
        }
        return true;
    }

    private final void LLLFFI() {
        C5LR c5p3;
        C5LS LLJJIJIL = LLJJIJIL();
        InterfaceC153045zY interfaceC153045zY = LLJJIJIL.LJ;
        if (interfaceC153045zY == null || LLJJIJIL.LIZLLL != null) {
            return;
        }
        if (LLJJIJIL.LIZIZ.isMultiVideoEdit()) {
            MultiEditVideoRecordData multiEditVideoRecordData = LLJJIJIL.LIZIZ.multiEditVideoRecordData.curMultiEditVideoRecordData;
            o.LJIIIIZZ(multiEditVideoRecordData, "editModel.multiEditVideo…rMultiEditVideoRecordData");
            EditPreviewInfo previewInfo = LLJJIJIL.LIZIZ.getPreviewInfo();
            o.LJIIIIZZ(previewInfo, "editModel.previewInfo");
            c5p3 = new C5P0(interfaceC153045zY, multiEditVideoRecordData, previewInfo, LLJJIJIL.LIZJ);
        } else {
            EditPreviewInfo previewInfo2 = LLJJIJIL.LIZIZ.getPreviewInfo();
            o.LJIIIIZZ(previewInfo2, "editModel.previewInfo");
            c5p3 = new C5P3(interfaceC153045zY, previewInfo2);
        }
        c5p3.LIZLLL = new AqS168S0100000_2(LLJJIJIL, 155);
        LLJJIJIL.LIZLLL = c5p3;
    }

    private final void LLLFZ() {
        Ll0().jb().observe(this, new AObjectS84S0100000_2(this, 62));
        LLJJ().gv0().observe(this, new AObserverS70S0100000_2(this, 56));
    }

    private final boolean LLLIIIL() {
        EffectCategoryResponse effectCategoryResponse = LJJLJ().LJIJ.LIZIZ;
        if (effectCategoryResponse == null) {
            return false;
        }
        return o.LJ("trick_effects", effectCategoryResponse.getKey());
    }

    @Override // X.InterfaceC145485nM
    public void C5() {
        C5LR c5lr = LLJJIJIL().LIZLLL;
        if (c5lr != null) {
            c5lr.LIZ();
        }
    }

    public final void LLIIZ() {
        EnumC126814yL enumC126814yL;
        Boolean first = LJJLJ().LJIIZILJ.getFirst();
        if (first != null) {
            boolean booleanValue = first.booleanValue();
            if (!LJJLJ().LJIIZILJ.getSecond().booleanValue()) {
                return;
            }
            C126844yO Qt = Qt();
            EnumC124724uy enumC124724uy = EnumC124724uy.DONE;
            if (booleanValue) {
                enumC126814yL = EnumC126814yL.ADD_VIDEO_EFFECT;
            } else {
                enumC126814yL = EnumC126814yL.REPLACE_VIDEO_EFFECT;
            }
            Qt.LIZLLL(enumC124724uy, enumC126814yL.getNameId());
            LJJZZI(C5GS.LJLIL);
        }
    }

    @Override // X.InterfaceC145485nM
    public void LLIL() {
        LLJ().setTimeEffect(null);
        C126844yO Qt = Qt();
        Qt.LIZJ.setValue(C5RV.LJI());
        Qt.LIZLLL(EnumC124724uy.DONE, EnumC126814yL.DELETE.getNameId());
        C5();
        LJJZZI(C5LZ.LJLIL);
    }

    public final long LLILZLL() {
        if (LLJ().isMvThemeVideoType()) {
            if (this.LJZL != null) {
                return r0.LLIZLLLIL() * 1000;
            }
            o.LJIJI("veEditor");
            throw null;
        }
        Iterator<NLETrackSlot> it = LLJJI().LJ().getMainTrack().LJIILL().iterator();
        long j = 0;
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            j += next.getEndTime() - next.getStartTime();
        }
        return j;
    }

    public final void LLJLLIL() {
        LLLLZLLIL();
        hide();
        InterfaceC150685vk LLIZ = LLIZ();
        if (LLIZ != null) {
            LLIZ.Pr();
        }
        C135005Ro.LJII(LLJ());
    }

    public final boolean LLLI() {
        if (!LLJ().getEffectList().isEmpty() || !e1.LIZ(31744, "editing_effect_auto_apply_first_effect", true, false)) {
            return false;
        }
        return true;
    }

    public final boolean LLLILZLLLI() {
        EffectCategoryResponse effectCategoryResponse = LJJLJ().LJIJ.LIZIZ;
        if (effectCategoryResponse == null) {
            return false;
        }
        return C164996dj.LIZJ(effectCategoryResponse.getKey());
    }

    public final void LLLJIL() {
        if (!LLJJI().LIZ()) {
            hide();
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(getActivity());
        c26227ARb.LIZ(R.string.exf);
        UC0.LIZJ(c26227ARb, new AqS168S0100000_2(this, 168));
        c26227ARb.LJI().LIZLLL();
    }

    public final void LLLLZLL() {
        LLIIZ();
        LJJZZI(C5LW.LJLIL);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        LLJJI().removeConsumer(this.LLIIZ);
        NLEEditor LLJJI = LLJJI();
        NLEEditorJniJNI.NLEEditor_setBranchListener(LLJJI.LIZ, LLJJI, NLEBranchListener.getCPtr(null), null);
        LLJJL().LIZIZ();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLLI);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityOnKeyDownListener(LLJJIII());
        }
        C133315Lb LLJJIJI = LLJJIJI();
        InterfaceC143655kP interfaceC143655kP = LLJJIJI.LIZIZ;
        int LIZ = C173636rf.LIZ(R.attr.d4, LLJJIJI.LIZ);
        int LJFF = C81184Vtc.LJFF(LLJJIJI.LIZ) + ((int) KL2.LIZJ(LLJJIJI.LIZ, 44.0f));
        int LIZJ = (int) KL2.LIZJ(LLJJIJI.LIZ, LLJJIJI.LJIIIIZZ);
        int LIZ2 = LLJJIJI.LIZ();
        AnonymousClass668.LIZIZ().LIZ();
        interfaceC143655kP.oF(C140345f4.LIZ(LIZ, LJFF, LIZJ, LIZ2));
        LLJJIJI.LIZIZ.U2(true, false, true);
        LJJZZI(C5LX.LJLIL);
        EditEffectModel editEffectModel = LLJ().creativeModel.editEffectModel;
        NLEModel LJ = LLJJI().LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        editEffectModel.hasClippedEffect = C123254sb.LIZJ(LJ);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [T, com.bytedance.ies.nle.editor_jni.NLENode] */
    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        VecNLETrackSlotSPtr LJIILLIIL;
        NLESegmentEffect LIZIZ;
        super.onCreate();
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null) {
            return;
        }
        this.LJZL = value;
        if (LLJJ().LJLJJLL == null) {
            EditEffectVideoModel LLJJ = LLJJ();
            C135625Ty c135625Ty = new C135625Ty(getActivity(), this);
            LLJJ.getClass();
            LLJJ.LJLJJLL = c135625Ty;
        }
        LLLFZ();
        if (LLJ().mIsFromDraft) {
            LLLLZLLIL();
            C126844yO Qt = Qt();
            if (C17J.LJJIJL(Qt.LJIIIIZZ())) {
                NLETrack nLETrack = (NLETrack) ORZ.LJLLLLLL(0, C17J.LJJIIJ(Qt.LJIIIIZZ()));
                if (nLETrack != null) {
                    LJIILLIIL = nLETrack.LJIILLIIL();
                } else {
                    return;
                }
            } else {
                NLETrack mainTrack = Qt.LJIIIIZZ().getMainTrack();
                if (mainTrack != null) {
                    LJIILLIIL = mainTrack.LJIILLIIL();
                } else {
                    return;
                }
            }
            if (LJIILLIIL != null) {
                Iterator<NLETrackSlot> it = LJIILLIIL.iterator();
                while (it.hasNext()) {
                    NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) ORZ.LJLLLL(it.next().LJIIJ());
                    if (nLEVideoEffect != null && C124614un.LJIIIZ(nLEVideoEffect) && ((LIZIZ = nLEVideoEffect.LIZIZ()) == null || !new File(LIZIZ.LJ().LIZJ()).exists())) {
                        C68322mC c68322mC = new C68322mC();
                        c68322mC.element = nLEVideoEffect.deepClone();
                        EffectModel effectModel = new EffectModel();
                        effectModel.key = nLEVideoEffect.getExtra("nleExtraEffectKey");
                        effectModel.name = nLEVideoEffect.getExtra("original_effect_name");
                        effectModel.resourceId = nLEVideoEffect.getExtra("ep_magic_resource_id");
                        effectModel.resDir = nLEVideoEffect.getExtra("nleExtraEffectDirectory");
                        effectModel.extra = nLEVideoEffect.getExtra("nleExtraEffectTag");
                        Qt.LJIILJJIL(effectModel, Qt.LIZLLL, new AqS168S0100000_2(Qt, 189), new AqS149S0200000_2(LJIILLIIL, (VecNLETrackSlotSPtr) c68322mC, (C68322mC<NLENode>) 24));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC145485nM
    public void pl() {
        LLJ().getEffectList().clear();
        C126844yO Qt = Qt();
        Iterator<NLETrack> it = C124574uj.LJIILIIL(Qt.LJIIIIZZ()).iterator();
        while (it.hasNext()) {
            Qt.LJIIIIZZ().removeTrack(it.next());
        }
        Qt.LIZLLL(EnumC124724uy.DONE, "");
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        if (this.LLILL) {
            LJJZZI(new AqS168S0100000_2(this, 169));
        } else if (LLJ().isMultiVideoEdit()) {
            LJJZZI(new AqS168S0100000_2(this, 170));
        }
        C126844yO Qt = Qt();
        for (NLETrack nLETrack : C17J.LJJIII(Qt.LJIIIIZZ())) {
            if (nLETrack.LJIILL().isEmpty()) {
                Qt.LJIIIIZZ().removeTrack(nLETrack);
            }
        }
        LLJJI().LIZIZ();
        LLJ().nleModel = NLEModel.dynamicCast(LLJJI().LJ().deepClone());
        LLJJI().LIZJ();
        LLJJI().LJIIIZ(0L, 0L);
        LLJJI().addConsumer(this.LLIIZ);
        NLEEditor LLJJI = LLJJI();
        NLEBranchListener nLEBranchListener = this.LLIL;
        NLEEditorJniJNI.NLEEditor_setBranchListener(LLJJI.LIZ, LLJJI, NLEBranchListener.getCPtr(nLEBranchListener), nLEBranchListener);
        LLLFFI();
        LLLLLLIL();
        LLJJL().LIZJ();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLLI);
        if (LIZIZ != null) {
            LIZIZ.registerActivityOnKeyDownListener(LLJJIII());
        }
        C133315Lb LLJJIJI = LLJJIJI();
        InterfaceC143655kP interfaceC143655kP = LLJJIJI.LIZIZ;
        int LIZ = C173636rf.LIZ(R.attr.d4, LLJJIJI.LIZ);
        int LJFF = C81184Vtc.LJFF(LLJJIJI.LIZ) + ((int) KL2.LIZJ(LLJJIJI.LIZ, 44.0f));
        int LIZJ = (int) KL2.LIZJ(LLJJIJI.LIZ, LLJJIJI.LJIIIIZZ);
        int LIZ2 = LLJJIJI.LIZ();
        AnonymousClass668.LIZIZ().LIZ();
        interfaceC143655kP.oF(C140345f4.LIZIZ(LIZ, LJFF, LIZJ, LIZ2, false, false, 960));
        LJJZZI(new AqS168S0100000_2(this, 172));
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5M1> LJJLIIIJJI() {
        return this.LLIIJLIL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C133335Ld> LJJLIIIJJIZ() {
        return this.LLIIL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C5OO> LJLJJLL() {
        return this.LLIILZL;
    }

    @Override // X.InterfaceC145485nM
    public LiveEvent<Integer> MC() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC145485nM
    public LiveEvent<C76800UCe> Ut() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC145485nM
    public LiveEvent<C76800UCe> mb() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC145485nM
    public C0IB<Integer> ti() {
        return this.LJLLILLLL;
    }

    private final void LJLZ(Integer num) {
        int LJZL;
        if (num != null) {
            LJZL = num.intValue();
        } else {
            InterfaceC153045zY interfaceC153045zY = this.LJZL;
            if (interfaceC153045zY != null) {
                LJZL = interfaceC153045zY.LJZL();
            } else {
                o.LJIJI("veEditor");
                throw null;
            }
        }
        if (this.LJZL != null) {
            LJJZZI(new AqS0S0000001_2(r0.LLJJI(LJZL) / LJJLJ().LJIIIIZZ, 1));
        } else {
            o.LJIJI("veEditor");
            throw null;
        }
    }

    private final void LLILL(EffectModel effectModel) {
        String str;
        String[] strArr;
        HashMap<String, AVChallenge> stickerToChallenge;
        C137965bE LLJJJIL;
        if (C133405Lk.LIZ && (str = effectModel.challenge) != null && (strArr = (String[]) s.LJLJJL(str, new String[]{","}, 0, 6).toArray(new String[0])) != null) {
            for (String str2 : strArr) {
                C137965bE LLJJJIL2 = LLJJJIL();
                if (LLJJJIL2 != null && (stickerToChallenge = LLJJJIL2.LIZIZ().getStickerToChallenge()) != null && !stickerToChallenge.containsKey(str2) && (LLJJJIL = LLJJJIL()) != null) {
                    LLJJJIL.LIZ(this, str2);
                }
            }
        }
    }

    public static final void LLLJL(C5LN c5ln) {
        c5ln.Qt().LJIILLIIL(new AqS152S0100000_2(c5ln, 238));
        c5ln.LJJZZI(new AqS168S0100000_2(c5ln, 171));
        c5ln.Q9();
        c5ln.LJJZZI(new AqS168S0100000_2(c5ln, 173));
        c5ln.hide();
    }

    private final void LLLLLZIL(int i) {
        C26045AKb c26045AKb = new C26045AKb(getActivity());
        c26045AKb.LJIIIIZZ(i);
        c26045AKb.LIZLLL(4000L);
        c26045AKb.LJIIJ();
    }

    private final void LLLLZI(boolean z) {
        String string;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LLII < 3000) {
            return;
        }
        this.LLII = currentTimeMillis;
        if (z) {
            string = getActivity().getString(R.string.th8, Float.valueOf(this.LLIIJI.LJLZ / 1000.0f));
        } else {
            string = getActivity().getString(R.string.fms);
        }
        o.LJIIIIZZ(string, "if (isTimeEffect) {\n    …enu_edit_toast)\n        }");
        ActivityC45651qj activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(activity, 3010, creativeToastBuilder);
    }

    @Override // X.InterfaceC145485nM
    public void LJJLIIIJ(int i) {
        LJJZZI(new AqS168S0100000_2(this, 167));
        C5();
    }

    public final boolean LLJZIJLIL(EffectModel effectModel) {
        Boolean isServerOrCombinedEffect = effectModel.isServerOrCombinedEffect();
        o.LJIIIIZZ(isServerOrCombinedEffect, "effectModel.isServerOrCombinedEffect");
        if (isServerOrCombinedEffect.booleanValue()) {
            LLLLLZIL(R.string.flq);
            return false;
        }
        Boolean isClientEffect = effectModel.isClientEffect();
        o.LJIIIIZZ(isClientEffect, "effectModel.isClientEffect");
        if (!isClientEffect.booleanValue()) {
            return false;
        }
        LLLLLZIL(R.string.flr);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, X.EnumC133695Mn.EDIT_EFFECT_COMBINED.getType()) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LLLJ(com.ss.android.ugc.effectmanager.effect.model.Effect r5) {
        /*
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r1 = r5.getExtra()
            if (r1 != 0) goto Le
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        Le:
            int r0 = r1.length()
            r3 = 0
            if (r0 != 0) goto L1b
            r0 = 1
        L16:
            if (r0 == 0) goto L1d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L1b:
            r0 = 0
            goto L16
        L1d:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L49
            r2.<init>(r1)     // Catch: org.json.JSONException -> L49
            java.lang.String r1 = "game_play_type"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.optString(r1, r0)     // Catch: org.json.JSONException -> L49
            X.5Mn r0 = X.EnumC133695Mn.EDIT_EFFECT_SERVER     // Catch: org.json.JSONException -> L49
            java.lang.String r0 = r0.getType()     // Catch: org.json.JSONException -> L49
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: org.json.JSONException -> L49
            if (r0 == 0) goto L37
            goto L43
        L37:
            X.5Mn r0 = X.EnumC133695Mn.EDIT_EFFECT_COMBINED     // Catch: org.json.JSONException -> L49
            java.lang.String r0 = r0.getType()     // Catch: org.json.JSONException -> L49
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: org.json.JSONException -> L49
            if (r0 == 0) goto L44
        L43:
            r3 = 1
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: org.json.JSONException -> L49
            goto L65
        L49:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "isServerEffect :: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "Editing Effect"
            X.H78.LIZIZ(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5LN.LLLJ(com.ss.android.ugc.effectmanager.effect.model.Effect):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLLLJ(com.ss.android.ugc.aweme.effect.EffectModel r25) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5LN.LLLLJ(com.ss.android.ugc.aweme.effect.EffectModel):boolean");
    }

    public final boolean LLLLJI(int i) {
        Integer num = LJJLJ().LJIIL;
        if (num != null && num.intValue() == i) {
            return false;
        }
        if (C169816lV.LIZLLL(LJJLJ().LJIIIIZZ, i)) {
            C78920UyC.LIZLLL(R.string.fsp, getActivity(), 3010);
            return false;
        }
        return LLLLLL(i);
    }

    public final boolean LLLLLL(int i) {
        boolean z;
        Boolean bool;
        String nameId;
        NLETrackSlot LJIILIIL;
        Integer num = LJJLJ().LJIIL;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC153045zY interfaceC153045zY = this.LJZL;
        if (interfaceC153045zY != null) {
            Rect t5 = interfaceC153045zY.t5();
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C133355Lf c133355Lf = LJJLJ().LJII;
                    if (c133355Lf == null) {
                        return false;
                    }
                    int i2 = (int) (c133355Lf.LJLIL * LJJLJ().LJIIIIZZ);
                    if (LJJLJ().LJIIIIZZ - i2 < this.LLIIJI.LJLZ) {
                        LLLLZI(true);
                        return false;
                    }
                    LJJZZI(new AqS27S0001000_2(i, 14));
                    Qt().LIZIZ(i, new OSZ<>(Long.valueOf(i2), Long.valueOf(i2 + Math.min(r1, Math.max(this.LLIIJI.LJLZ, LJJLJ().LJIIIIZZ / 5)))));
                }
            } else {
                C5LR c5lr = LLJJIJIL().LIZLLL;
                if (c5lr != null) {
                    bool = Boolean.valueOf(c5lr.LJI());
                } else {
                    bool = null;
                }
                if (o.LJ(bool, Boolean.TRUE)) {
                    LJJZZI(new AqS27S0001000_2(i, 13));
                    Qt().LIZIZ(i, null);
                } else {
                    this.LLIFFJFJJ = new OSZ<>(String.valueOf(i), "time");
                    C5LS LLJJIJIL = LLJJIJIL();
                    ActivityC45651qj activity = getActivity();
                    SafeHandler safeHandler = LLLZI();
                    LLJJIJIL.getClass();
                    o.LJIIIZ(activity, "activity");
                    o.LJIIIZ(safeHandler, "safeHandler");
                    ProgressDialogC173696rl LIZIZ = ProgressDialogC173696rl.LIZIZ(activity, activity.getString(R.string.rjz));
                    ACListenerS22S0100000_2 aCListenerS22S0100000_2 = new ACListenerS22S0100000_2(LLJJIJIL, 28);
                    TuxIconView tuxIconView = (TuxIconView) LIZIZ.findViewById(R.id.eay);
                    if (tuxIconView != null) {
                        C16880lQ.LJJJ(tuxIconView, aCListenerS22S0100000_2);
                    }
                    safeHandler.postDelayed(new ARunnableS38S0100000_2(LIZIZ, 65), 5000L);
                    C43045Guv.LIZLLL(new AqS103S0101000_2(LLJJIJIL, 0, 3), 0L);
                    LLJJIJIL.LJFF = LIZIZ;
                    LLLLLJLJLL();
                    return false;
                }
            }
            LLJJIJI().LIZIZ(t5);
            C126844yO Qt = Qt();
            EnumC124724uy enumC124724uy = EnumC124724uy.DONE;
            C40517FvF c40517FvF = new C40517FvF(1, 3);
            if (num != null && c40517FvF.LJIILJJIL(num.intValue())) {
                nameId = EnumC126814yL.REPLACE_VIDEO_EFFECT.getNameId();
            } else {
                nameId = EnumC126814yL.ADD_VIDEO_EFFECT.getNameId();
            }
            Qt.LIZLLL(enumC124724uy, nameId);
            NLEModel LJ = LLJJI().LJ();
            o.LJIIIIZZ(LJ, "nleEditor.model");
            NLETrack LJJIJIIJI = C17J.LJJIJIIJI(LJ);
            if (LJJIJIIJI == null || (LJIILIIL = LJJIJIIJI.LJIILIIL(0)) == null) {
                return false;
            }
            LJJZZI(new AqS168S0100000_2(LJIILIIL, 163));
            if (z) {
                LLJJIJI().LJFF.setValue(new C5MM(3, 0L, null));
                LLLLLJIL(this, true, false, false, null, 14, null);
                return true;
            }
            long j = 1000;
            LLLLLJIL(this, true, false, false, new OSZ(Long.valueOf(LJIILIIL.getStartTime() / j), Long.valueOf((LJIILIIL.getEndTime() / j) - 1)), 6, null);
            return true;
        }
        o.LJIJI("veEditor");
        throw null;
    }

    @Override // X.InterfaceC145485nM
    public void l0(int i) {
        C126844yO Qt = Qt();
        if (this.LJZL != null) {
            Qt.LJIIZILJ(r0.LLIZLLLIL() * 1000, true);
            LLLLZLLIL();
        } else {
            o.LJIJI("veEditor");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.5LP] */
    /* JADX WARN: Type inference failed for: r0v47, types: [X.5LO] */
    public C5LN(C82622Wbi diContainer, WMH parentScene) {
        super(parentScene);
        float f;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLL = diContainer;
        this.LJLLI = parentScene;
        this.LJLLILLLL = new C40871j1(null);
        this.LJLLJ = new C29901Fi();
        this.LJLLL = new C29901Fi();
        this.LJLLLL = new C29901Fi();
        this.LJLLLLLL = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), C137965bE.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), InterfaceC150685vk.class, null);
        this.LL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 235));
        this.LLD = C221108m2.LIZIZ(new AqS152S0100000_2(this, 230));
        this.LLFF = UCI.LJI(getDiContainer(), InterfaceC142545ic.class, null);
        this.LLFFF = C221108m2.LIZIZ(C133395Lj.LJLIL);
        this.LLFII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 226));
        this.LLFZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 228));
        this.LLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 231));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 233));
        this.LLIIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 240));
        this.LLIIIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 239));
        this.LLIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 232));
        if (C143205jg.LJ() > C134855Qz.LIZ(360.0f)) {
            f = 28.0f;
        } else {
            f = 20.0f;
        }
        this.LLIIJI = new C5OB(C134855Qz.LIZ(f));
        this.LLIIJLIL = new AqS152S0100000_2(this, 229);
        this.LLIIL = new AqS152S0100000_2(this, 234);
        this.LLIILZL = new AqS152S0100000_2(this, 237);
        this.LLIIZ = new NLEEditorListener() { // from class: X.5GO
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                String str;
                G8G.LIZ.LIZJ("tool_performance_record_edit_effect_apply", new AqS152S0100000_2(C5LN.this, 236));
                OSZ<String, String> osz = C5LN.this.LLIFFJFJJ;
                if (osz != null) {
                    str = osz.getSecond();
                } else {
                    str = null;
                }
                if (!o.LJ(str, "time")) {
                    C5LN.this.LLIFFJFJJ = null;
                }
                if (C5LN.this.LJJLJ().LJIJ.LIZIZ == null) {
                    return;
                }
                if (C5LN.this.LLLILZLLLI()) {
                    C126844yO Qt = C5LN.this.Qt();
                    NLEModel LJ = Qt.LIZ.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    NLETrack LJJIJIIJI = C17J.LJJIJIIJI(LJ);
                    if (LJJIJIIJI != null && LJJIJIIJI.LJIILL().size() == 0) {
                        Qt.LIZ.LJ().removeTrack(LJJIJIIJI);
                    }
                    Qt.LIZLLL(EnumC124724uy.COMMIT, "");
                    C5LN c5ln = C5LN.this;
                    c5ln.LJJZZI(new AqS168S0100000_2(c5ln, 165));
                    return;
                }
                C5LN c5ln2 = C5LN.this;
                c5ln2.LJJZZI(new AqS168S0100000_2(c5ln2, 166));
            }
        };
        this.LLIL = new NLEBranchListener() { // from class: X.5GJ
            @Override // com.bytedance.ies.nle.editor_jni.NLEBranchListener
            public final void onChanged() {
                C5LN c5ln = C5LN.this;
                c5ln.LJJZZI(new AqS168S0100000_2(c5ln, 162));
            }
        };
        this.LLILII = new C5OE() { // from class: X.5LP
            @Override // X.C5OE
            public final void LIZIZ(String str) {
                String str2;
                EffectCategoryResponse effectCategoryResponse = C5LN.this.LJJLJ().LJIJ.LIZIZ;
                if (effectCategoryResponse == null || (str2 = effectCategoryResponse.getKey()) == null) {
                    str2 = "";
                }
                C5LN.this.LJJZZI(new C5LV(str, str2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.String] */
            @Override // X.C5OE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r10) {
                /*
                    Method dump skipped, instructions count: 377
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C5LP.LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
            }

            @Override // X.C5OE
            public final void LJ(NLETrackSlot nLETrackSlot) {
                long endTime;
                if (C17J.LJJIJLIJ(nLETrackSlot)) {
                    endTime = C17J.LJJIJIIJIL(nLETrackSlot) * 1000;
                } else {
                    endTime = nLETrackSlot.getEndTime();
                }
                C5LN.this.LLIIII = new OSZ<>(Long.valueOf(nLETrackSlot.getStartTime()), Long.valueOf(endTime));
                C5LN.this.LLJJIJI().LJI = null;
                C5LN.LLLLLJIL(C5LN.this, false, false, false, null, 12, null);
                C5LN.this.LJJZZI(C133305La.LJLIL);
            }

            @Override // X.C5OE
            public final void LIZ(float f2, boolean z) {
                C5LN.this.LJJZZI(new AqS0S0010001_2(z, f2, 0));
                C5LN.LLFFF(C5LN.this, z, null, 2, null);
            }

            @Override // X.C5OE
            public final void LIZJ(NLETrackSlot nLETrackSlot, float f2, boolean z, boolean z2) {
                C5LN.this.LLLL(nLETrackSlot, f2, z, z2);
                C5LN.this.LLF(z2, Float.valueOf(f2));
                if (z2) {
                    C5LN.this.LJJZZI(new AqS0S0000001_2(f2, 2));
                }
            }
        };
        this.LLILIL = new InterfaceC165006dk() { // from class: X.5LO
            @Override // X.InterfaceC165006dk
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIIL(int i, EffectModel effectModel) {
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILIIL(EffectModel effectModel) {
                return false;
            }

            @Override // X.InterfaceC165006dk
            public final void LJIILL(EffectModel effectModel) {
            }

            @Override // X.InterfaceC165006dk
            public final void LIZJ() {
                C5OO c5oo = C5LN.this.LLIILII;
                if (c5oo != null) {
                    c5oo.LLJILJILJ();
                } else {
                    o.LJIJI("editEffectScene");
                    throw null;
                }
            }

            @Override // X.InterfaceC165006dk
            public final void LJII() {
                InterfaceC153045zY interfaceC153045zY = C5LN.this.LJZL;
                if (interfaceC153045zY != null) {
                    C5LN.this.LJJZZI(new AqS168S0100000_2(interfaceC153045zY.t5(), 159));
                    C5LN.LLLLLJIL(C5LN.this, false, false, false, null, 14, null);
                    return;
                }
                o.LJIJI("veEditor");
                throw null;
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIIIZZ() {
                C5OO c5oo = C5LN.this.LLIILII;
                if (c5oo != null) {
                    c5oo.LLJILJILJ();
                    C5LN.this.LJJZZI(C5LY.LJLIL);
                } else {
                    o.LJIJI("editEffectScene");
                    throw null;
                }
            }

            @Override // X.InterfaceC165006dk
            public final boolean LIZ(EffectModel effectModel) {
                return !effectModel.isTrickEffect().booleanValue();
            }

            @Override // X.InterfaceC165006dk
            public final void LJ(EffectModel effectModel) {
                o.LJIIIZ(effectModel, "effectModel");
                C5OO c5oo = C5LN.this.LLIILII;
                if (c5oo != null) {
                    String str = effectModel.designerId;
                    o.LJIIIIZZ(str, "effectModel.designerId");
                    String str2 = effectModel.designerEncryptedId;
                    o.LJIIIIZZ(str2, "effectModel.designerEncryptedId");
                    C132205Gu c132205Gu = new C132205Gu(str, str2, effectModel.source);
                    if (AnonymousClass636.LJIILIIL(c132205Gu)) {
                        LinearLayout linearLayout = c5oo.LL;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                            InterfaceC45930I0w interfaceC45930I0w = c5oo.LLFF.get(c132205Gu.LJLIL);
                            if (interfaceC45930I0w != null) {
                                c5oo.LLJJI(interfaceC45930I0w.getNickname(), interfaceC45930I0w.getAvatarThumb());
                                return;
                            } else {
                                C10K.LIZJ(new ACallableS80S0200000_2(c5oo, c132205Gu, 4)).LJ(new AgS107S0200000_2(c5oo, c132205Gu, 3), C10K.LJIIIIZZ, null);
                                return;
                            }
                        }
                        o.LJIJI("designerInfoLayout");
                        throw null;
                    }
                    c5oo.LLJILJILJ();
                    return;
                }
                o.LJIJI("editEffectScene");
                throw null;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJI(String effectId) {
                o.LJIIIZ(effectId, "effectId");
                C5LN c5ln = C5LN.this;
                WMH wmh = c5ln.LJLLI;
                C5OO c5oo = c5ln.LLIILII;
                String str = null;
                if (c5oo != null) {
                    if (!wmh.isShowing(c5oo)) {
                        C5LN.this.LLIFFJFJJ = null;
                    }
                    OSZ<String, String> osz = C5LN.this.LLIFFJFJJ;
                    if (osz != null) {
                        str = osz.getFirst();
                    }
                    return o.LJ(str, effectId);
                }
                o.LJIJI("editEffectScene");
                throw null;
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIIZ(C5M2 c5m2) {
                String str;
                int i;
                List<Effect> totalEffects;
                if (c5m2.LIZ < 0 || c5m2.LIZIZ == null) {
                    return;
                }
                C5LN.this.LJJZZI(new AqS168S0100000_2(c5m2, 160));
                EffectCategoryResponse effectCategoryResponse = c5m2.LIZIZ;
                if (effectCategoryResponse != null) {
                    str = effectCategoryResponse.getKey();
                } else {
                    str = null;
                }
                if (C164996dj.LIZJ(str)) {
                    C5LN.this.LLLLLJLJLL();
                    C5LN c5ln = C5LN.this;
                    c5ln.LJJZZI(new AqS168S0100000_2(c5ln, 161));
                }
                VideoPublishEditModel LLJ = C5LN.this.LLJ();
                EffectCategoryResponse effectCategoryResponse2 = c5m2.LIZIZ;
                if (effectCategoryResponse2 != null && (totalEffects = effectCategoryResponse2.getTotalEffects()) != null) {
                    i = totalEffects.size();
                } else {
                    i = 0;
                }
                C135005Ro.LIZLLL(i, LLJ, str, true, true);
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIJJI(String str) {
                String str2;
                EffectCategoryResponse effectCategoryResponse = C5LN.this.LJJLJ().LJIJ.LIZIZ;
                if (effectCategoryResponse == null || (str2 = effectCategoryResponse.getKey()) == null) {
                    str2 = "";
                }
                C5LN.this.LLIFFJFJJ = new OSZ<>(str, str2);
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILLIIL(EffectModel effectModel) {
                o.LJIIIZ(effectModel, "effectModel");
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LIZLLL(Effect effect, AqS152S0100000_2 aqS152S0100000_2) {
                o.LJIIIZ(effect, "effect");
                C5LN.this.LLILZIL().LJII(effect, aqS152S0100000_2, new AqS149S0200000_2(C5LN.this, effect, 23));
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final void LJFF(int i, EffectModel effectModel) {
                String str;
                EffectCategoryResponse effectCategoryResponse = C5LN.this.LJJLJ().LJIJ.LIZIZ;
                if (effectCategoryResponse == null || (str = effectCategoryResponse.getKey()) == null) {
                    str = "";
                }
                VideoPublishEditModel LLJ = C5LN.this.LLJ();
                String str2 = effectModel.key;
                o.LJIIIIZZ(str2, "effectModel.key");
                C135005Ro.LJIIIIZZ(LLJ, str2, str, i, false, false, null, Integer.valueOf(effectModel.source), effectModel.designerId, 64);
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIJ(String categoryKey, List<? extends EffectPointModel> curEffects) {
                o.LJIIIZ(categoryKey, "categoryKey");
                o.LJIIIZ(curEffects, "curEffects");
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILJJIL(int i, C170416mT c170416mT, int i2) {
                String str;
                C5LN.this.LLIIZ();
                EffectModel effectModel = (EffectModel) ListProtector.get(C5SC.LJ(), i);
                EffectCategoryResponse effectCategoryResponse = C5LN.this.LJJLJ().LJIJ.LIZIZ;
                if (effectCategoryResponse == null || (str = effectCategoryResponse.getKey()) == null) {
                    str = "";
                }
                VideoPublishEditModel LLJ = C5LN.this.LLJ();
                o.LJIIIIZZ(effectModel, "effectModel");
                C135005Ro.LJFF(LLJ, effectModel, str, i2, false, false);
                return C5LN.this.LLLLJI(i);
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIIZILJ(EffectModel effectModel, int i, boolean z) {
                String str;
                EffectCategoryResponse effectCategoryResponse = C5LN.this.LJJLJ().LJIJ.LIZIZ;
                if (effectCategoryResponse == null || (str = effectCategoryResponse.getKey()) == null) {
                    str = "";
                }
                C135005Ro.LJFF(C5LN.this.LLJ(), effectModel, str, i, false, false);
                if (!effectModel.isEnabled) {
                    return C5LN.this.LLJZIJLIL(effectModel);
                }
                Boolean isServerOrCombinedEffect = effectModel.isServerOrCombinedEffect();
                o.LJIIIIZZ(isServerOrCombinedEffect, "effectModel.isServerOrCombinedEffect");
                if (isServerOrCombinedEffect.booleanValue()) {
                    return C5LN.this.LLJLIL(effectModel, str, i, z);
                }
                Boolean isClientEffect = effectModel.isClientEffect();
                o.LJIIIIZZ(isClientEffect, "effectModel.isClientEffect");
                if (isClientEffect.booleanValue()) {
                    return C5LN.this.LLIFFJFJJ(effectModel, str, i);
                }
                return C5LN.this.LLLLJ(effectModel);
            }
        };
        Bundle bundle = ((WM7) getDiContainer().LJ(AbstractC42651GoZ.class, null)).mArguments;
        this.LLILL = C78685UuP.LJJJZ(bundle != null ? bundle.getString("extra_edit_effect_uid") : null);
    }

    public final void LLF(boolean z, Float f) {
        C133355Lf c133355Lf;
        if (f != null || ((c133355Lf = LJJLJ().LJII) != null && (f = Float.valueOf(c133355Lf.LJLIL)) != null)) {
            float floatValue = f.floatValue();
            if (Float.isNaN(LJJLJ().LJIIIIZZ * floatValue)) {
                return;
            }
            int LJJIIZ = O6R.LJJIIZ(LJJLJ().LJIIIIZZ * floatValue);
            InterfaceC153045zY interfaceC153045zY = this.LJZL;
            if (interfaceC153045zY != null) {
                long LLFZ = interfaceC153045zY.LLFZ(LJJIIZ);
                if (z) {
                    LLJJIJI().LJFF.setValue(new C5MM(3, LLFZ, null));
                    return;
                } else {
                    LLJJIJI().LJFF.setValue(C5MM.LIZIZ(LLFZ));
                    return;
                }
            }
            o.LJIJI("veEditor");
            throw null;
        }
    }

    public final boolean LLIFFJFJJ(EffectModel effectModel, String str, int i) {
        LLILL(effectModel);
        Boolean isCombinedEffect = effectModel.isCombinedEffect();
        o.LJIIIIZZ(isCombinedEffect, "effectModel.isCombinedEffect");
        if (isCombinedEffect.booleanValue()) {
            LLLLLJIL(this, true, false, false, null, 14, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        effectModel.index = i;
        effectModel.selectFrom = i0.LJFF("effect_panel_", str);
        Qt().LJIILJJIL(effectModel, C78688UuS.LJJIII(this), new C5GQ(this, effectModel, str, i, currentTimeMillis), new C5GP(this, effectModel, str, i, currentTimeMillis));
        return true;
    }

    public static /* synthetic */ void LJZI(C5LN c5ln, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        c5ln.LJLZ(num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLLLLIL(boolean r12, boolean r13, boolean r14, X.OSZ<java.lang.Long, java.lang.Long> r15) {
        /*
            r11 = this;
            if (r13 == 0) goto Lc
            kotlin.jvm.internal.AqS7S0010000_2 r1 = new kotlin.jvm.internal.AqS7S0010000_2
            r0 = 22
            r1.<init>(r12, r0)
            r11.LJJZZI(r1)
        Lc:
            java.lang.String r3 = "<get-rangePlayer>(...)"
            r2 = 0
            if (r12 == 0) goto L72
            if (r15 == 0) goto L42
            X.5Lb r6 = r11.LLJJIJI()
            java.lang.Object r0 = r15.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            java.lang.Object r0 = r15.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
            r6.getClass()
            X.5Lc r5 = new X.5Lc
            r5.<init>()
            androidx.lifecycle.MutableLiveData<X.5MM> r4 = r6.LJFF
            X.5MM r1 = new X.5MM
            r0 = 3
            r1.<init>(r0, r7, r5)
            r4.setValue(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L65
        L42:
            X.5Lb r4 = r11.LLJJIJI()
            r4.LJI = r2
            X.Ol8 r0 = r4.LJII
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.start()
            X.5zY r1 = r4.LIZJ
            r0 = 1
            r1.LLJILJIL(r0)
            androidx.lifecycle.MutableLiveData<X.5MM> r1 = r4.LJFF
            X.5MM r0 = X.C5MM.LIZ()
            r1.setValue(r0)
        L65:
            if (r14 == 0) goto L71
            kotlin.jvm.internal.AqS7S0010000_2 r1 = new kotlin.jvm.internal.AqS7S0010000_2
            r0 = 23
            r1.<init>(r12, r0)
            r11.LJJZZI(r1)
        L71:
            return
        L72:
            X.5Lb r4 = r11.LLJJIJI()
            androidx.lifecycle.MutableLiveData<X.5MM> r1 = r4.LJFF
            X.5MM r0 = X.C5MM.LIZJ()
            r1.setValue(r0)
            X.Ol8 r0 = r4.LJII
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.cancel()
            r4.LJI = r2
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5LN.LLLLLIL(boolean, boolean, boolean, X.OSZ):void");
    }

    public static /* synthetic */ void LLLLZIL(C5LN c5ln, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c5ln.LLLLZI(z);
    }

    public final Long LLIIIL(long j, EffectModel effectModel, boolean z, boolean z2) {
        Object obj;
        long j2;
        long j3;
        Boolean isTransEffect = effectModel.hasRealDuration();
        NLEModel LJ = LLJJI().LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        List<NLETrack> LJIILIIL = C124574uj.LJIILIIL(LJ);
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = LJIILIIL.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().LJIILLIIL(), arrayList);
        }
        Iterator it2 = ORZ.LLILII(new IDComparatorS30S0000000_2(8), arrayList).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((NLETimeSpaceNode) obj).getStartTime() > j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
        if (nLETimeSpaceNode != null) {
            j2 = nLETimeSpaceNode.getStartTime();
        } else {
            j2 = LJJLJ().LJIIIIZZ * 1000;
        }
        o.LJIIIIZZ(isTransEffect, "isTransEffect");
        if (isTransEffect.booleanValue()) {
            j3 = Math.min(j2 - j, effectModel.duration * 1000);
        } else {
            j3 = j2 - j;
        }
        if (z && j3 < this.LLIIJI.LJLLLLLL * 1000) {
            LLLLZIL(this, false, 1, null);
            return null;
        }
        if (isTransEffect.booleanValue() || z2) {
            return Long.valueOf(j3);
        }
        return Long.valueOf(Math.min(j3, this.LLIIJI.LJLLLL * 1000));
    }

    public final boolean LLJLIL(EffectModel effectModel, String str, int i, boolean z) {
        if (LLJI().LIZIZ()) {
            return LLIFFJFJJ(effectModel, str, i);
        }
        if (!z) {
            C149865uQ LLJI = LLJI();
            ActivityC45651qj activity = getActivity();
            VideoPublishEditModel editModel = LLJ();
            AqS14S1201000_2 aqS14S1201000_2 = new AqS14S1201000_2(this, effectModel, str, i, 2);
            LLJI.getClass();
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(editModel, "editModel");
            C135005Ro.LJIIIZ(editModel, "upload_authorization_popup_show");
            LLJI.LIZ(activity, aqS14S1201000_2, new AqS168S0100000_2(editModel, 497));
        }
        return false;
    }

    public final void LLLL(NLETrackSlot slot, float f, boolean z, boolean z2) {
        int endTime;
        int i;
        Object obj;
        String str;
        NLENode LJIIL;
        long startTime;
        long startTime2;
        LLIIZ();
        int LJJIIZ = O6R.LJJIIZ(LJJLJ().LJIIIIZZ * f);
        boolean LJJIJLIJ = C17J.LJJIJLIJ(slot);
        if (LJJIJLIJ) {
            endTime = C17J.LJJIJIIJIL(slot);
        } else {
            endTime = (int) (slot.getEndTime() / 1000);
        }
        C5OB c5ob = this.LLIIJI;
        if (LJJIJLIJ) {
            i = c5ob.LJLZ;
        } else {
            i = c5ob.LJLLLLLL;
        }
        if (z) {
            if (endTime - LJJIIZ <= i) {
                LLLLZI(LJJIJLIJ);
                LJJIIZ = endTime - i;
            }
        } else {
            long j = 1000;
            if (LJJIIZ - (slot.getStartTime() / j) <= i) {
                LLLLZI(LJJIJLIJ);
                LJJIIZ = ((int) (slot.getStartTime() / j)) + i;
            }
        }
        long j2 = LJJIIZ * 1000;
        OSZ<Long, Long> osz = this.LLIIII;
        if (osz != null && (Math.abs(j2 - osz.getFirst().longValue()) <= this.LLIIJI.LJZI * 1000 || Math.abs(j2 - osz.getSecond().longValue()) <= this.LLIIJI.LJZI * 1000)) {
            return;
        }
        String str2 = "";
        Object obj2 = null;
        if (LJJIJLIJ) {
            C126844yO Qt = Qt();
            Qt.getClass();
            o.LJIIIZ(slot, "slot");
            Integer LJIIJJI = Qt.LJIIJJI();
            if (LJIIJJI != null && (LJIIJJI.intValue() == 2 || LJIIJJI.intValue() == 3)) {
                if (z) {
                    startTime = j2;
                } else {
                    startTime = slot.getStartTime();
                }
                int LJJIJIIJIL = C17J.LJJIJIIJIL(slot);
                if (z) {
                    slot.setStartTime(j2);
                    startTime2 = (LJJIJIIJIL * 1000) - j2;
                } else {
                    startTime2 = j2 - slot.getStartTime();
                }
                long j3 = 1000;
                Qt.LIZJ.setValue(C5RV.LJFF(startTime / j3, (startTime + startTime2) / j3, LJIIJJI.toString()));
                if (z2) {
                    Qt.LIZLLL(EnumC124724uy.DONE, EnumC126814yL.CLIP.getNameId());
                } else {
                    Qt.LIZLLL(EnumC124724uy.COMMIT, "");
                }
            }
            NLETrackSlot LJIIL2 = Qt().LJIIL();
            if (LJIIL2 != null) {
                LJJZZI(new AqS168S0100000_2(LJIIL2, 174));
            }
            if (!z2) {
                return;
            }
        } else {
            C126844yO Qt2 = Qt();
            Qt2.getClass();
            o.LJIIIZ(slot, "slot");
            List<NLETrack> LJIILIIL = C124574uj.LJIILIIL(Qt2.LJIIIIZZ());
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = LJIILIIL.iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it.next().LJIILL(), arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (o.LJ(((NLENode) obj).getUUID(), slot.getUUID())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
            if (nLETimeSpaceNode != null) {
                if (z2) {
                    Iterator it3 = arrayList.iterator();
                    long j4 = j2;
                    while (it3.hasNext()) {
                        NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) it3.next();
                        if (!o.LJ(nLETimeSpaceNode2.getUUID(), slot.getUUID())) {
                            if (z) {
                                if (nLETimeSpaceNode2.getStartTime() < j2 && nLETimeSpaceNode2.getEndTime() > j2) {
                                    j4 = nLETimeSpaceNode2.getEndTime();
                                }
                            } else if (nLETimeSpaceNode2.getStartTime() < j2 && nLETimeSpaceNode2.getEndTime() > j2) {
                                j4 = nLETimeSpaceNode2.getStartTime();
                            }
                        }
                    }
                    j2 = j4;
                }
                if (z) {
                    nLETimeSpaceNode.setStartTime(j2);
                } else {
                    nLETimeSpaceNode.setEndTime(j2);
                }
            }
            if (z2) {
                Qt2.LIZLLL(EnumC124724uy.DONE, EnumC126814yL.CLIP.getNameId());
            } else {
                Qt2.LIZLLL(EnumC124724uy.COMMIT, "");
                return;
            }
        }
        VideoPublishEditModel editModel = LLJ();
        String LJI = Qt().LJI(slot);
        Qt().getClass();
        String LJFF = C126844yO.LJFF(slot);
        o.LJIIIZ(editModel, "editModel");
        C145995oB LIZIZ = C135005Ro.LIZIZ(editModel);
        LIZIZ.LJI("effect_id", LJI);
        if (LJFF != null) {
            str2 = LJFF;
        }
        LIZIZ.LJI("tab_name", str2);
        LIZIZ.LIZ(0, "is_editor_pro");
        LIZIZ.LIZ(0, "is_multi_track");
        if (z) {
            str = "left";
        } else {
            str = "right";
        }
        LIZIZ.LJI("action_type", str);
        GXR.LIZ("edit_effect_duration", LIZIZ.LIZ);
        C126844yO Qt3 = Qt();
        Qt3.getClass();
        if (C17J.LJJIJLIJ(slot) || C78596Usy.LJJJJI(slot)) {
            LJIIL = Qt3.LJIIL();
        } else {
            List<NLETrack> LJIILIIL2 = C124574uj.LJIILIIL(Qt3.LJIIIIZZ());
            ArrayList arrayList2 = new ArrayList();
            Iterator<NLETrack> it4 = LJIILIIL2.iterator();
            while (it4.hasNext()) {
                ORS.LJJLIIIJILLIZJL(it4.next().LJIILL(), arrayList2);
            }
            Iterator it5 = arrayList2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (o.LJ(((NLENode) next).getUUID(), slot.getUUID())) {
                    obj2 = next;
                    break;
                }
            }
            LJIIL = (NLENode) obj2;
        }
        if (LJIIL != null) {
            LJIIL.setExtra("is_edit_effect_duration", "true");
        }
    }

    public static /* synthetic */ void LLFFF(C5LN c5ln, boolean z, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        c5ln.LLF(z, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void LLLLLJIL(C5LN c5ln, boolean z, boolean z2, boolean z3, OSZ osz, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            osz = null;
        }
        c5ln.LLLLLIL(z, z2, z3, osz);
    }
}
