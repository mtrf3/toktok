package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class SM8 extends TBS implements InterfaceC65784Pro<String> {
    public SM8(Object obj) {
        super(0, obj, SM7.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        int i;
        SM7 sm7 = (SM7) this.receiver;
        sm7.getClass();
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        Integer value = sm7.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                valueOf = Integer.valueOf(R.string.blo);
            } else if (value.intValue() == 3) {
                valueOf = Integer.valueOf(R.string.gkz);
            } else if (value.intValue() == 4) {
                if (LJIIZILJ) {
                    i = R.string.gnw;
                } else {
                    i = R.string.jbq;
                }
                valueOf = Integer.valueOf(i);
            } else if (value.intValue() == 5) {
                valueOf = Integer.valueOf(R.string.p9_);
            }
            if (valueOf != null) {
                String string = sm7.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}