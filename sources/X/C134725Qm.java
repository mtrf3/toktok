package X;

import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;

/* renamed from: X.5Qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134725Qm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ DialogC134805Qu LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ float LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C134725Qm(DialogC134805Qu dialogC134805Qu, int i, int i2, float f) {
        super(0);
        this.LJLIL = dialogC134805Qu;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = f;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        EnumC135185Sg enumC135185Sg;
        boolean z;
        DialogC134805Qu dialogC134805Qu = this.LJLIL;
        InterfaceC134705Qk interfaceC134705Qk = dialogC134805Qu.LJLLLL;
        boolean z2 = true;
        EnumC135185Sg enumC135185Sg2 = null;
        if (interfaceC134705Qk != null) {
            boolean LIZ = dialogC134805Qu.LJLILLLLZI.LIZ();
            C5J1 V8 = this.LJLIL.LJLILLLLZI.LIZ.V8();
            if (V8 != null) {
                enumC135185Sg = V8.LJJIL();
            } else {
                enumC135185Sg = null;
            }
            if (enumC135185Sg == EnumC135185Sg.SEEKING) {
                z = true;
            } else {
                z = false;
            }
            interfaceC134705Qk.LLLLLZL(LIZ, z);
        }
        DialogC134805Qu dialogC134805Qu2 = this.LJLIL;
        InterfaceC134705Qk interfaceC134705Qk2 = dialogC134805Qu2.LJLLLLLL;
        if (interfaceC134705Qk2 != null) {
            boolean LIZ2 = dialogC134805Qu2.LJLILLLLZI.LIZ();
            C5J1 V82 = this.LJLIL.LJLILLLLZI.LIZ.V8();
            if (V82 != null) {
                enumC135185Sg2 = V82.LJJIL();
            }
            if (enumC135185Sg2 != EnumC135185Sg.SEEKING) {
                z2 = false;
            }
            interfaceC134705Qk2.LLLLLZL(LIZ2, z2);
        }
        if (this.LJLILLLLZI == 4133 && this.LJLJI == 0) {
            InterfaceC134705Qk interfaceC134705Qk3 = this.LJLIL.LJLLLL;
            if (interfaceC134705Qk3 != null) {
                interfaceC134705Qk3.LLLLLLZZ(this.LJLJJI, false);
            }
            InterfaceC134705Qk interfaceC134705Qk4 = this.LJLIL.LJLLLLLL;
            if (interfaceC134705Qk4 != null) {
                interfaceC134705Qk4.LLLLLLZZ(this.LJLJJI, false);
            }
            InterfaceC88473Ynt<? super Long, ? super java.util.Map<String, ? extends View>, ? super NLEModel, C76800UCe> interfaceC88473Ynt = this.LJLIL.LJZI;
            if (interfaceC88473Ynt != null) {
                Long valueOf = Long.valueOf(this.LJLJJI * 1000);
                DialogC134805Qu dialogC134805Qu3 = this.LJLIL;
                interfaceC88473Ynt.invoke(valueOf, dialogC134805Qu3.LJLLL, dialogC134805Qu3.LL);
            }
        }
        return C76800UCe.LIZ;
    }
}
