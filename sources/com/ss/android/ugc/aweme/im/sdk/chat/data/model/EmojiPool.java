package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C0M6;
import X.C32I;
import X.C61878OQg;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EmojiPool {
    public static final EmojiPool INSTANCE = new EmojiPool();
    public static final C0M6<Long, Emoji> cache = new C0M6<>(100);

    public final List<Emoji> getFromPool(List<? extends Emoji> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (Emoji emoji : list) {
                C0M6<Long, Emoji> c0m6 = cache;
                Emoji LIZIZ = c0m6.LIZIZ(Long.valueOf(emoji.getId()));
                if (LIZIZ == null) {
                    c0m6.LIZJ(Long.valueOf(emoji.getId()), emoji);
                }
                if (o.LJ(LIZIZ, emoji)) {
                    emoji = LIZIZ;
                }
                arrayList.add(emoji);
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }
}
