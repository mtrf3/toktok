package Y;

import X.AbstractC75942TrG;
import X.B5G;
import X.C2A7;
import X.C34K;
import X.C68322mC;
import X.C75947TrL;
import X.C75948TrM;
import X.C75957TrV;
import X.C77443UaN;
import X.InterfaceC77442UaM;
import X.UHX;
import android.widget.CompoundButton;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchMateQuitRequestFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDCListenerS209S0100000_13 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                return;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                return;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                return;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                return;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                return;
            case 9:
                onCheckedChanged$9(this, compoundButton, z);
                return;
            case 10:
                onCheckedChanged$10(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS209S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((InteractDisconnectDialog) iDCListenerS209S0100000_13.l0).LJLJL = z ? 1 : 0;
        B5G.LIZIZ();
        InteractDisconnectDialog interactDisconnectDialog = (InteractDisconnectDialog) iDCListenerS209S0100000_13.l0;
        if (z) {
            interactDisconnectDialog._$_findCachedViewById(R.id.gyj).setVisibility(8);
            interactDisconnectDialog._$_findCachedViewById(R.id.k8n).setVisibility(8);
        } else {
            interactDisconnectDialog._$_findCachedViewById(R.id.gyj).setVisibility(0);
            interactDisconnectDialog._$_findCachedViewById(R.id.k8n).setVisibility(0);
        }
    }

    public static final void onCheckedChanged$1(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((C34K) iDCListenerS209S0100000_13.l0).element = z;
    }

    public static final void onCheckedChanged$10(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((C75957TrV) iDCListenerS209S0100000_13.l0).LIZ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$2(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((C34K) iDCListenerS209S0100000_13.l0).element = z;
    }

    public static final void onCheckedChanged$3(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        AbstractC75942TrG abstractC75942TrG;
        MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = (MultiCoHostBeInvitedFragment) iDCListenerS209S0100000_13.l0;
        int i = multiCoHostBeInvitedFragment.LJLLL;
        if (i != 1) {
            if (i == 2 && (abstractC75942TrG = (AbstractC75942TrG) multiCoHostBeInvitedFragment.LJLILLLLZI) != null) {
                abstractC75942TrG.LJIIIZ(z);
            }
        } else {
            AbstractC75942TrG abstractC75942TrG2 = (AbstractC75942TrG) multiCoHostBeInvitedFragment.LJLILLLLZI;
            if (abstractC75942TrG2 != null) {
                abstractC75942TrG2.LJIIJ(z);
            }
        }
        if (z) {
            Object value = ((MultiCoHostBeInvitedFragment) iDCListenerS209S0100000_13.l0).LJLJLLL.getValue();
            o.LJIIIIZZ(value, "<get-mAcceptButton>(...)");
            ((C2A7) value).LJJLL(R.style.a2y);
        } else {
            Object value2 = ((MultiCoHostBeInvitedFragment) iDCListenerS209S0100000_13.l0).LJLJLLL.getValue();
            o.LJIIIIZZ(value2, "<get-mAcceptButton>(...)");
            ((C2A7) value2).LJJLL(R.style.a2z);
        }
    }

    public static final void onCheckedChanged$4(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        if (z) {
            C2A7 c2a7 = ((MultiMatchMateQuitRequestFragment) iDCListenerS209S0100000_13.l0).LJLL;
            if (c2a7 == null) {
                return;
            }
            c2a7.setVisibility(8);
            return;
        }
        C2A7 c2a72 = ((MultiMatchMateQuitRequestFragment) iDCListenerS209S0100000_13.l0).LJLL;
        if (c2a72 == null) {
            return;
        }
        c2a72.setVisibility(0);
    }

    public static final void onCheckedChanged$5(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((C75947TrL) iDCListenerS209S0100000_13.l0).LIZ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$6(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((C75948TrM) iDCListenerS209S0100000_13.l0).LIZ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$7(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((UHX) iDCListenerS209S0100000_13.l0).LIZJ().LJLILLLLZI = z;
    }

    public static final void onCheckedChanged$8(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        InterfaceC77442UaM interfaceC77442UaM = (InterfaceC77442UaM) iDCListenerS209S0100000_13.l0;
        if (interfaceC77442UaM != null) {
            ((C77443UaN) interfaceC77442UaM).LIZ = !z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
    public static final void onCheckedChanged$9(IDCListenerS209S0100000_13 iDCListenerS209S0100000_13, CompoundButton compoundButton, boolean z) {
        ((C68322mC) iDCListenerS209S0100000_13.l0).element = Boolean.valueOf(z);
    }
}
