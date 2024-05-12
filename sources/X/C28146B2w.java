package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.LocationInfo;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import ujb.o;

/* renamed from: X.B2w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28146B2w implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final EnumC28063Azr LJLIL;
    public final Context LJLILLLLZI;
    public final ButtonAction LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<FetchInfo, C76800UCe> LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final InterfaceC88472Yns<String, C76800UCe> LJLJLJ;
    public final InterfaceC65784Pro<C76800UCe> LJLJLLL;
    public final String LJLL;

    public final boolean LIZ() {
        ButtonActionInfo buttonActionInfo;
        String schema;
        ButtonAction buttonAction = this.LJLJI;
        if (buttonAction != null && (buttonActionInfo = buttonAction.getButtonActionInfo()) != null && (schema = buttonActionInfo.getSchema()) != null && !o.LJJJJJL(schema)) {
            SmartRouter.buildRoute(this.LJLILLLLZI, C26867AgZ.LIZ(schema, C51029K0z.LJJIIZI(new OSZ("trackParams", C27739Aud.LJI(C51029K0z.LJJIIZI(new OSZ("previous_page", "order_submit"))))))).open();
            if (C76800UCe.LIZ != null) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN eventArgs) {
        FetchInfo fetchInfo;
        String eventName;
        FetchInfo fetchInfo2;
        LocationInfo locationInfo;
        String schema;
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns;
        kotlin.jvm.internal.o.LJIIIZ(eventArgs, "eventArgs");
        ButtonAction buttonAction = this.LJLJI;
        if (buttonAction != null) {
            HashMap<String, Object> LJII = C27739Aud.LJII(buttonAction.getDaInfo());
            Integer buttonActionType = buttonAction.getButtonActionType();
            if (buttonActionType == null || buttonActionType.intValue() != 0) {
                if (buttonActionType == null || buttonActionType.intValue() != 1) {
                    if (buttonActionType != null) {
                        if (buttonActionType.intValue() == 2) {
                            String str = this.LJLL;
                            if (str != null) {
                                if (this.LJLIL == EnumC28063Azr.FROM_OSP) {
                                    C27949Ay1.LJJIII("server", "retry", str, LJII, null, false, 104);
                                } else if (kotlin.jvm.internal.o.LJ(str, String.valueOf(10003008))) {
                                    C28143B2t.LIZ("ongoing_payment_notice", "yes");
                                }
                            }
                            InterfaceC88472Yns<FetchInfo, C76800UCe> interfaceC88472Yns2 = this.LJLJJL;
                            if (interfaceC88472Yns2 != null) {
                                ButtonActionInfo buttonActionInfo = buttonAction.getButtonActionInfo();
                                if (buttonActionInfo != null) {
                                    fetchInfo2 = buttonActionInfo.getFetchInfo();
                                } else {
                                    fetchInfo2 = null;
                                }
                                interfaceC88472Yns2.invoke(fetchInfo2);
                            }
                        } else if (buttonActionType.intValue() == 3) {
                            String str2 = this.LJLL;
                            if (str2 != null && this.LJLIL == EnumC28063Azr.FROM_OSP) {
                                C27949Ay1.LJJIII("server", "enter", str2, LJII, null, false, 104);
                            }
                            LIZ();
                        } else if (buttonActionType.intValue() == 4) {
                            String str3 = this.LJLL;
                            if (str3 != null && this.LJLIL == EnumC28063Azr.FROM_OSP) {
                                C27949Ay1.LJJIII("server", "enter", str3, LJII, null, false, 104);
                            }
                            if (LIZ()) {
                                this.LJLJJI.invoke();
                            } else {
                                C5S1 c5s1 = new C5S1(this.LJLILLLLZI);
                                c5s1.LIZJ(R.string.r_z);
                                c5s1.LJ();
                            }
                        } else if (buttonActionType.intValue() == 5) {
                            String str4 = this.LJLL;
                            if (str4 != null && this.LJLIL == EnumC28063Azr.FROM_OSP) {
                                C27949Ay1.LJJIII("server", "enter", str4, LJII, null, false, 104);
                            }
                            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
                            if (interfaceC65784Pro != null) {
                                interfaceC65784Pro.invoke();
                            }
                        } else if (buttonActionType.intValue() == 6) {
                            String str5 = this.LJLL;
                            if (str5 != null && this.LJLIL == EnumC28063Azr.FROM_OSP) {
                                C27949Ay1.LJJIII("server", "enter", str5, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
                            }
                            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJL;
                            if (interfaceC65784Pro2 != null) {
                                interfaceC65784Pro2.invoke();
                            }
                        } else if (buttonActionType.intValue() == 7) {
                            String str6 = this.LJLL;
                            if (str6 != null && this.LJLIL == EnumC28063Azr.FROM_DOUBLE_PAYMENT && kotlin.jvm.internal.o.LJ(str6, String.valueOf(10003007))) {
                                C28143B2t.LIZ("paid_successfully_notice", "yes");
                            }
                            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLJLLL;
                            if (interfaceC65784Pro3 != null) {
                                interfaceC65784Pro3.invoke();
                            }
                        } else if (buttonActionType.intValue() == 8) {
                            String str7 = this.LJLL;
                            if (str7 != null) {
                                if (kotlin.jvm.internal.o.LJ(str7, String.valueOf(98001001))) {
                                    C27949Ay1.LJJIII("first_order_buy_alone_error", "buy_alone", this.LJLL, LJII, null, false, 96);
                                } else {
                                    C27949Ay1.LJJIII("server", "quit", str7, LJII, null, false, 104);
                                }
                            }
                            ButtonActionInfo buttonActionInfo2 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo2 != null && (fetchInfo = buttonActionInfo2.getFetchInfo()) != null && (eventName = fetchInfo.getEventName()) != null) {
                                EventCenter.LJ().LIZ(eventName, "{}");
                            }
                            this.LJLJJI.invoke();
                        }
                    }
                    if (buttonActionType != null) {
                        if (buttonActionType.intValue() == 9) {
                            String str8 = this.LJLL;
                            if (str8 == null) {
                                str8 = "";
                            }
                            C27949Ay1.LJJIII("server", null, str8, LJII, null, false, 106);
                            ButtonActionInfo buttonActionInfo3 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo3 != null && (schema = buttonActionInfo3.getSchema()) != null && (interfaceC88472Yns = this.LJLJLJ) != null) {
                                interfaceC88472Yns.invoke(schema);
                            }
                        } else if (buttonActionType.intValue() == 10) {
                            String str9 = this.LJLL;
                            if (str9 == null) {
                                str9 = "";
                            }
                            C27949Ay1.LJJIII("server", null, str9, LJII, null, false, 106);
                            ButtonActionInfo buttonActionInfo4 = buttonAction.getButtonActionInfo();
                            if (buttonActionInfo4 != null && (locationInfo = buttonActionInfo4.getLocationInfo()) != null) {
                                EventCenter.LJ().LIZ("ec_osp_location_event", C27739Aud.LJI(locationInfo));
                            }
                        }
                    }
                } else {
                    String str10 = this.LJLL;
                    if (str10 != null) {
                        if (this.LJLIL == EnumC28063Azr.FROM_OSP) {
                            C27949Ay1.LJJIII("server", "quit", str10, LJII, null, false, 96);
                        } else if (kotlin.jvm.internal.o.LJ(str10, String.valueOf(10003008))) {
                            C28143B2t.LIZ("ongoing_payment_notice", "no");
                        }
                    }
                    this.LJLJJI.invoke();
                }
            } else {
                String str11 = this.LJLL;
                if (str11 != null && this.LJLIL == EnumC28063Azr.FROM_OSP) {
                    C27949Ay1.LJJIII("server", "stay", str11, LJII, null, false, 96);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public /* synthetic */ C28146B2w(EnumC28063Azr enumC28063Azr, Context context, ButtonAction buttonAction, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro2, String str) {
        this(enumC28063Azr, context, buttonAction, interfaceC65784Pro, interfaceC88472Yns, interfaceC65784Pro2, null, null, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C28146B2w(EnumC28063Azr fromType, Context context, ButtonAction buttonAction, InterfaceC65784Pro<C76800UCe> closePage, InterfaceC88472Yns<? super FetchInfo, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, String str) {
        kotlin.jvm.internal.o.LJIIIZ(fromType, "fromType");
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        kotlin.jvm.internal.o.LJIIIZ(closePage, "closePage");
        this.LJLIL = fromType;
        this.LJLILLLLZI = context;
        this.LJLJI = buttonAction;
        this.LJLJJI = closePage;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = interfaceC65784Pro2;
        this.LJLJLJ = interfaceC88472Yns2;
        this.LJLJLLL = interfaceC65784Pro3;
        this.LJLL = str;
    }
}
