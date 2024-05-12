package com.ss.android.ugc.aweme.mix.api;

import X.AbstractC73638SvC;
import X.C16880lQ;
import X.C38827FLr;
import X.EFJ;
import X.InterfaceC88472Yns;
import X.M7D;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixDetailNetPreload implements X8M<MixFeedApi, AbstractC73638SvC<MixDetailResponse>> {
    public static final int $stable = 0;

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("key_need_preload", true);
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, EFJ.LIZJ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public AbstractC73638SvC<MixDetailResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<MixFeedApi>, ? extends MixFeedApi> create) {
        Serializable serializable;
        String str;
        String str2;
        boolean z;
        M7D m7d;
        o.LJIIIZ(create, "create");
        String str3 = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("mix_video_list_params");
        } else {
            serializable = null;
        }
        if ((serializable instanceof M7D) && (m7d = (M7D) serializable) != null) {
            str = m7d.getMUsrId();
            str2 = m7d.getMSecUid();
            m7d.getMAid();
            str3 = m7d.getMixId();
            z = m7d.getFromShare();
        } else {
            str = null;
            str2 = null;
            z = false;
        }
        MixFeedApi invoke = create.invoke(MixFeedApi.class);
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return invoke.getMixDetail(str3, str, str2, z);
    }
}
