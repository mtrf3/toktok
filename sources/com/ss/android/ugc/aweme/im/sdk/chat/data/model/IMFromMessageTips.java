package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMFromMessageTips {

    @InterfaceC65349Pkn("template")
    public List<IMActionTemplate> template;

    @InterfaceC65349Pkn("tips")
    public String tips;

    /* JADX WARN: Multi-variable type inference failed */
    public IMFromMessageTips() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IMFromMessageTips copy$default(IMFromMessageTips iMFromMessageTips, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iMFromMessageTips.tips;
        }
        if ((i & 2) != 0) {
            list = iMFromMessageTips.template;
        }
        return iMFromMessageTips.copy(str, list);
    }

    public final IMFromMessageTips copy(String str, List<IMActionTemplate> list) {
        return new IMFromMessageTips(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMFromMessageTips)) {
            return false;
        }
        IMFromMessageTips iMFromMessageTips = (IMFromMessageTips) obj;
        return o.LJ(this.tips, iMFromMessageTips.tips) && o.LJ(this.template, iMFromMessageTips.template);
    }

    public int hashCode() {
        String str = this.tips;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<IMActionTemplate> list = this.template;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMFromMessageTips(tips=");
        LIZ.append(this.tips);
        LIZ.append(", template=");
        return C1NE.LIZIZ(LIZ, this.template, ')', LIZ);
    }

    public final List<IMActionTemplate> getTemplate() {
        return this.template;
    }

    public final String getTips() {
        return this.tips;
    }

    public final void setTemplate(List<IMActionTemplate> list) {
        this.template = list;
    }

    public final void setTips(String str) {
        this.tips = str;
    }

    public IMFromMessageTips(String str, List<IMActionTemplate> list) {
        this.tips = str;
        this.template = list;
    }

    public /* synthetic */ IMFromMessageTips(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
