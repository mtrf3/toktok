package com.ss.android.ugc.aweme.search.pages.result.bot.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class TakoInfo implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("aweme_list")
    public List<? extends Aweme> awemeList;

    @InterfaceC65349Pkn("chat_sug_key")
    public final String chatSugKey;

    @InterfaceC65349Pkn("loading")
    public final Boolean loading;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("message_key")
    public final String messageKey;

    @InterfaceC65349Pkn("sug_list")
    public List<String> sugList;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getChatSugKey() {
        return this.chatSugKey;
    }

    public final Boolean getLoading() {
        return this.loading;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageKey() {
        return this.messageKey;
    }

    public final List<String> getSugList() {
        return this.sugList;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setSugList(List<String> list) {
        this.sugList = list;
    }

    public TakoInfo(Boolean bool, String str, String str2, String str3, List<? extends Aweme> list, List<String> list2) {
        this.loading = bool;
        this.messageKey = str;
        this.chatSugKey = str2;
        this.message = str3;
        this.awemeList = list;
        this.sugList = list2;
    }

    public /* synthetic */ TakoInfo(Boolean bool, String str, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : list, (i & 32) == 0 ? list2 : null);
    }
}
