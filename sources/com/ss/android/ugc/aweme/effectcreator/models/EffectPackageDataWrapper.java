package com.ss.android.ugc.aweme.effectcreator.models;

import X.C36439ERv;
import X.C61878OQg;
import X.F9E;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EffectPackageDataWrapper extends F9E implements Parcelable {
    public static final Parcelable.Creator<EffectPackageDataWrapper> CREATOR = new C36439ERv();
    public final String ameSaveFrom;
    public List<EffectHintWrapper> availableEffectHintList;
    public final int commandCount;
    public final List<EffectCommandDataWrapper> commandDataList;
    public final String defaultIconFeatureId;
    public final String defaultIconType;
    public final long duration;
    public final String enterFrom;
    public final long interactionDuration;
    public final long layerDuration;
    public final int objectCount;
    public final List<EffectObjectDataWrapper> objectDataList;
    public final String projectId;
    public final long projectSize;
    public final String projectSource;
    public final String publishSource;
    public final int sequenceCount;
    public final String templateId;
    public final String templateResId;
    public final int validActionCount;
    public final int validCommandCount;

    public EffectPackageDataWrapper() {
        this(null, null, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0, 0, 0, 0, 0, null, null, null, null, 2097151);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.projectId, this.projectSource, this.publishSource, this.enterFrom, this.templateId, this.defaultIconType, this.defaultIconFeatureId, this.templateResId, Long.valueOf(this.projectSize), Long.valueOf(this.duration), Long.valueOf(this.layerDuration), Long.valueOf(this.interactionDuration), Integer.valueOf(this.objectCount), Integer.valueOf(this.commandCount), Integer.valueOf(this.validCommandCount), Integer.valueOf(this.validActionCount), Integer.valueOf(this.sequenceCount), this.objectDataList, this.commandDataList, this.ameSaveFrom, this.availableEffectHintList};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.projectId);
        out.writeString(this.projectSource);
        out.writeString(this.publishSource);
        out.writeString(this.enterFrom);
        out.writeString(this.templateId);
        out.writeString(this.defaultIconType);
        out.writeString(this.defaultIconFeatureId);
        out.writeString(this.templateResId);
        out.writeLong(this.projectSize);
        out.writeLong(this.duration);
        out.writeLong(this.layerDuration);
        out.writeLong(this.interactionDuration);
        out.writeInt(this.objectCount);
        out.writeInt(this.commandCount);
        out.writeInt(this.validCommandCount);
        out.writeInt(this.validActionCount);
        out.writeInt(this.sequenceCount);
        Iterator LIZJ = UC7.LIZJ(this.objectDataList, out);
        while (LIZJ.hasNext()) {
            ((EffectObjectDataWrapper) LIZJ.next()).writeToParcel(out, i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.commandDataList, out);
        while (LIZJ2.hasNext()) {
            ((EffectCommandDataWrapper) LIZJ2.next()).writeToParcel(out, i);
        }
        out.writeString(this.ameSaveFrom);
        Iterator LIZJ3 = UC7.LIZJ(this.availableEffectHintList, out);
        while (LIZJ3.hasNext()) {
            ((EffectHintWrapper) LIZJ3.next()).writeToParcel(out, i);
        }
    }

    public EffectPackageDataWrapper(String projectId, String projectSource, String publishSource, String enterFrom, String templateId, String defaultIconType, String defaultIconFeatureId, String templateResId, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, List<EffectObjectDataWrapper> objectDataList, List<EffectCommandDataWrapper> commandDataList, String ameSaveFrom, List<EffectHintWrapper> availableEffectHintList) {
        o.LJIIIZ(projectId, "projectId");
        o.LJIIIZ(projectSource, "projectSource");
        o.LJIIIZ(publishSource, "publishSource");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(defaultIconType, "defaultIconType");
        o.LJIIIZ(defaultIconFeatureId, "defaultIconFeatureId");
        o.LJIIIZ(templateResId, "templateResId");
        o.LJIIIZ(objectDataList, "objectDataList");
        o.LJIIIZ(commandDataList, "commandDataList");
        o.LJIIIZ(ameSaveFrom, "ameSaveFrom");
        o.LJIIIZ(availableEffectHintList, "availableEffectHintList");
        this.projectId = projectId;
        this.projectSource = projectSource;
        this.publishSource = publishSource;
        this.enterFrom = enterFrom;
        this.templateId = templateId;
        this.defaultIconType = defaultIconType;
        this.defaultIconFeatureId = defaultIconFeatureId;
        this.templateResId = templateResId;
        this.projectSize = j;
        this.duration = j2;
        this.layerDuration = j3;
        this.interactionDuration = j4;
        this.objectCount = i;
        this.commandCount = i2;
        this.validCommandCount = i3;
        this.validActionCount = i4;
        this.sequenceCount = i5;
        this.objectDataList = objectDataList;
        this.commandDataList = commandDataList;
        this.ameSaveFrom = ameSaveFrom;
        this.availableEffectHintList = availableEffectHintList;
    }

    public EffectPackageDataWrapper(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, long j2, long j3, long j4, int i, int i2, int i3, int i4, int i5, List list, List list2, String str9, List list3, int i6) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? "" : str5, (i6 & 32) != 0 ? "" : str6, (i6 & 64) != 0 ? "" : str7, (i6 & 128) != 0 ? "" : str8, (i6 & 256) != 0 ? 0L : j, (i6 & 512) != 0 ? 0L : j2, (i6 & 1024) != 0 ? 0L : j3, (i6 & 2048) == 0 ? j4 : 0L, (i6 & 4096) != 0 ? 0 : i, (i6 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i2, (i6 & 16384) != 0 ? 0 : i3, (32768 & i6) != 0 ? 0 : i4, (65536 & i6) == 0 ? i5 : 0, (131072 & i6) != 0 ? C61878OQg.INSTANCE : list, (262144 & i6) != 0 ? C61878OQg.INSTANCE : list2, (524288 & i6) == 0 ? str9 : "", (i6 & 1048576) != 0 ? C61878OQg.INSTANCE : list3);
    }
}
