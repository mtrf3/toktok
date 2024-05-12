package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS364S0100000_1;
import android.os.SystemClock;

/* renamed from: X.4nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120194nf extends AbstractC63515OwJ<String> {
    public final C116934iP LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        return true;
    }

    public C120194nf(IDcS364S0100000_1 iDcS364S0100000_1) {
        super(EnumC63625Oy5.LEAVE_CONVERSATION.getValue(), iDcS364S0100000_1);
        this.LIZJ = new C116934iP("imsdk_group_chat_leave");
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(final C63622Oy2 c63622Oy2, final ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        this.LIZJ.LIZJ = SystemClock.elapsedRealtime();
        Object[] objArr = c63622Oy2.LJLJJL;
        final String str = (String) objArr[0];
        final boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        if (c63622Oy2.LJIIJ()) {
            RunnableC63345OtZ.LJ(new InterfaceC63352Otg<Boolean>() { // from class: X.4ni
                @Override // X.InterfaceC63352Otg
                public final Boolean LIZIZ() {
                    C63133Oq9.LJFF(str);
                    return Boolean.TRUE;
                }
            }, new InterfaceC63353Oth<Boolean>() { // from class: X.4ng
                @Override // X.InterfaceC63353Oth
                public final void LIZLLL(Boolean bool) {
                    Boolean bool2 = bool;
                    if (bool2.booleanValue()) {
                        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
                        C115284fk.LJIILIIL().LJIILLIIL(LJIIIZ);
                        if (LJIIIZ != null && booleanValue) {
                            new C63435Ov1().LJIILJJIL(LJIIIZ);
                        }
                        C120194nf.this.LIZLLL(str);
                    }
                    aRunnableS29S0200000_10.run();
                    C115064fO LJII = C63337OtR.LJII(c63622Oy2, true);
                    LJII.LIZJ.put("conversation_id", str);
                    LJII.LIZ();
                    if (bool2.booleanValue()) {
                        C120194nf.this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
                        C120194nf.this.LIZJ.LIZ(true);
                    } else {
                        C120194nf.this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
                        C120194nf.this.LIZJ.LIZ(false);
                    }
                }
            }, false);
            return;
        }
        LIZIZ(c63622Oy2);
        aRunnableS29S0200000_10.run();
        C115064fO LJII = C63337OtR.LJII(c63622Oy2, false);
        LJII.LIZJ.put("conversation_id", str);
        LJII.LIZ();
        this.LIZJ.LIZLLL = SystemClock.elapsedRealtime();
        this.LIZJ.LIZ(false);
    }
}
