package com.ss.android.ugc.aweme.mix.api;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C228598y7;
import X.C229098yv;
import X.C38354F3m;
import X.C38827FLr;
import X.EFJ;
import X.InterfaceC88472Yns;
import X.M7D;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixListNetPreload implements X8M<MixFeedApi, AbstractC73672Svk<MixVideosResponse>> {
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
    public AbstractC73672Svk<MixVideosResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<MixFeedApi>, ? extends MixFeedApi> create) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        int i;
        M7D m7d;
        o.LJIIIZ(create, "create");
        String str4 = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("mix_video_list_params");
        } else {
            serializable = null;
        }
        if ((serializable instanceof M7D) && (m7d = (M7D) serializable) != null) {
            str = m7d.getMUsrId();
            str2 = m7d.getMSecUid();
            str3 = m7d.getMAid();
            str4 = m7d.getMixId();
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        Integer valueOf = Integer.valueOf(C228598y7.LIZ());
        if (!C38354F3m.LJ(str3)) {
            i = 4;
        } else {
            i = 1;
        }
        MixFeedApi invoke = create.invoke(MixFeedApi.class);
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        if (str2 != null) {
            str5 = str2;
        }
        return C229098yv.LIZ(invoke, str4, str3, 0L, i, str, str5, false, valueOf, 320);
    }
}
