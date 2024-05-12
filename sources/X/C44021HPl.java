package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import defpackage.e1;
import java.util.Collections;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.HPl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44021HPl implements InterfaceC65784Pro {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Bundle LJLJJLL;
    public final /* synthetic */ n LJLJL;

    public /* synthetic */ C44021HPl(int i, Context context, Bundle bundle, n nVar, String str, boolean z, boolean z2) {
        this.LJLIL = context;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = z2;
        this.LJLJJL = str;
        this.LJLJJLL = bundle;
        this.LJLJL = nVar;
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        ProgressDialogC43239Gy3 progressDialogC43239Gy3;
        Context context = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        int i = this.LJLJI;
        boolean z2 = this.LJLJJI;
        String str = this.LJLJJL;
        Bundle bundle = this.LJLJJLL;
        n nVar = this.LJLJL;
        o.LJIIIZ(context, "context");
        InterfaceC84498XEg LIZ = C84488XDw.LIZ(context, null);
        if (z) {
            progressDialogC43239Gy3 = C42034Gec.LIZJ(context, EnumC42288Gii.VISIBLE_AFTER_5S, new Q4K());
            progressDialogC43239Gy3.setMessage(context.getString(i));
            progressDialogC43239Gy3.setCancelable(false);
            progressDialogC43239Gy3.setIndeterminate(true);
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/view/DoubleBallLoadingDialog", "show", progressDialogC43239Gy3, new Object[0], "void", new C65300Pk0(false, "()V", "6575647784866423024")).LIZ) {
                progressDialogC43239Gy3.show();
            }
            C44018HPi.LJII(1502, true);
        } else {
            progressDialogC43239Gy3 = null;
        }
        if (e1.LIZ(31744, "studio_flip_shoot_icon_effect_opti", true, false) && z2) {
            EffectListResponse LIZ2 = C44027HPr.LIZ(str);
            if (LIZ2 != null && !LIZ2.getData().isEmpty()) {
                C44018HPi.LJI(LIZ, progressDialogC43239Gy3, str, bundle, nVar, LIZ2);
                return C76800UCe.LIZ;
            }
            LIZ.LIZ(Collections.singletonList(str), null, new C44023HPn(progressDialogC43239Gy3, nVar, LIZ, str, bundle));
            return C76800UCe.LIZ;
        }
        C43962HNe.LIZ(LIZ).LIZ(str, "", new C44025HPp(progressDialogC43239Gy3, bundle, nVar));
        return C76800UCe.LIZ;
    }
}
