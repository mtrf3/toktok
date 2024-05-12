package com.ss.android.ugc.aweme.editpost;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ClientText implements Serializable {

    @InterfaceC65349Pkn("markup_text")
    public String markupText;

    @InterfaceC65349Pkn("text_extra")
    public List<TextExtraStruct> textExtra;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClientText copy$default(ClientText clientText, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientText.markupText;
        }
        if ((i & 2) != 0) {
            list = clientText.textExtra;
        }
        return clientText.copy(str, list);
    }

    public final ClientText copy(String markupText, List<? extends TextExtraStruct> list) {
        o.LJIIIZ(markupText, "markupText");
        return new ClientText(markupText, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientText)) {
            return false;
        }
        ClientText clientText = (ClientText) obj;
        return o.LJ(this.markupText, clientText.markupText) && o.LJ(this.textExtra, clientText.textExtra);
    }

    public int hashCode() {
        int hashCode = this.markupText.hashCode() * 31;
        List<TextExtraStruct> list = this.textExtra;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientText(markupText=");
        LIZ.append(this.markupText);
        LIZ.append(", textExtra=");
        return C1NE.LIZIZ(LIZ, this.textExtra, ')', LIZ);
    }

    public final String getMarkupText() {
        return this.markupText;
    }

    public final List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClientText(String markupText, List<? extends TextExtraStruct> list) {
        o.LJIIIZ(markupText, "markupText");
        this.markupText = markupText;
        this.textExtra = list;
    }

    public /* synthetic */ ClientText(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
