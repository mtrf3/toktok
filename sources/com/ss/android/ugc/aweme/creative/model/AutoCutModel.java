package com.ss.android.ugc.aweme.creative.model;

import X.C05040Hs;
import X.C1FJ;
import X.C279017q;
import X.C63A;
import X.GPV;
import X.HJV;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutModel implements Parcelable {
    public static final Parcelable.Creator<AutoCutModel> CREATOR = new HJV();

    @GPV
    public AutoCutAsyncRenderModel asyncRenderModel;

    @GPV
    public boolean backwardAutoCutProcess;

    @InterfaceC65349Pkn("autocut_click_from")
    public String clickFrom;

    @InterfaceC65349Pkn("autocut_current_index")
    public int curIndexFromSource;

    @GPV
    public List<AutoCutMediaModel> curMediaList;

    @InterfaceC65349Pkn("autocut_cur_recommend_titles")
    public List<AutoCutTitle> curRecommendTitleList;

    @InterfaceC65349Pkn("autocut_current_source")
    public int curSource;

    @InterfaceC65349Pkn("autocut_template_group_id")
    public String curTemplateGroupId;

    @InterfaceC65349Pkn("autocut_template_id")
    public String curTemplateId;

    @InterfaceC65349Pkn("autocut_template_type")
    public int curTemplateType;

    @InterfaceC65349Pkn("autocut_media_list")
    public final List<AutoCutMediaModel> mediaList;

    @GPV
    public Long optimizeLargeNLEId;

    @InterfaceC65349Pkn("reuse_music_type")
    public String reuseMusicType;

    @InterfaceC65349Pkn("autocut_sound_sync_model")
    public AutoCutSoundSyncModel soundSyncModel;

    @InterfaceC65349Pkn("autocut_speed_variation_type")
    public Integer speedVariationType;

    @InterfaceC65349Pkn("autocut_task_id")
    public String taskId;

    @InterfaceC65349Pkn("autocut_music_list")
    public List<AutoCutThemeData> templateList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoCutModel() {
        /*
            r20 = this;
            r1 = 0
            r4 = 0
            r18 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r20
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r1
            r7 = r1
            r8 = r4
            r9 = r4
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r19 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.AutoCutModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.templateList, out);
        while (LIZJ.hasNext()) {
            ((AutoCutThemeData) LIZJ.next()).writeToParcel(out, i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.mediaList, out);
        while (LIZJ2.hasNext()) {
            ((AutoCutMediaModel) LIZJ2.next()).writeToParcel(out, i);
        }
        out.writeString(this.taskId);
        out.writeInt(this.curIndexFromSource);
        out.writeInt(this.curSource);
        out.writeString(this.clickFrom);
        this.soundSyncModel.writeToParcel(out, i);
        out.writeInt(this.curTemplateType);
        out.writeInt(this.backwardAutoCutProcess ? 1 : 0);
        this.asyncRenderModel.writeToParcel(out, i);
        out.writeString(this.reuseMusicType);
        List<AutoCutMediaModel> list = this.curMediaList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((AutoCutMediaModel) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.curTemplateId);
        List<AutoCutTitle> list2 = this.curRecommendTitleList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((AutoCutTitle) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        Integer num = this.speedVariationType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.curTemplateGroupId);
        Long l = this.optimizeLargeNLEId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
    }

    public AutoCutModel(List<AutoCutThemeData> templateList, List<AutoCutMediaModel> mediaList, String str, int i, int i2, String str2, AutoCutSoundSyncModel soundSyncModel, int i3, boolean z, AutoCutAsyncRenderModel asyncRenderModel, String reuseMusicType, List<AutoCutMediaModel> list, String str3, List<AutoCutTitle> list2, Integer num, String str4, Long l) {
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(mediaList, "mediaList");
        o.LJIIIZ(soundSyncModel, "soundSyncModel");
        o.LJIIIZ(asyncRenderModel, "asyncRenderModel");
        o.LJIIIZ(reuseMusicType, "reuseMusicType");
        this.templateList = templateList;
        this.mediaList = mediaList;
        this.taskId = str;
        this.curIndexFromSource = i;
        this.curSource = i2;
        this.clickFrom = str2;
        this.soundSyncModel = soundSyncModel;
        this.curTemplateType = i3;
        this.backwardAutoCutProcess = z;
        this.asyncRenderModel = asyncRenderModel;
        this.reuseMusicType = reuseMusicType;
        this.curMediaList = list;
        this.curTemplateId = str3;
        this.curRecommendTitleList = list2;
        this.speedVariationType = num;
        this.curTemplateGroupId = str4;
        this.optimizeLargeNLEId = l;
    }

    public /* synthetic */ AutoCutModel(List list, List list2, String str, int i, int i2, String str2, AutoCutSoundSyncModel autoCutSoundSyncModel, int i3, boolean z, AutoCutAsyncRenderModel autoCutAsyncRenderModel, String str3, List list3, String str4, List list4, Integer num, String str5, Long l, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new ArrayList() : list, (i4 & 2) != 0 ? new ArrayList() : list2, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? -1 : i, (i4 & 16) != 0 ? C63A.AUTO_CUT.ordinal() : i2, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? new AutoCutSoundSyncModel(null, null, 0, 7, null) : autoCutSoundSyncModel, (i4 & 128) == 0 ? i3 : -1, (i4 & 256) != 0 ? false : z, (i4 & 512) != 0 ? new AutoCutAsyncRenderModel(0) : autoCutAsyncRenderModel, (i4 & 1024) != 0 ? "other" : str3, (i4 & 2048) != 0 ? null : list3, (i4 & 4096) != 0 ? null : str4, (i4 & FileUtils.BUFFER_SIZE) != 0 ? null : list4, (i4 & 16384) != 0 ? null : num, (32768 & i4) != 0 ? null : str5, (i4 & 65536) != 0 ? null : l);
    }
}
