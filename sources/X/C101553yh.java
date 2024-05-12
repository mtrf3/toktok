package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* renamed from: X.3yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101553yh extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ EnumC101583yk LJLJJL;
    public final /* synthetic */ Context LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C101553yh(ActivityC45651qj activityC45651qj, int i, String str, String str2, EnumC101583yk enumC101583yk, Context context, String str3) {
        super(0);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = enumC101583yk;
        this.LJLJJLL = context;
        this.LJLJL = str3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        AKT akt = new AKT(this.LJLIL);
        akt.LJ(R.style.ux);
        akt.LJFF(this.LJLILLLLZI);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLILLLLZI = 0;
        c208158Ex.LJLJJI = 0;
        int LIZIZ = C7MY.LIZIZ(116);
        C208158Ex c208158Ex2 = akt.LIZ;
        c208158Ex2.LJLJL = LIZIZ;
        final Context context = this.LJLJJLL;
        final String str = this.LJLJI;
        final String str2 = this.LJLJL;
        final String str3 = this.LJLJJI;
        final EnumC101583yk enumC101583yk = this.LJLJJL;
        c208158Ex2.LJLJLJ = new View.OnClickListener() { // from class: X.3yi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://chatcontrol/setting");
                buildRoute.withParam("enter_from", str);
                buildRoute.withParam("enter_method", str2);
                buildRoute.open();
                C101573yj.LJ(C101573yj.LIZ, str, str3, enumC101583yk);
            }
        };
        akt.LJII();
        C101573yj.LJIIIZ(C101573yj.LIZ, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
