package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.gift.assets.VideoResource;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftByteVC1OptResourceSetting;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CnD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32375CnD implements InterfaceC32340Cme {
    public AbstractC32375CnD() {
        C221108m2.LIZIZ(new AqS155S0100000_5(this, 309));
    }

    public static boolean LJIIL(AssetsModel assetsModel) {
        List<VideoResource> list;
        VideoResource videoResource = null;
        if (assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VideoResource next = it.next();
                if (o.LJ(next.videoTypeName, "bytevc1opt")) {
                    videoResource = next;
                    break;
                }
            }
            VideoResource videoResource2 = videoResource;
            if (videoResource2 == null || TextUtils.isEmpty(videoResource2.videoMd5)) {
                return false;
            }
            return !videoResource2.videoUrl.urlList.isEmpty();
        }
        return false;
    }

    public static boolean LJIILIIL(AssetsModel assetsModel) {
        List<VideoResource> list;
        String str;
        VideoResource videoResource = null;
        if (assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VideoResource next = it.next();
                String str2 = next.videoTypeName;
                if (LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue()) {
                    str = "480p_bvc1";
                } else {
                    str = "480p";
                }
                if (o.LJ(str2, str)) {
                    videoResource = next;
                    break;
                }
            }
            VideoResource videoResource2 = videoResource;
            if (videoResource2 == null || TextUtils.isEmpty(videoResource2.videoMd5)) {
                return false;
            }
            return !videoResource2.videoUrl.urlList.isEmpty();
        }
        return false;
    }

    public static boolean LJIILJJIL(AssetsModel assetsModel) {
        List<VideoResource> list;
        String str;
        VideoResource videoResource = null;
        if (assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VideoResource next = it.next();
                String str2 = next.videoTypeName;
                if (LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue()) {
                    str = "lowfps_bvc1";
                } else {
                    str = "lowfps";
                }
                if (o.LJ(str2, str)) {
                    videoResource = next;
                    break;
                }
            }
            VideoResource videoResource2 = videoResource;
            if (videoResource2 == null || TextUtils.isEmpty(videoResource2.videoMd5)) {
                return false;
            }
            return !videoResource2.videoUrl.urlList.isEmpty();
        }
        return false;
    }

    public static C32420Cnw LIZLLL(AssetsModel assetsModel, int i) {
        List<VideoResource> list;
        VideoResource videoResource;
        ResourceModel resourceModel;
        List<String> list2;
        String[] strArr;
        if (LJIIL(assetsModel) && assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    videoResource = it.next();
                    if (o.LJ(videoResource.videoTypeName, "bytevc1opt")) {
                        break;
                    }
                } else {
                    videoResource = null;
                    break;
                }
            }
            VideoResource videoResource2 = videoResource;
            if (videoResource2 != null && (resourceModel = videoResource2.videoUrl) != null && (list2 = resourceModel.urlList) != null && (strArr = (String[]) list2.toArray(new String[0])) != null) {
                return new C32420Cnw(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i, true);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r12 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        if (r12 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0056, code lost:
    
        if ((!r0.isEmpty()) == true) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C32420Cnw LJ(com.bytedance.android.livesdk.gift.assets.AssetsModel r12, int r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC32375CnD.LJ(com.bytedance.android.livesdk.gift.assets.AssetsModel, int):X.Cnw");
    }

    public static C32420Cnw LJFF(AssetsModel assetsModel, int i) {
        List<VideoResource> list;
        VideoResource videoResource;
        List<VideoResource> list2;
        VideoResource videoResource2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    videoResource = it.next();
                    if (o.LJ(videoResource.videoTypeName, "crop_bvc1")) {
                        break;
                    }
                } else {
                    videoResource = null;
                    break;
                }
            }
            VideoResource videoResource3 = videoResource;
            if (videoResource3 != null && !TextUtils.isEmpty(videoResource3.videoMd5) && (!videoResource3.videoUrl.urlList.isEmpty()) && assetsModel != null && (list2 = assetsModel.videoResourceList) != null) {
                Iterator<VideoResource> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        videoResource2 = it2.next();
                        if (o.LJ(videoResource2.videoTypeName, "crop_bvc1")) {
                            break;
                        }
                    } else {
                        videoResource2 = null;
                        break;
                    }
                }
                VideoResource videoResource4 = videoResource2;
                if (videoResource4 != null && (resourceModel = videoResource4.videoUrl) != null && (list3 = resourceModel.urlList) != null && (strArr = (String[]) list3.toArray(new String[0])) != null) {
                    return new C32420Cnw(videoResource4.videoUrl.uri, assetsModel.id, strArr, videoResource4.videoMd5, i, true);
                }
            }
            return null;
        }
        return null;
    }

    public static C32420Cnw LJI(AssetsModel assetsModel, int i) {
        List<VideoResource> list;
        VideoResource videoResource;
        List<VideoResource> list2;
        VideoResource videoResource2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    videoResource = it.next();
                    if (o.LJ(videoResource.videoTypeName, "480p")) {
                        break;
                    }
                } else {
                    videoResource = null;
                    break;
                }
            }
            VideoResource videoResource3 = videoResource;
            if (videoResource3 != null && !TextUtils.isEmpty(videoResource3.videoMd5) && (!videoResource3.videoUrl.urlList.isEmpty()) && assetsModel != null && (list2 = assetsModel.videoResourceList) != null) {
                Iterator<VideoResource> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        videoResource2 = it2.next();
                        if (o.LJ(videoResource2.videoTypeName, "480p")) {
                            break;
                        }
                    } else {
                        videoResource2 = null;
                        break;
                    }
                }
                VideoResource videoResource4 = videoResource2;
                if (videoResource4 != null && (resourceModel = videoResource4.videoUrl) != null && (list3 = resourceModel.urlList) != null && (strArr = (String[]) list3.toArray(new String[0])) != null) {
                    return new C32420Cnw(videoResource4.videoUrl.uri, assetsModel.id, strArr, videoResource4.videoMd5, i, true);
                }
            }
            return null;
        }
        return null;
    }

    public static C32420Cnw LJII(AssetsModel assetsModel, int i) {
        List<VideoResource> list;
        VideoResource videoResource;
        ResourceModel resourceModel;
        List<String> list2;
        String[] strArr;
        String str;
        if (LJIILIIL(assetsModel) && assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    videoResource = it.next();
                    String str2 = videoResource.videoTypeName;
                    if (LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue()) {
                        str = "480p_bvc1";
                    } else {
                        str = "480p";
                    }
                    if (o.LJ(str2, str)) {
                        break;
                    }
                } else {
                    videoResource = null;
                    break;
                }
            }
            VideoResource videoResource2 = videoResource;
            if (videoResource2 != null && (resourceModel = videoResource2.videoUrl) != null && (list2 = resourceModel.urlList) != null && (strArr = (String[]) list2.toArray(new String[0])) != null) {
                return new C32420Cnw(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i, true);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r10 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C32420Cnw LJIIIIZZ(com.bytedance.android.livesdk.gift.assets.AssetsModel r10, int r11) {
        /*
            java.lang.String r4 = "h264"
            r5 = 0
            if (r10 == 0) goto L43
            java.util.List<com.bytedance.android.livesdk.gift.assets.VideoResource> r0 = r10.videoResourceList
            if (r0 == 0) goto L53
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.gift.assets.VideoResource r0 = (com.bytedance.android.livesdk.gift.assets.VideoResource) r0
            java.lang.String r0 = r0.videoTypeName
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto Ld
        L22:
            com.bytedance.android.livesdk.gift.assets.VideoResource r1 = (com.bytedance.android.livesdk.gift.assets.VideoResource) r1
        L24:
            r3 = 0
            if (r1 == 0) goto L39
            java.lang.String r0 = r1.videoMd5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L39
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r1.videoUrl
            java.util.List<java.lang.String> r0 = r0.urlList
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L55
        L39:
            if (r10 == 0) goto L43
            java.lang.String r0 = r10.md5
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L44
        L43:
            return r5
        L44:
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r10.resourceModel
            java.util.List<java.lang.String> r0 = r0.urlList
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L55
            goto L43
        L51:
            r1 = r5
            goto L22
        L53:
            r1 = r5
            goto L24
        L55:
            if (r10 == 0) goto La1
            java.util.List<com.bytedance.android.livesdk.gift.assets.VideoResource> r0 = r10.videoResourceList
            if (r0 == 0) goto L8f
            java.util.Iterator r1 = r0.iterator()
        L5f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.bytedance.android.livesdk.gift.assets.VideoResource r0 = (com.bytedance.android.livesdk.gift.assets.VideoResource) r0
            java.lang.String r0 = r0.videoTypeName
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L5f
        L74:
            com.bytedance.android.livesdk.gift.assets.VideoResource r2 = (com.bytedance.android.livesdk.gift.assets.VideoResource) r2
            if (r2 == 0) goto L8d
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r2.videoUrl
            if (r0 == 0) goto L8d
            java.util.List<java.lang.String> r1 = r0.urlList
            if (r1 == 0) goto L8d
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r7 = r1.toArray(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            if (r7 == 0) goto L8d
            int r0 = r7.length
            if (r0 != 0) goto La2
        L8d:
            if (r10 == 0) goto La1
        L8f:
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r10.resourceModel
            if (r0 == 0) goto La1
            java.util.List<java.lang.String> r1 = r0.urlList
            if (r1 == 0) goto La1
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r6 = r1.toArray(r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r6 != 0) goto Lbc
        La1:
            return r5
        La2:
            java.lang.String r0 = r2.videoMd5
            int r0 = r0.length()
            if (r0 <= 0) goto L8d
            X.Cnw r3 = new X.Cnw
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r2.videoUrl
            java.lang.String r4 = r0.uri
            long r5 = r10.id
            java.lang.String r8 = r2.videoMd5
            long r9 = (long) r11
            r11 = 1
            r3.<init>(r4, r5, r7, r8, r9, r11)
            return r3
        Lba:
            r2 = r5
            goto L74
        Lbc:
            X.Cnw r2 = new X.Cnw
            com.bytedance.android.livesdk.gift.assets.ResourceModel r0 = r10.resourceModel
            java.lang.String r3 = r0.uri
            long r4 = r10.id
            java.lang.String r7 = r10.md5
            long r8 = (long) r11
            r10 = 1
            r2.<init>(r3, r4, r6, r7, r8, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC32375CnD.LJIIIIZZ(com.bytedance.android.livesdk.gift.assets.AssetsModel, int):X.Cnw");
    }

    public static C32420Cnw LJIIIZ(AssetsModel assetsModel, int i) {
        List<VideoResource> list;
        VideoResource videoResource;
        ResourceModel resourceModel;
        List<String> list2;
        String[] strArr;
        String str;
        if (LJIILJJIL(assetsModel) && assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    videoResource = it.next();
                    String str2 = videoResource.videoTypeName;
                    if (LiveGiftByteVC1OptResourceSetting.INSTANCE.getValue()) {
                        str = "lowfps_bvc1";
                    } else {
                        str = "lowfps";
                    }
                    if (o.LJ(str2, str)) {
                        break;
                    }
                } else {
                    videoResource = null;
                    break;
                }
            }
            VideoResource videoResource2 = videoResource;
            if (videoResource2 != null && (resourceModel = videoResource2.videoUrl) != null && (list2 = resourceModel.urlList) != null && (strArr = (String[]) list2.toArray(new String[0])) != null) {
                return new C32420Cnw(videoResource2.videoUrl.uri, assetsModel.id, strArr, videoResource2.videoMd5, i, true);
            }
        }
        return null;
    }

    public static C32420Cnw LJIIJ(AssetsModel assetsModel, int i) {
        List<VideoResource> list;
        VideoResource videoResource;
        List<VideoResource> list2;
        VideoResource videoResource2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    videoResource = it.next();
                    if (o.LJ(videoResource.videoTypeName, "trantor_bvc1")) {
                        break;
                    }
                } else {
                    videoResource = null;
                    break;
                }
            }
            VideoResource videoResource3 = videoResource;
            if (videoResource3 != null && !TextUtils.isEmpty(videoResource3.videoMd5) && (!videoResource3.videoUrl.urlList.isEmpty()) && assetsModel != null && (list2 = assetsModel.videoResourceList) != null) {
                Iterator<VideoResource> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        videoResource2 = it2.next();
                        if (o.LJ(videoResource2.videoTypeName, "trantor_bvc1")) {
                            break;
                        }
                    } else {
                        videoResource2 = null;
                        break;
                    }
                }
                VideoResource videoResource4 = videoResource2;
                if (videoResource4 != null && (resourceModel = videoResource4.videoUrl) != null && (list3 = resourceModel.urlList) != null && (strArr = (String[]) list3.toArray(new String[0])) != null) {
                    return new C32420Cnw(videoResource4.videoUrl.uri, assetsModel.id, strArr, videoResource4.videoMd5, i, true);
                }
            }
            return null;
        }
        return null;
    }

    public static C32420Cnw LJIIJJI(AssetsModel assetsModel, int i) {
        List<VideoResource> list;
        VideoResource videoResource;
        List<VideoResource> list2;
        VideoResource videoResource2;
        ResourceModel resourceModel;
        List<String> list3;
        String[] strArr;
        if (assetsModel != null && (list = assetsModel.videoResourceList) != null) {
            Iterator<VideoResource> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    videoResource = it.next();
                    if (o.LJ(videoResource.videoTypeName, "trantor_crop_bvc1")) {
                        break;
                    }
                } else {
                    videoResource = null;
                    break;
                }
            }
            VideoResource videoResource3 = videoResource;
            if (videoResource3 != null && !TextUtils.isEmpty(videoResource3.videoMd5) && (!videoResource3.videoUrl.urlList.isEmpty()) && assetsModel != null && (list2 = assetsModel.videoResourceList) != null) {
                Iterator<VideoResource> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        videoResource2 = it2.next();
                        if (o.LJ(videoResource2.videoTypeName, "trantor_crop_bvc1")) {
                            break;
                        }
                    } else {
                        videoResource2 = null;
                        break;
                    }
                }
                VideoResource videoResource4 = videoResource2;
                if (videoResource4 != null && (resourceModel = videoResource4.videoUrl) != null && (list3 = resourceModel.urlList) != null && (strArr = (String[]) list3.toArray(new String[0])) != null) {
                    return new C32420Cnw(videoResource4.videoUrl.uri, assetsModel.id, strArr, videoResource4.videoMd5, i, true);
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC32340Cme
    public C32420Cnw LIZIZ(AssetsModel assetsModel, int i) {
        return LIZJ(assetsModel, i);
    }
}
