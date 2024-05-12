package com.ss.android.ugc.aweme.commercialize.media.impl.handler.playlist;

import X.C61878OQg;
import X.GGD;
import X.H92;
import X.H94;
import X.H96;
import X.ORS;
import X.XX1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceMusicPlaylistHandler implements XX1 {
    public H94 LJLIL;

    @Override // X.XX1
    public final void Ir0(int i) {
        H92.LJI(Integer.valueOf(i));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (GGD.LIZ[event.ordinal()] == 1) {
            H92.LJLIL.getClass();
            ORS.LJJZ(H92.LJLLILLLL);
            H92.LJFF(null);
            H92.LJI(null);
            H92.LJLLI.LIZIZ(H92.LJLILLLLZI[8], null);
            H92.LJII(null);
        }
    }

    @Override // X.XX1
    public final void TB(List<? extends MusicModel> list, Long l, boolean z) {
        String str;
        H92.LJLIL.getClass();
        if (H92.LIZLLL()) {
            if (l != null) {
                str = l.toString();
            } else {
                str = null;
            }
            H92.LJII(str);
            H96 h96 = new H96();
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            h96.LIZJ = list;
            h96.LIZLLL = true;
            h96.LJII("ttba_CSP_UID_recommended_music_candidate", "commercial_music_suggestion_id", "rec_candidate_clip_id");
        }
        H94 h94 = this.LJLIL;
        if (h94 != null) {
            h94.LIZ = z;
        }
    }

    @Override // X.XX1
    public final void qj(int i, Integer num, String str, String str2, String str3, boolean z) {
        if (!(!z)) {
            str = null;
        }
        if (str2 == null) {
            str2 = Banner.BannerSchemaType.PLAYLIST.mobValue;
        }
        o.LJIIIIZZ(str2, "bannerType ?: Banner.Ban…emaType.PLAYLIST.mobValue");
        H94 h94 = new H94(str3, str2, z);
        H92.LJLIL.getClass();
        ((ArrayList) H92.LJLLILLLL).add(h94);
        this.LJLIL = h94;
        if (num == null || num.intValue() < 0) {
            num = null;
        }
        H92.LJLLI.LIZIZ(H92.LJLILLLLZI[8], num);
        H92.LJFF(str);
    }
}
