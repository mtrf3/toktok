package X;

import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public final class SSX<V> implements Callable {
    public final /* synthetic */ ProfileAigcAvatarViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public SSX(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, String str) {
        this.LJLIL = profileAigcAvatarViewModel;
        this.LJLILLLLZI = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LJLIL;
        profileAigcAvatarViewModel.LJLJJL = ((IAIGCAvatarService) profileAigcAvatarViewModel.LJLJI.getValue()).LIZ(this.LJLILLLLZI);
        InterfaceC72136SSu interfaceC72136SSu = this.LJLIL.LJLJJL;
        if (interfaceC72136SSu != null) {
            interfaceC72136SSu.start();
        }
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = this.LJLIL;
        InterfaceC72136SSu interfaceC72136SSu2 = profileAigcAvatarViewModel2.LJLJJL;
        if (interfaceC72136SSu2 != null) {
            interfaceC72136SSu2.registerListener(profileAigcAvatarViewModel2.LJLLLL);
        }
        String str2 = ((SIN) this.LJLIL.getState()).LJLJJL.LIZ.toString();
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel3 = this.LJLIL;
        SRW srw = profileAigcAvatarViewModel3.LJLIL;
        String str3 = null;
        if (srw != null) {
            str = srw.LJLILLLLZI;
            str3 = srw.LJLJI;
        } else {
            str = null;
        }
        STD.LIZLLL(str2, "generate_more", str, str3, 0, Integer.valueOf(profileAigcAvatarViewModel3.LJLJJLL), null, 64);
        return C76800UCe.LIZ;
    }
}
