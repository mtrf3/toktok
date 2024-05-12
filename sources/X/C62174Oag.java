package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oag, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62174Oag extends GKC {
    public final Aweme LJLILLLLZI;

    public C62174Oag(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLILLLLZI = aweme;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Bundle bundle = new Bundle();
        bundle.putInt("aweme_type", this.LJLILLLLZI.getAwemeType());
        bundle.putString("nick_name", AV1.LJFF(this.LJLILLLLZI));
        bundle.putString("video_introduction", C188687aq.LIZ(this.LJLILLLLZI));
        bundle.putSerializable("cover_image", C188687aq.LIZIZ(this.LJLILLLLZI));
        String string = sharePackage.extras.getString("enter_from");
        String string2 = sharePackage.extras.getString("enter_method");
        String aid = this.LJLILLLLZI.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        C62188Oau c62188Oau = new C62188Oau(1, aid, bundle);
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            C4LD.LIZ.LJJJI(LJJLIIIJ, sharePackage.itemType, c62188Oau, string, string2);
        }
    }
}
