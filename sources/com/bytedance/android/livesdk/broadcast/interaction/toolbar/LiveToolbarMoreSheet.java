package com.bytedance.android.livesdk.broadcast.interaction.toolbar;

import X.C15380j0;
import X.C1B3;
import X.C1B6;
import X.C23010vJ;
import X.C259910h;
import X.C28507BGt;
import X.C29306Beo;
import X.C47121t6;
import X.C51029K0z;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import X.InterfaceC30205BtJ;
import Y.IDCSpanS31S0100000_5;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.CppSeeDetailsClickEvent;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveToolbarMoreSheet extends LiveDialogFragment {
    public final List<EnumC30204BtI> LJLIL;
    public final List<EnumC30204BtI> LJLILLLLZI;
    public FrameLayout LJLJI;
    public LinearLayout LJLJJI;
    public LinearLayout LJLJJL;
    public C47121t6 LJLJJLL;
    public final Map<Integer, View> LJLJL;

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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.die);
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJJI = 73;
        c28507BGt.LJII = 80;
        c28507BGt.LIZIZ = 2;
        c28507BGt.LIZJ = R.style.ab4;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EnumC30206BtK.POPUP_BASIC.release(this.dataChannel);
        EnumC30206BtK.POPUP_SETTING.release(this.dataChannel);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, DismissToolbarPopEvent.class, new AqS171S0100000_5(this, 129));
            LJIILIIL.lv0(this, CppSeeDetailsClickEvent.class, new AqS171S0100000_5(this, 130));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveToolbarMoreSheet(List<? extends EnumC30204BtI> basicFunctions, List<? extends EnumC30204BtI> settingFunctions) {
        o.LJIIIZ(basicFunctions, "basicFunctions");
        o.LJIIIZ(settingFunctions, "settingFunctions");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = basicFunctions;
        this.LJLILLLLZI = settingFunctions;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = (FrameLayout) view.findViewById(R.id.dm7);
        this.LJLJJI = (LinearLayout) view.findViewById(R.id.ahg);
        this.LJLJJL = (LinearLayout) view.findViewById(R.id.jqr);
        this.LJLJJLL = (C47121t6) view.findViewById(R.id.ixc);
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel);
        if (pk != null && pk.LJFF(EnumC30204BtI.INTERACTION_FEATURES)) {
            C29306Beo.LJJLJLI(this.LJLJI);
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("collapsable", true);
            bundle2.putString("entrance", "more_top");
            LiveInteractionFeaturesFragment bn0 = iRoomFunctionService.bn0(bundle2);
            if (bn0 != null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
                LIZ.LJIIIIZZ(R.id.dm7, 1, bn0, null);
                LIZ.LJI();
            }
        }
        EnumC30206BtK enumC30206BtK = EnumC30206BtK.POPUP_BASIC;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout == null) {
            return;
        }
        List<EnumC30204BtI> list = this.LJLIL;
        EnumC30226Bte enumC30226Bte = EnumC30226Bte.ICON_TITLE_HORIZONTAL_ARROW_OPT;
        enumC30206BtK.createHolder(LJIILIIL, linearLayout, list, enumC30226Bte);
        EnumC30206BtK enumC30206BtK2 = EnumC30206BtK.POPUP_SETTING;
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        LinearLayout linearLayout2 = this.LJLJJL;
        if (linearLayout2 == null) {
            return;
        }
        enumC30206BtK2.createHolder(LJIILIIL2, linearLayout2, this.LJLILLLLZI, enumC30226Bte);
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.t05);
            SpannableString spannableString = new SpannableString(i0.LJFF(LJIILJJIL, C15380j0.LJIILJJIL(R.string.kz_)));
            C23010vJ.LIZJ(getContext(), spannableString, 0, LJIILJJIL.length(), 17, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
            C23010vJ.LIZJ(getContext(), spannableString, LJIILJJIL.length(), spannableString.length(), 17, 3, 600);
            spannableString.setSpan(new ForegroundColorSpan(C259910h.LIZIZ(R.attr.ax_, getContext())), 0, spannableString.length(), 17);
            spannableString.setSpan(new IDCSpanS31S0100000_5(this, 11), LJIILJJIL.length(), spannableString.length(), 17);
            c47121t6.setText(spannableString);
            c47121t6.setLinksClickable(true);
            c47121t6.setMovementMethod(LinkMovementMethod.getInstance());
            c47121t6.setHighlightColor(0);
        }
    }
}
