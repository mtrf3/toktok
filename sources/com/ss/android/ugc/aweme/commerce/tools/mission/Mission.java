package com.ss.android.ugc.aweme.commerce.tools.mission;

import X.C08880Wm;
import X.C163466bG;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionImageSticker;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class Mission implements Parcelable, Serializable {

    @InterfaceC65349Pkn("challenges")
    public final List<String> challengeNames;

    @InterfaceC65349Pkn("enable_hashtag_sticker")
    public boolean enableHashtagSticker;

    @InterfaceC65349Pkn("enable_image_sticker")
    public boolean enableImageSticker;

    @InterfaceC65349Pkn("enter_from")
    public String enterFrom;

    @InterfaceC65349Pkn("image_sticker")
    public MissionImageSticker imageSticker;

    @InterfaceC65349Pkn("is_challenge_toasted")
    public boolean isChallengeToasted;

    @InterfaceC65349Pkn("is_music_toasted")
    public boolean isMusicToasted;

    @InterfaceC65349Pkn("is_user_toasted")
    public boolean isUserToasted;

    @InterfaceC65349Pkn("mentioned_user")
    public List<MissionUser> mentionedUsers;

    @InterfaceC65349Pkn("mission_id")
    public final String missionId;

    @InterfaceC65349Pkn("music_id")
    public final String musicId;

    @InterfaceC65349Pkn("sticker_id")
    public final String stickerId;

    @InterfaceC65349Pkn("is_sticker_toasted")
    public boolean userEverChoseDifferentSticker;
    public static final C163466bG Companion = new Object() { // from class: X.6bG
    };
    public static final Parcelable.Creator<Mission> CREATOR = new Parcelable.Creator<Mission>() { // from class: X.6bE
        @Override // android.os.Parcelable.Creator
        public final Mission createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList arrayList;
            boolean z4;
            boolean z5;
            boolean z6;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            MissionImageSticker missionImageSticker = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(MissionUser.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                missionImageSticker = MissionImageSticker.CREATOR.createFromParcel(parcel);
            }
            MissionImageSticker missionImageSticker2 = missionImageSticker;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            return new Mission(readString, readString2, z, readString3, z2, createStringArrayList, z3, arrayList, z4, readString4, missionImageSticker2, z5, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Mission[] newArray(int i) {
            return new Mission[i];
        }
    };

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Mission() {
        /*
            r16 = this;
            r1 = 0
            r3 = 0
            r14 = 8191(0x1fff, float:1.1478E-41)
            r0 = r16
            r2 = r1
            r4 = r1
            r5 = r3
            r6 = r1
            r7 = r3
            r8 = r1
            r9 = r3
            r10 = r1
            r11 = r1
            r12 = r3
            r13 = r3
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.tools.mission.Mission.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mission copy$default(Mission mission, String str, String str2, boolean z, String str3, boolean z2, List list, boolean z3, List list2, boolean z4, String str4, MissionImageSticker missionImageSticker, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mission.missionId;
        }
        if ((i & 2) != 0) {
            str2 = mission.stickerId;
        }
        if ((i & 4) != 0) {
            z = mission.userEverChoseDifferentSticker;
        }
        if ((i & 8) != 0) {
            str3 = mission.musicId;
        }
        if ((i & 16) != 0) {
            z2 = mission.isMusicToasted;
        }
        if ((i & 32) != 0) {
            list = mission.challengeNames;
        }
        if ((i & 64) != 0) {
            z3 = mission.isChallengeToasted;
        }
        if ((i & 128) != 0) {
            list2 = mission.mentionedUsers;
        }
        if ((i & 256) != 0) {
            z4 = mission.isUserToasted;
        }
        if ((i & 512) != 0) {
            str4 = mission.enterFrom;
        }
        if ((i & 1024) != 0) {
            missionImageSticker = mission.imageSticker;
        }
        if ((i & 2048) != 0) {
            z5 = mission.enableHashtagSticker;
        }
        if ((i & 4096) != 0) {
            z6 = mission.enableImageSticker;
        }
        return mission.copy(str, str2, z, str3, z2, list, z3, list2, z4, str4, missionImageSticker, z5, z6);
    }

    public final Mission copy(String str, String str2, boolean z, String str3, boolean z2, List<String> list, boolean z3, List<MissionUser> list2, boolean z4, String str4, MissionImageSticker missionImageSticker, boolean z5, boolean z6) {
        return new Mission(str, str2, z, str3, z2, list, z3, list2, z4, str4, missionImageSticker, z5, z6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mission)) {
            return false;
        }
        Mission mission = (Mission) obj;
        return o.LJ(this.missionId, mission.missionId) && o.LJ(this.stickerId, mission.stickerId) && this.userEverChoseDifferentSticker == mission.userEverChoseDifferentSticker && o.LJ(this.musicId, mission.musicId) && this.isMusicToasted == mission.isMusicToasted && o.LJ(this.challengeNames, mission.challengeNames) && this.isChallengeToasted == mission.isChallengeToasted && o.LJ(this.mentionedUsers, mission.mentionedUsers) && this.isUserToasted == mission.isUserToasted && o.LJ(this.enterFrom, mission.enterFrom) && o.LJ(this.imageSticker, mission.imageSticker) && this.enableHashtagSticker == mission.enableHashtagSticker && this.enableImageSticker == mission.enableImageSticker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.missionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.stickerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.userEverChoseDifferentSticker;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str3 = this.musicId;
        int hashCode3 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z2 = this.isMusicToasted;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode3 + i3) * 31;
        List<String> list = this.challengeNames;
        int hashCode4 = (i4 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z3 = this.isChallengeToasted;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode4 + i5) * 31;
        List<MissionUser> list2 = this.mentionedUsers;
        int hashCode5 = (i6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        boolean z4 = this.isUserToasted;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode5 + i7) * 31;
        String str4 = this.enterFrom;
        int hashCode6 = (i8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MissionImageSticker missionImageSticker = this.imageSticker;
        int hashCode7 = (hashCode6 + (missionImageSticker != null ? missionImageSticker.hashCode() : 0)) * 31;
        boolean z5 = this.enableHashtagSticker;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        return ((hashCode7 + i9) * 31) + (this.enableImageSticker ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Mission(missionId=");
        sb.append(this.missionId);
        sb.append(", stickerId=");
        sb.append(this.stickerId);
        sb.append(", userEverChoseDifferentSticker=");
        sb.append(this.userEverChoseDifferentSticker);
        sb.append(", musicId=");
        sb.append(this.musicId);
        sb.append(", isMusicToasted=");
        sb.append(this.isMusicToasted);
        sb.append(", challengeNames=");
        sb.append(this.challengeNames);
        sb.append(", isChallengeToasted=");
        sb.append(this.isChallengeToasted);
        sb.append(", mentionedUsers=");
        sb.append(this.mentionedUsers);
        sb.append(", isUserToasted=");
        sb.append(this.isUserToasted);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", imageSticker=");
        sb.append(this.imageSticker);
        sb.append(", enableHashtagSticker=");
        sb.append(this.enableHashtagSticker);
        sb.append(", enableImageSticker=");
        return C08880Wm.LIZJ(sb, this.enableImageSticker, ')');
    }

    public final List<String> getChallengeNames() {
        return this.challengeNames;
    }

    public final boolean getEnableHashtagSticker() {
        return this.enableHashtagSticker;
    }

    public final boolean getEnableImageSticker() {
        return this.enableImageSticker;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final MissionImageSticker getImageSticker() {
        return this.imageSticker;
    }

    public final List<MissionUser> getMentionedUsers() {
        return this.mentionedUsers;
    }

    public final String getMissionId() {
        return this.missionId;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final boolean getUserEverChoseDifferentSticker() {
        return this.userEverChoseDifferentSticker;
    }

    public final boolean isChallengeToasted() {
        return this.isChallengeToasted;
    }

    public final boolean isMusicToasted() {
        return this.isMusicToasted;
    }

    public final boolean isUserToasted() {
        return this.isUserToasted;
    }

    public final void setChallengeToasted(boolean z) {
        this.isChallengeToasted = z;
    }

    public final void setEnableHashtagSticker(boolean z) {
        this.enableHashtagSticker = z;
    }

    public final void setEnableImageSticker(boolean z) {
        this.enableImageSticker = z;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setImageSticker(MissionImageSticker missionImageSticker) {
        this.imageSticker = missionImageSticker;
    }

    public final void setMentionedUsers(List<MissionUser> list) {
        this.mentionedUsers = list;
    }

    public final void setMusicToasted(boolean z) {
        this.isMusicToasted = z;
    }

    public final void setUserEverChoseDifferentSticker(boolean z) {
        this.userEverChoseDifferentSticker = z;
    }

    public final void setUserToasted(boolean z) {
        this.isUserToasted = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.missionId);
        out.writeString(this.stickerId);
        out.writeInt(this.userEverChoseDifferentSticker ? 1 : 0);
        out.writeString(this.musicId);
        out.writeInt(this.isMusicToasted ? 1 : 0);
        out.writeStringList(this.challengeNames);
        out.writeInt(this.isChallengeToasted ? 1 : 0);
        List<MissionUser> list = this.mentionedUsers;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((MissionUser) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeInt(this.isUserToasted ? 1 : 0);
        out.writeString(this.enterFrom);
        MissionImageSticker missionImageSticker = this.imageSticker;
        if (missionImageSticker == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            missionImageSticker.writeToParcel(out, i);
        }
        out.writeInt(this.enableHashtagSticker ? 1 : 0);
        out.writeInt(this.enableImageSticker ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Mission newInstanceForMusic(String str, String str2, String str3) {
        Companion.getClass();
        boolean z = false;
        return new Mission(str, null, z, str2, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, str3, 0 == true ? 1 : 0, z, z, 7670, 0 == true ? 1 : 0);
    }

    public Mission(String str, String str2, boolean z, String str3, boolean z2, List<String> list, boolean z3, List<MissionUser> list2, boolean z4, String str4, MissionImageSticker missionImageSticker, boolean z5, boolean z6) {
        this.missionId = str;
        this.stickerId = str2;
        this.userEverChoseDifferentSticker = z;
        this.musicId = str3;
        this.isMusicToasted = z2;
        this.challengeNames = list;
        this.isChallengeToasted = z3;
        this.mentionedUsers = list2;
        this.isUserToasted = z4;
        this.enterFrom = str4;
        this.imageSticker = missionImageSticker;
        this.enableHashtagSticker = z5;
        this.enableImageSticker = z6;
    }

    public /* synthetic */ Mission(String str, String str2, boolean z, String str3, boolean z2, List list, boolean z3, List list2, boolean z4, String str4, MissionImageSticker missionImageSticker, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? true : z3, (i & 128) != 0 ? null : list2, (i & 256) == 0 ? z4 : true, (i & 512) != 0 ? null : str4, (i & 1024) == 0 ? missionImageSticker : null, (i & 2048) != 0 ? false : z5, (i & 4096) == 0 ? z6 : false);
    }
}
