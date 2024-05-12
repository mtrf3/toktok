package com.ss.android.ugc.aweme.services;

import X.C58096Mr6;
import X.C76800UCe;
import X.C85528XhU;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.ISaveInfoDialogService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SaveInfoDialogService implements ISaveInfoDialogService {
    public static ISaveInfoDialogService createISaveInfoDialogServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(ISaveInfoDialogService.class, z);
        if (LIZ != null) {
            return (ISaveInfoDialogService) LIZ;
        }
        if (C58096Mr6.a6 == null) {
            synchronized (ISaveInfoDialogService.class) {
                if (C58096Mr6.a6 == null) {
                    C58096Mr6.a6 = new SaveInfoDialogService();
                }
            }
        }
        return C58096Mr6.a6;
    }

    @Override // com.ss.android.ugc.aweme.ISaveInfoDialogService
    public void tryShowDialog(String enterFrom, InterfaceC65784Pro<C76800UCe> onDialogDismissedAfterShown, InterfaceC65784Pro<C76800UCe> onDialogCancelled) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(onDialogDismissedAfterShown, "onDialogDismissedAfterShown");
        o.LJIIIZ(onDialogCancelled, "onDialogCancelled");
        C85528XhU.LIZLLL(enterFrom, onDialogDismissedAfterShown, onDialogCancelled);
    }
}
