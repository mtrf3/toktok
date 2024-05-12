package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareExtService;
import fjb.a;
import java.util.HashSet;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photodownload.DownloadPhotoGlobal$onShareSuccess$4", f = "DownloadPhotoGlobal.kt", l = {316}, m = "invokeSuspend")
/* renamed from: X.Gwz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43173Gwz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC43172Gwy LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43173Gwz(boolean z, InterfaceC43172Gwy interfaceC43172Gwy, boolean z2, InterfaceC67352kd<? super C43173Gwz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = interfaceC43172Gwy;
        this.LJLJJI = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43173Gwz(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer num;
        C8BR<?, ?> c8br;
        InterfaceC43172Gwy interfaceC43172Gwy;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        OSZ<Integer, String> osz = null;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            boolean z = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C165406eO(z, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        android.net.Uri uri = (android.net.Uri) obj;
        if (uri != null && ((HashSet) C44896Hjg.LJIILJJIL).size() == 1 && (interfaceC43172Gwy = this.LJLJI) != null) {
            interfaceC43172Gwy.LJ(uri);
        }
        ShareExtService shareExtService = C4LD.LIZIZ;
        Aweme aweme = C44896Hjg.LJI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = C44896Hjg.LJI;
        if (aweme2 != null) {
            num = new Integer(aweme2.getAwemeType());
        } else {
            num = null;
        }
        C43170Gww c43170Gww = C44896Hjg.LJIILL;
        if (c43170Gww != null) {
            c8br = c43170Gww.LIZIZ;
            osz = c43170Gww.LIZJ;
        } else {
            c8br = null;
        }
        shareExtService.LJ(str, num, c8br, osz);
        Aweme aweme3 = C44896Hjg.LJI;
        if (aweme3 != null) {
            C44896Hjg.LJIIJ(C45382HrW.LIZ(4, aweme3, 0, ((HashSet) C44896Hjg.LJIIL).size(), C44896Hjg.LJIL, 4), this.LJLJJI);
        }
        C44896Hjg.LJFF();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
