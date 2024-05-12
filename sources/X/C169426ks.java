package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: X.6ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169426ks {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C169506l0.LJLIL);
    public static InterfaceC84498XEg LIZJ;
    public CategoryPageModel LIZ;

    static {
        C221108m2.LIZIZ(C169486ky.LJLIL);
    }

    public final void LIZ(final InterfaceC169466kw interfaceC169466kw) {
        CategoryPageModel categoryPageModel = this.LIZ;
        if (categoryPageModel != null && !C79004UzY.LJJIFFI(categoryPageModel.getUrl_prefix())) {
            interfaceC169466kw.LIZ(this.LIZ);
            return;
        }
        interfaceC169466kw.LIZIZ();
        InterfaceC84498XEg LIZ = C150085um.LIZ();
        if (LIZ != null) {
            LIZ.LJJIIJZLJL("soundremix", new IFetchCategoryEffectListener() { // from class: X.6ku
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
                        X.6kw r2 = r2
                        if (r2 == 0) goto L15
                        if (r4 == 0) goto L16
                        int r1 = r4.getErrorCode()
                        java.lang.String r0 = r4.getMsg()
                        if (r0 != 0) goto L12
                    L10:
                        java.lang.String r0 = ""
                    L12:
                        r2.LIZJ(r1, r0)
                    L15:
                        return
                    L16:
                        r1 = 0
                        goto L10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C169446ku.onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel2) {
                    CategoryPageModel categoryPageModel3 = categoryPageModel2;
                    C169426ks.this.LIZ = categoryPageModel3;
                    InterfaceC169466kw interfaceC169466kw2 = interfaceC169466kw;
                    if (interfaceC169466kw2 != null) {
                        interfaceC169466kw2.LIZ(categoryPageModel3);
                    }
                }
            });
        }
    }
}
