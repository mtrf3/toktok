package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AGSWarningPopupWindow implements Serializable {

    @InterfaceC65349Pkn("button")
    public final AGSWarningPopupButton button;

    @InterfaceC65349Pkn("pop_content")
    public final TextWithInlineLink content;

    @InterfaceC65349Pkn("pop_title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public AGSWarningPopupWindow() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AGSWarningPopupWindow copy$default(AGSWarningPopupWindow aGSWarningPopupWindow, String str, TextWithInlineLink textWithInlineLink, AGSWarningPopupButton aGSWarningPopupButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aGSWarningPopupWindow.title;
        }
        if ((i & 2) != 0) {
            textWithInlineLink = aGSWarningPopupWindow.content;
        }
        if ((i & 4) != 0) {
            aGSWarningPopupButton = aGSWarningPopupWindow.button;
        }
        return aGSWarningPopupWindow.copy(str, textWithInlineLink, aGSWarningPopupButton);
    }

    public final AGSWarningPopupWindow copy(String title, TextWithInlineLink textWithInlineLink, AGSWarningPopupButton aGSWarningPopupButton) {
        o.LJIIIZ(title, "title");
        return new AGSWarningPopupWindow(title, textWithInlineLink, aGSWarningPopupButton);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGSWarningPopupWindow)) {
            return false;
        }
        AGSWarningPopupWindow aGSWarningPopupWindow = (AGSWarningPopupWindow) obj;
        return o.LJ(this.title, aGSWarningPopupWindow.title) && o.LJ(this.content, aGSWarningPopupWindow.content) && o.LJ(this.button, aGSWarningPopupWindow.button);
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextWithInlineLink textWithInlineLink = this.content;
        int hashCode2 = (hashCode + (textWithInlineLink == null ? 0 : textWithInlineLink.hashCode())) * 31;
        AGSWarningPopupButton aGSWarningPopupButton = this.button;
        return hashCode2 + (aGSWarningPopupButton != null ? aGSWarningPopupButton.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AGSWarningPopupWindow(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", button=");
        LIZ.append(this.button);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AGSWarningPopupButton getButton() {
        return this.button;
    }

    public final TextWithInlineLink getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public AGSWarningPopupWindow(String title, TextWithInlineLink textWithInlineLink, AGSWarningPopupButton aGSWarningPopupButton) {
        o.LJIIIZ(title, "title");
        this.title = title;
        this.content = textWithInlineLink;
        this.button = aGSWarningPopupButton;
    }

    public /* synthetic */ AGSWarningPopupWindow(String str, TextWithInlineLink textWithInlineLink, AGSWarningPopupButton aGSWarningPopupButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : textWithInlineLink, (i & 4) != 0 ? null : aGSWarningPopupButton);
    }
}
