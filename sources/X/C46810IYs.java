package X;

import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;

/* renamed from: X.IYs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46810IYs {
    public static SimVideo LIZIZ(InterfaceC46811IYt interfaceC46811IYt) {
        InterfaceC46813IYv interfaceC46813IYv;
        InterfaceC46813IYv interfaceC46813IYv2;
        SimBitRate simBitRate;
        if (interfaceC46811IYt == null) {
            return null;
        }
        SimVideo simVideo = new SimVideo();
        simVideo.setRatio(interfaceC46811IYt.LIZLLL());
        interfaceC46811IYt.LJI();
        simVideo.setMeta(null);
        interfaceC46811IYt.LIZIZ();
        simVideo.setVideoThumbs(null);
        ArrayList arrayList = new ArrayList();
        if (interfaceC46811IYt.LJFF() != null) {
            for (InterfaceC46813IYv interfaceC46813IYv3 : interfaceC46811IYt.LJFF()) {
                if (interfaceC46813IYv3 == null) {
                    simBitRate = null;
                } else {
                    simBitRate = new SimBitRate();
                    simBitRate.setBitRate(interfaceC46813IYv3.getBitRate());
                    simBitRate.setGearName(interfaceC46813IYv3.getGearName());
                    simBitRate.setQualityType(interfaceC46813IYv3.getQualityType());
                    simBitRate.setPlayAddr(LIZJ(interfaceC46811IYt, interfaceC46813IYv3));
                    simBitRate.setCodecType(interfaceC46813IYv3.LIZIZ());
                }
                arrayList.add(simBitRate);
            }
            simVideo.setBitRate(arrayList);
        }
        interfaceC46811IYt.LIZIZ();
        if (interfaceC46811IYt.LJIIJ() != null) {
            interfaceC46813IYv = null;
            interfaceC46813IYv2 = null;
            for (InterfaceC46813IYv interfaceC46813IYv4 : interfaceC46811IYt.LJIIJ()) {
                if (interfaceC46813IYv4.LIZIZ() == 0) {
                    interfaceC46813IYv = interfaceC46813IYv4;
                } else if (interfaceC46813IYv4.LIZIZ() == 1) {
                    interfaceC46813IYv2 = interfaceC46813IYv4;
                }
            }
        } else {
            interfaceC46813IYv = null;
            interfaceC46813IYv2 = null;
        }
        SimVideoUrlModel LIZJ = LIZJ(interfaceC46811IYt, interfaceC46813IYv);
        if (LIZJ != null) {
            simVideo.setPlayAddr(LIZJ);
            simVideo.setPlayAddrH264(LIZJ);
            LIZJ.setSourceId(interfaceC46811IYt.getKey());
            if (arrayList.size() > 0) {
                LIZJ.setBitRate(arrayList);
            }
        }
        SimVideoUrlModel LIZJ2 = LIZJ(interfaceC46811IYt, interfaceC46813IYv2);
        if (LIZJ2 != null) {
            simVideo.setPlayAddrBytevc1(LIZJ2);
            if (arrayList.size() > 0) {
                LIZJ2.setBitRate(arrayList);
            }
        }
        if (interfaceC46811IYt.getVideoModel() != null) {
            simVideo.setVideoModelStr(((C44390HbW) ((C44419Hbz) interfaceC46811IYt.getVideoModel()).LIZ.LIZJ.LIZ.LIZLLL).LIZ);
            interfaceC46811IYt.getVideoModel().getClass();
            simVideo.setDrmTokenAuth(null);
        }
        simVideo.setSourceId(interfaceC46811IYt.getKey());
        interfaceC46811IYt.LIZ();
        simVideo.cdnUrlExpired = 0L;
        simVideo.setDuration(interfaceC46811IYt.getDuration());
        return simVideo;
    }

    public static C46745IWf LIZ(InterfaceC46811IYt interfaceC46811IYt, Surface surface) {
        String LIZJ;
        String str;
        C46812IYu LJ = interfaceC46811IYt.LJ();
        SimVideo LIZIZ = LIZIZ(interfaceC46811IYt);
        C46744IWe c46744IWe = new C46744IWe();
        C46745IWf c46745IWf = c46744IWe.LIZ;
        c46745IWf.LIZJ = LIZIZ;
        c46745IWf.LJJLIIIJL = 2;
        interfaceC46811IYt.LJIIIZ();
        if (LJ != null) {
            interfaceC46811IYt.LJII();
            if (TextUtils.isEmpty(null)) {
                str = interfaceC46811IYt.getKey();
            } else {
                interfaceC46811IYt.LJII();
                str = null;
            }
            OnPreRenderListener onPreRenderListener = LJ.LIZ;
            C46745IWf c46745IWf2 = c46744IWe.LIZ;
            c46745IWf2.LIZ = onPreRenderListener;
            c46745IWf2.LJJJJZI = LJ.LJIIIIZZ;
            c46745IWf2.LJJJLIIL = false;
            c46745IWf2.LJII = false;
            c46744IWe.LIZJ(str);
            C46745IWf c46745IWf3 = c46744IWe.LIZ;
            c46745IWf3.LJIIIZ = true;
            c46745IWf3.LJIILL = LJ.LIZIZ;
            c46745IWf3.LJJLI = LJ.LJIIIZ;
            c46745IWf3.LJIL = false;
            c46745IWf3.LJJ = false;
            c46745IWf3.LJJJLZIJ = false;
            c46745IWf3.LJJLIIIJLJLI = false;
            c46745IWf3.LJJIFFI = 1.0f;
            c46745IWf3.LJJII = true;
            c46745IWf3.LJJIJIIJI = false;
            c46745IWf3.LJJIJIIJIL = false;
            c46745IWf3.LJJIJIL = false;
            c46745IWf3.LJJIJL = false;
            c46745IWf3.LJJIJLIJ = false;
            c46745IWf3.LJJIL = false;
            c46745IWf3.LJJJ = false;
            c46745IWf3.LJJIZ = false;
            c46745IWf3.LJJJI = 0;
            c46745IWf3.LJJJIL = null;
            c46745IWf3.LJJJJ = null;
            c46745IWf3.LJJJJI = true;
            c46745IWf3.LJJJJLL = LJ.LIZJ;
            c46745IWf3.LJJJJZ = LJ.LIZLLL;
            c46745IWf3.LJJI = false;
            c46745IWf3.LJIIJ = LJ.LJ;
            c46745IWf3.LJJJJJL = -1;
            c46745IWf3.LJIIL = -1;
            c46745IWf3.LJJJJJ = -1;
            c46745IWf3.LJIIJJI = -1;
            c46745IWf3.LJIJJLI = LJ.LJFF;
            c46745IWf3.LJIJ = true;
            c46745IWf3.LJIIIIZZ = false;
            c46745IWf3.LJJIII = false;
            c46745IWf3.LJJIIJ = 0L;
            c46745IWf3.LJJIIJZLJL = null;
            c46745IWf3.LJJIIZI = null;
            c46745IWf3.LJJIIZ = null;
            c46745IWf3.LJJIJ = null;
            c46745IWf3.LJIJI = true;
            c46745IWf3.LJIILJJIL = LJ.LJII;
            c46745IWf3.LJFF = null;
            c46745IWf3.LJIJJ = LJ.LJI;
            c46744IWe.LIZLLL("");
            C46745IWf c46745IWf4 = c46744IWe.LIZ;
            c46745IWf4.getClass();
            c46745IWf4.LJIIZILJ = "";
            C46745IWf c46745IWf5 = c46744IWe.LIZ;
            c46745IWf5.LJJIJIL = false;
            c46745IWf5.LJJJJL = false;
        }
        if (surface != null) {
            c46744IWe.LIZ.LJIILIIL = surface;
        }
        if (!TextUtils.isEmpty(interfaceC46811IYt.LIZJ()) && (LIZJ = interfaceC46811IYt.LIZJ()) != null) {
            C46745IWf c46745IWf6 = c46744IWe.LIZ;
            c46745IWf6.getClass();
            c46745IWf6.LJIIZILJ = LIZJ;
        }
        C46745IWf LIZ = c46744IWe.LIZ();
        interfaceC46811IYt.LJII();
        LIZ.LJJLIIIJJI = interfaceC46811IYt.getKey();
        return LIZ;
    }

    public static SimVideoUrlModel LIZJ(InterfaceC46811IYt interfaceC46811IYt, InterfaceC46813IYv interfaceC46813IYv) {
        if (interfaceC46813IYv == null) {
            return null;
        }
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        interfaceC46811IYt.LJII();
        simVideoUrlModel.setLogLabel(interfaceC46811IYt.getKey());
        simVideoUrlModel.setRatio(interfaceC46811IYt.LIZLLL());
        interfaceC46813IYv.getUri();
        simVideoUrlModel.setUri(interfaceC46813IYv.LIZJ());
        simVideoUrlModel.setUrlKey(interfaceC46813IYv.getKey());
        simVideoUrlModel.setSourceId(interfaceC46811IYt.getKey());
        simVideoUrlModel.setUrlList(interfaceC46813IYv.LIZ());
        simVideoUrlModel.setSize(interfaceC46813IYv.getSize());
        simVideoUrlModel.setDuration(interfaceC46811IYt.getDuration());
        if (interfaceC46813IYv.getKey() != null) {
            simVideoUrlModel.setHitBitrate(C46664ITc.LJIJ.LJIIJJI(interfaceC46811IYt.getKey()));
        }
        if (interfaceC46811IYt.LJ() != null) {
            interfaceC46811IYt.LJ().getClass();
            if (!TextUtils.isEmpty(null)) {
                interfaceC46811IYt.LJ().getClass();
                simVideoUrlModel.setaK(null);
            }
        }
        simVideoUrlModel.setSize(interfaceC46813IYv.getSize());
        interfaceC46811IYt.LIZ();
        simVideoUrlModel.setCdnUrlExpired(0L);
        interfaceC46811IYt.LJIIIIZZ();
        simVideoUrlModel.setAspectRatio(0.0f);
        return simVideoUrlModel;
    }
}
