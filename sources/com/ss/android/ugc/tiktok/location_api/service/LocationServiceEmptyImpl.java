package com.ss.android.ugc.tiktok.location_api.service;

import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C113554cx;
import X.C85258Xd8;
import X.EE1;
import X.InterfaceC54674Ld0;
import X.InterfaceC56182M3e;
import X.InterfaceC85311Xdz;
import X.J0X;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LocationServiceEmptyImpl implements ILocationService {
    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LIZLLL() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJ() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJFF() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJI(Fragment fragment, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJII() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final EE1 LJIIIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final View LJIIJ(Context context, ViewGroup viewGroup) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(viewGroup, "viewGroup");
        return null;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIJJI(View view) {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIL(Context context, View view, AqS158S0100000_8 aqS158S0100000_8) {
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC56180M3c
    public final boolean LJIILIIL(String str, String str2) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIILL() {
    }

    @Override // X.InterfaceC56180M3c
    public final boolean LJIILLIIL(int i, Context context) {
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final boolean LJIJ(String... strArr) {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> LIZIZ() {
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.tiktok.location_api.service.ILocationService
    public final Map<String, String> getLocationCommonParamsIfHave() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIIIIZZ(String business, String scene, Cert bpeaCert, Cert decryptCert, InterfaceC56182M3e interfaceC56182M3e) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(bpeaCert, "bpeaCert");
        o.LJIIIZ(decryptCert, "decryptCert");
        interfaceC56182M3e.LIZ(new J0X("no service implementation", "", ""));
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIILJJIL(String business, String scene, TokenCert bpeaCert, TokenCert tokenCert, InterfaceC56182M3e interfaceC56182M3e, Long l) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(bpeaCert, "bpeaCert");
        if (interfaceC56182M3e != null) {
            interfaceC56182M3e.LIZ(new J0X("no service implementation", "", ""));
        }
    }

    @Override // X.InterfaceC56180M3c
    public final void LJIJI(String str, String scene, Cert cert, ActivityC45651qj activity, C85258Xd8 c85258Xd8, InterfaceC54674Ld0 interfaceC54674Ld0, InterfaceC85311Xdz interfaceC85311Xdz) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(cert, "cert");
        o.LJIIIZ(activity, "activity");
        if (interfaceC54674Ld0 != null) {
            interfaceC54674Ld0.LIZIZ(0, "empty impl");
        }
    }
}
