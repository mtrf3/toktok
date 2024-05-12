package X;

import Y.IDComparatorS31S0000000_3;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Spw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73312Spw implements InterfaceC64715PaZ, InterfaceC199817sn, InterfaceC73592SuS {
    public static final C73312Spw LJLIL = new C73312Spw();

    @Override // X.InterfaceC64715PaZ
    public void LIZIZ() {
    }

    @Override // X.InterfaceC64715PaZ
    public String LIZJ(String url, Object... objArr) {
        o.LJIIIZ(url, "url");
        return url;
    }

    public static String LJFF(String str) {
        try {
            if (str.equals("/service/1/update_token/")) {
                str = "/cloudpush/update_token/";
            }
            if (str.equals("/cloudpush/update_sender/")) {
                str = "/cloudpush/update_sender/";
            }
            if (str.equals("/service/1/app_notice_status/")) {
                str = "/cloudpush/app_notice_status/";
            }
        } catch (Throwable unused) {
        }
        return "https://api-va.tiktokv.com".concat(str);
    }

    public static final void LJII(C73306Spq c73306Spq) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_wifi_slash;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        c73306Spq.LJFF = C1DD.LIZLLL(R.string.im9, "getApplicationContext().…g(R.string.network_error)");
        c73306Spq.LJI = C1DD.LIZLLL(R.string.cph, "getApplicationContext().…g(R.string.check_network)");
        c73306Spq.LJIIJ = C217288fs.LIZ;
    }

    public static final void LJIIIZ(C73306Spq c73306Spq) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_magnify_glass;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        c73306Spq.LJFF = C1DD.LIZLLL(R.string.h8z, "getApplicationContext().…ng.im_search_empty_title)");
        c73306Spq.LJI = C1DD.LIZLLL(R.string.h8y, "getApplicationContext().…ing.im_search_empty_desc)");
    }

    @Override // X.InterfaceC199817sn
    public java.util.Set LIZ(java.util.Set set) {
        final List list;
        Collection items;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC199697sb interfaceC199697sb = (InterfaceC199697sb) it.next();
            final C191717fj c191717fj = null;
            if (interfaceC199697sb != null && (items = interfaceC199697sb.getItems()) != null) {
                list = ORZ.LLILII(new IDComparatorS31S0000000_3(9), items);
            } else {
                list = null;
            }
            if (interfaceC199697sb != null) {
                c191717fj = interfaceC199697sb.getPosition();
            }
            o.LJI(c191717fj);
            o.LJI(list);
            linkedHashSet.add(new InterfaceC199697sb<T>(c191717fj, list) { // from class: X.7se
                public final C191717fj LIZ;
                public final Collection<T> LIZIZ;

                @Override // X.InterfaceC199697sb
                public final int getSize() {
                    return this.LIZIZ.size();
                }

                public final int hashCode() {
                    return this.LIZIZ.hashCode() + this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("CopyCluster, list=");
                    LIZ.append(this.LIZIZ);
                    return X1D.LIZIZ(LIZ);
                }

                @Override // X.InterfaceC199697sb
                public final Collection<T> getItems() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC199697sb
                public final C191717fj getPosition() {
                    return this.LIZ;
                }

                public final boolean equals(Object obj) {
                    if (obj == null || !(obj instanceof InterfaceC199697sb)) {
                        return false;
                    }
                    InterfaceC199697sb interfaceC199697sb2 = (InterfaceC199697sb) obj;
                    if (!o.LJ(interfaceC199697sb2.getPosition(), this.LIZ) || !o.LJ(interfaceC199697sb2.getItems(), this.LIZIZ)) {
                        return false;
                    }
                    return true;
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = c191717fj;
                    this.LIZIZ = list;
                }
            });
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC64715PaZ
    public String LIZLLL(String url) {
        o.LJIIIZ(url, "url");
        if (s.LJJJLZIJ(url, "/get_domains/", false) || s.LJJJLZIJ(url, "/ttnet_crash/", false)) {
            String LIZIZ = QJY.LIZIZ(url, true);
            o.LJIIIIZZ(LIZIZ, "addCommonParams(url, isApi)");
            return LIZIZ;
        }
        return url;
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 0) {
            return true;
        }
        return false;
    }

    public static final TMK LJ(InterfaceC148845sm asIntensitySource, InterfaceC122704ri getter) {
        o.LJIIIZ(asIntensitySource, "$this$asIntensitySource");
        o.LJIIIZ(getter, "getter");
        return new TMK(asIntensitySource, getter);
    }

    public static final void LJI(C73306Spq c73306Spq, InterfaceC65784Pro interfaceC65784Pro) {
        LJII(c73306Spq);
        c73306Spq.LJII = new AqS178S0100000_12(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 479);
    }

    public static final void LJIIJ(C73306Spq c73306Spq, InterfaceC65784Pro interfaceC65784Pro) {
        c73306Spq.LJFF = C1DD.LIZLLL(R.string.f3g, "getApplicationContext().….ec_pdp_error_server_tle)");
        c73306Spq.LJI = C1DD.LIZLLL(R.string.f3f, "getApplicationContext().…ec_pdp_error_server_desc)");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_large_error_robot;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        c73306Spq.LJII = new AqS178S0100000_12(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 479);
        c73306Spq.LJIIJ = C217288fs.LIZ;
    }

    public static final void LJIIJJI(C73306Spq c73306Spq, final InterfaceC65784Pro interfaceC65784Pro) {
        String LIZLLL = C1DD.LIZLLL(R.string.hvg, "getApplicationContext().…string.load_status_error)");
        T5R t5r = new T5R(LIZLLL);
        t5r.LIZ(51);
        t5r.setSpan(new AnonymousClass899() { // from class: X.9a3
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                interfaceC65784Pro.invoke();
            }
        }, 0, LIZLLL.length(), 18);
        c73306Spq.LJI = t5r;
        c73306Spq.LJIIJ = C217288fs.LIZ;
    }

    public static void LJIIIIZZ(C73306Spq c73306Spq, String title, String message, int i, InterfaceC65784Pro interfaceC65784Pro, int i2) {
        int i3;
        int i4;
        int i5 = i2 & 4;
        Double valueOf = Double.valueOf(72.0d);
        if (i5 != 0) {
            i3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
        } else {
            i3 = 0;
        }
        if ((i2 & 8) != 0) {
            i4 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
        } else {
            i4 = 0;
        }
        if ((i2 & 16) != 0) {
            i = R.raw.icon_large_refresh;
        }
        o.LJIIIZ(title, "title");
        o.LJIIIZ(message, "message");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZIZ = c2068389v;
        c73306Spq.LIZLLL = i3;
        c73306Spq.LJ = i4;
        c73306Spq.LJFF = title;
        c73306Spq.LJI = message;
        c73306Spq.LJIIIIZZ = new AqS178S0100000_12(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 478);
    }
}
