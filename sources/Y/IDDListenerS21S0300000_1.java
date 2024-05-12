package Y;

import X.ASQ;
import X.AST;
import X.AbstractC101843zA;
import X.C101463yY;
import X.C101473yZ;
import X.C101813z7;
import X.C101863zC;
import X.C101873zD;
import X.C162476Zf;
import X.C32151Nz;
import X.C76800UCe;
import X.C97903so;
import X.EnumC101413yT;
import X.EnumC101483ya;
import X.EnumC101803z6;
import X.InterfaceC101673yt;
import X.InterfaceC101853zB;
import X.InterfaceC65784Pro;
import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDDListenerS21S0300000_1 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public static final void onDismiss$0(IDDListenerS21S0300000_1 iDDListenerS21S0300000_1, DialogInterface dialogInterface) {
        if (dialogInterface == null) {
            return;
        }
        AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
        if (LJIIIIZZ instanceof C101463yY) {
            ((InterfaceC65784Pro) iDDListenerS21S0300000_1.l0).invoke();
            C32151Nz.LJJIJIIJIL(((C101463yY) LJIIIIZZ).LIZ);
        } else {
            ((InterfaceC65784Pro) iDDListenerS21S0300000_1.l0).invoke();
            if (((EnumC101413yT) iDDListenerS21S0300000_1.l1) == EnumC101413yT.O18) {
                C32151Nz.LJJIJIIJIL(true);
            } else {
                C32151Nz.LJJIJIIJIL(false);
            }
        }
        ((C101473yZ) iDDListenerS21S0300000_1.l2).LIZ();
    }

    public static final void onDismiss$1(IDDListenerS21S0300000_1 iDDListenerS21S0300000_1, DialogInterface dialogInterface) {
        InterfaceC101853zB interfaceC101853zB;
        if (dialogInterface == null) {
            return;
        }
        AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
        int i = C101813z7.LIZ[((EnumC101803z6) iDDListenerS21S0300000_1.l0).ordinal()];
        if (i != 1) {
            if (i == 2) {
                InterfaceC101853zB.LIZ.getClass();
                interfaceC101853zB = new InterfaceC101853zB() { // from class: X.3yl
                    @Override // X.InterfaceC101853zB
                    public final void LIZIZ() {
                        C101573yj.LIZIZ(C101573yj.LIZ, 1, null, null, EnumC101583yk.DM_SETTINGS_BOTTOM_SHEET, 44);
                    }

                    @Override // X.InterfaceC101853zB
                    public final void LJIILIIL() {
                        C101573yj.LIZIZ(C101573yj.LIZ, 2, null, null, EnumC101583yk.DM_SETTINGS_BOTTOM_SHEET, 44);
                    }

                    @Override // X.InterfaceC101853zB
                    public final void LIZ(EnumC101483ya preselectedPermission, EnumC101483ya selectedPermission) {
                        o.LJIIIZ(preselectedPermission, "preselectedPermission");
                        o.LJIIIZ(selectedPermission, "selectedPermission");
                        C101573yj c101573yj = C101573yj.LIZ;
                        Integer valueOf = Integer.valueOf(selectedPermission.getEventTrackingConstant());
                        Integer valueOf2 = Integer.valueOf(selectedPermission.getEventTrackingConstant() - preselectedPermission.getEventTrackingConstant());
                        EnumC101583yk enumC101583yk = EnumC101583yk.DM_SETTINGS_BOTTOM_SHEET;
                        C101573yj.LIZIZ(c101573yj, 0, valueOf, valueOf2, enumC101583yk, 32);
                        C101573yj.LIZ(c101573yj, "notification_page", selectedPermission.getOption(), enumC101583yk, "dm_permissions_panel", 16);
                    }
                };
            } else {
                throw new C162476Zf();
            }
        } else {
            InterfaceC101853zB.LIZ.getClass();
            interfaceC101853zB = new InterfaceC101853zB() { // from class: X.3yr
                @Override // X.InterfaceC101853zB
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC101853zB
                public final void LJIILIIL() {
                }

                @Override // X.InterfaceC101853zB
                public final void LIZ(EnumC101483ya preselectedPermission, EnumC101483ya selectedPermission) {
                    o.LJIIIZ(preselectedPermission, "preselectedPermission");
                    o.LJIIIZ(selectedPermission, "selectedPermission");
                    C101573yj.LIZ(C101573yj.LIZ, "open_dm_permission_panel", selectedPermission.getOption(), EnumC101583yk.DM_SETTINGS_BOTTOM_SHEET, null, 24);
                }
            };
        }
        if (LJIIIIZZ instanceof C101863zC) {
            InterfaceC101673yt interfaceC101673yt = (InterfaceC101673yt) iDDListenerS21S0300000_1.l1;
            if (interfaceC101673yt != null) {
                interfaceC101673yt.LIZ(((C101863zC) LJIIIIZZ).LIZ);
            }
            AbstractC101843zA abstractC101843zA = ((C101863zC) LJIIIIZZ).LIZ;
            if (abstractC101843zA instanceof C97903so) {
                interfaceC101853zB.LIZ((EnumC101483ya) iDDListenerS21S0300000_1.l2, ((C97903so) abstractC101843zA).LIZ);
                return;
            } else if (o.LJ(abstractC101843zA, C101873zD.LIZ)) {
                interfaceC101853zB.LJIILIIL();
                return;
            } else {
                if (!o.LJ(abstractC101843zA, new AbstractC101843zA() { // from class: X.3zE
                })) {
                    return;
                }
                interfaceC101853zB.LIZIZ();
                return;
            }
        }
        InterfaceC101673yt interfaceC101673yt2 = (InterfaceC101673yt) iDDListenerS21S0300000_1.l1;
        if (interfaceC101673yt2 != null) {
            interfaceC101673yt2.LIZ(new AbstractC101843zA() { // from class: X.3zE
            });
        }
        interfaceC101853zB.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDDListenerS21S0300000_1(Object obj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, EnumC101413yT enumC101413yT, C101473yZ c101473yZ) {
        this.$t = c101473yZ;
        this.l0 = obj;
        this.l1 = interfaceC65784Pro;
        this.l2 = enumC101413yT;
    }
}
