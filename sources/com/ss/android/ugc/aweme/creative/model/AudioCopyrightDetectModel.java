package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.music.model.SeparateStatus;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioCopyrightDetectModel implements Parcelable {
    public static final Parcelable.Creator<AudioCopyrightDetectModel> CREATOR = new Parcelable.Creator<AudioCopyrightDetectModel>() { // from class: X.5u3
        @Override // android.os.Parcelable.Creator
        public final AudioCopyrightDetectModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            HashMap hashMap;
            PreCheckResultModel createFromParcel;
            int readInt;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                hashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                hashMap = new HashMap(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    Integer valueOf = Integer.valueOf(parcel.readInt());
                    if (parcel.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = PreCheckResultModel.CREATOR.createFromParcel(parcel);
                    }
                    hashMap.put(valueOf, createFromParcel);
                }
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i2 = 0;
            while (true) {
                readInt = parcel.readInt();
                if (i2 == readInt3) {
                    break;
                }
                arrayList.add(Integer.valueOf(readInt));
                i2++;
            }
            int readInt4 = parcel.readInt();
            HashMap hashMap2 = new HashMap(readInt4);
            for (int i3 = 0; i3 != readInt4; i3++) {
                hashMap2.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            return new AudioCopyrightDetectModel(z, z2, readString, z3, hashMap, arrayList, readInt, hashMap2, z4, z5, readLong, readLong2, z6, z7, parcel.readString(), SeparateStatus.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioCopyrightDetectModel[] newArray(int i) {
            return new AudioCopyrightDetectModel[i];
        }
    };

    @GPV
    public String changeMusicFrom;

    @GPV
    public boolean changeMusicImmediately;

    @GPV
    public boolean continueSelected;

    @GPV
    public boolean copyrightClaimShowing;

    @GPV
    public HashMap<Integer, PreCheckResultModel> detectResults;

    @GPV
    public ArrayList<Integer> detectScenes;

    @GPV
    public long detectStart;

    @GPV
    public boolean editorProImmediately;

    @GPV
    public boolean hasClipTrimmedInEditor;

    @InterfaceC65349Pkn("music_replaced")
    public boolean hasMusicReplaced;

    @InterfaceC65349Pkn("has_shopAnchor")
    public boolean hasShopAnchor;

    @GPV
    public SeparateStatus musicReplaceStatus;

    @GPV
    public int operation;

    @GPV
    public HashMap<String, String> pathMap;

    @InterfaceC65349Pkn("replace_recommend_id")
    public String replaceRecommendID;

    @GPV
    public long replaceStart;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioCopyrightDetectModel() {
        /*
            r21 = this;
            r1 = 0
            r3 = 0
            r11 = 0
            r19 = 65535(0xffff, float:9.1834E-41)
            r0 = r21
            r2 = r1
            r4 = r1
            r5 = r3
            r6 = r3
            r7 = r1
            r8 = r3
            r9 = r1
            r10 = r1
            r13 = r11
            r15 = r1
            r16 = r1
            r17 = r3
            r18 = r3
            r20 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.changeMusicImmediately ? 1 : 0);
        out.writeInt(this.editorProImmediately ? 1 : 0);
        out.writeString(this.changeMusicFrom);
        out.writeInt(this.hasShopAnchor ? 1 : 0);
        HashMap<Integer, PreCheckResultModel> hashMap = this.detectResults;
        if (hashMap == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(hashMap.size());
            for (Map.Entry<Integer, PreCheckResultModel> entry : hashMap.entrySet()) {
                out.writeInt(entry.getKey().intValue());
                PreCheckResultModel value = entry.getValue();
                if (value == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    value.writeToParcel(out, i);
                }
            }
        }
        ArrayList<Integer> arrayList = this.detectScenes;
        out.writeInt(arrayList.size());
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeInt(it.next().intValue());
        }
        out.writeInt(this.operation);
        HashMap<String, String> hashMap2 = this.pathMap;
        out.writeInt(hashMap2.size());
        for (Map.Entry<String, String> entry2 : hashMap2.entrySet()) {
            out.writeString(entry2.getKey());
            out.writeString(entry2.getValue());
        }
        out.writeInt(this.continueSelected ? 1 : 0);
        out.writeInt(this.copyrightClaimShowing ? 1 : 0);
        out.writeLong(this.detectStart);
        out.writeLong(this.replaceStart);
        out.writeInt(this.hasMusicReplaced ? 1 : 0);
        out.writeInt(this.hasClipTrimmedInEditor ? 1 : 0);
        out.writeString(this.replaceRecommendID);
        out.writeString(this.musicReplaceStatus.name());
    }

    public final String getChangeMusicFrom() {
        return this.changeMusicFrom;
    }

    public final boolean getChangeMusicImmediately() {
        return this.changeMusicImmediately;
    }

    public final boolean getContinueSelected() {
        return this.continueSelected;
    }

    public final boolean getCopyrightClaimShowing() {
        return this.copyrightClaimShowing;
    }

    public final HashMap<Integer, PreCheckResultModel> getDetectResults() {
        return this.detectResults;
    }

    public final ArrayList<Integer> getDetectScenes() {
        return this.detectScenes;
    }

    public final long getDetectStart() {
        return this.detectStart;
    }

    public final boolean getEditorProImmediately() {
        return this.editorProImmediately;
    }

    public final boolean getHasClipTrimmedInEditor() {
        return this.hasClipTrimmedInEditor;
    }

    public final boolean getHasMusicReplaced() {
        return this.hasMusicReplaced;
    }

    public final boolean getHasShopAnchor() {
        return this.hasShopAnchor;
    }

    public final SeparateStatus getMusicReplaceStatus() {
        return this.musicReplaceStatus;
    }

    public final int getOperation() {
        return this.operation;
    }

    public final HashMap<String, String> getPathMap() {
        return this.pathMap;
    }

    public final String getReplaceRecommendID() {
        return this.replaceRecommendID;
    }

    public final long getReplaceStart() {
        return this.replaceStart;
    }

    public final void setChangeMusicFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.changeMusicFrom = str;
    }

    public final void setChangeMusicImmediately(boolean z) {
        this.changeMusicImmediately = z;
    }

    public final void setContinueSelected(boolean z) {
        this.continueSelected = z;
    }

    public final void setCopyrightClaimShowing(boolean z) {
        this.copyrightClaimShowing = z;
    }

    public final void setDetectResults(HashMap<Integer, PreCheckResultModel> hashMap) {
        this.detectResults = hashMap;
    }

    public final void setDetectScenes(ArrayList<Integer> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.detectScenes = arrayList;
    }

    public final void setDetectStart(long j) {
        this.detectStart = j;
    }

    public final void setEditorProImmediately(boolean z) {
        this.editorProImmediately = z;
    }

    public final void setHasClipTrimmedInEditor(boolean z) {
        this.hasClipTrimmedInEditor = z;
    }

    public final void setHasMusicReplaced(boolean z) {
        this.hasMusicReplaced = z;
    }

    public final void setHasShopAnchor(boolean z) {
        this.hasShopAnchor = z;
    }

    public final void setMusicReplaceStatus(SeparateStatus separateStatus) {
        o.LJIIIZ(separateStatus, "<set-?>");
        this.musicReplaceStatus = separateStatus;
    }

    public final void setOperation(int i) {
        this.operation = i;
    }

    public final void setPathMap(HashMap<String, String> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.pathMap = hashMap;
    }

    public final void setReplaceRecommendID(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.replaceRecommendID = str;
    }

    public final void setReplaceStart(long j) {
        this.replaceStart = j;
    }

    public AudioCopyrightDetectModel(boolean z, boolean z2, String changeMusicFrom, boolean z3, HashMap<Integer, PreCheckResultModel> hashMap, ArrayList<Integer> detectScenes, int i, HashMap<String, String> pathMap, boolean z4, boolean z5, long j, long j2, boolean z6, boolean z7, String replaceRecommendID, SeparateStatus musicReplaceStatus) {
        o.LJIIIZ(changeMusicFrom, "changeMusicFrom");
        o.LJIIIZ(detectScenes, "detectScenes");
        o.LJIIIZ(pathMap, "pathMap");
        o.LJIIIZ(replaceRecommendID, "replaceRecommendID");
        o.LJIIIZ(musicReplaceStatus, "musicReplaceStatus");
        this.changeMusicImmediately = z;
        this.editorProImmediately = z2;
        this.changeMusicFrom = changeMusicFrom;
        this.hasShopAnchor = z3;
        this.detectResults = hashMap;
        this.detectScenes = detectScenes;
        this.operation = i;
        this.pathMap = pathMap;
        this.continueSelected = z4;
        this.copyrightClaimShowing = z5;
        this.detectStart = j;
        this.replaceStart = j2;
        this.hasMusicReplaced = z6;
        this.hasClipTrimmedInEditor = z7;
        this.replaceRecommendID = replaceRecommendID;
        this.musicReplaceStatus = musicReplaceStatus;
    }

    public /* synthetic */ AudioCopyrightDetectModel(boolean z, boolean z2, String str, boolean z3, HashMap hashMap, ArrayList arrayList, int i, HashMap hashMap2, boolean z4, boolean z5, long j, long j2, boolean z6, boolean z7, String str2, SeparateStatus separateStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? null : hashMap, (i2 & 32) != 0 ? new ArrayList() : arrayList, (i2 & 64) != 0 ? -1 : i, (i2 & 128) != 0 ? new HashMap() : hashMap2, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? false : z5, (i2 & 1024) != 0 ? 0L : j, (i2 & 2048) == 0 ? j2 : 0L, (i2 & 4096) != 0 ? false : z6, (i2 & FileUtils.BUFFER_SIZE) != 0 ? false : z7, (i2 & 16384) == 0 ? str2 : "", (i2 & 32768) != 0 ? SeparateStatus.UNKNOWN : separateStatus);
    }
}
