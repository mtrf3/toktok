package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import fjb.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$createDraftEffect$2", f = "MyEffectsViewModel.kt", l = {182}, m = "invokeSuspend")
/* renamed from: X.ERy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36442ERy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super DraftEffect>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ CKEDraftInfoWrapper LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36442ERy(CKEDraftInfoWrapper cKEDraftInfoWrapper, String str, InterfaceC67352kd<? super C36442ERy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = cKEDraftInfoWrapper;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36442ERy(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String LIZIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                LIZIZ = (String) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJI.draftPath);
            LIZ.append('/');
            LIZ.append(this.LJLJI.effectPath);
            LIZIZ = X1D.LIZIZ(LIZ);
            Gson gson = GsonHolder.LIZLLL().LIZ();
            o.LJIIIIZZ(gson, "gson");
            this.LJLIL = LIZIZ;
            this.LJLILLLLZI = 1;
            obj = XKX.LJI(C78613UtF.LIZJ, new C63682ei(LIZIZ, gson, null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OSZ osz = (OSZ) obj;
        Throwable th = (Throwable) osz.getFirst();
        C61132ab c61132ab = (C61132ab) osz.getSecond();
        if (th != null || c61132ab == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parse effect error, zipPath=");
            LIZ2.append(this.LJLJI.effectPath);
            H78.LIZJ(X1D.LIZIZ(LIZ2));
            H78.LJ(th);
            return null;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("parse effect success, zipResult=");
        LIZ3.append(c61132ab);
        H78.LIZ(X1D.LIZIZ(LIZ3));
        DraftEffect draftEffect = new DraftEffect(this.LJLJI);
        String str = this.LJLJJI;
        CKEDraftInfoWrapper cKEDraftInfoWrapper = this.LJLJI;
        draftEffect.setEffectId(str);
        draftEffect.setName(cKEDraftInfoWrapper.name);
        String str2 = "";
        draftEffect.setZipPath("");
        draftEffect.setUnzipPath(LIZIZ);
        UrlModel urlModel = new UrlModel(null, 1, null);
        StringBuilder sb = new StringBuilder();
        sb.append(cKEDraftInfoWrapper.draftPath);
        sb.append(File.separator);
        String str3 = cKEDraftInfoWrapper.iconPath;
        if (str3.length() == 0) {
            str3 = cKEDraftInfoWrapper.defaultIconPath;
        }
        sb.append(str3);
        String uri = android.net.Uri.fromFile(new File(sb.toString())).toString();
        o.LJIIIIZZ(uri, "fromFile(File(draft.draf…              .toString()");
        urlModel.setUrlList(C47261Igj.LJJIJ(uri));
        draftEffect.setIconUrl(urlModel);
        draftEffect.setDownloaded(true);
        draftEffect.setEffectType(-1);
        List<String> list = c61132ab.LIZIZ;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        draftEffect.setTypes(list);
        draftEffect.setRequirements(c61132ab.LIZLLL);
        String str4 = c61132ab.LJI;
        if (str4 != null) {
            str2 = str4;
        }
        draftEffect.setSdkExtra(str2);
        draftEffect.setModelNames(c61132ab.LJ);
        EffectHintWrapper effectHintWrapper = cKEDraftInfoWrapper.effectHint;
        if (effectHintWrapper != null) {
            draftEffect.setHint(effectHintWrapper.hint);
            UrlModel urlModel2 = new UrlModel(null, 1, null);
            urlModel2.setUrlList(C47261Igj.LJJIJ(effectHintWrapper.hintIcon));
            draftEffect.setHint_icon(urlModel2);
            UrlModel urlModel3 = new UrlModel(null, 1, null);
            urlModel3.setUrlList(C47261Igj.LJJIJ(effectHintWrapper.hintFile));
            draftEffect.setHint_file(urlModel3);
            draftEffect.setHintFileFormat(effectHintWrapper.hintFileFormat);
        }
        return draftEffect;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super DraftEffect> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
