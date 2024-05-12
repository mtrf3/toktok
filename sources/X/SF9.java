package X;

import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class SF9 extends C113664d8 {
    public final /* synthetic */ CpfVH LJLIL;

    public SF9(CpfVH cpfVH) {
        this.LJLIL = cpfVH;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(charSequence)) {
            C45804HyK.LJJLL(this.LJLIL._$_findCachedViewById(R.id.ea2));
            SF8 sf8 = this.LJLIL.LJLJJL;
            if (sf8 != null) {
                String valueOf = String.valueOf(charSequence);
                if (TextUtils.isEmpty(valueOf)) {
                    sf8.dismiss();
                    return;
                }
                List<CpfElem> list = sf8.LIZIZ;
                ArrayList arrayList = new ArrayList();
                for (CpfElem cpfElem : list) {
                    String str = cpfElem.maskCode;
                    if (str != null && s.LJJJLZIJ(str, valueOf, false)) {
                        arrayList.add(cpfElem);
                    }
                }
                List<CpfElem> cpfElems = ORZ.LLJI(arrayList);
                sf8.LJI = cpfElems;
                SF7 sf7 = sf8.LJFF;
                if (sf7 != null) {
                    o.LJIIIZ(cpfElems, "cpfElems");
                    sf7.LJLJJI = valueOf;
                    sf7.LJLILLLLZI.clear();
                    sf7.LJLILLLLZI.addAll(cpfElems);
                    sf7.notifyDataSetChanged();
                }
                if (!sf8.LJI.isEmpty()) {
                    if (sf8.isShowing()) {
                        return;
                    }
                    View view = sf8.LIZ;
                    int LJII = C79081V1x.LJII(24);
                    if (C4XM.LIZ()) {
                        C56308M8a.LIZ();
                    }
                    C46318IFu.LIZ.getClass();
                    if (C46318IFu.LIZ()) {
                        try {
                            C56308M8a.LIZIZ();
                            Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(sf8));
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            int i4 = attributes.flags;
                            boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                            C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                            attributes.flags &= -16777217;
                            sf8.showAsDropDown(view, 0, LJII);
                            C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                            attributes.flags = i4;
                        } catch (Throwable unused) {
                            sf8.showAsDropDown(view, 0, LJII);
                        }
                    } else {
                        sf8.showAsDropDown(view, 0, LJII);
                    }
                    InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = sf8.LIZLLL;
                    if (interfaceC88472Yns == null) {
                        return;
                    }
                    interfaceC88472Yns.invoke(Integer.valueOf(sf8.LJI.size()));
                    return;
                }
                sf8.dismiss();
                return;
            }
            return;
        }
        C45804HyK.LJJIJIIJIL(this.LJLIL._$_findCachedViewById(R.id.ea2));
        SF8 sf82 = this.LJLIL.LJLJJL;
        if (sf82 == null) {
            return;
        }
        sf82.dismiss();
    }
}
