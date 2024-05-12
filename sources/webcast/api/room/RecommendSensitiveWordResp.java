package webcast.api.room;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class RecommendSensitiveWordResp {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes6.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("prompt")
        public CommentFlaggedPrompt prompt;

        @InterfaceC65349Pkn("word_list")
        public List<String> wordList = new ArrayList();
    }
}
