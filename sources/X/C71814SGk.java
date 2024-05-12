package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.ss.bduploader.BDImageXUploader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.SGk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71814SGk extends AbstractC71818SGo {
    public BDImageXUploader LJLJJL;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final void release() {
        BDImageXUploader bDImageXUploader = this.LJLJJL;
        if (bDImageXUploader != null) {
            bDImageXUploader.close();
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String LIZIZ;
        ArrayList arrayList;
        IHostContextDepend iHostContextDepend;
        Number socketNum;
        Number sliceSize;
        Activity LIZLLL;
        InterfaceC71815SGl interfaceC71815SGl = (InterfaceC71815SGl) xBaseParamModel;
        o.LJIIJ(type, "type");
        InterfaceC71817SGn uploadConfig = interfaceC71815SGl.getUploadConfig();
        if (uploadConfig == null || (LIZIZ = uploadConfig.getTraceId()) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bridge_");
            LIZ.append(UUID.randomUUID().toString());
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
            List<String> uriPaths = interfaceC71815SGl.getFilePaths();
            o.LJIIJ(uriPaths, "uriPaths");
            arrayList = new ArrayList();
            Iterator<String> it = uriPaths.iterator();
            while (it.hasNext()) {
                String LIZ2 = C32202CkQ.LIZ(LIZLLL, it.next());
                if (LIZ2 != null) {
                    arrayList.add(LIZ2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.size() == 0) {
            C31626Cb8.LIZ(c37356ElM, 0, "get filePaths failed, please check it", 4);
            return;
        }
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        int size = arrayList.size();
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            bDImageXUploader.setFilePath(size, (String[]) array);
            bDImageXUploader.setUploadDomain(interfaceC71815SGl.getAuthConfig().getHostName());
            bDImageXUploader.setTopAccessKey(interfaceC71815SGl.getAuthConfig().getAccessKeyId());
            bDImageXUploader.setTopSecretKey(interfaceC71815SGl.getAuthConfig().getSecretAccessKey());
            bDImageXUploader.setTopSessionToken(interfaceC71815SGl.getAuthConfig().getSessionToken());
            bDImageXUploader.setServiceID(interfaceC71815SGl.getAuthConfig().getServiceId());
            InterfaceC71817SGn uploadConfig2 = interfaceC71815SGl.getUploadConfig();
            if (uploadConfig2 != null && uploadConfig2.getSliceSize() != null) {
                InterfaceC71817SGn uploadConfig3 = interfaceC71815SGl.getUploadConfig();
                if (uploadConfig3 != null && (sliceSize = uploadConfig3.getSliceSize()) != null) {
                    bDImageXUploader.setSliceSize(sliceSize.intValue());
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                bDImageXUploader.setSliceSize(524288);
            }
            InterfaceC71817SGn uploadConfig4 = interfaceC71815SGl.getUploadConfig();
            if (uploadConfig4 != null && uploadConfig4.getSocketNum() != null) {
                InterfaceC71817SGn uploadConfig5 = interfaceC71815SGl.getUploadConfig();
                if (uploadConfig5 != null && (socketNum = uploadConfig5.getSocketNum()) != null) {
                    bDImageXUploader.setSocketNum(socketNum.intValue());
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            } else {
                bDImageXUploader.setSocketNum(2);
            }
            bDImageXUploader.setSliceRetryCount(3);
            bDImageXUploader.setFileRetryCount(3);
            bDImageXUploader.setTraceId(LIZIZ);
            C86289Xtl c86289Xtl = C86289Xtl.LJFF;
            if (c86289Xtl != null && (iHostContextDepend = c86289Xtl.LIZLLL) != null) {
                bDImageXUploader.setOpenBoe(iHostContextDepend.isBoeEnable());
            }
            this.LJLJJL = bDImageXUploader;
            bDImageXUploader.setListener(new C71820SGq(c37356ElM, bDImageXUploader, LIZIZ, this.LJLIL));
            BDImageXUploader bDImageXUploader2 = this.LJLJJL;
            if (bDImageXUploader2 == null) {
                return;
            }
            bDImageXUploader2.start();
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
