package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.BGS;
import X.BHW;
import X.BHZ;
import X.C0KB;
import X.C15380j0;
import X.C16880lQ;
import X.C221108m2;
import X.C30161Gi;
import X.C30326BvG;
import X.C42398GkU;
import X.C47121t6;
import X.C51029K0z;
import X.C5H3;
import X.C62822Ol8;
import X.C78496UrM;
import X.C78977Uz7;
import X.C78996UzQ;
import X.CN1;
import X.ViewOnClickListenerC28501BGn;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.IDCListenerS10S0101000;
import Y.IDObjectS178S0100000_5;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.api.HashTagResp;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.game.IGameTopicService;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewLiveDetailSheet extends LiveSheetFragment {
    public LiveEditText LLFF;
    public C47121t6 LLFFF;
    public View LLFII;
    public C47121t6 LLFZ;
    public DataChannel LLII;
    public ViewOnClickListenerC28501BGn LLIIII;
    public LiveMode LLIIIILZ;
    public final Map<Integer, View> LLIIIJ = new LinkedHashMap();
    public final C62822Ol8 LLD = C221108m2.LIZIZ(BGS.LJLIL);
    public final C5H3 LLF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 148));
    public String LLI = "";
    public final IDObjectS178S0100000_5 LLIFFJFJJ = new IDObjectS178S0100000_5(this, 2);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIJ;
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
        c0kb.LIZ(C15380j0.LJIILJJIL(R.string.lpv));
        ArrayList arrayList = new ArrayList();
        if (this.LJLZ != null) {
            arrayList.add(new C30161Gi(R.attr.aw3, new IDCListenerS10S0101000(0, this, 5)));
        }
        c0kb.LJFF = arrayList;
        return c0kb;
    }

    public final ImageSpan Ml() {
        return (ImageSpan) this.LLF.getValue();
    }

    public final void Ol() {
        LiveMode liveMode;
        String str;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (this.LLII != null && (liveMode = this.LLIIIILZ) != null) {
            BHZ.Companion.getClass();
            BHZ LIZ = BHW.LIZ(liveMode);
            if (LIZ != null) {
                Hashtag hashtag = LIZ.getHashtag();
                GameTag gameTag = LIZ.getGameTag();
                StringBuffer stringBuffer = new StringBuffer();
                if (hashtag != null && C78977Uz7.LJJJLL(hashtag)) {
                    str = hashtag.title;
                } else {
                    str = "";
                }
                stringBuffer.append(str);
                if (gameTag != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(" | ");
                    LIZ2.append(gameTag.showName);
                    stringBuffer.append(X1D.LIZIZ(LIZ2));
                }
                C47121t6 c47121t6 = this.LLFZ;
                if (c47121t6 != null) {
                    c47121t6.setText(stringBuffer);
                }
                Hashtag hashtag2 = LIZ.getHashtag();
                if (hashtag2 != null && (dataChannel2 = this.LLII) != null) {
                    dataChannel2.rv0(HashtagChangedChannel.class, hashtag2);
                }
                GameTag re = ((IGameTopicService) CN1.LIZ(IGameTopicService.class)).re(liveMode);
                if (re != null && (dataChannel = this.LLII) != null) {
                    dataChannel.rv0(PreviewPagerSelectedGameItem.class, re);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIIJ).clear();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void Hl(boolean z) {
        super.Hl(z);
        LiveEditText liveEditText = this.LLFF;
        if (liveEditText != null) {
            liveEditText.clearFocus();
        }
    }

    public final void Nl(String str) {
        Editable editable;
        if (str == null || str.length() == 0) {
            return;
        }
        LiveEditText liveEditText = this.LLFF;
        if (liveEditText != null && liveEditText.isFocused()) {
            LiveEditText liveEditText2 = this.LLFF;
            if (liveEditText2 != null) {
                editable = liveEditText2.getText();
            } else {
                editable = null;
            }
            if (!TextUtils.isEmpty(String.valueOf(editable))) {
                C47121t6 c47121t6 = this.LLFFF;
                if (c47121t6 != null) {
                    c47121t6.setText(str);
                }
                LiveEditText liveEditText3 = this.LLFF;
                if (liveEditText3 != null) {
                    liveEditText3.setText(str);
                    return;
                }
                return;
            }
        }
        SpannableString spannableString = new SpannableString(C42398GkU.LIZIZ(str, ' '));
        spannableString.setSpan(Ml(), str.length(), str.length() + 1, 17);
        C47121t6 c47121t62 = this.LLFFF;
        if (c47121t62 != null) {
            c47121t62.setText(spannableString);
        }
        LiveEditText liveEditText4 = this.LLFF;
        if (liveEditText4 != null) {
            liveEditText4.setText(spannableString);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View Jl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.d56, viewGroup, false, "inflater.inflate(\n      …         false,\n        )");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn;
        LiveEditText liveEditText;
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLII = C51029K0z.LJIILIIL(this);
        this.LLFZ = (C47121t6) view.findViewById(R.id.li8);
        DataChannel dataChannel = this.LLII;
        if (dataChannel != null) {
            dataChannel.ov0(this, LiveModeChannel.class, new AqS171S0100000_5(this, 226));
            dataChannel.lv0(this, HashTagResp.class, new AqS171S0100000_5(this, 227));
        }
        DataChannel dataChannel2 = this.LLII;
        C47121t6 c47121t6 = null;
        if (dataChannel2 != null) {
            viewOnClickListenerC28501BGn = (ViewOnClickListenerC28501BGn) dataChannel2.kv0(LiveCoverControllerChannel.class);
        } else {
            viewOnClickListenerC28501BGn = null;
        }
        this.LLIIII = viewOnClickListenerC28501BGn;
        C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 70), this);
        View view3 = getView();
        if (view3 != null) {
            liveEditText = (LiveEditText) view3.findViewById(R.id.l_r);
        } else {
            liveEditText = null;
        }
        if (!(liveEditText instanceof LiveEditText)) {
            liveEditText = null;
        }
        this.LLFF = liveEditText;
        View view4 = getView();
        if (view4 != null) {
            view4.findViewById(R.id.cov);
        }
        View view5 = getView();
        if (view5 != null) {
            view2 = view5.findViewById(R.id.la7);
        } else {
            view2 = null;
        }
        this.LLFII = view2;
        View view6 = getView();
        if (view6 != null) {
            c47121t6 = (C47121t6) view6.findViewById(R.id.lae);
        }
        this.LLFFF = c47121t6;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.lv0(this, PreviewHideKeyboardEvent.class, new AqS171S0100000_5(this, 807));
        }
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL2 != null) {
            LJIILIIL2.ov0(this, RoomCreateInfoChannel.class, new AqS171S0100000_5(this, 810));
        }
        C47121t6 c47121t62 = (C47121t6) view.findViewById(R.id.cez);
        if (c47121t62 != null) {
            C16880lQ.LJJIIZ(c47121t62, new ACListenerS25S0100000_5(this, 118));
        }
    }
}
