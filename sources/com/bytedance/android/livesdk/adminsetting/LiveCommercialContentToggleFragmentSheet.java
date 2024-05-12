package com.bytedance.android.livesdk.adminsetting;

import X.B83;
import X.BHQ;
import X.BHR;
import X.BZI;
import X.C011602u;
import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C22890v7;
import X.C28192B4q;
import X.C28527BHn;
import X.C28787BRn;
import X.C29374Bfu;
import X.C2A7;
import X.C30161Gi;
import X.C41071jL;
import X.C51029K0z;
import X.C5H3;
import X.C65814PsI;
import X.C78496UrM;
import X.C78996UzQ;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.adminsetting.CommercialContentToggleApi;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCommercialContentToggleFragmentSheet extends LiveSheetFragment {
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public LiveMode LLFII;
    public boolean LLFZ;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final C5H3 LLD = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 96));
    public final C28527BHn LLI = (C28527BHn) DataChannelGlobal.LJLJJI.mv0(ECBcToggleChannel.class);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIILZ;
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

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C0KB Kl() {
        C30161Gi Gl;
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.kfh));
        ArrayList arrayList = new ArrayList();
        if (this.LLFF && (Gl = Gl()) != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C30161Gi(R.attr.av9, new ACListenerS25S0100000_5(this, 52)));
        c0kb.LJFF = arrayList2;
        return c0kb;
    }

    public final void Ml() {
        if (((CompoundButton) _$_findCachedViewById(R.id.boy)).isChecked() && !((CompoundButton) _$_findCachedViewById(R.id.asl)).isChecked() && !((CompoundButton) _$_findCachedViewById(R.id.asc)).isChecked()) {
            _$_findCachedViewById(R.id.ayr).setClickable(false);
            _$_findCachedViewById(R.id.ayr).setAlpha(0.4f);
            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.ays), BHR.LJLIL);
        } else {
            _$_findCachedViewById(R.id.ayr).setClickable(true);
            _$_findCachedViewById(R.id.ayr).setAlpha(1.0f);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
        }
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions Ll(Context context) {
        o.LJIIIZ(context, "context");
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZIZ(2);
        return sheetOptions;
    }

    public final void Nl(boolean z) {
        if (z) {
            _$_findCachedViewById(R.id.ask).setVisibility(0);
            _$_findCachedViewById(R.id.asb).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.ask).setVisibility(8);
            _$_findCachedViewById(R.id.asb).setVisibility(8);
            ((CompoundButton) _$_findCachedViewById(R.id.asl)).setChecked(false);
            ((CompoundButton) _$_findCachedViewById(R.id.asc)).setChecked(false);
        }
    }

    public final void Ol(BZI bzi) {
        if (this.LLF) {
            bzi.LJIJJ(C22890v7.LIZ(this.LLFFF, this.LLFZ), "anchor_type");
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cw1, viewGroup, false, "inflater.inflate(\n      …          false\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        CommercialContentToggle commercialContentToggle;
        CommercialContentToggle commercialContentToggle2;
        CommercialContentToggle commercialContentToggle3;
        Room room;
        PartnershipInfo partnershipInfo;
        Boolean bool;
        Room room2;
        CommerceStruct commerceStruct;
        String str;
        String str2;
        boolean z6;
        boolean z7;
        boolean z8;
        CommercialContentToggle commercialContentToggle4;
        CommercialContentToggle commercialContentToggle5;
        CommercialContentToggle commercialContentToggle6;
        C28527BHn c28527BHn;
        Integer valueOf;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LiveMode liveMode = this.LLFII;
        if (liveMode != null && (c28527BHn = this.LLI) != null && (valueOf = Integer.valueOf(c28527BHn.LIZ(liveMode))) != null) {
            i = valueOf.intValue();
        } else {
            i = 3;
        }
        boolean z9 = true;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        C28527BHn c28527BHn2 = this.LLI;
        if (c28527BHn2 != null && c28527BHn2.LIZIZ != null) {
            if (c28527BHn2 != null && (commercialContentToggle6 = c28527BHn2.LIZIZ) != null) {
                z6 = commercialContentToggle6.openCommercialContentToggle;
            } else {
                z6 = false;
            }
            this.LLIFFJFJJ = z6;
            if (c28527BHn2 != null && (commercialContentToggle5 = c28527BHn2.LIZIZ) != null) {
                z7 = commercialContentToggle5.promoteMyself;
            } else {
                z7 = false;
            }
            this.LLII = z7;
            if (c28527BHn2 != null && (commercialContentToggle4 = c28527BHn2.LIZIZ) != null) {
                z8 = commercialContentToggle4.promoteThirdParty;
            } else {
                z8 = false;
            }
            this.LLIIII = z8;
        } else {
            this.LLIFFJFJJ = false;
            this.LLII = false;
            this.LLIIII = false;
        }
        if (z) {
            this.LLIFFJFJJ = true;
            this.LLIIII = true;
        }
        Nl(this.LLIFFJFJJ);
        C16880lQ.LJJIIJZLJL((C41071jL) _$_findCachedViewById(R.id.boy), new ACListenerS25S0100000_5(this, 54));
        _$_findCachedViewById(R.id.asl).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 55)));
        _$_findCachedViewById(R.id.asc).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0100000_5(this, 56)));
        C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.ayr), new ACListenerS25S0100000_5(this, 57));
        if (this.LLF) {
            if (z && this.LLIFFJFJJ) {
                ((TextView) _$_findCachedViewById(R.id.boy)).setEnabled(false);
                _$_findCachedViewById(R.id.bp0).setVisibility(0);
                C16880lQ.LJIIJ(BHQ.LJLIL, _$_findCachedViewById(R.id.bp0));
            } else {
                ((TextView) _$_findCachedViewById(R.id.boy)).setEnabled(true);
                _$_findCachedViewById(R.id.bp0).setVisibility(8);
            }
            ((C011602u) _$_findCachedViewById(R.id.boy)).setChecked(this.LLIFFJFJJ);
            ((TextView) _$_findCachedViewById(R.id.asl)).setEnabled(true);
            ((CompoundButton) _$_findCachedViewById(R.id.asl)).setChecked(this.LLII);
            _$_findCachedViewById(R.id.asm).setVisibility(8);
            if (this.LLFFF || this.LLFZ || z) {
                ((TextView) _$_findCachedViewById(R.id.asc)).setEnabled(false);
                _$_findCachedViewById(R.id.asd).setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 58), _$_findCachedViewById(R.id.asd));
            } else {
                ((TextView) _$_findCachedViewById(R.id.asc)).setEnabled(true);
                _$_findCachedViewById(R.id.asd).setVisibility(8);
            }
            ((CompoundButton) _$_findCachedViewById(R.id.asc)).setChecked(this.LLIIII);
        } else {
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL == null || (room2 = (Room) LJIILIIL.kv0(RoomChannel.class)) == null || (commerceStruct = room2.getCommerceStruct()) == null || commerceStruct.commercePermission != 1) {
                z9 = false;
            }
            this.LLFFF = z9;
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL2 == null || (room = (Room) LJIILIIL2.kv0(RoomChannel.class)) == null || (partnershipInfo = room.partnershipInfo) == null || (bool = partnershipInfo.partnershipRoom) == null) {
                z2 = false;
            } else {
                z2 = bool.booleanValue();
            }
            this.LLFZ = z2;
            ((TextView) _$_findCachedViewById(R.id.boy)).setEnabled(false);
            C011602u c011602u = (C011602u) _$_findCachedViewById(R.id.boy);
            Room room3 = (Room) this.LLD.getValue();
            if (room3 != null && (commercialContentToggle3 = room3.commercialContentToggle) != null) {
                z3 = commercialContentToggle3.openCommercialContentToggle;
            } else {
                z3 = false;
            }
            c011602u.setChecked(z3);
            _$_findCachedViewById(R.id.bp0).setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 59), _$_findCachedViewById(R.id.bp0));
            ((TextView) _$_findCachedViewById(R.id.asl)).setEnabled(false);
            CompoundButton compoundButton = (CompoundButton) _$_findCachedViewById(R.id.asl);
            Room room4 = (Room) this.LLD.getValue();
            if (room4 != null && (commercialContentToggle2 = room4.commercialContentToggle) != null) {
                z4 = commercialContentToggle2.promoteMyself;
            } else {
                z4 = false;
            }
            compoundButton.setChecked(z4);
            _$_findCachedViewById(R.id.asm).setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 60), _$_findCachedViewById(R.id.asm));
            ((TextView) _$_findCachedViewById(R.id.asc)).setEnabled(false);
            CompoundButton compoundButton2 = (CompoundButton) _$_findCachedViewById(R.id.asc);
            Room room5 = (Room) this.LLD.getValue();
            if (room5 != null && (commercialContentToggle = room5.commercialContentToggle) != null) {
                z5 = commercialContentToggle.promoteThirdParty;
            } else {
                z5 = false;
            }
            compoundButton2.setChecked(z5);
            _$_findCachedViewById(R.id.asd).setVisibility(0);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 61), _$_findCachedViewById(R.id.asd));
            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.ays), new ACListenerS25S0100000_5(this, 53));
            C65814PsI.LIZ().getClass();
            CommercialContentToggleApi commercialContentToggleApi = (CommercialContentToggleApi) C65814PsI.LIZJ(CommercialContentToggleApi.class);
            Room room6 = (Room) this.LLD.getValue();
            if (room6 != null) {
                j = room6.getId();
            } else {
                j = 0;
            }
            C1EW.LIZ(commercialContentToggleApi.queryCommercialContentToggle(j)).LJJJLIIL(new AfS57S0100000_5(this, 225), C28192B4q.LJLIL);
        }
        _$_findCachedViewById(R.id.ayr).setClickable(false);
        _$_findCachedViewById(R.id.ayr).setAlpha(0.4f);
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_commercial_pannel_show");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        if (this.LLF) {
            str = "live_take_page";
        } else {
            str = "live_take_detail";
        }
        LIZ.LJIIJJI(str);
        Ol(LIZ);
        if (((CompoundButton) _$_findCachedViewById(R.id.boy)).isChecked()) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        LIZ.LJIJJ(str2, "status");
        LIZ.LJIJJ(Integer.valueOf(((CompoundButton) _$_findCachedViewById(R.id.asl)).isChecked() ? 1 : 0), "promoting_yourself");
        LIZ.LJIJJ(Integer.valueOf(((CompoundButton) _$_findCachedViewById(R.id.asc)).isChecked() ? 1 : 0), "promoting_third_party");
        LIZ.LJJIIJZLJL();
    }
}
