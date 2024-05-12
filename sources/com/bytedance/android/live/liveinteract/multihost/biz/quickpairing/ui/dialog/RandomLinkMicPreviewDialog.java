package com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog;

import X.BZI;
import X.C15380j0;
import X.C16880lQ;
import X.C265112h;
import X.C28507BGt;
import X.C28787BRn;
import X.C47121t6;
import X.C61878OQg;
import X.C73411SrX;
import X.C75545Tkr;
import X.C75698TnK;
import X.C75700TnM;
import X.C76524U1o;
import X.EnumC75535Tkh;
import X.EnumC75614Tly;
import X.InterfaceC75715Tnb;
import X.InterfaceC92693kP;
import X.ORZ;
import X.OSZ;
import X.TMC;
import X.U1W;
import X.UHK;
import X.X1D;
import Y.ACListenerS33S0100000_13;
import Y.AfS62S0200000_13;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
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
public final class RandomLinkMicPreviewDialog extends LiveDialogFragment implements InterfaceC75715Tnb {
    public static final /* synthetic */ int LJLJLJ = 0;
    public C75700TnM LJLIL;
    public C47121t6 LJLJI;
    public OSZ<? extends EnumC75535Tkh, Long> LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public List<? extends ImageModel> LJLILLLLZI = C61878OQg.INSTANCE;
    public int LJLJJI = 2;
    public final C75698TnK LJLJJLL = new C75698TnK(this);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d05);
        c28507BGt.LJII = 80;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C75700TnM c75700TnM = this.LJLIL;
        if (c75700TnM != null) {
            c75700TnM.LIZ.LIZLLL();
            c75700TnM.LIZIZ = null;
        }
        C75698TnK callback = this.LJLJJLL;
        o.LJIIIZ(callback, "callback");
        ((ArrayList) RandomLinkMicManager.LJLJLLL).remove(callback);
        _$_clearFindViewByIdCache();
    }

    public final void vl(OSZ<? extends EnumC75535Tkh, Long> osz) {
        long longValue;
        int length;
        C47121t6 c47121t6 = this.LJLJI;
        if (c47121t6 == null) {
            return;
        }
        if (osz.getFirst() == EnumC75535Tkh.COUNTDOWN_WAITING) {
            longValue = 16 - osz.getSecond().longValue();
        } else {
            longValue = osz.getSecond().longValue();
        }
        Locale locale = Locale.US;
        String LLLZI = C16880lQ.LLLZI(locale, "%02d", new Object[]{Long.valueOf(longValue / 60)});
        String LLLZI2 = C16880lQ.LLLZI(locale, "%02d", new Object[]{Long.valueOf(longValue % 60)});
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C15380j0.LJIILJJIL(R.string.knw));
        LIZ.append(LLLZI);
        LIZ.append(":");
        LIZ.append(LLLZI2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder().append(R…nd(lastSecond).toString()");
        int indexOf = LIZIZ.indexOf(LLLZI);
        int lastIndexOf = LIZIZ.lastIndexOf(LLLZI2);
        if (indexOf < lastIndexOf) {
            length = LLLZI2.length() + lastIndexOf;
        } else {
            length = LLLZI.length() + indexOf;
            indexOf = lastIndexOf;
        }
        SpannableString spannableString = new SpannableString(LIZIZ);
        if (indexOf >= 0 && length >= 0 && indexOf <= length) {
            spannableString.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a8r)), indexOf, length, 33);
        }
        c47121t6.setText(spannableString);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJJL == null) {
            dismiss();
        }
        long j = RandomLinkMicManager.LJLJJI;
        BZI LIZ = C28787BRn.LIZ("livesdk_cancel_connection_popup_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(j * 1000), "waiting_time");
        LIZ.LJIJJ("connection_icon", "enter_from");
        LIZ.LJIJJ(C75545Tkr.LIZIZ(EnumC75614Tly.RANDOM_LINK_MIC_INVITE), "invitee_list");
        LIZ.LJJIIJZLJL();
        C75700TnM c75700TnM = new C75700TnM();
        c75700TnM.LIZIZ = this;
        this.LJLIL = c75700TnM;
        this.LJLJI = (C47121t6) view.findViewById(R.id.mg5);
        OSZ<? extends EnumC75535Tkh, Long> osz = this.LJLJJL;
        o.LJI(osz);
        vl(osz);
        C47121t6 c47121t6 = (C47121t6) view.findViewById(R.id.mft);
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS33S0100000_13(this, 43));
        }
        C75698TnK callback = this.LJLJJLL;
        o.LJIIIZ(callback, "callback");
        ((ArrayList) RandomLinkMicManager.LJLJLLL).add(callback);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C76524U1o c76524U1o = new C76524U1o(context, C16880lQ.LLZIL(getContext()));
        UHK uhk = (UHK) view.findViewById(R.id.nen);
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
        uhk.setCurrentItem(this.LJLJJI);
        if (this.LJLILLLLZI.size() >= 10) {
            InterfaceC92693kP LJJJJZI = C265112h.LIZ(TMC.LJJI(2300L, TimeUnit.MILLISECONDS)).LJJJJZI(new AfS62S0200000_13(this, uhk, 8));
            C75700TnM c75700TnM2 = this.LJLIL;
            if (c75700TnM2 != null) {
                c75700TnM2.LIZ((C73411SrX) LJJJJZI);
            }
        }
    }
}
