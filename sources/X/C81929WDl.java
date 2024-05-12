package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.WDl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81929WDl extends AbstractC72439Sbr {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final C3VM LJLJI;
    public final InterfaceC88471Ynr<android.net.Uri, View, C76800UCe> LJLJJI;
    public final InterfaceC88474Ynu<android.net.Uri, View, C2047581v, Animatable, C76800UCe> LJLJJL;
    public final InterfaceC88473Ynt<android.net.Uri, View, Throwable, C76800UCe> LJLJJLL;
    public final C62822Ol8 LJLJL;

    public C81929WDl() {
        this(null, false, null, null, null, 63);
    }

    public final String LIZ() {
        return (String) this.LJLJL.getValue();
    }

    @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public void T1(android.net.Uri uri, SmartImageView smartImageView) {
        C3UX c84733Uf;
        this.LJLJJI.invoke(uri, smartImageView);
        if (C64861Pcv.LIZ(this.LJLIL)) {
            String keyForPerfEvent = LIZ();
            o.LJIIIIZZ(keyForPerfEvent, "keyForPerfEvent");
            c84733Uf = new C4PF(keyForPerfEvent);
        } else {
            String keyForPerfEvent2 = LIZ();
            o.LJIIIIZZ(keyForPerfEvent2, "keyForPerfEvent");
            c84733Uf = new C84733Uf(keyForPerfEvent2);
        }
        this.LJLJI.LIZIZ(c84733Uf, true);
    }

    @Override // X.InterfaceC70769Rq1
    public void s2(android.net.Uri uri, View view, Throwable th) {
        C3UX c84733Uf;
        String str;
        String str2;
        this.LJLJJLL.invoke(uri, view, th);
        if (C64861Pcv.LIZ(this.LJLIL)) {
            String keyForPerfEvent = LIZ();
            o.LJIIIIZZ(keyForPerfEvent, "keyForPerfEvent");
            c84733Uf = new C4PF(keyForPerfEvent);
        } else {
            String keyForPerfEvent2 = LIZ();
            o.LJIIIIZZ(keyForPerfEvent2, "keyForPerfEvent");
            c84733Uf = new C84733Uf(keyForPerfEvent2);
        }
        C3VM c3vm = this.LJLJI;
        String str3 = this.LJLIL;
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        String LIZJ = C64861Pcv.LIZJ(th);
        if (uri == null || (str2 = uri.toString()) == null) {
            str2 = "empty url";
        }
        c3vm.LIZ(c84733Uf, new C30J(str3, str, false, false, LIZJ, C64861Pcv.LIZIZ(str2, th), 0, 0, this.LJLILLLLZI, 7));
    }

    @Override // X.InterfaceC70769Rq1
    public void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        C3UX c84733Uf;
        boolean z;
        int i;
        int i2;
        String str;
        this.LJLJJL.invoke(uri, view, c2047581v, animatable);
        if (C64861Pcv.LIZ(this.LJLIL)) {
            String keyForPerfEvent = LIZ();
            o.LJIIIIZZ(keyForPerfEvent, "keyForPerfEvent");
            c84733Uf = new C4PF(keyForPerfEvent);
        } else {
            String keyForPerfEvent2 = LIZ();
            o.LJIIIIZZ(keyForPerfEvent2, "keyForPerfEvent");
            c84733Uf = new C84733Uf(keyForPerfEvent2);
        }
        C3VM c3vm = this.LJLJI;
        if (animatable != null) {
            z = true;
        } else {
            z = false;
        }
        if (c2047581v != null) {
            i = c2047581v.LIZ;
            i2 = c2047581v.LIZIZ;
        } else {
            i = 0;
            i2 = 0;
        }
        if (uri == null || (str = uri.toString()) == null) {
            str = "";
        }
        c3vm.LIZ(c84733Uf, new C30J(this.LJLIL, str, z, true, null, null, i, i2, this.LJLILLLLZI, 384));
    }

    public C81929WDl(String scene, boolean z, C3VM durationPerfMon, InterfaceC88474Ynu onComplete, InterfaceC88473Ynt onFailed, int i) {
        C81931WDn onStart;
        scene = (i & 1) != 0 ? "" : scene;
        z = (i & 2) != 0 ? false : z;
        durationPerfMon = (i & 4) != 0 ? C84683Ua.LJFF : durationPerfMon;
        if ((i & 8) != 0) {
            onStart = C81931WDn.LJLIL;
        } else {
            onStart = null;
        }
        onComplete = (i & 16) != 0 ? C81930WDm.LJLIL : onComplete;
        onFailed = (i & 32) != 0 ? C81372Vwe.LJLIL : onFailed;
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(durationPerfMon, "durationPerfMon");
        o.LJIIIZ(onStart, "onStart");
        o.LJIIIZ(onComplete, "onComplete");
        o.LJIIIZ(onFailed, "onFailed");
        this.LJLIL = scene;
        this.LJLILLLLZI = z;
        this.LJLJI = durationPerfMon;
        this.LJLJJI = onStart;
        this.LJLJJL = onComplete;
        this.LJLJJLL = onFailed;
        this.LJLJL = C221108m2.LIZIZ(C63894P5u.LJLIL);
    }
}
