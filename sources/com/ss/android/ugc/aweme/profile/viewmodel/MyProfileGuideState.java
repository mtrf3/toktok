package com.ss.android.ugc.aweme.profile.viewmodel;

import X.C08880Wm;
import X.C43I;
import X.C76800UCe;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.survey.SurveyData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MyProfileGuideState implements InterfaceC61312at {
    public final boolean avatarHasLoaded;
    public final Integer currentDownloadSetting;
    public final boolean hasGuideShowed;
    public final boolean hasPermissionPopUp;
    public final boolean hasSurveyDetermined;
    public final boolean needPromptEmailAndPhoneBind;
    public final boolean needShowArtistNewReleaseNotice;
    public final boolean needShowBindPhoneNumberNotice;
    public final Boolean needShowDiskManagerGuide;
    public final boolean needShowEmailPopUp;
    public final boolean needShowMusicOfflineNotice;
    public final boolean needShowPasskey;
    public final boolean needShowProfileHVAPopUp;
    public final boolean needShowProfileWalletPopUp;
    public final boolean needShowSaveLoginInfoPopUp;
    public final boolean needShowSyncNicknameUsername;
    public final boolean postListHasLoaded;
    public final SurveyData surveyData;
    public final C43I<C76800UCe> triggerShowCopyrightViolationSnackBarEvent;
    public final boolean vcdGuideLoaded;

    public MyProfileGuideState() {
        this(false, false, false, false, null, null, null, false, false, false, null, false, false, false, false, false, false, false, false, false, 1048575, null);
    }

    public static /* synthetic */ MyProfileGuideState copy$default(MyProfileGuideState myProfileGuideState, boolean z, boolean z2, boolean z3, boolean z4, SurveyData surveyData, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, C43I c43i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i, Object obj) {
        Integer num2 = num;
        boolean z17 = z2;
        boolean z18 = z;
        boolean z19 = z3;
        boolean z20 = z4;
        SurveyData surveyData2 = surveyData;
        Boolean bool2 = bool;
        boolean z21 = z10;
        boolean z22 = z6;
        boolean z23 = z5;
        boolean z24 = z7;
        C43I c43i2 = c43i;
        boolean z25 = z8;
        boolean z26 = z9;
        boolean z27 = z16;
        boolean z28 = z12;
        boolean z29 = z13;
        boolean z30 = z11;
        boolean z31 = z15;
        boolean z32 = z14;
        if ((i & 1) != 0) {
            z18 = myProfileGuideState.hasGuideShowed;
        }
        if ((i & 2) != 0) {
            z17 = myProfileGuideState.postListHasLoaded;
        }
        if ((i & 4) != 0) {
            z19 = myProfileGuideState.avatarHasLoaded;
        }
        if ((i & 8) != 0) {
            z20 = myProfileGuideState.hasSurveyDetermined;
        }
        if ((i & 16) != 0) {
            surveyData2 = myProfileGuideState.surveyData;
        }
        if ((i & 32) != 0) {
            bool2 = myProfileGuideState.needShowDiskManagerGuide;
        }
        if ((i & 64) != 0) {
            num2 = myProfileGuideState.currentDownloadSetting;
        }
        if ((i & 128) != 0) {
            z23 = myProfileGuideState.vcdGuideLoaded;
        }
        if ((i & 256) != 0) {
            z22 = myProfileGuideState.hasPermissionPopUp;
        }
        if ((i & 512) != 0) {
            z24 = myProfileGuideState.needShowBindPhoneNumberNotice;
        }
        if ((i & 1024) != 0) {
            c43i2 = myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent;
        }
        if ((i & 2048) != 0) {
            z25 = myProfileGuideState.needShowEmailPopUp;
        }
        if ((i & 4096) != 0) {
            z26 = myProfileGuideState.needPromptEmailAndPhoneBind;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            z21 = myProfileGuideState.needShowSaveLoginInfoPopUp;
        }
        if ((i & 16384) != 0) {
            z30 = myProfileGuideState.needShowArtistNewReleaseNotice;
        }
        if ((32768 & i) != 0) {
            z28 = myProfileGuideState.needShowMusicOfflineNotice;
        }
        if ((65536 & i) != 0) {
            z29 = myProfileGuideState.needShowSyncNicknameUsername;
        }
        if ((131072 & i) != 0) {
            z32 = myProfileGuideState.needShowProfileHVAPopUp;
        }
        if ((262144 & i) != 0) {
            z31 = myProfileGuideState.needShowProfileWalletPopUp;
        }
        if ((i & 524288) != 0) {
            z27 = myProfileGuideState.needShowPasskey;
        }
        return myProfileGuideState.copy(z18, z17, z19, z20, surveyData2, bool2, num2, z23, z22, z24, c43i2, z25, z26, z21, z30, z28, z29, z32, z31, z27);
    }

    public final MyProfileGuideState copy(boolean z, boolean z2, boolean z3, boolean z4, SurveyData surveyData, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, C43I<C76800UCe> c43i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return new MyProfileGuideState(z, z2, z3, z4, surveyData, bool, num, z5, z6, z7, c43i, z8, z9, z10, z11, z12, z13, z14, z15, z16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyProfileGuideState)) {
            return false;
        }
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) obj;
        return this.hasGuideShowed == myProfileGuideState.hasGuideShowed && this.postListHasLoaded == myProfileGuideState.postListHasLoaded && this.avatarHasLoaded == myProfileGuideState.avatarHasLoaded && this.hasSurveyDetermined == myProfileGuideState.hasSurveyDetermined && o.LJ(this.surveyData, myProfileGuideState.surveyData) && o.LJ(this.needShowDiskManagerGuide, myProfileGuideState.needShowDiskManagerGuide) && o.LJ(this.currentDownloadSetting, myProfileGuideState.currentDownloadSetting) && this.vcdGuideLoaded == myProfileGuideState.vcdGuideLoaded && this.hasPermissionPopUp == myProfileGuideState.hasPermissionPopUp && this.needShowBindPhoneNumberNotice == myProfileGuideState.needShowBindPhoneNumberNotice && o.LJ(this.triggerShowCopyrightViolationSnackBarEvent, myProfileGuideState.triggerShowCopyrightViolationSnackBarEvent) && this.needShowEmailPopUp == myProfileGuideState.needShowEmailPopUp && this.needPromptEmailAndPhoneBind == myProfileGuideState.needPromptEmailAndPhoneBind && this.needShowSaveLoginInfoPopUp == myProfileGuideState.needShowSaveLoginInfoPopUp && this.needShowArtistNewReleaseNotice == myProfileGuideState.needShowArtistNewReleaseNotice && this.needShowMusicOfflineNotice == myProfileGuideState.needShowMusicOfflineNotice && this.needShowSyncNicknameUsername == myProfileGuideState.needShowSyncNicknameUsername && this.needShowProfileHVAPopUp == myProfileGuideState.needShowProfileHVAPopUp && this.needShowProfileWalletPopUp == myProfileGuideState.needShowProfileWalletPopUp && this.needShowPasskey == myProfileGuideState.needShowPasskey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.hasGuideShowed;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.postListHasLoaded;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r03 = this.avatarHasLoaded;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r04 = this.hasSurveyDetermined;
        int i6 = r04;
        if (r04 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        SurveyData surveyData = this.surveyData;
        int hashCode = (i7 + (surveyData == null ? 0 : surveyData.hashCode())) * 31;
        Boolean bool = this.needShowDiskManagerGuide;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r05 = this.vcdGuideLoaded;
        int i8 = r05;
        if (r05 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode3 + i8) * 31;
        ?? r06 = this.hasPermissionPopUp;
        int i10 = r06;
        if (r06 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r07 = this.needShowBindPhoneNumberNotice;
        int i12 = r07;
        if (r07 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        C43I<C76800UCe> c43i = this.triggerShowCopyrightViolationSnackBarEvent;
        int hashCode4 = (i13 + (c43i != null ? c43i.hashCode() : 0)) * 31;
        ?? r08 = this.needShowEmailPopUp;
        int i14 = r08;
        if (r08 != 0) {
            i14 = 1;
        }
        int i15 = (hashCode4 + i14) * 31;
        ?? r09 = this.needPromptEmailAndPhoneBind;
        int i16 = r09;
        if (r09 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        ?? r010 = this.needShowSaveLoginInfoPopUp;
        int i18 = r010;
        if (r010 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        ?? r011 = this.needShowArtistNewReleaseNotice;
        int i20 = r011;
        if (r011 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        ?? r012 = this.needShowMusicOfflineNotice;
        int i22 = r012;
        if (r012 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        ?? r013 = this.needShowSyncNicknameUsername;
        int i24 = r013;
        if (r013 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        ?? r014 = this.needShowProfileHVAPopUp;
        int i26 = r014;
        if (r014 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        ?? r015 = this.needShowProfileWalletPopUp;
        int i28 = r015;
        if (r015 != 0) {
            i28 = 1;
        }
        return ((i27 + i28) * 31) + (this.needShowPasskey ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MyProfileGuideState(hasGuideShowed=");
        sb.append(this.hasGuideShowed);
        sb.append(", postListHasLoaded=");
        sb.append(this.postListHasLoaded);
        sb.append(", avatarHasLoaded=");
        sb.append(this.avatarHasLoaded);
        sb.append(", hasSurveyDetermined=");
        sb.append(this.hasSurveyDetermined);
        sb.append(", surveyData=");
        sb.append(this.surveyData);
        sb.append(", needShowDiskManagerGuide=");
        sb.append(this.needShowDiskManagerGuide);
        sb.append(", currentDownloadSetting=");
        sb.append(this.currentDownloadSetting);
        sb.append(", vcdGuideLoaded=");
        sb.append(this.vcdGuideLoaded);
        sb.append(", hasPermissionPopUp=");
        sb.append(this.hasPermissionPopUp);
        sb.append(", needShowBindPhoneNumberNotice=");
        sb.append(this.needShowBindPhoneNumberNotice);
        sb.append(", triggerShowCopyrightViolationSnackBarEvent=");
        sb.append(this.triggerShowCopyrightViolationSnackBarEvent);
        sb.append(", needShowEmailPopUp=");
        sb.append(this.needShowEmailPopUp);
        sb.append(", needPromptEmailAndPhoneBind=");
        sb.append(this.needPromptEmailAndPhoneBind);
        sb.append(", needShowSaveLoginInfoPopUp=");
        sb.append(this.needShowSaveLoginInfoPopUp);
        sb.append(", needShowArtistNewReleaseNotice=");
        sb.append(this.needShowArtistNewReleaseNotice);
        sb.append(", needShowMusicOfflineNotice=");
        sb.append(this.needShowMusicOfflineNotice);
        sb.append(", needShowSyncNicknameUsername=");
        sb.append(this.needShowSyncNicknameUsername);
        sb.append(", needShowProfileHVAPopUp=");
        sb.append(this.needShowProfileHVAPopUp);
        sb.append(", needShowProfileWalletPopUp=");
        sb.append(this.needShowProfileWalletPopUp);
        sb.append(", needShowPasskey=");
        return C08880Wm.LIZJ(sb, this.needShowPasskey, ')');
    }

    public final boolean getAvatarHasLoaded() {
        return this.avatarHasLoaded;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final boolean getHasGuideShowed() {
        return this.hasGuideShowed;
    }

    public final boolean getHasPermissionPopUp() {
        return this.hasPermissionPopUp;
    }

    public final boolean getHasSurveyDetermined() {
        return this.hasSurveyDetermined;
    }

    public final boolean getNeedPromptEmailAndPhoneBind() {
        return this.needPromptEmailAndPhoneBind;
    }

    public final boolean getNeedShowArtistNewReleaseNotice() {
        return this.needShowArtistNewReleaseNotice;
    }

    public final boolean getNeedShowBindPhoneNumberNotice() {
        return this.needShowBindPhoneNumberNotice;
    }

    public final Boolean getNeedShowDiskManagerGuide() {
        return this.needShowDiskManagerGuide;
    }

    public final boolean getNeedShowEmailPopUp() {
        return this.needShowEmailPopUp;
    }

    public final boolean getNeedShowMusicOfflineNotice() {
        return this.needShowMusicOfflineNotice;
    }

    public final boolean getNeedShowPasskey() {
        return this.needShowPasskey;
    }

    public final boolean getNeedShowProfileHVAPopUp() {
        return this.needShowProfileHVAPopUp;
    }

    public final boolean getNeedShowProfileWalletPopUp() {
        return this.needShowProfileWalletPopUp;
    }

    public final boolean getNeedShowSaveLoginInfoPopUp() {
        return this.needShowSaveLoginInfoPopUp;
    }

    public final boolean getNeedShowSyncNicknameUsername() {
        return this.needShowSyncNicknameUsername;
    }

    public final boolean getPostListHasLoaded() {
        return this.postListHasLoaded;
    }

    public final SurveyData getSurveyData() {
        return this.surveyData;
    }

    public final C43I<C76800UCe> getTriggerShowCopyrightViolationSnackBarEvent() {
        return this.triggerShowCopyrightViolationSnackBarEvent;
    }

    public final boolean getVcdGuideLoaded() {
        return this.vcdGuideLoaded;
    }

    public MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, SurveyData surveyData, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, C43I<C76800UCe> c43i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.hasGuideShowed = z;
        this.postListHasLoaded = z2;
        this.avatarHasLoaded = z3;
        this.hasSurveyDetermined = z4;
        this.surveyData = surveyData;
        this.needShowDiskManagerGuide = bool;
        this.currentDownloadSetting = num;
        this.vcdGuideLoaded = z5;
        this.hasPermissionPopUp = z6;
        this.needShowBindPhoneNumberNotice = z7;
        this.triggerShowCopyrightViolationSnackBarEvent = c43i;
        this.needShowEmailPopUp = z8;
        this.needPromptEmailAndPhoneBind = z9;
        this.needShowSaveLoginInfoPopUp = z10;
        this.needShowArtistNewReleaseNotice = z11;
        this.needShowMusicOfflineNotice = z12;
        this.needShowSyncNicknameUsername = z13;
        this.needShowProfileHVAPopUp = z14;
        this.needShowProfileWalletPopUp = z15;
        this.needShowPasskey = z16;
    }

    public /* synthetic */ MyProfileGuideState(boolean z, boolean z2, boolean z3, boolean z4, SurveyData surveyData, Boolean bool, Integer num, boolean z5, boolean z6, boolean z7, C43I c43i, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : surveyData, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : num, (i & 128) != 0 ? false : z5, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? true : z7, (i & 1024) == 0 ? c43i : null, (i & 2048) != 0 ? true : z8, (i & 4096) != 0 ? true : z9, (i & FileUtils.BUFFER_SIZE) != 0 ? true : z10, (i & 16384) != 0 ? true : z11, (32768 & i) != 0 ? false : z12, (65536 & i) != 0 ? true : z13, (131072 & i) != 0 ? true : z14, (262144 & i) != 0 ? true : z15, (i & 524288) != 0 ? true : z16);
    }
}
