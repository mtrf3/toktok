package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.SLy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C71958SLy extends TBS implements InterfaceC65784Pro<String> {
    public C71958SLy(Object obj) {
        super(0, obj, C71957SLx.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        C71957SLx c71957SLx = (C71957SLx) this.receiver;
        Integer value = c71957SLx.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                valueOf = Integer.valueOf(R.string.j9u);
            } else if (value.intValue() == 2) {
                valueOf = Integer.valueOf(R.string.j8d);
            }
            if (valueOf != null) {
                String string = c71957SLx.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
