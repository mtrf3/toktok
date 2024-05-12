package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MaskPopWindow implements Serializable {

    @InterfaceC65349Pkn("pop_content")
    public List<MaskPopText> content;

    @InterfaceC65349Pkn("pop_title")
    public String title;

    public MaskPopWindow() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaskPopWindow copy$default(MaskPopWindow maskPopWindow, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = maskPopWindow.title;
        }
        if ((i & 2) != 0) {
            list = maskPopWindow.content;
        }
        return maskPopWindow.copy(str, list);
    }

    public final MaskPopWindow copy(String str, List<MaskPopText> list) {
        return new MaskPopWindow(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskPopWindow)) {
            return false;
        }
        MaskPopWindow maskPopWindow = (MaskPopWindow) obj;
        return o.LJ(this.title, maskPopWindow.title) && o.LJ(this.content, maskPopWindow.content);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MaskPopText> list = this.content;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaskPopWindow(title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        return C1NE.LIZIZ(LIZ, this.content, ')', LIZ);
    }

    public final List<MaskPopText> getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public MaskPopWindow(String str, List<MaskPopText> list) {
        this.title = str;
        this.content = list;
    }

    public MaskPopWindow(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
