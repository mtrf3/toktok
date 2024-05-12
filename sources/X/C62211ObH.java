package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.ObH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62211ObH implements InterfaceC62474OfW {
    public final /* synthetic */ User LIZ;
    public final /* synthetic */ String LIZIZ;

    public C62211ObH(User user, String str) {
        this.LIZ = user;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZIZ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZJ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC62486Ofi interfaceC62486Ofi) {
        OQD.LIZ(interfaceC62486Ofi, baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 c62387Oe7, C5JV c5jv) {
        OQD.LIZLLL(view, c62387Oe7, c5jv);
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C62390OeA c62390OeA = UserSharePackage.Companion;
        String key = channel.key();
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        User user = this.LIZ;
        c62390OeA.getClass();
        C62390OeA.LIZIZ(key, z, context, user);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("platform", channel.key());
        Bundle bundle = baseSharePackage.extras;
        if (bundle == null || (str = bundle.getString("related_gid")) == null) {
            str = "";
        }
        c188727au.LJIIIZ("from_gid", str);
        c188727au.LJIIIZ("enter_method", "click_head");
        c188727au.LJIIIZ("enter_from", this.LIZIZ);
        c188727au.LJIIIZ("author_id", this.LIZ.getUid());
        FMX.LJIIL("share_person", c188727au.LIZ);
    }

    @Override // X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV interfaceC62225ObV, boolean z, BaseSharePackage baseSharePackage, Context context) {
        OQD.LJ(interfaceC62225ObV, context);
    }
}
