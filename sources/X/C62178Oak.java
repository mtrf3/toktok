package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oak, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62178Oak extends GKC {
    public final Challenge LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("tag_id", this.LJLILLLLZI.getCid());
        c188727au.LJIIIZ("platform", "scan");
        c188727au.LJIIIZ("qr_code_type", "shaped");
        c188727au.LJIIIZ("enter_from", "challenge");
        FMX.LJIIL("click_qr_code", c188727au.LIZ);
        if (CommerceChallengeServiceImpl.LIZIZ().LJIJJ(this.LJLILLLLZI)) {
            i = 23;
        } else {
            i = 2;
        }
        Bundle bundle = new Bundle();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('#');
        LIZ.append(this.LJLILLLLZI.getChallengeName());
        bundle.putString("display_name", X1D.LIZIZ(LIZ));
        bundle.putLong("display_count", this.LJLILLLLZI.getDisplayCount());
        bundle.putString("enter_from", "hash_tag");
        String string = sharePackage.extras.getString("enter_from");
        String string2 = sharePackage.extras.getString("enter_method");
        String cid = this.LJLILLLLZI.getCid();
        o.LJIIIIZZ(cid, "challenge.cid");
        C62188Oau c62188Oau = new C62188Oau(i, cid, bundle);
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            C4LD.LIZ.LJJJI(LJJLIIIJ, sharePackage.itemType, c62188Oau, string, string2);
        }
        MobClick mobClick = new MobClick();
        mobClick.setEventName("share_challenge");
        mobClick.setLabelName("qr_code");
        mobClick.setExtValueString(this.LJLILLLLZI.getCid());
        C76W c76w = new C76W();
        c76w.LIZ("request_id", this.LJLJJI);
        c76w.LIZ("challenge_id", this.LJLJI);
        c76w.LIZ("process_id", this.LJLJJL);
        mobClick.setJsonObject(c76w.LIZIZ());
        FMX.onEvent(mobClick);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("tag_id", this.LJLJI);
        c188727au2.LJIIIZ("platform", "qr_code");
        c188727au2.LJIIIZ("share_mode", "normal_share");
        c188727au2.LJIIIZ("process_id", this.LJLJJL);
        FMX.LJIIL("share_tag", c188727au2.LIZ);
    }

    public C62178Oak(Challenge challenge, String str, String str2, String str3) {
        o.LJIIIZ(challenge, "challenge");
        this.LJLILLLLZI = challenge;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }
}
