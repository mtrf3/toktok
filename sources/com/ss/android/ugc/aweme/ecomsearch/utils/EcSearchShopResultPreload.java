package com.ss.android.ugc.aweme.ecomsearch.utils;

import X.C10K;
import X.C38827FLr;
import X.KFM;
import X.KFN;
import X.OSZ;
import X.QDX;
import X.X8M;
import android.os.Bundle;
import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcSearchShopResultPreload implements X8M<EcSearchApi.RealApi, C10K<QDX<m>>> {
    public static final KFM Companion = new KFM();
    public static KFN preloadRequestParam;
    public static OSZ<KFN, Long> preloadSearchRequestParamCacheAndTime;

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(3000, EcSearchApi.LIZ, true);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIJ(exception, "exception");
        throw exception;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x003d, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x017d, code lost:
    
        if (r38 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017f, code lost:
    
        r38 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0181, code lost:
    
        if (r0 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0187, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0189, code lost:
    
        r41 = r0.getKeyword();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x018d, code lost:
    
        if (r41 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0193, code lost:
    
        r42 = r0.getEnterFrom();
        r43 = r0.getCount();
        r44 = r0.getHotSearch();
        r45 = r0.getSearchId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a3, code lost:
    
        if (r45 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a5, code lost:
    
        r45 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01a7, code lost:
    
        if (r0 == null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0296, code lost:
    
        r46 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b3, code lost:
    
        r47 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b5, code lost:
    
        if (r0 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b7, code lost:
    
        r48 = r0.getSearchSource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01bb, code lost:
    
        if (r48 != null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c1, code lost:
    
        r49 = r0.getCorrectType();
        r2 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c9, code lost:
    
        if (r2 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01cf, code lost:
    
        if (r2.isDefaultOption() != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d1, code lost:
    
        r50 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d3, code lost:
    
        r2 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d7, code lost:
    
        if (r2 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d9, code lost:
    
        r51 = r2.getFilterBy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01dd, code lost:
    
        r2 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01e1, code lost:
    
        if (r2 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01e3, code lost:
    
        r52 = r2.getSortType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01e7, code lost:
    
        r2 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01eb, code lost:
    
        if (r2 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ed, code lost:
    
        r53 = r2.activityToFieldMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f1, code lost:
    
        if (r53 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01f8, code lost:
    
        if (r0 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01fa, code lost:
    
        r54 = r0.getSearchContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01fe, code lost:
    
        if (r54 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0204, code lost:
    
        r55 = r0.getSugTagText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0208, code lost:
    
        if (r55 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020a, code lost:
    
        r55 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020c, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0214, code lost:
    
        r56 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0216, code lost:
    
        if (r0 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0218, code lost:
    
        r57 = r0.getSugQueryState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021c, code lost:
    
        if (r57 != null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0222, code lost:
    
        r58 = r0.getSugCreatorId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0226, code lost:
    
        if (r58 != null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0228, code lost:
    
        r58 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x022a, code lost:
    
        if (r0 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0232, code lost:
    
        r59 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0234, code lost:
    
        if (r0 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0236, code lost:
    
        r60 = r0.getTrafficSourceList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x023a, code lost:
    
        if (r60 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0240, code lost:
    
        r61 = r0.getCmplEnc();
        r62 = r0.getOriginIsMallTab();
        r63 = r0.getEcSearchSessionId();
        r2 = r0.getSugShopId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0250, code lost:
    
        if (r2 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0252, code lost:
    
        if (r0 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0254, code lost:
    
        r65 = r0.getUserRtActs();
        r36 = r0.getApiVersion();
        r66 = r0.getSearchSessionId();
        r34 = r0.getUserActions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0270, code lost:
    
        return r1.searchDynamicShopListByChunk(r36, r37, r38, r5, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r30, r65, r66, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0271, code lost:
    
        r65 = null;
        r36 = null;
        r66 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0278, code lost:
    
        r30 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x023c, code lost:
    
        r60 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x023e, code lost:
    
        if (r0 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x027b, code lost:
    
        r61 = null;
        r62 = null;
        r63 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x022c, code lost:
    
        r59 = r0.getAttachProducts();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0230, code lost:
    
        if (r59 != null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x021e, code lost:
    
        r57 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0220, code lost:
    
        if (r0 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x020e, code lost:
    
        r56 = r0.getSugType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0212, code lost:
    
        if (r56 != null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0200, code lost:
    
        r54 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0202, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01f3, code lost:
    
        r53 = new java.util.LinkedHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0290, code lost:
    
        r52 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0292, code lost:
    
        if (r0 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x028a, code lost:
    
        r51 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x028c, code lost:
    
        if (r0 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0284, code lost:
    
        r50 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0286, code lost:
    
        if (r0 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01bd, code lost:
    
        r48 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01bf, code lost:
    
        if (r0 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0282, code lost:
    
        r49 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01a9, code lost:
    
        r46 = r0.getLastSearchId();
        r47 = r0.getSource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01b1, code lost:
    
        if (r47 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x018f, code lost:
    
        r41 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0191, code lost:
    
        if (r0 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x029a, code lost:
    
        r42 = null;
        r43 = 0;
        r44 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0183, code lost:
    
        r5 = r0.getCursor();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r7 = r0.getKeyword();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0177, code lost:
    
        if (r0 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r7 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        r8 = r0.getEnterFrom();
        r9 = r0.getCount();
        r10 = r0.getHotSearch();
        r11 = r0.getSearchId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r11 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0153, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        r14 = r0.getSearchSource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r14 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r15 = r0.getCorrectType();
        r1 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r1 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r1.isDefaultOption() != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        r16 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        r1 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r1 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        r17 = r1.getFilterBy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        r1 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        r18 = r1.getSortType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        r1 = r0.getFilterOption();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        if (r1 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        r19 = r1.activityToFieldMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (r19 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        r20 = r0.getSearchContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        if (r20 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        r21 = r0.getSugTagText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        if (r21 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        r21 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        r22 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r23 = r0.getSugQueryState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r23 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        r24 = r0.getSugCreatorId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        if (r24 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
    
        r24 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        r25 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
    
        r26 = r0.getTrafficSourceList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
    
        if (r26 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        r27 = r0.getCmplEnc();
        r28 = r0.getOriginIsMallTab();
        r29 = r0.getEcSearchSessionId();
        r1 = r0.getSugShopId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        if (r0 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        r31 = r0.getUserRtActs();
        r32 = r0.getApiVersion();
        r33 = r0.getSearchSessionId();
        r34 = r0.getUserActions();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
    
        return r2.searchDynamicShopListByChunkPost(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        r31 = null;
        r32 = null;
        r33 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        r30 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        r26 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0104, code lost:
    
        if (r0 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0139, code lost:
    
        r27 = null;
        r28 = null;
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f2, code lost:
    
        r25 = r0.getAttachProducts();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f6, code lost:
    
        if (r25 != null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e4, code lost:
    
        r23 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e6, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d4, code lost:
    
        r22 = r0.getSugType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d8, code lost:
    
        if (r22 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c6, code lost:
    
        r20 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c8, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b9, code lost:
    
        r19 = new java.util.LinkedHashMap<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014d, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014f, code lost:
    
        if (r0 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0147, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0149, code lost:
    
        if (r0 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0141, code lost:
    
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0143, code lost:
    
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0083, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0085, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0140, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x006f, code lost:
    
        r12 = r0.getLastSearchId();
        r13 = r0.getSource();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0077, code lost:
    
        if (r13 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0055, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0057, code lost:
    
        if (r0 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0157, code lost:
    
        r8 = null;
        r9 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0049, code lost:
    
        r5 = r0.getCursor();
     */
    @Override // X.X8M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C10K<X.QDX<com.google.gson.m>> preload(android.os.Bundle r69, X.InterfaceC88472Yns<? super java.lang.Class<com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi.RealApi>, ? extends com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi.RealApi> r70) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecomsearch.utils.EcSearchShopResultPreload.preload(android.os.Bundle, X.Yns):X.10K");
    }
}
