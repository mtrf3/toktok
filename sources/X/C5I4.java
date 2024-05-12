package X;

import Y.ACallableS28S0301000_2;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDComparatorS30S0000000_2;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.viewmodel.AudioViewModel;
import com.ss.ugc.android.editor.components.base.model.SelectedMusicInfo;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS0S2520000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5I4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5I4 implements InterfaceC132055Gf {
    public final ActivityC45651qj LIZ;
    public final C127604zc LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final V0N LJIIIIZZ;
    public final C5I9 LJIIIZ;
    public boolean LJIIJ;
    public DialogC135575Tt LJIIJJI;
    public AVMusic LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final SafeHandler LJIIZILJ;
    public final SafeHandler LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public Long LJIL;
    public C5ID LJJ;

    @Override // X.InterfaceC132055Gf
    public final void LJIIJ() {
        LJIILL(this, false, false, 4);
    }

    @Override // X.InterfaceC132055Gf
    public final void LIZIZ() {
        this.LJIIZILJ.post(new ARunnableS38S0100000_2(this, 195));
    }

    @Override // X.InterfaceC132055Gf
    public final void LJFF() {
        boolean z = !this.LJIILLIIL;
        LJJIII(true);
        if (!this.LJIILL) {
            C78920UyC.LIZLLL(R.string.fny, this.LIZ, 1055);
        } else if (z) {
            LJII(null, true, true, new C5IG() { // from class: X.4vh
                @Override // X.C5IG
                public final void onFailed() {
                }

                @Override // X.C5IG
                public final void onSuccess() {
                    C132385Hm.LJIIJ("editor_pro_sync", C5I4.this.LJIIZILJ());
                    EditorProContext LJIIZILJ = C5I4.this.LJIIZILJ();
                    o.LJIIIZ(LJIIZILJ, "<this>");
                    if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
                        C124614un.LIZJ(LJIIZILJ);
                    }
                    C79057V0z.LJIILL(LJIIZILJ, C6YK.LIZ(new C139795eB(EnumC126814yL.OPEN_MUSIC_SYNC.getNameId(), null, null, null, null, 30)));
                }
            });
        } else {
            LJII(null, false, true, new C5IG() { // from class: X.4vg
                @Override // X.C5IG
                public final void onFailed() {
                }

                @Override // X.C5IG
                public final void onSuccess() {
                    NLENode nLENode;
                    NLETrack nLETrack;
                    EditorProContext LJIIZILJ = C5I4.this.LJIIZILJ();
                    o.LJIIIZ(LJIIZILJ, "<this>");
                    NLETrack nLETrack2 = null;
                    if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
                        C124614un.LIZJ(LJIIZILJ);
                        VecNLETrackSPtr tracks = C79057V0z.LJJI(LJIIZILJ).getTracks();
                        o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
                        Iterator<NLETrack> it = tracks.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                nLETrack = it.next();
                                if (C124574uj.LJJIL(nLETrack)) {
                                    break;
                                }
                            } else {
                                nLETrack = null;
                                break;
                            }
                        }
                        NLETrack nLETrack3 = nLETrack;
                        if (nLETrack3 != null) {
                            Iterator<NLETrackSlot> it2 = nLETrack3.LJIILL().iterator();
                            while (it2.hasNext()) {
                                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(it2.next().LJI());
                                if (LIZLLL != null) {
                                    LIZLLL.LJIJJ((LIZLLL.getSpeed() * ((float) r4.getDuration())) + ((float) LIZLLL.LJIILIIL()));
                                    LIZLLL.LJIJJ(Math.min(LIZLLL.LJIIL(), LIZLLL.LIZIZ().getDuration()));
                                }
                            }
                        }
                    }
                    VecNLETrackSPtr tracks2 = C79057V0z.LJJI(LJIIZILJ).getTracks();
                    if (tracks2 != null) {
                        Iterator<NLETrack> it3 = tracks2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            NLETrack next = it3.next();
                            if (C124574uj.LJJIL(next)) {
                                nLETrack2 = next;
                                break;
                            }
                        }
                        NLETrack nLETrack4 = nLETrack2;
                        if (nLETrack4 != null && (nLENode = (NLENode) ORZ.LJLLLL(nLETrack4.LJIILLIIL())) != null) {
                            nLENode.removeExtraWithKey("audio_stick_points");
                        }
                    }
                    C79057V0z.LJIILL(LJIIZILJ, C6YK.LIZ(new C139795eB(EnumC126814yL.CLOSE_MUSIC_SYNC.getNameId(), null, null, null, null, 30)));
                    C78920UyC.LIZLLL(R.string.sah, C5I4.this.LIZ, 1056);
                }
            });
        }
    }

    public final EditorProContext LJIIZILJ() {
        return (EditorProContext) this.LJI.getValue();
    }

    public final VideoPublishEditModel LJIJ() {
        return ((EditModelProvider) this.LJII.getValue()).getEditModel();
    }

    public final DialogC135575Tt LJIJI() {
        DialogC135575Tt dialogC135575Tt = this.LJIIJJI;
        if (dialogC135575Tt != null) {
            return dialogC135575Tt;
        }
        ActivityC45651qj activityC45651qj = this.LIZ;
        if (activityC45651qj instanceof SAAActivity) {
            ((SAAActivity) activityC45651qj).LLIIJI("getIntent", new AqS152S0100000_2(this, 1014));
        } else {
            this.LJIIJJI = new DialogC135575Tt(this.LIZ);
        }
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC132055Gf
    public final void LIZ() {
        AVMusic aVMusic;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        NLESegmentAudio LIZLLL;
        NLETrack nLETrack;
        NLENode nLENode;
        AVMusic aVMusic2 = null;
        if (C124574uj.LJJIJ("stick_point_on_off_key", LJIIZILJ())) {
            String LJIILJJIL = C124574uj.LJIILJJIL("stick_point_on_off_key", LJIIZILJ());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("STICK_POINT_ON_OFF_KEY ");
            LIZ.append(LJIILJJIL);
            H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ));
        } else {
            H7C.LJI(3, "music", null, "STICK_POINT_ON_OFF_KEY not found ");
        }
        VecNLETrackSPtr tracks = C79057V0z.LJJI(LJIIZILJ()).getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it = tracks.iterator();
            while (true) {
                if (it.hasNext()) {
                    nLETrack = it.next();
                    if (C124574uj.LJJIL(nLETrack)) {
                        break;
                    }
                } else {
                    nLETrack = null;
                    break;
                }
            }
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2 != null && (nLENode = (NLENode) ORZ.LJLLLL(nLETrack2.LJIILLIIL())) != null) {
                if (nLENode.hasExtra("audio_stick_points")) {
                    String LJIILJJIL2 = C124574uj.LJIILJJIL("audio_stick_points", LJIIZILJ());
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("AUDIO_STICK_POINTS ");
                    LIZ2.append(LJIILJJIL2);
                    H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ2));
                } else {
                    H7C.LJI(3, "music", null, "AUDIO_STICK_POINTS not found ");
                }
            }
        }
        if (C124574uj.LJJIJ("stick_point_on_off_key", LJIIZILJ())) {
            boolean parseBoolean = Boolean.parseBoolean(C124574uj.LJIILJJIL("stick_point_on_off_key", LJIIZILJ()));
            if (parseBoolean != this.LJIILLIIL || !parseBoolean) {
                LJIL(parseBoolean, false);
            }
        } else {
            LJIL(false, false);
        }
        if (C124574uj.LJJIJ("value_current_used_music_id", LJIIZILJ())) {
            aVMusic = C5I7.LIZIZ(C124574uj.LJIILJJIL("value_current_used_music_id", LJIIZILJ()));
            NLETrack LJIJI = C32151Nz.LJIJI(LJIIZILJ());
            if (LJIJI != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, LJIJI.LJIILLIIL())) != null && (LJI = nLETrackSlot.LJI()) != null && (LIZLLL = NLESegmentAudio.LIZLLL(LJI)) != null && aVMusic != null) {
                aVMusic.setMusicStartFromCut((int) (LIZLLL.LJIILIIL() / 1000));
            }
        } else {
            aVMusic = null;
        }
        LJJI(this, aVMusic, false, false, 6);
        if (C124574uj.LJJIJ("value_last_used_music_id", LJIIZILJ())) {
            aVMusic2 = C5I7.LIZIZ(C124574uj.LJIILJJIL("value_last_used_music_id", LJIIZILJ()));
        }
        this.LJIIL = aVMusic2;
        if (!C5IF.LIZ()) {
            LJIILJJIL(false);
        }
    }

    public final void LJIILLIIL() {
        List<NLETrack> LJII = C124574uj.LJII(LJIJJ());
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : LJII) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.hasExtra("AudioTrackType")) {
                String extra = nLETrack2.getExtra("AudioTrackType");
                o.LJIIIIZZ(extra, "it.getExtra(\"AudioTrackType\")");
                if (extra.length() == 0) {
                }
            }
            arrayList.add(nLETrack);
        }
        arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((NLENode) it.next()).setExtra("AudioTrackType", "BGM");
        }
        VecNLETrackSPtr tracks = LJIJJ().getTracks();
        o.LJIIIIZZ(tracks, "nleModel.tracks");
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            NLETrack next = it2.next();
            if (C124574uj.LJJJ(next)) {
                arrayList2.add(next);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((NLENode) it3.next()).setExtra("AudioTrackType", "BGM");
        }
    }

    public final NLEModel LJIJJ() {
        return C79057V0z.LJJI(LJIIZILJ());
    }

    @Override // X.InterfaceC132055Gf
    public final boolean LIZJ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC132055Gf
    public final void LJ(AVMusic aVMusic) {
        LJJI(this, aVMusic, false, false, 6);
    }

    @Override // X.InterfaceC132055Gf
    public final void LJIIIZ(C5ID c5id) {
        this.LJJ = c5id;
    }

    @Override // X.InterfaceC132055Gf
    public final void LJIIL(boolean z) {
        boolean LJIIIZ = C124604um.LJIIIZ(LJIIZILJ());
        if (LJIIIZ != this.LJIJJ || z) {
            this.LJIJJ = LJIIIZ;
            C79057V0z.LJJJJL(LJIIZILJ(), "status_show_null_audio_track", Boolean.valueOf(LJIIIZ));
        }
    }

    public final void LJIILJJIL(boolean z) {
        MusicBuzModel musicBuzModel;
        NLETrackSlot nLETrackSlot;
        long j;
        CreativeModel creativeModel;
        VideoPublishEditModel LJIJ = LJIJ();
        if (LJIJ != null && (creativeModel = LJIJ.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (extractAVMusic != null && !extractAVMusic.isPgc()) {
            EditorProContext LJIIZILJ = LJIIZILJ();
            o.LJIIIZ(LJIIZILJ, "<this>");
            if (LJIIZILJ.getPlayer().s5() >= 61000) {
                NLETrack LJIJI = C32151Nz.LJIJI(LJIIZILJ());
                if (LJIJI != null) {
                    nLETrackSlot = LJIJI.LJIILLIIL().get(0);
                } else {
                    nLETrackSlot = null;
                }
                long j2 = 0;
                if (nLETrackSlot != null) {
                    j = nLETrackSlot.getMeasuredEndTime();
                } else {
                    j = 0;
                }
                long j3 = 1000;
                if (j >= this.LIZJ * j3) {
                    if (nLETrackSlot != null) {
                        j2 = nLETrackSlot.getMeasuredStartTime();
                    }
                    long j4 = this.LIZJ;
                    if (j2 >= (j4 - this.LIZLLL) * j3) {
                        LJIILL(this, false, false, 6);
                        LJJ(null);
                        if (z) {
                            this.LIZ.runOnUiThread(new ARunnableS38S0100000_2(this, 191));
                            return;
                        }
                        return;
                    }
                    if (nLETrackSlot != null) {
                        nLETrackSlot.setEndTime((j4 * j3) - this.LJ);
                    }
                    C79057V0z.LJIIL(LJIIZILJ());
                    return;
                }
                LJIILL(this, false, false, 6);
                LJJ(null);
                if (!z) {
                    return;
                }
                this.LIZ.runOnUiThread(new ARunnableS38S0100000_2(this, 192));
            }
        }
    }

    public final void LJJ(AVMusic aVMusic) {
        String str;
        this.LJIIL = aVMusic;
        EditorProContext LJIIZILJ = LJIIZILJ();
        if (aVMusic == null || (str = aVMusic.getMusicId()) == null) {
            str = "";
        }
        C124574uj.LJJLIIIJ(LJIIZILJ, "value_last_used_music_id", str);
    }

    public final void LJJII(boolean z) {
        boolean z2;
        if (C32151Nz.LJIJI(LJIIZILJ()) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2 != this.LJIILIIL) {
            this.LJIILIIL = z2;
            C79057V0z.LJJJJL(LJIIZILJ(), "event_music_added", Boolean.valueOf(this.LJIILIIL));
        }
    }

    public final void LJJIII(boolean z) {
        boolean z2;
        if (LJIIZILJ().getMainTrack().LJIILL().size() >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2 != this.LJIILL) {
            this.LJIILL = z2;
            C79057V0z.LJJJJL(LJIIZILJ(), "status_sync_func_enabled", Boolean.valueOf(this.LJIILL));
        }
    }

    public C5I4(C29S activity, C127604zc playground) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(playground, "playground");
        this.LIZ = activity;
        this.LIZIZ = playground;
        this.LIZJ = 61000L;
        this.LIZLLL = 100L;
        this.LJ = 10L;
        this.LJFF = 10000L;
        this.LJI = C221108m2.LIZIZ(C123604tA.LJLIL);
        this.LJII = C221108m2.LIZIZ(C5IC.LJLIL);
        this.LJIIIIZZ = new V0N();
        this.LJIIIZ = new C5I9(activity, this);
        this.LJIIZILJ = new SafeHandler(playground.LJLLLLLL);
        this.LJIJ = new SafeHandler(playground.LJLLLLLL);
        this.LJIJI = LJIIZILJ().getMainTrack().LJIILL().size();
        this.LJIJJ = true;
        this.LJIJJLI = C221108m2.LIZIZ(C5IE.LJLIL);
    }

    @Override // X.InterfaceC132055Gf
    public final void LIZLLL(boolean z, boolean z2) {
        MusicBuzModel musicBuzModel;
        String str;
        String str2;
        String str3;
        CreativeModel creativeModel;
        VideoPublishEditModel LJIJ = LJIJ();
        if (LJIJ != null) {
            EditorProContext editorContext = LJIIZILJ();
            VideoPublishEditModel LJIJ2 = LJIJ();
            if (LJIJ2 != null && (creativeModel = LJIJ2.creativeModel) != null) {
                musicBuzModel = creativeModel.musicBuzModel;
            } else {
                musicBuzModel = null;
            }
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
            if (extractAVMusic != null) {
                str = extractAVMusic.getMusicId();
            } else {
                str = null;
            }
            if (z2) {
                str2 = "ai_panel";
            } else {
                str2 = "other";
            }
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJIJ, editorContext);
            if (str == null) {
                str = "";
            }
            LJFF.LJI("music_id", str);
            LJFF.LJI("from_location", str2);
            FlowDataMusicInfo flowDataMusicInfo = LJIJ.creativeFlowData.getFlowDataMusicInfo();
            if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
                str3 = "auto";
            } else {
                str3 = "manual";
            }
            LJFF.LJI("music_selected_method", str3);
            LJFF.LJI("is_editor_pro", "1");
            FMX.LJIIL("unselect_music", LJFF.LIZ);
        }
        LJIILL(this, true, z, 2);
        C5ID c5id = this.LJJ;
        if (c5id != null) {
            LJJI(this, null, false, true, 2);
            c5id.LIZJ();
        }
    }

    @Override // X.InterfaceC132055Gf
    public final void LJIIIIZZ(List musicList, boolean z) {
        MusicBuzModel musicBuzModel;
        boolean z2;
        String str;
        NLETrack nLETrack;
        MusicBuzModel musicBuzModel2;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel3;
        CreativeModel creativeModel2;
        VideoPublishEditModel LJIJ;
        VecNLETrackSPtr tracks;
        NLETrack nLETrack2;
        NLENode nLENode;
        CreativeModel creativeModel3;
        o.LJIIIZ(musicList, "musicList");
        VideoPublishEditModel LJIJ2 = LJIJ();
        Integer num = null;
        if (LJIJ2 != null && (creativeModel3 = LJIJ2.creativeModel) != null) {
            musicBuzModel = creativeModel3.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        LJJI(this, MusicBeanUtilKt.extractAVMusic(musicBuzModel), true, false, 4);
        if (z) {
            this.LJIILLIIL = Boolean.parseBoolean(C124574uj.LJIILJJIL("stick_point_on_off_key", LJIIZILJ()));
        } else {
            VideoPublishEditModel LJIJ3 = LJIJ();
            if (LJIJ3 != null) {
                z2 = LJIJ3.editMusicSyncMode;
            } else {
                z2 = false;
            }
            this.LJIILLIIL = z2;
            if (!C124574uj.LJJIJ("stick_point_on_off_key", LJIIZILJ()) && this.LJIILLIIL) {
                Iterator<NLETrackSlot> it = C79057V0z.LJJI(LJIIZILJ()).getMainTrack().LJIILLIIL().iterator();
                while (it.hasNext()) {
                    NLETrackSlot it2 = it.next();
                    o.LJIIIIZZ(it2, "it");
                    if (C124574uj.LJJIJIIJI(it2)) {
                        str = "1.0";
                    } else {
                        str = "0.0";
                    }
                    it2.setExtra("slot_mute_volume", str);
                }
            }
        }
        LJJIII(true);
        LJIL(this.LJIILLIIL, true);
        ArrayList<AVMusic> arrayList = this.LJIIIZ.LJ;
        arrayList.clear();
        arrayList.addAll(musicList);
        LJIIL(false);
        if (!C44701HgX.LJIILJJIL(LJIJ()) && (tracks = C79057V0z.LJJI(LJIIZILJ()).getTracks()) != null) {
            Iterator<NLETrack> it3 = tracks.iterator();
            while (true) {
                if (it3.hasNext()) {
                    nLETrack2 = it3.next();
                    NLETrack nLETrack3 = nLETrack2;
                    if (C124574uj.LJJIL(nLETrack3) || C124574uj.LJJJ(nLETrack3)) {
                        break;
                    }
                } else {
                    nLETrack2 = null;
                    break;
                }
            }
            NLETrack nLETrack4 = nLETrack2;
            if (nLETrack4 != null && (nLENode = (NLENode) ORZ.LJLLLL(nLETrack4.LJIILLIIL())) != null && nLENode.hasExtra("audio_stick_points") && nLENode.hasExtra("manual_music_beats")) {
                nLENode.removeExtraWithKey("audio_stick_points");
            }
        }
        if (!z) {
            if (this.LJIILLIIL) {
                Iterator<NLETrackSlot> it4 = LJIJJ().getMainTrack().LJIILLIIL().iterator();
                while (it4.hasNext()) {
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it4.next().LJI());
                    if (LJJ != null) {
                        NLEResourceAV LJ = LJJ.LJ();
                        String LIZJ = LJJ.LJ().LIZJ();
                        o.LJIIIIZZ(LIZJ, "it.avFile.resourceFile");
                        EnumC123874tb LJFF = LJJ.LJ().LJFF();
                        o.LJIIIIZZ(LJFF, "it.avFile.resourceType");
                        LJ.setDuration(C78926UyI.LJJJI(C124574uj.LIZJ(LIZJ, LJFF, this.LIZ).LJLJJL));
                    }
                }
                C79057V0z.LJIIL(LJIIZILJ());
            }
            LJIJJ().setExtra("stick_point_on_off_key", String.valueOf(this.LJIILLIIL));
            if (this.LJIILLIIL) {
                C124614un.LJI(LJIJJ(), true);
                VideoPublishEditModel LJIJ4 = LJIJ();
                if ((LJIJ4 == null || !LJIJ4.mIsFromDraft) && (((LJIJ = LJIJ()) == null || !LJIJ.isFromCrash()) && !((Boolean) C126574xx.LIZ.getValue()).booleanValue())) {
                    C124614un.LJIILLIIL(LJIJJ());
                }
            } else {
                C124614un.LJI(LJIJJ(), C127694zl.LIZ);
            }
            VecNLETrackSPtr tracks2 = LJIJJ().getTracks();
            o.LJIIIIZZ(tracks2, "nleModel.tracks");
            Iterator<NLETrack> it5 = tracks2.iterator();
            while (true) {
                if (it5.hasNext()) {
                    nLETrack = it5.next();
                    if (o.LJ(nLETrack.getExtra("AudioTrackType"), "BGM")) {
                        break;
                    }
                } else {
                    nLETrack = null;
                    break;
                }
            }
            NLETrack nLETrack5 = nLETrack;
            if (nLETrack5 != null) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack5.LJIILLIIL());
                C124574uj.LJJLIIIJILLIZJL(nLETrack5, "audio");
                nLETrack5.LJIL(EnumC123864ta.AUDIO);
                if (nLETrackSlot != null) {
                    String LJ2 = nLETrackSlot.LJI().LIZIZ().LJ();
                    if (LJ2 == null || LJ2.length() == 0) {
                        VideoPublishEditModel LJIJ5 = LJIJ();
                        if (LJIJ5 != null && (creativeModel = LJIJ5.creativeModel) != null) {
                            musicBuzModel2 = creativeModel.musicBuzModel;
                        } else {
                            musicBuzModel2 = null;
                        }
                        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel2);
                        if (extractAVMusic != null) {
                            nLETrackSlot.LJI().LIZIZ().LJIIJJI(extractAVMusic.musicName);
                            String musicId = extractAVMusic.getMusicId();
                            if (musicId == null) {
                                musicId = "";
                            }
                            nLETrackSlot.setExtra("slot_extra_music_id", musicId);
                        }
                    }
                    if (nLETrackSlot.getEndTime() == -2) {
                        C79057V0z.LJJI(LJIIZILJ()).getMeasuredEndTime();
                        nLETrackSlot.setEndTime(Math.min(nLETrackSlot.LJI().LIZIZ().getDuration(), LJIJJ().getMeasuredEndTime()));
                    }
                    VideoPublishEditModel LJIJ6 = LJIJ();
                    if (LJIJ6 != null && (creativeModel2 = LJIJ6.creativeModel) != null) {
                        musicBuzModel3 = creativeModel2.musicBuzModel;
                    } else {
                        musicBuzModel3 = null;
                    }
                    AVMusic extractAVMusic2 = MusicBeanUtilKt.extractAVMusic(musicBuzModel3);
                    if (extractAVMusic2 != null && !TextUtils.isEmpty(extractAVMusic2.path)) {
                        String audioPath = HOH.LIZLLL(extractAVMusic2);
                        if (C53235Kut.LIZ()) {
                            if (!C78685UuP.LJJJZ(audioPath) || !C39579Fg7.LIZIZ(audioPath)) {
                                audioPath = extractAVMusic2.path;
                            }
                        } else if (!C78685UuP.LJJJZ(audioPath)) {
                            audioPath = extractAVMusic2.path;
                        }
                        o.LJIIIIZZ(audioPath, "audioPath");
                        nLETrackSlot.setExtra("shoot_duration", String.valueOf(HOH.LJ(extractAVMusic2, audioPath)));
                    }
                }
            }
            EditorProContext editorContext = LJIIZILJ();
            o.LJIIIZ(editorContext, "editorContext");
            NLETrack LJIJI = C32151Nz.LJIJI(editorContext);
            if (LJIJI != null) {
                VecNLETrackSPtr tracks3 = C79057V0z.LJJI(editorContext).getTracks();
                o.LJIIIIZZ(tracks3, "editorContext.getNLEModel().tracks");
                ArrayList arrayList2 = new ArrayList();
                Iterator<NLETrack> it6 = tracks3.iterator();
                while (it6.hasNext()) {
                    NLETrack next = it6.next();
                    NLETrack it7 = next;
                    o.LJIIIIZZ(it7, "it");
                    if (C124574uj.LJJJJLI(false, it7)) {
                        arrayList2.add(next);
                    }
                }
                Iterator it8 = arrayList2.iterator();
                if (it8.hasNext()) {
                    num = Integer.valueOf(((NLETimeSpaceNode) it8.next()).getLayer());
                    while (it8.hasNext()) {
                        Integer valueOf = Integer.valueOf(((NLETimeSpaceNode) it8.next()).getLayer());
                        if (num.compareTo(valueOf) > 0) {
                            num = valueOf;
                        }
                    }
                }
                if (LJIJI.getLayer() != 0) {
                    LJIJI.setLayer(0);
                    if (num != null && num.intValue() == 0) {
                        Iterator it9 = arrayList2.iterator();
                        while (it9.hasNext()) {
                            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) it9.next();
                            nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() + 1);
                        }
                    }
                    C79057V0z.LJIIL(editorContext);
                }
            }
            C79057V0z.LJIILJJIL(LJIIZILJ(), true);
            C79057V0z.LJJ(LJIIZILJ()).LJIIIZ(0L, 0L);
        }
    }

    @Override // X.InterfaceC132055Gf
    public final void LJIIJJI(C5H4 c5h4, C132115Gl mobBean) {
        Long l;
        MusicBuzModel musicBuzModel;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        String missionId;
        boolean z4;
        MusicBuzModel musicBuzModel2;
        MusicModel musicModel;
        String str3;
        SimpleEffect effectInfo;
        CreativeModel creativeModel;
        VideoPublishEditModel LJIJ;
        AVChallenge aVChallenge;
        NLETrack nLETrack;
        NLETimeSpaceNode nLETimeSpaceNode;
        CreativeModel creativeModel2;
        o.LJIIIZ(mobBean, "mobBean");
        C5ID c5id = this.LJJ;
        UrlModel urlModel = null;
        if (c5id != null) {
            l = c5id.LIZ();
        } else {
            l = null;
        }
        this.LJIL = l;
        if (LJIJ() != null) {
            VideoPublishEditModel LJIJ2 = LJIJ();
            if (LJIJ2 != null) {
                VideoPublishEditModel LJIJ3 = LJIJ();
                if (LJIJ3 != null && (creativeModel2 = LJIJ3.creativeModel) != null) {
                    musicBuzModel = creativeModel2.musicBuzModel;
                } else {
                    musicBuzModel = null;
                }
                if (MusicBeanUtilKt.extractAVMusic(musicBuzModel) != null && (nLETrack = (NLETrack) ORZ.LJLLLL(C32151Nz.LJIJJLI(LJIIZILJ()))) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LJLLLL(nLETrack.LJIILL())) != null) {
                    long startTime = nLETimeSpaceNode.getStartTime();
                    if (!C141085gG.LIZ() && e1.LIZ(31744, "studio_editor_pro_change_replace_sound_position", true, false)) {
                        this.LJIL = Long.valueOf(startTime / 1000);
                    }
                }
                String str4 = LJIJ2.mStickerID;
                if (str4 != null) {
                    str = (String) ORZ.LJLLLLLL(0, s.LJLJJL(str4, new String[]{","}, 0, 6));
                } else {
                    str = null;
                }
                ArrayList<TimeSpeedModelExtension> LJIIJJI = CameraComponentModel.LJIIJJI(LJIJ2.mVideoSegmentsDesc);
                List<AVChallenge> list = LJIJ2.challenges;
                if (list != null && (aVChallenge = (AVChallenge) ORZ.LJLLLLLL(0, list)) != null) {
                    str2 = aVChallenge.cid;
                } else {
                    str2 = null;
                }
                String str5 = LJIJ2.mFirstStickerMusicIdsJson;
                boolean isAllowClearMusic = LJIJ2.isAllowClearMusic();
                if (LJIJ2.isPhotoMvMode || ((LJIJ = LJIJ()) != null && H7R.LJJJJL(LJIJ))) {
                    z = true;
                } else {
                    z = false;
                }
                String str6 = LJIJ2.mShootWay;
                String creationId = LJIJ2.getCreationId();
                EditorProContext LJIIZILJ = LJIIZILJ();
                o.LJIIIZ(LJIIZILJ, "<this>");
                if (LJIIZILJ.getMainTrack().getMeasuredEndTime() >= 61000000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ORZ.LJLLLL(LJIIJJI);
                if (timeSpeedModelExtension != null) {
                    z3 = timeSpeedModelExtension.isBusiSticker();
                } else {
                    z3 = false;
                }
                boolean useMusicBeatSticker = LJIJ2.useMusicBeatSticker();
                boolean LJJJJL = H7R.LJJJJL(LJIJ2);
                long j = LJIJ2.maxDuration;
                long measuredEndTime = LJIIZILJ().getMainTrack().getMeasuredEndTime() / 1000;
                C145335n7.LLIIJI.getClass();
                Mission mission = LJIJ2.creativeModel.commerceModel.getMission();
                if (mission == null) {
                    missionId = null;
                } else {
                    missionId = mission.getMissionId();
                }
                String LIZ = C142665io.LIZ(LJIJ2);
                if (!LJIJ2.isDuet() && !LJIJ2.isStickPointMode && !H7R.LJJJJL(LJIJ2)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String str7 = mobBean.LIZ;
                String str8 = mobBean.LIZIZ;
                VideoPublishEditModel LJIJ4 = LJIJ();
                if (LJIJ4 != null && (creativeModel = LJIJ4.creativeModel) != null) {
                    musicBuzModel2 = creativeModel.musicBuzModel;
                } else {
                    musicBuzModel2 = null;
                }
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel2);
                if (extractAVMusic != null) {
                    musicModel = I9S.LIZ(extractAVMusic);
                } else {
                    musicModel = null;
                }
                String musicOriginWithCheck = LJIJ2.getMusicOriginWithCheck();
                FlowDataMusicInfo flowDataMusicInfo = LJIJ2.creativeFlowData.getFlowDataMusicInfo();
                if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
                    str3 = "auto";
                } else {
                    str3 = "manual";
                }
                TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) ORZ.LJLLLL(LJIIJJI);
                if (timeSpeedModelExtension2 != null && (effectInfo = timeSpeedModelExtension2.getEffectInfo()) != null) {
                    urlModel = effectInfo.getIconUrl();
                }
                V0O v0o = new V0O(str5, str, str2, isAllowClearMusic, z, false, str6, creationId, z2, z3, useMusicBeatSticker, LJJJJL, j, measuredEndTime, missionId, LIZ, z4, str7, str8, musicModel, musicOriginWithCheck, str3, urlModel);
                V0N v0n = this.LJIIIIZZ;
                ActivityC45651qj activityC45651qj = this.LIZ;
                AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 629);
                AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 1015);
                UrlModel reuseOriginalSoundUrls = LJIJ2.getReuseOriginalSoundUrls();
                int reuseOriginalSoundLength = LJIJ2.getReuseOriginalSoundLength();
                String reuseOriginalSoundId = LJIJ2.getReuseOriginalSoundId();
                v0n.getClass();
                V0N.LJJIJLIJ(activityC45651qj, v0o, aqS168S0100000_2, aqS152S0100000_2, reuseOriginalSoundUrls, reuseOriginalSoundLength, reuseOriginalSoundId);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJIL(boolean z, boolean z2) {
        if (z2 || z != this.LJIILLIIL) {
            this.LJIILLIIL = z;
            C79057V0z.LJJJJL(LJIIZILJ(), "status_music_sync_on", Boolean.valueOf(z));
            C79057V0z.LJJI(LJIIZILJ()).setExtra("stick_point_on_off_key", String.valueOf(z));
        }
    }

    public static void LJIILL(C5I4 c5i4, boolean z, boolean z2, int i) {
        boolean z3;
        NLETrackSlot nLETrackSlot;
        boolean z4 = z2;
        boolean z5 = true;
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z4 = false;
        }
        NLETrack LJIJI = C32151Nz.LJIJI(c5i4.LJIIZILJ());
        if (LJIJI == null) {
            return;
        }
        VecNLETrackSlotSPtr LJIILLIIL = LJIJI.LJIILLIIL();
        if (LJIILLIIL.size() > 0 && (nLETrackSlot = LJIILLIIL.get(0)) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C125024vS c125024vS = AudioViewModel.Companion;
            ActivityC45651qj activity = c5i4.LIZ;
            c125024vS.getClass();
            o.LJIIIZ(activity, "activity");
            boolean deleteAudio = ((AudioViewModel) C5G0.LIZ(AudioViewModel.class)).deleteAudio(nLETrackSlot, c5i4.LJIIZILJ());
            FMX.LJIIL("acc_advanced_edit_delete_audio_clip_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis, "acc_advanced_edit_delete_audio_clip_duration").LIZ);
            if (!LJIJI.LJIILLIIL().contains(nLETrackSlot)) {
                z5 = false;
            }
            if (!deleteAudio || z5) {
                H7C.LJI(3, "music", "deleteMusic", "delete Music failed.");
                return;
            }
        }
        C124604um.LJIIIIZZ(C79057V0z.LJJI(c5i4.LJIIZILJ()));
        LJJI(c5i4, null, false, z4, 2);
        if (!z3) {
            return;
        }
        C139795eB c139795eB = new C139795eB(EnumC126814yL.DELETE.getNameId(), null, null, null, null, 30);
        if (z) {
            C79057V0z.LJIILL(c5i4.LJIIZILJ(), C6YK.LIZ(c139795eB));
        } else {
            C79057V0z.LJIIL(c5i4.LJIIZILJ());
        }
    }

    @Override // X.InterfaceC132055Gf
    public final void LJII(AVMusic aVMusic, boolean z, boolean z2, final C5IG c5ig) {
        long j;
        boolean z3;
        NLEStyCrop nLEStyCrop;
        AVMusic aVMusic2;
        CreativeModel creativeModel;
        VideoPublishEditModel LJIJ;
        String str;
        if (z2 && (LJIJ = LJIJ()) != null) {
            EditorProContext editorContext = LJIIZILJ();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJIJ, editorContext);
            if (z) {
                str = "sync_on";
            } else {
                str = "sync_off";
            }
            LJFF.LJI("to_status", str);
            LJFF.LIZ(1, "is_editor_pro");
            FMX.LJIIL("change_sync_mode", LJFF.LIZ);
        }
        String str2 = null;
        r7 = null;
        MusicBuzModel musicBuzModel = null;
        int i = 0;
        if (z) {
            this.LIZ.runOnUiThread(new ARunnableS21S0200000_2(c5ig, this, 67));
            VideoPublishEditModel LJIJ2 = LJIJ();
            if (LJIJ2 != null && (creativeModel = LJIJ2.creativeModel) != null) {
                musicBuzModel = creativeModel.musicBuzModel;
            }
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
            if (aVMusic != null) {
                extractAVMusic = aVMusic;
            } else if (extractAVMusic == null && ((aVMusic2 = this.LJIIL) == null || !aVMusic2.isLocalMusic())) {
                extractAVMusic = this.LJIIL;
            }
            C5I9 c5i9 = this.LJIIIZ;
            if (extractAVMusic != null) {
                i = extractAVMusic.getMusicStartFromCut();
            }
            InterfaceC126004x2 interfaceC126004x2 = new InterfaceC126004x2() { // from class: X.5I5
                @Override // X.InterfaceC126004x2
                public final void onFailed() {
                    C5I4 c5i4 = C5I4.this;
                    c5i4.LIZ.runOnUiThread(new ARunnableS21S0200000_2(c5ig, c5i4, 68));
                }

                @Override // X.InterfaceC126004x2
                public final void LIZ(int i2) {
                    DialogC135575Tt LJIJI;
                    C5I4 c5i4 = C5I4.this;
                    if (c5i4.LJIIJ) {
                        c5i4.LJIIJ = false;
                        DialogC135575Tt LJIJI2 = c5i4.LJIJI();
                        if (LJIJI2 != null && LJIJI2.isShowing() && (LJIJI = C5I4.this.LJIJI()) != null) {
                            LJIJI.dismiss();
                        }
                        C5I4.this.LJIJ.removeCallbacksAndMessages(null);
                        C5I4 c5i42 = C5I4.this;
                        c5i42.LJIILLIIL = true;
                        C5I4.LJJI(c5i42, c5i42.LJIIIZ.LIZJ, false, false, 6);
                        C5I4.this.LJIL(true, true);
                        C5IG c5ig2 = c5ig;
                        if (c5ig2 != null) {
                            c5ig2.onSuccess();
                        }
                        H7C.LJI(3, "music", "startMusicSync", "Music Sync success");
                    }
                }
            };
            c5i9.getClass();
            C10H c10h = new C10H();
            ((ArrayList) c5i9.LJFF).add(c10h);
            C10K.LIZIZ(new ACallableS28S0301000_2(i, extractAVMusic, interfaceC126004x2, c5i9, 0), C10K.LJII, c10h.LIZIZ());
            return;
        }
        boolean LIZ = true ^ e1.LIZ(31744, "studio_editor_pro_enable_music_when_cancel_soundsync", true, false);
        C5I9 c5i92 = this.LJIIIZ;
        NLEModel LJJI = C79057V0z.LJJI(c5i92.LIZ());
        NLETrack mainTrack = LJJI.getMainTrack();
        if (mainTrack != null) {
            j = mainTrack.LJIIJJI();
        } else {
            j = 0;
        }
        C124614un.LJI(C79057V0z.LJJI(c5i92.LIZ()), false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("slots before:");
        LIZ2.append(LJJI.getMainTrack().LJIILLIIL());
        LIZ2.append(' ');
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ2));
        Iterator<NLETrackSlot> it = LJJI.getMainTrack().LJIILLIIL().iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot = next;
                NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
                nLESegmentVideo.LJJIII(LJJ.LJJI());
                nLESegmentVideo.LJIILL(NLEResourceAV.LJIILL(LJJ.LIZIZ().deepClone()));
                nLESegmentVideo.LJIJJLI(0L);
                nLESegmentVideo.LJIJJ(LJJ.LIZIZ().getDuration() + nLESegmentVideo.LJIILIIL());
                C124574uj.LJJLIIIIJ(nLESegmentVideo);
                NLESegmentVideo LJJ2 = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
                if (LJJ2 != null) {
                    nLEStyCrop = LJJ2.LJJIFFI();
                } else {
                    nLEStyCrop = null;
                }
                nLESegmentVideo.LJJIIJ(nLEStyCrop);
                nLETrackSlot2.LJIIL(nLESegmentVideo);
                Iterator<String> it2 = nLETrackSlot.getExtraKeys().iterator();
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    nLETrackSlot2.setExtra(next2, nLETrackSlot.getExtra(next2));
                }
                nLETrackSlot2.LJIIJJI(nLETrackSlot.LIZLLL());
                nLETrackSlot2.LJIILJJIL(nLETrackSlot.LJIIIIZZ());
                VecNLEVideoEffectSPtr LJIIJ = nLETrackSlot.LJIIJ();
                ArrayList arrayList = new ArrayList();
                Iterator<NLEVideoEffect> it3 = LJIIJ.iterator();
                while (it3.hasNext()) {
                    NLEVideoEffect next3 = it3.next();
                    NLEVideoEffect it4 = next3;
                    o.LJIIIIZZ(it4, "it");
                    if (C124614un.LJIIJ(it4)) {
                        arrayList.add(next3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) it5.next();
                        NLEEditorJniJNI.NLETrackSlot_addVideoEffect(nLETrackSlot2.LIZ, nLETrackSlot2, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
                    }
                }
                VecNLEFilterSPtr LJ = nLETrackSlot.LJ();
                ArrayList arrayList2 = new ArrayList();
                Iterator<NLEFilter> it6 = LJ.iterator();
                while (it6.hasNext()) {
                    NLEFilter next4 = it6.next();
                    NLEFilter it7 = next4;
                    o.LJIIIIZZ(it7, "it");
                    if (C124614un.LJIIJJI(it7)) {
                        arrayList2.add(next4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        NLEFilter nLEFilter = (NLEFilter) it8.next();
                        NLEEditorJniJNI.NLETrackSlot_addFilter(nLETrackSlot2.LIZ, nLETrackSlot2, NLEFilter.LIZ(nLEFilter), nLEFilter);
                    }
                }
                LJJI.getMainTrack().LJIJJLI(nLETrackSlot);
                LJJI.getMainTrack().LIZLLL(nLETrackSlot2, i);
                str2 = null;
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("slots after:");
        LIZ3.append(LJJI.getMainTrack().LJIILLIIL());
        LIZ3.append(' ');
        H7C.LJI(3, "music", str2, X1D.LIZIZ(LIZ3));
        Iterator<NLETrackSlot> it9 = c5i92.LIZ().getMainTrack().LJIILLIIL().iterator();
        while (it9.hasNext()) {
            NLETrackSlot slot = it9.next();
            o.LJIIIIZZ(slot, "slot");
            if (C124574uj.LJJIJIIJI(slot)) {
                slot.setExtra("slot_mute_volume", "1.0");
            }
        }
        NLETrack LIZIZ = C141335gf.LIZIZ(LJJI);
        if (LIZIZ != null) {
            Iterator<NLETrackSlot> it10 = LIZIZ.LJIILLIIL().iterator();
            int i3 = 0;
            while (it10.hasNext()) {
                NLETrackSlot next5 = it10.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    NLETrackSlot slot2 = next5;
                    o.LJIIIIZZ(slot2, "slot");
                    if (NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, slot2.LJI()) != null) {
                        slot2.setExtra("slot_mute_volume", "1.0");
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        c5i92.LIZ().getEditor().LJJIJIIJI(false, EnumC124724uy.NONE);
        if (LIZ) {
            Iterator it11 = ((ArrayList) C32151Nz.LJIJJLI(c5i92.LIZ())).iterator();
            int i5 = 0;
            while (it11.hasNext()) {
                C79057V0z.LJJI(c5i92.LIZ()).removeTrack((NLETrack) it11.next());
                i5++;
            }
            VecNLETrackSPtr sortedTracks = C79057V0z.LJJI(c5i92.LIZ()).getSortedTracks();
            o.LJIIIIZZ(sortedTracks, "editorContext.getNLEModel().sortedTracks");
            ArrayList arrayList3 = new ArrayList();
            Iterator<NLETrack> it12 = sortedTracks.iterator();
            while (it12.hasNext()) {
                NLETrack next6 = it12.next();
                NLETrack it13 = next6;
                o.LJIIIIZZ(it13, "it");
                if (C124574uj.LJJJJLI(true, it13)) {
                    arrayList3.add(next6);
                }
            }
            for (NLETimeSpaceNode nLETimeSpaceNode : ORZ.LLILII(new IDComparatorS30S0000000_2(32), arrayList3)) {
                nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() - i5);
            }
        } else if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_AUTO_ALIGN_BGM, Boolean.FALSE)).booleanValue()) {
            C124614un.LIZIZ(j, c5i92.LIZ());
        }
        C124864vC.LIZLLL(C79057V0z.LJJI(c5i92.LIZ()));
        C124864vC.LIZJ(C79057V0z.LJJI(c5i92.LIZ()), c5i92.LIZ);
        c5i92.LIZ().getPlayer().M9(0L);
        if (LIZ) {
            z3 = false;
            c5i92.LIZIZ.LJJII(false);
        } else {
            z3 = false;
        }
        C127764zs.LJJIFFI(this.LIZIZ, null, 3);
        this.LJIILLIIL = z3;
        if (LIZ) {
            LJJI(this, null, z3, z3, 6);
        }
        LJIL(z3, true);
        c5ig.onSuccess();
    }

    public final void LJIILIIL(boolean z, EnumC124724uy enumC124724uy, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (enumC124724uy == EnumC124724uy.COMMIT) {
            interfaceC65784Pro.invoke();
            C79057V0z.LJIIL(LJIIZILJ());
            return;
        }
        if (z) {
            C32151Nz.LIZJ(LJIIZILJ());
        } else {
            C32151Nz.LJJIJIL(LJIIZILJ());
        }
        Long l = this.LJIL;
        if (l != null) {
            long longValue = l.longValue();
            if (!z2) {
                LJIIZILJ().getPlayer().M9(longValue * 1000);
            }
        }
        this.LJIL = null;
    }

    public static void LJJI(C5I4 c5i4, AVMusic aVMusic, boolean z, boolean z2, int i) {
        MusicBuzModel musicBuzModel;
        int i2;
        String musicId;
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        String str = "";
        if (c5i4.LJJ != null && !z2) {
            if (aVMusic != null) {
                C5I7.LIZ(aVMusic);
                EditorProContext LJIIZILJ = c5i4.LJIIZILJ();
                String musicId2 = aVMusic.getMusicId();
                if (musicId2 != null) {
                    str = musicId2;
                }
                C124574uj.LJJLIIIJ(LJIIZILJ, "value_current_used_music_id", str);
                return;
            }
            return;
        }
        VideoPublishEditModel LJIJ = c5i4.LJIJ();
        MusicBuzModel musicBuzModel2 = null;
        if (LJIJ != null && (creativeModel2 = LJIJ.creativeModel) != null) {
            musicBuzModel = creativeModel2.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        if (o.LJ(MusicBeanUtilKt.extractAVMusic(musicBuzModel), aVMusic) && !z) {
            return;
        }
        if (aVMusic != null) {
            c5i4.LJJ(aVMusic);
            C5I7.LIZ(aVMusic);
            i2 = aVMusic.getMusicStartFromCut();
        } else {
            i2 = 0;
        }
        c5i4.LJIILJJIL = i2;
        VideoPublishEditModel LJIJ2 = c5i4.LJIJ();
        if (LJIJ2 != null && (creativeModel = LJIJ2.creativeModel) != null) {
            musicBuzModel2 = creativeModel.musicBuzModel;
        }
        I9T.LJI(aVMusic, false, musicBuzModel2);
        EditorProContext LJIIZILJ2 = c5i4.LJIIZILJ();
        if (aVMusic != null && (musicId = aVMusic.getMusicId()) != null) {
            str = musicId;
        }
        C124574uj.LJJLIIIJ(LJIIZILJ2, "value_current_used_music_id", str);
        c5i4.LJJII(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.4uy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [T, X.4uy] */
    @Override // X.InterfaceC132055Gf
    public final void LJI(AVMusic music, String str, String str2, boolean z, Long l, InterfaceC65784Pro<C76800UCe> alreadyCommit) {
        o.LJIIIZ(music, "music");
        o.LJIIIZ(alreadyCommit, "alreadyCommit");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = EnumC124724uy.DONE;
        if (z) {
            c68322mC.element = EnumC124724uy.COMMIT;
        }
        EditorProContext LJIIZILJ = LJIIZILJ();
        o.LJIIIZ(LJIIZILJ, "<this>");
        if (LJIIZILJ.getPlayer().s5() >= 61000 && 1 != 0 && !music.isPgc() && !C5IF.LIZ()) {
            this.LIZ.runOnUiThread(new ARunnableS38S0100000_2(this, 193));
            LJJI(this, null, false, false, 6);
            return;
        }
        long LJ = HOH.LJ(music, str);
        C72242sW c72242sW = new C72242sW();
        if (music.getMusicEndFromCut() != 0) {
            LJ = Math.min(music.getMusicEndFromCut() - music.getMusicStartFromCut(), LJ);
        }
        c72242sW.element = LJ;
        if (!C5IF.LIZ()) {
            long j = c72242sW.element;
            long LJIJJLI = C79057V0z.LJIJJLI(LJIIZILJ());
            if (!music.isPgc()) {
                long j2 = this.LIZLLL + LJIJJLI;
                long j3 = this.LIZJ;
                if (j2 < j3) {
                    if (LJIJJLI + j >= j3) {
                        j = (j3 - LJIJJLI) - this.LJ;
                    }
                }
                this.LIZ.runOnUiThread(new ARunnableS38S0100000_2(this, 194));
                LJJI(this, null, false, false, 6);
                return;
            }
            if (j != 0) {
                c72242sW.element = j;
            }
            this.LIZ.runOnUiThread(new ARunnableS38S0100000_2(this, 194));
            LJJI(this, null, false, false, 6);
            return;
        }
        boolean isEmpty = ((ArrayList) C32151Nz.LJIJJLI(LJIIZILJ())).isEmpty();
        if (!this.LJIILLIIL) {
            long j4 = 1000;
            long LJIJJLI2 = C79057V0z.LJIJJLI(LJIIZILJ()) * j4;
            if (l != null) {
                LJIJJLI2 = l.longValue() * j4;
            }
            LJJIFFI(isEmpty, music, str, c72242sW.element, str2, LJIJJLI2, z);
            LJIILIIL(isEmpty, (EnumC124724uy) c68322mC.element, false, alreadyCommit);
        } else {
            LJIIZILJ().getPlayer().da(Boolean.TRUE, new AqS0S2520000_2(this, isEmpty, music, str, c72242sW, str2, z, c68322mC, alreadyCommit, 0));
        }
        String musicId = music.getMusicId();
        o.LJIIIIZZ(musicId, "music.musicId");
        C138615cH.LIZIZ(musicId, C5I8.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJJLI(AVMusic music, String path, long j, long j2, boolean z, EnumC124724uy commitLevel) {
        long currentTimeMillis;
        long j3 = j2;
        o.LJIIIZ(music, "music");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(commitLevel, "commitLevel");
        String str = music.musicName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String musicId = music.getMusicId();
        if (musicId != null) {
            str2 = musicId;
        }
        SelectedMusicInfo LIZ = C124604um.LIZ(str, path, str2);
        long LIZ2 = HOH.LIZ(music.getDuration(), path);
        long LJ = HOH.LJ(music, path);
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            if ((C124574uj.LIZLLL(C79057V0z.LJJI(LJIIZILJ())) - j) / 1000 < ((Number) C5BA.LIZ(EnumC127484zQ.IMPORT_LIMIT, 100)).intValue()) {
                C78920UyC.LIZLLL(R.string.ca4, this.LIZ, 6007);
                return;
            }
        }
        InterfaceC125004vQ editor = LJIIZILJ().getEditor();
        String title = LIZ.getTitle();
        String path2 = LIZ.getPath();
        String musicId2 = LIZ.getMusicId();
        if (j3 == 0) {
            j3 = (Math.min(LJ, LIZ2 - music.getMusicStartFromCut()) * 1000) + j;
        }
        NLETrackSlot LJJJJLI = editor.LJJJJLI(new C124844vA(title, path2, musicId2, j, j3, false, null == true ? 1 : 0, 1000 * music.getMusicStartFromCut(), null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 14944), commitLevel);
        if (LJJJJLI != null) {
            LJJJJLI.setExtra("is_editor_pro_add_sound_used", "true");
            LJJJJLI.setExtra("is_editorpro_add_music_material", "1");
            String enterSelectMusicTimeString = C79057V0z.LJJI(LJIIZILJ()).getExtra("enter_select_music_time");
            if (C78685UuP.LJJJZ(enterSelectMusicTimeString)) {
                o.LJIIIIZZ(enterSelectMusicTimeString, "enterSelectMusicTimeString");
                currentTimeMillis = CastLongProtector.parseLong(enterSelectMusicTimeString);
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            LJJJJLI.setExtra("add_music_material_duration", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            LJJJJLI.setExtra("shoot_duration", String.valueOf(LJ));
            LJJJJLI.setExtra("d_bgmId", music.getMusicId());
            LJJJJLI.setExtra("d_bgmName", music.getName());
            LJJJJLI.LJI().LIZIZ().setExtra("biz_res_id", C134305Ow.LIZIZ(music.getMusicId()));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Replace audio success, musicid: ");
            LIZ3.append(music.getMusicId());
            LIZ3.append(", shootDuration:");
            LIZ3.append(LJ);
            H7C.LJI(3, "music", "realAddMusic", X1D.LIZIZ(LIZ3));
            NLETrack trackBySlot = C79057V0z.LJJI(LJIIZILJ()).getTrackBySlot(LJJJJLI);
            if (trackBySlot != null) {
                LJIIZILJ().getPlayer().seek(TimeUnit.MICROSECONDS.toMillis(j));
                trackBySlot.setExtra("AudioTrackType", "BGM");
                trackBySlot.setExtra("use_music_in_editor_pro", "true");
                if (z) {
                    C79057V0z.LJJJJLI(LJIIZILJ(), "selected_audio_track_slot", LJJJJLI, true);
                }
            }
            LJJI(this, music, false, false, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIFFI(boolean z, AVMusic aVMusic, String str, long j, String str2, long j2, boolean z2) {
        long j3;
        String str3;
        NLETrackSlot nLETrackSlot;
        long j4;
        if (!z) {
            long j5 = 1000;
            long j6 = (j * j5) + j2;
            boolean z3 = !z2;
            String str4 = aVMusic.musicName;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            String musicId = aVMusic.getMusicId();
            if (musicId != null) {
                str5 = musicId;
            }
            SelectedMusicInfo LIZ = C124604um.LIZ(str4, str3, str5);
            long LIZ2 = HOH.LIZ(aVMusic.getDuration(), str);
            long LJ = HOH.LJ(aVMusic, str);
            NLETrack LJIJI = C32151Nz.LJIJI(LJIIZILJ());
            NLETrack nLETrack = null;
            if (LJIJI != null) {
                nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(LJIJI.LJIILLIIL());
            } else {
                nLETrackSlot = null;
            }
            InterfaceC125004vQ editor = LJIIZILJ().getEditor();
            String title = LIZ.getTitle();
            String path = LIZ.getPath();
            String musicId2 = LIZ.getMusicId();
            if (j6 == 0) {
                j6 = (Math.min(LJ, LIZ2 - aVMusic.getMusicStartFromCut()) * j5) + j2;
            }
            NLETrackSlot LJJJLIIL = editor.LJJJLIIL(nLETrackSlot, new C124844vA(title, path, musicId2, j2, j6, false, 0 == true ? 1 : 0, aVMusic.getMusicStartFromCut() * j5, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 15968), 0, EnumC124724uy.COMMIT);
            if (LJJJLIIL != null) {
                LJJJLIIL.setExtra("is_editor_pro_add_sound_used", "true");
                LJJJLIIL.setExtra("is_editorpro_add_music_material", "1");
            }
            String enterSelectMusicTimeString = C79057V0z.LJJI(LJIIZILJ()).getExtra("enter_select_music_time");
            if (C78685UuP.LJJJZ(enterSelectMusicTimeString)) {
                o.LJIIIIZZ(enterSelectMusicTimeString, "enterSelectMusicTimeString");
                j4 = CastLongProtector.parseLong(enterSelectMusicTimeString);
            } else {
                j4 = 0;
            }
            if (LJJJLIIL != null) {
                LJJJLIIL.setExtra("add_music_material_duration", String.valueOf(System.currentTimeMillis() - j4));
            }
            if (LJJJLIIL == null) {
                H7C.LJI(3, "music", "realReplaceMusic", "Replace audio failed.");
            } else {
                LJJJLIIL.setExtra("shoot_duration", String.valueOf(LJ));
                LJJJLIIL.setExtra("d_bgmId", aVMusic.getMusicId());
                LJJJLIIL.setExtra("d_bgmName", aVMusic.getName());
                LJJJLIIL.LJI().LIZIZ().setExtra("biz_res_id", C134305Ow.LIZIZ(aVMusic.getMusicId()));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Replace audio success, musicid: ");
                LIZ3.append(aVMusic.getMusicId());
                LIZ3.append(", shootDuration:");
                LIZ3.append(LJ);
                H7C.LJI(3, "music", "realReplaceMusic", X1D.LIZIZ(LIZ3));
                VecNLETrackSPtr sortedTracks = C79057V0z.LJJI(LJIIZILJ()).getSortedTracks();
                o.LJIIIIZZ(sortedTracks, "editorContext.getNLEModel().sortedTracks");
                Iterator<NLETrack> it = sortedTracks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    NLETrack next = it.next();
                    if (next.LJIILL().contains(LJJJLIIL)) {
                        nLETrack = next;
                        break;
                    }
                }
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2 != null) {
                    nLETrack2.setExtra("AudioTrackType", "BGM");
                    nLETrack2.setExtra("use_music_in_editor_pro", "true");
                    C122284r2.LIZ(C79057V0z.LJJ(LJIIZILJ()));
                }
                if (z3) {
                    C79057V0z.LJJJJLI(LJIIZILJ(), "selected_audio_track_slot", LJJJLIIL, true);
                }
                LJJI(this, aVMusic, false, false, 6);
            }
            j3 = 0;
        } else {
            j3 = 0;
            LJIJJLI(aVMusic, str, j2, (1000 * j) + j2, !z2, EnumC124724uy.COMMIT);
        }
        PerformanceMonitor remove = C5IO.LIZ.remove(aVMusic.getMusicId());
        if (remove != null) {
            G8G.LIZ.end(remove, "edit pro page choose music end", j3);
        }
        if (!z2) {
            C132385Hm.LJIIJ(str2, LJIIZILJ());
        }
        C5I7.LIZ(aVMusic);
    }
}
