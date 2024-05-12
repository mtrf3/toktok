package com.ss.android.ugc.aweme.di;

import X.C60263Nkx;
import X.E2J;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BulletServiceImpl implements IBulletService {
    public final BulletService LIZ = new BulletService();

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJFF() {
        this.LIZ.getClass();
        BulletService.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final C60263Nkx LJIILIIL() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJ(context);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final String LJIIJ(String str) {
        this.LIZ.getClass();
        String LIZ = E2J.LIZ(str);
        if (LIZ == null) {
            return str;
        }
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final View LJIIJJI(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJIIJJI(context);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJIIL(Class<?> cls) {
        this.LIZ.LJIIL(cls);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LJIIIIZZ(Context context, String s) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(s, "s");
        this.LIZ.LJIIIIZZ(context, s);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final boolean LJIIIZ(Context context, String containerID) {
        o.LJIIIZ(containerID, "containerID");
        return this.LIZ.LJIIIZ(context, containerID);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void open(Context context, String s, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(s, "s");
        this.LIZ.open(context, s, bundle);
    }

    @Override // com.ss.android.ugc.aweme.bullet.api.IBulletService
    public final void LIZLLL(Context context, String s, String str, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(s, "s");
        this.LIZ.LIZLLL(context, s, str, bundle);
    }
}
