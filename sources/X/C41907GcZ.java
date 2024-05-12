package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask$decodeFrameFlow$1", f = "LocalVideoUploadFrameTask.kt", l = {185}, m = "invokeSuspend")
/* renamed from: X.GcZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41907GcZ extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super OSZ<? extends Bitmap, ? extends Integer>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C41911Gcd LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41907GcZ(long j, long j2, C41911Gcd c41911Gcd, String str, InterfaceC67352kd<? super C41907GcZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = c41911Gcd;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41907GcZ c41907GcZ = new C41907GcZ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c41907GcZ.LJLILLLLZI = obj;
        return c41907GcZ;
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
            int i2 = (int) this.LJLJI;
            int i3 = (int) this.LJLJJI;
            this.LJLJJL.getClass();
            int[] LIZ = C41904GcW.LIZ(i2, i3, AbstractC41925Gcr.LJ());
            if (LIZ == null) {
                C48841JEv.LIZJ(c3ck, new CancellationException("no time is available"));
                return C76800UCe.LIZ;
            }
            C41909Gcb c41909Gcb = new C41909Gcb(c3ck, new CopyOnWriteArrayList(), LIZ);
            String str = this.LJLJJLL;
            int i4 = this.LJLJJL.LIZ;
            VEUtils.getVideoFrames(str, LIZ, i4, i4, ((Boolean) C41916Gci.LIZ.getValue()).booleanValue(), c41909Gcb);
            C41908Gca c41908Gca = C41908Gca.LJLIL;
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, c41908Gca, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super OSZ<? extends Bitmap, ? extends Integer>> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
