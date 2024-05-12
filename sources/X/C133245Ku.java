package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.services.audio.IStsPrepareHelper;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133245Ku {
    public final InterfaceC132055Gf LIZ;
    public final C133235Kt LIZIZ;

    public final void LIZ() {
        boolean z;
        Long l;
        int i;
        boolean z2;
        Object obj;
        OSZ<Integer, Integer> osz;
        NLETimeSpaceNode nLETimeSpaceNode;
        final C133235Kt c133235Kt = this.LIZIZ;
        c133235Kt.LJ().getPlayer().pause();
        c133235Kt.LJIIJJI = ((ArrayList) C32151Nz.LJIJJLI(c133235Kt.LJ())).isEmpty();
        c133235Kt.LJIIJ = C79057V0z.LJIJJLI(c133235Kt.LJ());
        C5L0 c5l0 = null;
        c133235Kt.LJIIIZ = null;
        c133235Kt.LJIIL = null;
        NLETrack nLETrack = (NLETrack) ORZ.LJLLLL(C32151Nz.LJIJJLI(c133235Kt.LJ()));
        if (nLETrack != null && (nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LJLLLL(nLETrack.LJIILL())) != null) {
            c133235Kt.LJIIIZ = Long.valueOf(nLETimeSpaceNode.getStartTime() / 1000);
        }
        MutableLiveData LJII = C79057V0z.LJII(c133235Kt.LJ(), "status_music_sync_on");
        if (LJII != null) {
            z = o.LJ(LJII.getValue(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (z) {
            c133235Kt.LJIIIIZZ = 0L;
        } else {
            c133235Kt.LJIIIIZZ = C79057V0z.LJIJJLI(c133235Kt.LJ());
            if (C133005Jw.LIZ()) {
                c133235Kt.LJIIIIZZ = 0L;
            }
            if (e1.LIZ(31744, "studio_editor_pro_change_replace_sound_position", true, false) && (l = c133235Kt.LJIIIZ) != null) {
                c133235Kt.LJIIIIZZ = l.longValue();
            }
        }
        C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(c133235Kt.LIZ);
        if (LJJLIIIJJI != null) {
            c5l0 = (C5L0) LJJLIIIJJI.LJIIIIZZ(null, C5L0.class);
        }
        c133235Kt.LJIIZILJ = c5l0;
        if (c133235Kt.LJFF != null) {
            c133235Kt.LJII();
        } else {
            IAnotherMusicService musicService = C78934UyQ.LJLIL.getMusicService();
            C82622Wbi LJJLIIIJJI2 = C44384HbQ.LJJLIIIJJI(c133235Kt.LIZ);
            if (LJJLIIIJJI2 == null) {
                LJJLIIIJJI2 = new C82622Wbi(new C82621Wbh[0]);
            }
            c133235Kt.LJFF = musicService.LJJIIZ(LJJLIIIJJI2, new XZI() { // from class: X.6ZY
                public final C133265Kw LIZ;

                @Override // X.XZI
                public final MusicModel X9(MusicModel musicModel) {
                    o.LJIIIZ(musicModel, "musicModel");
                    return musicModel;
                }

                @Override // X.XZI
                public final boolean A8() {
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za != null) {
                        return interfaceC162426Za.A8();
                    }
                    return false;
                }

                @Override // X.XZI
                public final VideoPublishEditModel LLLLIL() {
                    C133235Kt.this.getClass();
                    return C133235Kt.LJFF();
                }

                @Override // X.XZI
                public final boolean P9() {
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za != null) {
                        return interfaceC162426Za.P9();
                    }
                    return false;
                }

                @Override // X.XZI
                public final C149795uJ R9() {
                    return new C149795uJ(false, false, false, 0.0f, false, false, 511);
                }

                @Override // X.XZI
                public final boolean V9() {
                    C133235Kt.this.getClass();
                    return C44384HbQ.LJJIIZI(C133235Kt.LJFF());
                }

                @Override // X.XZI
                public final Effect Y9() {
                    Effect zT;
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za == null || (zT = interfaceC162426Za.zT()) == null) {
                        return new Effect(null, 1, null);
                    }
                    return zT;
                }

                @Override // X.XZI
                public final InterfaceC149485to Z9() {
                    return this.LIZ;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.5Kw] */
                {
                    this.LIZ = new InterfaceC149485to() { // from class: X.5Kw
                        @Override // X.InterfaceC149485to
                        public final MusicBuzModel LIZIZ() {
                            C133235Kt.this.getClass();
                            return C133235Kt.LJFF().creativeModel.musicBuzModel;
                        }

                        @Override // X.InterfaceC149485to
                        public final void LIZ(AVMusic aVMusic) {
                            C133235Kt.this.getClass();
                            I9T.LJI(aVMusic, false, C133235Kt.LJFF().creativeModel.musicBuzModel);
                        }
                    };
                }

                @Override // X.XZI
                public final void Q9(List<? extends MusicModel> musicModels) {
                    o.LJIIIZ(musicModels, "musicModels");
                    C5L2 c5l2 = C133235Kt.this.LJI;
                    if (c5l2 != null) {
                        ((C84868XSm) ((C84917XUj) c5l2).LJ.getValue()).release();
                        C133235Kt.this.LJI = null;
                    }
                    int LIZ = C00F.LIZ(31744, 0, "studio_ai_music_panel_preload_collect_music_count", true);
                    C133235Kt c133235Kt2 = C133235Kt.this;
                    if (LIZ > 0) {
                        C84917XUj LJIILL = MusicService.LJJLIIIJJI().LJIILL(LIZ, C83739Wtj.LIZ(), musicModels);
                        c133235Kt2.LJI = LJIILL;
                        if (LJIILL == null || LJIILL.LIZ.isEmpty()) {
                            return;
                        }
                        LJIILL.LIZ();
                    }
                }

                @Override // X.XZI
                public final IStsPrepareHelper W9(ActivityC45651qj activityC45651qj) {
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za != null) {
                        return interfaceC162426Za.Oq(activityC45651qj, "Music");
                    }
                    return null;
                }

                @Override // X.XZI
                public final Effect aa(String str) {
                    Effect YK;
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za == null || (YK = interfaceC162426Za.YK(str)) == null) {
                        return new Effect(null, 1, null);
                    }
                    return YK;
                }

                @Override // X.XZI
                public final void E5(IStsPrepareHelper iStsPrepareHelper, String taskId) {
                    o.LJIIIZ(taskId, "taskId");
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za != null) {
                        interfaceC162426Za.E5(iStsPrepareHelper, taskId);
                    }
                }

                @Override // X.XZI
                public final boolean T9(StsAssetModel stsAssetModel, long j) {
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za != null) {
                        return interfaceC162426Za.t50(stsAssetModel, true, Long.valueOf(j));
                    }
                    return false;
                }

                @Override // X.XZI
                public final void U9(Context context, Integer num) {
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za != null) {
                        interfaceC162426Za.em(context, num, 3066);
                    }
                }

                @Override // X.XZI
                public final String S9(IStsPrepareHelper iStsPrepareHelper, StsRequestModel stsRequestModel, XZB xzb) {
                    String iY;
                    InterfaceC162426Za interfaceC162426Za = C133235Kt.this.LIZLLL;
                    if (interfaceC162426Za == null || (iY = interfaceC162426Za.iY(iStsPrepareHelper, stsRequestModel, xzb)) == null) {
                        return "not init";
                    }
                    return iY;
                }
            });
            int LIZLLL = (int) (C124574uj.LIZLLL(c133235Kt.LJ().getEditor().r9()) / 1000);
            if (LIZLLL >= 61000) {
                i = 1;
            } else {
                i = 0;
            }
            H8I h8i = new H8I(C133235Kt.LJFF(), c133235Kt.LJ, true);
            C145255mz c145255mz = new C145255mz(new AqS152S0100000_2(c133235Kt, 1042), true, false);
            C133235Kt.LJFF();
            Integer valueOf = Integer.valueOf(C04330Ez.LIZIZ(c133235Kt.LJ, R.color.aj));
            C29S c29s = c133235Kt.LJ;
            EditorProScene editorProScene = c133235Kt.LIZ;
            String creationId = C133235Kt.LJFF().getCreationId();
            String str = "";
            if (creationId == null) {
                creationId = "";
            }
            if (C133235Kt.LJFF().isPhotoMvMode || H7R.LJJJJL(C133235Kt.LJFF())) {
                z2 = true;
            } else {
                z2 = false;
            }
            C149795uJ c149795uJ = new C149795uJ(false, false, false, 0.0f, false, false, 511);
            boolean z3 = C133235Kt.LJFF().editMusicSyncMode;
            boolean LIZ = e1.LIZ(31744, "studio_editor_pro_add_recommended_music_close_button", true, false);
            C133225Ks c133225Ks = c133235Kt.LJIJI;
            if (C133235Kt.LJFF().getMusicId() != null) {
                str = C133235Kt.LJFF().getMusicId();
            }
            o.LJIIIIZZ(str, "if (model.musicId.isNotN…()) model.musicId else \"\"");
            XZH xzh = new XZH(c145255mz, null, valueOf, c29s, editorProScene, LIZLLL, i, creationId, z2, c149795uJ, z3, false, true, LIZ, c133225Ks, h8i, str, EnumC133275Kx.EDITPAGE, false, false, false);
            InterfaceC133285Ky interfaceC133285Ky = c133235Kt.LJFF;
            if (interfaceC133285Ky != null) {
                interfaceC133285Ky.LIZ(xzh);
            }
            c133235Kt.LJII();
        }
        EditorProContext editorContext = c133235Kt.LJ();
        o.LJIIIZ(editorContext, "editorContext");
        Iterator it = ((ArrayList) C124574uj.LJII(C79057V0z.LJJI(editorContext))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                NLETrack nLETrack2 = (NLETrack) obj;
                if (C124574uj.LJJIL(nLETrack2) || C124574uj.LJJJ(nLETrack2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack3 = (NLETrack) obj;
        if (nLETrack3 != null && nLETrack3.LJIILLIIL().size() != 0) {
            NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrack3.LJIILLIIL().get(0).LJI());
            osz = new OSZ<>(Integer.valueOf((int) LIZLLL2.LJIILIIL()), Integer.valueOf((int) LIZLLL2.LJIIL()));
        } else {
            osz = null;
        }
        c133235Kt.LJIILL = osz;
    }

    public C133245Ku(EditorProScene scene, InterfaceC132055Gf interfaceC132055Gf, C132115Gl mobBean) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(mobBean, "mobBean");
        this.LIZ = interfaceC132055Gf;
        this.LIZIZ = new C133235Kt(scene, interfaceC132055Gf, mobBean);
    }
}
