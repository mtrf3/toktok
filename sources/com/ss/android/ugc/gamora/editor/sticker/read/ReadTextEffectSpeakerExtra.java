package com.ss.android.ugc.gamora.editor.sticker.read;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ReadTextEffectSpeakerExtra implements Parcelable {
    public static final Parcelable.Creator<ReadTextEffectSpeakerExtra> CREATOR = new Parcelable.Creator<ReadTextEffectSpeakerExtra>() { // from class: X.5a7
        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectSpeakerExtra createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new ReadTextEffectSpeakerExtra(z, readString, readString2, readString3, readInt, readInt2, readString4, readString5, readString6, readString7, z2, parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ReadTextEffectSpeakerExtra[] newArray(int i) {
            return new ReadTextEffectSpeakerExtra[i];
        }
    };

    @InterfaceC65349Pkn("is_creator")
    public final boolean isCreatorVoice;
    public boolean isFake;

    @InterfaceC65349Pkn("lock_easteregg")
    public int lockEasterEgg;

    @InterfaceC65349Pkn("lock_keywords_easteregg")
    public String lockKeywordsEasterEgg;
    public String speakerName;

    @InterfaceC65349Pkn("speakerID")
    public String speakreID;

    @InterfaceC65349Pkn("TTS_anchor_name")
    public String ttsAnchorName;

    @InterfaceC65349Pkn("tts_anchor_release_date")
    public final long ttsAnchorReleaseDate;

    @InterfaceC65349Pkn("tts_release_date")
    public final long ttsReleaseDate;

    @InterfaceC65349Pkn("creator_user_id")
    public final String voiceCreatorUserId;

    @InterfaceC65349Pkn("creator_user_name")
    public final String voiceCreatorUserName;

    @InterfaceC65349Pkn("voice_descriptions")
    public String voiceDescriptions;

    @InterfaceC65349Pkn("voice_use_commercial")
    public int voiceUseCommercial;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReadTextEffectSpeakerExtra() {
        /*
            r18 = this;
            r1 = 0
            r2 = 0
            r12 = 0
            r16 = 8191(0x1fff, float:1.1478E-41)
            r0 = r18
            r3 = r2
            r4 = r2
            r5 = r1
            r6 = r1
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r1
            r14 = r12
            r17 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isFake ? 1 : 0);
        out.writeString(this.speakerName);
        out.writeString(this.speakreID);
        out.writeString(this.lockKeywordsEasterEgg);
        out.writeInt(this.lockEasterEgg);
        out.writeInt(this.voiceUseCommercial);
        out.writeString(this.ttsAnchorName);
        out.writeString(this.voiceDescriptions);
        out.writeString(this.voiceCreatorUserId);
        out.writeString(this.voiceCreatorUserName);
        out.writeInt(this.isCreatorVoice ? 1 : 0);
        out.writeLong(this.ttsAnchorReleaseDate);
        out.writeLong(this.ttsReleaseDate);
    }

    public ReadTextEffectSpeakerExtra(boolean z, String speakerName, String speakreID, String lockKeywordsEasterEgg, int i, int i2, String ttsAnchorName, String voiceDescriptions, String voiceCreatorUserId, String voiceCreatorUserName, boolean z2, long j, long j2) {
        o.LJIIIZ(speakerName, "speakerName");
        o.LJIIIZ(speakreID, "speakreID");
        o.LJIIIZ(lockKeywordsEasterEgg, "lockKeywordsEasterEgg");
        o.LJIIIZ(ttsAnchorName, "ttsAnchorName");
        o.LJIIIZ(voiceDescriptions, "voiceDescriptions");
        o.LJIIIZ(voiceCreatorUserId, "voiceCreatorUserId");
        o.LJIIIZ(voiceCreatorUserName, "voiceCreatorUserName");
        this.isFake = z;
        this.speakerName = speakerName;
        this.speakreID = speakreID;
        this.lockKeywordsEasterEgg = lockKeywordsEasterEgg;
        this.lockEasterEgg = i;
        this.voiceUseCommercial = i2;
        this.ttsAnchorName = ttsAnchorName;
        this.voiceDescriptions = voiceDescriptions;
        this.voiceCreatorUserId = voiceCreatorUserId;
        this.voiceCreatorUserName = voiceCreatorUserName;
        this.isCreatorVoice = z2;
        this.ttsAnchorReleaseDate = j;
        this.ttsReleaseDate = j2;
    }

    public /* synthetic */ ReadTextEffectSpeakerExtra(boolean z, String str, String str2, String str3, int i, int i2, String str4, String str5, String str6, String str7, boolean z2, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? "" : str6, (i3 & 512) == 0 ? str7 : "", (i3 & 1024) == 0 ? z2 : false, (i3 & 2048) != 0 ? 0L : j, (i3 & 4096) == 0 ? j2 : 0L);
    }
}
