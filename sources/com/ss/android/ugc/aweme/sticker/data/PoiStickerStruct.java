package com.ss.android.ugc.aweme.sticker.data;

import X.F9E;
import X.InterfaceC137125Zs;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.poi.PoiData;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class PoiStickerStruct extends F9E implements Serializable, InterfaceC137125Zs {

    @InterfaceC65349Pkn("end_time")
    public int endTime;

    @InterfaceC65349Pkn("poi_data")
    public PoiData poiData;

    @InterfaceC65349Pkn("poi_id")
    public String poiId;

    @InterfaceC65349Pkn("start_time")
    public int startTime;

    @InterfaceC65349Pkn("sticker_theme")
    public int stickerTheme;

    public PoiStickerStruct() {
    }

    public static /* synthetic */ PoiStickerStruct copy$default(PoiStickerStruct poiStickerStruct, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiStickerStruct.poiId;
        }
        return poiStickerStruct.copy(str);
    }

    public final PoiStickerStruct copy(String poiId) {
        o.LJIIIZ(poiId, "poiId");
        return new PoiStickerStruct(poiId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.poiId};
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final PoiData getPoiData() {
        return this.poiData;
    }

    public final String getPoiId() {
        return this.poiId;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getStickerTheme() {
        return this.stickerTheme;
    }

    public PoiStickerStruct(String poiId) {
        o.LJIIIZ(poiId, "poiId");
        this.poiId = poiId;
        this.stickerTheme = 1;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setPoiData(PoiData poiData) {
        this.poiData = poiData;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setStickerTheme(int i) {
        this.stickerTheme = i;
    }
}
