package com.ss.android.ugc.aweme.topic.search.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SugStruct {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("highlight_pos")
    public final List<Position> highlights;

    @InterfaceC65349Pkn("topic_info")
    public final TopicRawInfo topicInfo;

    @InterfaceC65349Pkn("word_record")
    public final Word word;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SugStruct)) {
            return false;
        }
        SugStruct sugStruct = (SugStruct) obj;
        return o.LJ(this.topicInfo, sugStruct.topicInfo) && o.LJ(this.content, sugStruct.content) && o.LJ(this.word, sugStruct.word) && o.LJ(this.highlights, sugStruct.highlights);
    }

    public final int hashCode() {
        TopicRawInfo topicRawInfo = this.topicInfo;
        int hashCode = (topicRawInfo == null ? 0 : topicRawInfo.hashCode()) * 31;
        String str = this.content;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Word word = this.word;
        int hashCode3 = (hashCode2 + (word == null ? 0 : word.hashCode())) * 31;
        List<Position> list = this.highlights;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SugStruct(topicInfo=");
        LIZ.append(this.topicInfo);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", word=");
        LIZ.append(this.word);
        LIZ.append(", highlights=");
        return C1NE.LIZIZ(LIZ, this.highlights, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SugStruct(TopicRawInfo topicRawInfo, String str, Word word, List<? extends Position> list) {
        this.topicInfo = topicRawInfo;
        this.content = str;
        this.word = word;
        this.highlights = list;
    }
}
