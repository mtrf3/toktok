package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C37356ElM;
import X.C76800UCe;
import X.C85403XfT;
import X.ED5;
import X.InterfaceC38263Ezz;
import X.InterfaceC85411Xfb;
import X.InterfaceC85414Xfe;
import X.InterfaceC85415Xff;
import X.InterfaceC87439YTj;
import X.InterfaceC88471Ynr;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;

/* loaded from: classes16.dex */
public class AqS177S0200000_15 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0200000_15(C85403XfT c85403XfT, C37356ElM c37356ElM, int i) {
        super(2);
        this.$t = i;
        this.l0 = c85403XfT;
        this.l1 = c37356ElM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS177S0200000_15 r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS177S0200000_15.invoke$0(kotlin.jvm.internal.AqS177S0200000_15, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AqS177S0200000_15 aqS177S0200000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJIIIZ((FragmentManager) aqS177S0200000_15.l0, baseFragment, (Context) aqS177S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS177S0200000_15 aqS177S0200000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJ((FragmentManager) aqS177S0200000_15.l0, baseFragment, (Context) aqS177S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS177S0200000_15 aqS177S0200000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJI((FragmentManager) aqS177S0200000_15.l0, baseFragment, (Bundle) aqS177S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS177S0200000_15 aqS177S0200000_15, Object obj, Object obj2) {
        String str;
        String str2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        InterfaceC38263Ezz interfaceC38263Ezz = ((C85403XfT) aqS177S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC85414Xfe interfaceC85414Xfe = (InterfaceC85414Xfe) ED5.LIZJ(InterfaceC85414Xfe.class, str);
        interfaceC85414Xfe.setSystemIsNotReduced(Boolean.valueOf(booleanValue));
        interfaceC85414Xfe.setInAppIsNotReduced(Boolean.valueOf(booleanValue2));
        CompletionBlock completionBlock = (CompletionBlock) aqS177S0200000_15.l1;
        InterfaceC38263Ezz interfaceC38263Ezz2 = ((C85403XfT) aqS177S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz2 != null) {
            str2 = interfaceC38263Ezz2.LIZIZ();
        } else {
            str2 = null;
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC85411Xfb.class, str2);
        InterfaceC85411Xfb interfaceC85411Xfb = (InterfaceC85411Xfb) LIZJ;
        interfaceC85411Xfb.setGranted(interfaceC85414Xfe);
        interfaceC85411Xfb.setDenied(null);
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS177S0200000_15 aqS177S0200000_15, Object obj, Object obj2) {
        String str;
        String str2;
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        InterfaceC38263Ezz interfaceC38263Ezz = ((C85403XfT) aqS177S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        InterfaceC85415Xff interfaceC85415Xff = (InterfaceC85415Xff) ED5.LIZJ(InterfaceC85415Xff.class, str);
        interfaceC85415Xff.setType(Integer.valueOf(intValue));
        CompletionBlock completionBlock = (CompletionBlock) aqS177S0200000_15.l1;
        InterfaceC38263Ezz interfaceC38263Ezz2 = ((C85403XfT) aqS177S0200000_15.l0).LJLIL;
        if (interfaceC38263Ezz2 != null) {
            str2 = interfaceC38263Ezz2.LIZIZ();
        } else {
            str2 = null;
        }
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC85411Xfb.class, str2);
        InterfaceC85411Xfb interfaceC85411Xfb = (InterfaceC85411Xfb) LIZJ;
        interfaceC85411Xfb.setDenied(interfaceC85415Xff);
        interfaceC85411Xfb.setGranted(null);
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0200000_15(Context context, FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0200000_15(FragmentManager fragmentManager, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS177S0200000_15(PoiPublishExtensionAssem poiPublishExtensionAssem, View view, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiPublishExtensionAssem;
        this.l1 = view;
    }
}
