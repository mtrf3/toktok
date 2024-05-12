package X;

import Y.AObjectS84S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C145225mw extends C145215mv {
    public final C82622Wbi LLFFF;
    public final WMH LLFII;
    public final int LLFZ;
    public final C5H3 LLI;
    public final C73318Sq2 LLIFFJFJJ;
    public boolean LLII;

    private final C145275n1 LJJLIIIIJ() {
        return (C145275n1) this.LLI.getValue();
    }

    public void LJJLIIIJILLIZJL() {
        this.LLIFFJFJJ.dispose();
    }

    @Override // X.C145215mv, X.InterfaceC145325n6
    public void hide() {
        super.hide();
        C145275n1 LJJLIIIIJ = LJJLIIIIJ();
        InterfaceC133285Ky interfaceC133285Ky = LJJLIIIIJ.LJLLILLLL;
        if (interfaceC133285Ky != null) {
            interfaceC133285Ky.hide();
        }
        C5L2 c5l2 = LJJLIIIIJ.LJZI;
        if (c5l2 != null) {
            ((C84868XSm) ((C84917XUj) c5l2).LJ.getValue()).release();
        }
        LJJLIIIIJ.LJZI = null;
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIJILLIZJL();
    }

    @Override // X.C145215mv, X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LLFFF;
    }

    @Override // X.C145215mv, X.InterfaceC145325n6
    public void show(boolean z) {
        Long l;
        String musicId;
        List<String> list;
        int i;
        boolean z2;
        boolean z3;
        String str;
        EnumC133275Kx enumC133275Kx;
        super.show(z);
        this.LLII = true;
        final C145275n1 LJJLIIIIJ = LJJLIIIIJ();
        LJJLIIIIJ.getClass();
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_music_entrance_edit");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("show: music: ");
        MusicObject musicObject = LJJLIIIIJ.LLJJ().creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            l = Long.valueOf(musicObject.id);
        } else {
            l = null;
        }
        LIZ.append(l);
        X1D.LIZIZ(LIZ);
        String str2 = "";
        if (LJJLIIIIJ.LJLLILLLL == null) {
            if (LJJLIIIIJ.LLJJ().creativeModel.micDataModel.editDefaultVolume == 0.0f && LJJLIIIIJ.LLJJ().creativeModel.micDataModel.editDefaultVolume == LJJLIIIIJ.LLJJ().voiceVolume && !LJJLIIIIJ.LLJJ().creativeModel.micDataModel.editVolumeChangeMark) {
                LJJLIIIIJ.LLJJ().voiceVolume = WUK.LJIIZILJ;
            }
            boolean LJIIJJI = C1JD.LJIIJJI(LJJLIIIIJ.LLJJ());
            LJJLIIIIJ.LJLLILLLL = C78934UyQ.LJLIL.getMusicService().LJJIIZ(LJJLIIIIJ.LJLIL, new XZI() { // from class: X.6ZZ
                public final C145235mx LIZ;

                @Override // X.XZI
                public final boolean A8() {
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI != null) {
                        return LLJJIJI.A8();
                    }
                    return false;
                }

                @Override // X.XZI
                public final VideoPublishEditModel LLLLIL() {
                    return C145275n1.this.LLJJ();
                }

                @Override // X.XZI
                public final boolean P9() {
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI != null) {
                        return LLJJIJI.P9();
                    }
                    return false;
                }

                @Override // X.XZI
                public final C149795uJ R9() {
                    return C145275n1.this.LLJJIII();
                }

                @Override // X.XZI
                public final boolean V9() {
                    VideoPublishEditModel LLJJ = C145275n1.this.LLJJ();
                    o.LJIIIZ(LLJJ, "<this>");
                    return C44384HbQ.LJJIIZI(LLJJ);
                }

                @Override // X.XZI
                public final Effect Y9() {
                    Effect zT;
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI == null || (zT = LLJJIJI.zT()) == null) {
                        return new Effect(null, 1, null);
                    }
                    return zT;
                }

                @Override // X.XZI
                public final InterfaceC149485to Z9() {
                    return this.LIZ;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.5mx] */
                {
                    this.LIZ = new InterfaceC149485to() { // from class: X.5mx
                        @Override // X.InterfaceC149485to
                        public final MusicBuzModel LIZIZ() {
                            return C145275n1.this.LLJJ().creativeModel.musicBuzModel;
                        }

                        @Override // X.InterfaceC149485to
                        public final void LIZ(AVMusic aVMusic) {
                            I9T.LJI(aVMusic, false, C145275n1.this.LLJJ().creativeModel.musicBuzModel);
                        }
                    };
                }

                @Override // X.XZI
                public final void Q9(List<? extends MusicModel> musicModels) {
                    o.LJIIIZ(musicModels, "musicModels");
                    C5L2 c5l2 = C145275n1.this.LJZI;
                    if (c5l2 != null) {
                        ((C84868XSm) ((C84917XUj) c5l2).LJ.getValue()).release();
                        C145275n1.this.LJZI = null;
                    }
                    int LIZ2 = C00F.LIZ(31744, 0, "studio_ai_music_panel_preload_collect_music_count", true);
                    C145275n1 c145275n1 = C145275n1.this;
                    if (LIZ2 > 0) {
                        C84917XUj LJIILL = MusicService.LJJLIIIJJI().LJIILL(LIZ2, c145275n1.getApplicationContext(), musicModels);
                        c145275n1.LJZI = LJIILL;
                        if (LJIILL == null || LJIILL.LIZ.isEmpty()) {
                            return;
                        }
                        LJIILL.LIZ();
                    }
                }

                @Override // X.XZI
                public final IStsPrepareHelper W9(ActivityC45651qj activityC45651qj) {
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI != null) {
                        return LLJJIJI.Oq(activityC45651qj, "Music");
                    }
                    return null;
                }

                @Override // X.XZI
                public final MusicModel X9(MusicModel musicModel) {
                    o.LJIIIZ(musicModel, "musicModel");
                    if (C145275n1.this.LLJJ().isReuseOriginalSound() && o.LJ(C145275n1.this.LLJJ().getReuseOriginalSoundId(), musicModel.getMusicId())) {
                        musicModel.setReuseAudioPlayUrl(C145275n1.this.LLJJ().getReuseOriginalSoundUrls());
                        musicModel.setDuration(C145275n1.this.LLJJ().getReuseOriginalSoundLength());
                        musicModel.setShootDuration(Integer.valueOf(C145275n1.this.LLJJ().getReuseOriginalSoundLength()));
                        musicModel.setMusicType(MusicModel.MusicType.REUSE_AUDIO);
                    }
                    return musicModel;
                }

                @Override // X.XZI
                public final Effect aa(String str3) {
                    Effect YK;
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI == null || (YK = LLJJIJI.YK(str3)) == null) {
                        return new Effect(null, 1, null);
                    }
                    return YK;
                }

                @Override // X.XZI
                public final void E5(IStsPrepareHelper iStsPrepareHelper, String taskId) {
                    o.LJIIIZ(taskId, "taskId");
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI != null) {
                        LLJJIJI.E5(iStsPrepareHelper, taskId);
                    }
                }

                @Override // X.XZI
                public final boolean T9(StsAssetModel stsAssetModel, long j) {
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI != null) {
                        return LLJJIJI.t50(stsAssetModel, true, Long.valueOf(j));
                    }
                    return false;
                }

                @Override // X.XZI
                public final void U9(Context context, Integer num) {
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI != null) {
                        LLJJIJI.em(context, num, 3066);
                    }
                }

                @Override // X.XZI
                public final String S9(IStsPrepareHelper iStsPrepareHelper, StsRequestModel stsRequestModel, XZB xzb) {
                    String iY;
                    InterfaceC162426Za LLJJIJI = C145275n1.this.LLJJIJI();
                    if (LLJJIJI == null || (iY = LLJJIJI.iY(iStsPrepareHelper, stsRequestModel, xzb)) == null) {
                        return "not init";
                    }
                    return iY;
                }
            });
            VideoPublishEditModel LLJJ = LJJLIIIIJ.LLJJ();
            if (LLJJ.isMvThemeVideoType() && !LLJJ.isDraftMusicIllegal()) {
                list = LLJJ.mvCreateVideoData.musicIds;
            } else {
                list = null;
            }
            LJJLIIIIJ.LLJJ();
            VideoPublishEditModel LLJJ2 = LJJLIIIIJ.LLJJ();
            Activity requireActivity = LJJLIIIIJ.requireActivity();
            o.LJII(requireActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            H8I h8i = new H8I(LLJJ2, (ActivityC45651qj) requireActivity, false);
            C145255mz c145255mz = new C145255mz(null, false, true);
            LJJLIIIIJ.LLJJ();
            Activity requireActivity2 = LJJLIIIIJ.requireActivity();
            o.LJII(requireActivity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) requireActivity2;
            AbstractC42651GoZ LJJIJIIJIL = C86793Y4n.LJJIJIIJIL(LJJLIIIIJ);
            InterfaceC153045zY value = LJJLIIIIJ.getEditPreviewApi().Kh().getValue();
            if (value != null) {
                i = value.getDuration();
            } else {
                i = 0;
            }
            String creationId = LJJLIIIIJ.LLJJ().getCreationId();
            if (creationId == null) {
                creationId = "";
            }
            if (LJJLIIIIJ.LLJJ().isPhotoMvMode || H7R.LJJJJL(LJJLIIIIJ.LLJJ())) {
                z2 = true;
            } else {
                z2 = false;
            }
            C149795uJ LLJJIII = LJJLIIIIJ.LLJJIII();
            boolean z4 = LJJLIIIIJ.LLJJ().editMusicSyncMode;
            if (!LJJLIIIIJ.LLJJ().mIsFromDraft && !LJJLIIIIJ.LLJJ().isCutSameVideoType() && !C44384HbQ.LJLL(LJJLIIIIJ.LLJJ())) {
                z3 = true;
            } else {
                z3 = false;
            }
            C145285n2 c145285n2 = LJJLIIIIJ.LLD;
            Bundle bundle = C86793Y4n.LJJIJIIJIL(LJJLIIIIJ).mArguments;
            if (bundle == null || (str = bundle.getString("music_id")) == null) {
                str = "";
            }
            if (C44384HbQ.LJLLLLLL(LJJLIIIIJ.LLJJ())) {
                enumC133275Kx = EnumC133275Kx.REPLACEMUSICPAGE;
            } else {
                enumC133275Kx = EnumC133275Kx.EDITPAGE;
            }
            XZH xzh = new XZH(c145255mz, list, null, activityC45651qj, LJJIJIIJIL, i, LJIIJJI ? 1 : 0, creationId, z2, LLJJIII, z4, z3, false, false, c145285n2, h8i, str, enumC133275Kx, LJJLIIIIJ.LJZL, C42000Ge4.LJIIL(LJJLIIIIJ.LLJJ()), LJJLIIIIJ.LLJJ().creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene());
            InterfaceC133285Ky interfaceC133285Ky = LJJLIIIIJ.LJLLILLLL;
            if (interfaceC133285Ky != null) {
                interfaceC133285Ky.LIZ(xzh);
            }
            LJJLIIIIJ.LLJJI().z3().LIZLLL(LJJLIIIIJ, new AObjectS84S0100000_2(LJJLIIIIJ, 1));
        }
        InterfaceC133285Ky interfaceC133285Ky2 = LJJLIIIIJ.LJLLILLLL;
        if (interfaceC133285Ky2 != null) {
            interfaceC133285Ky2.LIZLLL(LJJLIIIIJ.LLJJIII());
        }
        LJJLIIIIJ.LLJJ().creativeModel.micDataModel.editVolumeChangeMark = true;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJJLIIIIJ.LLJJ().creativeModel.musicBuzModel);
        if (extractAVMusic != null && (musicId = extractAVMusic.getMusicId()) != null) {
            str2 = musicId;
        }
        LJJLIIIIJ.LJLJJLL = str2;
        InterfaceC133285Ky interfaceC133285Ky3 = LJJLIIIIJ.LJLLILLLL;
        if (interfaceC133285Ky3 != null) {
            interfaceC133285Ky3.show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C145225mw(C82622Wbi diContainer, WMH parentScene, int i) {
        super(diContainer);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LLFFF = diContainer;
        this.LLFII = parentScene;
        this.LLFZ = i;
        this.LLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 59));
        this.LLIFFJFJJ = new C73318Sq2();
    }
}
