package com.ss.android.ugc.aweme.profile.viewmodel;

import X.AWV;
import X.AbstractC26082ALm;
import X.C2047581v;
import X.C26092ALw;
import X.C43I;
import X.C76800UCe;
import X.InterfaceC61312at;
import X.OSZ;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileState implements InterfaceC61312at {
    public final AWV aigcNavMetadata;
    public final int avatarClickCount;
    public final int curTabType;
    public final Integer currentDownloadSetting;
    public final String enterFrom;
    public final String fromSearch;
    public final Boolean guideCardOnDisplay;
    public final boolean isAvatarClicked;
    public final boolean isBackgroundCoverClicked;
    public final Boolean isBlankWorkShow;
    public final boolean isFirstNodeShow;
    public final Boolean isFromMain;
    public final Boolean isGuideUserCard;
    public final Boolean isPostAwemeEmpty;
    public final Boolean isPostAwemeEmptyWhenPrivateShow;
    public final Boolean isPostGuideShow;
    public final Boolean isPublishTabEmpty;
    public final String livePreviousPage;
    public final AbstractC26082ALm<OSZ<UrlModel, C2047581v>> loadAvatar;
    public final C43I<C76800UCe> needRefreshAwemeListEvent;
    public final C43I<OSZ<String, Music>> needRefreshPhotoModeAwemeMuteEvent;
    public final boolean needShowProfileCollectionGuide;
    public final String needUpdateAvatarUrl;
    public final boolean onHiddenChanged;
    public final Boolean shouldShowViewerDialog;
    public final Boolean shouldShowViewerEntranceTips;
    public final Aweme sourceAweme;
    public final String suid;
    public final Integer targetTab;
    public final C43I<Aweme> triggerCopyrightViolationSnackBarEvent;
    public final String uid;
    public final User user;
    public final boolean userVisibleHint;

    public ProfileState() {
        this(null, null, null, null, null, 0, 0, false, null, null, null, false, null, null, null, null, null, null, false, null, false, false, null, false, null, null, null, null, null, null, null, null, null, -1, 1, null);
    }

    public static /* synthetic */ ProfileState copy$default(ProfileState profileState, String str, String str2, User user, Aweme aweme, AbstractC26082ALm abstractC26082ALm, int i, int i2, boolean z, String str3, String str4, Boolean bool, boolean z2, String str5, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, boolean z3, C43I c43i, boolean z4, boolean z5, Integer num, boolean z6, String str6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, AWV awv, Integer num2, C43I c43i2, C43I c43i3, int i3, int i4, Object obj) {
        Boolean bool11 = bool2;
        String str7 = str5;
        boolean z7 = z2;
        Boolean bool12 = bool;
        String str8 = str4;
        String str9 = str3;
        boolean z8 = z;
        int i5 = i2;
        String str10 = str2;
        String str11 = str;
        User user2 = user;
        Aweme aweme2 = aweme;
        AbstractC26082ALm abstractC26082ALm2 = abstractC26082ALm;
        int i6 = i;
        C43I c43i4 = c43i2;
        Integer num3 = num2;
        C43I c43i5 = c43i;
        boolean z9 = z3;
        Boolean bool13 = bool6;
        Boolean bool14 = bool5;
        Boolean bool15 = bool3;
        Boolean bool16 = bool4;
        boolean z10 = z4;
        boolean z11 = z5;
        Integer num4 = num;
        boolean z12 = z6;
        C43I c43i6 = c43i3;
        String str12 = str6;
        Boolean bool17 = bool7;
        Boolean bool18 = bool8;
        Boolean bool19 = bool9;
        Boolean bool20 = bool10;
        AWV awv2 = awv;
        if ((i3 & 1) != 0) {
            str11 = profileState.uid;
        }
        if ((i3 & 2) != 0) {
            str10 = profileState.suid;
        }
        if ((i3 & 4) != 0) {
            user2 = profileState.user;
        }
        if ((i3 & 8) != 0) {
            aweme2 = profileState.sourceAweme;
        }
        if ((i3 & 16) != 0) {
            abstractC26082ALm2 = profileState.loadAvatar;
        }
        if ((i3 & 32) != 0) {
            i6 = profileState.avatarClickCount;
        }
        if ((i3 & 64) != 0) {
            i5 = profileState.curTabType;
        }
        if ((i3 & 128) != 0) {
            z8 = profileState.userVisibleHint;
        }
        if ((i3 & 256) != 0) {
            str9 = profileState.needUpdateAvatarUrl;
        }
        if ((i3 & 512) != 0) {
            str8 = profileState.livePreviousPage;
        }
        if ((i3 & 1024) != 0) {
            bool12 = profileState.isFromMain;
        }
        if ((i3 & 2048) != 0) {
            z7 = profileState.isFirstNodeShow;
        }
        if ((i3 & 4096) != 0) {
            str7 = profileState.enterFrom;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            bool11 = profileState.isPostGuideShow;
        }
        if ((i3 & 16384) != 0) {
            bool15 = profileState.isPostAwemeEmpty;
        }
        if ((32768 & i3) != 0) {
            bool16 = profileState.isGuideUserCard;
        }
        if ((65536 & i3) != 0) {
            bool14 = profileState.isPublishTabEmpty;
        }
        if ((131072 & i3) != 0) {
            bool13 = profileState.isPostAwemeEmptyWhenPrivateShow;
        }
        if ((262144 & i3) != 0) {
            z9 = profileState.needShowProfileCollectionGuide;
        }
        if ((524288 & i3) != 0) {
            c43i5 = profileState.triggerCopyrightViolationSnackBarEvent;
        }
        if ((1048576 & i3) != 0) {
            z10 = profileState.isAvatarClicked;
        }
        if ((2097152 & i3) != 0) {
            z11 = profileState.isBackgroundCoverClicked;
        }
        if ((4194304 & i3) != 0) {
            num4 = profileState.currentDownloadSetting;
        }
        if ((8388608 & i3) != 0) {
            z12 = profileState.onHiddenChanged;
        }
        if ((16777216 & i3) != 0) {
            str12 = profileState.fromSearch;
        }
        if ((33554432 & i3) != 0) {
            bool17 = profileState.shouldShowViewerEntranceTips;
        }
        if ((67108864 & i3) != 0) {
            bool18 = profileState.shouldShowViewerDialog;
        }
        if ((134217728 & i3) != 0) {
            bool19 = profileState.guideCardOnDisplay;
        }
        if ((268435456 & i3) != 0) {
            bool20 = profileState.isBlankWorkShow;
        }
        if ((536870912 & i3) != 0) {
            awv2 = profileState.aigcNavMetadata;
        }
        if ((1073741824 & i3) != 0) {
            num3 = profileState.targetTab;
        }
        if ((i3 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            c43i4 = profileState.needRefreshAwemeListEvent;
        }
        if ((i4 & 1) != 0) {
            c43i6 = profileState.needRefreshPhotoModeAwemeMuteEvent;
        }
        return profileState.copy(str11, str10, user2, aweme2, abstractC26082ALm2, i6, i5, z8, str9, str8, bool12, z7, str7, bool11, bool15, bool16, bool14, bool13, z9, c43i5, z10, z11, num4, z12, str12, bool17, bool18, bool19, bool20, awv2, num3, c43i4, c43i6);
    }

    public final ProfileState copy(String str, String str2, User user, Aweme aweme, AbstractC26082ALm<? extends OSZ<? extends UrlModel, ? extends C2047581v>> loadAvatar, int i, int i2, boolean z, String str3, String str4, Boolean bool, boolean z2, String str5, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, boolean z3, C43I<? extends Aweme> c43i, boolean z4, boolean z5, Integer num, boolean z6, String str6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, AWV awv, Integer num2, C43I<C76800UCe> c43i2, C43I<? extends OSZ<String, ? extends Music>> c43i3) {
        o.LJIIIZ(loadAvatar, "loadAvatar");
        return new ProfileState(str, str2, user, aweme, loadAvatar, i, i2, z, str3, str4, bool, z2, str5, bool2, bool3, bool4, bool5, bool6, z3, c43i, z4, z5, num, z6, str6, bool7, bool8, bool9, bool10, awv, num2, c43i2, c43i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileState)) {
            return false;
        }
        ProfileState profileState = (ProfileState) obj;
        return o.LJ(this.uid, profileState.uid) && o.LJ(this.suid, profileState.suid) && o.LJ(this.user, profileState.user) && o.LJ(this.sourceAweme, profileState.sourceAweme) && o.LJ(this.loadAvatar, profileState.loadAvatar) && this.avatarClickCount == profileState.avatarClickCount && this.curTabType == profileState.curTabType && this.userVisibleHint == profileState.userVisibleHint && o.LJ(this.needUpdateAvatarUrl, profileState.needUpdateAvatarUrl) && o.LJ(this.livePreviousPage, profileState.livePreviousPage) && o.LJ(this.isFromMain, profileState.isFromMain) && this.isFirstNodeShow == profileState.isFirstNodeShow && o.LJ(this.enterFrom, profileState.enterFrom) && o.LJ(this.isPostGuideShow, profileState.isPostGuideShow) && o.LJ(this.isPostAwemeEmpty, profileState.isPostAwemeEmpty) && o.LJ(this.isGuideUserCard, profileState.isGuideUserCard) && o.LJ(this.isPublishTabEmpty, profileState.isPublishTabEmpty) && o.LJ(this.isPostAwemeEmptyWhenPrivateShow, profileState.isPostAwemeEmptyWhenPrivateShow) && this.needShowProfileCollectionGuide == profileState.needShowProfileCollectionGuide && o.LJ(this.triggerCopyrightViolationSnackBarEvent, profileState.triggerCopyrightViolationSnackBarEvent) && this.isAvatarClicked == profileState.isAvatarClicked && this.isBackgroundCoverClicked == profileState.isBackgroundCoverClicked && o.LJ(this.currentDownloadSetting, profileState.currentDownloadSetting) && this.onHiddenChanged == profileState.onHiddenChanged && o.LJ(this.fromSearch, profileState.fromSearch) && o.LJ(this.shouldShowViewerEntranceTips, profileState.shouldShowViewerEntranceTips) && o.LJ(this.shouldShowViewerDialog, profileState.shouldShowViewerDialog) && o.LJ(this.guideCardOnDisplay, profileState.guideCardOnDisplay) && o.LJ(this.isBlankWorkShow, profileState.isBlankWorkShow) && o.LJ(this.aigcNavMetadata, profileState.aigcNavMetadata) && o.LJ(this.targetTab, profileState.targetTab) && o.LJ(this.needRefreshAwemeListEvent, profileState.needRefreshAwemeListEvent) && o.LJ(this.needRefreshPhotoModeAwemeMuteEvent, profileState.needRefreshPhotoModeAwemeMuteEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.suid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        User user = this.user;
        int hashCode3 = (hashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        Aweme aweme = this.sourceAweme;
        int hashCode4 = (((((this.loadAvatar.hashCode() + ((hashCode3 + (aweme == null ? 0 : aweme.hashCode())) * 31)) * 31) + this.avatarClickCount) * 31) + this.curTabType) * 31;
        boolean z = this.userVisibleHint;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        String str3 = this.needUpdateAvatarUrl;
        int hashCode5 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.livePreviousPage;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFromMain;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z2 = this.isFirstNodeShow;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode7 + i3) * 31;
        String str5 = this.enterFrom;
        int hashCode8 = (i4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isPostGuideShow;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isPostAwemeEmpty;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isGuideUserCard;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isPublishTabEmpty;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isPostAwemeEmptyWhenPrivateShow;
        int hashCode13 = (hashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        boolean z3 = this.needShowProfileCollectionGuide;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode13 + i5) * 31;
        C43I<Aweme> c43i = this.triggerCopyrightViolationSnackBarEvent;
        int hashCode14 = (i6 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        boolean z4 = this.isAvatarClicked;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode14 + i7) * 31;
        boolean z5 = this.isBackgroundCoverClicked;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        Integer num = this.currentDownloadSetting;
        int hashCode15 = (((i10 + (num == null ? 0 : num.hashCode())) * 31) + (this.onHiddenChanged ? 1 : 0)) * 31;
        String str6 = this.fromSearch;
        int hashCode16 = (hashCode15 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool7 = this.shouldShowViewerEntranceTips;
        int hashCode17 = (hashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.shouldShowViewerDialog;
        int hashCode18 = (hashCode17 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.guideCardOnDisplay;
        int hashCode19 = (hashCode18 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isBlankWorkShow;
        int hashCode20 = (hashCode19 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        AWV awv = this.aigcNavMetadata;
        int hashCode21 = (hashCode20 + (awv == null ? 0 : awv.hashCode())) * 31;
        Integer num2 = this.targetTab;
        int hashCode22 = (hashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C43I<C76800UCe> c43i2 = this.needRefreshAwemeListEvent;
        int hashCode23 = (hashCode22 + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C43I<OSZ<String, Music>> c43i3 = this.needRefreshPhotoModeAwemeMuteEvent;
        return hashCode23 + (c43i3 != null ? c43i3.hashCode() : 0);
    }

    public String toString() {
        return "ProfileState(uid=" + this.uid + ", suid=" + this.suid + ", user=" + this.user + ", sourceAweme=" + this.sourceAweme + ", loadAvatar=" + this.loadAvatar + ", avatarClickCount=" + this.avatarClickCount + ", curTabType=" + this.curTabType + ", userVisibleHint=" + this.userVisibleHint + ", needUpdateAvatarUrl=" + this.needUpdateAvatarUrl + ", livePreviousPage=" + this.livePreviousPage + ", isFromMain=" + this.isFromMain + ", isFirstNodeShow=" + this.isFirstNodeShow + ", enterFrom=" + this.enterFrom + ", isPostGuideShow=" + this.isPostGuideShow + ", isPostAwemeEmpty=" + this.isPostAwemeEmpty + ", isGuideUserCard=" + this.isGuideUserCard + ", isPublishTabEmpty=" + this.isPublishTabEmpty + ", isPostAwemeEmptyWhenPrivateShow=" + this.isPostAwemeEmptyWhenPrivateShow + ", needShowProfileCollectionGuide=" + this.needShowProfileCollectionGuide + ", triggerCopyrightViolationSnackBarEvent=" + this.triggerCopyrightViolationSnackBarEvent + ", isAvatarClicked=" + this.isAvatarClicked + ", isBackgroundCoverClicked=" + this.isBackgroundCoverClicked + ", currentDownloadSetting=" + this.currentDownloadSetting + ", onHiddenChanged=" + this.onHiddenChanged + ", fromSearch=" + this.fromSearch + ", shouldShowViewerEntranceTips=" + this.shouldShowViewerEntranceTips + ", shouldShowViewerDialog=" + this.shouldShowViewerDialog + ", guideCardOnDisplay=" + this.guideCardOnDisplay + ", isBlankWorkShow=" + this.isBlankWorkShow + ", aigcNavMetadata=" + this.aigcNavMetadata + ", targetTab=" + this.targetTab + ", needRefreshAwemeListEvent=" + this.needRefreshAwemeListEvent + ", needRefreshPhotoModeAwemeMuteEvent=" + this.needRefreshPhotoModeAwemeMuteEvent + ')';
    }

    public final AWV getAigcNavMetadata() {
        return this.aigcNavMetadata;
    }

    public final int getAvatarClickCount() {
        return this.avatarClickCount;
    }

    public final int getCurTabType() {
        return this.curTabType;
    }

    public final Integer getCurrentDownloadSetting() {
        return this.currentDownloadSetting;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFromSearch() {
        return this.fromSearch;
    }

    public final Boolean getGuideCardOnDisplay() {
        return this.guideCardOnDisplay;
    }

    public final String getLivePreviousPage() {
        return this.livePreviousPage;
    }

    public final AbstractC26082ALm<OSZ<UrlModel, C2047581v>> getLoadAvatar() {
        return this.loadAvatar;
    }

    public final C43I<C76800UCe> getNeedRefreshAwemeListEvent() {
        return this.needRefreshAwemeListEvent;
    }

    public final C43I<OSZ<String, Music>> getNeedRefreshPhotoModeAwemeMuteEvent() {
        return this.needRefreshPhotoModeAwemeMuteEvent;
    }

    public final boolean getNeedShowProfileCollectionGuide() {
        return this.needShowProfileCollectionGuide;
    }

    public final String getNeedUpdateAvatarUrl() {
        return this.needUpdateAvatarUrl;
    }

    public final boolean getOnHiddenChanged() {
        return this.onHiddenChanged;
    }

    public final Boolean getShouldShowViewerDialog() {
        return this.shouldShowViewerDialog;
    }

    public final Boolean getShouldShowViewerEntranceTips() {
        return this.shouldShowViewerEntranceTips;
    }

    public final Aweme getSourceAweme() {
        return this.sourceAweme;
    }

    public final String getSuid() {
        return this.suid;
    }

    public final Integer getTargetTab() {
        return this.targetTab;
    }

    public final C43I<Aweme> getTriggerCopyrightViolationSnackBarEvent() {
        return this.triggerCopyrightViolationSnackBarEvent;
    }

    public final String getUid() {
        return this.uid;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean getUserVisibleHint() {
        return this.userVisibleHint;
    }

    public final boolean isAvatarClicked() {
        return this.isAvatarClicked;
    }

    public final boolean isBackgroundCoverClicked() {
        return this.isBackgroundCoverClicked;
    }

    public final Boolean isBlankWorkShow() {
        return this.isBlankWorkShow;
    }

    public final boolean isFirstNodeShow() {
        return this.isFirstNodeShow;
    }

    public final Boolean isFromMain() {
        return this.isFromMain;
    }

    public final Boolean isGuideUserCard() {
        return this.isGuideUserCard;
    }

    public final Boolean isPostAwemeEmpty() {
        return this.isPostAwemeEmpty;
    }

    public final Boolean isPostAwemeEmptyWhenPrivateShow() {
        return this.isPostAwemeEmptyWhenPrivateShow;
    }

    public final Boolean isPostGuideShow() {
        return this.isPostGuideShow;
    }

    public final Boolean isPublishTabEmpty() {
        return this.isPublishTabEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileState(String str, String str2, User user, Aweme aweme, AbstractC26082ALm<? extends OSZ<? extends UrlModel, ? extends C2047581v>> loadAvatar, int i, int i2, boolean z, String str3, String str4, Boolean bool, boolean z2, String str5, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, boolean z3, C43I<? extends Aweme> c43i, boolean z4, boolean z5, Integer num, boolean z6, String str6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, AWV awv, Integer num2, C43I<C76800UCe> c43i2, C43I<? extends OSZ<String, ? extends Music>> c43i3) {
        o.LJIIIZ(loadAvatar, "loadAvatar");
        this.uid = str;
        this.suid = str2;
        this.user = user;
        this.sourceAweme = aweme;
        this.loadAvatar = loadAvatar;
        this.avatarClickCount = i;
        this.curTabType = i2;
        this.userVisibleHint = z;
        this.needUpdateAvatarUrl = str3;
        this.livePreviousPage = str4;
        this.isFromMain = bool;
        this.isFirstNodeShow = z2;
        this.enterFrom = str5;
        this.isPostGuideShow = bool2;
        this.isPostAwemeEmpty = bool3;
        this.isGuideUserCard = bool4;
        this.isPublishTabEmpty = bool5;
        this.isPostAwemeEmptyWhenPrivateShow = bool6;
        this.needShowProfileCollectionGuide = z3;
        this.triggerCopyrightViolationSnackBarEvent = c43i;
        this.isAvatarClicked = z4;
        this.isBackgroundCoverClicked = z5;
        this.currentDownloadSetting = num;
        this.onHiddenChanged = z6;
        this.fromSearch = str6;
        this.shouldShowViewerEntranceTips = bool7;
        this.shouldShowViewerDialog = bool8;
        this.guideCardOnDisplay = bool9;
        this.isBlankWorkShow = bool10;
        this.aigcNavMetadata = awv;
        this.targetTab = num2;
        this.needRefreshAwemeListEvent = c43i2;
        this.needRefreshPhotoModeAwemeMuteEvent = c43i3;
    }

    public /* synthetic */ ProfileState(String str, String str2, User user, Aweme aweme, AbstractC26082ALm abstractC26082ALm, int i, int i2, boolean z, String str3, String str4, Boolean bool, boolean z2, String str5, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, boolean z3, C43I c43i, boolean z4, boolean z5, Integer num, boolean z6, String str6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, AWV awv, Integer num2, C43I c43i2, C43I c43i3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : user, (i3 & 8) != 0 ? null : aweme, (i3 & 16) != 0 ? C26092ALw.LIZ : abstractC26082ALm, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? "" : str4, (i3 & 1024) != 0 ? Boolean.FALSE : bool, (i3 & 2048) != 0 ? true : z2, (i3 & 4096) != 0 ? "" : str5, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : bool2, (i3 & 16384) != 0 ? null : bool3, (32768 & i3) != 0 ? null : bool4, (65536 & i3) != 0 ? null : bool5, (131072 & i3) != 0 ? null : bool6, (262144 & i3) != 0 ? false : z3, (524288 & i3) != 0 ? null : c43i, (1048576 & i3) != 0 ? false : z4, (2097152 & i3) != 0 ? false : z5, (4194304 & i3) != 0 ? null : num, (8388608 & i3) != 0 ? false : z6, (16777216 & i3) == 0 ? str6 : "", (33554432 & i3) != 0 ? Boolean.FALSE : bool7, (67108864 & i3) != 0 ? Boolean.FALSE : bool8, (134217728 & i3) != 0 ? null : bool9, (268435456 & i3) != 0 ? null : bool10, (536870912 & i3) != 0 ? null : awv, (1073741824 & i3) != 0 ? null : num2, (i3 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : c43i2, (i4 & 1) != 0 ? null : c43i3);
    }
}
