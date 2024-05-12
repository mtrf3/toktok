package com.bytedance.android.livesdk.dislike;

import X.BZI;
import X.C0JU;
import X.C16880lQ;
import X.C28347BAp;
import X.C28507BGt;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveLongPressDialog extends LiveDialogFragment implements DialogInterface {
    public boolean LJLIL;
    public IHostLongPressCallback LJLILLLLZI;
    public Room LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final AqS171S0100000_5 LJLJL = new AqS171S0100000_5(this, 379);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cyp);
        c28507BGt.LIZJ = R.style.acb;
        c28507BGt.LJII = 17;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            try {
                Object LLILL = C16880lQ.LLILL(context, "vibrator");
                o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
                ((Vibrator) LLILL).vibrate(15L);
            } catch (Exception unused) {
            }
        }
        Room room = this.LJLJI;
        if (room != null) {
            String str = this.LJLJJI;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.LJLJJL;
            if (str3 != null) {
                str2 = str3;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C28347BAp.LIZ(linkedHashMap, room, str, str2, "long_press");
            BZI LIZIZ = C0JU.LIZIZ("live_report_icon_show", "long_press", "request_page", "long_press", "report_type");
            LIZIZ.LJIJJ("long_press", "show_type");
            LIZIZ.LJIIZILJ();
            LIZIZ.LJJIFFI(linkedHashMap);
            LIZIZ.LJJIIJZLJL();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.h3m), new ACListenerS25S0100000_5(this.LJLJL, 151));
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.cbz), new ACListenerS25S0100000_5(this.LJLJL, 151));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.ixb), new ACListenerS25S0100000_5(this.LJLJL, 151));
        if (this.LJLIL) {
            _$_findCachedViewById(R.id.h3m).setVisibility(8);
        }
    }
}
