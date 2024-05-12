package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.6kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169416kr {
    public static InterfaceC84498XEg LIZLLL;
    public final String LIZ;
    public CategoryPageModel LIZIZ;
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C169496kz.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C169476kx.LJLIL);

    public C169416kr() {
        String str;
        C62A.LIZ.getClass();
        if (C62A.LIZLLL()) {
            str = "voiceconversion";
        } else {
            str = "voicechanger";
        }
        this.LIZ = str;
    }

    public static boolean LIZ(Effect effect) {
        InterfaceC84498XEg LIZIZ;
        if (C78949Uyf.LJJIII(effect)) {
            return true;
        }
        if (effect != null && (((LIZIZ = C166696gT.LIZIZ()) != null && LIZIZ.LJJIJLIJ(effect)) || effect.getEffectType() != 0)) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(final InterfaceC169456kv interfaceC169456kv) {
        CategoryPageModel categoryPageModel = this.LIZIZ;
        if (categoryPageModel != null && !C79004UzY.LJJIFFI(categoryPageModel.getUrl_prefix())) {
            interfaceC169456kv.LIZ(this.LIZIZ);
            return;
        }
        interfaceC169456kv.LIZJ();
        InterfaceC84498XEg LIZIZ = C166696gT.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LJJIIJZLJL(this.LIZ, new IFetchCategoryEffectListener() { // from class: X.6kt
                /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
                
                    if (r0 == null) goto L7;
                 */
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult r4) {
                    /*
                        r3 = this;
                        X.6kv r2 = r2
                        if (r2 == 0) goto L15
                        if (r4 == 0) goto L16
                        int r1 = r4.getErrorCode()
                        java.lang.String r0 = r4.getMsg()
                        if (r0 != 0) goto L12
                    L10:
                        java.lang.String r0 = ""
                    L12:
                        r2.LIZIZ(r1, r0)
                    L15:
                        return
                    L16:
                        r1 = 0
                        goto L10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C169436kt.onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel2) {
                    CategoryPageModel categoryPageModel3 = categoryPageModel2;
                    C169416kr.this.LIZIZ = categoryPageModel3;
                    InterfaceC169456kv interfaceC169456kv2 = interfaceC169456kv;
                    if (interfaceC169456kv2 != null) {
                        interfaceC169456kv2.LIZ(categoryPageModel3);
                    }
                }
            });
        }
    }
}
