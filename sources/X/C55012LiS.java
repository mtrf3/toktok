package X;

import com.ss.android.ugc.aweme.ISmartLockService;
import com.ss.android.ugc.aweme.services.SmartLockService;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("inbox_smart_lock")
/* renamed from: X.LiS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55012LiS extends M71 {
    public final MLL LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 550;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55012LiS(MLL account, InterfaceC55643Lsd scene) {
        super(scene);
        o.LJIIIZ(account, "account");
        o.LJIIIZ(scene, "scene");
        this.LJLIL = account;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ISmartLockService createISmartLockServicebyMonsterPlugin = SmartLockService.createISmartLockServicebyMonsterPlugin(false);
        createISmartLockServicebyMonsterPlugin.tryShowAuthorityDialog(context.LIZJ(), this.LJLIL, 3, new C55011LiR(createISmartLockServicebyMonsterPlugin, wrapper, context, this));
    }
}
