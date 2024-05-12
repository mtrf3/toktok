package com.ss.android.ugc.aweme.detail.prefab;

import X.C221108m2;
import X.C62822Ol8;
import X.C7SW;
import android.view.View;
import com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class DetailPageStatusViewAssem extends FullPageStatusViewAssem {
    public final C62822Ol8 LJLLILLLL;
    public boolean LJLLJ;

    public DetailPageStatusViewAssem() {
        new LinkedHashMap();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 189));
        this.LJLLJ = true;
    }

    private final String lr() {
        return (String) this.LJLLILLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber
    public void J80() {
        super.J80();
        String lr = lr();
        if (lr != null) {
            C7SW.LIZ("detail_prepare_network", lr);
            C7SW.LIZLLL("detail_page_visible", lr);
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public void pN() {
        super.pN();
        if (this.LJLLJ) {
            this.LJLLJ = false;
            String lr = lr();
            if (lr != null) {
                C7SW.LIZ("detail_page_visible", lr);
                C7SW.LIZLLL("detail_header_render", lr);
                C7SW.LIZLLL("detail_content_render", lr);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (o.LJ(this.LJLJLLL.getValue(), lr()) && lr() != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLJ = z;
    }

    @Override // com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber
    public void s6(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        super.s6(throwable);
        if (this.LJLLJ) {
            this.LJLLJ = false;
            String lr = lr();
            if (lr != null) {
                C7SW.LIZJ("detail_page_visible", lr);
            }
        }
    }
}
