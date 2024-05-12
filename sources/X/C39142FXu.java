package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1$dialog$1", f = "RecordConditionCheck.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.FXu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39142FXu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CreativeLoadingDialog>, Object> {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39142FXu(Activity activity, long j, long j2, long j3, InterfaceC67352kd<? super C39142FXu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = activity;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39142FXu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C42279GiZ c42279GiZ = C42279GiZ.LIZ;
        Activity activity = this.LJLIL;
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        String string = this.LJLIL.getString(R.string.rjz);
        o.LJIIIIZZ(string, "activity.getString(com.s…edit.R.string.ss_loading)");
        creativeLoadingDialogBuilder.loadingMessage(string);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
        creativeLoadingDialogBuilder.clickCancelListener(new FJY(this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
        creativeLoadingDialogBuilder.cancelListener(FJZ.LJLIL);
        CreativeLoadingDialog createLoadingDialog = c42279GiZ.createLoadingDialog(activity, 1201, creativeLoadingDialogBuilder);
        ((C42278GiY) createLoadingDialog).show();
        return createLoadingDialog;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CreativeLoadingDialog> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
