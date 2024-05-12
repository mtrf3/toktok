package com.ss.android.ugc.aweme.detail.prefab.videos;

import X.C185927Rk;
import X.C214348b8;
import X.C3C8;
import X.C5H3;
import X.C65352Pkq;
import X.C7UH;
import X.C7UK;
import X.C8XO;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.detail.arch.videos.CollisionResolver;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class CollisionAwareReusedUISlotAssem<RECEIVER extends C3C8> extends ReusedUISlotAssem<RECEIVER> implements C8XO<C185927Rk>, C7UK {
    public final C5H3 LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public CollisionAwareReusedUISlotAssem() {
        new LinkedHashMap();
        this.LLFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(CollisionResolver.class), C7UH.INSTANCE);
    }

    @Override // X.C7UK
    public final Rect P0() {
        return new Rect(Y3().getLeft(), Y3().getTop(), Y3().getRight(), Y3().getBottom());
    }

    @Override // X.C7UK
    public final void LLLJL() {
        Y3().setVisibility(8);
    }

    @Override // X.C7UK
    public final boolean g0() {
        if (Y3().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C185927Rk c185927Rk) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        CollisionResolver collisionResolver = (CollisionResolver) this.LLFF.getValue();
        collisionResolver.getClass();
        ((ArrayList) collisionResolver.LJLIL).add(this);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C185927Rk c185927Rk) {
    }
}
