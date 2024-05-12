package X;

import Y.ACallableS82S0200000_4;
import Y.IDxS74S0000000_4;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.AXb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26383AXb {
    public static final C5H3<C26383AXb> LJFF = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C26388AXg.LJLIL);
    public boolean LIZIZ;
    public ViewOnClickListenerC26389AXh LIZLLL;
    public final C26384AXc LIZ = new C26384AXc();
    public String LIZJ = "";
    public final C62822Ol8 LJ = C221108m2.LIZIZ(AF4.LJLIL);

    public final boolean LIZ() {
        if (RBW.LJLLI.LJI()) {
            User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
            if (currentUser != null && currentUser.isContentLanguageDialogShown()) {
                return true;
            }
        } else {
            if (TextUtils.isEmpty(this.LIZ.LIZIZ())) {
                C26384AXc c26384AXc = this.LIZ;
                c26384AXc.getClass();
                try {
                    if (c26384AXc.LIZ().LJIIL()) {
                    }
                } catch (Throwable th) {
                    PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
                }
            }
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        C26384AXc c26384AXc = this.LIZ;
        c26384AXc.getClass();
        try {
        } catch (Throwable th) {
            PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
        }
        if (!c26384AXc.LIZ().LJI()) {
            C26384AXc c26384AXc2 = this.LIZ;
            c26384AXc2.getClass();
            try {
                c26384AXc2.LIZ().LIZIZ();
            } catch (Throwable th2) {
                PEH.LIZLLL(th2, "MainTabPreferences AbstractMethodError");
            }
        }
    }

    public final void LIZJ() {
        AbstractC73672Svk<BaseResponse> contentLanguageDialogShown;
        if (RBW.LJLLI.LJI()) {
            LanguageApi languageApi = (LanguageApi) this.LJ.getValue();
            if (languageApi != null && (contentLanguageDialogShown = languageApi.setContentLanguageDialogShown("content_language_already_popup")) != null) {
                contentLanguageDialogShown.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS74S0000000_4(0));
                return;
            }
            return;
        }
        C26384AXc c26384AXc = this.LIZ;
        c26384AXc.getClass();
        try {
            c26384AXc.LIZ().LJIIIZ(true);
        } catch (Throwable th) {
            PEH.LIZLLL(th, "MainTabPreferences AbstractMethodError");
        }
    }

    public final void LIZLLL(Context context) {
        String str;
        Boolean bool;
        o.LJIIIZ(context, "context");
        LIZIZ();
        if (C79004UzY.LJJIFFI(C2YJ.LIZIZ.LIZ.getContentLanguageGuideCodes()) || LIZ()) {
            return;
        }
        Pair<Boolean, String> LJII = ContentLanguageServiceImpl.LJIIJJI().LJII(context);
        if (LJII == null || (str = (String) LJII.second) == null) {
            str = "";
        }
        this.LIZJ = str;
        if (LJII != null) {
            bool = (Boolean) LJII.first;
        } else {
            bool = null;
        }
        o.LJI(bool);
        if (!bool.booleanValue()) {
            this.LIZIZ = true;
        } else {
            C10K.LIZIZ(new ACallableS82S0200000_4(this, context, 1), C10K.LJIIIIZZ, null);
            this.LIZIZ = false;
        }
    }
}
