package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.BAI;
import X.BAM;
import X.BTJ;
import X.C15E;
import X.C15G;
import X.C16880lQ;
import X.C19K;
import X.C1A;
import X.C1B3;
import X.C1B6;
import X.C1EW;
import X.C28335BAd;
import X.C28338BAg;
import X.C28507BGt;
import X.C29306Beo;
import X.C2A7;
import X.C38931ft;
import X.C51029K0z;
import X.C5H3;
import X.C78856UxA;
import X.C78996UzQ;
import X.C80261Vej;
import X.LHW;
import Y.ACListenerS25S0100000_5;
import Y.AfS20S1100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessDismissStartDialogEvent;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import ujb.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class DrawGuessNewStartDialog extends LiveDialogFragment implements C15G {
    public static final /* synthetic */ int LJLJL = 0;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new C28335BAd(this));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(BAM.LJLIL);

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.cwg);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 48;
        return c28507BGt;
    }

    public final DrawGuessStartFragment vl() {
        return (DrawGuessStartFragment) this.LJLIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        wl();
        super.dismiss();
    }

    public final void wl() {
        Object obj;
        InputMethodManager inputMethodManager;
        Context context = getContext();
        IBinder iBinder = null;
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        } else {
            obj = null;
        }
        if ((obj instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) obj) != null) {
            View view = getView();
            if (view != null) {
                iBinder = view.getWindowToken();
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }

    public final C78856UxA Al(int i) {
        TextView textView;
        C78856UxA newTab = ((C80261Vej) _$_findCachedViewById(R.id.kyt)).newTab();
        newTab.LIZJ(R.layout.d21);
        View view = newTab.LJFF;
        if (view != null && (textView = (TextView) view.findViewById(R.id.kyq)) != null) {
            textView.setText(i);
        }
        return newTab;
    }

    public final void xl(Fragment... fragmentArr) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        for (Fragment fragment : fragmentArr) {
            LIZ.LIZIZ(R.id.dm7, fragment);
        }
        LIZ.LJIILJJIL();
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        this.LJLJJL = z;
        DrawGuessStartFragment vl = vl();
        vl.LJLJJI = z;
        if (z) {
            ValueAnimator valueAnimator = vl.LJLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            vl.LJLJI = String.valueOf(((C19K) vl._$_findCachedViewById(R.id.cos)).getText());
            BAI.LJIIIIZZ(C51029K0z.LJIILIIL(vl), vl.LJLJI, vl.LJLJL);
            vl.xl(true);
            ((TextView) vl._$_findCachedViewById(R.id.cos)).setText("");
        } else {
            String charSequence = s.LJZI(String.valueOf(((C19K) vl._$_findCachedViewById(R.id.cos)).getText())).toString();
            vl.LJLJLLL = true;
            TextView textView = (TextView) vl._$_findCachedViewById(R.id.cos);
            if (o.LJJJJJL(charSequence)) {
                charSequence = vl.LJLJI;
            }
            textView.setText(charSequence);
            vl._$_findCachedViewById(R.id.cos).clearFocus();
            C29306Beo.LJJLJLI(vl._$_findCachedViewById(R.id.kcs));
            ((C2A7) vl._$_findCachedViewById(R.id.kcs)).LJII();
            String valueOf = String.valueOf(((C19K) vl._$_findCachedViewById(R.id.cos)).getText());
            C1EW.LIZ(((DrawGuessApi) C1A.LIZJ(DrawGuessApi.class)).reviewWord(C29306Beo.LJJIZ(C51029K0z.LJIILIIL(vl)), valueOf)).LJII(BTJ.LIZIZ(vl)).LJJJLIIL(new AfS20S1100000_5(vl, valueOf, 6), new AfS20S1100000_5(vl, valueOf, 7));
        }
        vl.LJLJJL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        RoomAuthStatus roomAuthStatus;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Boolean bool2 = null;
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("argument_is_from_round_summary"));
        } else {
            bool = null;
        }
        this.LJLJJI = C29306Beo.LJJIFFI(bool);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            bool2 = Boolean.valueOf(arguments2.getBoolean("argument_is_custom_next_word"));
        }
        this.LJLJI = C29306Beo.LJJIFFI(bool2);
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.dataChannel);
        if (LJJIJLIJ != null && (roomAuthStatus = LJJIJLIJ.getRoomAuthStatus()) != null && roomAuthStatus.pictionarypermission == 2 && !this.LJLJI) {
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.kyt));
            ((C80261Vej) _$_findCachedViewById(R.id.kyt)).addOnTabSelectedListener((LHW) new C28338BAg(this));
            ((C80261Vej) _$_findCachedViewById(R.id.kyt)).addTab(Al(R.string.ksq), true);
            ((C80261Vej) _$_findCachedViewById(R.id.kyt)).addTab(Al(R.string.ksr), false);
            xl(this.LJLILLLLZI.getValue(), vl());
        } else {
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.la4));
            if (this.LJLJI) {
                ((TextView) _$_findCachedViewById(R.id.title)).setText(R.string.ksw);
                if (this.LJLJJI) {
                    C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.aeg));
                    C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aeg), new ACListenerS25S0100000_5(this, 189));
                }
            }
            xl(vl());
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, DrawGuessDismissStartDialogEvent.class, new AqS171S0100000_5(this, 419));
        }
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 190), _$_findCachedViewById(R.id.jr6));
        MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) _$_findCachedViewById(R.id.ggi);
        measureLinearLayout.getClass();
        measureLinearLayout.LJLIL = new C38931ft();
        C15E keyBoardObservable = ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).getKeyBoardObservable();
        if (keyBoardObservable.LIZJ == null) {
            keyBoardObservable.LIZJ = new ArrayList();
        }
        ((ArrayList) keyBoardObservable.LIZJ).add(this);
    }
}
