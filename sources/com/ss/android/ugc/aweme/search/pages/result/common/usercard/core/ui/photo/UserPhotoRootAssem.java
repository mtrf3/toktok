package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo;

import X.C65352Pkq;
import X.C8VR;
import X.C8XO;
import X.JJL;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class UserPhotoRootAssem extends ReusedUIContentAssem<UserPhotoRootAssem> implements C8XO<JJL> {
    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public UserPhotoRootAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(JJL item) {
        o.LJIIIZ(item, "item");
        C8VR.LIZJ(this, C65352Pkq.LIZ(UserPhotoStaticAssem.class));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JJL jjl) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS139S0200000_8(this, view, 15));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JJL jjl) {
    }
}
