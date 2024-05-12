package X;

import android.content.Context;
import android.view.View;
import com.google.gson.Gson;
import com.ss.android.ugc.asve.context.DropFrameParams;
import com.ss.android.ugc.gamora.editorpro.album.EditorProAlbumService;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;
import kotlin.jvm.internal.o;

/* renamed from: X.6n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170746n0 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r0v17, types: [X.6nD] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.6nE] */
    public static void LIZ(Context context) {
        if (C1280550v.LIZ().LIZJ) {
            return;
        }
        C170766n2 c170766n2 = new C170766n2();
        c170766n2.LIZJ = new C62228ObY();
        c170766n2.LIZLLL = new V3N();
        c170766n2.LJI = new InterfaceC170936nJ() { // from class: X.6nA
            {
                new Gson();
            }
        };
        c170766n2.LJ = new C1FP();
        c170766n2.LJFF = new C1A7();
        c170766n2.LJIIIIZZ = new InterfaceC1283852c() { // from class: X.54A
            @Override // X.InterfaceC1283852c
            public final void LIZ(View view, EnumC1284052e variant) {
                Context context2;
                o.LJIIIZ(variant, "variant");
                if (view == null || (context2 = view.getContext()) == null) {
                    return;
                }
                int i = C1284152f.LIZ[variant.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    new C61996OUu(context2).LIZ(3);
                    return;
                }
                new C61996OUu(context2).LIZ(0);
            }
        };
        c170766n2.LJII = new InterfaceC170916nH() { // from class: X.6nC
            @Override // X.InterfaceC170916nH
            public final void LIZ() {
                C171096nZ.LIZIZ(IAlbumService.class, new InterfaceC171106na() { // from class: X.6nB
                    @Override // X.InterfaceC171106na
                    public final Object create() {
                        return new EditorProAlbumService();
                    }
                });
            }
        };
        final ?? r3 = new Object() { // from class: X.6nE
        };
        String accessKey = C60903NvH.LJIIJJI().LJIJI().LIZLLL();
        o.LJIIIZ(accessKey, "accessKey");
        String appId = String.valueOf(1233);
        o.LJIIIZ(appId, "appId");
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        o.LJIIIIZZ(EF7.LIZLLL(), "getAPI().applicationService.appVersion");
        c170766n2.LIZIZ = new C84513XEv(new Object(r3) { // from class: X.6nD
        });
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJIIIIZZ(LLLLL, "context.applicationContext");
        c170766n2.LIZ = LLLLL;
        C170756n1 c170756n1 = new C170756n1(c170766n2);
        ((Boolean) C171016nR.LIZ.getValue()).booleanValue();
        ((Boolean) C170996nP.LIZ.getValue()).booleanValue();
        ((Boolean) C170956nL.LIZ.getValue()).booleanValue();
        AnonymousClass504.LIZ = ((Boolean) C52770KnO.LIZ.getValue()).booleanValue();
        ((Boolean) C170976nN.LIZ.getValue()).booleanValue();
        DropFrameParams value = (DropFrameParams) C170806n6.LIZIZ.getValue();
        o.LJIIIIZZ(value, "value");
        if (value.isSetParams()) {
            final boolean isSetParams = value.isSetParams();
            final long delayTime = value.getDelayTime();
            final int maxDropCount = (int) value.getMaxDropCount();
            new F9E(isSetParams, delayTime, maxDropCount) { // from class: X.2L8
                public final boolean LJLIL;
                public final long LJLILLLLZI;
                public final int LJLJI;

                @Override // X.F9E
                public final Object[] getObjects() {
                    return new Object[]{Boolean.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
                }

                {
                    this.LJLIL = isSetParams;
                    this.LJLILLLLZI = delayTime;
                    this.LJLJI = maxDropCount;
                }
            };
        }
        ((Boolean) C171076nX.LIZ.getValue()).booleanValue();
        C132955Jr.LIZ = true;
        AnonymousClass504.LIZIZ = ((Boolean) C171056nV.LIZ.getValue()).booleanValue();
        AnonymousClass504.LIZJ = ((Boolean) C171036nT.LIZ.getValue()).booleanValue();
        AnonymousClass504.LIZLLL = C5H0.LIZ;
        C147575qj LIZ2 = C1280550v.LIZ();
        LIZ2.getClass();
        if (LIZ2.LIZJ) {
            C131935Ft.LIZJ("EditorSDK redundant initV2");
            return;
        }
        Context context2 = c170756n1.LIZIZ;
        if (context2 != null) {
            if (c170756n1.LIZJ != null) {
                LIZ2.LIZIZ = c170756n1;
                LIZ2.LIZ = context2;
                Context context3 = LIZ2.LIZ().LIZIZ;
                if (context3 == null) {
                    context3 = context2;
                }
                C132105Gk.LIZ = context3;
                C16880lQ.LLLLL(context2);
                if (C170836n9.LIZ == -1) {
                    if (o.LJ("tiktok", "aweme")) {
                        C170836n9.LIZ(0);
                    } else {
                        C170836n9.LIZ(1);
                    }
                }
                C147595ql LIZ3 = C125444w8.LIZ();
                Context context4 = LIZ2.LIZ;
                if (context4 != null) {
                    Context LLLLL2 = C16880lQ.LLLLL(context4);
                    o.LJIIIIZZ(LLLLL2, "context.applicationContext");
                    LIZ3.getClass();
                    LIZ3.LIZ = LLLLL2;
                    InterfaceC170896nF interfaceC170896nF = c170756n1.LJ;
                    if (interfaceC170896nF != null) {
                        interfaceC170896nF.LIZIZ(C5BA.LIZIZ);
                        ((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_LOG, Boolean.TRUE)).booleanValue();
                        String LIZ4 = C6YK.LIZ(C5BA.LIZ);
                        if (LIZ4 != null) {
                            C131935Ft.LIZIZ("KVSettings", LIZ4);
                        }
                    }
                    InterfaceC170916nH interfaceC170916nH = c170756n1.LJFF;
                    if (interfaceC170916nH != null) {
                        interfaceC170916nH.LIZ();
                    }
                    LIZ2.LIZJ = true;
                    return;
                }
                o.LJIJI("context");
                throw null;
            }
            throw new IllegalStateException("image loader is null pls config it ");
        }
        throw new IllegalStateException("context is required.");
    }
}
