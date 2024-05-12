package X;

import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: X.WbW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82610WbW implements IFetchCategoryEffectListener {
    public final /* synthetic */ C82609WbV LIZ;
    public final /* synthetic */ InterfaceC82611WbX LIZIZ;

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
            X.WbX r2 = r3.LIZIZ
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
        throw new UnsupportedOperationException("Method not decompiled: X.C82610WbW.onFail(com.ss.android.ugc.effectmanager.common.task.ExceptionResult):void");
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        CategoryPageModel categoryPageModel2 = categoryPageModel;
        this.LIZ.LIZIZ = categoryPageModel2;
        InterfaceC82611WbX interfaceC82611WbX = this.LIZIZ;
        if (interfaceC82611WbX != null) {
            interfaceC82611WbX.LIZ(categoryPageModel2);
        }
    }

    public C82610WbW(C82609WbV c82609WbV, InterfaceC82611WbX interfaceC82611WbX) {
        this.LIZ = c82609WbV;
        this.LIZIZ = interfaceC82611WbX;
    }
}
