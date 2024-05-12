package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EntityCardTitle {
    public long LIZ;

    @InterfaceC65349Pkn("dynamic_patch")
    public final DynamicPatch dynamicPatch;

    @InterfaceC65349Pkn("entity_name")
    public final String entityName;

    @InterfaceC65349Pkn("entity_summary")
    public final String entitySummary;

    @InterfaceC65349Pkn("entity_title")
    public final String entityTitle;

    @InterfaceC65349Pkn("imdb_info")
    public final IMDBResource imdbInfo;

    @InterfaceC65349Pkn("label_info")
    public final EntityCardLabel labelInfo;

    @InterfaceC65349Pkn("title_style")
    public final int titleStyle;

    @InterfaceC65349Pkn("wiki_info")
    public final WikiResource wikiInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public EntityCardTitle() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityCardTitle)) {
            return false;
        }
        EntityCardTitle entityCardTitle = (EntityCardTitle) obj;
        return this.LIZ == entityCardTitle.LIZ && o.LJ(this.entityName, entityCardTitle.entityName) && o.LJ(this.entityTitle, entityCardTitle.entityTitle) && o.LJ(this.entitySummary, entityCardTitle.entitySummary) && o.LJ(this.labelInfo, entityCardTitle.labelInfo) && o.LJ(this.dynamicPatch, entityCardTitle.dynamicPatch) && this.titleStyle == entityCardTitle.titleStyle && o.LJ(this.wikiInfo, entityCardTitle.wikiInfo) && o.LJ(this.imdbInfo, entityCardTitle.imdbInfo);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        String str = this.entityName;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entityTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entitySummary;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EntityCardLabel entityCardLabel = this.labelInfo;
        int hashCode4 = (hashCode3 + (entityCardLabel == null ? 0 : entityCardLabel.hashCode())) * 31;
        DynamicPatch dynamicPatch = this.dynamicPatch;
        int hashCode5 = (((hashCode4 + (dynamicPatch == null ? 0 : dynamicPatch.hashCode())) * 31) + this.titleStyle) * 31;
        WikiResource wikiResource = this.wikiInfo;
        int hashCode6 = (hashCode5 + (wikiResource == null ? 0 : wikiResource.hashCode())) * 31;
        IMDBResource iMDBResource = this.imdbInfo;
        return hashCode6 + (iMDBResource != null ? iMDBResource.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EntityCardTitle(docId=");
        LIZ.append(this.LIZ);
        LIZ.append(", entityName=");
        LIZ.append(this.entityName);
        LIZ.append(", entityTitle=");
        LIZ.append(this.entityTitle);
        LIZ.append(", entitySummary=");
        LIZ.append(this.entitySummary);
        LIZ.append(", labelInfo=");
        LIZ.append(this.labelInfo);
        LIZ.append(", dynamicPatch=");
        LIZ.append(this.dynamicPatch);
        LIZ.append(", titleStyle=");
        LIZ.append(this.titleStyle);
        LIZ.append(", wikiInfo=");
        LIZ.append(this.wikiInfo);
        LIZ.append(", imdbInfo=");
        LIZ.append(this.imdbInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public EntityCardTitle(long j, String str, String str2, String str3, EntityCardLabel entityCardLabel, DynamicPatch dynamicPatch, int i, WikiResource wikiResource, IMDBResource iMDBResource) {
        this.LIZ = j;
        this.entityName = str;
        this.entityTitle = str2;
        this.entitySummary = str3;
        this.labelInfo = entityCardLabel;
        this.dynamicPatch = dynamicPatch;
        this.titleStyle = i;
        this.wikiInfo = wikiResource;
        this.imdbInfo = iMDBResource;
    }

    public /* synthetic */ EntityCardTitle(long j, String str, String str2, String str3, EntityCardLabel entityCardLabel, DynamicPatch dynamicPatch, int i, WikiResource wikiResource, IMDBResource iMDBResource, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : entityCardLabel, (i2 & 32) != 0 ? null : dynamicPatch, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : wikiResource, (i2 & 256) == 0 ? iMDBResource : null);
    }
}
