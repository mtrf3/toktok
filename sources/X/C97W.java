package X;

import com.ss.android.ugc.aweme.search.detail.shoot.ui.CreationIntentionMusicShootReusedAssem;
import com.ss.android.ugc.aweme.search.detail.shoot.viewmodel.CreationIntentionMusicShootVM;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.97W, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C97W extends AbstractC65781Prl implements InterfaceC88471Ynr<CreationIntentionMusicShootReusedAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C97W LJLIL = new C97W();

    public C97W() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(CreationIntentionMusicShootReusedAssem creationIntentionMusicShootReusedAssem, C43I<? extends Boolean> c43i) {
        CreationIntentionMusicShootReusedAssem selectSubscribeOnAsync = creationIntentionMusicShootReusedAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue()) {
            Iterator it2 = ((ArrayList) ((CreationIntentionMusicShootVM) selectSubscribeOnAsync.LJLLL.LIZ(selectSubscribeOnAsync, CreationIntentionMusicShootReusedAssem.LJLLLLLL[1])).LJLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC65784Pro) it2.next()).invoke();
            }
        }
        return C76800UCe.LIZ;
    }
}
