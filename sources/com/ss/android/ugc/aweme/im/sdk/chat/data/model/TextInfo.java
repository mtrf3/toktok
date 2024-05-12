package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TextInfo extends F9E {
    public final List<NamedValue> infos;
    public final MessageTitle title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextInfo copy$default(TextInfo textInfo, MessageTitle messageTitle, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            messageTitle = textInfo.title;
        }
        if ((i & 2) != 0) {
            list = textInfo.infos;
        }
        return textInfo.copy(messageTitle, list);
    }

    public final TextInfo copy(MessageTitle title, List<NamedValue> infos) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(infos, "infos");
        return new TextInfo(title, infos);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.title, this.infos};
    }

    public final List<NamedValue> getInfos() {
        return this.infos;
    }

    public final MessageTitle getTitle() {
        return this.title;
    }

    public TextInfo(MessageTitle title, List<NamedValue> infos) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(infos, "infos");
        this.title = title;
        this.infos = infos;
    }
}
