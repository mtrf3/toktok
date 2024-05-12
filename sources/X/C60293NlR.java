package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NlR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60293NlR extends LynxViewClient {
    public android.net.Uri LIZ;
    public final /* synthetic */ C60292NlQ LIZIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        Long l;
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            ((InterfaceC60298NlW) it.next()).LJIIIIZZ(this.LIZIZ);
        }
        C60292NlQ c60292NlQ = this.LIZIZ;
        if (c60292NlQ.LLILII) {
            c60292NlQ.LLILII = false;
            c60292NlQ.LLIILII = System.currentTimeMillis();
            C60203Njz c60203Njz = (C60203Njz) c60292NlQ.LLF.LIZJ(C60203Njz.class);
            if (c60203Njz != null && (l = c60203Njz.LIZIZ) != null) {
                JSONObject LIZLLL = Q7K.LIZLLL("duration", System.currentTimeMillis() - l.longValue());
                InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(c60292NlQ, InterfaceC60276NlA.class);
                if (interfaceC60276NlA != null) {
                    C60547NpX c60547NpX = new C60547NpX("bdx_monitor_lynx_first_screen_duration", null, null, 254);
                    c60547NpX.LJII = LIZLLL;
                    c60547NpX.LIZJ = c60292NlQ.LJLLLLLL;
                    interfaceC60276NlA.LJ(c60547NpX);
                }
                InterfaceC60276NlA interfaceC60276NlA2 = (InterfaceC60276NlA) C60299NlX.LIZ(c60292NlQ, InterfaceC60276NlA.class);
                if (interfaceC60276NlA2 != null) {
                    C60547NpX c60547NpX2 = new C60547NpX("bdx_monitor_lynx_timeline", null, null, 254);
                    c60547NpX2.LIZJ = c60292NlQ.LJLLLLLL;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_to_start_render", c60203Njz.LIZLLL);
                    jSONObject.put("lynx_render", c60292NlQ.LLIILII - c60292NlQ.LLIIL);
                    jSONObject.put("resource_load", c60203Njz.LJI);
                    jSONObject.put("render_template_main", c60292NlQ.LLIILZL);
                    jSONObject.put("read_template", c60292NlQ.LLIIZ);
                    jSONObject.put("create_view_component", c60292NlQ.LLIL);
                    c60547NpX2.LJII = jSONObject;
                    interfaceC60276NlA2.LJ(c60547NpX2);
                }
            }
        }
        C39973FmT.LIZIZ(this.LIZIZ, "lynx client onFirstScreen", null, null, 6);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            ((InterfaceC60298NlW) it.next()).LJ(this.LIZIZ);
        }
        Iterator it2 = ((ArrayList) this.LIZIZ.LLFF).iterator();
        while (it2.hasNext()) {
            C60213Nk9 c60213Nk9 = (C60213Nk9) it2.next();
            android.net.Uri uri = this.LIZIZ.LLIIII;
            if (uri == null) {
                uri = android.net.Uri.EMPTY;
                o.LJFF(uri, "Uri.EMPTY");
            }
            c60213Nk9.LIZJ(uri);
        }
        C39973FmT.LIZIZ(this.LIZIZ, "lynx client onLoadSuccess", null, null, 6);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            ((InterfaceC60298NlW) it.next()).LJII(this.LIZIZ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        this.LIZIZ.LJIJI();
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            ((InterfaceC60298NlW) it.next()).LIZIZ(this.LIZIZ);
        }
        C39973FmT.LIZIZ(this.LIZIZ, "lynx client onRuntimeReady", null, null, 6);
    }

    public C60293NlR(C60292NlQ c60292NlQ) {
        this.LIZIZ = c60292NlQ;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            ((InterfaceC60298NlW) it.next()).LIZJ(this.LIZIZ, lynxPerfMetric.toJSONObject());
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ(String str) {
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            ((InterfaceC60298NlW) it.next()).LJI(this.LIZIZ, str);
        }
        this.LIZIZ.LLF.LIZJ(C60203Njz.class);
        IllegalStateException illegalStateException = new IllegalStateException(i0.LJFF("Lynx#onLoadFailed ", str));
        this.LIZIZ.be(illegalStateException);
        Iterator it2 = ((ArrayList) this.LIZIZ.LJLLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC88472Yns) it2.next()).invoke(illegalStateException);
        }
        C39973FmT.LIZIZ(this.LIZIZ, i0.LJFF("lynx client onLoadFailed on error:", str), null, null, 6);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        C60292NlQ c60292NlQ = this.LIZIZ;
        System.currentTimeMillis();
        c60292NlQ.getClass();
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            ((InterfaceC60298NlW) it.next()).LJIIIZ(this.LIZIZ);
        }
        this.LIZ = UriProtector.parse(str);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        C60213Nk9 c60213Nk9;
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            InterfaceC60298NlW interfaceC60298NlW = (InterfaceC60298NlW) it.next();
            C60292NlQ c60292NlQ = this.LIZIZ;
            lynxError.LIZ();
            interfaceC60298NlW.LJFF(c60292NlQ);
        }
        if (C47261Igj.LJJIJIIJI(100, 102, 103, 1201).contains(Integer.valueOf(lynxError.LIZ)) && this.LIZ != null) {
            C60292NlQ c60292NlQ2 = this.LIZIZ;
            if ((true ^ ((ArrayList) c60292NlQ2.LLFF).isEmpty()) && (c60213Nk9 = (C60213Nk9) ListProtector.get(c60292NlQ2.LLFF, 0)) != null) {
                android.net.Uri uri = this.LIZ;
                if (uri != null) {
                    c60213Nk9.LIZ(uri, new RuntimeException(lynxError.toString()));
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        C60292NlQ c60292NlQ3 = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynx client onReceivedError on error:");
        LIZ.append(lynxError);
        C39973FmT.LIZIZ(c60292NlQ3, X1D.LIZIZ(LIZ), null, null, 6);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(LynxPerfMetric lynxPerfMetric) {
        Iterator it = ((ArrayList) this.LIZIZ.LLII).iterator();
        while (it.hasNext()) {
            InterfaceC60298NlW interfaceC60298NlW = (InterfaceC60298NlW) it.next();
            C60292NlQ c60292NlQ = this.LIZIZ;
            lynxPerfMetric.toJSONObject();
            interfaceC60298NlW.LIZLLL(c60292NlQ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    public final void LIZ(VNU vnu, String str, float f, float f2, C79286V9u c79286V9u) {
        if (((ArrayList) this.LIZIZ.LLII).isEmpty()) {
            return;
        }
        C60292NlQ c60292NlQ = this.LIZIZ;
        C60296NlU c60296NlU = new C60296NlU(c60292NlQ, c60292NlQ.LLII);
        C60301NlZ c60301NlZ = new C60301NlZ(vnu, str, f, f2);
        AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(c79286V9u, 249);
        AqS52S1200000_10 aqS52S1200000_10 = new AqS52S1200000_10(this, c79286V9u, str, 13);
        Iterator<InterfaceC60298NlW> it = c60296NlU.LIZIZ.iterator();
        if (!it.hasNext()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("None of ILynxClientDelegate processor for image ");
            LIZ.append(c60301NlZ.LJLJI);
            aqS52S1200000_10.invoke(new Throwable(X1D.LIZIZ(LIZ)));
            return;
        }
        c60296NlU.LIZ(it, c60301NlZ, aqS176S0100000_10, aqS52S1200000_10);
    }
}
