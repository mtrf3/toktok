package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.assem;

import X.C16880lQ;
import X.C213688a4;
import X.C214298b3;
import X.C43I;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VA;
import X.C8VB;
import X.C8YN;
import X.C97343ru;
import X.C9BE;
import X.C9RJ;
import X.C9RK;
import X.C9RL;
import X.InterfaceC93663ly;
import X.ORZ;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchBarAssem extends UIContentAssem implements InterfaceC93663ly {
    public final C214298b3 LJLIL;
    public EditText LJLILLLLZI;
    public View LJLJI;
    public Map<Integer, View> LJLJJI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLJJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC93663ly, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public SearchBarAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ContactListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 371), C9RL.INSTANCE, null);
    }

    public final void A3() {
        View view = this.LJLJI;
        if (view != null) {
            view.setVisibility(8);
            EditText editText = this.LJLILLLLZI;
            if (editText != null) {
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                C9RK c9rk = C9RK.LJLIL;
                Class<SearchBarAssem> cls = SearchBarAssem.class;
                Class<?>[] interfaces = cls.getInterfaces();
                o.LJIIIIZZ(interfaces, "currentClass.interfaces");
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls2 : interfaces) {
                    if (C8VB.class.isAssignableFrom(cls2)) {
                        arrayList.add(cls2);
                    }
                }
                while (arrayList.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls == null) {
                        return;
                    }
                    Class<?>[] interfaces2 = cls.getInterfaces();
                    o.LJIIIIZZ(interfaces2, "currentClass.interfaces");
                    arrayList = new ArrayList();
                    for (Class<?> cls3 : interfaces2) {
                        if (C8VB.class.isAssignableFrom(cls3)) {
                            arrayList.add(cls3);
                        }
                    }
                }
                C8VA LIZLLL = getSupervisor().LIZLLL();
                Object LJLLJ = ORZ.LJLLJ(arrayList);
                o.LJII(LJLLJ, "null cannot be cast to non-null type java.lang.Class<out com.bytedance.assem.arch.service.AssemObservableService<DATA of com.bytedance.assem.arch.service.AssemServiceExtKt.setAssemServiceState>>");
                LIZLLL.LJI((Class) LJLLJ, c9rk);
                return;
            }
            o.LJIJI("searchEditText");
            throw null;
        }
        o.LJIJI("closeBtn");
        throw null;
    }

    @Override // X.InterfaceC93663ly
    public void LJIJI() {
        EditText editText = this.LJLILLLLZI;
        if (editText != null) {
            if (editText.hasFocus()) {
                editText.clearFocus();
            }
            EditText editText2 = this.LJLILLLLZI;
            if (editText2 != null) {
                KeyboardUtils.LIZIZ(editText2);
                return;
            } else {
                o.LJIJI("searchEditText");
                throw null;
            }
        }
        o.LJIJI("searchEditText");
        throw null;
    }

    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public C9RJ defaultObservableData() {
        return new C9RJ(new C43I(Boolean.FALSE), null);
    }

    public final ContactListViewModel x3() {
        return (ContactListViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        View containerView = getContainerView();
        o.LJI(containerView);
        EditText editText = (EditText) containerView.findViewById(R.id.jf9);
        Context context = editText.getContext();
        if (context != null) {
            str = context.getString(R.string.qd1);
        } else {
            str = null;
        }
        editText.setHint(str);
        editText.addTextChangedListener(new IDObjectS177S0100000_4(this, 4));
        this.LJLILLLLZI = editText;
        View containerView2 = getContainerView();
        o.LJI(containerView2);
        TuxIconView tuxIconView = (TuxIconView) containerView2.findViewById(R.id.avg);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS24S0100000_4(this, 64));
        tuxIconView.setContentDescription(C97343ru.LJFF(R.string.b2j));
        this.LJLJI = tuxIconView;
        C8YN.LJII(this, x3(), new TBT() { // from class: X.3mA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C91843j2) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 102), 4);
    }
}
