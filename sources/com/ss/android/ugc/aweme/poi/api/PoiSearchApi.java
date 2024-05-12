package com.ss.android.ugc.aweme.poi.api;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C1JX;
import X.C1NE;
import X.C770830u;
import X.C78920UyC;
import X.C85269XdJ;
import X.C85322XeA;
import X.C85323XeB;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC27211Am7;
import X.InterfaceC64987Pex;
import X.InterfaceC65002PfC;
import X.InterfaceC65349Pkn;
import X.InterfaceC67352kd;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import defpackage.b0;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public interface PoiSearchApi {
    public static final C85269XdJ LIZ = C85269XdJ.LIZ;

    /* loaded from: classes16.dex */
    public static final class PoiGroup implements Serializable {

        @InterfaceC65349Pkn("center_latitude")
        public final double latitude;

        @InterfaceC65349Pkn("center_longitude")
        public final double longitude;

        @InterfaceC65349Pkn("poi")
        public final List<PoiData> poiList;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PoiGroup() {
            /*
                r8 = this;
                r1 = 0
                r5 = 0
                r6 = 7
                r0 = r8
                r3 = r1
                r7 = r5
                r0.<init>(r1, r3, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiGroup.<init>():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PoiGroup copy$default(PoiGroup poiGroup, double d, double d2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                d = poiGroup.latitude;
            }
            if ((i & 2) != 0) {
                d2 = poiGroup.longitude;
            }
            if ((i & 4) != 0) {
                list = poiGroup.poiList;
            }
            return poiGroup.copy(d, d2, list);
        }

        public final PoiGroup copy(double d, double d2, List<PoiData> list) {
            return new PoiGroup(d, d2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiGroup)) {
                return false;
            }
            PoiGroup poiGroup = (PoiGroup) obj;
            return Double.compare(this.latitude, poiGroup.latitude) == 0 && Double.compare(this.longitude, poiGroup.longitude) == 0 && o.LJ(this.poiList, poiGroup.poiList);
        }

        public int hashCode() {
            int hashCode;
            int LIZIZ = C1JX.LIZIZ(this.longitude, C16880lQ.LLJI(this.latitude) * 31, 31);
            List<PoiData> list = this.poiList;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return LIZIZ + hashCode;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiGroup(latitude=");
            LIZ.append(this.latitude);
            LIZ.append(", longitude=");
            LIZ.append(this.longitude);
            LIZ.append(", poiList=");
            return C1NE.LIZIZ(LIZ, this.poiList, ')', LIZ);
        }

        public final double getLatitude() {
            return this.latitude;
        }

        public final double getLongitude() {
            return this.longitude;
        }

        public final List<PoiData> getPoiList() {
            return this.poiList;
        }

        public PoiGroup(double d, double d2, List<PoiData> list) {
            this.latitude = d;
            this.longitude = d2;
            this.poiList = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ PoiGroup(double r7, double r9, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r6 = this;
                r1 = r7
                r5 = r11
                r0 = r12 & 1
                r3 = 0
                if (r0 == 0) goto La
                r1 = 0
            La:
                r0 = r12 & 2
                if (r0 == 0) goto L18
            Le:
                r0 = r12 & 4
                if (r0 == 0) goto L13
                r5 = 0
            L13:
                r0 = r6
                r0.<init>(r1, r3, r5)
                return
            L18:
                r3 = r9
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiGroup.<init>(double, double, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* loaded from: classes7.dex */
    public static final class PoiSearchRecallResult extends BaseResponse implements Serializable {
        public static final C85322XeA Companion = new C85322XeA();

        @InterfaceC65349Pkn("cacheForSearch")
        public final Boolean cacheForSearch;

        @InterfaceC65349Pkn("status_code")
        public final Integer code;

        @InterfaceC65349Pkn("logid")
        public final String logId;

        @InterfaceC65349Pkn("status_msg")
        public final String msg;

        @InterfaceC65349Pkn("poi_group")
        public final List<PoiGroup> poiGroup;

        /* JADX WARN: Multi-variable type inference failed */
        public PoiSearchRecallResult() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PoiSearchRecallResult copy$default(PoiSearchRecallResult poiSearchRecallResult, Integer num, String str, String str2, List list, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                num = poiSearchRecallResult.code;
            }
            if ((i & 2) != 0) {
                str = poiSearchRecallResult.msg;
            }
            if ((i & 4) != 0) {
                str2 = poiSearchRecallResult.logId;
            }
            if ((i & 8) != 0) {
                list = poiSearchRecallResult.poiGroup;
            }
            if ((i & 16) != 0) {
                bool = poiSearchRecallResult.cacheForSearch;
            }
            return poiSearchRecallResult.copy(num, str, str2, list, bool);
        }

        public final PoiSearchRecallResult copy(Integer num, String str, String str2, List<PoiGroup> list, Boolean bool) {
            return new PoiSearchRecallResult(num, str, str2, list, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiSearchRecallResult)) {
                return false;
            }
            PoiSearchRecallResult poiSearchRecallResult = (PoiSearchRecallResult) obj;
            return o.LJ(this.code, poiSearchRecallResult.code) && o.LJ(this.msg, poiSearchRecallResult.msg) && o.LJ(this.logId, poiSearchRecallResult.logId) && o.LJ(this.poiGroup, poiSearchRecallResult.poiGroup) && o.LJ(this.cacheForSearch, poiSearchRecallResult.cacheForSearch);
        }

        public int hashCode() {
            Integer num = this.code;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.msg;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<PoiGroup> list = this.poiGroup;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.cacheForSearch;
            return hashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean isSuccessful$poi_release() {
            if (this.status_code == 0) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiSearchRecallResult(code=");
            LIZ.append(this.code);
            LIZ.append(", msg=");
            LIZ.append(this.msg);
            LIZ.append(", logId=");
            LIZ.append(this.logId);
            LIZ.append(", poiGroup=");
            LIZ.append(this.poiGroup);
            LIZ.append(", cacheForSearch=");
            return C78920UyC.LIZIZ(LIZ, this.cacheForSearch, ')', LIZ);
        }

        public final Boolean getCacheForSearch() {
            return this.cacheForSearch;
        }

        public final Integer getCode() {
            return this.code;
        }

        public final String getLogId() {
            return this.logId;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final List<PoiGroup> getPoiGroup() {
            return this.poiGroup;
        }

        public PoiSearchRecallResult(Integer num, String str, String str2, List<PoiGroup> list, Boolean bool) {
            int i;
            this.code = num;
            this.msg = str;
            this.logId = str2;
            this.poiGroup = list;
            this.cacheForSearch = bool;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            this.status_code = i;
            this.status_msg = str;
        }

        public /* synthetic */ PoiSearchRecallResult(Integer num, String str, String str2, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) == 0 ? bool : null);
        }
    }

    @E4Q("/tiktok/poi/pub/popup/v1")
    Object isPopupEnable(InterfaceC67352kd<? super PopupEnableResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E4T("tiktok/poi/re_tag/v1")
    Object reTagPoiV1(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("poi_id") String str2, @InterfaceC64987Pex("anchor_content") String str3, InterfaceC67352kd<? super PoiReTagResponse> interfaceC67352kd);

    @E4T("tiktok/poi/api/searchplace")
    AbstractC73672Svk<String> searchPoi(@InterfaceC65002PfC("Content-Type") String str, @InterfaceC65002PfC("sgn") String str2, @InterfaceC65002PfC("biz") String str3, @InterfaceC27211Am7 PoiSearchRequestBody poiSearchRequestBody);

    @E4T("tiktok/poi/api/searchrecall")
    AbstractC73672Svk<String> searchRecall(@InterfaceC65002PfC("Content-Type") String str, @InterfaceC65002PfC("sgn") String str2, @InterfaceC65002PfC("biz") String str3, @InterfaceC27211Am7 PoiSearchRequestBody poiSearchRequestBody);

    /* loaded from: classes2.dex */
    public static final class PoiReTagResponse {

        @InterfaceC65349Pkn("aweme")
        public final Aweme aweme;

        @InterfaceC65349Pkn("status_code")
        public final int code;

        @InterfaceC65349Pkn("status_msg")
        public final String msg;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiReTagResponse)) {
                return false;
            }
            PoiReTagResponse poiReTagResponse = (PoiReTagResponse) obj;
            return this.code == poiReTagResponse.code && o.LJ(this.msg, poiReTagResponse.msg) && o.LJ(this.aweme, poiReTagResponse.aweme);
        }

        public final int hashCode() {
            int i = this.code * 31;
            String str = this.msg;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            Aweme aweme = this.aweme;
            return hashCode + (aweme != null ? aweme.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiReTagResponse(code=");
            LIZ.append(this.code);
            LIZ.append(", msg=");
            LIZ.append(this.msg);
            LIZ.append(", aweme=");
            return C770830u.LIZ(LIZ, this.aweme, ')', LIZ);
        }

        public PoiReTagResponse(int i, String str, Aweme aweme) {
            this.code = i;
            this.msg = str;
            this.aweme = aweme;
        }

        public /* synthetic */ PoiReTagResponse(int i, String str, Aweme aweme, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? "" : str, aweme);
        }
    }

    /* loaded from: classes16.dex */
    public static final class PoiSearchResult implements Serializable {
        public static final C85323XeB Companion = new C85323XeB();

        @InterfaceC65349Pkn("cache_for_search")
        public final Boolean isCacheForSearch;

        @InterfaceC65349Pkn("length")
        public final int length;

        @InterfaceC65349Pkn("logid")
        public final String logId;

        @InterfaceC65349Pkn("page")
        public final int page;

        @InterfaceC65349Pkn("poi")
        public final List<PoiData> poiList;

        @InterfaceC65349Pkn("size")
        public final int size;

        @InterfaceC65349Pkn("total")
        public final int total;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PoiSearchResult copy$default(PoiSearchResult poiSearchResult, int i, int i2, int i3, int i4, String str, List list, Boolean bool, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = poiSearchResult.total;
            }
            if ((i5 & 2) != 0) {
                i2 = poiSearchResult.length;
            }
            if ((i5 & 4) != 0) {
                i3 = poiSearchResult.page;
            }
            if ((i5 & 8) != 0) {
                i4 = poiSearchResult.size;
            }
            if ((i5 & 16) != 0) {
                str = poiSearchResult.logId;
            }
            if ((i5 & 32) != 0) {
                list = poiSearchResult.poiList;
            }
            if ((i5 & 64) != 0) {
                bool = poiSearchResult.isCacheForSearch;
            }
            return poiSearchResult.copy(i, i2, i3, i4, str, list, bool);
        }

        public final PoiSearchResult copy(int i, int i2, int i3, int i4, String str, List<PoiData> list, Boolean bool) {
            return new PoiSearchResult(i, i2, i3, i4, str, list, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiSearchResult)) {
                return false;
            }
            PoiSearchResult poiSearchResult = (PoiSearchResult) obj;
            return this.total == poiSearchResult.total && this.length == poiSearchResult.length && this.page == poiSearchResult.page && this.size == poiSearchResult.size && o.LJ(this.logId, poiSearchResult.logId) && o.LJ(this.poiList, poiSearchResult.poiList) && o.LJ(this.isCacheForSearch, poiSearchResult.isCacheForSearch);
        }

        public int hashCode() {
            int i = ((((((this.total * 31) + this.length) * 31) + this.page) * 31) + this.size) * 31;
            String str = this.logId;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            List<PoiData> list = this.poiList;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isCacheForSearch;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiSearchResult(total=");
            LIZ.append(this.total);
            LIZ.append(", length=");
            LIZ.append(this.length);
            LIZ.append(", page=");
            LIZ.append(this.page);
            LIZ.append(", size=");
            LIZ.append(this.size);
            LIZ.append(", logId=");
            LIZ.append(this.logId);
            LIZ.append(", poiList=");
            LIZ.append(this.poiList);
            LIZ.append(", isCacheForSearch=");
            return C78920UyC.LIZIZ(LIZ, this.isCacheForSearch, ')', LIZ);
        }

        public final int getLength() {
            return this.length;
        }

        public final String getLogId() {
            return this.logId;
        }

        public final int getPage() {
            return this.page;
        }

        public final List<PoiData> getPoiList() {
            return this.poiList;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getTotal() {
            return this.total;
        }

        public final Boolean isCacheForSearch() {
            return this.isCacheForSearch;
        }

        public PoiSearchResult(int i, int i2, int i3, int i4, String str, List<PoiData> list, Boolean bool) {
            this.total = i;
            this.length = i2;
            this.page = i3;
            this.size = i4;
            this.logId = str;
            this.poiList = list;
            this.isCacheForSearch = bool;
        }

        public /* synthetic */ PoiSearchResult(int i, int i2, int i3, int i4, String str, List list, Boolean bool, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, i4, (i5 & 16) != 0 ? null : str, (i5 & 32) != 0 ? null : list, (i5 & 64) == 0 ? bool : null);
        }
    }

    /* loaded from: classes16.dex */
    public static final class PoiSearchResultWrapper extends BaseResponse {
        public static final /* synthetic */ int LJLIL = 0;

        @InterfaceC65349Pkn("code")
        public final int code;

        @InterfaceC65349Pkn("hint_main_title")
        public final String hintMainTitle;

        @InterfaceC65349Pkn("hint_subtitle")
        public final String hintSubtitle;

        @InterfaceC65349Pkn("data")
        public final PoiSearchResult poiSearchResult;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiSearchResultWrapper)) {
                return false;
            }
            PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchResultWrapper) obj;
            return this.code == poiSearchResultWrapper.code && o.LJ(this.poiSearchResult, poiSearchResultWrapper.poiSearchResult) && o.LJ(this.hintMainTitle, poiSearchResultWrapper.hintMainTitle) && o.LJ(this.hintSubtitle, poiSearchResultWrapper.hintSubtitle);
        }

        public final int hashCode() {
            int i = this.code * 31;
            PoiSearchResult poiSearchResult = this.poiSearchResult;
            int hashCode = (i + (poiSearchResult == null ? 0 : poiSearchResult.hashCode())) * 31;
            String str = this.hintMainTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hintSubtitle;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiSearchResultWrapper(code=");
            LIZ.append(this.code);
            LIZ.append(", poiSearchResult=");
            LIZ.append(this.poiSearchResult);
            LIZ.append(", hintMainTitle=");
            LIZ.append(this.hintMainTitle);
            LIZ.append(", hintSubtitle=");
            return q.LIZIZ(LIZ, this.hintSubtitle, ')', LIZ);
        }

        public PoiSearchResultWrapper(int i, PoiSearchResult poiSearchResult, String str, String str2) {
            this.code = i;
            this.poiSearchResult = poiSearchResult;
            this.hintMainTitle = str;
            this.hintSubtitle = str2;
        }

        public /* synthetic */ PoiSearchResultWrapper(int i, PoiSearchResult poiSearchResult, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : poiSearchResult, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PopupEnableResponse {

        @InterfaceC65349Pkn("status_code")
        public final int code;

        @InterfaceC65349Pkn("status_msg")
        public final String msg;

        @InterfaceC65349Pkn("popup_res")
        public final int popupRes;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PopupEnableResponse)) {
                return false;
            }
            PopupEnableResponse popupEnableResponse = (PopupEnableResponse) obj;
            return this.code == popupEnableResponse.code && o.LJ(this.msg, popupEnableResponse.msg) && this.popupRes == popupEnableResponse.popupRes;
        }

        public final int hashCode() {
            int i = this.code * 31;
            String str = this.msg;
            return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.popupRes;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PopupEnableResponse(code=");
            LIZ.append(this.code);
            LIZ.append(", msg=");
            LIZ.append(this.msg);
            LIZ.append(", popupRes=");
            return b0.LIZJ(LIZ, this.popupRes, ')', LIZ);
        }

        public PopupEnableResponse(int i, String str, int i2) {
            this.code = i;
            this.msg = str;
            this.popupRes = i2;
        }

        public /* synthetic */ PopupEnableResponse(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i2);
        }
    }
}
