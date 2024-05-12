package kotlin.jvm.internal;

import X.AFE;
import X.AFF;
import X.ARH;
import X.ARN;
import X.AbstractC36908Ee8;
import X.AbstractC65781Prl;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C188727au;
import X.C198517qh;
import X.C237559Tz;
import X.C242879g3;
import X.C25792AAi;
import X.C25804AAu;
import X.C25806AAw;
import X.C25846ACk;
import X.C25891AEd;
import X.C39398FdC;
import X.C45804HyK;
import X.C47261Igj;
import X.C55096Ljo;
import X.C73536StY;
import X.C73969T1h;
import X.C76800UCe;
import X.C78472Uqy;
import X.C91O;
import X.DialogC111054Xl;
import X.EFJ;
import X.FMX;
import X.InterfaceC88472Yns;
import X.ORY;
import X.T16;
import X.V1B;
import Y.ACListenerS21S0100000_1;
import Y.AfS0S0000100_4;
import Y.AfS19S1100000_4;
import Y.AfS2S1100100_4;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.cla.et.newet.SaveNotTranslateLangsEvent;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.kids.commonfeed.report.api.ReportApi;
import com.ss.android.ugc.aweme.model.PaidCollectionRefundResponse;
import com.ss.android.ugc.aweme.paidcontent.api.PaidCollectionPaymentApi;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentRefundFragment;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarSettingAssem;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarSettingComponent;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS14S2100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public class AqS14S2100000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S2100000_4 aqS14S2100000_4, Object it) {
        o.LJIIIZ(it, "it");
        a.LJIILLIIL().LIZIZ((ActivityC45651qj) aqS14S2100000_4.l2, new Uri.Builder().appendQueryParameter("report_type", "series_comment").appendQueryParameter("object_id", aqS14S2100000_4.s0).appendQueryParameter("owner_id", aqS14S2100000_4.s1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.9ot] */
    public static final Object invoke$1(AqS14S2100000_4 aqS14S2100000_4, Object obj) {
        C25846ACk it = (C25846ACk) obj;
        o.LJIIIZ(it, "it");
        final String str = aqS14S2100000_4.s0;
        final String str2 = aqS14S2100000_4.s1;
        final CaptionsPanelFragment captionsPanelFragment = (CaptionsPanelFragment) aqS14S2100000_4.l2;
        return C25846ACk.LJIILJJIL(it, false, null, false, false, new View.OnClickListener() { // from class: X.9ot
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentManager supportFragmentManager;
                String str3 = str;
                if (str3 != null) {
                    String str4 = str2;
                    CaptionsPanelFragment captionsPanelFragment2 = captionsPanelFragment;
                    if (str4 != null) {
                        captionsPanelFragment2.getClass();
                        C245319jz c245319jz = new C245319jz();
                        C252669vq c252669vq = new C252669vq();
                        String string = captionsPanelFragment2.getString(R.string.dax);
                        o.LJIIIIZZ(string, "getString(R.string.claCo…t_dontTranslatePopUp_cta)");
                        c252669vq.LIZ = Q8U.LIZIZ(new Object[]{str4}, 1, string, "format(format, *args)");
                        c252669vq.LIZJ = 0;
                        c252669vq.LJ = new ACListenerS21S0100000_1(new AqS14S2100000_4(str3, str4, captionsPanelFragment2, 2), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                        c245319jz.LIZIZ(c252669vq);
                        TuxActionSheet LIZJ = c245319jz.LIZJ();
                        ActivityC45651qj mo49getActivity = captionsPanelFragment2.mo49getActivity();
                        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
                            LIZJ.show(supportFragmentManager, "Don't translate prompt");
                        }
                    }
                }
            }
        }, null, false, false, 131039);
    }

    public static final Object invoke$10(AqS14S2100000_4 aqS14S2100000_4, Object it) {
        o.LJIIIZ(it, "it");
        new C237559Tz().LJIJJLI(2, aqS14S2100000_4.s0);
        C242879g3.LIZJ((Context) aqS14S2100000_4.l2, aqS14S2100000_4.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS14S2100000_4 aqS14S2100000_4, Object it) {
        String[] strArr;
        o.LJIIIZ(it, "it");
        String[] LJIIIIZZ = C25792AAi.LIZ().LJIIIIZZ();
        String[] strArr2 = null;
        if (LJIIIIZZ != null) {
            ArrayList arrayList = (ArrayList) ORY.LJLIIIL(LJIIIIZZ);
            arrayList.add(aqS14S2100000_4.s0);
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            strArr = null;
        }
        String[] LJIIIIZZ2 = C25792AAi.LIZ().LJIIIIZZ();
        if (LJIIIIZZ2 != null) {
            ArrayList arrayList2 = (ArrayList) ORY.LJLIIIL(LJIIIIZZ2);
            arrayList2.add(aqS14S2100000_4.s1);
            strArr2 = (String[]) arrayList2.toArray(new String[0]);
        }
        C25806AAw LJ = C91O.LIZ().LJ(new C25804AAu((CaptionsPanelFragment) aqS14S2100000_4.l2));
        CaptionsPanelFragment captionsPanelFragment = (CaptionsPanelFragment) aqS14S2100000_4.l2;
        if (strArr != null && strArr2 != null) {
            LJ.LIZ(strArr, strArr2);
            captionsPanelFragment.getClass();
            SaveNotTranslateLangsEvent saveNotTranslateLangsEvent = new SaveNotTranslateLangsEvent();
            saveNotTranslateLangsEvent.LIZLLL(ORY.LJJJJLL(strArr, ",", null, null, null, 62), "not_translate_langs");
            saveNotTranslateLangsEvent.LIZLLL(ORY.LJJJJLL(LJIIIIZZ, ",", null, null, null, 62), "prev_not_translate_langs");
            String uid = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid();
            o.LJIIIIZZ(uid, "get()\n                .g…ass.java).currentUser.uid");
            saveNotTranslateLangsEvent.LIZLLL(uid, "user_id");
            String enterFrom = captionsPanelFragment.xl().LIZ.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            saveNotTranslateLangsEvent.LIZLLL(enterFrom, "enter_from");
            saveNotTranslateLangsEvent.LIZLLL("not_translate_guide", "enter_method");
            saveNotTranslateLangsEvent.LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS14S2100000_4 aqS14S2100000_4, Object it) {
        o.LJIIIZ(it, "it");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((MineNavBarSettingAssem) aqS14S2100000_4.l2);
        if (LJIIIIZZ != null) {
            String str = aqS14S2100000_4.s0;
            String str2 = aqS14S2100000_4.s1;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("entrance", "setting_panel");
            c188727au.LJIIIZ("has_income_before", str);
            c188727au.LJIIIZ("display_balance", str2);
            FMX.LJIIL("livesdk_wallet_entrance_click", c188727au.LIZ);
            C78472Uqy.LIZIZ(LJIIIIZZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS14S2100000_4 aqS14S2100000_4, Object it) {
        long j;
        AbstractC73672Svk<PaidCollectionRefundResponse> abstractC73672Svk;
        PaidCollectionPaymentApi.SubmitRefundApi submitRefundApi;
        o.LJIIIZ(it, "it");
        PaidContentRefundFragment paidContentRefundFragment = (PaidContentRefundFragment) aqS14S2100000_4.l2;
        Context context = paidContentRefundFragment.getContext();
        if (context != null) {
            DialogC111054Xl LIZIZ = DonationServiceImpl.LJI().LIZIZ(context);
            paidContentRefundFragment.LJLJJLL = LIZIZ;
            if (LIZIZ != null) {
                V1B.LJLJJL(LIZIZ);
            }
        }
        PaidContentRefundFragment paidContentRefundFragment2 = (PaidContentRefundFragment) aqS14S2100000_4.l2;
        String refundReason = aqS14S2100000_4.s0;
        Iterator it2 = ((ArrayList) paidContentRefundFragment2.LJLJI).iterator();
        int i = 0;
        int i2 = -1;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i + 1;
            if (i >= 0) {
                if (((CompoundButton) next).isChecked()) {
                    i2 = i;
                }
                i = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Bundle arguments = paidContentRefundFragment2.getArguments();
        if (arguments != null) {
            j = arguments.getLong("collection_id");
        } else {
            j = 0;
        }
        o.LJIIIZ(refundReason, "refundReason");
        try {
            if (PaidCollectionPaymentApi.LIZIZ == null) {
                IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                String API_URL_PREFIX_SI = EFJ.LIZJ;
                o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                PaidCollectionPaymentApi.LIZIZ = (PaidCollectionPaymentApi.SubmitRefundApi) LIZLLL.create(API_URL_PREFIX_SI).create(PaidCollectionPaymentApi.SubmitRefundApi.class);
            }
            submitRefundApi = PaidCollectionPaymentApi.LIZIZ;
        } catch (ExecutionException e) {
            AbstractC36908Ee8.getCompatibleException(e);
        }
        if (submitRefundApi != null) {
            abstractC73672Svk = submitRefundApi.submitRefund(1, j, "", i2, refundReason);
            abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS19S1100000_4(paidContentRefundFragment2, refundReason, 3), new AfS19S1100000_4(paidContentRefundFragment2, refundReason, 4));
            ((PaidContentRefundFragment) aqS14S2100000_4.l2).wl("collection_refund_confirmation_submit", aqS14S2100000_4.s1);
            return C76800UCe.LIZ;
        }
        abstractC73672Svk = C73536StY.LJLIL;
        o.LJIIIIZZ(abstractC73672Svk, "empty()");
        abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS19S1100000_4(paidContentRefundFragment2, refundReason, 3), new AfS19S1100000_4(paidContentRefundFragment2, refundReason, 4));
        ((PaidContentRefundFragment) aqS14S2100000_4.l2).wl("collection_refund_confirmation_submit", aqS14S2100000_4.s1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS14S2100000_4 aqS14S2100000_4, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJ(R.string.qon, new AqS14S2100000_4((PaidContentRefundFragment) aqS14S2100000_4.l2, aqS14S2100000_4.s0, aqS14S2100000_4.s1, 4));
        buttonGroup.LJI(R.string.qom, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS14S2100000_4 aqS14S2100000_4, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        Set<Integer> set = AFF.LIZIZ;
        if (!set.isEmpty()) {
            it.LIZJ = true;
            Activity LJIJJ = C45804HyK.LJIJJ((Context) aqS14S2100000_4.l2);
            if (LJIJJ != null) {
                String str = aqS14S2100000_4.s0;
                String str2 = aqS14S2100000_4.s1;
                Object obj2 = ListProtector.get(new ArrayList(set), 0);
                o.LJIIIIZZ(obj2, "ArrayList(checkSet)[0]");
                int intValue = ((Number) obj2).intValue();
                String LIZ = AFF.LIZ();
                long currentTimeMillis = System.currentTimeMillis();
                ReportApi.LIZ.reportAwame("video", CastLongProtector.parseLong(str), CastLongProtector.parseLong(str2), intValue, LIZ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS2S1100100_4(LJIJJ, currentTimeMillis, str, 1), new AfS0S0000100_4(currentTimeMillis, 2));
            }
        } else {
            C25891AEd c25891AEd = AFF.LIZJ;
            if (c25891AEd != null) {
                c25891AEd.setErrorVisibility(false);
                C39398FdC c39398FdC = C39398FdC.LIZ;
                C198517qh c198517qh = new C198517qh();
                C39398FdC.LIZIZ("report_reason_error", q.LIZJ(c198517qh.LIZ, "object_type", "video", c198517qh, c39398FdC));
                it.LIZJ = false;
            } else {
                o.LJIJI("reportReasonReasonList");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS14S2100000_4 aqS14S2100000_4, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        buttonGroup.LJ(R.string.ho5, new AqS14S2100000_4((Context) aqS14S2100000_4.l2, aqS14S2100000_4.s0, aqS14S2100000_4.s1, 6));
        buttonGroup.LJI(R.string.ho7, AFE.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS14S2100000_4 aqS14S2100000_4, Object it) {
        o.LJIIIZ(it, "it");
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((NavBarSettingComponent) aqS14S2100000_4.l2);
        if (LJIIIIZZ != null) {
            String str = aqS14S2100000_4.s0;
            String str2 = aqS14S2100000_4.s1;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("entrance", "setting_panel");
            c188727au.LJIIIZ("has_income_before", str);
            c188727au.LJIIIZ("display_balance", str2);
            FMX.LJIIL("livesdk_wallet_entrance_click", c188727au.LIZ);
            C78472Uqy.LIZIZ(LJIIIIZZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS14S2100000_4 aqS14S2100000_4, Object it) {
        o.LJIIIZ(it, "it");
        new C237559Tz().LJIJJLI(1, aqS14S2100000_4.s0);
        C242879g3.LIZIZ((Context) aqS14S2100000_4.l2, aqS14S2100000_4.s1);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS14S2100000_4(X.ActivityC45651qj r3, java.lang.String r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l2 = r3
            r1.s0 = r4
            r1.s1 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r4
            r1.s1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS14S2100000_4.<init>(X.1qj, java.lang.String, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS14S2100000_4(android.content.Context r3, java.lang.String r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 6: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.s0 = r4
            r1.l2 = r3
            r1.s1 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l2 = r3
            r1.s0 = r4
            r1.s1 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS14S2100000_4.<init>(android.content.Context, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S2100000_4(PaidContentRefundFragment paidContentRefundFragment, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = paidContentRefundFragment;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S2100000_4(MineNavBarSettingAssem mineNavBarSettingAssem, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = mineNavBarSettingAssem;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S2100000_4(NavBarSettingComponent navBarSettingComponent, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = navBarSettingComponent;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S2100000_4(String str, String str2, CaptionsPanelFragment captionsPanelFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = captionsPanelFragment;
    }
}
