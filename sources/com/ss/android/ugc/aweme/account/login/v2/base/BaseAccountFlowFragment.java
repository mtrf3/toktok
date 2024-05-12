package com.ss.android.ugc.aweme.account.login.v2.base;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C62822Ol8;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.GH7;
import X.InterfaceC68974R5e;
import X.InterfaceC69035R7n;
import X.InterfaceC69056R8i;
import X.QQE;
import X.QQI;
import X.R5P;
import X.R7F;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class BaseAccountFlowFragment extends AmeBaseFragment implements InterfaceC68974R5e, InterfaceC69056R8i {
    public ArrayList<QQE<? extends QQI>> LJLILLLLZI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public String LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();
    public long LJLIL = System.currentTimeMillis();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 21));

    public String Gl() {
        return "";
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    public abstract boolean onBackPressed();

    @Override // X.InterfaceC69056R8i
    public final BaseAccountFlowFragment q9() {
        return this;
    }

    public BaseAccountFlowFragment() {
        String string;
        C221108m2.LIZIZ(new AqS161S0100000_11(this, 16));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 44));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 67));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 68));
        Bundle arguments = getArguments();
        this.LJLJL = (arguments == null || (string = arguments.getString("enter_type")) == null) ? "" : string;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 18));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 43));
        this.LJLL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 17));
        this.LJLLI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 19));
        this.LJLLILLLL = C221108m2.LIZIZ(R5P.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 20));
        this.LJLLL = C221108m2.LIZIZ(new GH7(this));
    }

    public final EnumC69113RAn Al() {
        return (EnumC69113RAn) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC69056R8i
    public final String Hg() {
        String profileBindFrom = (String) this.LJLJJI.getValue();
        o.LJIIIIZZ(profileBindFrom, "profileBindFrom");
        return profileBindFrom;
    }

    @Override // X.InterfaceC69056R8i
    public final R7F S9() {
        Object value = this.LJLLILLLL.getValue();
        o.LJIIIIZZ(value, "<get-commonRequestApi>(...)");
        return (R7F) value;
    }

    @Override // X.InterfaceC68974R5e
    public final String channel() {
        String channel = (String) this.LJLJLLL.getValue();
        o.LJIIIIZZ(channel, "channel");
        return channel;
    }

    public final String getEnterFrom() {
        return (String) this.LJLJJL.getValue();
    }

    public final String getEnterMethod() {
        return (String) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC69056R8i
    public final InterfaceC69035R7n r9() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-passportApi>(...)");
        return (InterfaceC69035R7n) value;
    }

    public final void vl() {
        ArrayList<QQE<? extends QQI>> arrayList = this.LJLILLLLZI;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            Object obj = ListProtector.get(arrayList, size);
            o.LJIIIIZZ(obj, "nonNullCallbackList[i]");
            QQE qqe = (QQE) obj;
            if (!qqe.cancel) {
                qqe.cancel();
            }
            ListProtector.remove(arrayList, size);
        }
    }

    public final String wl() {
        return (String) this.LJLJLJ.getValue();
    }

    public final EnumC69116RAq xl() {
        return (EnumC69116RAq) this.LJLLJ.getValue();
    }

    public String LJJLIIIJJI() {
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        return enterFrom;
    }

    public String LJJLIIIJLLLLLLLZ() {
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        return enterMethod;
    }

    @Override // X.InterfaceC69056R8i
    public final EnumC69113RAn LJLLLL() {
        return Al();
    }

    @Override // X.InterfaceC68974R5e
    public final String LLZZ() {
        String loginPanelType = wl();
        o.LJIIIIZZ(loginPanelType, "loginPanelType");
        return loginPanelType;
    }

    @Override // X.InterfaceC68974R5e
    public final Bundle getExtras() {
        return getArguments();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        vl();
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.LJLIL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC69056R8i
    public final EnumC69116RAq scene() {
        return xl();
    }

    @Override // X.InterfaceC68974R5e
    public final String Xg() {
        return this.LJLJL;
    }

    public final void Dl(Bundle bundle) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ((ActionResultModel) ViewModelProviders.of(mo49getActivity).get(ActionResultModel.class)).LJLILLLLZI.postValue(bundle);
        }
    }

    @Override // X.InterfaceC69056R8i
    public final <T extends QQI> void bi(QQE<T> qqe) {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new ArrayList<>();
        }
        ArrayList<QQE<? extends QQI>> arrayList = this.LJLILLLLZI;
        o.LJI(arrayList);
        arrayList.add(qqe);
    }

    @Override // X.InterfaceC69056R8i
    public final void rh(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            ((ActionResultModel) ViewModelProviders.of(mo49getActivity).get(ActionResultModel.class)).LJLIL.postValue(bundle);
        }
    }
}
