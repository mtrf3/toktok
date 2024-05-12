package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import ujb.o;

/* renamed from: X.Lzz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC56099Lzz {
    public final Context LIZ;
    public final String LIZIZ;
    public final ActivityC45651qj LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public abstract boolean LIZIZ();

    public final void LIZ(String str) {
        Intent intent;
        OSZ LJFF = EcUgPopupService.LJIILJJIL().LJFF(str, null, true);
        String str2 = (String) LJFF.getFirst();
        int intValue = ((Number) LJFF.getSecond()).intValue();
        if (str2 == null || o.LJJJJJL(str2) || (intent = this.LIZJ.getIntent()) == null) {
            return;
        }
        intent.putExtra("extra_landing_deeplink", str2);
        intent.putExtra("extra_delay_load_mall_tab", intValue);
    }

    public AbstractC56099Lzz(Context context, String mob) {
        kotlin.jvm.internal.o.LJIIIZ(mob, "mob");
        this.LIZ = context;
        this.LIZIZ = mob;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        kotlin.jvm.internal.o.LJI(LJJIFFI);
        this.LIZJ = LJJIFFI;
        this.LJ = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e5, code lost:
    
        if (r16.isDotShowed() == r13) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e7, code lost:
    
        r0 = (com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon) X.C55096Ljo.LIZ(X.C55230Lly.LIZLLL(r26.LIZJ, null), com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon.class, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02f6, code lost:
    
        if (r0 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f8, code lost:
    
        r1 = r0.b9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02fc, code lost:
    
        if (r13 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02fe, code lost:
    
        if (r16 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0300, code lost:
    
        r0 = r16.getDiversionData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0304, code lost:
    
        r18 = X.M05.LIZLLL(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0308, code lost:
    
        if (r16 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x030a, code lost:
    
        r0 = r16.getDiversionData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030e, code lost:
    
        if (r0 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0310, code lost:
    
        r0 = X.C73340SqO.LJJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0314, code lost:
    
        if (r0 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0316, code lost:
    
        r0 = r0.getConfig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x031a, code lost:
    
        if (r0 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x031c, code lost:
    
        r15 = r0.getRedDot();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0320, code lost:
    
        if (r15 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0322, code lost:
    
        if (r1 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0324, code lost:
    
        r13 = r1.getLogExtraMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0328, code lost:
    
        if (r14 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x032a, code lost:
    
        if (r16 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x032c, code lost:
    
        r12 = r16.getDiversionData();
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0335, code lost:
    
        if (r16.isBubblePicShow() != true) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0337, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0338, code lost:
    
        r12 = X.M05.LIZ(r12, r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x033c, code lost:
    
        r0 = X.C56092Lzs.LIZ;
        r14 = r8.getValue();
        r1 = r26.LIZIZ;
        r17 = X.M05.LIZJ(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0348, code lost:
    
        if (r15 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034a, code lost:
    
        r16 = r15.getCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x034e, code lost:
    
        r0.getClass();
        kotlin.jvm.internal.o.LJIIIZ(r14, "enterMethod");
        kotlin.jvm.internal.o.LJIIIZ(r1, "mob");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x035d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "homepage_shop_mall") == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x035f, code lost:
    
        r8 = "homepage_bottom_tab";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0361, code lost:
    
        r7 = X.C45243HpH.LIZ("tab_name", r7, "EVENT_ORIGIN_FEATURE", "TEMAI");
        r7.put("enter_from", r4);
        r7.put("enter_method", r14);
        r7.put("mall_entrance", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0376, code lost:
    
        if (r18 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0378, code lost:
    
        r7.put("red_dot_type", r18.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0381, code lost:
    
        if (r17 == null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0383, code lost:
    
        r7.put("red_dot_number_type", r17.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x038c, code lost:
    
        if (r16 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x038e, code lost:
    
        r7.put("red_dot_number", java.lang.Integer.valueOf(r16.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x039b, code lost:
    
        if (r13 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x039d, code lost:
    
        r7.putAll(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03a0, code lost:
    
        if (r12 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03a2, code lost:
    
        r7.putAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a5, code lost:
    
        X.C56092Lzs.LJIILIIL("tiktokec_mall_entrance_click", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0404, code lost:
    
        r7 = "homepage";
        r8 = "homepage_top_tab";
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x040a, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0410, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x040e, code lost:
    
        r12 = null;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0413, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0426, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0425, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0416, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0419, code lost:
    
        r18 = X.M05.LIZLLL(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x041d, code lost:
    
        if (r1 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x041f, code lost:
    
        r15 = r1.getCountConfig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0429, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0432, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x042e, code lost:
    
        if (r16 != null) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC56099Lzz.LIZJ(java.lang.String, boolean, boolean):void");
    }

    public final void LIZLLL(String enterFrom, int i, boolean z, LSO enterMethod) {
        kotlin.jvm.internal.o.LJIIIZ(enterFrom, "enterFrom");
        kotlin.jvm.internal.o.LJIIIZ(enterMethod, "enterMethod");
        if (!z) {
            ShopMainFragment.LJZ.getClass();
            ShopMainFragment.LJZI = enterFrom;
            C54741Le5 c54741Le5 = ShopMainFragment.LJZ;
            String value = enterMethod.getValue();
            c54741Le5.getClass();
            ShopMainFragment.LL = value;
        }
        C54741Le5 c54741Le52 = ShopMainFragment.LJZ;
        c54741Le52.getClass();
        ShopMainFragment.LJZL = i;
        String str = this.LIZIZ;
        c54741Le52.getClass();
        ShopMainFragment.LLD = str;
        ShopMainFragment.LLIIJLIL = true;
    }
}
