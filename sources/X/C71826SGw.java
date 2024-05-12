package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.ss.bduploader.BDVideoUploader;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.SGw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71826SGw extends AbstractC71828SGy {
    public BDVideoUploader LJLJJL;

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final void release() {
        BDVideoUploader bDVideoUploader = this.LJLJJL;
        if (bDVideoUploader != null) {
            bDVideoUploader.close();
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String LIZIZ;
        Activity LIZLLL;
        String LIZ;
        IHostContextDepend iHostContextDepend;
        Number socketNum;
        Number sliceSize;
        SH0 sh0 = (SH0) xBaseParamModel;
        o.LJIIJ(type, "type");
        InterfaceC71825SGv uploadConfig = sh0.getUploadConfig();
        if (uploadConfig == null || (LIZIZ = uploadConfig.getTraceId()) == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("bridge_");
            LIZ2.append(UUID.randomUUID().toString());
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz == null || (LIZLLL = interfaceC38263Ezz.LIZLLL()) == null || (LIZ = C32202CkQ.LIZ(LIZLLL, sh0.getFilePath())) == null) {
            C31626Cb8.LIZ(c37356ElM, 0, "get filePaths failed, please check it", 4);
            return;
        }
        BDVideoUploader bDVideoUploader = new BDVideoUploader();
        bDVideoUploader.setPathName(LIZ);
        bDVideoUploader.setUploadDomain(sh0.getAuthConfig().getHostName());
        bDVideoUploader.setTopAccessKey(sh0.getAuthConfig().getAccessKeyId());
        bDVideoUploader.setTopSecretKey(sh0.getAuthConfig().getSecretAccessKey());
        bDVideoUploader.setTopSessionToken(sh0.getAuthConfig().getSessionToken());
        bDVideoUploader.setSpaceName(sh0.getAuthConfig().getSpaceName());
        InterfaceC71825SGv uploadConfig2 = sh0.getUploadConfig();
        if (uploadConfig2 != null && uploadConfig2.getSliceSize() != null) {
            InterfaceC71825SGv uploadConfig3 = sh0.getUploadConfig();
            if (uploadConfig3 != null && (sliceSize = uploadConfig3.getSliceSize()) != null) {
                bDVideoUploader.setSliceSize(sliceSize.intValue());
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            bDVideoUploader.setSliceSize(524288);
        }
        InterfaceC71825SGv uploadConfig4 = sh0.getUploadConfig();
        if (uploadConfig4 != null && uploadConfig4.getSocketNum() != null) {
            InterfaceC71825SGv uploadConfig5 = sh0.getUploadConfig();
            if (uploadConfig5 != null && (socketNum = uploadConfig5.getSocketNum()) != null) {
                bDVideoUploader.setSocketNum(socketNum.intValue());
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            bDVideoUploader.setSocketNum(2);
        }
        bDVideoUploader.setSliceReTryCount(3);
        bDVideoUploader.setFileRetryCount(3);
        bDVideoUploader.setTraceId(LIZIZ);
        C86289Xtl c86289Xtl = C86289Xtl.LJFF;
        if (c86289Xtl != null && (iHostContextDepend = c86289Xtl.LIZLLL) != null) {
            bDVideoUploader.setOpenBoe(iHostContextDepend.isBoeEnable());
        }
        this.LJLJJL = bDVideoUploader;
        bDVideoUploader.setListener(new C71827SGx(c37356ElM, bDVideoUploader, LIZIZ, this.LJLIL));
        BDVideoUploader bDVideoUploader2 = this.LJLJJL;
        if (bDVideoUploader2 == null) {
            return;
        }
        bDVideoUploader2.start();
    }
}
