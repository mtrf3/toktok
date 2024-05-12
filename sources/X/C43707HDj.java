package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.AsyncAVService;

/* renamed from: X.HDj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43707HDj extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C43722HDy LJLIL;
    public final /* synthetic */ C45838Hys LJLILLLLZI;
    public final /* synthetic */ C43703HDf LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLJJLL;
    public final /* synthetic */ AsyncAVService LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43707HDj(C43722HDy c43722HDy, C45838Hys c45838Hys, C43703HDf c43703HDf, Activity activity, String str, InterfaceC67352kd<? super Boolean> interfaceC67352kd, AsyncAVService asyncAVService) {
        super(0);
        this.LJLIL = c43722HDy;
        this.LJLILLLLZI = c45838Hys;
        this.LJLJI = c43703HDf;
        this.LJLJJI = activity;
        this.LJLJJL = str;
        this.LJLJJLL = interfaceC67352kd;
        this.LJLJL = asyncAVService;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C43722HDy c43722HDy = this.LJLIL;
        c43722HDy.mShareFormat = EnumC43698HDa.DEFAULT;
        C45838Hys c45838Hys = this.LJLILLLLZI;
        if (c45838Hys.LIZ == 1) {
            C43703HDf c43703HDf = this.LJLJI;
            Activity activity = this.LJLJJI;
            String str = this.LJLJJL;
            InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLJJLL;
            c43703HDf.getClass();
            C43703HDf.LIZLLL(activity, c43722HDy, c45838Hys, str, interfaceC67352kd);
        } else {
            C43703HDf c43703HDf2 = this.LJLJI;
            Activity activity2 = this.LJLJJI;
            AsyncAVService asyncAVService = this.LJLJL;
            String str2 = this.LJLJJL;
            InterfaceC67352kd<Boolean> interfaceC67352kd2 = this.LJLJJLL;
            c43703HDf2.getClass();
            C43703HDf.LJ(activity2, asyncAVService, c43722HDy, c45838Hys, str2, interfaceC67352kd2);
        }
        return C76800UCe.LIZ;
    }
}
