package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public enum Q7Q implements InterfaceC66439Q5r {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);

    public final int LJLIL;

    @Override // X.InterfaceC66439Q5r
    public String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Q7Q[] valuesCustom() {
        return (Q7Q[]) Arrays.copyOf(values(), 6);
    }

    @Override // X.InterfaceC66439Q5r
    public int getMinVersion() {
        return this.LJLIL;
    }

    Q7Q(int i) {
        this.LJLIL = i;
    }
}
