package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.template.AutoCutApplyAction$execute$2", f = "AutoCutApplyAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Hms, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45094Hms extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NLEModel LJLIL;
    public final /* synthetic */ C45233Hp7 LJLILLLLZI;
    public final /* synthetic */ CutsameDataItem LJLJI;
    public final /* synthetic */ AVMusic LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45094Hms(NLEModel nLEModel, C45233Hp7 c45233Hp7, CutsameDataItem cutsameDataItem, AVMusic aVMusic, InterfaceC67352kd<? super C45094Hms> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nLEModel;
        this.LJLILLLLZI = c45233Hp7;
        this.LJLJI = cutsameDataItem;
        this.LJLJJI = aVMusic;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45094Hms(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        NLEModel nLEModel = this.LJLIL;
        String str = null;
        if (nLEModel == null) {
            return null;
        }
        C45233Hp7 c45233Hp7 = this.LJLILLLLZI;
        CutsameDataItem cutsameDataItem = this.LJLJI;
        AVMusic aVMusic = this.LJLJJI;
        System.currentTimeMillis();
        C82632Wbs c82632Wbs = c45233Hp7.LJLJI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C45233Hp7.LJLJLLL;
        ((InterfaceC136985Ze) c82632Wbs.LIZ(c45233Hp7, interfaceC74236TBoArr[1])).i20();
        C63A c63a = C63A.ACTION_AI;
        long LJIILLIIL = C45087Hml.LJIILLIIL(nLEModel);
        String str2 = cutsameDataItem.templateId;
        int i = cutsameDataItem.templateType;
        if (aVMusic != null) {
            str = aVMusic.path;
        }
        C44716Hgm c44716Hgm = new C44716Hgm(c63a, 0, i, null, aVMusic, str, LJIILLIIL, nLEModel, str2, null, null, 7432);
        C45233Hp7.LJLJLJ.getClass();
        ((InterfaceC44717Hgn) c45233Hp7.LJLJJL.LIZ(c45233Hp7, interfaceC74236TBoArr[2])).oN(c44716Hgm);
        AutoCutThemeData LJII = C77119UOl.LJII(cutsameDataItem, c63a, 0, C45087Hml.LJIILL(false), true);
        AutoCutModel autoCutModel = c45233Hp7.LIZLLL().creativeModel.autoCutModel;
        o.LJIIIZ(autoCutModel, "<this>");
        ORS.LJJLIL(C44721Hgr.LJLIL, autoCutModel.templateList);
        ListProtector.add(autoCutModel.templateList, 0, LJII);
        c45233Hp7.LIZLLL().creativeModel.autoCutModel.clickFrom = "edit_page_tikbot";
        ((AnonymousClass637) c45233Hp7.LJLJJI.getValue()).LIZJ(c45233Hp7.LIZLLL());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
