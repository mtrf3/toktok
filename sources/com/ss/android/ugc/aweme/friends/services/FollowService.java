package com.ss.android.ugc.aweme.friends.services;

import X.ALX;
import X.AnonymousClass400;
import X.C57283Mdz;
import X.C57285Me1;
import X.C58096Mr6;
import X.InterfaceC57288Me4;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* loaded from: classes2.dex */
public final class FollowService implements IFollowService {
    public static IFollowService createIFollowServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IFollowService.class, z);
        if (LIZ != null) {
            return (IFollowService) LIZ;
        }
        if (C58096Mr6.Y0 == null) {
            synchronized (IFollowService.class) {
                if (C58096Mr6.Y0 == null) {
                    C58096Mr6.Y0 = new FollowService();
                }
            }
        }
        return C58096Mr6.Y0;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFollowService
    public void sendRequest(String str, String str2, int i, AnonymousClass400 anonymousClass400) {
        sendRequest(str, str2, i, 0, anonymousClass400);
    }

    public final void sendRequest(String str, String str2, int i, int i2, final AnonymousClass400 anonymousClass400) {
        C57283Mdz c57283Mdz = new C57283Mdz();
        c57283Mdz.LJLILLLLZI = new InterfaceC57288Me4() { // from class: X.401
            @Override // X.InterfaceC57288Me4
            public final void onResponseSuccess(FollowStatus followStatus) {
            }

            @Override // X.InterfaceC57288Me4
            public final void onFollowFail(Exception exc) {
                AnonymousClass400 anonymousClass4002 = AnonymousClass400.this;
                if (anonymousClass4002 != null) {
                    anonymousClass4002.LIZ(exc);
                }
            }

            @Override // X.InterfaceC57288Me4
            public final void onFollowSuccess(FollowStatus followStatus) {
                AnonymousClass400 anonymousClass4002 = AnonymousClass400.this;
                if (anonymousClass4002 != null) {
                    anonymousClass4002.LIZIZ();
                }
            }
        };
        ALX alx = new ALX();
        alx.LIZJ(str);
        alx.LIZIZ(str2);
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LIZJ = i;
        c57285Me1.LIZLLL = i2;
        c57283Mdz.LJIJJ(alx.LIZ());
    }
}
