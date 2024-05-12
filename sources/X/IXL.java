package X;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttm.player.DummySurface;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class IXL extends AbstractC46746IWg {
    @Override // X.AbstractC46746IWg
    public final void LJIJJ() {
    }

    @Override // X.AbstractC46746IWg
    public final void LJIJJLI() {
    }

    @Override // X.AbstractC46746IWg
    public final void LJIL() {
    }

    static {
        if (((Boolean) IZ8.LJJZZIII.getValue()).booleanValue()) {
            SimRadar.keyScan("SimPlayer", "DummySurface.useCaches", new Object[0]);
            DummySurface.useCaches(true);
        }
    }

    @Override // X.IWH
    public final void LJIIJ() {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJLI(true);
        }
    }

    @Override // X.AbstractC46746IWg
    public final IUG LJIILLIIL() {
        return new IUG(this.LIZIZ, this, this.LJIILL);
    }

    @Override // X.AbstractC46746IWg
    public final IX4 LIZIZ(C46749IWj c46749IWj) {
        C47164IfA LIZ;
        String str;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        IWI iwi;
        IWI iwi2;
        boolean isAsyncInit = C80036Vb6.LIZIZ().isAsyncInit();
        SimVideo simVideo = c46749IWj.LIZ;
        SimVideoUrlModel playAddr = simVideo.getPlayAddr();
        if (playAddr != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("createNormalPrepareData bit_rate_audio ");
            LIZ2.append(playAddr.getAudioBitrate());
            LIZ2.append(" meta ");
            LIZ2.append(playAddr.getMeta());
            LIZ2.append(" aid ");
            LIZ2.append(playAddr.getSourceId());
            IXB.LIZIZ("SimPlayerHelper", X1D.LIZIZ(LIZ2));
        }
        final String sourceId = simVideo.getSourceId();
        Object videoModel = simVideo.getVideoModel();
        if (videoModel != null && (videoModel instanceof C47164IfA)) {
            LIZ = (C47164IfA) videoModel;
        } else {
            LIZ = C46916IbA.LIZ(c46749IWj.LIZ.getVideoModelStr());
        }
        if (LIZ == null || LIZ.LIZJ == null) {
            return null;
        }
        if (c46749IWj.LIZ.getPlayAddr() != null) {
            str = c46749IWj.LIZ.getPlayAddr().getUri();
        } else {
            str = LIZ.LIZJ.LJIJJ;
        }
        String str2 = LIZ.LIZJ.LJIJJ;
        if (LIZ.LJIJJ() != null) {
            for (String str3 : LIZ.LJIJJ()) {
                if (TextUtils.equals(str3, "bytevc1")) {
                    i = 1;
                    break;
                }
            }
        }
        i = 0;
        if (c46749IWj.LIZ.getPlayAddr() != null) {
            c46749IWj.LIZ.getPlayAddr().setDashVideoId(str2);
            c46749IWj.LIZ.getPlayAddr().setDashVideoModelStr(c46749IWj.LIZ.getVideoModelStr());
        }
        C46664ITc.LJIJ.LJIJ(sourceId, str2);
        final boolean LJJIJLIJ = IZ8.LJJIJLIJ();
        C46745IWf c46745IWf = c46749IWj.LJIIIIZZ;
        if (c46745IWf != null) {
            LJJIJLIJ = c46745IWf.LJIILJJIL;
        }
        final long duration = c46749IWj.LIZ.getDuration();
        IXJ ixj = new IXJ() { // from class: X.IUU
            @Override // X.IXJ
            public final /* synthetic */ Object LIZ() {
                return null;
            }

            @Override // X.IXJ
            public final Object get() {
                return IUA.LIZ.LIZ().getDashProcessUrlData(sourceId, LJJIJLIJ, duration);
            }
        };
        Application application = C46982IcE.LIZ;
        boolean z4 = c46749IWj.LIZIZ;
        IWI iwi3 = c46749IWj.LJII;
        IXN ixn = IXN.LIZJ;
        IX4 ix4 = new IX4(ixj, null, application, sourceId, z4, iwi3, false, i, ixn.getRenderType(), null, str, !c46749IWj.LIZJ, isAsyncInit, C80036Vb6.LIZIZ().get265DecodeType());
        ix4.LJJII = C80036Vb6.LIZIZ().frameWait();
        ix4.LJIJI = IXM.LIZLLL();
        if (ixn.isUseVideoTextureRenderer() && c46749IWj.LJI) {
            z = true;
        } else {
            z = false;
        }
        ix4.LJJJ = z;
        IXO ixo = new IXO();
        C46745IWf c46745IWf2 = c46749IWj.LJIIIIZZ;
        if (c46745IWf2 != null) {
            z2 = c46745IWf2.LJIL;
        } else {
            z2 = false;
        }
        ixo.LIZIZ = new C46914Ib8(LIZ);
        if (playAddr != null && (playAddr.hasDashBitrate() || IZ8.LJJIJIIJI())) {
            ixo.LIZ = new IXQ(playAddr, ixo.LIZIZ, z2, LJJIJLIJ);
        }
        ixo.LJIILIIL = C80036Vb6.LIZIZ().isDashABREnabled();
        ixo.LJIJJ = C80036Vb6.LIZIZ().ABR4GMaxResolutionIndex();
        ixo.LJIJI = C80036Vb6.LIZIZ().ABRFixedLevel();
        ixo.LJIJ = C80036Vb6.LIZIZ().PlayerAbABRStartUpModelExp();
        ixo.LJIIZILJ = C80036Vb6.LIZIZ().PlayerAbABRSwitchCsModelExp();
        ixo.LJIILLIIL = C80036Vb6.LIZIZ().PlayerAbABRSwitchSensitivityExp();
        ixo.LJIILL = C80036Vb6.LIZIZ().PlayerAbABRTimerIntervalMillExp();
        ixo.LJIJJLI = C80036Vb6.LIZIZ().PlayerAbABRBandwidthParamExp();
        ixo.LJIL = C80036Vb6.LIZIZ().PlayerAbABRStallPenaltyParamExp();
        ixo.LJJ = C80036Vb6.LIZIZ().PlayerAbABRSwitchPenaltyParamExp();
        if (c46749IWj.LIZ.enableIntertrustDrm()) {
            ixo.LJIIJJI = C80036Vb6.LIZIZ().enableIntertrust();
            ixo.LJIIL = C80036Vb6.LIZIZ().enableIntertrustDemotion();
        }
        ix4.LJJJJZI = ixo;
        boolean z5 = true;
        if (C80036Vb6.LIZIZ().PlayeAbFixPrepareSeqTmpEnableExp() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        ix4.LJJJJLI = z3;
        if (C80036Vb6.LIZIZ().PlayeAbDashHijackRetryEnableExp() != 1) {
            z5 = false;
        }
        ix4.LJJJIL = z5;
        IUB iub = IUA.LIZ;
        ix4.LJJL = iub.LIZ().getAverageSpeedInKBps();
        if (C80036Vb6.LIZIZ().videoBitRateEnabled()) {
            ix4.LJII = new IXS(sourceId, ixo.LIZIZ);
        }
        ix4.LJJIJLIJ = c46749IWj.LIZLLL;
        if (!TextUtils.isEmpty(c46749IWj.LJ)) {
            ix4.LJJJLZIJ = c46749IWj.LJ;
        }
        if (TextUtils.isEmpty(ix4.LJJJLZIJ) && (iwi2 = c46749IWj.LJII) != null && !TextUtils.isEmpty(iwi2.getTag())) {
            ix4.LJJJLZIJ = c46749IWj.LJII.getTag();
        }
        if (!TextUtils.isEmpty(c46749IWj.LJFF)) {
            ix4.LJJJZ = c46749IWj.LJFF;
        }
        if (TextUtils.isEmpty(ix4.LJJJZ) && (iwi = c46749IWj.LJII) != null && !TextUtils.isEmpty(iwi.getSubTag())) {
            ix4.LJJJZ = c46749IWj.LJII.getSubTag();
        }
        ix4.LJJLIIIJILLIZJL = c46749IWj.LIZ.getDuration();
        SimVideo simVideo2 = c46749IWj.LIZ;
        if (simVideo2 != null) {
            ix4.LJJLIIIJLJLI = IXM.LJ(simVideo2);
        }
        ix4.LJJLIIIJJI = Float.valueOf(C80036Vb6.LIZIZ().getVolLoudUnity());
        ix4.LLII = C80036Vb6.LIZIZ().isDirectUrlCheckInfoEnable();
        ix4.LJLI = C80036Vb6.LIZIZ().enableBufferTimeControl();
        ix4.LJLIIIL = C80036Vb6.LIZIZ().cacheDuration(c46749IWj.LIZ.getDuration());
        ix4.LJLJLLL = iub.LIZ().enableFileIoOpt(sourceId);
        ix4.LJLL = iub.LIZ().disableSleepResume(sourceId);
        ix4.LJJJJIZL = c46749IWj.LIZ.isColdBoot();
        ix4.LJLLI = C80036Vb6.LIZIZ().resumeFileIoBlockDurationThreshold();
        ix4.LJLLILLLL = C80036Vb6.LIZIZ().memCacheVideoDurationThreshold();
        return ix4;
    }

    @Override // X.AbstractC46746IWg, X.IWH
    public void LJI(float f) {
        C47140Iem c47140Iem;
        ArrayList<String> arrayList;
        int size;
        C47163If9 c47163If9;
        List<C47140Iem> list;
        List<C47140Iem> list2;
        List<C47140Iem> list3;
        super.LJI(f);
        ITI videoInfo = this.LJIIJ.getVideoInfo();
        C47164IfA LJL = C78685UuP.LJL(this.LJFF);
        C39061g6 c39061g6 = this.LJI;
        if (c39061g6 == null || (c47140Iem = (C47140Iem) c39061g6.LIZJ) == null) {
            c47140Iem = null;
        }
        if (videoInfo != null) {
            try {
                if (videoInfo.LJII != null) {
                    LJL = C78685UuP.LJL(videoInfo.LJII);
                }
            } catch (Exception unused) {
                return;
            }
        }
        int i = 0;
        if (LJL != null && (c47163If9 = LJL.LIZJ) != null) {
            int i2 = c47163If9.LIZ;
            if (i2 == 2) {
                list = c47163If9.LJLIIIL;
            } else {
                list = c47163If9.LJJIJLIJ;
            }
            if (list != null) {
                if (i2 != 2) {
                    list2 = c47163If9.LJJIJLIJ;
                } else {
                    list2 = c47163If9.LJLIIIL;
                }
                if (((ArrayList) list2).size() > 0) {
                    C47163If9 c47163If92 = LJL.LIZJ;
                    if (c47163If92.LIZ == 2) {
                        list3 = c47163If92.LJLIIIL;
                    } else {
                        list3 = c47163If92.LJJIJLIJ;
                    }
                    C47140Iem c47140Iem2 = (C47140Iem) ListProtector.get(list3, 0);
                    if (c47140Iem2 != null) {
                        c47140Iem = c47140Iem2;
                        arrayList = c47140Iem.LIZIZ;
                        if (arrayList == null && arrayList.size() > 1 && (size = c47140Iem.LIZIZ.size()) > 0) {
                            do {
                                C46766IXa.LIZ(c47140Iem, i);
                                i++;
                            } while (i < size);
                            return;
                        }
                        C46766IXa.LIZ(c47140Iem, 0);
                    }
                }
            }
        }
        if (c47140Iem != null) {
            arrayList = c47140Iem.LIZIZ;
            if (arrayList == null) {
            }
            C46766IXa.LIZ(c47140Iem, 0);
        }
    }

    @Override // X.IWH
    public final Object LJIILJJIL(String str) {
        return C46916IbA.LIZ(str);
    }

    @Override // X.AbstractC46746IWg
    public final C39061g6 LJIIZILJ(SimVideo simVideo) {
        C47140Iem c47140Iem;
        if (simVideo.getVideoThumbs() != null && simVideo.getVideoThumbs().size() > 0) {
            try {
                c47140Iem = new C47140Iem();
                c47140Iem.LIZ(new JSONObject(((j) ListProtector.get(simVideo.getVideoThumbs(), 0)).toString()));
            } catch (Throwable unused) {
            }
            return new C39061g6(6, c47140Iem);
        }
        c47140Iem = null;
        return new C39061g6(6, c47140Iem);
    }

    @Override // X.IWH
    public final void LJJLIIIJJIZ(InterfaceC46826IZi interfaceC46826IZi) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIJJIZ(interfaceC46826IZi);
        }
    }

    @Override // X.IWH
    public final void LJJLIIIJLLLLLLLZ(int i) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIJLLLLLLLZ(i);
        }
    }

    @Override // X.IWH
    public final String LJJLIIJ(int i) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZIZ;
        if (interfaceC46747IWh != null) {
            return interfaceC46747IWh.LJJLIIJ(i);
        }
        return "";
    }

    public IXL(InterfaceC46747IWh interfaceC46747IWh, C46780IXo c46780IXo) {
        super(interfaceC46747IWh, c46780IXo);
    }

    @Override // X.IWH
    public final void LJJLIIIJ(int i, JSONObject jSONObject) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZIZ;
        if (interfaceC46747IWh != null) {
            interfaceC46747IWh.LJJLIIIJ(i, jSONObject);
        }
    }
}
