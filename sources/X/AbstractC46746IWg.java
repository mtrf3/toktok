package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IWg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC46746IWg implements IWH {
    public IMonitor LIZ;
    public final InterfaceC46747IWh LIZIZ;
    public SimVideoUrlModel LIZLLL;
    public IXO LJ;
    public C46914Ib8 LJFF;
    public C39061g6 LJI;
    public IX4 LJII;
    public Session LJIIIIZZ;
    public Session LJIIIZ;
    public final IUE LJIIJ;
    public final IWK LJIIJJI;
    public final C46751IWl LJIIL;
    public IHR LJIILIIL;
    public final boolean LJIILJJIL;
    public final C46543IOl LJIILLIIL;
    public final C47129Ieb LJIIZILJ;
    public final IGL LJIJ;
    public final IVL LJIL;
    public boolean LIZJ = true;
    public final IUF LJIILL = new IUF();
    public final C35740E0y LJIJI = new C35740E0y();
    public final C35739E0x LJIJJ = new C35739E0x();
    public final C35738E0w LJIJJLI = new C35738E0w();

    public abstract IX4 LIZIZ(C46749IWj c46749IWj);

    @Override // X.IWH
    public void LJIILIIL() {
        this.LIZJ = true;
    }

    public abstract IUG LJIILLIIL();

    public abstract C39061g6 LJIIZILJ(SimVideo simVideo);

    public abstract void LJIJJ();

    public abstract void LJIJJLI();

    public abstract void LJIL();

    @Override // X.IWH
    public void reset() {
        SimRadar.warnScan("SimPlayer", "reset", LJIJI());
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJIILL.LIZ = 1.0f;
        this.LIZIZ.LJJLI();
    }

    @Override // X.IWH
    public final IHR LJ() {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new IHR(this);
        }
        return this.LJIILIIL;
    }

    @Override // X.IWH
    public void LJJL() {
        this.LJIIZILJ.LIZ = true;
        if (!((Boolean) IZ8.LJZ.getValue()).booleanValue()) {
            IUH.LIZ = true;
        }
        this.LIZIZ.LJJL();
    }

    @Override // X.IWH
    public final void LJJLIIIJJI() {
        this.LIZIZ.LJJLIIIJJI();
    }

    @Override // X.IWH
    public final void LJJLIIIJL() {
        this.LIZIZ.LJJLIIIJL();
    }

    @Override // X.IWH
    public void pause() {
        String str;
        if (this.LJII != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VIDEO@");
            LIZ.append(this.LJII.LJIIIZ);
            SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("pause-1");
        }
        IX4 ix4 = this.LJII;
        if (ix4 != null) {
            str = ix4.LJIIIZ;
        } else {
            str = null;
        }
        SimRadar.keyScan("SimPlayer", "pause", str, LJIJI(), C76965UIn.LJ(this.LJIIL.LIZ.getState()));
        SimRadar.analyzer().getClass();
        C46894Iao LIZ2 = IVN.LIZ(str);
        if (LIZ2 != null) {
            LIZ2.LJIJ();
        }
        this.LIZIZ.pause();
    }

    @Override // X.IWH
    public void release() {
        String str;
        if (this.LJII != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VIDEO@");
            LIZ.append(this.LJII.LJIIIZ);
            SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("release");
        }
        Object[] objArr = new Object[2];
        IX4 ix4 = this.LJII;
        if (ix4 != null) {
            str = ix4.LJIIIZ;
        } else {
            str = null;
        }
        objArr[0] = str;
        objArr[1] = LJIJI();
        SimRadar.keyScan("SimPlayer", "release", objArr);
        this.LIZIZ.release();
        this.LJIJI.clear();
    }

    @Override // X.IWH
    public void resume() {
        String str;
        String str2;
        if (this.LJII != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VIDEO@");
            LIZ.append(this.LJII.LJIIIZ);
            SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("resume");
        }
        Object[] objArr = new Object[2];
        IX4 ix4 = this.LJII;
        if (ix4 != null) {
            str = ix4.LJIIIZ;
        } else {
            str = null;
        }
        objArr[0] = str;
        objArr[1] = LJIJI();
        SimRadar.keyScan("SimPlayer", "resume", objArr);
        IALog LIZ2 = C46982IcE.LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("resumePlay aid:");
        SimVideoUrlModel simVideoUrlModel = this.LIZLLL;
        if (simVideoUrlModel != null) {
            str2 = simVideoUrlModel.getSourceId();
        } else {
            str2 = "null";
        }
        LIZ3.append(str2);
        LIZ2.e("SimPlayer", X1D.LIZIZ(LIZ3));
        IXO ixo = this.LJ;
        if (ixo != null && !TextUtils.isEmpty(ixo.LJ)) {
            this.LIZIZ.LJLILLLLZI(this.LJ.LJ);
            return;
        }
        if (this.LIZLLL != null && !this.LIZIZ.LJJLIIIJLJLI(null)) {
            this.LIZIZ.LJLILLLLZI(this.LIZLLL.getSourceId());
        } else if (this.LJII != null) {
            this.LIZIZ.resume();
        }
    }

    @Override // X.IWH
    public void stop() {
        String str;
        if (this.LJII != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VIDEO@");
            LIZ.append(this.LJII.LJIIIZ);
            SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("stop");
        }
        IX4 ix4 = this.LJII;
        if (ix4 != null) {
            str = ix4.LJIIIZ;
        } else {
            str = null;
        }
        SimRadar.keyScan("SimPlayer", "stop", str, LJIJI());
        SimRadar.analyzer().getClass();
        C46894Iao LIZ2 = IVN.LIZ(str);
        if (LIZ2 != null) {
            LIZ2.LJIJJ();
        }
        this.LIZIZ.stop();
    }

    public final String LJIJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimPlayer@");
        LIZ.append(Integer.toHexString(hashCode()));
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.IWH
    public InterfaceC46645ISj LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.IWH
    public IWK LIZLLL() {
        return this.LJIIJJI;
    }

    @Override // X.IWH
    public final I90 getPlayState() {
        return this.LJIIL;
    }

    @Override // X.IWH
    public final Object LIZ(AbstractC46667ITf abstractC46667ITf) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZIZ;
        if (interfaceC46747IWh != null) {
            return interfaceC46747IWh.LIZJ(abstractC46667ITf);
        }
        return abstractC46667ITf.LIZIZ;
    }

    @Override // X.IWH
    public final void LJFF(float f) {
        this.LIZIZ.LJFF(f);
        this.LJIILL.LIZ = f;
    }

    @Override // X.IWH
    public void LJI(float f) {
        this.LIZIZ.LJJIIJ(f);
    }

    @Override // X.IWH
    public void LJIIIIZZ(C46745IWf c46745IWf) {
        IX4 LIZIZ;
        IZG metaInfo;
        IZG metaInfo2;
        LJIJJLI();
        SimVideo simVideo = c46745IWf.LIZJ;
        if (simVideo == null) {
            SimRadar.errorScan("SimPlayer", "prepareNext-PlayRequest", new C46690IUc("playRequest.getVideo() is null."), new Object[0]);
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-PDataNull2");
            return;
        }
        String sourceId = simVideo.getSourceId();
        SimRadar.keyScan("SimPlayer", "prepareNext-PlayRequest", sourceId, LJIJI());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(sourceId);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("SimPrepareNext");
        LJIILL(c46745IWf, true);
        IWI iwi = c46745IWf.LJIJJ;
        if (iwi == null) {
            iwi = IWI.Normal;
        }
        iwi.setLoop(c46745IWf.LJIILL);
        SimVideo simVideo2 = c46745IWf.LIZJ;
        LJIL();
        if (simVideo2 != null && !TextUtils.isEmpty(simVideo2.getVideoId())) {
            LIZIZ = IXM.LIZJ(simVideo2, c46745IWf.LJIIIZ, iwi, c46745IWf.LJIIJ, c46745IWf.LJIIZILJ, c46745IWf.LJIJ, c46745IWf.LJFF, this.LIZJ);
            if (!TextUtils.isEmpty(c46745IWf.LJIILLIIL)) {
                LIZIZ.LJJJLZIJ = c46745IWf.LJIILLIIL;
            }
            this.LJ = LIZIZ.LJJJJZI;
            Session LIZ2 = C46664ITc.LJIJ.LIZ(LIZIZ.LJJIIJ);
            this.LJIIIIZZ = LIZ2;
            if (LIZ2 != null) {
                LIZ2.sourceId = LIZIZ.LJIIIZ;
                LIZ2.setCodecType(LIZIZ.LJIILIIL);
            }
        } else if (!TextUtils.isEmpty(c46745IWf.LIZJ.getVideoModelStr())) {
            C46749IWj c46749IWj = new C46749IWj();
            c46749IWj.LIZ = c46745IWf.LIZJ;
            c46749IWj.LIZIZ = c46745IWf.LJIIIZ;
            c46749IWj.LIZJ = true;
            c46749IWj.LIZLLL = c46745IWf.LJIIJ;
            c46749IWj.LJ = c46745IWf.LJIILLIIL;
            c46749IWj.LJFF = c46745IWf.LJIIZILJ;
            c46749IWj.LJI = this.LIZJ;
            c46749IWj.LJII = iwi;
            c46749IWj.LJIIIIZZ = c46745IWf;
            LIZIZ = LIZIZ(c46749IWj);
        } else {
            SimVideoUrlModel LJFF = IXM.LJFF(c46745IWf.LIZJ);
            if (LJFF != null) {
                LJFF.setSubTag(c46745IWf.LJIIZILJ);
            }
            LIZIZ = IXM.LIZIZ(LJFF, c46745IWf.LJIIIZ, true, false, false, c46745IWf.LJIJJLI, c46745IWf.LJIIJ, c46745IWf.LJII, c46745IWf.LJIILLIIL, c46745IWf.LJIIZILJ, c46745IWf.LJIILJJIL, this.LIZJ, c46745IWf.LJJ, iwi, c46745IWf);
        }
        if (LIZIZ != null) {
            LIZIZ.LLFII = c46745IWf.LJJLIIIJJI;
            LIZIZ.LLFZ = c46745IWf.LJJLIIIJLJLI;
            LIZIZ.LIZIZ = c46745IWf.LIZ;
            LIZIZ.LJJI = c46745IWf.LJIILIIL;
            SimVideo simVideo3 = c46745IWf.LIZJ;
            if (simVideo3 == null) {
                metaInfo = IZG.from(null);
            } else {
                metaInfo = simVideo3.getMetaInfo();
            }
            LIZIZ.LJIJJ = metaInfo;
            LIZIZ.LJJ = true;
            SimVideo simVideo4 = c46745IWf.LIZJ;
            if (simVideo4 == null) {
                metaInfo2 = IZG.from(null);
            } else {
                metaInfo2 = simVideo4.getMetaInfo();
            }
            LIZIZ.LJIJJ = metaInfo2;
            Session session = this.LJIIIZ;
            if (session == null || !TextUtils.equals(session.sourceId, LIZIZ.LJIIIZ)) {
                Session LIZ3 = C46664ITc.LJIJ.LIZ(LIZIZ.LJJIIJ);
                this.LJIIIZ = LIZ3;
                if (LIZ3 != null) {
                    LIZ3.sourceId = LIZIZ.LJIIIZ;
                    LIZ3.setCodecType(LIZIZ.LJIILIIL);
                }
            }
            LIZIZ.LJJIFFI = c46745IWf.LJJLI;
            LIZIZ.LJLJLJ = c46745IWf.LJJLIIIJLLLLLLLZ;
            LIZIZ.LJIILL = c46745IWf.LJJJLIIL;
            LJJI(c46745IWf, LIZIZ);
            LIZIZ.LJIILJJIL = c46745IWf.LJJJJLL;
            LJJ(LIZIZ);
        }
    }

    @Override // X.IWH
    public final void LJIIIZ(IMonitor iMonitor) {
        InterfaceC46747IWh interfaceC46747IWh;
        this.LIZ = iMonitor;
        if (iMonitor != null && (interfaceC46747IWh = this.LIZIZ) != null) {
            interfaceC46747IWh.LJJLJLI(new C46755IWp(iMonitor));
        }
    }

    @Override // X.IWH
    public final void LJIIJJI(C47548IlM c47548IlM) {
        LJ().LIZ.LIZIZ.LJLLLLLL(c47548IlM);
    }

    @Override // X.IWH
    public void LJIIL(C46745IWf c46745IWf) {
        IX4 LIZIZ;
        IZG metaInfo;
        float f;
        JSONObject LIZ;
        SimVideo simVideo = c46745IWf.LIZJ;
        if (simVideo != null) {
            String sourceId = simVideo.getSourceId();
            IVN analyzer = SimRadar.analyzer();
            String str = IVN.LIZJ;
            analyzer.getClass();
            C46894Iao LIZ2 = IVN.LIZ(str);
            if (LIZ2 != null) {
                LIZ2.LJIL();
            }
            IVN.LIZJ = sourceId;
            C46894Iao LIZ3 = IVN.LIZ(sourceId);
            if (LIZ3 != null) {
                LIZ3.LJIILLIIL();
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("requireSurface:");
            LIZ4.append(c46745IWf.LJJJJZ);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("audioOnly:");
            LIZ5.append(c46745IWf.LJJJJLL);
            SimRadar.keyScan("SimPlayer", "prepare-PlayRequest", X1D.LIZIZ(LIZ4), X1D.LIZIZ(LIZ5), sourceId, LJIJI());
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("VIDEO@");
            LIZ6.append(sourceId);
            SimRadar.traceGroup(X1D.LIZIZ(LIZ6)).LIZIZ("SimPrepare");
        } else {
            SimRadar.traceGroup("SimError").LIZIZ("SimPrepare1");
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-VideoNull");
            SimRadar.errorScan("SimPlayer", "prepare-PlayRequest", new C46690IUc("Video-Null"), LJIJI());
        }
        LJIILL(c46745IWf, false);
        String str2 = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        SimVideo simVideo2 = c46745IWf.LIZJ;
        IWI iwi = c46745IWf.LJIJJ;
        if (iwi == null) {
            iwi = IWI.Normal;
        }
        iwi.setLoop(c46745IWf.LJIILL);
        if (simVideo2 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            IVL ivl = this.LJIL;
            String sourceId2 = simVideo2.getSourceId();
            if (ivl != null && !TextUtils.isEmpty(sourceId2) && elapsedRealtime > 0) {
                ivl.LIZ(1, elapsedRealtime, sourceId2);
            }
        }
        LJIL();
        if (simVideo2 != null && !TextUtils.isEmpty(simVideo2.getVideoId())) {
            LIZIZ = IXM.LIZJ(simVideo2, c46745IWf.LJIIIZ, iwi, c46745IWf.LJIIJ, c46745IWf.LJIIZILJ, c46745IWf.LJIJ, c46745IWf.LJFF, this.LIZJ);
            this.LJ = LIZIZ.LJJJJZI;
            Session LIZ7 = C46664ITc.LJIJ.LIZ(LIZIZ.LJJIIJ);
            this.LJIIIIZZ = LIZ7;
            if (LIZ7 != null) {
                LIZ7.sourceId = LIZIZ.LJIIIZ;
                LIZ7.setCodecType(LIZIZ.LJIILIIL);
            }
        } else {
            LJIJJ();
            if (simVideo2 != null && !TextUtils.isEmpty(simVideo2.getVideoModelStr()) && c46745IWf.LJIJI) {
                C46749IWj c46749IWj = new C46749IWj();
                c46749IWj.LIZ = simVideo2;
                c46749IWj.LIZIZ = c46745IWf.LJIIIZ;
                c46749IWj.LIZJ = false;
                c46749IWj.LIZLLL = c46745IWf.LJIIJ;
                c46749IWj.LJ = c46745IWf.LJIILLIIL;
                c46749IWj.LJFF = c46745IWf.LJIIZILJ;
                c46749IWj.LJI = this.LIZJ;
                c46749IWj.LJII = iwi;
                c46749IWj.LJIIIIZZ = c46745IWf;
                LIZIZ = LIZIZ(c46749IWj);
                this.LJI = LJIIZILJ(simVideo2);
                if (LIZIZ != null) {
                    IXO ixo = LIZIZ.LJJJJZI;
                    this.LJ = ixo;
                    this.LJFF = ixo.LIZIZ;
                    SimVideoUrlModel playAddr = simVideo2.getPlayAddr();
                    this.LIZLLL = playAddr;
                    if (playAddr != null) {
                        this.LJIJI.put(playAddr.getSourceId(), this.LIZLLL);
                    }
                    Session session = this.LJIIIZ;
                    if (session != null && TextUtils.equals(session.sourceId, LIZIZ.LJIIIZ)) {
                        this.LJIIIIZZ = this.LJIIIZ;
                        this.LJIIIZ = null;
                    } else {
                        Session LIZ8 = C46664ITc.LJIJ.LIZ(LIZIZ.LJJIIJ);
                        this.LJIIIIZZ = LIZ8;
                        if (LIZ8 != null) {
                            LIZ8.sourceId = LIZIZ.LJIIIZ;
                            LIZ8.setCodecType(LIZIZ.LJIILIIL);
                        }
                    }
                    Session session2 = this.LJIIIIZZ;
                    if (session2 != null) {
                        session2.urlModel = simVideo2.getPlayAddr();
                    }
                }
            } else {
                SimVideoUrlModel simVideoUrlModel = c46745IWf.LJI;
                if (simVideo2 != null) {
                    this.LJI = LJIIZILJ(simVideo2);
                    if (simVideoUrlModel == null) {
                        simVideoUrlModel = IXM.LJFF(simVideo2);
                    }
                }
                if (simVideoUrlModel == null) {
                    SimRadar.errorScan("SimPlayer", "prepare", new C46690IUc("PlayAddress is null."), new Object[0]);
                    SimRadar.analyzer().getClass();
                    IVN.LIZIZ("SF-DataNull4");
                    return;
                }
                simVideoUrlModel.setSubTag(c46745IWf.LJIIZILJ);
                this.LIZLLL = simVideoUrlModel;
                this.LJIJI.put(simVideoUrlModel.getSourceId(), this.LIZLLL);
                SimVideoUrlModel simVideoUrlModel2 = simVideoUrlModel;
                LIZIZ = IXM.LIZIZ(simVideoUrlModel2, c46745IWf.LJIIIZ, false, c46745IWf.LJJI, c46745IWf.LJIL, c46745IWf.LJIJJLI, c46745IWf.LJIIJ, c46745IWf.LJII, c46745IWf.LJIILLIIL, c46745IWf.LJIIZILJ, c46745IWf.LJIILJJIL, this.LIZJ, c46745IWf.LJJ, iwi, c46745IWf);
                if (LIZIZ != null) {
                    Session session3 = this.LJIIIZ;
                    if (session3 != null && TextUtils.equals(session3.sourceId, LIZIZ.LJIIIZ)) {
                        this.LJIIIIZZ = this.LJIIIZ;
                        str2 = null;
                        this.LJIIIZ = null;
                    } else {
                        str2 = null;
                        Session LIZ9 = C46664ITc.LJIJ.LIZ(simVideoUrlModel2.getUri());
                        this.LJIIIIZZ = LIZ9;
                        if (LIZ9 != null) {
                            LIZ9.sourceId = LIZIZ.LJIIIZ;
                            LIZ9.setCodecType(LIZIZ.LJIILIIL);
                        }
                    }
                } else {
                    str2 = null;
                }
                Session session4 = this.LJIIIIZZ;
                if (session4 != null) {
                    session4.urlModel = simVideoUrlModel2;
                }
            }
        }
        if (LIZIZ != null) {
            LIZIZ.LLIFFJFJJ = c46745IWf.LJJLIIIJL;
            LIZIZ.LLFII = c46745IWf.LJJLIIIJJI;
            LIZIZ.LLFZ = c46745IWf.LJJLIIIJLJLI;
            LIZIZ.LJIILL = c46745IWf.LJJJLIIL;
            LJJI(c46745IWf, LIZIZ);
            C46543IOl c46543IOl = this.LJIILLIIL;
            if (c46543IOl != null && (LIZ = c46543IOl.LIZ(LIZIZ.LJIIIZ)) != null) {
                try {
                    LIZ.put("simplayer_prepare_begin", System.currentTimeMillis());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            HashMap<String, Object> hashMap = c46745IWf.LJJJJLI;
            if (hashMap != null) {
                this.LJIJ.LJLJJL = hashMap;
            }
            LIZIZ.LJIILJJIL = c46745IWf.LJJJJLL;
            LIZIZ.LJIILLIIL = c46745IWf.LJJJJZ;
            if (simVideo2 == null) {
                metaInfo = IZG.from(str2);
            } else {
                metaInfo = simVideo2.getMetaInfo();
            }
            LIZIZ.LJIJJ = metaInfo;
            LIZIZ.LJIJJLI = c46745IWf.LJJJZ;
            LIZIZ.LJIL = c46745IWf.LJJL;
            LIZIZ.LJJIFFI = c46745IWf.LJJLI;
            LJJII(true, LIZIZ);
            this.LIZIZ.LJLIIIL(LIZIZ);
            if (c46745IWf.LJJJJZI) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            this.LIZIZ.setVolume(f, f);
            C46664ITc c46664ITc = C46664ITc.LJIJ;
            String str3 = LIZIZ.LJJIIJ;
            synchronized (c46664ITc) {
                c46664ITc.LIZ = c46664ITc.LIZIZ(str3);
                if (c46664ITc.LIZ == null) {
                    c46664ITc.LIZ = c46664ITc.LIZ(str3);
                }
            }
        } else {
            SimRadar.traceGroup("SimError").LIZIZ("SimPrepare2");
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("SF-DataNull5");
            SimRadar.errorScan("SimPlayer", "prepare-PlayRequest", new C46690IUc("SF-DataNull5"), new Object[0]);
        }
        this.LJII = LIZIZ;
    }

    public final C46650ISo LJIJ(String str) {
        C35738E0w c35738E0w;
        if (TextUtils.isEmpty(str) || (c35738E0w = this.LJIJJLI) == null || !c35738E0w.containsKey(str)) {
            return new C46650ISo();
        }
        C46650ISo c46650ISo = this.LJIJJLI.get(str);
        if (c46650ISo == null) {
            return new C46650ISo();
        }
        return c46650ISo;
    }

    public void LJJ(IX4 ix4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(ix4.LJIIIZ);
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("SimPrepareNext");
        LJJII(false, ix4);
        this.LIZIZ.LJJLJ(ix4);
    }

    @Override // X.IWH
    public final void LJJJLL(final OnUIPlayListener onUIPlayListener) {
        String LIZIZ;
        Object[] objArr = new Object[2];
        if (onUIPlayListener == null) {
            LIZIZ = null;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LJLLJ(onUIPlayListener.getClass()));
            LIZ.append("@");
            LIZ.append(onUIPlayListener.hashCode());
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        objArr[0] = LIZIZ;
        objArr[1] = LJIJI();
        SimRadar.keyScan("SimPlayer", "setOnUIPlayListener", objArr);
        IGL igl = this.LJIJ;
        final C47129Ieb c47129Ieb = this.LJIIZILJ;
        if (onUIPlayListener != null) {
            if (((Boolean) c47129Ieb.LJ.getValue()).booleanValue()) {
                if (!o.LJ(onUIPlayListener, c47129Ieb.LIZIZ)) {
                    c47129Ieb.LIZIZ = onUIPlayListener;
                    c47129Ieb.LIZ = false;
                    c47129Ieb.LIZJ = (OnUIPlayListener) Proxy.newProxyInstance(OnUIPlayListener.class.getClassLoader(), new Class[]{OnUIPlayListener.class}, new InvocationHandler() { // from class: X.IdN
                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr2) {
                            boolean z;
                            OnUIPlayListener impl = OnUIPlayListener.this;
                            C47129Ieb this$0 = c47129Ieb;
                            o.LJIIIZ(impl, "$impl");
                            o.LJIIIZ(this$0, "this$0");
                            String name = method.getName();
                            o.LJIIIIZZ(name, "method.name");
                            if (o.LJ(name, "equals")) {
                                return Boolean.valueOf(o.LJ(impl, objArr2[0]));
                            }
                            if (o.LJ(name, "hashCode")) {
                                return Integer.valueOf(impl.hashCode());
                            }
                            if (o.LJ(name, "onPlayProgressChange") || o.LJ(name, "onBufferedPercent") || o.LJ(name, "onBufferedTimeMs") || o.LJ(name, "toString")) {
                            }
                            if (o.LJ(name, "onRenderFirstFrame") && objArr2 != null && objArr2.length > 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean LJ = o.LJ(name, "onPreparePlay");
                            if (this$0.LIZ) {
                                if (z) {
                                    Method method2 = impl.getClass().getMethod("onResumePlay", String.class);
                                    o.LJIIIIZZ(method2, "impl.javaClass.getMethod…lay\", String::class.java)");
                                    method2.invoke(impl, objArr2[0]);
                                    this$0.LIZ = false;
                                    return Integer.valueOf(android.util.Log.i("SimLifecycleManager", o.LJIILLIIL(method2.getName(), "execute : ")));
                                }
                                if (LJ) {
                                    int i = this$0.LIZLLL;
                                    if (i > 0) {
                                        this$0.LIZLLL = i - 1;
                                    } else {
                                        this$0.LIZ = false;
                                        this$0.LIZLLL = 1;
                                        if (objArr2 == null) {
                                            objArr2 = new Object[0];
                                        }
                                        return C47129Ieb.LIZ(impl, method, Arrays.copyOf(objArr2, objArr2.length));
                                    }
                                }
                                return null;
                            }
                            if (objArr2 == null) {
                                objArr2 = new Object[0];
                            }
                            return C47129Ieb.LIZ(impl, method, Arrays.copyOf(objArr2, objArr2.length));
                        }
                    });
                }
                if (c47129Ieb.LIZJ == null) {
                    c47129Ieb.LIZ = false;
                    c47129Ieb.LIZJ = (OnUIPlayListener) Proxy.newProxyInstance(OnUIPlayListener.class.getClassLoader(), new Class[]{OnUIPlayListener.class}, new InvocationHandler() { // from class: X.IdN
                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr2) {
                            boolean z;
                            OnUIPlayListener impl = OnUIPlayListener.this;
                            C47129Ieb this$0 = c47129Ieb;
                            o.LJIIIZ(impl, "$impl");
                            o.LJIIIZ(this$0, "this$0");
                            String name = method.getName();
                            o.LJIIIIZZ(name, "method.name");
                            if (o.LJ(name, "equals")) {
                                return Boolean.valueOf(o.LJ(impl, objArr2[0]));
                            }
                            if (o.LJ(name, "hashCode")) {
                                return Integer.valueOf(impl.hashCode());
                            }
                            if (o.LJ(name, "onPlayProgressChange") || o.LJ(name, "onBufferedPercent") || o.LJ(name, "onBufferedTimeMs") || o.LJ(name, "toString")) {
                            }
                            if (o.LJ(name, "onRenderFirstFrame") && objArr2 != null && objArr2.length > 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean LJ = o.LJ(name, "onPreparePlay");
                            if (this$0.LIZ) {
                                if (z) {
                                    Method method2 = impl.getClass().getMethod("onResumePlay", String.class);
                                    o.LJIIIIZZ(method2, "impl.javaClass.getMethod…lay\", String::class.java)");
                                    method2.invoke(impl, objArr2[0]);
                                    this$0.LIZ = false;
                                    return Integer.valueOf(android.util.Log.i("SimLifecycleManager", o.LJIILLIIL(method2.getName(), "execute : ")));
                                }
                                if (LJ) {
                                    int i = this$0.LIZLLL;
                                    if (i > 0) {
                                        this$0.LIZLLL = i - 1;
                                    } else {
                                        this$0.LIZ = false;
                                        this$0.LIZLLL = 1;
                                        if (objArr2 == null) {
                                            objArr2 = new Object[0];
                                        }
                                        return C47129Ieb.LIZ(impl, method, Arrays.copyOf(objArr2, objArr2.length));
                                    }
                                }
                                return null;
                            }
                            if (objArr2 == null) {
                                objArr2 = new Object[0];
                            }
                            return C47129Ieb.LIZ(impl, method, Arrays.copyOf(objArr2, objArr2.length));
                        }
                    });
                }
                onUIPlayListener = c47129Ieb.LIZJ;
            }
        } else {
            c47129Ieb.getClass();
        }
        igl.LJLJI = onUIPlayListener;
        this.LIZIZ.LJJJLL(this.LJIJ);
    }

    @Override // X.IWH
    public final void LJJLIIIIJ(InterfaceC46803IYl interfaceC46803IYl) {
        LJ().LIZ.LIZIZ.LJJLIIIIJ(interfaceC46803IYl);
    }

    @Override // X.IWH
    public final void LJJLIIIJILLIZJL(int i) {
        LJ().LIZ.LIZIZ.LJJLIIIJILLIZJL(i);
    }

    @Override // X.IWH
    public void setSurface(Surface surface) {
        String str;
        SimRadar.traceGroup("SimSurface").LIZIZ("setSurface");
        if (surface != null && !surface.isValid()) {
            SimRadar.errorScan("SimPlayer", "setSurface", new C46691IUd("Surface is invalid"), new Object[0]);
        }
        Object[] objArr = new Object[2];
        if (surface != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("surface@");
            LIZ.append(Integer.toHexString(surface.hashCode()));
            str = X1D.LIZIZ(LIZ);
        } else {
            str = null;
        }
        objArr[0] = str;
        objArr[1] = LJIJI();
        SimRadar.keyScan("SimPlayer", "setSurface", objArr);
        this.LIZIZ.setSurface(surface);
    }

    public AbstractC46746IWg(InterfaceC46747IWh interfaceC46747IWh, C46780IXo c46780IXo) {
        IVL ivl = new IVL((IXL) this);
        this.LJIL = ivl;
        this.LIZIZ = interfaceC46747IWh;
        interfaceC46747IWh.LJLIIL(new IVG());
        interfaceC46747IWh.LJLJLJ(new C17M());
        interfaceC46747IWh.LJJZZI(new C46752IWm(c46780IXo != null && c46780IXo.LIZ));
        C46543IOl c46543IOl = new C46543IOl();
        this.LJIILLIIL = c46543IOl;
        interfaceC46747IWh.LJLLI(c46543IOl);
        IUG LJIILLIIL = LJIILLIIL();
        this.LJIIJ = LJIILLIIL;
        IWK iwk = new IWK(interfaceC46747IWh);
        this.LJIIJJI = iwk;
        this.LJIIL = new C46751IWl(interfaceC46747IWh);
        this.LJIILJJIL = false;
        this.LJIIZILJ = new C47129Ieb();
        this.LJIJ = new IGL(LJIILLIIL, iwk);
        interfaceC46747IWh.LJLLLL(ivl);
    }

    public static void LJIILL(C46745IWf c46745IWf, boolean z) {
        SimVideo simVideo;
        C46666ITe c46666ITe;
        if (!IZ8.LJJJJJL() || c46745IWf == null || (simVideo = c46745IWf.LIZJ) == null) {
            return;
        }
        String sourceId = simVideo.getSourceId();
        if (TextUtils.isEmpty(sourceId)) {
            return;
        }
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        c46664ITc.getClass();
        if (TextUtils.isEmpty(sourceId)) {
            return;
        }
        if (!z && (c46666ITe = c46664ITc.LJIILJJIL.get(sourceId)) != null && c46666ITe.LIZIZ) {
            return;
        }
        c46664ITc.LJIILJJIL.put(sourceId, new C46666ITe(String.valueOf(System.currentTimeMillis()), z));
    }

    public static void LJJII(boolean z, IX4 ix4) {
        IYN LJIIJJI;
        Object value = IZ8.LLLLZLLIL.getValue();
        o.LJIIIIZZ(value, "<get-ENGINE_REUSE_OPT_CODEC_ADJUST_V2>(...)");
        int intValue = ((Number) value).intValue();
        if (intValue <= 0 || ix4 == null || (LJIIJJI = C46664ITc.LJIJ.LJIIJJI(ix4.LJIIIZ)) == null) {
            return;
        }
        if (z) {
            if (intValue != 1 && intValue != 2) {
                return;
            }
            ix4.LJIILIIL = LJIIJJI.isBytevc1();
            return;
        }
        if (intValue != 1 && intValue != 3) {
            return;
        }
        ix4.LJIILIIL = LJIIJJI.isBytevc1();
    }

    @Override // X.IWH
    public void LJII(Surface surface, boolean z) {
        String str;
        ITQ traceGroup = SimRadar.traceGroup("SimSurface");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurface:");
        LIZ.append(z);
        traceGroup.LIZIZ(X1D.LIZIZ(LIZ));
        Object[] objArr = new Object[3];
        if (surface != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("surface@");
            LIZ2.append(Integer.toHexString(surface.hashCode()));
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = null;
        }
        objArr[0] = str;
        objArr[1] = Q7L.LIZJ("directly:", z);
        objArr[2] = LJIJI();
        SimRadar.keyScan("SimPlayer", "setSurface", objArr);
        if (z) {
            this.LIZIZ.LJLLJ(surface);
        } else {
            this.LIZIZ.setSurface(surface);
        }
    }

    public final void LJJI(C46745IWf c46745IWf, IX4 ix4) {
        IZ6 claInfo;
        if (this.LJIILJJIL) {
            if (c46745IWf.LJJII) {
                this.LJIILL.LIZ = c46745IWf.LJJIFFI;
            }
            ix4.LJJLIIIJ = this.LJIILL.LIZ;
        } else {
            ix4.LJJLIIIJ = c46745IWf.LJJIFFI;
        }
        ix4.LJJIL = c46745IWf.LJIIJJI;
        ix4.LJJIZ = c46745IWf.LJIIL;
        ix4.LJJLIIIJLLLLLLLZ = c46745IWf.LJIIIIZZ;
        ix4.LJJLIL = c46745IWf.LJJIII;
        ix4.LJJLJ = Long.valueOf(c46745IWf.LJJIIJ);
        ix4.LJJLJLI = c46745IWf.LJJIIJZLJL;
        ix4.LJJLL = c46745IWf.LJJIIZ;
        ix4.LLIIII = c46745IWf.LJJIIZI;
        ix4.LJJZ = c46745IWf.LJJIJ;
        ix4.LJJZZI = c46745IWf.LJJIJIIJI;
        ix4.LJJZZIII = c46745IWf.LJJIJIIJIL;
        ix4.LJL = c46745IWf.LJJIJIL;
        SimVideo simVideo = c46745IWf.LIZJ;
        if (simVideo != null) {
            ix4.LJJJLIIL = simVideo.getWidth();
            ix4.LJJJLL = c46745IWf.LIZJ.getHeight();
        }
        ix4.LJJLIIJ = c46745IWf.LJJJLL;
        ix4.LJLLLL = c46745IWf.LJJJJI;
        ix4.LJLLLLLL = c46745IWf.LJJJJIZL;
        ix4.LJJJJ = c46745IWf.LJJIJL;
        ix4.LJJJJI = c46745IWf.LJJIJLIJ;
        ix4.LJJJJJ = c46745IWf.LJJIL;
        ix4.LJLZ = c46745IWf.LJJJJL;
        ix4.LJLIIL = c46745IWf.LJJIZ;
        ix4.LJLIL = c46745IWf.LJJJ;
        ix4.LJLILLLLZI = c46745IWf.LJJJI;
        ix4.LJLJI = c46745IWf.LJJJIL;
        ix4.LJLJJI = c46745IWf.LJJJJ;
        ix4.LJZI = c46745IWf.LJ;
        ix4.LJZL = c46745IWf.LJJJJJ;
        ix4.LL = c46745IWf.LJJJJJL;
        ix4.LIZJ = c46745IWf.LIZIZ;
        List<C47123IeV> list = c46745IWf.LIZLLL;
        if (list != null && !list.isEmpty()) {
            if (ix4.LJ == null) {
                ix4.LJ = new ArrayList();
            }
            for (final C47123IeV c47123IeV : list) {
                if (c47123IeV != null) {
                    ((ArrayList) ix4.LJ).add(new IXJ() { // from class: X.IXd
                        @Override // X.IXJ
                        public final /* synthetic */ Object LIZ() {
                            return null;
                        }

                        @Override // X.IXJ
                        public final Object get() {
                            C47123IeV c47123IeV2 = C47123IeV.this;
                            IUB iub = IUA.LIZ;
                            if (iub.LIZ().isPlayerPreferchTtsAudio()) {
                                iub.LIZ().createAudioUrlProcessor().LIZIZ();
                                return null;
                            }
                            return iub.LIZ().createAudioUrlProcessor().LIZ(c47123IeV2);
                        }
                    });
                }
            }
        }
        SimVideo simVideo2 = c46745IWf.LIZJ;
        if (simVideo2 != null && (claInfo = simVideo2.getClaInfo()) != null && claInfo.getCaptionInfos() != null && !claInfo.getCaptionInfos().isEmpty()) {
            if (ix4.LJFF == null) {
                ix4.LJFF = new ArrayList();
            }
            for (final IYA iya : claInfo.getCaptionInfos()) {
                if (iya != null) {
                    ((ArrayList) ix4.LJFF).add(new IXJ() { // from class: X.IXc
                        @Override // X.IXJ
                        public final /* synthetic */ Object LIZ() {
                            return null;
                        }

                        @Override // X.IXJ
                        public final Object get() {
                            IYA iya2 = IYA.this;
                            IUB iub = IUA.LIZ;
                            if (iub.LIZ().isPlayerPreferchCaption()) {
                                return iub.LIZ().createSubUrlProcessor().LIZIZ(iya2);
                            }
                            return iub.LIZ().createSubUrlProcessor().LIZ(iya2);
                        }
                    });
                }
            }
        }
        if (!TextUtils.isEmpty(c46745IWf.LJJLIIJ)) {
            ix4.LLI = c46745IWf.LJJLIIJ;
        }
    }

    public final void LJJIFFI(String str, C46650ISo c46650ISo) {
        C35738E0w c35738E0w;
        if (TextUtils.isEmpty(str) || (c35738E0w = this.LJIJJLI) == null) {
            return;
        }
        c35738E0w.put(str, c46650ISo);
    }
}
