package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.AnonymousClass523;
import X.C124574uj;
import X.C124604um;
import X.C125154vf;
import X.C125974wz;
import X.C126754yF;
import X.C126964ya;
import X.C127074yl;
import X.C127084ym;
import X.C127274z5;
import X.C127594zb;
import X.C1280450u;
import X.C1284452i;
import X.C164916db;
import X.C164926dc;
import X.C16880lQ;
import X.C221108m2;
import X.C32151Nz;
import X.C32I;
import X.C50Q;
import X.C58D;
import X.C5G0;
import X.C5QW;
import X.C60903NvH;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78598Ut0;
import X.C79057V0z;
import X.EnumC126774yH;
import X.EnumC126814yL;
import X.InterfaceC165006dk;
import X.WM7;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS6S0400000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoEffectFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.components.base.api.IFunctionBarService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.track.TrackState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VideoEffectFragment extends TTResourcePanelFragment<CutViewModel> {
    public final C125974wz LJLZ;
    public final C73318Sq2 LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public String LLD;
    public final C62822Ol8 LLF;
    public long LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public NLETrackSlot LLII;
    public final C126964ya LLIIII;
    public final Map<Integer, View> LLIIIILZ;

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Hl() {
        C58D c58d;
        C58D c58d2;
        C58D c58d3;
        C58D c58d4;
        C50Q funcBarController;
        List<AnonymousClass523> LJII;
        C58D c58d5;
        C58D c58d6;
        this.LLD = null;
        if ((this.LJZI || Jl().getSelectedTrackSlot() == null) && this.LJZL) {
            C79057V0z.LJJJJL(Jl(), "force_update_effect_func_event", C76800UCe.LIZ);
        }
        if (this.LL) {
            Jl().getPlayer().M9(this.LJLZ.LIZJ);
        }
        if (C124574uj.LJIILIIL(C79057V0z.LJJI(Jl())).isEmpty()) {
            IFunctionBarService iFunctionBarService = (IFunctionBarService) this.LLFII.getValue();
            if (iFunctionBarService != null && (funcBarController = iFunctionBarService.getFuncBarController()) != null && (LJII = funcBarController.LJII()) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJII, 10));
                Iterator<AnonymousClass523> it = LJII.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJ);
                }
                if (arrayList.contains("bottom_item_effect_add_effects")) {
                    C1284452i mm = mm();
                    if (mm != null && (c58d6 = mm.LJLIL) != null) {
                        c58d6.showOrHideNullEffectTrack(true);
                    }
                    C1284452i mm2 = mm();
                    if (mm2 != null && (c58d5 = mm2.LJLIL) != null) {
                        c58d5.showOrHideNullAudioTrack(false);
                    }
                }
            }
            EditorProContext Jl = Jl();
            C1284452i mm3 = mm();
            if (mm3 != null && (c58d4 = mm3.LJLIL) != null) {
                c58d4.showOrHideNullAudioTrack(C124604um.LJIIIZ(Jl));
            }
            C1284452i mm4 = mm();
            if (mm4 != null && (c58d3 = mm4.LJLIL) != null) {
                c58d3.showOrHideNullEffectTrack(false);
            }
            C1284452i mm5 = mm();
            if (mm5 != null) {
                mm5.LJIJJLI(TrackState.NORMAL);
            }
        }
        if (this.LLII != null) {
            C1284452i mm6 = mm();
            if (mm6 != null) {
                mm6.LJIJJLI(TrackState.VIDEOEFFECT);
            }
            C1284452i mm7 = mm();
            if (mm7 != null && (c58d2 = mm7.LJLIL) != null) {
                c58d2.showOrHideNullEffectTrack(false);
            }
            C1284452i mm8 = mm();
            if (mm8 != null && (c58d = mm8.LJLIL) != null) {
                c58d.showOrHideNullAudioTrack(false);
            }
        }
        if (this.LJLZ.LIZ == EnumC126774yH.ADD) {
            if (this.LLII != null) {
                C32151Nz.LIZIZ(EnumC126814yL.ADD_VIDEO_EFFECT.getNameId(), Jl());
            }
        } else {
            NLETrackSlot nLETrackSlot = this.LLII;
            if (nLETrackSlot == null) {
                C32151Nz.LIZIZ(EnumC126814yL.DELETE.getNameId(), Jl());
            } else if (!o.LJ(C124574uj.LJIJJ(nLETrackSlot), this.LJLZ.LIZIZ)) {
                C32151Nz.LIZIZ(EnumC126814yL.REPLACE_VIDEO_EFFECT.getNameId(), Jl());
            }
        }
        NLETrackSlot nLETrackSlot2 = this.LLII;
        if (nLETrackSlot2 != null) {
            C79057V0z.LJJJJL(Jl(), "select_slot_event", new C127594zb(this.LLII, null, 14));
            nLETrackSlot2.setExtra("is_editorpro_effect", "1");
            nLETrackSlot2.setExtra("add_effect_duration", String.valueOf(C5QW.LJIIIZ(nLETrackSlot2, "add_effect_duration") + (System.currentTimeMillis() - this.LLFF)));
        }
        super.Hl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "video_effect_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIILZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.arl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoEffectFragment() {
        /*
            r7 = this;
            X.4wz r0 = new X.4wz
            r1 = 0
            r2 = 0
            r6 = 15
            r4 = r2
            r0.<init>(r1, r2, r4, r6)
            r7.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoEffectFragment.<init>():void");
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    public final C125154vf lm() {
        return (C125154vf) this.LLFZ.getValue();
    }

    public final C1284452i mm() {
        return (C1284452i) this.LLFFF.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJZL = false;
        this.LJZ.dispose();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.4ya] */
    public VideoEffectFragment(C125974wz c125974wz) {
        this.LLIIIILZ = new LinkedHashMap();
        this.LJLZ = c125974wz;
        this.LJZ = new C73318Sq2();
        this.LLF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 577));
        this.LLFF = System.currentTimeMillis();
        this.LLFFF = C221108m2.LIZIZ(C127274z5.LJLIL);
        this.LLFII = C221108m2.LIZIZ(C127084ym.LJLIL);
        this.LLFZ = C221108m2.LIZIZ(C126754yF.LJLIL);
        this.LLI = C221108m2.LIZIZ(C127074yl.LJLIL);
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 578));
        this.LLIIII = new InterfaceC165006dk() { // from class: X.4ya
            @Override // X.InterfaceC165006dk
            public final boolean LIZ(EffectModel effectModel) {
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final void LJII() {
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIIZ(C5M2 c5m2) {
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIIL(int i, EffectModel effectModel) {
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILJJIL(int i, C170416mT c170416mT, int i2) {
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final void LJIILL(EffectModel effectModel) {
            }

            @Override // X.InterfaceC165006dk
            public final void LIZIZ() {
                VideoEffectFragment.this.Hl();
                VideoPublishEditModel em = VideoEffectFragment.this.em();
                if (em != null) {
                    C125154vf lm = VideoEffectFragment.this.lm();
                    boolean z = false;
                    if (lm != null && !lm.LIZIZ) {
                        z = true;
                    }
                    C5QW.LJIILJJIL(em, "effect", true, z);
                }
            }

            @Override // X.InterfaceC165006dk
            public final void LIZJ() {
                VideoEffectFragment videoEffectFragment = VideoEffectFragment.this;
                videoEffectFragment.LL = false;
                C125154vf lm = videoEffectFragment.lm();
                if (lm != null) {
                    lm.LIZ(videoEffectFragment.LLII, true);
                }
                videoEffectFragment.LLII = null;
                C79057V0z.LJJJJL(VideoEffectFragment.this.Jl(), "editing_effect_panel_unselect_effect_event", C76800UCe.LIZ);
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIIIZZ() {
                C79057V0z.LJJJJL(VideoEffectFragment.this.Jl(), "editing_effect_panel_unselect_effect_event", C76800UCe.LIZ);
            }

            @Override // X.InterfaceC165006dk
            public final void LJ(EffectModel effectModel) {
                o.LJIIIZ(effectModel, "effectModel");
                EditorProContext Jl = VideoEffectFragment.this.Jl();
                String str = effectModel.designerId;
                o.LJIIIIZZ(str, "effectModel.designerId");
                String str2 = effectModel.designerEncryptedId;
                o.LJIIIIZZ(str2, "effectModel.designerEncryptedId");
                C79057V0z.LJJJJL(Jl, "editing_effect_panel_select_effect_event", new C126974yb(str, str2, effectModel.source));
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJI(String effectId) {
                o.LJIIIZ(effectId, "effectId");
                VideoEffectFragment videoEffectFragment = VideoEffectFragment.this;
                if (videoEffectFragment.LJLLI && o.LJ(videoEffectFragment.LLD, effectId)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIJJI(String str) {
                VideoEffectFragment.this.LLD = str;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILIIL(EffectModel effectModel) {
                VideoEffectFragment videoEffectFragment = VideoEffectFragment.this;
                videoEffectFragment.LL = false;
                C125154vf lm = videoEffectFragment.lm();
                if (lm != null) {
                    lm.LIZ(videoEffectFragment.LLII, true);
                }
                videoEffectFragment.LLII = null;
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIILLIIL(EffectModel effectModel) {
                o.LJIIIZ(effectModel, "effectModel");
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final boolean LIZLLL(Effect effect, AqS152S0100000_2 aqS152S0100000_2) {
                o.LJIIIZ(effect, "effect");
                C139075d1 c139075d1 = (C139075d1) VideoEffectFragment.this.LLF.getValue();
                if (c139075d1 != null) {
                    c139075d1.LJII(effect, aqS152S0100000_2, new AqS149S0200000_2(VideoEffectFragment.this, effect, 52));
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC165006dk
            public final void LJFF(int i, EffectModel effectModel) {
                String str;
                boolean z;
                EffectCategoryResponse effectCategoryResponse;
                C5M2 value = ((EditEffectVideoModel) VideoEffectFragment.this.LLI.getValue()).nv0().getValue();
                if (value == null || (effectCategoryResponse = value.LIZIZ) == null || (str = effectCategoryResponse.getKey()) == null) {
                    str = "";
                }
                VideoPublishEditModel em = VideoEffectFragment.this.em();
                if (em != null) {
                    VideoEffectFragment videoEffectFragment = VideoEffectFragment.this;
                    String str2 = effectModel.key;
                    o.LJIIIIZZ(str2, "effectModel.key");
                    C125154vf lm = videoEffectFragment.lm();
                    if (lm != null && !lm.LIZIZ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C135005Ro.LJIIIIZZ(em, str2, str, i, z, true, null, Integer.valueOf(effectModel.source), effectModel.designerId, 64);
                }
            }

            @Override // X.InterfaceC165006dk
            public final void LJIIJ(String categoryKey, List<? extends EffectPointModel> curEffects) {
                o.LJIIIZ(categoryKey, "categoryKey");
                o.LJIIIZ(curEffects, "curEffects");
            }

            @Override // X.InterfaceC165006dk
            public final boolean LJIIZILJ(EffectModel effectModel, int i, boolean z) {
                boolean z2;
                EffectCategoryResponse effectCategoryResponse;
                String key;
                long j;
                int i2;
                String str;
                boolean z3;
                NLETrackSlot LJJJLZIJ;
                EnumC126794yJ enumC126794yJ;
                int i3;
                VideoEffectFragment videoEffectFragment = VideoEffectFragment.this;
                videoEffectFragment.LL = true;
                videoEffectFragment.LJZL = true;
                C125154vf lm = videoEffectFragment.lm();
                String str2 = "";
                if (lm != null) {
                    VideoEffectFragment videoEffectFragment2 = VideoEffectFragment.this;
                    C125974wz effectState = videoEffectFragment2.LJLZ;
                    NLETrackSlot nLETrackSlot = videoEffectFragment2.LLII;
                    o.LJIIIZ(effectState, "effectState");
                    EnumC126774yH enumC126774yH = effectState.LIZ;
                    EnumC126774yH enumC126774yH2 = EnumC126774yH.ADD;
                    if (enumC126774yH == enumC126774yH2) {
                        j = Math.min(effectState.LIZLLL, effectModel.duration * 1000);
                    } else {
                        j = effectState.LIZLLL;
                    }
                    String resDir = effectModel.resDir;
                    o.LJIIIIZZ(resDir, "resDir");
                    String name = effectModel.name;
                    o.LJIIIIZZ(name, "name");
                    String key2 = effectModel.key;
                    o.LJIIIIZZ(key2, "key");
                    String str3 = effectModel.extra;
                    if (str3 == null) {
                        str3 = "";
                    }
                    long j2 = effectState.LIZJ;
                    Boolean isNewEngineEffect = effectModel.isNewEngineEffect;
                    o.LJIIIIZZ(isNewEngineEffect, "isNewEngineEffect");
                    boolean booleanValue = isNewEngineEffect.booleanValue();
                    if (C126934yX.LIZ()) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    String str4 = effectModel.adjustParams;
                    if (str4 == null || str4.length() == 0) {
                        str = "{}";
                    } else {
                        str = effectModel.adjustParams;
                    }
                    o.LJIIIIZZ(str, "if (adjustParams.isNullO…)) \"{}\" else adjustParams");
                    C122814rt c122814rt = new C122814rt(resDir, name, key2, str3, j2, j, booleanValue, i2, str);
                    if ((effectState.LIZ != enumC126774yH2 && nLETrackSlot != null) || effectModel.duration == effectState.LIZLLL) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (nLETrackSlot != null && nLETrackSlot.hasExtra("slot_add_order")) {
                            i3 = C64504PTg.LIZ(nLETrackSlot, "slot_add_order", "curEffectSlot.getExtra(ExtraKeys.SLOT_ADD_ORDER)");
                        } else {
                            i3 = 0;
                        }
                        LJJJLZIJ = lm.LIZIZ().getEditor().LJJ(nLETrackSlot, c122814rt, EnumC124724uy.COMMIT);
                        if (LJJJLZIJ != null) {
                            LJJJLZIJ.setExtra("slot_add_order", String.valueOf(i3));
                        }
                    } else {
                        if (nLETrackSlot != null) {
                            lm.LIZIZ().getEditor().LJJIII(nLETrackSlot, EnumC124724uy.COMMIT);
                        }
                        OSZ osz = new OSZ(Long.valueOf(effectState.LIZJ), Long.valueOf(effectState.LIZJ + j));
                        List<NLETrack> trackList = C124574uj.LJIILIIL(C79057V0z.LJJI(lm.LIZIZ()));
                        o.LJIIIZ(trackList, "trackList");
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(trackList);
                        LJJJLZIJ = lm.LIZIZ().getEditor().LJJJLZIJ(C124614un.LJ(osz, arrayList), c122814rt, EnumC124724uy.COMMIT);
                        int LJIIJJI = C124574uj.LJIIJJI(C79057V0z.LJJI(lm.LIZIZ()));
                        if (LJJJLZIJ != null) {
                            LJJJLZIJ.setExtra("slot_add_order", String.valueOf(LJIIJJI));
                        }
                    }
                    effectModel.isFromEditPro = true;
                    if (LJJJLZIJ != null) {
                        NLEModel LIZLLL = lm.LIZLLL();
                        if (lm.LIZIZ) {
                            enumC126794yJ = EnumC126794yJ.MULTI_TRACK;
                        } else {
                            enumC126794yJ = EnumC126794yJ.EDITOR_PRO;
                        }
                        C123254sb.LJ(LJJJLZIJ, effectModel, LIZLLL, enumC126794yJ);
                        C125014vR.LIZ(lm.LIZIZ().getPlayer(), LJJJLZIJ.getStartTime(), LJJJLZIJ.getEndTime(), false, 12);
                    }
                    if (LJJJLZIJ != null) {
                        VideoEffectFragment.this.LLII = LJJJLZIJ;
                    }
                }
                VideoPublishEditModel em = VideoEffectFragment.this.em();
                if (em != null) {
                    VideoEffectFragment videoEffectFragment3 = VideoEffectFragment.this;
                    C5M2 value = ((EditEffectVideoModel) videoEffectFragment3.LLI.getValue()).nv0().getValue();
                    if (value != null && (effectCategoryResponse = value.LIZIZ) != null && (key = effectCategoryResponse.getKey()) != null) {
                        str2 = key;
                    }
                    C125154vf lm2 = videoEffectFragment3.lm();
                    if (lm2 != null && !lm2.LIZIZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C135005Ro.LJFF(em, effectModel, str2, i, z2, true);
                    return true;
                }
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            VideoPublishEditModel em = em();
            if (em != null) {
                WM7 LJI = C78598Ut0.LJI(view);
                if (LJI != null) {
                    Context requireContext = requireContext();
                    o.LJIIIIZZ(requireContext, "requireContext()");
                    C164916db c164916db = new C164916db(em, LJI, requireContext, (C164926dc) this.LLIFFJFJJ.getValue(), this.LLIIII, null, C60903NvH.LJIIJJI().getAccountService());
                    ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.c60);
                    if (viewGroup != null) {
                        viewGroup.addView(c164916db);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            MJ();
            Nl();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && (findViewById = mo49getActivity.findViewById(R.id.cjj)) != null && (findViewById2 = mo49getActivity.findViewById(R.id.lj2)) != null && (findViewById3 = mo49getActivity.findViewById(R.id.cjk)) != null) {
                if (findViewById.getMeasuredHeight() == 0 || findViewById2.getMeasuredHeight() == 0 || findViewById3.getMeasuredHeight() == 0) {
                    findViewById3.post(new ARunnableS6S0400000_2(findViewById, findViewById2, findViewById3, this, 10));
                } else {
                    hm(findViewById3.getMeasuredHeight() + findViewById2.getMeasuredHeight() + findViewById.getMeasuredHeight());
                }
            }
            C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 68), view);
            this.LLFF = System.currentTimeMillis();
            if (this.LJLZ.LIZ == EnumC126774yH.REPLACE) {
                this.LLII = Jl().getSelectedTrackSlot();
            }
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 291));
        }
    }
}
