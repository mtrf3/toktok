package com.ss.android.ugc.aweme.music.v2.assem;

import X.AnonymousClass636;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MusicLicenseAssem extends DynamicAssem {
    public static final /* synthetic */ int LJLJLLL = 0;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.buj;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CharSequence charSequence;
        o.LJIIIZ(view, "view");
        assembleChildren();
        Context context = getContext();
        if (context != null) {
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.e7, context);
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e_q);
            tuxIconView.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            tuxIconView.setTintColor(LJIIIIZZ);
            View findViewById = view.findViewById(R.id.text);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.text)");
            TextView textView = (TextView) findViewById;
            Context context2 = getContext();
            if (context2 != null) {
                charSequence = context2.getText(R.string.iim);
            } else {
                charSequence = null;
            }
            textView.setText(charSequence);
            textView.setTextColor(LJIIIIZZ);
        }
    }
}
