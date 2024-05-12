package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class IY7 implements IY4 {
    public final InterfaceC46732IVs LIZIZ;
    public final IW2 LIZJ;

    @Override // X.IY4
    public final boolean LIZ() {
        return false;
    }

    @Override // X.IY4
    public final String getName() {
        return "EngineCacheUrlHook";
    }

    @Override // X.IY4
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.IY4
    public final IY0 LIZIZ(IY5 iy5) {
        String sourceId;
        String proxyUrl;
        int i;
        IYI iyi = iy5.LIZJ;
        IYA iya = iyi.LIZ;
        SimVideoUrlModel simVideoUrlModel = null;
        if (iya != null) {
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
        IW2 iw2 = this.LIZJ;
        if (iw2 == null || (proxyUrl = iw2.LIZ(simVideoUrlModel)) == null || TextUtils.isEmpty(proxyUrl)) {
            InterfaceC46732IVs interfaceC46732IVs = this.LIZIZ;
            if (simVideoUrlModel == null) {
                sourceId = "";
            } else {
                sourceId = simVideoUrlModel.getSourceId();
            }
            proxyUrl = interfaceC46732IVs.proxyUrl(simVideoUrlModel, sourceId, iyi.LIZJ);
        }
        if (C1DG.LIZ().getConfig().getAppConfig().isDebug()) {
            InterfaceC46732IVs LIZ = C47242IgQ.LIZ();
            if (LIZ != null) {
                i = LIZ.LIZLLL(simVideoUrlModel);
            } else {
                i = 0;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EngineCacheUrlHook: hitCacheSize:");
            LIZ2.append(i);
            LIZ2.append(" ,proxyUrl:");
            LIZ2.append(proxyUrl);
            X1D.LIZIZ(LIZ2);
        }
        return new IY0(proxyUrl, this);
    }

    @Override // X.IY4
    public final IY0 LIZJ(IY5 iy5) {
        String bitRatedRatioUri;
        String proxyUrl;
        String[] strArr;
        IYH iyh = iy5.LIZIZ;
        SimVideoUrlModel simVideoUrlModel = iyh.LIZ;
        if (simVideoUrlModel == null) {
            return new IY0("", this);
        }
        int i = 0;
        if (!simVideoUrlModel.isUseMdlAndVideoCache() && (strArr = iyh.LIZJ) != null && strArr.length > 0) {
            return new IY0(strArr[0], this);
        }
        IW2 iw2 = this.LIZJ;
        if (iw2 == null || (proxyUrl = iw2.LIZ(simVideoUrlModel)) == null || TextUtils.isEmpty(proxyUrl)) {
            if (((Boolean) IZ8.LJLI.getValue()).booleanValue()) {
                bitRatedRatioUri = iyh.LIZIZ;
            } else {
                bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
            }
            proxyUrl = this.LIZIZ.proxyUrl(simVideoUrlModel, bitRatedRatioUri, iyh.LIZJ);
        }
        if (C1DG.LIZ().getConfig().getAppConfig().isDebug()) {
            InterfaceC46732IVs LIZ = C47242IgQ.LIZ();
            if (LIZ != null) {
                i = LIZ.LIZLLL(simVideoUrlModel);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EngineCacheUrlHook: hitCacheSize:");
            LIZ2.append(i);
            LIZ2.append(" ,proxyUrl:");
            LIZ2.append(proxyUrl);
            X1D.LIZIZ(LIZ2);
        }
        return new IY0(proxyUrl, this);
    }

    public IY7(InterfaceC46732IVs interfaceC46732IVs, IW2 iw2) {
        this.LIZIZ = interfaceC46732IVs;
        this.LIZJ = iw2;
    }
}
