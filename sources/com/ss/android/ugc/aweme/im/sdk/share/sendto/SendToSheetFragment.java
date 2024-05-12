package com.ss.android.ugc.aweme.im.sdk.share.sendto;

import X.ActivityC45651qj;
import X.C10A;
import X.C110614Vt;
import X.C113154cJ;
import X.C141335gf;
import X.C16880lQ;
import X.C1DF;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C4ZZ;
import X.C62822Ol8;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.InterfaceC111514Zf;
import X.S3I;
import X.S3L;
import X.SY4;
import X.W5F;
import X.W5U;
import Y.ACListenerS21S0100000_1;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendToSheetFragment extends BaseFragment {
    public C113154cJ LJLILLLLZI;
    public AqS151S0100000_1 LJLJI;
    public AqS167S0100000_1 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 669));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final SendToViewModel vl() {
        return (SendToViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        vl().LJLIL = this.LJLILLLLZI;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.jvw);
        C110614Vt c110614Vt = new C110614Vt();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        c110614Vt.LIZ = C79045V0n.LJ(R.attr.cr, requireContext);
        c110614Vt.LJIIIIZZ = Float.valueOf(C1DF.LJIIIIZZ(8));
        c110614Vt.LJIIIZ = Float.valueOf(C1DF.LJIIIIZZ(8));
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        _$_findCachedViewById.setBackground(c110614Vt.LIZ(requireContext2));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.f0h), new ACListenerS21S0100000_1(this, 105));
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 106), _$_findCachedViewById(R.id.cvu));
        ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.jtr);
        EditText multi_share_et = (EditText) _$_findCachedViewById(R.id.gpk);
        o.LJIIIIZZ(multi_share_et, "multi_share_et");
        InterfaceC111514Zf interfaceC111514Zf = new InterfaceC111514Zf() { // from class: X.4cL
            @Override // X.InterfaceC111514Zf
            public final void LIZ(int i, String emojiText) {
                o.LJIIIZ(emojiText, "emojiText");
            }
        };
        ViewGroup share_mini_emoji_container = (ViewGroup) _$_findCachedViewById(R.id.jtr);
        o.LJIIIIZZ(share_mini_emoji_container, "share_mini_emoji_container");
        viewGroup.addView(new C4ZZ(multi_share_et, interfaceC111514Zf, share_mini_emoji_container).LJI.LJLIL);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.jo0), new ACListenerS21S0100000_1(this, 107));
        C113154cJ c113154cJ = vl().LJLIL;
        String str3 = "";
        if (c113154cJ == null || (str = c113154cJ.LJI) == null) {
            str = "";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.gpj);
        LJIIIIZZ.LJIIJJI = R.drawable.bgc;
        S3I s3i = new S3I();
        s3i.LIZLLL = C1DF.LJIIIIZZ(2);
        LJIIIIZZ.LJIJJLI = new S3L(s3i);
        C16880lQ.LLJJJ(LJIIIIZZ);
        vl().LJLJI.observe(this, new AObserverS69S0100000_1(this, 55));
        TextView textView = (TextView) _$_findCachedViewById(R.id.gpk);
        C113154cJ c113154cJ2 = this.LJLILLLLZI;
        if (c113154cJ2 != null && (str2 = c113154cJ2.LJFF) != null) {
            str3 = str2;
        }
        textView.setText(str3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.b28, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
