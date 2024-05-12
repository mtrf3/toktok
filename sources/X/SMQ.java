package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class SMQ extends TBS implements InterfaceC65784Pro<String> {
    public SMQ(Object obj) {
        super(0, obj, SMR.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        int i;
        int i2;
        SMR smr = (SMR) this.receiver;
        Integer value = smr.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                if (C78966Uyw.LJJIJL()) {
                    i2 = R.string.jdc;
                } else {
                    i2 = R.string.blo;
                }
                valueOf = Integer.valueOf(i2);
            } else if (value.intValue() == 4) {
                C71909SKb.LIZ.getClass();
                C71909SKb.LIZJ().LIZ();
                if (C72028SOq.LJIIZILJ()) {
                    i = R.string.gnw;
                } else {
                    i = R.string.jbq;
                }
                valueOf = Integer.valueOf(i);
            } else if (value.intValue() == 5) {
                valueOf = Integer.valueOf(R.string.jdf);
            }
            if (valueOf != null) {
                String string = smr.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
