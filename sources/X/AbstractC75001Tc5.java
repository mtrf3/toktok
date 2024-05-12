package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.sei.SeiAppData;
import kotlin.jvm.internal.o;

/* renamed from: X.Tc5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75001Tc5 implements InterfaceC74935Tb1 {
    public final C74995Tbz LIZ;
    public final C73318Sq2 LIZIZ = new C73318Sq2();

    @Override // X.InterfaceC74935Tb1
    public void LIZIZ(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC74935Tb1
    public EnumC74949TbF LIZ() {
        this.LIZ.getClass();
        return LIZLLL(C74995Tbz.LJII());
    }

    @Override // X.InterfaceC74935Tb1
    public final boolean LIZJ() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC74935Tb1
    public final String LJFF() {
        return this.LIZ.LIZJ;
    }

    public final boolean LJI() {
        if (!TextUtils.isEmpty(this.LIZ.LIZJ)) {
            C74995Tbz c74995Tbz = this.LIZ;
            String str = c74995Tbz.LIZJ;
            if (str == null) {
                str = "";
            }
            if (!c74995Tbz.LJI(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC74935Tb1
    public void destroy() {
        this.LIZ.LIZJ();
        this.LIZIZ.dispose();
    }

    public AbstractC75001Tc5(C74995Tbz c74995Tbz) {
        this.LIZ = c74995Tbz;
    }

    @Override // X.InterfaceC74935Tb1
    public EnumC74949TbF LIZLLL(String str) {
        this.LIZ.getClass();
        if (o.LJ(str, C74995Tbz.LJII()) && o.LJ(str, this.LIZ.LIZJ)) {
            return EnumC74949TbF.CAN_ZOOM_TO_MIN;
        }
        return EnumC74949TbF.ZOOM_DISABLED;
    }
}
