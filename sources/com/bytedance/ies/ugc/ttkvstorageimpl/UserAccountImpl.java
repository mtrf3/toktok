package com.bytedance.ies.ugc.ttkvstorageimpl;

import X.C09190Xr;
import X.C58096Mr6;
import X.LUU;
import X.LUV;
import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserAccountImpl implements IUserAccount {
    public final ConcurrentHashMap<Integer, WeakReference<LUV>> LIZ = new ConcurrentHashMap<>();
    public String LIZIZ;
    public final IAccountService LIZJ;

    public static IUserAccount LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IUserAccount.class, false);
        if (LIZ != null) {
            return (IUserAccount) LIZ;
        }
        if (C58096Mr6.LJJIIJ == null) {
            synchronized (IUserAccount.class) {
                if (C58096Mr6.LJJIIJ == null) {
                    C58096Mr6.LJJIIJ = new UserAccountImpl();
                }
            }
        }
        return C58096Mr6.LJJIIJ;
    }

    @Override // com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount
    public final void LIZ() {
        C09190Xr.LIZ(this.LIZIZ);
    }

    public UserAccountImpl() {
        this.LIZIZ = CardStruct.IStatusCode.DEFAULT;
        LUU luu = new LUU(this);
        IAccountService LJIJ = AccountService.LJIJ();
        this.LIZJ = LJIJ;
        String curUserId = LJIJ.LJFF().getCurUserId();
        this.LIZIZ = o.LJ(curUserId, CardStruct.IStatusCode.DEFAULT) ? "unlogin" : curUserId;
        LJIJ.LJIILJJIL(luu);
    }

    @Override // com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount
    public final String getCurrentUid() {
        return this.LIZIZ;
    }
}
