package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class SMF extends TBS implements InterfaceC65784Pro<String> {
    public SMF(Object obj) {
        super(0, obj, SMG.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        int i;
        int i2;
        SMG smg = (SMG) this.receiver;
        if (!smg.LJLLJ) {
            C71909SKb.LIZ.getClass();
            C71909SKb.LIZJ().LIZ();
            boolean LJIIZILJ = C72028SOq.LJIIZILJ();
            Integer value = smg.LJLLILLLL.LJLJI.getValue();
            if (value != null) {
                if (value.intValue() == 0) {
                    if (C78966Uyw.LJJIJL()) {
                        i2 = R.string.jdc;
                    } else {
                        i2 = R.string.blo;
                    }
                    valueOf = Integer.valueOf(i2);
                } else if (value.intValue() == 1) {
                    if (LJIIZILJ) {
                        i = R.string.gnw;
                    } else {
                        i = R.string.jbq;
                    }
                    valueOf = Integer.valueOf(i);
                } else if (value.intValue() == 3) {
                    valueOf = Integer.valueOf(R.string.p9_);
                }
                if (valueOf != null) {
                    String string = smg.LJLIL.getString(valueOf.intValue());
                    if (string != null) {
                        return string;
                    }
                }
            }
        }
        return "";
    }
}
