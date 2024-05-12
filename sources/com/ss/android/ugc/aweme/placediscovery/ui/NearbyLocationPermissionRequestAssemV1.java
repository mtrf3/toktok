package com.ss.android.ugc.aweme.placediscovery.ui;

import X.C16880lQ;
import X.C182697Ez;
import X.C2K0;
import X.C86V;
import X.InterfaceC55102Lju;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class NearbyLocationPermissionRequestAssemV1 extends NearbyLocationPermissionRequestBaseAssem implements InterfaceC55102Lju {
    public TuxTextView LJLLILLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -482206377) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bwn;
    }

    public NearbyLocationPermissionRequestAssemV1() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.NearbyLocationPermissionRequestBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.mpm);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_turn_on_location)");
        this.LJLLILLLL = (TuxTextView) findViewById;
        String turnOnText = C86V.LJFF(R.string.ili);
        String displayRegionTurnOnPlaceHolderText = C86V.LJFF(R.string.ilf);
        o.LJIIIIZZ(displayRegionTurnOnPlaceHolderText, "displayRegionTurnOnPlaceHolderText");
        String LLLZ = C16880lQ.LLLZ(displayRegionTurnOnPlaceHolderText, Arrays.copyOf(new Object[]{turnOnText}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        o.LJIIIIZZ(turnOnText, "turnOnText");
        int LJJLIIIJL = s.LJJLIIIJL(LLLZ, turnOnText, 0, false, 6);
        SpannableString spannableString = new SpannableString(LLLZ);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C182697Ez c182697Ez = new C182697Ez(view.getContext(), new AqS156S0200000_9(this, context, 57));
        if (LJJLIIIJL >= 0) {
            spannableString.setSpan(c182697Ez, LJJLIIIJL, LLLZ.length(), 18);
            TuxTextView tuxTextView = this.LJLLILLLL;
            if (tuxTextView != null) {
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                TuxTextView tuxTextView2 = this.LJLLILLLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setHighlightColor(0);
                    TuxTextView tuxTextView3 = this.LJLLILLLL;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setText(spannableString);
                    } else {
                        o.LJIJI("tvTurnOnLocation");
                        throw null;
                    }
                } else {
                    o.LJIJI("tvTurnOnLocation");
                    throw null;
                }
            } else {
                o.LJIJI("tvTurnOnLocation");
                throw null;
            }
        }
        if (gP()) {
            getContainerView().setVisibility(0);
            getContainerView().requestLayout();
        } else {
            getContainerView().setVisibility(8);
        }
    }
}
