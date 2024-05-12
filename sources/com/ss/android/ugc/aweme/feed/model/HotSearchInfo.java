package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class HotSearchInfo implements Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 4;

    @InterfaceC65349Pkn("challenge_id")
    public String challengeId;

    @InterfaceC65349Pkn("group_id")
    public String id;

    @InterfaceC65349Pkn("label")
    public int label;

    @InterfaceC65349Pkn("rank")
    public int rank;

    @InterfaceC65349Pkn("search_word")
    public String searchWord;

    @InterfaceC65349Pkn("sentence")
    public String sentence;

    @InterfaceC65349Pkn("value")
    public long value;

    @InterfaceC65349Pkn("vb_rank")
    public int videoRank;

    @InterfaceC65349Pkn("vb_rank_value")
    public long videoRankVV;

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSearchWord() {
        return this.searchWord;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public final long getValue() {
        return this.value;
    }

    public final int getVideoRank() {
        return this.videoRank;
    }

    public final long getVideoRankVV() {
        return this.videoRankVV;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setSearchWord(String str) {
        this.searchWord = str;
    }

    public final void setSentence(String str) {
        this.sentence = str;
    }

    public final void setValue(long j) {
        this.value = j;
    }

    public final void setVideoRank(int i) {
        this.videoRank = i;
    }

    public final void setVideoRankVV(long j) {
        this.videoRankVV = j;
    }
}
