package com.bytedance.android.livesdk.chatroom.ui;

import X.AbstractC030309z;
import X.C03200Aq;
import X.C0K5;
import X.C0NB;
import X.C10A;
import X.C16880lQ;
import X.C1QC;
import X.C28507BGt;
import X.C28665BMv;
import X.C29529BiP;
import X.C29530BiQ;
import X.C29536BiW;
import X.C29602Bja;
import X.C5H3;
import X.C61712OJw;
import X.C61713OJx;
import X.C76104Tts;
import X.C88207Yjb;
import X.CHK;
import X.CHM;
import X.EnumC29596BjU;
import X.EnumC29609Bjh;
import Y.ARunnableS41S0100000_5;
import Y.IDHandlerS18S0100000_5;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS187S0100000_5;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes6.dex */
public final class LiveStickerPropsDialog extends LiveDialogFragment implements View.OnLayoutChangeListener {
    public C28665BMv LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJJI;
    public C76104Tts LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final AqS171S0100000_5 LJLJI = new AqS171S0100000_5(this, 301);
    public final IDHandlerS18S0100000_5 LJLJJL = new IDHandlerS18S0100000_5(this, C16880lQ.LLJJJJ(), 1);

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
        C28507BGt c28507BGt = new C28507BGt(R.layout.czy);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJJI = 50;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJJL.removeMessages(1);
        _$_findCachedViewById(R.id.j7n).removeOnLayoutChangeListener(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C61713OJx LIZ = C61712OJw.LIZ(this);
        LIZ.LIZIZ(false, false);
        LIZ.LIZIZ.LJIIL();
        LIZ.LJFF(-16777216);
        LIZ.LIZIZ.LJII(false);
        LIZ.LIZJ();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_STICKER;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CHK chk;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        _$_findCachedViewById(R.id.j7n).post(new ARunnableS41S0100000_5(this, 126));
        _$_findCachedViewById(R.id.j7n).addOnLayoutChangeListener(this);
        h0.LJIJJ(_$_findCachedViewById(R.id.j7n).findViewById(R.id.title), true);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, LinkCrossRoomStateChangeEvent.class, new C29530BiQ(this));
        }
        this.LJLIL = new C28665BMv(this.LJLJI);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.ier);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(3));
        C28665BMv c28665BMv = this.LJLIL;
        if (c28665BMv != null) {
            recyclerView.setAdapter(c28665BMv);
            recyclerView.LJII(new AbstractC030309z() { // from class: X.4ms
                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                    super.LJ(rect, view2, recyclerView2, c0ac);
                    rect.set(24, 0, 24, C15380j0.LIZ(2.0f));
                }
            }, -1);
            RecyclerView prop_list = (RecyclerView) _$_findCachedViewById(R.id.ier);
            o.LJIIIIZZ(prop_list, "prop_list");
            this.LJLJJLL = new C76104Tts(1, prop_list, new AqS187S0100000_5(this, 2));
            RecyclerView prop_list2 = (RecyclerView) _$_findCachedViewById(R.id.ier);
            o.LJIIIIZZ(prop_list2, "prop_list");
            C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_sticker_slide");
            if (c5h3 != null) {
                chk = (CHK) c5h3.getValue();
            } else {
                chk = null;
            }
            prop_list2.LJIIJJI(new CHM(chk));
            List list = C29536BiW.LIZ;
            List list2 = C29536BiW.LIZIZ;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
            }
            if (!arrayList.isEmpty()) {
                ((C0K5) _$_findCachedViewById(R.id.kiy)).LIZLLL();
                if (!arrayList.isEmpty()) {
                    C28665BMv c28665BMv2 = this.LJLIL;
                    if (c28665BMv2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C1QC c1qc = (C1QC) it3.next();
                            if (o.LJ(c1qc.LJLIL, "livestickertext")) {
                                c28665BMv2.LJLJI = c1qc.LJLILLLLZI.size();
                                arrayList2.addAll(c1qc.LJLILLLLZI);
                            }
                        }
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C1QC c1qc2 = (C1QC) it4.next();
                            if (o.LJ(c1qc2.LJLIL, "livestickerimage")) {
                                c28665BMv2.LJLJJI = c1qc2.LJLILLLLZI.size();
                                arrayList2.addAll(c1qc2.LJLILLLLZI);
                            }
                        }
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            C1QC c1qc3 = (C1QC) it5.next();
                            if (o.LJ(c1qc3.LJLIL, "livestickerspecial")) {
                                c28665BMv2.LJLJJL = c1qc3.LJLILLLLZI.size();
                                arrayList2.addAll(c1qc3.LJLILLLLZI);
                            }
                        }
                        C03200Aq.LIZ(new C29529BiP(c28665BMv2.LJLILLLLZI, arrayList2), true).LIZJ(c28665BMv2);
                        ((ArrayList) c28665BMv2.LJLILLLLZI).clear();
                        ((ArrayList) c28665BMv2.LJLILLLLZI).addAll(arrayList2);
                    } else {
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                }
            } else {
                ((C0K5) _$_findCachedViewById(R.id.kiy)).LJ();
                C0NB.LJ("LiveStickerPropsDialog", "failed to fetch stickers!");
            }
            IDHandlerS18S0100000_5 iDHandlerS18S0100000_5 = this.LJLJJL;
            iDHandlerS18S0100000_5.sendMessageDelayed(iDHandlerS18S0100000_5.obtainMessage(1), 1000L);
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLJJI != _$_findCachedViewById(R.id.j7n).getHeight()) {
            int height = _$_findCachedViewById(R.id.j7n).getHeight();
            this.LJLJJI = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
