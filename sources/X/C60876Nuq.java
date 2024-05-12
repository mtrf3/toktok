package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Nuq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60876Nuq extends LynxViewClient {
    public final C60541NpR LIZ;
    public final IResourceLoaderService LIZIZ;
    public final InterfaceC60323Nlv LIZJ;
    public C60550Npa LIZLLL;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJ() {
        Iterator<LynxViewClient> it = this.LIZ.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJ();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        Iterator<LynxViewClient> it = this.LIZ.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJII();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        Iterator<LynxViewClient> it = this.LIZ.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJIIJJI();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        Iterator<LynxViewClient> it = this.LIZ.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIFFI() {
        Iterator<LynxViewClient> it = this.LIZ.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJJIFFI();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJZLJL() {
        Iterator<LynxViewClient> it = this.LIZ.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJJIIJZLJL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d2  */
    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60876Nuq.LIZIZ(java.lang.String):java.lang.String");
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        Iterator it = ((ArrayList) this.LIZ.LJLLI).iterator();
        while (it.hasNext()) {
            ((LynxViewClient) it.next()).LJI(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ(String str) {
        Iterator<LynxViewClient> it = this.LIZ.LJLLI.iterator();
        while (it.hasNext()) {
            it.next().LJIIJ(str);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        Iterator it = ((ArrayList) this.LIZ.LJLLI).iterator();
        while (it.hasNext()) {
            ((LynxViewClient) it.next()).LJIILL(str);
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (parse != null) {
            this.LIZLLL = new C60550Npa(parse);
        } else {
            o.LJIIZILJ();
            throw null;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        Iterator it = ((ArrayList) this.LIZ.LJLLI).iterator();
        while (it.hasNext()) {
            ((LynxViewClient) it.next()).LJIJ(lynxError);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIZ(LynxPerfMetric lynxPerfMetric) {
        Iterator it = ((ArrayList) this.LIZ.LJLLI).iterator();
        while (it.hasNext()) {
            ((LynxViewClient) it.next()).LJJIIZ(lynxPerfMetric);
        }
    }

    public C60876Nuq(C60541NpR c60541NpR, IResourceLoaderService iResourceLoaderService, InterfaceC60323Nlv interfaceC60323Nlv) {
        this.LIZ = c60541NpR;
        this.LIZIZ = iResourceLoaderService;
        this.LIZJ = interfaceC60323Nlv;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL(int i, String str, String str2) {
        Iterator it = ((ArrayList) this.LIZ.LJLLI).iterator();
        while (it.hasNext()) {
            ((LynxViewClient) it.next()).LJIILJJIL(i, str, str2);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient, X.InterfaceC79290V9y
    public final void LIZ(VNU vnu, String str, float f, float f2, C79286V9u c79286V9u) {
        Iterator it = ((ArrayList) this.LIZ.LJLLI).iterator();
        while (it.hasNext()) {
            ((LynxViewClient) it.next()).LIZ(vnu, str, f, f2, c79286V9u);
        }
    }
}
