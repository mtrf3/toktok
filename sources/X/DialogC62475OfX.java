package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OfX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class DialogC62475OfX extends DialogC62478Ofa {
    public final Context LJLJJI;
    public final C62387Oe7 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public DialogInterface.OnShowListener LJLJLLL;
    public boolean LJLL;
    public final String[] LJLLI;
    public Object LJLLILLLL;

    @Override // android.app.Dialog
    public final void show() {
        C62468OfQ.LIZLLL(false);
        if (C62468OfQ.LIZJ == 0) {
            C62468OfQ.LIZJ = System.currentTimeMillis();
        }
        if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/share/core/ui/DirectionDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "979214559195619380")).LIZ) {
            super.show();
        }
        LJJ();
    }

    public final boolean LJIL() {
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg == null || !interfaceC62484Ofg.LJIIL(this.LJLJJL.LJIIJ)) {
            return false;
        }
        return true;
    }

    public final void LJJ() {
        ActivityC45651qj LJJIFFI;
        OVT ovt = C62494Ofq.LJI;
        int i = 0;
        if (ovt != null && ovt.LIZIZ(this.LJLJLJ) && (LJJIFFI = C45804HyK.LJJIFFI(this.LJLJJI)) != null) {
            OVT ovt2 = C62494Ofq.LJI;
            if (ovt2 != null) {
                i = ovt2.LIZLLL(LJJIFFI);
            }
            ViewGroup.LayoutParams layoutParams = findViewById(R.id.juh).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(C86793Y4n.LJIILIIL(64.0d) + i);
            findViewById(R.id.juh).setLayoutParams(marginLayoutParams);
        }
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        InterfaceC62545Ogf interfaceC62545Ogf;
        super.dismiss();
        C62387Oe7 c62387Oe7 = this.LJLJJL;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LJ(this.LJLJJI, c62387Oe7.LJIIJ);
        }
        Object obj = this.LJLLILLLL;
        if (obj != null && (interfaceC62545Ogf = C62494Ofq.LIZLLL) != null) {
            interfaceC62545Ogf.LIZ(obj);
        }
        C62468OfQ.LJIJ = false;
    }

    public final void LJIJJLI(boolean z) {
        C61820OOa c61820OOa = C61822OOc.LIZ;
        PNP share_panel_root_layout = (PNP) findViewById(R.id.juh);
        o.LJIIIIZZ(share_panel_root_layout, "share_panel_root_layout");
        boolean z2 = this.LJLJLJ;
        BaseSharePackage baseSharePackage = this.LJLJJL.LJIIJ;
        c61820OOa.getClass();
        C61820OOa.LIZ(this, share_panel_root_layout, z, z2, baseSharePackage);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    @Override // X.DialogC62478Ofa, X.C18Z, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC62475OfX.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.LJLJLLL = onShowListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC62475OfX(android.content.Context r5, int r6, X.C62387Oe7 r7) {
        /*
            r4 = this;
            java.lang.String r0 = "ctx"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.OVT r2 = X.C62494Ofq.LJI
            r1 = 1
            if (r2 == 0) goto L42
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r7.LJIIJ
            boolean r0 = r0.LJIILJJIL()
            boolean r0 = r2.LIZIZ(r0)
            if (r0 != r1) goto L42
            X.Oir r0 = new X.Oir
            r0.<init>()
        L1b:
            r4.<init>(r5, r0, r7, r6)
            r4.LJLJJI = r5
            r4.LJLJJL = r7
            kotlin.jvm.internal.AqS160S0100000_10 r1 = new kotlin.jvm.internal.AqS160S0100000_10
            r0 = 594(0x252, float:8.32E-43)
            r1.<init>(r4, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r4.LJLJJLL = r0
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r7.LJIIJ
            boolean r0 = r0.LJIIJ()
            r4.LJLJL = r0
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r7.LJIIJ
            boolean r0 = r0.LJIILJJIL()
            r4.LJLJLJ = r0
            java.lang.String[] r3 = X.C62543Ogd.LIZ
            goto L56
        L42:
            com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r0 = r7.LJIIJ
            boolean r0 = r0.LJIIJ()
            if (r0 == 0) goto L50
            X.Ojm r0 = new X.Ojm
            r0.<init>()
            goto L1b
        L50:
            X.Oiq r0 = new X.Oiq
            r0.<init>()
            goto L1b
        L56:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "landscape_share_forbid_list"
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.Object r1 = r2.LJIIIIZZ(r1, r0, r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L6b
            int r0 = r1.length     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r3 = r1
        L6b:
            r4.LJLLI = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC62475OfX.<init>(android.content.Context, int, X.Oe7):void");
    }
}
