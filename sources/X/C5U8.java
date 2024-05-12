package X;

import Y.ACallableS2S1202000_2;
import Y.ACallableS34S0110000_2;
import Y.AgS120S0100000_2;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5U8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5U8 {
    public InterfaceC153045zY LIZ;
    public AVMusic LIZJ;
    public C5UA LJ;
    public int LJFF;
    public final C45779Hxv LJI;
    public int LIZIZ = -1;
    public final HashMap<String, List<C5UB>> LIZLLL = new HashMap<>();

    public final void LIZIZ() {
        C133765Mu c133765Mu;
        InterfaceC153045zY interfaceC153045zY = this.LIZ;
        if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
            c133765Mu.LJI().LJFF().LJJJJJL(null);
            int i = this.LIZIZ;
            C133785Mw c133785Mw = c133765Mu.LIZLLL;
            if (c133785Mw != null) {
                c133785Mw.Y8().LJIILL(i);
                c133765Mu.LJI().LJFF().LIZJ(new C121744qA(1.0f));
            } else {
                o.LJIJI("nleSession");
                throw null;
            }
        }
    }

    public C5U8() {
        C45779Hxv c45779Hxv = new C45779Hxv();
        this.LJI = c45779Hxv;
        c45779Hxv.LIZ = new C5IN() { // from class: X.5IX
            @Override // X.C5IN
            public final int LIZ(String audioPath, int i, int i2, VEAlgorithmPath veAlgorithmPath) {
                C133765Mu c133765Mu;
                o.LJIIIZ(audioPath, "audioPath");
                o.LJIIIZ(veAlgorithmPath, "veAlgorithmPath");
                InterfaceC153045zY interfaceC153045zY = C5U8.this.LIZ;
                if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                    return c133765Mu.LJI().LJFF().LIZ().LIZ(audioPath, i, i2, veAlgorithmPath);
                }
                return -1;
            }
        };
    }

    public final long LIZ(int i) {
        C5UA c5ua = this.LJ;
        long j = 0;
        if (c5ua != null) {
            o.LJI(c5ua);
            List<VideoSegment> LIZLLL = c5ua.LIZLLL();
            if (C77413UZt.LJIILL(LIZLLL)) {
                return 0L;
            }
            if (i >= 0 && i < LIZLLL.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (!((VideoSegment) ListProtector.get(LIZLLL, i2)).isDeleted) {
                        j = (((VideoSegment) ListProtector.get(LIZLLL, i2)).LJ() - ((VideoSegment) ListProtector.get(LIZLLL, i2)).LJIIIZ()) + j;
                    }
                }
            }
        }
        return j;
    }

    public final void LIZLLL(InterfaceC126004x2 interfaceC126004x2, boolean z) {
        C10K.LIZ(new ACallableS34S0110000_2(this, z, 1)).LJ(new AgS120S0100000_2(interfaceC126004x2, 25), C10K.LJIIIIZZ, null);
    }

    public final void LJ(int i, int i2) {
        List<VEClipAlgorithmParam> list;
        int i3;
        long j;
        boolean z;
        if (this.LIZIZ >= 0) {
            C5UA c5ua = this.LJ;
            if (c5ua != null) {
                o.LJI(c5ua);
                List<VideoSegment> LIZLLL = c5ua.LIZLLL();
                if (C77413UZt.LJIILL(LIZLLL)) {
                    return;
                }
                InterfaceC153045zY interfaceC153045zY = this.LIZ;
                if (interfaceC153045zY != null && this.LIZIZ >= 0) {
                    o.LJI(interfaceC153045zY);
                    list = interfaceC153045zY.getAllVideoRangeData();
                } else {
                    list = null;
                }
                if (C77413UZt.LJIILL(list)) {
                    InterfaceC153045zY interfaceC153045zY2 = this.LIZ;
                    if (interfaceC153045zY2 != null) {
                        interfaceC153045zY2.LLJJJIL((int) 0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                        return;
                    }
                    return;
                }
                for (VideoSegment videoSegment : LIZLLL) {
                    o.LJI(list);
                    for (VEClipAlgorithmParam vEClipAlgorithmParam : list) {
                        if (vEClipAlgorithmParam.index == videoSegment.videoIndex) {
                            C43117Gw5.LIZ.getClass();
                            if (C45771Hxn.LIZIZ && C44694HgQ.LJIJI(videoSegment.LJII(false), false) && (i3 = vEClipAlgorithmParam.range) > 3000) {
                                videoSegment.duration = i3;
                            }
                            C5UB c5ub = videoSegment.stickPointVideoSegment;
                            if (c5ub == null) {
                                if (i == 5) {
                                    j = vEClipAlgorithmParam.trimIn;
                                } else {
                                    j = 0;
                                }
                                videoSegment.stickPointVideoSegment = new C5UB(videoSegment.videoIndex, j, vEClipAlgorithmParam.range, videoSegment.duration);
                                C5UA c5ua2 = this.LJ;
                                if (c5ua2 == null) {
                                    z = false;
                                } else {
                                    c5ua2.LIZ();
                                    z = true;
                                }
                                videoSegment.isStickPointMode = z;
                            } else if (i == 5) {
                                c5ub.resetVideoStartTime(vEClipAlgorithmParam.trimIn, vEClipAlgorithmParam.range);
                            } else if (i == 2 || i == 6) {
                                HashMap<String, List<C5UB>> hashMap = this.LIZLLL;
                                AVMusic aVMusic = this.LIZJ;
                                o.LJI(aVMusic);
                                List<C5UB> list2 = hashMap.get(aVMusic.getMusicId());
                                if (C77413UZt.LJIILL(list2)) {
                                    videoSegment.stickPointVideoSegment.updateVideoStartTime(vEClipAlgorithmParam.range);
                                } else {
                                    o.LJI(list2);
                                    C5UB c5ub2 = null;
                                    for (C5UB c5ub3 : list2) {
                                        if (c5ub3.getVideoIndex() == videoSegment.videoIndex) {
                                            c5ub2 = c5ub3;
                                        }
                                    }
                                    if (c5ub2 != null) {
                                        videoSegment.stickPointVideoSegment.resetVideoStartTime(c5ub2.getVideoStart(), c5ub2.getVideoRange());
                                    } else {
                                        videoSegment.stickPointVideoSegment.resetVideoStartTime(0L, vEClipAlgorithmParam.range);
                                    }
                                }
                            } else if (i == 1 || i == 4 || i == 3) {
                                c5ub.updateVideoStartTime(vEClipAlgorithmParam.range);
                            }
                        }
                    }
                }
                C5UA c5ua3 = this.LJ;
                if (c5ua3 != null) {
                    c5ua3.LIZJ(i);
                    LIZ(i2);
                    c5ua3.LIZIZ();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("stickpoint listener not init");
        }
    }

    public final void LIZJ(AVMusic aVMusic, int i, final int i2, final InterfaceC126004x2 interfaceC126004x2) {
        AwemeHostApplication awemeHostApplication;
        this.LIZJ = aVMusic;
        this.LJI.LIZIZ = aVMusic;
        if (this.LIZ == null || aVMusic == null || aVMusic.getStickPointMusicAlg() == null) {
            return;
        }
        String LJ = C45771Hxn.LJ(aVMusic);
        try {
            ((C45039Hlz) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService()).getClass();
            awemeHostApplication = FKM.LIZ();
        } catch (Exception unused) {
            H78.LJI("ServiceManager fail, no context and local music load fail");
            awemeHostApplication = null;
        }
        if (!C39579Fg7.LIZIZ(LJ) && !C170626mo.LIZIZ(awemeHostApplication, UriProtector.parse(LJ))) {
            return;
        }
        this.LJI.getClass();
        C10K.LIZJ(new ACallableS2S1202000_2(LJ, i, i2, this, C45779Hxv.LIZIZ(aVMusic), 1)).LJ(new AgS120S0100000_2(new InterfaceC126004x2() { // from class: X.5U9
            @Override // X.InterfaceC126004x2
            public final void onFailed() {
                C5U8.this.LIZIZ = -1;
                InterfaceC126004x2 interfaceC126004x22 = interfaceC126004x2;
                if (interfaceC126004x22 != null) {
                    interfaceC126004x22.onFailed();
                }
            }

            @Override // X.InterfaceC126004x2
            public final void LIZ(int i3) {
                C5U8 c5u8 = C5U8.this;
                c5u8.LIZIZ = i3;
                int i4 = i2;
                if (i4 == 6 || i4 == 7) {
                    C5UA c5ua = c5u8.LJ;
                    if (c5ua != null) {
                        c5ua.LIZJ(i4);
                    }
                    C5U8 c5u82 = C5U8.this;
                    long LIZ = c5u82.LIZ(c5u82.LJFF);
                    InterfaceC153045zY interfaceC153045zY = C5U8.this.LIZ;
                    if (interfaceC153045zY != null) {
                        interfaceC153045zY.LLJJJIL((int) LIZ, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                    }
                } else {
                    c5u8.LJ(i4, -1);
                }
                InterfaceC126004x2 interfaceC126004x22 = interfaceC126004x2;
                if (interfaceC126004x22 != null) {
                    interfaceC126004x22.LIZ(C5U8.this.LIZIZ);
                }
            }
        }, 26), C10K.LJIIIIZZ, null);
    }
}
