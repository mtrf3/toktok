package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.TTSFetchEffectAbilityFactory$getTTSFetchEffectAbility$1$fetchEffectsOnlyCategory$2", f = "TTSFetchEffectAbilityFactory.kt", l = {35, 50}, m = "invokeSuspend")
/* renamed from: X.5cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138925cm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public C138905ck LJLJI;
    public InterfaceC70422pa LJLJJI;
    public C34K LJLJJL;
    public Object LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public /* synthetic */ Object LJLJLLL;
    public final /* synthetic */ C138905ck LJLL;
    public final /* synthetic */ InterfaceC88472Yns<EffectCategoryModel, Boolean> LJLLI;
    public final /* synthetic */ List<List<ReadTextEffectBean>> LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C138925cm(C138905ck c138905ck, InterfaceC88472Yns<? super EffectCategoryModel, Boolean> interfaceC88472Yns, List<List<ReadTextEffectBean>> list, InterfaceC67352kd<? super C138925cm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLL = c138905ck;
        this.LJLLI = interfaceC88472Yns;
        this.LJLLILLLL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C138925cm c138925cm = new C138925cm(this.LJLL, this.LJLLI, this.LJLLILLLL, interfaceC67352kd);
        c138925cm.LJLJLLL = obj;
        return c138925cm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:6:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x012e -> B:9:0x0036). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138925cm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
