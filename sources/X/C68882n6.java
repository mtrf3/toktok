package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETemplateConverter;
import com.bytedance.ies.nle.editor_jni.NLETemplateJNI;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.templatedownload.TemplateProducer$getProducedTemplateZip$job$1", f = "TemplateProducer.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.2n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68882n6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ C5KH LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68882n6(Context context, C5KH c5kh, String str, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c5kh;
        this.LJLJI = str;
        this.LJLJJI = context;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68882n6(this.LJLJJI, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd, this.LJLJJL);
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
            C5KH c5kh = this.LJLILLLLZI;
            String str = this.LJLJI;
            Context context = this.LJLJJI;
            boolean z = this.LJLJJL;
            this.LJLIL = 1;
            c5kh.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C68872n5(context, c5kh, str, null, z), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        ArrayList arrayList = (ArrayList) obj;
        C5KN.LIZ();
        if (!arrayList.isEmpty()) {
            NLETemplateConverter nLETemplateConverter = this.LJLILLLLZI.LIZIZ;
            VecNLETrackSlotSPtr vecNLETrackSlotSPtr = new VecNLETrackSlotSPtr();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vecNLETrackSlotSPtr.LIZJ((NLETrackSlot) it.next());
            }
            NLETemplateJNI.NLETemplateConverter_setUnMutableVideoSlot(nLETemplateConverter.LIZ, nLETemplateConverter, vecNLETrackSlotSPtr.LJLIL, vecNLETrackSlotSPtr);
        }
        NLETemplateConverter nLETemplateConverter2 = this.LJLILLLLZI.LIZIZ;
        return NLETemplateJNI.NLETemplateConverter_storeToZipFromDraft__SWIG_0(nLETemplateConverter2.LIZ, nLETemplateConverter2, this.LJLJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
