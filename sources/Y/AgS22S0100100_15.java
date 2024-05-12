package Y;

import X.AbstractC40941G4z;
import X.C10I;
import X.C10K;
import X.C57419MgB;
import X.C62962OnO;
import X.C63005Oo5;
import X.C74216TAu;
import X.C76800UCe;
import X.C78596Usy;
import X.C86104Xqm;
import X.C86106Xqo;
import X.EnumC62974Ona;
import X.EnumC63002Oo2;
import X.HandlerC86501XxB;
import X.InterfaceC86091XqZ;
import X.InterfaceC86102Xqk;
import X.XVW;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeGateServiceImpl;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.AgeGateResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.BaseResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.DoBResponse;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AgS22S0100100_15 implements C10I {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS22S0100100_15 agS22S0100100_15, C10K c10k) {
        XVW xvw = (XVW) agS22S0100100_15.l0;
        long j = agS22S0100100_15.j1;
        xvw.getClass();
        if (c10k.LJIILJJIL()) {
            long LIZLLL = C74216TAu.LIZIZ.LIZLLL() - (System.currentTimeMillis() - j);
            if (LIZLLL > 0) {
                C10K.LJII(LIZLLL).LJIJI();
                C78596Usy.LJJJLIIL(xvw.LIZJ, true);
            }
        }
        return c10k;
    }

    public static final Object then$1(AgS22S0100100_15 agS22S0100100_15, C10K c10k) {
        PNSFeedbackModel LIZ;
        PNSBaseAgeGateViewModel this$0 = (PNSBaseAgeGateViewModel) agS22S0100100_15.l0;
        long j = agS22S0100100_15.j1;
        o.LJIIIZ(this$0, "this$0");
        this$0.LJLLLL.postValue(Boolean.FALSE);
        DoBResponse doBResponse = (DoBResponse) c10k.LJIIJJI();
        String str = "";
        if (c10k.LJIILIIL() && doBResponse != null) {
            InterfaceC86102Xqk interfaceC86102Xqk = PNSAgeGateServiceImpl.LIZJ;
            if (interfaceC86102Xqk != null) {
                interfaceC86102Xqk.LIZ(doBResponse.getStatus_code(), System.currentTimeMillis() - j, "/tiktok/v1/calculate/age/", true);
            }
            if (doBResponse.getStatus_code() != 0) {
                this$0.iv0(doBResponse.getStatus_code(), doBResponse.getStatus_msg());
            } else if (this$0.LLFFF && !this$0.LJLJJL) {
                this$0.LJZ.postValue(Boolean.TRUE);
                InterfaceC86091XqZ interfaceC86091XqZ = this$0.LJLJI;
                if (interfaceC86091XqZ == null) {
                    LIZ = null;
                } else {
                    String value = this$0.LJLLLLLL.getValue();
                    if (value != null) {
                        str = value;
                    }
                    LIZ = interfaceC86091XqZ.LIZ(str);
                }
                this$0.jv0(LIZ, new AqS165S0100000_15(this$0, 902));
            } else {
                this$0.jv0(this$0.nv0(doBResponse), new AqS165S0100000_15(this$0, 903));
            }
        } else {
            InterfaceC86102Xqk interfaceC86102Xqk2 = PNSAgeGateServiceImpl.LIZJ;
            if (interfaceC86102Xqk2 != null) {
                interfaceC86102Xqk2.LIZ(-1, System.currentTimeMillis() - j, "/tiktok/v1/calculate/age/", false);
            }
            this$0.iv0(-1, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS22S0100100_15 agS22S0100100_15, C10K c10k) {
        int intValue;
        int intValue2;
        PNSBaseAgeGateViewModel this$0 = (PNSBaseAgeGateViewModel) agS22S0100100_15.l0;
        long j = agS22S0100100_15.j1;
        o.LJIIIZ(this$0, "this$0");
        this$0.LJLLLL.postValue(Boolean.FALSE);
        PNSFeedbackModel pNSFeedbackModel = null;
        if (c10k.LJIILIIL() && c10k.LJIIJJI() != null) {
            InterfaceC86102Xqk interfaceC86102Xqk = PNSAgeGateServiceImpl.LIZJ;
            if (interfaceC86102Xqk != null) {
                interfaceC86102Xqk.LIZ(((BaseResponse) c10k.LJIIJJI()).getStatus_code(), System.currentTimeMillis() - j, "/aweme/v3/verification/age/", true);
            }
            if (((BaseResponse) c10k.LJIIJJI()).getStatus_code() != 0) {
                this$0.lv0(null, 0, ((BaseResponse) c10k.LJIIJJI()).getStatus_code());
                if (((BaseResponse) c10k.LJIIJJI()).getAgeGateFeedback() != null) {
                    this$0.jv0(((BaseResponse) c10k.LJIIJJI()).getAgeGateFeedback(), C86106Xqo.LJLIL);
                } else {
                    this$0.iv0(((BaseResponse) c10k.LJIIJJI()).getStatus_code(), ((BaseResponse) c10k.LJIIJJI()).getStatus_msg());
                }
            } else {
                boolean is_prompt = ((AgeGateResponse) c10k.LJIIJJI()).is_prompt();
                C63005Oo5 c63005Oo5 = EnumC63002Oo2.Companion;
                Integer ageGatePostAction = ((AgeGateResponse) c10k.LJIIJJI()).getAgeGatePostAction();
                if (ageGatePostAction == null) {
                    intValue = EnumC63002Oo2.PASS.getValue();
                } else {
                    intValue = ageGatePostAction.intValue();
                }
                Integer registerAgeGatePostAction = ((AgeGateResponse) c10k.LJIIJJI()).getRegisterAgeGatePostAction();
                if (registerAgeGatePostAction == null) {
                    intValue2 = EnumC63002Oo2.PASS.getValue();
                } else {
                    intValue2 = registerAgeGatePostAction.intValue();
                }
                int max = Math.max(intValue, intValue2);
                c63005Oo5.getClass();
                EnumC63002Oo2 enumC63002Oo2 = EnumC63002Oo2.MAP.get(Integer.valueOf(max));
                if (enumC63002Oo2 == null) {
                    enumC63002Oo2 = EnumC63002Oo2.PASS;
                }
                C62962OnO c62962OnO = new C62962OnO(enumC63002Oo2, this$0.LJZI, is_prompt, ((BaseResponse) c10k.LJIIJJI()).getStatus_msg(), ((AgeGateResponse) c10k.LJIIJJI()).isMixedAge());
                PNSFeedbackModel ageGateFeedback = ((BaseResponse) c10k.LJIIJJI()).getAgeGateFeedback();
                if (ageGateFeedback == null) {
                    InterfaceC86091XqZ interfaceC86091XqZ = this$0.LJLJI;
                    if (interfaceC86091XqZ != null) {
                        pNSFeedbackModel = interfaceC86091XqZ.LJFF(c62962OnO, this$0.LJLJJI);
                    }
                } else {
                    pNSFeedbackModel = ageGateFeedback;
                }
                this$0.jv0(pNSFeedbackModel, new AqS157S0200000_10(this$0, c62962OnO, 47));
            }
        } else {
            InterfaceC86102Xqk interfaceC86102Xqk2 = PNSAgeGateServiceImpl.LIZJ;
            if (interfaceC86102Xqk2 != null) {
                interfaceC86102Xqk2.LIZ(-1, System.currentTimeMillis() - j, "/aweme/v3/verification/age/", false);
            }
            AbstractC40941G4z abstractC40941G4z = this$0.LJLILLLLZI;
            if (abstractC40941G4z != null) {
                abstractC40941G4z.onError(new PNSErrorModel(-1, c10k.LJIIJ().getMessage()));
            }
            this$0.lv0(null, 0, -1);
            this$0.iv0(-1, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS22S0100100_15 agS22S0100100_15, C10K c10k) {
        PNSFeedbackModel ageGateFeedback;
        PNSBaseAgeGateViewModel this$0 = (PNSBaseAgeGateViewModel) agS22S0100100_15.l0;
        long j = agS22S0100100_15.j1;
        o.LJIIIZ(this$0, "this$0");
        this$0.LJLLLL.postValue(Boolean.FALSE);
        BaseResponse baseResponse = (BaseResponse) c10k.LJIIJJI();
        if (c10k.LJIILIIL() && baseResponse != null) {
            PNSFeedbackModel ageGateFeedback2 = baseResponse.getAgeGateFeedback();
            if ((ageGateFeedback2 == null || ageGateFeedback2.getDialogModel() == null) && ((ageGateFeedback = baseResponse.getAgeGateFeedback()) == null || ageGateFeedback.getErrorModel() == null)) {
                if (baseResponse.getStatus_code() != 0) {
                    this$0.iv0(baseResponse.getStatus_code(), baseResponse.getStatus_msg());
                }
                if (this$0.LJLL != EnumC62974Ona.BLOCKING.getValue()) {
                    this$0.ov0();
                }
            } else {
                PNSFeedbackModel ageGateFeedback3 = baseResponse.getAgeGateFeedback();
                if (ageGateFeedback3 != null && ageGateFeedback3.getErrorModel() != null) {
                    this$0.jv0(baseResponse.getAgeGateFeedback(), C86104Xqm.LJLIL);
                }
                PNSFeedbackModel ageGateFeedback4 = baseResponse.getAgeGateFeedback();
                if (ageGateFeedback4 != null && ageGateFeedback4.getDialogModel() != null) {
                    this$0.jv0(baseResponse.getAgeGateFeedback(), new AqS165S0100000_15(this$0, 904));
                }
                return C76800UCe.LIZ;
            }
        } else {
            InterfaceC86102Xqk interfaceC86102Xqk = PNSAgeGateServiceImpl.LIZJ;
            if (interfaceC86102Xqk != null) {
                interfaceC86102Xqk.LIZ(-1, System.currentTimeMillis() - j, "/tiktok/age/confirmation/get/v2/", false);
            }
            this$0.iv0(-1, "");
        }
        if (this$0.LJLL != EnumC62974Ona.BLOCKING.getValue()) {
            this$0.ov0();
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS22S0100100_15 agS22S0100100_15, C10K c10k) {
        ((InnerPushMessage) agS22S0100100_15.l0).getTracker().LJIJI = agS22S0100100_15.j1;
        HandlerC86501XxB handlerC86501XxB = HandlerC86501XxB.LIZ;
        InnerPushMessage innerPushMessage = (InnerPushMessage) agS22S0100100_15.l0;
        handlerC86501XxB.getClass();
        return C57419MgB.LJIIIZ(new AqS165S0100000_15(innerPushMessage, 915));
    }

    public AgS22S0100100_15(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
