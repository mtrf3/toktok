package com.ss.android.ugc.aweme.shortvideo;

import X.C43638HAs;
import X.C43639HAt;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetContext extends F9E implements Parcelable {
    public String chorusMethod;
    public Effect defaultDuetLayout;
    public String duetAudioPath;
    public String duetFromAwemeId;
    public String duetFromChallengeName;
    public Integer duetGroupDuration;
    public String duetLayout;
    public String duetLayoutInfoJson;
    public String duetLayoutMode;
    public String duetOriginId;
    public int duetUploadType;
    public int duetVideoHeight;
    public String duetVideoPath;
    public int duetVideoWidth;
    public boolean isDuetSing;
    public boolean isDuetUpload;
    public int isFromDuetSticker;
    public int layoutDirection;
    public boolean micDefaultState;
    public boolean successEnableAEC;
    public float veSuggestHumanVolume;
    public float veSuggestVideoVolume;
    public List<EmbaddedWindowInfo> windowInfoList;
    public static final C43639HAt Companion = new C43639HAt();
    public static final int DUET_UPLOAD_TYPE_PICTURE = 1;
    public static final int DUET_UPLOAD_TYPE_VIDEO = 2;
    public static final Parcelable.Creator<DuetContext> CREATOR = new C43638HAs();

    public DuetContext() {
        this(null, null, null, null, 1.0f, 1.0f, false, 0, 0, null, null, new ArrayList(), false, 0, "", 0, null, null, false, false, 0, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.duetFromChallengeName, this.duetFromAwemeId, this.duetVideoPath, this.duetAudioPath, Float.valueOf(this.veSuggestHumanVolume), Float.valueOf(this.veSuggestVideoVolume), Boolean.valueOf(this.successEnableAEC), Integer.valueOf(this.duetVideoWidth), Integer.valueOf(this.duetVideoHeight), this.duetLayout, this.duetLayoutInfoJson, this.windowInfoList, Boolean.valueOf(this.micDefaultState), Integer.valueOf(this.isFromDuetSticker), this.duetLayoutMode, Integer.valueOf(this.layoutDirection), this.defaultDuetLayout, this.duetOriginId, Boolean.valueOf(this.isDuetSing), Boolean.valueOf(this.isDuetUpload), Integer.valueOf(this.duetUploadType), this.chorusMethod, this.duetGroupDuration};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.duetFromChallengeName);
        parcel.writeString(this.duetFromAwemeId);
        parcel.writeString(this.duetVideoPath);
        parcel.writeString(this.duetAudioPath);
        parcel.writeFloat(this.veSuggestHumanVolume);
        parcel.writeFloat(this.veSuggestVideoVolume);
        parcel.writeInt(this.successEnableAEC ? 1 : 0);
        parcel.writeInt(this.duetVideoWidth);
        parcel.writeInt(this.duetVideoHeight);
        parcel.writeString(this.duetLayout);
        parcel.writeString(this.duetLayoutInfoJson);
        List<EmbaddedWindowInfo> list = this.windowInfoList;
        parcel.writeInt(list.size());
        Iterator<EmbaddedWindowInfo> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.micDefaultState ? 1 : 0);
        parcel.writeInt(this.isFromDuetSticker);
        parcel.writeString(this.duetLayoutMode);
        parcel.writeInt(this.layoutDirection);
        parcel.writeParcelable(this.defaultDuetLayout, i);
        parcel.writeString(this.duetOriginId);
        parcel.writeInt(this.isDuetSing ? 1 : 0);
        parcel.writeInt(this.isDuetUpload ? 1 : 0);
        parcel.writeInt(this.duetUploadType);
        parcel.writeString(this.chorusMethod);
        Integer num = this.duetGroupDuration;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public DuetContext(String str, String str2, String str3, String str4, float f, float f2, boolean z, int i, int i2, String str5, String str6, List<EmbaddedWindowInfo> windowInfoList, boolean z2, int i3, String duetLayoutMode, int i4, Effect effect, String str7, boolean z3, boolean z4, int i5, String str8, Integer num) {
        o.LJIIIZ(windowInfoList, "windowInfoList");
        o.LJIIIZ(duetLayoutMode, "duetLayoutMode");
        this.duetFromChallengeName = str;
        this.duetFromAwemeId = str2;
        this.duetVideoPath = str3;
        this.duetAudioPath = str4;
        this.veSuggestHumanVolume = f;
        this.veSuggestVideoVolume = f2;
        this.successEnableAEC = z;
        this.duetVideoWidth = i;
        this.duetVideoHeight = i2;
        this.duetLayout = str5;
        this.duetLayoutInfoJson = str6;
        this.windowInfoList = windowInfoList;
        this.micDefaultState = z2;
        this.isFromDuetSticker = i3;
        this.duetLayoutMode = duetLayoutMode;
        this.layoutDirection = i4;
        this.defaultDuetLayout = effect;
        this.duetOriginId = str7;
        this.isDuetSing = z3;
        this.isDuetUpload = z4;
        this.duetUploadType = i5;
        this.chorusMethod = str8;
        this.duetGroupDuration = num;
    }
}
