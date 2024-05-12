package com.ss.android.ugc.aweme.specact.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NowShareModel$TextItem {

    @InterfaceC65349Pkn("arg_list")
    public final List<String> argList;

    @InterfaceC65349Pkn("starling_key")
    public final String starlingKey;

    @InterfaceC65349Pkn("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowShareModel$TextItem)) {
            return false;
        }
        NowShareModel$TextItem nowShareModel$TextItem = (NowShareModel$TextItem) obj;
        return o.LJ(this.text, nowShareModel$TextItem.text) && o.LJ(this.starlingKey, nowShareModel$TextItem.starlingKey) && o.LJ(this.argList, nowShareModel$TextItem.argList);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.starlingKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.argList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextItem(text=");
        LIZ.append(this.text);
        LIZ.append(", starlingKey=");
        LIZ.append(this.starlingKey);
        LIZ.append(", argList=");
        return C1NE.LIZIZ(LIZ, this.argList, ')', LIZ);
    }

    public NowShareModel$TextItem(String str, String str2, List<String> list) {
        this.text = str;
        this.starlingKey = str2;
        this.argList = list;
    }
}
