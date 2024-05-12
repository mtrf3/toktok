package com.bytedance.android.livesdk.interaction.poll.ui;

import X.C10A;
import X.C15380j0;
import X.C15620jO;
import X.C16880lQ;
import X.C28507BGt;
import X.C30602Bzi;
import X.C41051jJ;
import X.C47061t0;
import X.C76800UCe;
import X.CCG;
import X.InterfaceC65784Pro;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPollWarnDialog extends LiveDialogFragment {
    public Gift LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public SelectPollViewModel LJLJI;
    public C41051jJ LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cxk);
        c28507BGt.LJII = 17;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        boolean z;
        long j;
        NextLiveData<Throwable> gv0;
        super.dismissAllowingStateLoss();
        DataChannel dataChannel = this.dataChannel;
        C41051jJ c41051jJ = this.LJLJJI;
        if (c41051jJ != null) {
            z = c41051jJ.isChecked();
        } else {
            z = false;
        }
        Gift gift = this.LJLIL;
        if (gift != null) {
            j = gift.id;
        } else {
            j = 0;
        }
        CCG.LIZIZ(j, dataChannel, "cancel", z);
        SelectPollViewModel selectPollViewModel = this.LJLJI;
        if (selectPollViewModel == null || (gv0 = selectPollViewModel.gv0()) == null) {
            return;
        }
        gv0.setValue(new Throwable("user dismiss"));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(C15380j0.LJFF(R.dimen.aci), C15380j0.LJFF(R.dimen.acj));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public static final /* synthetic */ void vl(GiftPollWarnDialog giftPollWarnDialog) {
        super.dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageModel imageModel;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C47061t0 c47061t0 = (C47061t0) view.findViewById(R.id.hwl);
        Gift gift = this.LJLIL;
        String str4 = null;
        if (gift != null) {
            imageModel = gift.image;
        } else {
            imageModel = null;
        }
        C15620jO.LIZIZ(imageModel, c47061t0);
        C41051jJ c41051jJ = (C41051jJ) view.findViewById(R.id.jzq);
        this.LJLJJI = c41051jJ;
        if (c41051jJ != null) {
            c41051jJ.setOnCheckedChangeListener(C30602Bzi.LJLIL);
        }
        TextView textView = (TextView) view.findViewById(R.id.hw5);
        Context context = getContext();
        String str5 = "";
        if (context != null) {
            Object[] objArr = new Object[1];
            Gift gift2 = this.LJLIL;
            if (gift2 == null || (str3 = gift2.name) == null) {
                str3 = "";
            }
            objArr[0] = str3;
            str = context.getString(R.string.lm5, objArr);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = (TextView) view.findViewById(R.id.hwk);
        Context context2 = getContext();
        if (context2 != null) {
            Object[] objArr2 = new Object[1];
            Gift gift3 = this.LJLIL;
            if (gift3 != null && (str2 = gift3.name) != null) {
                str5 = str2;
            }
            objArr2[0] = str5;
            str4 = context2.getString(R.string.lm2, objArr2);
        }
        textView2.setText(str4);
        ((TextView) view.findViewById(R.id.h3q)).setText(R.string.lm3);
        ((TextView) view.findViewById(R.id.jod)).setText(R.string.lm4);
        C16880lQ.LJIJI((TextView) view.findViewById(R.id.jod), new ACListenerS25S0100000_5(this, 331));
    }
}
