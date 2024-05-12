package X;

import Y.IDObjectS383S0100000;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.0Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07500Re {
    public final EffectManager LIZ;

    public C07500Re() {
        EffectManager LJLJJLL = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        o.LJIIIIZZ(LJLJJLL, "getService(IHostCreative…class.java).effectManager");
        this.LIZ = LJLJJLL;
    }

    public final Object LIZ(Effect effect, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        this.LIZ.fetchEffect(effect, new IFetchEffectListener() { // from class: X.1kD
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect2) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect2) {
                InterfaceC67352kd<Boolean> interfaceC67352kd2 = c84654XKg;
                Boolean bool = Boolean.TRUE;
                C3C5.m7constructorimpl(bool);
                interfaceC67352kd2.resumeWith(bool);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect2, ExceptionResult e) {
                o.LJIIIZ(e, "e");
                InterfaceC67352kd<Boolean> interfaceC67352kd2 = c84654XKg;
                Boolean bool = Boolean.FALSE;
                C3C5.m7constructorimpl(bool);
                interfaceC67352kd2.resumeWith(bool);
            }
        });
        return c84654XKg.LIZ();
    }

    public final Object LIZLLL(String str, C3CS c3cs) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c3cs));
        this.LIZ.fetchEffectList(str, false, (IFetchEffectChannelListener) new IDObjectS383S0100000(c84654XKg, 0));
        return c84654XKg.LIZ();
    }

    public final Object LJ(String str, C3CS c3cs) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c3cs));
        this.LIZ.fetchEffectListFromCache(str, new IDObjectS383S0100000(c84654XKg, 1));
        return c84654XKg.LIZ();
    }

    public final Object LIZJ(String str, String str2, C3CS c3cs) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c3cs));
        this.LIZ.fetchCategoryEffectFromCache(str, str2, 0, 0, 0, CardStruct.IStatusCode.DEFAULT, new IFetchCategoryEffectListener() { // from class: X.1kH
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC67352kd<CategoryPageModel> interfaceC67352kd = c84654XKg;
                C3C5.m7constructorimpl(null);
                interfaceC67352kd.resumeWith(null);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                InterfaceC67352kd<CategoryPageModel> interfaceC67352kd = c84654XKg;
                C3C5.m7constructorimpl(categoryPageModel);
                interfaceC67352kd.resumeWith(categoryPageModel);
            }
        });
        return c84654XKg.LIZ();
    }

    public final Object LIZIZ(String str, String str2, java.util.Map map, C3CS c3cs) {
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c3cs));
        this.LIZ.fetchCategoryEffect(str, str2, 0, 0, 0, CardStruct.IStatusCode.DEFAULT, map, new IFetchCategoryEffectListener() { // from class: X.1kF
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC67352kd<CategoryPageModel> interfaceC67352kd = c84654XKg;
                C3C5.m7constructorimpl(null);
                interfaceC67352kd.resumeWith(null);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                InterfaceC67352kd<CategoryPageModel> interfaceC67352kd = c84654XKg;
                C3C5.m7constructorimpl(categoryPageModel);
                interfaceC67352kd.resumeWith(categoryPageModel);
            }
        });
        return c84654XKg.LIZ();
    }
}
