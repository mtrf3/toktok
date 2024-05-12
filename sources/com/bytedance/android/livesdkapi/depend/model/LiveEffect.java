package com.bytedance.android.livesdkapi.depend.model;

import X.C16880lQ;
import X.C30496By0;
import X.C30522ByQ;
import X.C47135Ieh;
import X.C6NP;
import X.C76914UGo;
import X.C76915UGp;
import X.C76916UGq;
import X.C79242V8c;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.UrlModel;
import com.google.gson.j;
import com.google.gson.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public class LiveEffect {
    public static final C30522ByQ Companion = new C30522ByQ();
    public int abGroup;
    public String clickUrlForEC;

    /* renamed from: default, reason: not valid java name */
    public boolean f10default;
    public Effect effect;
    public String effectPanelKey;
    public String effectPanelName;

    @InterfaceC65349Pkn("extra")
    public String extra;
    public boolean forbidInLink;
    public String hint;
    public UrlModel hintIcon;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel icon;
    public Integer impressionPos;
    public boolean isDownloaded;
    public boolean isDownloading;
    public boolean isExclusive;
    public boolean isFromOtherUser;
    public boolean isGreenScreen;
    public boolean isIconInsert;
    public boolean isIconInsertInCoHost;
    public boolean isIconInsertInMultiGuest;
    public boolean isLiveGoal;
    public boolean isLocal;
    public boolean isNew;
    public boolean isNone;
    public boolean isShareBackground;
    public boolean isSoloBackground;
    public boolean isVideoUsedSticker;
    public Boolean isWithoutFace;
    public boolean loadingSpecialIcon;
    public int localIcon;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("effect_name_en")
    public String nameForEnglish;
    public boolean needSafeArea;
    public boolean notMultiGuestEffect;
    public String parentEffectId;
    public Integer parentImpressionPos;
    public String parentResId;
    public String parentResName;
    public long recommendEndTime;
    public long recommendStartTime;
    public boolean reviewOriginalFrame;
    public String sdkExtra;
    public StickerSDKExtra sdkExtraModel;
    public String shareImageId;
    public String shareImagePath;
    public String shareImageUrl;
    public List<? extends LiveEffect> subStickers;

    @InterfaceC65349Pkn("tags")
    public List<String> tags;
    public String tagsUpdatedAt;

    @InterfaceC65349Pkn("types")
    public List<String> types;
    public String urlPrefix;
    public Boolean useOutput;
    public String realId = "";
    public String resourceId = "";
    public String quiz = "";
    public String recommendPreviewIcon = "";
    public C30496By0 logParams = new C30496By0();
    public String unzipPath = "";

    @InterfaceC65349Pkn("id")
    public long effectId;
    public String filterId = String.valueOf(this.effectId);
    public List<ComposerConfig> composerConfigList = new ArrayList();
    public ArrayList<String> updateKeys = new ArrayList<>();
    public ArrayList<Integer> coexistGroup = new ArrayList<>();
    public C6NP localViewType = C6NP.NORMAL;
    public String actionSchema = "";

    /* loaded from: classes14.dex */
    public static final class ComposerConfig {
        public int LIZ;
        public int LIZIZ;
        public int LIZLLL;
        public float LJFF;

        @InterfaceC65349Pkn("value")
        public int defaultValue;

        @InterfaceC65349Pkn("doubleDirection")
        public boolean doubleDirection;

        @InterfaceC65349Pkn("min")
        public int minValue;

        @InterfaceC65349Pkn("name")
        public String name = "";

        @InterfaceC65349Pkn("tag")
        public String tag = "";

        @InterfaceC65349Pkn("max")
        public int maxValue = 100;
        public int LIZJ = 100;
        public float LJ = 1.0f;
    }

    /* loaded from: classes14.dex */
    public static final class StickerSDKExtra {

        @InterfaceC65349Pkn("audio_graph")
        public AudioGraphBean audioGraph;

        @InterfaceC65349Pkn("commerce")
        public CommerceExtra commerceExtra;

        @InterfaceC65349Pkn("is_avatar")
        public boolean isAvatar;

        @InterfaceC65349Pkn("live_goal")
        public LiveGoalExtra liveGoalExtra;

        @InterfaceC65349Pkn("pl")
        public PlDataBean pl;
    }

    public static final boolean equals(LiveEffect liveEffect, LiveEffect liveEffect2) {
        Companion.getClass();
        return C30522ByQ.LIZ(liveEffect, liveEffect2);
    }

    public final boolean getDefault() {
        boolean z = false;
        try {
            if (this.extra != null) {
                new o();
                j LJJIJ = o.LIZ(this.extra).LJIIZILJ().LJJIJ("default");
                if (LJJIJ == null) {
                    return false;
                }
                z = LJJIJ.LJFF();
                return z;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return z;
    }

    public final LiveEffect copy() {
        LiveEffect liveEffect = new LiveEffect();
        liveEffect.effectId = this.effectId;
        liveEffect.realId = this.realId;
        liveEffect.setResourceId(getResourceId());
        liveEffect.icon = this.icon;
        liveEffect.name = getName();
        liveEffect.nameForEnglish = this.nameForEnglish;
        liveEffect.isIconInsert = this.isIconInsert;
        liveEffect.isIconInsertInCoHost = this.isIconInsertInCoHost;
        liveEffect.isIconInsertInMultiGuest = this.isIconInsertInMultiGuest;
        liveEffect.logParams = this.logParams;
        liveEffect.hint = this.hint;
        liveEffect.hintIcon = this.hintIcon;
        liveEffect.unzipPath = this.unzipPath;
        liveEffect.setTags(getTags());
        liveEffect.types = this.types;
        liveEffect.tagsUpdatedAt = this.tagsUpdatedAt;
        liveEffect.isDownloaded = this.isDownloaded;
        liveEffect.isDownloading = this.isDownloading;
        liveEffect.abGroup = this.abGroup;
        liveEffect.composerConfigList = this.composerConfigList;
        liveEffect.subStickers = this.subStickers;
        liveEffect.updateKeys = this.updateKeys;
        liveEffect.setEffect(getEffect());
        liveEffect.coexistGroup = this.coexistGroup;
        liveEffect.isWithoutFace = this.isWithoutFace;
        liveEffect.useOutput = this.useOutput;
        liveEffect.reviewOriginalFrame = this.reviewOriginalFrame;
        liveEffect.isVideoUsedSticker = this.isVideoUsedSticker;
        liveEffect.parentResId = this.parentResId;
        liveEffect.parentResName = this.parentResName;
        liveEffect.parentImpressionPos = this.parentImpressionPos;
        liveEffect.impressionPos = this.impressionPos;
        liveEffect.extra = this.extra;
        liveEffect.effectPanelName = this.effectPanelName;
        liveEffect.effectPanelKey = this.effectPanelKey;
        liveEffect.isNone = isNone();
        liveEffect.isExclusive = this.isExclusive;
        liveEffect.sdkExtra = this.sdkExtra;
        liveEffect.sdkExtraModel = this.sdkExtraModel;
        liveEffect.localViewType = this.localViewType;
        liveEffect.forbidInLink = this.forbidInLink;
        liveEffect.needSafeArea = this.needSafeArea;
        liveEffect.actionSchema = this.actionSchema;
        liveEffect.clickUrlForEC = this.clickUrlForEC;
        liveEffect.isGreenScreen = this.isGreenScreen;
        liveEffect.notMultiGuestEffect = this.notMultiGuestEffect;
        return liveEffect;
    }

    public final int getCurrentUiValue() {
        ComposerConfig composerConfig = (ComposerConfig) ORZ.LJLLLL(this.composerConfigList);
        if (composerConfig != null) {
            return composerConfig.LIZ;
        }
        return 0;
    }

    public final ComposerConfig getSmallItemConfig() {
        return (ComposerConfig) ORZ.LJLLLL(this.composerConfigList);
    }

    public final boolean isSubItem() {
        if (this.parentResId != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return getResourceId().hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEffect{name=");
        LIZ.append(getName());
        LIZ.append(", resId=");
        LIZ.append(getResourceId());
        LIZ.append(", effectId=");
        return C47135Ieh.LIZIZ(LIZ, this.effectId, '}', LIZ);
    }

    public final String toStringWithBeautyUiValue() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveEffect: name=");
        LIZ.append(getName());
        LIZ.append(" resId=");
        LIZ.append(getResourceId());
        LIZ.append(" composerConfig=");
        ComposerConfig composerConfig = (ComposerConfig) ORZ.LJLLLL(this.composerConfigList);
        if (composerConfig != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ComposerConfig: name=");
            LIZ2.append(composerConfig.name);
            LIZ2.append(" currentUiValue=");
            LIZ2.append(composerConfig.LIZ);
            LIZ2.append(" tag=");
            LIZ2.append(composerConfig.tag);
            str = X1D.LIZIZ(LIZ2);
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class AudioGraphBean implements Parcelable, Serializable {
        public static final Parcelable.Creator<AudioGraphBean> CREATOR = new C76915UGp();

        @InterfaceC65349Pkn("in_mic")
        public boolean inMic;

        @InterfaceC65349Pkn("in_music")
        public boolean inMusic;

        @InterfaceC65349Pkn("use_output")
        public Boolean useOutput;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AudioGraphBean() {
            /*
                r6 = this;
                r1 = 0
                r3 = 0
                r4 = 7
                r0 = r6
                r2 = r1
                r5 = r3
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.LiveEffect.AudioGraphBean.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int i2;
            kotlin.jvm.internal.o.LJIIIZ(out, "out");
            out.writeInt(this.inMic ? 1 : 0);
            out.writeInt(this.inMusic ? 1 : 0);
            Boolean bool = this.useOutput;
            if (bool == null) {
                i2 = 0;
            } else {
                out.writeInt(1);
                i2 = bool.booleanValue();
            }
            out.writeInt(i2);
        }

        public final boolean getInMic() {
            return this.inMic;
        }

        public final boolean getInMusic() {
            return this.inMusic;
        }

        public final Boolean getUseOutput() {
            return this.useOutput;
        }

        public final void setInMic(boolean z) {
            this.inMic = z;
        }

        public final void setInMusic(boolean z) {
            this.inMusic = z;
        }

        public final void setUseOutput(Boolean bool) {
            this.useOutput = bool;
        }

        public AudioGraphBean(boolean z, boolean z2, Boolean bool) {
            this.inMic = z;
            this.inMusic = z2;
            this.useOutput = bool;
        }

        public /* synthetic */ AudioGraphBean(boolean z, boolean z2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? Boolean.FALSE : bool);
        }
    }

    /* loaded from: classes14.dex */
    public static final class CommerceExtra implements Parcelable, Serializable {
        public static final Parcelable.Creator<CommerceExtra> CREATOR = new C76916UGq();

        @InterfaceC65349Pkn("default_click_url")
        public String defaultClickUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public CommerceExtra() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            kotlin.jvm.internal.o.LJIIIZ(out, "out");
            out.writeString(this.defaultClickUrl);
        }

        public final String getDefaultClickUrl() {
            return this.defaultClickUrl;
        }

        public CommerceExtra(String defaultClickUrl) {
            kotlin.jvm.internal.o.LJIIIZ(defaultClickUrl, "defaultClickUrl");
            this.defaultClickUrl = defaultClickUrl;
        }

        public final void setDefaultClickUrl(String str) {
            kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
            this.defaultClickUrl = str;
        }

        public /* synthetic */ CommerceExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    /* loaded from: classes14.dex */
    public static final class LiveGoalExtra implements Parcelable, Serializable {
        public static final Parcelable.Creator<LiveGoalExtra> CREATOR = new C76914UGo();

        @InterfaceC65349Pkn("is_full_screen")
        public boolean isFullScreen;

        @InterfaceC65349Pkn("is_horizontal")
        public boolean isHorizontal;

        @InterfaceC65349Pkn("is_vertical")
        public boolean isVertical;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LiveGoalExtra() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.LiveEffect.LiveGoalExtra.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            kotlin.jvm.internal.o.LJIIIZ(out, "out");
            out.writeInt(this.isFullScreen ? 1 : 0);
            out.writeInt(this.isHorizontal ? 1 : 0);
            out.writeInt(this.isVertical ? 1 : 0);
        }

        public final boolean isFullScreen() {
            return this.isFullScreen;
        }

        public final boolean isHorizontal() {
            return this.isHorizontal;
        }

        public final boolean isVertical() {
            return this.isVertical;
        }

        public final void setFullScreen(boolean z) {
            this.isFullScreen = z;
        }

        public final void setHorizontal(boolean z) {
            this.isHorizontal = z;
        }

        public final void setVertical(boolean z) {
            this.isVertical = z;
        }

        public LiveGoalExtra(boolean z, boolean z2, boolean z3) {
            this.isFullScreen = z;
            this.isHorizontal = z2;
            this.isVertical = z3;
        }

        public /* synthetic */ LiveGoalExtra(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }
    }

    /* loaded from: classes14.dex */
    public static final class PlDataBean implements Parcelable, Serializable {
        public static final Parcelable.Creator<PlDataBean> CREATOR = new C79242V8c();

        @InterfaceC65349Pkn("albumFilter")
        public int albumFilter;

        @InterfaceC65349Pkn("alg")
        public ArrayList<String> alg;

        @InterfaceC65349Pkn("face_count_max")
        public int faceCountMax;

        @InterfaceC65349Pkn("face_count_min")
        public int faceCountMin;

        @InterfaceC65349Pkn("guide")
        public boolean guide;

        @InterfaceC65349Pkn("imgK")
        public String imgK;

        @InterfaceC65349Pkn("loading")
        public boolean loading;

        @InterfaceC65349Pkn("max_count")
        public int maxCount;

        @InterfaceC65349Pkn("min_count")
        public int minCount;

        @InterfaceC65349Pkn("relation")
        public String relation;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PlDataBean() {
            /*
                r13 = this;
                r1 = 0
                r4 = 0
                r11 = 1023(0x3ff, float:1.434E-42)
                r0 = r13
                r2 = r1
                r3 = r1
                r5 = r4
                r6 = r4
                r7 = r4
                r8 = r4
                r9 = r4
                r10 = r4
                r12 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.depend.model.LiveEffect.PlDataBean.<init>():void");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            kotlin.jvm.internal.o.LJIIIZ(out, "out");
            out.writeStringList(this.alg);
            out.writeString(this.relation);
            out.writeString(this.imgK);
            out.writeInt(this.loading ? 1 : 0);
            out.writeInt(this.guide ? 1 : 0);
            out.writeInt(this.albumFilter);
            out.writeInt(this.faceCountMin);
            out.writeInt(this.faceCountMax);
            out.writeInt(this.minCount);
            out.writeInt(this.maxCount);
        }

        public final int getAlbumFilter() {
            return this.albumFilter;
        }

        public final ArrayList<String> getAlg() {
            return this.alg;
        }

        public final int getFaceCountMax() {
            return this.faceCountMax;
        }

        public final int getFaceCountMin() {
            return this.faceCountMin;
        }

        public final boolean getGuide() {
            return this.guide;
        }

        public final String getImgK() {
            return this.imgK;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final int getMaxCount() {
            return this.maxCount;
        }

        public final int getMinCount() {
            return this.minCount;
        }

        public final String getRelation() {
            return this.relation;
        }

        public final void setAlbumFilter(int i) {
            this.albumFilter = i;
        }

        public final void setAlg(ArrayList<String> arrayList) {
            kotlin.jvm.internal.o.LJIIIZ(arrayList, "<set-?>");
            this.alg = arrayList;
        }

        public final void setFaceCountMax(int i) {
            this.faceCountMax = i;
        }

        public final void setFaceCountMin(int i) {
            this.faceCountMin = i;
        }

        public final void setGuide(boolean z) {
            this.guide = z;
        }

        public final void setImgK(String str) {
            this.imgK = str;
        }

        public final void setLoading(boolean z) {
            this.loading = z;
        }

        public final void setMaxCount(int i) {
            this.maxCount = i;
        }

        public final void setMinCount(int i) {
            this.minCount = i;
        }

        public final void setRelation(String str) {
            this.relation = str;
        }

        public PlDataBean(ArrayList<String> alg, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5) {
            kotlin.jvm.internal.o.LJIIIZ(alg, "alg");
            this.alg = alg;
            this.relation = str;
            this.imgK = str2;
            this.loading = z;
            this.guide = z2;
            this.albumFilter = i;
            this.faceCountMin = i2;
            this.faceCountMax = i3;
            this.minCount = i4;
            this.maxCount = i5;
        }

        public /* synthetic */ PlDataBean(ArrayList arrayList, String str, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? new ArrayList() : arrayList, (i6 & 2) != 0 ? null : str, (i6 & 4) == 0 ? str2 : null, (i6 & 8) != 0 ? true : z, (i6 & 16) == 0 ? z2 : true, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 2 : i2, (i6 & 128) != 0 ? 5 : i3, (i6 & 256) != 0 ? -1 : i4, (i6 & 512) == 0 ? i5 : -1);
        }
    }

    public Effect getEffect() {
        return this.effect;
    }

    public String getFilterId() {
        return this.filterId;
    }

    public String getFilterPath() {
        return this.unzipPath;
    }

    public String getName() {
        return this.name;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public boolean isNone() {
        return this.isNone;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!kotlin.jvm.internal.o.LJ(cls2, cls)) {
            return false;
        }
        kotlin.jvm.internal.o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.LiveEffect");
        LiveEffect liveEffect = (LiveEffect) obj;
        if (getResourceId().length() == 0 || liveEffect.getResourceId().length() == 0) {
            if (this.effectId == liveEffect.effectId) {
                return true;
            }
            return false;
        }
        return kotlin.jvm.internal.o.LJ(getResourceId(), liveEffect.getResourceId());
    }

    public final void setActionSchema(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.actionSchema = str;
    }

    public final void setCoexistGroup(ArrayList<Integer> arrayList) {
        kotlin.jvm.internal.o.LJIIIZ(arrayList, "<set-?>");
        this.coexistGroup = arrayList;
    }

    public final void setComposerConfigList(List<ComposerConfig> list) {
        kotlin.jvm.internal.o.LJIIIZ(list, "<set-?>");
        this.composerConfigList = list;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public final void setLocalViewType(C6NP c6np) {
        kotlin.jvm.internal.o.LJIIIZ(c6np, "<set-?>");
        this.localViewType = c6np;
    }

    public final void setLogParams(C30496By0 c30496By0) {
        kotlin.jvm.internal.o.LJIIIZ(c30496By0, "<set-?>");
        this.logParams = c30496By0;
    }

    public final void setQuiz(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.quiz = str;
    }

    public final void setRealId(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.realId = str;
    }

    public final void setRecommendPreviewIcon(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.recommendPreviewIcon = str;
    }

    public void setResourceId(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.resourceId = str;
    }

    public void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setUnzipPath(String str) {
        kotlin.jvm.internal.o.LJIIIZ(str, "<set-?>");
        this.unzipPath = str;
    }

    public final void setUpdateKeys(ArrayList<String> arrayList) {
        kotlin.jvm.internal.o.LJIIIZ(arrayList, "<set-?>");
        this.updateKeys = arrayList;
    }
}
