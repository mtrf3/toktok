package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.kids.setting.items.language.KidAppLanguageListFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Fd8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39394Fd8 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ KidAppLanguageListFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39394Fd8(KidAppLanguageListFragment kidAppLanguageListFragment) {
        super(0);
        this.LJLIL = kidAppLanguageListFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        boolean z;
        C87094YGc c87094YGc = ABY.LIZ;
        c87094YGc.getClass();
        G36 g36 = (G36) ListProtector.get(new ArrayList(((LinkedHashMap) c87094YGc.LIZ).values()), this.LJLIL.LJLJI);
        String str2 = null;
        if (g36 != null) {
            str = g36.LIZ();
        } else {
            str = null;
        }
        Bundle LIZ = C0H1.LIZ("language_type", str);
        C39398FdC.LIZ.getClass();
        try {
            AppLogNewUtils.LIZJ("select_language", LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        G36 g362 = (G36) ListProtector.get(new ArrayList(((LinkedHashMap) c87094YGc.LIZ).values()), this.LJLIL.LJLJI);
        if (g362 != null) {
            str2 = g362.LIZJ();
        }
        Context requireContext = this.LJLIL.requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C39400FdE c39400FdE = new C39400FdE(requireContext, str2, str, c87094YGc);
        Locale LIZIZ = C39396FdA.LIZIZ(requireContext, str, str2);
        Locale locale = requireContext.getResources().getConfiguration().locale;
        o.LJIIIIZZ(locale, "configuration.locale");
        if (o.LJ(LIZIZ, locale)) {
            c39400FdE.LLJJ();
        } else {
            IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
            if (LIZLLL != null) {
                LIZLLL.enableInstall();
                z = true;
            } else {
                z = false;
            }
            if (EF7.LJIIIIZZ && z) {
                IPluginService LIZLLL2 = AabPluginServiceImpl.LIZLLL();
                o.LJIIIIZZ(LIZLLL2, "get().getService<IPlugin…luginService::class.java)");
                C37132Ehk c37132Ehk = new C37132Ehk();
                c37132Ehk.LJFF = new Locale(LIZIZ.getLanguage());
                c37132Ehk.LIZLLL = new C39395Fd9(requireContext, LIZIZ, c39400FdE);
                LIZLLL2.LIZ(new C37131Ehj(c37132Ehk));
            } else {
                C39393Fd7.LIZ(requireContext, LIZIZ);
                c39400FdE.LLJJ();
            }
        }
        AVExternalServiceImpl.LIZ().configService().cacheConfig().clearFilterCache();
        return C76800UCe.LIZ;
    }
}
