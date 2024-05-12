package X;

import android.net.Uri;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Nup, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60875Nup extends LynxViewClient {
    public final String LIZ;
    public android.net.Uri LIZIZ;
    public final C60606NqU LIZJ;
    public AbstractC60673NrZ LIZLLL;
    public C60737Nsb LJ;
    public final InterfaceC61488OBg LJFF;
    public PH4 LJI;
    public final InterfaceC60761Nsz LJII;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJ() {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJ();
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJII();
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJIIJJI();
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILIIL() {
        InterfaceC60614Nqc interfaceC60614Nqc;
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJII;
        if (interfaceC60761Nsz != null) {
            C60726NsQ c60726NsQ = (C60726NsQ) interfaceC60761Nsz;
            C60606NqU c60606NqU = c60726NsQ.LJLJI;
            if (c60606NqU != null && (interfaceC60614Nqc = c60606NqU.LJIILIIL) != null) {
                interfaceC60614Nqc.onDestroy();
            }
            if (c60726NsQ.LJLL) {
                AbstractC60673NrZ abstractC60673NrZ = c60726NsQ.LJLJJL;
                if (abstractC60673NrZ != null) {
                    abstractC60673NrZ.LJJJIL();
                }
            } else {
                AbstractC60673NrZ abstractC60673NrZ2 = c60726NsQ.LJLJJL;
                if (abstractC60673NrZ2 != null) {
                    abstractC60673NrZ2.onDestroy();
                }
            }
            C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
            String containerID = c60726NsQ.getHybridContext().containerId;
            c31999Ch9.getClass();
            o.LJIIJ(containerID, "containerID");
            C31999Ch9.LIZ.remove(containerID);
            C31999Ch9.LIZIZ.remove(containerID);
            if (C60726NsQ.LJZ) {
                C39048FUe.LIZIZ(C39048FUe.LIZIZ, "LynxKitView unregisterLynxMonitor", EnumC39866Fkk.D, null, 4);
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor.INSTANCE.unregisterLynxViewMonitor(c60726NsQ);
                return;
            }
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJIILLIIL();
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        EnumC39924Flg enumC39924Flg;
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJJIFFI();
            }
        }
        AbstractC60673NrZ abstractC60673NrZ = this.LIZLLL;
        if (abstractC60673NrZ != null) {
            C60606NqU c60606NqU2 = this.LIZJ;
            if (c60606NqU2 == null || (enumC39924Flg = c60606NqU2.LIZ) == null) {
                enumC39924Flg = EnumC39924Flg.UNKNOWN;
            }
            abstractC60673NrZ.LJJJJZ(enumC39924Flg);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJZLJL() {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJJIIJZLJL();
            }
        }
    }

    public static final String LJJIIZI(String str) {
        String uri = new Uri.Builder().scheme("asset").authority("").path(str).build().toString();
        o.LJFF(uri, "Uri.Builder()\n          …      .build().toString()");
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60875Nup.LIZIZ(java.lang.String):java.lang.String");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((LynxViewClient) it.next()).LJI(lynxPerfMetric);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ(String str) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJIIJ(str);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIL(C40154FpO c40154FpO) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((LynxViewClient) it.next()).LJIIL(c40154FpO);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().LJIILL(str);
            }
        }
        this.LIZIZ = UriProtector.parse(str);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        android.net.Uri uri;
        AbstractC60673NrZ abstractC60673NrZ;
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((LynxViewClient) it.next()).LJIJ(lynxError);
            }
        }
        if (C47261Igj.LJJIJIIJI(100, 102, 103, 1201).contains(Integer.valueOf(lynxError.LIZ)) && (uri = this.LIZIZ) != null && (abstractC60673NrZ = this.LIZLLL) != null) {
            InterfaceC60761Nsz interfaceC60761Nsz = this.LJII;
            String valueOf = String.valueOf(uri);
            C60704Ns4 c60704Ns4 = new C60704Ns4();
            c60704Ns4.LIZ = 210;
            c60704Ns4.LIZIZ = "LynxReceiveError";
            c60704Ns4.LIZJ = Integer.valueOf(lynxError.LIZ);
            c60704Ns4.LIZLLL = lynxError.LIZ();
            abstractC60673NrZ.LJJJJIZL(interfaceC60761Nsz, valueOf, c60704Ns4);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJII(C60877Nur c60877Nur) {
        Object LIZ;
        HybridSchemaParam hybridSchemaParam;
        String str = c60877Nur.LIZJ;
        if (str != null && str.length() > 0) {
            if (this.LJI == null) {
                try {
                    this.LJI = new PH4(str, true);
                } catch (Exception e) {
                    C39048FUe c39048FUe = C39048FUe.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    c39048FUe.LIZ(KMP.LJFF(LIZ2, "FpsTracer failed to initialize : ", e, LIZ2), EnumC39866Fkk.E, this.LIZ);
                }
            }
            PH4 ph4 = this.LJI;
            if (ph4 != null) {
                ph4.LIZLLL();
            }
            try {
                InterfaceC55057LjB LIZ3 = C40443Fu3.LIZ("spark_lynx_scroll");
                LIZ3.LJII(str, "tag_name");
                C60606NqU c60606NqU = this.LIZJ;
                if (c60606NqU != null && (hybridSchemaParam = c60606NqU.LJIILJJIL) != null) {
                    LIZ3.LJII("", "url");
                    if (hybridSchemaParam.getUrl().length() > 0) {
                        LIZ3.LJII(hybridSchemaParam.getUrl(), "url");
                    } else {
                        LIZ3.LJII(hybridSchemaParam.getSurl(), "url");
                    }
                }
                LIZ3.start();
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C39048FUe c39048FUe2 = C39048FUe.LIZIZ;
                StringBuilder LIZ4 = X1D.LIZ();
                c39048FUe2.LIZ(C03090Af.LIZJ(LIZ4, "FpsMonitor failed to initialize : ", m10exceptionOrNullimpl, LIZ4), EnumC39866Fkk.E, this.LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIII(C60877Nur c60877Nur) {
        PH4 ph4 = this.LJI;
        if (ph4 != null) {
            ph4.LJ();
        }
        String str = c60877Nur.LIZJ;
        if (str != null && str.length() > 0) {
            try {
                C40443Fu3.LIZ("spark_lynx_scroll").stop();
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(LynxPerfMetric lynxPerfMetric) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((LynxViewClient) it.next()).LJJIIZ(lynxPerfMetric);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(java.util.Map<String, Object> map) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator<LynxViewClient> it = list.iterator();
            while (it.hasNext()) {
                it.next().onTimingSetup(map);
            }
        }
    }

    public C60875Nup(InterfaceC60761Nsz kitView, C60606NqU c60606NqU, InterfaceC61488OBg interfaceC61488OBg) {
        o.LJIIJ(kitView, "kitView");
        this.LJII = kitView;
        this.LIZ = "DefaultLynxViewClient";
        this.LIZJ = c60606NqU;
        this.LJFF = interfaceC61488OBg;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL(int i, String str, String str2) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((LynxViewClient) it.next()).LJIILJJIL(i, str, str2);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ(String str, java.util.Map map, java.util.Map map2) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((LynxViewClient) it.next()).LJJIIJ(str, map, map2);
            }
        }
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    public final void LIZ(VNU vnu, String str, float f, float f2, C79286V9u c79286V9u) {
        List<LynxViewClient> list;
        C60606NqU c60606NqU = this.LIZJ;
        if (c60606NqU != null && (list = c60606NqU.LJJ) != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((LynxViewClient) it.next()).LIZ(vnu, str, f, f2, c79286V9u);
            }
        }
    }
}
