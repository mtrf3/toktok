package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.ObI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62212ObI implements InterfaceC62474OfW {
    public final /* synthetic */ User LIZ;

    public C62212ObI(User user) {
        this.LIZ = user;
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
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        if (action instanceof C46181IAn) {
            UserSharePackage.Companion.getClass();
            C62390OeA.LIZ("copy", this.LIZ, (SharePackage) sharePackage);
            C62390OeA.LIZIZ(action.key(), true, context, this.LIZ);
            return;
        }
        if (!(action instanceof C117234it)) {
            return;
        }
        UserSharePackage.Companion.getClass();
        C62390OeA.LIZ("report", this.LIZ, (SharePackage) sharePackage);
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
        SharePackage sharePackage = (SharePackage) baseSharePackage;
        User user = this.LIZ;
        c62390OeA.getClass();
        C62390OeA.LIZIZ(key, z, context, user);
        String key2 = channel.key();
        switch (key2.hashCode()) {
            case -1322993519:
                str = "chat_merge";
                if (!key2.equals("chat_merge")) {
                    return;
                }
                break;
            case 114009:
                if (!key2.equals("sms")) {
                    return;
                }
                str = "SMS";
                break;
            case 3059573:
                str = "copy";
                if (!key2.equals("copy")) {
                    return;
                }
                break;
            case 3357525:
                str = "more";
                if (!key2.equals("more")) {
                    return;
                }
                break;
            case 497130182:
                if (!key2.equals("facebook")) {
                    return;
                }
                str = "fb";
                break;
            default:
                return;
        }
        C62390OeA.LIZ(str, this.LIZ, sharePackage);
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
