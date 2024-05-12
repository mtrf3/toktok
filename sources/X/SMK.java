package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class SMK extends TBS implements InterfaceC65784Pro<String> {
    public SMK(Object obj) {
        super(0, obj, SMJ.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer value;
        Integer valueOf;
        SMJ smj = (SMJ) this.receiver;
        smj.getClass();
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII() && (value = smj.LJLLILLLL.LJLJI.getValue()) != null) {
            if (value.intValue() == 1) {
                valueOf = Integer.valueOf(R.string.blo);
            } else if (value.intValue() == 4) {
                valueOf = Integer.valueOf(R.string.eoq);
            } else if (value.intValue() == 2) {
                valueOf = Integer.valueOf(R.string.elf);
            } else if (value.intValue() == 3) {
                valueOf = Integer.valueOf(R.string.p9_);
            }
            if (valueOf != null) {
                String string = smj.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
