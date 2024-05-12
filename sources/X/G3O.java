package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_consent_box")
/* loaded from: classes7.dex */
public final class G3O extends AbstractC55363Lo7 {
    public final ITpcConsentService LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.M74
    public final boolean canShow() {
        ITpcConsentService iTpcConsentService = this.LJLIL;
        if (iTpcConsentService == null || !iTpcConsentService.LJIILJJIL()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity instanceof LifecycleOwner) {
            return C54081LKj.LIZ(topActivity, (LifecycleOwner) topActivity);
        }
        return null;
    }

    public G3O(ITpcConsentService iTpcConsentService, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = iTpcConsentService;
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.invoke();
    }
}
