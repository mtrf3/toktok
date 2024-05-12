package com.bytedance.android.live.liveinteract.multihost.biz.topicroundtable.ui.dialog;

import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C265112h;
import X.C28507BGt;
import X.C2A7;
import X.C47121t6;
import X.C61878OQg;
import X.C73411SrX;
import X.C75650TmY;
import X.C75662Tmk;
import X.C75665Tmn;
import X.C76524U1o;
import X.InterfaceC75670Tms;
import X.InterfaceC92693kP;
import X.ORZ;
import X.TMC;
import X.U1W;
import X.UHK;
import Y.ACListenerS33S0100000_13;
import Y.AfS65S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TopicPairPreviewDialog extends LiveDialogFragment implements InterfaceC75670Tms {
    public static final /* synthetic */ int LJLLJ = 0;
    public C75665Tmn LJLIL;
    public ViewGroup LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public UHK LJLJJLL;
    public ViewGroup LJLJL;
    public boolean LJLJLLL;
    public long LJLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public List<? extends ImageModel> LJLILLLLZI = C61878OQg.INSTANCE;
    public int LJLJLJ = 2;
    public final C75662Tmk LJLLI = new C75662Tmk(this);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d1o);
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C75665Tmn c75665Tmn = this.LJLIL;
        if (c75665Tmn != null) {
            c75665Tmn.LIZ.LIZLLL();
            c75665Tmn.LIZIZ = null;
        }
        C75662Tmk callback = this.LJLLI;
        o.LJIIIZ(callback, "callback");
        ((ArrayList) C75650TmY.LJIIIIZZ).remove(callback);
        _$_clearFindViewByIdCache();
    }

    public final void vl(long j) {
        C47121t6 c47121t6 = this.LJLJJI;
        if (c47121t6 != null) {
            c47121t6.setText(C16880lQ.LLLZI(Locale.US, "%02d", new Object[]{Long.valueOf(j / 60)}));
        }
        C47121t6 c47121t62 = this.LJLJJL;
        if (c47121t62 != null) {
            c47121t62.setText(C16880lQ.LLLZI(Locale.US, "%02d", new Object[]{Long.valueOf(j % 60)}));
        }
        C47121t6 c47121t63 = this.LJLJJI;
        if (c47121t63 != null) {
            c47121t63.LJJIJIL(R.style.os);
        }
        C47121t6 c47121t64 = this.LJLJJL;
        if (c47121t64 != null) {
            c47121t64.LJJIJIL(R.style.os);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLL < 0) {
            dismiss();
        }
        C75665Tmn c75665Tmn = new C75665Tmn();
        c75665Tmn.LIZIZ = this;
        this.LJLIL = c75665Tmn;
        view.findViewById(R.id.mow);
        this.LJLJI = (ViewGroup) view.findViewById(R.id.li5);
        this.LJLJJI = (C47121t6) view.findViewById(R.id.mou);
        this.LJLJJL = (C47121t6) view.findViewById(R.id.mov);
        vl(this.LJLL);
        if (!C15380j0.LJIIZILJ()) {
            C15490jB.LJFF(this.LJLJI, "tiktok_live_interaction_normal_1", "ttlive_topic_roundtable_preview_dialog_bg.png", ImageView.ScaleType.FIT_XY, null);
        } else {
            C15490jB.LJFF(this.LJLJI, "tiktok_live_interaction_normal_1", "ttlive_topic_roundtable_preview_dialog_bg_rtl.png", ImageView.ScaleType.FIT_XY, null);
        }
        this.LJLJL = (ViewGroup) view.findViewById(R.id.fnc);
        C16880lQ.LJJIII((C2A7) view.findViewById(R.id.b00), new ACListenerS33S0100000_13(this, 44));
        C75662Tmk callback = this.LJLLI;
        o.LJIIIZ(callback, "callback");
        ((ArrayList) C75650TmY.LJIIIIZZ).add(callback);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C76524U1o c76524U1o = new C76524U1o(context, C16880lQ.LLZIL(getContext()));
        UHK uhk = (UHK) view.findViewById(R.id.nes);
        if (!this.LJLJLLL) {
            i = 0;
        } else {
            i = 8;
        }
        uhk.setVisibility(i);
        uhk.setClickable(false);
        uhk.setPageMargin(-((int) (C15380j0.LJIIL() / 1.25f)));
        uhk.setOffscreenPageLimit(2);
        if (this.LJLILLLLZI.size() >= 10) {
            z = true;
        } else {
            z = false;
        }
        uhk.setPageTransformer(false, new U1W(uhk, z));
        List<? extends ImageModel> list = this.LJLILLLLZI;
        if (list != null) {
            List LJLL = ORZ.LJLL(list);
            c76524U1o.LJLJJLL.clear();
            c76524U1o.LJLJJLL.addAll(LJLL);
        }
        uhk.setAdapter(c76524U1o);
        uhk.setCurrentItem(this.LJLJLJ);
        this.LJLJJLL = uhk;
        if (this.LJLILLLLZI.size() >= 10) {
            InterfaceC92693kP LJJJJZI = C265112h.LIZ(TMC.LJJI(2300L, TimeUnit.MILLISECONDS)).LJJJJZI(new AfS65S0100000_13(this, 52));
            C75665Tmn c75665Tmn2 = this.LJLIL;
            if (c75665Tmn2 != null) {
                c75665Tmn2.LIZ((C73411SrX) LJJJJZI);
            }
        }
    }
}
