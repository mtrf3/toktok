package com.ss.android.ugc.aweme.dsp.preload;

import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C38827FLr;
import X.C56512MFw;
import X.EFJ;
import X.InterfaceC88472Yns;
import X.WM7;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.dsp.api.MusicVipInfoApi;
import com.ss.android.ugc.aweme.dsp.subscribe.model.DspVipInfoResponse;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MusicVipInfoPreload implements X8M<MusicVipInfoApi.MusicVipInfoOperatorApi, AbstractC73672Svk<DspVipInfoResponse>> {
    public static final C56512MFw Companion = new C56512MFw();

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(600000, EFJ.LIZJ, false);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C16880lQ.LLLLIIL(exception);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public AbstractC73672Svk<DspVipInfoResponse> preload(Bundle bundle, InterfaceC88472Yns<? super Class<MusicVipInfoApi.MusicVipInfoOperatorApi>, ? extends MusicVipInfoApi.MusicVipInfoOperatorApi> create) {
        int i;
        String str;
        Boolean bool;
        o.LJIIIZ(create, "create");
        if (bundle != null) {
            i = bundle.getInt(WM7.SCENE_SERVICE);
        } else {
            i = 0;
        }
        String str2 = null;
        if (bundle != null) {
            str = bundle.getString("track_id");
        } else {
            str = null;
        }
        if (bundle != null) {
            bool = Boolean.valueOf(bundle.getBoolean("allow_play_full_song_in_tt"));
        } else {
            bool = null;
        }
        if (bundle != null) {
            str2 = bundle.getString("scene_context");
        }
        MusicVipInfoApi.MusicVipInfoOperatorApi invoke = create.invoke(MusicVipInfoApi.MusicVipInfoOperatorApi.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(WM7.SCENE_SERVICE);
        arrayList.add("track_id");
        arrayList.add("allow_play_full_song_in_tt");
        arrayList.add("scene_context");
        return invoke.getVipInfo(i, str, bool, str2, new PreloadExtraInfo(0, "", "", "tiktok/music/dsp/ttm/vip_info/v2/", arrayList));
    }
}
