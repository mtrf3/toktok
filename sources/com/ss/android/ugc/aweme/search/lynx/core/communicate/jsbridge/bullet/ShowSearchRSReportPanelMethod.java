package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.ActivityC45651qj;
import X.C49699Jex;
import X.C49702Jf0;
import X.C50345JpN;
import X.EnumC50341JpJ;
import X.F3T;
import X.InterfaceC1798974f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ShowSearchRSReportPanelMethod extends BaseBridgeMethod {
    public ActivityC45651qj LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public final String LJLJLJ;
    public final C50345JpN LJLJLLL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLJLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSearchRSReportPanelMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJL = "";
        this.LJLJJLL = "";
        this.LJLJL = "";
        this.LJLJLJ = "showSearchRSReportPanel";
        this.LJLJLLL = new C50345JpN(contextProviderFactory, "showSearchRSReportPanel", EnumC50341JpJ.STABLE);
    }

    public final void LIZLLL(String str) {
        C49702Jf0 c49702Jf0 = new C49702Jf0();
        c49702Jf0.LJIIZILJ("raw_query", this.LJLILLLLZI);
        c49702Jf0.LJIIZILJ("words_content", this.LJLJI);
        c49702Jf0.LJJIIJZLJL(Integer.valueOf(this.LJLJJI));
        c49702Jf0.LJIIZILJ("impr_id", this.LJLJJL);
        c49702Jf0.LJIIZILJ("group_id", this.LJLJJLL);
        c49702Jf0.LJIIZILJ("words_source", this.LJLJL);
        c49702Jf0.LJ("feedback_id", str, InterfaceC1798974f.LIZ);
        c49702Jf0.LJIILIIL();
    }

    public final void LIZJ(String str, String str2) {
        C49699Jex c49699Jex = new C49699Jex();
        c49699Jex.LJIIZILJ("raw_query", this.LJLILLLLZI);
        c49699Jex.LJIIZILJ("words_content", this.LJLJI);
        c49699Jex.LJJIIJZLJL(Integer.valueOf(this.LJLJJI));
        c49699Jex.LJIIZILJ("impr_id", this.LJLJJL);
        c49699Jex.LJIIZILJ("group_id", this.LJLJJLL);
        c49699Jex.LJIIZILJ("button_type", str);
        c49699Jex.LJIIZILJ("words_source", this.LJLJL);
        c49699Jex.LJ("feedback_id", str2, InterfaceC1798974f.LIZ);
        c49699Jex.LJIILIIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: Exception -> 0x0125, TryCatch #0 {Exception -> 0x0125, blocks: (B:7:0x0014, B:9:0x001f, B:11:0x0027, B:12:0x002b, B:14:0x0033, B:15:0x0037, B:17:0x008a, B:19:0x00a2, B:20:0x00b1, B:22:0x0119, B:24:0x011f), top: B:6:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[Catch: Exception -> 0x0125, TryCatch #0 {Exception -> 0x0125, blocks: (B:7:0x0014, B:9:0x001f, B:11:0x0027, B:12:0x002b, B:14:0x0033, B:15:0x0037, B:17:0x008a, B:19:0x00a2, B:20:0x00b1, B:22:0x0119, B:24:0x011f), top: B:6:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r10, X.InterfaceC37146Ehy r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.ShowSearchRSReportPanelMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
