package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class SMM extends TBS implements InterfaceC65784Pro<String> {
    public SMM(Object obj) {
        super(0, obj, SMN.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        int i;
        SMN smn = (SMN) this.receiver;
        smn.getClass();
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        Integer value = smn.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                valueOf = Integer.valueOf(R.string.blo);
            } else if (value.intValue() == 4) {
                valueOf = Integer.valueOf(R.string.eoq);
            } else if (value.intValue() == 2) {
                C71909SKb.LIZJ().LIZ();
                if (C72028SOq.LJII()) {
                    i = R.string.elf;
                } else if (LJIIZILJ) {
                    i = R.string.gnx;
                } else {
                    i = R.string.jbq;
                }
                valueOf = Integer.valueOf(i);
            } else if (value.intValue() == 3) {
                valueOf = Integer.valueOf(R.string.p9_);
            }
            if (valueOf != null) {
                String string = smn.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
