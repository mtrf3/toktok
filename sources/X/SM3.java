package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class SM3 extends TBS implements InterfaceC65784Pro<String> {
    public SM3(Object obj) {
        super(0, obj, SM2.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        SM2 sm2 = (SM2) this.receiver;
        Integer value = sm2.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                valueOf = Integer.valueOf(R.string.j9u);
            } else if (value.intValue() == 2) {
                valueOf = Integer.valueOf(R.string.j8d);
            }
            if (valueOf != null) {
                String string = sm2.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
