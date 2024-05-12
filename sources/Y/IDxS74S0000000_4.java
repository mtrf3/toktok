package Y;

import X.HG3;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import X.RBW;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDxS74S0000000_4 implements InterfaceC116954iR {
    public final int $t;

    public static final void onComplete$0(IDxS74S0000000_4 iDxS74S0000000_4) {
    }

    public static final void onComplete$1(IDxS74S0000000_4 iDxS74S0000000_4) {
    }

    public static final void onComplete$2(IDxS74S0000000_4 iDxS74S0000000_4) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(th, "e");
                return;
            case 1:
                o.LJIIIZ(th, "e");
                return;
            case 2:
                onError$2(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 2:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public IDxS74S0000000_4(int i) {
        this.$t = i;
    }

    public static final void onError$2(IDxS74S0000000_4 iDxS74S0000000_4, Throwable e) {
        o.LJIIIZ(e, "e");
        ContentLanguageServiceImpl.LJIIJJI().LJFF(null);
    }

    public static final void onNext$0(IDxS74S0000000_4 iDxS74S0000000_4, Object obj) {
        BaseResponse t = (BaseResponse) obj;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0) {
            User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
            if (currentUser != null) {
                currentUser.setContentLanguageDialogShown(true);
            }
            HG3.LJIILL().forceSave();
        }
    }

    public static final void onNext$1(IDxS74S0000000_4 iDxS74S0000000_4, Object t) {
        o.LJIIIZ(t, "t");
        ContentLanguageServiceImpl.LJIIJJI().LJFF(null);
    }

    public static final void onNext$2(IDxS74S0000000_4 iDxS74S0000000_4, Object obj) {
        BaseResponse t = (BaseResponse) obj;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0) {
            User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
            currentUser.setContentLanguageDialogShown(true);
            RBW.LJLLI.LJIIL(currentUser);
        }
        ContentLanguageServiceImpl.LJIIJJI().LJFF(null);
    }
}
