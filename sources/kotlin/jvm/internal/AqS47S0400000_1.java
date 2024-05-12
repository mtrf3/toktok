package kotlin.jvm.internal;

import X.ARI;
import X.ASQ;
import X.ASX;
import X.AbstractC62625Ohx;
import X.AbstractC65781Prl;
import X.C108044Lw;
import X.C110794Wl;
import X.C1HQ;
import X.C3C5;
import X.C61295O3v;
import X.C61325O4z;
import X.C61878OQg;
import X.C62387Oe7;
import X.C71082qe;
import X.C76800UCe;
import X.C772831o;
import X.C77800Ug8;
import X.C84654XKg;
import X.C85323Wm;
import X.C88545Yp3;
import X.C90253gT;
import X.InterfaceC24580xq;
import X.InterfaceC24760y8;
import X.InterfaceC35811ar;
import X.InterfaceC62225ObV;
import X.InterfaceC62474OfW;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import Y.ARunnableS20S0200000_1;
import android.content.Context;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.DownloadAndShareViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AqS47S0400000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS47S0400000_1 aqS47S0400000_1, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) aqS47S0400000_1.l0;
        CommerceToolsTcmServiceImpl commerceToolsTcmServiceImpl = (CommerceToolsTcmServiceImpl) aqS47S0400000_1.l1;
        AwemeDraft awemeDraft = (AwemeDraft) aqS47S0400000_1.l2;
        JSONObject jSONObject = (JSONObject) aqS47S0400000_1.l3;
        commerceToolsTcmServiceImpl.getClass();
        CommerceToolsTcmServiceImpl.LJIJJLI(awemeDraft, jSONObject);
        C3C5.m7constructorimpl(awemeDraft);
        interfaceC67352kd.resumeWith(awemeDraft);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS47S0400000_1 aqS47S0400000_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.s58, new AqS47S0400000_1((InterfaceC67352kd) aqS47S0400000_1.l0, (InterfaceC67352kd<? super AwemeDraft>) aqS47S0400000_1.l1, (CommerceToolsTcmServiceImpl) aqS47S0400000_1.l2, (AwemeDraft) aqS47S0400000_1.l3, (JSONObject) 0));
        actionGroup.LJIIIIZZ(R.string.s57, new AqS167S0100000_1((InterfaceC67352kd) aqS47S0400000_1.l0, (InterfaceC67352kd<? super AwemeDraft>) 28));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS47S0400000_1 aqS47S0400000_1, Object obj) {
        AbstractC62625Ohx shareContent = (AbstractC62625Ohx) obj;
        o.LJIIIZ(shareContent, "shareContent");
        boolean LJIIJ = ((InterfaceC62225ObV) aqS47S0400000_1.l0).LJIIJ(shareContent, (Context) aqS47S0400000_1.l1, null);
        C62387Oe7 c62387Oe7 = (C62387Oe7) aqS47S0400000_1.l2;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZ((InterfaceC62225ObV) aqS47S0400000_1.l0, LJIIJ, c62387Oe7.LJIIJ, (Context) aqS47S0400000_1.l1);
        }
        if (!((InterfaceC62225ObV) aqS47S0400000_1.l0).LJIILJJIL()) {
            ((DownloadAndShareViewModel) aqS47S0400000_1.l3).LJLILLLLZI.setValue(Boolean.TRUE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS47S0400000_1 aqS47S0400000_1, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C62387Oe7 c62387Oe7 = (C62387Oe7) aqS47S0400000_1.l0;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZ((InterfaceC62225ObV) aqS47S0400000_1.l1, booleanValue, c62387Oe7.LJIIJ, (Context) aqS47S0400000_1.l2);
        }
        if (!((InterfaceC62225ObV) aqS47S0400000_1.l1).LJIILJJIL()) {
            ((DownloadAndShareViewModel) aqS47S0400000_1.l3).LJLILLLLZI.setValue(Boolean.TRUE);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS47S0400000_1 aqS47S0400000_1, Object obj) {
        AbstractC62625Ohx shortLink = (AbstractC62625Ohx) obj;
        o.LJIIIZ(shortLink, "shortLink");
        boolean LJIIJ = ((InterfaceC62225ObV) aqS47S0400000_1.l0).LJIIJ(shortLink, ((C110794Wl) aqS47S0400000_1.l1).LJLIL, null);
        C62387Oe7 c62387Oe7 = ((C90253gT) aqS47S0400000_1.l2).LJLJLLL;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LIZ((InterfaceC62225ObV) aqS47S0400000_1.l0, LJIIJ, c62387Oe7.LJIIJ, ((C110794Wl) aqS47S0400000_1.l1).LJLIL);
        }
        if (!((InterfaceC62225ObV) aqS47S0400000_1.l0).LJIILJJIL()) {
            ASQ.LIZLLL((C90253gT) aqS47S0400000_1.l3, ASX.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS47S0400000_1 aqS47S0400000_1, Object DisposableEffect) {
        final boolean z;
        String str;
        String str2;
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        if (!((C71082qe) aqS47S0400000_1.l0).LIZIZ.LJIIIZ()) {
            ((C71082qe) aqS47S0400000_1.l0).LIZIZ.LJIIL((Aweme) aqS47S0400000_1.l1, true);
        }
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null) {
            z = c88545Yp3.isConnected();
        } else {
            z = false;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (((C71082qe) aqS47S0400000_1.l0).LIZIZ.LJIIIZ()) {
            str = "device_connected";
        } else {
            List<ServiceInfo> value = ((C71082qe) aqS47S0400000_1.l0).LIZIZ.LJFF.getValue();
            if (value == null) {
                value = C61878OQg.INSTANCE;
            }
            if (value.isEmpty()) {
                str = "no_device_found";
            } else {
                str = "device_found";
            }
        }
        Aweme aweme = (Aweme) aqS47S0400000_1.l1;
        String str3 = null;
        if (aweme != null) {
            str2 = aweme.getGroupId();
        } else {
            str2 = null;
        }
        Aweme aweme2 = (Aweme) aqS47S0400000_1.l1;
        if (aweme2 != null) {
            str3 = aweme2.getAuthorUid();
        }
        String str4 = ((C71082qe) aqS47S0400000_1.l0).LIZJ.LIZJ;
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "eventSender");
        if (str4 == null) {
            str4 = "";
        }
        LIZ2.put("enter_from", str4);
        LIZ2.put("message_type", str);
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("group_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        LIZ2.put("author_id", str3);
        LIZ2.put("is_casting", String.valueOf(z));
        LIZ.LIZIZ("casting_enter_select_device_bottom_card", LIZ2);
        final Aweme aweme3 = (Aweme) aqS47S0400000_1.l1;
        final C71082qe c71082qe = (C71082qe) aqS47S0400000_1.l0;
        final InterfaceC24760y8 interfaceC24760y8 = (InterfaceC24760y8) aqS47S0400000_1.l2;
        final InterfaceC24760y8 interfaceC24760y82 = (InterfaceC24760y8) aqS47S0400000_1.l3;
        return new InterfaceC24580xq() { // from class: X.34i
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                String str5;
                String str6;
                String str7;
                String str8;
                String authorUid;
                String groupId;
                Boolean isLoading = (Boolean) interfaceC24760y8.getValue();
                o.LJIIIIZZ(isLoading, "isLoading");
                String str9 = "";
                if (isLoading.booleanValue()) {
                    str5 = "search";
                } else if (((List) interfaceC24760y82.getValue()).isEmpty()) {
                    str5 = "no_device_found";
                } else if (((List) interfaceC24760y82.getValue()).isEmpty()) {
                    str5 = "";
                } else {
                    str5 = "device_found";
                }
                if (V5H.LIZ) {
                    C88545Yp3 c88545Yp32 = C88545Yp3.LIZIZ;
                    if (c88545Yp32 != null && c88545Yp32.isConnected()) {
                        str5 = "success";
                    } else {
                        str5 = "disconnect";
                    }
                }
                Aweme aweme4 = Aweme.this;
                String str10 = null;
                if (aweme4 != null) {
                    str6 = aweme4.getGroupId();
                } else {
                    str6 = null;
                }
                Aweme aweme5 = Aweme.this;
                if (aweme5 != null) {
                    str7 = aweme5.getAuthorUid();
                } else {
                    str7 = null;
                }
                if (C88545Yp3.LIZIZ.isConnected()) {
                    Aweme aweme6 = c71082qe.LIZJ.LIZIZ;
                    if (aweme6 != null && (groupId = aweme6.getGroupId()) != null) {
                        str6 = groupId;
                    }
                    Aweme aweme7 = c71082qe.LIZJ.LIZIZ;
                    if (aweme7 != null && (authorUid = aweme7.getAuthorUid()) != null) {
                        str7 = authorUid;
                    }
                }
                C71082qe c71082qe2 = c71082qe;
                String str11 = c71082qe2.LIZJ.LIZJ;
                ServiceInfo value2 = c71082qe2.LIZIZ.LJIIIIZZ.getValue();
                if (value2 != null) {
                    str10 = value2.name;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String LJIIIIZZ = c71082qe.LIZIZ.LJIIIIZZ();
                boolean z2 = V5H.LIZ;
                boolean z3 = z;
                C85323Wm eventSender = C772831o.LIZ();
                o.LJIIIZ(eventSender, "eventSender");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("casting_device_id", LJIIIIZZ);
                jSONObject.put("is_tt_app", String.valueOf(true));
                if (str10 == null) {
                    str10 = "";
                }
                jSONObject.put("tv_device_name", str10);
                jSONObject.put("device_discovery_to_casting_duration", (int) currentTimeMillis2);
                if (z2) {
                    str8 = "auto_trigger";
                } else {
                    str8 = "user_trigger";
                }
                jSONObject.put("action_from", str8);
                jSONObject.put("status", str5);
                if (str11 == null) {
                    str11 = "";
                }
                jSONObject.put("enter_from", str11);
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("group_id", str6);
                if (str7 != null) {
                    str9 = str7;
                }
                jSONObject.put("author_id", str9);
                jSONObject.put("is_casting", String.valueOf(z3));
                eventSender.LIZ("casting_device_select_page_time", jSONObject);
                V5H.LIZ = false;
            }
        };
    }

    public static final Object invoke$6(AqS47S0400000_1 aqS47S0400000_1, Object obj) {
        C61295O3v response = (C61295O3v) obj;
        o.LJIIIZ(response, "response");
        C108044Lw.LIZIZ.set(false);
        if (!response.LJZL) {
            ((InterfaceC88471Ynr) aqS47S0400000_1.l0).invoke("SwipeForReplyIntroductionAnimationResourceMgr", response.LL.toString());
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS47S0400000_1.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            C108044Lw.LIZ(response, (InterfaceC88471Ynr) aqS47S0400000_1.l2);
            C61325O4z.LJFF(new ARunnableS20S0200000_1((InterfaceC65784Pro) aqS47S0400000_1.l3, response, 63));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS47S0400000_1 aqS47S0400000_1, Object obj) {
        C61295O3v response = (C61295O3v) obj;
        o.LJIIIZ(response, "response");
        if (!response.LJZL) {
            ((InterfaceC88471Ynr) aqS47S0400000_1.l0).invoke("SwipeForReplyIntroductionAnimationResourceMgr", response.LL.toString());
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS47S0400000_1.l1;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            C108044Lw.LIZ(response, (InterfaceC88471Ynr) aqS47S0400000_1.l2);
            InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS47S0400000_1.l3;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS47S0400000_1(android.content.Context r3, com.ss.android.ugc.aweme.im.sdk.share.viewmodel.DownloadAndShareViewModel r4, X.InterfaceC62225ObV r5, X.C62387Oe7 r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r6
            r1.l1 = r5
            r1.l2 = r3
            r1.l3 = r4
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r6
            r1.l3 = r4
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS47S0400000_1.<init>(android.content.Context, com.ss.android.ugc.aweme.im.sdk.share.viewmodel.DownloadAndShareViewModel, X.ObV, X.Oe7, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS47S0400000_1(InterfaceC67352kd interfaceC67352kd, InterfaceC67352kd<? super AwemeDraft> interfaceC67352kd2, CommerceToolsTcmServiceImpl commerceToolsTcmServiceImpl, AwemeDraft awemeDraft, JSONObject jSONObject) {
        super(1);
        this.$t = jSONObject;
        this.l0 = interfaceC67352kd;
        this.l1 = interfaceC67352kd2;
        this.l2 = commerceToolsTcmServiceImpl;
        this.l3 = awemeDraft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0400000_1(C71082qe c71082qe, Aweme aweme, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c71082qe;
        this.l1 = aweme;
        this.l2 = interfaceC35811ar;
        this.l3 = interfaceC35811ar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0400000_1(InterfaceC62225ObV interfaceC62225ObV, C110794Wl c110794Wl, C90253gT c90253gT, C90253gT c90253gT2, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC62225ObV;
        this.l1 = c110794Wl;
        this.l2 = c90253gT;
        this.l3 = c90253gT2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS47S0400000_1(C84654XKg c84654XKg, CommerceToolsTcmServiceImpl commerceToolsTcmServiceImpl, AwemeDraft awemeDraft, JSONObject jSONObject, int i) {
        super(1);
        this.$t = i;
        this.l0 = c84654XKg;
        this.l1 = commerceToolsTcmServiceImpl;
        this.l2 = awemeDraft;
        this.l3 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS47S0400000_1(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(1);
        this.$t = interfaceC65784Pro2;
        this.l0 = interfaceC88471Ynr;
        this.l1 = interfaceC88471Ynr2;
        this.l2 = interfaceC65784Pro;
        this.l3 = interfaceC88471Ynr3;
    }
}
