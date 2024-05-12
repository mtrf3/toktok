package Y;

import X.ActivityC45651qj;
import X.C246479lr;
import X.C26231ARf;
import X.C53710L6c;
import X.C55773Luj;
import X.C55776Lum;
import X.C55783Lut;
import X.C78685UuP;
import X.EnumC53663L4h;
import X.EnumC55775Lul;
import X.InterfaceC53712L6e;
import X.InterfaceC55778Luo;
import X.L5U;
import X.L5V;
import X.OSZ;
import X.X1D;
import androidx.lifecycle.Observer;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import defpackage.b0;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AObserverS51S1100000_9 implements Observer {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS51S1100000_9 aObserverS51S1100000_9, Object obj) {
        L5V.LIZ((L5U) aObserverS51S1100000_9.l1, aObserverS51S1100000_9.s0, obj, EnumC53663L4h.ACTIVE, null, 24);
    }

    public static final void onChanged$1(AObserverS51S1100000_9 aObserverS51S1100000_9, Object obj) {
        String str;
        String str2;
        String str3;
        User sharer;
        OSZ osz = (OSZ) obj;
        EnumC55775Lul enumC55775Lul = (EnumC55775Lul) osz.getFirst();
        Aweme aweme = (Aweme) osz.getSecond();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("observe show info status:");
        LIZ.append(enumC55775Lul.name());
        LIZ.append(" aid:");
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", uid: ");
        if (aweme != null && (sharer = aweme.getSharer()) != null) {
            str2 = sharer.getUid();
        } else {
            str2 = null;
        }
        b0.LJFF(LIZ, str2, LIZ, "@LinkRelation_VideoDialog");
        switch (C55776Lum.LIZ[enumC55775Lul.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                InterfaceC55778Luo interfaceC55778Luo = ((C55783Lut) aObserverS51S1100000_9.l1).LJII;
                if (interfaceC55778Luo != null) {
                    interfaceC55778Luo.LIZIZ(enumC55775Lul, aweme);
                }
                SharedInviteDialogVM sharedInviteDialogVM = ((C55783Lut) aObserverS51S1100000_9.l1).LIZLLL;
                if (sharedInviteDialogVM != null) {
                    sharedInviteDialogVM.onCleared();
                    return;
                } else {
                    o.LJIJI("sharedInviteVM");
                    throw null;
                }
            case 6:
                if (aweme == null) {
                    return;
                }
                C55783Lut c55783Lut = (C55783Lut) aObserverS51S1100000_9.l1;
                String enterFromStr = aObserverS51S1100000_9.s0;
                C55773Luj c55773Luj = c55783Lut.LJFF;
                if (c55773Luj != null) {
                    str3 = c55773Luj.LJIIIZ;
                } else {
                    str3 = null;
                }
                boolean LJJJZ = C78685UuP.LJJJZ(str3);
                o.LJIIIIZZ(enterFromStr, "enterFromStr");
                c55783Lut.LJIIJJI(aweme, enterFromStr, LJJJZ);
                ActivityC45651qj activityC45651qj = c55783Lut.LIZ;
                if (activityC45651qj != null) {
                    C26231ARf c26231ARf = c55783Lut.LIZJ;
                    if (c26231ARf != null) {
                        PopupManager.LJIIL(new C246479lr(activityC45651qj, c26231ARf, new AqS159S0100000_9(c55783Lut, 757)));
                        return;
                    } else {
                        o.LJIJI("dialog");
                        throw null;
                    }
                }
                o.LJIJI("context");
                throw null;
            default:
                return;
        }
    }

    public static final void onChanged$2(AObserverS51S1100000_9 aObserverS51S1100000_9, Object obj) {
        ((InterfaceC53712L6e) aObserverS51S1100000_9.l1).LIZJ(((C53710L6c) obj).LIZ, aObserverS51S1100000_9.s0, Boolean.FALSE);
    }

    public AObserverS51S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
