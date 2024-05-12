package Y;

import X.C16880lQ;
import X.C27355AoR;
import X.C27356AoS;
import X.C27365Aob;
import X.C32151Nz;
import X.C32I;
import X.C45804HyK;
import X.C47261Igj;
import X.C61878OQg;
import X.C78565UsT;
import X.K5T;
import X.O6R;
import X.ORZ;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.view.View;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchResultAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDHandlerS17S0100000_4 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS17S0100000_4 iDHandlerS17S0100000_4, Message msg) {
        o.LJIIIZ(msg, "msg");
        CandHelper candHelper = (CandHelper) iDHandlerS17S0100000_4.l0;
        if (candHelper.LIZIZ.hasFocus()) {
            msg.getCallback().run();
        } else {
            candHelper.LIZ(null, null);
        }
    }

    public static final void handleMessage$1(IDHandlerS17S0100000_4 iDHandlerS17S0100000_4, Message msg) {
        String str;
        List list;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            DistrictFragment districtFragment = (DistrictFragment) iDHandlerS17S0100000_4.l0;
            if (((K5T) districtFragment._$_findCachedViewById(R.id.jdg)).getEditTextView().hasFocus()) {
                Editable text = ((K5T) districtFragment._$_findCachedViewById(R.id.jdg)).getEditTextView().getText();
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                if (DistrictFragment.Dl(str)) {
                    List<District> list2 = districtFragment.Al().LJLILLLLZI;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                    Iterator it = ((ArrayList) list2).iterator();
                    while (it.hasNext()) {
                        String str2 = ((District) it.next()).geoNameId;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(str2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((String) next).length() > 0) {
                            arrayList2.add(next);
                        }
                    }
                    Object LJLLLLLL = ORZ.LJLLLLLL(0, arrayList2);
                    if (LJLLLLLL != null) {
                        list = C47261Igj.LJJIJ(LJLLLLLL);
                    } else {
                        list = C61878OQg.INSTANCE;
                    }
                    C78565UsT.LJJIJIIJIL(districtFragment, new C27365Aob(new SearchDistrictRequest(1, list, str), districtFragment, str, null));
                    return;
                }
                districtFragment.Hl(false, false);
                districtFragment.Gl(true);
                return;
            }
            districtFragment.Hl(false, false);
            districtFragment.Gl(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleMessage$2(IDHandlerS17S0100000_4 iDHandlerS17S0100000_4, Message msg) {
        PopupWindow popupWindow;
        int i;
        View view;
        C27355AoR c27355AoR;
        PopupWindow popupWindow2;
        o.LJIIIZ(msg, "msg");
        int i2 = msg.what;
        if (i2 != 1) {
            int i3 = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                List<C27356AoS<T>> list = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJIIJ;
                ArrayList arrayList = new ArrayList();
                if (list != 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C27356AoS c27356AoS = (C27356AoS) it.next();
                        arrayList.add(new SearchResultAdapter.SearchResultItemVO(c27356AoS.LIZLLL, c27356AoS.LIZIZ, c27356AoS.LIZJ, c27356AoS.LJFF, null, null == true ? 1 : 0, 48, null == true ? 1 : 0));
                    }
                }
                if (arrayList.isEmpty()) {
                    ((C27355AoR) iDHandlerS17S0100000_4.l0).LIZ();
                    return;
                }
                View findViewById = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJFF.findViewById(R.id.jh4);
                if (findViewById != null) {
                    if (((C27355AoR) iDHandlerS17S0100000_4.l0).LJIIJJI) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    findViewById.setVisibility(i);
                }
                SearchResultAdapter searchResultAdapter = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJIIIIZZ;
                if (searchResultAdapter != null) {
                    searchResultAdapter.LJLILLLLZI = arrayList;
                    searchResultAdapter.notifyDataSetChanged();
                }
                PopupWindow popupWindow3 = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJII;
                if (popupWindow3 != null && !popupWindow3.isShowing() && (popupWindow2 = (c27355AoR = (C27355AoR) iDHandlerS17S0100000_4.l0).LJII) != null) {
                    C16880lQ.LLJL(popupWindow2, c27355AoR.LIZIZ, 0, 0);
                }
                C27355AoR c27355AoR2 = (C27355AoR) iDHandlerS17S0100000_4.l0;
                if (c27355AoR2.LJ) {
                    c27355AoR2.LJFF.post(new ARunnableS8S0101000_4(c27355AoR2.LIZIZ.getWidth(), c27355AoR2, 6));
                } else {
                    PopupWindow popupWindow4 = c27355AoR2.LJII;
                    if (popupWindow4 != null) {
                        int width = c27355AoR2.LIZIZ.getWidth();
                        PopupWindow popupWindow5 = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJII;
                        if (popupWindow5 != null) {
                            i3 = popupWindow5.getHeight();
                        }
                        popupWindow4.update(width, i3);
                    }
                }
                PopupWindow popupWindow6 = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJII;
                if (popupWindow6 != null) {
                    view = popupWindow6.getContentView();
                } else {
                    view = null;
                }
                C45804HyK.LJJL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), view);
                return;
            }
            PopupWindow popupWindow7 = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJII;
            if (popupWindow7 == null || !popupWindow7.isShowing() || (popupWindow = ((C27355AoR) iDHandlerS17S0100000_4.l0).LJII) == null) {
                return;
            }
            popupWindow.dismiss();
            return;
        }
        ((C27355AoR) iDHandlerS17S0100000_4.l0).LIZJ.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS17S0100000_4(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
