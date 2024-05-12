package com.bytedance.android.livesdk.gift.publicinterface.model;

import X.C16880lQ;
import X.C32I;
import X.C79062V1e;
import X.E4Z;
import X.HH1;
import X.JBR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DebugToolAssetsModel {
    public static final int DOWNLOAD_TYPE_UNKONW = 0;
    public final String bytevc1Md5;
    public final String describe;
    public final int downloadType;
    public final long effectId;
    public final int effectResourceType;
    public final String h264Md5;
    public final List<String> h264ResourceUrlList;
    public final String name;
    public final List<String> resourceByteVC1UrlList;
    public final long size;
    public final List<VideoResource> videoResourceList;
    public static final E4Z Companion = new E4Z();
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
    public DebugToolAssetsModel() {
        /*
            r16 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r14 = 2047(0x7ff, float:2.868E-42)
            r0 = r16
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r1
            r12 = r6
            r13 = r3
            r15 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.publicinterface.model.DebugToolAssetsModel.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DebugToolAssetsModel copy$default(DebugToolAssetsModel debugToolAssetsModel, long j, String str, String str2, String str3, int i, List list, List list2, String str4, long j2, int i2, List list3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = debugToolAssetsModel.effectId;
        }
        if ((i3 & 2) != 0) {
            str = debugToolAssetsModel.name;
        }
        if ((i3 & 4) != 0) {
            str2 = debugToolAssetsModel.describe;
        }
        if ((i3 & 8) != 0) {
            str3 = debugToolAssetsModel.h264Md5;
        }
        if ((i3 & 16) != 0) {
            i = debugToolAssetsModel.effectResourceType;
        }
        if ((i3 & 32) != 0) {
            list = debugToolAssetsModel.h264ResourceUrlList;
        }
        if ((i3 & 64) != 0) {
            list2 = debugToolAssetsModel.resourceByteVC1UrlList;
        }
        if ((i3 & 128) != 0) {
            str4 = debugToolAssetsModel.bytevc1Md5;
        }
        if ((i3 & 256) != 0) {
            j2 = debugToolAssetsModel.size;
        }
        if ((i3 & 512) != 0) {
            i2 = debugToolAssetsModel.downloadType;
        }
        if ((i3 & 1024) != 0) {
            list3 = debugToolAssetsModel.videoResourceList;
        }
        return debugToolAssetsModel.copy(j, str, str2, str3, i, list, list2, str4, j2, i2, list3);
    }

    public final DebugToolAssetsModel copy(long j, String name, String describe, String h264Md5, int i, List<String> list, List<String> list2, String str, long j2, int i2, List<VideoResource> list3) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(describe, "describe");
        o.LJIIIZ(h264Md5, "h264Md5");
        return new DebugToolAssetsModel(j, name, describe, h264Md5, i, list, list2, str, j2, i2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugToolAssetsModel)) {
            return false;
        }
        DebugToolAssetsModel debugToolAssetsModel = (DebugToolAssetsModel) obj;
        return this.effectId == debugToolAssetsModel.effectId && o.LJ(this.name, debugToolAssetsModel.name) && o.LJ(this.describe, debugToolAssetsModel.describe) && o.LJ(this.h264Md5, debugToolAssetsModel.h264Md5) && this.effectResourceType == debugToolAssetsModel.effectResourceType && o.LJ(this.h264ResourceUrlList, debugToolAssetsModel.h264ResourceUrlList) && o.LJ(this.resourceByteVC1UrlList, debugToolAssetsModel.resourceByteVC1UrlList) && o.LJ(this.bytevc1Md5, debugToolAssetsModel.bytevc1Md5) && this.size == debugToolAssetsModel.size && this.downloadType == debugToolAssetsModel.downloadType && o.LJ(this.videoResourceList, debugToolAssetsModel.videoResourceList);
    }

    public String toString() {
        return "DebugToolAssetsModel(effectId=" + this.effectId + ", name=" + this.name + ", describe=" + this.describe + ", h264Md5=" + this.h264Md5 + ", effectResourceType=" + this.effectResourceType + ", h264ResourceUrlList=" + this.h264ResourceUrlList + ", resourceByteVC1UrlList=" + this.resourceByteVC1UrlList + ", bytevc1Md5=" + this.bytevc1Md5 + ", size=" + this.size + ", downloadType=" + this.downloadType + ", videoResourceList=" + this.videoResourceList + ')';
    }

    public final String getResourceFormat() {
        boolean z;
        ArrayList arrayList;
        List<VideoResource> list = this.videoResourceList;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List<VideoResource> list2 = this.videoResourceList;
            if (list2 != null) {
                arrayList = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<VideoResource> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getVideoTypeName());
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                return "h264";
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = (C79062V1e.LJ(this.h264Md5, C79062V1e.LJ(this.describe, C79062V1e.LJ(this.name, C16880lQ.LLJIJIL(this.effectId) * 31, 31), 31), 31) + this.effectResourceType) * 31;
        List<String> list = this.h264ResourceUrlList;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        List<String> list2 = this.resourceByteVC1UrlList;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.bytevc1Md5;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int LIZJ = (JBR.LIZJ(this.size, (i3 + hashCode3) * 31, 31) + this.downloadType) * 31;
        List<VideoResource> list3 = this.videoResourceList;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return LIZJ + i;
    }

    public final String getBytevc1Md5() {
        return this.bytevc1Md5;
    }

    public final String getDescribe() {
        return this.describe;
    }

    public final int getDownloadType() {
        return this.downloadType;
    }

    public final long getEffectId() {
        return this.effectId;
    }

    public final int getEffectResourceType() {
        return this.effectResourceType;
    }

    public final String getH264Md5() {
        return this.h264Md5;
    }

    public final List<String> getH264ResourceUrlList() {
        return this.h264ResourceUrlList;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getResourceByteVC1UrlList() {
        return this.resourceByteVC1UrlList;
    }

    public final long getSize() {
        return this.size;
    }

    public final List<VideoResource> getVideoResourceList() {
        return this.videoResourceList;
    }

    public final String getResourceFormat(String str) {
        VideoResource videoResource;
        String videoTypeName;
        if (str != null) {
            List<VideoResource> list = this.videoResourceList;
            if (list != null) {
                Iterator<VideoResource> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        videoResource = it.next();
                        if (o.LJ(videoResource.getVideoMd5(), str)) {
                            break;
                        }
                    } else {
                        videoResource = null;
                        break;
                    }
                }
                VideoResource videoResource2 = videoResource;
                if (videoResource2 != null && (videoTypeName = videoResource2.getVideoTypeName()) != null) {
                    return videoTypeName;
                }
            }
            if (o.LJ(str, this.bytevc1Md5)) {
                return "bytevc1";
            }
            if (o.LJ(str, this.h264Md5)) {
                return "h264";
            }
        }
        return null;
    }

    public DebugToolAssetsModel(long j, String str, String str2, String str3, int i, List<String> list, List<String> list2, String str4, long j2, int i2, List<VideoResource> list3) {
        HH1.LIZ(str, "name", str2, "describe", str3, "h264Md5");
        this.effectId = j;
        this.name = str;
        this.describe = str2;
        this.h264Md5 = str3;
        this.effectResourceType = i;
        this.h264ResourceUrlList = list;
        this.resourceByteVC1UrlList = list2;
        this.bytevc1Md5 = str4;
        this.size = j2;
        this.downloadType = i2;
        this.videoResourceList = list3;
    }

    public /* synthetic */ DebugToolAssetsModel(long j, String str, String str2, String str3, int i, List list, List list2, String str4, long j2, int i2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) == 0 ? str3 : "", (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : list2, (i3 & 128) != 0 ? null : str4, (i3 & 256) == 0 ? j2 : 0L, (i3 & 512) == 0 ? i2 : 0, (i3 & 1024) == 0 ? list3 : null);
    }
}
