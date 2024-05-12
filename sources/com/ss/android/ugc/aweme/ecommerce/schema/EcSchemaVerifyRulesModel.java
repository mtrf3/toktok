package com.ss.android.ugc.aweme.ecommerce.schema;

import X.AnonymousClass391;
import X.C1NE;
import X.C61878OQg;
import X.C79062V1e;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcSchemaVerifyRulesModel extends F9E {

    @InterfaceC65349Pkn("block_rules")
    public final BlockRules blockRules;

    @InterfaceC65349Pkn("debug_rules")
    public final DebugRules debugRules;

    @InterfaceC65349Pkn("enable_verify")
    public final boolean enableVerify;

    @InterfaceC65349Pkn("query_rules")
    public final QueryRules queryRules;

    @InterfaceC65349Pkn("schema_rules")
    public final SchemaRules schemaRules;

    /* loaded from: classes2.dex */
    public static final class BlockRules {

        @InterfaceC65349Pkn("block_cross_page")
        public final List<String> blockCrossPage;

        @InterfaceC65349Pkn("block_cross_url")
        public final List<String> blockCrossUrl;

        @InterfaceC65349Pkn("block_native_page")
        public final List<String> blockNativePage;

        @InterfaceC65349Pkn("ignore_page")
        public final List<String> ignorePage;

        public BlockRules() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlockRules)) {
                return false;
            }
            BlockRules blockRules = (BlockRules) obj;
            return o.LJ(this.blockNativePage, blockRules.blockNativePage) && o.LJ(this.blockCrossPage, blockRules.blockCrossPage) && o.LJ(this.blockCrossUrl, blockRules.blockCrossUrl) && o.LJ(this.ignorePage, blockRules.ignorePage);
        }

        public final int hashCode() {
            return this.ignorePage.hashCode() + AnonymousClass391.LIZIZ(this.blockCrossUrl, AnonymousClass391.LIZIZ(this.blockCrossPage, this.blockNativePage.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BlockRules(blockNativePage=");
            LIZ.append(this.blockNativePage);
            LIZ.append(", blockCrossPage=");
            LIZ.append(this.blockCrossPage);
            LIZ.append(", blockCrossUrl=");
            LIZ.append(this.blockCrossUrl);
            LIZ.append(", ignorePage=");
            return C1NE.LIZIZ(LIZ, this.ignorePage, ')', LIZ);
        }

        public BlockRules(List<String> blockNativePage, List<String> blockCrossPage, List<String> blockCrossUrl, List<String> ignorePage) {
            o.LJIIIZ(blockNativePage, "blockNativePage");
            o.LJIIIZ(blockCrossPage, "blockCrossPage");
            o.LJIIIZ(blockCrossUrl, "blockCrossUrl");
            o.LJIIIZ(ignorePage, "ignorePage");
            this.blockNativePage = blockNativePage;
            this.blockCrossPage = blockCrossPage;
            this.blockCrossUrl = blockCrossUrl;
            this.ignorePage = ignorePage;
        }

        public BlockRules(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C61878OQg.INSTANCE : list3, (i & 8) != 0 ? C61878OQg.INSTANCE : list4);
        }
    }

    /* loaded from: classes2.dex */
    public static final class QueryRules {

        @InterfaceC65349Pkn("block_repeat_key")
        public final boolean blockRepeatKey;

        @InterfaceC65349Pkn("http_max_length")
        public final int httpMaxLength;

        @InterfaceC65349Pkn("ignore_key_uri")
        public final List<String> ignoreKeyUri;

        @InterfaceC65349Pkn("key_avoid_encoded")
        public final List<String> keyAvoidEncoded;

        @InterfaceC65349Pkn("key_regex")
        public final String keyRegex;

        @InterfaceC65349Pkn("key_uri")
        public final List<String> keyUri;

        @InterfaceC65349Pkn("value_regex")
        public final String valueRegex;

        @InterfaceC65349Pkn("value_split_limit")
        public final int valueSplitLimit;

        public QueryRules() {
            this(false, null, null, 0, null, null, null, 0, 255, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QueryRules)) {
                return false;
            }
            QueryRules queryRules = (QueryRules) obj;
            return this.blockRepeatKey == queryRules.blockRepeatKey && o.LJ(this.keyRegex, queryRules.keyRegex) && o.LJ(this.valueRegex, queryRules.valueRegex) && this.valueSplitLimit == queryRules.valueSplitLimit && o.LJ(this.keyAvoidEncoded, queryRules.keyAvoidEncoded) && o.LJ(this.keyUri, queryRules.keyUri) && o.LJ(this.ignoreKeyUri, queryRules.ignoreKeyUri) && this.httpMaxLength == queryRules.httpMaxLength;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z = this.blockRepeatKey;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return AnonymousClass391.LIZIZ(this.ignoreKeyUri, AnonymousClass391.LIZIZ(this.keyUri, AnonymousClass391.LIZIZ(this.keyAvoidEncoded, (C79062V1e.LJ(this.valueRegex, C79062V1e.LJ(this.keyRegex, r0 * 31, 31), 31) + this.valueSplitLimit) * 31, 31), 31), 31) + this.httpMaxLength;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("QueryRules(blockRepeatKey=");
            LIZ.append(this.blockRepeatKey);
            LIZ.append(", keyRegex=");
            LIZ.append(this.keyRegex);
            LIZ.append(", valueRegex=");
            LIZ.append(this.valueRegex);
            LIZ.append(", valueSplitLimit=");
            LIZ.append(this.valueSplitLimit);
            LIZ.append(", keyAvoidEncoded=");
            LIZ.append(this.keyAvoidEncoded);
            LIZ.append(", keyUri=");
            LIZ.append(this.keyUri);
            LIZ.append(", ignoreKeyUri=");
            LIZ.append(this.ignoreKeyUri);
            LIZ.append(", httpMaxLength=");
            return b0.LIZJ(LIZ, this.httpMaxLength, ')', LIZ);
        }

        public QueryRules(boolean z, String keyRegex, String valueRegex, int i, List<String> keyAvoidEncoded, List<String> keyUri, List<String> ignoreKeyUri, int i2) {
            o.LJIIIZ(keyRegex, "keyRegex");
            o.LJIIIZ(valueRegex, "valueRegex");
            o.LJIIIZ(keyAvoidEncoded, "keyAvoidEncoded");
            o.LJIIIZ(keyUri, "keyUri");
            o.LJIIIZ(ignoreKeyUri, "ignoreKeyUri");
            this.blockRepeatKey = z;
            this.keyRegex = keyRegex;
            this.valueRegex = valueRegex;
            this.valueSplitLimit = i;
            this.keyAvoidEncoded = keyAvoidEncoded;
            this.keyUri = keyUri;
            this.ignoreKeyUri = ignoreKeyUri;
            this.httpMaxLength = i2;
        }

        public QueryRules(boolean z, String str, String str2, int i, List list, List list2, List list3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) == 0 ? str2 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? C61878OQg.INSTANCE : list, (i3 & 32) != 0 ? C61878OQg.INSTANCE : list2, (i3 & 64) != 0 ? C61878OQg.INSTANCE : list3, (i3 & 128) == 0 ? i2 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SchemaRules {

        @InterfaceC65349Pkn("block_webcast")
        public final boolean blockWebcast;

        @InterfaceC65349Pkn("ignore_max_length")
        public final List<String> ignoreMaxLength;

        @InterfaceC65349Pkn("ignore_webcast")
        public final List<String> ignoreWebcast;

        @InterfaceC65349Pkn("illegal_chars")
        public final List<String> illegalChars;

        @InterfaceC65349Pkn("max_length")
        public final int maxLength;

        @InterfaceC65349Pkn("page_regex")
        public final String pageRegex;

        @InterfaceC65349Pkn("url_regex")
        public final String urlRegex;

        public SchemaRules() {
            this(0, null, null, null, null, false, null, 127, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SchemaRules)) {
                return false;
            }
            SchemaRules schemaRules = (SchemaRules) obj;
            return this.maxLength == schemaRules.maxLength && o.LJ(this.ignoreMaxLength, schemaRules.ignoreMaxLength) && o.LJ(this.illegalChars, schemaRules.illegalChars) && o.LJ(this.pageRegex, schemaRules.pageRegex) && o.LJ(this.urlRegex, schemaRules.urlRegex) && this.blockWebcast == schemaRules.blockWebcast && o.LJ(this.ignoreWebcast, schemaRules.ignoreWebcast);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int LJ = C79062V1e.LJ(this.urlRegex, C79062V1e.LJ(this.pageRegex, AnonymousClass391.LIZIZ(this.illegalChars, AnonymousClass391.LIZIZ(this.ignoreMaxLength, this.maxLength * 31, 31), 31), 31), 31);
            boolean z = this.blockWebcast;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.ignoreWebcast.hashCode() + ((LJ + i) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SchemaRules(maxLength=");
            LIZ.append(this.maxLength);
            LIZ.append(", ignoreMaxLength=");
            LIZ.append(this.ignoreMaxLength);
            LIZ.append(", illegalChars=");
            LIZ.append(this.illegalChars);
            LIZ.append(", pageRegex=");
            LIZ.append(this.pageRegex);
            LIZ.append(", urlRegex=");
            LIZ.append(this.urlRegex);
            LIZ.append(", blockWebcast=");
            LIZ.append(this.blockWebcast);
            LIZ.append(", ignoreWebcast=");
            return C1NE.LIZIZ(LIZ, this.ignoreWebcast, ')', LIZ);
        }

        public SchemaRules(int i, List<String> ignoreMaxLength, List<String> illegalChars, String pageRegex, String urlRegex, boolean z, List<String> ignoreWebcast) {
            o.LJIIIZ(ignoreMaxLength, "ignoreMaxLength");
            o.LJIIIZ(illegalChars, "illegalChars");
            o.LJIIIZ(pageRegex, "pageRegex");
            o.LJIIIZ(urlRegex, "urlRegex");
            o.LJIIIZ(ignoreWebcast, "ignoreWebcast");
            this.maxLength = i;
            this.ignoreMaxLength = ignoreMaxLength;
            this.illegalChars = illegalChars;
            this.pageRegex = pageRegex;
            this.urlRegex = urlRegex;
            this.blockWebcast = z;
            this.ignoreWebcast = ignoreWebcast;
        }

        public SchemaRules(int i, List list, List list2, String str, String str2, boolean z, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list, (i2 & 4) != 0 ? C61878OQg.INSTANCE : list2, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) == 0 ? z : false, (i2 & 64) != 0 ? C61878OQg.INSTANCE : list3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EcSchemaVerifyRulesModel() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableVerify), this.blockRules, this.schemaRules, this.queryRules, this.debugRules};
    }

    /* loaded from: classes2.dex */
    public static final class DebugRules {

        @InterfaceC65349Pkn("toast_code")
        public final List<Integer> toastCode;

        @InterfaceC65349Pkn("toast_interval")
        public final int toastInterval;

        public DebugRules() {
            this(0, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DebugRules)) {
                return false;
            }
            DebugRules debugRules = (DebugRules) obj;
            return this.toastInterval == debugRules.toastInterval && o.LJ(this.toastCode, debugRules.toastCode);
        }

        public final int hashCode() {
            return this.toastCode.hashCode() + (this.toastInterval * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DebugRules(toastInterval=");
            LIZ.append(this.toastInterval);
            LIZ.append(", toastCode=");
            return C1NE.LIZIZ(LIZ, this.toastCode, ')', LIZ);
        }

        public DebugRules(int i, List<Integer> toastCode) {
            o.LJIIIZ(toastCode, "toastCode");
            this.toastInterval = i;
            this.toastCode = toastCode;
        }

        public DebugRules(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list);
        }
    }

    public EcSchemaVerifyRulesModel(boolean z, BlockRules blockRules, SchemaRules schemaRules, QueryRules queryRules, DebugRules debugRules) {
        o.LJIIIZ(blockRules, "blockRules");
        o.LJIIIZ(schemaRules, "schemaRules");
        o.LJIIIZ(queryRules, "queryRules");
        o.LJIIIZ(debugRules, "debugRules");
        this.enableVerify = z;
        this.blockRules = blockRules;
        this.schemaRules = schemaRules;
        this.queryRules = queryRules;
        this.debugRules = debugRules;
    }

    public /* synthetic */ EcSchemaVerifyRulesModel(boolean z, BlockRules blockRules, SchemaRules schemaRules, QueryRules queryRules, DebugRules debugRules, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new BlockRules(null, null, null, null, 15, null) : blockRules, (i & 4) != 0 ? new SchemaRules(0, null, null, null, null, false, null, 127, null) : schemaRules, (i & 8) != 0 ? new QueryRules(false, null, null, 0, null, null, null, 0, 255, null) : queryRules, (i & 16) != 0 ? new DebugRules(0, null, 3, null) : debugRules);
    }
}
