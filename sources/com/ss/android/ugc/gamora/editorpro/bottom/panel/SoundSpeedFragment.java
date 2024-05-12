package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.C124574uj;
import X.C127184yw;
import X.C1280450u;
import X.C130995Cd;
import X.C139795eB;
import X.C145995oB;
import X.C16880lQ;
import X.C221108m2;
import X.C47261Igj;
import X.C5BA;
import X.C5G0;
import X.C5QW;
import X.C60632Zn;
import X.C62822Ol8;
import X.C78880UxY;
import X.C78920UyC;
import X.C79057V0z;
import X.C8HI;
import X.EnumC126814yL;
import X.EnumC127484zQ;
import X.FMX;
import X.InterfaceC131005Ce;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SoundSpeedFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SoundSpeedFragment extends TTResourcePanelFragment<CutViewModel> {
    public long LL;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public boolean LJLZ = true;
    public boolean LJZ = true;
    public float LJZI = 1.0f;
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 575));
    public final long LLD = ((Number) C5BA.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
    public final C62822Ol8 LLF = C221108m2.LIZIZ(C127184yw.LJLIL);

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "sound_speed_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFF;
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
        return R.layout.asy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        String nameId = EnumC126814yL.CHANGE_SOUND_SPEED.getNameId();
        String valueOf = String.valueOf(this.LJZI);
        Float value = ((CutViewModel) Ml()).getSpeed().getValue();
        if (value == null) {
            value = Float.valueOf(1.0f);
        }
        return C78880UxY.LJLILLLLZI(new C139795eB(nameId, valueOf, String.valueOf(value.floatValue()), null, null, 24));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final boolean Ll() {
        return ((Boolean) this.LJZL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        NLETrackSlot selectedTrackSlot;
        float f = this.LJZI;
        Float value = ((CutViewModel) Ml()).getSpeed().getValue();
        Float valueOf = Float.valueOf(1.0f);
        if (value == null) {
            value = valueOf;
        }
        if (f != value.floatValue() && (selectedTrackSlot = Jl().getSelectedTrackSlot()) != null && C124574uj.LJJIJL(selectedTrackSlot)) {
            selectedTrackSlot.setExtra("is_editorpro_adjust_sound_speed", "1");
        }
        VideoPublishEditModel em = em();
        if (em != null) {
            EditorProContext Jl = Jl();
            Float value2 = ((CutViewModel) Ml()).getSpeed().getValue();
            if (value2 != null) {
                valueOf = value2;
            }
            o.LJIIIIZZ(valueOf, "viewModel.speed.value ?: 1.0F");
            float floatValue = valueOf.floatValue();
            if (Jl != null) {
                C145995oB LJFF = C5QW.LJFF(em, Jl);
                LJFF.LIZ(1, "is_editor_pro");
                LJFF.LIZJ(Float.valueOf(floatValue), "speed_value");
                FMX.LJIIL("save_sound_speed", LJFF.LIZ);
            }
        }
        super.V3();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        EditorProContext Jl;
        VideoPublishEditModel em = em();
        if (em != null && (Jl = Jl()) != null) {
            C145995oB LJFF = C5QW.LJFF(em, Jl);
            LJFF.LIZ(1, "is_editor_pro");
            FMX.LJIIL("cancel_sound_speed", LJFF.LIZ);
        }
        super.Sl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
        ((CutViewModel) Ml()).checkAbsSpeedAndTone();
    }

    public final void lm(int i) {
        if (System.currentTimeMillis() - this.LL < 500) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C78920UyC.LIZLLL(i, mo49getActivity, 3018);
        }
        this.LL = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            Typeface LIZLLL = C8HI.LIZJ().LIZLLL("regular");
            if (LIZLLL != null) {
                ((TextView) ((View) this.LJLLILLLL.getValue()).findViewById(R.id.m2v)).setTypeface(LIZLLL);
                ((C130995Cd) _$_findCachedViewById(R.id.b99)).setTextTypeface(LIZLLL);
            }
            if (((Boolean) C79057V0z.LJJIII(Jl(), "status_music_sync_on", Boolean.FALSE)).booleanValue()) {
                lm(R.string.rgj);
            }
            String string = getString(R.string.rgt);
            o.LJIIIIZZ(string, "getString(R.string.soundsremix_status_soundsspeed)");
            Yl(string);
            _$_findCachedViewById(R.id.b99).post(new ARunnableS38S0100000_2(this, 115));
            float f = 1.0f;
            ((C130995Cd) _$_findCachedViewById(R.id.b99)).setSpeedRange(C47261Igj.LJII(Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f)));
            ((C130995Cd) _$_findCachedViewById(R.id.b99)).setOnSliderChangeListener(new InterfaceC131005Ce() { // from class: X.4yq
                @Override // X.InterfaceC131005Ce
                public final void LIZ() {
                }

                @Override // X.InterfaceC131005Ce
                public final void LIZJ() {
                    NLETrackSlot selectedTrackSlot;
                    if (!C37269Ejx.LIZ) {
                        return;
                    }
                    if (SoundSpeedFragment.this.Jl().getPlayer().isPlaying()) {
                        SoundSpeedFragment.this.Jl().getPlayer().pause();
                    }
                    C79057V0z.LJJJJL(SoundSpeedFragment.this.Jl(), "show_preview_placeholder", Boolean.TRUE);
                    NLETrack selectedTrack = SoundSpeedFragment.this.Jl().getSelectedTrack();
                    if (selectedTrack == null || (selectedTrackSlot = SoundSpeedFragment.this.Jl().getSelectedTrackSlot()) == null) {
                        return;
                    }
                    long[] jArr = new long[2];
                    C124774v3.LIZ(selectedTrack, selectedTrackSlot, jArr);
                    SoundSpeedFragment.this.Jl().getPlayer().seek((jArr[0] / 1000) + 1);
                }

                @Override // X.InterfaceC131005Ce
                public final boolean LIZLLL() {
                    if (SoundSpeedFragment.this.Jl().getSelectedTrackSlot() == null) {
                        SoundSpeedFragment.this.lm(R.string.fnz);
                        SoundSpeedFragment.this.Ol();
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC131005Ce
                public final void LIZIZ(int i) {
                    NLETrackSlot selectedTrackSlot;
                    boolean z = C37269Ejx.LIZ;
                    if (z) {
                        C79057V0z.LJJJJL(SoundSpeedFragment.this.Jl(), "show_preview_placeholder", Boolean.FALSE);
                    }
                    SoundSpeedFragment.this.Ol();
                    NLETrack selectedTrack = SoundSpeedFragment.this.Jl().getSelectedTrack();
                    if (selectedTrack == null || (selectedTrackSlot = SoundSpeedFragment.this.Jl().getSelectedTrackSlot()) == null) {
                        return;
                    }
                    NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(selectedTrackSlot.LJI());
                    if (LIZLLL2 != null) {
                        SoundSpeedFragment soundSpeedFragment = SoundSpeedFragment.this;
                        long LJIIL = LIZLLL2.LJIIL() - LIZLLL2.LJIILIIL();
                        long j = 10;
                        if ((LJIIL / i) / j < soundSpeedFragment.LLD) {
                            soundSpeedFragment.lm(R.string.rgq);
                            i = (int) ((LJIIL / soundSpeedFragment.LLD) / j);
                            ((C130995Cd) soundSpeedFragment._$_findCachedViewById(R.id.b99)).setCurrPosition(i);
                        }
                    }
                    selectedTrackSlot.setExtra("is_editor_pro_speed_used", "true");
                    ((CutViewModel) SoundSpeedFragment.this.Ml()).changeSpeed(Float.valueOf(i / 100.0f), Boolean.valueOf(!SoundSpeedFragment.this.Jl().getEditor().LJIILIIL()), false);
                    long[] jArr = new long[2];
                    C124774v3.LIZ(selectedTrack, selectedTrackSlot, jArr);
                    if (z) {
                        C79057V0z.LJJJJL(SoundSpeedFragment.this.Jl(), "move_track_to_position", Long.valueOf(jArr[0] + 1000));
                    }
                    long j2 = 1000;
                    C125014vR.LIZ(SoundSpeedFragment.this.Jl().getPlayer(), jArr[0] + j2, jArr[1] - j2, !z, 4);
                }

                @Override // X.InterfaceC131005Ce
                public final void LJ(float f2, int i, int i2) {
                    View contentView;
                    TextView textView;
                    PopupWindow popupWindow = SoundSpeedFragment.this.LJLJLJ;
                    if (popupWindow != null && (contentView = popupWindow.getContentView()) != null && (textView = (TextView) contentView.findViewById(R.id.m2v)) != null) {
                        String LLLZI = C16880lQ.LLLZI(Locale.ENGLISH, "%.2fx", Arrays.copyOf(new Object[]{Float.valueOf(((float) Math.rint(i2 / 1.0f)) / 100)}, 1));
                        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                        textView.setText(LLLZI);
                    }
                    if (i == 0) {
                        SoundSpeedFragment soundSpeedFragment = SoundSpeedFragment.this;
                        C130995Cd change_speed = (C130995Cd) soundSpeedFragment._$_findCachedViewById(R.id.b99);
                        o.LJIIIIZZ(change_speed, "change_speed");
                        soundSpeedFragment.cm(f2, ((C130995Cd) SoundSpeedFragment.this._$_findCachedViewById(R.id.b99)).getHandleRadius() + ((C130995Cd) SoundSpeedFragment.this._$_findCachedViewById(R.id.b99)).getHandleCenterRelativeY(), change_speed);
                        return;
                    }
                    SoundSpeedFragment soundSpeedFragment2 = SoundSpeedFragment.this;
                    C130995Cd change_speed2 = (C130995Cd) soundSpeedFragment2._$_findCachedViewById(R.id.b99);
                    o.LJIIIIZZ(change_speed2, "change_speed");
                    soundSpeedFragment2.dm(change_speed2, f2);
                }
            });
            ((CutViewModel) Ml()).getSpeed().observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 293));
            MutableLiveData<C60632Zn> speedUpdate = ((CutViewModel) Ml()).getSpeedUpdate();
            if (speedUpdate != null) {
                speedUpdate.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 294));
            }
            ((CutViewModel) Ml()).getChangeTone().observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 295));
            MutableLiveData LJII = C79057V0z.LJII(Jl(), "track_select_change_event");
            if (LJII != null) {
                LJII.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 297));
            }
            _$_findCachedViewById(R.id.a6v).setVisibility(8);
            _$_findCachedViewById(R.id.b9b).setVisibility(0);
            C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.b9b), new ACListenerS22S0100000_2(this, 142));
            ((CutViewModel) Ml()).checkAbsSpeedAndTone();
            Float value = ((CutViewModel) Ml()).getSpeed().getValue();
            if (value != null) {
                f = value.floatValue();
            }
            this.LJZI = f;
            Boolean value2 = ((CutViewModel) Ml()).getChangeTone().getValue();
            if (value2 == null) {
                return;
            }
            value2.booleanValue();
        }
    }
}
