package com.ss.android.ugc.aweme.services.publish;

import X.X1D;
import com.ss.android.ugc.aweme.poi.PoiData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishOutput {
    public final String creationId;
    public final String filePath;
    public final boolean isCommercialMusic;
    public final boolean isOriginalSound;
    public final String musicId;
    public final PoiData poiData;

    public static /* synthetic */ PublishOutput copy$default(PublishOutput publishOutput, String str, String str2, String str3, boolean z, boolean z2, PoiData poiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishOutput.creationId;
        }
        if ((i & 2) != 0) {
            str2 = publishOutput.filePath;
        }
        if ((i & 4) != 0) {
            str3 = publishOutput.musicId;
        }
        if ((i & 8) != 0) {
            z = publishOutput.isCommercialMusic;
        }
        if ((i & 16) != 0) {
            z2 = publishOutput.isOriginalSound;
        }
        if ((i & 32) != 0) {
            poiData = publishOutput.poiData;
        }
        return publishOutput.copy(str, str2, str3, z, z2, poiData);
    }

    public static /* synthetic */ void getFilePath$annotations() {
    }

    public final PublishOutput copy(String str, String str2, String str3, boolean z, boolean z2, PoiData poiData) {
        return new PublishOutput(str, str2, str3, z, z2, poiData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishOutput)) {
            return false;
        }
        PublishOutput publishOutput = (PublishOutput) obj;
        return o.LJ(this.creationId, publishOutput.creationId) && o.LJ(this.filePath, publishOutput.filePath) && o.LJ(this.musicId, publishOutput.musicId) && this.isCommercialMusic == publishOutput.isCommercialMusic && this.isOriginalSound == publishOutput.isOriginalSound && o.LJ(this.poiData, publishOutput.poiData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.creationId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.filePath;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.musicId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.isCommercialMusic;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode3 + i) * 31) + (this.isOriginalSound ? 1 : 0)) * 31;
        PoiData poiData = this.poiData;
        return i2 + (poiData != null ? poiData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishOutput(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", filePath=");
        LIZ.append(this.filePath);
        LIZ.append(", musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", isCommercialMusic=");
        LIZ.append(this.isCommercialMusic);
        LIZ.append(", isOriginalSound=");
        LIZ.append(this.isOriginalSound);
        LIZ.append(", poiData=");
        LIZ.append(this.poiData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final PoiData getPoiData() {
        return this.poiData;
    }

    public final boolean isCommercialMusic() {
        return this.isCommercialMusic;
    }

    public final boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public PublishOutput(String str, String str2, String str3, boolean z, boolean z2, PoiData poiData) {
        this.creationId = str;
        this.filePath = str2;
        this.musicId = str3;
        this.isCommercialMusic = z;
        this.isOriginalSound = z2;
        this.poiData = poiData;
    }

    public /* synthetic */ PublishOutput(String str, String str2, String str3, boolean z, boolean z2, PoiData poiData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : poiData);
    }
}
