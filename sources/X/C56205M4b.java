package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import ujb.s;

/* renamed from: X.M4b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56205M4b extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C54917Lgv LJLIL;
    public final /* synthetic */ C54082LKk LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C68322mC<BaseSheet> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56205M4b(C54917Lgv c54917Lgv, C54082LKk c54082LKk, String str, C68322mC<BaseSheet> c68322mC) {
        super(0);
        this.LJLIL = c54917Lgv;
        this.LJLILLLLZI = c54082LKk;
        this.LJLJI = str;
        this.LJLJJI = c68322mC;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        Fragment fragment;
        this.LJLIL.getClass();
        C54917Lgv.LJIIIIZZ("learn_more");
        if (!C48203Ivv.LJ(this.LJLILLLLZI.LIZ)) {
            LifecycleOwner lifecycleOwner = this.LJLILLLLZI.LIZIZ;
            if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
                C31811Ce7.LIZJ(fragment, R.string.img);
                return;
            }
        }
        String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
        if (s.LJJJLZIJ(this.LJLJI, "%s", false)) {
            str = Q8U.LIZIZ(new Object[]{appLanguage}, 1, this.LJLJI, "format(this, *args)");
        } else {
            str = this.LJLJI;
        }
        SmartRoute LIZ = m0.LIZ(this.LJLILLLLZI.LIZ, "aweme://webview", "url", str, "title", "");
        LIZ.withParam("show_separate_line", true);
        LIZ.open();
        BaseSheet baseSheet = this.LJLJJI.element;
        if (baseSheet != null) {
            baseSheet.dismiss();
        }
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
