package com.ss.android.ugc.aweme.shortvideo.model;

import X.C113554cx;
import X.C32I;
import X.C44687HgJ;
import X.C47261Igj;
import X.C51029K0z;
import X.C61328O5c;
import X.GX2;
import X.InterfaceC65349Pkn;
import X.ORZ;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExtractFramesModel implements Serializable {

    @InterfaceC65349Pkn("effect_frames")
    public HashMap<Integer, ArrayList<FrameItem>> effectFrames;

    @InterfaceC65349Pkn("extractFramesDir")
    public String extractFramesDir;

    @InterfaceC65349Pkn("extractType")
    public String extractType;

    @InterfaceC65349Pkn("first_frame_with_effect")
    public String firstFrameWithEffect;

    @GX2
    @InterfaceC65349Pkn("frames")
    public HashMap<Integer, ArrayList<String>> frames;

    @InterfaceC65349Pkn("framesTimestamp")
    public HashMap<String, Long> framesTimestamp;

    @InterfaceC65349Pkn("frames_v1")
    public HashMap<Integer, ArrayList<FrameItem>> framesV1;

    @GX2
    @InterfaceC65349Pkn("multiStickersMap")
    public HashMap<Integer, List<String>> multiStickers;

    @GX2
    @InterfaceC65349Pkn("segmentEffectPhoto")
    public HashMap<String, List<String>> segmentEffectPhoto;

    @InterfaceC65349Pkn("segmentFrameKey")
    public HashMap<Integer, String> segmentFrameKeys;
    public String stickerIds;

    @GX2
    @InterfaceC65349Pkn("stickerFacesMap")
    public final HashMap<Integer, String> stickerPersons;

    public static /* synthetic */ void getStickerPersons$annotations() {
    }

    private final boolean isOldVersion() {
        return !this.frames.isEmpty();
    }

    public final void clearAllFrames() {
        this.frames.clear();
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            hashMap.clear();
        }
        HashMap<Integer, ArrayList<FrameItem>> hashMap2 = this.effectFrames;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        HashMap<Integer, String> hashMap3 = this.segmentFrameKeys;
        if (hashMap3 != null) {
            hashMap3.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ExtractFramesModel convertToV1IfNeed() {
        LinkedHashMap linkedHashMap;
        if (isOldVersion()) {
            this.framesV1 = new HashMap<>();
            for (Map.Entry<Integer, ArrayList<String>> entry : this.frames.entrySet()) {
                ArrayList<String> value = entry.getValue();
                ArrayList arrayList = new ArrayList(C32I.LJJL(value, 10));
                for (String str : value) {
                    FrameItem frameItem = new FrameItem(str, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0);
                    HashMap<String, Long> hashMap = this.framesTimestamp;
                    if (hashMap != null && hashMap.get(str) != null) {
                        Long l = this.framesTimestamp.get(str);
                        o.LJI(l);
                        if (l.longValue() >= 0) {
                            Long l2 = this.framesTimestamp.get(str);
                            o.LJI(l2);
                            frameItem.setTimeStamp(l2.longValue());
                        }
                    }
                    arrayList.add(frameItem);
                }
                HashMap<Integer, ArrayList<FrameItem>> hashMap2 = this.framesV1;
                if (hashMap2 != null) {
                    hashMap2.put(entry.getKey(), new ArrayList<>(arrayList));
                }
            }
            HashMap<Integer, List<String>> hashMap3 = this.multiStickers;
            if (hashMap3 == null || hashMap3.isEmpty()) {
                HashMap<Integer, List<String>> hashMap4 = new HashMap<>();
                this.multiStickers = hashMap4;
                HashMap<Integer, String> hashMap5 = this.stickerPersons;
                if (hashMap5 != null) {
                    linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(hashMap5.size()));
                    for (Map.Entry<Integer, String> entry2 : hashMap5.entrySet()) {
                        linkedHashMap.put(entry2.getKey(), C47261Igj.LJJIJ(entry2.getValue()));
                    }
                } else {
                    linkedHashMap = null;
                }
                C113554cx.LJJLIIIJILLIZJL(hashMap4, linkedHashMap);
            }
            this.frames.clear();
            HashMap<String, Long> hashMap6 = this.framesTimestamp;
            if (hashMap6 != null) {
                hashMap6.clear();
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<FrameItem> getAllEffectFrames() {
        ArrayList arrayList = new ArrayList();
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.effectFrames;
        if (hashMap != null) {
            for (Map.Entry<Integer, ArrayList<FrameItem>> entry : hashMap.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    arrayList.addAll(entry.getValue());
                }
            }
        }
        for (Map.Entry<Integer, String> entry2 : this.stickerPersons.entrySet()) {
            if (entry2.getValue().length() > 0) {
                arrayList.add(new FrameItem(entry2.getValue(), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0));
            }
        }
        HashMap<Integer, List<String>> hashMap2 = this.multiStickers;
        if (hashMap2 != null) {
            for (Map.Entry<Integer, List<String>> entry3 : hashMap2.entrySet()) {
                if (!entry3.getValue().isEmpty()) {
                    List<String> value = entry3.getValue();
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(value, 10));
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new FrameItem((String) it.next(), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<FrameItem> getAllFrames() {
        ArrayList arrayList = new ArrayList();
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            for (Map.Entry<Integer, ArrayList<FrameItem>> entry : hashMap.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    arrayList.addAll(entry.getValue());
                }
            }
        }
        for (Map.Entry<Integer, String> entry2 : this.stickerPersons.entrySet()) {
            if (entry2.getValue().length() > 0) {
                arrayList.add(new FrameItem(entry2.getValue(), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0));
            }
        }
        HashMap<Integer, List<String>> hashMap2 = this.multiStickers;
        if (hashMap2 != null) {
            for (Map.Entry<Integer, List<String>> entry3 : hashMap2.entrySet()) {
                if (!entry3.getValue().isEmpty()) {
                    List<String> value = entry3.getValue();
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(value, 10));
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new FrameItem((String) it.next(), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0));
                    }
                    arrayList.addAll(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public final int getFrameSize() {
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            return hashMap.size();
        }
        return 0;
    }

    public final void initSegmentEffectPhoto() {
        if (this.segmentEffectPhoto == null) {
            this.segmentEffectPhoto = new HashMap<>();
        }
    }

    public final void removeFileAndResetData() {
        C44687HgJ.LJIILIIL(this.extractFramesDir);
        C44687HgJ.LJIILJJIL(this.extractFramesDir);
        clearAllFrames();
    }

    public final void removeLastSegment() {
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null && (!hashMap.isEmpty())) {
            hashMap.remove(Integer.valueOf(hashMap.size() - 1));
        }
        if (this.segmentFrameKeys != null && (!r0.isEmpty())) {
            this.segmentFrameKeys.remove(Integer.valueOf(r1.size() - 1));
        }
        HashMap<Integer, ArrayList<FrameItem>> hashMap2 = this.effectFrames;
        if (hashMap2 != null && (!hashMap2.isEmpty())) {
            hashMap2.remove(Integer.valueOf(hashMap2.size() - 1));
        }
    }

    public final void removeMultiImages() {
        HashMap<Integer, List<String>> hashMap = this.multiStickers;
        if (hashMap != null && (!hashMap.isEmpty())) {
            hashMap.remove(Integer.valueOf(getFrameSize()));
        }
    }

    public String toString() {
        String json = GsonProtectorUtils.toJson(new e().LIZ(), this);
        o.LJIIIIZZ(json, "GsonBuilder().create().toJson(this)");
        return json;
    }

    public final HashMap<Integer, ArrayList<FrameItem>> getEffectFrames() {
        return this.effectFrames;
    }

    public final String getExtractFramesDir() {
        return this.extractFramesDir;
    }

    public final String getExtractType() {
        return this.extractType;
    }

    public final String getFirstFrameWithEffect() {
        return this.firstFrameWithEffect;
    }

    public final HashMap<Integer, ArrayList<String>> getFrames() {
        return this.frames;
    }

    public final HashMap<String, Long> getFramesTimestamp() {
        return this.framesTimestamp;
    }

    public final HashMap<Integer, ArrayList<FrameItem>> getFramesV1() {
        return this.framesV1;
    }

    public final HashMap<Integer, List<String>> getMultiStickers() {
        return this.multiStickers;
    }

    public final HashMap<String, List<String>> getSegmentEffectPhoto() {
        return this.segmentEffectPhoto;
    }

    public final HashMap<Integer, String> getSegmentFrameKeys() {
        return this.segmentFrameKeys;
    }

    public final String getStickerIds() {
        return this.stickerIds;
    }

    public final HashMap<Integer, String> getStickerPersons() {
        return this.stickerPersons;
    }

    public ExtractFramesModel(String extractType) {
        o.LJIIIZ(extractType, "extractType");
        this.extractType = extractType;
        this.extractFramesDir = "";
        this.stickerPersons = new HashMap<>();
        this.multiStickers = new HashMap<>();
        this.frames = new HashMap<>();
        this.framesV1 = new HashMap<>();
        this.effectFrames = new HashMap<>();
        this.segmentFrameKeys = new HashMap<>();
        this.framesTimestamp = new HashMap<>();
    }

    public final void addEffectFrameAtLastSegment(FrameItem frameItem) {
        o.LJIIIZ(frameItem, "frameItem");
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.effectFrames;
        if (hashMap != null) {
            if (hashMap.get(Integer.valueOf(hashMap.size() - 1)) != null) {
                ArrayList<FrameItem> arrayList = hashMap.get(Integer.valueOf(hashMap.size() - 1));
                if (arrayList != null) {
                    arrayList.add(frameItem);
                    return;
                }
                return;
            }
            Set<Integer> keySet = hashMap.keySet();
            o.LJIIIIZZ(keySet, "it.keys");
            ArrayList<FrameItem> arrayList2 = hashMap.get(ORZ.LLFZ(keySet));
            if (arrayList2 == null) {
                return;
            }
            arrayList2.add(frameItem);
        }
    }

    public final void addFrameAtLastSegment(FrameItem frameItem) {
        o.LJIIIZ(frameItem, "frameItem");
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            if (hashMap.get(Integer.valueOf(hashMap.size() - 1)) != null) {
                ArrayList<FrameItem> arrayList = hashMap.get(Integer.valueOf(hashMap.size() - 1));
                if (arrayList != null) {
                    arrayList.add(frameItem);
                    return;
                }
                return;
            }
            Set<Integer> keySet = hashMap.keySet();
            o.LJIIIIZZ(keySet, "it.keys");
            ArrayList<FrameItem> arrayList2 = hashMap.get(ORZ.LLFZ(keySet));
            if (arrayList2 == null) {
                return;
            }
            arrayList2.add(frameItem);
        }
    }

    public final void addMultiImages(List<String> imagePaths) {
        o.LJIIIZ(imagePaths, "imagePaths");
        int frameSize = getFrameSize();
        HashMap<Integer, List<String>> hashMap = this.multiStickers;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(frameSize), imagePaths);
        }
    }

    public final void addMultiImagesAfterShoot(List<String> imagePaths) {
        o.LJIIIZ(imagePaths, "imagePaths");
        int frameSize = getFrameSize() - 1;
        HashMap<Integer, List<String>> hashMap = this.multiStickers;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(frameSize), imagePaths);
        }
    }

    public final ExtractFramesModel copy(boolean z) {
        ExtractFramesModel extractFramesModel = new ExtractFramesModel(this.extractType);
        extractFramesModel.extractFramesDir = this.extractFramesDir;
        if (!this.frames.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, ArrayList<String>> entry : this.frames.entrySet()) {
                    int intValue = entry.getKey().intValue();
                    ArrayList<String> value = entry.getValue();
                    HashMap<Integer, ArrayList<String>> hashMap = extractFramesModel.frames;
                    Integer valueOf = Integer.valueOf(intValue);
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.addAll(value);
                    hashMap.put(valueOf, arrayList);
                }
            } else {
                extractFramesModel.frames.putAll(this.frames);
            }
        }
        HashMap<Integer, ArrayList<FrameItem>> hashMap2 = this.framesV1;
        if (hashMap2 != null && !hashMap2.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, ArrayList<FrameItem>> entry2 : hashMap2.entrySet()) {
                    int intValue2 = entry2.getKey().intValue();
                    ArrayList<FrameItem> value2 = entry2.getValue();
                    HashMap<Integer, ArrayList<FrameItem>> hashMap3 = extractFramesModel.framesV1;
                    if (hashMap3 != null) {
                        Integer valueOf2 = Integer.valueOf(intValue2);
                        ArrayList<FrameItem> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(value2);
                        hashMap3.put(valueOf2, arrayList2);
                    }
                }
            } else {
                HashMap<Integer, ArrayList<FrameItem>> hashMap4 = extractFramesModel.framesV1;
                if (hashMap4 != null) {
                    hashMap4.putAll(hashMap2);
                }
            }
        }
        HashMap<Integer, ArrayList<FrameItem>> hashMap5 = this.effectFrames;
        if (hashMap5 != null && !hashMap5.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, ArrayList<FrameItem>> entry3 : hashMap5.entrySet()) {
                    int intValue3 = entry3.getKey().intValue();
                    ArrayList<FrameItem> value3 = entry3.getValue();
                    HashMap<Integer, ArrayList<FrameItem>> hashMap6 = extractFramesModel.effectFrames;
                    if (hashMap6 != null) {
                        Integer valueOf3 = Integer.valueOf(intValue3);
                        ArrayList<FrameItem> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(value3);
                        hashMap6.put(valueOf3, arrayList3);
                    }
                }
            } else {
                HashMap<Integer, ArrayList<FrameItem>> hashMap7 = extractFramesModel.effectFrames;
                if (hashMap7 != null) {
                    hashMap7.putAll(hashMap5);
                }
            }
        }
        if (this.stickerPersons != null && (!r0.isEmpty())) {
            C113554cx.LJJLIIIJILLIZJL(extractFramesModel.getStickerPersons(), this.stickerPersons);
        }
        HashMap<Integer, List<String>> hashMap8 = this.multiStickers;
        if (hashMap8 != null && (!hashMap8.isEmpty())) {
            if (z) {
                for (Map.Entry<Integer, List<String>> entry4 : hashMap8.entrySet()) {
                    int intValue4 = entry4.getKey().intValue();
                    List<String> value4 = entry4.getValue();
                    HashMap<Integer, List<String>> hashMap9 = extractFramesModel.multiStickers;
                    if (hashMap9 != null) {
                        hashMap9.put(Integer.valueOf(intValue4), C61328O5c.LJ(value4));
                    }
                }
            } else {
                HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                if (multiStickers != null) {
                    C113554cx.LJJLIIIJILLIZJL(multiStickers, hashMap8);
                }
            }
        }
        HashMap<Integer, String> hashMap10 = this.segmentFrameKeys;
        if (true ^ hashMap10.isEmpty()) {
            if (z) {
                for (Map.Entry<Integer, String> entry5 : hashMap10.entrySet()) {
                    extractFramesModel.segmentFrameKeys.put(Integer.valueOf(entry5.getKey().intValue()), entry5.getValue());
                }
            } else {
                C113554cx.LJJLIIIJILLIZJL(extractFramesModel.segmentFrameKeys, hashMap10);
            }
        }
        return extractFramesModel;
    }

    public final void setEffectFrames(HashMap<Integer, ArrayList<FrameItem>> hashMap) {
        this.effectFrames = hashMap;
    }

    public final void setExtractFramesDir(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extractFramesDir = str;
    }

    public final void setExtractType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extractType = str;
    }

    public final void setFirstFrameWithEffect(String str) {
        this.firstFrameWithEffect = str;
    }

    public final void setFrames(HashMap<Integer, ArrayList<String>> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.frames = hashMap;
    }

    public final void setFramesTimestamp(HashMap<String, Long> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.framesTimestamp = hashMap;
    }

    public final void setFramesV1(HashMap<Integer, ArrayList<FrameItem>> hashMap) {
        this.framesV1 = hashMap;
    }

    public final void setSegmentEffectPhoto(HashMap<String, List<String>> hashMap) {
        this.segmentEffectPhoto = hashMap;
    }

    public final void setSegmentFrameKeys(HashMap<Integer, String> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.segmentFrameKeys = hashMap;
    }

    public final void setStickerIds(String str) {
        this.stickerIds = str;
    }

    public final void addFrameAtLastSegmentForEditorPro(ArrayList<FrameItem> segment, String str) {
        o.LJIIIZ(segment, "segment");
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            if (hashMap.get(Integer.valueOf(hashMap.size() - 1)) != null) {
                ArrayList<FrameItem> arrayList = hashMap.get(Integer.valueOf(hashMap.size() - 1));
                if (arrayList != null) {
                    arrayList.addAll(segment);
                    return;
                }
                return;
            }
            if (!hashMap.isEmpty()) {
                Set<Integer> keySet = hashMap.keySet();
                o.LJIIIIZZ(keySet, "it.keys");
                ArrayList<FrameItem> arrayList2 = hashMap.get(ORZ.LLFZ(keySet));
                if (arrayList2 == null) {
                    return;
                }
                arrayList2.addAll(segment);
                return;
            }
            hashMap.put(0, segment);
            HashMap<Integer, String> hashMap2 = this.segmentFrameKeys;
            if (hashMap2 == null) {
                return;
            }
            hashMap2.put(0, str);
        }
    }

    public final void bindSegmentEffectPhoto(List<String> path, String segmentFrameKey) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(segmentFrameKey, "segmentFrameKey");
        HashMap<String, List<String>> hashMap = this.segmentEffectPhoto;
        if (hashMap == null) {
            return;
        }
        o.LJI(hashMap);
        if (!hashMap.containsKey(segmentFrameKey)) {
            HashMap<String, List<String>> hashMap2 = this.segmentEffectPhoto;
            o.LJI(hashMap2);
            hashMap2.put(segmentFrameKey, new ArrayList());
        }
        HashMap<String, List<String>> hashMap3 = this.segmentEffectPhoto;
        o.LJI(hashMap3);
        List<String> list = hashMap3.get(segmentFrameKey);
        if (list != null) {
            list.addAll(path);
        }
    }

    public final void addFrameSegment(ArrayList<FrameItem> segment, String str, ArrayList<FrameItem> effectSegment) {
        o.LJIIIZ(segment, "segment");
        o.LJIIIZ(effectSegment, "effectSegment");
        HashMap<Integer, ArrayList<FrameItem>> hashMap = this.framesV1;
        if (hashMap != null) {
            hashMap.put(Integer.valueOf(hashMap.size()), segment);
        }
        HashMap<Integer, String> hashMap2 = this.segmentFrameKeys;
        if (hashMap2 != null) {
            hashMap2.put(Integer.valueOf(hashMap2.size()), str);
        }
        HashMap<Integer, ArrayList<FrameItem>> hashMap3 = this.effectFrames;
        if (hashMap3 != null) {
            hashMap3.put(Integer.valueOf(hashMap3.size()), effectSegment);
        }
    }

    public static /* synthetic */ ExtractFramesModel copy$default(ExtractFramesModel extractFramesModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return extractFramesModel.copy(z);
    }

    public static /* synthetic */ void addFrameAtLastSegmentForEditorPro$default(ExtractFramesModel extractFramesModel, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        extractFramesModel.addFrameAtLastSegmentForEditorPro(arrayList, str);
    }

    public static /* synthetic */ void addFrameSegment$default(ExtractFramesModel extractFramesModel, ArrayList arrayList, String str, ArrayList arrayList2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        extractFramesModel.addFrameSegment(arrayList, str, arrayList2);
    }
}
