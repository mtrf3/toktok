package X;

import Y.ACallableS105S0100000_2;
import Y.AObjectS84S0100000_2;
import Y.AObjectS86S0100000_7;
import Y.ARunnableS38S0100000_2;
import Y.IDDListenerS146S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.ImageView;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MusicSyncData;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS12S0010000_7;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS45S0110000_2;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I6c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46066I6c extends AbstractC46064I6a implements I74 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLJJIJIL;
    public final WMH LLIL;
    public final int LLILII;
    public final InterfaceC146755pP LLILIL;
    public volatile boolean LLILL;
    public int LLILLIZIL;
    public OSZ<Long, Long> LLILLJJLI;
    public final InterfaceC115514g7 LLILLL;
    public final InterfaceC115514g7 LLILZ;
    public final InterfaceC115514g7 LLILZIL;
    public final InterfaceC115514g7 LLILZLL;
    public final InterfaceC115514g7 LLIZ;
    public final InterfaceC115514g7 LLIZLLLIL;
    public final InterfaceC115514g7 LLJ;
    public final C5H3 LLJI;
    public final InterfaceC115514g7 LLJIJIL;
    public C46072I6i LLJILJIL;
    public final InterfaceC115514g7 LLJILJILJ;
    public final InterfaceC115514g7 LLJILLL;
    public final InterfaceC45240HpE LLJJ;
    public final C5H3 LLJJI;
    public final C5H3 LLJJIII;
    public C29901Fi<C76800UCe> LLJJIJI;
    public C29901Fi<Boolean> LLJJIJIIJIL;

    public static void LLLLJI(AlertDialogC45239HpD alertDialogC45239HpD) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/autocut/util/AutoCutLoadingDialog", "show", alertDialogC45239HpD, new Object[0], "void", new C65300Pk0(false, "()V", "4966340515841023337")).LIZ) {
            return;
        }
        alertDialogC45239HpD.show();
    }

    @Override // X.InterfaceC146755pP
    public void dp() {
        this.LJLJLLL = true;
        LLLLJ();
    }

    static {
        TBT tbt = new TBT(C46066I6c.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLJJIJIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C46066I6c.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "editToolBarApi", "getEditToolBarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46066I6c.class, "audioEditApi", "getAudioEditApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0, c65351Pkp)};
    }

    private final InterfaceC147865rC LJLJLJ() {
        return (InterfaceC147865rC) this.LLILZIL.LIZ(this, LLJJIJIL[2]);
    }

    private final void LLLLJ() {
        float f;
        InterfaceC143855kj LLLLZLLIL;
        C63A c63a;
        NLEModel nLEModel = null;
        if (C44384HbQ.LJJIIZI(LJLIIL()) && this.LJLJLLL) {
            List<MultiEditVideoSegmentRecordData> list = LJLIIL().multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList;
            o.LJIIIIZZ(list, "editModel.multiEditVideo…ecordData.segmentDataList");
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                if (multiEditVideoSegmentRecordData.musicSyncData == null) {
                    OSZ osz = new OSZ(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
                    multiEditVideoSegmentRecordData.setStartTime(0L);
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    multiEditVideoSegmentRecordData.setEndTime(timeUnit.toMillis(multiEditVideoSegmentRecordData.videoLength));
                    multiEditVideoSegmentRecordData.musicSyncData = new MusicSyncData(((Number) osz.getFirst()).longValue(), ((Number) osz.getSecond()).longValue(), timeUnit.toMillis(multiEditVideoSegmentRecordData.videoLength));
                }
            }
            LJJLL().LJIILL();
            if (LJLIIL().mIsFromDraft) {
                AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLL(LJLIIL().creativeModel.autoCutModel.templateList);
                if (autoCutThemeData != null) {
                    c63a = autoCutThemeData.LIZ();
                } else {
                    c63a = null;
                }
                if (c63a == C63A.SOUND_SYNC && !C44701HgX.LIZJ(LJLIIL())) {
                    AnonymousClass636.LJIJJLI(LJLIIL().creativeModel.autoCutModel, -1, null, -1, null, null);
                    LLJI();
                    InterfaceC153275zv LLLZIIL = LLLZIIL();
                    if (LLLZIIL != null) {
                        LLLZIIL.b2(15, true);
                    }
                }
            }
        }
        LJJLL().LJIJJ(this.LLILLJJLI, false);
        if (this.LJLJLLL) {
            this.LJLJLLL = false;
            LJLIIL().editMusicSyncMode = false;
            this.LLJJIJIIJIL.LJII(Boolean.FALSE);
            if (C5TH.LIZ(LJLIIL()) && (LLLLZLLIL = LLLLZLLIL()) != null && LLLLZLLIL.Xg()) {
                InterfaceC143855kj LLLLZLLIL2 = LLLLZLLIL();
                if (LLLLZLLIL2 != null) {
                    LLLLZLLIL2.LE();
                }
                InterfaceC143855kj LLLLZLLIL3 = LLLLZLLIL();
                if (LLLLZLLIL3 != null) {
                    InterfaceC153045zY interfaceC153045zY = this.LJLLJ;
                    if (interfaceC153045zY != null) {
                        nLEModel = C17N.LJJ(interfaceC153045zY);
                    }
                    LLLLZLLIL3.Jp(nLEModel);
                }
            }
            EditAdjustClipsBottomViewModel LJJLIIJ = LJJLIIJ();
            LJJLIIJ.getClass();
            LJJLIIJ.setStateImmediate(new AqS12S0010000_7(false, 11));
            LJLIIL().voiceVolume = 1.0f;
            LLZLLIL(false);
        }
        LJJLIIJ().setStateImmediate(I75.LJLIL);
        EditAdjustClipsBottomViewModel LJJLIIJ2 = LJJLIIJ();
        InterfaceC46045I5h interfaceC46045I5h = this.LJLLL;
        if (interfaceC46045I5h != null) {
            f = interfaceC46045I5h.getSelectedTime();
        } else {
            f = 0.0f;
        }
        LJJLIIJ2.Pv0(f);
    }

    private final C5VE LLLLLJIL() {
        return (C5VE) this.LLJILLL.LIZ(this, LLJJIJIL[9]);
    }

    private final InterfaceC146665pG LLLLLZIL() {
        return (InterfaceC146665pG) this.LLIZ.LIZ(this, LLJJIJIL[4]);
    }

    private final InterfaceC145455nJ LLLLZI() {
        return (InterfaceC145455nJ) this.LLILZLL.LIZ(this, LLJJIJIL[3]);
    }

    private final InterfaceC145485nM LLLLZIL() {
        return (InterfaceC145485nM) this.LLILZ.LIZ(this, LLJJIJIL[1]);
    }

    private final InterfaceC145325n6 LLLLZLL() {
        return (InterfaceC145325n6) this.LLJILJILJ.LIZ(this, LLJJIJIL[8]);
    }

    private final InterfaceC143855kj LLLLZLLIL() {
        return (InterfaceC143855kj) this.LLJIJIL.LIZ(this, LLJJIJIL[7]);
    }

    private final InterfaceC139655dx LLLZ() {
        return (InterfaceC139655dx) this.LLJI.getValue();
    }

    private final InterfaceC153275zv LLLZIIL() {
        return (InterfaceC153275zv) this.LLIZLLLIL.LIZ(this, LLJJIJIL[5]);
    }

    private final C5XM LLLZLL() {
        return (C5XM) this.LLILLL.LIZ(this, LLJJIJIL[0]);
    }

    @Override // X.I74
    public void LJJJJZI() {
        this.LLJJIJIIJIL.LJII(Boolean.TRUE);
    }

    @Override // X.AbstractC46064I6a
    public String LJJLJ() {
        C46072I6i c46072I6i = this.LLJILJIL;
        if (c46072I6i != null) {
            AVMusic aVMusic = c46072I6i.LIZLLL;
            if (aVMusic == null) {
                return null;
            }
            return aVMusic.path;
        }
        o.LJIJI("musicSyncController");
        throw null;
    }

    @Override // X.AbstractC46064I6a
    public void LLJ() {
        C46072I6i c46072I6i = this.LLJILJIL;
        if (c46072I6i != null) {
            AbstractC46064I6a.LLIILZL.getClass();
            C136195Wd.LIZ("recoverMusicSyncMode");
            c46072I6i.LJIIIZ().LIZLLL(null, false);
            return;
        }
        o.LJIJI("musicSyncController");
        throw null;
    }

    @Override // X.AbstractC46064I6a
    public void LLJJ() {
        C78688UuS.LJIIJJI(this, new AqS173S0100000_7(this, 104));
        C44384HbQ.LJIIIIZZ(this, I7P.LJLIL);
        C82622Wbi LJJLIIIJILLIZJL = C44384HbQ.LJJLIIIJILLIZJL(this);
        if (LJJLIIIJILLIZJL != null) {
            this.LLJILJIL = (C46072I6i) LJJLIIIJILLIZJL.LJ(C46072I6i.class, null);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.AbstractC46064I6a
    public boolean LLLJIL() {
        C46072I6i c46072I6i = this.LLJILJIL;
        if (c46072I6i != null) {
            return c46072I6i.LIZJ;
        }
        o.LJIJI("musicSyncController");
        throw null;
    }

    public final AlertDialogC45239HpD LLLLLJLJLL() {
        return (AlertDialogC45239HpD) this.LLJJIII.getValue();
    }

    public final I7L LLLLLL() {
        return (I7L) this.LLJJI.getValue();
    }

    public final InterfaceC142515iZ LLLLLLIL() {
        return (InterfaceC142515iZ) this.LLJ.LIZ(this, LLJJIJIL[6]);
    }

    @Override // X.I6G
    public void kx() {
        AlertDialogC46073I6j alertDialogC46073I6j;
        C46072I6i c46072I6i = this.LLJILJIL;
        if (c46072I6i != null) {
            AbstractC46064I6a.LLIILZL.getClass();
            C136195Wd.LIZ("startSmartMusicSync");
            C46074I6k LJIIJJI = c46072I6i.LJIIJJI();
            List<VideoSegment> LJIIJ = c46072I6i.LJIIJ();
            LJIIJJI.LJIIJ = false;
            I7U i7u = LJIIJJI.LJFF;
            if (i7u != null) {
                i7u.onStart();
            }
            if (C77413UZt.LJIILL(LJIIJ)) {
                LJIIJJI.LIZ(true, false, false);
            } else {
                InterfaceC153045zY interfaceC153045zY = LJIIJJI.LIZ;
                if (interfaceC153045zY == null) {
                    LJIIJJI.LIZ(false, false, false);
                } else {
                    LJIIJJI.LJIIJ = true;
                    interfaceC153045zY.cancelGenVideoFrame(LJIIJJI.LIZLLL);
                    LJIIJJI.LJIIL.removeCallbacksAndMessages(null);
                    LJIIJJI.LJIIJ = false;
                    LJIIJJI.LJIIIZ = 0.0f;
                    o.LJI(LJIIJ);
                    LJIIJJI.LJIIIIZZ = 1.0f / ((ArrayList) LJIIJ).size();
                    LJIIJJI.LIZIZ = 0;
                    LJIIJJI.LJ = LJIIJ;
                    VideoSegment videoSegment = (VideoSegment) ListProtector.get(LJIIJ, 0);
                    LJIIJJI.LIZJ = videoSegment;
                    o.LJI(videoSegment);
                    LJIIJJI.LIZLLL = videoSegment.videoIndex;
                    Activity activity = LJIIJJI.LJII;
                    if (activity != null && !activity.isFinishing() && (alertDialogC46073I6j = LJIIJJI.LJI) != null && !alertDialogC46073I6j.isShowing()) {
                        try {
                            AlertDialogC46073I6j alertDialogC46073I6j2 = LJIIJJI.LJI;
                            o.LJI(alertDialogC46073I6j2);
                            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/cut/stickingpoint/view/DmtCancelableProgressDialog", "show", alertDialogC46073I6j2, new Object[0], "void", new C65300Pk0(false, "()V", "8409962227673298924")).LIZ) {
                                alertDialogC46073I6j2.show();
                            }
                            AlertDialogC46073I6j alertDialogC46073I6j3 = LJIIJJI.LJI;
                            if (alertDialogC46073I6j3 != null && alertDialogC46073I6j3.isShowing()) {
                                AlertDialogC46073I6j alertDialogC46073I6j4 = LJIIJJI.LJI;
                                o.LJI(alertDialogC46073I6j4);
                                alertDialogC46073I6j4.LIZ(0);
                            }
                            C42303Gix.LIZ(1012, GGO.SHOW, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_VISIBLE, null);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    if (!LJIIJJI.LJIIJ) {
                        InterfaceC153045zY interfaceC153045zY2 = LJIIJJI.LIZ;
                        o.LJI(interfaceC153045zY2);
                        interfaceC153045zY2.LLIL(LJIIJJI.LIZLLL, new C46088I6y(LJIIJJI));
                    }
                }
            }
            C136195Wd c136195Wd = AbstractC46064I6a.LLIILZL;
            VideoPublishEditModel LJLIIL = LJLIIL();
            C43884HKe c43884HKe = C43884HKe.LJLIL;
            c136195Wd.getClass();
            C136195Wd.LIZIZ(LJLIIL, "apply_smart_sync", c43884HKe);
            return;
        }
        o.LJIJI("musicSyncController");
        throw null;
    }

    @Override // X.I6G
    public void AS() {
        Cut2EditTransferModel cut2EditTransferModel;
        List<AVMusic> musicList;
        if (LJJLIIJ().Ov0().getStickPointStatus() == 0) {
            return;
        }
        int i = 0;
        LJJLIIJ().Nv0(0);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJLIIL().creativeModel.musicBuzModel);
        if (extractAVMusic != null || ((cut2EditTransferModel = LJJLJLI().LJ) != null && (musicList = cut2EditTransferModel.getMusicList()) != null && (extractAVMusic = (AVMusic) ORZ.LJLLLLLL(0, musicList)) != null)) {
            H78.LIZ("force apply music sync with valid music");
            LJJLIIJ().Nv0(1);
            C46072I6i c46072I6i = this.LLJILJIL;
            if (c46072I6i != null) {
                C46072I6i.LJIILIIL(c46072I6i, extractAVMusic, LJLIIL().getMMusicStart(), 60);
                return;
            } else {
                o.LJIJI("musicSyncController");
                throw null;
            }
        }
        LJJLIIJ().Nv0(0);
        int size = LJJLL().LJII().size();
        StringBuilder sb = new StringBuilder();
        for (VideoSegment videoSegment : LJJLL().LJII()) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(videoSegment.duration);
                if (i < size - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C5IB.LIZ(HZU.LIZ(), C16880lQ.LLLLJ(C78688UuS.LJIJJ(this)), size, sb.toString(), new C46077I6n(this), null, new I76(this));
    }

    @Override // X.I74
    public void LJIIIZ() {
        Activity activity;
        Activity activity2;
        AlertDialogC45239HpD LLLLLJLJLL = LLLLLJLJLL();
        if (LLLLLJLJLL != null) {
            LLLLLJLJLL.LIZIZ();
        }
        AlertDialogC45239HpD LLLLLJLJLL2 = LLLLLJLJLL();
        if (LLLLLJLJLL2 != null) {
            LLLLJI(LLLLLJLJLL2);
        }
        I7L LLLLLL = LLLLLL();
        if (LLLLLL != null && (activity = LLLLLL.LIZIZ) != null && !activity.isFinishing()) {
            if (LLLLLL.LIZ == null && (activity2 = LLLLLL.LIZIZ) != null) {
                if (activity2 instanceof SAAActivity) {
                    ((SAAActivity) activity2).LLIIJI("getIntent", new AqS154S0200000_7(LLLLLL, activity2, 101));
                } else {
                    LLLLLL.LIZ = new DialogC135575Tt(activity2);
                }
            }
            DialogC135575Tt dialogC135575Tt = LLLLLL.LIZ;
            if (dialogC135575Tt != null && (!dialogC135575Tt.isShowing())) {
                LLLLLL.LIZJ.postDelayed(new ARunnableS38S0100000_2(dialogC135575Tt, 149), 0L);
            }
        }
        this.LLJJIJI.LJII(C76800UCe.LIZ);
    }

    @Override // X.AbstractC46064I6a
    public void LJJJJLI() {
        InterfaceC146665pG LLLLLZIL = LLLLLZIL();
        if (LLLLLZIL != null) {
            LLLLLZIL.LJJJJLI();
        }
    }

    @Override // X.AbstractC46064I6a
    public boolean LJLIL() {
        return LLLZ().LJLIL();
    }

    @Override // X.AbstractC46064I6a
    public void LLIIIILZ() {
        LJLJLJ().LLIIIILZ();
    }

    @Override // X.AbstractC46064I6a
    public void LLIIZ() {
        super.LLIIZ();
        if (C78946Uyc.LJIILL(LJJLJLI())) {
            C73297Sph.LIZLLL(this, LJJLIIJ(), new TBT() { // from class: X.I7K
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((EditAdjustClipsBottomViewState) obj).getRestoreMusicSyncEvent();
                }
            }, new AqS189S0100000_7(this, 15));
            LJLJJLL().Av().observe(this, new AObjectS86S0100000_7(this, 56));
            LJLLL().z3().LIZLLL(this, new AObjectS84S0100000_2(this, 71));
        }
    }

    @Override // X.AbstractC46064I6a
    public void LLIL() {
        LLLLZIL().LLIL();
    }

    @Override // X.AbstractC46064I6a
    public void LLJI() {
        InterfaceC153275zv LLLZIIL = LLLZIIL();
        if (LLLZIIL != null) {
            LLLZIIL.refresh();
        }
    }

    @Override // X.AbstractC46064I6a
    public void LLZIL() {
        LJLJLJ().LLZIL();
    }

    @Override // X.AbstractC46064I6a
    public boolean LLZZ() {
        return LJLJLJ().LLZZ();
    }

    @Override // X.AbstractC46064I6a
    public void Q9() {
        LLLLZIL().Q9();
        C5VE LLLLLJIL = LLLLLJIL();
        if (LLLLLJIL != null) {
            LLLLLJIL.UJ();
        }
    }

    @Override // X.InterfaceC146755pP
    public void TY() {
        LJJLIIJ().setState(I73.LJLIL);
    }

    @Override // X.InterfaceC146755pP
    public LiveEvent<Boolean> KC() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC146755pP
    public LiveEvent<C76800UCe> L90() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC46064I6a
    public int LJLZ() {
        return this.LLILLIZIL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C0I6 getApiComponent() {
        return this.LLILIL;
    }

    private final void LLLJL(boolean z) {
        AudioRecorderParam audioRecorderParam;
        InterfaceC153045zY interfaceC153045zY;
        LJJLL().LJIJJ(null, true);
        float f = 0.0f;
        if (!this.LJLJLLL) {
            this.LJLJLLL = true;
            EditAdjustClipsBottomViewModel LJJLIIJ = LJJLIIJ();
            LJJLIIJ.getClass();
            LJJLIIJ.setStateImmediate(new AqS12S0010000_7(true, 11));
            if ((!z || !C132385Hm.LJII(LJLIIL())) && !LJLIIL().mIsFromDraft) {
                LJLIIL().editMusicSyncMode = true;
                LJLIIL().voiceVolume = 0.0f;
                LLZLLIL(true);
            }
        }
        VideoPublishEditModel LJLIIL = LJLIIL();
        o.LJIIIZ(LJLIIL, "<this>");
        if (C44384HbQ.LJJIIZI(LJLIIL) && (audioRecorderParam = LJLIIL().veAudioRecorderParam) != null && audioRecorderParam.getNeedOriginalSound() && (interfaceC153045zY = this.LJLLJ) != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                C123454sv.LIZ(LJJI.LJIIJ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJJLIIJ().setStateImmediate(I75.LJLIL);
        EditAdjustClipsBottomViewModel LJJLIIJ2 = LJJLIIJ();
        InterfaceC46045I5h interfaceC46045I5h = this.LJLLL;
        if (interfaceC46045I5h != null) {
            f = interfaceC46045I5h.getSelectedTime();
        }
        LJJLIIJ2.Pv0(f);
    }

    private final void LLZLLIL(boolean z) {
        float f;
        VideoPublishEditModel LJLIIL = LJLIIL();
        o.LJIIIZ(LJLIIL, "<this>");
        if (!C44384HbQ.LJJIIZI(LJLIIL)) {
            C5XM LLLZLL = LLLZLL();
            if (LLLZLL != null) {
                LLLZLL.RU(!z);
                return;
            }
            return;
        }
        if (LJLIIL().veAudioRecorderParam == null) {
            LJLIIL().veAudioRecorderParam = new AudioRecorderParam();
        }
        AudioRecorderParam audioRecorderParam = LJLIIL().veAudioRecorderParam;
        if (audioRecorderParam != null) {
            audioRecorderParam.setHasOriginalSound(LJLIIL().hasOriginalSound(HRX.LIZLLL()));
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            audioRecorderParam.setVoiceVolume(f);
            if (audioRecorderParam.getNeedOriginalSound()) {
                audioRecorderParam.setMuteByAudioCopyright(false);
            }
        }
        InterfaceC153045zY interfaceC153045zY = this.LJLLJ;
        if (interfaceC153045zY == null) {
            return;
        }
        C5XM LLLZLL2 = LLLZLL();
        if (LLLZLL2 != null) {
            LLLZLL2.RU(!z);
        }
        C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
        if (LJJI != null) {
            C123454sv.LIZ(LJJI.LJIIJ);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.I74
    public void LJIIZILJ(int i) {
        AlertDialogC45239HpD LLLLLJLJLL = LLLLLJLJLL();
        if (LLLLLJLJLL != null) {
            LLLLLJLJLL.LIZLLL(i);
        }
    }

    @Override // X.I74
    public void LJJIIZ(int i) {
        this.LLILLIZIL = i;
    }

    @Override // X.I74
    public void LJJJJJL(List<? extends VideoSegment> videoSegments) {
        o.LJIIIZ(videoSegments, "videoSegments");
        C136195Wd c136195Wd = AbstractC46064I6a.LLIILZL;
        VideoPublishEditModel LJLIIL = LJLIIL();
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 103);
        c136195Wd.getClass();
        C136195Wd.LIZIZ(LJLIIL, "smart_sync_cancel", aqS173S0100000_7);
    }

    @Override // X.I74
    public void LJJJZ(List<? extends VideoSegment> videoSegments) {
        o.LJIIIZ(videoSegments, "videoSegments");
        C43045Guv.LIZLLL(new AqS157S0100000_7(this, 211), 0L);
    }

    @Override // X.AbstractC46064I6a
    public void LLIILZL(InterfaceC153045zY interfaceC153045zY) {
        if (!C78946Uyc.LJIILL(LJJLJLI())) {
            return;
        }
        if (HOA.LIZ() && C78946Uyc.LJIJJLI(LJJLJLI()) && LJLIIL().creativeModel.uploadPreviewClipModel.hasMediaClipped) {
            return;
        }
        LLLZLZ(interfaceC153045zY);
    }

    @Override // X.AbstractC46064I6a
    public void LLLFFI(int i) {
        LLLLZI().LJJLIIIJ(i);
    }

    @Override // X.AbstractC46064I6a
    public void LLLI(int i) {
        LLLLZIL().LJJLIIIJ(i);
    }

    @Override // X.AbstractC46064I6a
    public void LLLLIIIILLL(OSZ<Integer, Integer> value) {
        o.LJIIIZ(value, "value");
        LJLJLJ().LLLLIIIILLL(value);
    }

    public final void LLLLLIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this.LJLL) {
            AbstractC46064I6a.LLIILZL.getClass();
            C136195Wd.LIZ("deleteTimeEffect before apply musicSync");
            LJJLL().LIZIZ();
            this.LJLLILLLL = true;
        }
        interfaceC65784Pro.invoke();
    }

    public final void LLLZLZ(InterfaceC153045zY interfaceC153045zY) {
        String str;
        AVMusic aVMusic;
        List<AVMusic> musicList;
        Pair<Integer, Integer> playInOutTime;
        if (this.LLILL) {
            return;
        }
        this.LLILL = true;
        boolean LJIIL = H7R.LJIIL(LJLIIL());
        C46072I6i c46072I6i = this.LLJILJIL;
        String str2 = null;
        if (c46072I6i != null) {
            VideoPublishEditModel LJLIIL = LJLIIL();
            c46072I6i.LJ = LJIIL;
            c46072I6i.LJIIIIZZ = LJLIIL;
            c46072I6i.LJIIIZ().LIZ = interfaceC153045zY;
            C5U8 LJIIIZ = c46072I6i.LJIIIZ();
            LJIIIZ.getClass();
            LJIIIZ.LJ = c46072I6i;
            C46074I6k LJIIJJI = c46072I6i.LJIIJJI();
            ActivityC45651qj activityC45651qj = c46072I6i.LIZ;
            LJIIJJI.LJII = activityC45651qj;
            int i = 0;
            if (activityC45651qj != null && !activityC45651qj.isFinishing()) {
                AlertDialogC46073I6j alertDialogC46073I6j = new AlertDialogC46073I6j(activityC45651qj);
                LJIIJJI.LJI = alertDialogC46073I6j;
                if (alertDialogC46073I6j.LJLIL) {
                    ImageView imageView = alertDialogC46073I6j.LJLL;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    } else {
                        o.LJIJI("mCancelView");
                        throw null;
                    }
                }
                alertDialogC46073I6j.LJLJJI = true;
                AlertDialogC46073I6j alertDialogC46073I6j2 = LJIIJJI.LJI;
                o.LJI(alertDialogC46073I6j2);
                alertDialogC46073I6j2.setCancelable(true);
                AlertDialogC46073I6j alertDialogC46073I6j3 = LJIIJJI.LJI;
                o.LJI(alertDialogC46073I6j3);
                alertDialogC46073I6j3.setMessage(activityC45651qj.getResources().getString(R.string.rpb));
                AlertDialogC46073I6j alertDialogC46073I6j4 = LJIIJJI.LJI;
                o.LJI(alertDialogC46073I6j4);
                alertDialogC46073I6j4.LIZ(0);
                AlertDialogC46073I6j alertDialogC46073I6j5 = LJIIJJI.LJI;
                o.LJI(alertDialogC46073I6j5);
                alertDialogC46073I6j5.setOnDismissListener(new IDDListenerS146S0100000_7(LJIIJJI, 10));
                AlertDialogC46073I6j alertDialogC46073I6j6 = LJIIJJI.LJI;
                o.LJI(alertDialogC46073I6j6);
                alertDialogC46073I6j6.LJLJL = new I7V(LJIIJJI);
            }
            C46074I6k LJIIJJI2 = c46072I6i.LJIIJJI();
            C46076I6m c46076I6m = new C46076I6m(c46072I6i);
            LJIIJJI2.getClass();
            LJIIJJI2.LJFF = c46076I6m;
            c46072I6i.LJIIJJI().LIZ = interfaceC153045zY;
            C46074I6k LJIIJJI3 = c46072I6i.LJIIJJI();
            c46072I6i.LJIIJ();
            LJIIJJI3.getClass();
            Bundle bundle = LLFFF().mArguments;
            if (bundle != null) {
                str = bundle.getString("extra_edit_effect_uid");
            } else {
                str = null;
            }
            boolean LJJJZ = C78685UuP.LJJJZ(str);
            if (!LJIIL || LJJJZ) {
                EditAdjustClipsBottomViewModel LJJLIIJ = LJJLIIJ();
                LJJLIIJ.getClass();
                LJJLIIJ.setStateImmediate(new AqS12S0010000_7(false, 11));
                return;
            }
            if (LJLIIL().mIsFromDraft) {
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJLIIL().creativeModel.musicBuzModel);
                if (extractAVMusic != null) {
                    this.LJLLI = true;
                    C46072I6i c46072I6i2 = this.LLJILJIL;
                    if (c46072I6i2 != null) {
                        c46072I6i2.LJIIIZ().LIZIZ = 0;
                        C46072I6i c46072I6i3 = this.LLJILJIL;
                        if (c46072I6i3 != null) {
                            c46072I6i3.LIZLLL = extractAVMusic;
                            c46072I6i3.LJIIIZ().LIZJ = extractAVMusic;
                            C45771Hxn.LJII(extractAVMusic);
                            if (!C44384HbQ.LJJIIZI(LJLIIL())) {
                                MultiEditVideoRecordData curMultiEditVideoRecordData = LJLIIL().getCurMultiEditVideoRecordData();
                                if (curMultiEditVideoRecordData != null && (playInOutTime = curMultiEditVideoRecordData.getPlayInOutTime()) != null) {
                                    int intValue = ((Number) playInOutTime.second).intValue();
                                    Object obj = playInOutTime.first;
                                    o.LJIIIIZZ(obj, "it.first");
                                    i = intValue - ((Number) obj).intValue();
                                } else if (interfaceC153045zY != null) {
                                    i = interfaceC153045zY.getDuration();
                                }
                                C46072I6i c46072I6i4 = this.LLJILJIL;
                                if (c46072I6i4 != null) {
                                    c46072I6i4.LJI(LJLIIL().getMMusicStart(), Math.min(extractAVMusic.getDuration(), LJLIIL().getMMusicStart() + i));
                                } else {
                                    o.LJIJI("musicSyncController");
                                    throw null;
                                }
                            }
                            LLLJL(true);
                            return;
                        }
                        o.LJIJI("musicSyncController");
                        throw null;
                    }
                    o.LJIJI("musicSyncController");
                    throw null;
                }
                return;
            }
            Cut2EditTransferModel cut2EditTransferModel = LJJLJLI().LJ;
            if (cut2EditTransferModel != null && (musicList = cut2EditTransferModel.getMusicList()) != null) {
                aVMusic = (AVMusic) ORZ.LJLLLLLL(0, musicList);
                if (aVMusic != null) {
                    str2 = C45771Hxn.LJ(aVMusic);
                }
            } else {
                aVMusic = null;
            }
            if (!LJLIIL().soundSyncFromAnchor) {
                LLZ(str2, aVMusic, true);
            }
            LLLLLIL(new AqS154S0200000_7(this, aVMusic, 31));
            return;
        }
        o.LJIJI("musicSyncController");
        throw null;
    }

    @Override // X.InterfaceC146755pP
    public void Mr0(boolean z) {
        this.LJLJLLL = z;
        LJJLL().LJIILL();
    }

    @Override // X.AbstractC46064I6a
    public void U70(boolean z) {
        C5XM LLLZLL = LLLZLL();
        if (LLLZLL != null) {
            LLLZLL.Fv(z);
        }
    }

    @Override // X.AbstractC46064I6a
    public void WW(boolean z) {
        LJLJLJ().WW(z);
    }

    @Override // X.I6G
    public void aA(boolean z) {
        this.LJLJLLL = z;
    }

    @Override // X.AbstractC46064I6a
    public void l0(int i) {
        LLLLZIL().l0(i);
    }

    @Override // X.I6G
    public void switchMode(boolean z) {
        String LJ;
        Cut2EditTransferModel cut2EditTransferModel;
        List<AVMusic> musicList;
        if (this.LJLJLLL == z) {
            return;
        }
        if (z) {
            this.LLILLJJLI = LJZI();
            if (MusicBeanUtilKt.extractAVMusic(LJLIIL().creativeModel.musicBuzModel) == null) {
                AVMusic aVMusic = this.LJLLLL;
                if ((aVMusic != null || ((cut2EditTransferModel = LJJLJLI().LJ) != null && (musicList = cut2EditTransferModel.getMusicList()) != null && (aVMusic = (AVMusic) ORZ.LJLLLLLL(0, musicList)) != null)) && (LJ = C45771Hxn.LJ(aVMusic)) != null) {
                    LLZLL(this, LJ, aVMusic, false, 4, null);
                    C46072I6i c46072I6i = this.LLJILJIL;
                    if (c46072I6i != null) {
                        C46072I6i.LJIILIIL(c46072I6i, aVMusic, 0, 62);
                    } else {
                        o.LJIJI("musicSyncController");
                        throw null;
                    }
                } else {
                    AS();
                }
            } else {
                C46072I6i c46072I6i2 = this.LLJILJIL;
                if (c46072I6i2 != null) {
                    C46072I6i.LJIILIIL(c46072I6i2, MusicBeanUtilKt.extractAVMusic(LJLIIL().creativeModel.musicBuzModel), LJLIIL().getMMusicStart(), 60);
                } else {
                    o.LJIJI("musicSyncController");
                    throw null;
                }
            }
        } else {
            this.LJLLLL = MusicBeanUtilKt.extractAVMusic(LJLIIL().creativeModel.musicBuzModel);
            LLZLL(this, null, null, false, 4, null);
        }
        C136195Wd c136195Wd = AbstractC46064I6a.LLIILZL;
        VideoPublishEditModel LJLIIL = LJLIIL();
        AqS45S0110000_2 aqS45S0110000_2 = new AqS45S0110000_2(z, this, 2);
        c136195Wd.getClass();
        C136195Wd.LIZIZ(LJLIIL, "change_sync_mode", aqS45S0110000_2);
    }

    public final void LLLZZ(AVMusic aVMusic, String str) {
        if (ujb.o.LJJJJIZL(str, "EDITOR_PRO", false)) {
            return;
        }
        this.LJLLI = false;
        if (aVMusic == null) {
            if (this.LJLJLLL) {
                C46072I6i c46072I6i = this.LLJILJIL;
                if (c46072I6i != null) {
                    C46072I6i.LJIILIIL(c46072I6i, null, 0, 62);
                    LLLLJ();
                    if (!this.LJLL) {
                        LJJLIIIJLLLLLLLZ();
                    }
                    LLLJ();
                    return;
                }
                o.LJIJI("musicSyncController");
                throw null;
            }
            return;
        }
        if (this.LJLJLLL) {
            LLLLLIL(new AqS154S0200000_7(this, aVMusic, 32));
        } else {
            C10K.LIZIZ(new ACallableS105S0100000_2(aVMusic, 14), C38995FSd.LIZLLL(), null);
        }
    }

    @Override // X.AbstractC46064I6a
    public void LLZILL(int i, boolean z) {
        LJLJLJ().LLZILL(i, z);
    }

    @Override // X.InterfaceC146755pP
    public void V7(AVMusic aVMusic, InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        if (!this.LJLJLLL) {
            callback.invoke();
            return;
        }
        LLLZLZ(this.LJLLJ);
        if (aVMusic == null) {
            C46072I6i c46072I6i = this.LLJILJIL;
            if (c46072I6i != null) {
                C46072I6i.LJIILIIL(c46072I6i, null, 0, 62);
                LLLLJ();
                if (!this.LJLL) {
                    LJJLIIIJLLLLLLLZ();
                }
                LLLJ();
                callback.invoke();
                return;
            }
            o.LJIJI("musicSyncController");
            throw null;
        }
        LLLLLIL(new AqS96S0300000_7(this, (C46066I6c) aVMusic, (AVMusic) callback, (InterfaceC65784Pro<C76800UCe>) 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46066I6c(C82622Wbi diContainer, WMH parentScene, int i) {
        super(diContainer, parentScene, i);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LLIL = parentScene;
        this.LLILII = i;
        this.LLILIL = this;
        this.LLILLIZIL = -1;
        this.LLILLL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LLILZ = UCI.LJI(getDiContainer(), InterfaceC145485nM.class, null);
        this.LLILZIL = UCI.LJI(getDiContainer(), InterfaceC147865rC.class, null);
        this.LLILZLL = UCI.LJI(getDiContainer(), InterfaceC145455nJ.class, null);
        this.LLIZ = UCI.LJII(getDiContainer(), InterfaceC146665pG.class, null);
        this.LLIZLLLIL = UCI.LJII(getDiContainer(), InterfaceC153275zv.class, null);
        this.LLJ = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 253));
        this.LLJIJIL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LLJILJILJ = UCI.LJII(getDiContainer(), InterfaceC145325n6.class, null);
        this.LLJILLL = UCI.LJII(getDiContainer(), C5VE.class, null);
        this.LLJJ = new C46087I6x(this);
        this.LLJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 209));
        this.LLJJIII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 208));
        this.LLJJIJI = new C29901Fi<>();
        this.LLJJIJIIJIL = new C29901Fi<>();
    }

    private final void LLZ(String str, AVMusic aVMusic, boolean z) {
        C145355n9 LIZ;
        I9T.LJI(aVMusic, false, LJLIIL().creativeModel.musicBuzModel);
        if (C44384HbQ.LJJIFFI()) {
            C145505nO.LIZ(LJLLL(), str, aVMusic, true, false, false, z, 0L, 0L, false, 984);
            return;
        }
        if (str == null || str.length() == 0) {
            LIZ = C145385nC.LIZ(Boolean.TRUE, null, null, null, null, 0L, 0L, 112);
        } else {
            LIZ = C145385nC.LIZ(Boolean.FALSE, "edit_page_list", aVMusic, str, null, 0L, 0L, 112);
        }
        LJLLL().q3(LIZ);
    }

    @Override // X.I74
    public void LJJIJLIJ(boolean z, boolean z2, boolean z3) {
        C43045Guv.LIZLLL(new C46075I6l(z2, this, z3, z), 0L);
    }

    public static /* synthetic */ void LLLL(C46066I6c c46066I6c, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c46066I6c.LLLJL(z);
    }

    public static /* synthetic */ void LLZLL(C46066I6c c46066I6c, String str, AVMusic aVMusic, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c46066I6c.LLZ(str, aVMusic, z);
    }
}
