package com.ss.android.ugc.aweme.discover.model;

import X.AbstractC36908Ee8;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingTopic extends AbstractC36908Ee8 implements Serializable, LazyDeserializeItem {

    @InterfaceC65349Pkn("ad_data")
    @InterfaceC65404Plg(StringJsonAdapterFactory.class)
    public final TrendingTopicsAdInfo adData;

    @InterfaceC65349Pkn("creator_info")
    public final User author;

    @InterfaceC65349Pkn("category_type")
    public final int categoryType;

    @InterfaceC65349Pkn("challenge_info")
    public final Challenge challenge;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("effect_info")
    public final NewFaceStickerBean effect;

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> items;

    @InterfaceC65349Pkn("music_info")
    public final Music music;
    public transient boolean needToBeSupplied;

    @InterfaceC65349Pkn("word_record")
    public final Word word;

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopic() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingTopic copy$default(TrendingTopic trendingTopic, int i, List list, Challenge challenge, Music music, NewFaceStickerBean newFaceStickerBean, User user, String str, Word word, TrendingTopicsAdInfo trendingTopicsAdInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = trendingTopic.categoryType;
        }
        if ((i2 & 2) != 0) {
            list = trendingTopic.items;
        }
        if ((i2 & 4) != 0) {
            challenge = trendingTopic.challenge;
        }
        if ((i2 & 8) != 0) {
            music = trendingTopic.music;
        }
        if ((i2 & 16) != 0) {
            newFaceStickerBean = trendingTopic.effect;
        }
        if ((i2 & 32) != 0) {
            user = trendingTopic.author;
        }
        if ((i2 & 64) != 0) {
            str = trendingTopic.desc;
        }
        if ((i2 & 128) != 0) {
            word = trendingTopic.word;
        }
        if ((i2 & 256) != 0) {
            trendingTopicsAdInfo = trendingTopic.adData;
        }
        return trendingTopic.copy(i, list, challenge, music, newFaceStickerBean, user, str, word, trendingTopicsAdInfo);
    }

    public final TrendingTopic copy(int i, List<? extends Aweme> list, Challenge challenge, Music music, NewFaceStickerBean newFaceStickerBean, User user, String desc, Word word, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        o.LJIIIZ(desc, "desc");
        return new TrendingTopic(i, list, challenge, music, newFaceStickerBean, user, desc, word, trendingTopicsAdInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTopic)) {
            return false;
        }
        TrendingTopic trendingTopic = (TrendingTopic) obj;
        return this.categoryType == trendingTopic.categoryType && o.LJ(this.items, trendingTopic.items) && o.LJ(this.challenge, trendingTopic.challenge) && o.LJ(this.music, trendingTopic.music) && o.LJ(this.effect, trendingTopic.effect) && o.LJ(this.author, trendingTopic.author) && o.LJ(this.desc, trendingTopic.desc) && o.LJ(this.word, trendingTopic.word) && o.LJ(this.adData, trendingTopic.adData);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingTopic(categoryType=");
        LIZ.append(this.categoryType);
        LIZ.append(", items=");
        LIZ.append(this.items);
        LIZ.append(", challenge=");
        LIZ.append(this.challenge);
        LIZ.append(", music=");
        LIZ.append(this.music);
        LIZ.append(", effect=");
        LIZ.append(this.effect);
        LIZ.append(", author=");
        LIZ.append(this.author);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", word=");
        LIZ.append(this.word);
        LIZ.append(", adData=");
        LIZ.append(this.adData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final UrlModel getClickTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getClickTrackUrlList();
        }
        return null;
    }

    public final long getCreativeId() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getCreativeId();
        }
        return 0L;
    }

    public final String getLogExtra() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getLogExtra();
        }
        return null;
    }

    public final UrlModel getTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getTrackUrlList();
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = this.categoryType * 31;
        List<Aweme> list = this.items;
        int i2 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Challenge challenge = this.challenge;
        if (challenge == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = challenge.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Music music = this.music;
        if (music == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = music.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        NewFaceStickerBean newFaceStickerBean = this.effect;
        if (newFaceStickerBean == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = newFaceStickerBean.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        User user = this.author;
        if (user == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = user.hashCode();
        }
        int LJ = C79062V1e.LJ(this.desc, (i6 + hashCode5) * 31, 31);
        Word word = this.word;
        if (word == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = word.hashCode();
        }
        int i7 = (LJ + hashCode6) * 31;
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            i2 = trendingTopicsAdInfo.hashCode();
        }
        return i7 + i2;
    }

    public final boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public final boolean isChallenge() {
        if (this.challenge != null) {
            return true;
        }
        return false;
    }

    public final boolean isMusic() {
        if (this.music != null) {
            return true;
        }
        return false;
    }

    public final boolean isChallengeAd() {
        if (isAd() && this.challenge != null) {
            return true;
        }
        return false;
    }

    public final boolean isPicAd() {
        if (isAd() && this.challenge == null) {
            return true;
        }
        return false;
    }

    public final TrendingTopicsAdInfo getAdData() {
        return this.adData;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final int getCategoryType() {
        return this.categoryType;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final NewFaceStickerBean getEffect() {
        return this.effect;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final Music getMusic() {
        return this.music;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public boolean getNeedToBeSupplied() {
        return this.needToBeSupplied;
    }

    public final Word getWord() {
        return this.word;
    }

    @Override // com.ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public void setNeedToBeSupplied(boolean z) {
        this.needToBeSupplied = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopic(int i, List<? extends Aweme> list, Challenge challenge, Music music, NewFaceStickerBean newFaceStickerBean, User user, String desc, Word word, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        o.LJIIIZ(desc, "desc");
        this.categoryType = i;
        this.items = list;
        this.challenge = challenge;
        this.music = music;
        this.effect = newFaceStickerBean;
        this.author = user;
        this.desc = desc;
        this.word = word;
        this.adData = trendingTopicsAdInfo;
    }

    public /* synthetic */ TrendingTopic(int i, List list, Challenge challenge, Music music, NewFaceStickerBean newFaceStickerBean, User user, String str, Word word, TrendingTopicsAdInfo trendingTopicsAdInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : challenge, (i2 & 8) != 0 ? null : music, (i2 & 16) != 0 ? null : newFaceStickerBean, (i2 & 32) != 0 ? null : user, (i2 & 64) != 0 ? "" : str, (i2 & 128) != 0 ? null : word, (i2 & 256) == 0 ? trendingTopicsAdInfo : null);
    }
}
