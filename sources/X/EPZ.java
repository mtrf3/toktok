package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffects$2", f = "MobileEffectUploader.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EPZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends Boolean>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ List<UploadableMobileEffect> LJLJI;
    public final /* synthetic */ C36370EPe LJLJJI;
    public final /* synthetic */ UploadImageConfig LJLJJL;
    public final /* synthetic */ UploadImageConfig LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPZ(List<UploadableMobileEffect> list, C36370EPe c36370EPe, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC67352kd<? super EPZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = list;
        this.LJLJJI = c36370EPe;
        this.LJLJJL = uploadImageConfig;
        this.LJLJJLL = uploadImageConfig2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        EPZ epz = new EPZ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        epz.LJLILLLLZI = obj;
        return epz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            List<UploadableMobileEffect> list = this.LJLJI;
            ArrayList arrayList = new ArrayList();
            for (UploadableMobileEffect uploadableMobileEffect : list) {
                UploadableMobileEffect uploadableMobileEffect2 = uploadableMobileEffect;
                boolean exists = new File(uploadableMobileEffect2.zipFilePath).exists();
                boolean exists2 = new File(uploadableMobileEffect2.iconFilePath).exists();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("upload effect, effectId=");
                LIZ.append(uploadableMobileEffect2.effectId);
                LIZ.append(", zipExist=");
                LIZ.append(exists);
                LIZ.append(", iconExist=");
                LIZ.append(exists2);
                H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
                if (exists && exists2) {
                    arrayList.add(uploadableMobileEffect);
                }
            }
            C36370EPe c36370EPe = this.LJLJJI;
            UploadImageConfig uploadImageConfig = this.LJLJJL;
            UploadImageConfig uploadImageConfig2 = this.LJLJJLL;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(XKX.LIZIZ(interfaceC70422pa, null, null, new C36366EPa(c36370EPe, (UploadableMobileEffect) it.next(), uploadImageConfig, uploadImageConfig2, null), 3));
            }
            this.LJLIL = 1;
            obj = T1W.LIZ(arrayList2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends Boolean>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
