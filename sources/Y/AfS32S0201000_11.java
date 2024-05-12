package Y;

import X.AbstractC45692HwW;
import X.C45743HxL;
import X.C68972R5c;
import X.C69084R9k;
import X.InterfaceC44146HUg;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.LNO;
import X.Q3U;
import X.Q3Y;
import X.Q8M;
import X.Q9E;
import X.Q9F;
import X.RBV;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.google.GoogleWebAuth;
import com.bytedance.lobby.google.LobbyGoogleApi;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import com.ss.android.ugc.aweme.experiment.MemoryDegradationSettings;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS32S0201000_11 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS32S0201000_11 afS32S0201000_11, Object obj) {
        switch (afS32S0201000_11.i2) {
            case 0:
                GoogleWebAuth googleWebAuth = (GoogleWebAuth) afS32S0201000_11.l0;
                Q8M q8m = (Q8M) afS32S0201000_11.l1;
                googleWebAuth.getClass();
                q8m.LIZLLL = ((LobbyGoogleApi.UserInfoResponse) obj).id;
                googleWebAuth.LJLJJL.hv0(new AuthResult(q8m));
                return;
            default:
                C45743HxL c45743HxL = (C45743HxL) obj;
                ((InterfaceC44146HUg) afS32S0201000_11.l0).LIZ(true, c45743HxL.LJLIL.LJLIL, c45743HxL.LJLILLLLZI, (AbstractC45692HwW) afS32S0201000_11.l1);
                return;
        }
    }

    public static final void accept$1(AfS32S0201000_11 afS32S0201000_11, Object obj) {
        String str;
        String LJJLIIIJJI = ((InterfaceC69056R8i) afS32S0201000_11.l0).q9().LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = ((InterfaceC69056R8i) afS32S0201000_11.l0).q9().LJJLIIIJLLLLLLLZ();
        Integer valueOf = Integer.valueOf(afS32S0201000_11.i2);
        Bundle arguments = ((Fragment) afS32S0201000_11.l1).getArguments();
        if (arguments != null) {
            str = arguments.getString("page", "");
        } else {
            str = null;
        }
        C68972R5c.LJIIL(0, LJJLIIIJJI, LJJLIIIJLLLLLLLZ, str, valueOf);
    }

    public static final void accept$2(AfS32S0201000_11 afS32S0201000_11, Object obj) {
        Throwable th = (Throwable) obj;
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        C68972R5c.LJIIL(((C69084R9k) th).getErrorCode(), ((InterfaceC69056R8i) afS32S0201000_11.l0).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS32S0201000_11.l0).q9().LJJLIIIJLLLLLLLZ(), RBV.LIZLLL((Fragment) afS32S0201000_11.l1), Integer.valueOf(afS32S0201000_11.i2));
    }

    public static final void accept$3(AfS32S0201000_11 afS32S0201000_11, Object obj) {
        switch (afS32S0201000_11.i2) {
            case 0:
                LNO lno = (LNO) afS32S0201000_11.l0;
                WebViewPreloadEntry webViewPreloadEntry = (WebViewPreloadEntry) afS32S0201000_11.l1;
                lno.getClass();
                if (((Boolean) obj).booleanValue()) {
                    lno.LJIIIIZZ(webViewPreloadEntry.getDelay(), webViewPreloadEntry.getUrl(), webViewPreloadEntry.isNeedRender());
                    return;
                }
                return;
            default:
                Q9E q9e = (Q9E) afS32S0201000_11.l0;
                MemoryDegradationSettings memoryDegradationSettings = (MemoryDegradationSettings) afS32S0201000_11.l1;
                q9e.getClass();
                if (((Activity) obj).getComponentName().getClassName().contains(memoryDegradationSettings.activityName) && q9e.LIZIZ) {
                    Q3Y LIZ = Q9E.LIZ(memoryDegradationSettings.memoryType);
                    Q3U.LIZ.execute(new ARunnableS30S0200000_11(new Q9F(q9e), LIZ, 43));
                    return;
                }
                return;
        }
    }

    public static final void accept$4(AfS32S0201000_11 afS32S0201000_11, Object obj) {
        switch (afS32S0201000_11.i2) {
            case 0:
                LikeHelper likeHelper = (LikeHelper) afS32S0201000_11.l0;
                ((HashMap) likeHelper.LLIIII).remove(afS32S0201000_11.l1);
                return;
            default:
                GoogleWebAuth googleWebAuth = (GoogleWebAuth) afS32S0201000_11.l0;
                Q8M q8m = (Q8M) afS32S0201000_11.l1;
                LobbyViewModel lobbyViewModel = googleWebAuth.LJLJJL;
                q8m.getClass();
                lobbyViewModel.hv0(new AuthResult(q8m));
                return;
        }
    }

    public AfS32S0201000_11(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
