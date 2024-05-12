package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS53S1000000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JhD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49839JhD {
    public static String LIZ(List list) {
        String str;
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) it.next();
            Aweme aweme = abstractC49325JXl.getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Aweme aweme2 = abstractC49325JXl.getAweme();
            if (aweme2 != null && aweme2.isAd()) {
                str2 = "A,";
            } else if (!o.LJ(ORZ.LLFII(list), abstractC49325JXl)) {
                str2 = ",";
            }
            sb.append(str2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("inflowAdInfo:");
        LIZ.append((Object) sb);
        X1D.LIZIZ(LIZ);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static boolean LIZJ(String str, String str2, C49825Jgz c49825Jgz) {
        if (str == null || str.length() == 0) {
            C78983UzD.LJIILL("DualS : ");
            return false;
        }
        if (str2 == null || c49825Jgz == null) {
            return false;
        }
        return true;
    }

    public static OSZ LIZLLL(C49841JhF c49841JhF, C49825Jgz c49825Jgz, boolean z) {
        String str;
        C40511Fv9 LJJ;
        Aweme aweme;
        String aid;
        String str2;
        Iterator<SearchMixFeed> it = c49825Jgz.getItems().iterator();
        int i = 0;
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            Aweme aweme2 = it.next().getAweme();
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            if (ujb.o.LJJJJIZL(str, c49841JhF.LJLILLLLZI, false)) {
                if (i >= 0) {
                    if (z) {
                        LJJ = C78842Uww.LJIILLIIL(i - 1, 0);
                    } else {
                        LJJ = C78842Uww.LJJ(i + 1, c49825Jgz.getItems().size());
                    }
                    int i2 = LJJ.LJLIL;
                    int i3 = LJJ.LJLILLLLZI;
                    int i4 = LJJ.LJLJI;
                    if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                        while (true) {
                            AbstractC49325JXl abstractC49325JXl = (AbstractC49325JXl) ORZ.LJLLLLLL(i2, c49825Jgz.getItems());
                            if (abstractC49325JXl != null && abstractC49325JXl.getFeedType() == 65280 && (aweme = abstractC49325JXl.getAweme()) != null && !aweme.isAd()) {
                                if (C78949Uyf.LJJIFFI(abstractC49325JXl.getAweme())) {
                                    str3 = abstractC49325JXl.getAweme().getAid();
                                    aid = c49825Jgz.LJJII(str3);
                                } else {
                                    aid = abstractC49325JXl.getAweme().getAid();
                                }
                                str2 = str3;
                                str3 = aid;
                            } else {
                                if (i2 == i3) {
                                    break;
                                }
                                i2 += i4;
                            }
                        }
                    }
                    str2 = null;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("enterFromDocId:");
                    LIZ.append(str3);
                    LIZ.append(", newEnterFromDocId:");
                    LIZ.append(str2);
                    X1D.LIZIZ(LIZ);
                    return new OSZ(str3, str2);
                }
            } else {
                i++;
            }
        }
        return new OSZ(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r7.length() != 0) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0198 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C50091JlH LIZIZ(X.C49841JhF r13, java.util.List r14, X.C49825Jgz r15, X.AbstractC49845JhJ r16) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49839JhD.LIZIZ(X.JhF, java.util.List, X.Jgz, X.JhJ):X.JlH");
    }

    public static AbstractC49845JhJ LJ(String str, String str2, C49825Jgz c49825Jgz, AbstractC49845JhJ abstractC49845JhJ, InterfaceC49778JgE interfaceC49778JgE, C49825Jgz c49825Jgz2, C49825Jgz c49825Jgz3, C49847JhL streamRoot) {
        o.LJIIIZ(streamRoot, "streamRoot");
        return LJI(new JYQ(new AqS53S1000000_8(str2, 2), false, false), str, str2, c49825Jgz, abstractC49845JhJ, interfaceC49778JgE, c49825Jgz2, c49825Jgz3, streamRoot, CardStruct.IStatusCode.DEFAULT);
    }

    public static AbstractC49845JhJ LJFF(String str, String str2, C49825Jgz c49825Jgz, AbstractC49845JhJ abstractC49845JhJ, InterfaceC49778JgE interfaceC49778JgE, C49825Jgz c49825Jgz2, C49825Jgz c49825Jgz3, C49847JhL streamRoot) {
        o.LJIIIZ(streamRoot, "streamRoot");
        if (!LIZJ(str, str2, c49825Jgz)) {
            return null;
        }
        return LJI(new JYQ(C49249JUn.LJLIL, false, false), str, str2, c49825Jgz, abstractC49845JhJ, interfaceC49778JgE, c49825Jgz2, c49825Jgz3, streamRoot, "4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x010f, code lost:
    
        X.ORZ.LLJJ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0112, code lost:
    
        r13 = r13 + r9;
        r11 = new kotlin.jvm.internal.AqS134S0200000_3(r8, (java.util.ArrayList<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed>) r7, (java.util.ArrayList<com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed>) 141);
        r6 = r12.size();
        r5 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0120, code lost:
    
        if (r13 >= r6) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0122, code lost:
    
        r14 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) com.bytedance.mt.protector.impl.collections.ListProtector.get(r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x012c, code lost:
    
        if (r14.LJII() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x012e, code lost:
    
        r0 = r14.aggregatedVideo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r0 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0132, code lost:
    
        r0 = r0.awemes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r0 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x013a, code lost:
    
        if (r0.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0167, code lost:
    
        r15 = ((java.lang.Boolean) r11.invoke(r14)).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0171, code lost:
    
        if (r15 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0173, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0179, code lost:
    
        if (r14.LJII() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x017b, code lost:
    
        r0 = r14.hotSpot;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x017d, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0181, code lost:
    
        if (r0.isHotspotDegradation == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0193, code lost:
    
        r0 = r14.getAweme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0197, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0199, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x019e, code lost:
    
        if (r0.isPhotoMode() != true) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01a2, code lost:
    
        r0 = r14.getAweme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a6, code lost:
    
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ac, code lost:
    
        if (r0.isAd() != r3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01af, code lost:
    
        if (r15 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01b4, code lost:
    
        if (r14.LJLJJI == 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01b6, code lost:
    
        r15 = X.EnumC46469ILp.GENERAL_SEARCH;
        r0 = X.C50989Jzl.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01bc, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01be, code lost:
    
        r3 = r0.getLifecycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c2, code lost:
    
        kotlin.jvm.internal.o.LJIIIZ(r15, "searchCardContainerType");
        r0 = X.C44729Hgz.LJJJJI(r14, r15, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01cb, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01cd, code lost:
    
        r0 = r0.getConfig();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d1, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01d9, code lost:
    
        if (r0.LIZLLL().LIZLLL == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01ec, code lost:
    
        if (X.JWA.LIZLLL(java.lang.Integer.valueOf(r14.getFeedType()), r14.LJI()) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ee, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01f1, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a1, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0185, code lost:
    
        if (r4 < X.C49875Jhn.LLILIL) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0187, code lost:
    
        com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LJIIJJI().LJIIIIZZ().LJ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x013c, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0143, code lost:
    
        if (r14.getAweme() != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0145, code lost:
    
        r0 = X.C44729Hgz.LIZJ(r14, X.EnumC46469ILp.GENERAL_SEARCH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x014b, code lost:
    
        if (r0 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0151, code lost:
    
        if (r0.isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r9 = ((java.lang.Number) r5.getFirst()).intValue();
        r10 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r5.getSecond();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0164, code lost:
    
        if (X.JWA.LIZLLL(java.lang.Integer.valueOf(r14.getFeedType()), r14.LJI()) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0104, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0106, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0059, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r9 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r10 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (X.C49893Ji5.LIZ() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        r10.LJLJI = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        r8 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (X.C49993Jjh.LIZ() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r8.addAll(X.ORZ.LLILLL(r12, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r24 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        r5 = r24.LIZIZ(r19, r17.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r5.isEmpty() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010c, code lost:
    
        if (X.C49835Jh9.LIZ() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01f7, code lost:
    
        if (r5.contains(r10) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01f9, code lost:
    
        r8.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01fc, code lost:
    
        r8.addAll(r5);
        r7.addAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0212, code lost:
    
        if (X.C60662Zq.LIZ.contains(r26) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0214, code lost:
    
        r11 = X.C49838JhC.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0216, code lost:
    
        if (r11 == 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0219, code lost:
    
        if (r11 == 3) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021d, code lost:
    
        if (X.C49838JhC.LIZIZ != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021f, code lost:
    
        r11 = new X.C49841JhF(r18, r19, r9 + (X.C49875Jhn.LLILIL - 1), X.JTL.NORMAL_VIDEO_CARD, r10.LJLJLLL);
        r2 = X.AbstractC65590Pog.copyOf((java.util.Collection) r20.getItems());
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "copyOf(topMixModel.items)");
        r12 = new X.C49846JhK(r11, r2, r25);
        r8 = new java.util.ArrayList();
        r0 = r12.LJLZ.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0251, code lost:
    
        if (r0 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0253, code lost:
    
        r0 = r0.LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0257, code lost:
    
        if (r0 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0259, code lost:
    
        r7 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x025b, code lost:
    
        if (r7 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025f, code lost:
    
        if (r7.LJ == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0261, code lost:
    
        r7 = r7.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0264, code lost:
    
        if (r7 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0266, code lost:
    
        r0 = r7.LIZ.LJFF;
        r7.LJIL();
        r3 = r7.LJIIIIZZ;
        r0 = r0.LIZ.get(X.C65352Pkq.LIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027d, code lost:
    
        if (r0 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027f, code lost:
    
        r0 = r0.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0281, code lost:
    
        if (r0 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0283, code lost:
    
        r3 = r0.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0287, code lost:
    
        if (r3 == null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x028c, code lost:
    
        if (r7.LJI != true) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028e, code lost:
    
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0291, code lost:
    
        r7 = r7.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0294, code lost:
    
        r3 = X.AbstractC65590Pog.copyOf((java.util.Collection) r8);
        r12.LL = new X.C49843JhH(r11, r20.LJZ);
        r12.LJZL = new X.C49797JgX(r11, r22, r3, r23);
        r7 = r20.LJLLJ;
        r0 = r20.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02ac, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02ae, code lost:
    
        r9 = r0.getSugGenerateType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b2, code lost:
    
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "inheritListImmutable");
        r8 = LIZ(r3);
        r2 = X.AbstractC65590Pog.copyOf((java.util.Collection) r3);
        kotlin.jvm.internal.o.LJIIIIZZ(r2, "copyOf(inheritListImmutable)");
        r12.LLF = new X.C49877Jhp(r7, r8, r9, LIZIZ(r11, r2, r20, r21), r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02cf, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02d0, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02d2, code lost:
    
        r15 = new X.C49841JhF(r18, r19, r9 + (X.C49875Jhn.LLILIL - 1), X.JTL.NORMAL_VIDEO_CARD, r10.LJLJLLL);
        r2 = r20.LJLLJ;
        r0 = r20.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02f0, code lost:
    
        if (r0 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f2, code lost:
    
        r17 = r0.getSugGenerateType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0311, code lost:
    
        return new X.C49875Jhn(r15, r2, r17, LIZ(r8), LIZIZ(r15, r8, r20, r21), r8, r20, r22, r7, r23, r24, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0312, code lost:
    
        r17 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a1, code lost:
    
        if (r10.getFeedType() == 65280) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00a3, code lost:
    
        r8.add(r10);
        r5 = X.X1D.LIZ();
        r5.append("add current: ");
        r0 = r10.getAweme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00b3, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00b5, code lost:
    
        r0 = r0.getDesc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00b9, code lost:
    
        r5.append(r0);
        r5.append(", ");
        r0 = r10.getAweme();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c5, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c7, code lost:
    
        r4 = r0.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00cb, code lost:
    
        r5.append(r4);
        X.X1D.LIZIZ(r5);
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00d4, code lost:
    
        if (r17.LIZIZ == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d6, code lost:
    
        r3 = X.C49825Jgz.LJIJJLI(r8);
        kotlin.jvm.internal.o.LJIIIIZZ(r3, "getAwemes(inheritList)");
        r4 = new java.util.ArrayList(X.C32I.LJJL(r3, 10));
        r3 = ((java.util.ArrayList) r3).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f4, code lost:
    
        if (r3.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f6, code lost:
    
        r4.add(((com.ss.android.ugc.aweme.feed.model.Aweme) r3.next()).getAid());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC49845JhJ LJI(X.JYQ r17, java.lang.String r18, java.lang.String r19, X.C49825Jgz r20, X.AbstractC49845JhJ r21, X.InterfaceC49778JgE r22, X.C49825Jgz r23, X.C49825Jgz r24, X.C49847JhL r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49839JhD.LJI(X.JYQ, java.lang.String, java.lang.String, X.Jgz, X.JhJ, X.JgE, X.Jgz, X.Jgz, X.JhL, java.lang.String):X.JhJ");
    }
}
