package com.ss.android.ugc.aweme;

import X.EnumC42934Gt8;
import X.InterfaceC36571c5;
import X.InterfaceC42726Gpm;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class AnchorBaseFragment extends Fragment {
    public static EnumC42934Gt8 LJLJI = EnumC42934Gt8.NO_TYPE;
    public InterfaceC42726Gpm LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        InterfaceC42726Gpm interfaceC42726Gpm;
        super.onActivityCreated(bundle);
        if (mo49getActivity() != null) {
            InterfaceC36571c5 mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof InterfaceC42726Gpm) {
                interfaceC42726Gpm = (InterfaceC42726Gpm) mo49getActivity;
            } else {
                interfaceC42726Gpm = null;
            }
            this.LJLIL = interfaceC42726Gpm;
        }
    }
}
