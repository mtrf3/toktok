package com.mammon.audiosdk.structures;

import X.KMP;
import X.X1D;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import defpackage.i0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class SAMICoreServerContextCreateParameter {
    public String appKey;
    public long timeStamp;
    public String token;
    public SAMICoreTokenType tokenType;
    public String url;

    public int getTokenType() {
        SAMICoreTokenType sAMICoreTokenType = this.tokenType;
        if (sAMICoreTokenType != null) {
            return sAMICoreTokenType.getValue();
        }
        System.out.println("tokenType is null, return 0 as fallback!");
        return 0;
    }

    public void syncRequest(SAMICoreResponseSyncListener sAMICoreResponseSyncListener) {
        sAMICoreResponseSyncListener.onStart();
        SAMICore sAMICore = new SAMICore();
        SAMICoreRequestConfig createRequestParam = SAMICoreRequestConfigManager.getInstance().createRequestParam(this);
        if (createRequestParam == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Not support!");
            LIZ.append(getClass());
            String LIZIZ = X1D.LIZIZ(LIZ);
            System.out.println(LIZIZ);
            sAMICoreResponseSyncListener.onFinished(createResponse(-1000, LIZIZ, null));
            return;
        }
        int SAMICoreCreateHandleByIdentify = sAMICore.SAMICoreCreateHandleByIdentify(createRequestParam.handleByIdentify, this);
        if (SAMICoreCreateHandleByIdentify != 0) {
            String LJ = KMP.LJ("Create speechToSong handle failed, ret ", SAMICoreCreateHandleByIdentify);
            System.out.println(LJ);
            sAMICoreResponseSyncListener.onFinished(createResponse(SAMICoreCreateHandleByIdentify, LJ, null));
            return;
        }
        SAMICoreBlock sAMICoreBlock = new SAMICoreBlock();
        sAMICoreBlock.dataType = createRequestParam.sAMICorePropertyDataType;
        sAMICoreBlock.numberAudioData = 1;
        sAMICoreBlock.audioData = r2;
        String[] strArr = {new String()};
        int SAMICoreProcess = sAMICore.SAMICoreProcess(null, sAMICoreBlock);
        if (SAMICoreProcess == 0) {
            String arrays = Arrays.toString(sAMICoreBlock.audioData);
            String LJFF = i0.LJFF("[mammon]SpeechToSong result: ", arrays);
            System.out.println(LJFF);
            sAMICoreResponseSyncListener.onFinished(createResponse(SAMICoreProcess, LJFF, arrays));
            sAMICore.SAMICoreDestroyHandle();
            return;
        }
        String LJ2 = KMP.LJ("Process speechToSong failed, ret ", SAMICoreProcess);
        System.out.println(LJ2);
        sAMICoreResponseSyncListener.onFinished(createResponse(SAMICoreProcess, LJ2, null));
        sAMICore.SAMICoreDestroyHandle();
    }

    private SAMICoreResponse createResponse(int i, String str, String str2) {
        SAMICoreResponse sAMICoreResponse = new SAMICoreResponse();
        sAMICoreResponse.errorCode = i;
        sAMICoreResponse.errorMsg = str;
        sAMICoreResponse.data = str2;
        return sAMICoreResponse;
    }
}
