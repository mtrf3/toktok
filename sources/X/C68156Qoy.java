package X;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: X.Qoy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68156Qoy extends AbstractRunnableC68155Qox {
    public final /* synthetic */ String LJLJJL = null;
    public final /* synthetic */ String LJLJJLL = null;
    public final /* synthetic */ Context LJLJL;
    public final /* synthetic */ Bundle LJLJLJ;
    public final /* synthetic */ C68074Qne LJLJLLL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        try {
            String str4 = this.LJLJJL;
            if (this.LJLJJLL != null && str4 != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                    z = true;
                }
            }
            z = false;
            InterfaceC68207Qpn interfaceC68207Qpn = null;
            if (!z) {
                str3 = null;
                str2 = null;
                str = null;
            } else {
                str = this.LJLJJLL;
                str2 = this.LJLJJL;
                str3 = this.LJLJLLL.LIZ;
            }
            QH7.LJIIIIZZ(this.LJLJL);
            C68074Qne c68074Qne = this.LJLJLLL;
            Context context = this.LJLJL;
            c68074Qne.getClass();
            try {
                interfaceC68207Qpn = AbstractBinderC68208Qpo.asInterface(DynamiteModule.LIZLLL(context, DynamiteModule.LIZJ, "com.google.android.gms.measurement.dynamite").LIZJ("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (C68460Qts e) {
                c68074Qne.LIZ(e, true, false);
            }
            c68074Qne.LJI = interfaceC68207Qpn;
            if (this.LJLJLLL.LJI == null) {
                return;
            }
            int LIZIZ = DynamiteModule.LIZIZ(this.LJLJL, "com.google.android.gms.measurement.dynamite");
            int LJ = DynamiteModule.LJ(this.LJLJL, "com.google.android.gms.measurement.dynamite", false);
            int max = Math.max(LIZIZ, LJ);
            if (LJ < LIZIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            zzcl zzclVar = new zzcl(64000L, max, z2, str3, str2, str, this.LJLJLJ, C68053QnJ.LIZ(this.LJLJL));
            InterfaceC68207Qpn interfaceC68207Qpn2 = this.LJLJLLL.LJI;
            QH7.LJIIIIZZ(interfaceC68207Qpn2);
            interfaceC68207Qpn2.initialize(new BinderC68153Qov(this.LJLJL), zzclVar, this.LJLIL);
        } catch (Exception e2) {
            this.LJLJLLL.LIZ(e2, true, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68156Qoy(C68074Qne c68074Qne, Context context, Bundle bundle) {
        super(c68074Qne, true);
        this.LJLJLLL = c68074Qne;
        this.LJLJL = context;
        this.LJLJLJ = bundle;
    }
}
