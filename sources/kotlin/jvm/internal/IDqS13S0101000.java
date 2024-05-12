package kotlin.jvm.internal;

import X.AbstractC274515x;
import X.AbstractC39201gK;
import X.AbstractC65781Prl;
import X.C35341a6;
import X.C35491aL;
import X.C35551aR;
import X.C514920j;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class IDqS13S0101000 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(BeginSignInResult beginSignInResult) {
        try {
            HiddenActivity hiddenActivity = (HiddenActivity) this.l0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(beginSignInResult.zba.getIntentSender(), this.i1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = (HiddenActivity) this.l0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            o.LJI(resultReceiver);
            String name = C35551aR.class.getName();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("During begin sign in, one tap ui intent sender failure: ");
            LIZ.append(e.getMessage());
            hiddenActivity2.setupFailure(resultReceiver, name, X1D.LIZIZ(LIZ));
        }
    }

    public final void invoke$1(SavePasswordResult savePasswordResult) {
        try {
            HiddenActivity hiddenActivity = (HiddenActivity) this.l0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(savePasswordResult.zba.getIntentSender(), this.i1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = (HiddenActivity) this.l0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            o.LJI(resultReceiver);
            String name = C35491aL.class.getName();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("During save password, found UI intent sender failure: ");
            LIZ.append(e.getMessage());
            hiddenActivity2.setupFailure(resultReceiver, name, X1D.LIZIZ(LIZ));
        }
    }

    public final void invoke$2(PendingIntent result) {
        o.LJIIIZ(result, "result");
        try {
            HiddenActivity hiddenActivity = (HiddenActivity) this.l0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(result.getIntentSender(), this.i1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = (HiddenActivity) this.l0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            o.LJI(resultReceiver);
            String name = C35491aL.class.getName();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("During public key credential, found IntentSender failure on public key creation: ");
            LIZ.append(e.getMessage());
            hiddenActivity2.setupFailure(resultReceiver, name, X1D.LIZIZ(LIZ));
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(IDqS13S0101000 iDqS13S0101000, Object obj) {
        iDqS13S0101000.invoke$0((BeginSignInResult) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS13S0101000 iDqS13S0101000, Object obj) {
        iDqS13S0101000.invoke$1((SavePasswordResult) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(IDqS13S0101000 iDqS13S0101000, Object obj) {
        iDqS13S0101000.invoke$2((PendingIntent) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS13S0101000 iDqS13S0101000, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(it.addAll(iDqS13S0101000.i1, (Collection) iDqS13S0101000.l0));
    }

    public static final Object invoke$4(IDqS13S0101000 iDqS13S0101000, Object obj) {
        AbstractC274515x layout = (AbstractC274515x) obj;
        o.LJIIIZ(layout, "$this$layout");
        AbstractC39201gK abstractC39201gK = (AbstractC39201gK) iDqS13S0101000.l0;
        int LJJZZIII = ((-iDqS13S0101000.i1) / 2) - ((abstractC39201gK.LJLIL - abstractC39201gK.LJJZZIII()) / 2);
        int i = (-iDqS13S0101000.i1) / 2;
        AbstractC39201gK abstractC39201gK2 = (AbstractC39201gK) iDqS13S0101000.l0;
        AbstractC274515x.LJIIIZ(layout, abstractC39201gK, LJJZZIII, i - ((abstractC39201gK2.LJLILLLLZI - abstractC39201gK2.LJJZZI()) / 2), null, 12);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS13S0101000 iDqS13S0101000, Object layout) {
        o.LJIIIZ(layout, "$this$layout");
        AbstractC39201gK abstractC39201gK = (AbstractC39201gK) iDqS13S0101000.l0;
        int i = iDqS13S0101000.i1 / 2;
        AbstractC274515x.LIZJ(abstractC39201gK, i, i, 0.0f);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS13S0101000 iDqS13S0101000, Object obj) {
        String targetKey = (String) obj;
        o.LJIIIZ(targetKey, "targetKey");
        super/*X.1mf*/.LIZLLL(targetKey, iDqS13S0101000.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS13S0101000 iDqS13S0101000, Object it) {
        IDqS416S0100000 iDqS416S0100000;
        o.LJIIIZ(it, "it");
        C35341a6 c35341a6 = (C35341a6) iDqS13S0101000.l0;
        int i = c35341a6.LJLJI;
        int i2 = iDqS13S0101000.i1;
        if (i != i2 && (iDqS416S0100000 = c35341a6.LJLILLLLZI) != null) {
            iDqS416S0100000.invoke(Integer.valueOf(i2));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS13S0101000(int i, C514920j c514920j, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c514920j;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS13S0101000(int i, int i2, Collection<? extends T> collection) {
        super(1);
        this.$t = collection;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS13S0101000(C35341a6 c35341a6, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c35341a6;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS13S0101000(AbstractC39201gK abstractC39201gK, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = abstractC39201gK;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS13S0101000(HiddenActivity hiddenActivity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = hiddenActivity;
        this.i1 = i;
    }
}
