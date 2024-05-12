package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Zta, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91374Zta implements InterfaceC91162ZqA {
    public final /* synthetic */ C91173ZqL LIZ;

    @Override // X.InterfaceC91162ZqA
    public final void LIZ() {
    }

    public C91374Zta(C91173ZqL c91173ZqL) {
        this.LIZ = c91173ZqL;
    }

    @Override // X.InterfaceC91162ZqA
    public final void LIZIZ(C91169ZqH c91169ZqH) {
        this.LIZ.LJIIIIZZ = c91169ZqH;
    }

    @Override // X.InterfaceC91162ZqA
    public final void LIZJ(C91169ZqH tab) {
        String str;
        String str2;
        Object obj;
        o.LJIIIZ(tab, "tab");
        C91173ZqL c91173ZqL = this.LIZ;
        if (c91173ZqL.LJIIIIZZ == null) {
            c91173ZqL.LJIIIIZZ = tab;
        }
        InterfaceC88476Ynw<Boolean, String, String, String, String, Context, C76800UCe> interfaceC88476Ynw = c91173ZqL.LIZJ;
        Boolean valueOf = Boolean.valueOf(MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(this.LIZ.LJII));
        C91169ZqH c91169ZqH = this.LIZ.LJIIIIZZ;
        if (c91169ZqH != null && (obj = c91169ZqH.LJ) != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        Object obj2 = tab.LJ;
        if (obj2 != null) {
            str2 = obj2.toString();
        } else {
            str2 = null;
        }
        interfaceC88476Ynw.invoke(valueOf, str, str2, null, null, null);
    }
}
