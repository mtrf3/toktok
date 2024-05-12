package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.SLw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C71956SLw extends TBS implements InterfaceC65784Pro<String> {
    public C71956SLw(Object obj) {
        super(0, obj, C71955SLv.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        C71955SLv c71955SLv = (C71955SLv) this.receiver;
        Integer value = c71955SLv.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 0) {
                valueOf = Integer.valueOf(R.string.j9u);
            } else if (value.intValue() == 3) {
                valueOf = Integer.valueOf(R.string.j8d);
            }
            if (valueOf != null) {
                String string = c71955SLv.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
