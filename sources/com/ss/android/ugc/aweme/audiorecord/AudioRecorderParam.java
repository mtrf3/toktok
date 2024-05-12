package com.ss.android.ugc.aweme.audiorecord;

import X.C5T4;
import X.C61878OQg;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.ORZ;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AudioRecorderParam implements Serializable, Parcelable {
    public static final C5T4 CREATOR = new Parcelable.Creator<AudioRecorderParam>() { // from class: X.5T4
        @Override // android.os.Parcelable.Creator
        public final AudioRecorderParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AudioRecorderParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRecorderParam[] newArray(int i) {
            return new AudioRecorderParam[i];
        }
    };
    public int audioRecordIndex;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audiourl")
    public String audioUrl;

    @InterfaceC65349Pkn("extraurl")
    public String extraUrl;
    public boolean hasDubVoiceConversion;
    public boolean hasOriginVoiceConversion;

    @InterfaceC65349Pkn("hasoriginalsound")
    public boolean hasOriginalSound;

    @InterfaceC65349Pkn("mstack")
    public Stack<Point> mStack;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("multiTrackAudio")
    public List<String> multiTrackAudio;

    @InterfaceC65349Pkn("mute_by_audio_copyright")
    public boolean muteByAudioCopyright;
    public boolean needDel;

    @InterfaceC65349Pkn("needoriginalsound")
    public boolean needOriginalSound;

    @InterfaceC65349Pkn("recordvolume")
    public float recordVolume;

    @InterfaceC65349Pkn("voicevolume")
    public float voiceVolume;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean hasRecord() {
        if (!TextUtils.isEmpty(this.audioUrl) && !this.mStack.empty()) {
            return true;
        }
        return false;
    }

    public AudioRecorderParam() {
        this.mStack = new Stack<>();
        this.needOriginalSound = true;
        this.hasOriginalSound = true;
        this.audioUrl = "";
        this.recordVolume = 1.0f;
        this.extraUrl = "";
        this.audioRecordIndex = -1;
        this.multiTrackAudio = C61878OQg.INSTANCE;
    }

    public final int getAudioRecordIndex() {
        return this.audioRecordIndex;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final String getExtraUrl() {
        return this.extraUrl;
    }

    public final boolean getHasDubVoiceConversion() {
        return this.hasDubVoiceConversion;
    }

    public final boolean getHasOriginVoiceConversion() {
        return this.hasOriginVoiceConversion;
    }

    public final boolean getHasOriginalSound() {
        return this.hasOriginalSound;
    }

    public final Stack<Point> getMStack() {
        return this.mStack;
    }

    public final List<String> getMultiTrackAudio() {
        return this.multiTrackAudio;
    }

    public final boolean getMuteByAudioCopyright() {
        return this.muteByAudioCopyright;
    }

    public final boolean getNeedDel() {
        return this.needDel;
    }

    public final boolean getNeedOriginalSound() {
        return this.needOriginalSound;
    }

    public final float getRecordVolume() {
        return this.recordVolume;
    }

    public final float getVoiceVolume() {
        return this.voiceVolume;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioRecorderParam(Parcel parcel) {
        this();
        boolean z;
        boolean z2;
        List<String> LLJI;
        o.LJIIIZ(parcel, "parcel");
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            this.mStack = (Stack) readSerializable;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.needOriginalSound = z;
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.hasOriginalSound = z2;
            this.muteByAudioCopyright = parcel.readByte() != 0;
            String readString = parcel.readString();
            this.audioUrl = readString == null ? "" : readString;
            this.voiceVolume = parcel.readFloat();
            this.recordVolume = parcel.readFloat();
            String readString2 = parcel.readString();
            this.extraUrl = readString2 != null ? readString2 : "";
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            this.multiTrackAudio = (createStringArrayList == null || (LLJI = ORZ.LLJI(createStringArrayList)) == null) ? C61878OQg.INSTANCE : LLJI;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.Stack<com.ss.android.ugc.aweme.audiorecord.Point>");
    }

    public final void copyFrom(AudioRecorderParam audioRecorderParam) {
        if (audioRecorderParam != null) {
            this.voiceVolume = audioRecorderParam.voiceVolume;
            this.needOriginalSound = audioRecorderParam.needOriginalSound;
            this.hasOriginalSound = audioRecorderParam.hasOriginalSound;
            this.muteByAudioCopyright = audioRecorderParam.muteByAudioCopyright;
            this.needDel = audioRecorderParam.needDel;
            this.recordVolume = audioRecorderParam.recordVolume;
            this.audioRecordIndex = audioRecorderParam.audioRecordIndex;
            this.audioUrl = audioRecorderParam.audioUrl;
            this.extraUrl = audioRecorderParam.extraUrl;
            this.hasOriginVoiceConversion = audioRecorderParam.hasOriginVoiceConversion;
            this.hasDubVoiceConversion = audioRecorderParam.hasDubVoiceConversion;
            this.mStack.clear();
            this.mStack.addAll(audioRecorderParam.mStack);
            this.multiTrackAudio = audioRecorderParam.multiTrackAudio;
        }
    }

    public final void setAudioRecordIndex(int i) {
        this.audioRecordIndex = i;
    }

    public final void setAudioUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.audioUrl = str;
    }

    public final void setExtraUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extraUrl = str;
    }

    public final void setHasDubVoiceConversion(boolean z) {
        this.hasDubVoiceConversion = z;
    }

    public final void setHasOriginVoiceConversion(boolean z) {
        this.hasOriginVoiceConversion = z;
    }

    public final void setHasOriginalSound(boolean z) {
        this.hasOriginalSound = z;
    }

    public final void setMStack(Stack<Point> stack) {
        o.LJIIIZ(stack, "<set-?>");
        this.mStack = stack;
    }

    public final void setMultiTrackAudio(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.multiTrackAudio = list;
    }

    public final void setMuteByAudioCopyright(boolean z) {
        this.muteByAudioCopyright = z;
    }

    public final void setNeedDel(boolean z) {
        this.needDel = z;
    }

    public final void setNeedOriginalSound(boolean z) {
        this.needOriginalSound = z;
    }

    public final void setRecordVolume(float f) {
        this.recordVolume = f;
    }

    public final void setVoiceVolume(float f) {
        this.voiceVolume = f;
    }

    public final boolean hasChange(AudioRecorderParam audioRecorderParam, boolean z) {
        if (audioRecorderParam == null) {
            if (this.mStack.empty() && this.needOriginalSound == z) {
                return false;
            }
            return true;
        }
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        stack.addAll(this.mStack);
        stack2.addAll(audioRecorderParam.mStack);
        if (stack.size() != stack2.size()) {
            return true;
        }
        while (!stack.isEmpty() && !stack2.empty()) {
            Point point = (Point) stack.pop();
            Point b = (Point) stack2.pop();
            o.LJIIIIZZ(b, "b");
            if (!point.isEqual(b)) {
                return true;
            }
        }
        if (this.needOriginalSound == audioRecorderParam.needOriginalSound) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeSerializable(this.mStack);
        parcel.writeByte(this.needOriginalSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasOriginalSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.muteByAudioCopyright ? (byte) 1 : (byte) 0);
        parcel.writeString(this.audioUrl);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.recordVolume);
        parcel.writeString(this.extraUrl);
        parcel.writeStringList(this.multiTrackAudio);
    }

    public static /* synthetic */ boolean hasChange$default(AudioRecorderParam audioRecorderParam, AudioRecorderParam audioRecorderParam2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return audioRecorderParam.hasChange(audioRecorderParam2, z);
    }
}
