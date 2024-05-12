package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class SM6 extends TBS implements InterfaceC65784Pro<String> {
    public SM6(Object obj) {
        super(0, obj, SM5.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        int i;
        SM5 sm5 = (SM5) this.receiver;
        Integer value = sm5.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                if (C78966Uyw.LJJIJL()) {
                    i = R.string.p9p;
                } else {
                    i = R.string.p9o;
                }
                valueOf = Integer.valueOf(i);
            } else if (value.intValue() == 2) {
                valueOf = Integer.valueOf(R.string.p9q);
            }
            if (valueOf != null) {
                String string = sm5.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
