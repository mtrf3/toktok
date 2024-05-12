package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.templatedownload.TemplateProducer$resizeMediaData$2", f = "TemplateProducer.kt", l = {68}, m = "invokeSuspend")
/* renamed from: X.2n5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68872n5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ArrayList<NLETrackSlot>>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C5KH LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68872n5(Context context, C5KH c5kh, String str, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c5kh;
        this.LJLJJL = context;
        this.LJLJJLL = str;
        this.LJLJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68872n5(this.LJLJJL, this.LJLJJI, this.LJLJJLL, interfaceC67352kd, this.LJLJL);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C5KH c5kh = this.LJLJJI;
            Context context = this.LJLJJL;
            String str = this.LJLJJLL;
            boolean z = this.LJLJL;
            this.LJLIL = context;
            this.LJLILLLLZI = str;
            this.LJLJI = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            c5kh.LIZ(0, context, str, new AqS167S0100000_1(c84654XKg, 358), z);
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ArrayList<NLETrackSlot>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
