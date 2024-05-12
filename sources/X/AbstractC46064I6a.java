package X;

import Y.ACallableS43S0201000_2;
import Y.AObjectS86S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS38S0210000_7;
import kotlin.jvm.internal.AqS50S0110000_7;
import kotlin.jvm.internal.AqS7S0002000_7;
import kotlin.jvm.internal.AqS95S0101000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.I6a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46064I6a extends AbstractC40841iy<InterfaceC146755pP> implements InterfaceC146755pP, InterfaceC135635Tz, InterfaceC143795kd {
    public static final C136195Wd LLIILZL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIZ;
    public final C82622Wbi LJLJI;
    public final WMH LJLJJI;
    public final int LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public volatile boolean LJLJLLL;
    public volatile boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public InterfaceC153045zY LJLLJ;
    public InterfaceC46045I5h LJLLL;
    public AVMusic LJLLLL;
    public volatile boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;
    public final InterfaceC115514g7 LLFZ;
    public final InterfaceC115514g7 LLI;
    public I61 LLIFFJFJJ;
    public EditAdjustClipsBottomViewModel LLII;
    public final InterfaceC115514g7 LLIIII;
    public I7R LLIIIILZ;
    public CutMultiVideoViewModel LLIIIJ;
    public VideoEditViewModel LLIIIL;
    public CutVideoSpeedViewModel LLIIIZ;
    public C46084I6u LLIIJI;
    public final C46080I6q LLIIJLIL;
    public final C29901Fi<C76800UCe> LLIIL;
    public final InterfaceC115514g7 LLIILII;

    public abstract /* synthetic */ void LJJJJLI();

    public String LJJLJ() {
        return null;
    }

    public boolean LJLIL() {
        return false;
    }

    public int LJLZ() {
        return -1;
    }

    public void LLIIIILZ() {
    }

    public void LLIILZL(InterfaceC153045zY interfaceC153045zY) {
    }

    public abstract /* synthetic */ void LLIL();

    public void LLJ() {
    }

    public void LLJI() {
    }

    public abstract void LLJJ();

    public void LLJJIII() {
    }

    public abstract /* synthetic */ void LLLFFI(int i);

    public abstract /* synthetic */ void LLLI(int i);

    public final void LLLILZLLLI() {
        ArrayList<ImportVideoInfo> Ti = Ti(true);
        if (LJLIIL().importInfoList == null) {
            LJLIIL().importInfoList = new ArrayList<>();
        } else {
            LJLIIL().importInfoList.clear();
        }
        if (true ^ Ti.isEmpty()) {
            LJLIIL().importInfoList.addAll(Ti);
        }
        C42000Ge4.LJFF(LJLIIL());
    }

    public boolean LLLJIL() {
        return false;
    }

    public abstract /* synthetic */ void LLLLIIIILLL(OSZ<Integer, Integer> osz);

    public abstract /* synthetic */ void LLZIL();

    public abstract /* synthetic */ void LLZILL(int i, boolean z);

    public abstract /* synthetic */ boolean LLZZ();

    public abstract /* synthetic */ void Q9();

    public abstract void U70(boolean z);

    public abstract /* synthetic */ void WW(boolean z);

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public abstract /* synthetic */ void l0(int i);

    static {
        TBT tbt = new TBT(AbstractC46064I6a.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIZ = new InterfaceC74236TBo[]{tbt, new TBT(AbstractC46064I6a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(AbstractC46064I6a.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0), new TBT(AbstractC46064I6a.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new TBT(AbstractC46064I6a.class, "editNavApi", "getEditNavApi()Lcom/ss/android/ugc/gamora/editor/nav/EditNavigationApi;", 0), new TBT(AbstractC46064I6a.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new TBT(AbstractC46064I6a.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0), new TBT(AbstractC46064I6a.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new TBT(AbstractC46064I6a.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0)};
        LLIILZL = new C136195Wd();
    }

    private final InterfaceC140255ev LJJZZI() {
        return (InterfaceC140255ev) this.LLI.LIZ(this, LLIIZ[6]);
    }

    private final boolean LJLLILLLL() {
        if (this.LJLJLLL != this.LL) {
            return true;
        }
        I6Z LJJLL = LJJLL();
        OSZ<Long, Long> playBoundary = LJZI();
        LJJLL.getClass();
        o.LJIIIZ(playBoundary, "playBoundary");
        MultiEditVideoRecordData LIZLLL = LJJLL.LIZLLL();
        MultiEditVideoRecordData multiEditVideoRecordData = LJJLL.LJLLI;
        if (multiEditVideoRecordData != null) {
            if (!LIZLLL.isEqualWithDeleteStatus(multiEditVideoRecordData)) {
                return true;
            }
            OSZ<Long, Long> osz = LJJLL.LLFZ;
            if (osz != null && !o.LJ(osz, playBoundary)) {
                return true;
            }
            return false;
        }
        o.LJIJI("restoreRecordData");
        throw null;
    }

    @Override // X.I6G
    public List<VideoSegment> A2() {
        return (List) this.LJLJJLL.getValue();
    }

    public final void LJJLIIIJJI() {
        EffectPointModel timeEffect;
        InterfaceC153045zY interfaceC153045zY;
        if (this.LJLLILLLL) {
            I6Z LJJLL = LJJLL();
            if (C44384HbQ.LJJLI(LJJLL.LJFF()) && (timeEffect = LJJLL.LJFF().getTimeEffect()) != null) {
                LLIILZL.getClass();
                C136195Wd.LIZ("real addTimeEffect");
                int startPoint = timeEffect.getStartPoint();
                int endPoint = timeEffect.getEndPoint() - timeEffect.getStartPoint();
                InterfaceC153045zY interfaceC153045zY2 = LJJLL.LJLJLJ;
                if (interfaceC153045zY2 != null) {
                    C122034qd LJJI = C17N.LJJI(interfaceC153045zY2);
                    if (LJJI != null) {
                        if (o.LJ(timeEffect.getKey(), "2")) {
                            timeEffect.setUuid(LJJI.LIZLLL().LJIJ(C121144pC.LIZ(startPoint, endPoint)));
                        } else if (o.LJ(timeEffect.getKey(), "3")) {
                            timeEffect.setUuid(LJJI.LIZLLL().LJIJ(C121144pC.LIZIZ(startPoint, endPoint)));
                        }
                        interfaceC153045zY2.LLIZ(interfaceC153045zY2.getDuration(), VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (LJJLL.LJLJL && (interfaceC153045zY = LJJLL.LJLJLJ) != null) {
                    interfaceC153045zY.removeAllVideoSound();
                }
            }
            this.LJLLILLLL = false;
        }
        LLJJIJI();
    }

    public final EditAdjustClipsBottomViewModel LJJLIIJ() {
        EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel = this.LLII;
        if (editAdjustClipsBottomViewModel != null) {
            return editAdjustClipsBottomViewModel;
        }
        o.LJIJI("bottomViewModel");
        throw null;
    }

    public final I61 LJJLJLI() {
        I61 i61 = this.LLIFFJFJJ;
        if (i61 != null) {
            return i61;
        }
        o.LJIJI("editAdjustModel");
        throw null;
    }

    public final I6Z LJJLL() {
        return (I6Z) this.LJLJLJ.getValue();
    }

    public final InterfaceC146235oZ LJJZZIII() {
        return (InterfaceC146235oZ) this.LLFF.LIZ(this, LLIIZ[2]);
    }

    public final VideoPublishEditModel LJLIIL() {
        return (VideoPublishEditModel) this.LLD.LIZ(this, LLIIZ[0]);
    }

    public final C6FS LJLJJL() {
        return (C6FS) this.LLFII.LIZ(this, LLIIZ[4]);
    }

    public final InterfaceC143655kP LJLJJLL() {
        return (InterfaceC143655kP) this.LLF.LIZ(this, LLIIZ[1]);
    }

    public final InterfaceC145495nN LJLLL() {
        return (InterfaceC145495nN) this.LLIIII.LIZ(this, LLIIZ[7]);
    }

    public final OSZ<Long, Long> LJZI() {
        C15070iV<Long, Long> playBoundary;
        long longValue;
        InterfaceC46045I5h interfaceC46045I5h = this.LJLLL;
        long j = 0;
        if (interfaceC46045I5h != null && (playBoundary = interfaceC46045I5h.getPlayBoundary()) != null) {
            Long l = playBoundary.LIZ;
            if (l != null) {
                j = l.longValue();
            }
            Long valueOf = Long.valueOf(j);
            Long l2 = playBoundary.LIZIZ;
            if (l2 == null) {
                longValue = LJJLL().LJIIIIZZ();
            } else {
                longValue = l2.longValue();
            }
            return new OSZ<>(valueOf, Long.valueOf(longValue));
        }
        return new OSZ<>(0L, Long.valueOf(LJJLL().LJIIIIZZ()));
    }

    public final I7R LLF() {
        I7R i7r = this.LLIIIILZ;
        if (i7r != null) {
            return i7r;
        }
        o.LJIJI("playerController");
        throw null;
    }

    public final AbstractC42651GoZ LLFFF() {
        return (AbstractC42651GoZ) this.LLFZ.LIZ(this, LLIIZ[5]);
    }

    public final C162396Yx LLIFFJFJJ() {
        return (C162396Yx) this.LJLJL.getValue();
    }

    public final InterfaceC166716gV LLIIIL() {
        return (InterfaceC166716gV) this.LLIILII.LIZ(this, LLIIZ[8]);
    }

    public final void LLILZIL() {
        int i;
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "sound_sync");
        c145995oB.LJI("shoot_way", LJLIIL().mShootWay);
        c145995oB.LJI("enter_from", "video_edit_page");
        String creationId = LJLIIL().getCreationId();
        if (creationId == null) {
            creationId = "";
        }
        c145995oB.LJI("creation_id", creationId);
        c145995oB.LJI("content_source", H8F.LJI(LJLIIL()));
        InterfaceC153045zY value = LJLJJLL().Kh().getValue();
        if (value != null) {
            i = value.getDuration();
        } else {
            i = 0;
        }
        c145995oB.LIZ(i, "content_duration_ms");
        c145995oB.LIZ(LJLIIL().videoCount, "video_cnt");
        c145995oB.LIZ(LJLIIL().photoCount, "pic_cnt");
        if (this.LJLJLLL) {
            str = "sync_on";
        } else {
            str = "sync_off";
        }
        c145995oB.LJI("sync_mode", str);
        c145995oB.LIZ(H8F.LJIIL(LJLIIL()), "is_multi_content");
        c145995oB.LJI("mix_type", H8F.LJIIJ(LJLIIL()));
        c145995oB.LJI("enter_from", "video_sync_page");
        C43722HDy LIZJ = C43723HDz.LIZJ(LJLIIL());
        if (LIZJ != null) {
            c145995oB.LIZLLL("sdk_name", LIZJ.getSdkNameForServer());
            c145995oB.LIZLLL("sdk_version", LIZJ.mSdkVersion);
        }
        FMX.LJIIL("enter_clip_edit_page", c145995oB.LIZ);
    }

    public final void LLILZLL() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        if (this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
        if (!this.LJLZ || ((multiEditVideoStatusRecordData = LJJLJLI().LIZLLL) != null && multiEditVideoStatusRecordData.isLibraryMode)) {
            VideoEditViewModel videoEditViewModel = this.LLIIIL;
            if (videoEditViewModel != null) {
                videoEditViewModel.uv0(LJJLJLI().LIZIZ ? 1 : 0);
            } else {
                o.LJIJI("videoEditViewModel");
                throw null;
            }
        }
        VideoEditViewModel videoEditViewModel2 = this.LLIIIL;
        if (videoEditViewModel2 != null) {
            MutableLiveData<Float> mutableLiveData = videoEditViewModel2.LJLLJ;
            C46084I6u c46084I6u = this.LLIIJI;
            if (c46084I6u != null) {
                mutableLiveData.observe(c46084I6u, new AObjectS86S0100000_7(this, 50));
                VideoEditViewModel videoEditViewModel3 = this.LLIIIL;
                if (videoEditViewModel3 != null) {
                    MutableLiveData<Integer> mutableLiveData2 = videoEditViewModel3.LJLIL;
                    C46084I6u c46084I6u2 = this.LLIIJI;
                    if (c46084I6u2 != null) {
                        mutableLiveData2.observe(c46084I6u2, new AObjectS86S0100000_7(this, 51));
                        VideoEditViewModel videoEditViewModel4 = this.LLIIIL;
                        if (videoEditViewModel4 != null) {
                            videoEditViewModel4.LJLJLLL.observe(this, new AObjectS86S0100000_7(this, 52));
                            VideoEditViewModel videoEditViewModel5 = this.LLIIIL;
                            if (videoEditViewModel5 != null) {
                                videoEditViewModel5.LJLJL.observe(this, new AObjectS86S0100000_7(this, 53));
                                VideoEditViewModel videoEditViewModel6 = this.LLIIIL;
                                if (videoEditViewModel6 != null) {
                                    videoEditViewModel6.LJLL.observe(this, new AObjectS86S0100000_7(this, 54));
                                    VideoEditViewModel videoEditViewModel7 = this.LLIIIL;
                                    if (videoEditViewModel7 != null) {
                                        videoEditViewModel7.LJLLILLLL.observe(this, new AObjectS86S0100000_7(this, 55));
                                        LJJLIIJ().Iv0(this, new TBT() { // from class: X.I7J
                                            @Override // X.TBT, X.TBZ, X.TBW
                                            public final Object get(Object obj) {
                                                return ((EditAdjustClipsBottomViewState) obj).getSeekDoneEvent();
                                            }
                                        }, new C73165SnZ(), new AqS173S0100000_7(this, 101));
                                        return;
                                    } else {
                                        o.LJIJI("videoEditViewModel");
                                        throw null;
                                    }
                                }
                                o.LJIJI("videoEditViewModel");
                                throw null;
                            }
                            o.LJIJI("videoEditViewModel");
                            throw null;
                        }
                        o.LJIJI("videoEditViewModel");
                        throw null;
                    }
                    o.LJIJI(WM7.SCENE_SERVICE);
                    throw null;
                }
                o.LJIJI("videoEditViewModel");
                throw null;
            }
            o.LJIJI(WM7.SCENE_SERVICE);
            throw null;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public final void LLJJIJIL() {
        String[] q0;
        boolean z;
        InterfaceC153045zY interfaceC153045zY = this.LJLLJ;
        if (interfaceC153045zY != null && (q0 = interfaceC153045zY.q0()) != null) {
            String str = (String) ORY.LJJJ(q0);
            if (str != null && C44687HgJ.LIZIZ(str) && C44687HgJ.LJIIIIZZ(str) > 0) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resetResIfNeeded:");
            LIZ.append(z);
            H78.LIZ(X1D.LIZIZ(LIZ));
            if (z) {
                C46069I6f c46069I6f = LJJLL().LJLJLLL;
                if ((c46069I6f instanceof C46069I6f) && c46069I6f != null) {
                    C46046I5i.LIZ(c46069I6f, true, null, 2);
                }
            }
        }
    }

    private final void LLJJIJI() {
        InterfaceC153045zY interfaceC153045zY;
        if (LJLIIL().getEditorProModel().isAdvancedEditDraft() && (interfaceC153045zY = this.LJLLJ) != null) {
            C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
            if (LJJI != null) {
                Iterator<NLETrackSlot> it = LJJI.LJIIJ.LJ().getMainTrack().LJIILLIIL().iterator();
                while (it.hasNext()) {
                    NLETrackSlot slot = it.next();
                    o.LJIIIIZZ(slot, "slot");
                    Context LLLLJ = C16880lQ.LLLLJ(C78688UuS.LJIJJ(this));
                    o.LJIIIIZZ(LLLLJ, "activity.applicationContext");
                    C52B.LJIIJJI(slot, LLLLJ);
                }
                LJJI.LJIIJ.LIZIZ();
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.I6G
    public boolean A80() {
        boolean z;
        InterfaceC153045zY interfaceC153045zY;
        int currentEditOriginIndex = LJJLIIJ().Ov0().getCurrentEditOriginIndex();
        VideoEditViewModel videoEditViewModel = this.LLIIIL;
        if (videoEditViewModel != null) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(videoEditViewModel.kv0(), currentEditOriginIndex);
            String currentEditSegmentPath = videoSegment.originPath;
            if (HBT.LIZ() && (interfaceC153045zY = this.LJLLJ) != null) {
                C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
                if (LJJI != null) {
                    Iterator<NLETrackSlot> it = LJJI.LJIIJ.LJ().getMainTrack().LJIILLIIL().iterator();
                    z = false;
                    while (it.hasNext()) {
                        NLETrackSlot next = it.next();
                        if (o.LJ(NLESegmentVideo.LJJ(next.LJI()).LJ().LIZJ(), currentEditSegmentPath)) {
                            z = next.hasExtra("library_id");
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                z = false;
            }
            o.LJIIIIZZ(currentEditSegmentPath, "currentEditSegmentPath");
            String sDir = C43075GvP.LIZ;
            o.LJIIIIZZ(sDir, "sDir");
            if ((!ujb.o.LJJJLIIL(currentEditSegmentPath, sDir, false) || !s.LJJJLZIJ(currentEditSegmentPath, "concat", false)) && videoSegment.libraryVideoSegment == null && !z) {
                return false;
            }
            return true;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public final void LJJLIIIJLLLLLLLZ() {
        long j;
        List list;
        int i;
        InterfaceC143855kj LJI;
        NLEModel nLEModel;
        int i2;
        ArrayList<LibraryMaterialInfoSv> LIZIZ;
        List list2;
        I6Z LJJLL = LJJLL();
        OSZ<Long, Long> playBoundary = LJZI();
        InterfaceC46045I5h interfaceC46045I5h = this.LJLLL;
        long j2 = 0;
        if (interfaceC46045I5h != null) {
            j = interfaceC46045I5h.getLeftSeekingValue();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        InterfaceC46045I5h interfaceC46045I5h2 = this.LJLLL;
        if (interfaceC46045I5h2 != null) {
            j2 = interfaceC46045I5h2.getRightSeekingValue();
        }
        OSZ<Long, Long> osz = new OSZ<>(valueOf, Long.valueOf(j2));
        LJJLL.getClass();
        o.LJIIIZ(playBoundary, "playBoundary");
        C136195Wd c136195Wd = LLIILZL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("saveWork,isMusicSyncMode:");
        LIZ.append(LJJLL.LJLJL);
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        c136195Wd.getClass();
        C136195Wd.LIZ(LIZIZ2);
        LJJLL.LLIFFJFJJ = false;
        LJJLL.LLFZ = playBoundary;
        LJJLL.LLI = osz;
        ArrayList<TimeSpeedModelExtension> arrayList = LJJLL.LJLLLLLL;
        if (arrayList != null) {
            list = ORZ.LLJILJILJ(arrayList);
        } else {
            list = null;
        }
        LJJLL.LJLLL = (ArrayList) list;
        if (o.LJ(LJJLL.LIZJ().Ov0().isLibraryMode(), Boolean.TRUE)) {
            LibraryMaterialInfoSv libraryMaterialInfoSv = LJJLL.LJFF().libraryMaterialInfo;
            if (libraryMaterialInfoSv != null) {
                LJJLL.LJFF().libraryMaterialList.add(libraryMaterialInfoSv);
            }
            LJJLL.LJFF().libraryMaterialInfo = null;
        }
        if (LJJLL.LJFF().getEditorProModel().isAdvancedEditDraft()) {
            InterfaceC153045zY interfaceC153045zY = LJJLL.LJLJLJ;
            if (interfaceC153045zY != null) {
                ArrayList<LibraryMaterialInfoSv> arrayList2 = LJJLL.LJFF().libraryMaterialList;
                if (arrayList2 != null) {
                    AnonymousClass569.LJIIIIZZ = arrayList2;
                }
                AnonymousClass569.LJII = LJJLL.LJLLLLLL;
                List<MultiEditVideoSegmentRecordData> list3 = LJJLL.LIZLLL().segmentDataList;
                o.LJIIIIZZ(list3, "curRecordData.segmentDataList");
                C122034qd LJJI = C17N.LJJI(interfaceC153045zY);
                if (LJJI != null) {
                    NLETrack mainTrack = LJJI.LJIIJ.LJ().getMainTrack();
                    o.LJIIIIZZ(mainTrack, "requireNotNull(it.getNLE…)).editor.model.mainTrack");
                    LJJLL.LJLLLLLL = AnonymousClass569.LIZ(list3, mainTrack);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJJLL.LJFF().multiEditVideoRecordData;
            ArrayList<TimeSpeedModelExtension> arrayList3 = LJJLL.LJLLLLLL;
            if (arrayList3 != null) {
                list2 = ORZ.LLJILJILJ(arrayList3);
            } else {
                list2 = null;
            }
            multiEditVideoStatusRecordData.editSegments = (ArrayList) list2;
        }
        if (HBT.LIZ() && (LIZIZ = AnonymousClass569.LIZIZ()) != null) {
            LJJLL.LJFF().libraryMaterialList = LIZIZ;
        }
        LJJLL.LJIJJLI(playBoundary);
        LJJLL.LJFF().multiEditVideoRecordData.isMultiEditRetake = false;
        LJJLL.LJFF().multiEditVideoRecordData.adjustClipsState = new EditAdjustClipsState(LJJLL.LLFZ, osz);
        if (LJJLL.LJFF().mIsFromDraft) {
            LJJLL.LJFF();
        }
        LJJLL.LJFF().setPreviewInfo(new C6NQ(LJJLL.LJFF().getPreviewInfo().getPreviewWidth(), LJJLL.LJFF().getPreviewInfo().getPreviewHeight(), true, LJJLL.LJFF().getPreviewInfo().getReverseAudioArray(), LJJLL.LJFF().getPreviewInfo().getReverseVideoArray(), 12).LIZ(LJJLL.LIZLLL()));
        if (LJJLL.LJFF().mFromCut) {
            VideoPublishEditModel LJFF = LJJLL.LJFF();
            List<EditVideoSegment> videoList = LJJLL.LJFF().getPreviewInfo().getVideoList();
            if ((videoList instanceof Collection) && videoList.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (EditVideoSegment editVideoSegment : videoList) {
                    C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                    String videoPath = editVideoSegment.getVideoPath();
                    c43117Gw5.getClass();
                    if (C43117Gw5.LJIIIZ(videoPath) && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            LJFF.photoCount = i2;
            LJJLL.LJFF().videoCount = LJJLL.LJFF().getPreviewInfo().getVideoList().size() - LJJLL.LJFF().photoCount;
        }
        if (C5TH.LIZ(LJJLL.LJFF()) && (LJI = LJJLL.LJI()) != null && LJI.Xg()) {
            InterfaceC143855kj LJI2 = LJJLL.LJI();
            if (LJI2 != null) {
                LJI2.LE();
            }
            InterfaceC143855kj LJI3 = LJJLL.LJI();
            if (LJI3 != null) {
                InterfaceC153045zY interfaceC153045zY2 = LJJLL.LJLJLJ;
                if (interfaceC153045zY2 != null) {
                    nLEModel = C17N.LJJ(interfaceC153045zY2);
                } else {
                    nLEModel = null;
                }
                LJI3.Jp(nLEModel);
            }
        }
        LJJLIIIJJI();
        I6Z LJJLL2 = LJJLL();
        InterfaceC153045zY interfaceC153045zY3 = this.LJLLJ;
        if (interfaceC153045zY3 != null) {
            i = interfaceC153045zY3.getDuration();
        } else {
            i = -1;
        }
        I6Z.LJIIZILJ(LJJLL2, i, 1);
        if (!this.LJLLI) {
            InterfaceC153045zY interfaceC153045zY4 = this.LJLLJ;
            if (interfaceC153045zY4 != null) {
                int duration = interfaceC153045zY4.getDuration();
                LJLIIL().setVideoLength(duration);
                LLLFFI(duration);
                LLLI(duration);
                l0(duration);
                LLLLIIIILLL(new OSZ<>(Integer.valueOf(interfaceC153045zY4.LLIZLLLIL()), Integer.valueOf(duration)));
                LLZILL(duration, true);
            }
            LLJI();
            Q9();
            LLZIL();
        }
        this.LLIIL.LJII(C76800UCe.LIZ);
        I7S.LIZ(LLF(), -1L, null, 6);
        this.LJLLI = false;
    }

    public void LLIIZ() {
        LiveEvent<C76800UCe> jq;
        LJLJJLL().Kh().observe(this, new AObjectS86S0100000_7(this, 47));
        LJLJJLL().kn0().observe(this, new AObjectS86S0100000_7(this, 48));
        LJJLIIJ().Iv0(this, new TBT() { // from class: X.I7F
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getScale();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 100));
        InterfaceC140255ev LJJZZI = LJJZZI();
        if (LJJZZI != null && (jq = LJJZZI.jq()) != null) {
            jq.LIZLLL(this, new AObjectS86S0100000_7(this, 49));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJLIL() {
        /*
            r5 = this;
            X.I6Z r1 = r5.LJJLL()
            r0 = 0
            r2 = 1
            r1.LIZ(r0, r2)
            boolean r1 = r5.LJLJLLL
            boolean r0 = r5.LL
            if (r1 == r0) goto L37
            r5.switchMode(r0)
            if (r0 != 0) goto L17
        L14:
            r5.LJJLIIIJJI()
        L17:
            X.I6Z r1 = r5.LJJLL()
            X.5zY r0 = r5.LJLLJ
            if (r0 == 0) goto L35
            int r0 = r0.getDuration()
        L23:
            X.I6Z.LJIIZILJ(r1, r0, r2)
            r5.LLJI()
            X.I7R r4 = r5.LLF()
            r3 = 0
            r2 = 6
            r0 = -1
            X.I7S.LIZ(r4, r0, r3, r2)
            return
        L35:
            r0 = -1
            goto L23
        L37:
            boolean r0 = r5.LJLJLLL
            if (r0 == 0) goto L14
            r5.LLJ()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46064I6a.LLJLIL():void");
    }

    public final void LLLJ() {
        LJLIIL().copyMultiEditMusicInfo();
        MultiEditVideoRecordData multiEditVideoRecordData = LJLIIL().multiEditVideoRecordData.curMultiEditVideoRecordData;
        if (this.LJLJLLL && multiEditVideoRecordData.musicPath == null) {
            multiEditVideoRecordData.musicPath = LJJLJ();
        }
        multiEditVideoRecordData.musicDuration = HOH.LIZ(LJLIIL().getCurMusicServerLength(), multiEditVideoRecordData.musicPath);
    }

    @Override // X.I6G
    public void Lu0() {
        int currentEditOriginIndex = LJJLIIJ().Ov0().getCurrentEditOriginIndex();
        VideoEditViewModel videoEditViewModel = this.LLIIIL;
        if (videoEditViewModel != null) {
            VideoSegment currentEditSegment = (VideoSegment) ListProtector.get(videoEditViewModel.kv0(), currentEditOriginIndex);
            if (A80()) {
                o.LJIIIIZZ(currentEditSegment, "currentEditSegment");
                LLJJI(currentEditSegment);
            }
            CutMultiVideoViewModel cutMultiVideoViewModel = this.LLIIIJ;
            if (cutMultiVideoViewModel != null) {
                cutMultiVideoViewModel.LJLJL.setValue(currentEditSegment);
                EditAdjustClipsBottomViewModel LJJLIIJ = LJJLIIJ();
                o.LJIIIIZZ(currentEditSegment, "currentEditSegment");
                LJJLIIJ.getClass();
                LJJLIIJ.setStateImmediate(new AqS95S0101000_7(currentEditOriginIndex, currentEditSegment, 2));
                return;
            }
            o.LJIJI("cutMultiVideoViewModel");
            throw null;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public void initData() {
        C82622Wbi LJJLIIIJILLIZJL = C44384HbQ.LJJLIIIJILLIZJL(this);
        if (LJJLIIIJILLIZJL != null) {
            LLLFZ((I61) LJJLIIIJILLIZJL.LJ(I61.class, null));
            LLJZIJLIL((EditAdjustClipsBottomViewModel) LJJLIIIJILLIZJL.LJ(EditAdjustClipsBottomViewModel.class, null));
            this.LLIIIJ = (CutMultiVideoViewModel) LJJLIIIJILLIZJL.LJ(CutMultiVideoViewModel.class, null);
            this.LLIIIL = (VideoEditViewModel) LJJLIIIJILLIZJL.LJ(VideoEditViewModel.class, null);
            this.LLIIIZ = (CutVideoSpeedViewModel) LJJLIIIJILLIZJL.LJ(CutVideoSpeedViewModel.class, null);
            LLLIIIL((I7R) LJJLIIIJILLIZJL.LJ(I7R.class, null));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLJJ();
        initData();
        LLIIZ();
        LJJLL().LJIILIIL();
    }

    @Override // X.AbstractC40841iy, X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        C162396Yx LLIFFJFJJ = LLIFFJFJJ();
        LLIFFJFJJ.LIZ.evictAll();
        ((ArrayList) LLIFFJFJJ.LIZIZ).clear();
    }

    @Override // X.I6G
    public void q10() {
        if (!C78946Uyc.LJIJJLI(LJJLJLI())) {
            LJLJJLL().dq0();
        } else {
            LLFFF().LLJJI();
        }
    }

    @Override // X.I6G
    public void su0() {
        EditAdjustClipsBottomViewState Ov0 = LJJLIIJ().Ov0();
        LLJLLIL(new AqS154S0200000_7(this, Ov0, 29));
        int currentEditIndex = Ov0.getCurrentEditIndex();
        C145995oB LIZ = C43838HIk.LIZ();
        LIZ.LJI("order", String.valueOf(currentEditIndex + 1));
        FMX.LJIIL("reshoot_video_section", LIZ.LIZ);
    }

    @Override // X.InterfaceC146755pP
    public void yM() {
        boolean z;
        if (!LJLIIL().isMultiVideoEdit() || !LJLIIL().isRetakeVideo() || LJLIIL().multiEditVideoRecordData == null) {
            return;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJLIIL().multiEditVideoRecordData;
        if (!multiEditVideoStatusRecordData.segmentSizeChange && multiEditVideoStatusRecordData.currentEditIndex >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLZ = z;
        LY(false, LJLIIL().creativeModel.libraryModel.retakeFromLibrary, new AqS154S0200000_7(this, multiEditVideoStatusRecordData, 28));
    }

    @Override // X.InterfaceC146755pP
    public LiveEvent<C76800UCe> c90() {
        return this.LLIIL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    private final void LJJLIIIJJIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        boolean LJ;
        boolean z;
        boolean hasRecord = LJLIIL().hasRecord();
        EffectPointModel timeEffect = LJLIIL().getTimeEffect();
        if (timeEffect == null) {
            LJ = false;
        } else {
            LJ = o.LJ(timeEffect.getKey(), "1");
        }
        boolean LJLIL = LJLIL();
        if (LJLIIL().creativeModel.voiceConversionModel.hasDubVoiceConversion || LJLIIL().creativeModel.voiceConversionModel.hasOriginVoiceConversion) {
            z = true;
        } else {
            z = false;
        }
        if (LJ || hasRecord || LJLIL || z) {
            ArrayList arrayList = new ArrayList();
            if (LJ) {
                String string = C78688UuS.LJIJJ(this).getString(R.string.bgw);
                o.LJIIIIZZ(string, "activity.getString(R.string.adjustclips_edit1)");
                arrayList.add(string);
            }
            if (hasRecord) {
                String string2 = C78688UuS.LJIJJ(this).getString(R.string.bgx);
                o.LJIIIIZZ(string2, "activity.getString(R.string.adjustclips_edit2)");
                arrayList.add(string2);
            }
            if (LJLIL) {
                String string3 = C78688UuS.LJIJJ(this).getString(R.string.bgy);
                o.LJIIIIZZ(string3, "activity.getString(R.string.adjustclips_edit3)");
                arrayList.add(string3);
            }
            if (z) {
                String string4 = C78688UuS.LJIJJ(this).getString(R.string.bzk);
                o.LJIIIIZZ(string4, "activity.getString(R.string.av_voice_conversion)");
                arrayList.add(string4);
            }
            String LLD = ORZ.LLD(arrayList, ",", null, null, null, 62);
            C62905OmT c62905OmT = new C62905OmT(C78688UuS.LJIJJ(this));
            c62905OmT.LIZJ = C78688UuS.LJIJJ(this).getString(R.string.bgz, LLD);
            c62905OmT.LJII(R.string.cg_, null);
            c62905OmT.LJIIJ(R.string.dsg, new DialogInterfaceOnClickListenerC46079I6p(LJ, this, LJLIL, z, hasRecord, interfaceC65784Pro));
            new C62906OmU(c62905OmT).LIZLLL();
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static final InterfaceC147865rC LJLJLJ(AbstractC46064I6a abstractC46064I6a) {
        return (InterfaceC147865rC) abstractC46064I6a.LLFFF.LIZ(abstractC46064I6a, LLIIZ[3]);
    }

    private final void LLJJI(VideoSegment videoSegment) {
        String str;
        ArrayList<LibraryMaterialInfoSv> arrayList = LJLIIL().libraryMaterialList;
        if (arrayList != null) {
            Iterator<LibraryMaterialInfoSv> it = arrayList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                if (!o.LJ(next.getSplitVideoPath(), videoSegment.LJII(true)) && !o.LJ(next.getSplitVideoPath(), videoSegment.originPath) && !o.LJ(next.getRawFilePath(), videoSegment.LJII(true)) && !o.LJ(next.getRawFilePath(), videoSegment.originPath)) {
                    String rawFilePath = next.getRawFilePath();
                    LibraryVideo libraryVideo = videoSegment.libraryVideoSegment;
                    if (libraryVideo != null) {
                        str = libraryVideo.getRawFilePath();
                    } else {
                        str = null;
                    }
                    if (o.LJ(rawFilePath, str)) {
                    }
                }
                arrayList.remove(next);
                return;
            }
        }
    }

    private final void LLJLLIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if ((C44384HbQ.LJLJI(LJLIIL()) || LLZZ()) && !C44384HbQ.LJJIIZI(LJLIIL())) {
            G8T.LIZ(C78688UuS.LJIJJ(this), new AqS157S0100000_7(interfaceC65784Pro, 206));
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.I6G
    public void Az(final List<? extends VideoSegment> videos) {
        int i;
        float value;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        o.LJIIIZ(videos, "videos");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = LJJLJLI().LIZLLL;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        int i2 = 0;
        for (VideoSegment videoSegment : videos) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                videoSegment.videoIndex = i2 + i;
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        I6Z LJJLL = LJJLL();
        LJJLL.getClass();
        C136195Wd c136195Wd = LLIILZL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("insertVideoList,size:");
        LIZ.append(videos.size());
        LIZ.append(",isMusicSyncMode:");
        LIZ.append(LJJLL.LJLJL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c136195Wd.getClass();
        C136195Wd.LIZ(LIZIZ);
        C46069I6f c46069I6f = LJJLL.LJLJLLL;
        if (c46069I6f != null && (C78946Uyc.LJIJJLI(c46069I6f.LIZIZ) || c46069I6f.LJ())) {
            if (c46069I6f.LJ()) {
                MultiEditVideoRecordData LIZLLL = c46069I6f.LIZLLL();
                C78946Uyc.LJIJJLI(c46069I6f.LIZIZ);
                C46104I7o.LIZJ(LIZLLL, videos, true);
            } else {
                C46104I7o.LIZJ(c46069I6f.LIZLLL(), videos, false);
            }
        }
        if (LJJLL.LJLJL) {
            C46072I6i LJIIIZ = LJJLL.LJIIIZ();
            if (LJIIIZ != null) {
                final int size = LJJLL.LIZLLL().segmentDataList.size();
                final C5U8 LJIIIZ2 = LJIIIZ.LJIIIZ();
                final I7M i7m = new I7M(LJIIIZ);
                if (LJIIIZ2.LIZ != null && !C77413UZt.LJIILL(videos)) {
                    C10K.LIZJ(new ACallableS43S0201000_2(size, videos, LJIIIZ2, 3)).LJ(new C10I() { // from class: X.5SP
                        @Override // X.C10I
                        public final Object then(C10K<Integer> c10k) {
                            if (c10k == null || c10k.LJIIJJI() == null) {
                                InterfaceC126004x2 interfaceC126004x2 = i7m;
                                if (interfaceC126004x2 != null) {
                                    interfaceC126004x2.onFailed();
                                    return null;
                                }
                                return null;
                            }
                            if (c10k.LJIIJJI().intValue() == 0) {
                                int i4 = size;
                                List<VideoSegment> list2 = videos;
                                o.LJI(list2);
                                LJIIIZ2.LJ(1, i4 - list2.size());
                                InterfaceC126004x2 interfaceC126004x22 = i7m;
                                if (interfaceC126004x22 == null) {
                                    return null;
                                }
                                interfaceC126004x22.LIZ(c10k.LJIIJJI().intValue());
                                return null;
                            }
                            InterfaceC126004x2 interfaceC126004x23 = i7m;
                            if (interfaceC126004x23 == null) {
                                return null;
                            }
                            interfaceC126004x23.onFailed();
                            return null;
                        }
                    }, C10K.LJIIIIZZ, null);
                }
            }
        } else {
            C46069I6f c46069I6f2 = LJJLL.LJLJLLL;
            if (c46069I6f2 != null) {
                int size2 = LJJLL.LIZLLL().segmentDataList.size();
                if (!videos.isEmpty() && (C78946Uyc.LJIJJLI(c46069I6f2.LIZIZ) || c46069I6f2.LJ())) {
                    int size3 = videos.size();
                    ArrayList arrayList = new ArrayList(size3);
                    ArrayList arrayList2 = new ArrayList(size3);
                    for (VideoSegment videoSegment2 : videos) {
                        VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                        vEClipSourceParam.clipFilePath = videoSegment2.LJII(false);
                        vEClipSourceParam.clipWidth = videoSegment2.width;
                        vEClipSourceParam.clipHeight = videoSegment2.height;
                        arrayList.add(vEClipSourceParam);
                        VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                        if (c46069I6f2.LJ()) {
                            value = videoSegment2.LJIIIIZZ();
                        } else {
                            value = EnumC82528WaC.NORMAL.value();
                        }
                        vEClipTimelineParam.speed = value;
                        vEClipTimelineParam.trimIn = 0;
                        vEClipTimelineParam.trimOut = (int) videoSegment2.duration;
                        arrayList2.add(vEClipTimelineParam);
                    }
                    c46069I6f2.LIZ.LLJLLIL(size2 - videos.size(), arrayList, arrayList2);
                    InterfaceC153045zY interfaceC153045zY = c46069I6f2.LIZ;
                    interfaceC153045zY.LLIZ(interfaceC153045zY.getDuration(), VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                    if (c46069I6f2.LJ()) {
                        int i4 = 0;
                        for (VideoSegment videoSegment3 : videos) {
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                c46069I6f2.LJI(i4 + size2, videoSegment3.rotate);
                                i4 = i5;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = LJJLL.LJ().LIZLLL;
        if (multiEditVideoStatusRecordData2 != null && multiEditVideoStatusRecordData2.isLibraryMode) {
            C46069I6f c46069I6f3 = LJJLL.LJLJLLL;
            if ((c46069I6f3 instanceof C46069I6f) && c46069I6f3 != null) {
                C46046I5i.LIZ(c46069I6f3, false, null, 3);
            }
            I7S.LIZ(LJJLL.LJIIJ(), -1L, null, 6);
        }
        EditAdjustClipsBottomViewModel LJJLIIJ = LJJLIIJ();
        LJJLIIJ.getClass();
        LJJLIIJ.setStateImmediate(new AqS173S0100000_7(videos, (List<AutoCutThemeData>) 109));
    }

    @Override // X.InterfaceC146755pP
    public void LJJLIIIJL(boolean z) {
        LLIZ(z, new AqS50S0110000_7(this, z, 0));
    }

    public final void LLJZIJLIL(EditAdjustClipsBottomViewModel editAdjustClipsBottomViewModel) {
        o.LJIIIZ(editAdjustClipsBottomViewModel, "<set-?>");
        this.LLII = editAdjustClipsBottomViewModel;
    }

    public final void LLLFZ(I61 i61) {
        o.LJIIIZ(i61, "<set-?>");
        this.LLIFFJFJJ = i61;
    }

    public final void LLLIIIL(I7R i7r) {
        o.LJIIIZ(i7r, "<set-?>");
        this.LLIIIILZ = i7r;
    }

    @Override // X.InterfaceC146755pP
    public ArrayList<ImportVideoInfo> Ti(boolean z) {
        boolean z2;
        Object obj;
        List<VideoSegment> LJII = LJJLL().LJII();
        ArrayList arrayList = new ArrayList();
        Iterator<VideoSegment> it = LJII.iterator();
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            VideoSegment next = it.next();
            if (true ^ next.isDeleted) {
                arrayList.add(next);
            }
        }
        if (z) {
            LJLJJLL().Kh().getValue();
            C77119UOl.LJI(arrayList);
        }
        ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
        Iterable iterable = LJLIIL().importInfoList;
        if (iterable == null) {
            iterable = C61878OQg.INSTANCE;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it2.next();
            Iterator it3 = iterable.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (TextUtils.equals(((ImportVideoInfo) obj).getRealImportPath(), videoSegment.LJII(false))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ImportVideoInfo importVideoInfo = (ImportVideoInfo) obj;
            if (importVideoInfo != null) {
                int i = videoSegment.width;
                int i2 = videoSegment.height;
                int bitRate = importVideoInfo.getBitRate();
                int encodeId = importVideoInfo.getEncodeId();
                String LJII2 = videoSegment.LJII(z2);
                LJII2.toString();
                long j = videoSegment.duration;
                long LJ = videoSegment.LJ() - videoSegment.LJIIIZ();
                String str = videoSegment.mDescription;
                String str2 = videoSegment.mMusicId;
                int originFps = importVideoInfo.getOriginFps();
                float LJIIIIZZ = videoSegment.LJIIIIZZ();
                String LJII3 = videoSegment.LJII(false);
                LJII3.toString();
                arrayList2.add(new ImportVideoInfo(i, i2, bitRate, encodeId, LJII2, j, LJ, str, str2, originFps, LJIIIIZZ, LJII3, importVideoInfo.getOriginImportPath(), videoSegment.fastImportDependHW, importVideoInfo.getHypicDescription()));
            } else {
                int i3 = videoSegment.width;
                int i4 = videoSegment.height;
                int LIZIZ = videoSegment.LIZIZ();
                int LIZLLL = videoSegment.LIZLLL();
                String LJII4 = videoSegment.LJII(true);
                LJII4.toString();
                long j2 = videoSegment.duration;
                long LJ2 = videoSegment.LJ() - videoSegment.LJIIIZ();
                String str3 = videoSegment.mDescription;
                String str4 = videoSegment.mMusicId;
                int LJI = videoSegment.LJI();
                float LJIIIIZZ2 = videoSegment.LJIIIIZZ();
                String LJII5 = videoSegment.LJII(false);
                LJII5.toString();
                arrayList2.add(new ImportVideoInfo(i3, i4, LIZIZ, LIZLLL, LJII4, j2, LJ2, str3, str4, LJI, LJIIIIZZ2, LJII5, videoSegment.originPath, videoSegment.fastImportDependHW, null, 16384, null));
            }
            z2 = true;
        }
        return arrayList2;
    }

    @Override // X.I6G
    public void ds(boolean z) {
        float f;
        if (z) {
            CutVideoSpeedViewModel cutVideoSpeedViewModel = this.LLIIIZ;
            if (cutVideoSpeedViewModel != null) {
                InterfaceC46045I5h interfaceC46045I5h = this.LJLLL;
                if (interfaceC46045I5h != null) {
                    f = interfaceC46045I5h.getCurrentSpeed();
                } else {
                    f = 1.0f;
                }
                EnumC82528WaC fromValue = EnumC82528WaC.fromValue(f);
                o.LJIIIIZZ(fromValue, "fromValue(videoEditView?.currentSpeed ?: 1.0f)");
                cutVideoSpeedViewModel.Mv0(fromValue);
            } else {
                o.LJIJI("cutVideoSpeedViewModel");
                throw null;
            }
        }
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.LLIIIZ;
        if (cutVideoSpeedViewModel2 != null) {
            cutVideoSpeedViewModel2.setVisible(z);
        } else {
            o.LJIJI("cutVideoSpeedViewModel");
            throw null;
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.I6G
    public void xP(InterfaceC46045I5h editView) {
        o.LJIIIZ(editView, "editView");
        this.LJLLL = editView;
    }

    private final void LLIZ(boolean z, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        boolean LJLLILLLL = LJLLILLLL();
        if (!z && LJLLILLLL) {
            G8T.LIZ(C78688UuS.LJIJJ(this), new I79(interfaceC88472Yns, LJLLILLLL));
        } else {
            interfaceC88472Yns.invoke(Boolean.valueOf(LJLLILLLL));
        }
    }

    private final void LLJJJIL(boolean z, int i) {
        if (C78946Uyc.LJIJJLI(LJJLJLI())) {
            if (this.LJLJLLL) {
                return;
            }
            U70(!z);
            return;
        }
        if (z) {
            long j = 0;
            int i2 = 0;
            for (VideoSegment videoSegment : A2()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    VideoSegment videoSegment2 = videoSegment;
                    if (!videoSegment2.isDeleted && i2 < i) {
                        j = (videoSegment2.LJ() - videoSegment2.LJIIIZ()) + j;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            VideoSegment videoSegment3 = (VideoSegment) ListProtector.get(A2(), i);
            LJJLL().LJIJI((int) j, 0, (int) (videoSegment3.LJ() - videoSegment3.LJIIIZ()));
            return;
        }
        I6Z.LJIIZILJ(LJJLL(), 0, 3);
    }

    @Override // X.I6G
    public void NU(int i, int i2) {
        float f;
        float f2;
        Object obj;
        float f3;
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(A2(), i2);
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.LLIIIZ;
        if (cutVideoSpeedViewModel != null) {
            EnumC82528WaC fromValue = EnumC82528WaC.fromValue(videoSegment.LJIIIIZZ());
            o.LJIIIIZZ(fromValue, "fromValue(video.speed)");
            cutVideoSpeedViewModel.Mv0(fromValue);
            EditAdjustClipsBottomViewModel LJJLIIJ = LJJLIIJ();
            LJJLIIJ.getClass();
            LJJLIIJ.setStateImmediate(new AqS7S0002000_7(i, i2, 0));
            EditAdjustClipsBottomViewModel LJJLIIJ2 = LJJLIIJ();
            InterfaceC46045I5h interfaceC46045I5h = this.LJLLL;
            if (interfaceC46045I5h != null) {
                f = interfaceC46045I5h.getSelectedTime();
            } else {
                f = 0.0f;
            }
            LJJLIIJ2.Pv0(f);
            I6Z LJJLL = LJJLL();
            LJJLL.getClass();
            C136195Wd c136195Wd = LLIILZL;
            StringBuilder LIZJ = C06460Ne.LIZJ("switch2SingleEdit,index:", i, ",originIndex:", i2, ",isMusicSyncMode:");
            LIZJ.append(LJJLL.LJLJL);
            String LIZIZ = X1D.LIZIZ(LIZJ);
            c136195Wd.getClass();
            C136195Wd.LIZ(LIZIZ);
            List<MultiEditVideoSegmentRecordData> list = LJJLL.LIZLLL().segmentDataList;
            o.LJIIIIZZ(list, "curRecordData.segmentDataList");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ORZ.LJLLLLLL(i2, list);
            if (multiEditVideoSegmentRecordData != null) {
                f2 = multiEditVideoSegmentRecordData.scale;
            } else {
                f2 = 0.0f;
            }
            LJJLL.LLFII = f2;
            LJJLL.LJLL = new OSZ<>(Integer.valueOf(i), Integer.valueOf(i2));
            VideoSegment segment = (VideoSegment) ListProtector.get(LJJLL.LJII(), i2);
            C46069I6f c46069I6f = LJJLL.LJLJLLL;
            float f4 = 1.0f;
            if (c46069I6f != null) {
                o.LJIIIZ(segment, "segment");
                c46069I6f.LJ = i2;
                if (C78946Uyc.LJIJJLI(c46069I6f.LIZIZ)) {
                    VETimelineParams LJIIL = C46104I7o.LJIIL(c46069I6f.LIZLLL());
                    C62819Ol5.LJJIIJ(LJIIL, i2, segment);
                    c46069I6f.LJFF = LJIIL;
                    c46069I6f.LIZ.LLIIIZ(LJIIL, (int) segment.LJIIIZ(), (int) segment.LJ());
                } else {
                    C5RU LIZJ2 = C46069I6f.LIZJ(c46069I6f.LIZLLL(), false, c46069I6f.LIZJ, c46069I6f.LIZLLL, i2);
                    LIZJ2.LIZJ[0] = 0;
                    LIZJ2.LIZLLL[0] = (int) segment.duration;
                    int[] iArr = LIZJ2.LJII;
                    if (iArr != null) {
                        iArr[0] = 0;
                    }
                    float[] fArr = LIZJ2.LJIIIZ;
                    if (fArr != null) {
                        obj = Float.valueOf(fArr[0]);
                    } else {
                        obj = 0;
                    }
                    if (!o.LJ(obj, 0)) {
                        float[] fArr2 = LIZJ2.LJIIIZ;
                        o.LJI(fArr2);
                        f3 = fArr2[0];
                    } else {
                        f3 = 1.0f;
                    }
                    int[] iArr2 = LIZJ2.LJIIIIZZ;
                    if (iArr2 != null) {
                        iArr2[0] = (int) (((float) segment.duration) * f3);
                    }
                    c46069I6f.LJI = LIZJ2;
                    c46069I6f.LIZ.LLI(LIZJ2);
                    c46069I6f.LJFF((int) (segment.LJIIIIZZ() * ((float) segment.LJIIIZ())), (int) (segment.LJIIIIZZ() * ((float) segment.LJ())));
                }
            }
            if (LJJLL.LJLJL) {
                LJJLL.LJIIL().LIZJ(segment, true);
                C46072I6i LJIIIZ = LJJLL.LJIIIZ();
                if (LJIIIZ != null) {
                    o.LJIIIZ(segment, "segment");
                    LJIIIZ.LJIIIZ().LJFF = i2;
                    LJIIIZ.LJIIIZ().LIZIZ();
                }
            }
            if (segment.LJIIIIZZ() != 0.0f) {
                f4 = segment.LJIIIIZZ();
            }
            I7S.LIZ(LJJLL.LJIIJ(), ((float) segment.LJIIIZ()) / f4, null, 6);
            LLJJJIL(true, i2);
            return;
        }
        o.LJIJI("cutVideoSpeedViewModel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fa, code lost:
    
        if (r15 != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    @Override // X.I6G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Uj0(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46064I6a.Uj0(boolean, boolean):void");
    }

    @Override // X.I6G
    public void ux(int i, int i2) {
        float f;
        this.LJZ = true;
        I6Z LJJLL = LJJLL();
        OSZ<Long, Long> boundary = LJZI();
        LJJLL.getClass();
        o.LJIIIZ(boundary, "boundary");
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(LJJLL.LJII(), i);
        List<MultiEditVideoSegmentRecordData> list = LJJLL.LIZLLL().segmentDataList;
        o.LJIIIIZZ(list, "curRecordData.segmentDataList");
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ORZ.LJLLLLLL(i, list);
        int i3 = 0;
        if (multiEditVideoSegmentRecordData != null) {
            if (multiEditVideoSegmentRecordData.scale == 0.0f) {
                multiEditVideoSegmentRecordData.scale = LJJLL.LJLJJI;
            }
            f = multiEditVideoSegmentRecordData.scale;
        } else {
            f = LJJLL.LJLJJI;
        }
        int i4 = videoSegment.width;
        int i5 = videoSegment.height;
        C56K c56k = new C56K();
        c56k.element = f;
        float f2 = (i4 * f) / i5;
        if (i2 % 180 != 0) {
            c56k.element = f2;
            f2 = f;
        }
        LJJLL.LJLJJLL = f2;
        float f3 = f2 - c56k.element;
        InterfaceC153045zY interfaceC153045zY = LJJLL.LJLJLJ;
        if (interfaceC153045zY != null) {
            i3 = ((interfaceC153045zY.LLILZ().height / 2) - (C5O6.LIZLLL / 2)) - C5O6.LIZIZ;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new I77(LJJLL, c56k, f3, i3));
        ofFloat.addListener(new C46071I6h(LJJLL, i, f, i2, boundary));
        ofFloat.start();
        C136195Wd c136195Wd = LLIILZL;
        VideoPublishEditModel LJLIIL = LJLIIL();
        c136195Wd.getClass();
        C136195Wd.LIZIZ(LJLIIL, "spin_canvas", null);
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC46064I6a(C82622Wbi diContainer, WMH parentScene, int i) {
        super(diContainer);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJI = diContainer;
        this.LJLJJI = parentScene;
        this.LJLJJL = i;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 205));
        this.LJLJL = C221108m2.LIZIZ(C6ZG.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 204));
        this.LLD = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLF = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LLFF = UCI.LJI(getDiContainer(), InterfaceC146235oZ.class, null);
        this.LLFFF = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
        this.LLFII = UCI.LJI(getDiContainer(), C6FS.class, null);
        this.LLFZ = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LLI = UCI.LJII(getDiContainer(), InterfaceC140255ev.class, null);
        this.LLIIII = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LLIIJLIL = new C46080I6q(this);
        this.LLIIL = new C29901Fi<>();
        this.LLIILII = UCI.LJII(getDiContainer(), InterfaceC166716gV.class, null);
    }

    @Override // X.I6G
    public void Gp0(OSZ<Integer, Integer> originIndex, OSZ<Integer, Integer> visibleIndex, boolean z) {
        o.LJIIIZ(originIndex, "originIndex");
        o.LJIIIZ(visibleIndex, "visibleIndex");
        I6Z LJJLL = LJJLL();
        OSZ<Long, Long> boundary = LJZI();
        LJJLL.getClass();
        o.LJIIIZ(boundary, "boundary");
        int intValue = originIndex.getFirst().intValue();
        int intValue2 = originIndex.getSecond().intValue();
        int intValue3 = visibleIndex.getFirst().intValue();
        int intValue4 = visibleIndex.getSecond().intValue();
        C136195Wd c136195Wd = LLIILZL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("swapVideo,originIndex:[");
        LIZ.append(intValue);
        LIZ.append(',');
        LIZ.append(intValue2);
        LIZ.append("],visibleIndex:[");
        LIZ.append(intValue3);
        LIZ.append(',');
        LIZ.append(intValue4);
        LIZ.append("],isMusicSyncMode:");
        LIZ.append(LJJLL.LJLJL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c136195Wd.getClass();
        C136195Wd.LIZ(LIZIZ);
        ArrayList<TimeSpeedModelExtension> arrayList = LJJLL.LJLLLLLL;
        if (arrayList != null) {
            C162366Yu.LIZIZ(intValue3, intValue4, arrayList);
        }
        List<MultiEditVideoSegmentRecordData> list = LJJLL.LIZLLL().segmentDataList;
        if (list != null) {
            C162366Yu.LIZIZ(intValue, intValue2, list);
            int i = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    multiEditVideoSegmentRecordData.videoKey = i;
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (LJJLL.LJLJL) {
            C46072I6i LJIIIZ = LJJLL.LJIIIZ();
            if (LJIIIZ != null) {
                C5U8 LJIIIZ2 = LJIIIZ.LJIIIZ();
                LJIIIZ2.getClass();
                InterfaceC153045zY interfaceC153045zY = LJIIIZ2.LIZ;
                if (interfaceC153045zY != null && LJIIIZ2.LIZIZ >= 0 && interfaceC153045zY.LLJLILLLLZIIL(intValue, intValue2) >= 0 && interfaceC153045zY.updateAlgorithmFromNormal() >= 0 && interfaceC153045zY.genRandomSolve() == 0) {
                    LJIIIZ2.LJ(3, intValue2);
                }
            }
        } else {
            C46069I6f c46069I6f = LJJLL.LJLJLLL;
            if (c46069I6f != null) {
                List<VideoSegment> videoList = LJJLL.LJII();
                o.LJIIIZ(videoList, "videoList");
                if (C78946Uyc.LJIJJLI(c46069I6f.LIZIZ)) {
                    c46069I6f.LIZ.LLJLILLLLZIIL(intValue, intValue2);
                } else {
                    C46046I5i.LIZ(c46069I6f, false, null, 3);
                }
            }
            C46069I6f c46069I6f2 = LJJLL.LJLJLLL;
            if (c46069I6f2 != null) {
                c46069I6f2.LJFF((int) boundary.getFirst().longValue(), (int) boundary.getSecond().longValue());
            }
        }
        I7S.LIZ(LJJLL.LJIIJ(), 0L, null, 6);
    }

    public final void LLILL(boolean z, boolean z2, long j) {
        String str;
        if (z) {
            str = "click_trim_complete";
        } else {
            str = "click_trim_cancel";
        }
        C136195Wd c136195Wd = LLIILZL;
        VideoPublishEditModel LJLIIL = LJLIIL();
        C43883HKd c43883HKd = new C43883HKd(z2, this, j);
        c136195Wd.getClass();
        C136195Wd.LIZIZ(LJLIIL, str, c43883HKd);
    }

    @Override // X.InterfaceC146755pP
    public void LY(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LJJLIIIJJIZ(new AqS38S0210000_7(this, (AbstractC46064I6a) z2, (boolean) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0));
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIILLIIL(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIJJLI(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C2KE<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIL(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIILL(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIJJ(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    public static /* synthetic */ void LLJJL(AbstractC46064I6a abstractC46064I6a, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = -1;
            }
            abstractC46064I6a.LLJJJIL(z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveMusicPlay");
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIILJJIL(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIJI(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIILIIL(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIJ(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73297Sph.LJIIIIZZ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}
