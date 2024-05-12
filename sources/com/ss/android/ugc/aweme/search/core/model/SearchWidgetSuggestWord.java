package com.ss.android.ugc.aweme.search.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetSuggestWord;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchWidgetSuggestWord extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<SearchWidgetSuggestWord> CREATOR = new Parcelable.Creator<SearchWidgetSuggestWord>() { // from class: X.3u0
        @Override // android.os.Parcelable.Creator
        public final SearchWidgetSuggestWord createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new SearchWidgetSuggestWord(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchWidgetSuggestWord[] newArray(int i) {
            return new SearchWidgetSuggestWord[i];
        }
    };

    @InterfaceC65349Pkn("id")
    public final String groupId;

    @InterfaceC65349Pkn("word")
    public final String word;

    public static /* synthetic */ SearchWidgetSuggestWord copy$default(SearchWidgetSuggestWord searchWidgetSuggestWord, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchWidgetSuggestWord.word;
        }
        if ((i & 2) != 0) {
            str2 = searchWidgetSuggestWord.groupId;
        }
        return searchWidgetSuggestWord.copy(str, str2);
    }

    public final SearchWidgetSuggestWord copy(String word, String groupId) {
        o.LJIIIZ(word, "word");
        o.LJIIIZ(groupId, "groupId");
        return new SearchWidgetSuggestWord(word, groupId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.word, this.groupId};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.word);
        out.writeString(this.groupId);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getWord() {
        return this.word;
    }

    public SearchWidgetSuggestWord(String word, String groupId) {
        o.LJIIIZ(word, "word");
        o.LJIIIZ(groupId, "groupId");
        this.word = word;
        this.groupId = groupId;
    }
}
