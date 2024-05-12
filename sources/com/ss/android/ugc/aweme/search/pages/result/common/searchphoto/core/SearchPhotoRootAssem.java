package com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core;

import X.C65352Pkq;
import X.C8VR;
import X.C8XO;
import X.JKM;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchPhotoRootAssem extends ReusedUIContentAssem<SearchPhotoRootAssem> implements C8XO<JKM> {
    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchPhotoRootAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(JKM item) {
        o.LJIIIZ(item, "item");
        C8VR.LIZJ(this, C65352Pkq.LIZ(SearchPhotoFeedbackAssem.class));
        C8VR.LIZJ(this, C65352Pkq.LIZ(SearchPhotoLikeAssem.class));
        C8VR.LIZJ(this, C65352Pkq.LIZ(SearchPhotoStaticInfoAssem.class));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(JKM jkm) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS139S0200000_8(this, view, 14));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(JKM jkm) {
    }
}
