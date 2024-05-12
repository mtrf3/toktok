package com.ss.android.ugc.aweme.textsticker;

import X.C76800UCe;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextStickerChallenges extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<TextStickerChallenges> CREATOR = new Parcelable.Creator<TextStickerChallenges>() { // from class: X.5a3
        @Override // android.os.Parcelable.Creator
        public final TextStickerChallenges createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(TextStickerChallenges.class, parcel, arrayList, i, 1);
            }
            return new TextStickerChallenges(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TextStickerChallenges[] newArray(int i) {
            return new TextStickerChallenges[i];
        }
    };

    @InterfaceC65349Pkn("readTextChallenges")
    public final List<AVChallenge> readTextChallenges;

    /* JADX WARN: Multi-variable type inference failed */
    public TextStickerChallenges() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStickerChallenges copy$default(TextStickerChallenges textStickerChallenges, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textStickerChallenges.readTextChallenges;
        }
        return textStickerChallenges.copy(list);
    }

    public final TextStickerChallenges copy(List<AVChallenge> readTextChallenges) {
        o.LJIIIZ(readTextChallenges, "readTextChallenges");
        return new TextStickerChallenges(readTextChallenges);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.readTextChallenges};
    }

    public final List<String> getReadTextChallengeIds() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge previous = listIterator.previous();
            if (!arrayList.contains(previous.cid)) {
                String str = previous.cid;
                o.LJIIIIZZ(str, "item.cid");
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final List<AVChallenge> getReadTextChallenges() {
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list = this.readTextChallenges;
        ListIterator<AVChallenge> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AVChallenge previous = listIterator.previous();
            if (!arrayList.contains(previous)) {
                arrayList.add(previous);
            }
        }
        return ORZ.LLIILII(ORZ.LLJI(arrayList));
    }

    public TextStickerChallenges(List<AVChallenge> readTextChallenges) {
        o.LJIIIZ(readTextChallenges, "readTextChallenges");
        this.readTextChallenges = readTextChallenges;
    }

    public final void addReadTextChallenge(AVChallenge challenge) {
        o.LJIIIZ(challenge, "challenge");
        this.readTextChallenges.add(challenge);
    }

    public final void removeReadTextChallenge(String challengeId, InterfaceC88472Yns<? super AVChallenge, C76800UCe> action) {
        o.LJIIIZ(challengeId, "challengeId");
        o.LJIIIZ(action, "action");
        for (AVChallenge aVChallenge : this.readTextChallenges) {
            if (o.LJ(aVChallenge.cid, challengeId)) {
                if (aVChallenge != null) {
                    this.readTextChallenges.remove(aVChallenge);
                    action.invoke(aVChallenge);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Iterator LIZJ = UC7.LIZJ(this.readTextChallenges, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
    }

    public /* synthetic */ TextStickerChallenges(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedList() : list);
    }
}
