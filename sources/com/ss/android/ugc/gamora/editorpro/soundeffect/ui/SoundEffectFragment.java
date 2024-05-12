package com.ss.android.ugc.gamora.editorpro.soundeffect.ui;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass510;
import X.C1280450u;
import X.C1290054m;
import X.C141015g9;
import X.C141175gP;
import X.C141205gS;
import X.C141315gd;
import X.C16880lQ;
import X.C170576mj;
import X.C221108m2;
import X.C47325Ihl;
import X.C5G0;
import X.C60903NvH;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78685UuP;
import X.C78915Uy7;
import X.C78934UyQ;
import X.C80700Vlo;
import X.EnumC141135gL;
import X.H7C;
import X.H7R;
import X.HNW;
import X.InterfaceC127784zu;
import X.InterfaceC141035gB;
import X.InterfaceC47328Iho;
import X.InterfaceC47330Ihq;
import X.InterfaceC84897XTp;
import X.InterfaceC86003Zc;
import X.OSZ;
import X.T16;
import X.V1B;
import X.XU4;
import Y.ACListenerS22S0100000_2;
import Y.AfS54S0100000_2;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModel;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment;
import com.ss.android.ugc.gamora.editorpro.soundeffect.data.SoundEffectTabApiResponse;
import com.ss.android.ugc.gamora.editorpro.soundeffect.model.SoundEffectTabModel;
import com.ss.android.ugc.gamora.editorpro.soundeffect.ui.SoundEffectFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SoundEffectFragment extends TTResourcePanelFragment<CutViewModel> {
    public OSZ<Integer, Integer> LJLZ;
    public C141175gP LLFFF;
    public C73305Spp LLFZ;
    public View LLI;
    public SafeHandler LLIFFJFJJ;
    public C80700Vlo LLII;
    public ViewPager LLIIII;
    public TuxIconView LLIIIILZ;
    public View LLIIIJ;
    public final Map<Integer, View> LLIIIL = new LinkedHashMap();
    public int LJZ = 1;
    public final ArrayList<SoundEffectTabModel> LJZI = new ArrayList<>();
    public long LJZL = System.currentTimeMillis();
    public final C62822Ol8 LL = C221108m2.LIZIZ(C1290054m.LJLIL);
    public final C62822Ol8 LLD = C221108m2.LIZIZ(AnonymousClass510.LJLIL);
    public final C73318Sq2 LLF = new C73318Sq2();
    public final XU4 LLFF = MusicService.LJJLIIIJJI().LJI();
    public final C141015g9 LLFII = new InterfaceC141035gB() { // from class: X.5g9
        @Override // X.InterfaceC141035gB
        public final void LIZIZ(View view, OSZ<Integer, Integer> osz, C141225gU c141225gU) {
            o.LJIIIZ(view, "view");
            int intValue = osz.getFirst().intValue();
            SoundEffectFragment soundEffectFragment = SoundEffectFragment.this;
            if (intValue != soundEffectFragment.LJZ) {
                return;
            }
            C141205gS lm = soundEffectFragment.lm();
            String musicId = V1B.LJJLIIIJLLLLLLLZ(c141225gU.LJLIL);
            AqS91S0300000_2 aqS91S0300000_2 = new AqS91S0300000_2((OSZ) osz, (OSZ<Integer, Integer>) c141225gU, (C141225gU) SoundEffectFragment.this, (SoundEffectFragment) 11);
            lm.getClass();
            o.LJIIIZ(musicId, "musicId");
            if (!lm.LIZLLL.contains(musicId)) {
                lm.LIZLLL.add(musicId);
                aqS91S0300000_2.invoke();
            }
        }

        @Override // X.InterfaceC141035gB
        public final void LIZ(View view, OSZ<Integer, Integer> osz, EnumC141295gb clickType, C141225gU c141225gU) {
            boolean z;
            boolean z2;
            String str;
            int i;
            String str2;
            String str3;
            boolean booleanValue;
            boolean z3;
            String str4;
            String str5;
            String str6;
            SoundEffectFragment soundEffectFragment;
            EditorProContext Jl;
            String str7;
            String str8;
            o.LJIIIZ(view, "view");
            o.LJIIIZ(clickType, "clickType");
            if (c141225gU == null) {
                return;
            }
            SoundEffect soundEffect = c141225gU.LJLIL;
            int i2 = C141285ga.LIZ[clickType.ordinal()];
            String str9 = "favorite";
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        String LJIIJJI = C78934UyQ.LJLIL.getMusicService().LJIIJJI(C141315gd.LIZ(soundEffect));
                        if (C78685UuP.LJJJZ(LJIIJJI) && TEVideoUtils.nativeCheckAudioFile(LJIIJJI) == 0) {
                            o.LJIIIZ(LJIIJJI, "<set-?>");
                            soundEffect.fileLocalPath = LJIIJJI;
                            soundEffect.fileDuration = C78934UyQ.LJLIL.getMusicService().getMusicDuration(LJIIJJI);
                            C141175gP c141175gP = SoundEffectFragment.this.LLFFF;
                            if (c141175gP == null) {
                                return;
                            }
                            c141175gP.LJJIII(osz, EnumC141135gL.DOWNLOAD, 3);
                            return;
                        }
                        SoundEffectFragment.this.om(osz, soundEffect);
                        return;
                    }
                    InterfaceC1279450k interfaceC1279450k = (InterfaceC1279450k) SoundEffectFragment.this.LLD.getValue();
                    if (interfaceC1279450k != null) {
                        interfaceC1279450k.LIZJ(soundEffect, C78934UyQ.LJLIL.getMusicService().LJIIJJI(C141315gd.LIZ(soundEffect)));
                    }
                    C125944ww c125944ww = (C125944ww) ((InterfaceC1279450k) SoundEffectFragment.this.LLD.getValue());
                    if (c125944ww != null) {
                        c125944ww.LJ = SoundEffectFragment.this.LJZL;
                    }
                    SoundEffectFragment.this.Hl();
                    VideoPublishEditModel em = SoundEffectFragment.this.em();
                    if (em == null || (Jl = (soundEffectFragment = SoundEffectFragment.this).Jl()) == null) {
                        return;
                    }
                    NLETrack LJIJI = C32151Nz.LJIJI(Jl);
                    if (LJIJI != null) {
                        str7 = LJIJI.getExtra("slot_extra_music_id");
                    } else {
                        str7 = null;
                    }
                    String LJJLIIIJLLLLLLLZ = V1B.LJJLIIIJLLLLLLLZ(c141225gU.LJLIL);
                    SoundEffectTabModel soundEffectTabModel = (SoundEffectTabModel) ORZ.LJLLLLLL(osz.getFirst().intValue(), soundEffectFragment.LJZI);
                    if (soundEffectTabModel == null || (str8 = soundEffectTabModel.name) == null) {
                        str8 = "";
                    }
                    if (osz.getFirst().intValue() != 0) {
                        str9 = "other";
                    }
                    int intValue = osz.getSecond().intValue() + 1;
                    C145995oB LJFF = C5QW.LJFF(em, Jl);
                    if (str7 == null) {
                        str7 = "";
                    }
                    LJFF.LJI("music_id", str7);
                    if (LJJLIIIJLLLLLLLZ == null) {
                        LJJLIIIJLLLLLLLZ = "";
                    }
                    LJFF.LJI("sound_effect_id", LJJLIIIJLLLLLLLZ);
                    LJFF.LJI("sound_effect_source", str9);
                    LJFF.LJI("tab_name", str8);
                    LJFF.LIZ(intValue, "index");
                    LJFF.LIZ(1, "is_editor_pro");
                    FMX.LJIIL("select_sound_effect", LJFF.LIZ);
                    return;
                }
                SoundEffectFragment.this.lm().LJ = true;
                C141205gS lm = SoundEffectFragment.this.lm();
                String id = V1B.LJJLIIIJLLLLLLLZ(soundEffect);
                lm.getClass();
                o.LJIIIZ(id, "id");
                Boolean bool = lm.LIZJ.get(id);
                if (bool == null) {
                    booleanValue = false;
                } else {
                    booleanValue = bool.booleanValue();
                }
                final boolean z4 = !booleanValue;
                if (osz.getFirst().intValue() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String id2 = V1B.LJJLIIIJLLLLLLLZ(c141225gU.LJLIL);
                int intValue2 = osz.getSecond().intValue() + 1;
                SoundEffectTabModel soundEffectTabModel2 = (SoundEffectTabModel) ORZ.LJLLLLLL(osz.getFirst().intValue(), SoundEffectFragment.this.LJZI);
                if (soundEffectTabModel2 == null || (str4 = soundEffectTabModel2.name) == null) {
                    str4 = "";
                }
                VideoPublishEditModel em2 = SoundEffectFragment.this.em();
                EditorProContext Jl2 = SoundEffectFragment.this.Jl();
                o.LJIIIZ(id2, "id");
                if (em2 != null && Jl2 != null) {
                    C145995oB LJFF2 = C5QW.LJFF(em2, Jl2);
                    LJFF2.LJI("tab_name", str4);
                    LJFF2.LIZ(intValue2, "index");
                    NLETrack LJIJI2 = C32151Nz.LJIJI(Jl2);
                    if (LJIJI2 == null || (str5 = LJIJI2.getExtra("slot_extra_music_id")) == null) {
                        str5 = "";
                    }
                    LJFF2.LJI("music_id", str5);
                    if (!z3) {
                        str9 = "other";
                    }
                    LJFF2.LJI("sound_effect_source", str9);
                    LJFF2.LJI("sound_effect_id", id2);
                    LJFF2.LIZ(1, "is_editor_pro");
                    if (z4) {
                        str6 = "favorite_sound_effect";
                    } else {
                        str6 = "cancel_favorite_sound_effect";
                    }
                    FMX.LJIIL(str6, LJFF2.LIZ);
                }
                final String soundId = V1B.LJJLIIIJLLLLLLLZ(soundEffect);
                final boolean z5 = !z4;
                o.LJIIIZ(soundId, "soundId");
                C73454SsE LJJJ = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5gC
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<BaseNetResponse> interfaceC73573Su9) {
                        try {
                            BaseNetResponse LIZ = C141275gZ.LIZ(soundId, z5);
                            if (LIZ.status_code != 0) {
                                interfaceC73573Su9.tryOnError(new IllegalStateException("result list is null"));
                            } else {
                                interfaceC73573Su9.onNext(LIZ);
                            }
                        } catch (Exception e) {
                            interfaceC73573Su9.tryOnError(e);
                        }
                    }
                }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
                final SoundEffectFragment soundEffectFragment2 = SoundEffectFragment.this;
                InterfaceC92693kP LJJJLIIL = LJJJ.LJJJLIIL(new InterfaceC64592gB() { // from class: X.5gA
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        if (z4) {
                            soundEffectFragment2.nm(R.string.fnq);
                        } else {
                            soundEffectFragment2.nm(R.string.fns);
                        }
                    }
                }, new AfS54S0100000_2(soundEffectFragment2, 20));
                C141205gS lm2 = SoundEffectFragment.this.lm();
                String id3 = V1B.LJJLIIIJLLLLLLLZ(soundEffect);
                lm2.getClass();
                o.LJIIIZ(id3, "id");
                lm2.LIZJ.put(id3, Boolean.valueOf(z4));
                C141175gP c141175gP2 = SoundEffectFragment.this.LLFFF;
                if (c141175gP2 != null) {
                    c141175gP2.LJJIII(osz, EnumC141135gL.COLLECT, z4 ? 1 : 0);
                }
                SoundEffectFragment.this.LLF.LIZ(LJJJLIIL);
                return;
            }
            OSZ<Integer, Integer> osz2 = SoundEffectFragment.this.LJLZ;
            if (o.LJ(osz2, osz) && SoundEffectFragment.this.LLFF.isPlaying()) {
                z = true;
            } else {
                z = false;
            }
            if (osz.getFirst().intValue() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String id4 = V1B.LJJLIIIJLLLLLLLZ(c141225gU.LJLIL);
            int intValue3 = osz.getSecond().intValue() + 1;
            SoundEffectTabModel soundEffectTabModel3 = (SoundEffectTabModel) ORZ.LJLLLLLL(osz.getFirst().intValue(), SoundEffectFragment.this.LJZI);
            if (soundEffectTabModel3 == null || (str = soundEffectTabModel3.name) == null) {
                str = "";
            }
            VideoPublishEditModel em3 = SoundEffectFragment.this.em();
            EditorProContext Jl3 = SoundEffectFragment.this.Jl();
            o.LJIIIZ(id4, "id");
            if (em3 != null && Jl3 != null) {
                C145995oB LJFF3 = C5QW.LJFF(em3, Jl3);
                LJFF3.LJI("tab_name", str);
                LJFF3.LIZ(intValue3, "index");
                NLETrack LJIJI3 = C32151Nz.LJIJI(Jl3);
                if (LJIJI3 == null || (str2 = LJIJI3.getExtra("slot_extra_music_id")) == null) {
                    str2 = "";
                }
                LJFF3.LJI("music_id", str2);
                if (!z2) {
                    str9 = "other";
                }
                LJFF3.LJI("sound_effect_source", str9);
                LJFF3.LJI("sound_effect_id", id4);
                LJFF3.LIZ(1, "is_editor_pro");
                if (z) {
                    str3 = "play";
                } else {
                    str3 = "pause";
                }
                LJFF3.LJI("to_status", str3);
                FMX.LJIIL("sound_effect_click", LJFF3.LIZ);
            }
            if (o.LJ(osz2, osz)) {
                if (SoundEffectFragment.this.LLFF.isPlaying()) {
                    SoundEffectFragment.this.LLFF.pause();
                    C141175gP c141175gP3 = SoundEffectFragment.this.LLFFF;
                    if (c141175gP3 == null) {
                        return;
                    }
                    c141175gP3.LJJIII(osz, EnumC141135gL.PREVIEW, 1);
                    return;
                }
                SoundEffectFragment.this.pm(osz, soundEffect);
                return;
            }
            SoundEffectFragment.this.LLFF.pause();
            if (osz2 != null) {
                SoundEffectFragment soundEffectFragment3 = SoundEffectFragment.this;
                C141175gP c141175gP4 = soundEffectFragment3.LLFFF;
                if (c141175gP4 != null) {
                    i = 1;
                    c141175gP4.LJJIII(osz2, EnumC141135gL.PREVIEW, 1);
                } else {
                    i = 1;
                }
                C141175gP c141175gP5 = soundEffectFragment3.LLFFF;
                if (c141175gP5 != null) {
                    c141175gP5.LJJIII(osz2, EnumC141135gL.SELECT, i);
                }
            }
            SoundEffectFragment soundEffectFragment4 = SoundEffectFragment.this;
            soundEffectFragment4.LJLZ = osz;
            C141175gP c141175gP6 = soundEffectFragment4.LLFFF;
            if (c141175gP6 != null) {
                c141175gP6.LJJIII(osz, EnumC141135gL.SELECT, 0);
            }
            SoundEffectFragment.this.pm(osz, soundEffect);
        }
    };

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "sound_effect_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIL).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIL;
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
        return R.layout.asv;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Hl() {
        this.LLFF.pause();
        super.Hl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    public final C141205gS lm() {
        return (C141205gS) this.LL.getValue();
    }

    public final void mm() {
        View view = this.LLI;
        if (view != null) {
            view.setVisibility(4);
        }
        C73305Spp c73305Spp = this.LLFZ;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LLFZ;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
        final boolean LIZ = CommerceMediaServiceImpl.LIZJ().LIZ();
        final C141205gS soundEffectTabModel = lm();
        o.LJIIIZ(soundEffectTabModel, "soundEffectTabModel");
        this.LLF.LIZ(AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.5gJ
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<List<SoundEffectTabModel>> interfaceC73573Su9) {
                List<SoundEffectTabModel> list;
                int i;
                int i2;
                String str;
                try {
                    C141205gS c141205gS = C141205gS.this;
                    if (c141205gS.LIZ.isEmpty() || (list = c141205gS.LIZ) == null) {
                        SoundEffectTabApiResponse LIZ2 = C141255gX.LIZ(LIZ);
                        ArrayList<SoundEffectTabModel> arrayList = LIZ2.list;
                        if (arrayList == null || arrayList.isEmpty()) {
                            interfaceC73573Su9.tryOnError(new IllegalStateException("result list is null"));
                            if (LIZ) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            C141355gh.LIZJ(i, LIZ2.status_code, false);
                            return;
                        }
                        ArrayList<SoundEffectTabModel> arrayList2 = LIZ2.list;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<SoundEffectTabModel> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            SoundEffectTabModel next = it.next();
                            SoundEffectTabModel soundEffectTabModel2 = next;
                            String str2 = soundEffectTabModel2.id;
                            if (str2 != null && str2.length() != 0 && (str = soundEffectTabModel2.name) != null && str.length() != 0) {
                                arrayList3.add(next);
                            }
                        }
                        C141205gS c141205gS2 = C141205gS.this;
                        c141205gS2.getClass();
                        c141205gS2.LIZ.clear();
                        c141205gS2.LIZ.addAll(arrayList3);
                        if (LIZ) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        C141355gh.LIZJ(i2, 0, true);
                        interfaceC73573Su9.onNext(arrayList3);
                        return;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.addAll(list);
                    interfaceC73573Su9.onNext(arrayList4);
                } catch (Exception e) {
                    interfaceC73573Su9.tryOnError(e);
                    C141355gh.LIZJ(!LIZ ? 1 : 0, -9999, false);
                }
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS54S0100000_2(this, 18), new AfS54S0100000_2(this, 19)));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLFF.release();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C141175gP c141175gP = this.LLFFF;
        if (c141175gP != null) {
            int size = c141175gP.LJLJJL.size();
            for (int i = 0; i < size; i++) {
                c141175gP.LJLJJL.valueAt(i).LJI.dispose();
            }
        }
        this.LLF.dispose();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLFF.pause();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLFF.resume();
    }

    public final void nm(int i) {
        ActivityC45651qj mo49getActivity;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (mo49getActivity = mo49getActivity()) != null && !mo49getActivity.isFinishing()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            String string = getString(i);
            o.LJIIIIZZ(string, "getString(string)");
            creativeToastBuilder.message(string);
            C78915Uy7.LJJIIZI(mo49getActivity2, 1048, creativeToastBuilder);
        }
    }

    public final void om(final OSZ<Integer, Integer> osz, final SoundEffect soundEffect) {
        o.LJIIIZ(soundEffect, "soundEffect");
        HNW LJJIJ = C60903NvH.LJIIJJI().LJJIJ();
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        LJJIJ.LJIILL(application, C141315gd.LIZ(soundEffect), 0, false, new InterfaceC84897XTp() { // from class: X.5gD
            @Override // X.InterfaceC84897XTp
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC84897XTp
            public final void onStart() {
                C141175gP c141175gP = SoundEffectFragment.this.LLFFF;
                if (c141175gP != null) {
                    c141175gP.LJJIII(osz, EnumC141135gL.DOWNLOAD, 2);
                }
            }

            @Override // X.InterfaceC84897XTp
            public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
                o.LJIIIZ(musicFile, "musicFile");
                C141355gh.LIZ(V1B.LJJLIIIJLLLLLLLZ(soundEffect), 0, true, "");
                SoundEffect soundEffect2 = soundEffect;
                soundEffect2.getClass();
                soundEffect2.fileLocalPath = musicFile;
                soundEffect.fileDuration = C78934UyQ.LJLIL.getMusicService().getMusicDuration(musicFile);
                C141175gP c141175gP = SoundEffectFragment.this.LLFFF;
                if (c141175gP != null) {
                    c141175gP.LJJIII(osz, EnumC141135gL.DOWNLOAD, 3);
                }
            }

            @Override // X.InterfaceC84897XTp
            public final void LIZIZ(Integer num, String str) {
                C141355gh.LIZ(V1B.LJJLIIIJLLLLLLLZ(soundEffect), num, false, str);
                C141175gP c141175gP = SoundEffectFragment.this.LLFFF;
                if (c141175gP != null) {
                    c141175gP.LJJIII(osz, EnumC141135gL.DOWNLOAD, 4);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC127784zu player;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (!C1280450u.LIZ()) {
            return;
        }
        this.LJZL = System.currentTimeMillis();
        MJ();
        Nl();
        int fm = fm();
        View findViewById = view.findViewById(R.id.kzb);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tablayout)");
        this.LLII = (C80700Vlo) findViewById;
        View findViewById2 = view.findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.viewpager)");
        this.LLIIII = (ViewPager) findViewById2;
        View findViewById3 = view.findViewById(R.id.avl);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.btn_close)");
        this.LLIIIILZ = (TuxIconView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ne5);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.v…ume_panel_layout_content)");
        this.LLIIIJ = findViewById4;
        ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = fm;
            View view2 = this.LLIIIJ;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            } else {
                o.LJIJI("contentView");
                throw null;
            }
        }
        View findViewById5 = view.findViewById(R.id.ne4);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.volume_panel_layout)");
        ViewGroup.LayoutParams layoutParams2 = findViewById5.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = C170576mj.LIZIZ(findViewById5.getContext());
            layoutParams2.width = -1;
            findViewById5.setLayoutParams(layoutParams2);
        }
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 73), findViewById5);
        View view3 = this.LJLLL;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
        if (!e1.LIZ(31744, "studio_editor_pro_add_sound_effect_close_button", true, false)) {
            TuxIconView tuxIconView = this.LLIIIILZ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            } else {
                o.LJIJI("closeButton");
                throw null;
            }
        } else {
            TuxIconView tuxIconView2 = this.LLIIIILZ;
            if (tuxIconView2 != null) {
                C16880lQ.LJJJ(tuxIconView2, new ACListenerS22S0100000_2(this, 74));
            } else {
                o.LJIJI("closeButton");
                throw null;
            }
        }
        this.LLIFFJFJJ = new SafeHandler(requireActivity());
        this.LLFZ = (C73305Spp) view.findViewById(R.id.cqr);
        this.LLI = view.findViewById(R.id.izz);
        H7R.LJIIIZ(em());
        mm();
        EditorProContext Jl = Jl();
        if (Jl != null && (player = Jl.getPlayer()) != null) {
            player.pause();
        }
    }

    public final void pm(final OSZ<Integer, Integer> osz, SoundEffect model) {
        boolean z;
        o.LJIIIZ(model, "model");
        this.LLFF.LIZIZ(new InterfaceC47330Ihq() { // from class: X.5gE
            @Override // X.InterfaceC47330Ihq
            public final void LIZ(int i, int i2) {
                C141175gP c141175gP = SoundEffectFragment.this.LLFFF;
                if (c141175gP != null) {
                    c141175gP.LJJIII(osz, EnumC141135gL.PREVIEW, 3);
                }
            }
        });
        this.LLFF.LIZJ(new InterfaceC47328Iho() { // from class: X.5gF
            @Override // X.InterfaceC47328Iho
            public final void LIZIZ() {
                C141175gP c141175gP = SoundEffectFragment.this.LLFFF;
                if (c141175gP != null) {
                    c141175gP.LJJIII(osz, EnumC141135gL.PREVIEW, 1);
                }
            }
        });
        String LJIIJJI = C78934UyQ.LJLIL.getMusicService().LJIIJJI(C141315gd.LIZ(model));
        if (C78685UuP.LJJJZ(LJIIJJI) && TEVideoUtils.nativeCheckAudioFile(LJIIJJI) == 0) {
            z = true;
        } else {
            z = false;
        }
        C47325Ihl c47325Ihl = new C47325Ihl();
        c47325Ihl.LJFF = V1B.LJJLIIIJLLLLLLLZ(model);
        c47325Ihl.LIZLLL = model.duration;
        List<String> list = null;
        if (z) {
            H7C.LJI(3, "SoundEffect", null, "sound effect Preview: local file exist");
            c47325Ihl.LIZ = LJIIJJI;
        } else {
            UrlModel urlModel = model.playUrl;
            if (urlModel != null) {
                list = urlModel.getUrlList();
            }
            c47325Ihl.LIZIZ = list;
        }
        c47325Ihl.LJI = false;
        this.LLFF.LIZLLL(c47325Ihl);
        if (z) {
            o.LJIIIZ(LJIIJJI, "<set-?>");
            model.fileLocalPath = LJIIJJI;
            model.fileDuration = C78934UyQ.LJLIL.getMusicService().getMusicDuration(LJIIJJI);
            C141175gP c141175gP = this.LLFFF;
            if (c141175gP != null) {
                c141175gP.LJJIII(osz, EnumC141135gL.DOWNLOAD, 3);
                return;
            }
            return;
        }
        om(osz, model);
    }
}
