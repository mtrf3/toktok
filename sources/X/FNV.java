package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS0S0100500_6;

@InterfaceC65848Psq(c = "dmt.av.video.record.RecordConditionCheck__RecordConditionCheckKt$optPreStorageCheck$1$1", f = "RecordConditionCheck.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FNV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ CreativeLoadingDialog LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ Activity LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FNV(CreativeLoadingDialog creativeLoadingDialog, long j, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, long j2, long j3, long j4, Activity activity, InterfaceC67352kd<? super FNV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = creativeLoadingDialog;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = j4;
        this.LJLJL = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new FNV(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C141335gf.LIZJ(obj);
        if (!this.LJLIL.isShowing()) {
            return C76800UCe.LIZ;
        }
        this.LJLIL.dismiss();
        try {
            j = C39579Fg7.LJIILIIL();
        } catch (Exception unused) {
            j = 0;
        }
        if (j >= this.LJLILLLLZI) {
            this.LJLJI.invoke();
            C37284EkC.LIZJ(EnumC36113EFh.CLEAN_STORAGE_WITH_LOADING, j, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, true, false);
            C37284EkC.LIZ = false;
        } else {
            Activity activity = this.LJLJL;
            long j2 = this.LJLJJL;
            long j3 = this.LJLJJLL;
            FNW.LIZ.getClass();
            long j4 = 1024;
            long storageLowerLimit = FNW.LIZ().getStorageLowerLimit() * j4 * j4;
            long storageAutoCleanLimit = FNW.LIZ().getStorageAutoCleanLimit() * j4 * j4;
            if (C00F.LIZ(31744, 0, "creative_tool_open_storage_opt", true) == 2) {
                C26227ARb c26227ARb = new C26227ARb(activity);
                c26227ARb.LJ(R.string.bqt);
                c26227ARb.LIZ(R.string.bqs);
                UC0.LIZJ(c26227ARb, new AqS0S0100500_6(activity, j, storageLowerLimit, storageAutoCleanLimit, j2, j3, 1));
                c26227ARb.LJII = false;
                c26227ARb.LJI().LIZLLL();
            } else {
                C5S1 c5s1 = new C5S1(C16880lQ.LLLLJ(activity));
                c5s1.LIZJ(R.string.ekn);
                c5s1.LJ();
                C37284EkC.LIZ = false;
                C37284EkC.LIZJ(EnumC36113EFh.CLEAN_STORAGE_WITH_LOADING, j, storageLowerLimit, storageAutoCleanLimit, j2, j3, false, false);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
