package X;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.DaInfo;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.VoucherInfo;
import java.util.HashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.RvZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71113RvZ extends AbstractC71116Rvc implements InterfaceC71142Rw2 {
    public final Context LJ;
    public final C48502J1u LJFF;
    public final C71118Rve LJI;
    public final C71120Rvg LJII;
    public XKQ LJIIIIZZ;
    public VoucherInfo LJIIIZ;
    public XKQ LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public final C71115Rvb LJIILLIIL;

    public final void LIZJ() {
        C71120Rvg c71120Rvg = this.LJII;
        c71120Rvg.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopCardShowTask dismiss , popCardState = ");
        LIZ.append(c71120Rvg.LJLJJLL);
        LIZ.append(" , popcardType = ");
        LIZ.append(1);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        int i = c71120Rvg.LJLJJLL;
        if (2 == i || 1 == i) {
            c71120Rvg.LJLJJLL = 3;
        } else {
            C36746EbW.LIZ(6, "not showing");
        }
        C2U8.LIZ(new IKA());
        XKQ xkq = this.LJIIJ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJIIJ = null;
    }

    public final boolean LJ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSlotVisible isVisible = ");
        LIZ.append(z);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (!z) {
            if (!this.LIZLLL) {
                C36746EbW.LIZ(5, "card is gone, wait for resume");
                this.LJIILJJIL = true;
                return false;
            }
            this.LJI.LJLIL = this.LJIILIIL;
            InterfaceC71121Rvh interfaceC71121Rvh = this.LIZ;
            if (interfaceC71121Rvh == null || !interfaceC71121Rvh.LIZLLL(z)) {
                LIZJ();
                return false;
            }
            int i = this.LJII.LJLJJLL;
            if (2 == i || 1 == i) {
                XKQ xkq = this.LJIIJ;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                this.LJIIJ = null;
                this.LJIIJ = XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C67992lf(3000L, this, null), 3);
            } else {
                C36746EbW.LIZ(6, "not showing");
            }
            return true;
        }
        InterfaceC71121Rvh interfaceC71121Rvh2 = this.LIZ;
        if (interfaceC71121Rvh2 == null) {
            return false;
        }
        return interfaceC71121Rvh2.LIZLLL(z);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSubscribeCouponCheckEvent(C71119Rvf checkEvent) {
        o.LJIIIZ(checkEvent, "checkEvent");
        if (!this.LJIIL) {
            C36746EbW.LIZ(5, "receive other card,but waiting for coupon result");
            if (checkEvent.LJLIL) {
                this.LJIILL = 1;
                return;
            } else {
                this.LJIILL = 2;
                return;
            }
        }
        C71120Rvg c71120Rvg = this.LJII;
        int i = c71120Rvg.LJLJJLL;
        if (2 == i || 1 == i) {
            boolean z = checkEvent.LJLIL;
            c71120Rvg.getClass();
            long uptimeMillis = SystemClock.uptimeMillis() - c71120Rvg.LJLJJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("receiveOtherPopCard isFirst = ");
            LIZ.append(z);
            LIZ.append(" , shownTime = ");
            LIZ.append(uptimeMillis);
            C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
            if (z) {
                long j = c71120Rvg.LJLJLJ;
                if (uptimeMillis >= j) {
                    c71120Rvg.LIZIZ(1);
                    return;
                } else {
                    c71120Rvg.LIZ(j - uptimeMillis);
                    return;
                }
            }
            long j2 = c71120Rvg.LJLJL;
            if (uptimeMillis >= j2) {
                c71120Rvg.LIZIZ(1);
                return;
            } else {
                c71120Rvg.LIZ(j2 - uptimeMillis);
                return;
            }
        }
        C2U8.LIZ(new IKA());
    }

    public final void LIZLLL(VoucherInfo voucherInfo, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (C78857UxB.LJJJIL(voucherInfo.voucherId)) {
            C36746EbW.LIZ(5, "start jump to schema path");
            String LIZJ = this.LJFF.LIZJ("author_id");
            String LIZJ2 = this.LJFF.LIZJ("room_id");
            String LIZJ3 = this.LJFF.LIZJ("enter_from_merge");
            String LIZJ4 = this.LJFF.LIZJ("enter_method");
            String LIZJ5 = this.LJFF.LIZJ("action_type");
            String LIZJ6 = this.LJFF.LIZJ("follow_status");
            String LIZJ7 = this.LJFF.LIZJ("page_name");
            String str6 = voucherInfo.voucherId;
            String str7 = voucherInfo.voucherTypeId;
            DaInfo LIZ = voucherInfo.LIZ();
            if (LIZ != null) {
                str4 = LIZ.couponTypeInfo;
            } else {
                str4 = null;
            }
            C71109RvV.LIZIZ(LIZJ, LIZJ2, LIZJ3, LIZJ4, LIZJ5, LIZJ6, LIZJ7, str6, str7, str4, str);
            String LIZJ8 = this.LJFF.LIZJ("author_id");
            String LIZJ9 = this.LJFF.LIZJ("room_id");
            String LIZJ10 = this.LJFF.LIZJ("enter_from_merge");
            String LIZJ11 = this.LJFF.LIZJ("enter_method");
            String LIZJ12 = this.LJFF.LIZJ("action_type");
            String LIZJ13 = this.LJFF.LIZJ("follow_status");
            String LIZJ14 = this.LJFF.LIZJ("page_name");
            String str8 = voucherInfo.voucherId;
            String str9 = voucherInfo.voucherTypeId;
            DaInfo LIZ2 = voucherInfo.LIZ();
            if (LIZ2 != null) {
                str5 = LIZ2.couponTypeInfo;
            } else {
                str5 = null;
            }
            C71109RvV.LIZJ(LIZJ8, LIZJ9, LIZJ10, LIZJ11, LIZJ12, LIZJ13, LIZJ14, str8, str9, str5, str);
            String str10 = voucherInfo.schema;
            if (str10 != null) {
                LIZIZ(voucherInfo.vapSchemaType, str10, voucherInfo.voucherTypeId, voucherInfo.voucherId, voucherInfo.daInfo);
                return;
            }
            return;
        }
        XKQ xkq = this.LJIIIIZZ;
        if (xkq != null && true == xkq.isActive()) {
            C36746EbW.LIZ(5, "now is claim coupon");
            return;
        }
        String LIZJ15 = this.LJFF.LIZJ("author_id");
        String LIZJ16 = this.LJFF.LIZJ("room_id");
        String LIZJ17 = this.LJFF.LIZJ("enter_from_merge");
        String LIZJ18 = this.LJFF.LIZJ("enter_method");
        String LIZJ19 = this.LJFF.LIZJ("action_type");
        String LIZJ20 = this.LJFF.LIZJ("follow_status");
        String LIZJ21 = this.LJFF.LIZJ("page_name");
        String str11 = voucherInfo.voucherId;
        String str12 = voucherInfo.voucherTypeId;
        DaInfo LIZ3 = voucherInfo.LIZ();
        if (LIZ3 != null) {
            str2 = LIZ3.couponTypeInfo;
        } else {
            str2 = null;
        }
        C71109RvV.LIZIZ(LIZJ15, LIZJ16, LIZJ17, LIZJ18, LIZJ19, LIZJ20, LIZJ21, str11, str12, str2, str);
        String LIZJ22 = this.LJFF.LIZJ("author_id");
        String LIZJ23 = this.LJFF.LIZJ("room_id");
        String LIZJ24 = this.LJFF.LIZJ("enter_from_merge");
        String LIZJ25 = this.LJFF.LIZJ("enter_method");
        String LIZJ26 = this.LJFF.LIZJ("action_type");
        String LIZJ27 = this.LJFF.LIZJ("follow_status");
        String LIZJ28 = this.LJFF.LIZJ("page_name");
        String str13 = voucherInfo.voucherId;
        String str14 = voucherInfo.voucherTypeId;
        DaInfo LIZ4 = voucherInfo.LIZ();
        if (LIZ4 != null) {
            str3 = LIZ4.couponTypeInfo;
        } else {
            str3 = null;
        }
        C71109RvV.LIZJ(LIZJ22, LIZJ23, LIZJ24, LIZJ25, LIZJ26, LIZJ27, LIZJ28, str13, str14, str3, str);
        this.LJIIIIZZ = XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C71114Rva(voucherInfo, this, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71113RvZ(Context context, InterfaceC71121Rvh interfaceC71121Rvh, C48502J1u c48502J1u) {
        super(interfaceC71121Rvh);
        o.LJIIIZ(context, "context");
        this.LJ = context;
        this.LJFF = c48502J1u;
        C71118Rve c71118Rve = new C71118Rve(c48502J1u);
        this.LJI = c71118Rve;
        this.LJII = new C71120Rvg();
        this.LJIILL = -1;
        c71118Rve.LJLJJLL = new IDqS436S0100000_12(this, 25);
        c71118Rve.LJLJL = new AqS178S0100000_12(this, 470);
        c71118Rve.LJLJLLL = new AqS162S0100000_12(this, 1100);
        c71118Rve.LJLJLJ = new AqS194S0100000_12(this, 208);
        c71118Rve.LJLL = new AqS194S0100000_12(this, 209);
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJIILLIIL = new C71115Rvb(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0244, code lost:
    
        r2.put("coupon_type_info", r16);
        r2.put("coupon_zone", "live_popup_card");
        X.C48658J7u.LIZ("livesdk_tiktokec_coupon_show", r2);
        r18 = r29.LJFF.LIZJ("author_id");
        r15 = r29.LJFF.LIZJ("room_id");
        r7 = r29.LJFF.LIZJ("enter_from_merge");
        r6 = r29.LJFF.LIZJ("enter_method");
        r5 = r29.LJFF.LIZJ("action_type");
        r17 = r29.LJFF.LIZJ("follow_status");
        r4 = r29.LJFF.LIZJ("page_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0289, code lost:
    
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x028b, code lost:
    
        r16 = r1.voucherId;
        r3 = r1.voucherTypeId;
        r0 = r1.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0295, code lost:
    
        if (r0 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0297, code lost:
    
        r2 = r0.couponTypeInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0299, code lost:
    
        r1 = X.C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02a1, code lost:
    
        if (r18 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02a3, code lost:
    
        r18 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a5, code lost:
    
        r1.put("author_id", r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02aa, code lost:
    
        if (r15 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ac, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ae, code lost:
    
        r1.put("room_id", r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b1, code lost:
    
        if (r7 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b3, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b5, code lost:
    
        r1.put("enter_from_merge", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b8, code lost:
    
        if (r6 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02ba, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02bc, code lost:
    
        r1.put("enter_method", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02bf, code lost:
    
        if (r5 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02c1, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02c3, code lost:
    
        r1.put("action_type", r5);
        r1.put("follow_status", java.lang.String.valueOf(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02cd, code lost:
    
        if (r4 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02cf, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02d1, code lost:
    
        r1.put("page_name", r4);
        r1.put("button_type", "use_coupon");
        r1.put("button_name", "use");
        r1.put("subsequent_page", "add_on_item");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02eb, code lost:
    
        if (r16 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f1, code lost:
    
        if (ujb.o.LJJJJJL(r16) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x031b, code lost:
    
        r24 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02f3, code lost:
    
        r1.put("coupon_id", r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02fa, code lost:
    
        if (r3 != null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02fc, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02fe, code lost:
    
        r1.put("coupon_type_id", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0303, code lost:
    
        if (r2 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0305, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0307, code lost:
    
        r1.put("coupon_type_info", r2);
        r1.put("coupon_zone", "live_popup_card");
        X.C48658J7u.LIZ("livesdk_tiktokec_button_show", r1);
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0321, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x031e, code lost:
    
        r3 = null;
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0223, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0327, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x032b, code lost:
    
        r17 = null;
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0331, code lost:
    
        r19 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0335, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0338, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x033b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0095, code lost:
    
        if (r31 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r31 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if ((-1) == r12) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        r29.LJIILIIL = r2;
        r12 = r29.LJII;
        r12.getClass();
        r14 = X.X1D.LIZ();
        r14.append("setCouponShowTime, duration = ");
        r14.append(r4);
        r14.append(" , showSecondsWithPin = ");
        r14.append(r0);
        r14.append(" , showSecondsWithCard = ");
        r14.append(r6);
        X.C36746EbW.LIZ(4, X.X1D.LIZIZ(r14));
        r12.LJLJLLL = r4;
        r12.LJLJL = r0;
        r12.LJLJLJ = r6;
        r0 = r29.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        r0 = java.lang.Long.valueOf(r0.getOwnerUserId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r2 = java.lang.String.valueOf(r0);
        r0 = r29.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        if (r0 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        r0 = java.lang.Long.valueOf(r0.getId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        X.C71109RvV.LJ(4, r2, java.lang.String.valueOf(r0), X.EnumC71217RxF.AUDIENCE.toString());
        r29.LJIIIZ = r10;
        r0 = r29.LJI;
        r2 = r30.pinVoucherStyle;
        r1 = r30.bottomInfoStyle;
        r0.getClass();
        r0.LJLILLLLZI = r10;
        r0.LJLJI = r2;
        r0.LJLJJI = r1;
        r0 = r0.LJLJJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:
    
        r0.LJJLL(r10, r2, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        if (LJ(true) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        X.C36746EbW.LIZ(6, "coupon card show fail");
        X.C2U8.LIZ(new X.IKA());
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0121, code lost:
    
        r29.LJIIL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        r2 = r29.LJII;
        r2.getClass();
        r2.LJLJJI = r2.LJLJLLL;
        r5 = X.X1D.LIZ();
        r5.append("PopCardShowTask start , popCardState = ");
        X.C15890jp.LIZIZ(r5, r2.LJLJJLL, " , popCardType = ", 1, ", duration = ");
        r5.append(r2.LJLJJI);
        X.C36746EbW.LIZ(4, X.X1D.LIZIZ(r5));
        r2.LJLJJLL = 1;
        r2.LJLJJL = android.os.SystemClock.uptimeMillis();
        r0 = r2.LJLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0155, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0157, code lost:
    
        r0.LIZIZ(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x015a, code lost:
    
        r2.LJLJI = X.XKX.LIZLLL(r2, null, null, new X.C68012lh(r2, null), 3);
        r29.LIZJ.setValue(java.lang.Boolean.TRUE);
        r1 = r29.LJI.LJLILLLLZI;
        r20 = r29.LJFF.LIZJ("author_id");
        r15 = r29.LJFF.LIZJ("room_id");
        r7 = r29.LJFF.LIZJ("enter_from_merge");
        r6 = r29.LJFF.LIZJ("enter_method");
        r5 = r29.LJFF.LIZJ("action_type");
        r4 = r29.LJFF.LIZJ("follow_status");
        r3 = r29.LJFF.LIZJ("page_name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ab, code lost:
    
        if (r1 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ad, code lost:
    
        r0 = r1.voucherId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01af, code lost:
    
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b7, code lost:
    
        if (true != X.C78857UxB.LJJJIL(r0)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b9, code lost:
    
        r19 = "2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bb, code lost:
    
        if (r1 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bd, code lost:
    
        r18 = r1.voucherId;
        r17 = r1.voucherTypeId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        if (r1 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c7, code lost:
    
        r0 = r1.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01cb, code lost:
    
        if (r0 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cd, code lost:
    
        r16 = r0.couponTypeInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d1, code lost:
    
        r2 = X.C0JU.LIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01df, code lost:
    
        if (r20 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e1, code lost:
    
        r20 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        r2.put("author_id", r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e8, code lost:
    
        if (r15 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ea, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ec, code lost:
    
        r2.put("room_id", r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ef, code lost:
    
        if (r7 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f1, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f3, code lost:
    
        r2.put("enter_from_merge", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f6, code lost:
    
        if (r6 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f8, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fa, code lost:
    
        r2.put("enter_method", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fd, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ff, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0201, code lost:
    
        r2.put("action_type", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0204, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0206, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0208, code lost:
    
        r2.put("follow_status", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020b, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020f, code lost:
    
        r2.put("page_name", r3);
        r2.put("is_coupon_available", r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021b, code lost:
    
        if (r18 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0221, code lost:
    
        if (ujb.o.LJJJJJL(r18) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0324, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0224, code lost:
    
        r24 = "-1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0226, code lost:
    
        if (r0 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0228, code lost:
    
        r18 = "-1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x022a, code lost:
    
        r2.put("coupon_id", r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0233, code lost:
    
        if (r17 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0235, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0237, code lost:
    
        r2.put("coupon_type_id", r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0240, code lost:
    
        if (r16 != null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0242, code lost:
    
        r16 = "";
     */
    @Override // X.InterfaceC71142Rw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.NewUserPopUp r30, boolean r31, long r32) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71113RvZ.LIZ(com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.NewUserPopUp, boolean, long):void");
    }

    public final void LIZIZ(Integer num, String str, String str2, String str3, String str4) {
        if (num == null || 9 != num.intValue()) {
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("previous_page", "live");
                String jSONObject2 = jSONObject.toString();
                if (jSONObject2 != null) {
                    buildUpon.appendQueryParameter("track_params", jSONObject2);
                }
            } catch (Exception unused) {
            }
            SmartRouter.buildRoute(this.LJ, buildUpon.build().toString()).open();
            return;
        }
        String LIZJ = this.LJFF.LIZJ("room_id");
        if (LIZJ == null) {
            LIZJ = "";
        }
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            hashMap.put("voucher_type_id", str2);
        }
        if (str3 != null) {
            hashMap.put("voucher_id", str3);
        }
        if (str4 != null) {
            hashMap.put("da_info", str4);
        }
        C2U8.LIZ(new C9CU(LIZJ, str, hashMap));
    }
}
