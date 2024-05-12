package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import ujb.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$handleSingleMediaSystemShare$1$1$1", f = "SystemShareActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Hyo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45834Hyo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ android.net.Uri LJLILLLLZI;
    public final /* synthetic */ SystemShareActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45834Hyo(String str, android.net.Uri uri, SystemShareActivity systemShareActivity, InterfaceC67352kd<? super C45834Hyo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = uri;
        this.LJLJI = systemShareActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45834Hyo(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "SystemShareActivity path = ");
        LIZIZ.append(this.LJLIL);
        C36922EeM.LJ(X1D.LIZIZ(LIZIZ));
        if (this.LJLIL.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SystemShareActivity path is null, uri = ");
            LIZ.append(this.LJLILLLLZI);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        String str = this.LJLIL;
        c37246Eja.getClass();
        if (!C37246Eja.LJFF(str)) {
            C36922EeM.LJ("SystemShareActivity path not exists, return");
            C5S1 c5s1 = new C5S1(C16880lQ.LLLLLLIL(this.LJLJI));
            c5s1.LIZLLL(this.LJLJI.getString(R.string.r4a));
            c5s1.LJ();
            C43723HDz.LIZ();
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SystemShareActivity intent.type = ");
        LIZ2.append(this.LJLJI.getIntent().getType());
        C36922EeM.LJ(X1D.LIZIZ(LIZ2));
        String type = this.LJLJI.getIntent().getType();
        if (type != null && o.LJJJLIIL(type, "video/", false)) {
            C45838Hys c45838Hys = this.LJLJI.LJLIL;
            c45838Hys.LIZ = 2;
            c45838Hys.LIZIZ = C47261Igj.LJJIJ(this.LJLIL);
        } else {
            String type2 = this.LJLJI.getIntent().getType();
            if (type2 != null && o.LJJJLIIL(type2, "image/", false)) {
                C45838Hys c45838Hys2 = this.LJLJI.LJLIL;
                c45838Hys2.LIZ = 1;
                c45838Hys2.LIZIZ = C47261Igj.LJJIJ(this.LJLIL);
            } else {
                C36922EeM.LJ("SystemShareActivity can not handle intent.type, return");
                C5S1 c5s12 = new C5S1(C16880lQ.LLLLLLIL(this.LJLJI));
                c5s12.LIZLLL(this.LJLJI.getString(R.string.r4a));
                c5s12.LJ();
                C43723HDz.LIZ();
                return C76800UCe.LIZ;
            }
        }
        C44014HPe.LIZ("system_share");
        SystemShareActivity systemShareActivity = this.LJLJI;
        C43722HDy c43722HDy = systemShareActivity.LJLILLLLZI;
        if (c43722HDy != null) {
            c43722HDy.mShareMediaType = systemShareActivity.LJLIL.LIZ();
            SystemShareActivity systemShareActivity2 = this.LJLJI;
            SystemShareActivity systemShareActivity3 = this.LJLJI;
            systemShareActivity2.LJLJJI = new C45827Hyh(systemShareActivity3.LJLIL, systemShareActivity3.LJLJLJ.getCreationId(), null);
            SystemShareActivity systemShareActivity4 = this.LJLJI;
            C45827Hyh c45827Hyh = systemShareActivity4.LJLJJI;
            if (c45827Hyh != null) {
                C43722HDy c43722HDy2 = systemShareActivity4.LJLILLLLZI;
                if (c43722HDy2 != null) {
                    c45827Hyh.LIZIZ(systemShareActivity4, c43722HDy2);
                    c45827Hyh.LJ.observeForever(systemShareActivity4.LJLL);
                    c45827Hyh.LJI.observeForever(systemShareActivity4.LJLJLLL);
                    return C76800UCe.LIZ;
                }
                kotlin.jvm.internal.o.LJIJI("shareContext");
                throw null;
            }
            kotlin.jvm.internal.o.LJIJI("shareActionHelper");
            throw null;
        }
        kotlin.jvm.internal.o.LJIJI("shareContext");
        throw null;
    }
}
