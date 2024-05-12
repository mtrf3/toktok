package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftDBExt$getExpiredPublishedDrafts$2", f = "DraftDBExt.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GO7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<AwemeDraft>>, Object> {
    public GO7(InterfaceC67352kd<? super GO7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GO7(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String LIZ = C61845OOz.LIZ("SELECT * FROM local_draft WHERE is_published = 1 and published_time < ", System.currentTimeMillis() - 259200000);
        ArrayList arrayList = new ArrayList();
        GPD.LJFF(LIZ, new AqS173S0100000_7(arrayList, (List<AutoCutThemeData>) 395));
        return arrayList;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<AwemeDraft>> interfaceC67352kd) {
        return new GO7(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
