package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.share.improve.pkg.NowPostIncentiveSharePackage;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.G3i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40898G3i extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, Boolean, Integer, OSZ> {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ NowPostIncentiveSharePackage LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40898G3i(Activity activity, NowPostIncentiveSharePackage nowPostIncentiveSharePackage) {
        super(3);
        this.LJLIL = activity;
        this.LJLILLLLZI = nowPostIncentiveSharePackage;
    }

    @Override // X.InterfaceC88473Ynt
    public final OSZ invoke(Integer num, Boolean bool, Integer num2) {
        num.intValue();
        bool.booleanValue();
        num2.intValue();
        ISpecActService.LIZ.getClass();
        C62198Ob4 shareTopView = C40894G3e.LIZ().LJJIIJ(this.LJLIL, this.LJLILLLLZI.incentiveShareParams.LJLJJL);
        o.LJIIIZ(shareTopView, "shareTopView");
        C40899G3j.LIZ = new WeakReference<>(shareTopView);
        return new OSZ(shareTopView, null);
    }
}
