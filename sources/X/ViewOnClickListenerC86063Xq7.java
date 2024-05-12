package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.selectsheet.TuxMultiSelectionSheet;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.widget.SortPopupWindow;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Xq7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC86063Xq7 extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final InterfaceC86070XqE LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public TuxMultiSelectionSheet LJLJLJ;
    public List<NoticeSortModel> LJLJLLL;
    public List<NoticeFilterModel> LJLL;
    public int LJLLI;
    public List<Integer> LJLLILLLL;
    public SortPopupWindow LJLLJ;

    public final AVS M() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-filterBadge>(...)");
        return (AVS) value;
    }

    public final TextView N() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-filterView>(...)");
        return (TextView) value;
    }

    public final void L(C56859MTf model) {
        boolean z;
        NoticeSortModel noticeSortModel;
        String str;
        o.LJIIIZ(model, "model");
        List<NoticeSortModel> list = model.LIZJ;
        this.LJLJLLL = list;
        this.LJLL = model.LIZLLL;
        int i = model.LIZ;
        if (i == MTW.UN_SUPPORT.getId() || list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object value = this.LJLJI.getValue();
            o.LJIIIIZZ(value, "<get-sortView>(...)");
            ((View) value).setVisibility(8);
        } else {
            Object value2 = this.LJLJI.getValue();
            o.LJIIIIZZ(value2, "<get-sortView>(...)");
            ((View) value2).setVisibility(0);
            List<NoticeSortModel> list2 = this.LJLJLLL;
            if (list2 != null) {
                Object value3 = this.LJLILLLLZI.getValue();
                o.LJIIIIZZ(value3, "<get-sortText>(...)");
                TextView textView = (TextView) value3;
                Iterator<NoticeSortModel> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        noticeSortModel = it.next();
                        if (noticeSortModel.sortId == i) {
                            break;
                        }
                    } else {
                        noticeSortModel = null;
                        break;
                    }
                }
                NoticeSortModel noticeSortModel2 = noticeSortModel;
                if (noticeSortModel2 == null || (str = noticeSortModel2.sortName) == null) {
                    str = "";
                }
                textView.setText(str);
            }
            this.LJLLI = i;
        }
        List<Integer> list3 = model.LIZIZ;
        List<NoticeFilterModel> list4 = this.LJLL;
        if (list4 == null || list4.isEmpty()) {
            N().setVisibility(8);
        } else {
            P(list3);
            this.LJLLILLLL = list3;
        }
        SortPopupWindow sortPopupWindow = this.LJLLJ;
        if (sortPopupWindow != null) {
            sortPopupWindow.dismiss();
        }
    }

    public final void P(List<Integer> list) {
        int i;
        int i2;
        N().setText(N().getResources().getString(R.string.eay));
        N().setVisibility(0);
        if (!list.isEmpty()) {
            Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.eh);
            if (LIZIZ != null) {
                i2 = LIZIZ.intValue();
            } else {
                i2 = 0;
            }
            N().setTextColor(i2);
            M().setCount(list.size());
            M().setVisibility(0);
            Object value = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value, "<get-filterIcon>(...)");
            ((View) value).setVisibility(8);
            return;
        }
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gx);
        if (LIZIZ2 != null) {
            i = LIZIZ2.intValue();
        } else {
            i = 0;
        }
        N().setTextColor(i);
        M().setVisibility(8);
        Object value2 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value2, "<get-filterIcon>(...)");
        ((View) value2).setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        boolean z;
        int i;
        FragmentManager fragmentManager;
        TuxMultiSelectionSheet tuxMultiSelectionSheet;
        C253179wf c253179wf;
        List<NoticeSortModel> list;
        Lifecycle lifecycle;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != R.id.k77 && num.intValue() != R.id.k74 && num.intValue() != R.id.k78)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String LJIL = C78886Uxe.LJIL(this.LJLLI, this.LJLJLLL);
            C86068XqC c86068XqC = new C86068XqC();
            c86068XqC.LIZJ = "notification_page";
            c86068XqC.LIZLLL = this.LJLIL.LIZIZ();
            c86068XqC.LJFF = LJIL;
            c86068XqC.LIZJ();
            Object value = this.LJLJL.getValue();
            o.LJIIIIZZ(value, "<get-sortFilterView>(...)");
            Context context = ((View) value).getContext();
            if (context != null && (list = this.LJLJLLL) != null) {
                SortPopupWindow sortPopupWindow = new SortPopupWindow(context, list, new AqS181S0100000_15(this, 265));
                sortPopupWindow.setOutsideTouchable(true);
                sortPopupWindow.setTouchable(true);
                sortPopupWindow.setFocusable(true);
                sortPopupWindow.setElevation(32.0f);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.gu);
                c110614Vt.LIZJ = C61328O5c.LIZJ(10);
                Drawable LIZ = c110614Vt.LIZ(context);
                LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context);
                if (LIZIZ != null && (lifecycle = LIZIZ.getLifecycle()) != null) {
                    lifecycle.addObserver(sortPopupWindow);
                }
                sortPopupWindow.setBackgroundDrawable(LIZ);
                Object value2 = this.LJLJL.getValue();
                o.LJIIIIZZ(value2, "<get-sortFilterView>(...)");
                View view2 = (View) value2;
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
                int paddingStart = view2.getPaddingStart() + i2;
                int height = view2.getHeight() + i3;
                if (C90193gN.LIZIZ(view2.getContext())) {
                    C16880lQ.LLLFF(sortPopupWindow, view2, 8388661, paddingStart, height);
                } else {
                    C16880lQ.LLLFF(sortPopupWindow, view2, 8388659, paddingStart, height);
                }
                this.LJLLJ = sortPopupWindow;
                return;
            }
            return;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() != R.id.d_h && num.intValue() != R.id.d_4 && num.intValue() != R.id.a0g && num.intValue() != R.id.d9y) {
            return;
        }
        C86071XqF c86071XqF = new C86071XqF();
        c86071XqF.LIZJ = "notification_page";
        c86071XqF.LIZLLL = this.LJLIL.LIZIZ();
        c86071XqF.LIZJ();
        TuxMultiSelectionSheet tuxMultiSelectionSheet2 = this.LJLJLJ;
        if (tuxMultiSelectionSheet2 != null && tuxMultiSelectionSheet2.isVisible()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<NoticeFilterModel> list2 = this.LJLL;
        if (list2 != null) {
            for (NoticeFilterModel noticeFilterModel : list2) {
                String str = "";
                if (this.LJLLILLLL.contains(Integer.valueOf(noticeFilterModel.filterId))) {
                    String str2 = noticeFilterModel.filterName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c253179wf = new C253179wf(str2, true, (Object) noticeFilterModel, 2);
                } else {
                    String str3 = noticeFilterModel.filterName;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c253179wf = new C253179wf(str3, false, (Object) noticeFilterModel, 6);
                }
                arrayList.add(c253179wf);
                String str4 = noticeFilterModel.filterName;
                if (str4 != null) {
                    str = str4;
                }
                arrayList2.add(new C253179wf(str, false, (Object) noticeFilterModel, 6));
            }
        }
        new C235119Kp();
        C253149wc c253149wc = new C253149wc();
        C235119Kp c235119Kp = new C235119Kp();
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cr);
        if (LIZIZ2 != null) {
            i = LIZIZ2.intValue();
        } else {
            i = 0;
        }
        c235119Kp.LIZJ(i);
        C234509Ig c234509Ig = new C234509Ig();
        String string = this.itemView.getResources().getString(R.string.eaz);
        o.LJIIIIZZ(string, "itemView.resources.getSt…ages_commonStrings_text7)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LJ = true;
        c234509Ig.LIZ = new C109824Ss(new AqS165S0100000_15(this, 870));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
        String string2 = this.itemView.getResources().getString(R.string.eay);
        o.LJIIIIZZ(string2, "itemView.resources.getSt…ages_commonStrings_text6)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        C234509Ig c234509Ig2 = new C234509Ig();
        String string3 = this.itemView.getResources().getString(R.string.eb0);
        o.LJIIIIZZ(string3, "itemView.resources.getSt…ages_commonStrings_text8)");
        c234509Ig2.LIZJ = string3;
        c234509Ig2.LIZ(EnumC252729vw.PRIMARY);
        c234509Ig2.LJ = true;
        c234509Ig2.LIZ = new C109824Ss(new AqS165S0100000_15(this, 871));
        c235119Kp.LIZIZ(c234509Ig2);
        c235119Kp.LIZLLL = true;
        TuxMultiSelectionSheet tuxMultiSelectionSheet3 = c253149wc.LIZ;
        tuxMultiSelectionSheet3.LJLLI = c235119Kp;
        tuxMultiSelectionSheet3.LJLLILLLL = 0;
        tuxMultiSelectionSheet3.LJLLL = arrayList;
        String string4 = this.itemView.getResources().getString(R.string.e_h);
        o.LJIIIIZZ(string4, "itemView.resources.getSt…mentsFilter_panel_button)");
        c253149wc.LIZ.LJLZ = string4;
        c253149wc.LIZ.LJLLLLLL = new AqS181S0100000_15(this, 264);
        AqS197S0100000_15 aqS197S0100000_15 = new AqS197S0100000_15(this, 61);
        TuxMultiSelectionSheet tuxMultiSelectionSheet4 = c253149wc.LIZ;
        tuxMultiSelectionSheet4.LJLLLL = aqS197S0100000_15;
        this.LJLJLJ = tuxMultiSelectionSheet4;
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ == null || (fragmentManager = LJIIIZ.getFragmentManager()) == null || (tuxMultiSelectionSheet = this.LJLJLJ) == null) {
            return;
        }
        tuxMultiSelectionSheet.show(fragmentManager, "filter");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC86063Xq7(View view, MTY listener) {
        super(view);
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(view, 873));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS165S0100000_15(view, 874));
        this.LJLJI = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS165S0100000_15(view, 868));
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(view, 869));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 930));
        C62822Ol8 LIZIZ3 = C221108m2.LIZIZ(new AqS165S0100000_15(view, 867));
        this.LJLJJLL = LIZIZ3;
        this.LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(view, 872));
        this.LJLLILLLL = C61878OQg.INSTANCE;
        C16880lQ.LJIJI(N(), this);
        M().setOnClickListener(new ViewOnClickListenerC13880ga(this));
        Object value = LIZIZ.getValue();
        o.LJIIIIZZ(value, "<get-sortView>(...)");
        C16880lQ.LJIIJ(this, (View) value);
        Object value2 = LIZIZ2.getValue();
        o.LJIIIIZZ(value2, "<get-filterLayout>(...)");
        C16880lQ.LJIIJ(this, (View) value2);
        Object value3 = LIZIZ3.getValue();
        o.LJIIIIZZ(value3, "<get-filterIcon>(...)");
        C16880lQ.LJIIJ(this, (View) value3);
    }
}
