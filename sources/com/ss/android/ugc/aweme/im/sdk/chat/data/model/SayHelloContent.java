package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C1NE;
import X.C32I;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.Q8U;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SayHelloContent extends BaseContent {
    public final List<Emoji> actualEmoji;

    @InterfaceC65349Pkn("hello_text")
    public final String helloText;
    public final boolean isNewStyle;

    @InterfaceC65349Pkn("joker_stickers")
    public List<? extends Emoji> jockerStickers;

    @InterfaceC65349Pkn("nickname")
    public final String nickname;

    @InterfaceC65349Pkn("stickers")
    public List<? extends Emoji> stickers;

    /* JADX WARN: Multi-variable type inference failed */
    public SayHelloContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    private final List<Emoji> component3() {
        return this.jockerStickers;
    }

    private final List<Emoji> component4() {
        return this.stickers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SayHelloContent copy$default(SayHelloContent sayHelloContent, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sayHelloContent.nickname;
        }
        if ((i & 2) != 0) {
            str2 = sayHelloContent.helloText;
        }
        if ((i & 4) != 0) {
            list = sayHelloContent.jockerStickers;
        }
        if ((i & 8) != 0) {
            list2 = sayHelloContent.stickers;
        }
        return sayHelloContent.copy(str, str2, list, list2);
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component2() {
        return this.helloText;
    }

    public final SayHelloContent copy(String str, String str2, List<? extends Emoji> list, List<? extends Emoji> list2) {
        return new SayHelloContent(str, str2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SayHelloContent)) {
            return false;
        }
        SayHelloContent sayHelloContent = (SayHelloContent) obj;
        return o.LJ(this.nickname, sayHelloContent.nickname) && o.LJ(this.helloText, sayHelloContent.helloText) && o.LJ(this.jockerStickers, sayHelloContent.jockerStickers) && o.LJ(this.stickers, sayHelloContent.stickers);
    }

    public int hashCode() {
        String str = this.nickname;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.helloText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<? extends Emoji> list = this.jockerStickers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends Emoji> list2 = this.stickers;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.PreloadFetcher
    public List<UrlModel> fetchPreload() {
        List<Emoji> list = this.actualEmoji;
        ArrayList arrayList = new ArrayList();
        for (Emoji emoji : list) {
            if (emoji.getAnimateUrl() != null) {
                arrayList.add(emoji);
            }
        }
        List LLILLL = ORZ.LLILLL(arrayList, 3);
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLILLL, 10));
        Iterator it = LLILLL.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Emoji) it.next()).getAnimateUrl());
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getString(R.string.h8t);
        o.LJIIIIZZ(string, "context.getString(R.stri…ay_hello_tips_to_someone)");
        return Q8U.LIZIZ(new Object[]{this.nickname}, 1, string, "format(format, *args)");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SayHelloContent(nickname=");
        LIZ.append(this.nickname);
        LIZ.append(", helloText=");
        LIZ.append(this.helloText);
        LIZ.append(", jockerStickers=");
        LIZ.append(this.jockerStickers);
        LIZ.append(", stickers=");
        return C1NE.LIZIZ(LIZ, this.stickers, ')', LIZ);
    }

    public final List<Emoji> getEmojiList() {
        return this.actualEmoji;
    }

    public final boolean isNewStyle() {
        return this.isNewStyle;
    }

    public SayHelloContent(String str, String str2, List<? extends Emoji> list, List<? extends Emoji> list2) {
        boolean z;
        boolean z2;
        List<? extends Emoji> list3;
        this.nickname = str;
        this.helloText = str2;
        this.jockerStickers = list;
        this.stickers = list2;
        boolean z3 = false;
        if (list2 != null && (!list2.isEmpty()) && list2.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        List<? extends Emoji> list4 = this.jockerStickers;
        if (list4 == null || list4.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = !z2;
        if (!z && z4) {
            z3 = true;
        }
        this.isNewStyle = z3;
        EmojiPool emojiPool = EmojiPool.INSTANCE;
        if (z3) {
            list3 = this.jockerStickers;
        } else {
            list3 = this.stickers;
        }
        this.actualEmoji = emojiPool.getFromPool(list3);
        this.stickers = null;
        this.jockerStickers = null;
    }

    public /* synthetic */ SayHelloContent(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
