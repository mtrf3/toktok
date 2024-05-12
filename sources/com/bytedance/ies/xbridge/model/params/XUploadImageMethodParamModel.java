package com.bytedance.ies.xbridge.model.params;

import X.AbstractC37843EtD;
import X.InterfaceC78280Uns;
import X.OIW;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class XUploadImageMethodParamModel extends AbstractC37843EtD {
    public static final OIW Companion = new OIW();
    public final String filePath;
    public InterfaceC78280Uns header;
    public InterfaceC78280Uns params;
    public final String url;

    public final String getFilePath() {
        return this.filePath;
    }

    public final InterfaceC78280Uns getHeader() {
        return this.header;
    }

    public final InterfaceC78280Uns getParams() {
        return this.params;
    }

    public final String getUrl() {
        return this.url;
    }

    public static final XUploadImageMethodParamModel convert(InterfaceC78280Uns source) {
        Companion.getClass();
        o.LJIIJ(source, "source");
        String LJJIJIL = u.LJJIJIL(source, "url", "");
        if (LJJIJIL.length() != 0) {
            String LJJIJIL2 = u.LJJIJIL(source, "filePath", "");
            if (LJJIJIL2.length() != 0) {
                InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(source, "params");
                InterfaceC78280Uns LJJIJIIJIL2 = u.LJJIJIIJIL(source, "header");
                XUploadImageMethodParamModel xUploadImageMethodParamModel = new XUploadImageMethodParamModel(LJJIJIL, LJJIJIL2);
                if (LJJIJIIJIL != null) {
                    xUploadImageMethodParamModel.setParams(LJJIJIIJIL);
                }
                if (LJJIJIIJIL2 == null) {
                    return xUploadImageMethodParamModel;
                }
                xUploadImageMethodParamModel.setHeader(LJJIJIIJIL2);
                return xUploadImageMethodParamModel;
            }
        }
        return null;
    }

    public final void setHeader(InterfaceC78280Uns interfaceC78280Uns) {
        this.header = interfaceC78280Uns;
    }

    public final void setParams(InterfaceC78280Uns interfaceC78280Uns) {
        this.params = interfaceC78280Uns;
    }

    public XUploadImageMethodParamModel(String url, String filePath) {
        o.LJIIJ(url, "url");
        o.LJIIJ(filePath, "filePath");
        this.url = url;
        this.filePath = filePath;
    }
}
