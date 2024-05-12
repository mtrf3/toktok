package com.ss.android.ugc.aweme.ecommerce.base.pdp.starter;

import X.C113554cx;
import X.C27162AlK;
import X.C27739Aud;
import X.C47959Irz;
import X.C65330PkU;
import X.C65340Pke;
import X.C65352Pkq;
import X.C70101RfF;
import X.UC7;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public interface IPdpStarter {
    public static final C70101RfF LIZ = C70101RfF.LIZ;

    /* loaded from: classes13.dex */
    public static final class PdpEnterParam implements Serializable {
        public String awemeId;
        public Integer bizType;
        public String chainKey;
        public List<String> checkedSkuIds;
        public String clickFrom;
        public final Float collapsedHeight;
        public final boolean collapsible;
        public final float expandHeight;
        public boolean fullScreen;
        public final boolean isPromotionPage;
        public final HashMap<String, Object> orderRequestParams;
        public String pdpCacheKey;
        public HashMap<String, String> pdpPreParam;
        public final boolean playerControl;
        public String preTrackNodeId;
        public final HashMap<String, Object> productEnterContext;
        public final HashMap<String, Object> requestParams;
        public String sourceInfo;
        public final HashMap<String, Object> trackParams;
        public final HashMap<String, Object> visitReportParams;

        public PdpEnterParam() {
            this(null, null, null, null, false, null, 0.0f, null, false, false, false, null, null, null, null, null, null, null, 262143, null);
        }

        public static /* synthetic */ PdpEnterParam copy$default(PdpEnterParam pdpEnterParam, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, boolean z, List list, float f, Float f2, boolean z2, boolean z3, boolean z4, HashMap hashMap5, String str, HashMap hashMap6, String str2, String str3, String str4, Integer num, int i, Object obj) {
            HashMap hashMap7 = hashMap4;
            HashMap hashMap8 = hashMap3;
            HashMap hashMap9 = hashMap;
            HashMap hashMap10 = hashMap2;
            boolean z5 = z2;
            Float f3 = f2;
            float f4 = f;
            boolean z6 = z;
            List list2 = list;
            HashMap hashMap11 = hashMap6;
            String str5 = str;
            HashMap hashMap12 = hashMap5;
            boolean z7 = z3;
            boolean z8 = z4;
            Integer num2 = num;
            String str6 = str4;
            String str7 = str2;
            String str8 = str3;
            if ((i & 1) != 0) {
                hashMap9 = pdpEnterParam.requestParams;
            }
            if ((i & 2) != 0) {
                hashMap10 = pdpEnterParam.orderRequestParams;
            }
            if ((i & 4) != 0) {
                hashMap8 = pdpEnterParam.trackParams;
            }
            if ((i & 8) != 0) {
                hashMap7 = pdpEnterParam.visitReportParams;
            }
            if ((i & 16) != 0) {
                z6 = pdpEnterParam.fullScreen;
            }
            if ((i & 32) != 0) {
                list2 = pdpEnterParam.checkedSkuIds;
            }
            if ((i & 64) != 0) {
                f4 = pdpEnterParam.expandHeight;
            }
            if ((i & 128) != 0) {
                f3 = pdpEnterParam.collapsedHeight;
            }
            if ((i & 256) != 0) {
                z5 = pdpEnterParam.collapsible;
            }
            if ((i & 512) != 0) {
                z7 = pdpEnterParam.playerControl;
            }
            if ((i & 1024) != 0) {
                z8 = pdpEnterParam.isPromotionPage;
            }
            if ((i & 2048) != 0) {
                hashMap12 = pdpEnterParam.productEnterContext;
            }
            if ((i & 4096) != 0) {
                str5 = pdpEnterParam.pdpCacheKey;
            }
            if ((i & FileUtils.BUFFER_SIZE) != 0) {
                hashMap11 = pdpEnterParam.pdpPreParam;
            }
            if ((i & 16384) != 0) {
                str7 = pdpEnterParam.preTrackNodeId;
            }
            if ((32768 & i) != 0) {
                str8 = pdpEnterParam.awemeId;
            }
            if ((65536 & i) != 0) {
                str6 = pdpEnterParam.clickFrom;
            }
            if ((i & 131072) != 0) {
                num2 = pdpEnterParam.bizType;
            }
            List list3 = list2;
            float f5 = f4;
            Float f6 = f3;
            return pdpEnterParam.copy(hashMap9, hashMap10, hashMap8, hashMap7, z6, list3, f5, f6, z5, z7, z8, hashMap12, str5, hashMap11, str7, str8, str6, num2);
        }

        public final PdpEnterParam copy(HashMap<String, Object> requestParams, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, boolean z, List<String> list, float f, Float f2, boolean z2, boolean z3, boolean z4, HashMap<String, Object> hashMap4, String str, HashMap<String, String> pdpPreParam, String str2, String str3, String str4, Integer num) {
            o.LJIIIZ(requestParams, "requestParams");
            o.LJIIIZ(pdpPreParam, "pdpPreParam");
            return new PdpEnterParam(requestParams, hashMap, hashMap2, hashMap3, z, list, f, f2, z2, z3, z4, hashMap4, str, pdpPreParam, str2, str3, str4, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PdpEnterParam)) {
                return false;
            }
            PdpEnterParam pdpEnterParam = (PdpEnterParam) obj;
            return o.LJ(this.requestParams, pdpEnterParam.requestParams) && o.LJ(this.orderRequestParams, pdpEnterParam.orderRequestParams) && o.LJ(this.trackParams, pdpEnterParam.trackParams) && o.LJ(this.visitReportParams, pdpEnterParam.visitReportParams) && this.fullScreen == pdpEnterParam.fullScreen && o.LJ(this.checkedSkuIds, pdpEnterParam.checkedSkuIds) && Float.compare(this.expandHeight, pdpEnterParam.expandHeight) == 0 && o.LJ(this.collapsedHeight, pdpEnterParam.collapsedHeight) && this.collapsible == pdpEnterParam.collapsible && this.playerControl == pdpEnterParam.playerControl && this.isPromotionPage == pdpEnterParam.isPromotionPage && o.LJ(this.productEnterContext, pdpEnterParam.productEnterContext) && o.LJ(this.pdpCacheKey, pdpEnterParam.pdpCacheKey) && o.LJ(this.pdpPreParam, pdpEnterParam.pdpPreParam) && o.LJ(this.preTrackNodeId, pdpEnterParam.preTrackNodeId) && o.LJ(this.awemeId, pdpEnterParam.awemeId) && o.LJ(this.clickFrom, pdpEnterParam.clickFrom) && o.LJ(this.bizType, pdpEnterParam.bizType);
        }

        public final PdpEnterParam clone() {
            HashMap hashMap = new HashMap(this.requestParams);
            Map map = this.orderRequestParams;
            if (map == null) {
                map = C113554cx.LJJJLIIL();
            }
            HashMap hashMap2 = new HashMap(map);
            Map map2 = this.trackParams;
            if (map2 == null) {
                map2 = C113554cx.LJJJLIIL();
            }
            HashMap hashMap3 = new HashMap(map2);
            Map map3 = this.visitReportParams;
            if (map3 == null) {
                map3 = C113554cx.LJJJLIIL();
            }
            HashMap hashMap4 = new HashMap(map3);
            Map map4 = this.productEnterContext;
            if (map4 == null) {
                map4 = C113554cx.LJJJLIIL();
            }
            return copy$default(this, hashMap, hashMap2, hashMap3, hashMap4, false, null, 0.0f, null, false, false, false, new HashMap(map4), null, new HashMap(this.pdpPreParam), null, null, null, null, 251888, null);
        }

        public final String getProductId() {
            try {
                Object obj = this.requestParams.get("product_id");
                o.LJII(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                return (String) ListProtector.get((List) obj, 0);
            } catch (Exception unused) {
                return "";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11 = this.requestParams.hashCode() * 31;
            HashMap<String, Object> hashMap = this.orderRequestParams;
            int i = 0;
            if (hashMap == null) {
                hashCode = 0;
            } else {
                hashCode = hashMap.hashCode();
            }
            int i2 = (hashCode11 + hashCode) * 31;
            HashMap<String, Object> hashMap2 = this.trackParams;
            if (hashMap2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = hashMap2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            HashMap<String, Object> hashMap3 = this.visitReportParams;
            if (hashMap3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = hashMap3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            boolean z = this.fullScreen;
            int i5 = 1;
            int i6 = z;
            if (z != 0) {
                i6 = 1;
            }
            int i7 = (i4 + i6) * 31;
            List<String> list = this.checkedSkuIds;
            if (list == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = list.hashCode();
            }
            int LIZIZ = C47959Irz.LIZIZ(this.expandHeight, (i7 + hashCode4) * 31, 31);
            Float f = this.collapsedHeight;
            if (f == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = f.hashCode();
            }
            int i8 = (LIZIZ + hashCode5) * 31;
            boolean z2 = this.collapsible;
            int i9 = z2;
            if (z2 != 0) {
                i9 = 1;
            }
            int i10 = (i8 + i9) * 31;
            boolean z3 = this.playerControl;
            int i11 = z3;
            if (z3 != 0) {
                i11 = 1;
            }
            int i12 = (i10 + i11) * 31;
            if (!this.isPromotionPage) {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            HashMap<String, Object> hashMap4 = this.productEnterContext;
            if (hashMap4 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = hashMap4.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            String str = this.pdpCacheKey;
            if (str == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str.hashCode();
            }
            int hashCode12 = (this.pdpPreParam.hashCode() + ((i14 + hashCode7) * 31)) * 31;
            String str2 = this.preTrackNodeId;
            if (str2 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str2.hashCode();
            }
            int i15 = (hashCode12 + hashCode8) * 31;
            String str3 = this.awemeId;
            if (str3 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str3.hashCode();
            }
            int i16 = (i15 + hashCode9) * 31;
            String str4 = this.clickFrom;
            if (str4 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str4.hashCode();
            }
            int i17 = (i16 + hashCode10) * 31;
            Integer num = this.bizType;
            if (num != null) {
                i = num.hashCode();
            }
            return i17 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PdpEnterParam(requestParams=");
            sb.append(this.requestParams);
            sb.append(", orderRequestParams=");
            sb.append(this.orderRequestParams);
            sb.append(", trackParams=");
            sb.append(this.trackParams);
            sb.append(", visitReportParams=");
            sb.append(this.visitReportParams);
            sb.append(", fullScreen=");
            sb.append(this.fullScreen);
            sb.append(", checkedSkuIds=");
            sb.append(this.checkedSkuIds);
            sb.append(", expandHeight=");
            sb.append(this.expandHeight);
            sb.append(", collapsedHeight=");
            sb.append(this.collapsedHeight);
            sb.append(", collapsible=");
            sb.append(this.collapsible);
            sb.append(", playerControl=");
            sb.append(this.playerControl);
            sb.append(", isPromotionPage=");
            sb.append(this.isPromotionPage);
            sb.append(", productEnterContext=");
            sb.append(this.productEnterContext);
            sb.append(", pdpCacheKey=");
            sb.append(this.pdpCacheKey);
            sb.append(", pdpPreParam=");
            sb.append(this.pdpPreParam);
            sb.append(", preTrackNodeId=");
            sb.append(this.preTrackNodeId);
            sb.append(", awemeId=");
            sb.append(this.awemeId);
            sb.append(", clickFrom=");
            sb.append(this.clickFrom);
            sb.append(", bizType=");
            return UC7.LIZ(sb, this.bizType, ')');
        }

        public final String getAwemeId() {
            return this.awemeId;
        }

        public final Integer getBizType() {
            return this.bizType;
        }

        public final String getChainKey() {
            return this.chainKey;
        }

        public final List<String> getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final String getClickFrom() {
            return this.clickFrom;
        }

        public final Float getCollapsedHeight() {
            return this.collapsedHeight;
        }

        public final boolean getCollapsible() {
            return this.collapsible;
        }

        public final float getExpandHeight() {
            return this.expandHeight;
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        public final HashMap<String, Object> getOrderRequestParams() {
            return this.orderRequestParams;
        }

        public final String getPdpCacheKey() {
            return this.pdpCacheKey;
        }

        public final HashMap<String, String> getPdpPreParam() {
            return this.pdpPreParam;
        }

        public final boolean getPlayerControl() {
            return this.playerControl;
        }

        public final String getPreTrackNodeId() {
            return this.preTrackNodeId;
        }

        public final HashMap<String, Object> getProductEnterContext() {
            return this.productEnterContext;
        }

        public final HashMap<String, Object> getRequestParams() {
            return this.requestParams;
        }

        public final String getSourceInfo() {
            return this.sourceInfo;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public final HashMap<String, Object> getVisitReportParams() {
            return this.visitReportParams;
        }

        public final boolean isPromotionPage() {
            return this.isPromotionPage;
        }

        public final void setAwemeId(String str) {
            this.awemeId = str;
        }

        public final void setBizType(Integer num) {
            this.bizType = num;
        }

        public final void setChainKey(String str) {
            this.chainKey = str;
        }

        public final void setCheckedSkuIds(List<String> list) {
            this.checkedSkuIds = list;
        }

        public final void setClickFrom(String str) {
            this.clickFrom = str;
        }

        public final void setFullScreen(boolean z) {
            this.fullScreen = z;
        }

        public final void setPdpCacheKey(String str) {
            this.pdpCacheKey = str;
        }

        public final void setPdpPreParam(HashMap<String, String> hashMap) {
            o.LJIIIZ(hashMap, "<set-?>");
            this.pdpPreParam = hashMap;
        }

        public final void setPreTrackNodeId(String str) {
            this.preTrackNodeId = str;
        }

        public final void setSourceInfo(String str) {
            this.sourceInfo = str;
        }

        public final void updateEntranceInfo(String key, Object value) {
            Object obj;
            String str;
            o.LJIIIZ(key, "key");
            o.LJIIIZ(value, "value");
            HashMap<String, Object> hashMap = this.trackParams;
            HashMap hashMap2 = null;
            if (hashMap != null) {
                obj = hashMap.get("entrance_info");
            } else {
                obj = null;
            }
            if ((obj instanceof String) && (str = (String) obj) != null) {
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(HashMap.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(Object.class)))));
                    if (!(fromJson instanceof HashMap)) {
                        fromJson = null;
                    }
                    hashMap2 = (HashMap) fromJson;
                } catch (s unused) {
                }
                if (hashMap2 != null) {
                    hashMap2.put(key, value);
                    HashMap<String, Object> hashMap3 = this.trackParams;
                    if (hashMap3 != null) {
                        hashMap3.put("entrance_info", C27739Aud.LJI(hashMap2));
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            if (r1 != null) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: Exception -> 0x00d5, TryCatch #0 {Exception -> 0x00d5, blocks: (B:53:0x00b5, B:38:0x00bd, B:40:0x00c1, B:42:0x00c5, B:43:0x00cb, B:45:0x00cf), top: B:52:0x00b5 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PdpEnterParam(java.util.HashMap<java.lang.String, java.lang.Object> r6, java.util.HashMap<java.lang.String, java.lang.Object> r7, java.util.HashMap<java.lang.String, java.lang.Object> r8, java.util.HashMap<java.lang.String, java.lang.Object> r9, boolean r10, java.util.List<java.lang.String> r11, float r12, java.lang.Float r13, boolean r14, boolean r15, boolean r16, java.util.HashMap<java.lang.String, java.lang.Object> r17, java.lang.String r18, java.util.HashMap<java.lang.String, java.lang.String> r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Integer r23) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam.<init>(java.util.HashMap, java.util.HashMap, java.util.HashMap, java.util.HashMap, boolean, java.util.List, float, java.lang.Float, boolean, boolean, boolean, java.util.HashMap, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void");
        }

        public PdpEnterParam(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, boolean z, List list, float f, Float f2, boolean z2, boolean z3, boolean z4, HashMap hashMap5, String str, HashMap hashMap6, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new HashMap() : hashMap, (i & 2) != 0 ? null : hashMap2, (i & 4) != 0 ? null : hashMap3, (i & 8) != 0 ? null : hashMap4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : list, (i & 64) != 0 ? C27162AlK.LIZIZ : f, (i & 128) != 0 ? null : f2, (i & 256) != 0 ? true : z2, (i & 512) == 0 ? z3 : true, (i & 1024) == 0 ? z4 : false, (i & 2048) != 0 ? null : hashMap5, (i & 4096) != 0 ? null : str, (i & FileUtils.BUFFER_SIZE) != 0 ? new HashMap() : hashMap6, (i & 16384) != 0 ? null : str2, (32768 & i) != 0 ? null : str3, (65536 & i) != 0 ? null : str4, (i & 131072) != 0 ? null : num);
        }
    }
}
