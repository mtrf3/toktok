package com.ss.android.ugc.aweme.effectcreator.text;

import X.C93569aSz;
import X.EnumC93888aY8;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit;
import com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TextEditImpl implements ITextEdit {
    public static final C93569aSz Companion = new C93569aSz();
    public static final MutableLiveData<EnumC93888aY8> textPageState = new MutableLiveData<>();

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit
    public LiveData<EnumC93888aY8> getPageState() {
        return textPageState;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(10:(1:(1:5))(1:32)|6|7|8|(1:10)(2:25|(1:30)(1:29))|11|12|(1:(1:(2:16|(1:18)))(1:22))(1:23)|19|20)|33|6|7|8|(0)(0)|11|12|(0)(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:8:0x0031, B:10:0x003a, B:25:0x003f, B:27:0x0047, B:29:0x0059, B:30:0x004f), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:8:0x0031, B:10:0x003a, B:25:0x003f, B:27:0x0047, B:29:0x0059, B:30:0x004f), top: B:7:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.bytedance.router.SmartRoute addTextParams(com.bytedance.router.SmartRoute r7, com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel r8) {
        /*
            r6 = this;
            java.lang.String r1 = r8.text
            java.lang.String r0 = "key_text"
            r7.withParam(r0, r1)
            X.aSz r1 = com.ss.android.ugc.aweme.effectcreator.text.TextEditImpl.Companion
            com.bytedance.effectcreatormobile.ckeapi.api.text.TextAlign r0 = r8.textAlign
            r1.getClass()
            int[] r1 = X.C93568aSy.LIZIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r3 = 3
            r4 = 1
            r2 = 2
            if (r0 == r4) goto L1f
            if (r0 == r2) goto L2f
            if (r0 == r3) goto L2d
        L1f:
            r1 = 2
        L20:
            java.lang.String r0 = "key_aline"
            r7.withParam(r0, r1)
            java.lang.String r5 = r8.color
            java.lang.String r0 = "$this$toColorInt"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            goto L31
        L2d:
            r1 = 3
            goto L20
        L2f:
            r1 = 1
            goto L20
        L31:
            java.lang.String r0 = "#"
            r1 = 0
            boolean r0 = ujb.o.LJJJLIIL(r5, r0, r1)     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L3f
            int r1 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Exception -> L5e
            goto L5f
        L3f:
            java.lang.String r0 = "0x"
            boolean r0 = ujb.o.LJJJLIIL(r5, r0, r1)     // Catch: java.lang.Exception -> L5e
            if (r0 != 0) goto L4f
            java.lang.String r0 = "0X"
            boolean r0 = ujb.o.LJJJLIIL(r5, r0, r1)     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L59
        L4f:
            r0 = 16
            X.C17N.LJIIJ(r0)     // Catch: java.lang.Exception -> L5e
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r5, r0)     // Catch: java.lang.Exception -> L5e
            goto L5f
        L59:
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r5)     // Catch: java.lang.Exception -> L5e
            goto L5f
        L5e:
            r1 = -1
        L5f:
            java.lang.String r0 = "key_color"
            r7.withParam(r0, r1)
            java.lang.String r1 = "key_font"
            java.lang.String r0 = r8.fontId
            r7.withParam(r1, r0)
            X.aSz r1 = com.ss.android.ugc.aweme.effectcreator.text.TextEditImpl.Companion
            com.bytedance.effectcreatormobile.ckeapi.api.text.TextStyle r0 = r8.style
            r1.getClass()
            int[] r1 = X.C93568aSy.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L8c
            if (r0 == r2) goto L8a
            if (r0 == r3) goto L84
            r3 = 4
            if (r0 == r3) goto L84
            r3 = -1
        L84:
            java.lang.String r0 = "key_mode"
            r7.withParam(r0, r3)
            return r7
        L8a:
            r3 = 2
            goto L84
        L8c:
            r3 = 1
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectcreator.text.TextEditImpl.addTextParams(com.bytedance.router.SmartRoute, com.bytedance.effectcreatormobile.ckeapi.api.text.TextModel):com.bytedance.router.SmartRoute");
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit
    public void openTextEditor(Activity activity, int i, TextModel textModel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(textModel, "textModel");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//effect_creator/textedit");
        o.LJIIIIZZ(buildRoute, "buildRoute(activity, ROUTE_TEXT_EDIT)");
        addTextParams(buildRoute, textModel);
        buildRoute.open(i);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit
    public void openTextEditor(Fragment fragment, int i, TextModel textModel) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(textModel, "textModel");
        SmartRoute buildFragmentRoute = SmartRouter.buildFragmentRoute(fragment, "//effect_creator/textedit");
        o.LJIIIIZZ(buildFragmentRoute, "buildFragmentRoute(fragment, ROUTE_TEXT_EDIT)");
        addTextParams(buildFragmentRoute, textModel);
        buildFragmentRoute.open(i);
    }
}
