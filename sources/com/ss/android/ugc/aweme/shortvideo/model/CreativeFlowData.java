package com.ss.android.ugc.aweme.shortvideo.model;

import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeFlowData implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreativeFlowData> CREATOR = new Creator();

    @InterfaceC65349Pkn("anchors")
    public List<AnchorTransData> anchors;

    @InterfaceC65349Pkn("auto_selected_anchor")
    public AnchorTransData autoSelectedAnchor;

    @InterfaceC65349Pkn("auto_selected_anchor_infos")
    public AutoSelectedAnchorInfos autoSelectedAnchorInfos;

    @InterfaceC65349Pkn("creative_duration_extra")
    public CreativeDurationExtra creativeDurationExtra;

    @InterfaceC65349Pkn("editor_pro_model")
    public EditorProModel editorProModel;

    @InterfaceC65349Pkn("enter_method")
    public String enterMethod;

    @InterfaceC65349Pkn("extra_log_params")
    public HashMap<String, String> extraLogParams;

    @InterfaceC65349Pkn("open_extra_share_options")
    public HashMap<String, Integer> extraShareOptions;

    @InterfaceC65349Pkn("music_info")
    public FlowDataMusicInfo flowDataMusicInfo;

    @InterfaceC65349Pkn("is_through_anchor")
    public boolean isThroughAnchor;

    @InterfaceC65349Pkn("nle_edit_model")
    public NLEEditModel nleEditModel;

    @InterfaceC65349Pkn("publish_config")
    public PublishConfig publishConfig;

    @InterfaceC65349Pkn("qa_origin")
    public String qaOrigin;

    @InterfaceC65349Pkn("qa_origin_group_id")
    public String qaOriginGroupId;

    @InterfaceC65349Pkn("question_category")
    public String questionCategory;

    @InterfaceC65349Pkn("share_kit_panel")
    public ShareKitPanel shareKitPanel;

    @InterfaceC65349Pkn("shoot_extra_data")
    public ShootExtraData shootExtraData;

    @InterfaceC65349Pkn("tag")
    public String tag;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CreativeFlowData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreativeFlowData createFromParcel(Parcel parcel) {
            HashMap hashMap;
            HashMap hashMap2;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            ShootExtraData shootExtraData = (ShootExtraData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                hashMap = null;
            } else {
                int readInt = parcel.readInt();
                hashMap = new HashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    hashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
            }
            FlowDataMusicInfo createFromParcel = parcel.readInt() == 0 ? null : FlowDataMusicInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                hashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                hashMap2 = new HashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    hashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            AnchorTransData anchorTransData = (AnchorTransData) parcel.readSerializable();
            AutoSelectedAnchorInfos autoSelectedAnchorInfos = (AutoSelectedAnchorInfos) parcel.readSerializable();
            ShareKitPanel createFromParcel2 = parcel.readInt() == 0 ? null : ShareKitPanel.CREATOR.createFromParcel(parcel);
            CreativeDurationExtra createFromParcel3 = CreativeDurationExtra.CREATOR.createFromParcel(parcel);
            EditorProModel editorProModel = (EditorProModel) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
            NLEEditModel createFromParcel4 = NLEEditModel.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new CreativeFlowData(readString, shootExtraData, hashMap, createFromParcel, hashMap2, anchorTransData, autoSelectedAnchorInfos, createFromParcel2, createFromParcel3, editorProModel, createFromParcel4, z, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), PublishConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreativeFlowData[] newArray(int i) {
            return new CreativeFlowData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeFlowData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 262143, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<AnchorTransData> getAnchors() {
        return this.anchors;
    }

    public final AnchorTransData getAutoSelectedAnchor() {
        return this.autoSelectedAnchor;
    }

    public final AutoSelectedAnchorInfos getAutoSelectedAnchorInfos() {
        return this.autoSelectedAnchorInfos;
    }

    public final CreativeDurationExtra getCreativeDurationExtra() {
        return this.creativeDurationExtra;
    }

    public final EditorProModel getEditorProModel() {
        return this.editorProModel;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final HashMap<String, String> getExtraLogParams() {
        return this.extraLogParams;
    }

    public final HashMap<String, Integer> getExtraShareOptions() {
        return this.extraShareOptions;
    }

    public final FlowDataMusicInfo getFlowDataMusicInfo() {
        return this.flowDataMusicInfo;
    }

    public final NLEEditModel getNleEditModel() {
        return this.nleEditModel;
    }

    public final PublishConfig getPublishConfig() {
        return this.publishConfig;
    }

    public final String getQaOrigin() {
        return this.qaOrigin;
    }

    public final String getQaOriginGroupId() {
        return this.qaOriginGroupId;
    }

    public final String getQuestionCategory() {
        return this.questionCategory;
    }

    public final ShareKitPanel getShareKitPanel() {
        return this.shareKitPanel;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getTag() {
        return this.tag;
    }

    public final boolean isThroughAnchor() {
        return this.isThroughAnchor;
    }

    public final void setAnchors(List<AnchorTransData> list) {
        this.anchors = list;
    }

    public final void setAutoSelectedAnchor(AnchorTransData anchorTransData) {
        this.autoSelectedAnchor = anchorTransData;
    }

    public final void setAutoSelectedAnchorInfos(AutoSelectedAnchorInfos autoSelectedAnchorInfos) {
        this.autoSelectedAnchorInfos = autoSelectedAnchorInfos;
    }

    public final void setCreativeDurationExtra(CreativeDurationExtra creativeDurationExtra) {
        o.LJIIIZ(creativeDurationExtra, "<set-?>");
        this.creativeDurationExtra = creativeDurationExtra;
    }

    public final void setEditorProModel(EditorProModel editorProModel) {
        this.editorProModel = editorProModel;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setExtraLogParams(HashMap<String, String> hashMap) {
        this.extraLogParams = hashMap;
    }

    public final void setExtraShareOptions(HashMap<String, Integer> hashMap) {
        this.extraShareOptions = hashMap;
    }

    public final void setFlowDataMusicInfo(FlowDataMusicInfo flowDataMusicInfo) {
        this.flowDataMusicInfo = flowDataMusicInfo;
    }

    public final void setNleEditModel(NLEEditModel nLEEditModel) {
        o.LJIIIZ(nLEEditModel, "<set-?>");
        this.nleEditModel = nLEEditModel;
    }

    public final void setPublishConfig(PublishConfig publishConfig) {
        o.LJIIIZ(publishConfig, "<set-?>");
        this.publishConfig = publishConfig;
    }

    public final void setQaOrigin(String str) {
        this.qaOrigin = str;
    }

    public final void setQaOriginGroupId(String str) {
        this.qaOriginGroupId = str;
    }

    public final void setQuestionCategory(String str) {
        this.questionCategory = str;
    }

    public final void setShareKitPanel(ShareKitPanel shareKitPanel) {
        this.shareKitPanel = shareKitPanel;
    }

    public final void setShootExtraData(ShootExtraData shootExtraData) {
        this.shootExtraData = shootExtraData;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setThroughAnchor(boolean z) {
        this.isThroughAnchor = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.tag);
        out.writeParcelable(this.shootExtraData, i);
        HashMap<String, Integer> hashMap = this.extraShareOptions;
        if (hashMap == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(hashMap.size());
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                out.writeString(entry.getKey());
                out.writeInt(entry.getValue().intValue());
            }
        }
        FlowDataMusicInfo flowDataMusicInfo = this.flowDataMusicInfo;
        if (flowDataMusicInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            flowDataMusicInfo.writeToParcel(out, i);
        }
        HashMap<String, String> hashMap2 = this.extraLogParams;
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
        out.writeSerializable(this.autoSelectedAnchor);
        out.writeSerializable(this.autoSelectedAnchorInfos);
        ShareKitPanel shareKitPanel = this.shareKitPanel;
        if (shareKitPanel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shareKitPanel.writeToParcel(out, i);
        }
        this.creativeDurationExtra.writeToParcel(out, i);
        out.writeParcelable(this.editorProModel, i);
        this.nleEditModel.writeToParcel(out, i);
        out.writeInt(this.isThroughAnchor ? 1 : 0);
        out.writeString(this.enterMethod);
        List<AnchorTransData> list = this.anchors;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeSerializable((Serializable) LIZIZ.next());
            }
        }
        out.writeString(this.qaOrigin);
        out.writeString(this.qaOriginGroupId);
        out.writeString(this.questionCategory);
        this.publishConfig.writeToParcel(out, i);
    }

    public CreativeFlowData(String str, ShootExtraData shootExtraData, HashMap<String, Integer> hashMap, FlowDataMusicInfo flowDataMusicInfo, HashMap<String, String> hashMap2, AnchorTransData anchorTransData, AutoSelectedAnchorInfos autoSelectedAnchorInfos, ShareKitPanel shareKitPanel, CreativeDurationExtra creativeDurationExtra, EditorProModel editorProModel, NLEEditModel nleEditModel, boolean z, String str2, List<AnchorTransData> list, String str3, String str4, String str5, PublishConfig publishConfig) {
        o.LJIIIZ(creativeDurationExtra, "creativeDurationExtra");
        o.LJIIIZ(nleEditModel, "nleEditModel");
        o.LJIIIZ(publishConfig, "publishConfig");
        this.tag = str;
        this.shootExtraData = shootExtraData;
        this.extraShareOptions = hashMap;
        this.flowDataMusicInfo = flowDataMusicInfo;
        this.extraLogParams = hashMap2;
        this.autoSelectedAnchor = anchorTransData;
        this.autoSelectedAnchorInfos = autoSelectedAnchorInfos;
        this.shareKitPanel = shareKitPanel;
        this.creativeDurationExtra = creativeDurationExtra;
        this.editorProModel = editorProModel;
        this.nleEditModel = nleEditModel;
        this.isThroughAnchor = z;
        this.enterMethod = str2;
        this.anchors = list;
        this.qaOrigin = str3;
        this.qaOriginGroupId = str4;
        this.questionCategory = str5;
        this.publishConfig = publishConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CreativeFlowData(String str, ShootExtraData shootExtraData, HashMap hashMap, FlowDataMusicInfo flowDataMusicInfo, HashMap hashMap2, AnchorTransData anchorTransData, AutoSelectedAnchorInfos autoSelectedAnchorInfos, ShareKitPanel shareKitPanel, CreativeDurationExtra creativeDurationExtra, EditorProModel editorProModel, NLEEditModel nLEEditModel, boolean z, String str2, List list, String str3, String str4, String str5, PublishConfig publishConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : shootExtraData, (i & 4) != 0 ? null : hashMap, (i & 8) != 0 ? null : flowDataMusicInfo, (i & 16) != 0 ? null : hashMap2, (i & 32) != 0 ? null : anchorTransData, (i & 64) != 0 ? new AutoSelectedAnchorInfos(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0) : autoSelectedAnchorInfos, (i & 128) != 0 ? null : shareKitPanel, (i & 256) != 0 ? new CreativeDurationExtra(0L, 0L, 0L, 7, null) : creativeDurationExtra, (i & 512) != 0 ? null : editorProModel, (i & 1024) != 0 ? new NLEEditModel(false, 1, null) : nLEEditModel, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? null : str2, (i & FileUtils.BUFFER_SIZE) != 0 ? null : list, (i & 16384) != 0 ? null : str3, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : str5, (i & 131072) != 0 ? new PublishConfig(0, 1, null) : publishConfig);
    }
}
