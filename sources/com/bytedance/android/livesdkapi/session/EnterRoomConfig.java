package com.bytedance.android.livesdkapi.session;

import X.ActivityC45651qj;
import X.BJQ;
import X.BJR;
import X.BL0;
import X.BL1;
import X.BL2;
import X.BL3;
import X.BL4;
import X.BL5;
import X.BLJ;
import X.BLK;
import X.BNN;
import X.BNO;
import X.C05040Hs;
import X.C16880lQ;
import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.C28552BIm;
import X.C28617BKz;
import X.OSZ;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class EnterRoomConfig implements Parcelable {
    public DrawParams drawParams;
    public ECWrapData mECData;
    public FeedCoverData mFeedCoverData;
    public boolean mFromScheme;
    public LogData mLogData;
    public RoomsData mRoomsData;
    public SearchWrapData mSearchData;
    public StreamData mStreamData;
    public static final BL5 Companion = new BL5();
    public static final Parcelable.Creator<EnterRoomConfig> CREATOR = new BL2();

    /* loaded from: classes6.dex */
    public static final class DrawParams implements Parcelable {
        public static final Parcelable.Creator<DrawParams> CREATOR = new BL3();
        public boolean openLiveFromDrawer;
        public boolean openLiveFromGameDrawer;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public DrawParams() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.session.EnterRoomConfig.DrawParams.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(this.openLiveFromDrawer ? 1 : 0);
            out.writeInt(this.openLiveFromGameDrawer ? 1 : 0);
        }

        public final DrawParams clone() {
            return new DrawParams(this.openLiveFromDrawer, this.openLiveFromGameDrawer);
        }

        public DrawParams(boolean z, boolean z2) {
            this.openLiveFromDrawer = z;
            this.openLiveFromGameDrawer = z2;
        }

        public /* synthetic */ DrawParams(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.mStreamData.writeToParcel(out, i);
        this.mLogData.writeToParcel(out, i);
        this.mRoomsData.writeToParcel(out, i);
        this.mSearchData.writeToParcel(out, i);
        this.mECData.writeToParcel(out, i);
        this.drawParams.writeToParcel(out, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EnterRoomConfig() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.session.EnterRoomConfig.<init>():void");
    }

    /* loaded from: classes6.dex */
    public static final class RoomsData implements Parcelable {
        public static final Parcelable.Creator<RoomsData> CREATOR = new C28617BKz();
        public String actionType;
        public AdLiveEnterRoomConfig adLiveEnterRoomConfig;
        public long anchorGiftId;
        public int anchorPosition;
        public int anchorRelationType;
        public String backPreRoomType;
        public long backRoomId;
        public String backRoomSource;
        public int backTabIndex;
        public String backUrl;
        public ArrayList<String> bgUrls;
        public long bottomLabelId;
        public long bottomSubLabelId;
        public String bubbleOwnerd;
        public String bubbleRoomId;
        public CommerceStruct commerceStruct;
        public boolean curIsMicRoom;
        public boolean curIsMicRoomFromOfficial;
        public HashMap<Long, String> debugInfos;
        public DeepLinkData deepLinkData;
        public int drawerTabInnerFeedSuggest;
        public String enterForMultiLive;
        public boolean enterFromAd;
        public String enterFromLiveSource;
        public String enterFromMerge;
        public String enterFromMergeRecommend;
        public int enterLiveAlive;
        public String enterLiveSource;
        public String enterMethod;
        public long enterRoomId;
        public int enterRoomOrientation;
        public String enterRoomScene;
        public String enterScene;
        public Rect enterSourcePosition;
        public String enterType;
        public long enterUserId;
        public String extraDict;
        public String extraSchema;
        public String feedUrl;
        public long firstLabelId;
        public String flareTaskId;
        public String followStatus;
        public boolean forceUseMultiListProvider;
        public String fragmentItemVPId;
        public boolean fromAutoJump;
        public String fromDrawerStyle;
        public boolean fromNewStyle;
        public long fromRoomId;
        public Map<String, String> gameLiveExtra;
        public ArrayList<String> gaussianBgUrls;
        public GuestUser guestUser;
        public Boolean hasCommerceGoods;
        public Boolean hasMoreExtra;
        public Long hashtagId;
        public String inflowKey;
        public boolean isBackPreRoom;
        public boolean isFresh;
        public int isFromBubble;
        public int isFromCache;
        public boolean isPreFetchUserRoom;
        public boolean isShowBackRoom;
        public boolean isShowFlare;
        public int landingPage;
        public MaskLayer maskLayer;
        public long maxTimeExtra;
        public String message;
        public String messageI18n;
        public boolean needLandInteractFragment;
        public boolean needSetRoomOrientation;
        public boolean openGiftPanel;
        public String openLiveFromDrawerTab;
        public String openOnboardingPage;
        public boolean openPropPanel;
        public boolean openSubscribePanel;
        public String openUrlLink;
        public int orientation;
        public boolean personalizedChanged;
        public int position;
        public boolean preCreateSurface;
        public boolean preIsMicRoom;
        public String preLoadRoomInfo;
        public long roomId;
        public long[] roomIds;
        public String roomInfoList;
        public String roomLabels;
        public String sceneId;
        public String secUid;
        public long secondLabelId;
        public boolean sendSubscriptionCapsule;
        public String shareFromUserId;
        public String shareIntent;
        public String shareSource;
        public long smallPictureOrder;
        public String sourceType;
        public LiveMode streamType;
        public long subscribePreviewTime;
        public TimeStamp timeStamps;
        public String unReadIdExtra;
        public String unreadExtra;
        public String userId;
        public String warmUpPlayerTag;
        public WarningTag warningTag;
        public int widgetAnchorNum;
        public String widgetType;
        public String windowMode;
        public String xtBackRoom;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RoomsData() {
            /*
                r97 = this;
                r1 = 0
                r3 = 0
                r22 = 0
                r93 = -1
                r95 = 1048575(0xfffff, float:1.469367E-39)
                r0 = r97
                r2 = r1
                r4 = r1
                r5 = r1
                r6 = r3
                r7 = r3
                r8 = r3
                r9 = r1
                r10 = r3
                r11 = r3
                r12 = r3
                r13 = r3
                r14 = r1
                r15 = r3
                r16 = r3
                r17 = r1
                r18 = r3
                r19 = r1
                r20 = r1
                r21 = r3
                r24 = r3
                r25 = r3
                r26 = r3
                r27 = r3
                r28 = r3
                r29 = r1
                r30 = r3
                r31 = r3
                r32 = r3
                r33 = r3
                r34 = r3
                r35 = r3
                r36 = r3
                r37 = r1
                r38 = r3
                r39 = r3
                r40 = r3
                r41 = r1
                r42 = r3
                r43 = r3
                r44 = r1
                r45 = r3
                r46 = r3
                r47 = r22
                r49 = r3
                r50 = r1
                r51 = r3
                r52 = r3
                r53 = r22
                r55 = r3
                r56 = r3
                r57 = r3
                r58 = r3
                r59 = r22
                r61 = r3
                r62 = r1
                r63 = r3
                r64 = r22
                r66 = r1
                r67 = r1
                r68 = r1
                r69 = r22
                r71 = r22
                r73 = r1
                r74 = r22
                r76 = r1
                r77 = r3
                r78 = r3
                r79 = r3
                r80 = r1
                r81 = r3
                r82 = r1
                r83 = r3
                r84 = r3
                r85 = r1
                r86 = r1
                r87 = r3
                r88 = r3
                r89 = r3
                r90 = r1
                r91 = r1
                r92 = r1
                r94 = r93
                r96 = r3
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r50, r51, r52, r53, r55, r56, r57, r58, r59, r61, r62, r63, r64, r66, r67, r68, r69, r71, r73, r74, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.session.EnterRoomConfig.RoomsData.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getBackUrl() {
            return this.backUrl;
        }

        public final void setBackUrl(String str) {
            this.backUrl = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(this.personalizedChanged ? 1 : 0);
            out.writeInt(this.isPreFetchUserRoom ? 1 : 0);
            out.writeString(this.secUid);
            out.writeInt(this.openPropPanel ? 1 : 0);
            out.writeInt(this.sendSubscriptionCapsule ? 1 : 0);
            out.writeString(this.inflowKey);
            out.writeString(this.extraDict);
            out.writeString(this.openOnboardingPage);
            out.writeInt(this.openGiftPanel ? 1 : 0);
            out.writeString(this.xtBackRoom);
            out.writeString(this.messageI18n);
            out.writeString(this.message);
            AdLiveEnterRoomConfig adLiveEnterRoomConfig = this.adLiveEnterRoomConfig;
            if (adLiveEnterRoomConfig == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                adLiveEnterRoomConfig.writeToParcel(out, i);
            }
            out.writeInt(this.enterFromAd ? 1 : 0);
            out.writeString(this.enterForMultiLive);
            out.writeParcelable(this.deepLinkData, i);
            out.writeInt(this.orientation);
            out.writeString(this.sceneId);
            out.writeInt(this.backTabIndex);
            out.writeInt(this.landingPage);
            out.writeString(this.unReadIdExtra);
            out.writeLong(this.maxTimeExtra);
            Boolean bool = this.hasMoreExtra;
            if (bool == null) {
                out.writeInt(0);
            } else {
                C1FL.LJ(out, 1, bool);
            }
            out.writeStringList(this.bgUrls);
            out.writeStringList(this.gaussianBgUrls);
            out.writeString(this.roomLabels);
            out.writeString(this.feedUrl);
            out.writeInt(this.isShowFlare ? 1 : 0);
            out.writeString(this.flareTaskId);
            out.writeString(this.userId);
            out.writeString(this.shareFromUserId);
            out.writeString(this.shareIntent);
            out.writeString(this.shareSource);
            out.writeString(this.warmUpPlayerTag);
            out.writeString(this.followStatus);
            out.writeInt(this.enterLiveAlive);
            out.writeParcelable(this.enterSourcePosition, i);
            out.writeLongArray(this.roomIds);
            out.writeString(this.roomInfoList);
            out.writeInt(this.forceUseMultiListProvider ? 1 : 0);
            out.writeString(this.enterFromMerge);
            out.writeString(this.enterMethod);
            out.writeInt(this.fromNewStyle ? 1 : 0);
            out.writeString(this.fromDrawerStyle);
            out.writeString(this.enterFromLiveSource);
            out.writeLong(this.roomId);
            out.writeString(this.backUrl);
            out.writeInt(this.position);
            out.writeString(this.windowMode);
            out.writeString(this.enterLiveSource);
            out.writeLong(this.fromRoomId);
            out.writeString(this.enterFromMergeRecommend);
            out.writeString(this.enterRoomScene);
            out.writeString(this.enterType);
            out.writeString(this.sourceType);
            out.writeLong(this.smallPictureOrder);
            TimeStamp timeStamp = this.timeStamps;
            if (timeStamp == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                timeStamp.writeToParcel(out, i);
            }
            out.writeInt(this.isShowBackRoom ? 1 : 0);
            out.writeString(this.enterScene);
            out.writeLong(this.backRoomId);
            out.writeInt(this.fromAutoJump ? 1 : 0);
            out.writeInt(this.preIsMicRoom ? 1 : 0);
            out.writeInt(this.curIsMicRoom ? 1 : 0);
            out.writeLong(this.enterRoomId);
            out.writeLong(this.enterUserId);
            out.writeInt(this.openSubscribePanel ? 1 : 0);
            out.writeLong(this.subscribePreviewTime);
            out.writeInt(this.curIsMicRoomFromOfficial ? 1 : 0);
            out.writeString(this.fragmentItemVPId);
            GuestUser guestUser = this.guestUser;
            if (guestUser == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                guestUser.writeToParcel(out, i);
            }
            out.writeString(this.backRoomSource);
            out.writeInt(this.isBackPreRoom ? 1 : 0);
            out.writeString(this.openLiveFromDrawerTab);
            out.writeInt(this.drawerTabInnerFeedSuggest);
            out.writeString(this.extraSchema);
            out.writeString(this.unreadExtra);
            out.writeInt(this.isFromBubble);
            out.writeInt(this.isFromCache);
            out.writeString(this.bubbleRoomId);
            out.writeString(this.bubbleOwnerd);
            out.writeString(this.widgetType);
            out.writeInt(this.widgetAnchorNum);
            out.writeInt(this.anchorPosition);
            out.writeInt(this.anchorRelationType);
        }

        public RoomsData(boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, String str3, String str4, boolean z5, String str5, String str6, String str7, AdLiveEnterRoomConfig adLiveEnterRoomConfig, boolean z6, String str8, DeepLinkData deepLinkData, int i, String str9, int i2, int i3, String str10, long j, Boolean bool, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str11, String str12, boolean z7, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i4, Rect rect, long[] jArr, String str20, boolean z8, String str21, String str22, boolean z9, String str23, String str24, long j2, String str25, int i5, String str26, String str27, long j3, String str28, String str29, String str30, String str31, long j4, TimeStamp timeStamp, boolean z10, String str32, long j5, boolean z11, boolean z12, boolean z13, long j6, long j7, boolean z14, long j8, boolean z15, String str33, GuestUser guestUser, String str34, boolean z16, String str35, int i6, String str36, String str37, int i7, int i8, String str38, String str39, String str40, int i9, int i10, int i11) {
            this.personalizedChanged = z;
            this.isPreFetchUserRoom = z2;
            this.secUid = str;
            this.openPropPanel = z3;
            this.sendSubscriptionCapsule = z4;
            this.inflowKey = str2;
            this.extraDict = str3;
            this.openOnboardingPage = str4;
            this.openGiftPanel = z5;
            this.xtBackRoom = str5;
            this.messageI18n = str6;
            this.message = str7;
            this.adLiveEnterRoomConfig = adLiveEnterRoomConfig;
            this.enterFromAd = z6;
            this.enterForMultiLive = str8;
            this.deepLinkData = deepLinkData;
            this.orientation = i;
            this.sceneId = str9;
            this.backTabIndex = i2;
            this.landingPage = i3;
            this.unReadIdExtra = str10;
            this.maxTimeExtra = j;
            this.hasMoreExtra = bool;
            this.bgUrls = arrayList;
            this.gaussianBgUrls = arrayList2;
            this.roomLabels = str11;
            this.feedUrl = str12;
            this.isShowFlare = z7;
            this.flareTaskId = str13;
            this.userId = str14;
            this.shareFromUserId = str15;
            this.shareIntent = str16;
            this.shareSource = str17;
            this.warmUpPlayerTag = str18;
            this.followStatus = str19;
            this.enterLiveAlive = i4;
            this.enterSourcePosition = rect;
            this.roomIds = jArr;
            this.roomInfoList = str20;
            this.forceUseMultiListProvider = z8;
            this.enterFromMerge = str21;
            this.enterMethod = str22;
            this.fromNewStyle = z9;
            this.fromDrawerStyle = str23;
            this.enterFromLiveSource = str24;
            this.roomId = j2;
            this.backUrl = str25;
            this.position = i5;
            this.windowMode = str26;
            this.enterLiveSource = str27;
            this.fromRoomId = j3;
            this.enterFromMergeRecommend = str28;
            this.enterRoomScene = str29;
            this.enterType = str30;
            this.sourceType = str31;
            this.smallPictureOrder = j4;
            this.timeStamps = timeStamp;
            this.isShowBackRoom = z10;
            this.enterScene = str32;
            this.backRoomId = j5;
            this.fromAutoJump = z11;
            this.preIsMicRoom = z12;
            this.curIsMicRoom = z13;
            this.enterRoomId = j6;
            this.enterUserId = j7;
            this.openSubscribePanel = z14;
            this.subscribePreviewTime = j8;
            this.curIsMicRoomFromOfficial = z15;
            this.fragmentItemVPId = str33;
            this.guestUser = guestUser;
            this.backRoomSource = str34;
            this.isBackPreRoom = z16;
            this.openLiveFromDrawerTab = str35;
            this.drawerTabInnerFeedSuggest = i6;
            this.extraSchema = str36;
            this.unreadExtra = str37;
            this.isFromBubble = i7;
            this.isFromCache = i8;
            this.bubbleRoomId = str38;
            this.bubbleOwnerd = str39;
            this.widgetType = str40;
            this.widgetAnchorNum = i9;
            this.anchorPosition = i10;
            this.anchorRelationType = i11;
            this.preLoadRoomInfo = "";
            this.streamType = LiveMode.VIDEO;
            this.firstLabelId = -1L;
            this.secondLabelId = -1L;
            this.bottomLabelId = -1L;
            this.bottomSubLabelId = -1L;
            this.openUrlLink = "";
            this.hashtagId = 0L;
            this.enterRoomOrientation = 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ RoomsData(boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, String str3, String str4, boolean z5, String str5, String str6, String str7, AdLiveEnterRoomConfig adLiveEnterRoomConfig, boolean z6, String str8, DeepLinkData deepLinkData, int i, String str9, int i2, int i3, String str10, long j, Boolean bool, ArrayList arrayList, ArrayList arrayList2, String str11, String str12, boolean z7, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i4, Rect rect, long[] jArr, String str20, boolean z8, String str21, String str22, boolean z9, String str23, String str24, long j2, String str25, int i5, String str26, String str27, long j3, String str28, String str29, String str30, String str31, long j4, TimeStamp timeStamp, boolean z10, String str32, long j5, boolean z11, boolean z12, boolean z13, long j6, long j7, boolean z14, long j8, boolean z15, String str33, GuestUser guestUser, String str34, boolean z16, String str35, int i6, String str36, String str37, int i7, int i8, String str38, String str39, String str40, int i9, int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? false : z, (i12 & 2) != 0 ? false : z2, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? false : z3, (i12 & 16) != 0 ? false : z4, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? false : z5, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? null : str6, (i12 & 2048) != 0 ? null : str7, (i12 & 4096) != 0 ? null : adLiveEnterRoomConfig, (i12 & FileUtils.BUFFER_SIZE) != 0 ? false : z6, (i12 & 16384) != 0 ? null : str8, (i12 & 32768) != 0 ? null : deepLinkData, (i12 & 65536) != 0 ? 0 : i, (131072 & i12) != 0 ? "" : str9, (262144 & i12) != 0 ? -1 : i2, (524288 & i12) != 0 ? -1 : i3, (1048576 & i12) != 0 ? "" : str10, (2097152 & i12) != 0 ? -1L : j, (4194304 & i12) != 0 ? null : bool, (8388608 & i12) != 0 ? null : arrayList, (16777216 & i12) != 0 ? null : arrayList2, (33554432 & i12) != 0 ? null : str11, (67108864 & i12) != 0 ? null : str12, (134217728 & i12) != 0 ? false : z7, (268435456 & i12) != 0 ? null : str13, (536870912 & i12) != 0 ? CardStruct.IStatusCode.DEFAULT : str14, (1073741824 & i12) != 0 ? CardStruct.IStatusCode.DEFAULT : str15, (i12 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str16, (i13 & 1) != 0 ? null : str17, (i13 & 2) != 0 ? null : str18, (i13 & 4) != 0 ? null : str19, (i13 & 8) != 0 ? 0 : i4, (i13 & 16) != 0 ? null : rect, (i13 & 32) != 0 ? null : jArr, (i13 & 64) != 0 ? null : str20, (i13 & 128) != 0 ? false : z8, (i13 & 256) != 0 ? null : str21, (i13 & 512) != 0 ? null : str22, (i13 & 1024) != 0 ? false : z9, (i13 & 2048) != 0 ? "" : str23, (i13 & 4096) != 0 ? "" : str24, (i13 & FileUtils.BUFFER_SIZE) != 0 ? -1L : j2, (i13 & 16384) != 0 ? null : str25, (i13 & 32768) != 0 ? 0 : i5, (i13 & 65536) != 0 ? "full_screen" : str26, (131072 & i13) != 0 ? "" : str27, (262144 & i13) != 0 ? 0L : j3, (524288 & i13) != 0 ? null : str28, (1048576 & i13) != 0 ? "inner_draw" : str29, (2097152 & i13) != 0 ? null : str30, (4194304 & i13) != 0 ? null : str31, (8388608 & i13) != 0 ? -1L : j4, (16777216 & i13) != 0 ? new TimeStamp(0L, null, 3, 0 == true ? 1 : 0) : timeStamp, (33554432 & i13) != 0 ? false : z10, (67108864 & i13) != 0 ? null : str32, (134217728 & i13) != 0 ? 0L : j5, (268435456 & i13) != 0 ? false : z11, (536870912 & i13) != 0 ? false : z12, (1073741824 & i13) != 0 ? false : z13, (i13 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? 0L : j6, (i14 & 1) == 0 ? j7 : 0L, (i14 & 2) != 0 ? false : z14, (i14 & 4) == 0 ? j8 : -1L, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? null : str33, (i14 & 32) != 0 ? new GuestUser(0L, null, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0) : guestUser, (i14 & 64) != 0 ? null : str34, (i14 & 128) != 0 ? false : z16, (i14 & 256) != 0 ? "" : str35, (i14 & 512) != 0 ? 0 : i6, (i14 & 1024) == 0 ? str36 : "", (i14 & 2048) != 0 ? null : str37, (i14 & 4096) != 0 ? 0 : i7, (i14 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i8, (i14 & 16384) != 0 ? null : str38, (i14 & 32768) != 0 ? null : str39, (i14 & 65536) != 0 ? null : str40, (131072 & i14) != 0 ? 0 : i9, (262144 & i14) != 0 ? 0 : i10, (i14 & 524288) != 0 ? 0 : i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class SearchWrapData implements Parcelable {
        public static final Parcelable.Creator<SearchWrapData> CREATOR = new BL4();
        public boolean isFromSearch;
        public boolean isSearchHasMore;
        public String listProviderTag;

        /* JADX WARN: Multi-variable type inference failed */
        public SearchWrapData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.listProviderTag);
        }

        public SearchWrapData(String str) {
            this.listProviderTag = str;
        }

        public /* synthetic */ SearchWrapData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private final ActivityC45651qj asActivity(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return asActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final void updateGdLabel(Context context) {
        Intent intent;
        String LLJJIJIIJIL;
        o.LJIIIZ(context, "context");
        ActivityC45651qj asActivity = asActivity(context);
        if (asActivity != null && (intent = asActivity.getIntent()) != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "gd_label")) != null && LLJJIJIIJIL.length() > 0) {
            this.mLogData.gdLabel = LLJJIJIIJIL;
        }
    }

    /* loaded from: classes6.dex */
    public static final class FeedCoverData implements Parcelable {
        public static final Parcelable.Creator<FeedCoverData> CREATOR = new BNO();
        public boolean enterPreviewSmooth;
        public PlayerInfo playerInfo;
        public List<String> urlList;

        /* JADX WARN: Multi-variable type inference failed */
        public FeedCoverData() {
            this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(this.enterPreviewSmooth ? 1 : 0);
            out.writeStringList(this.urlList);
            this.playerInfo.writeToParcel(out, i);
        }

        /* loaded from: classes6.dex */
        public static final class PlayerInfo implements Parcelable {
            public static final Parcelable.Creator<PlayerInfo> CREATOR = new BNN();
            public Rect playerActualRange;
            public OSZ<Integer, Integer> playerSize;
            public OSZ<Integer, Integer> playerViewSize;
            public String sei;

            /* JADX WARN: Multi-variable type inference failed */
            public PlayerInfo() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                o.LJIIIZ(out, "out");
                out.writeString(this.sei);
                out.writeParcelable(this.playerActualRange, i);
            }

            public PlayerInfo(String str, Rect playerActualRange) {
                o.LJIIIZ(playerActualRange, "playerActualRange");
                this.sei = str;
                this.playerActualRange = playerActualRange;
                this.playerSize = new OSZ<>(-1, -1);
                this.playerViewSize = new OSZ<>(0, 0);
            }

            public /* synthetic */ PlayerInfo(String str, Rect rect, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new Rect() : rect);
            }
        }

        public FeedCoverData(boolean z, List<String> list, PlayerInfo playerInfo) {
            o.LJIIIZ(playerInfo, "playerInfo");
            this.enterPreviewSmooth = z;
            this.urlList = list;
            this.playerInfo = playerInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ FeedCoverData(boolean z, List list, PlayerInfo playerInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? new PlayerInfo(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : playerInfo);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ECWrapData implements Parcelable {
        public int autoOpenProductBag;
        public String autoOpenProductBagTrackParams;
        public HashMap<String, String> ecCommonExtraParam;
        public String ecRecommendInfo;
        public List<Long> exposureItems;
        public int isFromECContext;
        public int isPrefetchPinEnabled;
        public int optAutoRouteSchemeRouting;
        public HashMap<String, String> tagDaInfo;
        public static final BJQ Companion = new BJQ();
        public static final Parcelable.Creator<ECWrapData> CREATOR = new C28552BIm();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ECWrapData() {
            /*
                r12 = this;
                r1 = 0
                r3 = 0
                r10 = 511(0x1ff, float:7.16E-43)
                r0 = r12
                r2 = r1
                r4 = r3
                r5 = r1
                r6 = r1
                r7 = r3
                r8 = r3
                r9 = r3
                r11 = r3
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.session.EnterRoomConfig.ECWrapData.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeInt(this.isFromECContext);
            out.writeInt(this.autoOpenProductBag);
            out.writeString(this.autoOpenProductBagTrackParams);
            HashMap<String, String> hashMap = this.ecCommonExtraParam;
            out.writeInt(hashMap.size());
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
            out.writeInt(this.optAutoRouteSchemeRouting);
            out.writeInt(this.isPrefetchPinEnabled);
            HashMap<String, String> hashMap2 = this.tagDaInfo;
            if (hashMap2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(hashMap2.size());
                for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
                    out.writeString(entry2.getKey());
                    out.writeString(entry2.getValue());
                }
            }
            out.writeString(this.ecRecommendInfo);
            List<Long> list = this.exposureItems;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeLong(((Number) LIZIZ.next()).longValue());
            }
        }

        public ECWrapData(int i, int i2, String str, HashMap<String, String> ecCommonExtraParam, int i3, int i4, HashMap<String, String> hashMap, String str2, List<Long> list) {
            o.LJIIIZ(ecCommonExtraParam, "ecCommonExtraParam");
            this.isFromECContext = i;
            this.autoOpenProductBag = i2;
            this.autoOpenProductBagTrackParams = str;
            this.ecCommonExtraParam = ecCommonExtraParam;
            this.optAutoRouteSchemeRouting = i3;
            this.isPrefetchPinEnabled = i4;
            this.tagDaInfo = hashMap;
            this.ecRecommendInfo = str2;
            this.exposureItems = list;
        }

        public /* synthetic */ ECWrapData(int i, int i2, String str, HashMap hashMap, int i3, int i4, HashMap hashMap2, String str2, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? new HashMap() : hashMap, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) == 0 ? i4 : 0, (i5 & 64) != 0 ? null : hashMap2, (i5 & 128) != 0 ? null : str2, (i5 & 256) == 0 ? list : null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class LogData implements Parcelable {
        public String anchorId;
        public String anchorType;
        public Integer balanceLiveLine;
        public Integer balanceLivePosition;
        public String bottomLeftRoomLabel;
        public String cardPosition;
        public long cardRoomId;
        public String clickMethod;
        public String drawAction;
        public String endSourceActionType;
        public String endSourceEnterFromMerge;
        public String endSourceEnterMethod;
        public String endViewStatus;
        public String enterFrom;
        public String enterGiftPanelSource;
        public String enterLiveModule;
        public String enterLiveSquareSource;
        public long enterRoomId;
        public String enterRoomViaPreviewGuide;
        public int followListOrder;
        public String follow_status;
        public int fromEnd;
        public long fromPortalId;
        public long fromRoomId;
        public String gdLabel;
        public int giftEffectFinish;
        public int giftEffectStart;
        public String innerPushType;
        public Boolean isAutoEnter;
        public Integer isConsumeNewUser;
        public Integer isFirstRecharge;
        public int isFromList;
        public boolean isPreLiveAccessRecall;
        public boolean isVideoHead;
        public String list_item_id;
        public String liveEndExit;
        public String livePlaySessionId;
        public String liveReason;
        public String liveRecommendReason;
        public String liveRoomMode;
        public String liveSortBy;
        public long loadDuration;
        public Map<String, String> logMap;
        public String logPb;
        public String logTopMessageType;
        public String magic3_activity_id;
        public String magic3_comptype;
        public String magic3_source;
        public ArrayList<EnterRoomConfig> moreConfig;
        public long originatingRoomId;
        public String popType;
        public long portalClickStamp;
        public int positionOutsideLiveRoom;
        public String previewCardClickArea;
        public String pushStreamUrlStatus;
        public String recContentId;
        public String recContentType;
        public Integer rechargePackage;
        public String rechargeType;
        public String requestId;
        public String requestPage;
        public String search_id;
        public String search_keyword;
        public String search_result_id;
        public String search_result_id_v2;
        public int search_result_type;
        public String search_type;
        public String share_from;
        public String sharedPlatform;
        public String sourceModule;
        public String subGameRank;
        public String superiorPageFrom;
        public int toggleStatus;
        public String topLeftRoomLabel;
        public String toplivePosition;
        public long userFrom;
        public String videoId;
        public static final BLK Companion = new BLK();
        public static final Parcelable.Creator<LogData> CREATOR = new BLJ();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LogData() {
            /*
                r83 = this;
                r1 = 0
                r19 = 0
                r21 = 0
                r79 = -1
                r81 = 127(0x7f, float:1.78E-43)
                r0 = r83
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r9 = r1
                r10 = r1
                r11 = r1
                r12 = r1
                r13 = r1
                r14 = r1
                r15 = r1
                r16 = r1
                r17 = r1
                r18 = r1
                r22 = r1
                r23 = r19
                r25 = r1
                r26 = r1
                r27 = r1
                r28 = r1
                r29 = r1
                r30 = r1
                r31 = r19
                r33 = r19
                r35 = r19
                r37 = r1
                r38 = r1
                r39 = r1
                r40 = r1
                r41 = r21
                r42 = r1
                r43 = r1
                r44 = r1
                r45 = r1
                r46 = r1
                r47 = r1
                r48 = r1
                r49 = r1
                r50 = r1
                r51 = r1
                r52 = r21
                r53 = r1
                r54 = r1
                r55 = r1
                r56 = r1
                r57 = r1
                r58 = r1
                r59 = r21
                r60 = r21
                r61 = r21
                r62 = r1
                r63 = r19
                r65 = r19
                r67 = r1
                r68 = r21
                r69 = r1
                r70 = r1
                r71 = r1
                r72 = r1
                r73 = r1
                r74 = r21
                r75 = r21
                r76 = r21
                r77 = r1
                r78 = r1
                r80 = r79
                r82 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r65, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.session.EnterRoomConfig.LogData.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            ArrayList<EnterRoomConfig> arrayList = this.moreConfig;
            if (arrayList == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(arrayList.size());
                Iterator<EnterRoomConfig> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(out, i);
                }
            }
            Map<String, String> map = this.logMap;
            if (map == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    out.writeString(entry.getKey());
                    out.writeString(entry.getValue());
                }
            }
            out.writeString(this.enterGiftPanelSource);
            out.writeString(this.enterLiveSquareSource);
            out.writeString(this.requestId);
            out.writeString(this.clickMethod);
            out.writeString(this.anchorId);
            out.writeString(this.videoId);
            Integer num = this.isFirstRecharge;
            if (num == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num);
            }
            out.writeString(this.rechargeType);
            Integer num2 = this.rechargePackage;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num2);
            }
            Integer num3 = this.balanceLiveLine;
            if (num3 == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num3);
            }
            Integer num4 = this.isConsumeNewUser;
            if (num4 == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num4);
            }
            Integer num5 = this.balanceLivePosition;
            if (num5 == null) {
                out.writeInt(0);
            } else {
                C1FJ.LJ(out, 1, num5);
            }
            out.writeString(this.liveReason);
            out.writeString(this.logPb);
            out.writeString(this.requestPage);
            out.writeString(this.anchorType);
            out.writeLong(this.userFrom);
            out.writeInt(this.isVideoHead ? 1 : 0);
            out.writeString(this.enterLiveModule);
            out.writeLong(this.enterRoomId);
            out.writeString(this.superiorPageFrom);
            out.writeString(this.logTopMessageType);
            out.writeString(this.innerPushType);
            out.writeString(this.gdLabel);
            out.writeString(this.cardPosition);
            out.writeString(this.popType);
            out.writeLong(this.fromPortalId);
            out.writeLong(this.originatingRoomId);
            out.writeLong(this.loadDuration);
            out.writeString(this.search_id);
            out.writeString(this.search_keyword);
            out.writeString(this.search_result_id);
            out.writeString(this.search_result_id_v2);
            out.writeInt(this.search_result_type);
            out.writeString(this.search_type);
            out.writeString(this.list_item_id);
            out.writeString(this.follow_status);
            out.writeString(this.share_from);
            out.writeString(this.toplivePosition);
            out.writeString(this.magic3_source);
            out.writeString(this.magic3_activity_id);
            out.writeString(this.magic3_comptype);
            out.writeString(this.topLeftRoomLabel);
            out.writeString(this.bottomLeftRoomLabel);
            out.writeInt(this.fromEnd);
            out.writeString(this.endSourceEnterFromMerge);
            out.writeString(this.endSourceEnterMethod);
            out.writeString(this.endSourceActionType);
            out.writeString(this.endViewStatus);
            out.writeString(this.liveEndExit);
            out.writeString(this.liveRecommendReason);
            out.writeInt(this.isFromList);
            out.writeInt(this.isPreLiveAccessRecall ? 1 : 0);
            out.writeInt(this.positionOutsideLiveRoom);
            out.writeString(this.previewCardClickArea);
            out.writeLong(this.cardRoomId);
            out.writeLong(this.fromRoomId);
            out.writeString(this.drawAction);
            out.writeInt(this.toggleStatus);
            out.writeString(this.enterRoomViaPreviewGuide);
            out.writeString(this.subGameRank);
            out.writeString(this.sharedPlatform);
            out.writeString(this.sourceModule);
            out.writeString(this.liveSortBy);
            out.writeInt(this.giftEffectStart);
            out.writeInt(this.giftEffectFinish);
            out.writeInt(this.followListOrder);
            out.writeString(this.pushStreamUrlStatus);
            Boolean bool = this.isAutoEnter;
            if (bool == null) {
                out.writeInt(0);
            } else {
                C1FL.LJ(out, 1, bool);
            }
        }

        public LogData(ArrayList<EnterRoomConfig> arrayList, Map<String, String> map, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, Integer num2, Integer num3, Integer num4, Integer num5, String str8, String str9, String str10, String str11, long j, boolean z, String str12, long j2, String str13, String str14, String str15, String str16, String str17, String str18, long j3, long j4, long j5, String str19, String str20, String str21, String str22, int i, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, int i2, String str33, String str34, String str35, String str36, String str37, String str38, int i3, boolean z2, int i4, String str39, long j6, long j7, String drawAction, int i5, String str40, String str41, String str42, String str43, String str44, int i6, int i7, int i8, String str45, Boolean bool) {
            o.LJIIIZ(drawAction, "drawAction");
            this.moreConfig = arrayList;
            this.logMap = map;
            this.enterGiftPanelSource = str;
            this.enterLiveSquareSource = str2;
            this.requestId = str3;
            this.clickMethod = str4;
            this.anchorId = str5;
            this.videoId = str6;
            this.isFirstRecharge = num;
            this.rechargeType = str7;
            this.rechargePackage = num2;
            this.balanceLiveLine = num3;
            this.isConsumeNewUser = num4;
            this.balanceLivePosition = num5;
            this.liveReason = str8;
            this.logPb = str9;
            this.requestPage = str10;
            this.anchorType = str11;
            this.userFrom = j;
            this.isVideoHead = z;
            this.enterLiveModule = str12;
            this.enterRoomId = j2;
            this.superiorPageFrom = str13;
            this.logTopMessageType = str14;
            this.innerPushType = str15;
            this.gdLabel = str16;
            this.cardPosition = str17;
            this.popType = str18;
            this.fromPortalId = j3;
            this.originatingRoomId = j4;
            this.loadDuration = j5;
            this.search_id = str19;
            this.search_keyword = str20;
            this.search_result_id = str21;
            this.search_result_id_v2 = str22;
            this.search_result_type = i;
            this.search_type = str23;
            this.list_item_id = str24;
            this.follow_status = str25;
            this.share_from = str26;
            this.toplivePosition = str27;
            this.magic3_source = str28;
            this.magic3_activity_id = str29;
            this.magic3_comptype = str30;
            this.topLeftRoomLabel = str31;
            this.bottomLeftRoomLabel = str32;
            this.fromEnd = i2;
            this.endSourceEnterFromMerge = str33;
            this.endSourceEnterMethod = str34;
            this.endSourceActionType = str35;
            this.endViewStatus = str36;
            this.liveEndExit = str37;
            this.liveRecommendReason = str38;
            this.isFromList = i3;
            this.isPreLiveAccessRecall = z2;
            this.positionOutsideLiveRoom = i4;
            this.previewCardClickArea = str39;
            this.cardRoomId = j6;
            this.fromRoomId = j7;
            this.drawAction = drawAction;
            this.toggleStatus = i5;
            this.enterRoomViaPreviewGuide = str40;
            this.subGameRank = str41;
            this.sharedPlatform = str42;
            this.sourceModule = str43;
            this.liveSortBy = str44;
            this.giftEffectStart = i6;
            this.giftEffectFinish = i7;
            this.followListOrder = i8;
            this.pushStreamUrlStatus = str45;
            this.isAutoEnter = bool;
            this.livePlaySessionId = "";
        }

        public /* synthetic */ LogData(ArrayList arrayList, Map map, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, Integer num2, Integer num3, Integer num4, Integer num5, String str8, String str9, String str10, String str11, long j, boolean z, String str12, long j2, String str13, String str14, String str15, String str16, String str17, String str18, long j3, long j4, long j5, String str19, String str20, String str21, String str22, int i, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, int i2, String str33, String str34, String str35, String str36, String str37, String str38, int i3, boolean z2, int i4, String str39, long j6, long j7, String str40, int i5, String str41, String str42, String str43, String str44, String str45, int i6, int i7, int i8, String str46, Boolean bool, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? null : arrayList, (i9 & 2) != 0 ? null : map, (i9 & 4) != 0 ? null : str, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : str3, (i9 & 32) != 0 ? null : str4, (i9 & 64) != 0 ? null : str5, (i9 & 128) != 0 ? null : str6, (i9 & 256) != 0 ? null : num, (i9 & 512) != 0 ? null : str7, (i9 & 1024) != 0 ? null : num2, (i9 & 2048) != 0 ? null : num3, (i9 & 4096) != 0 ? null : num4, (i9 & FileUtils.BUFFER_SIZE) != 0 ? null : num5, (i9 & 16384) != 0 ? null : str8, (i9 & 32768) != 0 ? null : str9, (i9 & 65536) != 0 ? "" : str10, (i9 & 131072) != 0 ? "" : str11, (262144 & i9) != 0 ? 0L : j, (524288 & i9) != 0 ? false : z, (1048576 & i9) != 0 ? null : str12, (2097152 & i9) != 0 ? 0L : j2, (4194304 & i9) != 0 ? null : str13, (8388608 & i9) != 0 ? null : str14, (16777216 & i9) != 0 ? null : str15, (33554432 & i9) != 0 ? null : str16, (67108864 & i9) != 0 ? null : str17, (134217728 & i9) == 0 ? str18 : "", (268435456 & i9) != 0 ? 0L : j3, (536870912 & i9) != 0 ? 0L : j4, (1073741824 & i9) == 0 ? j5 : 0L, (i9 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str19, (i10 & 1) != 0 ? null : str20, (i10 & 2) != 0 ? null : str21, (i10 & 4) != 0 ? null : str22, (i10 & 8) != 0 ? 0 : i, (i10 & 16) != 0 ? null : str23, (i10 & 32) != 0 ? null : str24, (i10 & 64) != 0 ? null : str25, (i10 & 128) != 0 ? null : str26, (i10 & 256) != 0 ? null : str27, (i10 & 512) != 0 ? null : str28, (i10 & 1024) != 0 ? null : str29, (i10 & 2048) != 0 ? null : str30, (i10 & 4096) != 0 ? null : str31, (i10 & FileUtils.BUFFER_SIZE) != 0 ? null : str32, (i10 & 16384) != 0 ? 0 : i2, (i10 & 32768) != 0 ? null : str33, (i10 & 65536) != 0 ? null : str34, (i10 & 131072) != 0 ? null : str35, (262144 & i10) != 0 ? null : str36, (524288 & i10) != 0 ? null : str37, (1048576 & i10) != 0 ? null : str38, (2097152 & i10) != 0 ? 0 : i3, (4194304 & i10) != 0 ? false : z2, (8388608 & i10) != 0 ? -1 : i4, (16777216 & i10) != 0 ? null : str39, (33554432 & i10) != 0 ? -1L : j6, (67108864 & i10) != 0 ? -1L : j7, (134217728 & i10) != 0 ? "-1" : str40, (268435456 & i10) != 0 ? 3 : i5, (536870912 & i10) != 0 ? null : str41, (1073741824 & i10) != 0 ? null : str42, (i10 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str43, (i11 & 1) != 0 ? null : str44, (i11 & 2) != 0 ? null : str45, (i11 & 4) != 0 ? 0 : i6, (i11 & 8) != 0 ? 0 : i7, (i11 & 16) == 0 ? i8 : 0, (i11 & 32) != 0 ? null : str46, (i11 & 64) != 0 ? null : bool);
        }
    }

    /* loaded from: classes6.dex */
    public static final class TimeStamp implements Parcelable {
        public static final Parcelable.Creator<TimeStamp> CREATOR = new BL0();
        public Long enterRoomStarInnerTime;
        public long enterRoomStarTime;
        public long enterRoomStarTimeReal;

        /* JADX WARN: Multi-variable type inference failed */
        public TimeStamp() {
            this(0L, null, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public TimeStamp(long j, Long l) {
            this.enterRoomStarTime = j;
            this.enterRoomStarInnerTime = l;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeLong(this.enterRoomStarTime);
            Long l = this.enterRoomStarInnerTime;
            if (l == null) {
                out.writeInt(0);
            } else {
                C05040Hs.LIZLLL(out, 1, l);
            }
        }

        public /* synthetic */ TimeStamp(long j, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : l);
        }
    }

    /* loaded from: classes6.dex */
    public static final class GuestUser implements Parcelable {
        public static final Parcelable.Creator<GuestUser> CREATOR = new BL1();
        public String distributionType;
        public int isGuestEnter;
        public String nickName;
        public long uid;

        /* JADX WARN: Multi-variable type inference failed */
        public GuestUser() {
            this(0L, null, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeLong(this.uid);
            out.writeString(this.nickName);
            out.writeInt(this.isGuestEnter);
            out.writeString(this.distributionType);
        }

        public GuestUser(long j, String str, int i, String str2) {
            this.uid = j;
            this.nickName = str;
            this.isGuestEnter = i;
            this.distributionType = str2;
        }

        public /* synthetic */ GuestUser(long j, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnterRoomConfig(StreamData mStreamData, LogData mLogData, RoomsData mRoomsData, SearchWrapData mSearchData, ECWrapData mECData, DrawParams drawParams) {
        o.LJIIIZ(mStreamData, "mStreamData");
        o.LJIIIZ(mLogData, "mLogData");
        o.LJIIIZ(mRoomsData, "mRoomsData");
        o.LJIIIZ(mSearchData, "mSearchData");
        o.LJIIIZ(mECData, "mECData");
        o.LJIIIZ(drawParams, "drawParams");
        this.mStreamData = mStreamData;
        this.mLogData = mLogData;
        this.mRoomsData = mRoomsData;
        this.mSearchData = mSearchData;
        this.mECData = mECData;
        this.drawParams = drawParams;
        this.mFeedCoverData = new FeedCoverData(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* loaded from: classes6.dex */
    public static final class StreamData implements Parcelable {
        public static final Parcelable.Creator<StreamData> CREATOR = new BJR();
        public long captionStreamDelayMs;
        public boolean disablePrePullStream;
        public boolean enablePreCreateSurface;
        public boolean extraStreamSRAntiAlias;
        public boolean extraStreamSREnable;
        public int extraStreamSRStrength;
        public boolean isWithPush;
        public String options;
        public String pullDefaultResolution;
        public String pullSDKParam;
        public String pullStreamData;
        public String pullStreamUrl;
        public String sharePullStreamData;
        public long streamRoomId;
        public int streamType;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public StreamData() {
            /*
                r19 = this;
                r1 = 0
                r7 = 0
                r12 = 0
                r17 = 16383(0x3fff, float:2.2957E-41)
                r0 = r19
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r8 = r7
                r9 = r7
                r10 = r7
                r11 = r7
                r14 = r7
                r15 = r12
                r18 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r17, r18)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.session.EnterRoomConfig.StreamData.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            out.writeString(this.pullStreamUrl);
            out.writeString(this.pullSDKParam);
            out.writeString(this.pullStreamData);
            out.writeString(this.options);
            out.writeString(this.sharePullStreamData);
            out.writeString(this.pullDefaultResolution);
            out.writeInt(this.extraStreamSREnable ? 1 : 0);
            out.writeInt(this.extraStreamSRAntiAlias ? 1 : 0);
            out.writeInt(this.extraStreamSRStrength);
            out.writeInt(this.streamType);
            out.writeInt(this.disablePrePullStream ? 1 : 0);
            out.writeLong(this.streamRoomId);
            out.writeInt(this.isWithPush ? 1 : 0);
            out.writeLong(this.captionStreamDelayMs);
        }

        public StreamData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, int i2, boolean z3, long j, boolean z4, long j2) {
            this.pullStreamUrl = str;
            this.pullSDKParam = str2;
            this.pullStreamData = str3;
            this.options = str4;
            this.sharePullStreamData = str5;
            this.pullDefaultResolution = str6;
            this.extraStreamSREnable = z;
            this.extraStreamSRAntiAlias = z2;
            this.extraStreamSRStrength = i;
            this.streamType = i2;
            this.disablePrePullStream = z3;
            this.streamRoomId = j;
            this.isWithPush = z4;
            this.captionStreamDelayMs = j2;
        }

        public /* synthetic */ StreamData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, int i2, boolean z3, long j, boolean z4, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) == 0 ? str6 : null, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? 0 : i, (i3 & 512) != 0 ? -1 : i2, (i3 & 1024) != 0 ? false : z3, (i3 & 2048) != 0 ? -1L : j, (i3 & 4096) == 0 ? z4 : false, (i3 & FileUtils.BUFFER_SIZE) != 0 ? 0L : j2);
        }
    }
}
