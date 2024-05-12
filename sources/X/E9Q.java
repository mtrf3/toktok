package X;

import com.bytedance.services.apm.api.IEnsure;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E9Q extends AbstractC29891Fh<InterfaceC82349WTp> implements InterfaceC82349WTp, InterfaceC135635Tz, C0IA {
    public final C82622Wbi LJLIL;
    public final /* synthetic */ E9N LJLILLLLZI;
    public final E9Q LJLJI;

    @Override // X.XZQ
    public boolean Kt() {
        return this.LJLILLLLZI.Kt();
    }

    @Override // X.C5L0
    public void Lp(MusicModel music, String selectedFrom) {
        o.LJIIIZ(music, "music");
        o.LJIIIZ(selectedFrom, "selectedFrom");
        this.LJLILLLLZI.Lp(music, selectedFrom);
    }

    @Override // X.XZQ
    public void U20(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        this.LJLILLLLZI.U20(musicId);
    }

    @Override // X.XZQ
    public void bY(String musicId, boolean z) {
        o.LJIIIZ(musicId, "musicId");
        this.LJLILLLLZI.bY(musicId, z);
    }

    @Override // X.XZQ
    public AbstractC73672Svk<List<MusicModel>> dm() {
        return this.LJLILLLLZI.dm();
    }

    @Override // X.XZQ
    public String pp(String musicId) {
        o.LJIIIZ(musicId, "musicId");
        return this.LJLILLLLZI.pp(musicId);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        String str;
        RBY LJFF;
        super.onCreate();
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            str = LJFF.getCurUserId();
        } else {
            str = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(getComponentName());
        LIZ.append("] UserId is null");
        String LIZIZ = X1D.LIZIZ(LIZ);
        IEnsure iEnsure = C78983UzD.LJLLLL;
        if (iEnsure != null) {
            iEnsure.ensureNotNull(str, LIZIZ);
        }
        E9N e9n = E9N.LJLIL;
        if (str == null) {
            str = "";
        }
        e9n.LIZJ(str);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC82349WTp getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public E9Q(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = E9N.LJLIL;
        this.LJLJI = this;
    }
}
