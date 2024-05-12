package Y;

import X.C93971aZT;
import X.C94929aov;
import X.XKX;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.effectcreatormobile.ckeapi.api.IShare;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDCListenerS302S0100000_42 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS302S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r4 == com.bytedance.ies.effectcreator.swig.FeatureType.FeatureType_Makeup) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onLongClick$0(Y.IDCListenerS302S0100000_42 r6, android.view.View r7) {
        /*
            java.lang.Object r0 = r6.l0
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment r0 = (com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment) r0
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel r5 = r0.Al()
            com.bytedance.ies.effectcreator.swig.Feature r0 = r5.LJLLL
            r4 = 0
            if (r0 == 0) goto L33
            com.bytedance.ies.effectcreator.swig.FeatureType r3 = r0.getFeatureType()
        L11:
            com.bytedance.ies.effectcreator.swig.FeatureType r0 = com.bytedance.ies.effectcreator.swig.FeatureType.FeatureType_PostProcess
            r2 = 1
            r1 = 0
            if (r3 == r0) goto L23
            com.bytedance.ies.effectcreator.swig.Feature r0 = r5.LJLLL
            if (r0 == 0) goto L1f
            com.bytedance.ies.effectcreator.swig.FeatureType r4 = r0.getFeatureType()
        L1f:
            com.bytedance.ies.effectcreator.swig.FeatureType r0 = com.bytedance.ies.effectcreator.swig.FeatureType.FeatureType_Makeup
            if (r4 != r0) goto L32
        L23:
            java.lang.Object r0 = r6.l0
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment r0 = (com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment) r0
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel r0 = r0.Al()
            com.bytedance.ies.effectcreator.swig.Feature r0 = r0.LJLLL
            if (r0 == 0) goto L32
            r0.setVisible(r1)
        L32:
            return r2
        L33:
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS302S0100000_42.onLongClick$0(Y.IDCListenerS302S0100000_42, android.view.View):boolean");
    }

    public static final boolean onLongClick$1(IDCListenerS302S0100000_42 iDCListenerS302S0100000_42, View view) {
        IShare iShare = (IShare) ((IService) C93971aZT.LIZ().LIZ(IShare.class));
        if (iShare != null) {
            LifecycleOwner viewLifecycleOwner = ((MainFragment) iDCListenerS302S0100000_42.l0).getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94929aov(iShare, null, iDCListenerS302S0100000_42), 3);
            return true;
        }
        return true;
    }
}
