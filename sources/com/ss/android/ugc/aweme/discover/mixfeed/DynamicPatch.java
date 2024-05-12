package com.ss.android.ugc.aweme.discover.mixfeed;

import X.C1NE;
import X.C49306JWs;
import X.C70657RoD;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.model.Layout;
import com.ss.android.ugc.aweme.discover.model.NearByAuth;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class DynamicPatch implements Serializable {
    public List<SearchMultiTabListData> LJLJJL;
    public List<SearchHorizontalTab> LJLJJLL;
    public List<Aweme> LJLJL;

    @InterfaceC65349Pkn("ala_src")
    public String alaSrc;

    @InterfaceC65349Pkn("aweme_list")
    public List<Map<?, ?>> awemeListRaw;

    @InterfaceC65349Pkn("aweme_multi_tab_list")
    public List<Map<?, ?>> awemeMultiTabListRaw;

    @InterfaceC65349Pkn("bullet_schema")
    public String bulletSchema;

    @InterfaceC65349Pkn("encoded_sequence")
    public String encodedSequence;

    @InterfaceC65349Pkn("extra_info")
    public Map<?, ?> extraInfo;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("layout")
    public Layout layout;

    @InterfaceC65349Pkn("nearby_auth")
    public NearByAuth nearByAuth;

    @InterfaceC65349Pkn("origin_type")
    public int originType;

    @InterfaceC65349Pkn("raw_data")
    public String rawData;

    @InterfaceC65349Pkn("related_word_list")
    public List<RelatedWord> relatedWordList;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("tab_map")
    public List<Map<?, ?>> tabMapRaw;

    @InterfaceC65349Pkn("width")
    public int width;
    public final Object LJLIL = new Object();
    public final Gson LJLILLLLZI = new Gson();

    @InterfaceC65349Pkn("qrec_virtual_enable")
    public String qrecVirtualEnable = null;
    public String LJLJI = "";
    public int LJLJJI = -1;

    @InterfaceC65349Pkn("autoplay")
    public boolean autoplay = false;

    /* loaded from: classes9.dex */
    public static class RelatedWord implements Serializable {

        @InterfaceC65349Pkn("related_word")
        public String relatedWord = "";
    }

    /* loaded from: classes9.dex */
    public static class SearchHorizontalTab implements Serializable {

        @InterfaceC65349Pkn("tab_name")
        public String TabName = "";

        @InterfaceC65349Pkn("tab_key_name")
        public String tabKeyName = "";

        @InterfaceC65349Pkn("start")
        public long start = -1;

        @InterfaceC65349Pkn("end")
        public long end = -1;
    }

    /* loaded from: classes9.dex */
    public static class SearchMultiTabListData implements Serializable {

        @InterfaceC65349Pkn("tab_name")
        public String tabName = "";

        @InterfaceC65349Pkn("tab_key")
        public String tabKey = "";

        @InterfaceC65349Pkn("tab_aweme_list")
        public List<Aweme> tabAwemeList = new ArrayList();

        @InterfaceC65349Pkn("tab_extra_data")
        public SearchTabExtraList tabExtraData = null;

        @InterfaceC65349Pkn("backtrace")
        public String backtrace = "";

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore = true;

        @InterfaceC65349Pkn("cursor")
        public long cursor = 0;
    }

    /* loaded from: classes9.dex */
    public static class SearchPoiIdMap implements Serializable {

        @InterfaceC65349Pkn("poi_id")
        public String poiId = "";

        @InterfaceC65349Pkn("item_id")
        public String itemId = "";
    }

    /* loaded from: classes9.dex */
    public static class SearchTabExtraList implements Serializable {

        @InterfaceC65349Pkn("token_type")
        public String tokenType = "";

        @InterfaceC65349Pkn("poi_id_mapping")
        public List<SearchPoiIdMap> poiIdMapping = new ArrayList();
    }

    public List<String> getRelateSearchList() {
        ArrayList arrayList = new ArrayList();
        List<RelatedWord> list = this.relatedWordList;
        if (list != null) {
            Iterator<RelatedWord> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().relatedWord);
            }
        }
        return arrayList;
    }

    public List<SearchHorizontalTab> getTabMap() {
        if (this.LJLJJLL == null && this.tabMapRaw != null) {
            this.LJLJJLL = new ArrayList();
            Iterator<Map<?, ?>> it = this.tabMapRaw.iterator();
            while (it.hasNext()) {
                ((ArrayList) this.LJLJJLL).add(GsonProtectorUtils.fromJson(this.LJLILLLLZI, GsonProtectorUtils.toJson(this.LJLILLLLZI, it.next()), new C49306JWs().getType()));
            }
        }
        return this.LJLJJLL;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Layout layout = this.layout;
        int i5 = 0;
        if (layout != null) {
            i = layout.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.rawData;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.schema;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.bulletSchema;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (((((i8 + i4) * 31) + this.width) * 31) + this.height) * 31;
        List<Map<?, ?>> list = this.awemeListRaw;
        if (list != null) {
            i5 = list.hashCode();
        }
        return i9 + i5;
    }

    public boolean isQrecVirtualEnable() {
        return "1".equals(this.qrecVirtualEnable);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicPatch{key=");
        LIZ.append(this.LJLIL);
        LIZ.append(", layout=");
        LIZ.append(this.layout);
        LIZ.append(", rawData='");
        Q89.LIZIZ(LIZ, this.rawData, '\'', ", schema='");
        Q89.LIZIZ(LIZ, this.schema, '\'', ", bulletSchema='");
        Q89.LIZIZ(LIZ, this.bulletSchema, '\'', ", height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", originType=");
        LIZ.append(this.originType);
        LIZ.append(", =");
        LIZ.append(this.LJLJL);
        LIZ.append(", rawAwemeList=");
        return C1NE.LIZIZ(LIZ, this.awemeListRaw, '}', LIZ);
    }

    public int getAdapterPlayAbleIndex() {
        return this.LJLJJI;
    }

    public String getAlaSrc() {
        return this.alaSrc;
    }

    public List<Aweme> getAwemeList() {
        return this.LJLJL;
    }

    public List<Map<?, ?>> getAwemeListRaw() {
        return this.awemeListRaw;
    }

    public List<SearchMultiTabListData> getAwemeMultiTabList() {
        return this.LJLJJL;
    }

    public List<Map<?, ?>> getAwemeMultiTabListRaw() {
        return this.awemeMultiTabListRaw;
    }

    public String getBulletSchema() {
        return this.bulletSchema;
    }

    public String getDocId() {
        return this.LJLJI;
    }

    public String getEncodedSequence() {
        return this.encodedSequence;
    }

    public int getHeight() {
        return this.height;
    }

    public Object getKey() {
        return this.LJLIL;
    }

    public Layout getLayout() {
        return this.layout;
    }

    public NearByAuth getNearByAuth() {
        return this.nearByAuth;
    }

    public int getOriginType() {
        return this.originType;
    }

    public String getRawData() {
        return this.rawData;
    }

    public String getSchema() {
        return this.schema;
    }

    public Map<?, ?> getSearchEComExtraInfo() {
        return this.extraInfo;
    }

    public List<Map<?, ?>> getTabMapRaw() {
        return this.tabMapRaw;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAutoplay() {
        return this.autoplay;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicPatch)) {
            return false;
        }
        DynamicPatch dynamicPatch = (DynamicPatch) obj;
        if (this.height == dynamicPatch.height && this.width == dynamicPatch.width && C70657RoD.LJII(this.layout, dynamicPatch.layout) && C70657RoD.LJII(this.rawData, dynamicPatch.rawData) && C70657RoD.LJII(this.LJLJL, dynamicPatch.LJLJL) && C70657RoD.LJII(this.awemeListRaw, dynamicPatch.awemeListRaw) && C70657RoD.LJII(this.schema, dynamicPatch.schema) && C70657RoD.LJII(this.bulletSchema, dynamicPatch.bulletSchema)) {
            return true;
        }
        return false;
    }

    public List<Map<?, ?>> getAwemeListRawByPosition(int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ListProtector.get(this.awemeListRaw, i));
        return arrayList;
    }

    public void setAdapterPlayAbleIndex(int i) {
        this.LJLJJI = i;
    }

    public void setAlaSrc(String str) {
        this.alaSrc = str;
    }

    public void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    public void setAwemeList(List<Aweme> list) {
        this.LJLJL = list;
    }

    public void setAwemeListRaw(List<Map<?, ?>> list) {
        this.awemeListRaw = list;
    }

    public void setAwemeMultiTabList(List<SearchMultiTabListData> list) {
        this.LJLJJL = list;
    }

    public void setAwemeMultiTabListRaw(List<Map<?, ?>> list) {
        this.awemeMultiTabListRaw = list;
    }

    public void setBulletSchema(String str) {
        this.bulletSchema = str;
    }

    public void setDocId(String str) {
        this.LJLJI = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public void setNearByAuth(NearByAuth nearByAuth) {
        this.nearByAuth = nearByAuth;
    }

    public void setOriginType(int i) {
        this.originType = i;
    }

    public void setRawData(String str) {
        this.rawData = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchEComExtraInfo(Map<?, ?> map) {
        this.extraInfo = map;
    }

    public void setTabMapRaw(List<Map<?, ?>> list) {
        this.tabMapRaw = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
