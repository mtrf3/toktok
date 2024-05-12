package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.AfS54S0100000_2;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.CanvasDurationConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS35S0210000_2;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.5tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149355tb extends AbstractC29891Fh<InterfaceC145405nE> implements InterfaceC145405nE, InterfaceC135635Tz, InterfaceC143795kd {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final C149355tb LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C40871j1<String> LJLZ;
    public final C40871j1<Boolean> LJZ;
    public final C40871j1<TextUtils.TruncateAt> LJZI;
    public final C40871j1<Boolean> LJZL;
    public final C40871j1<Boolean> LL;
    public final C40871j1<Boolean> LLD;
    public final C40871j1<Boolean> LLF;
    public final C40871j1<Integer> LLFF;
    public final C40871j1<Boolean> LLFFF;
    public final C40871j1<OSZ<Boolean, InterfaceC65784Pro<C76800UCe>>> LLFII;
    public final C5H3 LLFZ;
    public final long LLI;
    public final InterfaceC115514g7 LLIFFJFJJ;
    public final C149385te LLII;
    public AnonymousClass605 LLIIII;
    public final C162466Ze LLIIIILZ;
    public final C73318Sq2 LLIIIJ;

    public final void LJJLIIJ() {
        I30(null);
    }

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

    static {
        TBT tbt = new TBT(C149355tb.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C149355tb.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "changeAvatarApi", "getChangeAvatarApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/changeavatar/ChangeAvatarApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C149355tb.class, "recentMusicAddApi", "getRecentMusicAddApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicAddApi;", 0, c65351Pkp)};
    }

    private final CanvasDurationConfig LJJLJLI() {
        return (CanvasDurationConfig) this.LLFZ.getValue();
    }

    private final InterfaceC153215zp LJJLL() {
        return (InterfaceC153215zp) this.LJLLI.LIZ(this, LLIIIL[5]);
    }

    private final InterfaceC147905rG LJJZZIII() {
        return (InterfaceC147905rG) this.LJLLLLLL.getValue();
    }

    private final InterfaceC145325n6 LJLIIL() {
        return (InterfaceC145325n6) this.LJLLL.LIZ(this, LLIIIL[8]);
    }

    private final InterfaceC153275zv LJLJJLL() {
        return (InterfaceC153275zv) this.LJLL.LIZ(this, LLIIIL[4]);
    }

    private final AbstractC42651GoZ LJZI() {
        return (AbstractC42651GoZ) this.LJLJLJ.LIZ(this, LLIIIL[2]);
    }

    private final void LLIILZL() {
        if (!o.LJ(this.LJLZ.LIZ(), getActivity().getString(R.string.rjz))) {
            this.LJLZ.LJI(getActivity().getString(R.string.r8p));
        }
        this.LJZI.LJI(TextUtils.TruncateAt.MIDDLE);
        this.LJZL.LJI(Boolean.FALSE);
        this.LLFF.LJI(0);
        LJLLILLLL().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(false);
    }

    private final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJL.LIZ(this, LLIIIL[1]);
    }

    public final InterfaceC148865so LJJZZI() {
        return (InterfaceC148865so) this.LJLLILLLL.LIZ(this, LLIIIL[6]);
    }

    public final InterfaceC143655kP LJLJJL() {
        return (InterfaceC143655kP) this.LJLJLLL.LIZ(this, LLIIIL[3]);
    }

    public final InterfaceC136115Vv LJLJLJ() {
        return (InterfaceC136115Vv) this.LJLLLL.LIZ(this, LLIIIL[9]);
    }

    public final VideoPublishEditModel LJLLILLLL() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LLIIIL[0]);
    }

    public final InterfaceC145495nN LJLLL() {
        return (InterfaceC145495nN) this.LJLLJ.LIZ(this, LLIIIL[7]);
    }

    public final C5L0 LJLZ() {
        return (C5L0) this.LLIFFJFJJ.LIZ(this, LLIIIL[10]);
    }

    public final void LLF() {
        this.LLIIIILZ.LJ.observe(this, new AObjectS84S0100000_2(this, 124));
    }

    private final boolean LJJLIIIJILLIZJL() {
        return LJLLILLLL().isStickPointMode;
    }

    private final boolean LJJLIIIJJI() {
        if ((LJJLIIIJILLIZJL() || LJLLILLLL().isMvThemeVideoType() || C79004UzY.LJJIJL(LJLLILLLL().canvasVideoData)) && !LJLLILLLL().isCurrentAutoCutMode()) {
            return true;
        }
        return false;
    }

    private final boolean LJJLIIIJJIZ() {
        if (!LJLLILLLL().isPhotoMvMode && LJJLIIIJJI()) {
            return true;
        }
        return false;
    }

    private final void LLFFF() {
        ChangeAvatarModel changeAvatarModel;
        String str;
        LJLLL().z3().LIZLLL(this, new AObjectS84S0100000_2(this, 125));
        VideoPublishEditModel LJLLILLLL = LJLLILLLL();
        o.LJIIIZ(LJLLILLLL, "<this>");
        String str2 = "slideshow_rec";
        if (C44384HbQ.LLJILLL(LJLLILLLL)) {
            CommonMobParamModel commonMobParamModel = LJLLILLLL.creativeModel.commonMobModel;
            if (C78866UxK.LJJJLZIJ(LJLLILLLL) && !o.LJ("slideshow_rec", LJLLILLLL.getMusicOrigin())) {
                str = "shoot_page_selected";
            } else if (C149555tv.LIZ(LJLLILLLL) == 1) {
                str = "with_music_default";
            } else {
                str = "no_music_default";
            }
            commonMobParamModel.storyMusicOrigin = str;
        }
        if (C78866UxK.LJJJLZIJ(LJLLILLLL())) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJLLILLLL().creativeModel.musicBuzModel);
            if (extractAVMusic != null) {
                if (C44384HbQ.LJJIFFI()) {
                    LJLLILLLL().setMusicId(extractAVMusic.getMusicId());
                    LJLLL().w3(extractAVMusic.getMusicId(), LJLLILLLL().getMusicOrigin());
                }
                I30(extractAVMusic);
            }
            LLIFFJFJJ(true);
            return;
        }
        int LIZ = C149555tv.LIZ(LJLLILLLL());
        if (LIZ != 1) {
            if (LIZ != 2) {
                return;
            }
            LJJLJ("video_capsule_recommend", true);
        } else {
            CreativeModel creativeModel = LJLLILLLL().creativeModel;
            if (creativeModel != null && (changeAvatarModel = creativeModel.changeAvatarModel) != null && changeAvatarModel.isFromChangeAvatar) {
                str2 = "profile_photo";
            }
            LJJLJ(str2, false);
        }
    }

    private final boolean LLIIZ() {
        DMMediaModel dMMediaModel;
        VideoPublishEditModel LJLLILLLL = LJLLILLLL();
        o.LJIIIZ(LJLLILLLL, "<this>");
        if (LJLLILLLL.isDuet() || C44384HbQ.LJZL(LJLLILLLL) || LJLLILLLL.isUploadDuetMode() || C79004UzY.LJJIII(LJLLILLLL.canvasVideoData) || C79004UzY.LJJIL(LJLLILLLL.canvasVideoData)) {
            return false;
        }
        if (LJLLILLLL.isEnterFromDM() && (dMMediaModel = LJLLILLLL.creativeModel.dmMediaModel) != null && dMMediaModel.type == 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC145405nE
    public void G() {
        if (!H7R.LJJJJZ(LJLLILLLL()) && !this.LLIIIJ.LJLILLLLZI) {
            this.LLIIIJ.dispose();
        }
    }

    @Override // X.InterfaceC145405nE
    public void Hn0() {
        if (MusicBeanUtilKt.extractAVMusic(LJLLILLLL().creativeModel.musicBuzModel) != null) {
            this.LJZL.LJI(Boolean.valueOf(!LJJLIIIJJIZ()));
        }
    }

    @Override // X.InterfaceC145405nE
    public void LJII() {
        if (C149595tz.LIZ()) {
            this.LLFF.LJI(1);
        }
        this.LLF.LJI(Boolean.TRUE);
        this.LJZL.LJI(Boolean.FALSE);
    }

    @Override // X.InterfaceC145405nE
    public void LJIJ() {
        if (C149595tz.LIZ()) {
            this.LLFF.LJI(0);
        }
        this.LLF.LJI(Boolean.FALSE);
    }

    public final void LJJLI() {
        if (C146535p3.LIZLLL(LJLLILLLL())) {
            int i = C149625u2.LIZ[LJLLILLLL().creativeModel.audioCopyrightDetectModel.getMusicReplaceStatus().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.LJLZ.LJI(getActivity().getResources().getQuantityString(R.plurals.rn, 2));
                    this.LJZI.LJI(TextUtils.TruncateAt.MARQUEE);
                    this.LJZL.LJI(Boolean.FALSE);
                    this.LLFF.LJI(3);
                    LJLLILLLL().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(true);
                    return;
                }
                this.LJLZ.LJI(getActivity().getResources().getQuantityString(R.plurals.rm, 2));
                this.LJZI.LJI(TextUtils.TruncateAt.MARQUEE);
                this.LJZL.LJI(Boolean.FALSE);
                this.LLFF.LJI(1);
                LJLLILLLL().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(true);
                return;
            }
            if (C149275tT.LIZ() == 2) {
                this.LJLZ.LJI(getActivity().getResources().getQuantityString(R.plurals.rz, 1));
                this.LJZI.LJI(TextUtils.TruncateAt.MARQUEE);
                this.LJZL.LJI(Boolean.FALSE);
                this.LLFF.LJI(4);
                LJLLILLLL().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(true);
                return;
            }
            if (C149275tT.LIZ() == 1) {
                LLIILZL();
                return;
            }
            this.LJLZ.LJI(getActivity().getString(R.string.q09));
            this.LJZI.LJI(TextUtils.TruncateAt.MARQUEE);
            this.LJZL.LJI(Boolean.FALSE);
            this.LLFF.LJI(2);
            LJLLILLLL().creativeModel.audioCopyrightDetectModel.setCopyrightClaimShowing(true);
            return;
        }
        LLIILZL();
    }

    public final void LJJLIIIIJ() {
        LJLJJLL().A7(8);
    }

    public final void clearMusic() {
        I9T.LJI(null, false, LJLLILLLL().creativeModel.musicBuzModel);
        LJLLL().clearMusic();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        View findViewById;
        super.onCreate();
        if (!LLIIZ()) {
            return;
        }
        if (this.LJLJJI) {
            this.LLIIII = new AnonymousClass605(getDiContainer(), this.LLII);
            this.LJLZ.LJI(getActivity().getString(R.string.r8p));
            this.LJZI.LJI(TextUtils.TruncateAt.MIDDLE);
            this.LJZL.LJI(Boolean.FALSE);
            this.LLD.LJI(Boolean.valueOf(!LJJLIIIJILLIZJL()));
            LJLJJLL().n2().observe(LJZI(), new AObjectS84S0100000_2(this, 126));
            LiveData<Boolean> xW = LJLJJLL().xW();
            getLifecycleOwner();
            xW.observe(this, new AObserverS70S0100000_2(this, 89));
        }
        LJLJJL().jn().observe(this, new AObjectS84S0100000_2(this, 127));
        LLFFF();
        if (C44384HbQ.LLJILLL(LJLLILLLL()) && (findViewById = this.LJLILLLLZI.findViewById(this.LJLJI)) != null) {
            findViewById.setVisibility(8);
        }
        AnonymousClass605 anonymousClass605 = this.LLIIII;
        if (anonymousClass605 != null) {
            this.LJLILLLLZI.add(this.LJLJI, anonymousClass605, "StoryChooseMusicScene");
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        this.LLIIIJ.dispose();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
        I30(null);
    }

    public final void openMusicPanel() {
        LJLJJLL().A7(1);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC145405nE getApiComponent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    private final void LJJLIIIJLLLLLLLZ(AVMusic aVMusic) {
        TextUtils.TruncateAt truncateAt;
        StringBuilder sb = new StringBuilder("");
        String name = aVMusic.getName();
        if (name == null || name.length() == 0) {
            String singer = aVMusic.getSinger();
            if (singer != null && singer.length() != 0) {
                sb.append(aVMusic.getSinger());
            }
        } else {
            sb.append(aVMusic.getName());
            String singer2 = aVMusic.getSinger();
            if (singer2 != null && singer2.length() != 0) {
                sb.append('-');
                sb.append(aVMusic.getSinger());
            }
        }
        this.LJLZ.LJI(sb.toString());
        C40871j1<TextUtils.TruncateAt> c40871j1 = this.LJZI;
        int LIZ = C46122I8g.LIZ();
        if (LIZ != 1) {
            if (LIZ != 2) {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            } else {
                truncateAt = TextUtils.TruncateAt.END;
            }
        } else {
            truncateAt = null;
        }
        c40871j1.LJI(truncateAt);
        this.LJZL.LJI(Boolean.valueOf(!LJJLIIIJJIZ()));
        this.LLFF.LJI(0);
    }

    private final void LLIIIL(int i) {
        LJJZZIII().LLLLIIIILLL(new OSZ<>(Integer.valueOf(i), Integer.valueOf(i)));
        InterfaceC153215zp LJJLL = LJJLL();
        if (LJJLL != null) {
            LJJLL.LJJIJIIJIL(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (X.C149275tT.LIZ() == 1) goto L8;
     */
    @Override // X.InterfaceC145405nE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I30(com.ss.android.ugc.aweme.shortvideo.AVMusic r4) {
        /*
            r3 = this;
            if (r4 != 0) goto Le
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJLLILLLL()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            com.ss.android.ugc.aweme.shortvideo.AVMusic r4 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
        Le:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJLLILLLL()
            boolean r0 = X.C146535p3.LIZLLL(r0)
            r2 = 0
            if (r0 == 0) goto L20
            int r1 = X.C149275tT.LIZ()
            r0 = 1
            if (r1 != r0) goto L21
        L20:
            r0 = 0
        L21:
            if (r4 == 0) goto L34
            if (r0 != 0) goto L34
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r3.LJLLILLLL()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r0 = r0.audioCopyrightDetectModel
            r0.setCopyrightClaimShowing(r2)
            r3.LJJLIIIJLLLLLLLZ(r4)
        L33:
            return
        L34:
            r3.LJJLI()
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149355tb.I30(com.ss.android.ugc.aweme.shortvideo.AVMusic):void");
    }

    public final void LLIFFJFJJ(boolean z) {
        Object obj;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(LJLLILLLL()));
        c145995oB.LJI("content_type", H7R.LJIIIZ(LJLLILLLL()));
        c145995oB.LJI("shoot_way", LJLLILLLL().mShootWay);
        c145995oB.LJI("creation_id", LJLLILLLL().getCreationId());
        c145995oB.LJI("music_selected_from", LJLLILLLL().getMusicOrigin());
        c145995oB.LJI("music_id", LJLLILLLL().getMusicId());
        c145995oB.LIZ(H8F.LJIIL(LJLLILLLL()), "is_multi_content");
        MusicObject musicObject = LJLLILLLL().creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            obj = Integer.valueOf(musicObject.duration);
        } else {
            obj = null;
        }
        c145995oB.LIZJ(obj, "music_duration");
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LJI("recommend_source_from", C44384HbQ.LJJLIIIJ(LJLLILLLL()));
        c145995oB.LIZIZ(System.currentTimeMillis() - this.LLI, "duration");
        FMX.LJIIL("auto_music_capsule_loading_time", c145995oB.LIZ);
    }

    public final void LLILZIL(int i) {
        VideoFileInfo videoFileInfo;
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        Integer valueOf;
        int i2 = i;
        if (i2 == 0) {
            i2 = LJJLJLI().defaultDuration;
        }
        int i3 = LJJLJLI().minDuration;
        if (i2 < i3) {
            i2 = i3;
        }
        int i4 = LJJLJLI().maxDuration;
        if (i2 > i4) {
            i2 = i4;
        }
        InterfaceC153045zY value = LJLJJL().Kh().getValue();
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (value == null || (valueOf = Integer.valueOf(value.LLIZLLLIL())) == null || valueOf.intValue() != i2) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) ORZ.LJLLLL(LJLLILLLL().getPreviewInfo().getVideoList());
            if (editVideoSegment != null) {
                videoFileInfo = editVideoSegment.getVideoFileInfo();
            } else {
                videoFileInfo = null;
            }
            EditVideoSegment editVideoSegment2 = (EditVideoSegment) ORZ.LJLLLL(LJLLILLLL().getPreviewInfo().getVideoList());
            if (videoFileInfo == null || editVideoSegment2 == null) {
                return;
            }
            int i5 = 0;
            LJLLILLLL().setPreviewInfo(new C149505tq(videoFileInfo.getWidth(), videoFileInfo.getHeight(), 12).LIZ(new EditVideoSegment(editVideoSegment2.getVideoPath(), null, new VideoFileInfo(videoFileInfo.getWidth(), videoFileInfo.getHeight(), i2, 30, i5, i5, i5, i5, 0.0f, 496, defaultConstructorMarker))));
            LJLLILLLL().setVideoLength(i2);
            if (value != null) {
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.trimOut = i2;
                C122034qd LJJI = C17N.LJJI(value);
                if (LJJI != null) {
                    NLEEditor nleEditor = LJJI.LJIIJ;
                    o.LJIIIZ(nleEditor, "nleEditor");
                    NLEModel LJ = nleEditor.LJ();
                    if (LJ != null && (mainTrack = LJ.getMainTrack()) != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, mainTrack.LJIILL())) != null) {
                        nLETrackSlot.setStartTime(vEClipTimelineParam.trimIn * 1000);
                        nLETrackSlot.setEndTime(vEClipTimelineParam.trimOut * 1000);
                        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
                        if (LJJ != null) {
                            LJJ.LJIJJLI(vEClipTimelineParam.trimIn * 1000);
                            LJJ.LJIJJ(vEClipTimelineParam.trimOut * 1000);
                            LJJ.setSpeed((float) vEClipTimelineParam.speed);
                        }
                        nleEditor.LIZIZ();
                    }
                    LLIIIL(i2);
                    LJLLL().A3();
                    value.LLIZ(-1, VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                    value.play();
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    private final void LJJLJ(String str, boolean z) {
        Integer num;
        HashMap<String, Integer> extraShareOptions = LJLLILLLL().creativeFlowData.getExtraShareOptions();
        if ((extraShareOptions == null || (num = extraShareOptions.get("tiktok_videokit_disable_music_selection")) == null || num.intValue() != 1) && !H7R.LJJLIIIJJIZ(LJLLILLLL())) {
            RJ(str, z);
        }
        if (z) {
            H78.LJI("JDW: AUTO MUSIC: musicActivityDetected start loader");
            VoiceDetectorService.LIZ().setVoiceDetectionListener(1, new C126384xe(new AqS168S0100000_2(this, 246)));
        } else {
            LLF();
        }
    }

    public final void LLILL(boolean z, AnonymousClass605 anonymousClass605) {
        if (z) {
            this.LJLILLLLZI.show(anonymousClass605);
        }
        this.LLFII.LJI(new OSZ<>(Boolean.valueOf(z), new AqS35S0210000_2(z, this, anonymousClass605, 1)));
    }

    @Override // X.InterfaceC145405nE
    public void RJ(final String musicOrigin, boolean z) {
        boolean z2;
        o.LJIIIZ(musicOrigin, "musicOrigin");
        C162466Ze c162466Ze = this.LLIIIILZ;
        Context LLLLLILLIL = C16880lQ.LLLLLILLIL(getActivity());
        o.LJIIIIZZ(LLLLLILLIL, "activity.applicationContext");
        VideoPublishEditModel LJLLILLLL = LJLLILLLL();
        c162466Ze.getClass();
        c162466Ze.LIZIZ = LJLLILLLL;
        c162466Ze.LIZJ = LLLLLILLIL;
        this.LLIIIILZ.LIZLLL = new AqS56S1100000_2(this, musicOrigin, 2);
        this.LLIIIJ.LIZ(this.LLIIIILZ.LIZ(LJLLILLLL(), new InterfaceC149485to() { // from class: X.5nW
            @Override // X.InterfaceC149485to
            public final MusicBuzModel LIZIZ() {
                return C149355tb.this.LJLLILLLL().creativeModel.musicBuzModel;
            }

            @Override // X.InterfaceC149485to
            public final void LIZ(AVMusic aVMusic) {
                I9T.LJI(aVMusic, false, C149355tb.this.LJLLILLLL().creativeModel.musicBuzModel);
                C149355tb.this.LJLLILLLL().setMusicOrigin(musicOrigin);
                C149355tb.this.LLIFFJFJJ(true);
            }
        }, z).LJJJLIIL(new AfS54S0100000_2(this, 6), new AfS54S0100000_2(this, 7)));
        C162466Ze c162466Ze2 = this.LLIIIILZ;
        synchronized (c162466Ze2) {
            z2 = c162466Ze2.LIZ;
        }
        if (z2) {
            LJII();
        } else {
            LJJLI();
        }
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
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

    public C149355tb(C82622Wbi diContainer, WMH parentScene, int i, boolean z) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = this;
        this.LJLJJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), AbstractC42651GoZ.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), InterfaceC153215zp.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC148865so.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC145325n6.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC136115Vv.class, null);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 412));
        C40871j1<String> c40871j1 = new C40871j1<>("");
        this.LJLZ = c40871j1;
        Boolean bool = Boolean.TRUE;
        C40871j1<Boolean> c40871j12 = new C40871j1<>(bool);
        this.LJZ = c40871j12;
        C40871j1<TextUtils.TruncateAt> c40871j13 = new C40871j1<>(TextUtils.TruncateAt.MIDDLE);
        this.LJZI = c40871j13;
        Boolean bool2 = Boolean.FALSE;
        C40871j1<Boolean> c40871j14 = new C40871j1<>(bool2);
        this.LJZL = c40871j14;
        this.LL = new C40871j1<>(bool2);
        C40871j1<Boolean> c40871j15 = new C40871j1<>(bool);
        this.LLD = c40871j15;
        this.LLF = new C40871j1<>(bool2);
        C40871j1<Integer> c40871j16 = new C40871j1<>(0);
        this.LLFF = c40871j16;
        C40871j1<Boolean> c40871j17 = new C40871j1<>(bool2);
        this.LLFFF = c40871j17;
        C40871j1<OSZ<Boolean, InterfaceC65784Pro<C76800UCe>>> c40871j18 = new C40871j1<>(null);
        this.LLFII = c40871j18;
        this.LLFZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 411));
        this.LLI = System.currentTimeMillis();
        this.LLIFFJFJJ = UCI.LJII(getDiContainer(), C5L0.class, null);
        C149385te c149385te = new C149385te();
        c149385te.LIZ = c40871j1;
        c149385te.LIZJ = c40871j13;
        c149385te.LIZIZ = c40871j12;
        c149385te.LIZLLL = c40871j14;
        c149385te.LJ = c40871j15;
        c149385te.LJFF = c40871j17;
        c149385te.LJIIIIZZ = new C149425ti(this);
        c149385te.LJIIIZ = new C149435tj(this);
        c149385te.LJIIJ = new C149445tk(this);
        c149385te.LJIIJJI = new C149455tl(this);
        c149385te.LJI = c40871j16;
        c149385te.LJII = c40871j18;
        this.LLII = c149385te;
        this.LLIIIILZ = new C162466Ze();
        this.LLIIIJ = new C73318Sq2();
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
