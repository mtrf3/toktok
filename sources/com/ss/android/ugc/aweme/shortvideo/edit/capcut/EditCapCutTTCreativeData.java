package com.ss.android.ugc.aweme.shortvideo.edit.capcut;

import X.AnonymousClass391;
import X.C279017q;
import X.C48339Iy7;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutTTCreativeData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelChallengeAdapterFactory;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditCapCutTTCreativeData implements Parcelable {
    public static final Parcelable.Creator<EditCapCutTTCreativeData> CREATOR = new Parcelable.Creator<EditCapCutTTCreativeData>() { // from class: X.5vO
        @Override // android.os.Parcelable.Creator
        public final EditCapCutTTCreativeData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new EditCapCutTTCreativeData(parcel.readString(), EditCapCutTTCreativeData.ChallengeData.CREATOR.createFromParcel(parcel), (CommentVideoModel) parcel.readSerializable(), (QaStruct) parcel.readSerializable(), EditCapCutTTCreativeData.TitleData.CREATOR.createFromParcel(parcel), (AVMusic) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final EditCapCutTTCreativeData[] newArray(int i) {
            return new EditCapCutTTCreativeData[i];
        }
    };

    @InterfaceC65349Pkn("av_music")
    public final AVMusic avMusic;

    @InterfaceC65349Pkn("challenge_data")
    public final ChallengeData challengeData;

    @InterfaceC65349Pkn("comment_video_model")
    public final CommentVideoModel commentVideoModel;

    @InterfaceC65349Pkn("creation_id")
    public final String creationId;

    @InterfaceC65349Pkn("qa_struct")
    public final QaStruct qaStruct;

    @InterfaceC65349Pkn("title_data")
    public final TitleData titleData;

    /* loaded from: classes3.dex */
    public static final class TitleData implements Parcelable {
        public static final Parcelable.Creator<TitleData> CREATOR = new Parcelable.Creator<TitleData>() { // from class: X.5vN
            @Override // android.os.Parcelable.Creator
            public final EditCapCutTTCreativeData.TitleData createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                boolean z;
                o.LJIIIZ(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = C5YW.LIZ(EditCapCutTTCreativeData.TitleData.class, parcel, arrayList, i, 1);
                    }
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = C5YW.LIZ(EditCapCutTTCreativeData.TitleData.class, parcel, arrayList2, i2, 1);
                }
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new EditCapCutTTCreativeData.TitleData(arrayList, readString, readString2, arrayList2, readString3, z);
            }

            @Override // android.os.Parcelable.Creator
            public final EditCapCutTTCreativeData.TitleData[] newArray(int i) {
                return new EditCapCutTTCreativeData.TitleData[i];
            }
        };

        @InterfaceC65349Pkn("chain")
        public final String chain;

        @InterfaceC65349Pkn("disable_delete_chain")
        public final boolean disableDeleteChain;

        @InterfaceC65349Pkn("markup_caption")
        public final String markupCaption;

        @InterfaceC65349Pkn("markup_extra")
        public final List<AVTextExtraStruct> markupExtra;

        @InterfaceC65349Pkn("title")
        public final String title;

        @InterfaceC65349Pkn("title_text_struct_list")
        public final List<AVTextExtraStruct> titleTextStructList;

        public TitleData() {
            this(null, null, null, null, null, false, 63, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleData)) {
                return false;
            }
            TitleData titleData = (TitleData) obj;
            return o.LJ(this.titleTextStructList, titleData.titleTextStructList) && o.LJ(this.title, titleData.title) && o.LJ(this.markupCaption, titleData.markupCaption) && o.LJ(this.markupExtra, titleData.markupExtra) && o.LJ(this.chain, titleData.chain) && this.disableDeleteChain == titleData.disableDeleteChain;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            List<AVTextExtraStruct> list = this.titleTextStructList;
            int i = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.title;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str2 = this.markupCaption;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int LIZIZ = AnonymousClass391.LIZIZ(this.markupExtra, (i3 + hashCode3) * 31, 31);
            String str3 = this.chain;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i4 = (LIZIZ + i) * 31;
            boolean z = this.disableDeleteChain;
            int i5 = z;
            if (z != 0) {
                i5 = 1;
            }
            return i4 + i5;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TitleData(titleTextStructList=");
            LIZ.append(this.titleTextStructList);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", markupCaption=");
            LIZ.append(this.markupCaption);
            LIZ.append(", markupExtra=");
            LIZ.append(this.markupExtra);
            LIZ.append(", chain=");
            LIZ.append(this.chain);
            LIZ.append(", disableDeleteChain=");
            return C48339Iy7.LIZJ(LIZ, this.disableDeleteChain, ')', LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            List<AVTextExtraStruct> list = this.titleTextStructList;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    out.writeParcelable((Parcelable) LIZIZ.next(), i);
                }
            }
            out.writeString(this.title);
            out.writeString(this.markupCaption);
            Iterator LIZJ = UC7.LIZJ(this.markupExtra, out);
            while (LIZJ.hasNext()) {
                out.writeParcelable((Parcelable) LIZJ.next(), i);
            }
            out.writeString(this.chain);
            out.writeInt(this.disableDeleteChain ? 1 : 0);
        }

        public TitleData(List<AVTextExtraStruct> list, String str, String str2, List<AVTextExtraStruct> markupExtra, String str3, boolean z) {
            o.LJIIIZ(markupExtra, "markupExtra");
            this.titleTextStructList = list;
            this.title = str;
            this.markupCaption = str2;
            this.markupExtra = markupExtra;
            this.chain = str3;
            this.disableDeleteChain = z;
        }

        public TitleData(List list, String str, String str2, List list2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? C61878OQg.INSTANCE : list2, (i & 16) == 0 ? str3 : null, (i & 32) != 0 ? false : z);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCapCutTTCreativeData)) {
            return false;
        }
        EditCapCutTTCreativeData editCapCutTTCreativeData = (EditCapCutTTCreativeData) obj;
        return o.LJ(this.creationId, editCapCutTTCreativeData.creationId) && o.LJ(this.challengeData, editCapCutTTCreativeData.challengeData) && o.LJ(this.commentVideoModel, editCapCutTTCreativeData.commentVideoModel) && o.LJ(this.qaStruct, editCapCutTTCreativeData.qaStruct) && o.LJ(this.titleData, editCapCutTTCreativeData.titleData) && o.LJ(this.avMusic, editCapCutTTCreativeData.avMusic);
    }

    public final int hashCode() {
        int hashCode = (this.challengeData.hashCode() + (this.creationId.hashCode() * 31)) * 31;
        CommentVideoModel commentVideoModel = this.commentVideoModel;
        int hashCode2 = (hashCode + (commentVideoModel == null ? 0 : commentVideoModel.hashCode())) * 31;
        QaStruct qaStruct = this.qaStruct;
        int hashCode3 = (this.titleData.hashCode() + ((hashCode2 + (qaStruct == null ? 0 : qaStruct.hashCode())) * 31)) * 31;
        AVMusic aVMusic = this.avMusic;
        return hashCode3 + (aVMusic != null ? aVMusic.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditCapCutTTCreativeData(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", challengeData=");
        LIZ.append(this.challengeData);
        LIZ.append(", commentVideoModel=");
        LIZ.append(this.commentVideoModel);
        LIZ.append(", qaStruct=");
        LIZ.append(this.qaStruct);
        LIZ.append(", titleData=");
        LIZ.append(this.titleData);
        LIZ.append(", avMusic=");
        LIZ.append(this.avMusic);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.creationId);
        this.challengeData.writeToParcel(out, i);
        out.writeSerializable(this.commentVideoModel);
        out.writeSerializable(this.qaStruct);
        this.titleData.writeToParcel(out, i);
        out.writeSerializable(this.avMusic);
    }

    /* loaded from: classes3.dex */
    public static final class ChallengeData implements Parcelable {
        public static final Parcelable.Creator<ChallengeData> CREATOR = new Parcelable.Creator<ChallengeData>() { // from class: X.5vM
            @Override // android.os.Parcelable.Creator
            public final EditCapCutTTCreativeData.ChallengeData createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                o.LJIIIZ(parcel, "parcel");
                int i = 0;
                ArrayList arrayList2 = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = C5YW.LIZ(EditCapCutTTCreativeData.ChallengeData.class, parcel, arrayList, i2, 1);
                    }
                }
                AVChallenge aVChallenge = (AVChallenge) parcel.readParcelable(EditCapCutTTCreativeData.ChallengeData.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = C5YW.LIZ(EditCapCutTTCreativeData.ChallengeData.class, parcel, arrayList2, i, 1);
                    }
                }
                return new EditCapCutTTCreativeData.ChallengeData(arrayList, aVChallenge, arrayList2, (Mission) parcel.readParcelable(EditCapCutTTCreativeData.ChallengeData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final EditCapCutTTCreativeData.ChallengeData[] newArray(int i) {
                return new EditCapCutTTCreativeData.ChallengeData[i];
            }
        };

        @InterfaceC65349Pkn("effect_challenges")
        @InterfaceC65404Plg(TimeSpeedModelChallengeAdapterFactory.class)
        public final List<AVChallenge> effectChallenges;

        @InterfaceC65349Pkn("mission")
        public final Mission mission;

        @InterfaceC65349Pkn("normal_challenges")
        public final List<AVChallenge> normalChallenges;

        @InterfaceC65349Pkn("record_challenge")
        public final AVChallenge recordChallenge;

        /* JADX WARN: Multi-variable type inference failed */
        public ChallengeData() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChallengeData)) {
                return false;
            }
            ChallengeData challengeData = (ChallengeData) obj;
            return o.LJ(this.normalChallenges, challengeData.normalChallenges) && o.LJ(this.recordChallenge, challengeData.recordChallenge) && o.LJ(this.effectChallenges, challengeData.effectChallenges) && o.LJ(this.mission, challengeData.mission);
        }

        public final int hashCode() {
            List<AVChallenge> list = this.normalChallenges;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            AVChallenge aVChallenge = this.recordChallenge;
            int hashCode2 = (hashCode + (aVChallenge == null ? 0 : aVChallenge.hashCode())) * 31;
            List<AVChallenge> list2 = this.effectChallenges;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Mission mission = this.mission;
            return hashCode3 + (mission != null ? mission.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ChallengeData(normalChallenges=");
            LIZ.append(this.normalChallenges);
            LIZ.append(", recordChallenge=");
            LIZ.append(this.recordChallenge);
            LIZ.append(", effectChallenges=");
            LIZ.append(this.effectChallenges);
            LIZ.append(", mission=");
            LIZ.append(this.mission);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            o.LJIIIZ(out, "out");
            List<AVChallenge> list = this.normalChallenges;
            if (list == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
                while (LIZIZ.hasNext()) {
                    out.writeParcelable((Parcelable) LIZIZ.next(), i);
                }
            }
            out.writeParcelable(this.recordChallenge, i);
            List<AVChallenge> list2 = this.effectChallenges;
            if (list2 == null) {
                out.writeInt(0);
            } else {
                Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
                while (LIZIZ2.hasNext()) {
                    out.writeParcelable((Parcelable) LIZIZ2.next(), i);
                }
            }
            out.writeParcelable(this.mission, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ChallengeData(List<? extends AVChallenge> list, AVChallenge aVChallenge, List<? extends AVChallenge> list2, Mission mission) {
            this.normalChallenges = list;
            this.recordChallenge = aVChallenge;
            this.effectChallenges = list2;
            this.mission = mission;
        }

        public /* synthetic */ ChallengeData(List list, AVChallenge aVChallenge, List list2, Mission mission, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : aVChallenge, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : mission);
        }
    }

    public EditCapCutTTCreativeData(String creationId, ChallengeData challengeData, CommentVideoModel commentVideoModel, QaStruct qaStruct, TitleData titleData, AVMusic aVMusic) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(challengeData, "challengeData");
        o.LJIIIZ(titleData, "titleData");
        this.creationId = creationId;
        this.challengeData = challengeData;
        this.commentVideoModel = commentVideoModel;
        this.qaStruct = qaStruct;
        this.titleData = titleData;
        this.avMusic = aVMusic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EditCapCutTTCreativeData(String str, ChallengeData challengeData, CommentVideoModel commentVideoModel, QaStruct qaStruct, TitleData titleData, AVMusic aVMusic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new ChallengeData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0) : challengeData, (i & 4) != 0 ? null : commentVideoModel, (i & 8) != 0 ? null : qaStruct, (i & 16) != 0 ? new TitleData(null, null, null, null, null, false, 63, null) : titleData, (i & 32) == 0 ? aVMusic : null);
    }
}
