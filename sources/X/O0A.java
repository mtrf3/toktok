package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O0A extends O0B {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        O0C o0c = (O0C) xBaseParamModel;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (view = interfaceC38263Ezz.getView()) != null) {
            ViewParent parent = view.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && (childAt instanceof O0F)) {
                    if (o.LJ(o0c.getHideLoading(), Boolean.TRUE)) {
                        C16880lQ.LJLLL(childAt, viewGroup);
                    } else {
                        O0F o0f = (O0F) childAt;
                        ImageView imageView = o0f.LJLIL;
                        if (imageView != null) {
                            if (C78996UzQ.LJJIIJZLJL(imageView)) {
                                C78996UzQ.LJI();
                            }
                            o0f.removeView(imageView);
                        }
                        o0f.LJLIL = null;
                    }
                }
            }
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(O0D.class, null), "");
    }
}
