package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import com.bytedance.ies.bullet.service.popup.BulletPopUpFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NnO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60414NnO extends C60379Nmp implements InterfaceC60385Nmv {
    public final InterfaceC60417NnR LJLJI;

    @Override // X.InterfaceC60183Njf
    public final FrameLayout.LayoutParams LIZIZ() {
        InterfaceC60417NnR interfaceC60417NnR = this.LJLJI;
        if (interfaceC60417NnR != null) {
            interfaceC60417NnR.LIZIZ();
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC60183Njf
    public final FrameLayout.LayoutParams LIZLLL() {
        InterfaceC60417NnR interfaceC60417NnR = this.LJLJI;
        if (interfaceC60417NnR != null) {
            interfaceC60417NnR.LIZLLL();
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC60385Nmv
    public final List<BulletPopUpFragment> LJIIIZ() {
        return ORZ.LLIILII(new ArrayList(BulletPopUpFragment.LLFFF));
    }

    public C60414NnO(InterfaceC60417NnR interfaceC60417NnR) {
        this.LJLJI = interfaceC60417NnR;
    }

    @Override // X.InterfaceC60183Njf
    public final InterfaceC60207Nk3 LIZ(Context context) {
        o.LJIIJ(context, "context");
        InterfaceC60417NnR interfaceC60417NnR = this.LJLJI;
        if (interfaceC60417NnR != null) {
            return interfaceC60417NnR.LIZ(context);
        }
        return null;
    }

    @Override // X.InterfaceC60183Njf
    public final InterfaceC60189Njl LIZJ(Context context) {
        o.LJIIJ(context, "context");
        InterfaceC60417NnR interfaceC60417NnR = this.LJLJI;
        if (interfaceC60417NnR != null) {
            return interfaceC60417NnR.LIZJ(context);
        }
        return null;
    }

    @Override // X.InterfaceC60385Nmv
    public final boolean LJIIIIZZ(String containerId) {
        Object obj;
        o.LJIIJ(containerId, "containerId");
        DialogFragment LIZIZ = C60415NnP.LIZIZ(containerId);
        if (LIZIZ == null) {
            Iterator it = ((ArrayList) BulletPopUpFragment.LLFII).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((BulletPopUpFragment) obj).wl(), containerId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LIZIZ = (DialogFragment) obj;
            if (LIZIZ == null) {
                return false;
            }
        }
        LIZIZ.dismissAllowingStateLoss();
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:8|(1:185)|12|(4:14|(2:(0)(1:167)|18)|168|18)(69:169|(2:171|(4:173|(2:175|(1:179))(1:181)|177|178)(4:182|(2:184|178)|177|178))|166|21|(1:23)(1:165)|24|(1:164)|26|(1:163)|28|(1:30)(1:162)|31|(1:33)(1:161)|34|(1:36)(1:160)|37|(1:39)(1:159)|40|(1:42)(1:158)|43|(1:45)(1:157)|46|(1:48)(1:156)|49|(1:51)(1:155)|52|(1:54)(1:154)|55|(1:57)(1:153)|58|(1:60)(1:152)|61|(1:63)(1:151)|64|(1:66)(1:150)|67|(1:149)(1:71)|(1:75)|76|(1:78)|79|(1:(27:148|82|(1:84)(20:(1:(1:144)(1:143))|(1:87)|(1:89)|(3:(1:(2:137|(1:95))(1:136))|(1:93)|(0))(1:138)|96|(1:132)|(1:101)|102|(1:104)(1:131)|105|(3:127|(1:129)|130)|109|(1:111)(1:126)|(1:113)(1:125)|(1:115)|116|117|118|119|120)|85|(0)|(0)|(0)(0)|96|(1:98)|132|(0)|102|(0)(0)|105|(1:107)|127|(0)|130|109|(0)(0)|(0)(0)|(0)|116|117|118|119|120)(1:147))|81|82|(0)(0)|85|(0)|(0)|(0)(0)|96|(0)|132|(0)|102|(0)(0)|105|(0)|127|(0)|130|109|(0)(0)|(0)(0)|(0)|116|117|118|119|120)|(68:20|21|(0)(0)|24|(0)|26|(0)|28|(0)(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|40|(0)(0)|43|(0)(0)|46|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(1:69)|149|(2:73|75)|76|(0)|79|(0)|81|82|(0)(0)|85|(0)|(0)|(0)(0)|96|(0)|132|(0)|102|(0)(0)|105|(0)|127|(0)|130|109|(0)(0)|(0)(0)|(0)|116|117|118|119|120)|166|21|(0)(0)|24|(0)|26|(0)|28|(0)(0)|31|(0)(0)|34|(0)(0)|37|(0)(0)|40|(0)(0)|43|(0)(0)|46|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)|149|(0)|76|(0)|79|(0)|81|82|(0)(0)|85|(0)|(0)|(0)(0)|96|(0)|132|(0)|102|(0)(0)|105|(0)|127|(0)|130|109|(0)(0)|(0)(0)|(0)|116|117|118|119|120) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0386, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0387, code lost:
    
        r0 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        if (r2 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0350, code lost:
    
        if (r4.equals("right") == false) goto L170;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    @Override // X.InterfaceC60183Njf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJ(android.content.Context r52, android.net.Uri r53, X.C60445Nnt r54) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60414NnO.LJIJ(android.content.Context, android.net.Uri, X.Nnt):boolean");
    }
}
