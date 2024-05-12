package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.TTSCategory;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.TTSFragment$fetchVoiceEffectList$1", f = "TTSFragment.kt", l = {312, 321, 359}, m = "invokeSuspend")
/* renamed from: X.5ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137665ak extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TTSFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137665ak(TTSFragment tTSFragment, InterfaceC67352kd<? super C137665ak> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tTSFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137665ak(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ActivityC45651qj mo49getActivity;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (RuntimeException unused) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C137655aj c137655aj = new C137655aj(this.LJLILLLLZI, null);
            this.LJLIL = 3;
            if (XKX.LJI(abstractC78621UtN, c137655aj, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C138905ck LIZ = C138795cZ.LIZ((InterfaceC84497XEf) this.LJLILLLLZI.LJZ.getValue());
            C137905b8 c137905b8 = this.LJLILLLLZI.LLIIJI;
            this.LJLIL = 1;
            obj = LIZ.LIZIZ(c137905b8, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        List list = (List) obj;
        if (this.LJLILLLLZI.mo49getActivity() == null || ((mo49getActivity = this.LJLILLLLZI.mo49getActivity()) != null && mo49getActivity.isFinishing())) {
            return C76800UCe.LIZ;
        }
        C138795cZ.LIZ((InterfaceC84497XEf) this.LJLILLLLZI.LJZ.getValue());
        List<ReadTextEffectBean> LIZ2 = C138905ck.LIZ(list);
        Iterator it = ((ArrayList) LIZ2).iterator();
        while (it.hasNext()) {
            ReadTextEffectBean readTextEffectBean = (ReadTextEffectBean) it.next();
            TTSCategory tTSCategory = new TTSCategory("", "default", 4);
            readTextEffectBean.getClass();
            readTextEffectBean.category = tTSCategory;
        }
        AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
        C137645ai c137645ai = new C137645ai(this.LJLILLLLZI, LIZ2, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN2, c137645ai, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
