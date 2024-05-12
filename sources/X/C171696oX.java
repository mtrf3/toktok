package X;

import android.content.Intent;
import android.os.SystemClock;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$startCompressAndWait$1$2$1", f = "NLECutCompressActivity.kt", l = {173}, m = "invokeSuspend")
/* renamed from: X.6oX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171696oX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C171856on LJLILLLLZI;
    public final /* synthetic */ NLECutCompressActivity LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ CutSource LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171696oX(C171856on c171856on, NLECutCompressActivity nLECutCompressActivity, long j, long j2, CutSource cutSource, InterfaceC67352kd<? super C171696oX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c171856on;
        this.LJLJI = nLECutCompressActivity;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = cutSource;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C171696oX(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            if (this.LJLILLLLZI == null || this.LJLJI.LJLJJLL != 0) {
                if (!this.LJLJI.isFinishing()) {
                    NLECutCompressActivity nLECutCompressActivity = this.LJLJI;
                    Intent intent = new Intent();
                    NLECutCompressActivity nLECutCompressActivity2 = this.LJLJI;
                    CutSource cutSource = this.LJLJJLL;
                    long j = this.LJLJJL;
                    intent.putExtra("cut_compress_error", nLECutCompressActivity2.LJLJL);
                    intent.putExtra("cut_compress_code", nLECutCompressActivity2.LJLJJLL);
                    intent.putExtra("cut_compress_source", cutSource.value);
                    intent.putExtra("cut_compress_time", SystemClock.uptimeMillis() - j);
                    nLECutCompressActivity.setResult(0, intent);
                    this.LJLJI.finish();
                }
                return C76800UCe.LIZ;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.LJLJJL;
            long j2 = this.LJLJI.LJLJI;
            if (uptimeMillis < j2) {
                this.LJLIL = 1;
                if (C1JD.LIZJ(j2 - uptimeMillis, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        C171856on c171856on = this.LJLILLLLZI;
        Intent intent2 = new Intent();
        c171856on.LIZ(intent2);
        intent2.putExtra("cut_compress_time", SystemClock.uptimeMillis() - this.LJLJJL);
        intent2.putExtra("cut_compress_progress", this.LJLJI.LJLJJL);
        intent2.putExtra("cut_template_aspect_ratio", this.LJLJI.LJLLI);
        intent2.putExtra("cut_template_width", this.LJLJI.LJLLILLLL);
        intent2.putExtra("cut_template_height", this.LJLJI.LJLLJ);
        NLECutCompressActivity nLECutCompressActivity3 = this.LJLJI;
        if (nLECutCompressActivity3.LJLJLLL) {
            nLECutCompressActivity3.setResult(-1, intent2);
            nLECutCompressActivity3.finish();
        } else {
            nLECutCompressActivity3.LJLJLJ = intent2;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
