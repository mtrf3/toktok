package X;

import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.625, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass625 extends AbstractC65781Prl implements InterfaceC88472Yns<AvatarUri, C76800UCe> {
    public final /* synthetic */ AnonymousClass621 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Exception, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass625(AnonymousClass621 anonymousClass621, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LJLIL = anonymousClass621;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AvatarUri avatarUri) {
        AvatarUri it = avatarUri;
        o.LJIIIZ(it, "it");
        ProfileServiceImpl.LIZ().updateSavePostChoose(this.LJLIL.LJJLI(), this.LJLIL.LJJLIIIJJI().creativeModel.changeAvatarModel.realEnterMethod, it, this.LJLILLLLZI, new AqS96S0300000_7(this.LJLIL, (AnonymousClass621) it, (AvatarUri) this.LJLJI, (InterfaceC65784Pro<C76800UCe>) 4), new AqS133S0200000_2(this.LJLIL, (AnonymousClass621) this.LJLJJI, (InterfaceC88472Yns<? super Exception, C76800UCe>) 40));
        return C76800UCe.LIZ;
    }
}
