package com.ss.android.ugc.aweme.refactor.integration;

import X.ActivityC45651qj;
import X.C12420eE;
import X.C12450eH;
import X.C12460eI;
import X.C214738bl;
import X.C35656Dz2;
import X.C35878E6g;
import X.C40741Fyr;
import X.C40745Fyv;
import X.C40751Fz1;
import X.C64390POw;
import X.C65352Pkq;
import X.C71745SDt;
import X.C76800UCe;
import X.EnumC12440eG;
import X.EnumC40761FzB;
import X.G0D;
import X.InterfaceC18010nF;
import X.InterfaceC34471Wx;
import X.InterfaceC65784Pro;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class NUJComponentFragment extends AmeBaseFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C214738bl LJLIL = C71745SDt.LIZ(this, C65352Pkq.LIZ(NUJComponentViewModel.class), new AqS156S0100000_6(new AqS156S0100000_6((Fragment) this, 68), (InterfaceC65784Pro<C76800UCe>) 69), null);
    public final CopyOnWriteArrayList<Runnable> LJLILLLLZI = new CopyOnWriteArrayList<>();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetach ");
        LIZ.append(this);
        LIZ.append("...");
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
    }

    public final C35656Dz2 wl() {
        NUJComponentViewModel xl;
        EnumC40761FzB enumC40761FzB;
        G0D LIZ;
        if (mo49getActivity() == null || (xl = xl()) == null || (enumC40761FzB = xl.LJLILLLLZI) == null || (LIZ = C40751Fz1.LIZ()) == null || !((Map) LIZ.LJLJI).containsKey(enumC40761FzB)) {
            return null;
        }
        return (C35656Dz2) ((Map) LIZ.LJLJI).get(enumC40761FzB);
    }

    public final NUJComponentViewModel xl() {
        if (mo49getActivity() == null) {
            return null;
        }
        return (NUJComponentViewModel) this.LJLIL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttach ");
        LIZ.append(this);
        LIZ.append("...");
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        Iterator<Runnable> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.LJLILLLLZI.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C64390POw.LIZIZ.LIZ() && (this instanceof InterfaceC18010nF)) {
            InterfaceC18010nF interfaceC18010nF = (InterfaceC18010nF) this;
            C12420eE c12420eE = new C12420eE();
            c12420eE.LIZ(interfaceC18010nF.LLZIL());
            String btmPageCode = interfaceC18010nF.getBtmPageCode();
            o.LJIIIZ(btmPageCode, "<set-?>");
            c12420eE.LIZJ = btmPageCode;
            c12420eE.LJIIJJI = interfaceC18010nF.x3();
            if (interfaceC18010nF instanceof Activity) {
                c12420eE.LIZIZ(EnumC12440eG.ACTIVITY);
                c12420eE.LJI = new WeakReference<>(interfaceC18010nF);
            } else if (interfaceC18010nF instanceof Fragment) {
                c12420eE.LIZIZ(EnumC12440eG.FRAGMENT);
                c12420eE.LJFF = new WeakReference<>(interfaceC18010nF);
                ActivityC45651qj mo49getActivity = ((Fragment) interfaceC18010nF).mo49getActivity();
                if (mo49getActivity != null) {
                    c12420eE.LJI = new WeakReference<>(mo49getActivity);
                }
                if (interfaceC18010nF instanceof InterfaceC34471Wx) {
                    c12420eE.LJIIIZ = true;
                    String xi = ((InterfaceC34471Wx) interfaceC18010nF).xi();
                    o.LJIIIZ(xi, "<set-?>");
                    c12420eE.LJIIJ = xi;
                }
            }
            c12420eE.LJ = true;
            C12460eI.LJII(new C12450eH(c12420eE));
        }
    }

    public final void vl(Boolean bool) {
        MutableLiveData<C40745Fyv> mutableLiveData;
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("complete isSkip:");
        LIZ.append(bool);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        C35878E6g.LIZ();
        Boolean valueOf = Boolean.valueOf(o.LJ(bool, Boolean.FALSE));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("realComplete isAffectFeedContent:");
        LIZ2.append(valueOf);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ2));
        NUJComponentViewModel xl = xl();
        if (xl != null && (mutableLiveData = xl.LJLIL) != null) {
            if (valueOf != null) {
                z = valueOf.booleanValue();
            } else {
                z = false;
            }
            mutableLiveData.postValue(new C40745Fyv(z));
        }
    }
}
