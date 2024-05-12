package com.bytedance.bdturing.verify;

import X.C16880lQ;
import X.QNG;
import X.QNH;
import X.QNQ;
import X.QNR;
import X.QNS;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.bdturing.twiceverify.TwiceVerifyWebActivity;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes12.dex */
public class TwiceVerifyService implements QNG {
    @Override // X.QNG
    public boolean isProcess(int i) {
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return true;
            case 12:
            default:
                return false;
        }
    }

    @Override // X.QNG
    public boolean execute(QNH qnh, QNS qns) {
        if (QNQ.LIZ().LIZ == null) {
            return false;
        }
        QNQ LIZ = QNQ.LIZ();
        LIZ.LIZIZ = new QNR(qns);
        LIZ.LIZJ = qnh;
        Intent intent = new Intent();
        Activity activity = qnh.LIZ;
        intent.setClass(activity, TwiceVerifyWebActivity.class);
        C16880lQ.LIZIZ(activity, intent);
        return true;
    }
}
