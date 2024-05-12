package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.i0;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class IY8 implements IY4 {
    public final InterfaceC46732IVs LIZIZ;

    @Override // X.IY4
    public final boolean LIZ() {
        return false;
    }

    @Override // X.IY4
    public final String getName() {
        return "VideoCacheProxyUrlHook";
    }

    @Override // X.IY4
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    public IY8(InterfaceC46732IVs interfaceC46732IVs) {
        this.LIZIZ = interfaceC46732IVs;
    }

    @Override // X.IY4
    public final IY0 LIZIZ(IY5 iy5) {
        SimVideoUrlModel simVideoUrlModel;
        String sourceId;
        IYI iyi = iy5.LIZJ;
        IYA iya = iyi.LIZ;
        if (iya == null) {
            simVideoUrlModel = null;
        } else {
            simVideoUrlModel = new SimVideoUrlModel();
            simVideoUrlModel.setSourceId(String.valueOf(iya.getSubId()));
            if (iya.getUrl() != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iya.getUrl());
                simVideoUrlModel.setUrlList(arrayList);
            }
            if (iya.getUri() != null) {
                simVideoUrlModel.setUri(iya.getUri());
            }
        }
        String[] strArr = iyi.LIZJ;
        int i = 0;
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(strArr[i2]);
                String str = strArr[i2];
                if (simVideoUrlModel == null) {
                    sourceId = "";
                } else {
                    sourceId = simVideoUrlModel.getSourceId();
                }
                LIZ.append(LIZLLL(str, sourceId));
                strArr[i2] = X1D.LIZIZ(LIZ);
            }
        }
        String proxyUrl = this.LIZIZ.proxyUrl(simVideoUrlModel, iyi.LIZIZ, strArr);
        if (C1DG.LIZ().getConfig().getAppConfig().isDebug()) {
            InterfaceC46732IVs LIZ2 = C47242IgQ.LIZ();
            if (LIZ2 != null) {
                i = LIZ2.LIZLLL(simVideoUrlModel);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("VideoCacheProxyUrlHook: hitCacheSize:");
            LIZ3.append(i);
            LIZ3.append(" ,proxyUrl:");
            LIZ3.append(proxyUrl);
            X1D.LIZIZ(LIZ3);
        }
        return new IY0(proxyUrl, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
    
        if (r6 != null) goto L12;
     */
    @Override // X.IY4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.IY0 LIZJ(X.IY5 r9) {
        /*
            r8 = this;
            X.IYH r7 = r9.LIZIZ
            com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r4 = r7.LIZ
            java.lang.String[] r6 = r7.LIZJ
            r3 = 0
            if (r4 == 0) goto L41
            boolean r0 = r4.isUseMdlAndVideoCache()
            if (r0 != 0) goto L1c
            if (r6 == 0) goto L41
            int r0 = r6.length
            if (r0 <= 0) goto L1e
            X.IY0 r1 = new X.IY0
            r0 = r6[r3]
            r1.<init>(r0, r8)
            return r1
        L1c:
            if (r6 == 0) goto L41
        L1e:
            r5 = 0
        L1f:
            int r0 = r6.length
            if (r5 >= r0) goto L41
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            r0 = r6[r5]
            r2.append(r0)
            r1 = r6[r5]
            java.lang.String r0 = r4.getSourceId()
            java.lang.String r0 = LIZLLL(r1, r0)
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            r6[r5] = r0
            int r5 = r5 + 1
            goto L1f
        L41:
            X.IVs r1 = r8.LIZIZ
            java.lang.String r0 = r7.LIZIZ
            java.lang.String r2 = r1.proxyUrl(r4, r0, r6)
            X.IaY r0 = X.C1DG.LIZ()
            com.ss.android.ugc.aweme.simkit.ISimKitConfig r0 = r0.getConfig()
            com.ss.android.ugc.playerkit.simapicommon.IAppConfig r0 = r0.getAppConfig()
            boolean r0 = r0.isDebug()
            if (r0 == 0) goto L7c
            X.IVs r0 = X.C47242IgQ.LIZ()
            if (r0 == 0) goto L65
            int r3 = r0.LIZLLL(r4)
        L65:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "VideoCacheProxyUrlHook: hitCacheSize:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " ,proxyUrl:"
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
        L7c:
            X.IY0 r0 = new X.IY0
            r0.<init>(r2, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IY8.LIZJ(X.IY5):X.IY0");
    }

    public static String LIZLLL(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("?")) {
                return i0.LJFF("&source_id=", str2);
            }
            return i0.LJFF("?&source_id=", str2);
        }
        return "";
    }
}
