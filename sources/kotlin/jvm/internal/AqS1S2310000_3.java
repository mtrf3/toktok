package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C51029K0z;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.X1D;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS1S2310000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public boolean z5;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S2310000_3 aqS1S2310000_3) {
        String str;
        JSONObject params;
        Integer valueOf;
        JSONObject params2;
        Integer num;
        String str2;
        String str3 = null;
        if (!aqS1S2310000_3.z5) {
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ(0, "success");
            PTYError pTYError = (PTYError) aqS1S2310000_3.l2;
            if (pTYError != null) {
                num = Integer.valueOf(pTYError.getCode());
            } else {
                num = null;
            }
            oszArr[1] = new OSZ(num, "errorCode");
            PTYError pTYError2 = (PTYError) aqS1S2310000_3.l2;
            if (pTYError2 != null) {
                str2 = pTYError2.getSummary();
            } else {
                str2 = null;
            }
            oszArr[2] = new OSZ(str2, "errorInfo");
            FMX.LJIILL("repost_guide_clientAI_task_result", oszArr);
        }
        String str4 = aqS1S2310000_3.s0;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssem) aqS1S2310000_3.l3)).getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str4, str) && ((UpvoteVideoAssem) aqS1S2310000_3.l3).r4(false)) {
            if (aqS1S2310000_3.z5) {
                try {
                    PTYTaskData pTYTaskData = (PTYTaskData) aqS1S2310000_3.l4;
                    if (pTYTaskData != null && (params2 = pTYTaskData.getParams()) != null) {
                        str3 = JSONObjectProtectorUtils.getString(params2, "trace_id");
                    }
                    PTYTaskData pTYTaskData2 = (PTYTaskData) aqS1S2310000_3.l4;
                    if (pTYTaskData2 != null && (params = pTYTaskData2.getParams()) != null && (valueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(params, "show_repost"))) != null) {
                        if (valueOf.intValue() == 1) {
                            if (str3 != null) {
                                UpvoteVideoAssem upvoteVideoAssem = (UpvoteVideoAssem) aqS1S2310000_3.l3;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(aqS1S2310000_3.s1);
                                LIZ.append(" result is 1");
                                upvoteVideoAssem.X4(X1D.LIZIZ(LIZ));
                                ((UpvoteVideoAssem) aqS1S2310000_3.l3).A4().LJLJI.LJIILL = str3;
                                ((UpvoteVideoAssem) aqS1S2310000_3.l3).A4().LJLJI.LJIILJJIL = true;
                                ((UpvoteVideoAssem) aqS1S2310000_3.l3).c5(aqS1S2310000_3.s1, str3, true);
                            }
                        } else if (valueOf.intValue() == 0) {
                            UpvoteVideoAssem upvoteVideoAssem2 = (UpvoteVideoAssem) aqS1S2310000_3.l3;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(aqS1S2310000_3.s1);
                            LIZ2.append("result is 0");
                            upvoteVideoAssem2.X4(X1D.LIZIZ(LIZ2));
                        }
                    }
                    UpvoteVideoAssem upvoteVideoAssem3 = (UpvoteVideoAssem) aqS1S2310000_3.l3;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(aqS1S2310000_3.s1);
                    LIZ3.append("result is -1 or else");
                    upvoteVideoAssem3.X4(X1D.LIZIZ(LIZ3));
                    ((UpvoteVideoAssem) aqS1S2310000_3.l3).P4(aqS1S2310000_3.s1);
                } catch (JSONException unused) {
                    UpvoteVideoAssem upvoteVideoAssem4 = (UpvoteVideoAssem) aqS1S2310000_3.l3;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(aqS1S2310000_3.s1);
                    LIZ4.append("result error");
                    upvoteVideoAssem4.X4(X1D.LIZIZ(LIZ4));
                    ((UpvoteVideoAssem) aqS1S2310000_3.l3).P4(aqS1S2310000_3.s1);
                }
            } else {
                UpvoteVideoAssem upvoteVideoAssem5 = (UpvoteVideoAssem) aqS1S2310000_3.l3;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(aqS1S2310000_3.s1);
                LIZ5.append("calculate error");
                upvoteVideoAssem5.X4(X1D.LIZIZ(LIZ5));
                ((UpvoteVideoAssem) aqS1S2310000_3.l3).P4(aqS1S2310000_3.s1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S2310000_3 aqS1S2310000_3) {
        String str;
        JSONObject params;
        Integer valueOf;
        JSONObject params2;
        Integer num;
        String str2;
        String str3 = null;
        if (!aqS1S2310000_3.z5) {
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ(0, "success");
            PTYError pTYError = (PTYError) aqS1S2310000_3.l2;
            if (pTYError != null) {
                num = Integer.valueOf(pTYError.getCode());
            } else {
                num = null;
            }
            oszArr[1] = new OSZ(num, "errorCode");
            PTYError pTYError2 = (PTYError) aqS1S2310000_3.l2;
            if (pTYError2 != null) {
                str2 = pTYError2.getSummary();
            } else {
                str2 = null;
            }
            oszArr[2] = new OSZ(str2, "errorInfo");
            FMX.LJIILL("repost_guide_clientAI_task_result", oszArr);
        }
        String str4 = aqS1S2310000_3.s0;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((UpvoteVideoAssemNew) aqS1S2310000_3.l3)).getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str4, str) && ((UpvoteVideoAssemNew) aqS1S2310000_3.l3).r4(false)) {
            if (aqS1S2310000_3.z5) {
                try {
                    PTYTaskData pTYTaskData = (PTYTaskData) aqS1S2310000_3.l4;
                    if (pTYTaskData != null && (params2 = pTYTaskData.getParams()) != null) {
                        str3 = JSONObjectProtectorUtils.getString(params2, "trace_id");
                    }
                    PTYTaskData pTYTaskData2 = (PTYTaskData) aqS1S2310000_3.l4;
                    if (pTYTaskData2 != null && (params = pTYTaskData2.getParams()) != null && (valueOf = Integer.valueOf(JSONObjectProtectorUtils.getInt(params, "show_repost"))) != null) {
                        if (valueOf.intValue() == 1) {
                            if (str3 != null) {
                                UpvoteVideoAssemNew upvoteVideoAssemNew = (UpvoteVideoAssemNew) aqS1S2310000_3.l3;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(aqS1S2310000_3.s1);
                                LIZ.append(" result is 1");
                                upvoteVideoAssemNew.X4(X1D.LIZIZ(LIZ));
                                ((UpvoteVideoAssemNew) aqS1S2310000_3.l3).z4().LJLJI.LJIIJ = str3;
                                ((UpvoteVideoAssemNew) aqS1S2310000_3.l3).z4().LJLJI.LJIIIZ = true;
                                ((UpvoteVideoAssemNew) aqS1S2310000_3.l3).c5(aqS1S2310000_3.s1, str3, true);
                            }
                        } else if (valueOf.intValue() == 0) {
                            UpvoteVideoAssemNew upvoteVideoAssemNew2 = (UpvoteVideoAssemNew) aqS1S2310000_3.l3;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(aqS1S2310000_3.s1);
                            LIZ2.append("result is 0");
                            upvoteVideoAssemNew2.X4(X1D.LIZIZ(LIZ2));
                        }
                    }
                    UpvoteVideoAssemNew upvoteVideoAssemNew3 = (UpvoteVideoAssemNew) aqS1S2310000_3.l3;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(aqS1S2310000_3.s1);
                    LIZ3.append("result is -1 or else");
                    upvoteVideoAssemNew3.X4(X1D.LIZIZ(LIZ3));
                    ((UpvoteVideoAssemNew) aqS1S2310000_3.l3).P4(aqS1S2310000_3.s1);
                } catch (JSONException unused) {
                    UpvoteVideoAssemNew upvoteVideoAssemNew4 = (UpvoteVideoAssemNew) aqS1S2310000_3.l3;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(aqS1S2310000_3.s1);
                    LIZ4.append("result error");
                    upvoteVideoAssemNew4.X4(X1D.LIZIZ(LIZ4));
                    ((UpvoteVideoAssemNew) aqS1S2310000_3.l3).P4(aqS1S2310000_3.s1);
                }
            } else {
                UpvoteVideoAssemNew upvoteVideoAssemNew5 = (UpvoteVideoAssemNew) aqS1S2310000_3.l3;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(aqS1S2310000_3.s1);
                LIZ5.append("calculate error");
                upvoteVideoAssemNew5.X4(X1D.LIZIZ(LIZ5));
                ((UpvoteVideoAssemNew) aqS1S2310000_3.l3).P4(aqS1S2310000_3.s1);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2310000_3(boolean z, PTYError pTYError, String str, UpvoteVideoAssem upvoteVideoAssem, PTYTaskData pTYTaskData, String str2, int i) {
        super(0);
        this.$t = i;
        this.z5 = z;
        this.l2 = pTYError;
        this.s0 = str;
        this.l3 = upvoteVideoAssem;
        this.l4 = pTYTaskData;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2310000_3(boolean z, PTYError pTYError, String str, UpvoteVideoAssemNew upvoteVideoAssemNew, PTYTaskData pTYTaskData, String str2, int i) {
        super(0);
        this.$t = i;
        this.z5 = z;
        this.l2 = pTYError;
        this.s0 = str;
        this.l3 = upvoteVideoAssemNew;
        this.l4 = pTYTaskData;
        this.s1 = str2;
    }
}
