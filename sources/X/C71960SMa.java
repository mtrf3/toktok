package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.SMa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C71960SMa extends TBS implements InterfaceC65784Pro<String> {
    public C71960SMa(Object obj) {
        super(0, obj, C71961SMb.class, "getRightLabel", "getRightLabel()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer valueOf;
        int i;
        C71961SMb c71961SMb = (C71961SMb) this.receiver;
        c71961SMb.getClass();
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        boolean LJIIZILJ = C72028SOq.LJIIZILJ();
        Integer value = c71961SMb.LJLLILLLL.LJLJI.getValue();
        if (value != null) {
            if (value.intValue() == 1) {
                if (LJIIZILJ) {
                    i = R.string.gnw;
                } else {
                    i = R.string.jbq;
                }
                valueOf = Integer.valueOf(i);
            } else if (value.intValue() == 2) {
                valueOf = Integer.valueOf(R.string.p9_);
            }
            if (valueOf != null) {
                String string = c71961SMb.LJLIL.getString(valueOf.intValue());
                if (string != null) {
                    return string;
                }
            }
        }
        return "";
    }
}
