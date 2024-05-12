package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.AbstractC030309z;
import X.ActivityC45651qj;
import X.C122784rq;
import X.C124894vF;
import X.C124954vL;
import X.C1280450u;
import X.C132805Jc;
import X.C139795eB;
import X.C145995oB;
import X.C149935uX;
import X.C149945uY;
import X.C149965ua;
import X.C149975ub;
import X.C149995ud;
import X.C150005ue;
import X.C150145us;
import X.C167716i7;
import X.C167736i9;
import X.C168206iu;
import X.C221108m2;
import X.C32151Nz;
import X.C42292Gim;
import X.C5G0;
import X.C5QW;
import X.C62822Ol8;
import X.C62A;
import X.C78880UxY;
import X.C78920UyC;
import X.C79057V0z;
import X.EnumC123874tb;
import X.EnumC126814yL;
import X.FMX;
import X.InterfaceC149955uZ;
import X.InterfaceC150015uf;
import X.O6R;
import Y.AObserverS70S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VoiceEffectPanelFragment extends TTResourcePanelFragment<CutViewModel> {
    public ViewGroup LJZ;
    public String LJZL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public String LLFFF;
    public final Map<Integer, View> LLIFFJFJJ = new LinkedHashMap();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C150005ue.LJLIL);
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 581));
    public final C62822Ol8 LL = C221108m2.LIZIZ(C149995ud.LJLIL);
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 579));
    public final List<Effect> LLFZ = new ArrayList();
    public final C62822Ol8 LLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 580));

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "voice_effect";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIFFJFJJ).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIFFJFJJ;
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

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.ij;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        C139795eB c139795eB;
        String str = this.LLFFF;
        if (str == null) {
            str = "";
        }
        if (this.LLFF) {
            c139795eB = new C139795eB(EnumC126814yL.APPLYTOALL_VOICE_EFFECT.getNameId(), null, null, str, null, 22);
        } else {
            c139795eB = new C139795eB(EnumC126814yL.APPLY_VOICE_EFFECT.getNameId(), null, null, str, null, 22);
        }
        return C78880UxY.LJLILLLLZI(c139795eB);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    public final InterfaceC149955uZ nm() {
        return (InterfaceC149955uZ) this.LJLZ.getValue();
    }

    public final C42292Gim om() {
        return (C42292Gim) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final boolean Rl() {
        int LIZ = nm().LIZ();
        C167736i9 LJI = nm().LJI(LIZ);
        if (LIZ == -1 || LJI == null) {
            C62A.LIZ.getClass();
            if (C62A.LIZLLL()) {
                C122784rq.LIZLLL(C79057V0z.LJJI(Jl()));
                C79057V0z.LJIIL(Jl());
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null) {
                    C78920UyC.LIZLLL(R.string.fm6, mo49getActivity, 1057);
                }
            }
            return false;
        }
        this.LLD = true;
        ((InterfaceC150015uf) this.LLI.getValue()).LIZ(LIZ, LJI);
        this.LLD = false;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            C78920UyC.LIZLLL(R.string.fm6, mo49getActivity2, 1057);
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        String str;
        EditorProContext editorContext = Jl();
        VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
        if (LIZIZ != null) {
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LIZIZ, editorContext);
            NLETrack LJIJI = C32151Nz.LJIJI(editorContext);
            if (LJIJI != null) {
                str = LJIJI.getExtra("slot_extra_music_id");
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            LJFF.LJI("music_id", str);
            String str3 = LIZIZ.enterFrom;
            if (str3 != null) {
                str2 = str3;
            }
            LJFF.LJI("enter_from", str2);
            LJFF.LJI("is_editor_pro", "1");
            FMX.LJIIL("cancel_voice_effect", LJFF.LIZ);
        }
        super.Sl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        String str;
        EditorProContext editorContext = Jl();
        VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
        if (LIZIZ != null) {
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LIZIZ, editorContext);
            LJFF.LJI("is_editor_pro", "1");
            NLETrack LJIJI = C32151Nz.LJIJI(editorContext);
            if (LJIJI != null) {
                str = LJIJI.getExtra("slot_extra_music_id");
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            LJFF.LJI("music_id", str);
            String str3 = LIZIZ.enterFrom;
            if (str3 != null) {
                str2 = str3;
            }
            LJFF.LJI("enter_from", str2);
            FMX.LJIIL("save_voice_effect", LJFF.LIZ);
        }
        super.V3();
    }

    public final void lm() {
        boolean z;
        boolean z2;
        NLEResourceAV LJ;
        NLETrackSlot selectedTrackSlot = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot == null) {
            return;
        }
        EnumC123874tb LJFF = selectedTrackSlot.LJI().LIZIZ().LJFF();
        if (LJFF == EnumC123874tb.IMAGE) {
            z = true;
        } else {
            z = false;
        }
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(selectedTrackSlot.LJI());
        if (LJJ != null && (LJ = LJJ.LJ()) != null && LJ.LJIIZILJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || (LJFF == EnumC123874tb.VIDEO && !z2)) {
            nm().LJ(new C150145us(false, false, 14));
        } else {
            nm().LJ(new C150145us(true, false, 14));
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        nm().onDestroy();
    }

    public final void mm(boolean z) {
        C150145us c150145us;
        boolean z2;
        String str;
        VideoPublishEditModel LIZIZ = C132805Jc.LIZIZ(EditModelProvider.Companion);
        if (LIZIZ != null) {
            c150145us = C149965ua.LIZ(LIZIZ, null);
        } else {
            c150145us = new C150145us(false, false, 14);
        }
        NLETrackSlot selectedTrackSlot = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            z2 = selectedTrackSlot.hasExtra("extra_voice_chang_effect_id");
        } else {
            z2 = false;
        }
        Effect effect = new Effect(null, 1, null);
        if (z2) {
            if (selectedTrackSlot == null || (str = selectedTrackSlot.getExtra("extra_voice_chang_effect_id")) == null) {
                str = "";
            }
            effect.setEffectId(str);
        }
        nm().LJIIL(false, new C149935uX(this, z, c150145us, effect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        RecyclerView LIZ;
        ViewGroup.LayoutParams layoutParams;
        super.onActivityCreated(bundle);
        if (C1280450u.LIZ()) {
            C62A.LIZ.getClass();
            if (C62A.LIZLLL()) {
                InterfaceC149955uZ nm = nm();
                Context requireContext = requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                getContext();
                LIZ = nm.LIZLLL(requireContext, new LinearLayoutManager(0, false), new AbstractC030309z() { // from class: X.5ug
                });
            } else {
                InterfaceC149955uZ nm2 = nm();
                Context requireContext2 = requireContext();
                o.LJIIIIZZ(requireContext2, "requireContext()");
                LIZ = C149975ub.LIZ(nm2, requireContext2, null, 6);
            }
            if (C62A.LIZLLL()) {
                ViewGroup viewGroup = this.LJZ;
                if (viewGroup != null) {
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                        layoutParams = layoutParams2;
                    } else {
                        layoutParams = new ViewGroup.LayoutParams(-1, -1);
                    }
                    ViewGroup viewGroup2 = this.LJZ;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(LIZ, layoutParams);
                        nm().LJFF(new C168206iu());
                    } else {
                        o.LJIJI("rootLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("rootLayout");
                    throw null;
                }
            } else {
                ViewGroup viewGroup3 = this.LJZ;
                if (viewGroup3 != null) {
                    viewGroup3.addView(LIZ, -1, -1);
                    nm().LJFF(new C167716i7());
                } else {
                    o.LJIJI("rootLayout");
                    throw null;
                }
            }
            nm().LJIIJ((InterfaceC150015uf) this.LLI.getValue());
            C42292Gim om = om();
            Context requireContext3 = requireContext();
            o.LJIIIIZZ(requireContext3, "requireContext()");
            om.LIZIZ(requireContext3, new AqS152S0100000_2(this, 953));
            C149945uY c149945uY = (C149945uY) _$_findCachedViewById(R.id.n2x);
            String string = getString(R.string.trx);
            o.LJIIIIZZ(string, "getString(R.string.voiceover_toast_loading_voice)");
            c149945uY.setLoadingTip(string);
            C149945uY c149945uY2 = (C149945uY) _$_findCachedViewById(R.id.n2x);
            String string2 = getString(R.string.trw);
            o.LJIIIIZZ(string2, "getString(R.string.voiceover_toast_couldnt_retry)");
            c149945uY2.setErrorTip(string2);
            ((C149945uY) _$_findCachedViewById(R.id.n2x)).setOnRetryClick(new AqS168S0100000_2(this, 590));
            View _$_findCachedViewById = _$_findCachedViewById(R.id.a6v);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(4);
            }
            VideoPublishEditModel em = em();
            if (em != null) {
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("creation_id", em.getCreationId());
                c145995oB.LJI("scene_from", "editor_pro");
                FMX.LJIIL("click_voice_effect", c145995oB.LIZ);
            }
            ((C149945uY) _$_findCachedViewById(R.id.n2x)).LIZJ();
            mm(false);
            MutableLiveData<C124894vF> slotSelectChangedEvent = ((CutViewModel) Ml()).getSlotSelectChangedEvent();
            if (slotSelectChangedEvent != null) {
                slotSelectChangedEvent.observe(this, new AObserverS70S0100000_2(this, 160));
            }
            MutableLiveData<C124954vL> trackSelectChangedEvent = ((CutViewModel) Ml()).getTrackSelectChangedEvent();
            if (trackSelectChangedEvent != null) {
                trackSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 161));
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.c55);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(4);
        }
        View findViewById = view.findViewById(R.id.ndn);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.voice_effect_root)");
        this.LJZ = (ViewGroup) findViewById;
    }
}
