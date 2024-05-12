package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class XEU {
    public String panel;

    /* JADX WARN: Multi-variable type inference failed */
    public XEU() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public String getPanel() {
        return this.panel;
    }

    public XEU(String str) {
        this.panel = str;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public /* synthetic */ XEU(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
