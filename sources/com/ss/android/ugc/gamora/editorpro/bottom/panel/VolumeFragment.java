package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.C120984ow;
import X.C120994ox;
import X.C124574uj;
import X.C124604um;
import X.C124864vC;
import X.C124894vF;
import X.C124954vL;
import X.C125654wT;
import X.C127044yi;
import X.C1280450u;
import X.C139795eB;
import X.C141335gf;
import X.C145995oB;
import X.C221108m2;
import X.C2ZY;
import X.C47261Igj;
import X.C5G0;
import X.C5QW;
import X.C62822Ol8;
import X.C78880UxY;
import X.C78920UyC;
import X.C79057V0z;
import X.EnumC123864ta;
import X.EnumC123874tb;
import X.EnumC126814yL;
import X.FMX;
import X.InterfaceC1279450k;
import X.ORS;
import X.X1D;
import Y.AObserverS70S0100000_2;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VolumeFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VolumeFragment extends TTResourcePanelFragment<CutViewModel> {
    public static final /* synthetic */ int LLFZ = 0;
    public boolean LL;
    public boolean LLD;
    public float LLF;
    public long LLFF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public String LJLZ = "";
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(C127044yi.LJLIL);
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 582));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 583));
    public long LLFFF = System.currentTimeMillis();

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "volume_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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
        return R.layout.at7;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final boolean Ll() {
        return ((Boolean) this.LJZL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final boolean Rl() {
        NLETrack mainTrack;
        NLETrackSlot LJIILIIL;
        NLESegment LJI;
        NLETrack LIZIZ;
        NLESegmentAudio nLESegmentAudio;
        String str = this.LJLZ;
        int hashCode = str.hashCode();
        if (hashCode != -1477447462) {
            if (hashCode != 112202875) {
                if (hashCode == 1182494401 && str.equals("sound_effect")) {
                    float currentVolumeIntensity = ((CutViewModel) Ml()).getCurrentVolumeIntensity();
                    InterfaceC1279450k interfaceC1279450k = (InterfaceC1279450k) this.LJZ.getValue();
                    if (interfaceC1279450k != null) {
                        interfaceC1279450k.LJ(currentVolumeIntensity);
                    }
                    this.LL = true;
                    this.LLD = true;
                    return true;
                }
            } else if (str.equals("video")) {
                NLETrack selectedTrack = Jl().getSelectedTrack();
                if (selectedTrack == null) {
                    return false;
                }
                NLETrackSlot selectedTrackSlot = Jl().getSelectedTrackSlot();
                if (selectedTrackSlot == null || !C124574uj.LJJIJIIJI(selectedTrackSlot)) {
                    if (System.currentTimeMillis() - this.LLFF >= 500) {
                        ActivityC45651qj mo49getActivity = mo49getActivity();
                        if (mo49getActivity != null) {
                            C78920UyC.LIZLLL(R.string.fpm, mo49getActivity, 3026);
                        }
                        this.LLFF = System.currentTimeMillis();
                    }
                    return false;
                }
                float currentVolumeIntensity2 = ((CutViewModel) Ml()).getCurrentVolumeIntensity();
                if (!Boolean.parseBoolean(selectedTrack.getExtra("is_maintrack_mute")) && currentVolumeIntensity2 == 0.0f) {
                    selectedTrack.setExtra("is_maintrack_mute", "true");
                }
                NLEModel LJJI = C79057V0z.LJJI(Jl());
                NLETrack mainTrack2 = LJJI.getMainTrack();
                if (mainTrack2 != null) {
                    Iterator<NLETrackSlot> it = mainTrack2.LJIILL().iterator();
                    while (it.hasNext()) {
                        NLETrackSlot it2 = it.next();
                        o.LJIIIIZZ(it2, "it");
                        if (C124574uj.LJJIJIIJI(it2) && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, it2.LJI())) != null) {
                            nLESegmentAudio.LJIL(currentVolumeIntensity2);
                        }
                    }
                }
                if (C124864vC.LIZJ && (LIZIZ = C141335gf.LIZIZ(LJJI)) != null) {
                    Iterator<NLETrackSlot> it3 = LIZIZ.LJIILL().iterator();
                    int i = 0;
                    while (it3.hasNext()) {
                        NLETrackSlot next = it3.next();
                        int i2 = i + 1;
                        if (i >= 0) {
                            NLETrackSlot slot = next;
                            o.LJIIIIZZ(slot, "slot");
                            NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, slot.LJI());
                            if (nLESegmentAudio2 != null) {
                                nLESegmentAudio2.LJIL(currentVolumeIntensity2);
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                C120984ow c120984ow = C124864vC.LJFF;
                C141335gf.LIZIZ(LJJI);
                c120984ow.getClass();
                NLETrack LIZ = C120994ox.LIZ(LJJI);
                if (LIZ != null && (mainTrack = LJJI.getMainTrack()) != null) {
                    Iterator<NLETrackSlot> it4 = mainTrack.LJIILL().iterator();
                    while (it4.hasNext()) {
                        NLETrackSlot it5 = it4.next();
                        o.LJIIIIZZ(it5, "it");
                        NLETrackSlot LIZ2 = C120984ow.LIZ(it5, LIZ);
                        if (LIZ2 != null) {
                            int LIZ3 = C124864vC.LIZ(LJJI, it5);
                            NLETrack LIZIZ2 = C141335gf.LIZIZ(LJJI);
                            if (LIZIZ2 != null && (LJIILIIL = LIZIZ2.LJIILIIL(LIZ3)) != null && (LJI = LJIILIIL.LJI()) != null) {
                                C124574uj.LJJLIIIJJI(LJI, 0.0f);
                            }
                            NLESegment LJI2 = LIZ2.LJI();
                            o.LJIIIIZZ(LJI2, "vcSlot.mainSegment");
                            C124574uj.LJJLIIIJJI(LJI2, currentVolumeIntensity2);
                        }
                    }
                }
                EditorProContext Jl = Jl();
                C79057V0z.LJIIL(Jl);
                VideoPublishEditModel em = em();
                if (em != null) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    String volume = b0.LIZJ(LIZ4, (int) (currentVolumeIntensity2 * 100), '%', LIZ4);
                    o.LJIIIZ(volume, "volume");
                    C145995oB LJFF = C5QW.LJFF(em, Jl);
                    LJFF.LJI("track_type", C5QW.LJIIJ(Jl));
                    LJFF.LJI("volume", volume);
                    FMX.LJIIL("click_volume_apply_to_all", LJFF.LIZ);
                }
                this.LL = true;
                this.LLD = true;
                return true;
            }
        } else if (str.equals("audio_record")) {
            float currentVolumeIntensity3 = ((CutViewModel) Ml()).getCurrentVolumeIntensity();
            C125654wT c125654wT = (C125654wT) this.LJZI.getValue();
            c125654wT.getClass();
            List LIZIZ3 = C124604um.LIZIZ(C79057V0z.LJJI(c125654wT.LIZ));
            ArrayList arrayList = new ArrayList();
            Iterator it6 = ((ArrayList) LIZIZ3).iterator();
            while (it6.hasNext()) {
                ORS.LJJLIIIJILLIZJL(((NLETrack) it6.next()).LJIILL(), arrayList);
            }
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                NLETrackSlot it8 = (NLETrackSlot) it7.next();
                o.LJIIIIZZ(it8, "it");
                NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, it8.LJI());
                if (nLESegmentAudio3 != null) {
                    nLESegmentAudio3.LJIL(currentVolumeIntensity3);
                }
            }
            C79057V0z.LJIIL(c125654wT.LIZ);
            this.LL = true;
            this.LLD = true;
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final boolean Zl() {
        if (o.LJ(this.LJLZ, "sound_effect")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        C139795eB c139795eB;
        float currentVolumeIntensity = ((CutViewModel) Ml()).getCurrentVolumeIntensity();
        if (this.LL) {
            c139795eB = new C139795eB(EnumC126814yL.APPLY_TO_ALL.getNameId(), null, null, null, null, 30);
        } else {
            float f = 100;
            c139795eB = new C139795eB(EnumC126814yL.CHANGE_VOLUME.getNameId(), String.valueOf(this.LLF * f), String.valueOf(currentVolumeIntensity * f), null, null, 24);
        }
        return C78880UxY.LJLILLLLZI(c139795eB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        EnumC123874tb enumC123874tb;
        NLETrackSlot selectedTrackSlot;
        NLESegment LJI;
        NLETrackSlot selectedTrackSlot2;
        NLESegment LJI2;
        EnumC123864ta enumC123864ta;
        String str;
        String str2;
        float currentVolumeIntensity = ((CutViewModel) Ml()).getCurrentVolumeIntensity();
        VideoPublishEditModel em = em();
        EnumC123874tb enumC123874tb2 = null;
        if (em != null) {
            NLETrack selectedTrack = Jl().getSelectedTrack();
            if (selectedTrack != null) {
                enumC123864ta = C79057V0z.LJJIJIL(selectedTrack);
            } else {
                enumC123864ta = null;
            }
            if (enumC123864ta == EnumC123864ta.AUDIO) {
                NLETrackSlot selectedTrackSlot3 = Jl().getSelectedTrackSlot();
                if (selectedTrackSlot3 != null) {
                    str2 = selectedTrackSlot3.getExtra("slot_extra_music_id");
                } else {
                    str2 = null;
                }
                EditorProContext Jl = Jl();
                StringBuilder LIZ = X1D.LIZ();
                String volume = b0.LIZJ(LIZ, (int) (100 * currentVolumeIntensity), '%', LIZ);
                o.LJIIIZ(volume, "volume");
                if (Jl != null) {
                    C145995oB LJFF = C5QW.LJFF(em, Jl);
                    LJFF.LJI("volume", volume);
                    if (str2 == null) {
                        str2 = "";
                    }
                    LJFF.LJI("sound_effect_id", str2);
                    LJFF.LJI("sound_type", "sound_effect");
                    FMX.LJIIL("save_sound_volume", LJFF.LIZ);
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                String volume2 = b0.LIZJ(LIZ2, (int) (100 * currentVolumeIntensity), '%', LIZ2);
                boolean z = this.LLD;
                EditorProContext Jl2 = Jl();
                o.LJIIIZ(volume2, "volume");
                if (Jl2 != null) {
                    C145995oB LJFF2 = C5QW.LJFF(em, Jl2);
                    LJFF2.LJI("track_type", C5QW.LJIIJ(Jl2));
                    LJFF2.LJI("volume", volume2);
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    LJFF2.LJI("apply_status", str);
                    FMX.LJIIL("save_cut_volume", LJFF2.LIZ);
                }
            }
        }
        NLETrackSlot selectedTrackSlot4 = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot4 != null && (LJI2 = selectedTrackSlot4.LJI()) != null) {
            enumC123874tb = LJI2.LIZJ();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb == EnumC123874tb.AUDIO) {
            if (currentVolumeIntensity != this.LLF && (selectedTrackSlot2 = Jl().getSelectedTrackSlot()) != null) {
                selectedTrackSlot2.setExtra("is_editorpro_adjust_music_volume", "1");
            }
            NLETrackSlot selectedTrackSlot5 = Jl().getSelectedTrackSlot();
            if (selectedTrackSlot5 != null) {
                selectedTrackSlot5.setExtra("adjust_music_volume_duration", String.valueOf((System.currentTimeMillis() - this.LLFFF) + C5QW.LJIIIZ(selectedTrackSlot5, "adjust_music_volume_duration")));
            }
        }
        NLETrackSlot selectedTrackSlot6 = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot6 != null && (LJI = selectedTrackSlot6.LJI()) != null) {
            enumC123874tb2 = LJI.LIZJ();
        }
        if (enumC123874tb2 == EnumC123874tb.VIDEO) {
            if (currentVolumeIntensity != this.LLF && (selectedTrackSlot = Jl().getSelectedTrackSlot()) != null) {
                selectedTrackSlot.setExtra("is_editorpro_adjust_video_volume", "1");
            }
            NLETrackSlot selectedTrackSlot7 = Jl().getSelectedTrackSlot();
            if (selectedTrackSlot7 != null) {
                selectedTrackSlot7.setExtra("adjust_video_volume_duration", String.valueOf((System.currentTimeMillis() - this.LLFFF) + C5QW.LJIIIZ(selectedTrackSlot7, "adjust_video_volume_duration")));
            }
        }
        super.V3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
        ((ProgressBar) _$_findCachedViewById(R.id.jka)).setProgress((int) (((CutViewModel) Ml()).getCurrentVolumeIntensity() * 100));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Tl() {
        super.Tl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            this.LLFFF = System.currentTimeMillis();
            Bundle arguments = getArguments();
            if (arguments == null || (str = arguments.getString("volume_type")) == null) {
                str = "video";
            }
            this.LJLZ = str;
            if (mo49getActivity() != null) {
                String string = getString(R.string.fmt);
                o.LJIIIIZZ(string, "getString(R.string.editor_pro_menu_edit_volume)");
                Yl(string);
                float currentVolumeIntensity = ((CutViewModel) Ml()).getCurrentVolumeIntensity();
                MutableLiveData<C2ZY> volumeUpdate = ((CutViewModel) Ml()).getVolumeUpdate();
                if (volumeUpdate != null) {
                    volumeUpdate.setValue(new C2ZY(Float.valueOf(currentVolumeIntensity)));
                }
                ((ProgressBar) _$_findCachedViewById(R.id.jka)).setProgress((int) (currentVolumeIntensity * 100));
                ((SeekBar) _$_findCachedViewById(R.id.jka)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: X.4yj
                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public final void onStartTrackingTouch(SeekBar seekBar) {
                        o.LJIIIZ(seekBar, "seekBar");
                        ((C135055Rt) seekBar).LIZIZ();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public final void onStopTrackingTouch(SeekBar seekBar) {
                        EnumC123864ta enumC123864ta;
                        o.LJIIIZ(seekBar, "seekBar");
                        ((C135055Rt) seekBar).LIZIZ();
                        VolumeFragment volumeFragment = VolumeFragment.this;
                        volumeFragment.LL = false;
                        float f = 100;
                        float progress = r11.getProgress() / f;
                        ((CutViewModel) volumeFragment.Ml()).changeVolume(progress, EnumC124724uy.COMMIT);
                        volumeFragment.Jl().getPlayer().I9();
                        VideoPublishEditModel em = volumeFragment.em();
                        if (em != null) {
                            NLETrack selectedTrack = volumeFragment.Jl().getSelectedTrack();
                            String str2 = null;
                            if (selectedTrack != null) {
                                enumC123864ta = C79057V0z.LJJIJIL(selectedTrack);
                            } else {
                                enumC123864ta = null;
                            }
                            String str3 = "";
                            if (enumC123864ta == EnumC123864ta.AUDIO) {
                                NLETrackSlot selectedTrackSlot = volumeFragment.Jl().getSelectedTrackSlot();
                                if (selectedTrackSlot != null) {
                                    str2 = selectedTrackSlot.getExtra("slot_extra_music_id");
                                }
                                EditorProContext Jl = volumeFragment.Jl();
                                StringBuilder LIZ = X1D.LIZ();
                                String volume = b0.LIZJ(LIZ, (int) (progress * f), '%', LIZ);
                                o.LJIIIZ(volume, "volume");
                                if (Jl != null) {
                                    C145995oB LJFF = C5QW.LJFF(em, Jl);
                                    LJFF.LJI("volume", volume);
                                    if (str2 != null) {
                                        str3 = str2;
                                    }
                                    LJFF.LJI("sound_effect_id", str3);
                                    LJFF.LJI("sound_type", "sound_effect");
                                    FMX.LJIIL("click_sound_volume_change", LJFF.LIZ);
                                    return;
                                }
                                return;
                            }
                            StringBuilder LIZ2 = X1D.LIZ();
                            String volume2 = b0.LIZJ(LIZ2, (int) (progress * f), '%', LIZ2);
                            EditorProContext Jl2 = volumeFragment.Jl();
                            o.LJIIIZ(volume2, "volume");
                            if (Jl2 == null) {
                                return;
                            }
                            C145995oB LJFF2 = C5QW.LJFF(em, Jl2);
                            LJFF2.LJI("track_type", C5QW.LJIIJ(Jl2));
                            LJFF2.LJI("volume", volume2);
                            LJFF2.LJI("music_id", "");
                            FMX.LJIIL("click_cut_volume_change", LJFF2.LIZ);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.widget.SeekBar.OnSeekBarChangeListener
                    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        o.LJIIIZ(seekBar, "seekBar");
                        if (z) {
                            if (i == 100) {
                                AnonymousClass632.LIZIZ(VolumeFragment.this.mo49getActivity());
                            }
                            ((CutViewModel) VolumeFragment.this.Ml()).changeVolume(i / 100, EnumC124724uy.COMMIT);
                        }
                    }
                });
            }
            this.LLF = ((CutViewModel) Ml()).getCurrentVolumeIntensity();
            MutableLiveData<C124894vF> slotSelectChangedEvent = ((CutViewModel) Ml()).getSlotSelectChangedEvent();
            if (slotSelectChangedEvent != null) {
                slotSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 162));
            }
            MutableLiveData<C124954vL> trackSelectChangedEvent = ((CutViewModel) Ml()).getTrackSelectChangedEvent();
            if (trackSelectChangedEvent != null) {
                trackSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 163));
            }
            if (o.LJ(this.LJLZ, "music")) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.a6v);
                if (_$_findCachedViewById == null) {
                    return;
                }
                _$_findCachedViewById.setVisibility(4);
                return;
            }
            View volumePanel = _$_findCachedViewById(R.id.ne6);
            if (C124574uj.LJJJJL(Jl())) {
                Nl();
                o.LJIIIIZZ(volumePanel, "volumePanel");
                DTResourcePanelFragment.Dl(volumePanel, 45.0f);
                DTResourcePanelFragment.Al(volumePanel, 25.0f);
                return;
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.a6v);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            o.LJIIIIZZ(volumePanel, "volumePanel");
            DTResourcePanelFragment.Dl(volumePanel, 17.5f);
            DTResourcePanelFragment.Al(volumePanel, 17.5f);
        }
    }
}
