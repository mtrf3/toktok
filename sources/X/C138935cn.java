package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.TTSFetchEffectAbilityFactory$getTTSFetchEffectAbility$1$fetchEffectsOnlyCategory$2$1$1$1", f = "TTSFetchEffectAbilityFactory.kt", l = {44}, m = "invokeSuspend")
/* renamed from: X.5cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138935cn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<ReadTextEffectBean>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C138905ck LJLILLLLZI;
    public final /* synthetic */ EffectCategoryModel LJLJI;
    public final /* synthetic */ C34K LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C138935cn(C138905ck c138905ck, EffectCategoryModel effectCategoryModel, C34K c34k, InterfaceC67352kd<? super C138935cn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c138905ck;
        this.LJLJI = effectCategoryModel;
        this.LJLJJI = c34k;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C138935cn(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            C138905ck c138905ck = this.LJLILLLLZI;
            final EffectCategoryModel effectCategoryModel = this.LJLJI;
            boolean z = !this.LJLJJI.element;
            this.LJLIL = 1;
            InterfaceC84497XEf interfaceC84497XEf = c138905ck.LIZ;
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            IFetchCategoryEffectListener iFetchCategoryEffectListener = new IFetchCategoryEffectListener() { // from class: X.5cp
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC67352kd<List<ReadTextEffectBean>> interfaceC67352kd = c84654XKg;
                    ArrayList arrayList = new ArrayList();
                    C3C5.m7constructorimpl(arrayList);
                    interfaceC67352kd.resumeWith(arrayList);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffects;
                    List<Effect> effects;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    ArrayList arrayList = new ArrayList();
                    if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null) {
                        EffectCategoryModel category = effectCategoryModel;
                        for (Effect effect : effects) {
                            o.LJIIIZ(effect, "<this>");
                            o.LJIIIZ(category, "category");
                            try {
                                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = (ReadTextEffectSpeakerExtra) C82891Wg3.LIZJ().LJI(effect.getExtra(), ReadTextEffectSpeakerExtra.class);
                                if (readTextEffectSpeakerExtra == null) {
                                    readTextEffectSpeakerExtra = new ReadTextEffectSpeakerExtra(false, null, null, null, 0, 0, null, null, null, null, false, 0L, 0L, 8191, null);
                                } else {
                                    String name = effect.getName();
                                    o.LJIIIZ(name, "<set-?>");
                                    readTextEffectSpeakerExtra.speakerName = name;
                                }
                                ReadTextEffectBean readTextEffectBean = new ReadTextEffectBean(effect, readTextEffectSpeakerExtra);
                                readTextEffectBean.category = new TTSCategory(category.getId(), category.getName(), category.getExtra());
                                arrayList.add(readTextEffectBean);
                            } catch (Exception e) {
                                C82891Wg3.LIZLLL().LIZIZ(e);
                            }
                        }
                    }
                    InterfaceC67352kd<List<ReadTextEffectBean>> interfaceC67352kd = c84654XKg;
                    C3C5.m7constructorimpl(arrayList);
                    interfaceC67352kd.resumeWith(arrayList);
                }
            };
            if (z) {
                C84499XEh.LIZIZ(interfaceC84497XEf, "speaking-voice", effectCategoryModel.getKey(), 0, 0, 0, null, iFetchCategoryEffectListener);
            } else {
                C84499XEh.LIZ(0, 0, 0, iFetchCategoryEffectListener, interfaceC84497XEf, "speaking-voice", effectCategoryModel.getKey(), null, null, true);
            }
            obj2 = c84654XKg.LIZ();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<ReadTextEffectBean>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
