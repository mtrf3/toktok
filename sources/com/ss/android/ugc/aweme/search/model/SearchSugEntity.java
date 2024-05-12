package com.ss.android.ugc.aweme.search.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class SearchSugEntity {
    public transient int LIZ;
    public final transient int LIZIZ = -1;
    public boolean LIZJ;
    public Map<String, String> LIZLLL;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("highlight_pos")
    public List<Position> hignLightPositions;

    @InterfaceC65349Pkn("word_record")
    public Word mWord;

    @InterfaceC65349Pkn("pos")
    public List<Position> position;

    @InterfaceC65349Pkn("rich_sug_sec_pos")
    public List<Position> richSugSecPosistions;

    @InterfaceC65349Pkn("extra_info")
    public SugExtraInfo sugExtraInfo;

    @InterfaceC65349Pkn("sug_type")
    public String sugType;

    public final boolean LIZ() {
        return TextUtils.equals(this.sugType, "history");
    }

    public final boolean LIZIZ() {
        SugExtraInfo sugExtraInfo = this.sugExtraInfo;
        if (sugExtraInfo == null) {
            return false;
        }
        return "2".equals(sugExtraInfo.getWordsType());
    }
}
