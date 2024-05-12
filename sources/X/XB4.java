package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import defpackage.i0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XB4 {
    public final X62 LIZ;
    public final XB8 LIZIZ;
    public final XBB LIZJ;
    public final EnumC124214u9 LIZLLL;

    public final void LIZJ(long j, String str) {
        String str2;
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        EnumC124214u9 enumC124214u9 = this.LIZLLL;
        if (enumC124214u9 != null) {
            str2 = enumC124214u9.name();
        } else {
            str2 = null;
        }
        YE1.LIZLLL(LIZ, str2, "-->", str, " , cost ");
        LIZ.append(j);
        LIZ.append(" mills.");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadManager", LIZIZ);
    }

    public XB4(X62 x62, XB8 xb8, XBB xbb, EnumC124214u9 enumC124214u9) {
        this.LIZ = x62;
        this.LIZIZ = xb8;
        this.LIZJ = xbb;
        this.LIZLLL = enumC124214u9;
    }

    public final long LIZ(String downloadUrl, boolean z, XB8 diskWriter, XB7 xb7) {
        VNB vnb;
        o.LJIIJ(downloadUrl, "downloadUrl");
        o.LJIIJ(diskWriter, "diskWriter");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downloadUrl=");
        LIZ.append(downloadUrl);
        LIZ.append(" start");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadManager", LIZIZ);
        XB5 xb5 = new XB5();
        long currentTimeMillis = System.currentTimeMillis();
        if (!C107244Iu.LIZIZ(downloadUrl)) {
            xb7.onStart();
            try {
                vnb = this.LIZ.fetchFromNetwork(new XD6(downloadUrl, null, XD7.GET, null, null, 186));
                if (vnb != null && vnb.LIZIZ == 200) {
                    xb5.LIZIZ = System.currentTimeMillis() - currentTimeMillis;
                    LIZJ(xb5.LIZIZ, "fetchInputStream success! url: ".concat(downloadUrl));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    try {
                        String LIZ2 = diskWriter.LIZ(new C84426XBm(vnb.LIZJ), vnb.LIZLLL, xb7);
                        if (LIZ2 == null) {
                            return -1L;
                        }
                        long LJI = XBM.LJI(LIZ2);
                        xb5.LJ = LJI;
                        xb5.LIZJ = System.currentTimeMillis() - currentTimeMillis2;
                        if (LJI > 0) {
                            LIZJ(xb5.LIZJ, i0.LJFF("writeToDisk success! url: ", downloadUrl));
                            XBB xbb = this.LIZJ;
                            if (xbb == null) {
                                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                                xb5.LIZ = currentTimeMillis3;
                                LIZJ(currentTimeMillis3, "unnecessary to unzip, download success");
                                xb7.LIZ(xb5);
                                return LJI;
                            }
                            long currentTimeMillis4 = System.currentTimeMillis();
                            try {
                                boolean LIZ3 = xbb.LIZ(LIZ2, z);
                                xb5.LIZLLL = System.currentTimeMillis() - currentTimeMillis4;
                                xb5.LIZ = System.currentTimeMillis() - currentTimeMillis;
                                if (LIZ3) {
                                    LIZJ(xb5.LIZLLL, i0.LJFF("unzip success! url: ", downloadUrl));
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("download success! url: ");
                                    LIZ4.append(downloadUrl);
                                    LIZJ(xb5.LIZ, X1D.LIZIZ(LIZ4));
                                    xb7.LIZ(xb5);
                                    return LJI;
                                }
                                xb5.LJFF = new XB6("unzip file failed!");
                                LIZJ(xb5.LIZLLL, i0.LJFF("unzip failed! url: ", downloadUrl));
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("download failed! url: ");
                                LIZ5.append(downloadUrl);
                                LIZJ(xb5.LIZ, X1D.LIZIZ(LIZ5));
                                xb7.LIZ(xb5);
                                return -1L;
                            } catch (Exception e) {
                                if (!(e instanceof XB2) && !(e instanceof XB1) && !(e instanceof C10850bh) && !(e instanceof XB6)) {
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    LIZ6.append(C65352Pkq.LIZ(e.getClass()).LIZLLL());
                                    LIZ6.append(':');
                                    LIZ6.append(e.getMessage());
                                    throw new XB6(X1D.LIZIZ(LIZ6));
                                }
                                throw e;
                            }
                        }
                        LIZJ(xb5.LIZJ, i0.LJFF("writeToDisk failed! url: ", downloadUrl));
                        xb5.LIZ = System.currentTimeMillis() - currentTimeMillis;
                        xb5.LJFF = new C10850bh("write file to disk failed!");
                        xb7.LIZ(xb5);
                        return LJI;
                    } catch (Exception e2) {
                        if (!(e2 instanceof XB2) && !(e2 instanceof XB1) && !(e2 instanceof C10850bh)) {
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append(C65352Pkq.LIZ(e2.getClass()).LIZLLL());
                            LIZ7.append(':');
                            LIZ7.append(e2.getMessage());
                            throw new C10850bh(X1D.LIZIZ(LIZ7));
                        }
                        throw e2;
                    }
                }
            } catch (Exception e3) {
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append(C65352Pkq.LIZ(e3.getClass()).LIZLLL());
                LIZ8.append(':');
                LIZ8.append(e3.getMessage());
                xb5.LJFF = new C84434XBu(LiveChatShowDelayForHotLiveSetting.DEFAULT, X1D.LIZIZ(LIZ8));
                vnb = null;
            }
            xb5.LIZ = System.currentTimeMillis() - currentTimeMillis;
            if (vnb != null) {
                int i = vnb.LIZIZ;
                String str = vnb.LJ;
                if (str == null) {
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("status code is ");
                    LIZ9.append(vnb.LIZIZ);
                    str = X1D.LIZIZ(LIZ9);
                }
                xb5.LJFF = new C84434XBu(i, str);
            }
            LIZJ(xb5.LIZ, "fetchFromNetwork failed! url: ".concat(downloadUrl));
            xb7.LIZ(xb5);
            return -1L;
        }
        xb5.LIZ = System.currentTimeMillis() - currentTimeMillis;
        xb5.LJFF = new XB9("invalid url");
        LIZJ(xb5.LIZ, i0.LJFF("download failed! url: ", downloadUrl));
        xb7.LIZ(xb5);
        return -1L;
    }

    public final VNB LIZIZ(String downloadUrl, String str, List<String> list, String tag, XB7 xb7) {
        VNB vnb;
        String str2 = str;
        o.LJIIJ(downloadUrl, "downloadUrl");
        o.LJIIJ(tag, "tag");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downloadUrl=");
        LIZ.append(downloadUrl);
        LIZ.append(" start");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("DownloadManager", LIZIZ);
        XB5 xb5 = new XB5();
        long currentTimeMillis = System.currentTimeMillis();
        if (str2 == null) {
            str2 = null;
        }
        if (!(!C107244Iu.LIZIZ(downloadUrl)) || C107244Iu.LIZIZ(str2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[错误][Download][下载链接:");
            LIZ2.append(downloadUrl);
            LIZ2.append("][下载文件地址:");
            LIZ2.append(str2);
            LIZ2.append(']');
            C12310e3.LIZIZ("JKL", X1D.LIZIZ(LIZ2), null);
            xb5.LIZ = System.currentTimeMillis() - currentTimeMillis;
            xb5.LJFF = new XB9("invalid url");
            LIZJ(xb5.LIZ, i0.LJFF("download failed! url: ", downloadUrl));
            xb7.LIZ(xb5);
            return new VNB(-1, new C78855Ux9());
        }
        xb7.onStart();
        XD6 xd6 = new XD6(downloadUrl, list, XD7.GET, null, null, 184);
        XBQ xbq = XBL.LJIJJ;
        String LJFF = XBM.LJFF(str2);
        if (LJFF != null) {
            xbq.getClass();
            String LIZJ = XBQ.LIZJ(LJFF);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(XBM.LJII(str2));
            String LJFF2 = JBR.LJFF(LIZ3, C10820be.LIZ, LIZJ, LIZ3);
            try {
                X62 x62 = this.LIZ;
                if (x62 instanceof X64) {
                    if (x62 != null) {
                        vnb = ((X64) x62).LIZIZ(xd6, LJFF2, tag, xb7);
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.bridge.network.INetworkClientEx");
                    }
                } else {
                    vnb = x62.fetchFromNetwork(xd6);
                }
                if (vnb != null) {
                    if (vnb.LIZIZ == 206) {
                        return vnb;
                    }
                    if (vnb.LIZIZ == 600) {
                        return vnb;
                    }
                    if (vnb.LIZIZ == 200) {
                        xb5.LIZIZ = System.currentTimeMillis() - currentTimeMillis;
                        LIZJ(xb5.LIZIZ, "fetchInputStream success! url: ".concat(downloadUrl));
                        try {
                            this.LIZIZ.LIZ(new C84426XBm(vnb.LIZJ), vnb.LIZLLL, xb7);
                            xb5.LJ = XBM.LJI(LJFF2);
                            xb5.LIZJ = System.currentTimeMillis() - currentTimeMillis;
                            LIZJ(xb5.LIZJ, i0.LJFF("writeToDisk success! url: ", downloadUrl));
                            XBB xbb = this.LIZJ;
                            if (xbb == null) {
                                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                xb5.LIZ = currentTimeMillis2;
                                LIZJ(currentTimeMillis2, "unnecessary to unzip, download success");
                                xb7.LIZ(xb5);
                                return vnb;
                            }
                            long currentTimeMillis3 = System.currentTimeMillis();
                            try {
                                boolean LIZ4 = xbb.LIZ(LJFF2, true);
                                C10820be.LJIILL(LJFF2);
                                xb5.LIZLLL = System.currentTimeMillis() - currentTimeMillis3;
                                xb5.LIZ = System.currentTimeMillis() - currentTimeMillis;
                                if (LIZ4) {
                                    LIZJ(xb5.LIZLLL, i0.LJFF("unzip success! url: ", downloadUrl));
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("download success! url: ");
                                    LIZ5.append(downloadUrl);
                                    LIZJ(xb5.LIZ, X1D.LIZIZ(LIZ5));
                                    xb7.LIZ(xb5);
                                } else {
                                    xb5.LJFF = new XB6("unzip file failed!");
                                    LIZJ(xb5.LIZLLL, i0.LJFF("unzip failed! url: ", downloadUrl));
                                    StringBuilder LIZ6 = X1D.LIZ();
                                    LIZ6.append("download failed! url: ");
                                    LIZ6.append(downloadUrl);
                                    LIZJ(xb5.LIZ, X1D.LIZIZ(LIZ6));
                                    xb7.LIZ(xb5);
                                    vnb.LIZLLL = -1L;
                                }
                                return vnb;
                            } catch (Exception e) {
                                if (!(e instanceof XB2) && !(e instanceof XB1) && !(e instanceof C10850bh) && !(e instanceof XB6)) {
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append(C65352Pkq.LIZ(e.getClass()).LIZLLL());
                                    LIZ7.append(':');
                                    LIZ7.append(e.getMessage());
                                    throw new XB6(X1D.LIZIZ(LIZ7));
                                }
                                throw e;
                            }
                        } catch (Exception e2) {
                            if (!(e2 instanceof XB2) && !(e2 instanceof XB1) && !(e2 instanceof C10850bh)) {
                                StringBuilder LIZ8 = X1D.LIZ();
                                LIZ8.append(C65352Pkq.LIZ(e2.getClass()).LIZLLL());
                                LIZ8.append(':');
                                LIZ8.append(e2.getMessage());
                                throw new C10850bh(X1D.LIZIZ(LIZ8));
                            }
                            throw e2;
                        }
                    }
                }
            } catch (Exception e3) {
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append(C65352Pkq.LIZ(e3.getClass()).LIZLLL());
                LIZ9.append(':');
                LIZ9.append(e3.getMessage());
                xb5.LJFF = new C84434XBu(LiveChatShowDelayForHotLiveSetting.DEFAULT, X1D.LIZIZ(LIZ9));
                vnb = null;
            }
            xb5.LIZ = System.currentTimeMillis() - currentTimeMillis;
            if (vnb != null) {
                int i = vnb.LIZIZ;
                String str3 = vnb.LJ;
                if (str3 == null) {
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append("status code is ");
                    LIZ10.append(vnb.LIZIZ);
                    str3 = X1D.LIZIZ(LIZ10);
                }
                xb5.LJFF = new C84434XBu(i, str3);
            }
            LIZJ(xb5.LIZ, "fetchFromNetwork failed! url: ".concat(downloadUrl));
            xb7.LIZ(xb5);
            if (vnb != null) {
                return vnb;
            }
            return new VNB(-1, new C78855Ux9());
        }
        o.LJIIZILJ();
        throw null;
    }
}
