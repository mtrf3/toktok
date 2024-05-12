package com.ss.android.ugc.aweme.tools.draft.entity;

import X.C16880lQ;
import X.C43588H8u;
import X.C47135Ieh;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftShowInfo {

    @InterfaceC65349Pkn("cover_path")
    public final String coverPath;

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    @InterfaceC65349Pkn("music_name")
    public final String musicName;

    @InterfaceC65349Pkn("save_time")
    public long saveTime;

    @InterfaceC65349Pkn("textExtra_strusts")
    public final List<AVTextExtraStruct> textExtraStrusts;

    @InterfaceC65349Pkn("time")
    public final long time;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DraftShowInfo() {
        /*
            r12 = this;
            r1 = 0
            r6 = 0
            r10 = 127(0x7f, float:1.78E-43)
            r0 = r12
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r6
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftShowInfo)) {
            return false;
        }
        DraftShowInfo draftShowInfo = (DraftShowInfo) obj;
        return o.LJ(this.title, draftShowInfo.title) && o.LJ(this.textExtraStrusts, draftShowInfo.textExtraStrusts) && o.LJ(this.coverPath, draftShowInfo.coverPath) && o.LJ(this.musicName, draftShowInfo.musicName) && o.LJ(this.musicId, draftShowInfo.musicId) && this.time == draftShowInfo.time && this.saveTime == draftShowInfo.saveTime;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.title.hashCode() * 31;
        List<AVTextExtraStruct> list = this.textExtraStrusts;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return C16880lQ.LLJIJIL(this.saveTime) + JBR.LIZJ(this.time, C79062V1e.LJ(this.musicId, C79062V1e.LJ(this.musicName, C79062V1e.LJ(this.coverPath, (hashCode2 + hashCode) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftShowInfo(title=");
        LIZ.append(this.title);
        LIZ.append(", textExtraStrusts=");
        LIZ.append(this.textExtraStrusts);
        LIZ.append(", coverPath=");
        LIZ.append(this.coverPath);
        LIZ.append(", musicName=");
        LIZ.append(this.musicName);
        LIZ.append(", musicId=");
        LIZ.append(this.musicId);
        LIZ.append(", time=");
        LIZ.append(this.time);
        LIZ.append(", saveTime=");
        return C47135Ieh.LIZIZ(LIZ, this.saveTime, ')', LIZ);
    }

    public DraftShowInfo(String str, List<AVTextExtraStruct> list, String str2, String str3, String str4, long j, long j2) {
        C43588H8u.LIZLLL(str, "title", str2, "coverPath", str3, "musicName", str4, "musicId");
        this.title = str;
        this.textExtraStrusts = list;
        this.coverPath = str2;
        this.musicName = str3;
        this.musicId = str4;
        this.time = j;
        this.saveTime = j2;
    }

    public /* synthetic */ DraftShowInfo(String str, List list, String str2, String str3, String str4, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? 0L : j, (i & 64) == 0 ? j2 : 0L);
    }
}
