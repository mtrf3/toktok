package com.bytedance.android.livesdk.gift.assets;

import X.C16880lQ;
import X.C32I;
import X.C61878OQg;
import X.C78247UnL;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.gift.model.LokiExtraContent;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AssetsModel {
    public static final int DOWNLOAD_TYPE_UNKONW = 0;

    @InterfaceC65349Pkn("bytevc1_md5")
    public String bytevc1Md5;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("downgrade_resource_type")
    public int downgradeResourceType;

    @InterfaceC65349Pkn("download_type")
    public int downloadType;

    @InterfaceC65349Pkn("face_recognition_archive_meta")
    public FaceRecognitionMeta faceRecognitionArchiveMeta;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("loki_content")
    public LokiExtraContent lokiExtraContent;

    @InterfaceC65349Pkn("lynx_resource")
    public final LynxResource lynxResource;

    @InterfaceC65349Pkn("lynx_url_settings_key")
    public String lynxUrlSettingsKey;

    @InterfaceC65349Pkn("md5")
    public String md5;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("resource_bytevc1_url")
    public ResourceModel resourceByteVC1Model;

    @InterfaceC65349Pkn("resource_url")
    public ResourceModel resourceModel;

    @InterfaceC65349Pkn("resource_type")
    public int resourceType;

    @InterfaceC65349Pkn("resource_uri")
    public String resourceUri;

    @InterfaceC65349Pkn("size")
    public long size;

    @InterfaceC65349Pkn("video_resource_list")
    public List<VideoResource> videoResourceList;
    public static final C78247UnL Companion = new C78247UnL();
    public static final int RESOURCE_TYPE_WEBP = 1;
    public static final int RESOURCE_TYPE_LOTTIE = 2;
    public static final int RESOURCE_TYPE_MP4 = 4;
    public static final int RESOURCE_TYPE_STICKER = 5;
    public static final int RESOURCE_TYPE_EFFECT_LOKI = 6;
    public static final int RESOURCE_TYPE_LYNX = 8;
    public static final int RESOURCE_TYPE_ENTER_WEBP = 9;
    public static final int DOWNLOAD_TYPE_YES = 1;
    public static final int DOWNLOAD_TYPE_NO = 2;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AssetsModel() {
        /*
            r22 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r20 = 131071(0x1ffff, float:1.8367E-40)
            r0 = r22
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r1
            r13 = r6
            r14 = r3
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r6
            r19 = r3
            r21 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.assets.AssetsModel.<init>():void");
    }

    public static /* synthetic */ AssetsModel copy$default(AssetsModel assetsModel, long j, String str, String str2, String str3, int i, String str4, ResourceModel resourceModel, ResourceModel resourceModel2, String str5, long j2, int i2, LokiExtraContent lokiExtraContent, List list, FaceRecognitionMeta faceRecognitionMeta, String str6, int i3, LynxResource lynxResource, int i4, Object obj) {
        long j3 = j;
        ResourceModel resourceModel3 = resourceModel;
        String str7 = str4;
        int i5 = i;
        String str8 = str3;
        String str9 = str;
        String str10 = str2;
        LokiExtraContent lokiExtraContent2 = lokiExtraContent;
        int i6 = i2;
        long j4 = j2;
        ResourceModel resourceModel4 = resourceModel2;
        String str11 = str5;
        LynxResource lynxResource2 = lynxResource;
        String str12 = str6;
        List list2 = list;
        int i7 = i3;
        FaceRecognitionMeta faceRecognitionMeta2 = faceRecognitionMeta;
        if ((i4 & 1) != 0) {
            j3 = assetsModel.id;
        }
        if ((i4 & 2) != 0) {
            str9 = assetsModel.name;
        }
        if ((i4 & 4) != 0) {
            str10 = assetsModel.describe;
        }
        if ((i4 & 8) != 0) {
            str8 = assetsModel.md5;
        }
        if ((i4 & 16) != 0) {
            i5 = assetsModel.resourceType;
        }
        if ((i4 & 32) != 0) {
            str7 = assetsModel.resourceUri;
        }
        if ((i4 & 64) != 0) {
            resourceModel3 = assetsModel.resourceModel;
        }
        if ((i4 & 128) != 0) {
            resourceModel4 = assetsModel.resourceByteVC1Model;
        }
        if ((i4 & 256) != 0) {
            str11 = assetsModel.bytevc1Md5;
        }
        if ((i4 & 512) != 0) {
            j4 = assetsModel.size;
        }
        if ((i4 & 1024) != 0) {
            i6 = assetsModel.downloadType;
        }
        if ((i4 & 2048) != 0) {
            lokiExtraContent2 = assetsModel.lokiExtraContent;
        }
        if ((i4 & 4096) != 0) {
            list2 = assetsModel.videoResourceList;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            faceRecognitionMeta2 = assetsModel.faceRecognitionArchiveMeta;
        }
        if ((i4 & 16384) != 0) {
            str12 = assetsModel.lynxUrlSettingsKey;
        }
        if ((32768 & i4) != 0) {
            i7 = assetsModel.downgradeResourceType;
        }
        if ((i4 & 65536) != 0) {
            lynxResource2 = assetsModel.lynxResource;
        }
        ResourceModel resourceModel5 = resourceModel4;
        return assetsModel.copy(j3, str9, str10, str8, i5, str7, resourceModel3, resourceModel5, str11, j4, i6, lokiExtraContent2, list2, faceRecognitionMeta2, str12, i7, lynxResource2);
    }

    public final long component10() {
        return this.size;
    }

    public final int component11() {
        return this.downloadType;
    }

    public final LokiExtraContent component12() {
        return this.lokiExtraContent;
    }

    public final List<VideoResource> component13() {
        return this.videoResourceList;
    }

    public final FaceRecognitionMeta component14() {
        return this.faceRecognitionArchiveMeta;
    }

    public final String component15() {
        return this.lynxUrlSettingsKey;
    }

    public final LynxResource component17() {
        return this.lynxResource;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.describe;
    }

    public final String component6() {
        return this.resourceUri;
    }

    public final ResourceModel component8() {
        return this.resourceByteVC1Model;
    }

    public final String component9() {
        return this.bytevc1Md5;
    }

    public final AssetsModel copy(long j, String name, String describe, String md5, int i, String resourceUri, ResourceModel resourceModel, ResourceModel resourceModel2, String str, long j2, int i2, LokiExtraContent lokiExtraContent, List<VideoResource> videoResourceList, FaceRecognitionMeta faceRecognitionMeta, String str2, int i3, LynxResource lynxResource) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(describe, "describe");
        o.LJIIIZ(md5, "md5");
        o.LJIIIZ(resourceUri, "resourceUri");
        o.LJIIIZ(resourceModel, "resourceModel");
        o.LJIIIZ(videoResourceList, "videoResourceList");
        return new AssetsModel(j, name, describe, md5, i, resourceUri, resourceModel, resourceModel2, str, j2, i2, lokiExtraContent, videoResourceList, faceRecognitionMeta, str2, i3, lynxResource);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AssetsModel(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", describe=");
        LIZ.append(this.describe);
        LIZ.append(", md5=");
        LIZ.append(this.md5);
        LIZ.append(", resourceType=");
        LIZ.append(this.resourceType);
        LIZ.append(", resourceUri=");
        LIZ.append(this.resourceUri);
        LIZ.append(", resourceModel=");
        LIZ.append(this.resourceModel);
        LIZ.append(", resourceByteVC1Model=");
        LIZ.append(this.resourceByteVC1Model);
        LIZ.append(", bytevc1Md5=");
        LIZ.append(this.bytevc1Md5);
        LIZ.append(", size=");
        LIZ.append(this.size);
        LIZ.append(", downloadType=");
        LIZ.append(this.downloadType);
        LIZ.append(", lokiExtraContent=");
        LIZ.append(this.lokiExtraContent);
        LIZ.append(", videoResourceList=");
        LIZ.append(this.videoResourceList);
        LIZ.append(", faceRecognitionArchiveMeta=");
        LIZ.append(this.faceRecognitionArchiveMeta);
        LIZ.append(", lynxUrlSettingsKey=");
        LIZ.append(this.lynxUrlSettingsKey);
        LIZ.append(", downgradeResourceType=");
        LIZ.append(this.downgradeResourceType);
        LIZ.append(", lynxResource=");
        LIZ.append(this.lynxResource);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final String getResourceFormat() {
        boolean z;
        List<VideoResource> list = this.videoResourceList;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List<VideoResource> list2 = this.videoResourceList;
            if (list2 == null) {
                return "h264";
            }
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<VideoResource> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().videoTypeName);
            }
            if (arrayList.contains("bytevc1opt")) {
                return "bytevc1opt";
            }
            if (!arrayList.contains("bytevc1")) {
                return "h264";
            }
        } else {
            String str = this.bytevc1Md5;
            if (str == null || str.length() == 0) {
                return "h264";
            }
        }
        return "bytevc1";
    }

    public int hashCode() {
        int i;
        int LJ = C79062V1e.LJ(this.resourceUri, (C79062V1e.LJ(this.md5, C79062V1e.LJ(this.describe, C79062V1e.LJ(this.name, C16880lQ.LLJIJIL(this.id) * 31, 31), 31), 31) + this.resourceType) * 31, 31);
        String str = this.bytevc1Md5;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return JBR.LIZJ(this.size, (LJ + i) * 31, 31) + this.downloadType;
    }

    public final int getDowngradeResType() {
        return this.downgradeResourceType;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final ResourceModel getResourceModel() {
        return this.resourceModel;
    }

    public final int getResourceType() {
        return this.resourceType;
    }

    public boolean equals(Object obj) {
        List<VideoResource> list;
        Integer num;
        List<VideoResource> list2;
        if (obj == null || !(obj instanceof AssetsModel)) {
            return false;
        }
        AssetsModel assetsModel = (AssetsModel) obj;
        if (this.id == assetsModel.id && !(!o.LJ(this.md5, assetsModel.md5)) && !(!o.LJ(this.name, assetsModel.name)) && !(!o.LJ(this.describe, assetsModel.describe)) && this.resourceType == assetsModel.resourceType && !(!o.LJ(this.resourceUri, assetsModel.resourceUri)) && this.size == assetsModel.size && !(!o.LJ(this.bytevc1Md5, assetsModel.bytevc1Md5)) && this.downloadType == assetsModel.downloadType && (list = this.videoResourceList) != null) {
            int size = list.size();
            List<VideoResource> list3 = assetsModel.videoResourceList;
            if (list3 != null) {
                num = Integer.valueOf(list3.size());
            } else {
                num = null;
            }
            if (size == num.intValue() && (list2 = this.videoResourceList) != null) {
                Collection<?> collection = assetsModel.videoResourceList;
                if (collection == null) {
                    collection = C61878OQg.INSTANCE;
                }
                if (list2.containsAll(collection)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String getResourceFormat(String str) {
        VideoResource videoResource;
        String str2;
        if (str != null) {
            List<VideoResource> list = this.videoResourceList;
            if (list != null) {
                Iterator<VideoResource> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        videoResource = it.next();
                        if (o.LJ(videoResource.videoMd5, str)) {
                            break;
                        }
                    } else {
                        videoResource = null;
                        break;
                    }
                }
                VideoResource videoResource2 = videoResource;
                if (videoResource2 != null && (str2 = videoResource2.videoTypeName) != null) {
                    return str2;
                }
            }
            if (o.LJ(str, this.bytevc1Md5)) {
                return "bytevc1";
            }
            if (o.LJ(str, this.md5)) {
                return "h264";
            }
            return "unknown";
        }
        return "unknown";
    }

    public AssetsModel(long j, String name, String describe, String md5, int i, String resourceUri, ResourceModel resourceModel, ResourceModel resourceModel2, String str, long j2, int i2, LokiExtraContent lokiExtraContent, List<VideoResource> videoResourceList, FaceRecognitionMeta faceRecognitionMeta, String str2, int i3, LynxResource lynxResource) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(describe, "describe");
        o.LJIIIZ(md5, "md5");
        o.LJIIIZ(resourceUri, "resourceUri");
        o.LJIIIZ(resourceModel, "resourceModel");
        o.LJIIIZ(videoResourceList, "videoResourceList");
        this.id = j;
        this.name = name;
        this.describe = describe;
        this.md5 = md5;
        this.resourceType = i;
        this.resourceUri = resourceUri;
        this.resourceModel = resourceModel;
        this.resourceByteVC1Model = resourceModel2;
        this.bytevc1Md5 = str;
        this.size = j2;
        this.downloadType = i2;
        this.lokiExtraContent = lokiExtraContent;
        this.videoResourceList = videoResourceList;
        this.faceRecognitionArchiveMeta = faceRecognitionMeta;
        this.lynxUrlSettingsKey = str2;
        this.downgradeResourceType = i3;
        this.lynxResource = lynxResource;
    }

    public /* synthetic */ AssetsModel(long j, String str, String str2, String str3, int i, String str4, ResourceModel resourceModel, ResourceModel resourceModel2, String str5, long j2, int i2, LokiExtraContent lokiExtraContent, List list, FaceRecognitionMeta faceRecognitionMeta, String str6, int i3, LynxResource lynxResource, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? 0 : i, (i4 & 32) == 0 ? str4 : "", (i4 & 64) != 0 ? new ResourceModel(null, null, 3, null) : resourceModel, (i4 & 128) != 0 ? null : resourceModel2, (i4 & 256) != 0 ? null : str5, (i4 & 512) == 0 ? j2 : 0L, (i4 & 1024) != 0 ? 0 : i2, (i4 & 2048) == 0 ? lokiExtraContent : null, (i4 & 4096) != 0 ? new ArrayList() : list, (i4 & FileUtils.BUFFER_SIZE) != 0 ? null : faceRecognitionMeta, (i4 & 16384) != 0 ? null : str6, (32768 & i4) != 0 ? 0 : i3, (i4 & 65536) != 0 ? null : lynxResource);
    }
}
