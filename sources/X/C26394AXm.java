package X;

import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AXm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26394AXm extends C248019oL {
    @Override // X.C248019oL
    public final boolean LIZIZ() {
        if (!C26396AXo.LIZIZ()) {
            return false;
        }
        Aweme LIZ = AU1.LIZ();
        if (LIZ != null && LIZ.isAd()) {
            return false;
        }
        return true;
    }

    @Override // X.C248019oL
    public final boolean LIZJ() {
        Aweme LIZ = AU1.LIZ();
        if (LIZ == null || LIZ.isAd() || LIZ.getAwemeType() == 101) {
            return true;
        }
        return false;
    }

    @Override // X.C248019oL
    public final boolean LIZLLL() {
        return C26396AXo.LIZIZ();
    }

    @Override // X.C248019oL
    public final void LJ(Activity activity, String contentId, InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88472Yns) {
        InterfaceC54054LJi interfaceC54054LJi;
        InterfaceC55643Lsd interfaceC55643Lsd;
        Object LIZ;
        o.LJIIIZ(contentId, "contentId");
        InterfaceC36571c5 LIZ2 = C26397AXp.LIZ();
        if (LIZ2 instanceof InterfaceC55058LjC) {
            InterfaceC36571c5 curFragment = ((InterfaceC55058LjC) LIZ2).getCurFragment();
            if (curFragment instanceof InterfaceC54054LJi) {
                interfaceC54054LJi = (InterfaceC54054LJi) curFragment;
                if ((interfaceC54054LJi instanceof InterfaceC55643Lsd) || (interfaceC55643Lsd = (InterfaceC55643Lsd) interfaceC54054LJi) == null) {
                    interfaceC88472Yns.invoke(null);
                }
                AqS186S0100000_4 aqS186S0100000_4 = new AqS186S0100000_4(interfaceC88472Yns, (InterfaceC88472Yns<? super InterfaceC65784Pro<C76800UCe>, C76800UCe>) 7);
                try {
                    PopupManager.LJIIL(new C26395AXn(interfaceC55643Lsd, contentId, aqS186S0100000_4));
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ) == null) {
                    return;
                }
                aqS186S0100000_4.invoke(null, null);
                return;
            }
        }
        interfaceC54054LJi = null;
        if (interfaceC54054LJi instanceof InterfaceC55643Lsd) {
        }
        interfaceC88472Yns.invoke(null);
    }
}
