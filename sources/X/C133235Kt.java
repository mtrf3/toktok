package X;

import Y.AObserverS70S0100000_2;
import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.AqS59S0110000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133235Kt implements C5ID {
    public final EditorProScene LIZ;
    public final InterfaceC132055Gf LIZIZ;
    public final C132115Gl LIZJ;
    public final InterfaceC162426Za LIZLLL;
    public final C29S LJ;
    public InterfaceC133285Ky LJFF;
    public C5L2 LJI;
    public final C62822Ol8 LJII;
    public long LJIIIIZZ;
    public Long LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public AVMusic LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public OSZ<Integer, Integer> LJIILL;
    public String LJIILLIIL;
    public C5L0 LJIIZILJ;
    public boolean LJIJ;
    public final C133225Ks LJIJI;

    @Override // X.C5ID
    public final void LIZIZ() {
        this.LJIIL = null;
    }

    public static VideoPublishEditModel LJI() {
        return C132805Jc.LIZIZ(EditModelProvider.Companion);
    }

    @Override // X.C5ID
    public final Long LIZ() {
        return Long.valueOf(this.LJIIIIZZ);
    }

    @Override // X.C5ID
    public final void LIZJ() {
        InterfaceC133285Ky interfaceC133285Ky = this.LJFF;
        if (interfaceC133285Ky != null) {
            interfaceC133285Ky.refresh();
        }
    }

    @Override // X.C5ID
    public final void LIZLLL() {
        InterfaceC133285Ky interfaceC133285Ky = this.LJFF;
        if (interfaceC133285Ky != null) {
            interfaceC133285Ky.hide();
        }
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("tool_editor_pro_scene", true);
    }

    public final EditorProContext LJ() {
        return (EditorProContext) this.LJII.getValue();
    }

    public static VideoPublishEditModel LJFF() {
        VideoPublishEditModel LJI = LJI();
        if (LJI != null) {
            return LJI;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJII() {
        String str;
        CreativeModel creativeModel;
        C79057V0z.LJJJJL(LJ(), "panel_bounce_event", new AnonymousClass516("ai_music_panel", 0.0f, true));
        this.LIZIZ.LJIIIZ(this);
        VideoPublishEditModel LJI = LJI();
        MusicBuzModel musicBuzModel = null;
        if (LJI != null && (creativeModel = LJI.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (extractAVMusic == null || (str = extractAVMusic.getMusicId()) == null) {
            str = "";
        }
        this.LJIILLIIL = str;
        InterfaceC133285Ky interfaceC133285Ky = this.LJFF;
        if (interfaceC133285Ky != null) {
            interfaceC133285Ky.show();
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.5Ks] */
    public C133235Kt(EditorProScene scene, InterfaceC132055Gf interfaceC132055Gf, C132115Gl mobBean) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(mobBean, "mobBean");
        this.LIZ = scene;
        this.LIZIZ = interfaceC132055Gf;
        this.LIZJ = mobBean;
        this.LIZLLL = null;
        Activity requireActivity = scene.requireActivity();
        o.LJII(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.LJ = (C29S) requireActivity;
        this.LJII = C221108m2.LIZIZ(C123614tB.LJLIL);
        this.LJIIJJI = true;
        this.LJIILIIL = "";
        this.LJIILLIIL = "";
        this.LJIJI = new XZN() { // from class: X.5Ks
            @Override // X.XZN
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.XZN
            public final MusicModel LIZJ() {
                return null;
            }

            @Override // X.XZN
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.XZN
            public final void N9() {
            }

            @Override // X.XZN
            public final void O9(String str) {
            }

            @Override // X.XZN
            public final void Q9() {
            }

            @Override // X.XZN
            public final void S9() {
            }

            @Override // X.XZN
            public final void T9(C149795uJ c149795uJ) {
            }

            @Override // X.XZN
            public final void U9(MusicModel musicModel, boolean z, String currentTab, long j) {
                o.LJIIIZ(currentTab, "currentTab");
            }

            @Override // X.XZN
            public final void V9(boolean z) {
            }

            @Override // X.XZN
            public final void Z9(float f) {
            }

            @Override // X.XZN
            public final void R9() {
                C133235Kt c133235Kt = C133235Kt.this;
                if (c133235Kt.LJIJ) {
                    c133235Kt.LJIIL = null;
                }
                AVMusic aVMusic = c133235Kt.LJIIL;
                c133235Kt.LIZIZ.LIZLLL(true, true);
                if (aVMusic != null && !TextUtils.isEmpty(C133235Kt.this.LJIILJJIL)) {
                    C79057V0z.LJJJJL(C133235Kt.this.LJ(), "status_show_null_audio_track", Boolean.FALSE);
                    C133235Kt c133235Kt2 = C133235Kt.this;
                    InterfaceC132055Gf interfaceC132055Gf2 = c133235Kt2.LIZIZ;
                    String str = c133235Kt2.LJIILJJIL;
                    if (str == null) {
                        str = "";
                    }
                    interfaceC132055Gf2.LJI(aVMusic, str, "", true, c133235Kt2.LIZ(), new AqS152S0100000_2(C133235Kt.this, 1043));
                }
            }

            @Override // X.XZN
            public final void W9() {
                String str;
                String str2;
                C122284r2.LIZ(C133235Kt.this.LJ().getEditor().s9());
                C133235Kt c133235Kt = C133235Kt.this;
                if (c133235Kt.LJIIJJI) {
                    C32151Nz.LIZJ(c133235Kt.LJ());
                } else {
                    C32151Nz.LJJIJIL(c133235Kt.LJ());
                }
                C133235Kt.this.getClass();
                VideoPublishEditModel LJI = C133235Kt.LJI();
                if (LJI != null) {
                    AVMusic aVMusic = C133235Kt.this.LJIIL;
                    if (aVMusic != null) {
                        str = aVMusic.getMusicId();
                    } else {
                        str = null;
                    }
                    C145995oB LJJJLIIL = H8F.LJJJLIIL(LJI);
                    if (LJI.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
                        str2 = "promote";
                    } else {
                        str2 = "video_edit_page";
                    }
                    LJJJLIIL.LJI("enter_from", str2);
                    LJJJLIIL.LJI("shoot_way", LJI.mShootWay);
                    LJJJLIIL.LJI("music_id", str);
                    LJJJLIIL.LIZ(1, "is_editor_pro");
                    LJJJLIIL.LIZ(LJI.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                    LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(LJI));
                    LJJJLIIL.LJI("content_type", H7R.LJIIIZ(LJI));
                    LJJJLIIL.LJI("creation_id", LJI.getCreationId());
                    FMX.LJIIL("add_music", LJJJLIIL.LIZ);
                }
                C133235Kt.this.LJ().getPlayer().pause();
                C133235Kt.this.LJ().getPlayer().M9(C133235Kt.this.LIZ().longValue() * 1000);
                C133235Kt.this.LIZIZ.LJIIIZ(null);
                AVMusic aVMusic2 = C133235Kt.this.LJIIL;
                if (aVMusic2 != null) {
                    aVMusic2.setCollected(C133295Kz.LIZ.containsKey(aVMusic2.getMusicId()));
                }
                C133235Kt c133235Kt2 = C133235Kt.this;
                c133235Kt2.LIZIZ.LJ(c133235Kt2.LJIIL);
                InterfaceC133285Ky interfaceC133285Ky = C133235Kt.this.LJFF;
                if (interfaceC133285Ky != null) {
                    interfaceC133285Ky.hide();
                }
                C132385Hm.LJIIJ(C133235Kt.this.LJIILIIL, C133235Kt.this.LJ());
                C133235Kt c133235Kt3 = C133235Kt.this;
                c133235Kt3.LJIIL = null;
                c133235Kt3.LJIILJJIL = null;
                c133235Kt3.LJIILIIL = "";
                NLETrackSlot LJIIL = C132385Hm.LJIIL(c133235Kt3.LJ());
                if (LJIIL != null) {
                    C79057V0z.LJJJJLI(c133235Kt3.LJ(), "selected_audio_track_slot", LJIIL, true);
                }
                C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("tool_editor_pro_scene", true);
            }

            @Override // X.XZN
            public final void Y9() {
                C5L0 c5l0;
                String str;
                CreativeModel creativeModel;
                C79057V0z.LJJJJL(C133235Kt.this.LJ(), "panel_bounce_event", new AnonymousClass516("ai_music_panel", C170576mj.LIZIZ(C133235Kt.this.LJ) / 2, false));
                C79057V0z.LJJ(C133235Kt.this.LJ()).LJFF();
                MusicBuzModel musicBuzModel = null;
                C133235Kt.this.LIZIZ.LJIIIZ(null);
                C133235Kt.this.getClass();
                VideoPublishEditModel LJI = C133235Kt.LJI();
                if (LJI != null && (creativeModel = LJI.creativeModel) != null) {
                    musicBuzModel = creativeModel.musicBuzModel;
                }
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
                C133235Kt c133235Kt = C133235Kt.this;
                if (extractAVMusic != null && !o.LJ(extractAVMusic.getMusicId(), c133235Kt.LJIILLIIL) && (c5l0 = C133235Kt.this.LJIIZILJ) != null) {
                    MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
                    VideoPublishEditModel LJI2 = C133235Kt.LJI();
                    if (LJI2 == null || (str = LJI2.getMusicOriginWithCheck()) == null) {
                        str = "";
                    }
                    c5l0.Lp(LJJIJIL, str);
                }
            }

            @Override // X.XZN
            public final void aa() {
                C133235Kt.this.getClass();
                VideoPublishEditModel LJI = C133235Kt.LJI();
                if (LJI != null) {
                    H8F.LJIJ(LJI, true);
                }
                C133235Kt.this.LJ().getPlayer().pause();
                C133235Kt c133235Kt = C133235Kt.this;
                c133235Kt.LIZIZ.LJIIJJI(null, c133235Kt.LIZJ);
            }

            @Override // X.XZN
            public final void ca() {
                C133235Kt.this.LJIJ = true;
            }

            @Override // X.XZN
            public final void da() {
                C133235Kt.this.LJ().getPlayer().pause();
            }

            @Override // X.XZN
            public final void X9(boolean z) {
                C133235Kt c133235Kt = C133235Kt.this;
                c133235Kt.LJIIL = null;
                c133235Kt.LJ().getPlayer().pause();
                C133235Kt.this.LJ().getPlayer().M9(C133235Kt.this.LJIIJ * 1000);
                C133235Kt.this.getClass();
                VideoPublishEditModel LJI = C133235Kt.LJI();
                if (LJI != null) {
                    C5QW.LJIILJJIL(LJI, "music", z, true);
                }
            }

            @Override // X.XZN
            public final void ba(AVMusic aVMusic, AqS57S1200000_2 aqS57S1200000_2) {
                aqS57S1200000_2.invoke();
            }

            @Override // X.XZN
            public final void P9(String str, AVMusic aVMusic, boolean z, boolean z2, boolean z3, boolean z4, String currentTab, String str2) {
                String str3;
                Long LIZ;
                MutableLiveData LJII;
                long j;
                String str4 = str;
                o.LJIIIZ(currentTab, "currentTab");
                if (aVMusic != null) {
                    if (!TextUtils.isEmpty(str4)) {
                        C133235Kt c133235Kt = C133235Kt.this;
                        c133235Kt.LJIILJJIL = str4;
                        c133235Kt.LJIIL = aVMusic;
                        if (z) {
                            str3 = "edit_page_recommend";
                        } else if (z2) {
                            str3 = "edit_page_recommend_favourite_recommend";
                        } else {
                            str3 = "edit_page_recommend_favourite";
                        }
                        c133235Kt.LJIILIIL = str3;
                        if (z3 && (LJII = C79057V0z.LJII(c133235Kt.LJ(), "status_music_sync_on")) != null && o.LJ(LJII.getValue(), Boolean.TRUE)) {
                            C79057V0z.LJJ(C133235Kt.this.LJ()).LJFF();
                            InterfaceC127784zu player = C133235Kt.this.LJ().getPlayer();
                            Long l = C133235Kt.this.LJIIIZ;
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            player.M9(j * 1000);
                            C133235Kt.this.LJ().getPlayer().play();
                        } else {
                            C133235Kt c133235Kt2 = C133235Kt.this;
                            InterfaceC132055Gf interfaceC132055Gf2 = c133235Kt2.LIZIZ;
                            if (str4 == null) {
                                str4 = "";
                            }
                            if (z3) {
                                LIZ = c133235Kt2.LJIIIZ;
                            } else {
                                LIZ = c133235Kt2.LIZ();
                            }
                            interfaceC132055Gf2.LJI(aVMusic, str4, "", true, LIZ, new AqS59S0110000_2(z3, C133235Kt.this, 6));
                        }
                    }
                } else {
                    C133235Kt c133235Kt3 = C133235Kt.this;
                    if (c133235Kt3.LJIIL != null && !TextUtils.isEmpty(c133235Kt3.LJIILJJIL)) {
                        C133235Kt.this.LJ().getPlayer().M9(C133235Kt.this.LIZ().longValue() * 1000);
                        C133235Kt.this.LJ().getPlayer().play();
                    }
                }
                C133235Kt c133235Kt4 = C133235Kt.this;
                c133235Kt4.LJIJ = false;
                if (z3) {
                    MutableLiveData K9 = c133235Kt4.LJ().getPlayer().K9();
                    C133235Kt c133235Kt5 = C133235Kt.this;
                    K9.observe(c133235Kt5.LIZ, new AObserverS70S0100000_2(c133235Kt5, 332));
                    return;
                }
                c133235Kt4.LJ().getPlayer().K9().removeObservers(C133235Kt.this.LIZ);
            }
        };
    }
}
