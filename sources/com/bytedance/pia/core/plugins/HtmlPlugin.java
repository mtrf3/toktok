package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37238EjS;
import X.C37376Elg;
import X.C37377Elh;
import X.C37413EmH;
import X.C37461En3;
import X.C37499Enf;
import X.C37613EpV;
import X.C85693Xx;
import X.InterfaceC37454Emw;
import X.InterfaceC37464En6;
import Y.IDRunnableS6S0101000;
import android.net.Uri;
import com.bytedance.pia.core.setting.Settings;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.google.gson.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class HtmlPlugin extends AbstractC37502Eni {
    public final CountDownLatch LIZIZ;
    public volatile C37461En3 LIZJ;
    public C37377Elh LIZLLL;
    public boolean LJ;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "html";
    }

    @Override // X.AbstractC37502Eni
    public final void LIZIZ() {
        C37613EpV.LIZJ(new IDRunnableS6S0101000(4, this, 35));
    }

    @Override // X.AbstractC37502Eni, X.InterfaceC37489EnV
    public final void release() {
        this.LIZIZ.countDown();
    }

    public HtmlPlugin(C37499Enf c37499Enf) {
        super(c37499Enf);
        this.LIZIZ = new CountDownLatch(1);
        this.LIZLLL = null;
        this.LJ = false;
    }

    @Override // X.AbstractC37502Eni
    public final InterfaceC37464En6 LIZLLL(InterfaceC37454Emw interfaceC37454Emw) {
        Boolean bool;
        String LIZJ = C85693Xx.LIZJ(interfaceC37454Emw.getUrl(), null);
        if (LIZJ != null && LIZJ.equals(this.LIZ.LJFF) && interfaceC37454Emw.isForMainFrame()) {
            try {
                C37238EjS.LJI(6, "[HTML] Start intercepting main document.", null);
                Tracing.Event LIZ = this.LIZ.LJIILL.LIZ(EventName.ResourceInterceptStart);
                LIZ.args.put("url", interfaceC37454Emw.getUrl());
                LIZ.LIZ();
                this.LIZIZ.await(Settings.LIZ().htmlInterceptTimeout, TimeUnit.SECONDS);
                C37238EjS.LJI(6, "[HTML] Finish waiting response.", null);
                C37377Elh c37377Elh = this.LIZLLL;
                if (c37377Elh != null && (bool = c37377Elh.LIZJ.marked) != null && !bool.booleanValue() && !this.LJ) {
                    Uri uri = this.LIZ.LJ;
                    C37377Elh c37377Elh2 = this.LIZLLL;
                    o.LJIIJ(uri, "uri");
                    if (C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled && C37376Elg.LJ.get()) {
                        C37376Elg.LJ(uri, c37377Elh2, true);
                    }
                }
            } catch (Throwable unused) {
            }
            if (this.LIZJ != null) {
                C37238EjS.LJFF("[HTML] Intercept: " + interfaceC37454Emw.getUrl().toString());
                Tracing.Event LIZ2 = this.LIZ.LJIILL.LIZ(EventName.ResourceInterceptEnd);
                LIZ2.args.put("url", interfaceC37454Emw.getUrl());
                LIZ2.LIZ();
                C37238EjS.LJI(6, "[HTML] Finish intercepting main document.", null);
                return this.LIZJ;
            }
        }
        return null;
    }

    public final void LJII(String str, m mVar, Throwable th) {
        this.LIZIZ.countDown();
        this.LIZ.LJIILJJIL.LIZ(System.currentTimeMillis(), "pia_request_html_end");
        this.LIZ.LJIILL.LIZ(EventName.HTMLResponseEnd).LIZ();
        if (th != null) {
            C37238EjS.LIZLLL(4, "[Manifest] Request Manifest Error:", th);
        }
        if (str != null) {
            this.LIZ.LJIIJJI("event-on-html-ready", str);
        } else {
            this.LIZ.LJIIJJI("event-on-html-error", th);
        }
        if (mVar != null) {
            this.LIZ.LJIIJJI("event-on-manifest-in-html-ready", mVar);
        } else {
            this.LIZ.LJIIJJI("event-on-manifest-error", th);
        }
    }
}
