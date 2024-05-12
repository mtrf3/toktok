package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.MainServiceImpl;

/* renamed from: X.LpC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55430LpC extends AbstractC65781Prl implements InterfaceC65784Pro<Fragment> {
    public static final C55430LpC LJLIL = new C55430LpC();

    public C55430LpC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Fragment invoke() {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).obtainMainPageFragment();
    }
}
