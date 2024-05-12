package X;

import Y.ARunnableS27S0200000_8;
import Y.ARunnableS5S0200100_8;
import android.app.Application;
import android.os.SystemClock;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T2J implements InterfaceC48038ItG, InterfaceC32416Cns, InterfaceC78991UzL, InterfaceC75414Tik, InterfaceC73592SuS, InterfaceC131945Fu, InterfaceC44697HgT {
    public static final T2J LJLIL = new T2J();
    public static final T2J LJLILLLLZI = new T2J();
    public static final T2J LJLJI = new T2J();

    @Override // X.InterfaceC32416Cns
    public void LIZIZ() {
    }

    @Override // X.InterfaceC78991UzL
    public void LIZJ() {
    }

    @Override // X.InterfaceC75414Tik
    public void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC78991UzL
    public void LJFF() {
    }

    @Override // X.InterfaceC78991UzL
    public void LJI() {
    }

    @Override // X.InterfaceC78991UzL
    public void onSuccess() {
    }

    @Override // X.InterfaceC44697HgT
    public Application getApplication() {
        return C82891Wg3.LIZ();
    }

    public /* synthetic */ T2J() {
    }

    public /* synthetic */ T2J(int i) {
        if (i != 1) {
            new WeakHashMap();
        }
    }

    @Override // X.InterfaceC32416Cns
    public void LIZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResult# onCancel=");
        LIZ.append(j);
        C0NB.LIZIZ("preloadGiftEffect", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        C106844Hg.LIZIZ("local", it, null);
        return it;
    }

    @Override // X.InterfaceC131945Fu
    public void d(String msg) {
        o.LJIIIZ(msg, "msg");
        H7C.LIZ(C5HU.LIZIZ, msg);
    }

    @Override // X.InterfaceC131945Fu
    public void i(String msg) {
        o.LJIIIZ(msg, "msg");
        H7C.LJFF(C5HU.LIZIZ, msg);
    }

    @Override // X.InterfaceC32416Cns
    public void onFailed(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResult# onFailed=");
        LIZ.append(th);
        C0NB.LIZIZ("preloadGiftEffect", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC75414Tik
    public void onSuccess(Object value) {
        o.LJIIIZ(value, "value");
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        List it = (List) obj;
        o.LJIIJ(it, "it");
        if (it.size() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC131945Fu
    public void w(String msg) {
        o.LJIIIZ(msg, "msg");
        H7C.LJII(C5HU.LIZIZ, msg);
    }

    public static final void LJII(C77557UcD c77557UcD, boolean z) {
        C29306Beo.LJI(c77557UcD);
        if (z) {
            C0RN.LIZLLL("hideComboView ", z, "GiftPanelCombo");
            if (c77557UcD != null) {
                c77557UcD.LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC32416Cns
    public void LIZLLL(long j, String path) {
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResult# resourceId=");
        LIZ.append(j);
        LIZ.append(", path=");
        LIZ.append(path);
        C0NB.LIZIZ("preloadGiftEffect", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC131945Fu
    public void e(String str, Throwable th) {
        H7C.LIZJ(C5HU.LIZIZ, "", str, th);
    }

    public static final void LJIIIIZZ(C77557UcD c77557UcD, long j, float f, float f2, int i, boolean z, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65784Pro interfaceC65784Pro) {
        int i2;
        float dimensionPixelSize;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showComboViewStub ");
        if (c77557UcD != null) {
            i2 = c77557UcD.getComboCount();
        } else {
            i2 = 0;
        }
        LIZ.append(i2);
        LIZ.append(' ');
        LIZ.append(j);
        LIZ.append(' ');
        LIZ.append(f);
        LIZ.append(' ');
        LIZ.append(f2);
        LIZ.append(' ');
        LIZ.append(i);
        C0NB.LJIIIZ("GiftPanelCombo", X1D.LIZIZ(LIZ));
        if (c77557UcD != null) {
            if (c77557UcD.getVisibility() == 8) {
                o.LJIIIZ(c77557UcD, "<this>");
                float dimensionPixelSize2 = c77557UcD.getContext().getResources().getDimensionPixelSize(R.dimen.acg);
                float dimensionPixelSize3 = c77557UcD.getContext().getResources().getDimensionPixelSize(R.dimen.ach);
                if (z) {
                    dimensionPixelSize = c77557UcD.getContext().getResources().getDimensionPixelSize(R.dimen.acd) + c77557UcD.getContext().getResources().getDimensionPixelSize(R.dimen.acf);
                } else {
                    dimensionPixelSize = c77557UcD.getContext().getResources().getDimensionPixelSize(R.dimen.acc);
                }
                float dimensionPixelSize4 = c77557UcD.getContext().getResources().getDimensionPixelSize(R.dimen.aai);
                c77557UcD.setX(((dimensionPixelSize3 / 2.0f) + f) - (dimensionPixelSize4 / 2.0f));
                c77557UcD.setY(((dimensionPixelSize2 / 2.0f) + f2) - (dimensionPixelSize / 2.0f));
                c77557UcD.setTag(Float.valueOf(c77557UcD.getX()));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("moveToCenterOfItem x ");
                LIZ2.append(c77557UcD.getX());
                LIZ2.append(" itemX ");
                LIZ2.append(f);
                LIZ2.append(" giftPanelItemWidthInPx ");
                LIZ2.append(dimensionPixelSize3);
                LIZ2.append(" comboWidthInPx ");
                LIZ2.append(dimensionPixelSize4);
                C0NB.LJIIIZ("GiftPanelCombo", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("moveToCenterOfItem y ");
                LIZ3.append(c77557UcD.getY());
                LIZ3.append(" itemY ");
                LIZ3.append(f2);
                LIZ3.append(" giftPanelItemHeightInPx ");
                LIZ3.append(dimensionPixelSize3);
                LIZ3.append(" comboHeightInPx ");
                LIZ3.append(dimensionPixelSize);
                C0NB.LJIIIZ("GiftPanelCombo", X1D.LIZIZ(LIZ3));
                C29306Beo.LJJLJLI(c77557UcD);
                if (c77557UcD == null) {
                    return;
                }
            }
            c77557UcD.LIZJ(new ARunnableS5S0200100_8(interfaceC88471Ynr, j, c77557UcD, 0), new ARunnableS27S0200000_8(interfaceC65784Pro, c77557UcD, 7), j, "gift_panel", "gift_panel", SystemClock.uptimeMillis() - C32694CsM.LJJIJIIJI);
        }
    }
}
