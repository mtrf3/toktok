package com.ss.android.ugc.aweme.contentlanguage;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContentLangDialogContent extends F9E {

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentLangDialogContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContentLangDialogContent copy$default(ContentLangDialogContent contentLangDialogContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentLangDialogContent.title;
        }
        if ((i & 2) != 0) {
            str2 = contentLangDialogContent.text;
        }
        return contentLangDialogContent.copy(str, str2);
    }

    public final ContentLangDialogContent copy(String title, String text) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(text, "text");
        return new ContentLangDialogContent(title, text);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.title, this.text};
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public ContentLangDialogContent(String title, String text) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(text, "text");
        this.title = title;
        this.text = text;
    }

    public /* synthetic */ ContentLangDialogContent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
