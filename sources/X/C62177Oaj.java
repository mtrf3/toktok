package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oaj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62177Oaj extends GKC {
    public final Music LJLILLLLZI;

    public C62177Oaj(Music music) {
        o.LJIIIZ(music, "music");
        this.LJLILLLLZI = music;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        String musicName;
        int userCount;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Bundle bundle = new Bundle();
        Music music = this.LJLILLLLZI;
        if (music == null) {
            musicName = "";
        } else {
            musicName = music.getMusicName();
        }
        bundle.putString("display_name", musicName);
        Music music2 = this.LJLILLLLZI;
        if (music2 == null) {
            userCount = 0;
        } else {
            userCount = music2.getUserCount();
        }
        bundle.putLong("display_count", userCount);
        bundle.putString("enter_from", "music");
        String string = sharePackage.extras.getString("enter_from");
        String string2 = sharePackage.extras.getString("enter_method");
        String mid = this.LJLILLLLZI.getMid();
        o.LJIIIIZZ(mid, "music.mid");
        C62188Oau c62188Oau = new C62188Oau(3, mid, bundle);
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            C4LD.LIZ.LJJJI(LJJLIIIJ, sharePackage.itemType, c62188Oau, string, string2);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJ(this.LJLILLLLZI.getId(), "music_id");
        c188727au.LJIIIZ("platform", "scan");
        c188727au.LJIIIZ("qr_code_type", "shaped");
        c188727au.LJIIIZ("enter_from", "single_song");
        FMX.LJIIL("click_qr_code", c188727au.LIZ);
    }
}
