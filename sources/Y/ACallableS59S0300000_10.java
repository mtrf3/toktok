package Y;

import X.C16880lQ;
import X.C31961CgX;
import X.C38816FLg;
import X.C39579Fg7;
import X.C55511LqV;
import X.C60537NpN;
import X.C60541NpR;
import X.C62011OVj;
import X.C68322mC;
import X.C76800UCe;
import X.C78765Uvh;
import X.C78983UzD;
import X.C79004UzY;
import X.EnumC60490Noc;
import X.IIW;
import X.InterfaceC88472Yns;
import X.NMA;
import X.NPQ;
import X.NPW;
import X.O1I;
import X.O5Y;
import X.OW6;
import X.VNS;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.lynx.tasm.TemplateData;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ACallableS59S0300000_10 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$0(ACallableS59S0300000_10 aCallableS59S0300000_10) {
        String str;
        TemplateData templateData;
        ACallableS87S0200000_10 aCallableS87S0200000_10 = (ACallableS87S0200000_10) aCallableS59S0300000_10.l2;
        if (((O1I) aCallableS87S0200000_10.l1).LJIIIIZZ == EnumC60490Noc.CDN && ((C60537NpN) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l1).LJII.Zf().isDebug()) {
            str = (String) ((C68322mC) ((AqS141S0200000_10) ((ACallableS87S0200000_10) aCallableS59S0300000_10.l2).l0).l0).element;
        } else {
            str = ((O1I) ((ACallableS87S0200000_10) aCallableS59S0300000_10.l2).l1).LJI;
        }
        C60537NpN c60537NpN = (C60537NpN) ((AqS141S0200000_10) ((ACallableS87S0200000_10) aCallableS59S0300000_10.l2).l0).l1;
        byte[] bytes = (byte[]) aCallableS59S0300000_10.l0;
        o.LJFF(bytes, "bytes");
        c60537NpN.getClass();
        VNS vns = c60537NpN.LIZIZ;
        if (vns != null) {
            C60541NpR c60541NpR = c60537NpN.LIZJ;
            if (c60541NpR != null) {
                C31961CgX c31961CgX = c60541NpR.LJLLL;
                if (c31961CgX == null || (templateData = c31961CgX.LIZ) == null) {
                    templateData = c60541NpR.LJLJLJ;
                }
            } else {
                templateData = null;
            }
            vns.renderTemplateWithBaseUrl(bytes, templateData, str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS59S0300000_10 aCallableS59S0300000_10) {
        final String str;
        Aweme aweme = (Aweme) aCallableS59S0300000_10.l0;
        TopViewAdEventLogger topViewAdEventLogger = (TopViewAdEventLogger) aCallableS59S0300000_10.l1;
        final DownloadInfo downloadInfo = (DownloadInfo) aCallableS59S0300000_10.l2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(NPQ.LIZJ);
        LIZ.append(aweme.getAid());
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (C55511LqV.LJ(aweme)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(NPQ.LIZJ);
            LIZ2.append(C55511LqV.LIZLLL(aweme.getAid()));
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        File file = new File(LIZIZ);
        long LJIJJLI = O5Y.LJIJJLI(LIZIZ);
        int i = IIW.LIZ;
        if (i == 0) {
            NMA.LIZ.getClass();
            topViewAdEventLogger.LJ(NMA.LIZJ, new AObjectS25S0100100_10(downloadInfo, LJIJJLI, 0));
            NPW.LIZ(aweme, -1, null, downloadInfo.getUrl(), true);
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
        } else if (LJIJJLI < i) {
            final long j = 0;
            if (file.exists()) {
                try {
                    if (file.isFile()) {
                        j = file.length();
                    }
                    str = O5Y.LJJIIJZLJL(LIZIZ);
                    if (str != null) {
                        try {
                            if (str.length() > 200) {
                                str = str.substring(0, 200);
                            }
                        } catch (Exception e) {
                            e = e;
                            C78983UzD.LJIIZILJ(e);
                            C16880lQ.LLLZZIL(file);
                            topViewAdEventLogger.LJ(NMA.LIZLLL, new InterfaceC88472Yns() { // from class: X.NMC
                                @Override // X.InterfaceC88472Yns
                                public final Object invoke(Object obj) {
                                    DownloadInfo downloadInfo2 = DownloadInfo.this;
                                    long j2 = j;
                                    String str2 = str;
                                    C58620MzY c58620MzY = (C58620MzY) obj;
                                    c58620MzY.LJIIJ(downloadInfo2);
                                    NMB.LIZ.getClass();
                                    c58620MzY.LJII(NMB.LJI, -2);
                                    c58620MzY.LJII(NMB.LJII, "Less than minsize");
                                    c58620MzY.LJII(NMB.LJIIIIZZ, Long.valueOf(j2));
                                    c58620MzY.LJII(NMB.LJIIIZ, str2);
                                    return null;
                                }
                            });
                            NPW.LIZ(aweme, -2, "Less than minsize", downloadInfo.getUrl(), false);
                            return null;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = null;
                }
                C16880lQ.LLLZZIL(file);
            } else {
                str = null;
            }
            topViewAdEventLogger.LJ(NMA.LIZLLL, new InterfaceC88472Yns() { // from class: X.NMC
                @Override // X.InterfaceC88472Yns
                public final Object invoke(Object obj) {
                    DownloadInfo downloadInfo2 = DownloadInfo.this;
                    long j2 = j;
                    String str2 = str;
                    C58620MzY c58620MzY = (C58620MzY) obj;
                    c58620MzY.LJIIJ(downloadInfo2);
                    NMB.LIZ.getClass();
                    c58620MzY.LJII(NMB.LJI, -2);
                    c58620MzY.LJII(NMB.LJII, "Less than minsize");
                    c58620MzY.LJII(NMB.LJIIIIZZ, Long.valueOf(j2));
                    c58620MzY.LJII(NMB.LJIIIZ, str2);
                    return null;
                }
            });
            NPW.LIZ(aweme, -2, "Less than minsize", downloadInfo.getUrl(), false);
        } else {
            NMA.LIZ.getClass();
            topViewAdEventLogger.LJ(NMA.LIZJ, new AObjectS25S0100100_10(downloadInfo, LJIJJLI, 1));
            NPW.LIZ(aweme, -1, null, downloadInfo.getUrl(), true);
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView download succeed");
        }
        return null;
    }

    public static final Object call$2(ACallableS59S0300000_10 aCallableS59S0300000_10) {
        synchronized (((ScanQRCodeActivityV2) aCallableS59S0300000_10.l2)) {
            ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS59S0300000_10.l2;
            IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LJLJLLL;
            if (iQRCodeScanner != null && scanQRCodeActivityV2.LJLLL) {
                iQRCodeScanner.startScan(scanQRCodeActivityV2, (AVCameraParams) aCallableS59S0300000_10.l0, scanQRCodeActivityV2.LJLJLJ.getHolder(), (AVScanSettings) aCallableS59S0300000_10.l1);
            }
        }
        return null;
    }

    public static final Object call$3(ACallableS59S0300000_10 aCallableS59S0300000_10) {
        int lastIndexOf;
        List<String> urlList = ((UrlModel) aCallableS59S0300000_10.l0).getUrlList();
        if (C79004UzY.LJJIFFI(urlList)) {
            OW6 ow6 = (OW6) aCallableS59S0300000_10.l2;
            ow6.getClass();
            C38816FLg.LIZJ(new ARunnableS46S0100000_10(ow6, 103));
            C62011OVj.LJII(1, "urlList is empty");
            return Boolean.FALSE;
        }
        for (String str : urlList) {
            if (str != null) {
                String LJIIJJI = C78765Uvh.LJIIJJI(str);
                if (C39579Fg7.LIZIZ(LJIIJJI) && (lastIndexOf = LJIIJJI.lastIndexOf("/") + 1) >= 0 && lastIndexOf < LJIIJJI.length()) {
                    String substring = LJIIJJI.substring(lastIndexOf);
                    if (TextUtils.isEmpty(substring)) {
                        continue;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(C62011OVj.LIZIZ());
                        LIZ.append(substring);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        if (C39579Fg7.LIZIZ(LIZIZ) || C39579Fg7.LIZLLL(LJIIJJI, LIZIZ)) {
                            OW6 ow62 = (OW6) aCallableS59S0300000_10.l2;
                            Aweme aweme = (Aweme) aCallableS59S0300000_10.l1;
                            ow62.getClass();
                            C38816FLg.LIZJ(new ARunnableS9S1200000_10(ow62, aweme, LIZIZ, 1));
                            return Boolean.TRUE;
                        }
                    }
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$4(Y.ACallableS59S0300000_10 r5) {
        /*
            java.lang.Object r2 = r5.l0
            X.Nzv r2 = (X.C61191Nzv) r2
            boolean r0 = r2.LIZJ
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r5.l1
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L16
            X.Nzt r0 = r2.LIZ
            r0.LIZLLL()
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.Nzt r0 = r2.LIZ
            r0.LIZJ()
            goto L13
        L1c:
            java.lang.Object r1 = r5.l1
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L59
            java.lang.String r0 = r2.LIZLLL
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L59
            java.lang.Object r4 = r5.l0
            X.Nzv r4 = (X.C61191Nzv) r4
            java.util.Iterator r3 = r0.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.geckox.model.UpdatePackage r0 = (com.bytedance.geckox.model.UpdatePackage) r0
            java.lang.String r1 = r0.getChannel()
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L34
            if (r2 == 0) goto L59
            java.lang.Object r0 = r5.l0
            X.Nzv r0 = (X.C61191Nzv) r0
            X.Nzt r0 = r0.LIZ
            r0.LIZJ()
            goto L13
        L59:
            java.lang.Object r1 = r5.l2
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L8e
            java.lang.Object r0 = r5.l0
            X.Nzv r0 = (X.C61191Nzv) r0
            java.lang.String r0 = r0.LIZLLL
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L8e
            java.lang.Object r4 = r5.l0
            X.Nzv r4 = (X.C61191Nzv) r4
            java.util.Iterator r3 = r0.iterator()
        L75:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r2 = r3.next()
            r0 = r2
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r1 = r0.first
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L75
            if (r2 != 0) goto L13
        L8e:
            java.lang.Object r0 = r5.l0
            X.Nzv r0 = (X.C61191Nzv) r0
            X.Nzt r0 = r0.LIZ
            r0.LJ()
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS59S0300000_10.call$4(Y.ACallableS59S0300000_10):java.lang.Object");
    }

    public ACallableS59S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
