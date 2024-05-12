package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.TemplateData;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NpN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60537NpN implements InterfaceC31964Cga {
    public static int LJIIIIZZ;
    public final C60379Nmp LIZ;
    public final VNS LIZIZ;
    public final C60541NpR LIZJ;
    public final IResourceLoaderService LIZLLL;
    public C60876Nuq LJ;
    public final C60888Nv2 LJFF;
    public final C60538NpO LJI;
    public final InterfaceC60323Nlv LJII;

    @Override // X.InterfaceC31964Cga
    public final void destroy() {
        String str;
        C60541NpR c60541NpR = this.LIZJ;
        if (c60541NpR != null && (str = c60541NpR.LJLILLLLZI) != null && str.length() != 0) {
            java.util.Map<String, Integer> map = C58311MuZ.LIZIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(str) != null) {
                Object obj = linkedHashMap.get(str);
                if (obj != null) {
                    int intValue = ((Number) obj).intValue() - 1;
                    if (intValue <= 0) {
                        ((ConcurrentHashMap) C58311MuZ.LIZ).remove(str);
                        map.remove(str);
                    } else {
                        map.put(str, Integer.valueOf(intValue));
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        VNS vns = this.LIZIZ;
        if (vns != null) {
            vns.destroy();
        }
    }

    @Override // X.InterfaceC31964Cga
    public final VNS LIZJ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    @Override // X.InterfaceC31964Cga
    public final void load(String url) {
        TemplateData LIZIZ;
        C31961CgX c31961CgX;
        o.LJIIJ(url, "url");
        if (this.LIZIZ != null) {
            if (this.LIZLLL == null) {
                C60541NpR c60541NpR = this.LIZJ;
                if (c60541NpR == null || (((c31961CgX = c60541NpR.LJLLL) == null || (LIZIZ = c31961CgX.LIZ) == null) && (LIZIZ = c60541NpR.LJLJLJ) == null)) {
                    LIZIZ = TemplateData.LIZIZ();
                }
                VNS vns = this.LIZIZ;
                if (vns != null) {
                    vns.renderTemplateUrl(url, LIZIZ);
                    return;
                }
                return;
            }
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = url;
            IResourceLoaderService iResourceLoaderService = this.LIZLLL;
            if (iResourceLoaderService == null) {
                return;
            }
            O1L o1l = new O1L(0);
            o1l.LJIIJJI = "template";
            o1l.LJIIJ = this.LJII;
            try {
                android.net.Uri uri = UriProtector.parse(url);
                o.LJFF(uri, "uri");
                o1l.LJIIL = new C60550Npa(uri);
                ?? queryParameter = UriProtector.getQueryParameter(uri, "surl");
                if (queryParameter != 0) {
                    o1l.LJII = queryParameter;
                    c68322mC.element = queryParameter;
                }
                String queryParameter2 = UriProtector.getQueryParameter(uri, "channel");
                if (queryParameter2 != null) {
                    o1l.LJ = queryParameter2;
                }
                String queryParameter3 = UriProtector.getQueryParameter(uri, "bundle");
                if (queryParameter3 != null) {
                    o1l.LJFF = queryParameter3;
                }
                o1l.LIZJ = 1;
                String queryParameter4 = UriProtector.getQueryParameter(uri, "dynamic");
                if (queryParameter4 != null) {
                    o1l.LIZJ = Integer.valueOf(CastIntegerProtector.parseInt(queryParameter4));
                }
            } catch (Throwable th) {
                C60379Nmp c60379Nmp = this.LIZ;
                c60379Nmp.getClass();
                C39973FmT.LIZJ(c60379Nmp, th, "lynxkit.load parse url error");
            }
            iResourceLoaderService.loadAsync(url, o1l, new AqS141S0200000_10(c68322mC, this, 1), new AqS176S0100000_10(this, 12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        if (r10.intValue() != r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C60537NpN(X.InterfaceC60323Nlv r12, X.C60379Nmp r13) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60537NpN.<init>(X.Nlv, X.Nmp):void");
    }

    @Override // X.InterfaceC31964Cga
    public final void LIZ(String str, JavaOnlyArray javaOnlyArray) {
        VNS vns = this.LIZIZ;
        if (vns != null) {
            vns.sendGlobalEvent(str, JavaOnlyArray.from(javaOnlyArray));
        }
    }
}
