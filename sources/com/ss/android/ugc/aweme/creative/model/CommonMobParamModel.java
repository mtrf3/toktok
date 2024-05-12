package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.H8L;
import X.HI4;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.creative.model.publish.SmartCodecMobDataModel;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommonMobParamModel implements Parcelable {
    public static final Parcelable.Creator<CommonMobParamModel> CREATOR = new H8L();

    @GPV
    public ArrayList<String> aigcCreationSource;

    @GPV
    public EditDescMobModel editDescMobModel;

    @InterfaceC65349Pkn("has_click_recommend_hashtag")
    public boolean hasClickRecommendHashtag;

    @InterfaceC65349Pkn("hashtag_list")
    public String hashtagList;

    @InterfaceC65349Pkn("is_handsfree_used")
    public boolean isHandsFreeUsed;

    @InterfaceC65349Pkn("is_story_enhanced_entrance")
    public boolean isStoryEnhancedEntrance;

    @InterfaceC65349Pkn("is_upload_direct_enter")
    public boolean isUploadDirectEnter;

    @GPV
    public String pureHashtagString;

    @InterfaceC65349Pkn("shoot_enter_from")
    public String shootEnterFrom;

    @InterfaceC65349Pkn("shoot_enter_method")
    public String shootEnterMethod;

    @GPV
    public final SmartCodecMobDataModel smartCodecMobDataModel;

    @InterfaceC65349Pkn("story_music_default_type")
    public String storyMusicDefaultType;

    @InterfaceC65349Pkn("story_music")
    public String storyMusicOrigin;

    @GPV
    public final HI4 vqCompileDataModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommonMobParamModel() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r3 = r1
            r4 = r2
            r5 = r1
            r6 = r2
            r7 = r2
            r8 = r1
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r14 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.CommonMobParamModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.hasClickRecommendHashtag ? 1 : 0);
        out.writeString(this.hashtagList);
        out.writeInt(this.isHandsFreeUsed ? 1 : 0);
        out.writeString(this.pureHashtagString);
        out.writeInt(this.isUploadDirectEnter ? 1 : 0);
        out.writeString(this.shootEnterFrom);
        out.writeString(this.shootEnterMethod);
        out.writeInt(this.isStoryEnhancedEntrance ? 1 : 0);
        out.writeString(this.storyMusicOrigin);
        out.writeString(this.storyMusicDefaultType);
        this.editDescMobModel.writeToParcel(out, i);
        out.writeStringList(this.aigcCreationSource);
    }

    public CommonMobParamModel(boolean z, String hashtagList, boolean z2, String pureHashtagString, boolean z3, String str, String str2, boolean z4, String str3, String str4, EditDescMobModel editDescMobModel, ArrayList<String> aigcCreationSource) {
        o.LJIIIZ(hashtagList, "hashtagList");
        o.LJIIIZ(pureHashtagString, "pureHashtagString");
        o.LJIIIZ(editDescMobModel, "editDescMobModel");
        o.LJIIIZ(aigcCreationSource, "aigcCreationSource");
        this.hasClickRecommendHashtag = z;
        this.hashtagList = hashtagList;
        this.isHandsFreeUsed = z2;
        this.pureHashtagString = pureHashtagString;
        this.isUploadDirectEnter = z3;
        this.shootEnterFrom = str;
        this.shootEnterMethod = str2;
        this.isStoryEnhancedEntrance = z4;
        this.storyMusicOrigin = str3;
        this.storyMusicDefaultType = str4;
        this.editDescMobModel = editDescMobModel;
        this.aigcCreationSource = aigcCreationSource;
        this.vqCompileDataModel = new HI4(0);
        this.smartCodecMobDataModel = new SmartCodecMobDataModel(0);
    }

    public /* synthetic */ CommonMobParamModel(boolean z, String str, boolean z2, String str2, boolean z3, String str3, String str4, boolean z4, String str5, String str6, EditDescMobModel editDescMobModel, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : str5, (i & 512) == 0 ? str6 : null, (i & 1024) != 0 ? new EditDescMobModel(0) : editDescMobModel, (i & 2048) != 0 ? new ArrayList() : arrayList);
    }
}
