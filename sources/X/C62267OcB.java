package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.pkg.PhotoSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.OcB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62267OcB<T> implements InterfaceC64592gB {
    public static final C62267OcB<T> LJLIL = new C62267OcB<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PhotoSharePackage photoSharePackage = (PhotoSharePackage) obj;
        Activity LJIILLIIL = photoSharePackage.LJIILLIIL();
        if (LJIILLIIL != null) {
            C62387Oe7 LJIIZILJ = photoSharePackage.LJIIZILJ();
            if (C52220KeW.LIZ()) {
                LJIIZILJ.LJJIIZ = true;
                LJIIZILJ.LJJII = true;
                LJIIZILJ.LJJIIZI = new IDqS432S0100000_7(LJIILLIIL, 8);
                C62398OeI params = photoSharePackage.params;
                o.LJIIIZ(params, "params");
                C62038OWk.LIZ = LJIIZILJ;
                C62038OWk.LIZIZ = params;
            }
            ShareDependService.LIZ.getClass();
            OQA.LIZLLL(C44498HdG.LIZ(), LJIILLIIL, LJIIZILJ, Integer.valueOf(R.style.a6u), null, false, 24);
        }
    }
}
