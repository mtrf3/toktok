package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.improve.pkg.NowPostIncentiveSharePackage;
import com.zhiliaoapp.musically.R;

/* renamed from: X.OcC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62268OcC<T> implements InterfaceC64592gB {
    public static final C62268OcC<T> LJLIL = new C62268OcC<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        NowPostIncentiveSharePackage nowPostIncentiveSharePackage = (NowPostIncentiveSharePackage) obj;
        Activity LJIILLIIL = nowPostIncentiveSharePackage.LJIILLIIL();
        if (LJIILLIIL != null) {
            C62387Oe7 LJIIZILJ = nowPostIncentiveSharePackage.LJIIZILJ();
            LJIIZILJ.LJJIIZ = true;
            LJIIZILJ.LJJII = true;
            LJIIZILJ.LJJIIZI = new C40898G3i(LJIILLIIL, nowPostIncentiveSharePackage);
            ShareDependService.LIZ.getClass();
            OQA.LIZLLL(C44498HdG.LIZ(), LJIILLIIL, LJIIZILJ, Integer.valueOf(R.style.a6u), null, false, 24);
        }
    }
}
