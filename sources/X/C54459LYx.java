package X;

import android.os.Bundle;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;

/* renamed from: X.LYx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54459LYx implements LLE {
    public final /* synthetic */ NonPersonalizedAssem LJLIL;

    public C54459LYx(NonPersonalizedAssem nonPersonalizedAssem) {
        this.LJLIL = nonPersonalizedAssem;
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        if (!ORZ.LJLJJI(str, NonPersonalizedVM.LJLIL)) {
            this.LJLIL.I3().setStateImmediate(C35669DzF.LJLIL);
        }
    }
}
