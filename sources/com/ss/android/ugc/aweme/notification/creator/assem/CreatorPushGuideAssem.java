package com.ss.android.ugc.aweme.notification.creator.assem;

import X.ActivityC45651qj;
import X.C221018lt;
import X.C42398GkU;
import X.C45804HyK;
import X.C55879LwR;
import X.C56747MOx;
import X.C78565UsT;
import X.C79045V0n;
import X.C86V;
import X.INB;
import X.LLQ;
import X.LNZ;
import X.MN5;
import X.MPS;
import X.ViewOnClickListenerC226978vV;
import X.X1D;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorPushGuideAssem extends UIContentAssem {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C55879LwR.LIZJ(0, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        ActivityC45651qj LJJIFFI;
        LLQ Xm0;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            if (INB.LIZIZ() || ((Xm0 = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0()) != null && !Xm0.LJIILLIIL())) {
                View _$_findCachedViewById = _$_findCachedViewById(R.id.aoj);
                if (_$_findCachedViewById != null) {
                    _$_findCachedViewById.setVisibility(8);
                }
            } else {
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.aoj);
                if (_$_findCachedViewById2 != null) {
                    _$_findCachedViewById2.setVisibility(0);
                }
            }
        }
        Context context2 = getContext();
        ViewOnClickListenerC226978vV viewOnClickListenerC226978vV = (ViewOnClickListenerC226978vV) _$_findCachedViewById(R.id.dxc);
        viewOnClickListenerC226978vV.setIconImage(MN5.LIZ(R.raw.icon_bell));
        viewOnClickListenerC226978vV.setCloseImage(MN5.LIZ(R.raw.icon_x_mark_small));
        SpannableString spannableString = new SpannableString(C86V.LJFF(R.string.hdw));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C42398GkU.LIZIZ(C86V.LJFF(R.string.hdx), ' '));
        if (context2 != null) {
            Integer LJI = C79045V0n.LJI(R.attr.eb, context2);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 34);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
            spannableStringBuilder.append((CharSequence) spannableString);
        }
        viewOnClickListenerC226978vV.setTitleText(spannableStringBuilder);
        C55879LwR.LIZLLL = new WeakReference<>(viewOnClickListenerC226978vV);
        C56747MOx c56747MOx = new C56747MOx(viewOnClickListenerC226978vV, new C78565UsT());
        c56747MOx.LIZLLL = MPS.Message;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type:");
        LIZ.append(1);
        C221018lt.LJFF("Creators_Inbox NotificationPushGuide", X1D.LIZIZ(LIZ));
        c56747MOx.LIZ();
    }
}
