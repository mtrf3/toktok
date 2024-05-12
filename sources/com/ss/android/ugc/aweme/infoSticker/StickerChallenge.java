package com.ss.android.ugc.aweme.infosticker;

import X.C142175i1;
import X.C65777Prh;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StickerChallenge implements Parcelable, Serializable {
    public static final C142175i1 CREATOR = new Parcelable.Creator<StickerChallenge>() { // from class: X.5i1
        @Override // android.os.Parcelable.Creator
        public final StickerChallenge createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new StickerChallenge(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerChallenge[] newArray(int i) {
            return new StickerChallenge[i];
        }
    };

    @InterfaceC65349Pkn(alternate = {"d"}, value = "edit_effect_sticker_challenge_list")
    public List<AVChallenge> editEffectStickerChallengeList;

    @InterfaceC65349Pkn(alternate = {"c"}, value = "record_sticker_challenge_list")
    public List<AVChallenge> recordStickerChallengeList;

    @InterfaceC65349Pkn(alternate = {"a"}, value = "sticker_list")
    public List<String> stickerList;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "sticker_to_challenge")
    public HashMap<String, AVChallenge> stickerToChallenge;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Collection<AVChallenge> infoStickerChallenges() {
        Collection<AVChallenge> values = this.stickerToChallenge.values();
        o.LJIIIIZZ(values, "stickerToChallenge.values");
        return values;
    }

    public StickerChallenge() {
        this.stickerList = new ArrayList();
        this.stickerToChallenge = new HashMap<>();
        this.recordStickerChallengeList = new ArrayList();
        this.editEffectStickerChallengeList = new ArrayList();
    }

    public final List<AVChallenge> getEditEffectStickerChallengeList() {
        return this.editEffectStickerChallengeList;
    }

    public final List<AVChallenge> getRecordStickerChallengeList() {
        return this.recordStickerChallengeList;
    }

    public final List<String> getStickerList() {
        return this.stickerList;
    }

    public final HashMap<String, AVChallenge> getStickerToChallenge() {
        return this.stickerToChallenge;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StickerChallenge(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        parcel.readStringList(this.stickerList);
        Serializable readSerializable = parcel.readSerializable();
        o.LJII(readSerializable, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.AVChallenge> }");
        this.stickerToChallenge = (HashMap) readSerializable;
        ArrayList readArrayList = parcel.readArrayList(AVChallenge.class.getClassLoader());
        o.LJII(readArrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        this.recordStickerChallengeList = C65777Prh.LIZIZ(readArrayList);
        ArrayList readArrayList2 = parcel.readArrayList(AVChallenge.class.getClassLoader());
        o.LJII(readArrayList2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        this.editEffectStickerChallengeList = C65777Prh.LIZIZ(readArrayList2);
    }

    public final void setEditEffectStickerChallengeList(List<AVChallenge> list) {
        o.LJIIIZ(list, "<set-?>");
        this.editEffectStickerChallengeList = list;
    }

    public final void setRecordStickerChallengeList(List<AVChallenge> list) {
        o.LJIIIZ(list, "<set-?>");
        this.recordStickerChallengeList = list;
    }

    public final void setStickerList(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.stickerList = list;
    }

    public final void setStickerToChallenge(HashMap<String, AVChallenge> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.stickerToChallenge = hashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeStringList(this.stickerList);
        dest.writeSerializable(this.stickerToChallenge);
        List<AVChallenge> list = this.recordStickerChallengeList;
        o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        dest.writeList(list);
        List<AVChallenge> list2 = this.editEffectStickerChallengeList;
        o.LJII(list2, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge>");
        dest.writeList(list2);
    }
}
