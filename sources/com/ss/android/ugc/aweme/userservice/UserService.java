package com.ss.android.ugc.aweme.userservice;

import X.AYX;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C34710Djm;
import X.C35794E3a;
import X.C57082Lw;
import X.C57267Mdj;
import X.C57270Mdm;
import X.C58096Mr6;
import X.C73422Sri;
import X.C73460SsK;
import X.InterfaceC68914R2w;
import X.M8D;
import X.M8G;
import X.OSZ;
import X.UC0;
import Y.AfS58S0200000_9;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class UserService implements IUserService {
    public C57270Mdm LIZ;

    public final synchronized void LIZIZ() {
        if (this.LIZ == null) {
            this.LIZ = C57267Mdj.LIZIZ;
        }
    }

    public static IUserService LIZ() {
        Object LIZ = C58096Mr6.LIZ(IUserService.class, false);
        if (LIZ != null) {
            return (IUserService) LIZ;
        }
        if (C58096Mr6.Q7 == null) {
            synchronized (IUserService.class) {
                if (C58096Mr6.Q7 == null) {
                    C58096Mr6.Q7 = new UserService();
                }
            }
        }
        return C58096Mr6.Q7;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final NextLiveData<FollowStatus> LJFF() {
        NextLiveData<FollowStatus> LIZIZ = C57082Lw.LIZ.LIZIZ("#FollowStatus");
        o.LJIIIIZZ(LIZIZ, "get().with(\"#FollowStatu…FollowStatus::class.java)");
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final NextLiveData<BlockStatus> LJII() {
        NextLiveData<BlockStatus> LIZIZ = C57082Lw.LIZ.LIZIZ("#BlockStatus");
        o.LJIIIIZZ(LIZIZ, "get().with(\"#BlockStatus… BlockStatus::class.java)");
        return LIZIZ;
    }

    public UserService() {
        new HashMap();
        if (!((Boolean) C34710Djm.LJJIIJ.getValue()).booleanValue()) {
            LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final AYX LJ() {
        LIZIZ();
        return C57267Mdj.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final AbstractC73672Svk<C35794E3a<User>> LIZLLL(String str) {
        LIZIZ();
        C57270Mdm c57270Mdm = this.LIZ;
        o.LJI(c57270Mdm);
        return UC0.LJ(c57270Mdm.LJLILLLLZI).LJII(str, new InterfaceC68914R2w[0]);
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final C73422Sri LIZJ(String str, String str2) {
        LIZIZ();
        C57270Mdm c57270Mdm = this.LIZ;
        o.LJI(c57270Mdm);
        o.LJI(str);
        o.LJI(str2);
        return c57270Mdm.LJLJJI.LIZ(new M8D(str, str2));
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final FollowStatus LJIIIIZZ(int i, String str, String str2) {
        LIZIZ();
        FollowStatus LIZ = CommonFollowApi.LIZ(i, -1, -1, -1, str, str2, "", "", null, null);
        C57270Mdm c57270Mdm = this.LIZ;
        o.LJI(c57270Mdm);
        c57270Mdm.LJLJJL.onNext(new OSZ<>(new M8G(str, str2, i, -1, -1, "", -1, null, null, null, null), LIZ));
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final C73460SsK LJI(int i, int i2, int i3, int i4, String userId, String secUserId, String str, String str2) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        LIZIZ();
        C57270Mdm c57270Mdm = this.LIZ;
        o.LJI(c57270Mdm);
        M8G m8g = new M8G(userId, secUserId, i, i2, i3, str, i4, str2, null, null, null);
        return AbstractC73638SvC.LJIIZILJ(c57270Mdm.LJLJI.LIZ(m8g).LJIILL(new AfS58S0200000_9(c57270Mdm, m8g, 15)));
    }

    @Override // com.ss.android.ugc.aweme.userservice.api.IUserService
    public final FollowStatus LJIIIZ(int i, int i2, int i3, int i4, String id, String secUserId, String str, String str2, String str3, Map map) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(secUserId, "secUserId");
        LIZIZ();
        FollowStatus LIZ = CommonFollowApi.LIZ(i, i2, i3, i4, id, secUserId, str, str2, str3, map);
        C57270Mdm c57270Mdm = this.LIZ;
        o.LJI(c57270Mdm);
        c57270Mdm.LJLJJL.onNext(new OSZ<>(new M8G(id, secUserId, i, i3, i2, str, i4, null, null, null, null), LIZ));
        return LIZ;
    }
}
