package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.AbstractC123304sg;
import X.ActivityC45651qj;
import X.C123314sh;
import X.C123434st;
import X.C124574uj;
import X.C124824v8;
import X.C124864vC;
import X.C124894vF;
import X.C124944vK;
import X.C124954vL;
import X.C127594zb;
import X.C1280450u;
import X.C130995Cd;
import X.C131935Ft;
import X.C139795eB;
import X.C145995oB;
import X.C16880lQ;
import X.C221108m2;
import X.C47261Igj;
import X.C52B;
import X.C55T;
import X.C5BA;
import X.C5G0;
import X.C5QW;
import X.C60632Zn;
import X.C62822Ol8;
import X.C78596Usy;
import X.C78880UxY;
import X.C78920UyC;
import X.C79057V0z;
import X.C8HI;
import X.EnumC123874tb;
import X.EnumC126814yL;
import X.EnumC127484zQ;
import X.FMX;
import X.InterfaceC124814v7;
import X.InterfaceC131005Ce;
import X.ORZ;
import X.X1D;
import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDLListenerS190S0100000_2;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SpeedNormalFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SpeedNormalFragment extends TTResourcePanelFragment<CutViewModel> {
    public boolean LJLZ;
    public boolean LJZ;
    public float LJZI;
    public long LL;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 576));
    public final long LLD = ((Number) C5BA.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
    public long LLF = System.currentTimeMillis();

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "speed_normal_panel";
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        C139795eB c139795eB;
        if (this.LJLZ) {
            c139795eB = new C139795eB(EnumC126814yL.APPLY_TO_ALL.getNameId(), null, null, null, null, 30);
        } else {
            String nameId = EnumC126814yL.CHANGE_SPEED.getNameId();
            String valueOf = String.valueOf(this.LJZI);
            Float value = ((CutViewModel) Ml()).getSpeed().getValue();
            if (value == null) {
                value = Float.valueOf(1.0f);
            }
            c139795eB = new C139795eB(nameId, valueOf, String.valueOf(value.floatValue()), null, null, 24);
        }
        return C78880UxY.LJLILLLLZI(c139795eB);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final boolean Ll() {
        return ((Boolean) this.LJZL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final boolean Rl() {
        float absSpeed;
        boolean LJIIIZ;
        EditorProContext Jl = Jl();
        NLETrackSlot selectedTrackSlot = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot == null || selectedTrackSlot.LJI().LIZJ() == EnumC123874tb.IMAGE) {
            mm();
            return false;
        }
        selectedTrackSlot.setExtra("is_editor_pro_speed_used", "true");
        float LJJJJJ = Jl.getEditor().LJJJJJ();
        long LJIIJJI = Jl.getMainTrack().LJIIJJI();
        EnumC123874tb enumC123874tb = null;
        C124824v8 c124824v8 = new C124824v8(Float.valueOf(LJJJJJ), Boolean.TRUE, false, null);
        NLEModel LJJI = C79057V0z.LJJI(Jl);
        ArrayList arrayList = new ArrayList();
        NLEModel beforeActionNLEModel = NLEModel.dynamicCast(C79057V0z.LJJI(Jl).deepClone());
        Iterator<NLETrackSlot> it = LJJI.getMainTrack().LJIILLIIL().iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            if (next != null) {
                Jl.getNleSession().X8().LJIILL(30);
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next.LJI());
                if (LJJ != null) {
                    NLEResourceNode LIZIZ = LJJ.LIZIZ();
                    if (LIZIZ != null) {
                        enumC123874tb = LIZIZ.LJFF();
                    }
                    if (enumC123874tb != EnumC123874tb.IMAGE) {
                        Float f = c124824v8.LIZ;
                        if (f != null) {
                            absSpeed = f.floatValue();
                        } else {
                            absSpeed = LJJ.getAbsSpeed();
                        }
                        Boolean bool = c124824v8.LIZIZ;
                        if (bool != null) {
                            LJIIIZ = bool.booleanValue();
                        } else {
                            LJIIIZ = LJJ.LJIIIZ();
                        }
                        NLETrackSlot LIZ = NLETrackSlot.LIZ(next.deepClone());
                        if (!c124824v8.LIZJ) {
                            Jl.getPlayer().pause();
                            long LJIIL = LJJ.LJIIL() - LJJ.LJIILIIL();
                            float f2 = (float) LJIIL;
                            float f3 = (f2 / absSpeed) / 1000.0f;
                            float longValue = (float) ((Number) C5BA.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
                            if (f3 < longValue) {
                                LJJ.setAbsSpeed((f2 / 1000.0f) / longValue);
                            } else {
                                LJJ.setAbsSpeed(absSpeed);
                            }
                            long absSpeed2 = f2 / LJJ.getAbsSpeed();
                            next.setEndTime(next.getStartTime() + absSpeed2);
                            if (absSpeed2 < 200000) {
                                next.LJIIJJI(null);
                                NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(Jl.getMainTrack().LJIILLIIL().indexOf(next) - 1, Jl.getMainTrack().LJIILLIIL());
                                if (nLETrackSlot != null) {
                                    nLETrackSlot.LJIIJJI(null);
                                }
                            }
                            Iterator<NLEVideoAnimation> it2 = next.LJIIIZ().iterator();
                            while (it2.hasNext()) {
                                NLEVideoAnimation next2 = it2.next();
                                next2.setEndTime((((float) (next2.getEndTime() - next2.getStartTime())) / absSpeed) + next2.getStartTime());
                            }
                            LJJ.LJIJI(LJIIIZ);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("video slot apply speed：nleSpeed=");
                            LIZ2.append(absSpeed);
                            LIZ2.append(", duration=");
                            LIZ2.append(LJIIL);
                            LIZ2.append(", endTime=");
                            LIZ2.append(next.getEndTime());
                            C131935Ft.LIZIZ("NLE-Shadow", X1D.LIZIZ(LIZ2));
                            C124864vC.LJII(C79057V0z.LJJI(Jl), next, c124824v8);
                        }
                        if (LJJ.LJFF() != 1.0d) {
                            NLEEditorJniJNI.NLESegmentAudio_clearSegCurveSpeedPoint(LJJ.LIZJ, LJJ);
                            LJJ.setExtra("curve_speed_name", "");
                        }
                        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_TRACK_LINKAGE, Boolean.FALSE)).booleanValue()) {
                            arrayList.add(new C123434st(LIZ, next, null, null, 12));
                        }
                        InterfaceC124814v7 interfaceC124814v7 = c124824v8.LIZLLL;
                        if (interfaceC124814v7 != null) {
                            interfaceC124814v7.LIZ(absSpeed, LJIIIZ);
                        }
                    }
                }
            }
            enumC123874tb = null;
        }
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_TRACK_LINKAGE, Boolean.FALSE)).booleanValue()) {
            TrackLinkageManagerProvider.Companion.getClass();
            AbstractC123304sg businessTrackLinkageManager = C124944vK.LIZ().getBusinessTrackLinkageManager();
            if (businessTrackLinkageManager != null) {
                Jl.getMainTrack().LJJIFFI();
                o.LJIIIIZZ(beforeActionNLEModel, "beforeActionNLEModel");
                businessTrackLinkageManager.LIZIZ(new C123314sh("speed_video", arrayList, beforeActionNLEModel));
            }
        }
        ((CutViewModel) Ml()).adjustAfterVideoSpeed(LJIIJJI);
        C79057V0z.LJIIL(Jl);
        VideoPublishEditModel em = em();
        if (em != null) {
            Float value = ((CutViewModel) Ml()).getSpeed().getValue();
            if (value == null) {
                value = Float.valueOf(1.0f);
            }
            o.LJIIIIZZ(value, "viewModel.speed.value ?: 1.0f");
            String LIZLLL = C52B.LIZLLL(value.floatValue());
            C145995oB LJFF = C5QW.LJFF(em, Jl);
            LJFF.LJI("track_type", C5QW.LJIIJ(Jl));
            LJFF.LJI("rate", LIZLLL);
            FMX.LJIIL("click_speed_apply_to_all", LJFF.LIZ);
        }
        this.LJLZ = true;
        this.LJZ = true;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        NLETrackSlot selectedTrackSlot;
        float f = this.LJZI;
        Float value = ((CutViewModel) Ml()).getSpeed().getValue();
        if (value == null) {
            value = Float.valueOf(1.0f);
        }
        if (f != value.floatValue() && (selectedTrackSlot = Jl().getSelectedTrackSlot()) != null && C78596Usy.LJJJJI(selectedTrackSlot)) {
            selectedTrackSlot.setExtra("is_editorpro_adjust_video_speed", "1");
        }
        lm();
        NLETrackSlot selectedTrackSlot2 = Jl().getSelectedTrackSlot();
        if (selectedTrackSlot2 != null) {
            selectedTrackSlot2.setExtra("adjust_video_speed_duration", String.valueOf((System.currentTimeMillis() - this.LLF) + C5QW.LJIIIZ(selectedTrackSlot2, "adjust_video_speed_duration")));
        }
        super.V3();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        Integer num;
        NLETrackSlot nLETrackSlot;
        Integer num2;
        if (C124574uj.LJJJJL(Jl())) {
            NLETrackSlot selectedTrackSlot = Jl().getSelectedTrackSlot();
            NLETrack trackBySlot = C79057V0z.LJJI(Jl()).getTrackBySlot(selectedTrackSlot);
            if (trackBySlot != null) {
                num = Integer.valueOf(trackBySlot.getLayer());
            } else {
                num = null;
            }
            if (selectedTrackSlot != null) {
                NLEModel LJJI = C79057V0z.LJJI(Jl());
                String name = selectedTrackSlot.getName();
                o.LJIIIIZZ(name, "slot.name");
                VecNLETrackSPtr tracks = LJJI.getTracks();
                o.LJIIIIZZ(tracks, "tracks");
                Iterator<NLETrack> it = tracks.iterator();
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
                        while (it2.hasNext()) {
                            nLETrackSlot = it2.next();
                            if (TextUtils.equals(nLETrackSlot.getName(), name)) {
                                break loop0;
                            }
                        }
                    } else {
                        nLETrackSlot = null;
                        break;
                    }
                }
                NLETrack trackBySlot2 = C79057V0z.LJJI(Jl()).getTrackBySlot(nLETrackSlot);
                if (trackBySlot2 != null) {
                    num2 = Integer.valueOf(trackBySlot2.getLayer());
                } else {
                    num2 = null;
                }
                if (!o.LJ(num2, num) && nLETrackSlot != null) {
                    C79057V0z.LJJJJL(Jl(), "select_slot_event", new C127594zb(nLETrackSlot, null, 10));
                }
            }
        }
        super.Sl();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Tl() {
        lm();
        super.Tl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
        ((CutViewModel) Ml()).checkAbsSpeedAndTone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lm() {
        String str;
        VideoPublishEditModel em = em();
        if (em != null) {
            Float value = ((CutViewModel) Ml()).getSpeed().getValue();
            if (value == null) {
                value = Float.valueOf(1.0f);
            }
            o.LJIIIIZZ(value, "viewModel.speed.value ?: 1.0f");
            String LIZLLL = C52B.LIZLLL(value.floatValue());
            EditorProContext editorContext = Jl();
            boolean z = this.LJZ;
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(em, editorContext);
            LJFF.LJI("track_type", C5QW.LJIIJ(editorContext));
            LJFF.LJI("rate", LIZLLL);
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LJFF.LJI("apply_status", str);
            FMX.LJIIL("save_cut_speed", LJFF.LIZ);
        }
    }

    public final void mm() {
        if (System.currentTimeMillis() - this.LL < 500) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C78920UyC.LIZLLL(R.string.fnz, mo49getActivity, 3018);
        }
        this.LL = System.currentTimeMillis();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        if (C55T.LIZ()) {
            return R.layout.aso;
        }
        return R.layout.asp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            this.LLF = System.currentTimeMillis();
            Typeface LIZLLL = C8HI.LIZJ().LIZLLL("regular");
            if (LIZLLL != null) {
                ((TextView) ((View) this.LJLLILLLL.getValue()).findViewById(R.id.m2v)).setTypeface(LIZLLL);
                ((C130995Cd) _$_findCachedViewById(R.id.b99)).setTextTypeface(LIZLLL);
            }
            String string = getString(R.string.fmo);
            o.LJIIIIZZ(string, "getString(R.string.editor_pro_menu_edit_speed)");
            Yl(string);
            _$_findCachedViewById(R.id.b99).post(new ARunnableS38S0100000_2(this, 116));
            float f = 1.0f;
            ((C130995Cd) _$_findCachedViewById(R.id.b99)).setSpeedRange(C47261Igj.LJII(Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(5.0f), Float.valueOf(10.0f)));
            ((C130995Cd) _$_findCachedViewById(R.id.b99)).setOnSliderChangeListener(new InterfaceC131005Ce() { // from class: X.4yp
                @Override // X.InterfaceC131005Ce
                public final void LIZ() {
                }

                @Override // X.InterfaceC131005Ce
                public final void LIZJ() {
                    NLETrackSlot selectedTrackSlot;
                    if (!C37269Ejx.LIZ) {
                        return;
                    }
                    if (SpeedNormalFragment.this.Jl().getPlayer().isPlaying()) {
                        SpeedNormalFragment.this.Jl().getPlayer().pause();
                    }
                    C79057V0z.LJJJJL(SpeedNormalFragment.this.Jl(), "show_preview_placeholder", Boolean.TRUE);
                    NLETrack selectedTrack = SpeedNormalFragment.this.Jl().getSelectedTrack();
                    if (selectedTrack == null || (selectedTrackSlot = SpeedNormalFragment.this.Jl().getSelectedTrackSlot()) == null) {
                        return;
                    }
                    long[] jArr = new long[2];
                    C124774v3.LIZ(selectedTrack, selectedTrackSlot, jArr);
                    SpeedNormalFragment.this.Jl().getPlayer().seek((jArr[0] / 1000) + 1);
                }

                @Override // X.InterfaceC131005Ce
                public final boolean LIZLLL() {
                    if (SpeedNormalFragment.this.Jl().getSelectedTrackSlot() == null) {
                        SpeedNormalFragment.this.mm();
                        SpeedNormalFragment.this.Ol();
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC131005Ce
                public final void LIZIZ(int i) {
                    NLETrackSlot selectedTrackSlot;
                    int i2 = i;
                    boolean z = C37269Ejx.LIZ;
                    if (z) {
                        C79057V0z.LJJJJL(SpeedNormalFragment.this.Jl(), "show_preview_placeholder", Boolean.FALSE);
                    }
                    SpeedNormalFragment speedNormalFragment = SpeedNormalFragment.this;
                    speedNormalFragment.LJLZ = false;
                    speedNormalFragment.Ol();
                    NLETrack selectedTrack = SpeedNormalFragment.this.Jl().getSelectedTrack();
                    if (selectedTrack == null || (selectedTrackSlot = SpeedNormalFragment.this.Jl().getSelectedTrackSlot()) == null) {
                        return;
                    }
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(selectedTrackSlot.LJI());
                    if (LJJ != null) {
                        SpeedNormalFragment speedNormalFragment2 = SpeedNormalFragment.this;
                        long LJIIL = LJJ.LJIIL() - LJJ.LJIILIIL();
                        long j = 10;
                        long j2 = (LJIIL / i2) / j;
                        long j3 = speedNormalFragment2.LLD;
                        if (j2 < j3) {
                            i2 = (int) ((LJIIL / j3) / j);
                            ((C130995Cd) speedNormalFragment2._$_findCachedViewById(R.id.b99)).setCurrPosition(i2);
                        }
                    }
                    selectedTrackSlot.setExtra("is_editor_pro_speed_used", "true");
                    float rint = ((float) Math.rint(i2 / 10.0f)) / 10;
                    ((CutViewModel) SpeedNormalFragment.this.Ml()).changeSpeed(Float.valueOf(rint), Boolean.TRUE, false);
                    long[] jArr = new long[2];
                    C124774v3.LIZ(selectedTrack, selectedTrackSlot, jArr);
                    if (z) {
                        C79057V0z.LJJJJL(SpeedNormalFragment.this.Jl(), "move_track_to_position", Long.valueOf(jArr[0] + 1000));
                    }
                    long j4 = 1000;
                    C125014vR.LIZ(SpeedNormalFragment.this.Jl().getPlayer(), jArr[0] + j4, jArr[1] - j4, !z, 4);
                    VideoPublishEditModel em = SpeedNormalFragment.this.em();
                    if (em != null) {
                        EditorProContext editorContext = SpeedNormalFragment.this.Jl();
                        String speed = String.valueOf(rint);
                        o.LJIIIZ(speed, "speed");
                        o.LJIIIZ(editorContext, "editorContext");
                        C145995oB LJFF = C5QW.LJFF(em, editorContext);
                        LJFF.LJI("track_type", C5QW.LJIIJ(editorContext));
                        LJFF.LJI("rate", speed);
                        FMX.LJIIL("click_cut_speed_change", LJFF.LIZ);
                    }
                }

                @Override // X.InterfaceC131005Ce
                public final void LJ(float f2, int i, int i2) {
                    View contentView;
                    TextView textView;
                    PopupWindow popupWindow = SpeedNormalFragment.this.LJLJLJ;
                    if (popupWindow != null && (contentView = popupWindow.getContentView()) != null && (textView = (TextView) contentView.findViewById(R.id.m2v)) != null) {
                        String LLLZI = C16880lQ.LLLZI(Locale.ENGLISH, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(((float) Math.rint(i2 / 10.0f)) / 10)}, 1));
                        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                        textView.setText(LLLZI);
                    }
                    if (i == 0) {
                        SpeedNormalFragment speedNormalFragment = SpeedNormalFragment.this;
                        C130995Cd change_speed = (C130995Cd) speedNormalFragment._$_findCachedViewById(R.id.b99);
                        o.LJIIIIZZ(change_speed, "change_speed");
                        speedNormalFragment.cm(f2, ((C130995Cd) SpeedNormalFragment.this._$_findCachedViewById(R.id.b99)).getHandleRadius() + ((C130995Cd) SpeedNormalFragment.this._$_findCachedViewById(R.id.b99)).getHandleCenterRelativeY(), change_speed);
                        return;
                    }
                    SpeedNormalFragment speedNormalFragment2 = SpeedNormalFragment.this;
                    C130995Cd change_speed2 = (C130995Cd) speedNormalFragment2._$_findCachedViewById(R.id.b99);
                    o.LJIIIIZZ(change_speed2, "change_speed");
                    speedNormalFragment2.dm(change_speed2, f2);
                }
            });
            ((CutViewModel) Ml()).getSpeed().observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 300));
            MutableLiveData<C60632Zn> speedUpdate = ((CutViewModel) Ml()).getSpeedUpdate();
            if (speedUpdate != null) {
                speedUpdate.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 301));
            }
            MutableLiveData<C124894vF> slotSelectChangedEvent = ((CutViewModel) Ml()).getSlotSelectChangedEvent();
            if (slotSelectChangedEvent != null) {
                slotSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 302));
            }
            MutableLiveData<C124954vL> trackSelectChangedEvent = ((CutViewModel) Ml()).getTrackSelectChangedEvent();
            if (trackSelectChangedEvent != null) {
                trackSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS70S0100000_2(this, 303));
            }
            if (C55T.LIZ()) {
                C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.a6w), new ACListenerS22S0100000_2(this, 147));
                C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.c18), new ACListenerS22S0100000_2(this, 148));
            }
            if (C55T.LIZ()) {
                Nl();
                if (C124574uj.LJJJJL(Jl())) {
                    _$_findCachedViewById(R.id.a6w).setVisibility(8);
                } else {
                    _$_findCachedViewById(R.id.a6w).setVisibility(0);
                }
            } else if (C124574uj.LJJJJL(Jl())) {
                Nl();
                View speed_panel_layout = _$_findCachedViewById(R.id.k_c);
                o.LJIIIIZZ(speed_panel_layout, "speed_panel_layout");
                DTResourcePanelFragment.Dl(speed_panel_layout, 43.0f);
                View speed_panel_layout2 = _$_findCachedViewById(R.id.k_c);
                o.LJIIIIZZ(speed_panel_layout2, "speed_panel_layout");
                DTResourcePanelFragment.Al(speed_panel_layout2, 10.0f);
            } else {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.a6v);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setVisibility(0);
                }
                View speed_panel_layout3 = _$_findCachedViewById(R.id.k_c);
                o.LJIIIIZZ(speed_panel_layout3, "speed_panel_layout");
                DTResourcePanelFragment.Dl(speed_panel_layout3, 15.0f);
                View speed_panel_layout4 = _$_findCachedViewById(R.id.k_c);
                o.LJIIIIZZ(speed_panel_layout4, "speed_panel_layout");
                DTResourcePanelFragment.Al(speed_panel_layout4, 0.0f);
            }
            if (C55T.LIZ() && !C124574uj.LJJJJL(Jl())) {
                _$_findCachedViewById(R.id.c18).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS190S0100000_2(this, 8));
            }
            ((CutViewModel) Ml()).checkAbsSpeedAndTone();
            Float value = ((CutViewModel) Ml()).getSpeed().getValue();
            if (value != null) {
                f = value.floatValue();
            }
            this.LJZI = f;
        }
    }
}
