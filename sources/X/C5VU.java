package X;

import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$3$downloadTemplateTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {460}, m = "invokeSuspend")
/* renamed from: X.5VU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSJ<? extends Boolean, ? extends NLETemplateModel, ? extends Long>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C43544H7c LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ Intent LJLJJLL;
    public final /* synthetic */ ArrayList<VideoSegment> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5VU(C43544H7c c43544H7c, String str, boolean z, boolean z2, Intent intent, ArrayList<VideoSegment> arrayList, InterfaceC67352kd<? super C5VU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c43544H7c;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = intent;
        this.LJLJL = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5VU(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            C43544H7c c43544H7c = this.LJLILLLLZI;
            String str = this.LJLJI;
            boolean z = this.LJLJJI;
            boolean z2 = this.LJLJJL;
            Intent intent = this.LJLJJLL;
            ArrayList<VideoSegment> arrayList = this.LJLJL;
            this.LJLIL = 1;
            obj = c43544H7c.LJIIJ(str, z, z2, intent, arrayList, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSJ<? extends Boolean, ? extends NLETemplateModel, ? extends Long>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
