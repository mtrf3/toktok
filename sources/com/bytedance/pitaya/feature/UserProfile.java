package com.bytedance.pitaya.feature;

import X.C38485F8n;
import X.C47261Igj;
import X.C62848OlY;
import X.C93329aP7;
import X.EnumC93298aOc;
import X.PVC;
import X.X1D;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYErrorCode;
import com.bytedance.pitaya.jniwrapper.CallCallbackInNative;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.network.NetworkCommon;
import com.bytedance.pitaya.thirdcomponent.encrypt.ClientEncrypt;
import com.bytedance.pitaya.thirdcomponent.stddelegate.PitayaInnerServiceProvider;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class UserProfile implements ReflectionCall {
    public final int networkErrCode = PTYErrorCode.NETWORK_ERROR.getCode();
    public final int fileErrCode = PTYErrorCode.FILE_ERROR.getCode();

    public final int getFileErrCode() {
        return this.fileErrCode;
    }

    public final int getNetworkErrCode() {
        return this.networkErrCode;
    }

    public final void parse(String filePath, long j) {
        byte[] decrypt;
        o.LJIIJ(filePath, "filePath");
        try {
            byte[] LLLF = C38485F8n.LLLF(new File(filePath));
            ClientEncrypt clientEncrypt = (ClientEncrypt) PitayaInnerServiceProvider.getService(ClientEncrypt.class);
            if (clientEncrypt == null || (decrypt = clientEncrypt.decrypt(LLLF)) == null) {
                int i = this.fileErrCode;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("decrypt failed, origin encrypt byte array size is ");
                LIZ.append(LLLF.length);
                CallCallbackInNative.LIZ.LIZ(j, false, getError$default(this, i, X1D.LIZIZ(LIZ), null, 4, null), null);
            } else {
                CallCallbackInNative.LIZ.LIZ(j, true, null, new String(C62848OlY.LJFF(new GZIPInputStream(new ByteArrayInputStream(decrypt))), PVC.LIZ));
            }
        } catch (Throwable th) {
            List<String> LJJIJ = C47261Igj.LJJIJ(th.toString());
            if (th instanceof UnsatisfiedLinkError) {
                CallCallbackInNative.LIZ.LIZ(j, false, getError(this.fileErrCode, "bdsword.so load failed", LJJIJ), null);
            } else {
                CallCallbackInNative.LIZ.LIZ(j, false, getError(this.fileErrCode, "fail to read user profile from disk", LJJIJ), null);
            }
            PitayaLogger.LJ(th, null, 6);
        }
    }

    public final PTYError getError(int i, String msg, List<String> list) {
        o.LJIIJ(msg, "msg");
        return new PTYError("userprofile", i, i, msg, list);
    }

    public final void request(String url, String params, String filePath, long j) {
        o.LJIIJ(url, "url");
        o.LJIIJ(params, "params");
        o.LJIIJ(filePath, "filePath");
        C93329aP7 c93329aP7 = new C93329aP7(this, j, filePath);
        NetworkCommon networkCommon = NetworkCommon.INSTANCE;
        byte[] bytes = params.getBytes(PVC.LIZ);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        networkCommon.post(url, bytes, c93329aP7, EnumC93298aOc.JSON);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PTYError getError$default(UserProfile userProfile, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        return userProfile.getError(i, str, list);
    }
}
