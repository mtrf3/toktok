package X;

import com.ss.android.vesdk.VEEditor;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.StreamEditUploadFrameTask$getFrames$1", f = "StreamEditUploadFrameTask.kt", l = {99}, m = "invokeSuspend")
/* renamed from: X.GcS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41900GcS extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super List<? extends String>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC153045zY LJLJI;
    public final /* synthetic */ int[] LJLJJI;
    public final /* synthetic */ C41906GcY LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41900GcS(InterfaceC153045zY interfaceC153045zY, int[] iArr, C41906GcY c41906GcY, InterfaceC67352kd<? super C41900GcS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC153045zY;
        this.LJLJJI = iArr;
        this.LJLJJL = c41906GcY;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41900GcS c41900GcS = new C41900GcS(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c41900GcS.LJLILLLLZI = obj;
        return c41900GcS;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            ArrayList arrayList = new ArrayList();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            InterfaceC153045zY interfaceC153045zY = this.LJLJI;
            int[] iArr = this.LJLJJI;
            C41906GcY c41906GcY = this.LJLJJL;
            int i2 = c41906GcY.LIZ;
            interfaceC153045zY.LLLII(iArr, i2, i2, VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT, new C41899GcR(atomicInteger, c41906GcY, arrayList, iArr, c3ck));
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, C41903GcV.LJLIL, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super List<? extends String>> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
