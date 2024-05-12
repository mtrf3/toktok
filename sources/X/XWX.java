package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.util.List;

/* loaded from: classes16.dex */
public final class XWX<T> implements Observer<C207668Da> {
    public InterfaceC84984XWy<T> LJLIL;
    public DataCenter LJLILLLLZI;
    public final InterfaceC84974XWo<T> LJLJI;

    public XWX(InterfaceC84974XWo interfaceC84974XWo) {
        this.LJLILLLLZI = interfaceC84974XWo.cg();
        this.LJLJI = interfaceC84974XWo;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C207668Da c207668Da2 = c207668Da;
        if (this.LJLIL == null || c207668Da2 == null || TextUtils.isEmpty(c207668Da2.LIZ)) {
            return;
        }
        String str = c207668Da2.LIZ;
        boolean z = false;
        Object obj = null;
        if (TextUtils.equals(str, this.LJLJI.V())) {
            Object obj2 = c207668Da2.LIZIZ;
            if (obj2 != null) {
                obj = obj2;
            }
            if (obj == 0) {
                return;
            }
            this.LJLIL.LIZ();
            return;
        }
        if (TextUtils.equals(str, this.LJLJI.b())) {
            Object obj3 = c207668Da2.LIZIZ;
            if (obj3 != null) {
                obj = obj3;
            }
            if (obj == 0) {
                return;
            }
            this.LJLIL.showLoadMoreError();
            return;
        }
        if (!TextUtils.equals(str, this.LJLJI.LLJJJ())) {
            return;
        }
        XRT xrt = (XRT) this.LJLILLLLZI.get(this.LJLJI.LLJJJ());
        int intValue = ((Integer) xrt.LIZ("action_type")).intValue();
        if (intValue == 1) {
            List<T> list = (List) xrt.LIZ("list_data");
            InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLIL;
            Object LIZ = xrt.LIZ("list_hasmore");
            if (LIZ instanceof Integer) {
                if (((Integer) LIZ).intValue() == 1) {
                    z = true;
                }
            } else if (LIZ instanceof Boolean) {
                z = ((Boolean) LIZ).booleanValue();
            }
            interfaceC84984XWy.J5(list, z);
            return;
        }
        if (intValue != 2) {
            return;
        }
        List<T> list2 = (List) xrt.LIZ("list_data");
        InterfaceC84984XWy<T> interfaceC84984XWy2 = this.LJLIL;
        Object LIZ2 = xrt.LIZ("list_hasmore");
        if (LIZ2 instanceof Integer) {
            if (((Integer) LIZ2).intValue() == 1) {
                z = true;
            }
        } else if (LIZ2 instanceof Boolean) {
            z = ((Boolean) LIZ2).booleanValue();
        }
        interfaceC84984XWy2.j0(list2, z);
    }

    public final void LIZ(View view, Bundle bundle) {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = this.LJLJI.cg();
        }
        if (this.LJLILLLLZI != null) {
            if (!TextUtils.isEmpty(this.LJLJI.LLJJJ())) {
                this.LJLILLLLZI.iv0(this.LJLJI.LLJJJ(), this, false);
            }
            if (!TextUtils.isEmpty(this.LJLJI.V())) {
                this.LJLILLLLZI.iv0(this.LJLJI.V(), this, false);
            }
            if (!TextUtils.isEmpty(this.LJLJI.b())) {
                this.LJLILLLLZI.iv0(this.LJLJI.b(), this, false);
            }
        }
        this.LJLIL = this.LJLJI.o2(view);
        this.LJLJI.initData();
    }
}
