package X;

import android.os.SystemClock;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionViewModel$setText$1$1$1$1", f = "CaptionViewModel.kt", l = {130}, m = "invokeSuspend")
/* renamed from: X.Bef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29297Bef extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29296Bee LJLILLLLZI;
    public final /* synthetic */ ArrayList<C29299Beh> LJLJI;
    public final /* synthetic */ CaptionViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29297Bef(C29296Bee c29296Bee, ArrayList<C29299Beh> arrayList, CaptionViewModel captionViewModel, InterfaceC67352kd<? super C29297Bef> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29296Bee;
        this.LJLJI = arrayList;
        this.LJLJJI = captionViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29297Bef(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C29296Bee c29296Bee = this.LJLILLLLZI;
            ArrayList<C29299Beh> arrayList = this.LJLJI;
            c29296Bee.getClass();
            o.LJIIIZ(arrayList, "<set-?>");
            c29296Bee.LJ = arrayList;
            CaptionViewModel captionViewModel = this.LJLJJI;
            if (!captionViewModel.LJLJLJ.alignStream || captionViewModel.LJLLILLLL == 0 || this.LJLJJI.LJLLI == 0) {
                this.LJLJJI.LJLJJL.setValue(this.LJLILLLLZI);
            } else {
                long elapsedRealtime = (this.LJLILLLLZI.LIZIZ - this.LJLJJI.LJLLI) - (SystemClock.elapsedRealtime() - this.LJLJJI.LJLLILLLL);
                if (elapsedRealtime < 0) {
                    this.LJLJJI.LJLJJL.setValue(this.LJLILLLLZI);
                } else {
                    this.LJLILLLLZI.LJFF = true;
                    long j = elapsedRealtime + this.LJLJJI.LJLJL;
                    this.LJLIL = 1;
                    if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
            }
            return C76800UCe.LIZ;
        }
        this.LJLJJI.LJLJJL.setValue(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
