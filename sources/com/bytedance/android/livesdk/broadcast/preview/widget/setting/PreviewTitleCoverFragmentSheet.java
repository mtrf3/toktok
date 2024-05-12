package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.BGQ;
import X.C0KB;
import X.C15380j0;
import X.C221108m2;
import X.C30161Gi;
import X.C30326BvG;
import X.C42398GkU;
import X.C51029K0z;
import X.C62822Ol8;
import X.C78496UrM;
import Y.ARunnableS41S0100000_5;
import Y.IDObjectS178S0100000_5;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.PreviewTitleChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastCoverData;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewTitleCoverFragmentSheet extends LiveSheetFragment {
    public LiveEditText LLF;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final C62822Ol8 LLD = C221108m2.LIZIZ(BGQ.LJLIL);
    public String LLFF = "";
    public final IDObjectS178S0100000_5 LLFFF = new IDObjectS178S0100000_5(this, 4);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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
        C0KB c0kb = new C0KB();
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.lr8));
        ArrayList arrayList = new ArrayList();
        C30161Gi Gl = Gl();
        if (Gl != null) {
            arrayList.add(Gl);
        }
        c0kb.LJ = arrayList;
        return c0kb;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFII).clear();
    }

    public final void Ml(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        LiveEditText liveEditText = this.LLF;
        if (liveEditText != null) {
            if (liveEditText.isFocused()) {
                LiveEditText liveEditText2 = this.LLF;
                if (liveEditText2 != null) {
                    if (!TextUtils.isEmpty(String.valueOf(liveEditText2.getText()))) {
                        LiveEditText liveEditText3 = this.LLF;
                        if (liveEditText3 != null) {
                            liveEditText3.setText(str);
                            return;
                        } else {
                            o.LJIJI("titleView");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("titleView");
                    throw null;
                }
            }
            SpannableString spannableString = new SpannableString(C42398GkU.LIZIZ(str, ' '));
            LiveEditText liveEditText4 = this.LLF;
            if (liveEditText4 != null) {
                liveEditText4.setText(spannableString);
                return;
            } else {
                o.LJIJI("titleView");
                throw null;
            }
        }
        o.LJIJI("titleView");
        throw null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d5a, viewGroup, false, "inflater.inflate(R.layou…_sheet, container, false)");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveEditText liveEditText;
        LifecycleOwner lifecycleOwner;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        String str = null;
        if (LJIILIIL != null) {
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
            if (LJIILIIL2 != null) {
                lifecycleOwner = LJIILIIL2.LJLJJI;
            } else {
                lifecycleOwner = null;
            }
            LJIILIIL.ov0(lifecycleOwner, BroadcastCoverData.class, new AqS171S0100000_5(this, 233));
        }
        C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 75), this);
        View view2 = getView();
        if (view2 != null) {
            liveEditText = (LiveEditText) view2.findViewById(R.id.l_r);
        } else {
            liveEditText = null;
        }
        if (!(liveEditText instanceof LiveEditText) || liveEditText == null) {
            return;
        }
        this.LLF = liveEditText;
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL3 != null) {
            LJIILIIL3.lv0(this, PreviewHideKeyboardEvent.class, new AqS171S0100000_5(this, 819));
        }
        DataChannel LJIILIIL4 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL4 != null) {
            str = (String) LJIILIIL4.kv0(PreviewTitleChannel.class);
        }
        Ml(str);
        DataChannel LJIILIIL5 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL5 == null) {
            return;
        }
        LJIILIIL5.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 820));
    }
}
